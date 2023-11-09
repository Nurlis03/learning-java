## Garbage Collection in Java

Garbage collection in Java is the process by which Java programs perform automatic memory management(выполняют автоматическое управление памятью). Java programs compile to bytecode that can be run on a Java Virtual Machine, or JVM for short. When Java programs run on the JVM, objects are created on the heap, which is a portion of memory dedicated to the program(часть памяти, выделенную программе). Eventually, some objects will no longer be needed(В конце концов). The garbage collector finds these unused objects and deletes them to free up memory.

## What is Garbage Collection?
In C/C++, a programmer is responsible for both the creation and destruction of objects. Usually, programmer neglects the destruction of useless objects(пренебрегает уничтожению объектов). Due to this negligence(из за этой небрежности), at a certain point(в определенный момент), sufficient (может оказаться) memory may not be available to create new objects, and the entire (вся) program will terminate abnormally(завершиться аварийно), causing OutOfMemoryErrors.

But in Java, the programmer need not care for all those objects which are no longer in use. Garbage collector destroys these objects. The main objective(целью) of Garbage Collector is to free heap memory by destroying unreachable(недоступные) objects. The garbage collector is the best example of the Daemon thread(потока демона) as it is always running in the background. 

## How Does Garbage Collection in Java works?
Java garbage collection is an automatic process. Automatic garbage collection is the process of looking at heap memory, identifying which objects are in use and which are not, and deleting the unused objects. An in-use(используемый) object, or a referenced object, means that some part of your program still maintains a pointer to that object. An unused or unreferenced object is no longer referenced by any part of your program. So the memory used by an unreferenced object can be reclaimed(восстановлена). The programmer does not need to mark(не нужно явно помечать) objects to be deleted explicitly. The garbage collection implementation lives in the JVM. 

## Types of Activities in Java Garbage Collection

Two types of garbage collection activity(операций) usually happen in Java. These are:

1. Minor(инкрементальная) or incremental Garbage Collection: It is said to have occurred(что это произошло) when unreachable objects in the young generation heap memory are removed.
2. Major or Full Garbage Collection: It is said to have occurred when the objects that survived(пережившие) the minor garbage collection are copied into the old generation or permanent generation heap memory are removed. When compared to the young generation, garbage collection happens less frequently in the old generation.
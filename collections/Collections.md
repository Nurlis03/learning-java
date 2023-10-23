## Collection in Java

The **Collection in Java** is a framework that provides an architecture to store and manipulate the group of objects.

Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.

Java Collection means a single unit of objects. Java Collection framework provides many interfaces (**Set**, **List**, **Queue**, **Deque**) and classes (**ArrayList**, **Vector**, **LinkedList**, **PriorityQueue**, **HashSet**, **LinkedHashSet**, **TreeSet**).

## What is Collection in Java
A Collection represents a single unit of objects, i.e., a group.

## What is a framework in Java

- It provides readymade(готовую) architecture.
- It represents a set of classes and interfaces.
- It is optional(необязательно).


## What is Collection framework
The Collection framework represents a unified(единую) architecture for storing and manipulating a group of objects. It has:

Interfaces and its implementations, i.e.(т.е), classes
Algorithm


## Hierarchy of Collection Framework

Let us see the hierarchy of Collection framework. The **java.util** package contains all the classes and interfaces for the Collection framework.

![Alt](java-collection-hierarchy.png)

## Iterable Interface

The Iterable interface is the root interface for all the collection classes. The Collection interface extends the Iterable interface and therefore(следовательно) all the subclasses of Collection interface also implement the Iterable interface.

It contains only one abstract method. i.e.,
```Java
Iterator<T> iterator()  
```

It returns the iterator over the elements of type T.

## Collection Interface

The Collection interface is the interface which is implemented by all the classes in the collection framework. It declares the methods that every collection will have. In other words, we can say that the Collection interface builds the foundation(основу) on which the collection framework depends.

Some of the methods of Collection interface are Boolean add ( Object obj), Boolean addAll ( Collection c), void clear(), etc. which are implemented by all the subclasses of Collection interface.

## List Inteface

List interface is the child interface of Collection interface. It inhibits(подавляет) a list type data structure in which we can store the ordered collection of objects. It can have duplicate values.

List interface is implemented by the classes ArrayList, LinkedList, Vector, and Stack.

To instantiate the List interface, we must use :

```Java
List <data-type> list1= new ArrayList();  
List <data-type> list2 = new LinkedList();  
List <data-type> list3 = new Vector();  
List <data-type> list4 = new Stack();  
```


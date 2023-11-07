Stream API is used to process eollections
of objects. A stream in Java is a sequence of objects that supports various methods which can be pipelined to produce the desired result.

## Syntax

```Java
Stream<T> stream;
```
## Java Stream Features
The features of Java stream are mentioned below:

- A stream is not a data structure instead it takes input from the Collections, Arrays or I/O channels.
- Streams don’t change the original data structure, they only provide the result as per the pipelined methods.
- Each intermediate operation is lazily executed and returns a stream as a result, hence various intermediate operations can be pipelined. 
- Terminal operations mark the end of the stream and return the result.

## Important Intermediate Operations

There are a few Intermediate Operations mentioned below:

1. `map()`
The map method is used to return a stream consisting of the results of applying the given function to the elements of this stream.

```Java
List number = Arrays.asList(2, 3, 4, 5);
List square = number.stream().map(x->x*x).collect(Collectors.toList());
```
2. `filter()`
The filter method is used to select elements as per the Predicate passed as an argument.

```Java
List names = Arrays.asList("Reflection","Collection","Stream");
List result = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
```

3. `sorted()`
The sorted method is used to sort the stream.

```Java
List names = Arrays.asList("Reflection","Collection","Stream");
List result = names.stream().sorted().collect(Collectors.toList());
```

## Terminal Operations
Terminal Operations are the type of Operations that return the result. These Operations are not processed further just return a final result value.

## Important Terminal Operations

There are a few Terminal Operations mentioned below:

1. `collect()`

The collect method is used to return the result of the intermediate operations performed on the stream.

```Java
List number = Arrays.asList(2,3,4,5,3);
Set square = number.stream().map(x->x*x).collect(Collectors.toSet());
```

2. `forEach()`
The forEach method is used to iterate through every element of the stream.

```Java
List number = Arrays.asList(2,3,4,5);
number.stream().map(x->x*x).forEach(y->System.out.println(y));
```

3. reduce()

The reduce method is used to reduce the elements of a stream to a single value. The reduce method takes a BinaryOperator as a parameter.


```Java
List number = Arrays.asList(2,3,4,5);
int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
```
Here ans variable is assigned 0 as the initial value and i is added to it.

```
`Note:` Intermediate Operations are running based on the concept of Lazy Evaluation, which ensures that every method returns a fixed value(Terminal operation) before moving to the next method.
```

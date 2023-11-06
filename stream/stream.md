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

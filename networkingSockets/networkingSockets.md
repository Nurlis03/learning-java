## Networking sockets

* Java Networking is a concept of connecting two or more computing devices together so that we can share resources.
* Java socket programming provides facility(предоставляет возможность) to share data between different computing devices.
* A socket is one endpoint(одна из конечных точек) of a two-way communication link(двустороннего канала) between two programs running(запущенными) on the network. A socket is bound(привязан) to a port number so that the TCP layer(уровень) can identify the application that data is destined to be sent to(в котором предназначены для отправки данных).

## Java - Networking

The term network programming refers to writing programs that execute across multiple devices (computers), in which the devices are all connected to each other using a network.

The java.net package of the J2SE APIs contains a collection of classes and interfaces that provide the low-level communication details, allowing you to write programs that focus on solving the problem at hand.

The java.net package provides support for the two common(общих) network protocols −

* TCP − TCP stands for Transmission Control Protocol, which allows for reliable communication between two applications. TCP is typically used over the Internet Protocol, which is referred to as TCP/IP.

* UDP − UDP stands for User Datagram Protocol, a connection-less protocol that allows for packets of data to be transmitted between applications.

## Socket Programming

Sockets provide the communication mechanism between two computers using TCP. A client program creates a socket on its end of the communication(в конце связи) and attempts(пытается) to connect that socket to a server.
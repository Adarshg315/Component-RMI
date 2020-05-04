RMI
RMI is a distributed object system that enables you to easily develop distributed Java applications. Developing distributed applications in RMI is simpler than developing with sockets since there is no need to design a protocol, which is an error-prone task. In RMI, the developer has the illusion of calling a local method from a local class file, when in fact the arguments are shipped to the remote target and interpreted, and the results are sent back to the callers.

The Genesis of an RMI Application
Developing a distributed application using RMI involves the following steps:

Define a remote interface
Implement the remote interface
Develop the server
Develop a client
Generate Stubs and Skeletons, start the RMI registry, server, and client

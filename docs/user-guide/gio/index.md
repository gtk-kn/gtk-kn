# GIO

## File System Access & Operations: GFile

GIO provides a powerful virtual file system abstraction layer. Its GFile interface can be used to read information from
the filesystem (such as traversing directories, querying file metadata, and so on) as well as and carrying out file
operations. GFile can also be used to monitor files and directories for changes.

## Settings: GSettings

GSettings is the GNOME library for reading and writing user settings. It allows storing a variety of settings types,
including integers and arrays of strings.

## Networking

GNOME libraries provide access to a range of networking functionality and features.

### GSocket

GIO includes high-level network features, such as monitoring the network state of the system, creating network
connections, implementing network services, and accepting client connections.

GIO also provides a comprehensive set of low level networking APIs to abstract sockets, addresses, and proxies.

### TLS & DNS support

GIO provides support for TLS connections, both client and server side. It also supports resolvers for proxies, names and
services.

## IPC: GDBus

[D-Bus](https://www.freedesktop.org/wiki/Software/dbus/) is one of the primary IPC systems used in GNOME, and is used
for communication between both applications and services. Applications can use D-Bus to communicate with system
services, such as hardware-related daemons, or for communication between their own processes.

GDBus is included in the GIO library, and provides a comprehensive implementation of the D-Bus protocol, as well as
high-level API to implement both providers and consumers of D-Bus interfaces.

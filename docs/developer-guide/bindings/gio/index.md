# GIO

## File System Access & Operations: GFile

GIO offers a robust virtual file system layer through the `GFile` interface, enabling operations such as directory
traversal, file metadata querying, and file monitoring.

## Settings: GSettings

`GSettings` is GNOME's library for managing user settings, allowing storage of various types such as integers and string
arrays.

## Notifications: GNotification

`GNotification` allows applications to send interactive notifications, enabling user interaction through actions like
clicks. Notifications are customizable in appearance and behavior, with options for icons and urgency levels.

## Networking

GIO provides extensive networking capabilities, from high-level network state monitoring to low-level socket and proxy
abstractions.

### GSocket

`GSocket` supports network state monitoring, connection creation, network service implementation, and client connection
acceptance, along with low-level socket and address handling.

### TLS & DNS Support

GIO supports TLS connections (client and server) and provides resolvers for proxies, names, and services.

## IPC: GDBus

[D-Bus](https://www.freedesktop.org/wiki/Software/dbus/) is a primary IPC system in GNOME, used for inter-application
and system service communication. `GDBus`, included in GIO, provides a comprehensive D-Bus implementation with APIs to
implement both D-Bus providers and consumers.

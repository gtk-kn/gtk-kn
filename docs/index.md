# gtk-kn

<figure markdown>
![Image title](assets/logo-256.png)
</figure>


Experience the power and versatility of the GNOME stack in Kotlin/Native with ``gtk-kn``.

Our project provides secure and dependable bindings to critical libraries like GLib, Pango, Cairo and GTK4, empowering
you to create high-quality applications with ease.

<figure markdown>
[Get started](user-guide/index.md){ .md-button .md-button--primary }
</figure>

## Example

A basic hello world example that puts a window on the screen with a button and a signal handler.

``` kotlin title="samples/gtk/hello-world/src/nativeMain/kotlin/hello.kt"
--8<-- "samples/gtk/hello-world/src/nativeMain/kotlin/hello.kt:doc"
```

Full step-by-step instructions can be found [here](user-guide/index.md).

## From Setup to Deployment

The `gtk-kn` [User Guide](user-guide/index.md) is an essential resource for developers looking to explore the
capabilities of our project. The guide is designed to provide step-by-step instructions for integrating `gtk-kn` into
your Kotlin/Native project, along with detailed explanations of the various features and functionalities that our
project provides. From basic setup instructions to more advanced use cases, the `gtk-kn` User Guide offers a
comprehensive overview of the project, complete with code examples and practical tips for getting the most out of your
development experience. Whether you're a seasoned developer or just starting with Kotlin/Native, the `gtk-kn` User Guide
is an invaluable resource that will help you achieve your goals quickly and efficiently.

## Acknowledgment

The content of this documentation has been inspired by several projects and resources that have helped in its creation.

First and foremost, the creators and maintainers of the GTK libraries deserve recognition for their contribution in
developing an excellent toolkit for building graphical user interfaces.

In addition, the following projects and resources have been invaluable in creating this documentation:

- [GTK4 documentation](https://docs.gtk.org/gtk4/)
- [PyGObject documentation](https://pygobject.readthedocs.io/en/latest/)
- [GUI development with Rust and GTK 4](https://gtk-rs.org/gtk4-rs/git/book/)

Without the help of these projects and resources, this documentation would not have been possible. Their hard work and
dedication to the GTK ecosystem are greatly appreciated.

## License

The guide itself is licensed under
the [Creative Commons Attribution-ShareAlike 4.0 International license](https://creativecommons.org/licenses/by-sa/4.0/).
The only exception are the code snippets, which are licensed under
the [MIT license](https://gitlab.com/gtk-kn/gtk-kn/-/blob/master/README.md).

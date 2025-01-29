# gtk-kn

<figure markdown>
![GTK-kn logo](assets/logo-256.png)
</figure>

This project provides Kotlin/Native bindings for GTK and related GObject-based libraries.

<figure markdown>
[Get Started](get-started/index.md){ .md-button .md-button--primary }
</figure>

## Example

This basic "Hello World" example displays a window with a button and a signal handler.

``` kotlin title="samples/gtk/hello-world/src/nativeMain/kotlin/hello.kt"
--8<-- "samples/gtk/hello-world/src/nativeMain/kotlin/hello.kt:doc"
```

For full, step-by-step instructions, see [User Guide](user-guide/index.md).

## From Setup to Deployment

The `gtk-kn` [User Guide](user-guide/index.md) provides step-by-step instructions for integrating `gtk-kn` into
Kotlin/Native projects. It offers essential information, from initial setup to advanced features, with detailed examples
and best practices.

Designed to support both new and experienced developers, the guide covers essential setup, code examples, and practical
insights to help you leverage `gtk-kn` efficiently in your projects.

## Acknowledgments

We acknowledge the resources and projects that have informed this documentation:

- The maintainers of GTK libraries, who provide a robust toolkit for GUI development.
- [GTK4 Documentation](https://docs.gtk.org/gtk4/)
- [PyGObject Documentation](https://pygobject.readthedocs.io/en/latest/)
- [GTK with Rust](https://gtk-rs.org/gtk4-rs/git/book/)

Without these contributions, this documentation would not be possible. We appreciate the commitment to enhancing the GTK
ecosystem.

## License

This guide is licensed
under [Creative Commons Attribution-ShareAlike 4.0 International](https://creativecommons.org/licenses/by-sa/4.0/), with
code snippets under the [MIT License](https://gitlab.com/gtk-kn/gtk-kn/-/blob/master/README.md).

## Powered by

[![GitLab](assets/logo-gitlab.svg)](https://about.gitlab.com/solutions/open-source/join/) [![IntelliJ IDEA](assets/logo-intellij-idea.svg)](https://jb.gg/OpenSourceSupport)

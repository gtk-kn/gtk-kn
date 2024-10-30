# gtk-kn

<img src="docs/assets/logo-256.png" width="80" align="right" hspace="32" />

`gtk-kn` provides Kotlin/Native bindings for GTK, its dependencies, and additional GObject-based libraries. GTK is a
cross-platform GUI toolkit offering a complete set of widgets for building graphical applications. Kotlin/Native allows
Kotlin code to compile to native code across multiple platforms.

*Note: This project is in development and not yet production-ready. Contributions are welcome!*

## Example

A basic "Hello World" example that opens a window with a button and a signal handler:

```kotlin
private const val APP_ID = "org.gtkkn.samples.gtk.helloworld"

fun main() {
    // Create a new application
    val app = Application(APP_ID, ApplicationFlags.FLAGS_NONE)

    // Connect to "activate" signal of `app`
    app.connectActivate {
        // Create a button with label and margins
        val button = Button()
        button.setLabel("Click me!")
        button.setMargins(12)

        // Connect to "clicked" signal of `button`
        button.connectClicked {
            // Set the label to "Hello World!" after the button has been clicked on
            button.setLabel("Hello World!")
        }

        // Create a window and set the title
        val window = ApplicationWindow(app)
        window.setTitle("My GTK App")
        window.setChild(button)

        // Present window
        window.present()
    }

    // Run the application
    app.runApplication()
}
```

For more details, see the [Documentation](#documentation) and [Examples](#running-the-examples).

## Documentation

Comprehensive documentation for `gtk-kn` is available at [gtk-kn.org](https://gtk-kn.org/), with a mirror
at [gtk-kn.github.io](https://gtk-kn.github.io/gtk-kn/). If issues are found, please report them on the project’s GitLab
page.

## Contributing

If you’re interested in contributing, review our [contributing guidelines](CONTRIBUTING.md)
and [code of conduct](CODE_OF_CONDUCT.md) before getting started.

## Join the Project

We’re actively seeking contributors with experience in C, GTK, or GObject who are interested in supporting the `gtk-kn`
project. We’re particularly focused on enhancing features that require in-depth knowledge of GTK and GObject internals,
such as In/Out parameter handling and GPointer support.

If you’re skilled in these areas or simply enthusiastic about contributing to Kotlin/Native GTK bindings, we’d love to
collaborate! Whether you can offer occasional insights or are interested in taking on specific tasks, your help is
greatly appreciated.

Feel free to reach out via the [GitLab issue tracker](https://gitlab.com/gtk-kn/gtk-kn/-/issues).

## Building the Project

To build the project, follow the setup [instructions here](docs/user-guide/installation.md).

Documentation on deploying bindings to Maven local is available [here](docs/user-guide/deploy-on-mavenlocal.md).

## Running the Examples

The [samples](samples) directory contains example applications demonstrating the GTK bindings in Kotlin/Native.

## Roadmap

See the [project board](https://gitlab.com/gtk-kn/gtk-kn/-/boards) for our roadmap and progress updates.

## Project Overview

### GIR Module

The `gir` module contains a generator that parses GObject Introspection `.gir` files and generates Kotlin code in the
`bindings` modules. By default, bindings are generated for all supported libraries from `.gir` files in
`/usr/share/gir-1.0/`.

Run the generator with:

```shell
./gradlew gir:run
```

To clean generated bindings:

```shell
./gradlew cleanBindings
```

### Bindings Modules

Modules under `bindings/` house generated code for supported libraries. Generated code resides in
`org.gtkkn.bindings.<library-name>`, with additional support code in `org.gtkkn.extensions.<library-name>`.

### Platform Support

Our focus is on Linux, primarily Ubuntu 24.04 LTS and Arch Linux. Other distributions should also work. Windows and
macOS support are planned.

### Wrapper classes

- GObject's classes are generated as Kotlin classes
- GObject's interfaces are generated as Kotlin interfaces
- Class and interface methods are generated as Kotlin methods on the Kotlin class/interface
- Where possible, class constructors are implemented as constructors on the Kotlin class
- Other constructors are generated as static factory functions on the companion object
- Signals on classes, interfaces and other types can be used through `connect<signal-name>()` methods on the Kotlin
  class
- GObject class properties are generated as Kotlin properties
- GObject records (C structs) are generated as Kotlin classes
- GObject's enumerations are generated as Kotlin enum classes
- GObject bitfields are generated as Kotlin enum classes with additional support methods for using them as flags
- Standalone library functions are generated as methods in a Kotlin Object named after the library
- Methods using the GLib `GError` mechanism will return a `Result<T>` where the failure case throwable is of
  type `GlibException`
- Constructors using the GLib `GError` mechanism will throw `GlibExeption`
- `GlibException` provides access to the underlying `Error` which is a wrapper for the `GError` struct
- GLib error domains are generated as enum classes, so they can be used in exhaustive when statements

### Library Versions

Currently, the generator does not handle versions and deprecation information. For this reason it is important to make
sure the gir files used for generating, and the installed system library versions used by cinterop (in `/usr/include/`)
are in sync.

### Ignores and skip files

While generating, the generator can encounter top-level types and functions it does not support yet. These are logged in
a skip file named `<library-name>-skips.txt` in the modules `build` folder.

When the generator encounters methods, properties or child types that it does not support, it will log these in a
dedicated section in the KDoc for the containing type.

### Reference Counting and Ownership

Automatic GObject reference counting and ownership management is on our roadmap.

### GObject and Widget Subclassing

User-defined subclassing for GObject and GtkWidget types is supported with basic features; more advanced functionality
is planned.

### Gradle Plugin

A Gradle plugin is in development to support compiling resources, schemas, and packaging. Meson support for GNOME/GTK
ecosystem integration is also planned.

## Why "gtk-kn"?

The "kn" in `gtk-kn` stands for Kotlin/Native, chosen to align with similar projects like `gtk-rs` for Rust.

## Contact

Reach us on [Matrix](https://matrix.to/#/#gtk-kn:matrix.org) or via
the [GitLab issue tracker](https://gitlab.com/gtk-kn/gtk-kn/-/issues).

## License

This project is licensed under
the [GNU General Public License v3.0 (GPLv3)](https://www.gnu.org/licenses/gpl-3.0.en.html). However, different sections
are licensed as follows:

- **Generated bindings**:
  `bindings/**/src/nativeMain/kotlin/org/gtkkn/bindings/` - [LGPLv3](https://www.gnu.org/licenses/lgpl-3.0.en.html).
- **Binding extensions**:
  `bindings/**/src/nativeMain/kotlin/org/gtkkn/extensions/` - [MIT License](https://opensource.org/licenses/MIT).
- **Documentation**: `docs/` - [CC-BY-SA 4.0](https://creativecommons.org/licenses/by-sa/4.0/).
- **Samples**: `samples/` - [MIT License](https://opensource.org/licenses/MIT).

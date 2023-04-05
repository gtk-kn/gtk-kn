# gtk-kn

<img src="art/gtk-kn_logo.png" width="120" align="right" hspace="0" />

gtk-kn provides Kotlin Native bindings for the GTK framework, its dependencies and some additional GObject-based
libraries.
GTK is a popular cross-platform GUI toolkit that provides a complete set of widgets for building graphical applications.
Kotlin Native is a technology that allows Kotlin code to be compiled to native code for various platforms.

    Please note that this project is a work in progress and is not yet ready for production use. We welcome contributions
    from anyone who is interested in helping us improve the project.

## Contributing

If you're interested in contributing to the project, please read our [contributing guidelines](CONTRIBUTING.md) and
our [code of conduct](CODE_OF_CONDUCT.md) before getting started.

## Building the project

Some documentation on how to build and deploy the bindings to maven local is
available [here](docs/user-guide/deploy-on-mavenlocal.md).

## Running the examples

The `samples` directory contains sample applications that demonstrate how to use the GTK bindings in Kotlin Native. To
run the examples, please refer to the instructions in the [samples README](samples/README.md) file.

## Roadmap

Please refer to the [project board](https://gitlab.com/gtk-kn/gtk-kn/-/boards) for more information on our roadmap and
progress.

## Project Overview

### Gir module

The `gir` module contains a generator that takes a set of GObject Introspection .gir files, parses them, and generates
Kotlin code into the `bindings` modules.

In the default configuration, the generator will generate bindings for all supported libraries (e.g. each module
under `bindings/`) from the local set of gir files in `/usr/share/gir-1.0/` into the bindings modules.

This configuration can be changed to use alternative paths and/or generate bindings for additional libraries.

The generator can be invoked with default configuration using

```shell
./gradlew gir:run
```

The generated bindings can be cleaned with

```shell
./gradlew cleanBindings
```

### Bindings modules

The modules under `bindings/` contain folder placeholders and additional support code for each of the supported
libraries.
By convention, all generated code is generated into the `org.gtkkn.bindings.<library-name>` package, while support
code resides in the `org.gtkkn.extensions.<library-name>` package.

Currently, the contents of the `org.gtkkn.bindings.*` packages are not committed to the repository.
This will change once the project is ready for publication on Maven Central.

When building the generated bindings modules, The `cinterop` tool from Kotlin Native is used to interpret library
headers from the local `/usr/include` folders.

## Notes

### Supported platforms

While working towards a 1.0 release, we are focussed on linux first and are actively testing on Ubuntu 22.04 LTS, 22.10,
and Arch linux. Other Linux distributions should be supported as well.

Windows and macOS support is on our roadmap.

### Supported features

* GObject's classes are generated as Kotlin classes
* GObject's interfaces are generated as Kotlin interfaces
* Class and interface methods are generated as Kotlin methods on the Kotlin class/interface
* Where possible, class constructors are implemented as constructors on the Kotlin class
* Other constructors are generated as static factory functions on the companion object
* Signals on classes, interfaces and other types can be used through `connect<signal-name>()` methods on the Kotlin
  class
* GObject class properties are generated as Kotlin properties
* GObject records (C structs) are generated as Kotlin classes
* GObject's enumerations are generated as Kotlin enum classes
* GObject bitfields are generated as Kotlin enum classes with additional support methods for using them as flags
* Standalone library functions are generated as methods in a Kotlin Object named after the library
* Methods using the GLib `GError` mechanism will return a `Result<T>` where the failure case throwable is of
  type `GlibException`
* Constructors using the GLib `GError` mechanism will throw `GlibExeption`
* `GlibException` provides access to the underlying `Error` which is a wrapper for the `GError` struct
* GLib error domains are generated as enum classes, so they can be used in exhaustive when statements

### Library versions

Currently, the generator does not handle versions and deprecation information. For this reason it is important to make
sure the gir files used for generating, and the installed system library versions used by cinterop (in `/usr/include/`)
are in sync.

### Ignores and skip files

While generating, the generator can encounter top-level types and functions it does not support yet. These are logged in
a skip file named `<library-name>-skips.txt` in the modules `build` folder.

When the generator encounters methods, properties or child types that it does not support, it will log these in a
dedicated section in the KDoc for the containing type.

### GObject Reference counting and ownership

The generated bindings do not automatically handle the GObject reference counting and ownership semantics yet.
This is on our roadmap and will be added in the near future.

### GObject and Widget subclassing

User-defined subclassing for GObject types is not supported yet. This is on our roadmap and is one of the next big
features we want to support.

## Why the name gtk-kn?

The "kn" in gtk-kn stands for Kotlin Native. We chose this name because it is similar to other projects that provide
language bindings for GTK, such as gtk-rs for Rust.

## Contact

If you have any questions or comments about the project, please feel free to contact us on our
[Matrix space](https://matrix.to/#/#gtk-kn:matrix.org) or the
[GitLab issue tracker](https://gitlab.com/gtk-kn/gtk-kn/-/issues).

## License

This project is licensed under
the [GNU General Public License v3.0 (GPLv3)](https://www.gnu.org/licenses/gpl-3.0.en.html), however some directories
are licensed differently:

- The generated bindings in the `bindings/**/src/nativeMain/kotlin/org/gtkkn/bindings/` directories are licensed under
  the [GNU Lesser General Public License v3.0 (LGPLv3)](https://www.gnu.org/licenses/lgpl-3.0.en.html). It is possible
  to manually generate bindings using the [MIT License](https://opensource.org/licenses/MIT), but this version will not
  include the LGPL GTK documentation.
- The binding extensions in the `bindings/**/src/nativeMain/kotlin/org/gtkkn/extensions/` directories are licensed under
  the [MIT License](https://opensource.org/licenses/MIT)
- The `docs` directory is licensed under
  the [Creative Commons Attribution-ShareAlike 4.0 International License (CC-BY-SA 4.0)](https://creativecommons.org/licenses/by-sa/4.0/).
- The `samples` directory is licensed under the [MIT License](https://opensource.org/licenses/MIT).

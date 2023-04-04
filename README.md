# gtk-kn

<img src="art/gtk-kn_logo.png" width="120" align="right" hspace="0" />

gtk-kn provides Kotlin Native bindings for the GTK framework. GTK is a popular cross-platform GUI toolkit that provides
a complete set of widgets for building graphical applications. Kotlin Native is a technology that allows Kotlin code to
be compiled to native code for various platforms.

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

## Why the name gtk-kn?

The "kn" in gtk-kn stands for Kotlin Native. We chose this name because it is similar to other projects that provide
language bindings for GTK, such as gtk-rs for Rust.

## Contact

If you have any questions or comments about the project, please feel free to contact us through
our [GitLab issue tracker](https://gitlab.com/gtk-kn/gtk-kn/-/issues).

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

To develop a `gtk-kn` application, two essential components are required on your workstation:

- the Kotlin Native toolchain
- the GTK 4 library

However, installation instructions vary by operating system, and the details can be tricky to navigate. As a result, we
will provide installation guidelines for each operating system in the upcoming chapters.

## Requirements

### Linux

You first have to install the following dependencies:

```bash
# Debian
sudo apt install gnome-devel gcc-multilib libgtksourceview-5-dev

# Fedora
sudo dnf install gtk4-devel libadwaita-devel gtksourceview5-devel libxcrypt-compat
```

A bash script to install all the dependencies for Ubuntu 24.04 , that includes also all the optional bindings, it is
available here:

``` bash title=".ci/install-ubuntu-deps.sh"
--8<-- ".ci/install-ubuntu-deps.sh:18"
```

### macOS

!!! warning "Support coming soon"

    Currently, the bindings are available only for Linux, but the plan is to provide bindings for macOS in the future
    as well. Once the bindings are available for macOS, developers will be able to use them to create cross-platform
    GUI applications that can run on both Linux and macOS.

### Windows

!!! warning "Support coming soon"

    Currently, the bindings are available only for Linux, but the plan is to provide bindings for Windows in the future
    as well. Once the bindings are available for Windows, developers will be able to use them to create cross-platform
    GUI applications that can run on both Linux and Windows.

## Editor or Integrated Development Environment (IDE)

You can use any editor or IDE that supports Kotlin. For this guide we will use and refer
to [IntelliJ IDEA](https://www.jetbrains.com/idea/).

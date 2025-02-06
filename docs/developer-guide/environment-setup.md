---
description: Set up your development environment for gtk-kn with the required dependencies on Linux and macOS.
---

To develop a `gtk-kn` application, you need:

- The **Kotlin/Native toolchain**, which requires a **Java environment** (only for Gradle, not the actual application)
- The **GTK 4 library** and dependencies

Most Linux distributions require only three essential packages to build and run **GTK applications**:

- **pkgconf**
- **gobject-introspection** (or **libgirepository**)
- **libadwaita**

However, if you're missing additional dependencies or want to **build the `gtk-kn` itself**,
you can use the installation scripts provided below.

## Requirements by OS

### Linux

The `gtk-kn` project supports development on major Linux distributions. Our **CI tests** ensure
compatibility with the latest stable versions of:

- **Arch Linux**
- **Fedora**
- **openSUSE Tumbleweed**
- **Ubuntu LTS**

For most distributions, installing these **three packages** is enough:

```sh
sudo apt install pkgconf libgirepository1.0-dev libadwaita-1-dev  # Ubuntu/Debian
sudo dnf install pkgconf gobject-introspection-devel libadwaita-devel  # Fedora
sudo pacman -S pkgconf gobject-introspection libadwaita  # Arch Linux
sudo zypper install pkgconf gobject-introspection-devel libadwaita-devel  # openSUSE
```

If you're **missing dependencies** or need to **build the `gtk-kn` itself**, use these scripts:

#### Arch Linux

``` bash title="docker/archlinux/install-archlinux-deps.sh"
--8<-- "docker/archlinux/install-archlinux-deps.sh:23"
```

#### Fedora

``` bash title="docker/fedora/install-fedora-deps.sh"
--8<-- "docker/fedora/install-fedora-deps.sh:23"
```

#### openSUSE Tumbleweed

``` bash title="docker/opensuse-tumbleweed/install-opensuse-tumbleweed-deps.sh"
--8<-- "docker/opensuse-tumbleweed/install-opensuse-tumbleweed-deps.sh:23"
```

#### Ubuntu LTS

``` bash title="docker/ubuntu/install-ubuntu-deps.sh"
--8<-- "docker/ubuntu/install-ubuntu-deps.sh:23"
```

### macOS (Apple Silicon Only)

`gtk-kn` now supports macOS on Apple Silicon (arm64). To get started:

1. **Install Xcode**:
   Ensure Xcode is installed manually via the [Mac App Store](https://apps.apple.com/us/app/xcode/id497799835) or from
   the [Apple Developer website](https://developer.apple.com/xcode/). Xcode is required to provide essential build
   tools.

2. **Install Dependencies**:
   Use the following script to set up additional dependencies:

``` bash title=".ci/install_macos_deps.sh"
--8<-- ".ci/install_macos_deps.sh:23"
```

### Windows

!!! warning "Windows Support Planned"

    Windows support is planned, enabling developers to create cross-platform GUI applications that run on Linux, macOS,
    and Windows.

## Editor or Integrated Development Environment (IDE)

While any editor that supports Kotlin can be used, we recommend using
[IntelliJ IDEA](https://www.jetbrains.com/idea/) for the best development experience.

## Next Steps

Once your development environment is set up, you're ready to create your first `gtk-kn` application.

👉 Follow the [Get Started guide](../get-started/index.md) for step-by-step instructions on setting up a Hello World GTK
project using Kotlin/Native.

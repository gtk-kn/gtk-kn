To develop a `gtk-kn` application, you’ll need:

- The Kotlin/Native toolchain
- The GTK 4 library

Installation steps differ by operating system, so we’ll provide OS-specific installation guidelines in the sections
below.

## Requirements

### Linux

The `gtk-kn` project supports the development of GTK 4 applications using Kotlin/Native on popular Linux distributions.
Continuous integration tests validate bindings for the latest stable versions of Arch Linux, Fedora, openSUSE
Tumbleweed, and Ubuntu LTS. Below, we provide OS-specific guidelines and installation scripts to help you set up the
required dependencies seamlessly.

For each distribution, you can find the relevant installation script embedded here. These scripts automate the
installation of all necessary development dependencies:

#### Arch Linux

To set up your environment on Arch Linux, the following script outlines the required packages:

``` bash title="docker/archlinux/install-archlinux-deps.sh"
--8<-- "docker/archlinux/install-archlinux-deps.sh:23"
```

#### Fedora

For Fedora users, ensure your system is equipped with the following dependencies:

``` bash title="docker/fedora/install-fedora-deps.sh"
--8<-- "docker/fedora/install-fedora-deps.sh:23"
```

#### openSUSE Tumbleweed

If you are using openSUSE Tumbleweed, refer to the script below for the installation steps:

``` bash title="docker/opensuse-tumbleweed/install-opensuse-tumbleweed-deps.sh"
--8<-- "docker/opensuse-tumbleweed/install-opensuse-tumbleweed-deps.sh:23"
```

#### Ubuntu LTS

Ubuntu LTS users can install the necessary dependencies using the following script:

``` bash title="docker/ubuntu/install-ubuntu-deps.sh"
--8<-- "docker/ubuntu/install-ubuntu-deps.sh:23"
```

### macOS (Apple Silicon Only)

The `gtk-kn` project now supports macOS on Apple Silicon (arm64). To get started:

1. **Install Xcode**:
   Ensure Xcode is installed manually via the [Mac App Store](https://apps.apple.com/us/app/xcode/id497799835) or from
   the [Apple Developer website](https://developer.apple.com/xcode/). Xcode is required to provide essential build
   tools.

2. **Install Dependencies**:
   Use the following script to set up additional dependencies:

``` bash title="misc/install_macos_deps.sh"
--8<-- "misc/install_macos_deps.sh:23"
```

### Windows

!!! warning "Support Coming Soon"

    Windows support is planned, enabling developers to create cross-platform GUI applications that run on Linux, macOS,
    and Windows.

## Editor or Integrated Development Environment (IDE)

Any editor or IDE that supports Kotlin can be used. This guide
references [IntelliJ IDEA](https://www.jetbrains.com/idea/) for examples.

To develop a `gtk-kn` application, you’ll need:

- The Kotlin/Native toolchain
- The GTK 4 library

Installation steps differ by operating system, so we’ll provide OS-specific installation guidelines in the sections
below.

## Requirements

### Linux

Install the following dependencies based on your distribution:

```bash
# Debian-based systems
sudo apt install gnome-devel gcc-multilib libgtksourceview-5-dev

# Fedora-based systems
sudo dnf install gtk4-devel libadwaita-devel gtksourceview5-devel libxcrypt-compat
```

For Ubuntu 24.04, a bash script is available to install all dependencies, including optional bindings:

'''bash title=".ci/install-ubuntu-deps.sh"
--8<-- ".ci/install-ubuntu-deps.sh:18"
'''

### macOS

!!! warning "Support Coming Soon"

    Currently, bindings are only available for Linux. macOS support is planned, enabling developers to create cross-platform
    GUI applications that run on both Linux and macOS.

### Windows

!!! warning "Support Coming Soon"

    Currently, bindings are only available for Linux. Windows support is planned, allowing for cross-platform GUI
    applications that run on Linux and Windows.

## Editor or Integrated Development Environment (IDE)

Any editor or IDE that supports Kotlin can be used. This guide
references [IntelliJ IDEA](https://www.jetbrains.com/idea/) for examples.

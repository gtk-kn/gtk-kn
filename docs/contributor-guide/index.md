---
title: Contributor Guide
description: Learn how to set up your development environment, generate bindings, and contribute to the gtk-kn project.
---

We appreciate all contributions, whether you're **fixing a bug, adding features, or improving the documentation**.
Before you begin, please read our
full [Contribution Guidelines](https://gitlab.com/gtk-kn/gtk-kn/-/blob/master/CONTRIBUTING.md).

## Setting Up Your Development Environment

### Hardware Requirements

Building `gtk-kn` requires a significant amount of system resources. **We recommend at least 16GB of RAM** (more is
better) and a fast CPU.

### Software Requirements

To set up the required dependencies, follow the instructions in
the [Environment Setup Guide](../developer-guide/environment-setup.md).

!!! note

    The Environment Setup Guide contains instructions for both:

    - Application developers who use `gtk-kn` to build apps.
    - Contributors who want to build and modify `gtk-kn` itself.

    As a contributor, skip the app developer instructions and focus on the CI setup scripts.
    These scripts:

    - Install all required dependencies for your OS.
    - Match the exact environment used in CI, ensuring a consistent build setup.

### JDK Requirement

gtk-kn **requires JDK 17**.
Newer versions **may not work**, so make sure you've installed the correct version.

## Cloning the Repository

The main repository is hosted on [GitLab](https://gitlab.com/gtk-kn/gtk-kn). A mirror is also available
on [GitHub](https://github.com/gtk-kn/gtk-kn).

### Clone with Submodules

The project uses **Git submodules**, so it must be cloned with the `--recurse-submodules` flag:

```sh
git clone --recurse-submodules https://gitlab.com/gtk-kn/gtk-kn.git
cd gtk-kn
```

If you forget to use `--recurse-submodules`, you can initialize and update them manually:

```sh
git submodule init
git submodule update
```

## Working with Bindings

### Pre-Generated Bindings

The project comes with **pre-generated bindings** for a specific Linux distribution.
These bindings allow them to be **searchable and viewable online**, but may not always match your system if you are
using a different Linux distribution or version.

### Generating New Bindings

To generate bindings that match your system, use the following **Gradle task**:

```sh
./gradlew :gir:run
```

These are all the Gradle tasks that allow you to manipulate the bindings:

| Task             | Description                                                                                                 |
|------------------|-------------------------------------------------------------------------------------------------------------|
| `cleanBindings`  | **Deletes** all generated bindings.                                                                         |
| `:gir:run`       | **Generates** new bindings from the GIR files on your system. _(Automatically runs `cleanBindings` first.)_ |
| `revertBindings` | **Restores** bindings to their last committed state. _(Removes unversioned changes.)_                       |


After generating the bindings, you can **compile and validate** them by running:

```sh
./gradlew check
```

This will **compile the bindings and run static analysis** to ensure everything is working correctly.

## Running a Sample Application

After setting up the environment and generating bindings, it's a good idea to **run a sample app** to verify that
everything is working.

To run the **Playground** sample app:

### On Linux

```sh
./gradlew samples:playground:runDebugExecutableLinuxX64
```

### On macOS

```sh
./gradlew samples:playground:runDebugExecutableMacosArm64
```

If everything is set up correctly, a **GTK window should appear**.

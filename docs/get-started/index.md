This guide provides quick instructions to set up dependencies, generate bindings, and run a sample using `gtk-kn` on
Ubuntu 24.04. For detailed setup steps, additional distributions, or OS support, please see
the [Installation Guide](../user-guide/installation.md).

## Quick Start on Ubuntu 24.04

1. **Install Required Dependencies**

   Run the following command to install necessary packages:

   ```bash
   sudo apt install gnome-devel gcc-multilib
   ```

2. **Generate Bindings**

   Use the Gradle command below to generate bindings for `gtk-kn`:

   ```bash
   ./gradlew :gir:run
   ```

3. **Run a Sample Application**

   To verify the setup, run a sample application:

   ```bash
   ./gradlew samples:gtk:widgets:runDebugExecutableLinuxX64
   ```

This will launch a sample GTK application, confirming that everything is set up correctly.

<figure markdown>
![GTK-kn logo](../assets/sample-widgets-screenshot.png)
</figure>

For more detailed instructions and advanced usage, see the [User Guide](../user-guide/index.md).

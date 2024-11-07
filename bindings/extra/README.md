# Enabling Optional Bindings

To generate Kotlin/Native bindings for additional libraries, you can modify the `gtkkn.json` configuration file. This file specifies which libraries are included during the binding generation process and allows you to enable optional Gradle modules.

## Quick Steps

1. **Locate the `gtkkn.json` File**: Ensure you have access to the `gtkkn.json` file that configures the binding generation.
2. **Edit the `gtkkn.json` File**:
    - Add the library to the `libraries` field or move it from the `ignoredLibraries` field.
3. **Use a Custom Configuration** (optional):
    - Run the generator using a custom configuration file by adding `-Dorg.gtkkn.configFile=/path/to/your/config.json` to your Gradle command.
    - To make this change permanent, update your `~/.gradle/gradle.properties` file with:
      ```ini
      org.gtkkn.configFile=/path/to/your/config.json
      ```

## More Details

For a full guide and examples, refer to the [official documentation](https://gtk-kn.org/user-guide/optional-bindings/).

---
description: Learn how the `org.gtkkn.application` Gradle plugin simplifies building and deploying GTK applications in Kotlin/Native.
...

# Gradle Plugin for `gtk-kn`

The `org.gtkkn.application` Gradle plugin simplifies the process of building and deploying applications with `gtk-kn`.
It automates the configuration of entry point definition, GObject library versions and resource embedding, reducing
boilerplate code and simplifying project setup.

## Binary Entry Point

By default, when building a Kotlin/Native executable, you need to specify the entry point manually in your
`build.gradle.kts` configuration. The `org.gtkkn.application` plugin provides a more convenient way to define the entry
point, avoiding unnecessary boilerplate.

You can specify the entry point directly in the `gtkKn` block:

```kotlin
gtkKn {
    entryPoint = "com.example.main"
}
```

This eliminates the need to manually configure the `entryPoint` property inside the `binaries` block, reducing
boilerplate code like:

```kotlin
kotlin {
    val hostOs = OperatingSystem.current()
    val isArm64 = System.getProperty("os.arch") == "aarch64"
    val nativeTarget = when {
        hostOs.isLinux && !isArm64 -> linuxX64()
        hostOs.isMacOsX && isArm64 -> macosArm64()
        else -> throw GradleException("Host OS '${hostOs}' is not supported by gtk-kn.")
    }
    nativeTarget.apply {
        binaries {
            executable {
                entryPoint = "main"
            }
        }
    }
}
```

By specifying the `entryPoint` in `gtkKn`, the plugin takes care of setting the correct entry point for the executable,
making the build configuration cleaner and more maintainable.

## Targeting Library Versions

One of the core features of the plugin is the ability to specify target versions for each GObject library. By setting a
target version, the build process will automatically enable compatibility for all APIs up to and including the specified
version, ensuring access to newer features while maintaining control over API level compatibility.

For example, to set the target version for the `gio` and `gtk` libraries, add the following to your `build.gradle.kts`:

```kotlin
gtkKn {
    targetLibraryVersions.putAll(mapOf("gio" to "2.28", "gtk" to "4.10"))
}
```

In this configuration, the project will opt into all `gtk` APIs up to version 4.10. This eliminates the need to manually
specify each version, making it easier to manage version compatibility across your project.

### Manual Opt-In (Without the Plugin)

It’s still possible to opt into specific versions manually without using the plugin. However, in this case, each target
version must be added individually, as shown below:

```kotlin
sourceSets.configureEach {
    languageSettings {
        // Opt in to the required annotations
        optIn("org.gtkkn.bindings.gtk.annotations.GtkVersion4_2")
        optIn("org.gtkkn.bindings.gtk.annotations.GtkVersion4_4")
        optIn("org.gtkkn.bindings.gtk.annotations.GtkVersion4_6")
        optIn("org.gtkkn.bindings.gtk.annotations.GtkVersion4_8")
        optIn("org.gtkkn.bindings.gtk.annotations.GtkVersion4_10")
    }
}
```

While this approach provides the same compatibility, using the Gradle plugin streamlines this process and reduces the
maintenance effort.

## Ignoring Unresolved Symbols in Object Files

When including a `gtk-kn` dependency in your project, you may encounter linker errors such as:

```
ld.lld: error: undefined symbol: <some native symbol>
```

These errors usually occur when one of the project dependencies references symbols from a native library version
different from the one installed on your system. If these symbols are not required for your application, they can be
safely ignored during linking.

The `org.gtkkn.application` plugin automatically applies the appropriate linker options based on your operating system:

### Linux

For Linux, the linker option `--unresolved-symbols=ignore-in-object-files` is added:

```kotlin
freeCompilerArgs += listOf("-linker-option", "--unresolved-symbols=ignore-in-object-files")
```

This instructs the linker to skip unresolved symbols in object files while still enforcing symbol resolution in shared
libraries. This ensures the build succeeds without risking runtime issues for unused symbols.

### macOS

For macOS, where `--unresolved-symbols` is not supported, the following linker options are used:

```kotlin
freeCompilerArgs += listOf(
    "-linker-option", "-undefined",
    "-linker-option", "dynamic_lookup"
)
```

This tells the linker to ignore unresolved symbols and defer their resolution to runtime. Symbols that are never
accessed will not cause any issues, but if they are accessed and remain unresolved, the program will crash.

These settings ensure compatibility across platforms while avoiding linker errors for unused symbols. If you're still
seeing this error, the issue might lie elsewhere in your setup.

## Embedding GResources

The `org.gtkkn.application` plugin also supports embedding resources—such as images, CSS, and UI files—directly into the
application binary. This feature simplifies resource management, as embedded resources become part of the application’s
executable, accessible without external dependencies.

To use this feature, place your resources in the `src/gresources/main` directory, then add the following configuration
to your `build.gradle.kts`:

```kotlin
gtkKn {
    gresources.main.embed(project.nativeTergetCompilation())
}
```

By embedding resources directly, your application becomes more self-contained, with all necessary files bundled within
the binary.

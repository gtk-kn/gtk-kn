# Frequently Asked Questions

??? question "Why does my simple project take several minutes to build and link?"

    Long build and link times for simple projects may result from not using Kotlin/Native incremental compilation.
    To speed up builds, add the following line to your project’s `gradle.properties` file:

    ```properties
    kotlin.incremental.native=true
    ```

    The first build will take the usual time, but future builds should be much faster, often dropping from minutes to
    seconds. This setting enables incremental compilation of `klib` artifacts, reducing delays in subsequent builds.

??? question "Why does my build fail with `ld.lld: error: undefined symbol: <some native symbol>`?"

    This error occurs when one of your project’s dependencies references symbols that are unresolved on the host system.
    This often happens because the dependency was compiled with a different version of a native library than the one
    installed.

    If these symbols are not required by your application, you can ignore them by adding this line to your Gradle
    configuration:

    ```kotlin
    freeCompilerArgs += listOf("-linker-option", "--unresolved-symbols=ignore-in-object-files")
    ```

    This tells the linker to skip unresolved symbols in object files, but it will still check for symbols in libraries.

    **Note**: If you're using the official [gtk-kn Gradle plugin](https://gtk-kn.org/user-guide/gradle-plugin/), this
    setting is applied automatically. If you're still seeing this error, the problem may lie elsewhere.

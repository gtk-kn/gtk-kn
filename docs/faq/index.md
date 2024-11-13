# Frequently Asked Questions

??? question "Why does my simple project take several minutes to build and link?"

    Long build and link times for simple projects may result from not using Kotlin/Native incremental compilation.
    To speed up builds, add the following line to your project’s `gradle.properties` file:

    ```properties
    kotlin.incremental.native=true
    ```

    The first build will take the usual time, but future builds should be much faster, often dropping from minutes to
    seconds. This setting enables incremental compilation of `klib` artifacts, reducing delays in subsequent builds.

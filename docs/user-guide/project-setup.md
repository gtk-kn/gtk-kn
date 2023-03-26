In order to start writing a GTK application in Kotlin/Native, you need to know first how to setup a generic
Kotlin/Native project. If you are familiar with the topic, you can jump immediately to
the [Hello World!](hello-world.md) section.

[Gradle](https://gradle.org) is a build system that is very commonly used in the Java, Android, and other ecosystems. It
is the default choice for Kotlin/Native and Multiplatform when it comes to build systems.

While most IDEs, including [IntelliJ IDEA](https://www.jetbrains.com/idea), can generate necessary Gradle files,
this tutorial covers how to create them manually to provide a better understanding of how things work under the hood.

## Create project files

1. Create a project directory. Inside it, create `build.gradle.kts` Gradle build file with the
   following content:

    ```kotlin
    // build.gradle.kts
    plugins {
        kotlin("multiplatform") version "1.8.10"
    }

    kotlin {
        linuxX64("native") {
            binaries {
                executable()
            }
        }
        sourceSets {
            val nativeMain by getting {
                dependencies {
                    // Dependencies go here
                }
            }
        }
    }

    tasks.withType<Wrapper> {
        description = "Regenerates the Gradle Wrapper files"
        distributionType = Wrapper.DistributionType.ALL
        gradleVersion = "7.6"
    }
    ```

2. Create a `settings.gradle.kts` file in the project directory with the following content:
    ```kotlin
    // settings.gradle.kts
    pluginManagement {
        repositories {
            gradlePluginPortal()
            mavenCentral()
        }
    }

    dependencyResolutionManagement {
        repositories {
            mavenCentral()
            mavenLocal()
        }
    }
    ```
3. Create a directory `src/nativeMain/kotlin` and place inside an `hello.kt` file with the following content:
   ```kotlin
   // hello.kt
    fun main() {
        println("Hello K/N!")
    }
   ```
   By convention, all sources are located in the `src/<target name>[Main|Test]/kotlin` directories, where `main` is for
   the source code and `test` is for tests. `<target name>` corresponds to the target platform (in this case `native`),
   as specified in the build file.

Now you are ready to build your project and run the application, but first we need to get Gradle.

## Downloading the Gradle Wrapper

The Gradle Wrapper is a script that allows us to download and run a specific version of Gradle. It is particularly
useful for ensuring that our project uses a consistent version of Gradle, regardless of the environment in which it is
built.

By using the Gradle Wrapper, we avoid the need to install Gradle globally on our system, which can cause compatibility
issues between different versions of Gradle and different operating systems. The Gradle Wrapper ensures that everyone
working on the project is using the same version of Gradle, and that the build process is consistent across different
environments.

Overall, using the Gradle Wrapper is a best practice for managing dependencies and ensuring that our build process is
reliable and consistent.

To download the Gradle Wrapper, we can install the Gradle version provided by our distribution. For example, on Ubuntu
we can use the following command:

```bash
sudo apt install gradle
```

Once Gradle is installed, we can execute the following command, from withing the directory of our project, to download
the Gradle Wrapper:

```bash
gradle wrapper
```

Once the Gradle Wrapper is downloaded, we can uninstall Gradle using the following commands:

```bash
sudo apt remove gradle
sudo apt autoremove
```

This will remove the Gradle binary from our system, but we can still use the Gradle Wrapper to build our project.

## Build and run the application

1. From the root project directory, run the build command:

   ```bash
   ./gradlew nativeBinaries
   ```

   This command creates the `build/bin/native` directory with two directories inside: `debugExecutable`
   and `releaseExecutable`. They contain corresponding binary files.

   By default, the name of the binary file is the same as the project directory.

2. To run the project, execute the following command:

   ```bash
   build/bin/native/debugExecutable/<project_name>.kexe
   ```

   The terminal should print  "Hello K/N!".

## Open the project in an IDE

Now you can open your project in any IDE that supports Gradle. If you use IntelliJ IDEA:

1. Select **File** | **Open...**.
2. Select the project directory and click **Open**.
   IntelliJ IDEA will automatically detect it as Kotlin/Native project.

!!! note

    If you face any problem with the project, IntelliJ IDEA will show the error message in the **Build** tab.

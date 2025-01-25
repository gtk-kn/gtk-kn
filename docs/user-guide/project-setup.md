To start developing a GTK application in Kotlin/Native, you first need to set up a Kotlin/Native project. If you’re already familiar with this, feel free to skip ahead to the [Hello World!](hello-world.md) section.

[Gradle](https://gradle.org) is a popular build system used in Kotlin/Native and Kotlin Multiplatform projects, as well as across Java and Android ecosystems. While many IDEs, including [IntelliJ IDEA](https://www.jetbrains.com/idea), can generate necessary Gradle files, this tutorial explains how to create them manually for a deeper understanding.

## Creating Project Files

1. **Create the Project Directory**: Inside, create a `build.gradle.kts` file with the following content:

    ```kotlin
    // build.gradle.kts
    plugins {
        kotlin("multiplatform") version "1.8.10"
    }

    kotlin {
        linuxX64() {
            binaries {
                executable()
            }
        }
        sourceSets {
            val nativeMain by getting {
                dependencies {
                    // Specify dependencies here
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

2. **Add a Settings File**: Create `settings.gradle.kts` with the following content:

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
3. **Add the Source Directory**: Create a `src/nativeMain/kotlin` directory and inside, add `hello.kt` with the following code:

   ```kotlin
   // hello.kt
    fun main() {
        println("Hello K/N!")
    }
   ```

   By convention, source files are located in `src/<target name>[Main|Test]/kotlin` folders, where `<target name>` matches the target platform (`native` in this case).

With these files in place, you’re ready to build the project. First, we need to download the Gradle Wrapper.

## Setting Up the Gradle Wrapper

The Gradle Wrapper lets you download and run a specific version of Gradle, ensuring consistency across different development environments.

To install the Gradle Wrapper:

1. Install Gradle via your package manager. On Ubuntu, use:

    ```bash
    sudo apt install gradle
    ```

2. In the project directory, run:

    ```bash
    gradle wrapper
    ```

3. After downloading the Wrapper, you can uninstall Gradle:

    ```bash
    sudo apt remove gradle
    sudo apt autoremove
    ```

This removes the Gradle binary, but you can still build the project using the Gradle Wrapper.

## Building and Running the Application

1. **Build the Project**: Run this command from the project root:

   ```bash
   ./gradlew nativeBinaries
   ```

   This will generate `build/bin/native`, containing `debugExecutable` and `releaseExecutable` directories with the compiled binaries.

2. **Run the Project**: Execute the following to run the application:

   ```bash
   build/bin/native/debugExecutable/<project_name>.kexe
   ```

   You should see "Hello K/N!" printed in the terminal.

## Opening the Project in an IDE

You can open the project in any IDE that supports Gradle. In IntelliJ IDEA:

1. Go to **File** | **Open...**
2. Select the project directory and click **Open**.

IntelliJ IDEA should automatically detect it as a Kotlin/Native project.

!!! note

    If you encounter issues, IntelliJ IDEA will display error messages in the **Build** tab.

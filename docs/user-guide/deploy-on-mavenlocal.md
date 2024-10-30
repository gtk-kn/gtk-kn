!!! warning

    This library is under development and has not been published to MavenCentral yet. However, you can still use
    it in your projects by downloading the source code, building it, and deploying the artifacts to MavenLocal.

## What is MavenLocal?

MavenLocal is a local repository for Maven artifacts, storing remote artifacts cached during builds and any locally
built or deployed artifacts.

## Why Deploy to MavenLocal?

When building `gtk-kn` from source, the artifacts are not automatically available to other projects on your system. By
deploying `gtk-kn` artifacts to MavenLocal, you make them accessible to any other projects that rely on them—a helpful
workaround until the library is published to MavenCentral.

## Steps to Deploy to MavenLocal

1. Clone the repository:
    ```bash
    git clone https://gitlab.com/gtk-kn/gtk-kn.git
    ```
2. Generate the binding source code:
    ```bash
    ./gradlew :gir:run
    ```
3. Compile the bindings:
    ```bash
    ./gradlew assemble
    ```
4. Install to MavenLocal:
    ```bash
    ./gradlew publishToMavenLocal :gradle-plugin:publishToMavenLocal
    ```
5. Verify the installation by checking the `~/.m2/repository` directory.
6. In your project’s `settings.gradle.kts`, add `mavenLocal()` to the repositories block:

    ```kotlin
    repositories {
        mavenLocal()
        // other repositories
    }
    ```

Your project should now be able to locate and use `gtk-kn` as a dependency.

*Note:* Remove `mavenLocal()` from `settings.gradle.kts` once the library is published to MavenCentral.

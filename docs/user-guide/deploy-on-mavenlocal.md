!!! warning

    This library is currently in development and has not been published to MavenCentral yet. However, you can still use
    it in your projects by downloading the source code, building it, and deploying the artifacts to MavenLocal.

## What is MavenLocal?

MavenLocal is a local repository for Maven artifacts. It is a local cache of remote artifacts that have been downloaded
during the build process, as well as any artifacts that have been installed or deployed locally.

## Why do I need to deploy to MavenLocal?

When you build `gtk-kn` from source code, the artifacts are not automatically added to your local repository. This means
that any other projects that depend on `gtk-kn` will not be able to find the library.

By deploying the `gtk-kn` artifacts to MavenLocal, you make them available to any other projects that are built on your
machine. This is a temporary workaround until the library is published to MavenCentral.

## How to deploy to MavenLocal

To deploy the `gtk-kn` artifacts to MavenLocal, follow these steps:

1. Clone the `gtk-kn` repository by running `git clone https://gitlab.com/gtk-kn/gtk-kn.git`
2. If you are not on Ubuntu 24.04, wipe the existing bindings by running `./gradlew cleanBindings`
3. Generate the binding source code by running `./gradlew :gir:run`.
4. Compile the bindings by running `./gradlew assemble`.
5. Install the library to your local repository by running `./gradlew publishToMavenLocal :gradle-plugin:publishToMavenLocal`.
6. Confirm that the artifacts have been installed to your local repository by checking the `~/.m2/repository` directory.
7. In your project's `settings.gradle.kts` file, add the following lines to the repositories block: `mavenLocal()`

That's it! Your project should now be able to find and use `gtk-kn` as a dependency.

Note: Remember to remove the `mavenLocal()` repository from your `settings.gradle.kts` file once the library is
published to MavenCentral.

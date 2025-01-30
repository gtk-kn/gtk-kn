---
description: Learn how to deploy gtk-kn artifacts to MavenLocal to use locally built versions in your projects.
---

## What is MavenLocal?

MavenLocal is a **local repository** that stores locally built or deployed artifacts.

This allows you to use locally built dependencies **without needing to publish them to a remote repository**.

## Why Deploy to MavenLocal?

By default, when you build `gtk-kn` from source, its artifacts **are not automatically available** to other projects on
your system.
Deploying to **MavenLocal** allows you to:

1. Use your locally built version of `gtk-kn` in other projects.
2. Test changes before publishing them remotely.

## Deploying `gtk-kn` to MavenLocal

### Generate the Binding Source Code

Before deploying, generate the GTK bindings from your system's GIR files:

```bash
./gradlew :gir:run
```

### Publish Artifacts to MavenLocal

Run the appropriate command for your OS:

#### Linux

```bash
./gradlew publishLinuxX64PublicationToMavenLocal :gradle-plugin:publishToMavenLocal
```

#### macOS

```bash
./gradlew publishMacosArm64PublicationToMavenLocal :gradle-plugin:publishToMavenLocal
```

This will install the artifacts into your **local Maven repository (`~/.m2/repository`)**.

### Verify the Installation

To ensure the artifacts were published, check the local repository:

```bash
ls ~/.m2/repository/org/gtkkn/
```

### Use MavenLocal in Your Project

To allow your project to find the locally built `gtk-kn` artifacts, update **`settings.gradle.kts`**:

```kotlin
pluginManagement {
    repositories {
        mavenLocal()  // Ensure MavenLocal is listed first
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        mavenLocal()  // Ensure MavenLocal is listed first
        mavenCentral()
    }
}
```

### You're All Set! 🚀

Now your project can use **locally built versions** of `gtk-kn` without needing a remote repository. 🎉

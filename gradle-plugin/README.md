# gtk-kn gradle plugin

A gradle plugin for convenient GTK development with `gtk-kn` framework.

## Features

- `gtk-kn` artefact version resolution
- `*.gschema.xml` compilation and installation from sourceSet's `resources`
- `*.gresource.xml` compilation and embedding from sourceSet's `resources`

## Primer

Here are your configuration options along with their default values.

```kotlin
plugins {
    id("org.grkkn.gtk") version "<version>"
}

kotlin {
    linuxX64()
    sourceSets {
        named("linuxX64Main") {
            dependencies {
                // Version automatically resolved by the plugin if not specified
                implementation("org.gtkkn:gtk4")
            }
        }
    }
}

gtk {
    schemasInstallDir.set(File("${System.getProperty("user.home")}/.local/share/glib-2.0/schemas/"))
    baseOutputDir.set(layout.buildDirectory.dir("gtk/"))
    gresources {
        main {
            embed(kotlin.linuxX64().compilations.named("main"))
        }
        register("custom") {
            // This is detected by convention and does not have to be set up explicitly
            manifest.set(projectDir.resolve("src/gresources/custom/whatever.gresource.xml"))
        }
    }
    gschemas {
        main {
            preinstall(kotlin.linuxX64().compilations.named("main"))
        }
        register("custom") {
            // This is detected by convention and does not have to be set up explicitly
            manifest.set(projectDir.resolve("src/gschemas/custom.gschema.xml"))
        }
    }
}
```

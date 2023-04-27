# gtk-kn gradle plugin

A gradle plugin for convenient GTK development with `gtk-kn` framework.

## Features

- `gtk-kn` artefact version resolution
- `*.gschema.xml` compilation and installation from sourceSet's `resources`
- `*.gresource.xml` compilation and embedding from sourceSet's `resources`

## Primer

Here are your configuration options along with their default values.
The tasks use the values from `kotlin.<target>.compilations.<compilation>.gtk` extension.

```kotlin
plugins {
    id("org.grkkn.gtk") version "<version>"
}

gtk {
    gSchemasInstallDir.set(
        layout.projectDirectory.dir("${System.getProperty("user.home")}/.local/share/glib-2.0/schemas/")
    )
    baseOutputDir.set(layout.buildDirectory.dir("gtk/"))
    embedResources.set(true)
}

kotlin {
    linuxX64 {
        gtk {
            gSchemasInstallDir.set(project.gtk.gSchemasInstallDir)
            embedResources.set(project.gtk.embedResources)
        }

        compilations.all {
            gtk {
                gSchemasInstallDir.set(this@linuxX64.gtk.gSchemasInstallDir)
                embedResources.set(this@linuxX64.gtk.embedResources)
            }
        }
    }
    sourceSets {
        named("linuxX64Main") {
            dependencies {
                // Version automatically resolved by the plugin if not specified
                implementation("org.gtkkn:gtk4")
            }
        }
    }
}
```

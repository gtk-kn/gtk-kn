pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

// https://docs.gradle.org/7.0/userguide/declaring_dependencies.html#sec:type-safe-project-accessors
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        mavenLocal()
    }
}

rootProject.name = "gtk-kn"

includeBuild("build-conventions")

include("gir")

include("bindings:common")

include("bindings:adw")
include("bindings:core:cairo")
include("bindings:core:gdkpixbuf")
include("bindings:core:gio")
include("bindings:core:glib")
include("bindings:core:gmodule")
include("bindings:core:gobject")
include("bindings:core:graphene")
include("bindings:core:harfbuzz")
include("bindings:core:pango")
include("bindings:core:pangocairo")
include("bindings:gtk4:gdk")
include("bindings:gtk4:gsk")
include("bindings:gtk4:gtk")

include("samples:gtk:hello-world")
include("samples:gtk:playground")
include("samples:gtk:widgets")

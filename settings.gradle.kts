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

include("bindings:cairo")
include("bindings:gdk")
include("bindings:gdkpixbuf")
include("bindings:gio")
include("bindings:glib")
include("bindings:gmodule")
include("bindings:gobject")
include("bindings:graphene")
include("bindings:gsk")
include("bindings:gtk")
include("bindings:harfbuzz")
include("bindings:pango")
include("bindings:pangocairo")

include("samples:gtk:hello-world")

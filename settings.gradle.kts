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
    }
}

rootProject.name = "gtk-kn"

includeBuild("build-conventions")

include("gir")

include("bindings:common")
include("bindings:glib")
include("bindings:gobject")
include("bindings:gio")

include("samples:gtk:hello-world")

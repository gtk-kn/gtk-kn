@Suppress("DSL_SCOPE_VIOLATION") //https://github.com/gradle/gradle/issues/22797
plugins {
    id("bindings-library-conventions")
}

val bindingsGtk4Version: String by extra
version = bindingsGtk4Version
publishing.publications.withType<MavenPublication> {
    artifactId = "gsk4"
}


kotlin {
    val hostOs = System.getProperty("os.name")
    val nativeTarget = when {
        hostOs == "Linux" -> linuxX64("native")
        else -> throw GradleException("Host OS is not supported in Kotlin/Native.")
    }

    sourceSets {
        val nativeMain by getting {
            dependencies {
                api(project(":bindings:common"))
                api(project(":bindings:gtk4:gdk"))
                api(project(":bindings:core:graphene"))
                // transitive
                api(project(":bindings:core:gobject"))
                api(project(":bindings:core:glib"))
                api(project(":bindings:core:gio"))
                api(project(":bindings:core:gdkpixbuf"))
                api(project(":bindings:core:cairo"))
                api(project(":bindings:core:pango"))
                api(project(":bindings:core:harfbuzz"))
            }
        }
        val nativeTest by getting
    }

    // native main for testing
    nativeTarget.apply {
        val main by compilations.getting
        val gsk by main.cinterops.creating
    }
}

@Suppress("DSL_SCOPE_VIOLATION") //https://github.com/gradle/gradle/issues/22797
plugins {
    id("bindings-library-convention")
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
                api(project(":bindings:gdk"))
                api(project(":bindings:gsk"))
                // transitive
                api(project(":bindings:gobject"))
                api(project(":bindings:glib"))
                api(project(":bindings:gio"))
                api(project(":bindings:gdkpixbuf"))
                api(project(":bindings:cairo"))
                api(project(":bindings:pango"))
                api(project(":bindings:harfbuzz"))
            }
        }
        val nativeTest by getting
    }

    // native main for testing
    nativeTarget.apply {
        val main by compilations.getting
        val gtk by main.cinterops.creating
    }
}

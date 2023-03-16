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
                api(project(":bindings:gio"))
//                api(project(":bindings:gmodule")) // fails build because of glibc version
                // transitive
                api(project(":bindings:gobject"))
                api(project(":bindings:glib"))
            }
        }
        val nativeTest by getting
    }

    // native main for testing
    nativeTarget.apply {
        val main by compilations.getting
        val gdkpixbuf by main.cinterops.creating
    }
}

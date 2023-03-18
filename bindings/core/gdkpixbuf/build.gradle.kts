@Suppress("DSL_SCOPE_VIOLATION") //https://github.com/gradle/gradle/issues/22797
plugins {
    id("bindings-library-conventions")
}

val bindingsCoreVersion: String by extra
version = bindingsCoreVersion

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
                api(project(":bindings:core:gio"))
//                api(project(":bindings:core:gmodule")) // fails build because of glibc version
                // transitive
                api(project(":bindings:core:gobject"))
                api(project(":bindings:core:glib"))
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

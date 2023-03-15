@Suppress("DSL_SCOPE_VIOLATION") //https://github.com/gradle/gradle/issues/22797
plugins {
    alias(libs.plugins.kotlin.multiplatform)
}

apply(from = "$rootDir/bindings/cleanBindings.gradle.kts")

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
                api(project(":bindings:gdkpixbuf"))
                api(project(":bindings:gio"))
                api(project(":bindings:pango"))
                api(project(":bindings:pangocairo"))
                api(project(":bindings:cairo"))
                // transitive
                api(project(":bindings:gobject"))
                api(project(":bindings:glib"))
                api(project(":bindings:harfbuzz"))
            }
        }
        val nativeTest by getting
    }

    // native main for testing
    nativeTarget.apply {
        val main by compilations.getting
        val gdk by main.cinterops.creating
    }
}

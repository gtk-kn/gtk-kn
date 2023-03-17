@Suppress("DSL_SCOPE_VIOLATION") //https://github.com/gradle/gradle/issues/22797
plugins {
    alias(libs.plugins.kotlin.multiplatform)
    id("detekt-conventions")
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
                implementation(project(":bindings:gtk4:gtk"))
//                implementation("org.gtkkn:gtk:0.0.1")
                implementation(libs.kotlin.logging.linux.x64)
            }
        }
    }

    nativeTarget.apply {
        binaries {
            executable {
                entryPoint = "org.gtkkn.samples.gtk.helloworld.main"
            }
        }
    }
}

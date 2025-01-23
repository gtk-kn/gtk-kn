import org.gradle.internal.os.OperatingSystem

plugins {
    kotlin("multiplatform") version "2.1.0"
    id("org.gtkkn.gtk") version "0.0.1-SNAPSHOT"
}

kotlin {
    val hostOs = OperatingSystem.current()
    val isArm64 = System.getProperty("os.arch") == "aarch64"
    val nativeTarget = when {
        hostOs.isLinux && !isArm64 -> linuxX64()
        hostOs.isMacOsX && isArm64 -> macosArm64()
        else -> throw GradleException("Host OS '${hostOs}' is not supported by gtk-kn.")
    }
    nativeTarget.apply {
        binaries {
            executable {
                entryPoint = "org.gtkkn.integrationtests.main"
            }
        }
        gtkKn {
            targetLibraryVersions.putAll(mapOf("gio" to "2.28", "gtk" to "4.10"))
        }
    }
    sourceSets {
        nativeMain {
            dependencies {
                implementation("org.gtkkn:gtk4:0.0.1-SNAPSHOT")
            }
        }
    }
}

plugins {
    kotlin("multiplatform") version "2.1.0"
    id("org.gtkkn.gtk") version "0.0.1-SNAPSHOT"
}

kotlin {
    linuxX64 {
        binaries {
            executable {
                entryPoint = "org.gtkkn.integrationtests.main"
            }
        }
        gtk {
            targetLibraryVersions.put("gtk", "4.10")
            targetLibraryVersions.put("gio", "2.28")
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

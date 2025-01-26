plugins {
    kotlin("multiplatform") version "2.1.0"
    id("org.gtkkn.application") version "0.0.3-SNAPSHOT"
}

gtkKn {
    entryPoint = "org.gtkkn.integrationtests.main"
    targetLibraryVersions.putAll(mapOf("gio" to "2.28", "gtk" to "4.10"))
}

kotlin {
    sourceSets {
        nativeMain {
            dependencies {
                implementation("org.gtkkn:gtk4-${gtkKn.platformSuffix.get()}:0.0.3-SNAPSHOT")
            }
        }
    }
}

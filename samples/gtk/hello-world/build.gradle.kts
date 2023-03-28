plugins {
    kotlin("multiplatform") version "1.8.10"
}

kotlin {
    linuxX64("native") {
        binaries {
            executable()
        }
    }
    sourceSets {
        val nativeMain by getting {
            dependencies {
                // Import from project
                implementation(project(":bindings:gtk4:gtk"))
                // Import from mavenLocal
                // implementation("org.gtkkn:gtk4:0.0.1-SNAPSHOT")
            }
        }
    }
}

tasks.withType<Wrapper> {
    description = "Regenerates the Gradle Wrapper files"
    distributionType = Wrapper.DistributionType.ALL
    gradleVersion = "7.6"
}

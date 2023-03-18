import java.util.Properties

plugins {
    id("config-conventions")
    `maven-publish`
    signing
}

val localProperties = project.rootProject.file("local.properties")
    .takeIf { it.exists() }
    ?.reader()
    ?.use { reader -> Properties().apply { load(reader) } }

extra["ossrhUsername"] = localProperties?.get("ossrhUsername")?.toString() ?: System.getenv("OSSRH_USERNAME")
extra["ossrhPassword"] = localProperties?.get("ossrhPassword")?.toString() ?: System.getenv("OSSRH_PASSWORD")
extra["signing.keyId"] = localProperties?.get("signing.keyId")?.toString() ?: System.getenv("SIGNING_KEY_ID")
extra["signing.password"] = localProperties?.get("signing.password")?.toString() ?: System.getenv("SIGNING_PASSWORD")
extra["signing.secretKeyRingFile"] = localProperties?.get("signing.secretKeyRingFile")?.toString()
    ?: System.getenv("SIGNING_SECRET_KEY_RING_FILE")

val javadocJar by tasks.registering(Jar::class) {
    archiveClassifier.set("javadoc")
}

publishing {
    // Configure maven central repository
    repositories {
        maven {
            name = "Deploy"
            setUrl("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/")
            credentials {
                username = extra["ossrhUsername"]?.toString()
                password = extra["ossrhPassword"]?.toString()
            }
        }
    }

    // Configure all publications
    publications.withType<MavenPublication> {

        // Stub javadoc.jar artifact
        artifact(javadocJar.get())

        // Provide artifacts information requited by Maven Central
        pom {
            name.set("gtk-kn")
            description.set("Provides Kotlin Native bindings for the GTK framework")
            url.set("http://gtk-kn.org/")

            licenses {
                license {
                    name.set("MIT")
                    url.set("https://opensource.org/licenses/MIT")
                }
            }

            developers {
                // In alphabetical order
                developer {
                    id.set("leinardi")
                    name.set("Roberto Leinardi")
                    email.set("roberto@leinardi.com")
                }
                developer {
                    id.set("vbsteven")
                    name.set("Steven Van Bael")
                    email.set("steven@quantus.io")
                }
            }

            scm {
                connection.set("scm:git:git://gitlab.com/gtk-kn/gtk-kn.git")
                developerConnection.set("scm:git:git@gitlab.com:gtk-kn/gtk-kn.git")
                url.set("https://gitlab.com/gtk-kn/gtk-kn.git")
            }
        }
    }
}

// Signing artifacts. Signing.* extra properties values will be used
signing {
    isRequired = extra["signing.password"] != null
    sign(publishing.publications)
}

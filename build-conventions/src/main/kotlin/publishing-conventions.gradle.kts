/*
 * Copyright (c) 2023 gtk-kt
 *
 * This file is part of gtk-kt.
 * gtk-kt is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * gtk-kt is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with gtk-kt. If not, see https://www.gnu.org/licenses/.
 */

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

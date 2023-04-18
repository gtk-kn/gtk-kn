/*
 * Copyright (c) 2023 gtk-kn
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * gtk-kn is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with gtk-kn. If not, see https://www.gnu.org/licenses/.
 */

import ext.PublishConfigExt
import ext.config

plugins {
    id("config-conventions")
    `maven-publish`
    signing
}

val publish = config.extensions.create<PublishConfigExt>("publish").apply {
    ossrhUsername.convention(
        providers.gradleProperty("ossrhUsername")
            .orElse(providers.environmentVariable("OSSRH_USERNAME")),
    )
    ossrhPassword.convention(
        providers.gradleProperty("ossrhPassword")
            .orElse(providers.environmentVariable("OSSRH_PASSWORD")),
    )
    signingKeyId.convention(
        providers.gradleProperty("signing.keyId")
            .orElse(providers.environmentVariable("SIGNING_KEY_ID")),
    )
    signingPassword.convention(
        providers.gradleProperty("signing.password")
            .orElse(providers.environmentVariable("SIGNING_PASSWORD")),
    )
    signingSecretKeyRingFile.convention(
        providers.gradleProperty("signing.secretKeyRingFile")
            .orElse(providers.environmentVariable("SIGNING_SECRET_KEY_RING_FILE")),
    )
}

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
                username = publish.ossrhUsername.orNull
                password = publish.ossrhPassword.orNull
            }
        }
    }

    // Configure all publications
    publications.withType<MavenPublication> {

        // Stub javadoc.jar artifact
        artifact(javadocJar.get())

        // Provide artifacts information requited by Maven Central
        pom {
            name.set(project.name)
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
    isRequired = publish.signingPassword.isPresent
    sign(publishing.publications)
}

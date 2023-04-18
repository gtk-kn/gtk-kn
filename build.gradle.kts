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

@Suppress("DSL_SCOPE_VIOLATION")
plugins {
    // Prevent loading the Kotlin Gradle plugin multiple times
    alias(libs.plugins.kotlin.multiplatform) apply false
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.dokka)
    id("config-conventions")
    id("spotless-conventions")
}

tasks {
    dokkaHtmlMultiModule.configure {
        outputDirectory.set(rootDir.resolve("docs/dokka"))
    }
    register("generateBindings") {
        dependsOn(":gir:run")
        dependsOn("spotlessApply")
        group = BasePlugin.BUILD_GROUP
    }
    withType<SpotlessTask> {
        dependsOn(":gir:run")
    }
    withType<Wrapper> {
        description = "Regenerates the Gradle Wrapper files"
        distributionType = Wrapper.DistributionType.ALL
        gradleVersion = libs.versions.gradle.get()
    }
}

afterEvaluate {
    tasks.named("spotlessApply") {
        mustRunAfter(":gir:run")
    }
}

import groovy.json.JsonSlurper

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

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
    }
}

// https://docs.gradle.org/7.0/userguide/declaring_dependencies.html#sec:type-safe-project-accessors
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        mavenLocal()
    }
}

rootProject.name = "gtk-kn"

includeBuild("build-conventions")

include("gir")

include("bindings:common")

val configFile: String = if (extra.has("org.gtkkn.configFile")) {
    checkNotNull(extra.get("org.gtkkn.configFile") as? String)
} else {
    "${rootDir}/gtkkn.json"
}
val config = JsonSlurper().parse(File(configFile)) as Map<String, Any>
val libraries = config["libraries"] as List<Map<String, String>>

libraries.forEach { library ->
    include("bindings:${library["module"]}")
}

include("samples:gtk:hello-world")
include("samples:playground")
include("samples:gtk:widgets")

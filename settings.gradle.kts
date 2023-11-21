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

import groovy.json.JsonSlurper

// https://docs.gradle.org/7.0/userguide/declaring_dependencies.html#sec:type-safe-project-accessors
enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        mavenLocal()
    }
}

rootProject.name = "gtk-kn"

includeBuild("build-conventions")
includeBuild("gradle-plugin")

include("gir")

include("bindings:common")

var configFile: String = if (extra.has("org.gtkkn.configFile")) {
    checkNotNull(extra.get("org.gtkkn.configFile") as? String)
} else {
    "$rootDir/gtkkn.json"
}
if (!configFile.startsWith("/")) {
    configFile = "$rootDir/$configFile"
}

@Suppress("UNCHECKED_CAST")
val config = JsonSlurper().parse(File(configFile)) as Map<String, Any>
@Suppress("UNCHECKED_CAST")
val libraries = config["libraries"] as List<Map<String, String>>

libraries.forEach { library ->
    include("bindings:${library["module"]}")
}

//include(
//    "samples:gtk:hello-world",
//    "samples:playground",
//    "samples:gtk:widgets",
//    "samples:gtk:widget-templates",
//    "samples:gtk:restore-window-state",
//    "samples:gtk:embedded-resources",
//    "samples:gtk:external-resources",
//)

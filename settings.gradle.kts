/*
 * Copyright (c) 2024 gtk-kn
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
import java.util.Properties

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

val properties = (extra.properties + (rootDir.resolve("local.properties").takeIf(File::exists)?.let {
    Properties().apply {
        it.inputStream().use(this::load)
    }.toMap()
} ?: mapOf())).map { (k, v) -> "$k" to "$v" }.toMap()

var configFile: String = if (extra.properties.contains("org.gtkkn.configFile")) {
    checkNotNull(properties["org.gtkkn.configFile"])
} else {
    "$rootDir/gtkkn.json"
}
if (!configFile.startsWith("/")) {
    configFile = "$rootDir/$configFile"
}

@Suppress("UNCHECKED_CAST")
val config = JsonSlurper().parse(File(configFile)) as Map<String, Any>

@Suppress("UNCHECKED_CAST")
val bindingLibs = config["libraries"] as List<Map<String, String>>

gradle.extra["bindingLibs"] = bindingLibs

includeBuild("build-conventions")
includeBuild("gradle-plugin")

include("gir")
include("coroutines")

include("bindings:common-annotations")


bindingLibs.forEach { library ->
    include("bindings:${library["module"]}")
}

if (properties["org.gtkkn.samples.disable"] != "true") {
    include(
        "samples:cairo:clock",
        "samples:cairo:drawing",
        "samples:cairo:shapes",
        "samples:gtk:embedded-resources",
        "samples:gtk:external-resources",
        "samples:gtk:hello-world",
        "samples:gtk:restore-window-state",
        "samples:gtk:widget-templates",
        "samples:gtk:widgets",
        "samples:playground",
    )
    if (bindingLibs.any { it["module"] == "extra:gtksource" }) {
        include("samples:gtksource:sample")
    }
    if (bindingLibs.any { it["module"] == "extra:webkit" }) {
        include("samples:webkit:browser")
    }
}

/*
 * Copyright (c) 2025 gtk-kn
 *
 * SPDX-License-Identifier: LGPL-2.1-or-later
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, see <http://www.gnu.org/licenses/>.
 */

import groovy.json.JsonSlurper
import org.gradle.internal.os.OperatingSystem
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

val properties = buildMap {
    putAll(extra.properties.mapKeys { it.key.toString() }.mapValues { it.value.toString() })
    rootDir.resolve("local.properties").takeIf(File::exists)?.let { file ->
        file.inputStream().use { input -> Properties().apply { load(input) } }
            .forEach { key, value -> put(key.toString(), value.toString()) }
    }
}


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
val bindingLibs = (config["libraries"] as List<Map<String, String>>).filter { library ->
    library["platforms"]?.split(",")?.map { it.trim() }?.contains(OperatingSystem.current().name) ?: true
}

gradle.extra["bindingLibs"] = bindingLibs

includeBuild("build-conventions")
includeBuild("gradle-plugin")

include("bindings:common-annotations")
include("coroutines")
include("gir")


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

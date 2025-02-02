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

import org.jetbrains.dokka.gradle.AbstractDokkaTask
import java.time.LocalDate

plugins {
    id("org.jetbrains.dokka")
}

dokka {
    dokkaSourceSets.configureEach {
        val relativePath = projectDir.relativeTo(rootProject.rootDir).invariantSeparatorsPath
        val targetSourceFolder = "src/nativeMain/kotlin"
        sourceLink {
            localDirectory.set(file("src/nativeMain/kotlin"))
            remoteUrl("https://gitlab.com/gtk-kn/gtk-kn/-/blob/master/$relativePath/$targetSourceFolder")
            projectDir
            remoteLineSuffix.set("#L")
        }
    }
    dokkaPublications.html {
        outputDirectory.set(rootDir.resolve("docs/dokka"))
    }
    pluginsConfiguration.html {
        customStyleSheets.from("docs/assets/stylesheets/dokka.css")
        customAssets.from("docs/assets/logo-icon.svg")
        footerMessage.set("(c) ${LocalDate.now().year} gtk-kn")
    }
}

tasks {
    withType<AbstractDokkaTask> {
        mustRunAfter(":gir:run")
    }
}

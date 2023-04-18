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

plugins {
    id("bindings-library-conventions")
}

version = config.versionBindings.get()

kotlin {
    sourceSets {
        nativeMain {
            dependencies {
                api(project(":bindings:common"))
                api(project(":bindings:gtk:gtk4"))
                // transitive
                api(project(":bindings:gtk:gdk4"))
                api(project(":bindings:gtk:gsk4"))
                api(project(":bindings:core:gobject"))
                api(project(":bindings:core:glib"))
                api(project(":bindings:core:gio"))
                api(project(":bindings:core:gdkpixbuf"))
                api(project(":bindings:core:cairo"))
                api(project(":bindings:core:pango"))
                api(project(":bindings:core:harfbuzz"))
                api(project(":bindings:core:graphene"))
            }
        }
    }
}

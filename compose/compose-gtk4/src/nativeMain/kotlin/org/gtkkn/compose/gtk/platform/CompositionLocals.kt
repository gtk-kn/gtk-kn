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

package org.gtkkn.compose.gtk.platform

import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.staticCompositionLocalOf
import org.gtkkn.bindings.gtk.Application
import org.gtkkn.bindings.gtk.Window

internal fun noLocalProvidedFor(name: String): Nothing {
    error("CompositionLocal $name not present")
}

public val LocalApplication: ProvidableCompositionLocal<Application> = staticCompositionLocalOf {
    noLocalProvidedFor("Application")
}

public val LocalWindow: ProvidableCompositionLocal<Window> = staticCompositionLocalOf {
    noLocalProvidedFor("Window")
}

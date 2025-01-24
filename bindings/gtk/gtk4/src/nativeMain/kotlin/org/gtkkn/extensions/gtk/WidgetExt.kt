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

package org.gtkkn.extensions.gtk

import org.gtkkn.bindings.gtk.Widget

/**
 * Set margins.
 */
public fun Widget.setMargins(start: Int = 0, top: Int = 0, end: Int = 0, bottom: Int = 0) {
    marginStart = start
    marginEnd = end
    marginTop = top
    marginBottom = bottom
}

/**
 * Set start and end margin to [horizontal] and top and bottom margin to [vertical]
 */
public fun Widget.setMargins(horizontal: Int = 0, vertical: Int = 0) {
    marginStart = horizontal
    marginEnd = horizontal
    marginTop = vertical
    marginBottom = vertical
}

/**
 * Set all margins to the same value.
 */
public fun Widget.setMargins(all: Int): Unit = setMargins(all, all, all, all)

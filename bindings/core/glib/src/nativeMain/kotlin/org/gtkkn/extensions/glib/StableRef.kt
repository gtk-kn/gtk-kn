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

package org.gtkkn.extensions.glib

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.native.glib.gpointer

/**
 * Helper function that can be used as a destroy_data handler
 * when connecting to a signal or when executing callbacks.
 *
 * This implementation assumes [data] is a pointer to a StableRef
 * and calls dispose on it.
 */
public val staticStableRefDestroy: CPointer<CFunction<(gpointer?, CPointer<CPointed>?) -> Unit>> =
    staticCFunction { data: gpointer?,
            _: gpointer?, ->
        data?.asStableRef<Any>()?.dispose()
        Unit
    }.reinterpret()

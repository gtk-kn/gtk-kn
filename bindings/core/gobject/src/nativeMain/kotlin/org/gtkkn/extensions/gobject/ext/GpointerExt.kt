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

package org.gtkkn.extensions.gobject.ext

import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.gobject.G_TYPE_OBJECT
import org.gtkkn.native.gobject.G_TYPE_PARAM
import org.gtkkn.native.gobject.g_type_check_instance
import org.gtkkn.native.gobject.g_type_check_instance_is_a

/**
 * Checks whether this [gpointer] is a valid GObject instance (i.e. of type G_TYPE_OBJECT).
 *
 * @return `true` if the pointer represents a valid GObject instance, `false` otherwise.
 */
public fun gpointer?.isGObject(): Boolean =
    this != null &&
        g_type_check_instance(reinterpret()).asBoolean() &&
        g_type_check_instance_is_a(reinterpret(), G_TYPE_OBJECT).asBoolean()

/**
 * Checks whether this [gpointer] is a valid GParam instance (i.e. of type G_TYPE_PARAM).
 *
 * @return `true` if the pointer represents a valid GParam instance, `false` otherwise.
 */
public fun gpointer?.isGParam(): Boolean =
    this != null &&
        g_type_check_instance(reinterpret()).asBoolean() &&
        g_type_check_instance_is_a(reinterpret(), G_TYPE_PARAM).asBoolean()

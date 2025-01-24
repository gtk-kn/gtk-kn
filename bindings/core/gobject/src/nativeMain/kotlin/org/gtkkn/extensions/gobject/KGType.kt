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

package org.gtkkn.extensions.gobject

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.native.gobject.GType

/**
 * Interface for GObject type information holders.
 */
public sealed interface KGType<out T : Any> {
    public val gType: GType
    public val convertPointerFunc: (CPointer<CPointed>) -> T
}

/**
 * [KGType] implementation for generated classes.
 */
public data class GeneratedClassKGType<out T : Any>(
    override val gType: GType,
    override val convertPointerFunc: (CPointer<CPointed>) -> T
) : KGType<T>

/**
 * [KGType] implementation for generated interfaces.
 */
public data class GeneratedInterfaceKGType<out T : Any>(
    override val gType: GType,
    override val convertPointerFunc: (CPointer<CPointed>) -> T
) : KGType<T>

/**
 * [KGType] implementation for user defined types.
 */
public data class UserDefinedKGType<out T : Object>(
    override val gType: GType,
    override val convertPointerFunc: (CPointer<CPointed>) -> T
) : KGType<T>

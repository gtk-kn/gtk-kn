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

package org.gtkkn.extensions.gobject.legacy

import kotlin.reflect.KClass

/**
 * Interface used for dynamic type casting.
 *
 * This is only used internally by the type casting system, application developers should never have to use this,
 * but it needs to be public because libraries depending on gobject need it so they can register the module-specific
 * TypeProvider.
 */
public interface TypeProvider {
    public val typeMap: Map<KClass<*>, KGType<*>>

    public fun register(): Unit = TypeCasting.registerProvider(this)
}

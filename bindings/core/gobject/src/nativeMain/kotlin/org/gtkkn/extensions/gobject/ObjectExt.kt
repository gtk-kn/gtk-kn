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

import kotlinx.cinterop.memScoped
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gobject.Value
import org.gtkkn.native.gobject.G_TYPE_BOOLEAN
import org.gtkkn.native.gobject.G_TYPE_INT
import org.gtkkn.native.gobject.G_TYPE_STRING
import kotlin.reflect.KClass

/**
 * Convert object into type [T].
 *
 * This method should be used instead of regular Kotlin casting with `as` for converting
 * between any 2 Object subclasses.
 *
 * This method does not do any type checking.
 */
public inline fun <reified T : KGTyped> Object.asType(): T = asType(this, T::class)

/**
 * Convert object into type [T].
 *
 * This method should be used instead of regular Kotlin casting with `as` for converting
 * between any 2 Object subclasses.
 *
 * This method does not do any type checking.
 */
public fun <T : KGTyped> asType(obj: Object, targetClass: KClass<T>): T = TypeCasting.castObject(obj, targetClass)

public fun Object.setProperty(propertyName: String, value: Int): Unit = memScoped {
    val gValue = Value(this).init(G_TYPE_INT)
    gValue.setInt(value)
    setProperty(propertyName, gValue)
    gValue.unset()
}

public fun Object.setProperty(propertyName: String, value: String?): Unit = memScoped {
    val gValue = Value(this).init(G_TYPE_STRING)
    gValue.setString(value)
    setProperty(propertyName, gValue)
    gValue.unset()
}

public fun Object.setProperty(propertyName: String, value: Boolean): Unit = memScoped {
    val gValue = Value(this).init(G_TYPE_BOOLEAN)
    gValue.setBoolean(value)
    setProperty(propertyName, gValue)
    gValue.unset()
}

public fun Object.getStringProperty(propertyName: String): String? = memScoped {
    val gValue = Value(this)
    getProperty(propertyName, gValue)
    return gValue.getString().also { gValue.unset() }
}

public fun Object.getIntProperty(propertyName: String): Int = memScoped {
    val gValue = Value(this)
    getProperty(propertyName, gValue)
    return gValue.getInt().also { gValue.unset() }
}

public fun Object.getBooleanProperty(propertyName: String): Boolean = memScoped {
    val gValue = Value(this)
    getProperty(propertyName, gValue)
    return gValue.getBoolean().also { gValue.unset() }
}

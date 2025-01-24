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

package org.gtkkn.extensions.gobject.properties

import kotlinx.cinterop.memScoped
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gobject.ParamSpec
import org.gtkkn.bindings.gobject.Value
import org.gtkkn.native.gobject.G_TYPE_BOOLEAN
import org.gtkkn.native.gobject.G_TYPE_INT
import org.gtkkn.native.gobject.G_TYPE_STRING
import kotlin.reflect.KProperty

public open class Property<OBJECT : Object, VALUE : Any?>(
    internal val paramSpec: ParamSpec,
    internal val storeInValueFunc: (gValue: Value, value: Any?) -> Unit,
    internal val extractFromValueFunc: (gValue: Value) -> Any?,
    internal val initValueFunc: (gValue: Value) -> Unit,
) {
    public val name: String get() = paramSpec.getName()

    // called from the Kotlin side when a property val/var is accessed
    public operator fun getValue(arg: OBJECT, property: KProperty<*>): VALUE = memScoped {
        // defer to gobject getProperty
        val gValue = Value(this)
        arg.getProperty(name, gValue)
        @Suppress("UNCHECKED_CAST")
        return extractFromValueFunc(gValue) as VALUE
    }

    // called from the Kotlin side when a property var is written to
    public operator fun setValue(arg: OBJECT, property: KProperty<*>, value: VALUE): Unit = memScoped {
        // defer to gobject setProperty
        val gValue = Value(this)
        initValueFunc(gValue)
        storeInValueFunc(gValue, value)
        arg.setProperty(name, gValue)
    }
}

internal class StringProperty<OBJECT : Object>(
    paramSpec: ParamSpec
) : Property<OBJECT, String>(paramSpec, ::storeInValue, ::extractFromValue, ::initValueFunc) {
    companion object {
        private fun storeInValue(value: Value, any: Any?) {
            value.setString(any as? String)
        }

        private fun extractFromValue(value: Value): String? = value.getString()

        private fun initValueFunc(value: Value) = value.init(G_TYPE_STRING)
    }
}

internal class IntProperty<OBJECT : Object>(
    paramSpec: ParamSpec
) : Property<OBJECT, Int>(paramSpec, ::storeInValue, ::extractFromValue, ::initValueFunc) {
    companion object {
        private fun storeInValue(value: Value, any: Any?) {
            value.setInt(any as Int)
        }

        private fun extractFromValue(value: Value): Int = value.getInt()

        private fun initValueFunc(value: Value) = value.init(G_TYPE_INT)
    }
}

internal class BooleanProperty<OBJECT : Object>(
    paramSpec: ParamSpec
) : Property<OBJECT, Boolean>(paramSpec, ::storeInValue, ::extractFromValue, ::initValueFunc) {
    companion object {
        private fun storeInValue(value: Value, any: Any?) {
            value.setBoolean(any as Boolean)
        }

        private fun extractFromValue(value: Value): Boolean = value.getBoolean()

        private fun initValueFunc(value: Value) = value.init(G_TYPE_BOOLEAN)
    }
}

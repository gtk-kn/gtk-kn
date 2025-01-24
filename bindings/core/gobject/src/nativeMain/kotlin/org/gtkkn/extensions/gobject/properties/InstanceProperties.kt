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

import org.gtkkn.bindings.gobject.Value

/**
 * Storage for instance properties.
 *
 * This class holds the delegates for properties for custom types registered on the Kotlin side.
 */
internal class InstanceProperties(propertyMap: Map<UInt, Property<*, *>>) {
    private val properties = propertyMap.mapValues { InstanceProperty(it.value) }

    fun setPropertyValue(propId: UInt, value: Value) {
        properties[propId]?.setPropertyValue(value)
    }

    fun getPropertyValue(propId: UInt, value: Value) {
        properties[propId]?.getPropertyValue(value)
    }
}

private class InstanceProperty(
    val property: Property<*, *>
) {
    private var internalValue: Any? = null

    init {
        val default = property.paramSpec.getDefaultValue()
        setPropertyValue(default)
    }

    fun setPropertyValue(value: Value) {
        internalValue = property.extractFromValueFunc(value)
    }

    fun getPropertyValue(value: Value) {
        property.storeInValueFunc(value, internalValue)
    }
}

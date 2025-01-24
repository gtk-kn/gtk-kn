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

import kotlinx.cinterop.CValuesRef
import org.gtkkn.bindings.gobject.ParamSpec
import org.gtkkn.native.gobject.GObjectClass
import org.gtkkn.native.gobject.g_object_class_install_property

/**
 * Storage for class properties.
 *
 * This class holds the metadata for registered properties on custom types registered on the Kotlin side.
 */
internal class ClassProperties internal constructor() {
    private var nProps: UInt = 1u // property index starts at 1
    private val properties = mutableMapOf<UInt, Property<*, *>>()
    private var sealed = false

    internal fun registerProperty(property: Property<*, *>) {
        require(!sealed) { "registerProperty cannot be used after ClassProperties was sealed" }
        require(ParamSpec.isValidName(property.name)) { "'${property.name}' is not a valid property name" }
        properties[nProps++] = property
    }

    /**
     * Install the registered properties into the class.
     *
     * This happens once on the class_init phase of the type.
     */
    internal fun installIntoClass(objectClass: CValuesRef<GObjectClass>) {
        require(!sealed) { "ClassProperties cannot be installed after it was sealed" }
        properties.forEach {
            val id = it.key
            val property = it.value
            g_object_class_install_property(objectClass, id, property.paramSpec.gobjectParamSpecPointer)
        }
        sealed = true
    }

    /**
     * Build an [InstanceProperties] object
     *
     * This happens once for each instance when the instance is created by GObject.
     */
    internal fun newInstanceProperties(): InstanceProperties = InstanceProperties(properties)
}

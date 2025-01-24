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

import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.ObjectType
import kotlin.properties.PropertyDelegateProvider
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

public class ClassPropertyDelegate<OBJECT_TYPE : Object, VALUE : Any?> internal constructor(
    private val gProperty: Property<OBJECT_TYPE, VALUE>
) : ReadOnlyProperty<ObjectType<OBJECT_TYPE>, Property<OBJECT_TYPE, VALUE>> {
    override fun getValue(
        thisRef: ObjectType<OBJECT_TYPE>,
        property: KProperty<*>
    ): Property<OBJECT_TYPE, VALUE> = gProperty
}

public class ClassPropertyDelegateProvider<OBJECT_TYPE : Object, VALUE : Any?>(
    private val buildPropertyFunc: (propertyName: String) -> Property<OBJECT_TYPE, VALUE>,
) : PropertyDelegateProvider<ObjectType<OBJECT_TYPE>, ClassPropertyDelegate<OBJECT_TYPE, VALUE>> {
    override fun provideDelegate(
        thisRef: ObjectType<OBJECT_TYPE>,
        property: KProperty<*>
    ): ClassPropertyDelegate<OBJECT_TYPE, VALUE> {
        // build the property
        val gProperty = buildPropertyFunc(property.name)

        // register the property with the class for use in class_init
        thisRef.classProperties.registerProperty(gProperty)

        // return the delegate
        return ClassPropertyDelegate(gProperty)
    }
}

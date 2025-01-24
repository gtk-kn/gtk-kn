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

import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.gobject.asType
import org.gtkkn.native.gobject.GType
import kotlin.properties.PropertyDelegateProvider
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KClass
import kotlin.reflect.KProperty

public class TemplateChildDelegateProvider<OBJECT_TYPE : Widget, CHILD_TYPE : Object>(
    private val name: String? = null,
    private val childClass: KClass<CHILD_TYPE>,
) : PropertyDelegateProvider<TemplateWidgetType<OBJECT_TYPE>, BoundTemplateChildDelegate<OBJECT_TYPE, CHILD_TYPE>> {
    override fun provideDelegate(
        thisRef: TemplateWidgetType<OBJECT_TYPE>,
        property: KProperty<*>
    ): BoundTemplateChildDelegate<OBJECT_TYPE, CHILD_TYPE> {
        val childName = name ?: property.name
        thisRef.templateChildNames.add(childName)
        return BoundTemplateChildDelegate(childName, childClass)
    }
}

public class BoundTemplateChildDelegate<OBJECT_TYPE : Widget, CHILD_TYPE : Object>(
    private val name: String,
    private val childClass: KClass<CHILD_TYPE>
) : ReadOnlyProperty<TemplateWidgetType<OBJECT_TYPE>, ReadOnlyProperty<OBJECT_TYPE, CHILD_TYPE>> {
    override fun getValue(
        thisRef: TemplateWidgetType<OBJECT_TYPE>,
        property: KProperty<*>
    ): TemplateChildDelegate<OBJECT_TYPE, CHILD_TYPE> =
        TemplateChildDelegate(name, thisRef.gType, childClass)
}

public class TemplateChildDelegate<OBJECT_TYPE : Widget, CHILD_TYPE : Object>(
    private val name: String,
    private val templateWidgetGType: GType,
    private val childClass: KClass<CHILD_TYPE>
) : ReadOnlyProperty<OBJECT_TYPE, CHILD_TYPE> {
    private var value: CHILD_TYPE? = null

    override fun getValue(thisRef: OBJECT_TYPE, property: KProperty<*>): CHILD_TYPE =
        if (value != null) {
            checkNotNull(value)
        } else {
            value = asType(thisRef.getTemplateChild(templateWidgetGType, name), childClass)
            checkNotNull(value)
        }
}

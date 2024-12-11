/*
 * Copyright (c) 2024 gtk-kn
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
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

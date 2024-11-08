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

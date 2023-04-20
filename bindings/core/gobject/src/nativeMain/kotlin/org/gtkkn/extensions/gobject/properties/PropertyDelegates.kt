/*
 * Copyright (c) 2023 gtk-kt
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
import org.gtkkn.bindings.gobject.ParamFlags
import org.gtkkn.bindings.gobject.ParamSpec
import org.gtkkn.extensions.gobject.ObjectType
import kotlin.properties.PropertyDelegateProvider
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

public class ClassPropertyDelegate<OBJECT_TYPE : Object, VALUE : Any?> internal constructor(
    private val gProperty: Property<OBJECT_TYPE, VALUE>
) :
    ReadOnlyProperty<ObjectType<OBJECT_TYPE>, Property<OBJECT_TYPE, VALUE>> {

    override fun getValue(
        thisRef: ObjectType<OBJECT_TYPE>,
        property: KProperty<*>
    ): Property<OBJECT_TYPE, VALUE> = gProperty
}

public class ClassStringPropertyDelegateProvider<OBJECT_TYPE : Object>(
    private val name: String? = null,
    private val nick: String? = null,
    private val blurb: String? = null,
    private val defaultValue: String = "",
    private val flags: ParamFlags = ParamFlags.READWRITE
) :
    PropertyDelegateProvider<
        ObjectType<OBJECT_TYPE>,
        ClassPropertyDelegate<OBJECT_TYPE, String>,
        > {

    override fun provideDelegate(
        thisRef: ObjectType<OBJECT_TYPE>,
        property: KProperty<*>
    ): ClassPropertyDelegate<OBJECT_TYPE, String> {

        // build the StringProperty
        val propertyName = name ?: property.name
        if (!ParamSpec.isValidName(propertyName)) {
            error("'$propertyName' is not a valid property name")
        }
        val gProperty = buildStringProperty<OBJECT_TYPE>(propertyName, nick, blurb, defaultValue, flags)

        // register the property with the class for use in class_init
        thisRef.classProperties.registerProperty(gProperty)

        // return the delegate
        return ClassPropertyDelegate(gProperty)
    }
}

public class ClassIntPropertyDelegateProvider<OBJECT_TYPE : Object>(
    private val name: String? = null,
    private val nick: String? = null,
    private val blurb: String? = null,
    private val minimum: Int = Int.MIN_VALUE,
    private val maximum: Int = Int.MAX_VALUE,
    private val defaultValue: Int = 0,
    private val flags: ParamFlags = ParamFlags.READWRITE
) :
    PropertyDelegateProvider<
        ObjectType<OBJECT_TYPE>,
        ClassPropertyDelegate<OBJECT_TYPE, Int>,
        > {

    override fun provideDelegate(
        thisRef: ObjectType<OBJECT_TYPE>,
        property: KProperty<*>
    ): ClassPropertyDelegate<OBJECT_TYPE, Int> {

        // build the IntProperty
        val propertyName = name ?: property.name

        if (!ParamSpec.isValidName(propertyName)) {
            error("'$propertyName' is not a valid property name")
        }
        val gProperty = buildIntProperty<OBJECT_TYPE>(propertyName, nick, blurb, minimum, maximum, defaultValue, flags)

        // register the property with the class for use in class_init
        thisRef.classProperties.registerProperty(gProperty)

        // return the delegate
        return ClassPropertyDelegate(gProperty)
    }
}

public class ClassPropertyDelegateProvider<OBJECT_TYPE : Object, VALUE : Any?>(
    private val gProperty: Property<OBJECT_TYPE, VALUE>
) :
    PropertyDelegateProvider<
        ObjectType<OBJECT_TYPE>,
        ClassPropertyDelegate<OBJECT_TYPE, VALUE>,
        > {

    override fun provideDelegate(
        thisRef: ObjectType<OBJECT_TYPE>,
        property: KProperty<*>
    ): ClassPropertyDelegate<OBJECT_TYPE, VALUE> {
        // register the property with the class for use in class_init
        thisRef.classProperties.registerProperty(gProperty)

        // return the delegate
        return ClassPropertyDelegate(gProperty)
    }
}

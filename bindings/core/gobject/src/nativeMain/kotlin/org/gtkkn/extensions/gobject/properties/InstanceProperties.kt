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

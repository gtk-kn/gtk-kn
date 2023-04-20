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

    private var nProps: UInt = 1u // GObject properties start at index 1
    internal val properties = mutableMapOf<UInt, Property<*, *>>()
    private var sealed = false

    internal fun registerProperty(property: Property<*, *>) {
        if (sealed) error("registerProperty cannot be used after ClassProperties was sealed")

        if (!ParamSpec.isValidName(property.name())) {
            error("'${property.name()}' is not a valid property name")
        }

        val propId = nProps++
        properties[propId] = property
    }

    /**
     * Install the registered properties into the class.
     *
     * This happens once on the class_init phase of the type.
     */
    internal fun installIntoClass(objectClass: CValuesRef<GObjectClass>) {
        if (sealed) error("ClassProperties cannot be installed after it was sealed")
        properties.forEach {
            val id = it.key
            val property = it.value
            g_object_class_install_property(objectClass, id, property.paramSpec.gPointer)
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

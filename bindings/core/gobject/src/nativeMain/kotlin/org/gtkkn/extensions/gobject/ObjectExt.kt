/*
 * Copyright (c) 2023 gtk-kn
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

package org.gtkkn.extensions.gobject

import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gobject.Value
import org.gtkkn.extensions.glib.allocate
import org.gtkkn.native.gobject.G_TYPE_BOOLEAN
import org.gtkkn.native.gobject.G_TYPE_INT
import org.gtkkn.native.gobject.G_TYPE_STRING

/**
 * Cast this object to the wrapper class described by [type].
 */
public inline fun <reified T : Object> Object.downcast(type: KGType<T>): T =
    type.convertPointerFunc(this.gPointer.reinterpret())

public inline fun <reified T : Object> Object.downcast(type: ObjectType<T>): T =
    type.type.convertPointerFunc(this.gPointer.reinterpret())

public fun Object.setProperty(propertyName: String, value: Int): Unit = memScoped {
    val gValue = Value.allocate(this).init(G_TYPE_INT)
    gValue.setInt(value)
    setProperty(propertyName, gValue)
    gValue.unset()
}

public fun Object.setProperty(propertyName: String, value: String?): Unit = memScoped {
    val gValue = Value.allocate(this).init(G_TYPE_STRING)
    gValue.setString(value)
    setProperty(propertyName, gValue)
    gValue.unset()
}

public fun Object.setProperty(propertyName: String, value: Boolean): Unit = memScoped {
    val gValue = Value.allocate(this).init(G_TYPE_BOOLEAN)
    gValue.setBoolean(value)
    setProperty(propertyName, gValue)
    gValue.unset()
}

public fun Object.getStringProperty(propertyName: String): String? = memScoped {
    val gValue = Value.allocate(this)
    getProperty(propertyName, gValue)
    return gValue.getString().also { gValue.unset() }
}


public fun Object.getIntProperty(propertyName: String): Int = memScoped {
    val gValue = Value.allocate(this)
    getProperty(propertyName, gValue)
    return gValue.getInt().also { gValue.unset() }
}

public fun Object.getBooleanProperty(propertyName: String): Boolean = memScoped {
    val gValue = Value.allocate(this)
    getProperty(propertyName, gValue)
    return gValue.getBoolean().also { gValue.unset() }
}

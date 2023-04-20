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

import kotlinx.cinterop.memScoped
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gobject.ParamSpec
import org.gtkkn.bindings.gobject.Value
import org.gtkkn.extensions.glib.allocate
import org.gtkkn.native.gobject.G_TYPE_BOOLEAN
import org.gtkkn.native.gobject.G_TYPE_INT
import org.gtkkn.native.gobject.G_TYPE_STRING
import kotlin.reflect.KProperty

@Suppress("UNCHECKED_CAST")
public open class Property<OBJECT : Object, VALUE : Any?>(
    internal val paramSpec: ParamSpec,
    internal val storeInValueFunc: (gValue: Value, value: Any?) -> Unit,
    internal val extractFromValueFunc: (gValue: Value) -> Any?,
    internal val initValueFunc: (gValue: Value) -> Unit,
) {
    public fun name(): String = paramSpec.getName()

    // called from the Kotlin side when a property val/var is accessed
    public operator fun getValue(arg: OBJECT, property: KProperty<*>): VALUE = memScoped {
        // defer to gobject getProperty
        val gValue = Value.allocate(this)
        arg.getProperty(name(), gValue)
        return extractFromValueFunc(gValue) as VALUE
    }

    // called from the Kotlin side when a property var is written to
    public operator fun setValue(arg: OBJECT, property: KProperty<*>, value: VALUE): Unit = memScoped {
        // defer to gobject setProperty
        val gValue = Value.allocate(this)
        initValueFunc(gValue)
        storeInValueFunc(gValue, value)
        arg.setProperty(name(), gValue)
    }
}

internal class StringProperty<OBJECT : Object>(
    paramSpec: ParamSpec
) : Property<OBJECT, String>(paramSpec, ::storeInValue, ::extractFromValue, ::initValueFunc) {

    companion object {
        private fun storeInValue(value: Value, any: Any?) {
            value.setString(any as String?)
        }

        private fun extractFromValue(value: Value): String? = value.getString()

        private fun initValueFunc(value: Value) = value.init(G_TYPE_STRING)
    }
}

internal class IntProperty<OBJECT : Object>(
    paramSpec: ParamSpec
) : Property<OBJECT, Int>(paramSpec, ::storeInValue, ::extractFromValue, ::initValueFunc) {

    companion object {
        private fun storeInValue(value: Value, any: Any?) {
            value.setInt(any as Int)
        }

        private fun extractFromValue(value: Value): Int = value.getInt()

        private fun initValueFunc(value: Value) = value.init(G_TYPE_INT)
    }
}

internal class BooleanProperty<OBJECT : Object>(
    paramSpec: ParamSpec
) : Property<OBJECT, Boolean>(paramSpec, ::storeInValue, ::extractFromValue, ::initValueFunc) {

    companion object {
        private fun storeInValue(value: Value, any: Any?) {
            value.setBoolean(any as Boolean)
        }

        private fun extractFromValue(value: Value): Boolean = value.getBoolean()

        private fun initValueFunc(value: Value) = value.init(G_TYPE_BOOLEAN)
    }
}

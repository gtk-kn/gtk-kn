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

import org.gtkkn.bindings.gobject.Gobject
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gobject.ParamFlags

// TODO these could be inlined in the delegates?
internal fun <OBJECT : Object> buildStringProperty(
    name: String,
    nick: String? = null,
    blurb: String? = null,
    defaultValue: String? = null,
    flags: ParamFlags = ParamFlags.READWRITE
): StringProperty<OBJECT> {

    val paramSpec = Gobject.paramSpecString(name, nick, blurb, defaultValue, flags)
    return StringProperty(paramSpec)
}

internal fun <OBJECT : Object> buildIntProperty(
    name: String,
    nick: String? = null,
    blurb: String? = null,
    minimum: Int = Int.MIN_VALUE,
    maximum: Int = Int.MAX_VALUE,
    defaultValue: Int = 0,
    flags: ParamFlags = ParamFlags.READWRITE
): IntProperty<OBJECT> {
    val paramSpec = Gobject.paramSpecInt(name, nick, blurb, minimum, maximum, defaultValue, flags)
    return IntProperty(paramSpec)
}

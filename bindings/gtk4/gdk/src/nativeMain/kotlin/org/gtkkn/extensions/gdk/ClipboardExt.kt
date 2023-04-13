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

package org.gtkkn.extensions.gdk

import kotlinx.cinterop.CValue
import kotlinx.cinterop.cValue
import kotlinx.cinterop.memScoped
import org.gtkkn.bindings.gdk.Clipboard
import org.gtkkn.bindings.gobject.Value
import org.gtkkn.native.gobject.GValue
import org.gtkkn.native.gobject.G_TYPE_STRING

/**
 * Sets the @clipboard to contain the given text.
 *
 * @param text a text to set
 */
public fun Clipboard.setText(text: String) {
    memScoped {
        val cValue: CValue<GValue> = cValue<GValue> { g_type = G_TYPE_STRING }
        val value = Value(cValue.getPointer(this))
        value.setString(text)
        this@setText.setValue(value)
    }
}

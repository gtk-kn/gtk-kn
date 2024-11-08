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

import org.gtkkn.bindings.gtk.Widget

/**
 * Set margins.
 */
public fun Widget.setMargins(start: Int = 0, top: Int = 0, end: Int = 0, bottom: Int = 0) {
    marginStart = start
    marginEnd = end
    marginTop = top
    marginBottom = bottom
}

/**
 * Set start and end margin to [horizontal] and top and bottom margin to [vertical]
 */
public fun Widget.setMargins(horizontal: Int = 0, vertical: Int = 0) {
    marginStart = horizontal
    marginEnd = horizontal
    marginTop = vertical
    marginBottom = vertical
}

/**
 * Set all margins to the same value.
 */
public fun Widget.setMargins(all: Int): Unit = setMargins(all, all, all, all)

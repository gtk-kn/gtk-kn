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

package org.gtkkn.samples.gtk.widgets

import org.gtkkn.bindings.gobject.BindingFlags
import org.gtkkn.bindings.gtk.Box
import org.gtkkn.bindings.gtk.Orientation
import org.gtkkn.bindings.gtk.Spinner
import org.gtkkn.bindings.gtk.ToggleButton
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.gtk.setMargins

// --8<-- [start:doc]
fun spinner(): Widget {
    val spinner = Spinner().apply {
        setSizeRequest(100, 100)
    }

    val toggleButton = ToggleButton(label = "Start Spinning")

    // bind the spinning property of the spinner to the active property of the toggleButton
    toggleButton.bindProperty("active", spinner, "spinning", BindingFlags.DEFAULT)

    // update the text when the button is spinning
    toggleButton.onClicked {
        if (toggleButton.active) {
            toggleButton.setLabel("Stop Spinning")
        } else {
            toggleButton.setLabel("Start Spinning")
        }
    }

    val box = Box(Orientation.VERTICAL, 20).apply {
        setMargins(20)
        append(spinner)
        append(toggleButton)
    }

    return box
}
// --8<-- [end:doc]

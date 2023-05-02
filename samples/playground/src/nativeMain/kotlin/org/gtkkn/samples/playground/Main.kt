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

package org.gtkkn.samples.playground

import org.gtkkn.bindings.adw.HeaderBar
import org.gtkkn.bindings.gdk.Display
import org.gtkkn.bindings.gio.File
import org.gtkkn.bindings.gtk.Align
import org.gtkkn.bindings.gtk.Box
import org.gtkkn.bindings.gtk.CssProvider
import org.gtkkn.bindings.gtk.Label
import org.gtkkn.bindings.gtk.Orientation
import org.gtkkn.bindings.gtk.StyleContext
import org.gtkkn.native.gtk.GTK_STYLE_PROVIDER_PRIORITY_APPLICATION

fun main() = Application {
    // setup a HeaderBar since adw windows don't have any by default
    val headerBar = HeaderBar().apply {
        title = "gtk-kn playground"
    }

    // setup window layout
    val layout = Box(Orientation.VERTICAL, 0).apply {
        append(headerBar)
    }
    setContent(layout)

    // this is where any playground code can run to set up widgets
    val label = Label().apply {
        label = "Playground"
        halign = Align.CENTER
        valign = Align.CENTER
        hexpand = true
        vexpand = true
    }

    val provider = CssProvider()
    provider.loadFromFile(File.newForPath("/tmp/styles.css"))

    val display = Display.getDefault() ?: error("No display")
    StyleContext.addProviderForDisplay(display, provider, GTK_STYLE_PROVIDER_PRIORITY_APPLICATION.toUInt())

    // and add your widget to the layout to display it
    layout.append(label)
}

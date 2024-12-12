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

@file:OptIn(ExperimentalForeignApi::class)

package org.gtkkn.samples.playground

import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.memScoped
import org.gtkkn.bindings.adw.HeaderBar
import org.gtkkn.bindings.gdk.Rectangle
import org.gtkkn.bindings.gobject.Value
import org.gtkkn.bindings.gtk.Align
import org.gtkkn.bindings.gtk.Box
import org.gtkkn.bindings.gtk.Label
import org.gtkkn.bindings.gtk.Orientation
import org.gtkkn.extensions.glib.util.log.LogPriority.CRITICAL
import org.gtkkn.extensions.glib.util.log.LogPriority.DEBUG
import org.gtkkn.extensions.glib.util.log.LogPriority.INFO
import org.gtkkn.extensions.glib.util.log.LogPriority.MESSAGE
import org.gtkkn.extensions.glib.util.log.LogPriority.WARNING
import org.gtkkn.extensions.glib.util.log
import org.gtkkn.native.gobject.G_TYPE_STRING

fun main() = Application {
    log(DEBUG) { "This is a debug message" }
    log(INFO) { "This is an info message" }
    log(MESSAGE) { "This is an message" }
    log(WARNING) { "This is an warning message" }
    log(CRITICAL) { "This is an critical message" }

    // setup a HeaderBar since adw windows don't have any by default
    val headerBar = HeaderBar().apply {
        title = "gtk-kn playground"
    }

    // setup window layout
    val layout = Box(Orientation.VERTICAL, 0).apply {
        append(headerBar)
    }
    content = layout

    // this is where any playground code can run to set up widgets
    val label = Label().apply {
        label = "Playground"
        halign = Align.CENTER
        valign = Align.CENTER
        hexpand = true
        vexpand = true
    }

    log { "#### Record test" }

    memScoped {
        val r = Rectangle(
            x = 1,
            y = 2,
            height = 3,
            width = 4,
            scope = this,
        )

        val result = r.containsPoint(2, 3)
        log { "rectangle: $r" }
        log { "2,3 is contained: $result" }
    }

    /*
     * Heap allocation with use
     */
    val value1 = Value()
    value1.init(G_TYPE_STRING)
    value1.setString("Hello Value")
    val result = value1.getString()
    log { "Result is: $result" }
    // value1Ref is automatically freed after use()
//
//    /*
//     * Heap allocation with manual free
//     */
//    val value2Ref = Value.allocate()
//    val value2 = value2Ref.get()
//    value2.init(G_TYPE_STRING)
//    value2.setString("Hello Value2")
//    val result2 = value2.getString()
//    log { "Result2 is $result2" }
//    // have to free manually
//    value2Ref.free()
//
    /*
     * Allocation within MemScope
     */
    memScoped {
        val value3 = Value(this)
        value3.init(G_TYPE_STRING)
        value3.setString("Hello Value3")
        val result3 = value3.getString()
        log { "Result3 is $result3" }
        log { "value3 is $value3" }
    }
//    // value3 is automatically freed after memScoped block

    // and add your widget to the layout to display it
//    val button = Button()
//    button.name = "ciao"
//    button.connectClicked {
//        log { "rectangle2: x=${r.x} y=${r.y} h=${r.height} w=${r.width}" }
//    }
    layout.append(label)
}

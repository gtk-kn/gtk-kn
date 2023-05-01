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

package org.gtkkn.samples.gtk.widgets

import org.gtkkn.bindings.gio.ApplicationFlags
import org.gtkkn.bindings.gtk.Application
import org.gtkkn.bindings.gtk.ApplicationWindow
import org.gtkkn.bindings.gtk.Box
import org.gtkkn.bindings.gtk.Orientation
import org.gtkkn.bindings.gtk.Separator
import org.gtkkn.bindings.gtk.Stack
import org.gtkkn.bindings.gtk.StackSidebar
import org.gtkkn.bindings.gtk.Window
import org.gtkkn.extensions.gio.runApplication

fun main() {
    val app = Application("org.gtkkn.samples.gtk.widgets", ApplicationFlags.FLAGS_NONE)
    app.connectActivate {
        val window = buildWindow(app)
        window.present()
    }
    app.runApplication()
}

private fun buildWindow(app: Application) = ApplicationWindow(app).apply {
    title = "gtk-kn widgets"
    setSizeRequest(800, 600)

    val stack = buildStack(this)
    stack.hexpand = true
    stack.vexpand = true

    val stackSidebar = StackSidebar()
    stackSidebar.setStack(stack)
    stackSidebar.setSizeRequest(200, -1)
    stackSidebar.vexpand = true

    val layout = Box(Orientation.HORIZONTAL, 0).apply {
        append(stackSidebar)
        append(Separator(Orientation.VERTICAL))
        append(stack)
    }

    setChild(layout)
}

private fun buildStack(window: Window) = Stack().apply {
    addTitled(label(), "label", "Label")
    addTitled(progressBar(), "progressbar", "Progress Bar")
    addTitled(spinner(), "spinner", "Spinner")
    addTitled(messageDialogs(window), "message-dialogs", "Message Dialog")
    addTitled(listViewStrings(), "listview-strings", "List View (strings)")
    addTitled(listViewObjects(), "listview-objects", "List View (objects)")
    addTitled(treeview(), "tree-view", "Tree View")
}

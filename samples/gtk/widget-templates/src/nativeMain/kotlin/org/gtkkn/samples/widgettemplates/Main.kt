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

package org.gtkkn.samples.widgettemplates

import kotlinx.cinterop.ExperimentalForeignApi
import org.gtkkn.bindings.gio.ApplicationFlags
import org.gtkkn.bindings.gtk.Application
import org.gtkkn.bindings.gtk.ApplicationWindow
import org.gtkkn.bindings.gtk.Box
import org.gtkkn.bindings.gtk.Button
import org.gtkkn.bindings.gtk.Entry
import org.gtkkn.extensions.gio.runApplication
import org.gtkkn.extensions.gtk.TemplateWidgetType

fun main() {
    val app = Application("org.gtkkn.samples.widgettemplates", ApplicationFlags.FLAGS_NONE)
    app.connectActivate {
        val window = ApplicationWindow(app)

        val exampleWidget = ExampleWidget()

        window.child = exampleWidget
        window.show()
    }
    app.runApplication()
}

@OptIn(ExperimentalForeignApi::class)
class ExampleWidget : Box(newInstancePointer()) {
    // expose the children as vals on the instance
    val entry by Type.entry
    val button by Type.button

    companion object Type : TemplateWidgetType<ExampleWidget>(
        ExampleWidget::class,
        Box.type,
        "/ui/examplewidget.ui",
    ) {
        val entry by templateChild<Entry>()
        val button by templateChild<Button>()
    }
}

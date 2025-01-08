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

package org.gtkkn.samples.gtk.externalresources

import org.gtkkn.bindings.gdk.Pixbuf
import org.gtkkn.bindings.gio.ApplicationFlags
import org.gtkkn.bindings.gio.Gio
import org.gtkkn.bindings.gio.Resource
import org.gtkkn.bindings.gtk.Application
import org.gtkkn.bindings.gtk.ApplicationWindow
import org.gtkkn.bindings.gtk.Image
import org.gtkkn.extensions.gio.runApplication

fun main() {
    // register the resource bundle
    Gio.resourcesRegister(
        Resource.load("build/gtk/gresources/main/main.gresource").getOrThrow(),
    )

    val app = Application("org.gtkkn.samples.gtk.embeddedresources", ApplicationFlags.FLAGS_NONE)

    app.onActivate {
        val window = ApplicationWindow(app)
        window.title = "Logo from External Resources"
        window.setDefaultSize(420, 420)

        window.child = Image().apply {
            setFromPixbuf(Pixbuf.newFromResource("/images/kotlin.png").getOrThrow())
        }
        window.show()
    }
    app.runApplication()
}

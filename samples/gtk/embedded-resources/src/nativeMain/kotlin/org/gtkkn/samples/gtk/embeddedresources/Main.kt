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

package org.gtkkn.samples.gtk.embeddedresources

import kotlinx.cinterop.ExperimentalForeignApi
import org.gtkkn.bindings.gdk.Display
import org.gtkkn.bindings.gio.ApplicationFlags
import org.gtkkn.bindings.gtk.Application
import org.gtkkn.bindings.gtk.ApplicationWindow
import org.gtkkn.bindings.gtk.CssProvider
import org.gtkkn.bindings.gtk.Image
import org.gtkkn.bindings.gtk.StyleContext
import org.gtkkn.extensions.gio.runApplication
import org.gtkkn.native.gtk.GTK_STYLE_PROVIDER_PRIORITY_APPLICATION

fun main() {
    val app = Application("org.gtkkn.samples.gtk.embeddedresources", ApplicationFlags.FLAGS_NONE)
    app.onActivate {
        // setup css provider
        val cssProvider = CssProvider()
        cssProvider.loadFromResource("/css/styles.css")

        // apply the css provider to the display
        val display = Display.getDefault() ?: error("No default display")
        StyleContext.addProviderForDisplay(display, cssProvider, GTK_STYLE_PROVIDER_PRIORITY_APPLICATION.toUInt())

        // set up the window
        val window = ApplicationWindow(app).apply {
            title = "Logo from Embedded Resources"
            setDefaultSize(420, 420)
            addCssClass("example-window")

            // load the image from the embedded resources
            val image = Image.newFromResource("/images/kotlin.png")
            image.addCssClass("logo-image")

            // set the image as child in the window
            child = image
        }
        window.show()
    }
    app.runApplication()
}

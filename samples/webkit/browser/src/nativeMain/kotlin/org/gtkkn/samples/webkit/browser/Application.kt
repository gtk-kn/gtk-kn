/*
 * Copyright (c) 2025 gtk-kn
 *
 * SPDX-License-Identifier: MIT
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

package org.gtkkn.samples.webkit.browser

import org.gtkkn.bindings.adw.Application
import org.gtkkn.bindings.adw.ApplicationWindow
import org.gtkkn.bindings.gio.ApplicationFlags
import org.gtkkn.extensions.gio.runApplication
import org.gtkkn.extensions.glib.util.log.Log
import org.gtkkn.extensions.glib.util.log.log
import org.gtkkn.extensions.glib.util.log.writer.installConsoleLogWriter

@Suppress("FunctionName")
fun Application(builder: ApplicationWindow.() -> Unit) {
    Log.installConsoleLogWriter()
    log("browser") { "gtk browser" }
    val app = Application("org.gtkkn.samples.webkit.browser", ApplicationFlags.DEFAULT_FLAGS)
    app.onActivate {
        val window = ApplicationWindow(app)
        window.setDefaultSize(800, 600)
        window.builder()
        window.present()
    }
    app.runApplication()
}

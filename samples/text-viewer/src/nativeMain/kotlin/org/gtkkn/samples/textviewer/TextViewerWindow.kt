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

@file:OptIn(ExperimentalForeignApi::class)

package org.gtkkn.samples.textviewer

import kotlinx.cinterop.ExperimentalForeignApi
import org.gtkkn.bindings.gio.File
import org.gtkkn.bindings.gio.SimpleAction
import org.gtkkn.bindings.gtk.ApplicationWindow
import org.gtkkn.bindings.gtk.Button
import org.gtkkn.bindings.gtk.FileChooserAction
import org.gtkkn.bindings.gtk.FileChooserNative
import org.gtkkn.bindings.gtk.TextView
import org.gtkkn.extensions.gtk.TemplateWidgetType
import org.gtkkn.native.gtk.GtkResponseType

class TextViewerWindow : ApplicationWindow(newInstancePointer()) {
    private val mainTextView by Type.main_text_view
    private val openButton by Type.open_button

    init {
        val actionOpen = SimpleAction("open", null)
        actionOpen.connectActivate {
            openFileDialog()
        }
        addAction(actionOpen)
    }

    private fun openFileDialog() {
        // Create a new file selection dialog, using the "open" mode
        // and keep a reference to it
        FileChooserNative(
            title = "Open File",
            action = FileChooserAction.OPEN,
            acceptLabel = "_Open",
            cancelLabel = "_Cancel",
        ).apply {
            transientFor = this@TextViewerWindow

            connectResponse { response ->
                // If the user selected a file...
                if (GtkResponseType.byValue(response) == GtkResponseType.GTK_RESPONSE_ACCEPT) {
                    // ...retrieve the location from the dialog and open it
                    openFile(checkNotNull(getFile()))
                }
            }
        }.show()
    }

    private fun openFile(file: File) {
        // TODO Missing Out parameter functions to read a file
    }

    companion object Type : TemplateWidgetType<TextViewerWindow>(
        TextViewerWindow::class, type, "/ui/window.ui",
    ) {
        val main_text_view by templateChild<TextView>()
        val open_button by templateChild<Button>()
    }
}

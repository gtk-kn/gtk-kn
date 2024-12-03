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

package org.gtkkn.samples.gtksource.sample

import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.adw.HeaderBar
import org.gtkkn.bindings.gtk.Box
import org.gtkkn.bindings.gtk.CheckButton
import org.gtkkn.bindings.gtk.Orientation
import org.gtkkn.bindings.gtk.ScrolledWindow
import org.gtkkn.bindings.gtksource.Buffer
import org.gtkkn.bindings.gtksource.LanguageManager
import org.gtkkn.bindings.gtksource.View
import org.gtkkn.extensions.gtk.setText

// --8<-- [start:doc]
fun main() = Application {
    // set up a HeaderBar since adw windows don't have any by default
    val headerBar = HeaderBar().apply {
        title = "gtk-kn GtkSourceView"
    }

    // setup window layout
    val layout = Box(Orientation.VERTICAL, 0)

    val sourceView = View()
    val buffer = Buffer(sourceView.getBuffer().gtkTextBufferPointer.reinterpret())

    val kotlinLanguage = LanguageManager.getDefault().getLanguage("kotlin")

    if (kotlinLanguage != null) {
        buffer.language = kotlinLanguage
    } else {
        logger.warn { "Kotlin language not found" }
    }

    buffer.setText(HELLO_WORLD_TEXT)

    sourceView.showLineNumbers = true
    sourceView.insertSpacesInsteadOfTabs = true

    val scrolledWindow = ScrolledWindow().apply {
        vexpand = true
        hexpand = true
        child = sourceView
    }

    val spacesForTabCheckButton = CheckButton.newWithLabel("Spaces for tab").apply {
        active = sourceView.insertSpacesInsteadOfTabs
        connectToggled {
            logger.debug { "spacesForTabCheckButton Toggled = $active" }
            sourceView.insertSpacesInsteadOfTabs = active
        }
    }

    val showLineNumberButton = CheckButton.newWithLabel("Show line number").apply {
        active = sourceView.showLineNumbers
        connectToggled {
            logger.debug { "showLineNumberButton Toggled = $active" }
            sourceView.showLineNumbers = active
        }
    }

    headerBar.apply {
        packStart(showLineNumberButton)
        packStart(spacesForTabCheckButton)
    }

    // and add your widget to the layout to display it
    layout.apply {
        append(headerBar)
        append(scrolledWindow)
    }
    content = layout
}
// --8<-- [end:doc]

private val HELLO_WORLD_TEXT =
    """
        private const val APP_ID = "org.gtkkn.samples.gtk.helloworld"

        fun main() {
            // Create a new application
            val app = Application(APP_ID, ApplicationFlags.FLAGS_NONE)

            // Connect to "activate" signal of `app`
            app.connectActivate {
                // Create a button with label and margins
                val button = Button()
                button.setLabel("Click me!")
                button.setMargins(12)

                // Connect to "clicked" signal of `button`
                button.connectClicked {
                    // Set the label to "Hello World!" after the button has been clicked on
                    button.setLabel("Hello World!")
                }

                // Create a window and set the title
                val window = ApplicationWindow(app)
                window.setTitle("My GTK App")
                window.setChild(button)

                // Present window
                window.present()
            }

            // Run the application
            app.runApplication()
        }
    """.trimIndent()

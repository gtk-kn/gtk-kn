/*
 * Copyright (c) 2023 gtk-kt
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

import org.gtkkn.bindings.gdk.ContentProvider
import org.gtkkn.bindings.gio.ApplicationFlags
import org.gtkkn.bindings.gio.AsyncReadyCallback
import org.gtkkn.bindings.gio.AsyncResult
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.Application
import org.gtkkn.bindings.gtk.ApplicationWindow
import org.gtkkn.bindings.gtk.Button
import org.gtkkn.bindings.gtk.Entry
import org.gtkkn.bindings.gtk.Grid
import org.gtkkn.bindings.gtk.Image
import org.gtkkn.bindings.gtk.Justification
import org.gtkkn.bindings.gtk.Label
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.gdk.setText

fun label() {
    val app = Application("org.gtkkn.samples.gtk.widgets.label", ApplicationFlags.FLAGS_NONE)
    app.connectActivate {
        val window = ApplicationWindow(app).apply {
            title = "Clipboard Example"
        }

        val grid = Grid()

        val clipboard = grid.getClipboard()
        val entry = Entry()
        val image = Image(iconName = "process-stop")

        val buttonCopyText = Button(label = "Copy Text").apply {
            connectClicked {
                clipboard.setText(entry.getText())
            }
        }
        val buttonPasteText = Button(label = "Paste Text").apply {
            connectClicked {
               clipboard.content // method `get_value`: Out parameter is not supported
            }
        }
        val buttonCopyImage = Button(label = "Copy Image")
        val buttonPasteImage = Button(label = "Paste Image")

        grid.attach(entry, 0, 0, 1, 1)
        grid.attach(image, 0, 1, 1, 1)
        grid.attach(buttonCopyText, 1, 0, 1, 1)
        grid.attach(buttonPasteText, 2, 0, 1, 1)
        grid.attach(buttonCopyImage, 1, 1, 1, 1)
        grid.attach(buttonPasteImage, 2, 1, 1, 1)

        window.setChild(grid)
        window.show()
    }
    app.run(0, emptyList())
}

private fun getNormalLabel() =
    Label(str = "This is a normal label").apply {
        vexpand = true
        hexpand = true
    }

private fun getLeftJustifiedLabel() = Label("").apply {
    setText("This is a left-justified label.\nWith multiple lines.")
    vexpand = true
    hexpand = true
    justify = Justification.LEFT
}

private fun getRightJustifiedLabel() = Label("This is a right-justified label.\nWith multiple lines.").apply {
    vexpand = true
    hexpand = true
    justify = Justification.RIGHT
}

private fun getLineWrappedLabel() = Label(
    str = "This is an example of a line-wrapped label.  It should not be taking up the entire             width " +
        "allocated to it, but automatically wraps the words to fit.\n     It supports multiple paragraphs correctly, " +
        "and  correctly   adds many          extra  spaces. ",
).apply {
    vexpand = true
    hexpand = true
    wrap = true
    maxWidthChars = 32
}

private fun getLineWrappedFilledLabel() = Label(
    str = "This is an example of a line-wrapped, filled label. It should be taking up the entire              width " +
        "allocated to it.  Here is a sentence to prove my point.  Here is another sentence. Here comes the sun, do de" +
        " do de do.\n    This is a new paragraph.\n    This is another newer, longer, better paragraph.  It is " +
        "coming to an end, unfortunately.",
).apply {
    vexpand = true
    hexpand = true
    wrap = true
    justify = Justification.FILL
    maxWidthChars = 32
}

private fun getMarkupLabel() = Label("").apply {
    setMarkup(
        "Text can be <small>small</small>, <big>big</big>, <b>bold</b>, <i>italic</i> and even point to " +
            "somewhere in the <a href=\"https://www.gtk.org\" title=\"Click to find out more\">internets</a>.",
    )
    vexpand = true
    hexpand = true
    wrap = true
    maxWidthChars = 48
}

private fun getLabelWithMnemonic(button: Widget) =
    Label.newWithMnemonic("_Press Alt + P to select button to the right").apply {
        vexpand = true
        hexpand = true
        selectable = true
        mnemonicWidget = button
    }

private fun getButton() =
    Button(label = "It does nothing").apply {
        vexpand = true
        hexpand = true
    }

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

import org.gtkkn.bindings.gtk.Box
import org.gtkkn.bindings.gtk.Button
import org.gtkkn.bindings.gtk.ButtonsType
import org.gtkkn.bindings.gtk.DialogFlags
import org.gtkkn.bindings.gtk.MessageDialog
import org.gtkkn.bindings.gtk.MessageType
import org.gtkkn.bindings.gtk.Orientation
import org.gtkkn.bindings.gtk.ResponseType
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.bindings.gtk.Window
import org.gtkkn.extensions.gtk.fromIntOrNull
import org.gtkkn.extensions.gtk.new
import org.gtkkn.extensions.gtk.setMargins

fun messageDialogs(window: Window): Widget {
    val simpleDialogButton = Button("Simple Dialog").apply {
        connectClicked { openSimpleDialog(window) }
    }

    val okCancelDialog = Button("OK Cancel Dialog").apply {
        connectClicked { openOkCancelDialog(window) }
    }

    val box = Box(Orientation.VERTICAL, 20).apply {
        setMargins(20)
        append(simpleDialogButton)
        append(okCancelDialog)
    }

    return box
}

private fun openSimpleDialog(window: Window, message: String? = "This is a dialog") {
    val dialog = MessageDialog.new(window, DialogFlags.MODAL, MessageType.INFO, ButtonsType.OK, message)

    // close the dialog on response
    dialog.connectResponse { _ -> dialog.destroy() }

    dialog.show()
}

private fun openOkCancelDialog(window: Window) {
    val dialog = MessageDialog.new(window, DialogFlags.MODAL, MessageType.QUESTION, ButtonsType.OK_CANCEL, "Continue?")

    dialog.connectResponse { responseId ->
        // convert the responseId to [ResponseType] enum exhaustive when is possible
        when (ResponseType.fromIntOrNull(responseId)) {
            ResponseType.OK -> openSimpleDialog(window, "You chose OK")
            ResponseType.CANCEL -> openSimpleDialog(window, "You chose Cancel")
            else -> Unit
        }
        // close the dialog
        dialog.destroy()
    }
    dialog.show()
}

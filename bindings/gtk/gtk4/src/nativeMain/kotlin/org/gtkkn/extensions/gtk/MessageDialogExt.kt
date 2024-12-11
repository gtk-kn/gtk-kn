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

package org.gtkkn.extensions.gtk

import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.ButtonsType
import org.gtkkn.bindings.gtk.DialogFlags
import org.gtkkn.bindings.gtk.MessageDialog
import org.gtkkn.bindings.gtk.MessageType
import org.gtkkn.bindings.gtk.ResponseType
import org.gtkkn.bindings.gtk.Window
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.gtk_message_dialog_new

public fun TypeCompanion<MessageDialog>.new(
    parent: Window? = null,
    flags: DialogFlags = DialogFlags(0u),
    type: MessageType,
    buttons: ButtonsType = ButtonsType.NONE,
    messageFormat: String? = null,
): MessageDialog {
    val nativeDialogPointer = gtk_message_dialog_new(
        parent?.gtkWindowPointer,
        flags.mask,
        type.nativeValue,
        buttons.nativeValue,
        messageFormat,
    )
    checkNotNull(nativeDialogPointer) { "Error constructing new MessageDialog" }
    return MessageDialog(nativeDialogPointer.reinterpret())
}

/**
 * Helper function for converting responses received by MessageDialog `response` signals
 * into a [ResponseType] enum value.
 *
 * Received responses are typically integers which can correspond to values in the [ResponseType] enum
 * but they can also be user defined.
 */
public fun ResponseType.Companion.fromIntOrNull(value: Int): ResponseType? =
    ResponseType.values().firstOrNull { it.nativeValue.value == value }

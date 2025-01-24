/*
 * Copyright (c) 2025 gtk-kn
 *
 * SPDX-License-Identifier: LGPL-2.1-or-later
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, see <http://www.gnu.org/licenses/>.
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

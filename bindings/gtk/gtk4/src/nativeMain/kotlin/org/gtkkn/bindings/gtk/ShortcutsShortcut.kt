// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkShortcutsShortcut
import org.gtkkn.native.gtk.gtk_shortcuts_shortcut_get_type

/**
 * A `GtkShortcutsShortcut` represents a single keyboard shortcut or gesture
 * with a short text.
 *
 * This widget is only meant to be used with `GtkShortcutsWindow`.
 *
 * ## Skipped during bindings generation
 *
 * - method `accel-size-group`: Property has no getter nor setter
 * - method `accelerator`: Property has no getter nor setter
 * - method `action-name`: Property has no getter nor setter
 * - method `direction`: Property has no getter nor setter
 * - method `icon`: Property has no getter nor setter
 * - method `icon-set`: Property has no getter nor setter
 * - method `shortcut-type`: Property has no getter nor setter
 * - method `subtitle`: Property has no getter nor setter
 * - method `subtitle-set`: Property has no getter nor setter
 * - method `title`: Property has no getter nor setter
 * - method `title-size-group`: Property has no getter nor setter
 */
public open class ShortcutsShortcut(public val gtkShortcutsShortcutPointer: CPointer<GtkShortcutsShortcut>) :
    Widget(gtkShortcutsShortcutPointer.reinterpret()),
    KGTyped {
    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    public companion object : TypeCompanion<ShortcutsShortcut> {
        override val type: GeneratedClassKGType<ShortcutsShortcut> =
            GeneratedClassKGType(getTypeOrNull("gtk_shortcuts_shortcut_get_type")!!) {
                ShortcutsShortcut(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of ShortcutsShortcut
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_shortcuts_shortcut_get_type()
    }
}

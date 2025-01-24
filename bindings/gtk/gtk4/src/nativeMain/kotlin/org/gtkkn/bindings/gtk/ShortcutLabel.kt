// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkShortcutLabel
import org.gtkkn.native.gtk.gtk_shortcut_label_get_accelerator
import org.gtkkn.native.gtk.gtk_shortcut_label_get_disabled_text
import org.gtkkn.native.gtk.gtk_shortcut_label_get_type
import org.gtkkn.native.gtk.gtk_shortcut_label_new
import org.gtkkn.native.gtk.gtk_shortcut_label_set_accelerator
import org.gtkkn.native.gtk.gtk_shortcut_label_set_disabled_text
import kotlin.String
import kotlin.Unit

/**
 * `GtkShortcutLabel` displays a single keyboard shortcut or gesture.
 *
 * The main use case for `GtkShortcutLabel` is inside a [class@Gtk.ShortcutsWindow].
 *
 * ## Skipped during bindings generation
 *
 * - method `accelerator`: Property TypeInfo of getter and setter do not match
 * - method `disabled-text`: Property TypeInfo of getter and setter do not match
 */
public open class ShortcutLabel(public val gtkShortcutLabelPointer: CPointer<GtkShortcutLabel>) :
    Widget(gtkShortcutLabelPointer.reinterpret()),
    KGTyped {
    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * Creates a new `GtkShortcutLabel` with @accelerator set.
     *
     * @param accelerator the initial accelerator
     * @return a newly-allocated `GtkShortcutLabel`
     */
    public constructor(accelerator: String) : this(gtk_shortcut_label_new(accelerator)!!.reinterpret())

    /**
     * Retrieves the current accelerator of @self.
     *
     * @return the current accelerator.
     */
    public open fun getAccelerator(): String? = gtk_shortcut_label_get_accelerator(gtkShortcutLabelPointer)?.toKString()

    /**
     * Retrieves the text that is displayed when no accelerator is set.
     *
     * @return the current text displayed when no
     * accelerator is set.
     */
    public open fun getDisabledText(): String? =
        gtk_shortcut_label_get_disabled_text(gtkShortcutLabelPointer)?.toKString()

    /**
     * Sets the accelerator to be displayed by @self.
     *
     * @param accelerator the new accelerator
     */
    public open fun setAccelerator(accelerator: String): Unit =
        gtk_shortcut_label_set_accelerator(gtkShortcutLabelPointer, accelerator)

    /**
     * Sets the text to be displayed by @self when no accelerator is set.
     *
     * @param disabledText the text to be displayed when no accelerator is set
     */
    public open fun setDisabledText(disabledText: String): Unit =
        gtk_shortcut_label_set_disabled_text(gtkShortcutLabelPointer, disabledText)

    public companion object : TypeCompanion<ShortcutLabel> {
        override val type: GeneratedClassKGType<ShortcutLabel> =
            GeneratedClassKGType(gtk_shortcut_label_get_type()) { ShortcutLabel(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of ShortcutLabel
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_shortcut_label_get_type()
    }
}

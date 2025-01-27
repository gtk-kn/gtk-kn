// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_14
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkOrientable
import org.gtkkn.native.gtk.GtkShortcutsGroup
import org.gtkkn.native.gtk.gtk_shortcuts_group_add_shortcut
import org.gtkkn.native.gtk.gtk_shortcuts_group_get_type
import kotlin.Unit

/**
 * A `GtkShortcutsGroup` represents a group of related keyboard shortcuts
 * or gestures.
 *
 * The group has a title. It may optionally be associated with a view
 * of the application, which can be used to show only relevant shortcuts
 * depending on the application context.
 *
 * This widget is only meant to be used with [class@Gtk.ShortcutsWindow].
 *
 * The recommended way to construct a `GtkShortcutsGroup` is with
 * [class@Gtk.Builder], by using the `<child>` tag to populate a
 * `GtkShortcutsGroup` with one or more [class@Gtk.ShortcutsShortcut]
 * instances.
 *
 * If you need to add a shortcut programmatically, use
 * [method@Gtk.ShortcutsGroup.add_shortcut].
 *
 * ## Skipped during bindings generation
 *
 * - method `accel-size-group`: Property has no getter nor setter
 * - method `height`: Property has no getter nor setter
 * - method `title`: Property has no getter nor setter
 * - method `title-size-group`: Property has no getter nor setter
 * - method `view`: Property has no getter nor setter
 */
public open class ShortcutsGroup(public val gtkShortcutsGroupPointer: CPointer<GtkShortcutsGroup>) :
    Box(gtkShortcutsGroupPointer.reinterpret()),
    KGTyped {
    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    override val gtkOrientablePointer: CPointer<GtkOrientable>
        get() = handle.reinterpret()

    /**
     * Adds a shortcut to the shortcuts group.
     *
     * This is the programmatic equivalent to using [class@Gtk.Builder] and a
     * `<child>` tag to add the child. Adding children with other API is not
     * appropriate as `GtkShortcutsGroup` manages its children internally.
     *
     * @param shortcut the `GtkShortcutsShortcut` to add
     * @since 4.14
     */
    @GtkVersion4_14
    public open fun addShortcut(shortcut: ShortcutsShortcut): Unit =
        gtk_shortcuts_group_add_shortcut(gtkShortcutsGroupPointer, shortcut.gtkShortcutsShortcutPointer)

    public companion object : TypeCompanion<ShortcutsGroup> {
        override val type: GeneratedClassKGType<ShortcutsGroup> =
            GeneratedClassKGType(getTypeOrNull("gtk_shortcuts_group_get_type")!!) {
                ShortcutsGroup(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of ShortcutsGroup
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_shortcuts_group_get_type()
    }
}

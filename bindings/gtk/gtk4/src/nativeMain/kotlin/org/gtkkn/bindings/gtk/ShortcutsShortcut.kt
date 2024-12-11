// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
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
public open class ShortcutsShortcut(pointer: CPointer<GtkShortcutsShortcut>) :
    Widget(pointer.reinterpret()),
    KGTyped {
    public val gtkShortcutsShortcutPointer: CPointer<GtkShortcutsShortcut>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    public companion object : TypeCompanion<ShortcutsShortcut> {
        override val type: GeneratedClassKGType<ShortcutsShortcut> =
            GeneratedClassKGType(gtk_shortcuts_shortcut_get_type()) { ShortcutsShortcut(it.reinterpret()) }

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

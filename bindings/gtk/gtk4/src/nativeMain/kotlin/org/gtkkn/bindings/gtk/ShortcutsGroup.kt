// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkOrientable
import org.gtkkn.native.gtk.GtkShortcutsGroup
import org.gtkkn.native.gtk.gtk_shortcuts_group_get_type

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
 * ## Skipped during bindings generation
 *
 * - method `accel-size-group`: Property has no getter nor setter
 * - method `height`: Property has no getter nor setter
 * - method `title`: Property has no getter nor setter
 * - method `title-size-group`: Property has no getter nor setter
 * - method `view`: Property has no getter nor setter
 */
public open class ShortcutsGroup(
    pointer: CPointer<GtkShortcutsGroup>,
) : Box(pointer.reinterpret()), KGTyped {
    public val gtkShortcutsGroupPointer: CPointer<GtkShortcutsGroup>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    override val gtkOrientablePointer: CPointer<GtkOrientable>
        get() = gPointer.reinterpret()

    public companion object : TypeCompanion<ShortcutsGroup> {
        override val type: GeneratedClassKGType<ShortcutsGroup> =
            GeneratedClassKGType(gtk_shortcuts_group_get_type()) {
                ShortcutsGroup(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }
    }
}

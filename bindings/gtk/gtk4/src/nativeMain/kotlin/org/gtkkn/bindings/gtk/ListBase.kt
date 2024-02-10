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
import org.gtkkn.native.gtk.GtkListBase
import org.gtkkn.native.gtk.GtkOrientable
import org.gtkkn.native.gtk.GtkScrollable
import org.gtkkn.native.gtk.gtk_list_base_get_type

/**
 * `GtkListBase` is the abstract base class for GTK's list widgets.
 *
 * ## Skipped during bindings generation
 *
 * - method `orientation`: Property has no getter nor setter
 */
public open class ListBase(
    pointer: CPointer<GtkListBase>,
) : Widget(pointer.reinterpret()), Orientable, Scrollable, KGTyped {
    public val gtkListBasePointer: CPointer<GtkListBase>
        get() = gPointer.reinterpret()

    override val gtkOrientablePointer: CPointer<GtkOrientable>
        get() = gPointer.reinterpret()

    override val gtkScrollablePointer: CPointer<GtkScrollable>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    public companion object : TypeCompanion<ListBase> {
        override val type: GeneratedClassKGType<ListBase> =
            GeneratedClassKGType(gtk_list_base_get_type()) { ListBase(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}

// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkFixedLayout
import org.gtkkn.native.gtk.gtk_fixed_layout_get_type
import org.gtkkn.native.gtk.gtk_fixed_layout_new

/**
 * `GtkFixedLayout` is a layout manager which can place child widgets
 * at fixed positions.
 *
 * Most applications should never use this layout manager; fixed positioning
 * and sizing requires constant recalculations on where children need to be
 * positioned and sized. Other layout managers perform this kind of work
 * internally so that application developers don't need to do it. Specifically,
 * widgets positioned in a fixed layout manager will need to take into account:
 *
 * - Themes, which may change widget sizes.
 *
 * - Fonts other than the one you used to write the app will of course
 *   change the size of widgets containing text; keep in mind that
 *   users may use a larger font because of difficulty reading the
 *   default, or they may be using a different OS that provides different
 *   fonts.
 *
 * - Translation of text into other languages changes its size. Also,
 *   display of non-English text will use a different font in many
 *   cases.
 *
 * In addition, `GtkFixedLayout` does not pay attention to text direction and
 * thus may produce unwanted results if your app is run under right-to-left
 * languages such as Hebrew or Arabic. That is: normally GTK will order
 * containers appropriately depending on the text direction, e.g. to put labels
 * to the right of the thing they label when using an RTL language;
 * `GtkFixedLayout` won't be able to do that for you.
 *
 * Finally, fixed positioning makes it kind of annoying to add/remove UI
 * elements, since you have to reposition all the other  elements. This is a
 * long-term maintenance problem for your application.
 */
public open class FixedLayout(
    pointer: CPointer<GtkFixedLayout>,
) : LayoutManager(pointer.reinterpret()), KGTyped {
    public val gtkFixedLayoutPointer: CPointer<GtkFixedLayout>
        get() = gPointer.reinterpret()

    /**
     * Creates a new `GtkFixedLayout`.
     *
     * @return the newly created `GtkFixedLayout`
     */
    public constructor() : this(gtk_fixed_layout_new()!!.reinterpret())

    public companion object : TypeCompanion<FixedLayout> {
        override val type: GeneratedClassKGType<FixedLayout> =
            GeneratedClassKGType(gtk_fixed_layout_get_type()) { FixedLayout(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}

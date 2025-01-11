// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkScrollable
import org.gtkkn.native.gtksource.GtkSourceMap
import org.gtkkn.native.gtksource.gtk_source_map_get_type
import org.gtkkn.native.gtksource.gtk_source_map_get_view
import org.gtkkn.native.gtksource.gtk_source_map_new
import org.gtkkn.native.gtksource.gtk_source_map_set_view
import kotlin.Unit

/**
 * Widget that displays a map for a specific [class@View].
 *
 * `GtkSourceMap` is a widget that maps the content of a [class@View] into
 * a smaller view so the user can have a quick overview of the whole document.
 *
 * This works by connecting a [class@View] to to the `GtkSourceMap` using
 * the [property@Map:view] property or [method@Map.set_view].
 *
 * `GtkSourceMap` is a [class@View] object. This means that you can add a
 * [class@GutterRenderer] to a gutter in the same way you would for a
 * [class@View]. One example might be a [class@GutterRenderer] that shows
 * which lines have changed in the document.
 *
 * Additionally, it is desirable to match the font of the `GtkSourceMap` and
 * the [class@View] used for editing. Therefore, [property@Map:font-desc]
 * should be used to set the target font. You will need to adjust this to the
 * desired font size for the map. A 1pt font generally seems to be an
 * appropriate font size. "Monospace 1" is the default. See
 * [method@Pango.FontDescription.set_size] for how to alter the size of an existing
 * [struct@Pango.FontDescription].
 *
 * When FontConfig is available, `GtkSourceMap` will try to use a bundled
 * "block" font to make the map more legible.
 *
 * ## Skipped during bindings generation
 *
 * - method `font-desc`: Property has no getter nor setter
 * - method `view`: Property TypeInfo of getter and setter do not match
 */
public open class Map(public val gtksourceMapPointer: CPointer<GtkSourceMap>) :
    View(gtksourceMapPointer.reinterpret()),
    KGTyped {
    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    override val gtkScrollablePointer: CPointer<GtkScrollable>
        get() = handle.reinterpret()

    /**
     * Creates a new `GtkSourceMap`.
     *
     * @return a new #GtkSourceMap.
     */
    public constructor() : this(gtk_source_map_new()!!.reinterpret())

    /**
     * Gets the [property@Map:view] property, which is the view this widget is mapping.
     *
     * @return a #GtkSourceView or null.
     */
    public open fun getView(): View? = gtk_source_map_get_view(gtksourceMapPointer)?.run {
        View(this)
    }

    /**
     * Sets the view that @map will be doing the mapping to.
     *
     * @param view a #GtkSourceView
     */
    public open fun setView(view: View): Unit = gtk_source_map_set_view(gtksourceMapPointer, view.gtksourceViewPointer)

    public companion object : TypeCompanion<Map> {
        override val type: GeneratedClassKGType<Map> =
            GeneratedClassKGType(gtk_source_map_get_type()) { Map(it.reinterpret()) }

        init {
            GtksourceTypeProvider.register()
        }

        /**
         * Get the GType of Map
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_map_get_type()
    }
}

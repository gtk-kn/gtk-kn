// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtksource.GtkSourceGutterRendererText
import org.gtkkn.native.gtksource.gtk_source_gutter_renderer_text_get_type
import org.gtkkn.native.gtksource.gtk_source_gutter_renderer_text_new
import org.gtkkn.native.gtksource.gtk_source_gutter_renderer_text_set_markup
import org.gtkkn.native.gtksource.gtk_source_gutter_renderer_text_set_text
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 * Renders text in the gutter.
 *
 * A `GtkSourceGutterRendererText` can be used to render text in a cell of
 * [class@Gutter].
 *
 * ## Skipped during bindings generation
 *
 * - parameter `width`: width: Out parameter is not supported
 * - parameter `width`: width: Out parameter is not supported
 * - method `markup`: Property has no getter nor setter
 * - method `text`: Property has no getter nor setter
 */
public open class GutterRendererText(
    pointer: CPointer<GtkSourceGutterRendererText>,
) : GutterRenderer(pointer.reinterpret()),
    KGTyped {
    public val gtksourceGutterRendererTextPointer: CPointer<GtkSourceGutterRendererText>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * Create a new #GtkSourceGutterRendererText.
     *
     * @return A #GtkSourceGutterRenderer
     */
    public constructor() : this(gtk_source_gutter_renderer_text_new()!!.reinterpret())

    /**
     *
     *
     * @param markup
     * @param length
     */
    public open fun setMarkup(
        markup: String,
        length: Int,
    ): Unit =
        gtk_source_gutter_renderer_text_set_markup(gtksourceGutterRendererTextPointer.reinterpret(), markup, length)

    /**
     *
     *
     * @param text
     * @param length
     */
    public open fun setText(
        text: String,
        length: Int,
    ): Unit = gtk_source_gutter_renderer_text_set_text(gtksourceGutterRendererTextPointer.reinterpret(), text, length)

    public companion object : TypeCompanion<GutterRendererText> {
        override val type: GeneratedClassKGType<GutterRendererText> =
            GeneratedClassKGType(
                gtk_source_gutter_renderer_text_get_type()
            ) { GutterRendererText(it.reinterpret()) }

        init {
            GtksourceTypeProvider.register()
        }
    }
}

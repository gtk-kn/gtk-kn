// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gdk.Paintable
import org.gtkkn.bindings.gdkpixbuf.Pixbuf
import org.gtkkn.bindings.gio.Icon
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtksource.GtkSourceGutterRendererPixbuf
import org.gtkkn.native.gtksource.gtk_source_gutter_renderer_pixbuf_get_gicon
import org.gtkkn.native.gtksource.gtk_source_gutter_renderer_pixbuf_get_icon_name
import org.gtkkn.native.gtksource.gtk_source_gutter_renderer_pixbuf_get_paintable
import org.gtkkn.native.gtksource.gtk_source_gutter_renderer_pixbuf_get_pixbuf
import org.gtkkn.native.gtksource.gtk_source_gutter_renderer_pixbuf_get_type
import org.gtkkn.native.gtksource.gtk_source_gutter_renderer_pixbuf_new
import org.gtkkn.native.gtksource.gtk_source_gutter_renderer_pixbuf_overlay_paintable
import org.gtkkn.native.gtksource.gtk_source_gutter_renderer_pixbuf_set_gicon
import org.gtkkn.native.gtksource.gtk_source_gutter_renderer_pixbuf_set_icon_name
import org.gtkkn.native.gtksource.gtk_source_gutter_renderer_pixbuf_set_paintable
import org.gtkkn.native.gtksource.gtk_source_gutter_renderer_pixbuf_set_pixbuf
import kotlin.String
import kotlin.Unit

/**
 * Renders a pixbuf in the gutter.
 *
 * A `GtkSourceGutterRendererPixbuf` can be used to render an image in a cell of
 * [class@Gutter].
 *
 * ## Skipped during bindings generation
 *
 * - method `gicon`: Property TypeInfo of getter and setter do not match
 * - method `icon-name`: Property TypeInfo of getter and setter do not match
 * - method `pixbuf`: Property TypeInfo of getter and setter do not match
 */
public open class GutterRendererPixbuf(
    pointer: CPointer<GtkSourceGutterRendererPixbuf>,
) : GutterRenderer(pointer.reinterpret()), KGTyped {
    public val gtksourceGutterRendererPixbufPointer: CPointer<GtkSourceGutterRendererPixbuf>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    public open var paintable: Paintable?
        /**
         * Gets a [iface@Gdk.Paintable] that was set with
         * [method@GutterRendererPixbuf.set_paintable]
         *
         * @return a #GdkPaintable or null
         */
        get() =
            gtk_source_gutter_renderer_pixbuf_get_paintable(
                gtksourceGutterRendererPixbufPointer.reinterpret()
            )?.run {
                Paintable.wrap(reinterpret())
            }

        /**
         *
         *
         * @param paintable the paintable, or null.
         */
        set(paintable) =
            gtk_source_gutter_renderer_pixbuf_set_paintable(
                gtksourceGutterRendererPixbufPointer.reinterpret(),
                paintable?.gdkPaintablePointer
            )

    /**
     * Create a new #GtkSourceGutterRendererPixbuf.
     *
     * @return A #GtkSourceGutterRenderer
     */
    public constructor() : this(gtk_source_gutter_renderer_pixbuf_new()!!.reinterpret())

    /**
     * Get the gicon of the renderer
     *
     * @return a #GIcon
     */
    public open fun getGicon(): Icon =
        gtk_source_gutter_renderer_pixbuf_get_gicon(gtksourceGutterRendererPixbufPointer.reinterpret())!!.run {
            Icon.wrap(reinterpret())
        }

    public open fun getIconName(): String =
        gtk_source_gutter_renderer_pixbuf_get_icon_name(
            gtksourceGutterRendererPixbufPointer.reinterpret()
        )?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets a [iface@Gdk.Paintable] that was set with
     * [method@GutterRendererPixbuf.set_paintable]
     *
     * @return a #GdkPaintable or null
     */
    public open fun getPaintable(): Paintable? =
        gtk_source_gutter_renderer_pixbuf_get_paintable(gtksourceGutterRendererPixbufPointer.reinterpret())?.run {
            Paintable.wrap(reinterpret())
        }

    /**
     * Get the pixbuf of the renderer.
     *
     * @return a #GdkPixbuf
     */
    public open fun getPixbuf(): Pixbuf =
        gtk_source_gutter_renderer_pixbuf_get_pixbuf(gtksourceGutterRendererPixbufPointer.reinterpret())!!.run {
            Pixbuf(reinterpret())
        }

    /**
     * Allows overlaying a paintable on top of any other image that
     * has been set for the pixbuf. This will be applied when the
     * widget is next snapshot.
     *
     * @param paintable a #GdkPaintable
     */
    public open fun overlayPaintable(paintable: Paintable): Unit =
        gtk_source_gutter_renderer_pixbuf_overlay_paintable(
            gtksourceGutterRendererPixbufPointer.reinterpret(),
            paintable.gdkPaintablePointer
        )

    /**
     *
     *
     * @param icon the icon, or null.
     */
    public open fun setGicon(icon: Icon? = null): Unit =
        gtk_source_gutter_renderer_pixbuf_set_gicon(
            gtksourceGutterRendererPixbufPointer.reinterpret(),
            icon?.gioIconPointer
        )

    /**
     *
     *
     * @param iconName the icon name, or null.
     */
    public open fun setIconName(iconName: String? = null): Unit =
        gtk_source_gutter_renderer_pixbuf_set_icon_name(
            gtksourceGutterRendererPixbufPointer.reinterpret(),
            iconName
        )

    /**
     *
     *
     * @param paintable the paintable, or null.
     */
    public open fun setPaintable(paintable: Paintable? = null): Unit =
        gtk_source_gutter_renderer_pixbuf_set_paintable(
            gtksourceGutterRendererPixbufPointer.reinterpret(),
            paintable?.gdkPaintablePointer
        )

    /**
     *
     *
     * @param pixbuf the pixbuf, or null.
     */
    public open fun setPixbuf(pixbuf: Pixbuf? = null): Unit =
        gtk_source_gutter_renderer_pixbuf_set_pixbuf(
            gtksourceGutterRendererPixbufPointer.reinterpret(),
            pixbuf?.gdkpixbufPixbufPointer?.reinterpret()
        )

    public companion object : TypeCompanion<GutterRendererPixbuf> {
        override val type: GeneratedClassKGType<GutterRendererPixbuf> =
            GeneratedClassKGType(gtk_source_gutter_renderer_pixbuf_get_type()) {
                GutterRendererPixbuf(it.reinterpret())
            }

        init {
            GtksourceTypeProvider.register()
        }
    }
}

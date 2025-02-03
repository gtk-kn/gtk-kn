// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtksource

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gdk.Paintable
import org.gtkkn.bindings.gdk.Pixbuf
import org.gtkkn.bindings.gio.Icon
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
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
    public val gtksourceGutterRendererPixbufPointer: CPointer<GtkSourceGutterRendererPixbuf>,
) : GutterRenderer(gtksourceGutterRendererPixbufPointer.reinterpret()),
    KGTyped {
    init {
        GtkSource
    }

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    public open var paintable: Paintable?
        /**
         * Gets a [iface@Gdk.Paintable] that was set with
         * [method@GutterRendererPixbuf.set_paintable]
         *
         * @return a #GdkPaintable or null
         */
        get() = gtk_source_gutter_renderer_pixbuf_get_paintable(gtksourceGutterRendererPixbufPointer)?.run {
            Paintable.PaintableImpl(reinterpret())
        }

        /**
         *
         *
         * @param paintable the paintable, or null.
         */
        set(
            paintable
        ) = gtk_source_gutter_renderer_pixbuf_set_paintable(
            gtksourceGutterRendererPixbufPointer,
            paintable?.gdkPaintablePointer
        )

    /**
     * Create a new #GtkSourceGutterRendererPixbuf.
     *
     * @return A #GtkSourceGutterRenderer
     */
    public constructor() : this(gtk_source_gutter_renderer_pixbuf_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Get the gicon of the renderer
     *
     * @return a #GIcon
     */
    public open fun getGicon(): Icon =
        gtk_source_gutter_renderer_pixbuf_get_gicon(gtksourceGutterRendererPixbufPointer)!!.run {
            Icon.IconImpl(reinterpret())
        }

    public open fun getIconName(): String =
        gtk_source_gutter_renderer_pixbuf_get_icon_name(gtksourceGutterRendererPixbufPointer)?.toKString()
            ?: error("Expected not null string")

    /**
     * Get the pixbuf of the renderer.
     *
     * @return a #GdkPixbuf
     */
    public open fun getPixbuf(): Pixbuf =
        gtk_source_gutter_renderer_pixbuf_get_pixbuf(gtksourceGutterRendererPixbufPointer)!!.run {
            InstanceCache.get(this, true) { Pixbuf(reinterpret()) }!!
        }

    /**
     * Allows overlaying a paintable on top of any other image that
     * has been set for the pixbuf. This will be applied when the
     * widget is next snapshot.
     *
     * @param paintable a #GdkPaintable
     */
    public open fun overlayPaintable(paintable: Paintable): Unit = gtk_source_gutter_renderer_pixbuf_overlay_paintable(
        gtksourceGutterRendererPixbufPointer,
        paintable.gdkPaintablePointer
    )

    /**
     *
     *
     * @param icon the icon, or null.
     */
    public open fun setGicon(icon: Icon? = null): Unit =
        gtk_source_gutter_renderer_pixbuf_set_gicon(gtksourceGutterRendererPixbufPointer, icon?.gioIconPointer)

    /**
     *
     *
     * @param iconName the icon name, or null.
     */
    public open fun setIconName(iconName: String? = null): Unit =
        gtk_source_gutter_renderer_pixbuf_set_icon_name(gtksourceGutterRendererPixbufPointer, iconName)

    /**
     *
     *
     * @param pixbuf the pixbuf, or null.
     */
    public open fun setPixbuf(pixbuf: Pixbuf? = null): Unit =
        gtk_source_gutter_renderer_pixbuf_set_pixbuf(gtksourceGutterRendererPixbufPointer, pixbuf?.gdkPixbufPointer)

    public companion object : TypeCompanion<GutterRendererPixbuf> {
        override val type: GeneratedClassKGType<GutterRendererPixbuf> =
            GeneratedClassKGType(getTypeOrNull()!!) { GutterRendererPixbuf(it.reinterpret()) }

        init {
            GtkSourceTypeProvider.register()
        }

        /**
         * Get the GType of GutterRendererPixbuf
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_gutter_renderer_pixbuf_get_type()

        /**
         * Gets the GType of from the symbol `gtk_source_gutter_renderer_pixbuf_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_source_gutter_renderer_pixbuf_get_type")
    }
}

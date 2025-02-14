// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_14
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_16
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkGraphicsOffload
import org.gtkkn.native.gtk.gtk_graphics_offload_get_black_background
import org.gtkkn.native.gtk.gtk_graphics_offload_get_child
import org.gtkkn.native.gtk.gtk_graphics_offload_get_enabled
import org.gtkkn.native.gtk.gtk_graphics_offload_get_type
import org.gtkkn.native.gtk.gtk_graphics_offload_new
import org.gtkkn.native.gtk.gtk_graphics_offload_set_black_background
import org.gtkkn.native.gtk.gtk_graphics_offload_set_child
import org.gtkkn.native.gtk.gtk_graphics_offload_set_enabled
import kotlin.Boolean

/**
 * A widget that allows to bypass gsk rendering for its child by passing the content
 * directly to the compositor.
 *
 * Graphics offload is an optimization to reduce overhead and battery use that is
 * most useful for video content. It only works on some platforms and in certain
 * situations. GTK will automatically fall back to normal rendering if it doesn't.
 *
 * Graphics offload is most efficient if there are no controls drawn on top of the
 * video content.
 *
 * You should consider using graphics offload for your main widget if it shows
 * frequently changing content (such as a video, or a VM display) and you provide
 * the content in the form of dmabuf textures (see [class@Gdk.DmabufTextureBuilder]),
 * in particular if it may be fullscreen.
 *
 * Numerous factors can prohibit graphics offload:
 *
 * - Unsupported platforms. Currently, graphics offload only works on Linux with Wayland.
 *
 * - Clipping, such as rounded corners that cause the video content to not be rectangular
 *
 * - Unsupported dmabuf formats (see [method@Gdk.Display.get_dmabuf_formats])
 *
 * - Translucent video content (content with an alpha channel, even if it isn't used)
 *
 * - Transforms that are more complex than translations and scales
 *
 * - Filters such as opacity, grayscale or similar
 *
 * To investigate problems related graphics offload, GTK offers debug flags to print
 * out information about graphics offload and dmabuf use:
 *
 *     GDK_DEBUG=offload
 *     GDK_DEBUG=dmabuf
 *
 * The GTK inspector provides a visual debugging tool for graphics offload.
 * @since 4.14
 */
@GtkVersion4_14
public open class GraphicsOffload(public val gtkGraphicsOffloadPointer: CPointer<GtkGraphicsOffload>) :
    Widget(gtkGraphicsOffloadPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * Whether to draw a black background.
     *
     * @since 4.16
     */
    @GtkVersion4_16
    public open var blackBackground: Boolean
        /**
         * Returns whether the widget draws a black background.
         *
         * See [method@Gtk.GraphicsOffload.set_black_background].
         *
         * @return `TRUE` if black background is drawn
         * @since 4.16
         */
        get() = gtk_graphics_offload_get_black_background(gtkGraphicsOffloadPointer).asBoolean()

        /**
         * Sets whether this GtkGraphicsOffload widget will draw a black
         * background.
         *
         * A main use case for this is **_letterboxing_** where black bars are
         * visible next to the content if the aspect ratio of the content does
         * not match the dimensions of the monitor.
         *
         * Using this property for letterboxing instead of CSS allows compositors
         * to show content with maximum efficiency, using direct scanout to avoid
         * extra copies in the compositor.
         *
         * On Wayland, this is implemented using the
         * [single-pixel buffer](https://wayland.app/protocols/single-pixel-buffer-v1)
         * protocol.
         *
         * @param value whether to draw a black background behind the content
         * @since 4.16
         */
        @GtkVersion4_16
        set(`value`) = gtk_graphics_offload_set_black_background(gtkGraphicsOffloadPointer, `value`.asGBoolean())

    /**
     * The child widget.
     *
     * @since 4.14
     */
    @GtkVersion4_14
    public open var child: Widget?
        /**
         * Gets the child of @self.
         *
         * @return the child widget
         * @since 4.14
         */
        get() = gtk_graphics_offload_get_child(gtkGraphicsOffloadPointer)?.run {
            InstanceCache.get(this, true) { Widget.WidgetImpl(reinterpret()) }!!
        }

        /**
         * Sets the child of @self.
         *
         * @param child the child widget
         * @since 4.14
         */
        @GtkVersion4_14
        set(child) = gtk_graphics_offload_set_child(gtkGraphicsOffloadPointer, child?.gtkWidgetPointer)

    /**
     * Whether graphics offload is enabled.
     *
     * @since 4.14
     */
    @GtkVersion4_14
    public open var enabled: GraphicsOffloadEnabled
        /**
         * Returns whether offload is enabled for @self.
         *
         * @return whether offload is enabled
         * @since 4.14
         */
        get() = gtk_graphics_offload_get_enabled(gtkGraphicsOffloadPointer).run {
            GraphicsOffloadEnabled.fromNativeValue(this)
        }

        /**
         * Sets whether this GtkGraphicsOffload widget will attempt
         * to offload the content of its child widget.
         *
         * @param enabled whether to enable offload
         * @since 4.14
         */
        @GtkVersion4_14
        set(enabled) = gtk_graphics_offload_set_enabled(gtkGraphicsOffloadPointer, enabled.nativeValue)

    /**
     * Creates a new GtkGraphicsOffload widget.
     *
     * @param child the child widget
     * @return the new widget
     * @since 4.14
     */
    public constructor(
        child: Widget? = null,
    ) : this(gtk_graphics_offload_new(child?.gtkWidgetPointer)!!.reinterpret()) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<GraphicsOffload> {
        override val type: GeneratedClassKGType<GraphicsOffload> =
            GeneratedClassKGType(getTypeOrNull()!!) { GraphicsOffload(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of GraphicsOffload
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_graphics_offload_get_type()

        /**
         * Gets the GType of from the symbol `gtk_graphics_offload_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_graphics_offload_get_type")
    }
}

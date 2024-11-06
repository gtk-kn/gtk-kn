// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_14
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkGraphicsOffload
import org.gtkkn.native.gtk.gtk_graphics_offload_get_child
import org.gtkkn.native.gtk.gtk_graphics_offload_get_enabled
import org.gtkkn.native.gtk.gtk_graphics_offload_get_type
import org.gtkkn.native.gtk.gtk_graphics_offload_new
import org.gtkkn.native.gtk.gtk_graphics_offload_set_child
import org.gtkkn.native.gtk.gtk_graphics_offload_set_enabled
import kotlin.Unit

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
public open class GraphicsOffload(
    pointer: CPointer<GtkGraphicsOffload>,
) : Widget(pointer.reinterpret()),
    KGTyped {
    public val gtkGraphicsOffloadPointer: CPointer<GtkGraphicsOffload>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

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
        get() =
            gtk_graphics_offload_get_child(gtkGraphicsOffloadPointer.reinterpret())?.run {
                Widget(reinterpret())
            }

        /**
         * Sets the child of @self.
         *
         * @param child the child widget
         * @since 4.14
         */
        @GtkVersion4_14
        set(
            child
        ) =
            gtk_graphics_offload_set_child(
                gtkGraphicsOffloadPointer.reinterpret(),
                child?.gtkWidgetPointer?.reinterpret()
            )

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
        get() =
            gtk_graphics_offload_get_enabled(gtkGraphicsOffloadPointer.reinterpret()).run {
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
        set(enabled) = gtk_graphics_offload_set_enabled(gtkGraphicsOffloadPointer.reinterpret(), enabled.nativeValue)

    /**
     * Creates a new GtkGraphicsOffload widget.
     *
     * @param child the child widget
     * @return the new widget
     * @since 4.14
     */
    public constructor(
        child: Widget? = null,
    ) : this(gtk_graphics_offload_new(child?.gtkWidgetPointer?.reinterpret())!!.reinterpret())

    /**
     * Gets the child of @self.
     *
     * @return the child widget
     * @since 4.14
     */
    @GtkVersion4_14
    public open fun getChild(): Widget? =
        gtk_graphics_offload_get_child(gtkGraphicsOffloadPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Returns whether offload is enabled for @self.
     *
     * @return whether offload is enabled
     * @since 4.14
     */
    @GtkVersion4_14
    public open fun getEnabled(): GraphicsOffloadEnabled =
        gtk_graphics_offload_get_enabled(gtkGraphicsOffloadPointer.reinterpret()).run {
            GraphicsOffloadEnabled.fromNativeValue(this)
        }

    /**
     * Sets the child of @self.
     *
     * @param child the child widget
     * @since 4.14
     */
    @GtkVersion4_14
    public open fun setChild(child: Widget? = null): Unit =
        gtk_graphics_offload_set_child(gtkGraphicsOffloadPointer.reinterpret(), child?.gtkWidgetPointer?.reinterpret())

    /**
     * Sets whether this GtkGraphicsOffload widget will attempt
     * to offload the content of its child widget.
     *
     * @param enabled whether to enable offload
     * @since 4.14
     */
    @GtkVersion4_14
    public open fun setEnabled(enabled: GraphicsOffloadEnabled): Unit =
        gtk_graphics_offload_set_enabled(gtkGraphicsOffloadPointer.reinterpret(), enabled.nativeValue)

    public companion object : TypeCompanion<GraphicsOffload> {
        override val type: GeneratedClassKGType<GraphicsOffload> =
            GeneratedClassKGType(gtk_graphics_offload_get_type()) { GraphicsOffload(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}

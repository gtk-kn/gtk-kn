// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.annotations.GdkPixbufVersion2_18
import org.gtkkn.bindings.gdk.annotations.GdkPixbufVersion2_8
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkPixbufSimpleAnim
import org.gtkkn.native.gdk.gdk_pixbuf_simple_anim_add_frame
import org.gtkkn.native.gdk.gdk_pixbuf_simple_anim_get_loop
import org.gtkkn.native.gdk.gdk_pixbuf_simple_anim_get_type
import org.gtkkn.native.gdk.gdk_pixbuf_simple_anim_new
import org.gtkkn.native.gdk.gdk_pixbuf_simple_anim_set_loop
import org.gtkkn.native.glib.gfloat
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.Unit

/**
 * An opaque struct representing a simple animation.
 */
public open class PixbufSimpleAnim(pointer: CPointer<GdkPixbufSimpleAnim>) :
    PixbufAnimation(pointer.reinterpret()),
    KGTyped {
    public val gdkPixbufSimpleAnimPointer: CPointer<GdkPixbufSimpleAnim>
        get() = gPointer.reinterpret()

    /**
     * Whether the animation should loop when it reaches the end.
     *
     * @since 2.18
     */
    @GdkPixbufVersion2_18
    public open var loop: Boolean
        /**
         * Gets whether @animation should loop indefinitely when it reaches the end.
         *
         * @return true if the animation loops forever, false otherwise
         * @since 2.18
         */
        get() = gdk_pixbuf_simple_anim_get_loop(gdkPixbufSimpleAnimPointer.reinterpret()).asBoolean()

        /**
         * Sets whether @animation should loop indefinitely when it reaches the end.
         *
         * @param loop whether to loop the animation
         * @since 2.18
         */
        @GdkPixbufVersion2_18
        set(loop) = gdk_pixbuf_simple_anim_set_loop(gdkPixbufSimpleAnimPointer.reinterpret(), loop.asGBoolean())

    /**
     * Creates a new, empty animation.
     *
     * @param width the width of the animation
     * @param height the height of the animation
     * @param rate the speed of the animation, in frames per second
     * @return a newly allocated #GdkPixbufSimpleAnim
     * @since 2.8
     */
    public constructor(
        width: gint,
        height: gint,
        rate: gfloat,
    ) : this(gdk_pixbuf_simple_anim_new(width, height, rate)!!.reinterpret())

    /**
     * Adds a new frame to @animation. The @pixbuf must
     * have the dimensions specified when the animation
     * was constructed.
     *
     * @param pixbuf the pixbuf to add
     * @since 2.8
     */
    @GdkPixbufVersion2_8
    public open fun addFrame(pixbuf: Pixbuf): Unit = gdk_pixbuf_simple_anim_add_frame(
        gdkPixbufSimpleAnimPointer.reinterpret(),
        pixbuf.gdkPixbufPointer.reinterpret()
    )

    public companion object : TypeCompanion<PixbufSimpleAnim> {
        override val type: GeneratedClassKGType<PixbufSimpleAnim> =
            GeneratedClassKGType(gdk_pixbuf_simple_anim_get_type()) { PixbufSimpleAnim(it.reinterpret()) }

        init {
            GdkpixbufTypeProvider.register()
        }

        /**
         * Get the GType of PixbufSimpleAnim
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_pixbuf_simple_anim_get_type()
    }
}

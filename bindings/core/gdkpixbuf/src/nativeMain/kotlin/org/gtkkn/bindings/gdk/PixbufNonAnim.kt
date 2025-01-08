// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkPixbufAnimation
import org.gtkkn.native.gdk.gdk_pixbuf_non_anim_get_type
import org.gtkkn.native.gdk.gdk_pixbuf_non_anim_new
import org.gtkkn.native.gobject.GType

public open class PixbufNonAnim(pointer: CPointer<GdkPixbufAnimation>) :
    PixbufAnimation(pointer.reinterpret()),
    KGTyped {
    public val gdkPixbufNonAnimPointer: CPointer<GdkPixbufAnimation>
        get() = gPointer.reinterpret()

    public constructor(pixbuf: Pixbuf) : this(gdk_pixbuf_non_anim_new(pixbuf.gdkPixbufPointer)!!.reinterpret())

    public companion object : TypeCompanion<PixbufNonAnim> {
        override val type: GeneratedClassKGType<PixbufNonAnim> =
            GeneratedClassKGType(gdk_pixbuf_non_anim_get_type()) { PixbufNonAnim(it.reinterpret()) }

        init {
            GdkpixbufTypeProvider.register()
        }

        /**
         * Get the GType of PixbufNonAnim
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_pixbuf_non_anim_get_type()
    }
}

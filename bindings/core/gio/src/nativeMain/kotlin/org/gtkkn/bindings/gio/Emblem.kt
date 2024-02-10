// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GEmblem
import org.gtkkn.native.gio.GIcon
import org.gtkkn.native.gio.g_emblem_get_icon
import org.gtkkn.native.gio.g_emblem_get_origin
import org.gtkkn.native.gio.g_emblem_get_type
import org.gtkkn.native.gio.g_emblem_new
import org.gtkkn.native.gio.g_emblem_new_with_origin

/**
 * #GEmblem is an implementation of #GIcon that supports
 * having an emblem, which is an icon with additional properties.
 * It can than be added to a #GEmblemedIcon.
 *
 * Currently, only metainformation about the emblem's origin is
 * supported. More may be added in the future.
 */
public open class Emblem(
    pointer: CPointer<GEmblem>,
) : Object(pointer.reinterpret()), Icon, KGTyped {
    public val gioEmblemPointer: CPointer<GEmblem>
        get() = gPointer.reinterpret()

    override val gioIconPointer: CPointer<GIcon>
        get() = gPointer.reinterpret()

    public open val icon: Icon
        /**
         * Gives back the icon from @emblem.
         *
         * @return a #GIcon. The returned object belongs to
         *          the emblem and should not be modified or freed.
         * @since 2.18
         */
        get() =
            g_emblem_get_icon(gioEmblemPointer.reinterpret())!!.run {
                Icon.wrap(reinterpret())
            }

    public open val origin: EmblemOrigin
        /**
         * Gets the origin of the emblem.
         *
         * @return the origin of the emblem
         * @since 2.18
         */
        get() =
            g_emblem_get_origin(gioEmblemPointer.reinterpret()).run {
                EmblemOrigin.fromNativeValue(this)
            }

    /**
     * Creates a new emblem for @icon.
     *
     * @param icon a GIcon containing the icon.
     * @return a new #GEmblem.
     * @since 2.18
     */
    public constructor(icon: Icon) : this(g_emblem_new(icon.gioIconPointer)!!.reinterpret())

    /**
     * Creates a new emblem for @icon.
     *
     * @param icon a GIcon containing the icon.
     * @param origin a GEmblemOrigin enum defining the emblem's origin
     * @return a new #GEmblem.
     * @since 2.18
     */
    public constructor(icon: Icon, origin: EmblemOrigin) :
        this(g_emblem_new_with_origin(icon.gioIconPointer, origin.nativeValue)!!.reinterpret())

    /**
     * Gives back the icon from @emblem.
     *
     * @return a #GIcon. The returned object belongs to
     *          the emblem and should not be modified or freed.
     * @since 2.18
     */
    public open fun getIcon(): Icon =
        g_emblem_get_icon(gioEmblemPointer.reinterpret())!!.run {
            Icon.wrap(reinterpret())
        }

    /**
     * Gets the origin of the emblem.
     *
     * @return the origin of the emblem
     * @since 2.18
     */
    public open fun getOrigin(): EmblemOrigin =
        g_emblem_get_origin(gioEmblemPointer.reinterpret()).run {
            EmblemOrigin.fromNativeValue(this)
        }

    public companion object : TypeCompanion<Emblem> {
        override val type: GeneratedClassKGType<Emblem> =
            GeneratedClassKGType(g_emblem_get_type()) { Emblem(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }
    }
}

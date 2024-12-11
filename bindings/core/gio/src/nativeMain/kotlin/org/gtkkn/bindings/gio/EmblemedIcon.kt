// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_18
import org.gtkkn.bindings.gio.annotations.GioVersion2_28
import org.gtkkn.bindings.glib.List
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GEmblemedIcon
import org.gtkkn.native.gio.GIcon
import org.gtkkn.native.gio.g_emblemed_icon_add_emblem
import org.gtkkn.native.gio.g_emblemed_icon_clear_emblems
import org.gtkkn.native.gio.g_emblemed_icon_get_emblems
import org.gtkkn.native.gio.g_emblemed_icon_get_icon
import org.gtkkn.native.gio.g_emblemed_icon_get_type
import org.gtkkn.native.gio.g_emblemed_icon_new
import org.gtkkn.native.gobject.GType
import kotlin.Unit

/**
 * `GEmblemedIcon` is an implementation of [iface@Gio.Icon] that supports
 * adding an emblem to an icon. Adding multiple emblems to an
 * icon is ensured via [method@Gio.EmblemedIcon.add_emblem].
 *
 * Note that `GEmblemedIcon` allows no control over the position
 * of the emblems. See also [class@Gio.Emblem] for more information.
 *
 * ## Skipped during bindings generation
 *
 * - method `gicon`: Property has no getter nor setter
 */
public open class EmblemedIcon(pointer: CPointer<GEmblemedIcon>) :
    Object(pointer.reinterpret()),
    Icon,
    KGTyped {
    public val gioEmblemedIconPointer: CPointer<GEmblemedIcon>
        get() = gPointer.reinterpret()

    override val gioIconPointer: CPointer<GIcon>
        get() = gPointer.reinterpret()

    /**
     * Creates a new emblemed icon for @icon with the emblem @emblem.
     *
     * @param icon a #GIcon
     * @param emblem a #GEmblem, or null
     * @return a new #GIcon
     * @since 2.18
     */
    public constructor(
        icon: Icon,
        emblem: Emblem? = null,
    ) : this(g_emblemed_icon_new(icon.gioIconPointer, emblem?.gioEmblemPointer?.reinterpret())!!.reinterpret())

    /**
     * Adds @emblem to the #GList of #GEmblems.
     *
     * @param emblem a #GEmblem
     * @since 2.18
     */
    @GioVersion2_18
    public open fun addEmblem(emblem: Emblem): Unit =
        g_emblemed_icon_add_emblem(gioEmblemedIconPointer.reinterpret(), emblem.gioEmblemPointer.reinterpret())

    /**
     * Removes all the emblems from @icon.
     *
     * @since 2.28
     */
    @GioVersion2_28
    public open fun clearEmblems(): Unit = g_emblemed_icon_clear_emblems(gioEmblemedIconPointer.reinterpret())

    /**
     * Gets the list of emblems for the @icon.
     *
     * @return a #GList of
     *     #GEmblems that is owned by @emblemed
     * @since 2.18
     */
    @GioVersion2_18
    public open fun getEmblems(): List = g_emblemed_icon_get_emblems(gioEmblemedIconPointer.reinterpret())!!.run {
        List(reinterpret())
    }

    /**
     * Gets the main icon for @emblemed.
     *
     * @return a #GIcon that is owned by @emblemed
     * @since 2.18
     */
    @GioVersion2_18
    public open fun getIcon(): Icon = g_emblemed_icon_get_icon(gioEmblemedIconPointer.reinterpret())!!.run {
        Icon.wrap(reinterpret())
    }

    public companion object : TypeCompanion<EmblemedIcon> {
        override val type: GeneratedClassKGType<EmblemedIcon> =
            GeneratedClassKGType(g_emblemed_icon_get_type()) { EmblemedIcon(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of EmblemedIcon
         *
         * @return the GType
         */
        public fun getType(): GType = g_emblemed_icon_get_type()
    }
}

// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_18
import org.gtkkn.bindings.gio.annotations.GioVersion2_28
import org.gtkkn.bindings.glib.List
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
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
public open class EmblemedIcon(public val gioEmblemedIconPointer: CPointer<GEmblemedIcon>) :
    Object(gioEmblemedIconPointer.reinterpret()),
    Icon,
    KGTyped {
    init {
        Gio
    }

    override val gioIconPointer: CPointer<GIcon>
        get() = handle.reinterpret()

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
    ) : this(g_emblemed_icon_new(icon.gioIconPointer, emblem?.gioEmblemPointer)!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Adds @emblem to the #GList of #GEmblems.
     *
     * @param emblem a #GEmblem
     * @since 2.18
     */
    @GioVersion2_18
    public open fun addEmblem(emblem: Emblem): Unit =
        g_emblemed_icon_add_emblem(gioEmblemedIconPointer, emblem.gioEmblemPointer)

    /**
     * Removes all the emblems from @icon.
     *
     * @since 2.28
     */
    @GioVersion2_28
    public open fun clearEmblems(): Unit = g_emblemed_icon_clear_emblems(gioEmblemedIconPointer)

    /**
     * Gets the list of emblems for the @icon.
     *
     * @return a #GList of
     *     #GEmblems that is owned by @emblemed
     * @since 2.18
     */
    @GioVersion2_18
    public open fun getEmblems(): List = g_emblemed_icon_get_emblems(gioEmblemedIconPointer)!!.run {
        List(this)
    }

    /**
     * Gets the main icon for @emblemed.
     *
     * @return a #GIcon that is owned by @emblemed
     * @since 2.18
     */
    @GioVersion2_18
    public open fun getIcon(): Icon = g_emblemed_icon_get_icon(gioEmblemedIconPointer)!!.run {
        Icon.IconImpl(reinterpret())
    }

    public companion object : TypeCompanion<EmblemedIcon> {
        override val type: GeneratedClassKGType<EmblemedIcon> =
            GeneratedClassKGType(getTypeOrNull()!!) { EmblemedIcon(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of EmblemedIcon
         *
         * @return the GType
         */
        public fun getType(): GType = g_emblemed_icon_get_type()

        /**
         * Gets the GType of from the symbol `g_emblemed_icon_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_emblemed_icon_get_type")
    }
}

// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_18
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GEmblem
import org.gtkkn.native.gio.GIcon
import org.gtkkn.native.gio.g_emblem_get_icon
import org.gtkkn.native.gio.g_emblem_get_origin
import org.gtkkn.native.gio.g_emblem_get_type
import org.gtkkn.native.gio.g_emblem_new
import org.gtkkn.native.gio.g_emblem_new_with_origin
import org.gtkkn.native.gobject.GType

/**
 * `GEmblem` is an implementation of [iface@Gio.Icon] that supports
 * having an emblem, which is an icon with additional properties.
 * It can than be added to a [class@Gio.EmblemedIcon].
 *
 * Currently, only metainformation about the emblem's origin is
 * supported. More may be added in the future.
 */
public open class Emblem(public val gioEmblemPointer: CPointer<GEmblem>) :
    Object(gioEmblemPointer.reinterpret()),
    Icon,
    KGTyped {
    init {
        Gio
    }

    override val gioIconPointer: CPointer<GIcon>
        get() = handle.reinterpret()

    /**
     * The actual icon of the emblem.
     *
     * @since 2.18
     */
    @GioVersion2_18
    public open val icon: Icon
        /**
         * Gives back the icon from @emblem.
         *
         * @return a #GIcon. The returned object belongs to
         *          the emblem and should not be modified or freed.
         * @since 2.18
         */
        get() = g_emblem_get_icon(gioEmblemPointer)!!.run {
            Icon.IconImpl(reinterpret())
        }

    /**
     * The origin the emblem is derived from.
     *
     * @since 2.18
     */
    @GioVersion2_18
    public open val origin: EmblemOrigin
        /**
         * Gets the origin of the emblem.
         *
         * @return the origin of the emblem
         * @since 2.18
         */
        get() = g_emblem_get_origin(gioEmblemPointer).run {
            EmblemOrigin.fromNativeValue(this)
        }

    /**
     * Creates a new emblem for @icon.
     *
     * @param icon a GIcon containing the icon.
     * @return a new #GEmblem.
     * @since 2.18
     */
    public constructor(icon: Icon) : this(g_emblem_new(icon.gioIconPointer)!!) {
        InstanceCache.put(this)
    }

    /**
     * Creates a new emblem for @icon.
     *
     * @param icon a GIcon containing the icon.
     * @param origin a GEmblemOrigin enum defining the emblem's origin
     * @return a new #GEmblem.
     * @since 2.18
     */
    public constructor(
        icon: Icon,
        origin: EmblemOrigin,
    ) : this(g_emblem_new_with_origin(icon.gioIconPointer, origin.nativeValue)!!) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<Emblem> {
        override val type: GeneratedClassKGType<Emblem> =
            GeneratedClassKGType(getTypeOrNull()!!) { Emblem(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of Emblem
         *
         * @return the GType
         */
        public fun getType(): GType = g_emblem_get_type()

        /**
         * Gets the GType of from the symbol `g_emblem_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? = org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_emblem_get_type")
    }
}

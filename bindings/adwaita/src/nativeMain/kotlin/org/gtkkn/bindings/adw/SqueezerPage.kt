// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.adw.AdwSqueezerPage
import org.gtkkn.native.adw.adw_squeezer_page_get_child
import org.gtkkn.native.adw.adw_squeezer_page_get_enabled
import org.gtkkn.native.adw.adw_squeezer_page_get_type
import org.gtkkn.native.adw.adw_squeezer_page_set_enabled
import org.gtkkn.native.gobject.GType
import kotlin.Boolean

/**
 * # ⚠️ Deprecated ⚠️
 *
 * This is deprecated since version 1.4.
 *
 * See [the migration guide](migrating-to-breakpoints.html#replace-adwsqueezer)
 * ---
 *
 * An auxiliary class used by [class@Squeezer].
 */
public class SqueezerPage(public val adwSqueezerPagePointer: CPointer<AdwSqueezerPage>) :
    Object(adwSqueezerPagePointer.reinterpret()),
    KGTyped {
    init {
        Adw
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.4.
     *
     * See [the migration guide](migrating-to-breakpoints.html#replace-adwsqueezer)
     * ---
     *
     * The the squeezer child to which the page belongs.
     */
    public val child: Widget
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 1.4.
         *
         * See [the migration guide](migrating-to-breakpoints.html#replace-adwsqueezer)
         * ---
         *
         * Returns the squeezer child to which @self belongs.
         *
         * @return the child to which @self belongs
         */
        get() = adw_squeezer_page_get_child(adwSqueezerPagePointer)!!.run {
            InstanceCache.get(this, true) { Widget.WidgetImpl(reinterpret()) }!!
        }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.4.
     *
     * See [the migration guide](migrating-to-breakpoints.html#replace-adwsqueezer)
     * ---
     *
     * Whether the child is enabled.
     *
     * If a child is disabled, it will be ignored when looking for the child
     * fitting the available size best.
     *
     * This allows to programmatically and prematurely hide a child even if it
     * fits in the available space.
     *
     * This can be used e.g. to ensure a certain child is hidden below a certain
     * window width, or any other constraint you find suitable.
     */
    public var enabled: Boolean
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 1.4.
         *
         * See [the migration guide](migrating-to-breakpoints.html#replace-adwsqueezer)
         * ---
         *
         * Gets whether @self is enabled.
         *
         * @return whether @self is enabled
         */
        get() = adw_squeezer_page_get_enabled(adwSqueezerPagePointer).asBoolean()

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 1.4.
         *
         * See [the migration guide](migrating-to-breakpoints.html#replace-adwsqueezer)
         * ---
         *
         * Sets whether @self is enabled.
         *
         * If a child is disabled, it will be ignored when looking for the child
         * fitting the available size best.
         *
         * This allows to programmatically and prematurely hide a child even if it fits
         * in the available space.
         *
         * This can be used e.g. to ensure a certain child is hidden below a certain
         * window width, or any other constraint you find suitable.
         *
         * @param enabled whether @self is enabled
         */
        set(enabled) = adw_squeezer_page_set_enabled(adwSqueezerPagePointer, enabled.asGBoolean())

    public companion object : TypeCompanion<SqueezerPage> {
        override val type: GeneratedClassKGType<SqueezerPage> =
            GeneratedClassKGType(getTypeOrNull()!!) { SqueezerPage(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of SqueezerPage
         *
         * @return the GType
         */
        public fun getType(): GType = adw_squeezer_page_get_type()

        /**
         * Gets the GType of from the symbol `adw_squeezer_page_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("adw_squeezer_page_get_type")
    }
}

// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.adw.AdwLeafletPage
import org.gtkkn.native.adw.adw_leaflet_page_get_child
import org.gtkkn.native.adw.adw_leaflet_page_get_name
import org.gtkkn.native.adw.adw_leaflet_page_get_navigatable
import org.gtkkn.native.adw.adw_leaflet_page_get_type
import org.gtkkn.native.adw.adw_leaflet_page_set_name
import org.gtkkn.native.adw.adw_leaflet_page_set_navigatable
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.String

/**
 * # ⚠️ Deprecated ⚠️
 *
 * This is deprecated since version 1.4.
 *
 * See [the migration guide](migrating-to-breakpoints.html#replace-adwleaflet)
 * ---
 *
 * An auxiliary class used by [class@Leaflet].
 */
public class LeafletPage(public val adwLeafletPagePointer: CPointer<AdwLeafletPage>) :
    Object(adwLeafletPagePointer.reinterpret()),
    KGTyped {
    init {
        Adw
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.4.
     *
     * See [the migration guide](migrating-to-breakpoints.html#replace-adwleaflet)
     * ---
     *
     * The leaflet child to which the page belongs.
     */
    public val child: Widget
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 1.4.
         *
         * See [the migration guide](migrating-to-breakpoints.html#replace-adwleaflet)
         * ---
         *
         * Gets the leaflet child to which @self belongs.
         *
         * @return the child to which @self belongs
         */
        get() = adw_leaflet_page_get_child(adwLeafletPagePointer)!!.run {
            InstanceCache.get(this, true) { Widget.WidgetImpl(reinterpret()) }!!
        }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.4.
     *
     * See [the migration guide](migrating-to-breakpoints.html#replace-adwleaflet)
     * ---
     *
     * The name of the child page.
     */
    public var name: String?
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 1.4.
         *
         * See [the migration guide](migrating-to-breakpoints.html#replace-adwleaflet)
         * ---
         *
         * Gets the name of @self.
         *
         * @return the name of @self.
         */
        get() = adw_leaflet_page_get_name(adwLeafletPagePointer)?.toKString()

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 1.4.
         *
         * See [the migration guide](migrating-to-breakpoints.html#replace-adwleaflet)
         * ---
         *
         * Sets the name of the @self.
         *
         * @param name the new value to set
         */
        set(name) = adw_leaflet_page_set_name(adwLeafletPagePointer, name)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.4.
     *
     * See [the migration guide](migrating-to-breakpoints.html#replace-adwleaflet)
     * ---
     *
     * Whether the child can be navigated to when folded.
     *
     * If `FALSE`, the child will be ignored by
     * [method@Leaflet.get_adjacent_child], [method@Leaflet.navigate], and swipe
     * gestures.
     *
     * This can be used used to prevent switching to widgets like separators.
     */
    public var navigatable: Boolean
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 1.4.
         *
         * See [the migration guide](migrating-to-breakpoints.html#replace-adwleaflet)
         * ---
         *
         * Gets whether the child can be navigated to when folded.
         *
         * @return whether @self can be navigated to when folded
         */
        get() = adw_leaflet_page_get_navigatable(adwLeafletPagePointer).asBoolean()

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 1.4.
         *
         * See [the migration guide](migrating-to-breakpoints.html#replace-adwleaflet)
         * ---
         *
         * Sets whether @self can be navigated to when folded.
         *
         * If `FALSE`, the child will be ignored by [method@Leaflet.get_adjacent_child],
         * [method@Leaflet.navigate], and swipe gestures.
         *
         * This can be used used to prevent switching to widgets like separators.
         *
         * @param navigatable whether @self can be navigated to when folded
         */
        set(navigatable) = adw_leaflet_page_set_navigatable(adwLeafletPagePointer, navigatable.asGBoolean())

    public companion object : TypeCompanion<LeafletPage> {
        override val type: GeneratedClassKGType<LeafletPage> =
            GeneratedClassKGType(getTypeOrNull()!!) { LeafletPage(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of LeafletPage
         *
         * @return the GType
         */
        public fun getType(): GType = adw_leaflet_page_get_type()

        /**
         * Gets the GType of from the symbol `adw_leaflet_page_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("adw_leaflet_page_get_type")
    }
}

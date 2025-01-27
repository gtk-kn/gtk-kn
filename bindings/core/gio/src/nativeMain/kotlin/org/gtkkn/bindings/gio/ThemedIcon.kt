// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_18
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.toCStringList
import org.gtkkn.extensions.glib.ext.toKStringList
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GIcon
import org.gtkkn.native.gio.GThemedIcon
import org.gtkkn.native.gio.g_themed_icon_append_name
import org.gtkkn.native.gio.g_themed_icon_get_names
import org.gtkkn.native.gio.g_themed_icon_get_type
import org.gtkkn.native.gio.g_themed_icon_new
import org.gtkkn.native.gio.g_themed_icon_new_from_names
import org.gtkkn.native.gio.g_themed_icon_new_with_default_fallbacks
import org.gtkkn.native.gio.g_themed_icon_prepend_name
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * `GThemedIcon` is an implementation of [iface@Gio.Icon] that supports icon
 * themes.
 *
 * `GThemedIcon` contains a list of all of the icons present in an icon
 * theme, so that icons can be looked up quickly. `GThemedIcon` does
 * not provide actual pixmaps for icons, just the icon names.
 * Ideally something like [method@Gtk.IconTheme.choose_icon] should be used to
 * resolve the list of names so that fallback icons work nicely with
 * themes that inherit other themes.
 *
 * ## Skipped during bindings generation
 *
 * - method `name`: Property has no getter nor setter
 * - method `use-default-fallbacks`: Property has no getter nor setter
 */
public open class ThemedIcon(public val gioThemedIconPointer: CPointer<GThemedIcon>) :
    Object(gioThemedIconPointer.reinterpret()),
    Icon,
    KGTyped {
    override val gioIconPointer: CPointer<GIcon>
        get() = handle.reinterpret()

    /**
     * A null-terminated array of icon names.
     */
    public open val names: List<String>
        /**
         * Gets the names of icons from within @icon.
         *
         * @return a list of icon names.
         */
        get() = g_themed_icon_get_names(gioThemedIconPointer)?.toKStringList()
            ?: error("Expected not null string array")

    /**
     * Creates a new themed icon for @iconname.
     *
     * @param iconname a string containing an icon name.
     * @return a new #GThemedIcon.
     */
    public constructor(iconname: String) : this(g_themed_icon_new(iconname)!!.reinterpret())

    /**
     * Creates a new themed icon for @iconnames.
     *
     * @param iconnames an array of strings containing icon names.
     * @param len the length of the @iconnames array, or -1 if @iconnames is
     *     null-terminated
     * @return a new #GThemedIcon
     */
    public constructor(iconnames: List<String>, len: gint) : this(
        memScoped {
            g_themed_icon_new_from_names(iconnames.toCStringList(this), len)!!.reinterpret()
        }
    )

    /**
     * Append a name to the list of icons from within @icon.
     *
     * Note that doing so invalidates the hash computed by prior calls
     * to g_icon_hash().
     *
     * @param iconname name of icon to append to list of icons from within @icon.
     */
    public open fun appendName(iconname: String): Unit = g_themed_icon_append_name(gioThemedIconPointer, iconname)

    /**
     * Prepend a name to the list of icons from within @icon.
     *
     * Note that doing so invalidates the hash computed by prior calls
     * to g_icon_hash().
     *
     * @param iconname name of icon to prepend to list of icons from within @icon.
     * @since 2.18
     */
    @GioVersion2_18
    public open fun prependName(iconname: String): Unit = g_themed_icon_prepend_name(gioThemedIconPointer, iconname)

    public companion object : TypeCompanion<ThemedIcon> {
        override val type: GeneratedClassKGType<ThemedIcon> =
            GeneratedClassKGType(getTypeOrNull("g_themed_icon_get_type")!!) { ThemedIcon(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Creates a new themed icon for @iconname.
         *
         * @param iconname a string containing an icon name.
         * @return a new #GThemedIcon.
         */
        public fun new(iconname: String): ThemedIcon = ThemedIcon(g_themed_icon_new(iconname)!!.reinterpret())

        /**
         * Creates a new themed icon for @iconname, and all the names
         * that can be created by shortening @iconname at '-' characters.
         *
         * In the following example, @icon1 and @icon2 are equivalent:
         * |[<!-- language="C" -->
         * const char *names[] = {
         *   "gnome-dev-cdrom-audio",
         *   "gnome-dev-cdrom",
         *   "gnome-dev",
         *   "gnome"
         * };
         *
         * icon1 = g_themed_icon_new_from_names (names, 4);
         * icon2 = g_themed_icon_new_with_default_fallbacks ("gnome-dev-cdrom-audio");
         * ]|
         *
         * @param iconname a string containing an icon name
         * @return a new #GThemedIcon.
         */
        public fun newWithDefaultFallbacks(iconname: String): ThemedIcon =
            ThemedIcon(g_themed_icon_new_with_default_fallbacks(iconname)!!.reinterpret())

        /**
         * Get the GType of ThemedIcon
         *
         * @return the GType
         */
        public fun getType(): GType = g_themed_icon_get_type()
    }
}

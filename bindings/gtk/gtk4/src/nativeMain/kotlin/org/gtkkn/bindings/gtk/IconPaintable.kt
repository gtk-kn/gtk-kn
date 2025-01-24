// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gdk.Paintable
import org.gtkkn.bindings.gio.File
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkPaintable
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkIconPaintable
import org.gtkkn.native.gtk.GtkSymbolicPaintable
import org.gtkkn.native.gtk.gtk_icon_paintable_get_file
import org.gtkkn.native.gtk.gtk_icon_paintable_get_icon_name
import org.gtkkn.native.gtk.gtk_icon_paintable_get_type
import org.gtkkn.native.gtk.gtk_icon_paintable_is_symbolic
import org.gtkkn.native.gtk.gtk_icon_paintable_new_for_file
import kotlin.Boolean
import kotlin.String

/**
 * Contains information found when looking up an icon in `GtkIconTheme`.
 *
 * `GtkIconPaintable` implements `GdkPaintable`.
 *
 * ## Skipped during bindings generation
 *
 * - method `is-symbolic`: Property has no getter nor setter
 */
public open class IconPaintable(public val gtkIconPaintablePointer: CPointer<GtkIconPaintable>) :
    Object(gtkIconPaintablePointer.reinterpret()),
    Paintable,
    SymbolicPaintable,
    KGTyped {
    override val gdkPaintablePointer: CPointer<GdkPaintable>
        get() = handle.reinterpret()

    override val gtkSymbolicPaintablePointer: CPointer<GtkSymbolicPaintable>
        get() = handle.reinterpret()

    /**
     * The file representing the icon, if any.
     */
    public open val `file`: File?
        /**
         * Gets the `GFile` that was used to load the icon.
         *
         * Returns null if the icon was not loaded from a file.
         *
         * @return the `GFile` for the icon
         */
        get() = gtk_icon_paintable_get_file(gtkIconPaintablePointer)?.run {
            File.FileImpl(reinterpret())
        }

    /**
     * The icon name that was chosen during lookup.
     */
    public open val iconName: String?
        /**
         * Get the icon name being used for this icon.
         *
         * When an icon looked up in the icon theme was not available, the
         * icon theme may use fallback icons - either those specified to
         * gtk_icon_theme_lookup_icon() or the always-available
         * "image-missing". The icon chosen is returned by this function.
         *
         * If the icon was created without an icon theme, this function
         * returns null.
         *
         * @return the themed icon-name for the
         *   icon, or null if its not a themed icon.
         */
        get() = gtk_icon_paintable_get_icon_name(gtkIconPaintablePointer)?.toKString()

    /**
     * Creates a `GtkIconPaintable` for a file with a given size and scale.
     *
     * The icon can then be rendered by using it as a `GdkPaintable`.
     *
     * @param file a `GFile`
     * @param size desired icon size
     * @param scale the desired scale
     * @return a `GtkIconPaintable` containing
     *   for the icon. Unref with g_object_unref()
     */
    public constructor(
        `file`: File,
        size: gint,
        scale: gint,
    ) : this(gtk_icon_paintable_new_for_file(`file`.gioFilePointer, size, scale)!!.reinterpret())

    /**
     * Checks if the icon is symbolic or not.
     *
     * This currently uses only the file name and not the file contents
     * for determining this. This behaviour may change in the future.
     *
     * Note that to render a symbolic `GtkIconPaintable` properly (with
     * recoloring), you have to set its icon name on a `GtkImage`.
     *
     * @return true if the icon is symbolic, false otherwise
     */
    public open fun isSymbolic(): Boolean = gtk_icon_paintable_is_symbolic(gtkIconPaintablePointer).asBoolean()

    public companion object : TypeCompanion<IconPaintable> {
        override val type: GeneratedClassKGType<IconPaintable> =
            GeneratedClassKGType(gtk_icon_paintable_get_type()) { IconPaintable(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of IconPaintable
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_icon_paintable_get_type()
    }
}

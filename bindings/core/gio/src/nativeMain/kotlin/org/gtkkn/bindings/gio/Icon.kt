// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.gio.annotations.GioVersion2_20
import org.gtkkn.bindings.gio.annotations.GioVersion2_38
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.legacy.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gio.GIcon
import org.gtkkn.native.gio.g_icon_deserialize
import org.gtkkn.native.gio.g_icon_equal
import org.gtkkn.native.gio.g_icon_get_type
import org.gtkkn.native.gio.g_icon_hash
import org.gtkkn.native.gio.g_icon_new_for_string
import org.gtkkn.native.gio.g_icon_serialize
import org.gtkkn.native.gio.g_icon_to_string
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.Result
import kotlin.String

/**
 * `GIcon` is a very minimal interface for icons. It provides functions
 * for checking the equality of two icons, hashing of icons and
 * serializing an icon to and from strings.
 *
 * `GIcon` does not provide the actual pixmap for the icon as this is out
 * of GIO's scope, however implementations of `GIcon` may contain the name
 * of an icon (see [class@Gio.ThemedIcon]), or the path to an icon
 * (see [iface@Gio.LoadableIcon]).
 *
 * To obtain a hash of a `GIcon`, see [method@Gio.Icon.hash].
 *
 * To check if two `GIcon`s are equal, see [method@Gio.Icon.equal].
 *
 * For serializing a `GIcon`, use [method@Gio.Icon.serialize] and
 * [func@Gio.Icon.deserialize].
 *
 * If you want to consume `GIcon` (for example, in a toolkit) you must
 * be prepared to handle at least the three following cases:
 * [iface@Gio.LoadableIcon], [class@Gio.ThemedIcon] and [class@Gio.EmblemedIcon].
 * It may also make sense to have fast-paths for other cases (like handling
 * [`GdkPixbuf`](https://docs.gtk.org/gdk-pixbuf/class.Pixbuf.html) directly,
 * for example) but all compliant `GIcon` implementations outside of GIO must
 * implement [iface@Gio.LoadableIcon].
 *
 * If your application or library provides one or more `GIcon`
 * implementations you need to ensure that your new implementation also
 * implements [iface@Gio.LoadableIcon].  Additionally, you must provide an
 * implementation of [method@Gio.Icon.serialize] that gives a result that is
 * understood by [func@Gio.Icon.deserialize], yielding one of the built-in
 * icon types.
 */
public interface Icon :
    Proxy,
    KGTyped {
    public val gioIconPointer: CPointer<GIcon>

    /**
     * Checks if two icons are equal.
     *
     * @param icon2 pointer to the second #GIcon.
     * @return true if @icon1 is equal to @icon2. false otherwise.
     */
    public fun equal(icon2: Icon? = null): Boolean = g_icon_equal(gioIconPointer, icon2?.gioIconPointer).asBoolean()

    /**
     * Gets a hash for an icon.
     *
     * @return a #guint containing a hash for the @icon, suitable for
     *   use in a #GHashTable or similar data structure.
     */
    public fun hash(): guint = g_icon_hash(gioIconPointer)

    /**
     * Serializes a #GIcon into a #GVariant. An equivalent #GIcon can be retrieved
     * back by calling g_icon_deserialize() on the returned value.
     * As serialization will avoid using raw icon data when possible, it only
     * makes sense to transfer the #GVariant between processes on the same machine,
     * (as opposed to over the network), and within the same file system namespace.
     *
     * @return a #GVariant, or null when serialization fails. The #GVariant will not be floating.
     * @since 2.38
     */
    @GioVersion2_38
    public fun serialize(): Variant? = g_icon_serialize(gioIconPointer)?.run {
        Variant(this)
    }

    /**
     * Generates a textual representation of @icon that can be used for
     * serialization such as when passing @icon to a different process or
     * saving it to persistent storage. Use g_icon_new_for_string() to
     * get @icon back from the returned string.
     *
     * The encoding of the returned string is proprietary to #GIcon except
     * in the following two cases
     *
     * - If @icon is a #GFileIcon, the returned string is a native path
     *   (such as `/path/to/my icon.png`) without escaping
     *   if the #GFile for @icon is a native file.  If the file is not
     *   native, the returned string is the result of g_file_get_uri()
     *   (such as `sftp://path/to/my%20icon.png`).
     *
     * - If @icon is a #GThemedIcon with exactly one name and no fallbacks,
     *   the encoding is simply the name (such as `network-server`).
     *
     * @return An allocated NUL-terminated UTF8 string or
     * null if @icon can't be serialized. Use g_free() to free.
     * @since 2.20
     */
    @GioVersion2_20
    public fun toStringIcon(): String? = g_icon_to_string(gioIconPointer)?.toKString()

    /**
     * The IconImpl type represents a native instance of the Icon interface.
     *
     * @constructor Creates a new instance of Icon for the provided [CPointer].
     */
    public class IconImpl(gioIconPointer: CPointer<GIcon>) :
        Object(gioIconPointer.reinterpret()),
        Icon {
        init {
            Gio
        }

        override val gioIconPointer: CPointer<GIcon> = gioIconPointer
    }

    public companion object : TypeCompanion<Icon> {
        override val type: GeneratedInterfaceKGType<Icon> =
            GeneratedInterfaceKGType(getTypeOrNull()!!) { IconImpl(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Deserializes a #GIcon previously serialized using g_icon_serialize().
         *
         * @param value a #GVariant created with g_icon_serialize()
         * @return a #GIcon, or null when deserialization fails.
         * @since 2.38
         */
        @GioVersion2_38
        public fun deserialize(`value`: Variant): Icon? = g_icon_deserialize(`value`.glibVariantPointer)?.run {
            IconImpl(reinterpret())
        }

        /**
         * Generate a #GIcon instance from @str. This function can fail if
         * @str is not valid - see g_icon_to_string() for discussion.
         *
         * If your application or library provides one or more #GIcon
         * implementations you need to ensure that each #GType is registered
         * with the type system prior to calling g_icon_new_for_string().
         *
         * @param str A string obtained via g_icon_to_string().
         * @return An object implementing the #GIcon
         *          interface or null if @error is set.
         * @since 2.20
         */
        @GioVersion2_20
        public fun newForString(str: String): Result<Icon> = memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_icon_new_for_string(str, gError.ptr)?.run {
                IconImpl(reinterpret())
            }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

        /**
         * Get the GType of Icon
         *
         * @return the GType
         */
        public fun getType(): GType = g_icon_get_type()

        /**
         * Gets the GType of from the symbol `g_icon_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? = org.gtkkn.extensions.glib.cinterop.getTypeOrNull("g_icon_get_type")
    }
}

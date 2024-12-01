// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.gio.annotations.GioVersion2_20
import org.gtkkn.bindings.gio.annotations.GioVersion2_38
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GIcon
import org.gtkkn.native.gio.g_icon_deserialize
import org.gtkkn.native.gio.g_icon_equal
import org.gtkkn.native.gio.g_icon_get_type
import org.gtkkn.native.gio.g_icon_hash
import org.gtkkn.native.gio.g_icon_new_for_string
import org.gtkkn.native.gio.g_icon_serialize
import org.gtkkn.native.glib.GError
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.UInt

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
 *
 * ## Skipped during bindings generation
 *
 * - method `to_string`: C function g_icon_to_string is ignored
 */
public interface Icon :
    Interface,
    KGTyped {
    public val gioIconPointer: CPointer<GIcon>

    /**
     * Checks if two icons are equal.
     *
     * @param icon2 pointer to the second #GIcon.
     * @return true if @icon1 is equal to @icon2. false otherwise.
     */
    public fun equal(icon2: Icon? = null): Boolean =
        g_icon_equal(gioIconPointer.reinterpret(), icon2?.gioIconPointer).asBoolean()

    /**
     * Gets a hash for an icon.
     *
     * @return a #guint containing a hash for the @icon, suitable for
     *   use in a #GHashTable or similar data structure.
     */
    public fun hash(): UInt = g_icon_hash(gioIconPointer.reinterpret())

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
    public fun serialize(): Variant? =
        g_icon_serialize(gioIconPointer.reinterpret())?.run {
            Variant(reinterpret())
        }

    private data class Wrapper(
        private val pointer: CPointer<GIcon>,
    ) : Icon {
        override val gioIconPointer: CPointer<GIcon> = pointer
    }

    public companion object : TypeCompanion<Icon> {
        override val type: GeneratedInterfaceKGType<Icon> =
            GeneratedInterfaceKGType(g_icon_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GIcon>): Icon = Wrapper(pointer)

        /**
         * Deserializes a #GIcon previously serialized using g_icon_serialize().
         *
         * @param value a #GVariant created with g_icon_serialize()
         * @return a #GIcon, or null when deserialization fails.
         * @since 2.38
         */
        @GioVersion2_38
        public fun deserialize(`value`: Variant): Icon? =
            g_icon_deserialize(`value`.glibVariantPointer.reinterpret())?.run {
                Icon.wrap(reinterpret())
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
        public fun newForString(str: String): Result<Icon> =
            memScoped {
                val gError = allocPointerTo<GError>()
                val gResult =
                    g_icon_new_for_string(str, gError.ptr)?.run {
                        Icon.wrap(reinterpret())
                    }

                return if (gError.pointed != null) {
                    Result.failure(resolveException(Error(gError.pointed!!.ptr)))
                } else {
                    Result.success(checkNotNull(gResult))
                }
            }
    }
}

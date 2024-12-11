// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.annotations.GLibVersion2_24
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GVariantType
import org.gtkkn.native.glib.g_variant_type_checked_
import org.gtkkn.native.glib.g_variant_type_copy
import org.gtkkn.native.glib.g_variant_type_dup_string
import org.gtkkn.native.glib.g_variant_type_element
import org.gtkkn.native.glib.g_variant_type_first
import org.gtkkn.native.glib.g_variant_type_free
import org.gtkkn.native.glib.g_variant_type_get_string_length
import org.gtkkn.native.glib.g_variant_type_hash
import org.gtkkn.native.glib.g_variant_type_is_array
import org.gtkkn.native.glib.g_variant_type_is_basic
import org.gtkkn.native.glib.g_variant_type_is_container
import org.gtkkn.native.glib.g_variant_type_is_definite
import org.gtkkn.native.glib.g_variant_type_is_dict_entry
import org.gtkkn.native.glib.g_variant_type_is_maybe
import org.gtkkn.native.glib.g_variant_type_is_subtype_of
import org.gtkkn.native.glib.g_variant_type_is_tuple
import org.gtkkn.native.glib.g_variant_type_is_variant
import org.gtkkn.native.glib.g_variant_type_key
import org.gtkkn.native.glib.g_variant_type_n_items
import org.gtkkn.native.glib.g_variant_type_new
import org.gtkkn.native.glib.g_variant_type_new_array
import org.gtkkn.native.glib.g_variant_type_new_dict_entry
import org.gtkkn.native.glib.g_variant_type_new_maybe
import org.gtkkn.native.glib.g_variant_type_next
import org.gtkkn.native.glib.g_variant_type_peek_string
import org.gtkkn.native.glib.g_variant_type_string_get_depth_
import org.gtkkn.native.glib.g_variant_type_string_is_valid
import org.gtkkn.native.glib.g_variant_type_value
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_variant_type_get_gtype
import org.gtkkn.native.gobject.gsize
import org.gtkkn.native.gobject.guint
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * A type in the [type@GLib.Variant] type system.
 *
 * This section introduces the [type@GLib.Variant] type system. It is based, in
 * large part, on the D-Bus type system, with two major changes and
 * some minor lifting of restrictions. The
 * [D-Bus specification](http://dbus.freedesktop.org/doc/dbus-specification.html),
 * therefore, provides a significant amount of
 * information that is useful when working with [type@GLib.Variant].
 *
 * The first major change with respect to the D-Bus type system is the
 * introduction of maybe (or ‘nullable’) types.  Any type in [type@GLib.Variant]
 * can be converted to a maybe type, in which case, `nothing` (or `null`)
 * becomes a valid value.  Maybe types have been added by introducing the
 * character `m` to type strings.
 *
 * The second major change is that the [type@GLib.Variant] type system supports
 * the concept of ‘indefinite types’ — types that are less specific than
 * the normal types found in D-Bus.  For example, it is possible to speak
 * of ‘an array of any type’ in [type@GLib.Variant], where the D-Bus type system
 * would require you to speak of ‘an array of integers’ or ‘an array of
 * strings’.  Indefinite types have been added by introducing the
 * characters `*`, `?` and `r` to type strings.
 *
 * Finally, all arbitrary restrictions relating to the complexity of
 * types are lifted along with the restriction that dictionary entries
 * may only appear nested inside of arrays.
 *
 * Just as in D-Bus, [type@GLib.Variant] types are described with strings (‘type
 * strings’).  Subject to the differences mentioned above, these strings
 * are of the same form as those found in D-Bus.  Note, however: D-Bus
 * always works in terms of messages and therefore individual type
 * strings appear nowhere in its interface.  Instead, ‘signatures’
 * are a concatenation of the strings of the type of each argument in a
 * message.  [type@GLib.Variant] deals with single values directly so
 * [type@GLib.Variant] type strings always describe the type of exactly one
 * value.  This means that a D-Bus signature string is generally not a valid
 * [type@GLib.Variant] type string — except in the case that it is the signature
 * of a message containing exactly one argument.
 *
 * An indefinite type is similar in spirit to what may be called an
 * abstract type in other type systems.  No value can exist that has an
 * indefinite type as its type, but values can exist that have types
 * that are subtypes of indefinite types.  That is to say,
 * [method@GLib.Variant.get_type] will never return an indefinite type, but
 * calling [method@GLib.Variant.is_of_type] with an indefinite type may return
 * true.  For example, you cannot have a value that represents ‘an
 * array of no particular type’, but you can have an ‘array of integers’
 * which certainly matches the type of ‘an array of no particular type’,
 * since ‘array of integers’ is a subtype of ‘array of no particular
 * type’.
 *
 * This is similar to how instances of abstract classes may not
 * directly exist in other type systems, but instances of their
 * non-abstract subtypes may.  For example, in GTK, no object that has
 * the type of [`GtkWidget`](https://docs.gtk.org/gtk4/class.Widget.html) can
 * exist (since `GtkWidget` is an abstract class), but a [`GtkWindow`](https://docs.gtk.org/gtk4/class.Window.html)
 * can certainly be instantiated, and you would say that a `GtkWindow` is a
 * `GtkWidget` (since `GtkWindow` is a subclass of `GtkWidget`).
 *
 * Two types may not be compared by value; use [method@GLib.VariantType.equal]
 * or [method@GLib.VariantType.is_subtype_of]  May be copied using
 * [method@GLib.VariantType.copy] and freed using [method@GLib.VariantType.free].
 *
 * ## GVariant Type Strings
 *
 * A [type@GLib.Variant] type string can be any of the following:
 *
 * - any basic type string (listed below)
 * - `v`, `r` or `*`
 * - one of the characters `a` or `m`, followed by another type string
 * - the character `(`, followed by a concatenation of zero or more other
 *   type strings, followed by the character `)`
 * - the character `{`, followed by a basic type string (see below),
 *   followed by another type string, followed by the character `}`
 *
 * A basic type string describes a basic type (as per
 * [method@GLib.VariantType.is_basic]) and is always a single character in
 * length. The valid basic type strings are `b`, `y`, `n`, `q`, `i`, `u`, `x`,
 * `t`, `h`, `d`, `s`, `o`, `g` and `?`.
 *
 * The above definition is recursive to arbitrary depth. `aaaaai` and
 * `(ui(nq((y)))s)` are both valid type strings, as is
 * `a(aa(ui)(qna{ya(yd)}))`. In order to not hit memory limits,
 * [type@GLib.Variant] imposes a limit on recursion depth of 65 nested
 * containers. This is the limit in the D-Bus specification (64) plus one to
 * allow a [`GDBusMessage`](../gio/class.DBusMessage.html) to be nested in
 * a top-level tuple.
 *
 * The meaning of each of the characters is as follows:
 *
 * - `b`: the type string of `G_VARIANT_TYPE_BOOLEAN`; a boolean value.
 * - `y`: the type string of `G_VARIANT_TYPE_BYTE`; a byte.
 * - `n`: the type string of `G_VARIANT_TYPE_INT16`; a signed 16 bit integer.
 * - `q`: the type string of `G_VARIANT_TYPE_UINT16`; an unsigned 16 bit integer.
 * - `i`: the type string of `G_VARIANT_TYPE_INT32`; a signed 32 bit integer.
 * - `u`: the type string of `G_VARIANT_TYPE_UINT32`; an unsigned 32 bit integer.
 * - `x`: the type string of `G_VARIANT_TYPE_INT64`; a signed 64 bit integer.
 * - `t`: the type string of `G_VARIANT_TYPE_UINT64`; an unsigned 64 bit integer.
 * - `h`: the type string of `G_VARIANT_TYPE_HANDLE`; a signed 32 bit value
 *   that, by convention, is used as an index into an array of file
 *   descriptors that are sent alongside a D-Bus message.
 * - `d`: the type string of `G_VARIANT_TYPE_DOUBLE`; a double precision
 *   floating point value.
 * - `s`: the type string of `G_VARIANT_TYPE_STRING`; a string.
 * - `o`: the type string of `G_VARIANT_TYPE_OBJECT_PATH`; a string in the form
 *   of a D-Bus object path.
 * - `g`: the type string of `G_VARIANT_TYPE_SIGNATURE`; a string in the form of
 *   a D-Bus type signature.
 * - `?`: the type string of `G_VARIANT_TYPE_BASIC`; an indefinite type that
 *   is a supertype of any of the basic types.
 * - `v`: the type string of `G_VARIANT_TYPE_VARIANT`; a container type that
 *   contain any other type of value.
 * - `a`: used as a prefix on another type string to mean an array of that
 *   type; the type string `ai`, for example, is the type of an array of
 *   signed 32-bit integers.
 * - `m`: used as a prefix on another type string to mean a ‘maybe’, or
 *   ‘nullable’, version of that type; the type string `ms`, for example,
 *   is the type of a value that maybe contains a string, or maybe contains
 *   nothing.
 * - `()`: used to enclose zero or more other concatenated type strings to
 *   create a tuple type; the type string `(is)`, for example, is the type of
 *   a pair of an integer and a string.
 * - `r`: the type string of `G_VARIANT_TYPE_TUPLE`; an indefinite type that is
 *   a supertype of any tuple type, regardless of the number of items.
 * - `{}`: used to enclose a basic type string concatenated with another type
 *   string to create a dictionary entry type, which usually appears inside of
 *   an array to form a dictionary; the type string `a{sd}`, for example, is
 *   the type of a dictionary that maps strings to double precision floating
 *   point values.
 *
 *   The first type (the basic type) is the key type and the second type is
 *   the value type. The reason that the first type is restricted to being a
 *   basic type is so that it can easily be hashed.
 * - `*`: the type string of `G_VARIANT_TYPE_ANY`; the indefinite type that is
 *   a supertype of all types.  Note that, as with all type strings, this
 *   character represents exactly one type. It cannot be used inside of tuples
 *   to mean ‘any number of items’.
 *
 * Any type string of a container that contains an indefinite type is,
 * itself, an indefinite type. For example, the type string `a*`
 * (corresponding to `G_VARIANT_TYPE_ARRAY`) is an indefinite type
 * that is a supertype of every array type. `(*s)` is a supertype
 * of all tuples that contain exactly two items where the second
 * item is a string.
 *
 * `a{?*}` is an indefinite type that is a supertype of all arrays
 * containing dictionary entries where the key is any basic type and
 * the value is any type at all.  This is, by definition, a dictionary,
 * so this type string corresponds to `G_VARIANT_TYPE_DICTIONARY`. Note
 * that, due to the restriction that the key of a dictionary entry must
 * be a basic type, `{**}` is not a valid type string.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `type2`: VariantType
 * - parameter `items`: Array parameter of type VariantType is not supported
 * - parameter `endptr`: endptr: Out parameter is not supported
 *
 * @since 2.24
 */
@GLibVersion2_24
public class VariantType(pointer: CPointer<GVariantType>) : ProxyInstance(pointer) {
    public val glibVariantTypePointer: CPointer<GVariantType> = pointer

    /**
     * Makes a copy of a #GVariantType.  It is appropriate to call
     * g_variant_type_free() on the return value.  @type may not be null.
     *
     * @return a new #GVariantType
     *
     * Since 2.24
     */
    public fun copy(): VariantType = g_variant_type_copy(glibVariantTypePointer.reinterpret())!!.run {
        VariantType(reinterpret())
    }

    /**
     * Returns a newly-allocated copy of the type string corresponding to
     * @type.  The returned string is nul-terminated.  It is appropriate to
     * call g_free() on the return value.
     *
     * @return the corresponding type string
     *
     * Since 2.24
     */
    public fun dupString(): String = g_variant_type_dup_string(glibVariantTypePointer.reinterpret())?.toKString()
        ?: error("Expected not null string")

    /**
     * Determines the element type of an array or maybe type.
     *
     * This function may only be used with array or maybe types.
     *
     * @return the element type of @type
     *
     * Since 2.24
     */
    public fun element(): VariantType = g_variant_type_element(glibVariantTypePointer.reinterpret())!!.run {
        VariantType(reinterpret())
    }

    /**
     * Determines the first item type of a tuple or dictionary entry
     * type.
     *
     * This function may only be used with tuple or dictionary entry types,
     * but must not be used with the generic tuple type
     * %G_VARIANT_TYPE_TUPLE.
     *
     * In the case of a dictionary entry type, this returns the type of
     * the key.
     *
     * null is returned in case of @type being %G_VARIANT_TYPE_UNIT.
     *
     * This call, together with g_variant_type_next() provides an iterator
     * interface over tuple and dictionary entry types.
     *
     * @return the first item type of @type, or null
     *
     * Since 2.24
     */
    public fun first(): VariantType = g_variant_type_first(glibVariantTypePointer.reinterpret())!!.run {
        VariantType(reinterpret())
    }

    /**
     * Frees a #GVariantType that was allocated with
     * g_variant_type_copy(), g_variant_type_new() or one of the container
     * type constructor functions.
     *
     * In the case that @type is null, this function does nothing.
     *
     * Since 2.24
     */
    public fun free(): Unit = g_variant_type_free(glibVariantTypePointer.reinterpret())

    /**
     * Returns the length of the type string corresponding to the given
     * @type.  This function must be used to determine the valid extent of
     * the memory region returned by g_variant_type_peek_string().
     *
     * @return the length of the corresponding type string
     *
     * Since 2.24
     */
    public fun getStringLength(): gsize = g_variant_type_get_string_length(glibVariantTypePointer.reinterpret())

    /**
     * Hashes @type.
     *
     * The argument type of @type is only #gconstpointer to allow use with
     * #GHashTable without function pointer casting.  A valid
     * #GVariantType must be provided.
     *
     * @return the hash value
     *
     * Since 2.24
     */
    public fun hash(): guint = g_variant_type_hash(glibVariantTypePointer.reinterpret())

    /**
     * Determines if the given @type is an array type.  This is true if the
     * type string for @type starts with an 'a'.
     *
     * This function returns true for any indefinite type for which every
     * definite subtype is an array type -- %G_VARIANT_TYPE_ARRAY, for
     * example.
     *
     * @return true if @type is an array type
     *
     * Since 2.24
     */
    public fun isArray(): Boolean = g_variant_type_is_array(glibVariantTypePointer.reinterpret()).asBoolean()

    /**
     * Determines if the given @type is a basic type.
     *
     * Basic types are booleans, bytes, integers, doubles, strings, object
     * paths and signatures.
     *
     * Only a basic type may be used as the key of a dictionary entry.
     *
     * This function returns false for all indefinite types except
     * %G_VARIANT_TYPE_BASIC.
     *
     * @return true if @type is a basic type
     *
     * Since 2.24
     */
    public fun isBasic(): Boolean = g_variant_type_is_basic(glibVariantTypePointer.reinterpret()).asBoolean()

    /**
     * Determines if the given @type is a container type.
     *
     * Container types are any array, maybe, tuple, or dictionary
     * entry types plus the variant type.
     *
     * This function returns true for any indefinite type for which every
     * definite subtype is a container -- %G_VARIANT_TYPE_ARRAY, for
     * example.
     *
     * @return true if @type is a container type
     *
     * Since 2.24
     */
    public fun isContainer(): Boolean = g_variant_type_is_container(glibVariantTypePointer.reinterpret()).asBoolean()

    /**
     * Determines if the given @type is definite (ie: not indefinite).
     *
     * A type is definite if its type string does not contain any indefinite
     * type characters ('*', '?', or 'r').
     *
     * A #GVariant instance may not have an indefinite type, so calling
     * this function on the result of g_variant_get_type() will always
     * result in true being returned.  Calling this function on an
     * indefinite type like %G_VARIANT_TYPE_ARRAY, however, will result in
     * false being returned.
     *
     * @return true if @type is definite
     *
     * Since 2.24
     */
    public fun isDefinite(): Boolean = g_variant_type_is_definite(glibVariantTypePointer.reinterpret()).asBoolean()

    /**
     * Determines if the given @type is a dictionary entry type.  This is
     * true if the type string for @type starts with a '{'.
     *
     * This function returns true for any indefinite type for which every
     * definite subtype is a dictionary entry type --
     * %G_VARIANT_TYPE_DICT_ENTRY, for example.
     *
     * @return true if @type is a dictionary entry type
     *
     * Since 2.24
     */
    public fun isDictEntry(): Boolean = g_variant_type_is_dict_entry(glibVariantTypePointer.reinterpret()).asBoolean()

    /**
     * Determines if the given @type is a maybe type.  This is true if the
     * type string for @type starts with an 'm'.
     *
     * This function returns true for any indefinite type for which every
     * definite subtype is a maybe type -- %G_VARIANT_TYPE_MAYBE, for
     * example.
     *
     * @return true if @type is a maybe type
     *
     * Since 2.24
     */
    public fun isMaybe(): Boolean = g_variant_type_is_maybe(glibVariantTypePointer.reinterpret()).asBoolean()

    /**
     * Checks if @type is a subtype of @supertype.
     *
     * This function returns true if @type is a subtype of @supertype.  All
     * types are considered to be subtypes of themselves.  Aside from that,
     * only indefinite types can have subtypes.
     *
     * @param supertype a #GVariantType
     * @return true if @type is a subtype of @supertype
     *
     * Since 2.24
     */
    public fun isSubtypeOf(supertype: VariantType): Boolean = g_variant_type_is_subtype_of(
        glibVariantTypePointer.reinterpret(),
        supertype.glibVariantTypePointer.reinterpret()
    ).asBoolean()

    /**
     * Determines if the given @type is a tuple type.  This is true if the
     * type string for @type starts with a '(' or if @type is
     * %G_VARIANT_TYPE_TUPLE.
     *
     * This function returns true for any indefinite type for which every
     * definite subtype is a tuple type -- %G_VARIANT_TYPE_TUPLE, for
     * example.
     *
     * @return true if @type is a tuple type
     *
     * Since 2.24
     */
    public fun isTuple(): Boolean = g_variant_type_is_tuple(glibVariantTypePointer.reinterpret()).asBoolean()

    /**
     * Determines if the given @type is the variant type.
     *
     * @return true if @type is the variant type
     *
     * Since 2.24
     */
    public fun isVariant(): Boolean = g_variant_type_is_variant(glibVariantTypePointer.reinterpret()).asBoolean()

    /**
     * Determines the key type of a dictionary entry type.
     *
     * This function may only be used with a dictionary entry type.  Other
     * than the additional restriction, this call is equivalent to
     * g_variant_type_first().
     *
     * @return the key type of the dictionary entry
     *
     * Since 2.24
     */
    public fun key(): VariantType = g_variant_type_key(glibVariantTypePointer.reinterpret())!!.run {
        VariantType(reinterpret())
    }

    /**
     * Determines the number of items contained in a tuple or
     * dictionary entry type.
     *
     * This function may only be used with tuple or dictionary entry types,
     * but must not be used with the generic tuple type
     * %G_VARIANT_TYPE_TUPLE.
     *
     * In the case of a dictionary entry type, this function will always
     * return 2.
     *
     * @return the number of items in @type
     *
     * Since 2.24
     */
    public fun nItems(): gsize = g_variant_type_n_items(glibVariantTypePointer.reinterpret())

    /**
     * Determines the next item type of a tuple or dictionary entry
     * type.
     *
     * @type must be the result of a previous call to
     * g_variant_type_first() or g_variant_type_next().
     *
     * If called on the key type of a dictionary entry then this call
     * returns the value type.  If called on the value type of a dictionary
     * entry then this call returns null.
     *
     * For tuples, null is returned when @type is the last item in a tuple.
     *
     * @return the next #GVariantType after @type, or null
     *
     * Since 2.24
     */
    public fun next(): VariantType = g_variant_type_next(glibVariantTypePointer.reinterpret())!!.run {
        VariantType(reinterpret())
    }

    /**
     * Returns the type string corresponding to the given @type.  The
     * result is not nul-terminated; in order to determine its length you
     * must call g_variant_type_get_string_length().
     *
     * To get a nul-terminated string, see g_variant_type_dup_string().
     *
     * @return the corresponding type string (not nul-terminated)
     *
     * Since 2.24
     */
    public fun peekString(): String = g_variant_type_peek_string(glibVariantTypePointer.reinterpret())?.toKString()
        ?: error("Expected not null string")

    /**
     * Determines the value type of a dictionary entry type.
     *
     * This function may only be used with a dictionary entry type.
     *
     * @return the value type of the dictionary entry
     *
     * Since 2.24
     */
    public fun `value`(): VariantType = g_variant_type_value(glibVariantTypePointer.reinterpret())!!.run {
        VariantType(reinterpret())
    }

    public companion object {
        /**
         * Creates a new #GVariantType corresponding to the type string given
         * by @type_string.  It is appropriate to call g_variant_type_free() on
         * the return value.
         *
         * It is a programmer error to call this function with an invalid type
         * string.  Use g_variant_type_string_is_valid() if you are unsure.
         *
         * @param typeString a valid GVariant type string
         * @return a new #GVariantType
         * @since 2.24
         */
        public fun new(typeString: String): VariantType = VariantType(g_variant_type_new(typeString)!!.reinterpret())

        /**
         * Constructs the type corresponding to an array of elements of the
         * type @type.
         *
         * It is appropriate to call g_variant_type_free() on the return value.
         *
         * @param element a #GVariantType
         * @return a new array #GVariantType
         *
         * Since 2.24
         */
        public fun newArray(element: VariantType): VariantType =
            VariantType(g_variant_type_new_array(element.glibVariantTypePointer.reinterpret())!!.reinterpret())

        /**
         * Constructs the type corresponding to a dictionary entry with a key
         * of type @key and a value of type @value.
         *
         * It is appropriate to call g_variant_type_free() on the return value.
         *
         * @param key a basic #GVariantType
         * @param value a #GVariantType
         * @return a new dictionary entry #GVariantType
         *
         * Since 2.24
         */
        public fun newDictEntry(key: VariantType, `value`: VariantType): VariantType = VariantType(
            g_variant_type_new_dict_entry(
                key.glibVariantTypePointer.reinterpret(),
                `value`.glibVariantTypePointer.reinterpret()
            )!!.reinterpret()
        )

        /**
         * Constructs the type corresponding to a maybe instance containing
         * type @type or Nothing.
         *
         * It is appropriate to call g_variant_type_free() on the return value.
         *
         * @param element a #GVariantType
         * @return a new maybe #GVariantType
         *
         * Since 2.24
         */
        public fun newMaybe(element: VariantType): VariantType =
            VariantType(g_variant_type_new_maybe(element.glibVariantTypePointer.reinterpret())!!.reinterpret())

        public fun checked(typeString: String): VariantType = g_variant_type_checked_(typeString)!!.run {
            VariantType(reinterpret())
        }

        public fun stringGetDepth(typeString: String): gsize = g_variant_type_string_get_depth_(typeString)

        /**
         * Checks if @type_string is a valid GVariant type string.  This call is
         * equivalent to calling g_variant_type_string_scan() and confirming
         * that the following character is a nul terminator.
         *
         * @param typeString a pointer to any string
         * @return true if @type_string is exactly one valid type string
         *
         * Since 2.24
         */
        public fun stringIsValid(typeString: String): Boolean = g_variant_type_string_is_valid(typeString).asBoolean()

        /**
         * Get the GType of VariantType
         *
         * @return the GType
         */
        public fun getType(): GType = g_variant_type_get_gtype()
    }
}

// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.common.toCStringList
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GVariant
import org.gtkkn.native.glib.g_variant_byteswap
import org.gtkkn.native.glib.g_variant_check_format_string
import org.gtkkn.native.glib.g_variant_classify
import org.gtkkn.native.glib.g_variant_get_boolean
import org.gtkkn.native.glib.g_variant_get_child_value
import org.gtkkn.native.glib.g_variant_get_data_as_bytes
import org.gtkkn.native.glib.g_variant_get_double
import org.gtkkn.native.glib.g_variant_get_handle
import org.gtkkn.native.glib.g_variant_get_int16
import org.gtkkn.native.glib.g_variant_get_int32
import org.gtkkn.native.glib.g_variant_get_int64
import org.gtkkn.native.glib.g_variant_get_maybe
import org.gtkkn.native.glib.g_variant_get_normal_form
import org.gtkkn.native.glib.g_variant_get_size
import org.gtkkn.native.glib.g_variant_get_type
import org.gtkkn.native.glib.g_variant_get_type_string
import org.gtkkn.native.glib.g_variant_get_uint16
import org.gtkkn.native.glib.g_variant_get_uint32
import org.gtkkn.native.glib.g_variant_get_uint64
import org.gtkkn.native.glib.g_variant_get_variant
import org.gtkkn.native.glib.g_variant_hash
import org.gtkkn.native.glib.g_variant_is_container
import org.gtkkn.native.glib.g_variant_is_floating
import org.gtkkn.native.glib.g_variant_is_normal_form
import org.gtkkn.native.glib.g_variant_is_object_path
import org.gtkkn.native.glib.g_variant_is_of_type
import org.gtkkn.native.glib.g_variant_is_signature
import org.gtkkn.native.glib.g_variant_lookup_value
import org.gtkkn.native.glib.g_variant_n_children
import org.gtkkn.native.glib.g_variant_new_boolean
import org.gtkkn.native.glib.g_variant_new_bytestring_array
import org.gtkkn.native.glib.g_variant_new_dict_entry
import org.gtkkn.native.glib.g_variant_new_double
import org.gtkkn.native.glib.g_variant_new_from_bytes
import org.gtkkn.native.glib.g_variant_new_handle
import org.gtkkn.native.glib.g_variant_new_int16
import org.gtkkn.native.glib.g_variant_new_int32
import org.gtkkn.native.glib.g_variant_new_int64
import org.gtkkn.native.glib.g_variant_new_maybe
import org.gtkkn.native.glib.g_variant_new_object_path
import org.gtkkn.native.glib.g_variant_new_objv
import org.gtkkn.native.glib.g_variant_new_signature
import org.gtkkn.native.glib.g_variant_new_string
import org.gtkkn.native.glib.g_variant_new_strv
import org.gtkkn.native.glib.g_variant_new_uint16
import org.gtkkn.native.glib.g_variant_new_uint32
import org.gtkkn.native.glib.g_variant_new_uint64
import org.gtkkn.native.glib.g_variant_new_variant
import org.gtkkn.native.glib.g_variant_parse_error_print_context
import org.gtkkn.native.glib.g_variant_parse_error_quark
import org.gtkkn.native.glib.g_variant_parser_get_error_quark
import org.gtkkn.native.glib.g_variant_print
import org.gtkkn.native.glib.g_variant_ref
import org.gtkkn.native.glib.g_variant_ref_sink
import org.gtkkn.native.glib.g_variant_take_ref
import org.gtkkn.native.glib.g_variant_unref
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.Short
import kotlin.String
import kotlin.UInt
import kotlin.ULong
import kotlin.UShort
import kotlin.Unit
import kotlin.collections.List

/**
 * #GVariant is a variant datatype; it can contain one or more values
 * along with information about the type of the values.
 *
 * A #GVariant may contain simple types, like an integer, or a boolean value;
 * or complex types, like an array of two strings, or a dictionary of key
 * value pairs. A #GVariant is also immutable: once it's been created neither
 * its type nor its content can be modified further.
 *
 * GVariant is useful whenever data needs to be serialized, for example when
 * sending method parameters in D-Bus, or when saving settings using GSettings.
 *
 * When creating a new #GVariant, you pass the data you want to store in it
 * along with a string representing the type of data you wish to pass to it.
 *
 * For instance, if you want to create a #GVariant holding an integer value you
 * can use:
 *
 * |[<!-- language="C" -->
 *   GVariant *v = g_variant_new ("u", 40);
 * ]|
 *
 * The string "u" in the first argument tells #GVariant that the data passed to
 * the constructor (40) is going to be an unsigned integer.
 *
 * More advanced examples of #GVariant in use can be found in documentation for
 * [GVariant format strings][gvariant-format-strings-pointers].
 *
 * The range of possible values is determined by the type.
 *
 * The type system used by #GVariant is #GVariantType.
 *
 * #GVariant instances always have a type and a value (which are given
 * at construction time).  The type and value of a #GVariant instance
 * can never change other than by the #GVariant itself being
 * destroyed.  A #GVariant cannot contain a pointer.
 *
 * #GVariant is reference counted using g_variant_ref() and
 * g_variant_unref().  #GVariant also has floating reference counts --
 * see g_variant_ref_sink().
 *
 * #GVariant is completely threadsafe.  A #GVariant instance can be
 * concurrently accessed in any way from any number of threads without
 * problems.
 *
 * #GVariant is heavily optimised for dealing with data in serialized
 * form.  It works particularly well with data located in memory-mapped
 * files.  It can perform nearly all deserialization operations in a
 * small constant time, usually touching only a single memory page.
 * Serialized #GVariant data can also be sent over the network.
 *
 * #GVariant is largely compatible with D-Bus.  Almost all types of
 * #GVariant instances can be sent over D-Bus.  See #GVariantType for
 * exceptions.  (However, #GVariant's serialization format is not the same
 * as the serialization format of a D-Bus message body: use #GDBusMessage,
 * in the gio library, for those.)
 *
 * For space-efficiency, the #GVariant serialization format does not
 * automatically include the variant's length, type or endianness,
 * which must either be implied from context (such as knowledge that a
 * particular file format always contains a little-endian
 * %G_VARIANT_TYPE_VARIANT which occupies the whole length of the file)
 * or supplied out-of-band (for instance, a length, type and/or endianness
 * indicator could be placed at the beginning of a file, network message
 * or network stream).
 *
 * A #GVariant's size is limited mainly by any lower level operating
 * system constraints, such as the number of bits in #gsize.  For
 * example, it is reasonable to have a 2GB file mapped into memory
 * with #GMappedFile, and call g_variant_new_from_data() on it.
 *
 * For convenience to C programmers, #GVariant features powerful
 * varargs-based value construction and destruction.  This feature is
 * designed to be embedded in other libraries.
 *
 * There is a Python-inspired text language for describing #GVariant
 * values.  #GVariant includes a printer for this language and a parser
 * with type inferencing.
 *
 * ## Memory Use
 *
 * #GVariant tries to be quite efficient with respect to memory use.
 * This section gives a rough idea of how much memory is used by the
 * current implementation.  The information here is subject to change
 * in the future.
 *
 * The memory allocated by #GVariant can be grouped into 4 broad
 * purposes: memory for serialized data, memory for the type
 * information cache, buffer management memory and memory for the
 * #GVariant structure itself.
 *
 * ## Serialized Data Memory
 *
 * This is the memory that is used for storing GVariant data in
 * serialized form.  This is what would be sent over the network or
 * what would end up on disk, not counting any indicator of the
 * endianness, or of the length or type of the top-level variant.
 *
 * The amount of memory required to store a boolean is 1 byte. 16,
 * 32 and 64 bit integers and double precision floating point numbers
 * use their "natural" size.  Strings (including object path and
 * signature strings) are stored with a nul terminator, and as such
 * use the length of the string plus 1 byte.
 *
 * Maybe types use no space at all to represent the null value and
 * use the same amount of space (sometimes plus one byte) as the
 * equivalent non-maybe-typed value to represent the non-null case.
 *
 * Arrays use the amount of space required to store each of their
 * members, concatenated.  Additionally, if the items stored in an
 * array are not of a fixed-size (ie: strings, other arrays, etc)
 * then an additional framing offset is stored for each item.  The
 * size of this offset is either 1, 2 or 4 bytes depending on the
 * overall size of the container.  Additionally, extra padding bytes
 * are added as required for alignment of child values.
 *
 * Tuples (including dictionary entries) use the amount of space
 * required to store each of their members, concatenated, plus one
 * framing offset (as per arrays) for each non-fixed-sized item in
 * the tuple, except for the last one.  Additionally, extra padding
 * bytes are added as required for alignment of child values.
 *
 * Variants use the same amount of space as the item inside of the
 * variant, plus 1 byte, plus the length of the type string for the
 * item inside the variant.
 *
 * As an example, consider a dictionary mapping strings to variants.
 * In the case that the dictionary is empty, 0 bytes are required for
 * the serialization.
 *
 * If we add an item "width" that maps to the int32 value of 500 then
 * we will use 4 byte to store the int32 (so 6 for the variant
 * containing it) and 6 bytes for the string.  The variant must be
 * aligned to 8 after the 6 bytes of the string, so that's 2 extra
 * bytes.  6 (string) + 2 (padding) + 6 (variant) is 14 bytes used
 * for the dictionary entry.  An additional 1 byte is added to the
 * array as a framing offset making a total of 15 bytes.
 *
 * If we add another entry, "title" that maps to a nullable string
 * that happens to have a value of null, then we use 0 bytes for the
 * null value (and 3 bytes for the variant to contain it along with
 * its type string) plus 6 bytes for the string.  Again, we need 2
 * padding bytes.  That makes a total of 6 + 2 + 3 = 11 bytes.
 *
 * We now require extra padding between the two items in the array.
 * After the 14 bytes of the first item, that's 2 bytes required.
 * We now require 2 framing offsets for an extra two
 * bytes. 14 + 2 + 11 + 2 = 29 bytes to encode the entire two-item
 * dictionary.
 *
 * ## Type Information Cache
 *
 * For each GVariant type that currently exists in the program a type
 * information structure is kept in the type information cache.  The
 * type information structure is required for rapid deserialization.
 *
 * Continuing with the above example, if a #GVariant exists with the
 * type "a{sv}" then a type information struct will exist for
 * "a{sv}", "{sv}", "s", and "v".  Multiple uses of the same type
 * will share the same type information.  Additionally, all
 * single-digit types are stored in read-only static memory and do
 * not contribute to the writable memory footprint of a program using
 * #GVariant.
 *
 * Aside from the type information structures stored in read-only
 * memory, there are two forms of type information.  One is used for
 * container types where there is a single element type: arrays and
 * maybe types.  The other is used for container types where there
 * are multiple element types: tuples and dictionary entries.
 *
 * Array type info structures are 6 * sizeof (void *), plus the
 * memory required to store the type string itself.  This means that
 * on 32-bit systems, the cache entry for "a{sv}" would require 30
 * bytes of memory (plus malloc overhead).
 *
 * Tuple type info structures are 6 * sizeof (void *), plus 4 *
 * sizeof (void *) for each item in the tuple, plus the memory
 * required to store the type string itself.  A 2-item tuple, for
 * example, would have a type information structure that consumed
 * writable memory in the size of 14 * sizeof (void *) (plus type
 * string)  This means that on 32-bit systems, the cache entry for
 * "{sv}" would require 61 bytes of memory (plus malloc overhead).
 *
 * This means that in total, for our "a{sv}" example, 91 bytes of
 * type information would be allocated.
 *
 * The type information cache, additionally, uses a #GHashTable to
 * store and look up the cached items and stores a pointer to this
 * hash table in static storage.  The hash table is freed when there
 * are zero items in the type cache.
 *
 * Although these sizes may seem large it is important to remember
 * that a program will probably only have a very small number of
 * different types of values in it and that only one type information
 * structure is required for many different values of the same type.
 *
 * ## Buffer Management Memory
 *
 * #GVariant uses an internal buffer management structure to deal
 * with the various different possible sources of serialized data
 * that it uses.  The buffer is responsible for ensuring that the
 * correct call is made when the data is no longer in use by
 * #GVariant.  This may involve a g_free() or a g_slice_free() or
 * even g_mapped_file_unref().
 *
 * One buffer management structure is used for each chunk of
 * serialized data.  The size of the buffer management structure
 * is 4 * (void *).  On 32-bit systems, that's 16 bytes.
 *
 * ## GVariant structure
 *
 * The size of a #GVariant structure is 6 * (void *).  On 32-bit
 * systems, that's 24 bytes.
 *
 * #GVariant structures only exist if they are explicitly created
 * with API calls.  For example, if a #GVariant is constructed out of
 * serialized data for the example given above (with the dictionary)
 * then although there are 9 individual values that comprise the
 * entire dictionary (two keys, two values, two variants containing
 * the values, two dictionary entries, plus the dictionary itself),
 * only 1 #GVariant instance exists -- the one referring to the
 * dictionary.
 *
 * If calls are made to start accessing the other values then
 * #GVariant instances will exist for those values only for as long
 * as they are in use (ie: until you call g_variant_unref()).  The
 * type information is shared.  The serialized data and the buffer
 * management structure for that serialized data is shared by the
 * child.
 *
 * ## Summary
 *
 * To put the entire example together, for our dictionary mapping
 * strings to variants (with two entries, as given above), we are
 * using 91 bytes of memory for type information, 29 bytes of memory
 * for the serialized data, 16 bytes for buffer management and 24
 * bytes for the #GVariant instance, or a total of 160 bytes, plus
 * malloc overhead.  If we were to use g_variant_get_child_value() to
 * access the two dictionary entries, we would use an additional 48
 * bytes.  If we were to have other dictionaries of the same type, we
 * would use more memory for the serialized data and buffer
 * management for those dictionaries, but the type information would
 * be shared.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `two`: Variant
 * - parameter `length`: length: Out parameter is not supported
 * - parameter `length`: length: Out parameter is not supported
 * - parameter `length`: length: Out parameter is not supported
 * - parameter `length`: length: Out parameter is not supported
 * - parameter `length`: length: Out parameter is not supported
 * - parameter `two`: Variant
 * - method `get_byte`: Return type guint8 is unsupported
 * - method `get_bytestring`: guint8
 * - parameter `length`: length: Out parameter is not supported
 * - method `get_data`: Return type gpointer is unsupported
 * - parameter `length`: length: Out parameter is not supported
 * - parameter `length`: length: Out parameter is not supported
 * - parameter `length`: length: Out parameter is not supported
 * - parameter `data`: gpointer
 * - parameter `children`: Array parameter of type Variant is not supported
 * - parameter `value`: guint8
 * - parameter `string`: guint8
 * - parameter `elements`: gpointer
 * - parameter `data`: guint8
 * - parameter `children`: Array parameter of type Variant is not supported
 * - parameter `endptr`: Unsupported string with cType const gchar**
 *
 * @since 2.24
 */
public class Variant(
    pointer: CPointer<GVariant>,
) : Record {
    public val glibVariantPointer: CPointer<GVariant> = pointer

    /**
     * Performs a byteswapping operation on the contents of @value.  The
     * result is that all multi-byte numeric data contained in @value is
     * byteswapped.  That includes 16, 32, and 64bit signed and unsigned
     * integers as well as file handles and double precision floating point
     * values.
     *
     * This function is an identity mapping on any value that does not
     * contain multi-byte numeric data.  That include strings, booleans,
     * bytes and containers containing only these things (recursively).
     *
     * The returned value is always in normal form and is marked as trusted.
     *
     * @return the byteswapped form of @value
     * @since 2.24
     */
    public fun byteswap(): Variant =
        g_variant_byteswap(glibVariantPointer.reinterpret())!!.run {
            Variant(reinterpret())
        }

    /**
     * Checks if calling g_variant_get() with @format_string on @value would
     * be valid from a type-compatibility standpoint.  @format_string is
     * assumed to be a valid format string (from a syntactic standpoint).
     *
     * If @copy_only is true then this function additionally checks that it
     * would be safe to call g_variant_unref() on @value immediately after
     * the call to g_variant_get() without invalidating the result.  This is
     * only possible if deep copies are made (ie: there are no pointers to
     * the data inside of the soon-to-be-freed #GVariant instance).  If this
     * check fails then a g_critical() is printed and false is returned.
     *
     * This function is meant to be used by functions that wish to provide
     * varargs accessors to #GVariant values of uncertain values (eg:
     * g_variant_lookup() or g_menu_model_get_item_attribute()).
     *
     * @param formatString a valid #GVariant format string
     * @param copyOnly true to ensure the format string makes deep copies
     * @return true if @format_string is safe to use
     * @since 2.34
     */
    public fun checkFormatString(
        formatString: String,
        copyOnly: Boolean,
    ): Boolean =
        g_variant_check_format_string(
            glibVariantPointer.reinterpret(),
            formatString,
            copyOnly.asGBoolean()
        ).asBoolean()

    /**
     * Classifies @value according to its top-level type.
     *
     * @return the #GVariantClass of @value
     * @since 2.24
     */
    public fun classify(): VariantClass =
        g_variant_classify(glibVariantPointer.reinterpret()).run {
            VariantClass.fromNativeValue(this)
        }

    /**
     * Returns the boolean value of @value.
     *
     * It is an error to call this function with a @value of any type
     * other than %G_VARIANT_TYPE_BOOLEAN.
     *
     * @return true or false
     * @since 2.24
     */
    public fun getBoolean(): Boolean = g_variant_get_boolean(glibVariantPointer.reinterpret()).asBoolean()

    /**
     * Reads a child item out of a container #GVariant instance.  This
     * includes variants, maybes, arrays, tuples and dictionary
     * entries.  It is an error to call this function on any other type of
     * #GVariant.
     *
     * It is an error if @index_ is greater than the number of child items
     * in the container.  See g_variant_n_children().
     *
     * The returned value is never floating.  You should free it with
     * g_variant_unref() when you're done with it.
     *
     * Note that values borrowed from the returned child are not guaranteed to
     * still be valid after the child is freed even if you still hold a reference
     * to @value, if @value has not been serialized at the time this function is
     * called. To avoid this, you can serialize @value by calling
     * g_variant_get_data() and optionally ignoring the return value.
     *
     * There may be implementation specific restrictions on deeply nested values,
     * which would result in the unit tuple being returned as the child value,
     * instead of further nested children. #GVariant is guaranteed to handle
     * nesting up to at least 64 levels.
     *
     * This function is O(1).
     *
     * @param index the index of the child to fetch
     * @return the child at the specified index
     * @since 2.24
     */
    public fun getChildValue(index: ULong): Variant =
        g_variant_get_child_value(glibVariantPointer.reinterpret(), index)!!.run {
            Variant(reinterpret())
        }

    /**
     * Returns a pointer to the serialized form of a #GVariant instance.
     * The semantics of this function are exactly the same as
     * g_variant_get_data(), except that the returned #GBytes holds
     * a reference to the variant data.
     *
     * @return A new #GBytes representing the variant data
     * @since 2.36
     */
    public fun getDataAsBytes(): Bytes =
        g_variant_get_data_as_bytes(glibVariantPointer.reinterpret())!!.run {
            Bytes(reinterpret())
        }

    /**
     * Returns the double precision floating point value of @value.
     *
     * It is an error to call this function with a @value of any type
     * other than %G_VARIANT_TYPE_DOUBLE.
     *
     * @return a #gdouble
     * @since 2.24
     */
    public fun getDouble(): Double = g_variant_get_double(glibVariantPointer.reinterpret())

    /**
     * Returns the 32-bit signed integer value of @value.
     *
     * It is an error to call this function with a @value of any type other
     * than %G_VARIANT_TYPE_HANDLE.
     *
     * By convention, handles are indexes into an array of file descriptors
     * that are sent alongside a D-Bus message.  If you're not interacting
     * with D-Bus, you probably don't need them.
     *
     * @return a #gint32
     * @since 2.24
     */
    public fun getHandle(): Int = g_variant_get_handle(glibVariantPointer.reinterpret())

    /**
     * Returns the 16-bit signed integer value of @value.
     *
     * It is an error to call this function with a @value of any type
     * other than %G_VARIANT_TYPE_INT16.
     *
     * @return a #gint16
     * @since 2.24
     */
    public fun getInt16(): Short = g_variant_get_int16(glibVariantPointer.reinterpret())

    /**
     * Returns the 32-bit signed integer value of @value.
     *
     * It is an error to call this function with a @value of any type
     * other than %G_VARIANT_TYPE_INT32.
     *
     * @return a #gint32
     * @since 2.24
     */
    public fun getInt32(): Int = g_variant_get_int32(glibVariantPointer.reinterpret())

    /**
     * Returns the 64-bit signed integer value of @value.
     *
     * It is an error to call this function with a @value of any type
     * other than %G_VARIANT_TYPE_INT64.
     *
     * @return a #gint64
     * @since 2.24
     */
    public fun getInt64(): Long = g_variant_get_int64(glibVariantPointer.reinterpret())

    /**
     * Given a maybe-typed #GVariant instance, extract its value.  If the
     * value is Nothing, then this function returns null.
     *
     * @return the contents of @value, or null
     * @since 2.24
     */
    public fun getMaybe(): Variant? =
        g_variant_get_maybe(glibVariantPointer.reinterpret())?.run {
            Variant(reinterpret())
        }

    /**
     * Gets a #GVariant instance that has the same value as @value and is
     * trusted to be in normal form.
     *
     * If @value is already trusted to be in normal form then a new
     * reference to @value is returned.
     *
     * If @value is not already trusted, then it is scanned to check if it
     * is in normal form.  If it is found to be in normal form then it is
     * marked as trusted and a new reference to it is returned.
     *
     * If @value is found not to be in normal form then a new trusted
     * #GVariant is created with the same value as @value.
     *
     * It makes sense to call this function if you've received #GVariant
     * data from untrusted sources and you want to ensure your serialized
     * output is definitely in normal form.
     *
     * If @value is already in normal form, a new reference will be returned
     * (which will be floating if @value is floating). If it is not in normal form,
     * the newly created #GVariant will be returned with a single non-floating
     * reference. Typically, g_variant_take_ref() should be called on the return
     * value from this function to guarantee ownership of a single non-floating
     * reference to it.
     *
     * @return a trusted #GVariant
     * @since 2.24
     */
    public fun getNormalForm(): Variant =
        g_variant_get_normal_form(glibVariantPointer.reinterpret())!!.run {
            Variant(reinterpret())
        }

    /**
     * Determines the number of bytes that would be required to store @value
     * with g_variant_store().
     *
     * If @value has a fixed-sized type then this function always returned
     * that fixed size.
     *
     * In the case that @value is already in serialized form or the size has
     * already been calculated (ie: this function has been called before)
     * then this function is O(1).  Otherwise, the size is calculated, an
     * operation which is approximately O(n) in the number of values
     * involved.
     *
     * @return the serialized size of @value
     * @since 2.24
     */
    public fun getSize(): ULong = g_variant_get_size(glibVariantPointer.reinterpret())

    /**
     * Determines the type of @value.
     *
     * The return value is valid for the lifetime of @value and must not
     * be freed.
     *
     * @return a #GVariantType
     * @since 2.24
     */
    public fun getType(): VariantType =
        g_variant_get_type(glibVariantPointer.reinterpret())!!.run {
            VariantType(reinterpret())
        }

    /**
     * Returns the type string of @value.  Unlike the result of calling
     * g_variant_type_peek_string(), this string is nul-terminated.  This
     * string belongs to #GVariant and must not be freed.
     *
     * @return the type string for the type of @value
     * @since 2.24
     */
    public fun getTypeString(): String =
        g_variant_get_type_string(glibVariantPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Returns the 16-bit unsigned integer value of @value.
     *
     * It is an error to call this function with a @value of any type
     * other than %G_VARIANT_TYPE_UINT16.
     *
     * @return a #guint16
     * @since 2.24
     */
    public fun getUint16(): UShort = g_variant_get_uint16(glibVariantPointer.reinterpret())

    /**
     * Returns the 32-bit unsigned integer value of @value.
     *
     * It is an error to call this function with a @value of any type
     * other than %G_VARIANT_TYPE_UINT32.
     *
     * @return a #guint32
     * @since 2.24
     */
    public fun getUint32(): UInt = g_variant_get_uint32(glibVariantPointer.reinterpret())

    /**
     * Returns the 64-bit unsigned integer value of @value.
     *
     * It is an error to call this function with a @value of any type
     * other than %G_VARIANT_TYPE_UINT64.
     *
     * @return a #guint64
     * @since 2.24
     */
    public fun getUint64(): ULong = g_variant_get_uint64(glibVariantPointer.reinterpret())

    /**
     * Unboxes @value.  The result is the #GVariant instance that was
     * contained in @value.
     *
     * @return the item contained in the variant
     * @since 2.24
     */
    public fun getVariant(): Variant =
        g_variant_get_variant(glibVariantPointer.reinterpret())!!.run {
            Variant(reinterpret())
        }

    /**
     * Generates a hash value for a #GVariant instance.
     *
     * The output of this function is guaranteed to be the same for a given
     * value only per-process.  It may change between different processor
     * architectures or even different versions of GLib.  Do not use this
     * function as a basis for building protocols or file formats.
     *
     * The type of @value is #gconstpointer only to allow use of this
     * function with #GHashTable.  @value must be a #GVariant.
     *
     * @return a hash value corresponding to @value
     * @since 2.24
     */
    public fun hash(): UInt = g_variant_hash(glibVariantPointer.reinterpret())

    /**
     * Checks if @value is a container.
     *
     * @return true if @value is a container
     * @since 2.24
     */
    public fun isContainer(): Boolean = g_variant_is_container(glibVariantPointer.reinterpret()).asBoolean()

    /**
     * Checks whether @value has a floating reference count.
     *
     * This function should only ever be used to assert that a given variant
     * is or is not floating, or for debug purposes. To acquire a reference
     * to a variant that might be floating, always use g_variant_ref_sink()
     * or g_variant_take_ref().
     *
     * See g_variant_ref_sink() for more information about floating reference
     * counts.
     *
     * @return whether @value is floating
     * @since 2.26
     */
    public fun isFloating(): Boolean = g_variant_is_floating(glibVariantPointer.reinterpret()).asBoolean()

    /**
     * Checks if @value is in normal form.
     *
     * The main reason to do this is to detect if a given chunk of
     * serialized data is in normal form: load the data into a #GVariant
     * using g_variant_new_from_data() and then use this function to
     * check.
     *
     * If @value is found to be in normal form then it will be marked as
     * being trusted.  If the value was already marked as being trusted then
     * this function will immediately return true.
     *
     * There may be implementation specific restrictions on deeply nested values.
     * GVariant is guaranteed to handle nesting up to at least 64 levels.
     *
     * @return true if @value is in normal form
     * @since 2.24
     */
    public fun isNormalForm(): Boolean = g_variant_is_normal_form(glibVariantPointer.reinterpret()).asBoolean()

    /**
     * Checks if a value has a type matching the provided type.
     *
     * @param type a #GVariantType
     * @return true if the type of @value matches @type
     * @since 2.24
     */
    public fun isOfType(type: VariantType): Boolean =
        g_variant_is_of_type(
            glibVariantPointer.reinterpret(),
            type.glibVariantTypePointer
        ).asBoolean()

    /**
     * Looks up a value in a dictionary #GVariant.
     *
     * This function works with dictionaries of the type a{s*} (and equally
     * well with type a{o*}, but we only further discuss the string case
     * for sake of clarity).
     *
     * In the event that @dictionary has the type a{sv}, the @expected_type
     * string specifies what type of value is expected to be inside of the
     * variant. If the value inside the variant has a different type then
     * null is returned. In the event that @dictionary has a value type other
     * than v then @expected_type must directly match the value type and it is
     * used to unpack the value directly or an error occurs.
     *
     * In either case, if @key is not found in @dictionary, null is returned.
     *
     * If the key is found and the value has the correct type, it is
     * returned.  If @expected_type was specified then any non-null return
     * value will have this type.
     *
     * This function is currently implemented with a linear scan.  If you
     * plan to do many lookups then #GVariantDict may be more efficient.
     *
     * @param key the key to look up in the dictionary
     * @param expectedType a #GVariantType, or null
     * @return the value of the dictionary key, or null
     * @since 2.28
     */
    public fun lookupValue(
        key: String,
        expectedType: VariantType? = null,
    ): Variant =
        g_variant_lookup_value(
            glibVariantPointer.reinterpret(),
            key,
            expectedType?.glibVariantTypePointer
        )!!.run {
            Variant(reinterpret())
        }

    /**
     * Determines the number of children in a container #GVariant instance.
     * This includes variants, maybes, arrays, tuples and dictionary
     * entries.  It is an error to call this function on any other type of
     * #GVariant.
     *
     * For variants, the return value is always 1.  For values with maybe
     * types, it is always zero or one.  For arrays, it is the length of the
     * array.  For tuples it is the number of tuple items (which depends
     * only on the type).  For dictionary entries, it is always 2
     *
     * This function is O(1).
     *
     * @return the number of children in the container
     * @since 2.24
     */
    public fun nChildren(): ULong = g_variant_n_children(glibVariantPointer.reinterpret())

    /**
     * Pretty-prints @value in the format understood by g_variant_parse().
     *
     * The format is described [here][gvariant-text].
     *
     * If @type_annotate is true, then type information is included in
     * the output.
     *
     * @param typeAnnotate true if type information should be included in
     *                 the output
     * @return a newly-allocated string holding the result.
     * @since 2.24
     */
    public fun print(typeAnnotate: Boolean): String =
        g_variant_print(
            glibVariantPointer.reinterpret(),
            typeAnnotate.asGBoolean()
        )?.toKString() ?: error("Expected not null string")

    /**
     * Increases the reference count of @value.
     *
     * @return the same @value
     * @since 2.24
     */
    public fun ref(): Variant =
        g_variant_ref(glibVariantPointer.reinterpret())!!.run {
            Variant(reinterpret())
        }

    /**
     * #GVariant uses a floating reference count system.  All functions with
     * names starting with `g_variant_new_` return floating
     * references.
     *
     * Calling g_variant_ref_sink() on a #GVariant with a floating reference
     * will convert the floating reference into a full reference.  Calling
     * g_variant_ref_sink() on a non-floating #GVariant results in an
     * additional normal reference being added.
     *
     * In other words, if the @value is floating, then this call "assumes
     * ownership" of the floating reference, converting it to a normal
     * reference.  If the @value is not floating, then this call adds a
     * new normal reference increasing the reference count by one.
     *
     * All calls that result in a #GVariant instance being inserted into a
     * container will call g_variant_ref_sink() on the instance.  This means
     * that if the value was just created (and has only its floating
     * reference) then the container will assume sole ownership of the value
     * at that point and the caller will not need to unreference it.  This
     * makes certain common styles of programming much easier while still
     * maintaining normal refcounting semantics in situations where values
     * are not floating.
     *
     * @return the same @value
     * @since 2.24
     */
    public fun refSink(): Variant =
        g_variant_ref_sink(glibVariantPointer.reinterpret())!!.run {
            Variant(reinterpret())
        }

    /**
     * If @value is floating, sink it.  Otherwise, do nothing.
     *
     * Typically you want to use g_variant_ref_sink() in order to
     * automatically do the correct thing with respect to floating or
     * non-floating references, but there is one specific scenario where
     * this function is helpful.
     *
     * The situation where this function is helpful is when creating an API
     * that allows the user to provide a callback function that returns a
     * #GVariant.  We certainly want to allow the user the flexibility to
     * return a non-floating reference from this callback (for the case
     * where the value that is being returned already exists).
     *
     * At the same time, the style of the #GVariant API makes it likely that
     * for newly-created #GVariant instances, the user can be saved some
     * typing if they are allowed to return a #GVariant with a floating
     * reference.
     *
     * Using this function on the return value of the user's callback allows
     * the user to do whichever is more convenient for them.  The caller
     * will always receives exactly one full reference to the value: either
     * the one that was returned in the first place, or a floating reference
     * that has been converted to a full reference.
     *
     * This function has an odd interaction when combined with
     * g_variant_ref_sink() running at the same time in another thread on
     * the same #GVariant instance.  If g_variant_ref_sink() runs first then
     * the result will be that the floating reference is converted to a hard
     * reference.  If g_variant_take_ref() runs first then the result will
     * be that the floating reference is converted to a hard reference and
     * an additional reference on top of that one is added.  It is best to
     * avoid this situation.
     *
     * @return the same @value
     */
    public fun takeRef(): Variant =
        g_variant_take_ref(glibVariantPointer.reinterpret())!!.run {
            Variant(reinterpret())
        }

    /**
     * Decreases the reference count of @value.  When its reference count
     * drops to 0, the memory used by the variant is freed.
     *
     * @since 2.24
     */
    public fun unref(): Unit = g_variant_unref(glibVariantPointer.reinterpret())

    public companion object : RecordCompanion<Variant, GVariant> {
        /**
         * Creates a new boolean #GVariant instance -- either true or false.
         *
         * @param value a #gboolean value
         * @return a floating reference to a new boolean #GVariant instance
         * @since 2.24
         */
        public fun newBoolean(`value`: Boolean): Variant =
            Variant(g_variant_new_boolean(`value`.asGBoolean())!!.reinterpret())

        /**
         * Constructs an array of bytestring #GVariant from the given array of
         * strings.
         *
         * If @length is -1 then @strv is null-terminated.
         *
         * @param strv an array of strings
         * @param length the length of @strv, or -1
         * @return a new floating #GVariant instance
         * @since 2.26
         */
        public fun newBytestringArray(
            strv: List<String>,
            length: Long,
        ): Variant {
            memScoped {
                return Variant(
                    g_variant_new_bytestring_array(
                        strv.toCStringList(this),
                        length
                    )!!.reinterpret()
                )
            }
        }

        /**
         * Creates a new dictionary entry #GVariant. @key and @value must be
         * non-null. @key must be a value of a basic type (ie: not a container).
         *
         * If the @key or @value are floating references (see g_variant_ref_sink()),
         * the new instance takes ownership of them as if via g_variant_ref_sink().
         *
         * @param key a basic #GVariant, the key
         * @param value a #GVariant, the value
         * @return a floating reference to a new dictionary entry #GVariant
         * @since 2.24
         */
        public fun newDictEntry(
            key: Variant,
            `value`: Variant,
        ): Variant =
            Variant(
                g_variant_new_dict_entry(
                    key.glibVariantPointer,
                    `value`.glibVariantPointer
                )!!.reinterpret()
            )

        /**
         * Creates a new double #GVariant instance.
         *
         * @param value a #gdouble floating point value
         * @return a floating reference to a new double #GVariant instance
         * @since 2.24
         */
        public fun newDouble(`value`: Double): Variant = Variant(g_variant_new_double(`value`)!!.reinterpret())

        /**
         * Constructs a new serialized-mode #GVariant instance.  This is the
         * inner interface for creation of new serialized values that gets
         * called from various functions in gvariant.c.
         *
         * A reference is taken on @bytes.
         *
         * The data in @bytes must be aligned appropriately for the @type being loaded.
         * Otherwise this function will internally create a copy of the memory (since
         * GLib 2.60) or (in older versions) fail and exit the process.
         *
         * @param type a #GVariantType
         * @param bytes a #GBytes
         * @param trusted if the contents of @bytes are trusted
         * @return a new #GVariant with a floating reference
         * @since 2.36
         */
        public fun newFromBytes(
            type: VariantType,
            bytes: Bytes,
            trusted: Boolean,
        ): Variant =
            Variant(
                g_variant_new_from_bytes(
                    type.glibVariantTypePointer,
                    bytes.glibBytesPointer,
                    trusted.asGBoolean()
                )!!.reinterpret()
            )

        /**
         * Creates a new handle #GVariant instance.
         *
         * By convention, handles are indexes into an array of file descriptors
         * that are sent alongside a D-Bus message.  If you're not interacting
         * with D-Bus, you probably don't need them.
         *
         * @param value a #gint32 value
         * @return a floating reference to a new handle #GVariant instance
         * @since 2.24
         */
        public fun newHandle(`value`: Int): Variant = Variant(g_variant_new_handle(`value`)!!.reinterpret())

        /**
         * Creates a new int16 #GVariant instance.
         *
         * @param value a #gint16 value
         * @return a floating reference to a new int16 #GVariant instance
         * @since 2.24
         */
        public fun newInt16(`value`: Short): Variant = Variant(g_variant_new_int16(`value`)!!.reinterpret())

        /**
         * Creates a new int32 #GVariant instance.
         *
         * @param value a #gint32 value
         * @return a floating reference to a new int32 #GVariant instance
         * @since 2.24
         */
        public fun newInt32(`value`: Int): Variant = Variant(g_variant_new_int32(`value`)!!.reinterpret())

        /**
         * Creates a new int64 #GVariant instance.
         *
         * @param value a #gint64 value
         * @return a floating reference to a new int64 #GVariant instance
         * @since 2.24
         */
        public fun newInt64(`value`: Long): Variant = Variant(g_variant_new_int64(`value`)!!.reinterpret())

        /**
         * Depending on if @child is null, either wraps @child inside of a
         * maybe container or creates a Nothing instance for the given @type.
         *
         * At least one of @child_type and @child must be non-null.
         * If @child_type is non-null then it must be a definite type.
         * If they are both non-null then @child_type must be the type
         * of @child.
         *
         * If @child is a floating reference (see g_variant_ref_sink()), the new
         * instance takes ownership of @child.
         *
         * @param childType the #GVariantType of the child, or null
         * @param child the child value, or null
         * @return a floating reference to a new #GVariant maybe instance
         * @since 2.24
         */
        public fun newMaybe(
            childType: VariantType? = null,
            child: Variant? = null,
        ): Variant =
            Variant(
                g_variant_new_maybe(
                    childType?.glibVariantTypePointer,
                    child?.glibVariantPointer
                )!!.reinterpret()
            )

        /**
         * Creates a D-Bus object path #GVariant with the contents of @string.
         * @string must be a valid D-Bus object path.  Use
         * g_variant_is_object_path() if you're not sure.
         *
         * @param objectPath a normal C nul-terminated string
         * @return a floating reference to a new object path #GVariant instance
         * @since 2.24
         */
        public fun newObjectPath(objectPath: String): Variant =
            Variant(g_variant_new_object_path(objectPath)!!.reinterpret())

        /**
         * Constructs an array of object paths #GVariant from the given array of
         * strings.
         *
         * Each string must be a valid #GVariant object path; see
         * g_variant_is_object_path().
         *
         * If @length is -1 then @strv is null-terminated.
         *
         * @param strv an array of strings
         * @param length the length of @strv, or -1
         * @return a new floating #GVariant instance
         * @since 2.30
         */
        public fun newObjv(
            strv: List<String>,
            length: Long,
        ): Variant {
            memScoped {
                return Variant(
                    g_variant_new_objv(
                        strv.toCStringList(this),
                        length
                    )!!.reinterpret()
                )
            }
        }

        /**
         * Creates a D-Bus type signature #GVariant with the contents of
         * @string.  @string must be a valid D-Bus type signature.  Use
         * g_variant_is_signature() if you're not sure.
         *
         * @param signature a normal C nul-terminated string
         * @return a floating reference to a new signature #GVariant instance
         * @since 2.24
         */
        public fun newSignature(signature: String): Variant =
            Variant(g_variant_new_signature(signature)!!.reinterpret())

        /**
         * Creates a string #GVariant with the contents of @string.
         *
         * @string must be valid UTF-8, and must not be null. To encode
         * potentially-null strings, use g_variant_new() with `ms` as the
         * [format string][gvariant-format-strings-maybe-types].
         *
         * @param string a normal UTF-8 nul-terminated string
         * @return a floating reference to a new string #GVariant instance
         * @since 2.24
         */
        public fun newString(string: String): Variant = Variant(g_variant_new_string(string)!!.reinterpret())

        /**
         * Constructs an array of strings #GVariant from the given array of
         * strings.
         *
         * If @length is -1 then @strv is null-terminated.
         *
         * @param strv an array of strings
         * @param length the length of @strv, or -1
         * @return a new floating #GVariant instance
         * @since 2.24
         */
        public fun newStrv(
            strv: List<String>,
            length: Long,
        ): Variant {
            memScoped {
                return Variant(
                    g_variant_new_strv(
                        strv.toCStringList(this),
                        length
                    )!!.reinterpret()
                )
            }
        }

        /**
         * Creates a new uint16 #GVariant instance.
         *
         * @param value a #guint16 value
         * @return a floating reference to a new uint16 #GVariant instance
         * @since 2.24
         */
        public fun newUint16(`value`: UShort): Variant = Variant(g_variant_new_uint16(`value`)!!.reinterpret())

        /**
         * Creates a new uint32 #GVariant instance.
         *
         * @param value a #guint32 value
         * @return a floating reference to a new uint32 #GVariant instance
         * @since 2.24
         */
        public fun newUint32(`value`: UInt): Variant = Variant(g_variant_new_uint32(`value`)!!.reinterpret())

        /**
         * Creates a new uint64 #GVariant instance.
         *
         * @param value a #guint64 value
         * @return a floating reference to a new uint64 #GVariant instance
         * @since 2.24
         */
        public fun newUint64(`value`: ULong): Variant = Variant(g_variant_new_uint64(`value`)!!.reinterpret())

        /**
         * Boxes @value.  The result is a #GVariant instance representing a
         * variant containing the original value.
         *
         * If @child is a floating reference (see g_variant_ref_sink()), the new
         * instance takes ownership of @child.
         *
         * @param value a #GVariant instance
         * @return a floating reference to a new variant #GVariant instance
         * @since 2.24
         */
        public fun newVariant(`value`: Variant): Variant =
            Variant(g_variant_new_variant(`value`.glibVariantPointer)!!.reinterpret())

        /**
         * Determines if a given string is a valid D-Bus object path.  You
         * should ensure that a string is a valid D-Bus object path before
         * passing it to g_variant_new_object_path().
         *
         * A valid object path starts with `/` followed by zero or more
         * sequences of characters separated by `/` characters.  Each sequence
         * must contain only the characters `[A-Z][a-z][0-9]_`.  No sequence
         * (including the one following the final `/` character) may be empty.
         *
         * @param string a normal C nul-terminated string
         * @return true if @string is a D-Bus object path
         * @since 2.24
         */
        public fun isObjectPath(string: String): Boolean = g_variant_is_object_path(string).asBoolean()

        /**
         * Determines if a given string is a valid D-Bus type signature.  You
         * should ensure that a string is a valid D-Bus type signature before
         * passing it to g_variant_new_signature().
         *
         * D-Bus type signatures consist of zero or more definite #GVariantType
         * strings in sequence.
         *
         * @param string a normal C nul-terminated string
         * @return true if @string is a D-Bus type signature
         * @since 2.24
         */
        public fun isSignature(string: String): Boolean = g_variant_is_signature(string).asBoolean()

        /**
         * Pretty-prints a message showing the context of a #GVariant parse
         * error within the string for which parsing was attempted.
         *
         * The resulting string is suitable for output to the console or other
         * monospace media where newlines are treated in the usual way.
         *
         * The message will typically look something like one of the following:
         *
         * |[
         * unterminated string constant:
         *   (1, 2, 3, 'abc
         *             ^^^^
         * ]|
         *
         * or
         *
         * |[
         * unable to find a common type:
         *   [1, 2, 3, 'str']
         *    ^        ^^^^^
         * ]|
         *
         * The format of the message may change in a future version.
         *
         * @error must have come from a failed attempt to g_variant_parse() and
         * @source_str must be exactly the same string that caused the error.
         * If @source_str was not nul-terminated when you passed it to
         * g_variant_parse() then you must add nul termination before using this
         * function.
         *
         * @param error a #GError from the #GVariantParseError domain
         * @param sourceStr the string that was given to the parser
         * @return the printed message
         * @since 2.40
         */
        public fun parseErrorPrintContext(
            error: Error,
            sourceStr: String,
        ): String =
            g_variant_parse_error_print_context(error.glibErrorPointer, sourceStr)?.toKString()
                ?: error("Expected not null string")

        public fun parseErrorQuark(): UInt = g_variant_parse_error_quark()

        /**
         * Same as g_variant_error_quark().
         */
        public fun parserGetErrorQuark(): UInt = g_variant_parser_get_error_quark()

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Variant = Variant(pointer.reinterpret())
    }
}

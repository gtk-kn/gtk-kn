// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gobject.GValue
import org.gtkkn.native.gobject.g_value_copy
import org.gtkkn.native.gobject.g_value_dup_object
import org.gtkkn.native.gobject.g_value_dup_string
import org.gtkkn.native.gobject.g_value_dup_variant
import org.gtkkn.native.gobject.g_value_fits_pointer
import org.gtkkn.native.gobject.g_value_get_boolean
import org.gtkkn.native.gobject.g_value_get_char
import org.gtkkn.native.gobject.g_value_get_double
import org.gtkkn.native.gobject.g_value_get_enum
import org.gtkkn.native.gobject.g_value_get_flags
import org.gtkkn.native.gobject.g_value_get_float
import org.gtkkn.native.gobject.g_value_get_gtype
import org.gtkkn.native.gobject.g_value_get_int
import org.gtkkn.native.gobject.g_value_get_int64
import org.gtkkn.native.gobject.g_value_get_long
import org.gtkkn.native.gobject.g_value_get_object
import org.gtkkn.native.gobject.g_value_get_param
import org.gtkkn.native.gobject.g_value_get_string
import org.gtkkn.native.gobject.g_value_get_uint
import org.gtkkn.native.gobject.g_value_get_uint64
import org.gtkkn.native.gobject.g_value_get_ulong
import org.gtkkn.native.gobject.g_value_get_variant
import org.gtkkn.native.gobject.g_value_init
import org.gtkkn.native.gobject.g_value_init_from_instance
import org.gtkkn.native.gobject.g_value_reset
import org.gtkkn.native.gobject.g_value_set_boolean
import org.gtkkn.native.gobject.g_value_set_char
import org.gtkkn.native.gobject.g_value_set_double
import org.gtkkn.native.gobject.g_value_set_enum
import org.gtkkn.native.gobject.g_value_set_flags
import org.gtkkn.native.gobject.g_value_set_float
import org.gtkkn.native.gobject.g_value_set_gtype
import org.gtkkn.native.gobject.g_value_set_int
import org.gtkkn.native.gobject.g_value_set_int64
import org.gtkkn.native.gobject.g_value_set_interned_string
import org.gtkkn.native.gobject.g_value_set_long
import org.gtkkn.native.gobject.g_value_set_object
import org.gtkkn.native.gobject.g_value_set_param
import org.gtkkn.native.gobject.g_value_set_static_string
import org.gtkkn.native.gobject.g_value_set_string
import org.gtkkn.native.gobject.g_value_set_uint
import org.gtkkn.native.gobject.g_value_set_uint64
import org.gtkkn.native.gobject.g_value_set_ulong
import org.gtkkn.native.gobject.g_value_set_variant
import org.gtkkn.native.gobject.g_value_steal_string
import org.gtkkn.native.gobject.g_value_take_variant
import org.gtkkn.native.gobject.g_value_transform
import org.gtkkn.native.gobject.g_value_type_compatible
import org.gtkkn.native.gobject.g_value_type_transformable
import org.gtkkn.native.gobject.g_value_unset
import kotlin.Boolean
import kotlin.Char
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.UInt
import kotlin.ULong
import kotlin.Unit

/**
 * An opaque structure used to hold different types of values.
 *
 * The data within the structure has protected scope: it is accessible only
 * to functions within a #GTypeValueTable structure, or implementations of
 * the g_value_*() API. That is, code portions which implement new fundamental
 * types.
 *
 * #GValue users cannot make any assumptions about how data is stored
 * within the 2 element @data union, and the @g_type member should
 * only be accessed through the G_VALUE_TYPE() macro.
 *
 * ## Skipped during bindings generation
 *
 * - method `get_boxed`: Return type gpointer is unsupported
 * - method `get_pointer`: Return type gpointer is unsupported
 * - method `get_schar`: Return type gint8 is unsupported
 * - method `get_uchar`: Return type guint8 is unsupported
 * - method `peek_pointer`: Return type gpointer is unsupported
 * - parameter `v_boxed`: gpointer
 * - parameter `v_boxed`: gpointer
 * - parameter `instance`: gpointer
 * - parameter `v_pointer`: gpointer
 * - parameter `v_char`: gint8
 * - parameter `v_boxed`: gpointer
 * - method `set_string_take_ownership`: C function g_value_set_string_take_ownership is ignored
 * - parameter `v_uchar`: guint8
 * - parameter `v_boxed`: gpointer
 * - method `take_string`: C function g_value_take_string is ignored
 * - field `g_type`: Record field g_type is private
 * - field `data`: Fields with arrays are not supported
 */
public class Value(
    pointer: CPointer<GValue>,
) : Record {
    public val gobjectValuePointer: CPointer<GValue> = pointer

    /**
     * Copies the value of @src_value into @dest_value.
     *
     * @param destValue An initialized #GValue structure of the same type as @src_value.
     */
    public fun copy(destValue: Value): Unit =
        g_value_copy(gobjectValuePointer.reinterpret(), destValue.gobjectValuePointer)

    /**
     * Get the contents of a %G_TYPE_OBJECT derived #GValue, increasing
     * its reference count. If the contents of the #GValue are null, then
     * null will be returned.
     *
     * @return object content of @value,
     *          should be unreferenced when no longer needed.
     */
    public fun dupObject(): Object? =
        g_value_dup_object(gobjectValuePointer.reinterpret())?.run {
            Object(reinterpret())
        }

    /**
     * Get a copy the contents of a %G_TYPE_STRING #GValue.
     *
     * @return a newly allocated copy of the string content of @value
     */
    public fun dupString(): String? = g_value_dup_string(gobjectValuePointer.reinterpret())?.toKString()

    /**
     * Get the contents of a variant #GValue, increasing its refcount. The returned
     * #GVariant is never floating.
     *
     * @return variant contents of @value (may be null);
     *    should be unreffed using g_variant_unref() when no longer needed
     * @since 2.26
     */
    public fun dupVariant(): Variant? =
        g_value_dup_variant(gobjectValuePointer.reinterpret())?.run {
            Variant(reinterpret())
        }

    /**
     * Determines if @value will fit inside the size of a pointer value.
     * This is an internal function introduced mainly for C marshallers.
     *
     * @return true if @value will fit inside a pointer value.
     */
    public fun fitsPointer(): Boolean = g_value_fits_pointer(gobjectValuePointer.reinterpret()).asBoolean()

    /**
     * Get the contents of a %G_TYPE_BOOLEAN #GValue.
     *
     * @return boolean contents of @value
     */
    public fun getBoolean(): Boolean = g_value_get_boolean(gobjectValuePointer.reinterpret()).asBoolean()

    /**
     * Do not use this function; it is broken on platforms where the %char
     * type is unsigned, such as ARM and PowerPC.  See g_value_get_schar().
     *
     * Get the contents of a %G_TYPE_CHAR #GValue.
     *
     * @return character contents of @value
     */
    public fun getChar(): Char = g_value_get_char(gobjectValuePointer.reinterpret()).toInt().toChar()

    /**
     * Get the contents of a %G_TYPE_DOUBLE #GValue.
     *
     * @return double contents of @value
     */
    public fun getDouble(): Double = g_value_get_double(gobjectValuePointer.reinterpret())

    /**
     * Get the contents of a %G_TYPE_ENUM #GValue.
     *
     * @return enum contents of @value
     */
    public fun getEnum(): Int = g_value_get_enum(gobjectValuePointer.reinterpret())

    /**
     * Get the contents of a %G_TYPE_FLAGS #GValue.
     *
     * @return flags contents of @value
     */
    public fun getFlags(): UInt = g_value_get_flags(gobjectValuePointer.reinterpret())

    /**
     * Get the contents of a %G_TYPE_FLOAT #GValue.
     *
     * @return float contents of @value
     */
    public fun getFloat(): Float = g_value_get_float(gobjectValuePointer.reinterpret())

    /**
     * Get the contents of a %G_TYPE_GTYPE #GValue.
     *
     * @return the #GType stored in @value
     * @since 2.12
     */
    public fun getGtype(): ULong = g_value_get_gtype(gobjectValuePointer.reinterpret())

    /**
     * Get the contents of a %G_TYPE_INT #GValue.
     *
     * @return integer contents of @value
     */
    public fun getInt(): Int = g_value_get_int(gobjectValuePointer.reinterpret())

    /**
     * Get the contents of a %G_TYPE_INT64 #GValue.
     *
     * @return 64bit integer contents of @value
     */
    public fun getInt64(): Long = g_value_get_int64(gobjectValuePointer.reinterpret())

    /**
     * Get the contents of a %G_TYPE_LONG #GValue.
     *
     * @return long integer contents of @value
     */
    public fun getLong(): Long = g_value_get_long(gobjectValuePointer.reinterpret())

    /**
     * Get the contents of a %G_TYPE_OBJECT derived #GValue.
     *
     * @return object contents of @value
     */
    public fun getObject(): Object? =
        g_value_get_object(gobjectValuePointer.reinterpret())?.run {
            Object(reinterpret())
        }

    /**
     * Get the contents of a %G_TYPE_PARAM #GValue.
     *
     * @return #GParamSpec content of @value
     */
    public fun getParam(): ParamSpec =
        g_value_get_param(gobjectValuePointer.reinterpret())!!.run {
            ParamSpec(reinterpret())
        }

    /**
     * Get the contents of a %G_TYPE_STRING #GValue.
     *
     * @return string content of @value
     */
    public fun getString(): String? = g_value_get_string(gobjectValuePointer.reinterpret())?.toKString()

    /**
     * Get the contents of a %G_TYPE_UINT #GValue.
     *
     * @return unsigned integer contents of @value
     */
    public fun getUint(): UInt = g_value_get_uint(gobjectValuePointer.reinterpret())

    /**
     * Get the contents of a %G_TYPE_UINT64 #GValue.
     *
     * @return unsigned 64bit integer contents of @value
     */
    public fun getUint64(): ULong = g_value_get_uint64(gobjectValuePointer.reinterpret())

    /**
     * Get the contents of a %G_TYPE_ULONG #GValue.
     *
     * @return unsigned long integer contents of @value
     */
    public fun getUlong(): ULong = g_value_get_ulong(gobjectValuePointer.reinterpret())

    /**
     * Get the contents of a variant #GValue.
     *
     * @return variant contents of @value (may be null)
     * @since 2.26
     */
    public fun getVariant(): Variant? =
        g_value_get_variant(gobjectValuePointer.reinterpret())?.run {
            Variant(reinterpret())
        }

    /**
     * Initializes @value with the default value of @type.
     *
     * @param gType Type the #GValue should hold values of.
     * @return the #GValue structure that has been passed in
     */
    public fun `init`(gType: ULong): Value =
        g_value_init(gobjectValuePointer.reinterpret(), gType)!!.run {
            Value(reinterpret())
        }

    /**
     * Initializes and sets @value from an instantiatable type via the
     * value_table's collect_value() function.
     *
     * Note: The @value will be initialised with the exact type of
     * @instance.  If you wish to set the @value's type to a different GType
     * (such as a parent class GType), you need to manually call
     * g_value_init() and g_value_set_instance().
     *
     * @param instance the instance
     * @since 2.42
     */
    public fun initFromInstance(instance: TypeInstance): Unit =
        g_value_init_from_instance(gobjectValuePointer.reinterpret(), instance.gobjectTypeInstancePointer)

    /**
     * Clears the current value in @value and resets it to the default value
     * (as if the value had just been initialized).
     *
     * @return the #GValue structure that has been passed in
     */
    public fun reset(): Value =
        g_value_reset(gobjectValuePointer.reinterpret())!!.run {
            Value(reinterpret())
        }

    /**
     * Set the contents of a %G_TYPE_BOOLEAN #GValue to @v_boolean.
     *
     * @param vBoolean boolean value to be set
     */
    public fun setBoolean(vBoolean: Boolean): Unit =
        g_value_set_boolean(gobjectValuePointer.reinterpret(), vBoolean.asGBoolean())

    /**
     * Set the contents of a %G_TYPE_CHAR #GValue to @v_char.
     *
     * @param vChar character value to be set
     */
    public fun setChar(vChar: Char): Unit = g_value_set_char(gobjectValuePointer.reinterpret(), vChar.code.toByte())

    /**
     * Set the contents of a %G_TYPE_DOUBLE #GValue to @v_double.
     *
     * @param vDouble double value to be set
     */
    public fun setDouble(vDouble: Double): Unit = g_value_set_double(gobjectValuePointer.reinterpret(), vDouble)

    /**
     * Set the contents of a %G_TYPE_ENUM #GValue to @v_enum.
     *
     * @param vEnum enum value to be set
     */
    public fun setEnum(vEnum: Int): Unit = g_value_set_enum(gobjectValuePointer.reinterpret(), vEnum)

    /**
     * Set the contents of a %G_TYPE_FLAGS #GValue to @v_flags.
     *
     * @param vFlags flags value to be set
     */
    public fun setFlags(vFlags: UInt): Unit = g_value_set_flags(gobjectValuePointer.reinterpret(), vFlags)

    /**
     * Set the contents of a %G_TYPE_FLOAT #GValue to @v_float.
     *
     * @param vFloat float value to be set
     */
    public fun setFloat(vFloat: Float): Unit = g_value_set_float(gobjectValuePointer.reinterpret(), vFloat)

    /**
     * Set the contents of a %G_TYPE_GTYPE #GValue to @v_gtype.
     *
     * @param vGtype #GType to be set
     * @since 2.12
     */
    public fun setGtype(vGtype: ULong): Unit = g_value_set_gtype(gobjectValuePointer.reinterpret(), vGtype)

    /**
     * Set the contents of a %G_TYPE_INT #GValue to @v_int.
     *
     * @param vInt integer value to be set
     */
    public fun setInt(vInt: Int): Unit = g_value_set_int(gobjectValuePointer.reinterpret(), vInt)

    /**
     * Set the contents of a %G_TYPE_INT64 #GValue to @v_int64.
     *
     * @param vInt64 64bit integer value to be set
     */
    public fun setInt64(vInt64: Long): Unit = g_value_set_int64(gobjectValuePointer.reinterpret(), vInt64)

    /**
     * Set the contents of a %G_TYPE_STRING #GValue to @v_string.  The string is
     * assumed to be static and interned (canonical, for example from
     * g_intern_string()), and is thus not duplicated when setting the #GValue.
     *
     * @param vString static string to be set
     * @since 2.66
     */
    public fun setInternedString(vString: String? = null): Unit =
        g_value_set_interned_string(gobjectValuePointer.reinterpret(), vString)

    /**
     * Set the contents of a %G_TYPE_LONG #GValue to @v_long.
     *
     * @param vLong long integer value to be set
     */
    public fun setLong(vLong: Long): Unit = g_value_set_long(gobjectValuePointer.reinterpret(), vLong)

    /**
     * Set the contents of a %G_TYPE_OBJECT derived #GValue to @v_object.
     *
     * g_value_set_object() increases the reference count of @v_object
     * (the #GValue holds a reference to @v_object).  If you do not wish
     * to increase the reference count of the object (i.e. you wish to
     * pass your current reference to the #GValue because you no longer
     * need it), use g_value_take_object() instead.
     *
     * It is important that your #GValue holds a reference to @v_object (either its
     * own, or one it has taken) to ensure that the object won't be destroyed while
     * the #GValue still exists).
     *
     * @param vObject object value to be set
     */
    public fun setObject(vObject: Object? = null): Unit =
        g_value_set_object(gobjectValuePointer.reinterpret(), vObject?.gPointer?.reinterpret())

    /**
     * Set the contents of a %G_TYPE_PARAM #GValue to @param.
     *
     * @param param the #GParamSpec to be set
     */
    public fun setParam(`param`: ParamSpec? = null): Unit =
        g_value_set_param(gobjectValuePointer.reinterpret(), `param`?.gPointer?.reinterpret())

    /**
     * Set the contents of a %G_TYPE_STRING #GValue to @v_string.
     * The string is assumed to be static, and is thus not duplicated
     * when setting the #GValue.
     *
     * If the the string is a canonical string, using g_value_set_interned_string()
     * is more appropriate.
     *
     * @param vString static string to be set
     */
    public fun setStaticString(vString: String? = null): Unit =
        g_value_set_static_string(gobjectValuePointer.reinterpret(), vString)

    /**
     * Set the contents of a %G_TYPE_STRING #GValue to a copy of @v_string.
     *
     * @param vString caller-owned string to be duplicated for the #GValue
     */
    public fun setString(vString: String? = null): Unit = g_value_set_string(gobjectValuePointer.reinterpret(), vString)

    /**
     * Set the contents of a %G_TYPE_UINT #GValue to @v_uint.
     *
     * @param vUint unsigned integer value to be set
     */
    public fun setUint(vUint: UInt): Unit = g_value_set_uint(gobjectValuePointer.reinterpret(), vUint)

    /**
     * Set the contents of a %G_TYPE_UINT64 #GValue to @v_uint64.
     *
     * @param vUint64 unsigned 64bit integer value to be set
     */
    public fun setUint64(vUint64: ULong): Unit = g_value_set_uint64(gobjectValuePointer.reinterpret(), vUint64)

    /**
     * Set the contents of a %G_TYPE_ULONG #GValue to @v_ulong.
     *
     * @param vUlong unsigned long integer value to be set
     */
    public fun setUlong(vUlong: ULong): Unit = g_value_set_ulong(gobjectValuePointer.reinterpret(), vUlong)

    /**
     * Set the contents of a variant #GValue to @variant.
     * If the variant is floating, it is consumed.
     *
     * @param variant a #GVariant, or null
     * @since 2.26
     */
    public fun setVariant(variant: Variant? = null): Unit =
        g_value_set_variant(gobjectValuePointer.reinterpret(), variant?.glibVariantPointer)

    /**
     * Steal ownership on contents of a %G_TYPE_STRING #GValue.
     * As a result of this operation the value's contents will be reset to null.
     *
     * The purpose of this call is to provide a way to avoid an extra copy
     * when some object have been serialized into string through #GValue API.
     *
     * NOTE: for safety and compatibility purposes, if #GValue contains
     * static string, or an interned one, this function will return a copy
     * of the string. Otherwise the transfer notation would be ambiguous.
     *
     * @return string content of @value;
     *  Should be freed with g_free() when no longer needed.
     * @since 2.80
     */
    public fun stealString(): String =
        g_value_steal_string(gobjectValuePointer.reinterpret())?.toKString() ?: error("Expected not null string")

    /**
     * Set the contents of a variant #GValue to @variant, and takes over
     * the ownership of the caller's reference to @variant;
     * the caller doesn't have to unref it any more (i.e. the reference
     * count of the variant is not increased).
     *
     * If @variant was floating then its floating reference is converted to
     * a hard reference.
     *
     * If you want the #GValue to hold its own reference to @variant, use
     * g_value_set_variant() instead.
     *
     * This is an internal function introduced mainly for C marshallers.
     *
     * @param variant a #GVariant, or null
     * @since 2.26
     */
    public fun takeVariant(variant: Variant? = null): Unit =
        g_value_take_variant(gobjectValuePointer.reinterpret(), variant?.glibVariantPointer)

    /**
     * Tries to cast the contents of @src_value into a type appropriate
     * to store in @dest_value, e.g. to transform a %G_TYPE_INT value
     * into a %G_TYPE_FLOAT value. Performing transformations between
     * value types might incur precision lossage. Especially
     * transformations into strings might reveal seemingly arbitrary
     * results and shouldn't be relied upon for production code (such
     * as rcfile value or object property serialization).
     *
     * @param destValue Target value.
     * @return Whether a transformation rule was found and could be applied.
     *  Upon failing transformations, @dest_value is left untouched.
     */
    public fun transform(destValue: Value): Boolean =
        g_value_transform(gobjectValuePointer.reinterpret(), destValue.gobjectValuePointer).asBoolean()

    /**
     * Clears the current value in @value (if any) and "unsets" the type,
     * this releases all resources associated with this GValue. An unset
     * value is the same as an uninitialized (zero-filled) #GValue
     * structure.
     */
    public fun unset(): Unit = g_value_unset(gobjectValuePointer.reinterpret())

    public companion object : RecordCompanion<Value, GValue> {
        /**
         * Returns whether a #GValue of type @src_type can be copied into
         * a #GValue of type @dest_type.
         *
         * @param srcType source type to be copied.
         * @param destType destination type for copying.
         * @return true if g_value_copy() is possible with @src_type and @dest_type.
         */
        public fun typeCompatible(
            srcType: ULong,
            destType: ULong,
        ): Boolean = g_value_type_compatible(srcType, destType).asBoolean()

        /**
         * Check whether g_value_transform() is able to transform values
         * of type @src_type into values of type @dest_type. Note that for
         * the types to be transformable, they must be compatible or a
         * transformation function must be registered.
         *
         * @param srcType Source type.
         * @param destType Target type.
         * @return true if the transformation is possible, false otherwise.
         */
        public fun typeTransformable(
            srcType: ULong,
            destType: ULong,
        ): Boolean = g_value_type_transformable(srcType, destType).asBoolean()

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Value = Value(pointer.reinterpret())
    }
}

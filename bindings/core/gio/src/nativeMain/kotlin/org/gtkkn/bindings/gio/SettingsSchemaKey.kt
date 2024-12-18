// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.annotations.GioVersion2_34
import org.gtkkn.bindings.gio.annotations.GioVersion2_40
import org.gtkkn.bindings.gio.annotations.GioVersion2_44
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.bindings.glib.VariantType
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.gio.GSettingsSchemaKey
import org.gtkkn.native.gio.g_settings_schema_key_get_default_value
import org.gtkkn.native.gio.g_settings_schema_key_get_description
import org.gtkkn.native.gio.g_settings_schema_key_get_name
import org.gtkkn.native.gio.g_settings_schema_key_get_range
import org.gtkkn.native.gio.g_settings_schema_key_get_summary
import org.gtkkn.native.gio.g_settings_schema_key_get_type
import org.gtkkn.native.gio.g_settings_schema_key_get_value_type
import org.gtkkn.native.gio.g_settings_schema_key_range_check
import org.gtkkn.native.gio.g_settings_schema_key_ref
import org.gtkkn.native.gio.g_settings_schema_key_unref
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * #GSettingsSchemaKey is an opaque data structure and can only be accessed
 * using the following functions.
 */
public class SettingsSchemaKey(pointer: CPointer<GSettingsSchemaKey>) : ProxyInstance(pointer) {
    public val gioSettingsSchemaKeyPointer: CPointer<GSettingsSchemaKey> = pointer

    /**
     * Gets the default value for @key.
     *
     * Note that this is the default value according to the schema.  System
     * administrator defaults and lockdown are not visible via this API.
     *
     * @return the default value for the key
     * @since 2.40
     */
    @GioVersion2_40
    public fun getDefaultValue(): Variant =
        g_settings_schema_key_get_default_value(gioSettingsSchemaKeyPointer.reinterpret())!!.run {
            Variant(reinterpret())
        }

    /**
     * Gets the description for @key.
     *
     * If no description has been provided in the schema for @key, returns
     * null.
     *
     * The description can be one sentence to several paragraphs in length.
     * Paragraphs are delimited with a double newline.  Descriptions can be
     * translated and the value returned from this function is is the
     * current locale.
     *
     * This function is slow.  The summary and description information for
     * the schemas is not stored in the compiled schema database so this
     * function has to parse all of the source XML files in the schema
     * directory.
     *
     * @return the description for @key, or null
     * @since 2.34
     */
    @GioVersion2_34
    public fun getDescription(): String? =
        g_settings_schema_key_get_description(gioSettingsSchemaKeyPointer.reinterpret())?.toKString()

    /**
     * Gets the name of @key.
     *
     * @return the name of @key.
     * @since 2.44
     */
    @GioVersion2_44
    public fun getName(): String =
        g_settings_schema_key_get_name(gioSettingsSchemaKeyPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Queries the range of a key.
     *
     * This function will return a #GVariant that fully describes the range
     * of values that are valid for @key.
     *
     * The type of #GVariant returned is `(sv)`. The string describes
     * the type of range restriction in effect. The type and meaning of
     * the value contained in the variant depends on the string.
     *
     * If the string is `'type'` then the variant contains an empty array.
     * The element type of that empty array is the expected type of value
     * and all values of that type are valid.
     *
     * If the string is `'enum'` then the variant contains an array
     * enumerating the possible values. Each item in the array is
     * a possible valid value and no other values are valid.
     *
     * If the string is `'flags'` then the variant contains an array. Each
     * item in the array is a value that may appear zero or one times in an
     * array to be used as the value for this key. For example, if the
     * variant contained the array `['x', 'y']` then the valid values for
     * the key would be `[]`, `['x']`, `['y']`, `['x', 'y']` and
     * `['y', 'x']`.
     *
     * Finally, if the string is `'range'` then the variant contains a pair
     * of like-typed values -- the minimum and maximum permissible values
     * for this key.
     *
     * This information should not be used by normal programs.  It is
     * considered to be a hint for introspection purposes.  Normal programs
     * should already know what is permitted by their own schema.  The
     * format may change in any way in the future -- but particularly, new
     * forms may be added to the possibilities described above.
     *
     * You should free the returned value with g_variant_unref() when it is
     * no longer needed.
     *
     * @return a #GVariant describing the range
     * @since 2.40
     */
    @GioVersion2_40
    public fun getRange(): Variant = g_settings_schema_key_get_range(gioSettingsSchemaKeyPointer.reinterpret())!!.run {
        Variant(reinterpret())
    }

    /**
     * Gets the summary for @key.
     *
     * If no summary has been provided in the schema for @key, returns
     * null.
     *
     * The summary is a short description of the purpose of the key; usually
     * one short sentence.  Summaries can be translated and the value
     * returned from this function is is the current locale.
     *
     * This function is slow.  The summary and description information for
     * the schemas is not stored in the compiled schema database so this
     * function has to parse all of the source XML files in the schema
     * directory.
     *
     * @return the summary for @key, or null
     * @since 2.34
     */
    @GioVersion2_34
    public fun getSummary(): String? =
        g_settings_schema_key_get_summary(gioSettingsSchemaKeyPointer.reinterpret())?.toKString()

    /**
     * Gets the #GVariantType of @key.
     *
     * @return the type of @key
     * @since 2.40
     */
    @GioVersion2_40
    public fun getValueType(): VariantType =
        g_settings_schema_key_get_value_type(gioSettingsSchemaKeyPointer.reinterpret())!!.run {
            VariantType(reinterpret())
        }

    /**
     * Checks if the given @value is within the
     * permitted range for @key.
     *
     * It is a programmer error if @value is not of the correct type — you
     * must check for this first.
     *
     * @param value the value to check
     * @return true if @value is valid for @key
     * @since 2.40
     */
    @GioVersion2_40
    public fun rangeCheck(`value`: Variant): Boolean = g_settings_schema_key_range_check(
        gioSettingsSchemaKeyPointer.reinterpret(),
        `value`.glibVariantPointer.reinterpret()
    ).asBoolean()

    /**
     * Increase the reference count of @key, returning a new reference.
     *
     * @return a new reference to @key
     * @since 2.40
     */
    @GioVersion2_40
    public fun ref(): SettingsSchemaKey = g_settings_schema_key_ref(gioSettingsSchemaKeyPointer.reinterpret())!!.run {
        SettingsSchemaKey(reinterpret())
    }

    /**
     * Decrease the reference count of @key, possibly freeing it.
     *
     * @since 2.40
     */
    @GioVersion2_40
    public fun unref(): Unit = g_settings_schema_key_unref(gioSettingsSchemaKeyPointer.reinterpret())

    public companion object {
        /**
         * Get the GType of SettingsSchemaKey
         *
         * @return the GType
         */
        public fun getType(): GType = g_settings_schema_key_get_type()
    }
}

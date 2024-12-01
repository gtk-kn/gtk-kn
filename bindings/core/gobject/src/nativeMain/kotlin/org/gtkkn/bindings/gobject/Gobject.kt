// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.Quark
import org.gtkkn.bindings.glib.Source
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.bindings.glib.VariantType
import org.gtkkn.bindings.gobject.annotations.GObjectVersion2_10
import org.gtkkn.bindings.gobject.annotations.GObjectVersion2_24
import org.gtkkn.bindings.gobject.annotations.GObjectVersion2_26
import org.gtkkn.bindings.gobject.annotations.GObjectVersion2_34
import org.gtkkn.bindings.gobject.annotations.GObjectVersion2_36
import org.gtkkn.bindings.gobject.annotations.GObjectVersion2_4
import org.gtkkn.bindings.gobject.annotations.GObjectVersion2_44
import org.gtkkn.bindings.gobject.annotations.GObjectVersion2_66
import org.gtkkn.bindings.gobject.annotations.GObjectVersion2_68
import org.gtkkn.bindings.gobject.annotations.GObjectVersion2_74
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.GlibException
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.native.gobject.GBinding
import org.gtkkn.native.gobject.GClosure
import org.gtkkn.native.gobject.GInterfaceInfo
import org.gtkkn.native.gobject.GObject
import org.gtkkn.native.gobject.GParamSpec
import org.gtkkn.native.gobject.GSignalInvocationHint
import org.gtkkn.native.gobject.GTypeClass
import org.gtkkn.native.gobject.GTypeInfo
import org.gtkkn.native.gobject.GTypeInstance
import org.gtkkn.native.gobject.GTypeInterface
import org.gtkkn.native.gobject.GTypePlugin
import org.gtkkn.native.gobject.GTypeValueTable
import org.gtkkn.native.gobject.GValue
import org.gtkkn.native.gobject.g_enum_get_value
import org.gtkkn.native.gobject.g_enum_get_value_by_name
import org.gtkkn.native.gobject.g_enum_get_value_by_nick
import org.gtkkn.native.gobject.g_enum_register_static
import org.gtkkn.native.gobject.g_flags_get_first_value
import org.gtkkn.native.gobject.g_flags_get_value_by_name
import org.gtkkn.native.gobject.g_flags_get_value_by_nick
import org.gtkkn.native.gobject.g_flags_register_static
import org.gtkkn.native.gobject.g_gtype_get_type
import org.gtkkn.native.gobject.g_param_spec_boolean
import org.gtkkn.native.gobject.g_param_spec_boxed
import org.gtkkn.native.gobject.g_param_spec_char
import org.gtkkn.native.gobject.g_param_spec_double
import org.gtkkn.native.gobject.g_param_spec_enum
import org.gtkkn.native.gobject.g_param_spec_flags
import org.gtkkn.native.gobject.g_param_spec_float
import org.gtkkn.native.gobject.g_param_spec_gtype
import org.gtkkn.native.gobject.g_param_spec_int
import org.gtkkn.native.gobject.g_param_spec_int64
import org.gtkkn.native.gobject.g_param_spec_long
import org.gtkkn.native.gobject.g_param_spec_object
import org.gtkkn.native.gobject.g_param_spec_param
import org.gtkkn.native.gobject.g_param_spec_pointer
import org.gtkkn.native.gobject.g_param_spec_string
import org.gtkkn.native.gobject.g_param_spec_uchar
import org.gtkkn.native.gobject.g_param_spec_uint
import org.gtkkn.native.gobject.g_param_spec_uint64
import org.gtkkn.native.gobject.g_param_spec_ulong
import org.gtkkn.native.gobject.g_param_spec_unichar
import org.gtkkn.native.gobject.g_param_spec_variant
import org.gtkkn.native.gobject.g_param_type_register_static
import org.gtkkn.native.gobject.g_param_value_convert
import org.gtkkn.native.gobject.g_param_value_defaults
import org.gtkkn.native.gobject.g_param_value_is_valid
import org.gtkkn.native.gobject.g_param_value_set_default
import org.gtkkn.native.gobject.g_param_value_validate
import org.gtkkn.native.gobject.g_param_values_cmp
import org.gtkkn.native.gobject.g_pointer_type_register_static
import org.gtkkn.native.gobject.g_signal_add_emission_hook
import org.gtkkn.native.gobject.g_signal_connect_closure
import org.gtkkn.native.gobject.g_signal_connect_closure_by_id
import org.gtkkn.native.gobject.g_signal_get_invocation_hint
import org.gtkkn.native.gobject.g_signal_handler_block
import org.gtkkn.native.gobject.g_signal_handler_disconnect
import org.gtkkn.native.gobject.g_signal_handler_is_connected
import org.gtkkn.native.gobject.g_signal_handler_unblock
import org.gtkkn.native.gobject.g_signal_handlers_destroy
import org.gtkkn.native.gobject.g_signal_has_handler_pending
import org.gtkkn.native.gobject.g_signal_is_valid_name
import org.gtkkn.native.gobject.g_signal_lookup
import org.gtkkn.native.gobject.g_signal_name
import org.gtkkn.native.gobject.g_signal_override_class_closure
import org.gtkkn.native.gobject.g_signal_query
import org.gtkkn.native.gobject.g_signal_remove_emission_hook
import org.gtkkn.native.gobject.g_signal_stop_emission
import org.gtkkn.native.gobject.g_signal_stop_emission_by_name
import org.gtkkn.native.gobject.g_signal_type_cclosure_new
import org.gtkkn.native.gobject.g_source_set_closure
import org.gtkkn.native.gobject.g_source_set_dummy_callback
import org.gtkkn.native.gobject.g_type_add_class_private
import org.gtkkn.native.gobject.g_type_add_instance_private
import org.gtkkn.native.gobject.g_type_add_interface_dynamic
import org.gtkkn.native.gobject.g_type_add_interface_static
import org.gtkkn.native.gobject.g_type_check_class_is_a
import org.gtkkn.native.gobject.g_type_check_instance
import org.gtkkn.native.gobject.g_type_check_instance_is_a
import org.gtkkn.native.gobject.g_type_check_instance_is_fundamentally_a
import org.gtkkn.native.gobject.g_type_check_is_value_type
import org.gtkkn.native.gobject.g_type_check_value
import org.gtkkn.native.gobject.g_type_check_value_holds
import org.gtkkn.native.gobject.g_type_class_peek
import org.gtkkn.native.gobject.g_type_class_peek_static
import org.gtkkn.native.gobject.g_type_class_ref
import org.gtkkn.native.gobject.g_type_default_interface_peek
import org.gtkkn.native.gobject.g_type_default_interface_ref
import org.gtkkn.native.gobject.g_type_default_interface_unref
import org.gtkkn.native.gobject.g_type_depth
import org.gtkkn.native.gobject.g_type_ensure
import org.gtkkn.native.gobject.g_type_free_instance
import org.gtkkn.native.gobject.g_type_from_name
import org.gtkkn.native.gobject.g_type_fundamental
import org.gtkkn.native.gobject.g_type_fundamental_next
import org.gtkkn.native.gobject.g_type_get_instance_count
import org.gtkkn.native.gobject.g_type_get_plugin
import org.gtkkn.native.gobject.g_type_get_type_registration_serial
import org.gtkkn.native.gobject.g_type_init
import org.gtkkn.native.gobject.g_type_init_with_debug_flags
import org.gtkkn.native.gobject.g_type_interface_add_prerequisite
import org.gtkkn.native.gobject.g_type_interface_get_plugin
import org.gtkkn.native.gobject.g_type_interface_instantiatable_prerequisite
import org.gtkkn.native.gobject.g_type_interface_peek
import org.gtkkn.native.gobject.g_type_is_a
import org.gtkkn.native.gobject.g_type_name
import org.gtkkn.native.gobject.g_type_name_from_class
import org.gtkkn.native.gobject.g_type_name_from_instance
import org.gtkkn.native.gobject.g_type_next_base
import org.gtkkn.native.gobject.g_type_parent
import org.gtkkn.native.gobject.g_type_qname
import org.gtkkn.native.gobject.g_type_query
import org.gtkkn.native.gobject.g_type_register_dynamic
import org.gtkkn.native.gobject.g_type_register_fundamental
import org.gtkkn.native.gobject.g_type_register_static
import org.gtkkn.native.gobject.g_type_test_flags
import org.gtkkn.native.gobject.g_value_type_compatible
import org.gtkkn.native.gobject.g_value_type_transformable
import kotlin.Boolean
import kotlin.Byte
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.UByte
import kotlin.UInt
import kotlin.ULong
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - parameter `src_boxed`: gpointer
 * - parameter `boxed`: gpointer
 * - parameter `boxed_copy`: BoxedCopyFunc
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `invocation_hint`: gpointer
 * - parameter `handler_id_ptr`: Unsupported pointer to primitive type
 * - parameter `info`: info: Out parameter is not supported
 * - function `enum_to_string`: C function g_enum_to_string is ignored
 * - parameter `info`: info: Out parameter is not supported
 * - function `flags_to_string`: C function g_flags_to_string is ignored
 * - parameter `dummy`: gpointer
 * - parameter `dummy`: gpointer
 * - parameter `instance_and_params`: Value
 * - function `signal_emitv`: In/Out parameter is not supported
 * - function `signal_handler_find`: Could not resolve user_data param
 * - function `signal_handlers_block_matched`: Could not resolve user_data param
 * - function `signal_handlers_disconnect_matched`: Could not resolve user_data param
 * - function `signal_handlers_unblock_matched`: Could not resolve user_data param
 * - parameter `n_ids`: n_ids: Out parameter is not supported
 * - parameter `c_marshaller`: SignalCMarshaller
 * - parameter `class_handler`: Callback
 * - parameter `signal_id_p`: signal_id_p: Out parameter is not supported
 * - parameter `va_marshaller`: SignalCVaMarshaller
 * - function `strdup_value_contents`: C function g_strdup_value_contents is ignored
 * - parameter `n_children`: n_children: Out parameter is not supported
 * - parameter `g_class`: gpointer
 * - function `type_get_qdata`: Return type gpointer is unsupported
 * - parameter `n_prerequisites`: n_prerequisites: Out parameter is not supported
 * - parameter `n_interfaces`: n_interfaces: Out parameter is not supported
 * - parameter `data`: gpointer
 * - function `variant_get_gtype`: C function g_variant_get_gtype is ignored
 * - callback `BoxedCopyFunc`: Return type gpointer is unsupported
 * - callback `TypeValueCollectFunc`: Callback with String return value is not supported
 * - callback `TypeValueLCopyFunc`: Callback with String return value is not supported
 * - callback `TypeValuePeekPointerFunc`: Return type gpointer is unsupported
 * - bitfield `IOCondition`: C Type GIOCondition is ignored
 * - record `InitiallyUnownedClass`: glib type struct are ignored
 * - record `ParamSpecClass`: glib type struct are ignored
 * - record `ParamSpecPool`: Disguised records are ignored
 * - record `TypeModuleClass`: glib type struct are ignored
 */
public object Gobject {
    /**
     * Mask containing the bits of #GParamSpec.flags which are reserved for GLib.
     */
    public const val PARAM_MASK: UByte = UByte.MAX_VALUE

    /**
     * #GParamFlags value alias for %G_PARAM_STATIC_NAME | %G_PARAM_STATIC_NICK | %G_PARAM_STATIC_BLURB.
     *
     * It is recommended to use this for all properties by default, as it allows for
     * internal performance improvements in GObject.
     *
     * It is very rare that a property would have a dynamically constructed name,
     * nickname or blurb.
     *
     * Since 2.13.0
     */
    public const val PARAM_STATIC_STRINGS: Int = 224

    /**
     * Minimum shift count to be used for user defined flags, to be stored in
     * #GParamSpec.flags. The maximum allowed is 10.
     */
    public const val PARAM_USER_SHIFT: Int = 8

    /**
     * A mask for all #GSignalFlags bits.
     */
    public const val SIGNAL_FLAGS_MASK: Int = 511

    /**
     * A mask for all #GSignalMatchType bits.
     */
    public const val SIGNAL_MATCH_MASK: Int = 63

    /**
     * A bit in the type number that's supposed to be left untouched.
     */
    public const val TYPE_FLAG_RESERVED_ID_BIT: Type = 1u

    /**
     * An integer constant that represents the number of identifiers reserved
     * for types that are assigned at compile-time.
     */
    public const val TYPE_FUNDAMENTAL_MAX: Int = 1020

    /**
     * Shift value used in converting numbers to type IDs.
     */
    public const val TYPE_FUNDAMENTAL_SHIFT: Int = 2

    /**
     * First fundamental type number to create a new fundamental type id with
     * G_TYPE_MAKE_FUNDAMENTAL() reserved for BSE.
     */
    public const val TYPE_RESERVED_BSE_FIRST: Int = 32

    /**
     * Last fundamental type number reserved for BSE.
     */
    public const val TYPE_RESERVED_BSE_LAST: Int = 48

    /**
     * First fundamental type number to create a new fundamental type id with
     * G_TYPE_MAKE_FUNDAMENTAL() reserved for GLib.
     */
    public const val TYPE_RESERVED_GLIB_FIRST: Int = 22

    /**
     * Last fundamental type number reserved for GLib.
     */
    public const val TYPE_RESERVED_GLIB_LAST: Int = 31

    /**
     * First available fundamental type number to create new fundamental
     * type id with G_TYPE_MAKE_FUNDAMENTAL().
     */
    public const val TYPE_RESERVED_USER_FIRST: Int = 49

    /**
     * The maximal number of #GTypeCValues which can be collected for a
     * single #GValue.
     */
    public const val VALUE_COLLECT_FORMAT_MAX_LENGTH: Int = 8

    /**
     * For string values, indicates that the string contained is canonical and will
     * exist for the duration of the process. See g_value_set_interned_string().
     *
     * @since 2.66
     */
    public const val VALUE_INTERNED_STRING: Int = 268435456

    /**
     * If passed to G_VALUE_COLLECT(), allocated data won't be copied
     * but used verbatim. This does not affect ref-counted types like
     * objects. This does not affect usage of g_value_copy(), the data will
     * be copied if it is not ref-counted.
     */
    public const val VALUE_NOCOPY_CONTENTS: Int = 134217728

    /**
     * Returns the #GEnumValue for a value.
     *
     * @param enumClass a #GEnumClass
     * @param value the value to look up
     * @return the #GEnumValue for @value, or null
     *          if @value is not a member of the enumeration
     */
    public fun enumGetValue(
        enumClass: EnumClass,
        `value`: Int,
    ): EnumValue? =
        g_enum_get_value(enumClass.gobjectEnumClassPointer.reinterpret(), `value`)?.run {
            EnumValue(reinterpret())
        }

    /**
     * Looks up a #GEnumValue by name.
     *
     * @param enumClass a #GEnumClass
     * @param name the name to look up
     * @return the #GEnumValue with name @name,
     *          or null if the enumeration doesn't have a member
     *          with that name
     */
    public fun enumGetValueByName(
        enumClass: EnumClass,
        name: String,
    ): EnumValue? =
        g_enum_get_value_by_name(enumClass.gobjectEnumClassPointer.reinterpret(), name)?.run {
            EnumValue(reinterpret())
        }

    /**
     * Looks up a #GEnumValue by nickname.
     *
     * @param enumClass a #GEnumClass
     * @param nick the nickname to look up
     * @return the #GEnumValue with nickname @nick,
     *          or null if the enumeration doesn't have a member
     *          with that nickname
     */
    public fun enumGetValueByNick(
        enumClass: EnumClass,
        nick: String,
    ): EnumValue? =
        g_enum_get_value_by_nick(enumClass.gobjectEnumClassPointer.reinterpret(), nick)?.run {
            EnumValue(reinterpret())
        }

    /**
     * Registers a new static enumeration type with the name @name.
     *
     * It is normally more convenient to let [glib-mkenums][glib-mkenums],
     * generate a my_enum_get_type() function from a usual C enumeration
     * definition  than to write one yourself using g_enum_register_static().
     *
     * @param name A nul-terminated string used as the name of the new type.
     * @param constStaticValues An array of #GEnumValue structs for the possible
     *  enumeration values. The array is terminated by a struct with all
     *  members being 0. GObject keeps a reference to the data, so it cannot
     *  be stack-allocated.
     * @return The new type identifier.
     */
    public fun enumRegisterStatic(
        name: String,
        constStaticValues: EnumValue,
    ): ULong = g_enum_register_static(name, constStaticValues.gobjectEnumValuePointer.reinterpret())

    /**
     * Returns the first #GFlagsValue which is set in @value.
     *
     * @param flagsClass a #GFlagsClass
     * @param value the value
     * @return the first #GFlagsValue which is set in
     *          @value, or null if none is set
     */
    public fun flagsGetFirstValue(
        flagsClass: FlagsClass,
        `value`: UInt,
    ): FlagsValue? =
        g_flags_get_first_value(flagsClass.gobjectFlagsClassPointer.reinterpret(), `value`)?.run {
            FlagsValue(reinterpret())
        }

    /**
     * Looks up a #GFlagsValue by name.
     *
     * @param flagsClass a #GFlagsClass
     * @param name the name to look up
     * @return the #GFlagsValue with name @name,
     *          or null if there is no flag with that name
     */
    public fun flagsGetValueByName(
        flagsClass: FlagsClass,
        name: String,
    ): FlagsValue? =
        g_flags_get_value_by_name(flagsClass.gobjectFlagsClassPointer.reinterpret(), name)?.run {
            FlagsValue(reinterpret())
        }

    /**
     * Looks up a #GFlagsValue by nickname.
     *
     * @param flagsClass a #GFlagsClass
     * @param nick the nickname to look up
     * @return the #GFlagsValue with nickname @nick,
     *          or null if there is no flag with that nickname
     */
    public fun flagsGetValueByNick(
        flagsClass: FlagsClass,
        nick: String,
    ): FlagsValue? =
        g_flags_get_value_by_nick(flagsClass.gobjectFlagsClassPointer.reinterpret(), nick)?.run {
            FlagsValue(reinterpret())
        }

    /**
     * Registers a new static flags type with the name @name.
     *
     * It is normally more convenient to let [glib-mkenums][glib-mkenums]
     * generate a my_flags_get_type() function from a usual C enumeration
     * definition than to write one yourself using g_flags_register_static().
     *
     * @param name A nul-terminated string used as the name of the new type.
     * @param constStaticValues An array of #GFlagsValue structs for the possible
     *  flags values. The array is terminated by a struct with all members being 0.
     *  GObject keeps a reference to the data, so it cannot be stack-allocated.
     * @return The new type identifier.
     */
    public fun flagsRegisterStatic(
        name: String,
        constStaticValues: FlagsValue,
    ): ULong = g_flags_register_static(name, constStaticValues.gobjectFlagsValuePointer.reinterpret())

    public fun gtypeGetType(): ULong = g_gtype_get_type()

    /**
     * Creates a new #GParamSpecBoolean instance specifying a %G_TYPE_BOOLEAN
     * property. In many cases, it may be more appropriate to use an enum with
     * g_param_spec_enum(), both to improve code clarity by using explicitly named
     * values, and to allow for more values to be added in future without breaking
     * API.
     *
     * See g_param_spec_internal() for details on property names.
     *
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param defaultValue default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
     */
    public fun paramSpecBoolean(
        name: String,
        nick: String? = null,
        blurb: String? = null,
        defaultValue: Boolean,
        flags: ParamFlags,
    ): ParamSpec =
        g_param_spec_boolean(name, nick, blurb, defaultValue.asGBoolean(), flags.mask)!!.run {
            ParamSpec(reinterpret())
        }

    /**
     * Creates a new #GParamSpecBoxed instance specifying a %G_TYPE_BOXED
     * derived property.
     *
     * See g_param_spec_internal() for details on property names.
     *
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param boxedType %G_TYPE_BOXED derived type of this property
     * @param flags flags for the property specified
     * @return a newly created parameter specification
     */
    public fun paramSpecBoxed(
        name: String,
        nick: String? = null,
        blurb: String? = null,
        boxedType: ULong,
        flags: ParamFlags,
    ): ParamSpec =
        g_param_spec_boxed(name, nick, blurb, boxedType, flags.mask)!!.run {
            ParamSpec(reinterpret())
        }

    /**
     * Creates a new #GParamSpecChar instance specifying a %G_TYPE_CHAR property.
     *
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param minimum minimum value for the property specified
     * @param maximum maximum value for the property specified
     * @param defaultValue default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
     */
    public fun paramSpecChar(
        name: String,
        nick: String? = null,
        blurb: String? = null,
        minimum: Byte,
        maximum: Byte,
        defaultValue: Byte,
        flags: ParamFlags,
    ): ParamSpec =
        g_param_spec_char(name, nick, blurb, minimum, maximum, defaultValue, flags.mask)!!.run {
            ParamSpec(reinterpret())
        }

    /**
     * Creates a new #GParamSpecDouble instance specifying a %G_TYPE_DOUBLE
     * property.
     *
     * See g_param_spec_internal() for details on property names.
     *
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param minimum minimum value for the property specified
     * @param maximum maximum value for the property specified
     * @param defaultValue default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
     */
    public fun paramSpecDouble(
        name: String,
        nick: String? = null,
        blurb: String? = null,
        minimum: Double,
        maximum: Double,
        defaultValue: Double,
        flags: ParamFlags,
    ): ParamSpec =
        g_param_spec_double(name, nick, blurb, minimum, maximum, defaultValue, flags.mask)!!.run {
            ParamSpec(reinterpret())
        }

    /**
     * Creates a new #GParamSpecEnum instance specifying a %G_TYPE_ENUM
     * property.
     *
     * See g_param_spec_internal() for details on property names.
     *
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param enumType a #GType derived from %G_TYPE_ENUM
     * @param defaultValue default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
     */
    public fun paramSpecEnum(
        name: String,
        nick: String? = null,
        blurb: String? = null,
        enumType: ULong,
        defaultValue: Int,
        flags: ParamFlags,
    ): ParamSpec =
        g_param_spec_enum(name, nick, blurb, enumType, defaultValue, flags.mask)!!.run {
            ParamSpec(reinterpret())
        }

    /**
     * Creates a new #GParamSpecFlags instance specifying a %G_TYPE_FLAGS
     * property.
     *
     * See g_param_spec_internal() for details on property names.
     *
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param flagsType a #GType derived from %G_TYPE_FLAGS
     * @param defaultValue default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
     */
    public fun paramSpecFlags(
        name: String,
        nick: String? = null,
        blurb: String? = null,
        flagsType: ULong,
        defaultValue: UInt,
        flags: ParamFlags,
    ): ParamSpec =
        g_param_spec_flags(name, nick, blurb, flagsType, defaultValue, flags.mask)!!.run {
            ParamSpec(reinterpret())
        }

    /**
     * Creates a new #GParamSpecFloat instance specifying a %G_TYPE_FLOAT property.
     *
     * See g_param_spec_internal() for details on property names.
     *
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param minimum minimum value for the property specified
     * @param maximum maximum value for the property specified
     * @param defaultValue default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
     */
    public fun paramSpecFloat(
        name: String,
        nick: String? = null,
        blurb: String? = null,
        minimum: Float,
        maximum: Float,
        defaultValue: Float,
        flags: ParamFlags,
    ): ParamSpec =
        g_param_spec_float(name, nick, blurb, minimum, maximum, defaultValue, flags.mask)!!.run {
            ParamSpec(reinterpret())
        }

    /**
     * Creates a new #GParamSpecGType instance specifying a
     * %G_TYPE_GTYPE property.
     *
     * See g_param_spec_internal() for details on property names.
     *
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param isAType a #GType whose subtypes are allowed as values
     *  of the property (use %G_TYPE_NONE for any type)
     * @param flags flags for the property specified
     * @return a newly created parameter specification
     * @since 2.10
     */
    @GObjectVersion2_10
    public fun paramSpecGtype(
        name: String,
        nick: String? = null,
        blurb: String? = null,
        isAType: ULong,
        flags: ParamFlags,
    ): ParamSpec =
        g_param_spec_gtype(name, nick, blurb, isAType, flags.mask)!!.run {
            ParamSpec(reinterpret())
        }

    /**
     * Creates a new #GParamSpecInt instance specifying a %G_TYPE_INT property.
     *
     * See g_param_spec_internal() for details on property names.
     *
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param minimum minimum value for the property specified
     * @param maximum maximum value for the property specified
     * @param defaultValue default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
     */
    public fun paramSpecInt(
        name: String,
        nick: String? = null,
        blurb: String? = null,
        minimum: Int,
        maximum: Int,
        defaultValue: Int,
        flags: ParamFlags,
    ): ParamSpec =
        g_param_spec_int(name, nick, blurb, minimum, maximum, defaultValue, flags.mask)!!.run {
            ParamSpec(reinterpret())
        }

    /**
     * Creates a new #GParamSpecInt64 instance specifying a %G_TYPE_INT64 property.
     *
     * See g_param_spec_internal() for details on property names.
     *
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param minimum minimum value for the property specified
     * @param maximum maximum value for the property specified
     * @param defaultValue default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
     */
    public fun paramSpecInt64(
        name: String,
        nick: String? = null,
        blurb: String? = null,
        minimum: Long,
        maximum: Long,
        defaultValue: Long,
        flags: ParamFlags,
    ): ParamSpec =
        g_param_spec_int64(name, nick, blurb, minimum, maximum, defaultValue, flags.mask)!!.run {
            ParamSpec(reinterpret())
        }

    /**
     * Creates a new #GParamSpecLong instance specifying a %G_TYPE_LONG property.
     *
     * See g_param_spec_internal() for details on property names.
     *
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param minimum minimum value for the property specified
     * @param maximum maximum value for the property specified
     * @param defaultValue default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
     */
    public fun paramSpecLong(
        name: String,
        nick: String? = null,
        blurb: String? = null,
        minimum: Long,
        maximum: Long,
        defaultValue: Long,
        flags: ParamFlags,
    ): ParamSpec =
        g_param_spec_long(name, nick, blurb, minimum, maximum, defaultValue, flags.mask)!!.run {
            ParamSpec(reinterpret())
        }

    /**
     * Creates a new #GParamSpecBoxed instance specifying a %G_TYPE_OBJECT
     * derived property.
     *
     * See g_param_spec_internal() for details on property names.
     *
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param objectType %G_TYPE_OBJECT derived type of this property
     * @param flags flags for the property specified
     * @return a newly created parameter specification
     */
    public fun paramSpecObject(
        name: String,
        nick: String? = null,
        blurb: String? = null,
        objectType: ULong,
        flags: ParamFlags,
    ): ParamSpec =
        g_param_spec_object(name, nick, blurb, objectType, flags.mask)!!.run {
            ParamSpec(reinterpret())
        }

    /**
     * Creates a new #GParamSpecParam instance specifying a %G_TYPE_PARAM
     * property.
     *
     * See g_param_spec_internal() for details on property names.
     *
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param paramType a #GType derived from %G_TYPE_PARAM
     * @param flags flags for the property specified
     * @return a newly created parameter specification
     */
    public fun paramSpecParam(
        name: String,
        nick: String? = null,
        blurb: String? = null,
        paramType: ULong,
        flags: ParamFlags,
    ): ParamSpec =
        g_param_spec_param(name, nick, blurb, paramType, flags.mask)!!.run {
            ParamSpec(reinterpret())
        }

    /**
     * Creates a new #GParamSpecPointer instance specifying a pointer property.
     * Where possible, it is better to use g_param_spec_object() or
     * g_param_spec_boxed() to expose memory management information.
     *
     * See g_param_spec_internal() for details on property names.
     *
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
     */
    public fun paramSpecPointer(
        name: String,
        nick: String? = null,
        blurb: String? = null,
        flags: ParamFlags,
    ): ParamSpec =
        g_param_spec_pointer(name, nick, blurb, flags.mask)!!.run {
            ParamSpec(reinterpret())
        }

    /**
     * Creates a new #GParamSpecString instance.
     *
     * See g_param_spec_internal() for details on property names.
     *
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param defaultValue default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
     */
    public fun paramSpecString(
        name: String,
        nick: String? = null,
        blurb: String? = null,
        defaultValue: String? = null,
        flags: ParamFlags,
    ): ParamSpec =
        g_param_spec_string(name, nick, blurb, defaultValue, flags.mask)!!.run {
            ParamSpec(reinterpret())
        }

    /**
     * Creates a new #GParamSpecUChar instance specifying a %G_TYPE_UCHAR property.
     *
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param minimum minimum value for the property specified
     * @param maximum maximum value for the property specified
     * @param defaultValue default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
     */
    public fun paramSpecUchar(
        name: String,
        nick: String? = null,
        blurb: String? = null,
        minimum: UByte,
        maximum: UByte,
        defaultValue: UByte,
        flags: ParamFlags,
    ): ParamSpec =
        g_param_spec_uchar(name, nick, blurb, minimum, maximum, defaultValue, flags.mask)!!.run {
            ParamSpec(reinterpret())
        }

    /**
     * Creates a new #GParamSpecUInt instance specifying a %G_TYPE_UINT property.
     *
     * See g_param_spec_internal() for details on property names.
     *
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param minimum minimum value for the property specified
     * @param maximum maximum value for the property specified
     * @param defaultValue default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
     */
    public fun paramSpecUint(
        name: String,
        nick: String? = null,
        blurb: String? = null,
        minimum: UInt,
        maximum: UInt,
        defaultValue: UInt,
        flags: ParamFlags,
    ): ParamSpec =
        g_param_spec_uint(name, nick, blurb, minimum, maximum, defaultValue, flags.mask)!!.run {
            ParamSpec(reinterpret())
        }

    /**
     * Creates a new #GParamSpecUInt64 instance specifying a %G_TYPE_UINT64
     * property.
     *
     * See g_param_spec_internal() for details on property names.
     *
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param minimum minimum value for the property specified
     * @param maximum maximum value for the property specified
     * @param defaultValue default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
     */
    public fun paramSpecUint64(
        name: String,
        nick: String? = null,
        blurb: String? = null,
        minimum: ULong,
        maximum: ULong,
        defaultValue: ULong,
        flags: ParamFlags,
    ): ParamSpec =
        g_param_spec_uint64(name, nick, blurb, minimum, maximum, defaultValue, flags.mask)!!.run {
            ParamSpec(reinterpret())
        }

    /**
     * Creates a new #GParamSpecULong instance specifying a %G_TYPE_ULONG
     * property.
     *
     * See g_param_spec_internal() for details on property names.
     *
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param minimum minimum value for the property specified
     * @param maximum maximum value for the property specified
     * @param defaultValue default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
     */
    public fun paramSpecUlong(
        name: String,
        nick: String? = null,
        blurb: String? = null,
        minimum: ULong,
        maximum: ULong,
        defaultValue: ULong,
        flags: ParamFlags,
    ): ParamSpec =
        g_param_spec_ulong(name, nick, blurb, minimum, maximum, defaultValue, flags.mask)!!.run {
            ParamSpec(reinterpret())
        }

    /**
     * Creates a new #GParamSpecUnichar instance specifying a %G_TYPE_UINT
     * property. #GValue structures for this property can be accessed with
     * g_value_set_uint() and g_value_get_uint().
     *
     * See g_param_spec_internal() for details on property names.
     *
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param defaultValue default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
     */
    public fun paramSpecUnichar(
        name: String,
        nick: String? = null,
        blurb: String? = null,
        defaultValue: UInt,
        flags: ParamFlags,
    ): ParamSpec =
        g_param_spec_unichar(name, nick, blurb, defaultValue, flags.mask)!!.run {
            ParamSpec(reinterpret())
        }

    /**
     * Creates a new #GParamSpecVariant instance specifying a #GVariant
     * property.
     *
     * If @default_value is floating, it is consumed.
     *
     * See g_param_spec_internal() for details on property names.
     *
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param type a #GVariantType
     * @param defaultValue a #GVariant of type @type to
     *                 use as the default value, or null
     * @param flags flags for the property specified
     * @return the newly created #GParamSpec
     * @since 2.26
     */
    @GObjectVersion2_26
    public fun paramSpecVariant(
        name: String,
        nick: String? = null,
        blurb: String? = null,
        type: VariantType,
        defaultValue: Variant? = null,
        flags: ParamFlags,
    ): ParamSpec =
        g_param_spec_variant(
            name,
            nick,
            blurb,
            type.glibVariantTypePointer.reinterpret(),
            defaultValue?.glibVariantPointer?.reinterpret(),
            flags.mask
        )!!.run {
            ParamSpec(reinterpret())
        }

    /**
     * Registers @name as the name of a new static type derived
     * from %G_TYPE_PARAM.
     *
     * The type system uses the information contained in the #GParamSpecTypeInfo
     * structure pointed to by @info to manage the #GParamSpec type and its
     * instances.
     *
     * @param name 0-terminated string used as the name of the new #GParamSpec type.
     * @param pspecInfo The #GParamSpecTypeInfo for this #GParamSpec type.
     * @return The new type identifier.
     */
    public fun paramTypeRegisterStatic(
        name: String,
        pspecInfo: ParamSpecTypeInfo,
    ): ULong = g_param_type_register_static(name, pspecInfo.gobjectParamSpecTypeInfoPointer.reinterpret())

    /**
     * Transforms @src_value into @dest_value if possible, and then
     * validates @dest_value, in order for it to conform to @pspec.  If
     * @strict_validation is true this function will only succeed if the
     * transformed @dest_value complied to @pspec without modifications.
     *
     * See also g_value_type_transformable(), g_value_transform() and
     * g_param_value_validate().
     *
     * @param pspec a valid #GParamSpec
     * @param srcValue source #GValue
     * @param destValue destination #GValue of correct type for @pspec
     * @param strictValidation true requires @dest_value to conform to @pspec
     * without modifications
     * @return true if transformation and validation were successful,
     *  false otherwise and @dest_value is left untouched.
     */
    public fun paramValueConvert(
        pspec: ParamSpec,
        srcValue: Value,
        destValue: Value,
        strictValidation: Boolean,
    ): Boolean =
        g_param_value_convert(
            pspec.gPointer.reinterpret(),
            srcValue.gobjectValuePointer.reinterpret(),
            destValue.gobjectValuePointer.reinterpret(),
            strictValidation.asGBoolean()
        ).asBoolean()

    /**
     * Checks whether @value contains the default value as specified in @pspec.
     *
     * @param pspec a valid #GParamSpec
     * @param value a #GValue of correct type for @pspec
     * @return whether @value contains the canonical default for this @pspec
     */
    public fun paramValueDefaults(
        pspec: ParamSpec,
        `value`: Value,
    ): Boolean =
        g_param_value_defaults(pspec.gPointer.reinterpret(), `value`.gobjectValuePointer.reinterpret()).asBoolean()

    /**
     * Return whether the contents of @value comply with the specifications
     * set out by @pspec.
     *
     * @param pspec a valid #GParamSpec
     * @param value a #GValue of correct type for @pspec
     * @return whether the contents of @value comply with the specifications
     *   set out by @pspec.
     * @since 2.74
     */
    @GObjectVersion2_74
    public fun paramValueIsValid(
        pspec: ParamSpec,
        `value`: Value,
    ): Boolean =
        g_param_value_is_valid(pspec.gPointer.reinterpret(), `value`.gobjectValuePointer.reinterpret()).asBoolean()

    /**
     * Sets @value to its default value as specified in @pspec.
     *
     * @param pspec a valid #GParamSpec
     * @param value a #GValue of correct type for @pspec; since 2.64, you
     *   can also pass an empty #GValue, initialized with %G_VALUE_INIT
     */
    public fun paramValueSetDefault(
        pspec: ParamSpec,
        `value`: Value,
    ): Unit = g_param_value_set_default(pspec.gPointer.reinterpret(), `value`.gobjectValuePointer.reinterpret())

    /**
     * Ensures that the contents of @value comply with the specifications
     * set out by @pspec. For example, a #GParamSpecInt might require
     * that integers stored in @value may not be smaller than -42 and not be
     * greater than +42. If @value contains an integer outside of this range,
     * it is modified accordingly, so the resulting value will fit into the
     * range -42 .. +42.
     *
     * @param pspec a valid #GParamSpec
     * @param value a #GValue of correct type for @pspec
     * @return whether modifying @value was necessary to ensure validity
     */
    public fun paramValueValidate(
        pspec: ParamSpec,
        `value`: Value,
    ): Boolean =
        g_param_value_validate(pspec.gPointer.reinterpret(), `value`.gobjectValuePointer.reinterpret()).asBoolean()

    /**
     * Compares @value1 with @value2 according to @pspec, and return -1, 0 or +1,
     * if @value1 is found to be less than, equal to or greater than @value2,
     * respectively.
     *
     * @param pspec a valid #GParamSpec
     * @param value1 a #GValue of correct type for @pspec
     * @param value2 a #GValue of correct type for @pspec
     * @return -1, 0 or +1, for a less than, equal to or greater than result
     */
    public fun paramValuesCmp(
        pspec: ParamSpec,
        value1: Value,
        value2: Value,
    ): Int =
        g_param_values_cmp(
            pspec.gPointer.reinterpret(),
            value1.gobjectValuePointer.reinterpret(),
            value2.gobjectValuePointer.reinterpret()
        )

    /**
     * Creates a new %G_TYPE_POINTER derived type id for a new
     * pointer type with name @name.
     *
     * @param name the name of the new pointer type.
     * @return a new %G_TYPE_POINTER derived type id for @name.
     */
    public fun pointerTypeRegisterStatic(name: String): ULong = g_pointer_type_register_static(name)

    /**
     * Adds an emission hook for a signal, which will get called for any emission
     * of that signal, independent of the instance. This is possible only
     * for signals which don't have %G_SIGNAL_NO_HOOKS flag set.
     *
     * @param signalId the signal identifier, as returned by g_signal_lookup().
     * @param detail the detail on which to call the hook.
     * @param hookFunc a #GSignalEmissionHook function.
     * @return the hook id, for later use with g_signal_remove_emission_hook().
     */
    public fun signalAddEmissionHook(
        signalId: UInt,
        detail: Quark,
        hookFunc: SignalEmissionHook,
    ): ULong =
        g_signal_add_emission_hook(
            signalId,
            detail,
            SignalEmissionHookFunc.reinterpret(),
            StableRef.create(hookFunc).asCPointer(),
            staticStableRefDestroy.reinterpret()
        )

    /**
     * Connects a closure to a signal for a particular object.
     *
     * If @closure is a floating reference (see g_closure_sink()), this function
     * takes ownership of @closure.
     *
     * This function cannot fail. If the given signal doesn’t exist, a critical
     * warning is emitted.
     *
     * @param instance the instance to connect to.
     * @param detailedSignal a string of the form "signal-name::detail".
     * @param closure the closure to connect.
     * @param after whether the handler should be called before or after the
     *  default handler of the signal.
     * @return the handler ID (always greater than 0)
     */
    public fun signalConnectClosure(
        instance: Object,
        detailedSignal: String,
        closure: Closure,
        after: Boolean,
    ): ULong =
        g_signal_connect_closure(
            instance.gPointer.reinterpret(),
            detailedSignal,
            closure.gobjectClosurePointer.reinterpret(),
            after.asGBoolean()
        )

    /**
     * Connects a closure to a signal for a particular object.
     *
     * If @closure is a floating reference (see g_closure_sink()), this function
     * takes ownership of @closure.
     *
     * This function cannot fail. If the given signal doesn’t exist, a critical
     * warning is emitted.
     *
     * @param instance the instance to connect to.
     * @param signalId the id of the signal.
     * @param detail the detail.
     * @param closure the closure to connect.
     * @param after whether the handler should be called before or after the
     *  default handler of the signal.
     * @return the handler ID (always greater than 0)
     */
    public fun signalConnectClosureById(
        instance: Object,
        signalId: UInt,
        detail: Quark,
        closure: Closure,
        after: Boolean,
    ): ULong =
        g_signal_connect_closure_by_id(
            instance.gPointer.reinterpret(),
            signalId,
            detail,
            closure.gobjectClosurePointer.reinterpret(),
            after.asGBoolean()
        )

    /**
     * Returns the invocation hint of the innermost signal emission of instance.
     *
     * @param instance the instance to query
     * @return the invocation hint of the innermost
     *     signal emission, or null if not found.
     */
    public fun signalGetInvocationHint(instance: Object): SignalInvocationHint? =
        g_signal_get_invocation_hint(instance.gPointer.reinterpret())?.run {
            SignalInvocationHint(reinterpret())
        }

    /**
     * Blocks a handler of an instance so it will not be called during any
     * signal emissions unless it is unblocked again. Thus "blocking" a
     * signal handler means to temporarily deactivate it, a signal handler
     * has to be unblocked exactly the same amount of times it has been
     * blocked before to become active again.
     *
     * The @handler_id has to be a valid signal handler id, connected to a
     * signal of @instance.
     *
     * @param instance The instance to block the signal handler of.
     * @param handlerId Handler id of the handler to be blocked.
     */
    public fun signalHandlerBlock(
        instance: Object,
        handlerId: ULong,
    ): Unit = g_signal_handler_block(instance.gPointer.reinterpret(), handlerId)

    /**
     * Disconnects a handler from an instance so it will not be called during
     * any future or currently ongoing emissions of the signal it has been
     * connected to. The @handler_id becomes invalid and may be reused.
     *
     * The @handler_id has to be a valid signal handler id, connected to a
     * signal of @instance.
     *
     * @param instance The instance to remove the signal handler from.
     * @param handlerId Handler id of the handler to be disconnected.
     */
    public fun signalHandlerDisconnect(
        instance: Object,
        handlerId: ULong,
    ): Unit = g_signal_handler_disconnect(instance.gPointer.reinterpret(), handlerId)

    /**
     * Returns whether @handler_id is the ID of a handler connected to @instance.
     *
     * @param instance The instance where a signal handler is sought.
     * @param handlerId the handler ID.
     * @return whether @handler_id identifies a handler connected to @instance.
     */
    public fun signalHandlerIsConnected(
        instance: Object,
        handlerId: ULong,
    ): Boolean = g_signal_handler_is_connected(instance.gPointer.reinterpret(), handlerId).asBoolean()

    /**
     * Undoes the effect of a previous g_signal_handler_block() call.  A
     * blocked handler is skipped during signal emissions and will not be
     * invoked, unblocking it (for exactly the amount of times it has been
     * blocked before) reverts its "blocked" state, so the handler will be
     * recognized by the signal system and is called upon future or
     * currently ongoing signal emissions (since the order in which
     * handlers are called during signal emissions is deterministic,
     * whether the unblocked handler in question is called as part of a
     * currently ongoing emission depends on how far that emission has
     * proceeded yet).
     *
     * The @handler_id has to be a valid id of a signal handler that is
     * connected to a signal of @instance and is currently blocked.
     *
     * @param instance The instance to unblock the signal handler of.
     * @param handlerId Handler id of the handler to be unblocked.
     */
    public fun signalHandlerUnblock(
        instance: Object,
        handlerId: ULong,
    ): Unit = g_signal_handler_unblock(instance.gPointer.reinterpret(), handlerId)

    /**
     * Destroy all signal handlers of a type instance. This function is
     * an implementation detail of the #GObject dispose implementation,
     * and should not be used outside of the type system.
     *
     * @param instance The instance whose signal handlers are destroyed
     */
    public fun signalHandlersDestroy(instance: Object): Unit =
        g_signal_handlers_destroy(instance.gPointer.reinterpret())

    /**
     * Returns whether there are any handlers connected to @instance for the
     * given signal id and detail.
     *
     * If @detail is 0 then it will only match handlers that were connected
     * without detail.  If @detail is non-zero then it will match handlers
     * connected both without detail and with the given detail.  This is
     * consistent with how a signal emitted with @detail would be delivered
     * to those handlers.
     *
     * Since 2.46 this also checks for a non-default class closure being
     * installed, as this is basically always what you want.
     *
     * One example of when you might use this is when the arguments to the
     * signal are difficult to compute. A class implementor may opt to not
     * emit the signal if no one is attached anyway, thus saving the cost
     * of building the arguments.
     *
     * @param instance the object whose signal handlers are sought.
     * @param signalId the signal id.
     * @param detail the detail.
     * @param mayBeBlocked whether blocked handlers should count as match.
     * @return true if a handler is connected to the signal, false
     *          otherwise.
     */
    public fun signalHasHandlerPending(
        instance: Object,
        signalId: UInt,
        detail: Quark,
        mayBeBlocked: Boolean,
    ): Boolean =
        g_signal_has_handler_pending(
            instance.gPointer.reinterpret(),
            signalId,
            detail,
            mayBeBlocked.asGBoolean()
        ).asBoolean()

    /**
     * Validate a signal name. This can be useful for dynamically-generated signals
     * which need to be validated at run-time before actually trying to create them.
     *
     * See [canonical parameter names][canonical-parameter-names] for details of
     * the rules for valid names. The rules for signal names are the same as those
     * for property names.
     *
     * @param name the canonical name of the signal
     * @return true if @name is a valid signal name, false otherwise.
     * @since 2.66
     */
    @GObjectVersion2_66
    public fun signalIsValidName(name: String): Boolean = g_signal_is_valid_name(name).asBoolean()

    /**
     * Given the name of the signal and the type of object it connects to, gets
     * the signal's identifying integer. Emitting the signal by number is
     * somewhat faster than using the name each time.
     *
     * Also tries the ancestors of the given type.
     *
     * The type class passed as @itype must already have been instantiated (for
     * example, using g_type_class_ref()) for this function to work, as signals are
     * always installed during class initialization.
     *
     * See g_signal_new() for details on allowed signal names.
     *
     * @param name the signal's name.
     * @param itype the type that the signal operates on.
     * @return the signal's identifying number, or 0 if no signal was found.
     */
    public fun signalLookup(
        name: String,
        itype: ULong,
    ): UInt = g_signal_lookup(name, itype)

    /**
     * Given the signal's identifier, finds its name.
     *
     * Two different signals may have the same name, if they have differing types.
     *
     * @param signalId the signal's identifying number.
     * @return the signal name, or null if the signal number was invalid.
     */
    public fun signalName(signalId: UInt): String? = g_signal_name(signalId)?.toKString()

    /**
     * Overrides the class closure (i.e. the default handler) for the given signal
     * for emissions on instances of @instance_type. @instance_type must be derived
     * from the type to which the signal belongs.
     *
     * See g_signal_chain_from_overridden() and
     * g_signal_chain_from_overridden_handler() for how to chain up to the
     * parent class closure from inside the overridden one.
     *
     * @param signalId the signal id
     * @param instanceType the instance type on which to override the class closure
     *  for the signal.
     * @param classClosure the closure.
     */
    public fun signalOverrideClassClosure(
        signalId: UInt,
        instanceType: ULong,
        classClosure: Closure,
    ): Unit = g_signal_override_class_closure(signalId, instanceType, classClosure.gobjectClosurePointer.reinterpret())

    /**
     * Queries the signal system for in-depth information about a
     * specific signal. This function will fill in a user-provided
     * structure to hold signal-specific information. If an invalid
     * signal id is passed in, the @signal_id member of the #GSignalQuery
     * is 0. All members filled into the #GSignalQuery structure should
     * be considered constant and have to be left untouched.
     *
     * @param signalId The signal id of the signal to query information for.
     * @param query A user provided structure that is
     *  filled in with constant values upon success.
     */
    public fun signalQuery(
        signalId: UInt,
        query: SignalQuery,
    ): Unit = g_signal_query(signalId, query.gobjectSignalQueryPointer.reinterpret())

    /**
     * Deletes an emission hook.
     *
     * @param signalId the id of the signal
     * @param hookId the id of the emission hook, as returned by
     *  g_signal_add_emission_hook()
     */
    public fun signalRemoveEmissionHook(
        signalId: UInt,
        hookId: ULong,
    ): Unit = g_signal_remove_emission_hook(signalId, hookId)

    /**
     * Stops a signal's current emission.
     *
     * This will prevent the default method from running, if the signal was
     * %G_SIGNAL_RUN_LAST and you connected normally (i.e. without the "after"
     * flag).
     *
     * Prints a warning if used on a signal which isn't being emitted.
     *
     * @param instance the object whose signal handlers you wish to stop.
     * @param signalId the signal identifier, as returned by g_signal_lookup().
     * @param detail the detail which the signal was emitted with.
     */
    public fun signalStopEmission(
        instance: Object,
        signalId: UInt,
        detail: Quark,
    ): Unit = g_signal_stop_emission(instance.gPointer.reinterpret(), signalId, detail)

    /**
     * Stops a signal's current emission.
     *
     * This is just like g_signal_stop_emission() except it will look up the
     * signal id for you.
     *
     * @param instance the object whose signal handlers you wish to stop.
     * @param detailedSignal a string of the form "signal-name::detail".
     */
    public fun signalStopEmissionByName(
        instance: Object,
        detailedSignal: String,
    ): Unit = g_signal_stop_emission_by_name(instance.gPointer.reinterpret(), detailedSignal)

    /**
     * Creates a new closure which invokes the function found at the offset
     * @struct_offset in the class structure of the interface or classed type
     * identified by @itype.
     *
     * @param itype the #GType identifier of an interface or classed type
     * @param structOffset the offset of the member function of @itype's class
     *  structure which is to be invoked by the new closure
     * @return a floating reference to a new #GCClosure
     */
    public fun signalTypeCclosureNew(
        itype: ULong,
        structOffset: UInt,
    ): Closure =
        g_signal_type_cclosure_new(itype, structOffset)!!.run {
            Closure(reinterpret())
        }

    /**
     * Set the callback for a source as a #GClosure.
     *
     * If the source is not one of the standard GLib types, the @closure_callback
     * and @closure_marshal fields of the #GSourceFuncs structure must have been
     * filled in with pointers to appropriate functions.
     *
     * @param source the source
     * @param closure a #GClosure
     */
    public fun sourceSetClosure(
        source: Source,
        closure: Closure,
    ): Unit = g_source_set_closure(source.glibSourcePointer.reinterpret(), closure.gobjectClosurePointer.reinterpret())

    /**
     * Sets a dummy callback for @source. The callback will do nothing, and
     * if the source expects a #gboolean return value, it will return true.
     * (If the source expects any other type of return value, it will return
     * a 0/null value; whatever g_value_init() initializes a #GValue to for
     * that type.)
     *
     * If the source is not one of the standard GLib types, the
     * @closure_callback and @closure_marshal fields of the #GSourceFuncs
     * structure must have been filled in with pointers to appropriate
     * functions.
     *
     * @param source the source
     */
    public fun sourceSetDummyCallback(source: Source): Unit =
        g_source_set_dummy_callback(source.glibSourcePointer.reinterpret())

    /**
     * Registers a private class structure for a classed type;
     * when the class is allocated, the private structures for
     * the class and all of its parent types are allocated
     * sequentially in the same memory block as the public
     * structures, and are zero-filled.
     *
     * This function should be called in the
     * type's get_type() function after the type is registered.
     * The private structure can be retrieved using the
     * G_TYPE_CLASS_GET_PRIVATE() macro.
     *
     * @param classType GType of a classed type
     * @param privateSize size of private structure
     * @since 2.24
     */
    @GObjectVersion2_24
    public fun typeAddClassPrivate(
        classType: ULong,
        privateSize: ULong,
    ): Unit = g_type_add_class_private(classType, privateSize)

    /**
     *
     *
     * @param classType
     * @param privateSize
     */
    public fun typeAddInstancePrivate(
        classType: ULong,
        privateSize: ULong,
    ): Int = g_type_add_instance_private(classType, privateSize)

    /**
     * Adds @interface_type to the dynamic @instance_type. The information
     * contained in the #GTypePlugin structure pointed to by @plugin
     * is used to manage the relationship.
     *
     * @param instanceType #GType value of an instantiatable type
     * @param interfaceType #GType value of an interface type
     * @param plugin #GTypePlugin structure to retrieve the #GInterfaceInfo from
     */
    public fun typeAddInterfaceDynamic(
        instanceType: ULong,
        interfaceType: ULong,
        plugin: TypePlugin,
    ): Unit = g_type_add_interface_dynamic(instanceType, interfaceType, plugin.gobjectTypePluginPointer)

    /**
     * Adds @interface_type to the static @instance_type.
     * The information contained in the #GInterfaceInfo structure
     * pointed to by @info is used to manage the relationship.
     *
     * @param instanceType #GType value of an instantiatable type
     * @param interfaceType #GType value of an interface type
     * @param info #GInterfaceInfo structure for this
     *        (@instance_type, @interface_type) combination
     */
    public fun typeAddInterfaceStatic(
        instanceType: ULong,
        interfaceType: ULong,
        info: InterfaceInfo,
    ): Unit = g_type_add_interface_static(instanceType, interfaceType, info.gobjectInterfaceInfoPointer.reinterpret())

    /**
     *
     *
     * @param gClass
     * @param isAType
     */
    public fun typeCheckClassIsA(
        gClass: TypeClass,
        isAType: ULong,
    ): Boolean = g_type_check_class_is_a(gClass.gobjectTypeClassPointer.reinterpret(), isAType).asBoolean()

    /**
     * Private helper function to aid implementation of the
     * G_TYPE_CHECK_INSTANCE() macro.
     *
     * @param instance a valid #GTypeInstance structure
     * @return true if @instance is valid, false otherwise
     */
    public fun typeCheckInstance(instance: TypeInstance): Boolean =
        g_type_check_instance(instance.gobjectTypeInstancePointer.reinterpret()).asBoolean()

    /**
     *
     *
     * @param instance
     * @param ifaceType
     */
    public fun typeCheckInstanceIsA(
        instance: TypeInstance,
        ifaceType: ULong,
    ): Boolean = g_type_check_instance_is_a(instance.gobjectTypeInstancePointer.reinterpret(), ifaceType).asBoolean()

    /**
     *
     *
     * @param instance
     * @param fundamentalType
     */
    public fun typeCheckInstanceIsFundamentallyA(
        instance: TypeInstance,
        fundamentalType: ULong,
    ): Boolean =
        g_type_check_instance_is_fundamentally_a(
            instance.gobjectTypeInstancePointer.reinterpret(),
            fundamentalType
        ).asBoolean()

    /**
     *
     *
     * @param type
     */
    public fun typeCheckIsValueType(type: ULong): Boolean = g_type_check_is_value_type(type).asBoolean()

    /**
     *
     *
     * @param value
     */
    public fun typeCheckValue(`value`: Value): Boolean =
        g_type_check_value(`value`.gobjectValuePointer.reinterpret()).asBoolean()

    /**
     *
     *
     * @param value
     * @param type
     */
    public fun typeCheckValueHolds(
        `value`: Value,
        type: ULong,
    ): Boolean = g_type_check_value_holds(`value`.gobjectValuePointer.reinterpret(), type).asBoolean()

    /**
     * This function is essentially the same as g_type_class_ref(),
     * except that the classes reference count isn't incremented.
     * As a consequence, this function may return null if the class
     * of the type passed in does not currently exist (hasn't been
     * referenced before).
     *
     * @param type type ID of a classed type
     * @return the #GTypeClass
     *     structure for the given type ID or null if the class does not
     *     currently exist
     */
    public fun typeClassPeek(type: ULong): TypeClass =
        g_type_class_peek(type)!!.run {
            TypeClass(reinterpret())
        }

    /**
     * A more efficient version of g_type_class_peek() which works only for
     * static types.
     *
     * @param type type ID of a classed type
     * @return the #GTypeClass
     *     structure for the given type ID or null if the class does not
     *     currently exist or is dynamically loaded
     * @since 2.4
     */
    @GObjectVersion2_4
    public fun typeClassPeekStatic(type: ULong): TypeClass =
        g_type_class_peek_static(type)!!.run {
            TypeClass(reinterpret())
        }

    /**
     * Increments the reference count of the class structure belonging to
     * @type. This function will demand-create the class if it doesn't
     * exist already.
     *
     * @param type type ID of a classed type
     * @return the #GTypeClass
     *     structure for the given type ID
     */
    public fun typeClassRef(type: ULong): TypeClass =
        g_type_class_ref(type)!!.run {
            TypeClass(reinterpret())
        }

    /**
     * If the interface type @g_type is currently in use, returns its
     * default interface vtable.
     *
     * @param gType an interface type
     * @return the default
     *     vtable for the interface, or null if the type is not currently
     *     in use
     * @since 2.4
     */
    @GObjectVersion2_4
    public fun typeDefaultInterfacePeek(gType: ULong): TypeInterface =
        g_type_default_interface_peek(gType)!!.run {
            TypeInterface(reinterpret())
        }

    /**
     * Increments the reference count for the interface type @g_type,
     * and returns the default interface vtable for the type.
     *
     * If the type is not currently in use, then the default vtable
     * for the type will be created and initialized by calling
     * the base interface init and default vtable init functions for
     * the type (the @base_init and @class_init members of #GTypeInfo).
     * Calling g_type_default_interface_ref() is useful when you
     * want to make sure that signals and properties for an interface
     * have been installed.
     *
     * @param gType an interface type
     * @return the default
     *     vtable for the interface; call g_type_default_interface_unref()
     *     when you are done using the interface.
     * @since 2.4
     */
    @GObjectVersion2_4
    public fun typeDefaultInterfaceRef(gType: ULong): TypeInterface =
        g_type_default_interface_ref(gType)!!.run {
            TypeInterface(reinterpret())
        }

    /**
     * Decrements the reference count for the type corresponding to the
     * interface default vtable @g_iface. If the type is dynamic, then
     * when no one is using the interface and all references have
     * been released, the finalize function for the interface's default
     * vtable (the @class_finalize member of #GTypeInfo) will be called.
     *
     * @param gIface the default vtable
     *     structure for an interface, as returned by g_type_default_interface_ref()
     * @since 2.4
     */
    @GObjectVersion2_4
    public fun typeDefaultInterfaceUnref(gIface: TypeInterface): Unit =
        g_type_default_interface_unref(gIface.gobjectTypeInterfacePointer.reinterpret())

    /**
     * Returns the length of the ancestry of the passed in type. This
     * includes the type itself, so that e.g. a fundamental type has depth 1.
     *
     * @param type a #GType
     * @return the depth of @type
     */
    public fun typeDepth(type: ULong): UInt = g_type_depth(type)

    /**
     * Ensures that the indicated @type has been registered with the
     * type system, and its _class_init() method has been run.
     *
     * In theory, simply calling the type's _get_type() method (or using
     * the corresponding macro) is supposed take care of this. However,
     * _get_type() methods are often marked %G_GNUC_CONST for performance
     * reasons, even though this is technically incorrect (since
     * %G_GNUC_CONST requires that the function not have side effects,
     * which _get_type() methods do on the first call). As a result, if
     * you write a bare call to a _get_type() macro, it may get optimized
     * out by the compiler. Using g_type_ensure() guarantees that the
     * type's _get_type() method is called.
     *
     * @param type a #GType
     * @since 2.34
     */
    @GObjectVersion2_34
    public fun typeEnsure(type: ULong): Unit = g_type_ensure(type)

    /**
     * Frees an instance of a type, returning it to the instance pool for
     * the type, if there is one.
     *
     * Like g_type_create_instance(), this function is reserved for
     * implementors of fundamental types.
     *
     * @param instance an instance of a type
     */
    public fun typeFreeInstance(instance: TypeInstance): Unit =
        g_type_free_instance(instance.gobjectTypeInstancePointer.reinterpret())

    /**
     * Look up the type ID from a given type name, returning 0 if no type
     * has been registered under this name (this is the preferred method
     * to find out by name whether a specific type has been registered
     * yet).
     *
     * @param name type name to look up
     * @return corresponding type ID or 0
     */
    public fun typeFromName(name: String): ULong = g_type_from_name(name)

    /**
     * Internal function, used to extract the fundamental type ID portion.
     * Use G_TYPE_FUNDAMENTAL() instead.
     *
     * @param typeId valid type ID
     * @return fundamental type ID
     */
    public fun typeFundamental(typeId: ULong): ULong = g_type_fundamental(typeId)

    /**
     * Returns the next free fundamental type id which can be used to
     * register a new fundamental type with g_type_register_fundamental().
     * The returned type ID represents the highest currently registered
     * fundamental type identifier.
     *
     * @return the next available fundamental type ID to be registered,
     *     or 0 if the type system ran out of fundamental type IDs
     */
    public fun typeFundamentalNext(): ULong = g_type_fundamental_next()

    /**
     * Returns the number of instances allocated of the particular type;
     * this is only available if GLib is built with debugging support and
     * the `instance-count` debug flag is set (by setting the `GOBJECT_DEBUG`
     * variable to include `instance-count`).
     *
     * @param type a #GType
     * @return the number of instances allocated of the given type;
     *   if instance counts are not available, returns 0.
     * @since 2.44
     */
    @GObjectVersion2_44
    public fun typeGetInstanceCount(type: ULong): Int = g_type_get_instance_count(type)

    /**
     * Returns the #GTypePlugin structure for @type.
     *
     * @param type #GType to retrieve the plugin for
     * @return the corresponding plugin
     *     if @type is a dynamic type, null otherwise
     */
    public fun typeGetPlugin(type: ULong): TypePlugin =
        g_type_get_plugin(type)!!.run {
            TypePlugin.wrap(reinterpret())
        }

    /**
     * Returns an opaque serial number that represents the state of the set
     * of registered types. Any time a type is registered this serial changes,
     * which means you can cache information based on type lookups (such as
     * g_type_from_name()) and know if the cache is still valid at a later
     * time by comparing the current serial with the one at the type lookup.
     *
     * @return An unsigned int, representing the state of type registrations
     * @since 2.36
     */
    @GObjectVersion2_36
    public fun typeGetTypeRegistrationSerial(): UInt = g_type_get_type_registration_serial()

    /**
     * This function used to initialise the type system.  Since GLib 2.36,
     * the type system is initialised automatically and this function does
     * nothing.
     */
    public fun typeInit(): Unit = g_type_init()

    /**
     * This function used to initialise the type system with debugging
     * flags.  Since GLib 2.36, the type system is initialised automatically
     * and this function does nothing.
     *
     * If you need to enable debugging features, use the `GOBJECT_DEBUG`
     * environment variable.
     *
     * @param debugFlags bitwise combination of #GTypeDebugFlags values for
     *     debugging purposes
     */
    public fun typeInitWithDebugFlags(debugFlags: TypeDebugFlags): Unit = g_type_init_with_debug_flags(debugFlags.mask)

    /**
     * Adds @prerequisite_type to the list of prerequisites of @interface_type.
     * This means that any type implementing @interface_type must also implement
     * @prerequisite_type. Prerequisites can be thought of as an alternative to
     * interface derivation (which GType doesn't support). An interface can have
     * at most one instantiatable prerequisite type.
     *
     * @param interfaceType #GType value of an interface type
     * @param prerequisiteType #GType value of an interface or instantiatable type
     */
    public fun typeInterfaceAddPrerequisite(
        interfaceType: ULong,
        prerequisiteType: ULong,
    ): Unit = g_type_interface_add_prerequisite(interfaceType, prerequisiteType)

    /**
     * Returns the #GTypePlugin structure for the dynamic interface
     * @interface_type which has been added to @instance_type, or null
     * if @interface_type has not been added to @instance_type or does
     * not have a #GTypePlugin structure. See g_type_add_interface_dynamic().
     *
     * @param instanceType #GType of an instantiatable type
     * @param interfaceType #GType of an interface type
     * @return the #GTypePlugin for the dynamic
     *     interface @interface_type of @instance_type
     */
    public fun typeInterfaceGetPlugin(
        instanceType: ULong,
        interfaceType: ULong,
    ): TypePlugin =
        g_type_interface_get_plugin(instanceType, interfaceType)!!.run {
            TypePlugin.wrap(reinterpret())
        }

    /**
     * Returns the most specific instantiatable prerequisite of an
     * interface type. If the interface type has no instantiatable
     * prerequisite, %G_TYPE_INVALID is returned.
     *
     * See g_type_interface_add_prerequisite() for more information
     * about prerequisites.
     *
     * @param interfaceType an interface type
     * @return the instantiatable prerequisite type or %G_TYPE_INVALID if none
     * @since 2.68
     */
    @GObjectVersion2_68
    public fun typeInterfaceInstantiatablePrerequisite(interfaceType: ULong): ULong =
        g_type_interface_instantiatable_prerequisite(interfaceType)

    /**
     * Returns the #GTypeInterface structure of an interface to which the
     * passed in class conforms.
     *
     * @param instanceClass a #GTypeClass structure
     * @param ifaceType an interface ID which this class conforms to
     * @return the #GTypeInterface
     *     structure of @iface_type if implemented by @instance_class, null
     *     otherwise
     */
    public fun typeInterfacePeek(
        instanceClass: TypeClass,
        ifaceType: ULong,
    ): TypeInterface =
        g_type_interface_peek(instanceClass.gobjectTypeClassPointer.reinterpret(), ifaceType)!!.run {
            TypeInterface(reinterpret())
        }

    /**
     * If @is_a_type is a derivable type, check whether @type is a
     * descendant of @is_a_type. If @is_a_type is an interface, check
     * whether @type conforms to it.
     *
     * @param type type to check ancestry for
     * @param isAType possible ancestor of @type or interface that @type
     *     could conform to
     * @return true if @type is a @is_a_type
     */
    public fun typeIsA(
        type: ULong,
        isAType: ULong,
    ): Boolean = g_type_is_a(type, isAType).asBoolean()

    /**
     * Get the unique name that is assigned to a type ID.  Note that this
     * function (like all other GType API) cannot cope with invalid type
     * IDs. %G_TYPE_INVALID may be passed to this function, as may be any
     * other validly registered type ID, but randomized type IDs should
     * not be passed in and will most likely lead to a crash.
     *
     * @param type type to return name for
     * @return static type name or null
     */
    public fun typeName(type: ULong): String? = g_type_name(type)?.toKString()

    /**
     *
     *
     * @param gClass
     */
    public fun typeNameFromClass(gClass: TypeClass): String =
        g_type_name_from_class(gClass.gobjectTypeClassPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param instance
     */
    public fun typeNameFromInstance(instance: TypeInstance): String =
        g_type_name_from_instance(instance.gobjectTypeInstancePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Given a @leaf_type and a @root_type which is contained in its
     * ancestry, return the type that @root_type is the immediate parent
     * of. In other words, this function determines the type that is
     * derived directly from @root_type which is also a base class of
     * @leaf_type.  Given a root type and a leaf type, this function can
     * be used to determine the types and order in which the leaf type is
     * descended from the root type.
     *
     * @param leafType descendant of @root_type and the type to be returned
     * @param rootType immediate parent of the returned type
     * @return immediate child of @root_type and ancestor of @leaf_type
     */
    public fun typeNextBase(
        leafType: ULong,
        rootType: ULong,
    ): ULong = g_type_next_base(leafType, rootType)

    /**
     * Return the direct parent type of the passed in type. If the passed
     * in type has no parent, i.e. is a fundamental type, 0 is returned.
     *
     * @param type the derived type
     * @return the parent type
     */
    public fun typeParent(type: ULong): ULong = g_type_parent(type)

    /**
     * Get the corresponding quark of the type IDs name.
     *
     * @param type type to return quark of type name for
     * @return the type names quark or 0
     */
    public fun typeQname(type: ULong): Quark = g_type_qname(type)

    /**
     * Queries the type system for information about a specific type.
     *
     * This function will fill in a user-provided structure to hold
     * type-specific information. If an invalid #GType is passed in, the
     * @type member of the #GTypeQuery is 0. All members filled into the
     * #GTypeQuery structure should be considered constant and have to be
     * left untouched.
     *
     * Since GLib 2.78, this function allows queries on dynamic types. Previously
     * it only supported static types.
     *
     * @param type #GType of a static, classed type
     * @param query a user provided structure that is
     *     filled in with constant values upon success
     */
    public fun typeQuery(
        type: ULong,
        query: TypeQuery,
    ): Unit = g_type_query(type, query.gobjectTypeQueryPointer.reinterpret())

    /**
     * Registers @type_name as the name of a new dynamic type derived from
     * @parent_type.  The type system uses the information contained in the
     * #GTypePlugin structure pointed to by @plugin to manage the type and its
     * instances (if not abstract).  The value of @flags determines the nature
     * (e.g. abstract or not) of the type.
     *
     * @param parentType type from which this type will be derived
     * @param typeName 0-terminated string used as the name of the new type
     * @param plugin #GTypePlugin structure to retrieve the #GTypeInfo from
     * @param flags bitwise combination of #GTypeFlags values
     * @return the new type identifier or %G_TYPE_INVALID if registration failed
     */
    public fun typeRegisterDynamic(
        parentType: ULong,
        typeName: String,
        plugin: TypePlugin,
        flags: TypeFlags,
    ): ULong = g_type_register_dynamic(parentType, typeName, plugin.gobjectTypePluginPointer, flags.mask)

    /**
     * Registers @type_id as the predefined identifier and @type_name as the
     * name of a fundamental type. If @type_id is already registered, or a
     * type named @type_name is already registered, the behaviour is undefined.
     * The type system uses the information contained in the #GTypeInfo structure
     * pointed to by @info and the #GTypeFundamentalInfo structure pointed to by
     * @finfo to manage the type and its instances. The value of @flags determines
     * additional characteristics of the fundamental type.
     *
     * @param typeId a predefined type identifier
     * @param typeName 0-terminated string used as the name of the new type
     * @param info #GTypeInfo structure for this type
     * @param finfo #GTypeFundamentalInfo structure for this type
     * @param flags bitwise combination of #GTypeFlags values
     * @return the predefined type identifier
     */
    public fun typeRegisterFundamental(
        typeId: ULong,
        typeName: String,
        info: TypeInfo,
        finfo: TypeFundamentalInfo,
        flags: TypeFlags,
    ): ULong =
        g_type_register_fundamental(
            typeId,
            typeName,
            info.gobjectTypeInfoPointer.reinterpret(),
            finfo.gobjectTypeFundamentalInfoPointer.reinterpret(),
            flags.mask
        )

    /**
     * Registers @type_name as the name of a new static type derived from
     * @parent_type. The type system uses the information contained in the
     * #GTypeInfo structure pointed to by @info to manage the type and its
     * instances (if not abstract). The value of @flags determines the nature
     * (e.g. abstract or not) of the type.
     *
     * @param parentType type from which this type will be derived
     * @param typeName 0-terminated string used as the name of the new type
     * @param info #GTypeInfo structure for this type
     * @param flags bitwise combination of #GTypeFlags values
     * @return the new type identifier
     */
    public fun typeRegisterStatic(
        parentType: ULong,
        typeName: String,
        info: TypeInfo,
        flags: TypeFlags,
    ): ULong = g_type_register_static(parentType, typeName, info.gobjectTypeInfoPointer.reinterpret(), flags.mask)

    /**
     *
     *
     * @param type
     * @param flags
     */
    public fun typeTestFlags(
        type: ULong,
        flags: UInt,
    ): Boolean = g_type_test_flags(type, flags).asBoolean()

    /**
     * Returns whether a #GValue of type @src_type can be copied into
     * a #GValue of type @dest_type.
     *
     * @param srcType source type to be copied.
     * @param destType destination type for copying.
     * @return true if g_value_copy() is possible with @src_type and @dest_type.
     */
    public fun valueTypeCompatible(
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
    public fun valueTypeTransformable(
        srcType: ULong,
        destType: ULong,
    ): Boolean = g_value_type_transformable(srcType, destType).asBoolean()

    public fun resolveException(error: Error): GlibException {
        val ex =
            when (error.domain) {
                else -> null
            }
        return ex ?: GlibException(error)
    }
}

public val BaseFinalizeFuncFunc: CPointer<CFunction<(CPointer<GTypeClass>) -> Unit>> =
    staticCFunction {
            gClass: CPointer<GTypeClass>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(gClass: TypeClass) -> Unit>().get().invoke(
            gClass!!.run {
                TypeClass(reinterpret())
            }
        )
    }.reinterpret()

public val BaseInitFuncFunc: CPointer<CFunction<(CPointer<GTypeClass>) -> Unit>> =
    staticCFunction {
            gClass: CPointer<GTypeClass>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(gClass: TypeClass) -> Unit>().get().invoke(
            gClass!!.run {
                TypeClass(reinterpret())
            }
        )
    }.reinterpret()

public val BindingTransformFuncFunc: CPointer<
    CFunction<
        (
            CPointer<GBinding>,
            CPointer<GValue>,
            CPointer<GValue>,
        ) -> Int
    >
> =
    staticCFunction {
            binding: CPointer<GBinding>?,
            fromValue: CPointer<GValue>?,
            toValue: CPointer<GValue>?,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<
                (
                    binding: Binding,
                    fromValue: Value,
                    toValue: Value,
                ) -> Boolean
            >()
            .get()
            .invoke(
                binding!!.run {
                    Binding(reinterpret())
                },
                fromValue!!.run {
                    Value(reinterpret())
                },
                toValue!!.run {
                    Value(reinterpret())
                }
            ).asGBoolean()
    }.reinterpret()

public val BoxedFreeFuncFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction { userData: COpaquePointer ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

public val CallbackFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction { userData: COpaquePointer ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

public val ClassFinalizeFuncFunc: CPointer<CFunction<(CPointer<GTypeClass>) -> Unit>> =
    staticCFunction {
            gClass: CPointer<GTypeClass>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(gClass: TypeClass) -> Unit>().get().invoke(
            gClass!!.run {
                TypeClass(reinterpret())
            }
        )
    }.reinterpret()

public val ClassInitFuncFunc: CPointer<CFunction<(CPointer<GTypeClass>) -> Unit>> =
    staticCFunction {
            gClass: CPointer<GTypeClass>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(gClass: TypeClass) -> Unit>().get().invoke(
            gClass!!.run {
                TypeClass(reinterpret())
            }
        )
    }.reinterpret()

public val ClosureMarshalFunc: CPointer<
    CFunction<
        (
            CPointer<GClosure>,
            CPointer<GValue>?,
            UInt,
        ) -> Unit
    >
> =
    staticCFunction {
            closure: CPointer<GClosure>?,
            returnValue: CPointer<GValue>?,
            nParamValues: UInt,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<
                (
                    closure: Closure,
                    returnValue: Value?,
                    nParamValues: UInt,
                ) -> Unit
            >()
            .get()
            .invoke(
                closure!!.run {
                    Closure(reinterpret())
                },
                returnValue?.run {
                    Value(reinterpret())
                },
                nParamValues
            )
    }.reinterpret()

public val ClosureNotifyFunc: CPointer<CFunction<(CPointer<GClosure>) -> Unit>> =
    staticCFunction {
            closure: CPointer<GClosure>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(closure: Closure) -> Unit>().get().invoke(
            closure!!.run {
                Closure(reinterpret())
            }
        )
    }.reinterpret()

public val InstanceInitFuncFunc:
    CPointer<CFunction<(CPointer<GTypeInstance>, CPointer<GTypeClass>) -> Unit>> =
    staticCFunction {
            instance: CPointer<GTypeInstance>?,
            gClass: CPointer<GTypeClass>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(instance: TypeInstance, gClass: TypeClass) -> Unit>().get().invoke(
            instance!!.run {
                TypeInstance(reinterpret())
            },
            gClass!!.run {
                TypeClass(reinterpret())
            }
        )
    }.reinterpret()

public val InterfaceFinalizeFuncFunc: CPointer<CFunction<(CPointer<GTypeInterface>) -> Unit>> =
    staticCFunction {
            gIface: CPointer<GTypeInterface>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(gIface: TypeInterface) -> Unit>().get().invoke(
            gIface!!.run {
                TypeInterface(reinterpret())
            }
        )
    }.reinterpret()

public val InterfaceInitFuncFunc: CPointer<CFunction<(CPointer<GTypeInterface>) -> Unit>> =
    staticCFunction {
            gIface: CPointer<GTypeInterface>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(gIface: TypeInterface) -> Unit>().get().invoke(
            gIface!!.run {
                TypeInterface(reinterpret())
            }
        )
    }.reinterpret()

public val ObjectFinalizeFuncFunc: CPointer<CFunction<(CPointer<GObject>) -> Unit>> =
    staticCFunction {
            `object`: CPointer<GObject>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(`object`: Object) -> Unit>().get().invoke(
            `object`!!.run {
                Object(reinterpret())
            }
        )
    }.reinterpret()

public val ObjectGetPropertyFuncFunc: CPointer<
    CFunction<
        (
            CPointer<GObject>,
            UInt,
            CPointer<GValue>,
            CPointer<GParamSpec>,
        ) -> Unit
    >
> =
    staticCFunction {
            `object`: CPointer<GObject>?,
            propertyId: UInt,
            `value`: CPointer<GValue>?,
            pspec: CPointer<GParamSpec>?,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<
                (
                    `object`: Object,
                    propertyId: UInt,
                    `value`: Value,
                    pspec: ParamSpec,
                ) -> Unit
            >()
            .get()
            .invoke(
                `object`!!.run {
                    Object(reinterpret())
                },
                propertyId,
                `value`!!.run {
                    Value(reinterpret())
                },
                pspec!!.run {
                    ParamSpec(reinterpret())
                }
            )
    }.reinterpret()

public val ObjectSetPropertyFuncFunc: CPointer<
    CFunction<
        (
            CPointer<GObject>,
            UInt,
            CPointer<GValue>,
            CPointer<GParamSpec>,
        ) -> Unit
    >
> =
    staticCFunction {
            `object`: CPointer<GObject>?,
            propertyId: UInt,
            `value`: CPointer<GValue>?,
            pspec: CPointer<GParamSpec>?,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<
                (
                    `object`: Object,
                    propertyId: UInt,
                    `value`: Value,
                    pspec: ParamSpec,
                ) -> Unit
            >()
            .get()
            .invoke(
                `object`!!.run {
                    Object(reinterpret())
                },
                propertyId,
                `value`!!.run {
                    Value(reinterpret())
                },
                pspec!!.run {
                    ParamSpec(reinterpret())
                }
            )
    }.reinterpret()

public val SignalAccumulatorFunc: CPointer<
    CFunction<
        (
            CPointer<GSignalInvocationHint>,
            CPointer<GValue>,
            CPointer<GValue>,
        ) -> Int
    >
> =
    staticCFunction {
            ihint: CPointer<GSignalInvocationHint>?,
            returnAccu: CPointer<GValue>?,
            handlerReturn: CPointer<GValue>?,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<
                (
                    ihint: SignalInvocationHint,
                    returnAccu: Value,
                    handlerReturn: Value,
                ) -> Boolean
            >()
            .get()
            .invoke(
                ihint!!.run {
                    SignalInvocationHint(reinterpret())
                },
                returnAccu!!.run {
                    Value(reinterpret())
                },
                handlerReturn!!.run {
                    Value(reinterpret())
                }
            ).asGBoolean()
    }.reinterpret()

public val SignalEmissionHookFunc:
    CPointer<CFunction<(CPointer<GSignalInvocationHint>, UInt) -> Int>> =
    staticCFunction {
            ihint: CPointer<GSignalInvocationHint>?,
            nParamValues: UInt,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<(ihint: SignalInvocationHint, nParamValues: UInt) -> Boolean>()
            .get()
            .invoke(
                ihint!!.run {
                    SignalInvocationHint(reinterpret())
                },
                nParamValues
            ).asGBoolean()
    }.reinterpret()

public val ToggleNotifyFunc: CPointer<CFunction<(CPointer<GObject>, Int) -> Unit>> =
    staticCFunction {
            `object`: CPointer<GObject>?,
            isLastRef: Int,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(`object`: Object, isLastRef: Boolean) -> Unit>().get().invoke(
            `object`!!.run {
                Object(reinterpret())
            },
            isLastRef.asBoolean()
        )
    }.reinterpret()

public val TypeClassCacheFuncFunc: CPointer<CFunction<(CPointer<GTypeClass>) -> Int>> =
    staticCFunction {
            gClass: CPointer<GTypeClass>?,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<(gClass: TypeClass) -> Boolean>()
            .get()
            .invoke(
                gClass!!.run {
                    TypeClass(reinterpret())
                }
            ).asGBoolean()
    }.reinterpret()

public val TypeInterfaceCheckFuncFunc: CPointer<CFunction<(CPointer<GTypeInterface>) -> Unit>> =
    staticCFunction {
            gIface: CPointer<GTypeInterface>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(gIface: TypeInterface) -> Unit>().get().invoke(
            gIface!!.run {
                TypeInterface(reinterpret())
            }
        )
    }.reinterpret()

public val TypePluginCompleteInterfaceInfoFunc: CPointer<
    CFunction<
        (
            CPointer<GTypePlugin>,
            ULong,
            ULong,
            CPointer<GInterfaceInfo>,
        ) -> Unit
    >
> =
    staticCFunction {
            plugin: CPointer<GTypePlugin>?,
            instanceType: ULong,
            interfaceType: ULong,
            info: CPointer<GInterfaceInfo>?,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<
                (
                    plugin: TypePlugin,
                    instanceType: ULong,
                    interfaceType: ULong,
                    info: InterfaceInfo,
                ) -> Unit
            >()
            .get()
            .invoke(
                plugin!!.run {
                    TypePlugin.wrap(reinterpret())
                },
                instanceType,
                interfaceType,
                info!!.run {
                    InterfaceInfo(reinterpret())
                }
            )
    }.reinterpret()

public val TypePluginCompleteTypeInfoFunc: CPointer<
    CFunction<
        (
            CPointer<GTypePlugin>,
            ULong,
            CPointer<GTypeInfo>,
            CPointer<GTypeValueTable>,
        ) -> Unit
    >
> =
    staticCFunction {
            plugin: CPointer<GTypePlugin>?,
            gType: ULong,
            info: CPointer<GTypeInfo>?,
            valueTable: CPointer<GTypeValueTable>?,
            userData: COpaquePointer,
        ->
        userData
            .asStableRef<
                (
                    plugin: TypePlugin,
                    gType: ULong,
                    info: TypeInfo,
                    valueTable: TypeValueTable,
                ) -> Unit
            >()
            .get()
            .invoke(
                plugin!!.run {
                    TypePlugin.wrap(reinterpret())
                },
                gType,
                info!!.run {
                    TypeInfo(reinterpret())
                },
                valueTable!!.run {
                    TypeValueTable(reinterpret())
                }
            )
    }.reinterpret()

public val TypePluginUnuseFunc: CPointer<CFunction<(CPointer<GTypePlugin>) -> Unit>> =
    staticCFunction {
            plugin: CPointer<GTypePlugin>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(plugin: TypePlugin) -> Unit>().get().invoke(
            plugin!!.run {
                TypePlugin.wrap(reinterpret())
            }
        )
    }.reinterpret()

public val TypePluginUseFunc: CPointer<CFunction<(CPointer<GTypePlugin>) -> Unit>> =
    staticCFunction {
            plugin: CPointer<GTypePlugin>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(plugin: TypePlugin) -> Unit>().get().invoke(
            plugin!!.run {
                TypePlugin.wrap(reinterpret())
            }
        )
    }.reinterpret()

public val TypeValueCopyFuncFunc: CPointer<CFunction<(CPointer<GValue>, CPointer<GValue>) -> Unit>> =
    staticCFunction {
            srcValue: CPointer<GValue>?,
            destValue: CPointer<GValue>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(srcValue: Value, destValue: Value) -> Unit>().get().invoke(
            srcValue!!.run {
                Value(reinterpret())
            },
            destValue!!.run {
                Value(reinterpret())
            }
        )
    }.reinterpret()

public val TypeValueFreeFuncFunc: CPointer<CFunction<(CPointer<GValue>) -> Unit>> =
    staticCFunction {
            `value`: CPointer<GValue>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(`value`: Value) -> Unit>().get().invoke(
            `value`!!.run {
                Value(reinterpret())
            }
        )
    }.reinterpret()

public val TypeValueInitFuncFunc: CPointer<CFunction<(CPointer<GValue>) -> Unit>> =
    staticCFunction {
            `value`: CPointer<GValue>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(`value`: Value) -> Unit>().get().invoke(
            `value`!!.run {
                Value(reinterpret())
            }
        )
    }.reinterpret()

public val ValueTransformFunc: CPointer<CFunction<(CPointer<GValue>, CPointer<GValue>) -> Unit>> =
    staticCFunction {
            srcValue: CPointer<GValue>?,
            destValue: CPointer<GValue>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(srcValue: Value, destValue: Value) -> Unit>().get().invoke(
            srcValue!!.run {
                Value(reinterpret())
            },
            destValue!!.run {
                Value(reinterpret())
            }
        )
    }.reinterpret()

public val WeakNotifyFunc: CPointer<CFunction<(CPointer<GObject>) -> Unit>> =
    staticCFunction {
            whereTheObjectWas: CPointer<GObject>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(whereTheObjectWas: Object) -> Unit>().get().invoke(
            whereTheObjectWas!!.run {
                Object(reinterpret())
            }
        )
    }.reinterpret()

/**
 * A callback function used by the type system to finalize those portions
 * of a derived types class structure that were setup from the corresponding
 * GBaseInitFunc() function.
 *
 * Class finalization basically works the inverse way in which class
 * initialization is performed.
 *
 * See GClassInitFunc() for a discussion of the class initialization process.
 *
 * - param `gClass` The #GTypeClass structure to finalize
 */
public typealias BaseFinalizeFunc = (gClass: TypeClass) -> Unit

/**
 * A callback function used by the type system to do base initialization
 * of the class structures of derived types.
 *
 * This function is called as part of the initialization process of all derived
 * classes and should reallocate or reset all dynamic class members copied over
 * from the parent class.
 *
 * For example, class members (such as strings) that are not sufficiently
 * handled by a plain memory copy of the parent class into the derived class
 * have to be altered. See GClassInitFunc() for a discussion of the class
 * initialization process.
 *
 * - param `gClass` The #GTypeClass structure to initialize
 */
public typealias BaseInitFunc = (gClass: TypeClass) -> Unit

/**
 * A function to be called to transform @from_value to @to_value.
 *
 * If this is the @transform_to function of a binding, then @from_value
 * is the @source_property on the @source object, and @to_value is the
 * @target_property on the @target object. If this is the
 * @transform_from function of a %G_BINDING_BIDIRECTIONAL binding,
 * then those roles are reversed.
 *
 * - param `binding` a #GBinding
 * - param `fromValue` the #GValue containing the value to transform
 * - param `toValue` the #GValue in which to store the transformed value
 * - return true if the transformation was successful, and false
 *   otherwise
 */
public typealias BindingTransformFunc = (
    binding: Binding,
    fromValue: Value,
    toValue: Value,
) -> Boolean

/**
 * This function is provided by the user and should free the boxed
 * structure passed.
 */
public typealias BoxedFreeFunc = () -> Unit

/**
 * The type used for callback functions in structure definitions and function
 * signatures.
 *
 * This doesn't mean that all callback functions must take no  parameters and
 * return void. The required signature of a callback function is determined by
 * the context in which is used (e.g. the signal to which it is connected).
 *
 * Use G_CALLBACK() to cast the callback function to a #GCallback.
 */
public typealias Callback = () -> Unit

/**
 * A callback function used by the type system to finalize a class.
 *
 * This function is rarely needed, as dynamically allocated class resources
 * should be handled by GBaseInitFunc() and GBaseFinalizeFunc().
 *
 * Also, specification of a GClassFinalizeFunc() in the #GTypeInfo
 * structure of a static type is invalid, because classes of static types
 * will never be finalized (they are artificially kept alive when their
 * reference count drops to zero).
 *
 * - param `gClass` The #GTypeClass structure to finalize
 */
public typealias ClassFinalizeFunc = (gClass: TypeClass) -> Unit

/**
 * A callback function used by the type system to initialize the class
 * of a specific type.
 *
 * This function should initialize all static class members.
 *
 * The initialization process of a class involves:
 *
 * - Copying common members from the parent class over to the
 *   derived class structure.
 * - Zero initialization of the remaining members not copied
 *   over from the parent class.
 * - Invocation of the GBaseInitFunc() initializers of all parent
 *   types and the class' type.
 * - Invocation of the class' GClassInitFunc() initializer.
 *
 * Since derived classes are partially initialized through a memory copy
 * of the parent class, the general rule is that GBaseInitFunc() and
 * GBaseFinalizeFunc() should take care of necessary reinitialization
 * and release of those class members that were introduced by the type
 * that specified these GBaseInitFunc()/GBaseFinalizeFunc().
 * GClassInitFunc() should only care about initializing static
 * class members, while dynamic class members (such as allocated strings
 * or reference counted resources) are better handled by a GBaseInitFunc()
 * for this type, so proper initialization of the dynamic class members
 * is performed for class initialization of derived types as well.
 *
 * An example may help to correspond the intend of the different class
 * initializers:
 *
 * |[<!-- language="C" -->
 * typedef struct {
 *   GObjectClass parent_class;
 *   gint         static_integer;
 *   gchar       *dynamic_string;
 * } TypeAClass;
 * static void
 * type_a_base_class_init (TypeAClass *class)
 * {
 *   class->dynamic_string = g_strdup ("some string");
 * }
 * static void
 * type_a_base_class_finalize (TypeAClass *class)
 * {
 *   g_free (class->dynamic_string);
 * }
 * static void
 * type_a_class_init (TypeAClass *class)
 * {
 *   class->static_integer = 42;
 * }
 *
 * typedef struct {
 *   TypeAClass   parent_class;
 *   gfloat       static_float;
 *   GString     *dynamic_gstring;
 * } TypeBClass;
 * static void
 * type_b_base_class_init (TypeBClass *class)
 * {
 *   class->dynamic_gstring = g_string_new ("some other string");
 * }
 * static void
 * type_b_base_class_finalize (TypeBClass *class)
 * {
 *   g_string_free (class->dynamic_gstring);
 * }
 * static void
 * type_b_class_init (TypeBClass *class)
 * {
 *   class->static_float = 3.14159265358979323846;
 * }
 * ]|
 *
 * Initialization of TypeBClass will first cause initialization of
 * TypeAClass (derived classes reference their parent classes, see
 * g_type_class_ref() on this).
 *
 * Initialization of TypeAClass roughly involves zero-initializing its fields,
 * then calling its GBaseInitFunc() type_a_base_class_init() to allocate
 * its dynamic members (dynamic_string), and finally calling its GClassInitFunc()
 * type_a_class_init() to initialize its static members (static_integer).
 * The first step in the initialization process of TypeBClass is then
 * a plain memory copy of the contents of TypeAClass into TypeBClass and
 * zero-initialization of the remaining fields in TypeBClass.
 * The dynamic members of TypeAClass within TypeBClass now need
 * reinitialization which is performed by calling type_a_base_class_init()
 * with an argument of TypeBClass.
 *
 * After that, the GBaseInitFunc() of TypeBClass, type_b_base_class_init()
 * is called to allocate the dynamic members of TypeBClass (dynamic_gstring),
 * and finally the GClassInitFunc() of TypeBClass, type_b_class_init(),
 * is called to complete the initialization process with the static members
 * (static_float).
 *
 * Corresponding finalization counter parts to the GBaseInitFunc() functions
 * have to be provided to release allocated resources at class finalization
 * time.
 *
 * - param `gClass` The #GTypeClass structure to initialize.
 */
public typealias ClassInitFunc = (gClass: TypeClass) -> Unit

/**
 * The type used for marshaller functions.
 *
 * - param `closure` the #GClosure to which the marshaller belongs
 * - param `returnValue` a #GValue to store the return
 *  value. May be null if the callback of @closure doesn't return a
 *  value.
 * - param `nParamValues` the length of the @param_values array
 */
public typealias ClosureMarshal = (
    closure: Closure,
    returnValue: Value?,
    nParamValues: UInt,
) -> Unit

/**
 * The type used for the various notification callbacks which can be registered
 * on closures.
 *
 * - param `closure` the #GClosure on which the notification is emitted
 */
public typealias ClosureNotify = (closure: Closure) -> Unit

/**
 * A callback function used by the type system to initialize a new
 * instance of a type.
 *
 * This function initializes all instance members and allocates any resources
 * required by it.
 *
 * Initialization of a derived instance involves calling all its parent
 * types instance initializers, so the class member of the instance
 * is altered during its initialization to always point to the class that
 * belongs to the type the current initializer was introduced for.
 *
 * The extended members of @instance are guaranteed to have been filled with
 * zeros before this function is called.
 *
 * - param `instance` The instance to initialize
 * - param `gClass` The class of the type the instance is
 *    created for
 */
public typealias InstanceInitFunc = (instance: TypeInstance, gClass: TypeClass) -> Unit

/**
 * A callback function used by the type system to finalize an interface.
 *
 * This function should destroy any internal data and release any resources
 * allocated by the corresponding GInterfaceInitFunc() function.
 *
 * - param `gIface` The interface structure to finalize
 */
public typealias InterfaceFinalizeFunc = (gIface: TypeInterface) -> Unit

/**
 * A callback function used by the type system to initialize a new
 * interface.
 *
 * This function should initialize all internal data and* allocate any
 * resources required by the interface.
 *
 * The members of @iface_data are guaranteed to have been filled with
 * zeros before this function is called.
 *
 * - param `gIface` The interface structure to initialize
 */
public typealias InterfaceInitFunc = (gIface: TypeInterface) -> Unit

/**
 * The type of the @finalize function of #GObjectClass.
 *
 * - param `object` the #GObject being finalized
 */
public typealias ObjectFinalizeFunc = (`object`: Object) -> Unit

/**
 * The type of the @get_property function of #GObjectClass.
 *
 * - param `object` a #GObject
 * - param `propertyId` the numeric id under which the property was registered with
 *  g_object_class_install_property().
 * - param `value` a #GValue to return the property value in
 * - param `pspec` the #GParamSpec describing the property
 */
public typealias ObjectGetPropertyFunc = (
    `object`: Object,
    propertyId: UInt,
    `value`: Value,
    pspec: ParamSpec,
) -> Unit

/**
 * The type of the @set_property function of #GObjectClass.
 *
 * - param `object` a #GObject
 * - param `propertyId` the numeric id under which the property was registered with
 *  g_object_class_install_property().
 * - param `value` the new value for the property
 * - param `pspec` the #GParamSpec describing the property
 */
public typealias ObjectSetPropertyFunc = (
    `object`: Object,
    propertyId: UInt,
    `value`: Value,
    pspec: ParamSpec,
) -> Unit

/**
 * The signal accumulator is a special callback function that can be used
 * to collect return values of the various callbacks that are called
 * during a signal emission.
 *
 * The signal accumulator is specified at signal creation time, if it is
 * left null, no accumulation of callback return values is performed.
 * The return value of signal emissions is then the value returned by the
 * last callback.
 *
 * - param `ihint` Signal invocation hint, see #GSignalInvocationHint.
 * - param `returnAccu` Accumulator to collect callback return values in, this
 *  is the return value of the current signal emission.
 * - param `handlerReturn` A #GValue holding the return value of the signal handler.
 * - return The accumulator function returns whether the signal emission
 *  should be aborted. Returning true will continue with
 *  the signal emission. Returning false will abort the current emission.
 *  Since 2.62, returning false will skip to the CLEANUP stage. In this case,
 *  emission will occur as normal in the CLEANUP stage and the handler's
 *  return value will be accumulated.
 */
public typealias SignalAccumulator = (
    ihint: SignalInvocationHint,
    returnAccu: Value,
    handlerReturn: Value,
) -> Boolean

/**
 * A simple function pointer to get invoked when the signal is emitted.
 *
 * Emission hooks allow you to tie a hook to the signal type, so that it will
 * trap all emissions of that signal, from any object.
 *
 * You may not attach these to signals created with the %G_SIGNAL_NO_HOOKS flag.
 *
 * - param `ihint` Signal invocation hint, see #GSignalInvocationHint.
 * - param `nParamValues` the number of parameters to the function, including
 *  the instance on which the signal was emitted.
 * - return whether it wants to stay connected. If it returns false, the signal
 *  hook is disconnected (and destroyed).
 */
public typealias SignalEmissionHook = (ihint: SignalInvocationHint, nParamValues: UInt) -> Boolean

/**
 * A callback function used for notification when the state
 * of a toggle reference changes.
 *
 * See also: g_object_add_toggle_ref()
 *
 * - param `object` The object on which g_object_add_toggle_ref() was called.
 * - param `isLastRef` true if the toggle reference is now the
 *  last reference to the object. false if the toggle
 *  reference was the last reference and there are now other
 *  references.
 */
public typealias ToggleNotify = (`object`: Object, isLastRef: Boolean) -> Unit

/**
 * A callback function which is called when the reference count of a class
 * drops to zero.
 *
 * It may use g_type_class_ref() to prevent the class from being freed. You
 * should not call g_type_class_unref() from a #GTypeClassCacheFunc function
 * to prevent infinite recursion, use g_type_class_unref_uncached() instead.
 *
 * The functions have to check the class id passed in to figure
 * whether they actually want to cache the class of this type, since all
 * classes are routed through the same #GTypeClassCacheFunc chain.
 *
 * - param `gClass` The #GTypeClass structure which is
 *    unreferenced
 * - return true to stop further #GTypeClassCacheFuncs from being
 *  called, false to continue
 */
public typealias TypeClassCacheFunc = (gClass: TypeClass) -> Boolean

/**
 * A callback called after an interface vtable is initialized.
 *
 * See g_type_add_interface_check().
 *
 * - param `gIface` the interface that has been
 *    initialized
 */
public typealias TypeInterfaceCheckFunc = (gIface: TypeInterface) -> Unit

/**
 * The type of the @complete_interface_info function of #GTypePluginClass.
 *
 * - param `plugin` the #GTypePlugin
 * - param `instanceType` the #GType of an instantiatable type to which the interface
 *  is added
 * - param `interfaceType` the #GType of the interface whose info is completed
 * - param `info` the #GInterfaceInfo to fill in
 */
public typealias TypePluginCompleteInterfaceInfo = (
    plugin: TypePlugin,
    instanceType: ULong,
    interfaceType: ULong,
    info: InterfaceInfo,
) -> Unit

/**
 * The type of the @complete_type_info function of #GTypePluginClass.
 *
 * - param `plugin` the #GTypePlugin
 * - param `gType` the #GType whose info is completed
 * - param `info` the #GTypeInfo struct to fill in
 * - param `valueTable` the #GTypeValueTable to fill in
 */
public typealias TypePluginCompleteTypeInfo = (
    plugin: TypePlugin,
    gType: ULong,
    info: TypeInfo,
    valueTable: TypeValueTable,
) -> Unit

/**
 * The type of the @unuse_plugin function of #GTypePluginClass.
 *
 * - param `plugin` the #GTypePlugin whose use count should be decreased
 */
public typealias TypePluginUnuse = (plugin: TypePlugin) -> Unit

/**
 * The type of the @use_plugin function of #GTypePluginClass, which gets called
 * to increase the use count of @plugin.
 *
 * - param `plugin` the #GTypePlugin whose use count should be increased
 */
public typealias TypePluginUse = (plugin: TypePlugin) -> Unit

/**
 * Copies the content of a #GValue into another.
 *
 * The @dest_value is a #GValue with zero-filled data section and @src_value
 * is a properly initialized #GValue of same type, or derived type.
 *
 * The purpose of this function is to copy the contents of @src_value
 * into @dest_value in a way, that even after @src_value has been freed, the
 * contents of @dest_value remain valid. String type example:
 *
 * |[<!-- language="C" -->
 * dest_value->data[0].v_pointer = g_strdup (src_value->data[0].v_pointer);
 * ]|
 *
 * - param `srcValue` the value to copy
 * - param `destValue` the location of the copy
 */
public typealias TypeValueCopyFunc = (srcValue: Value, destValue: Value) -> Unit

/**
 * Frees any old contents that might be left in the `value->data` array of
 * the given value.
 *
 * No resources may remain allocated through the #GValue contents after this
 * function returns. E.g. for our above string type:
 *
 * |[<!-- language="C" -->
 * // only free strings without a specific flag for static storage
 * if (!(value->data[1].v_uint & G_VALUE_NOCOPY_CONTENTS))
 *   g_free (value->data[0].v_pointer);
 * ]|
 *
 * - param `value` the value to free
 */
public typealias TypeValueFreeFunc = (`value`: Value) -> Unit

/**
 * Initializes the value contents by setting the fields of the `value->data`
 * array.
 *
 * The data array of the #GValue passed into this function was zero-filled
 * with `memset()`, so no care has to be taken to free any old contents.
 * For example, in the case of a string value that may never be null, the
 * implementation might look like:
 *
 * |[<!-- language="C" -->
 * value->data[0].v_pointer = g_strdup ("");
 * ]|
 *
 * - param `value` the value to initialize
 */
public typealias TypeValueInitFunc = (`value`: Value) -> Unit

/**
 * The type of value transformation functions which can be registered with
 * g_value_register_transform_func().
 *
 * @dest_value will be initialized to the correct destination type.
 *
 * - param `srcValue` Source value.
 * - param `destValue` Target value.
 */
public typealias ValueTransform = (srcValue: Value, destValue: Value) -> Unit

/**
 * A #GWeakNotify function can be added to an object as a callback that gets
 * triggered when the object is finalized.
 *
 * Since the object is already being disposed when the #GWeakNotify is called,
 * there's not much you could do with the object, apart from e.g. using its
 * address as hash-index or the like.
 *
 * In particular, this means it’s invalid to call g_object_ref(),
 * g_weak_ref_init(), g_weak_ref_set(), g_object_add_toggle_ref(),
 * g_object_weak_ref(), g_object_add_weak_pointer() or any function which calls
 * them on the object from this callback.
 *
 * - param `whereTheObjectWas` the object being disposed
 */
public typealias WeakNotify = (whereTheObjectWas: Object) -> Unit

/**
 * A numerical value which represents the unique identifier of a registered
 * type.
 */
public typealias Type = ULong

// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.jsc

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CArrayPointer
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.CPointerVarOf
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.OptionGroup
import org.gtkkn.bindings.jsc.annotations.JavaScriptCoreVersion2_24
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.ext.toCStringList
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.TypeCache
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.glib.gsize
import org.gtkkn.native.glib.guint
import org.gtkkn.native.jsc.JSCClass
import org.gtkkn.native.jsc.JSCContext
import org.gtkkn.native.jsc.JSCException
import org.gtkkn.native.jsc.JSCOptionType
import org.gtkkn.native.jsc.JSCValue
import org.gtkkn.native.jsc.jsc_get_major_version
import org.gtkkn.native.jsc.jsc_get_micro_version
import org.gtkkn.native.jsc.jsc_get_minor_version
import org.gtkkn.native.jsc.jsc_options_foreach
import org.gtkkn.native.jsc.jsc_options_get_option_group
import org.gtkkn.native.jsc.jsc_options_set_boolean
import org.gtkkn.native.jsc.jsc_options_set_double
import org.gtkkn.native.jsc.jsc_options_set_int
import org.gtkkn.native.jsc.jsc_options_set_range_string
import org.gtkkn.native.jsc.jsc_options_set_size
import org.gtkkn.native.jsc.jsc_options_set_string
import org.gtkkn.native.jsc.jsc_options_set_uint
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * ## Skipped during bindings generation
 *
 * - parameter `value`: value: Out parameter is not supported
 * - parameter `value`: value: Out parameter is not supported
 * - parameter `value`: value: Out parameter is not supported
 * - parameter `value`: value: Out parameter is not supported
 * - parameter `value`: value: Out parameter is not supported
 * - parameter `value`: value: Out parameter is not supported
 * - parameter `value`: value: Out parameter is not supported
 * - record `ClassClass`: glib type struct are ignored
 * - record `ContextClass`: glib type struct are ignored
 * - record `ExceptionClass`: glib type struct are ignored
 * - record `ValueClass`: glib type struct are ignored
 * - record `VirtualMachineClass`: glib type struct are ignored
 * - record `WeakValueClass`: glib type struct are ignored
 */
public object JavaScriptCore {
    init {
        registerTypes()
    }

    /**
     * Like jsc_get_major_version(), but from the headers used at
     * application compile time, rather than from the library linked
     * against at application run time.
     */
    public const val MAJOR_VERSION: gint = 2

    /**
     * Like jsc_get_micro_version(), but from the headers used at
     * application compile time, rather than from the library linked
     * against at application run time.
     */
    public const val MICRO_VERSION: gint = 5

    /**
     * Like jsc_get_minor_version(), but from the headers used at
     * application compile time, rather than from the library linked
     * against at application run time.
     */
    public const val MINOR_VERSION: gint = 46

    /**
     * Allows the DFG JIT to be used if true.
     * Option type: %JSC_OPTION_BOOLEAN
     * Default value: true.
     *
     * @since 2.24
     */
    public const val OPTIONS_USE_DFG: String = "useDFGJIT"

    /**
     * Allows the FTL JIT to be used if true.
     * Option type: %JSC_OPTION_BOOLEAN
     * Default value: true.
     *
     * @since 2.24
     */
    public const val OPTIONS_USE_FTL: String = "useFTLJIT"

    /**
     * Allows the executable pages to be allocated for JIT and thunks if true.
     * Option type: %JSC_OPTION_BOOLEAN
     * Default value: true.
     *
     * @since 2.24
     */
    public const val OPTIONS_USE_JIT: String = "useJIT"

    /**
     * Allows the LLINT to be used if true.
     * Option type: %JSC_OPTION_BOOLEAN
     * Default value: true.
     *
     * @since 2.24
     */
    public const val OPTIONS_USE_LLINT: String = "useLLInt"

    /**
     * Returns the major version number of the JavaScriptCore library.
     * (e.g. in JavaScriptCore version 1.8.3 this is 1.)
     *
     * This function is in the library, so it represents the JavaScriptCore library
     * your code is running against. Contrast with the #JSC_MAJOR_VERSION
     * macro, which represents the major version of the JavaScriptCore headers you
     * have included when compiling your code.
     *
     * @return the major version number of the JavaScriptCore library
     */
    public fun getMajorVersion(): guint = jsc_get_major_version()

    /**
     * Returns the micro version number of the JavaScriptCore library.
     * (e.g. in JavaScriptCore version 1.8.3 this is 3.)
     *
     * This function is in the library, so it represents the JavaScriptCore library
     * your code is running against. Contrast with the #JSC_MICRO_VERSION
     * macro, which represents the micro version of the JavaScriptCore headers you
     * have included when compiling your code.
     *
     * @return the micro version number of the JavaScriptCore library
     */
    public fun getMicroVersion(): guint = jsc_get_micro_version()

    /**
     * Returns the minor version number of the JavaScriptCore library.
     * (e.g. in JavaScriptCore version 1.8.3 this is 8.)
     *
     * This function is in the library, so it represents the JavaScriptCore library
     * your code is running against. Contrast with the #JSC_MINOR_VERSION
     * macro, which represents the minor version of the JavaScriptCore headers you
     * have included when compiling your code.
     *
     * @return the minor version number of the JavaScriptCore library
     */
    public fun getMinorVersion(): guint = jsc_get_minor_version()

    /**
     * Iterates all available options calling @function for each one. Iteration can
     * stop early if @function returns false.
     *
     * @param function a #JSCOptionsFunc callback
     * @since 2.24
     */
    @JavaScriptCoreVersion2_24
    public fun optionsForeach(function: OptionsFunc): Unit =
        jsc_options_foreach(OptionsFuncFunc.reinterpret(), StableRef.create(function).asCPointer())

    /**
     * Create a #GOptionGroup to handle JSCOptions as command line arguments.
     * The options will be exposed as command line arguments with the form
     * <emphasis>--jsc-`&lt;`option`&gt;`=`&lt;`value`&gt;`</emphasis>.
     * Each entry in the returned #GOptionGroup is configured to apply the
     * corresponding option during command line parsing. Applications only need to
     * pass the returned group to g_option_context_add_group(), and the rest will
     * be taken care for automatically.
     *
     * @return a #GOptionGroup for the JSCOptions
     * @since 2.24
     */
    @JavaScriptCoreVersion2_24
    public fun optionsGetOptionGroup(): OptionGroup = jsc_options_get_option_group()!!.run {
        OptionGroup(this)
    }

    /**
     * Set @option as a #gboolean value.
     *
     * @param option the option identifier
     * @param value the value to set
     * @return true if option was correctly set or false otherwise.
     * @since 2.24
     */
    @JavaScriptCoreVersion2_24
    public fun optionsSetBoolean(option: String, `value`: Boolean): Boolean =
        jsc_options_set_boolean(option, `value`.asGBoolean()).asBoolean()

    /**
     * Set @option as a #gdouble value.
     *
     * @param option the option identifier
     * @param value the value to set
     * @return true if option was correctly set or false otherwise.
     * @since 2.24
     */
    @JavaScriptCoreVersion2_24
    public fun optionsSetDouble(option: String, `value`: gdouble): Boolean =
        jsc_options_set_double(option, `value`).asBoolean()

    /**
     * Set @option as a #gint value.
     *
     * @param option the option identifier
     * @param value the value to set
     * @return true if option was correctly set or false otherwise.
     * @since 2.24
     */
    @JavaScriptCoreVersion2_24
    public fun optionsSetInt(option: String, `value`: gint): Boolean = jsc_options_set_int(option, `value`).asBoolean()

    /**
     * Set @option as a range string. The string must be in the
     * format <emphasis>[!]`&lt;`low`&gt;`[:`&lt;`high`&gt;`]</emphasis> where low and high are #guint values.
     * Values between low and high (both included) will be considered in
     * the range, unless <emphasis>!</emphasis> is used to invert the range.
     *
     * @param option the option identifier
     * @param value the value to set
     * @return true if option was correctly set or false otherwise.
     * @since 2.24
     */
    @JavaScriptCoreVersion2_24
    public fun optionsSetRangeString(option: String, `value`: String): Boolean =
        jsc_options_set_range_string(option, `value`).asBoolean()

    /**
     * Set @option as a #gsize value.
     *
     * @param option the option identifier
     * @param value the value to set
     * @return true if option was correctly set or false otherwise.
     * @since 2.24
     */
    @JavaScriptCoreVersion2_24
    public fun optionsSetSize(option: String, `value`: gsize): Boolean =
        jsc_options_set_size(option, `value`).asBoolean()

    /**
     * Set @option as a string.
     *
     * @param option the option identifier
     * @param value the value to set
     * @return true if option was correctly set or false otherwise.
     * @since 2.24
     */
    @JavaScriptCoreVersion2_24
    public fun optionsSetString(option: String, `value`: String): Boolean =
        jsc_options_set_string(option, `value`).asBoolean()

    /**
     * Set @option as a #guint value.
     *
     * @param option the option identifier
     * @param value the value to set
     * @return true if option was correctly set or false otherwise.
     * @since 2.24
     */
    @JavaScriptCoreVersion2_24
    public fun optionsSetUint(option: String, `value`: guint): Boolean =
        jsc_options_set_uint(option, `value`).asBoolean()

    private fun registerTypes() {
        Class.getTypeOrNull()?.let { gtype -> TypeCache.register(Class::class, gtype) { Class(it.reinterpret()) } }
        Context.getTypeOrNull()?.let { gtype ->
            TypeCache.register(Context::class, gtype) { Context(it.reinterpret()) }
        }
        Exception.getTypeOrNull()?.let { gtype ->
            TypeCache.register(Exception::class, gtype) { Exception(it.reinterpret()) }
        }
        Value.getTypeOrNull()?.let { gtype -> TypeCache.register(Value::class, gtype) { Value(it.reinterpret()) } }
        VirtualMachine.getTypeOrNull()?.let { gtype ->
            TypeCache.register(VirtualMachine::class, gtype) { VirtualMachine(it.reinterpret()) }
        }
        WeakValue.getTypeOrNull()?.let { gtype ->
            TypeCache.register(WeakValue::class, gtype) { WeakValue(it.reinterpret()) }
        }
    }
}

public val ClassDeletePropertyFunctionFunc: CPointer<
    CFunction<
        (
            CPointer<JSCClass>,
            CPointer<JSCContext>,
            gpointer?,
            CPointer<ByteVar>,
        ) -> gboolean
        >
    > = staticCFunction {
        jscClass: CPointer<JSCClass>?,
        context: CPointer<JSCContext>?,
        instance: gpointer?,
        name: CPointer<ByteVar>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            jscClass: Class,
            context: Context,
            instance: gpointer?,
            name: String,
        ) -> Boolean
        >().get().invoke(
        jscClass!!.run {
            InstanceCache.get(this, false) { Class(reinterpret()) }!!
        },
        context!!.run {
            InstanceCache.get(this, false) { Context(reinterpret()) }!!
        },
        instance,
        name?.toKString() ?: error("Expected not null string")
    ).asGBoolean()
}
    .reinterpret()

public val ClassEnumeratePropertiesFunctionFunc: CPointer<
    CFunction<
        (
            CPointer<JSCClass>,
            CPointer<JSCContext>,
            gpointer?,
        ) -> CArrayPointer<CPointerVarOf<CPointer<ByteVar>>>?
        >
    > = staticCFunction {
        jscClass: CPointer<JSCClass>?,
        context: CPointer<JSCContext>?,
        instance: gpointer?,
        userData: COpaquePointer,
    ->
    memScoped {
        userData.asStableRef<
            (
                jscClass: Class,
                context: Context,
                instance: gpointer?,
            ) -> List<String>?
            >().get().invoke(
            jscClass!!.run {
                InstanceCache.get(this, false) { Class(reinterpret()) }!!
            },
            context!!.run {
                InstanceCache.get(this, false) { Context(reinterpret()) }!!
            },
            instance
        )?.toCStringList(this)
    }
}
    .reinterpret()

public val ClassGetPropertyFunctionFunc: CPointer<
    CFunction<
        (
            CPointer<JSCClass>,
            CPointer<JSCContext>,
            gpointer?,
            CPointer<ByteVar>,
        ) -> CPointer<JSCValue>?
        >
    > = staticCFunction {
        jscClass: CPointer<JSCClass>?,
        context: CPointer<JSCContext>?,
        instance: gpointer?,
        name: CPointer<ByteVar>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            jscClass: Class,
            context: Context,
            instance: gpointer?,
            name: String,
        ) -> Value?
        >().get().invoke(
        jscClass!!.run {
            InstanceCache.get(this, false) { Class(reinterpret()) }!!
        },
        context!!.run {
            InstanceCache.get(this, false) { Context(reinterpret()) }!!
        },
        instance,
        name?.toKString() ?: error("Expected not null string")
    )?.jscValuePointer
}
    .reinterpret()

public val ClassHasPropertyFunctionFunc: CPointer<
    CFunction<
        (
            CPointer<JSCClass>,
            CPointer<JSCContext>,
            gpointer?,
            CPointer<ByteVar>,
        ) -> gboolean
        >
    > = staticCFunction {
        jscClass: CPointer<JSCClass>?,
        context: CPointer<JSCContext>?,
        instance: gpointer?,
        name: CPointer<ByteVar>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            jscClass: Class,
            context: Context,
            instance: gpointer?,
            name: String,
        ) -> Boolean
        >().get().invoke(
        jscClass!!.run {
            InstanceCache.get(this, false) { Class(reinterpret()) }!!
        },
        context!!.run {
            InstanceCache.get(this, false) { Context(reinterpret()) }!!
        },
        instance,
        name?.toKString() ?: error("Expected not null string")
    ).asGBoolean()
}
    .reinterpret()

public val ClassSetPropertyFunctionFunc: CPointer<
    CFunction<
        (
            CPointer<JSCClass>,
            CPointer<JSCContext>,
            gpointer?,
            CPointer<ByteVar>,
            CPointer<JSCValue>,
        ) -> gboolean
        >
    > = staticCFunction {
        jscClass: CPointer<JSCClass>?,
        context: CPointer<JSCContext>?,
        instance: gpointer?,
        name: CPointer<ByteVar>?,
        `value`: CPointer<JSCValue>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            jscClass: Class,
            context: Context,
            instance: gpointer?,
            name: String,
            `value`: Value,
        ) -> Boolean
        >().get().invoke(
        jscClass!!.run {
            InstanceCache.get(this, false) { Class(reinterpret()) }!!
        },
        context!!.run {
            InstanceCache.get(this, false) { Context(reinterpret()) }!!
        },
        instance,
        name?.toKString() ?: error("Expected not null string"),
        `value`!!.run {
            InstanceCache.get(this, false) { Value(reinterpret()) }!!
        }
    ).asGBoolean()
}
    .reinterpret()

public val ExceptionHandlerFunc:
    CPointer<CFunction<(CPointer<JSCContext>, CPointer<JSCException>) -> Unit>> =
    staticCFunction {
            context: CPointer<JSCContext>?,
            exception: CPointer<JSCException>?,
            userData: gpointer?,
        ->
        userData!!.asStableRef<(context: Context, exception: Exception) -> Unit>().get().invoke(
            context!!.run {
                InstanceCache.get(this, false) { Context(reinterpret()) }!!
            },
            exception!!.run {
                InstanceCache.get(this, false) { Exception(reinterpret()) }!!
            }
        )
    }
        .reinterpret()

public val OptionsFuncFunc: CPointer<
    CFunction<
        (
            CPointer<ByteVar>,
            JSCOptionType,
            CPointer<ByteVar>?,
        ) -> gboolean
        >
    > = staticCFunction {
        option: CPointer<ByteVar>?,
        type: JSCOptionType,
        description: CPointer<ByteVar>?,
        userData: gpointer?,
    ->
    userData!!.asStableRef<
        (
            option: String,
            type: OptionType,
            description: String?,
        ) -> Boolean
        >().get().invoke(
        option?.toKString() ?: error("Expected not null string"),
        type.run {
            OptionType.fromNativeValue(this)
        },
        description?.toKString()
    ).asGBoolean()
}
    .reinterpret()

/**
 * The type of delete_property in #JSCClassVTable. This is only required when you need to handle
 * external properties not added to the prototype.
 *
 * - param `jscClass` a #JSCClass
 * - param `context` a #JSCContext
 * - param `instance` the @jsc_class instance
 * - param `name` the property name
 * - return true if handled or false to to forward the request to the parent class or prototype chain.
 */
public typealias ClassDeletePropertyFunction = (
    jscClass: Class,
    context: Context,
    instance: gpointer?,
    name: String,
) -> Boolean

/**
 * The type of enumerate_properties in #JSCClassVTable. This is only required when you need to handle
 * external properties not added to the prototype.
 *
 * - param `jscClass` a #JSCClass
 * - param `context` a #JSCContext
 * - param `instance` the @jsc_class instance
 * - return a null-terminated array of strings
 *    containing the property names, or null if @instance doesn't have enumerable properties.
 */
public typealias ClassEnumeratePropertiesFunction = (
    jscClass: Class,
    context: Context,
    instance: gpointer?,
) -> List<String>?

/**
 * The type of get_property in #JSCClassVTable. This is only required when you need to handle
 * external properties not added to the prototype.
 *
 * - param `jscClass` a #JSCClass
 * - param `context` a #JSCContext
 * - param `instance` the @jsc_class instance
 * - param `name` the property name
 * - return a #JSCValue or null to forward the request to
 *    the parent class or prototype chain
 */
public typealias ClassGetPropertyFunction = (
    jscClass: Class,
    context: Context,
    instance: gpointer?,
    name: String,
) -> Value?

/**
 * The type of has_property in #JSCClassVTable. This is only required when you need to handle
 * external properties not added to the prototype.
 *
 * - param `jscClass` a #JSCClass
 * - param `context` a #JSCContext
 * - param `instance` the @jsc_class instance
 * - param `name` the property name
 * - return true if @instance has a property with @name or false to forward the request
 *    to the parent class or prototype chain.
 */
public typealias ClassHasPropertyFunction = (
    jscClass: Class,
    context: Context,
    instance: gpointer?,
    name: String,
) -> Boolean

/**
 * The type of set_property in #JSCClassVTable. This is only required when you need to handle
 * external properties not added to the prototype.
 *
 * - param `jscClass` a #JSCClass
 * - param `context` a #JSCContext
 * - param `instance` the @jsc_class instance
 * - param `name` the property name
 * - param `value` the #JSCValue to set
 * - return true if handled or false to forward the request to the parent class or prototype chain.
 */
public typealias ClassSetPropertyFunction = (
    jscClass: Class,
    context: Context,
    instance: gpointer?,
    name: String,
    `value`: Value,
) -> Boolean

/**
 * Function used to handle JavaScript exceptions in a #JSCContext.
 *
 * - param `context` a #JSCContext
 * - param `exception` a #JSCException
 */
public typealias ExceptionHandler = (context: Context, exception: Exception) -> Unit

/**
 * Function used to iterate options.
 *
 * Not that @description string is not localized.
 *
 * - param `option` the option name
 * - param `type` the option #JSCOptionType
 * - param `description` the option description, or null
 * - return true to stop the iteration, or false otherwise
 */
public typealias OptionsFunc = (
    option: String,
    type: OptionType,
    description: String?,
) -> Boolean

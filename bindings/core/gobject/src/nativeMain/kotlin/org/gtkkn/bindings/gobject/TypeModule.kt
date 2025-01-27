// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.annotations.GObjectVersion2_6
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.GTypeModule
import org.gtkkn.native.gobject.GTypePlugin
import org.gtkkn.native.gobject.g_type_module_add_interface
import org.gtkkn.native.gobject.g_type_module_get_type
import org.gtkkn.native.gobject.g_type_module_register_enum
import org.gtkkn.native.gobject.g_type_module_register_flags
import org.gtkkn.native.gobject.g_type_module_register_type
import org.gtkkn.native.gobject.g_type_module_set_name
import org.gtkkn.native.gobject.g_type_module_unuse
import org.gtkkn.native.gobject.g_type_module_use
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * `GTypeModule` provides a simple implementation of the `GTypePlugin`
 * interface.
 *
 * The model of `GTypeModule` is a dynamically loaded module which
 * implements some number of types and interface implementations.
 *
 * When the module is loaded, it registers its types and interfaces
 * using [method@GObject.TypeModule.register_type] and
 * [method@GObject.TypeModule.add_interface].
 * As long as any instances of these types and interface implementations
 * are in use, the module is kept loaded. When the types and interfaces
 * are gone, the module may be unloaded. If the types and interfaces
 * become used again, the module will be reloaded. Note that the last
 * reference cannot be released from within the module code, since that
 * would lead to the caller's code being unloaded before `g_object_unref()`
 * returns to it.
 *
 * Keeping track of whether the module should be loaded or not is done by
 * using a use count - it starts at zero, and whenever it is greater than
 * zero, the module is loaded. The use count is maintained internally by
 * the type system, but also can be explicitly controlled by
 * [method@GObject.TypeModule.use] and [method@GObject.TypeModule.unuse].
 * Typically, when loading a module for the first type, `g_type_module_use()`
 * will be used to load it so that it can initialize its types. At some later
 * point, when the module no longer needs to be loaded except for the type
 * implementations it contains, `g_type_module_unuse()` is called.
 *
 * `GTypeModule` does not actually provide any implementation of module
 * loading and unloading. To create a particular module type you must
 * derive from `GTypeModule` and implement the load and unload functions
 * in `GTypeModuleClass`.
 */
public abstract class TypeModule(public val gobjectTypeModulePointer: CPointer<GTypeModule>) :
    Object(gobjectTypeModulePointer.reinterpret()),
    TypePlugin,
    KGTyped {
    override val gobjectTypePluginPointer: CPointer<GTypePlugin>
        get() = handle.reinterpret()

    /**
     * Registers an additional interface for a type, whose interface lives
     * in the given type plugin. If the interface was already registered
     * for the type in this plugin, nothing will be done.
     *
     * As long as any instances of the type exist, the type plugin will
     * not be unloaded.
     *
     * Since 2.56 if @module is null this will call g_type_add_interface_static()
     * instead. This can be used when making a static build of the module.
     *
     * @param instanceType type to which to add the interface.
     * @param interfaceType interface type to add
     * @param interfaceInfo type information structure
     */
    public open fun addInterface(instanceType: GType, interfaceType: GType, interfaceInfo: InterfaceInfo): Unit =
        g_type_module_add_interface(
            gobjectTypeModulePointer,
            instanceType,
            interfaceType,
            interfaceInfo.gobjectInterfaceInfoPointer
        )

    /**
     * Looks up or registers an enumeration that is implemented with a particular
     * type plugin. If a type with name @type_name was previously registered,
     * the #GType identifier for the type is returned, otherwise the type
     * is newly registered, and the resulting #GType identifier returned.
     *
     * As long as any instances of the type exist, the type plugin will
     * not be unloaded.
     *
     * Since 2.56 if @module is null this will call g_type_register_static()
     * instead. This can be used when making a static build of the module.
     *
     * @param name name for the type
     * @param constStaticValues an array of #GEnumValue structs for the
     *                       possible enumeration values. The array is
     *                       terminated by a struct with all members being
     *                       0.
     * @return the new or existing type ID
     * @since 2.6
     */
    @GObjectVersion2_6
    public open fun registerEnum(name: String, constStaticValues: EnumValue): GType =
        g_type_module_register_enum(gobjectTypeModulePointer, name, constStaticValues.gobjectEnumValuePointer)

    /**
     * Looks up or registers a flags type that is implemented with a particular
     * type plugin. If a type with name @type_name was previously registered,
     * the #GType identifier for the type is returned, otherwise the type
     * is newly registered, and the resulting #GType identifier returned.
     *
     * As long as any instances of the type exist, the type plugin will
     * not be unloaded.
     *
     * Since 2.56 if @module is null this will call g_type_register_static()
     * instead. This can be used when making a static build of the module.
     *
     * @param name name for the type
     * @param constStaticValues an array of #GFlagsValue structs for the
     *                       possible flags values. The array is
     *                       terminated by a struct with all members being
     *                       0.
     * @return the new or existing type ID
     * @since 2.6
     */
    @GObjectVersion2_6
    public open fun registerFlags(name: String, constStaticValues: FlagsValue): GType =
        g_type_module_register_flags(gobjectTypeModulePointer, name, constStaticValues.gobjectFlagsValuePointer)

    /**
     * Looks up or registers a type that is implemented with a particular
     * type plugin. If a type with name @type_name was previously registered,
     * the #GType identifier for the type is returned, otherwise the type
     * is newly registered, and the resulting #GType identifier returned.
     *
     * When reregistering a type (typically because a module is unloaded
     * then reloaded, and reinitialized), @module and @parent_type must
     * be the same as they were previously.
     *
     * As long as any instances of the type exist, the type plugin will
     * not be unloaded.
     *
     * Since 2.56 if @module is null this will call g_type_register_static()
     * instead. This can be used when making a static build of the module.
     *
     * @param parentType the type for the parent class
     * @param typeName name for the type
     * @param typeInfo type information structure
     * @param flags flags field providing details about the type
     * @return the new or existing type ID
     */
    public open fun registerType(parentType: GType, typeName: String, typeInfo: TypeInfo, flags: TypeFlags): GType =
        g_type_module_register_type(
            gobjectTypeModulePointer,
            parentType,
            typeName,
            typeInfo.gobjectTypeInfoPointer,
            flags.mask
        )

    /**
     * Sets the name for a #GTypeModule
     *
     * @param name a human-readable name to use in error messages.
     */
    public open fun setName(name: String): Unit = g_type_module_set_name(gobjectTypeModulePointer, name)

    /**
     * Decreases the use count of a #GTypeModule by one. If the
     * result is zero, the module will be unloaded. (However, the
     * #GTypeModule will not be freed, and types associated with the
     * #GTypeModule are not unregistered. Once a #GTypeModule is
     * initialized, it must exist forever.)
     */
    override fun unuse(): Unit = g_type_module_unuse(gobjectTypeModulePointer)

    /**
     * Increases the use count of a #GTypeModule by one. If the
     * use count was zero before, the plugin will be loaded.
     * If loading the plugin fails, the use count is reset to
     * its prior value.
     *
     * @return false if the plugin needed to be loaded and
     *  loading the plugin failed.
     */
    public open fun useTypeModule(): Boolean = g_type_module_use(gobjectTypeModulePointer).asBoolean()

    /**
     * The TypeModuleImpl type represents a native instance of the abstract TypeModule class.
     *
     * @constructor Creates a new instance of TypeModule for the provided [CPointer].
     */
    public class TypeModuleImpl(pointer: CPointer<GTypeModule>) : TypeModule(pointer)

    public companion object : TypeCompanion<TypeModule> {
        override val type: GeneratedClassKGType<TypeModule> =
            GeneratedClassKGType(getTypeOrNull("g_type_module_get_type")!!) { TypeModuleImpl(it.reinterpret()) }

        init {
            GobjectTypeProvider.register()
        }

        /**
         * Get the GType of TypeModule
         *
         * @return the GType
         */
        public fun getType(): GType = g_type_module_get_type()
    }
}

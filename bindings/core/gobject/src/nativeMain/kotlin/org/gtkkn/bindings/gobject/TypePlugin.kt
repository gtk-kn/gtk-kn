// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GTypePlugin
import org.gtkkn.native.gobject.g_type_plugin_complete_interface_info
import org.gtkkn.native.gobject.g_type_plugin_complete_type_info
import org.gtkkn.native.gobject.g_type_plugin_get_type
import org.gtkkn.native.gobject.g_type_plugin_unuse
import org.gtkkn.native.gobject.g_type_plugin_use
import kotlin.ULong
import kotlin.Unit

/**
 * An interface that handles the lifecycle of dynamically loaded types.
 *
 * The GObject type system supports dynamic loading of types.
 * It goes as follows:
 *
 * 1. The type is initially introduced (usually upon loading the module
 *    the first time, or by your main application that knows what modules
 *    introduces what types), like this:
 *    ```c
 *    new_type_id = g_type_register_dynamic (parent_type_id,
 *                                           "TypeName",
 *                                           new_type_plugin,
 *                                           type_flags);
 *    ```
 *    where `new_type_plugin` is an implementation of the
 *    `GTypePlugin` interface.
 *
 * 2. The type's implementation is referenced, e.g. through
 *    [func@GObject.TypeClass.ref] or through [func@GObject.type_create_instance]
 *    (this is being called by [ctor@GObject.Object.new]) or through one of the above
 *    done on a type derived from `new_type_id`.
 *
 * 3. This causes the type system to load the type's implementation by calling
 *    [method@GObject.TypePlugin.use] and [method@GObject.TypePlugin.complete_type_info]
 *    on `new_type_plugin`.
 *
 * 4. At some point the type's implementation isn't required anymore, e.g. after
 *    [method@GObject.TypeClass.unref] or [func@GObject.type_free_instance]
 *    (called when the reference count of an instance drops to zero).
 *
 * 5. This causes the type system to throw away the information retrieved
 *    from [method@GObject.TypePlugin.complete_type_info] and then it calls
 *    [method@GObject.TypePlugin.unuse] on `new_type_plugin`.
 *
 * 6. Things may repeat from the second step.
 *
 * So basically, you need to implement a `GTypePlugin` type that
 * carries a use_count, once use_count goes from zero to one, you need
 * to load the implementation to successfully handle the upcoming
 * [method@GObject.TypePlugin.complete_type_info] call. Later, maybe after
 * succeeding use/unuse calls, once use_count drops to zero, you can
 * unload the implementation again. The type system makes sure to call
 * [method@GObject.TypePlugin.use] and [method@GObject.TypePlugin.complete_type_info]
 * again when the type is needed again.
 *
 * [class@GObject.TypeModule] is an implementation of `GTypePlugin` that
 * already implements most of this except for the actual module loading and
 * unloading. It even handles multiple registered types per module.
 */
public interface TypePlugin :
    Interface,
    KGTyped {
    public val gobjectTypePluginPointer: CPointer<GTypePlugin>

    /**
     * Calls the @complete_interface_info function from the
     * #GTypePluginClass of @plugin. There should be no need to use this
     * function outside of the GObject type system itself.
     *
     * @param instanceType the #GType of an instantiatable type to which the interface
     *  is added
     * @param interfaceType the #GType of the interface whose info is completed
     * @param info the #GInterfaceInfo to fill in
     */
    public fun completeInterfaceInfo(
        instanceType: ULong,
        interfaceType: ULong,
        info: InterfaceInfo,
    ): Unit =
        g_type_plugin_complete_interface_info(
            gobjectTypePluginPointer.reinterpret(),
            instanceType,
            interfaceType,
            info.gobjectInterfaceInfoPointer
        )

    /**
     * Calls the @complete_type_info function from the #GTypePluginClass of @plugin.
     * There should be no need to use this function outside of the GObject
     * type system itself.
     *
     * @param gType the #GType whose info is completed
     * @param info the #GTypeInfo struct to fill in
     * @param valueTable the #GTypeValueTable to fill in
     */
    public fun completeTypeInfo(
        gType: ULong,
        info: TypeInfo,
        valueTable: TypeValueTable,
    ): Unit =
        g_type_plugin_complete_type_info(
            gobjectTypePluginPointer.reinterpret(),
            gType,
            info.gobjectTypeInfoPointer,
            valueTable.gobjectTypeValueTablePointer
        )

    /**
     * Calls the @unuse_plugin function from the #GTypePluginClass of
     * @plugin.  There should be no need to use this function outside of
     * the GObject type system itself.
     */
    public fun unuse(): Unit = g_type_plugin_unuse(gobjectTypePluginPointer.reinterpret())

    /**
     * Calls the @use_plugin function from the #GTypePluginClass of
     * @plugin.  There should be no need to use this function outside of
     * the GObject type system itself.
     */
    public fun use(): Unit = g_type_plugin_use(gobjectTypePluginPointer.reinterpret())

    private data class Wrapper(
        private val pointer: CPointer<GTypePlugin>,
    ) : TypePlugin {
        override val gobjectTypePluginPointer: CPointer<GTypePlugin> = pointer
    }

    public companion object : TypeCompanion<TypePlugin> {
        override val type: GeneratedInterfaceKGType<TypePlugin> =
            GeneratedInterfaceKGType(g_type_plugin_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GobjectTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GTypePlugin>): TypePlugin = Wrapper(pointer)
    }
}

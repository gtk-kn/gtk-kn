// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.annotations.GObjectVersion2_68
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gobject.GTypeInterface
import org.gtkkn.native.gobject.g_type_interface_add_prerequisite
import org.gtkkn.native.gobject.g_type_interface_get_plugin
import org.gtkkn.native.gobject.g_type_interface_instantiatable_prerequisite
import org.gtkkn.native.gobject.g_type_interface_peek
import org.gtkkn.native.gobject.g_type_interface_peek_parent
import kotlin.ULong
import kotlin.Unit

/**
 * An opaque structure used as the base of all interface types.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `n_prerequisites`: n_prerequisites: Out parameter is not supported
 * - field `g_type`: Record field g_type is private
 * - field `g_instance_type`: Record field g_instance_type is private
 */
public class TypeInterface(
    pointer: CPointer<GTypeInterface>,
) : Record {
    public val gobjectTypeInterfacePointer: CPointer<GTypeInterface> = pointer

    /**
     * Returns the corresponding #GTypeInterface structure of the parent type
     * of the instance type to which @g_iface belongs. This is useful when
     * deriving the implementation of an interface from the parent type and
     * then possibly overriding some methods.
     *
     * @return the
     *     corresponding #GTypeInterface structure of the parent type of the
     *     instance type to which @g_iface belongs, or null if the parent
     *     type doesn't conform to the interface
     */
    public fun peekParent(): TypeInterface =
        g_type_interface_peek_parent(gobjectTypeInterfacePointer.reinterpret())!!.run {
            TypeInterface(reinterpret())
        }

    public companion object : RecordCompanion<TypeInterface, GTypeInterface> {
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
        public fun addPrerequisite(
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
        public fun getPlugin(
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
        public fun instantiatablePrerequisite(interfaceType: ULong): ULong =
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
        public fun peek(
            instanceClass: TypeClass,
            ifaceType: ULong,
        ): TypeInterface =
            g_type_interface_peek(instanceClass.gobjectTypeClassPointer, ifaceType)!!.run {
                TypeInterface(reinterpret())
            }

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): TypeInterface =
            TypeInterface(pointer.reinterpret())
    }
}

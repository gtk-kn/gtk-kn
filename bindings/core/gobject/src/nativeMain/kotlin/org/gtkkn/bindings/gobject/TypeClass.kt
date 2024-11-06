// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.annotations.GObjectVersion2_4
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gobject.GTypeClass
import org.gtkkn.native.gobject.g_type_class_add_private
import org.gtkkn.native.gobject.g_type_class_peek
import org.gtkkn.native.gobject.g_type_class_peek_parent
import org.gtkkn.native.gobject.g_type_class_peek_static
import org.gtkkn.native.gobject.g_type_class_ref
import org.gtkkn.native.gobject.g_type_class_unref
import kotlin.ULong
import kotlin.Unit

/**
 * An opaque structure used as the base of all classes.
 *
 * ## Skipped during bindings generation
 *
 * - method `get_private`: Return type gpointer is unsupported
 * - parameter `g_class`: gpointer
 * - field `g_type`: Record field g_type is private
 */
public class TypeClass(
    pointer: CPointer<GTypeClass>,
) : Record {
    public val gobjectTypeClassPointer: CPointer<GTypeClass> = pointer

    /**
     * Registers a private structure for an instantiatable type.
     *
     * When an object is allocated, the private structures for
     * the type and all of its parent types are allocated
     * sequentially in the same memory block as the public
     * structures, and are zero-filled.
     *
     * Note that the accumulated size of the private structures of
     * a type and all its parent types cannot exceed 64 KiB.
     *
     * This function should be called in the type's class_init() function.
     * The private structure can be retrieved using the
     * G_TYPE_INSTANCE_GET_PRIVATE() macro.
     *
     * The following example shows attaching a private structure
     * MyObjectPrivate to an object MyObject defined in the standard
     * GObject fashion in the type's class_init() function.
     *
     * Note the use of a structure member "priv" to avoid the overhead
     * of repeatedly calling MY_OBJECT_GET_PRIVATE().
     *
     * |[<!-- language="C" -->
     * typedef struct _MyObject        MyObject;
     * typedef struct _MyObjectPrivate MyObjectPrivate;
     *
     * struct _MyObject {
     *  GObject parent;
     *
     *  MyObjectPrivate *priv;
     * };
     *
     * struct _MyObjectPrivate {
     *   int some_field;
     * };
     *
     * static void
     * my_object_class_init (MyObjectClass *klass)
     * {
     *   g_type_class_add_private (klass, sizeof (MyObjectPrivate));
     * }
     *
     * static void
     * my_object_init (MyObject *my_object)
     * {
     *   my_object->priv = G_TYPE_INSTANCE_GET_PRIVATE (my_object,
     *                                                  MY_TYPE_OBJECT,
     *                                                  MyObjectPrivate);
     *   // my_object->priv->some_field will be automatically initialised to 0
     * }
     *
     * static int
     * my_object_get_some_field (MyObject *my_object)
     * {
     *   MyObjectPrivate *priv;
     *
     *   g_return_val_if_fail (MY_IS_OBJECT (my_object), 0);
     *
     *   priv = my_object->priv;
     *
     *   return priv->some_field;
     * }
     * ]|
     *
     * @param privateSize size of private structure
     * @since 2.4
     */
    @GObjectVersion2_4
    public fun addPrivate(privateSize: ULong): Unit =
        g_type_class_add_private(gobjectTypeClassPointer.reinterpret(), privateSize)

    /**
     * This is a convenience function often needed in class initializers.
     * It returns the class structure of the immediate parent type of the
     * class passed in.  Since derived classes hold a reference count on
     * their parent classes as long as they are instantiated, the returned
     * class will always exist.
     *
     * This function is essentially equivalent to:
     * g_type_class_peek (g_type_parent (G_TYPE_FROM_CLASS (g_class)))
     *
     * @return the parent class
     *     of @g_class
     */
    public fun peekParent(): TypeClass =
        g_type_class_peek_parent(gobjectTypeClassPointer.reinterpret())!!.run {
            TypeClass(reinterpret())
        }

    /**
     * Decrements the reference count of the class structure being passed in.
     * Once the last reference count of a class has been released, classes
     * may be finalized by the type system, so further dereferencing of a
     * class pointer after g_type_class_unref() are invalid.
     */
    public fun unref(): Unit = g_type_class_unref(gobjectTypeClassPointer.reinterpret())

    public companion object : RecordCompanion<TypeClass, GTypeClass> {
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
        public fun peek(type: ULong): TypeClass =
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
        public fun peekStatic(type: ULong): TypeClass =
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
        public fun ref(type: ULong): TypeClass =
            g_type_class_ref(type)!!.run {
                TypeClass(reinterpret())
            }

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): TypeClass = TypeClass(pointer.reinterpret())
    }
}

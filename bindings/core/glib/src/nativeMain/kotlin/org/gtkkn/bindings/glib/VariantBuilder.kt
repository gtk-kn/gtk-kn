// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.annotations.GLibVersion2_24
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GVariantBuilder
import org.gtkkn.native.glib.g_variant_builder_add_value
import org.gtkkn.native.glib.g_variant_builder_clear
import org.gtkkn.native.glib.g_variant_builder_close
import org.gtkkn.native.glib.g_variant_builder_end
import org.gtkkn.native.glib.g_variant_builder_init
import org.gtkkn.native.glib.g_variant_builder_new
import org.gtkkn.native.glib.g_variant_builder_open
import org.gtkkn.native.glib.g_variant_builder_ref
import org.gtkkn.native.glib.g_variant_builder_unref
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_variant_builder_get_type
import org.gtkkn.native.gobject.gsize
import kotlin.String
import kotlin.Unit

/**
 * A utility type for constructing container-type #GVariant instances.
 *
 * This is an opaque structure and may only be accessed using the
 * following functions.
 *
 * #GVariantBuilder is not threadsafe in any way.  Do not attempt to
 * access it from more than one thread.
 *
 * ## Skipped during bindings generation
 *
 * - method `add`: Varargs parameter is not supported
 * - method `add_parsed`: Varargs parameter is not supported
 * - field `x`: guintptr
 * - field `y`: guintptr
 */
public class VariantBuilder(pointer: CPointer<GVariantBuilder>) : ProxyInstance(pointer) {
    public val glibVariantBuilderPointer: CPointer<GVariantBuilder> = pointer

    public var partialMagic: gsize
        get() = glibVariantBuilderPointer.pointed.u.s.partial_magic

        @UnsafeFieldSetter
        set(`value`) {
            glibVariantBuilderPointer.pointed.u.s.partial_magic = value
        }

    public var type: VariantType?
        get() = glibVariantBuilderPointer.pointed.u.s.type?.run {
            VariantType(reinterpret())
        }

        @UnsafeFieldSetter
        set(`value`) {
            glibVariantBuilderPointer.pointed.u.s.type = value?.glibVariantTypePointer
        }

    /**
     * Adds @value to @builder.
     *
     * It is an error to call this function in any way that would create an
     * inconsistent value to be constructed.  Some examples of this are
     * putting different types of items into an array, putting the wrong
     * types or number of items in a tuple, putting more than one value into
     * a variant, etc.
     *
     * If @value is a floating reference (see g_variant_ref_sink()),
     * the @builder instance takes ownership of @value.
     *
     * @param value a #GVariant
     * @since 2.24
     */
    @GLibVersion2_24
    public fun addValue(`value`: Variant): Unit =
        g_variant_builder_add_value(glibVariantBuilderPointer.reinterpret(), `value`.glibVariantPointer.reinterpret())

    /**
     * Releases all memory associated with a #GVariantBuilder without
     * freeing the #GVariantBuilder structure itself.
     *
     * It typically only makes sense to do this on a stack-allocated
     * #GVariantBuilder if you want to abort building the value part-way
     * through.  This function need not be called if you call
     * g_variant_builder_end() and it also doesn't need to be called on
     * builders allocated with g_variant_builder_new() (see
     * g_variant_builder_unref() for that).
     *
     * This function leaves the #GVariantBuilder structure set to all-zeros.
     * It is valid to call this function on either an initialised
     * #GVariantBuilder or one that is set to all-zeros but it is not valid
     * to call this function on uninitialised memory.
     *
     * @since 2.24
     */
    @GLibVersion2_24
    public fun clear(): Unit = g_variant_builder_clear(glibVariantBuilderPointer.reinterpret())

    /**
     * Closes the subcontainer inside the given @builder that was opened by
     * the most recent call to g_variant_builder_open().
     *
     * It is an error to call this function in any way that would create an
     * inconsistent value to be constructed (ie: too few values added to the
     * subcontainer).
     *
     * @since 2.24
     */
    @GLibVersion2_24
    public fun close(): Unit = g_variant_builder_close(glibVariantBuilderPointer.reinterpret())

    /**
     * Ends the builder process and returns the constructed value.
     *
     * It is not permissible to use @builder in any way after this call
     * except for reference counting operations (in the case of a
     * heap-allocated #GVariantBuilder) or by reinitialising it with
     * g_variant_builder_init() (in the case of stack-allocated). This
     * means that for the stack-allocated builders there is no need to
     * call g_variant_builder_clear() after the call to
     * g_variant_builder_end().
     *
     * It is an error to call this function in any way that would create an
     * inconsistent value to be constructed (ie: insufficient number of
     * items added to a container with a specific number of children
     * required).  It is also an error to call this function if the builder
     * was created with an indefinite array or maybe type and no children
     * have been added; in this case it is impossible to infer the type of
     * the empty array.
     *
     * @return a new, floating, #GVariant
     * @since 2.24
     */
    @GLibVersion2_24
    public fun end(): Variant = g_variant_builder_end(glibVariantBuilderPointer.reinterpret())!!.run {
        Variant(reinterpret())
    }

    /**
     * Initialises a #GVariantBuilder structure.
     *
     * @type must be non-null.  It specifies the type of container to
     * construct.  It can be an indefinite type such as
     * %G_VARIANT_TYPE_ARRAY or a definite type such as "as" or "(ii)".
     * Maybe, array, tuple, dictionary entry and variant-typed values may be
     * constructed.
     *
     * After the builder is initialised, values are added using
     * g_variant_builder_add_value() or g_variant_builder_add().
     *
     * After all the child values are added, g_variant_builder_end() frees
     * the memory associated with the builder and returns the #GVariant that
     * was created.
     *
     * This function completely ignores the previous contents of @builder.
     * On one hand this means that it is valid to pass in completely
     * uninitialised memory.  On the other hand, this means that if you are
     * initialising over top of an existing #GVariantBuilder you need to
     * first call g_variant_builder_clear() in order to avoid leaking
     * memory.
     *
     * You must not call g_variant_builder_ref() or
     * g_variant_builder_unref() on a #GVariantBuilder that was initialised
     * with this function.  If you ever pass a reference to a
     * #GVariantBuilder outside of the control of your own code then you
     * should assume that the person receiving that reference may try to use
     * reference counting; you should use g_variant_builder_new() instead of
     * this function.
     *
     * @param type a container type
     * @since 2.24
     */
    @GLibVersion2_24
    public fun `init`(type: VariantType): Unit =
        g_variant_builder_init(glibVariantBuilderPointer.reinterpret(), type.glibVariantTypePointer.reinterpret())

    /**
     * Opens a subcontainer inside the given @builder.  When done adding
     * items to the subcontainer, g_variant_builder_close() must be called. @type
     * is the type of the container: so to build a tuple of several values, @type
     * must include the tuple itself.
     *
     * It is an error to call this function in any way that would cause an
     * inconsistent value to be constructed (ie: adding too many values or
     * a value of an incorrect type).
     *
     * Example of building a nested variant:
     * |[<!-- language="C" -->
     * GVariantBuilder builder;
     * guint32 some_number = get_number ();
     * g_autoptr (GHashTable) some_dict = get_dict ();
     * GHashTableIter iter;
     * const gchar *key;
     * const GVariant *value;
     * g_autoptr (GVariant) output = NULL;
     *
     * g_variant_builder_init (&builder, G_VARIANT_TYPE ("(ua{sv})"));
     * g_variant_builder_add (&builder, "u", some_number);
     * g_variant_builder_open (&builder, G_VARIANT_TYPE ("a{sv}"));
     *
     * g_hash_table_iter_init (&iter, some_dict);
     * while (g_hash_table_iter_next (&iter, (gpointer *) &key, (gpointer *) &value))
     *   {
     *     g_variant_builder_open (&builder, G_VARIANT_TYPE ("{sv}"));
     *     g_variant_builder_add (&builder, "s", key);
     *     g_variant_builder_add (&builder, "v", value);
     *     g_variant_builder_close (&builder);
     *   }
     *
     * g_variant_builder_close (&builder);
     *
     * output = g_variant_builder_end (&builder);
     * ]|
     *
     * @param type the #GVariantType of the container
     * @since 2.24
     */
    @GLibVersion2_24
    public fun `open`(type: VariantType): Unit =
        g_variant_builder_open(glibVariantBuilderPointer.reinterpret(), type.glibVariantTypePointer.reinterpret())

    /**
     * Increases the reference count on @builder.
     *
     * Don't call this on stack-allocated #GVariantBuilder instances or bad
     * things will happen.
     *
     * @return a new reference to @builder
     * @since 2.24
     */
    @GLibVersion2_24
    public fun ref(): VariantBuilder = g_variant_builder_ref(glibVariantBuilderPointer.reinterpret())!!.run {
        VariantBuilder(reinterpret())
    }

    /**
     * Decreases the reference count on @builder.
     *
     * In the event that there are no more references, releases all memory
     * associated with the #GVariantBuilder.
     *
     * Don't call this on stack-allocated #GVariantBuilder instances or bad
     * things will happen.
     *
     * @since 2.24
     */
    @GLibVersion2_24
    public fun unref(): Unit = g_variant_builder_unref(glibVariantBuilderPointer.reinterpret())

    override fun toString(): String = "VariantBuilder(partialMagic=$partialMagic, type=$type)"

    public companion object {
        /**
         * Allocates and initialises a new #GVariantBuilder.
         *
         * You should call g_variant_builder_unref() on the return value when it
         * is no longer needed.  The memory will not be automatically freed by
         * any other call.
         *
         * In most cases it is easier to place a #GVariantBuilder directly on
         * the stack of the calling function and initialise it with
         * g_variant_builder_init().
         *
         * @param type a container type
         * @return a #GVariantBuilder
         * @since 2.24
         */
        public fun new(type: VariantType): VariantBuilder =
            VariantBuilder(g_variant_builder_new(type.glibVariantTypePointer.reinterpret())!!.reinterpret())

        /**
         * Get the GType of VariantBuilder
         *
         * @return the GType
         */
        public fun getType(): GType = g_variant_builder_get_type()
    }
}

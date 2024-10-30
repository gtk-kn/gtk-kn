// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GVariantDict
import org.gtkkn.native.glib.g_variant_dict_clear
import org.gtkkn.native.glib.g_variant_dict_contains
import org.gtkkn.native.glib.g_variant_dict_end
import org.gtkkn.native.glib.g_variant_dict_insert_value
import org.gtkkn.native.glib.g_variant_dict_lookup_value
import org.gtkkn.native.glib.g_variant_dict_new
import org.gtkkn.native.glib.g_variant_dict_ref
import org.gtkkn.native.glib.g_variant_dict_remove
import org.gtkkn.native.glib.g_variant_dict_unref
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * #GVariantDict is a mutable interface to #GVariant dictionaries.
 *
 * It can be used for doing a sequence of dictionary lookups in an
 * efficient way on an existing #GVariant dictionary or it can be used
 * to construct new dictionaries with a hashtable-like interface.  It
 * can also be used for taking existing dictionaries and modifying them
 * in order to create new ones.
 *
 * #GVariantDict can only be used with %G_VARIANT_TYPE_VARDICT
 * dictionaries.
 *
 * It is possible to use #GVariantDict allocated on the stack or on the
 * heap.  When using a stack-allocated #GVariantDict, you begin with a
 * call to g_variant_dict_init() and free the resources with a call to
 * g_variant_dict_clear().
 *
 * Heap-allocated #GVariantDict follows normal refcounting rules: you
 * allocate it with g_variant_dict_new() and use g_variant_dict_ref()
 * and g_variant_dict_unref().
 *
 * g_variant_dict_end() is used to convert the #GVariantDict back into a
 * dictionary-type #GVariant.  When used with stack-allocated instances,
 * this also implicitly frees all associated memory, but for
 * heap-allocated instances, you must still call g_variant_dict_unref()
 * afterwards.
 *
 * You will typically want to use a heap-allocated #GVariantDict when
 * you expose it as part of an API.  For most other uses, the
 * stack-allocated form will be more convenient.
 *
 * Consider the following two examples that do the same thing in each
 * style: take an existing dictionary and look up the "count" uint32
 * key, adding 1 to it if it is found, or returning an error if the
 * key is not found.  Each returns the new dictionary as a floating
 * #GVariant.
 *
 * ## Using a stack-allocated GVariantDict
 *
 * |[<!-- language="C" -->
 *   GVariant *
 *   add_to_count (GVariant  *orig,
 *                 GError   **error)
 *   {
 *     GVariantDict dict;
 *     guint32 count;
 *
 *     g_variant_dict_init (&dict, orig);
 *     if (!g_variant_dict_lookup (&dict, "count", "u", &count))
 *       {
 *         g_set_error (...);
 *         g_variant_dict_clear (&dict);
 *         return NULL;
 *       }
 *
 *     g_variant_dict_insert (&dict, "count", "u", count + 1);
 *
 *     return g_variant_dict_end (&dict);
 *   }
 * ]|
 *
 * ## Using heap-allocated GVariantDict
 *
 * |[<!-- language="C" -->
 *   GVariant *
 *   add_to_count (GVariant  *orig,
 *                 GError   **error)
 *   {
 *     GVariantDict *dict;
 *     GVariant *result;
 *     guint32 count;
 *
 *     dict = g_variant_dict_new (orig);
 *
 *     if (g_variant_dict_lookup (dict, "count", "u", &count))
 *       {
 *         g_variant_dict_insert (dict, "count", "u", count + 1);
 *         result = g_variant_dict_end (dict);
 *       }
 *     else
 *       {
 *         g_set_error (...);
 *         result = NULL;
 *       }
 *
 *     g_variant_dict_unref (dict);
 *
 *     return result;
 *   }
 * ]|
 * @since 2.40
 */
public class VariantDict(
    pointer: CPointer<GVariantDict>,
) : Record {
    public val glibVariantDictPointer: CPointer<GVariantDict> = pointer

    /**
     * Releases all memory associated with a #GVariantDict without freeing
     * the #GVariantDict structure itself.
     *
     * It typically only makes sense to do this on a stack-allocated
     * #GVariantDict if you want to abort building the value part-way
     * through.  This function need not be called if you call
     * g_variant_dict_end() and it also doesn't need to be called on dicts
     * allocated with g_variant_dict_new (see g_variant_dict_unref() for
     * that).
     *
     * It is valid to call this function on either an initialised
     * #GVariantDict or one that was previously cleared by an earlier call
     * to g_variant_dict_clear() but it is not valid to call this function
     * on uninitialised memory.
     *
     * @since 2.40
     */
    public fun clear(): Unit = g_variant_dict_clear(glibVariantDictPointer.reinterpret())

    /**
     * Checks if @key exists in @dict.
     *
     * @param key the key to look up in the dictionary
     * @return true if @key is in @dict
     * @since 2.40
     */
    public fun contains(key: String): Boolean =
        g_variant_dict_contains(glibVariantDictPointer.reinterpret(), key).asBoolean()

    /**
     * Returns the current value of @dict as a #GVariant of type
     * %G_VARIANT_TYPE_VARDICT, clearing it in the process.
     *
     * It is not permissible to use @dict in any way after this call except
     * for reference counting operations (in the case of a heap-allocated
     * #GVariantDict) or by reinitialising it with g_variant_dict_init() (in
     * the case of stack-allocated).
     *
     * @return a new, floating, #GVariant
     * @since 2.40
     */
    public fun end(): Variant =
        g_variant_dict_end(glibVariantDictPointer.reinterpret())!!.run {
            Variant(reinterpret())
        }

    /**
     * Inserts (or replaces) a key in a #GVariantDict.
     *
     * @value is consumed if it is floating.
     *
     * @param key the key to insert a value for
     * @param value the value to insert
     * @since 2.40
     */
    public fun insertValue(
        key: String,
        `value`: Variant,
    ): Unit = g_variant_dict_insert_value(glibVariantDictPointer.reinterpret(), key, `value`.glibVariantPointer)

    /**
     * Looks up a value in a #GVariantDict.
     *
     * If @key is not found in @dictionary, null is returned.
     *
     * The @expected_type string specifies what type of value is expected.
     * If the value associated with @key has a different type then null is
     * returned.
     *
     * If the key is found and the value has the correct type, it is
     * returned.  If @expected_type was specified then any non-null return
     * value will have this type.
     *
     * @param key the key to look up in the dictionary
     * @param expectedType a #GVariantType, or null
     * @return the value of the dictionary key, or null
     * @since 2.40
     */
    public fun lookupValue(
        key: String,
        expectedType: VariantType? = null,
    ): Variant? =
        g_variant_dict_lookup_value(
            glibVariantDictPointer.reinterpret(),
            key,
            expectedType?.glibVariantTypePointer
        )?.run {
            Variant(reinterpret())
        }

    /**
     * Increases the reference count on @dict.
     *
     * Don't call this on stack-allocated #GVariantDict instances or bad
     * things will happen.
     *
     * @return a new reference to @dict
     * @since 2.40
     */
    public fun ref(): VariantDict =
        g_variant_dict_ref(glibVariantDictPointer.reinterpret())!!.run {
            VariantDict(reinterpret())
        }

    /**
     * Removes a key and its associated value from a #GVariantDict.
     *
     * @param key the key to remove
     * @return true if the key was found and removed
     * @since 2.40
     */
    public fun remove(key: String): Boolean =
        g_variant_dict_remove(glibVariantDictPointer.reinterpret(), key).asBoolean()

    /**
     * Decreases the reference count on @dict.
     *
     * In the event that there are no more references, releases all memory
     * associated with the #GVariantDict.
     *
     * Don't call this on stack-allocated #GVariantDict instances or bad
     * things will happen.
     *
     * @since 2.40
     */
    public fun unref(): Unit = g_variant_dict_unref(glibVariantDictPointer.reinterpret())

    public companion object : RecordCompanion<VariantDict, GVariantDict> {
        /**
         * Allocates and initialises a new #GVariantDict.
         *
         * You should call g_variant_dict_unref() on the return value when it
         * is no longer needed.  The memory will not be automatically freed by
         * any other call.
         *
         * In some cases it may be easier to place a #GVariantDict directly on
         * the stack of the calling function and initialise it with
         * g_variant_dict_init().  This is particularly useful when you are
         * using #GVariantDict to construct a #GVariant.
         *
         * @param fromAsv the #GVariant with which to initialise the
         *   dictionary
         * @return a #GVariantDict
         * @since 2.40
         */
        public fun new(fromAsv: Variant? = null): VariantDict =
            VariantDict(g_variant_dict_new(fromAsv?.glibVariantPointer)!!.reinterpret())

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): VariantDict =
            VariantDict(pointer.reinterpret())
    }
}
// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GHook
import org.gtkkn.native.glib.g_hook_compare_ids
import org.gtkkn.native.glib.g_hook_destroy
import org.gtkkn.native.glib.g_hook_destroy_link
import org.gtkkn.native.glib.g_hook_free
import org.gtkkn.native.glib.g_hook_insert_before
import org.gtkkn.native.glib.g_hook_prepend
import org.gtkkn.native.glib.g_hook_unref
import kotlin.Boolean
import kotlin.Int
import kotlin.UInt
import kotlin.ULong
import kotlin.Unit

/**
 * The #GHook struct represents a single hook function in a #GHookList.
 *
 * ## Skipped during bindings generation
 *
 * - field `data`: gpointer
 * - field `func`: gpointer
 * - field `destroy`: DestroyNotify
 */
public class Hook(
    pointer: CPointer<GHook>,
) : Record {
    public val glibHookPointer: CPointer<GHook> = pointer

    /**
     * pointer to the next hook in the list
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val next: Hook?
        get() =
            glibHookPointer.pointed.next?.run {
                Hook(reinterpret())
            }

    /**
     * pointer to the previous hook in the list
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val prev: Hook?
        get() =
            glibHookPointer.pointed.prev?.run {
                Hook(reinterpret())
            }

    /**
     * the reference count of this hook
     */
    public var refCount: UInt
        get() = glibHookPointer.pointed.ref_count
        set(`value`) {
            glibHookPointer.pointed.ref_count = value
        }

    /**
     * the id of this hook, which is unique within its list
     */
    public var hookId: ULong
        get() = glibHookPointer.pointed.hook_id
        set(`value`) {
            glibHookPointer.pointed.hook_id = value
        }

    /**
     * flags which are set for this hook. See #GHookFlagMask for
     *     predefined flags
     */
    public var flags: UInt
        get() = glibHookPointer.pointed.flags
        set(`value`) {
            glibHookPointer.pointed.flags = value
        }

    /**
     * Compares the ids of two #GHook elements, returning a negative value
     * if the second id is greater than the first.
     *
     * @param sibling a #GHook to compare with @new_hook
     * @return a value <= 0 if the id of @sibling is >= the id of @new_hook
     */
    public fun compareIds(sibling: Hook): Int =
        g_hook_compare_ids(
            glibHookPointer.reinterpret(),
            sibling.glibHookPointer
        )

    public companion object : RecordCompanion<Hook, GHook> {
        /**
         * Destroys a #GHook, given its ID.
         *
         * @param hookList a #GHookList
         * @param hookId a hook ID
         * @return true if the #GHook was found in the #GHookList and destroyed
         */
        public fun destroy(
            hookList: HookList,
            hookId: ULong,
        ): Boolean = g_hook_destroy(hookList.glibHookListPointer, hookId).asBoolean()

        /**
         * Removes one #GHook from a #GHookList, marking it
         * inactive and calling g_hook_unref() on it.
         *
         * @param hookList a #GHookList
         * @param hook the #GHook to remove
         */
        public fun destroyLink(
            hookList: HookList,
            hook: Hook,
        ): Unit = g_hook_destroy_link(hookList.glibHookListPointer, hook.glibHookPointer)

        /**
         * Calls the #GHookList @finalize_hook function if it exists,
         * and frees the memory allocated for the #GHook.
         *
         * @param hookList a #GHookList
         * @param hook the #GHook to free
         */
        public fun free(
            hookList: HookList,
            hook: Hook,
        ): Unit = g_hook_free(hookList.glibHookListPointer, hook.glibHookPointer)

        /**
         * Inserts a #GHook into a #GHookList, before a given #GHook.
         *
         * @param hookList a #GHookList
         * @param sibling the #GHook to insert the new #GHook before
         * @param hook the #GHook to insert
         */
        public fun insertBefore(
            hookList: HookList,
            sibling: Hook? = null,
            hook: Hook,
        ): Unit =
            g_hook_insert_before(
                hookList.glibHookListPointer,
                sibling?.glibHookPointer,
                hook.glibHookPointer
            )

        /**
         * Prepends a #GHook on the start of a #GHookList.
         *
         * @param hookList a #GHookList
         * @param hook the #GHook to add to the start of @hook_list
         */
        public fun prepend(
            hookList: HookList,
            hook: Hook,
        ): Unit = g_hook_prepend(hookList.glibHookListPointer, hook.glibHookPointer)

        /**
         * Decrements the reference count of a #GHook.
         * If the reference count falls to 0, the #GHook is removed
         * from the #GHookList and g_hook_free() is called to free it.
         *
         * @param hookList a #GHookList
         * @param hook the #GHook to unref
         */
        public fun unref(
            hookList: HookList,
            hook: Hook,
        ): Unit = g_hook_unref(hookList.glibHookListPointer, hook.glibHookPointer)

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Hook = Hook(pointer.reinterpret())
    }
}

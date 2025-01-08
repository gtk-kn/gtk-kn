// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.native.glib.GHook
import org.gtkkn.native.glib.g_hook_alloc
import org.gtkkn.native.glib.g_hook_compare_ids
import org.gtkkn.native.glib.g_hook_destroy
import org.gtkkn.native.glib.g_hook_destroy_link
import org.gtkkn.native.glib.g_hook_find
import org.gtkkn.native.glib.g_hook_find_data
import org.gtkkn.native.glib.g_hook_find_func
import org.gtkkn.native.glib.g_hook_find_func_data
import org.gtkkn.native.glib.g_hook_first_valid
import org.gtkkn.native.glib.g_hook_free
import org.gtkkn.native.glib.g_hook_get
import org.gtkkn.native.glib.g_hook_insert_before
import org.gtkkn.native.glib.g_hook_next_valid
import org.gtkkn.native.glib.g_hook_prepend
import org.gtkkn.native.glib.g_hook_ref
import org.gtkkn.native.glib.g_hook_unref
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.glib.guint
import org.gtkkn.native.glib.gulong
import kotlin.Boolean
import kotlin.Pair
import kotlin.String
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * The #GHook struct represents a single hook function in a #GHookList.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `func`: HookCompareFunc
 * - field `destroy`: DestroyNotify
 */
public class Hook(pointer: CPointer<GHook>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GHook> = pointer

    /**
     * data which is passed to func when this hook is invoked
     */
    public var `data`: gpointer
        get() = gPointer.pointed.data!!

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.data = value
        }

    /**
     * pointer to the next hook in the list
     */
    public var next: Hook?
        get() = gPointer.pointed.next?.run {
            Hook(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.next = value?.gPointer
        }

    /**
     * pointer to the previous hook in the list
     */
    public var prev: Hook?
        get() = gPointer.pointed.prev?.run {
            Hook(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.prev = value?.gPointer
        }

    /**
     * the reference count of this hook
     */
    public var refCount: guint
        get() = gPointer.pointed.ref_count

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.ref_count = value
        }

    /**
     * the id of this hook, which is unique within its list
     */
    public var hookId: gulong
        get() = gPointer.pointed.hook_id

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.hook_id = value
        }

    /**
     * flags which are set for this hook. See #GHookFlagMask for
     *     predefined flags
     */
    public var flags: guint
        get() = gPointer.pointed.flags

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.flags = value
        }

    /**
     * the function to call when this hook is invoked. The possible
     *     signatures for this function are #GHookFunc and #GHookCheckFunc
     */
    public var func: gpointer
        get() = gPointer.pointed.func!!

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.func = value
        }

    /**
     * Allocate a new Hook.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GHook>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to Hook and a [Cleaner] instance.
     */
    private constructor(pair: Pair<CPointer<GHook>, Cleaner>) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new Hook using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GHook>().ptr)

    /**
     * Allocate a new Hook.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param data data which is passed to func when this hook is invoked
     * @param next pointer to the next hook in the list
     * @param prev pointer to the previous hook in the list
     * @param refCount the reference count of this hook
     * @param hookId the id of this hook, which is unique within its list
     * @param flags flags which are set for this hook. See #GHookFlagMask for
     *     predefined flags
     * @param func the function to call when this hook is invoked. The possible
     *     signatures for this function are #GHookFunc and #GHookCheckFunc
     */
    public constructor(
        `data`: gpointer,
        next: Hook?,
        prev: Hook?,
        refCount: guint,
        hookId: gulong,
        flags: guint,
        func: gpointer,
    ) : this() {
        this.data = data
        this.next = next
        this.prev = prev
        this.refCount = refCount
        this.hookId = hookId
        this.flags = flags
        this.func = func
    }

    /**
     * Allocate a new Hook using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param data data which is passed to func when this hook is invoked
     * @param next pointer to the next hook in the list
     * @param prev pointer to the previous hook in the list
     * @param refCount the reference count of this hook
     * @param hookId the id of this hook, which is unique within its list
     * @param flags flags which are set for this hook. See #GHookFlagMask for
     *     predefined flags
     * @param func the function to call when this hook is invoked. The possible
     *     signatures for this function are #GHookFunc and #GHookCheckFunc
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        `data`: gpointer,
        next: Hook?,
        prev: Hook?,
        refCount: guint,
        hookId: gulong,
        flags: guint,
        func: gpointer,
        scope: AutofreeScope,
    ) : this(scope) {
        this.data = data
        this.next = next
        this.prev = prev
        this.refCount = refCount
        this.hookId = hookId
        this.flags = flags
        this.func = func
    }

    /**
     * Compares the ids of two #GHook elements, returning a negative value
     * if the second id is greater than the first.
     *
     * @param sibling a #GHook to compare with @new_hook
     * @return a value <= 0 if the id of @sibling is >= the id of @new_hook
     */
    public fun compareIds(sibling: Hook): gint = g_hook_compare_ids(gPointer, sibling.gPointer)

    override fun toString(): String =
        "Hook(data=$data, next=$next, prev=$prev, refCount=$refCount, hookId=$hookId, flags=$flags, func=$func)"

    public companion object {
        /**
         * Allocates space for a #GHook and initializes it.
         *
         * @param hookList a #GHookList
         * @return a new #GHook
         */
        public fun alloc(hookList: HookList): Hook = g_hook_alloc(hookList.gPointer)!!.run {
            Hook(this)
        }

        /**
         * Destroys a #GHook, given its ID.
         *
         * @param hookList a #GHookList
         * @param hookId a hook ID
         * @return true if the #GHook was found in the #GHookList and destroyed
         */
        public fun destroy(hookList: HookList, hookId: gulong): Boolean =
            g_hook_destroy(hookList.gPointer, hookId).asBoolean()

        /**
         * Removes one #GHook from a #GHookList, marking it
         * inactive and calling g_hook_unref() on it.
         *
         * @param hookList a #GHookList
         * @param hook the #GHook to remove
         */
        public fun destroyLink(hookList: HookList, hook: Hook): Unit =
            g_hook_destroy_link(hookList.gPointer, hook.gPointer)

        /**
         * Finds a #GHook in a #GHookList using the given function to
         * test for a match.
         *
         * @param hookList a #GHookList
         * @param needValids true if #GHook elements which have been destroyed
         *     should be skipped
         * @param func the function to call for each #GHook, which should return
         *     true when the #GHook has been found
         * @return the found #GHook or null if no matching #GHook is found
         */
        public fun find(hookList: HookList, needValids: Boolean, func: HookFindFunc): Hook = g_hook_find(
            hookList.gPointer,
            needValids.asGBoolean(),
            HookFindFuncFunc.reinterpret(),
            StableRef.create(func).asCPointer()
        )!!.run {
            Hook(this)
        }

        /**
         * Finds a #GHook in a #GHookList with the given data.
         *
         * @param hookList a #GHookList
         * @param needValids true if #GHook elements which have been destroyed
         *     should be skipped
         * @param data the data to find
         * @return the #GHook with the given @data or null if no matching
         *     #GHook is found
         */
        public fun findData(hookList: HookList, needValids: Boolean, `data`: gpointer? = null): Hook =
            g_hook_find_data(hookList.gPointer, needValids.asGBoolean(), `data`)!!.run {
                Hook(this)
            }

        /**
         * Finds a #GHook in a #GHookList with the given function.
         *
         * @param hookList a #GHookList
         * @param needValids true if #GHook elements which have been destroyed
         *     should be skipped
         * @param func the function to find
         * @return the #GHook with the given @func or null if no matching
         *     #GHook is found
         */
        public fun findFunc(hookList: HookList, needValids: Boolean, func: gpointer? = null): Hook =
            g_hook_find_func(hookList.gPointer, needValids.asGBoolean(), func)!!.run {
                Hook(this)
            }

        /**
         * Finds a #GHook in a #GHookList with the given function and data.
         *
         * @param hookList a #GHookList
         * @param needValids true if #GHook elements which have been destroyed
         *     should be skipped
         * @param func the function to find
         * @param data the data to find
         * @return the #GHook with the given @func and @data or null if
         *     no matching #GHook is found
         */
        public fun findFuncData(
            hookList: HookList,
            needValids: Boolean,
            func: gpointer,
            `data`: gpointer? = null,
        ): Hook = g_hook_find_func_data(hookList.gPointer, needValids.asGBoolean(), func, `data`)!!.run {
            Hook(this)
        }

        /**
         * Returns the first #GHook in a #GHookList which has not been destroyed.
         * The reference count for the #GHook is incremented, so you must call
         * g_hook_unref() to restore it when no longer needed. (Or call
         * g_hook_next_valid() if you are stepping through the #GHookList.)
         *
         * @param hookList a #GHookList
         * @param mayBeInCall true if hooks which are currently running
         *     (e.g. in another thread) are considered valid. If set to false,
         *     these are skipped
         * @return the first valid #GHook, or null if none are valid
         */
        public fun firstValid(hookList: HookList, mayBeInCall: Boolean): Hook =
            g_hook_first_valid(hookList.gPointer, mayBeInCall.asGBoolean())!!.run {
                Hook(this)
            }

        /**
         * Calls the #GHookList @finalize_hook function if it exists,
         * and frees the memory allocated for the #GHook.
         *
         * @param hookList a #GHookList
         * @param hook the #GHook to free
         */
        public fun free(hookList: HookList, hook: Hook): Unit = g_hook_free(hookList.gPointer, hook.gPointer)

        /**
         * Returns the #GHook with the given id, or null if it is not found.
         *
         * @param hookList a #GHookList
         * @param hookId a hook id
         * @return the #GHook with the given id, or null if it is not found
         */
        public fun `get`(hookList: HookList, hookId: gulong): Hook = g_hook_get(hookList.gPointer, hookId)!!.run {
            Hook(this)
        }

        /**
         * Inserts a #GHook into a #GHookList, before a given #GHook.
         *
         * @param hookList a #GHookList
         * @param sibling the #GHook to insert the new #GHook before
         * @param hook the #GHook to insert
         */
        public fun insertBefore(hookList: HookList, sibling: Hook? = null, hook: Hook): Unit =
            g_hook_insert_before(hookList.gPointer, sibling?.gPointer, hook.gPointer)

        /**
         * Returns the next #GHook in a #GHookList which has not been destroyed.
         * The reference count for the #GHook is incremented, so you must call
         * g_hook_unref() to restore it when no longer needed. (Or continue to call
         * g_hook_next_valid() until null is returned.)
         *
         * @param hookList a #GHookList
         * @param hook the current #GHook
         * @param mayBeInCall true if hooks which are currently running
         *     (e.g. in another thread) are considered valid. If set to false,
         *     these are skipped
         * @return the next valid #GHook, or null if none are valid
         */
        public fun nextValid(hookList: HookList, hook: Hook, mayBeInCall: Boolean): Hook =
            g_hook_next_valid(hookList.gPointer, hook.gPointer, mayBeInCall.asGBoolean())!!.run {
                Hook(this)
            }

        /**
         * Prepends a #GHook on the start of a #GHookList.
         *
         * @param hookList a #GHookList
         * @param hook the #GHook to add to the start of @hook_list
         */
        public fun prepend(hookList: HookList, hook: Hook): Unit = g_hook_prepend(hookList.gPointer, hook.gPointer)

        /**
         * Increments the reference count for a #GHook.
         *
         * @param hookList a #GHookList
         * @param hook the #GHook to increment the reference count of
         * @return the @hook that was passed in (since 2.6)
         */
        public fun ref(hookList: HookList, hook: Hook): Hook = g_hook_ref(hookList.gPointer, hook.gPointer)!!.run {
            Hook(this)
        }

        /**
         * Decrements the reference count of a #GHook.
         * If the reference count falls to 0, the #GHook is removed
         * from the #GHookList and g_hook_free() is called to free it.
         *
         * @param hookList a #GHookList
         * @param hook the #GHook to unref
         */
        public fun unref(hookList: HookList, hook: Hook): Unit = g_hook_unref(hookList.gPointer, hook.gPointer)
    }
}

// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
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
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.native.glib.GHookList
import org.gtkkn.native.glib.g_hook_list_clear
import org.gtkkn.native.glib.g_hook_list_init
import org.gtkkn.native.glib.g_hook_list_invoke
import org.gtkkn.native.glib.g_hook_list_invoke_check
import org.gtkkn.native.glib.g_hook_list_marshal
import org.gtkkn.native.glib.g_hook_list_marshal_check
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.glib.guint
import org.gtkkn.native.glib.gulong
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * The #GHookList struct represents a list of hook functions.
 *
 * ## Skipped during bindings generation
 *
 * - field `finalize_hook`: HookFinalizeFunc
 * - field `dummy`: Array parameter of type gpointer is not supported
 */
public class HookList(public val glibHookListPointer: CPointer<GHookList>) : ProxyInstance(glibHookListPointer) {
    /**
     * the next free #GHook id
     */
    public var seqId: gulong
        get() = glibHookListPointer.pointed.seq_id

        @UnsafeFieldSetter
        set(`value`) {
            glibHookListPointer.pointed.seq_id = value
        }

    /**
     * the size of the #GHookList elements, in bytes
     */
    public var hookSize: guint
        get() = glibHookListPointer.pointed.hook_size

        @UnsafeFieldSetter
        set(`value`) {
            glibHookListPointer.pointed.hook_size = value
        }

    /**
     * 1 if the #GHookList has been initialized
     */
    public var isSetup: guint
        get() = glibHookListPointer.pointed.is_setup

        @UnsafeFieldSetter
        set(`value`) {
            glibHookListPointer.pointed.is_setup = value
        }

    /**
     * the first #GHook element in the list
     */
    public var hooks: Hook?
        get() = glibHookListPointer.pointed.hooks?.run {
            Hook(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            glibHookListPointer.pointed.hooks = value?.glibHookPointer
        }

    /**
     * unused
     */
    public var dummy3: gpointer
        get() = glibHookListPointer.pointed.dummy3!!

        @UnsafeFieldSetter
        set(`value`) {
            glibHookListPointer.pointed.dummy3 = value
        }

    /**
     * Allocate a new HookList.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GHookList>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new HookList using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GHookList>().ptr)

    /**
     * Allocate a new HookList.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param seqId the next free #GHook id
     * @param hookSize the size of the #GHookList elements, in bytes
     * @param isSetup 1 if the #GHookList has been initialized
     * @param hooks the first #GHook element in the list
     * @param dummy3 unused
     */
    public constructor(
        seqId: gulong,
        hookSize: guint,
        isSetup: guint,
        hooks: Hook?,
        dummy3: gpointer,
    ) : this() {
        this.seqId = seqId
        this.hookSize = hookSize
        this.isSetup = isSetup
        this.hooks = hooks
        this.dummy3 = dummy3
    }

    /**
     * Allocate a new HookList using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param seqId the next free #GHook id
     * @param hookSize the size of the #GHookList elements, in bytes
     * @param isSetup 1 if the #GHookList has been initialized
     * @param hooks the first #GHook element in the list
     * @param dummy3 unused
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        seqId: gulong,
        hookSize: guint,
        isSetup: guint,
        hooks: Hook?,
        dummy3: gpointer,
        scope: AutofreeScope,
    ) : this(scope) {
        this.seqId = seqId
        this.hookSize = hookSize
        this.isSetup = isSetup
        this.hooks = hooks
        this.dummy3 = dummy3
    }

    /**
     * Removes all the #GHook elements from a #GHookList.
     */
    public fun clear(): Unit = g_hook_list_clear(glibHookListPointer)

    /**
     * Initializes a #GHookList.
     * This must be called before the #GHookList is used.
     *
     * @param hookSize the size of each element in the #GHookList,
     *     typically `sizeof (GHook)`.
     */
    public fun `init`(hookSize: guint): Unit = g_hook_list_init(glibHookListPointer, hookSize)

    /**
     * Calls all of the #GHook functions in a #GHookList.
     *
     * @param mayRecurse true if functions which are already running
     *     (e.g. in another thread) can be called. If set to false,
     *     these are skipped
     */
    public fun invoke(mayRecurse: Boolean): Unit = g_hook_list_invoke(glibHookListPointer, mayRecurse.asGBoolean())

    /**
     * Calls all of the #GHook functions in a #GHookList.
     * Any function which returns false is removed from the #GHookList.
     *
     * @param mayRecurse true if functions which are already running
     *     (e.g. in another thread) can be called. If set to false,
     *     these are skipped
     */
    public fun invokeCheck(mayRecurse: Boolean): Unit =
        g_hook_list_invoke_check(glibHookListPointer, mayRecurse.asGBoolean())

    /**
     * Calls a function on each valid #GHook.
     *
     * @param mayRecurse true if hooks which are currently running
     *     (e.g. in another thread) are considered valid. If set to false,
     *     these are skipped
     * @param marshaller the function to call for each #GHook
     */
    public fun marshal(mayRecurse: Boolean, marshaller: HookMarshaller): Unit = g_hook_list_marshal(
        glibHookListPointer,
        mayRecurse.asGBoolean(),
        HookMarshallerFunc.reinterpret(),
        StableRef.create(marshaller).asCPointer()
    )

    /**
     * Calls a function on each valid #GHook and destroys it if the
     * function returns false.
     *
     * @param mayRecurse true if hooks which are currently running
     *     (e.g. in another thread) are considered valid. If set to false,
     *     these are skipped
     * @param marshaller the function to call for each #GHook
     */
    public fun marshalCheck(mayRecurse: Boolean, marshaller: HookCheckMarshaller): Unit = g_hook_list_marshal_check(
        glibHookListPointer,
        mayRecurse.asGBoolean(),
        HookCheckMarshallerFunc.reinterpret(),
        StableRef.create(marshaller).asCPointer()
    )

    override fun toString(): String =
        "HookList(seqId=$seqId, hookSize=$hookSize, isSetup=$isSetup, hooks=$hooks, dummy3=$dummy3)"
}

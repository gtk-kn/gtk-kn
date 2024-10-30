// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GHookList
import org.gtkkn.native.glib.g_hook_list_clear
import org.gtkkn.native.glib.g_hook_list_init
import org.gtkkn.native.glib.g_hook_list_invoke
import org.gtkkn.native.glib.g_hook_list_invoke_check
import org.gtkkn.native.glib.g_hook_list_marshal
import org.gtkkn.native.glib.g_hook_list_marshal_check
import kotlin.Boolean
import kotlin.UInt
import kotlin.ULong
import kotlin.Unit

/**
 * The #GHookList struct represents a list of hook functions.
 *
 * ## Skipped during bindings generation
 *
 * - field `dummy3`: gpointer
 * - field `finalize_hook`: HookFinalizeFunc
 * - field `dummy`: Fields with arrays are not supported
 */
public class HookList(
    pointer: CPointer<GHookList>,
) : Record {
    public val glibHookListPointer: CPointer<GHookList> = pointer

    /**
     * the next free #GHook id
     */
    public var seqId: ULong
        get() = glibHookListPointer.pointed.seq_id
        set(`value`) {
            glibHookListPointer.pointed.seq_id = value
        }

    /**
     * the size of the #GHookList elements, in bytes
     */
    public var hookSize: UInt
        get() = glibHookListPointer.pointed.hook_size
        set(`value`) {
            glibHookListPointer.pointed.hook_size = value
        }

    /**
     * 1 if the #GHookList has been initialized
     */
    public var isSetup: UInt
        get() = glibHookListPointer.pointed.is_setup
        set(`value`) {
            glibHookListPointer.pointed.is_setup = value
        }

    /**
     * the first #GHook element in the list
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val hooks: Hook?
        get() =
            glibHookListPointer.pointed.hooks?.run {
                Hook(reinterpret())
            }

    /**
     * Removes all the #GHook elements from a #GHookList.
     */
    public fun clear(): Unit = g_hook_list_clear(glibHookListPointer.reinterpret())

    /**
     * Initializes a #GHookList.
     * This must be called before the #GHookList is used.
     *
     * @param hookSize the size of each element in the #GHookList,
     *     typically `sizeof (GHook)`.
     */
    public fun `init`(hookSize: UInt): Unit = g_hook_list_init(glibHookListPointer.reinterpret(), hookSize)

    /**
     * Calls all of the #GHook functions in a #GHookList.
     *
     * @param mayRecurse true if functions which are already running
     *     (e.g. in another thread) can be called. If set to false,
     *     these are skipped
     */
    public fun invoke(mayRecurse: Boolean): Unit =
        g_hook_list_invoke(glibHookListPointer.reinterpret(), mayRecurse.asGBoolean())

    /**
     * Calls all of the #GHook functions in a #GHookList.
     * Any function which returns false is removed from the #GHookList.
     *
     * @param mayRecurse true if functions which are already running
     *     (e.g. in another thread) can be called. If set to false,
     *     these are skipped
     */
    public fun invokeCheck(mayRecurse: Boolean): Unit =
        g_hook_list_invoke_check(glibHookListPointer.reinterpret(), mayRecurse.asGBoolean())

    /**
     * Calls a function on each valid #GHook.
     *
     * @param mayRecurse true if hooks which are currently running
     *     (e.g. in another thread) are considered valid. If set to false,
     *     these are skipped
     * @param marshaller the function to call for each #GHook
     */
    public fun marshal(
        mayRecurse: Boolean,
        marshaller: HookMarshaller,
    ): Unit =
        g_hook_list_marshal(
            glibHookListPointer.reinterpret(),
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
    public fun marshalCheck(
        mayRecurse: Boolean,
        marshaller: HookCheckMarshaller,
    ): Unit =
        g_hook_list_marshal_check(
            glibHookListPointer.reinterpret(),
            mayRecurse.asGBoolean(),
            HookCheckMarshallerFunc.reinterpret(),
            StableRef.create(marshaller).asCPointer()
        )

    public companion object : RecordCompanion<HookList, GHookList> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): HookList = HookList(pointer.reinterpret())
    }
}

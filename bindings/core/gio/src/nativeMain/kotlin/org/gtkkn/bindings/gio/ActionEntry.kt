// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gio.GActionEntry
import org.gtkkn.native.glib.g_free
import org.gtkkn.native.glib.g_strdup
import kotlin.String

/**
 * This struct defines a single action.  It is for use with
 * g_action_map_add_action_entries().
 *
 * The order of the items in the structure are intended to reflect
 * frequency of use.  It is permissible to use an incomplete initialiser
 * in order to leave some of the later values as null.  All values
 * after @name are optional.  Additional optional fields may be added in
 * the future.
 *
 * See g_action_map_add_action_entries() for an example.
 *
 * ## Skipped during bindings generation
 *
 * - field `activate`: Fields with callbacks are not supported
 * - field `change_state`: Fields with callbacks are not supported
 */
public class ActionEntry(public val gioActionEntryPointer: CPointer<GActionEntry>) :
    ProxyInstance(gioActionEntryPointer) {
    /**
     * the name of the action
     */
    public var name: String?
        get() = gioActionEntryPointer.pointed.name?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gioActionEntryPointer.pointed.name?.let { g_free(it) }
            gioActionEntryPointer.pointed.name = value?.let { g_strdup(it) }
        }

    /**
     * the type of the parameter that must be passed to the
     *                  activate function for this action, given as a single
     *                  GVariant type string (or null for no parameter)
     */
    public var parameterType: String?
        get() = gioActionEntryPointer.pointed.parameter_type?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gioActionEntryPointer.pointed.parameter_type?.let { g_free(it) }
            gioActionEntryPointer.pointed.parameter_type = value?.let { g_strdup(it) }
        }

    /**
     * the initial state for this action, given in
     *         [GVariant text format][gvariant-text].  The state is parsed
     *         with no extra type information, so type tags must be added to
     *         the string if they are necessary.  Stateless actions should
     *         give null here.
     */
    public var state: String?
        get() = gioActionEntryPointer.pointed.state?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gioActionEntryPointer.pointed.state?.let { g_free(it) }
            gioActionEntryPointer.pointed.state = value?.let { g_strdup(it) }
        }

    /**
     * Allocate a new ActionEntry.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GActionEntry>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new ActionEntry using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GActionEntry>().ptr)

    /**
     * Allocate a new ActionEntry.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param name the name of the action
     * @param parameterType the type of the parameter that must be passed to the
     *                  activate function for this action, given as a single
     *                  GVariant type string (or null for no parameter)
     * @param state the initial state for this action, given in
     *         [GVariant text format][gvariant-text].  The state is parsed
     *         with no extra type information, so type tags must be added to
     *         the string if they are necessary.  Stateless actions should
     *         give null here.
     */
    public constructor(
        name: String?,
        parameterType: String?,
        state: String?,
    ) : this() {
        this.name = name
        this.parameterType = parameterType
        this.state = state
    }

    /**
     * Allocate a new ActionEntry using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param name the name of the action
     * @param parameterType the type of the parameter that must be passed to the
     *                  activate function for this action, given as a single
     *                  GVariant type string (or null for no parameter)
     * @param state the initial state for this action, given in
     *         [GVariant text format][gvariant-text].  The state is parsed
     *         with no extra type information, so type tags must be added to
     *         the string if they are necessary.  Stateless actions should
     *         give null here.
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        name: String?,
        parameterType: String?,
        state: String?,
        scope: AutofreeScope,
    ) : this(scope) {
        this.name = name
        this.parameterType = parameterType
        this.state = state
    }

    override fun toString(): String = "ActionEntry(name=$name, parameterType=$parameterType, state=$state)"
}

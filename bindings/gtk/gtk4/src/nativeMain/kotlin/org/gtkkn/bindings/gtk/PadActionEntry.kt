// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

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
import org.gtkkn.native.glib.g_free
import org.gtkkn.native.glib.g_strdup
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gtk.GtkPadActionEntry
import kotlin.String

/**
 * Struct defining a pad action entry.
 */
public class PadActionEntry(public val gtkPadActionEntryPointer: CPointer<GtkPadActionEntry>) :
    ProxyInstance(gtkPadActionEntryPointer) {
    /**
     * the type of pad feature that will trigger this action entry.
     */
    public var type: PadActionType
        get() = gtkPadActionEntryPointer.pointed.type.run {
            PadActionType.fromNativeValue(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            gtkPadActionEntryPointer.pointed.type = value.nativeValue
        }

    /**
     * the 0-indexed button/ring/strip number that will trigger this action
     *   entry.
     */
    public var index: gint
        get() = gtkPadActionEntryPointer.pointed.index

        @UnsafeFieldSetter
        set(`value`) {
            gtkPadActionEntryPointer.pointed.index = value
        }

    /**
     * the mode that will trigger this action entry, or -1 for all modes.
     */
    public var mode: gint
        get() = gtkPadActionEntryPointer.pointed.mode

        @UnsafeFieldSetter
        set(`value`) {
            gtkPadActionEntryPointer.pointed.mode = value
        }

    /**
     * Human readable description of this action entry, this string should
     *   be deemed user-visible.
     */
    public var label: String?
        get() = gtkPadActionEntryPointer.pointed.label?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gtkPadActionEntryPointer.pointed.label?.let { g_free(it) }
            gtkPadActionEntryPointer.pointed.label = value?.let { g_strdup(it) }
        }

    /**
     * action name that will be activated in the `GActionGroup`.
     */
    public var actionName: String?
        get() = gtkPadActionEntryPointer.pointed.action_name?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gtkPadActionEntryPointer.pointed.action_name?.let { g_free(it) }
            gtkPadActionEntryPointer.pointed.action_name = value?.let { g_strdup(it) }
        }

    /**
     * Allocate a new PadActionEntry.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GtkPadActionEntry>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new PadActionEntry using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GtkPadActionEntry>().ptr)

    /**
     * Allocate a new PadActionEntry.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param type the type of pad feature that will trigger this action entry.
     * @param index the 0-indexed button/ring/strip number that will trigger this action
     *   entry.
     * @param mode the mode that will trigger this action entry, or -1 for all modes.
     * @param label Human readable description of this action entry, this string should
     *   be deemed user-visible.
     * @param actionName action name that will be activated in the `GActionGroup`.
     */
    public constructor(
        type: PadActionType,
        index: gint,
        mode: gint,
        label: String?,
        actionName: String?,
    ) : this() {
        this.type = type
        this.index = index
        this.mode = mode
        this.label = label
        this.actionName = actionName
    }

    /**
     * Allocate a new PadActionEntry using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param type the type of pad feature that will trigger this action entry.
     * @param index the 0-indexed button/ring/strip number that will trigger this action
     *   entry.
     * @param mode the mode that will trigger this action entry, or -1 for all modes.
     * @param label Human readable description of this action entry, this string should
     *   be deemed user-visible.
     * @param actionName action name that will be activated in the `GActionGroup`.
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        type: PadActionType,
        index: gint,
        mode: gint,
        label: String?,
        actionName: String?,
        scope: AutofreeScope,
    ) : this(scope) {
        this.type = type
        this.index = index
        this.mode = mode
        this.label = label
        this.actionName = actionName
    }

    override fun toString(): String =
        "PadActionEntry(type=$type, index=$index, mode=$mode, label=$label, actionName=$actionName)"
}

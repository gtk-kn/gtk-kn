// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.g_free
import org.gtkkn.native.glib.g_strdup
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gtk.GtkPadActionEntry
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * Struct defining a pad action entry.
 */
public class PadActionEntry(pointer: CPointer<GtkPadActionEntry>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GtkPadActionEntry> = pointer

    /**
     * the type of pad feature that will trigger this action entry.
     */
    public var type: PadActionType
        get() = gPointer.pointed.type.run {
            PadActionType.fromNativeValue(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.type = value.nativeValue
        }

    /**
     * the 0-indexed button/ring/strip number that will trigger this action
     *   entry.
     */
    public var index: gint
        get() = gPointer.pointed.index

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.index = value
        }

    /**
     * the mode that will trigger this action entry, or -1 for all modes.
     */
    public var mode: gint
        get() = gPointer.pointed.mode

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.mode = value
        }

    /**
     * Human readable description of this action entry, this string should
     *   be deemed user-visible.
     */
    public var label: String?
        get() = gPointer.pointed.label?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.label?.let { g_free(it) }
            gPointer.pointed.label = value?.let { g_strdup(it) }
        }

    /**
     * action name that will be activated in the `GActionGroup`.
     */
    public var actionName: String?
        get() = gPointer.pointed.action_name?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.action_name?.let { g_free(it) }
            gPointer.pointed.action_name = value?.let { g_strdup(it) }
        }

    /**
     * Allocate a new PadActionEntry.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GtkPadActionEntry>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to PadActionEntry and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GtkPadActionEntry>, Cleaner>,
    ) : this(pointer = pair.first, cleaner = pair.second)

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

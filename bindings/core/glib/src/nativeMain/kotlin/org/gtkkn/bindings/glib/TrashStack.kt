// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GTrashStack
import org.gtkkn.native.glib.g_trash_stack_height
import org.gtkkn.native.glib.g_trash_stack_peek
import org.gtkkn.native.glib.g_trash_stack_pop
import org.gtkkn.native.glib.g_trash_stack_push
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.glib.guint
import kotlin.Pair
import kotlin.String
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * A `GTrashStack` is an efficient way to keep a stack of unused allocated
 * memory chunks. Each memory chunk is required to be large enough to hold
 * a `gpointer`. This allows the stack to be maintained without any space
 * overhead, since the stack pointers can be stored inside the memory chunks.
 *
 * There is no function to create a `GTrashStack`. A `NULL` `GTrashStack*`
 * is a perfectly valid empty stack.
 *
 * Each piece of memory that is pushed onto the stack is cast to a
 * `GTrashStack*`.
 *
 * There is no longer any good reason to use `GTrashStack`.  If you have
 * extra pieces of memory, `free()` them and allocate them again later.
 */
public class TrashStack(pointer: CPointer<GTrashStack>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GTrashStack> = pointer

    /**
     * pointer to the previous element of the stack,
     *     gets stored in the first `sizeof (gpointer)`
     *     bytes of the element
     */
    public var next: TrashStack?
        get() = gPointer.pointed.next?.run {
            TrashStack(reinterpret())
        }

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.next = value?.gPointer
        }

    /**
     * Allocate a new TrashStack.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GTrashStack>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to TrashStack and a [Cleaner] instance.
     */
    private constructor(pair: Pair<CPointer<GTrashStack>, Cleaner>) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new TrashStack using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GTrashStack>().ptr)

    /**
     * Allocate a new TrashStack.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param next pointer to the previous element of the stack,
     *     gets stored in the first `sizeof (gpointer)`
     *     bytes of the element
     */
    public constructor(next: TrashStack?) : this() {
        this.next = next
    }

    /**
     * Allocate a new TrashStack using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param next pointer to the previous element of the stack,
     *     gets stored in the first `sizeof (gpointer)`
     *     bytes of the element
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(next: TrashStack?, scope: AutofreeScope) : this(scope) {
        this.next = next
    }

    override fun toString(): String = "TrashStack(next=$next)"

    public companion object {
        /**
         * Returns the height of a #GTrashStack.
         *
         * Note that execution of this function is of O(N) complexity
         * where N denotes the number of items on the stack.
         *
         * @param stackP a #GTrashStack
         * @return the height of the stack
         */
        public fun height(stackP: TrashStack): guint = g_trash_stack_height(stackP.gPointer.reinterpret())

        /**
         * Returns the element at the top of a #GTrashStack
         * which may be null.
         *
         * @param stackP a #GTrashStack
         * @return the element at the top of the stack
         */
        public fun peek(stackP: TrashStack): gpointer? = g_trash_stack_peek(stackP.gPointer.reinterpret())

        /**
         * Pops a piece of memory off a #GTrashStack.
         *
         * @param stackP a #GTrashStack
         * @return the element at the top of the stack
         */
        public fun pop(stackP: TrashStack): gpointer? = g_trash_stack_pop(stackP.gPointer.reinterpret())

        /**
         * Pushes a piece of memory onto a #GTrashStack.
         *
         * @param stackP a #GTrashStack
         * @param dataP the piece of memory to push on the stack
         */
        public fun push(stackP: TrashStack, dataP: gpointer): Unit =
            g_trash_stack_push(stackP.gPointer.reinterpret(), dataP)
    }
}

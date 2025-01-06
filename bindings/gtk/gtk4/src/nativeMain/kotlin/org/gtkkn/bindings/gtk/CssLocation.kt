// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.gsize
import org.gtkkn.native.gtk.GtkCssLocation
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

public class CssLocation(pointer: CPointer<GtkCssLocation>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GtkCssLocation> = pointer

    public var bytes: gsize
        get() = gPointer.pointed.bytes

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.bytes = value
        }

    public var chars: gsize
        get() = gPointer.pointed.chars

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.chars = value
        }

    public var lines: gsize
        get() = gPointer.pointed.lines

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.lines = value
        }

    public var lineBytes: gsize
        get() = gPointer.pointed.line_bytes

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.line_bytes = value
        }

    public var lineChars: gsize
        get() = gPointer.pointed.line_chars

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.line_chars = value
        }

    /**
     * Allocate a new CssLocation.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GtkCssLocation>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to CssLocation and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GtkCssLocation>, Cleaner>,
    ) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new CssLocation using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GtkCssLocation>().ptr)

    /**
     * Allocate a new CssLocation.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param bytes
     * @param chars
     * @param lines
     * @param lineBytes
     * @param lineChars
     */
    public constructor(
        bytes: gsize,
        chars: gsize,
        lines: gsize,
        lineBytes: gsize,
        lineChars: gsize,
    ) : this() {
        this.bytes = bytes
        this.chars = chars
        this.lines = lines
        this.lineBytes = lineBytes
        this.lineChars = lineChars
    }

    /**
     * Allocate a new CssLocation using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param bytes
     * @param chars
     * @param lines
     * @param lineBytes
     * @param lineChars
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        bytes: gsize,
        chars: gsize,
        lines: gsize,
        lineBytes: gsize,
        lineChars: gsize,
        scope: AutofreeScope,
    ) : this(scope) {
        this.bytes = bytes
        this.chars = chars
        this.lines = lines
        this.lineBytes = lineBytes
        this.lineChars = lineChars
    }

    override fun toString(): String =
        "CssLocation(bytes=$bytes, chars=$chars, lines=$lines, lineBytes=$lineBytes, lineChars=$lineChars)"
}

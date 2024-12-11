// This is a generated file. Do not modify.
package org.gtkkn.bindings.gsk

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gobject.gsize
import org.gtkkn.native.gsk.GskParseLocation
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * A location in a parse buffer.
 */
public class ParseLocation(pointer: CPointer<GskParseLocation>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gskParseLocationPointer: CPointer<GskParseLocation> = pointer

    /**
     * the offset of the location in the parse buffer, as bytes
     */
    public var bytes: gsize
        get() = gskParseLocationPointer.pointed.bytes

        @UnsafeFieldSetter
        set(`value`) {
            gskParseLocationPointer.pointed.bytes = value
        }

    /**
     * the offset of the location in the parse buffer, as characters
     */
    public var chars: gsize
        get() = gskParseLocationPointer.pointed.chars

        @UnsafeFieldSetter
        set(`value`) {
            gskParseLocationPointer.pointed.chars = value
        }

    /**
     * the line of the location in the parse buffer
     */
    public var lines: gsize
        get() = gskParseLocationPointer.pointed.lines

        @UnsafeFieldSetter
        set(`value`) {
            gskParseLocationPointer.pointed.lines = value
        }

    /**
     * the position in the line, as bytes
     */
    public var lineBytes: gsize
        get() = gskParseLocationPointer.pointed.line_bytes

        @UnsafeFieldSetter
        set(`value`) {
            gskParseLocationPointer.pointed.line_bytes = value
        }

    /**
     * the position in the line, as characters
     */
    public var lineChars: gsize
        get() = gskParseLocationPointer.pointed.line_chars

        @UnsafeFieldSetter
        set(`value`) {
            gskParseLocationPointer.pointed.line_chars = value
        }

    /**
     * Allocate a new ParseLocation.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GskParseLocation>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to ParseLocation and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GskParseLocation>, Cleaner>,
    ) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new ParseLocation using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GskParseLocation>().ptr)

    /**
     * Allocate a new ParseLocation.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param bytes the offset of the location in the parse buffer, as bytes
     * @param chars the offset of the location in the parse buffer, as characters
     * @param lines the line of the location in the parse buffer
     * @param lineBytes the position in the line, as bytes
     * @param lineChars the position in the line, as characters
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
     * Allocate a new ParseLocation using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param bytes the offset of the location in the parse buffer, as bytes
     * @param chars the offset of the location in the parse buffer, as characters
     * @param lines the line of the location in the parse buffer
     * @param lineBytes the position in the line, as bytes
     * @param lineChars the position in the line, as characters
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
        "ParseLocation(bytes=$bytes, chars=$chars, lines=$lines, lineBytes=$lineBytes, lineChars=$lineChars)"
}

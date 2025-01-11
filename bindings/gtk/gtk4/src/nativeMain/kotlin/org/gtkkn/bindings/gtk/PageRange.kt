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
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gtk.GtkPageRange
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * A range of pages to print.
 *
 * See also [method@Gtk.PrintSettings.set_page_ranges].
 */
public class PageRange(public val gtkPageRangePointer: CPointer<GtkPageRange>, cleaner: Cleaner? = null) :
    ProxyInstance(gtkPageRangePointer) {
    /**
     * start of page range.
     */
    public var start: gint
        get() = gtkPageRangePointer.pointed.start

        @UnsafeFieldSetter
        set(`value`) {
            gtkPageRangePointer.pointed.start = value
        }

    /**
     * end of page range.
     */
    public var end: gint
        get() = gtkPageRangePointer.pointed.end

        @UnsafeFieldSetter
        set(`value`) {
            gtkPageRangePointer.pointed.end = value
        }

    /**
     * Allocate a new PageRange.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GtkPageRange>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to PageRange and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GtkPageRange>, Cleaner>,
    ) : this(gtkPageRangePointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new PageRange using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GtkPageRange>().ptr)

    /**
     * Allocate a new PageRange.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param start start of page range.
     * @param end end of page range.
     */
    public constructor(start: gint, end: gint) : this() {
        this.start = start
        this.end = end
    }

    /**
     * Allocate a new PageRange using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param start start of page range.
     * @param end end of page range.
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        start: gint,
        end: gint,
        scope: AutofreeScope,
    ) : this(scope) {
        this.start = start
        this.end = end
    }

    override fun toString(): String = "PageRange(start=$start, end=$end)"
}

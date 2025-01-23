// This is a generated file. Do not modify.
package org.gtkkn.bindings.cairo

import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner
import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.cairo.cairo_gobject_text_cluster_get_type
import org.gtkkn.native.cairo.cairo_text_cluster_t
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType

public class TextCluster(
    public val cairoTextClusterPointer: CPointer<cairo_text_cluster_t>,
    cleaner: Cleaner? = null,
) : ProxyInstance(cairoTextClusterPointer) {
    public var numBytes: gint
        get() = cairoTextClusterPointer.pointed.num_bytes
        @UnsafeFieldSetter
        set(`value`) {
            cairoTextClusterPointer.pointed.num_bytes = value
        }

    public var numGlyphs: gint
        get() = cairoTextClusterPointer.pointed.num_glyphs
        @UnsafeFieldSetter
        set(`value`) {
            cairoTextClusterPointer.pointed.num_glyphs = value
        }

    /**
     * Allocate a new TextCluster.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<cairo_text_cluster_t>().run {
        val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
        ptr to cleaner
    }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to TextCluster and a [Cleaner] instance.
     */
    private constructor(pair: Pair<CPointer<cairo_text_cluster_t>, Cleaner>) : this(cairoTextClusterPointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new TextCluster using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<cairo_text_cluster_t>().ptr)

    /**
     * Allocate a new TextCluster.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param numBytes 
     * @param numGlyphs 
     */
    public constructor(numBytes: gint, numGlyphs: gint) : this() {
        this.numBytes = numBytes
        this.numGlyphs = numGlyphs
    }

    /**
     * Allocate a new TextCluster using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param numBytes 
     * @param numGlyphs 
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        numBytes: gint,
        numGlyphs: gint,
        scope: AutofreeScope,
    ) : this(scope) {
        this.numBytes = numBytes
        this.numGlyphs = numGlyphs
    }

    override fun toString(): String = "TextCluster(numBytes=$numBytes, numGlyphs=$numGlyphs)"

    public companion object {
        /**
         * Get the GType of TextCluster
         *
         * @return the GType
         */
        public fun getType(): GType = cairo_gobject_text_cluster_get_type()
    }
}

// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import org.gtkkn.bindings.glib.SList
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.guint8
import org.gtkkn.native.pango.PangoAnalysis
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * The `PangoAnalysis` structure stores information about
 * the properties of a segment of text.
 */
public class Analysis(pointer: CPointer<PangoAnalysis>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gPointer: CPointer<PangoAnalysis> = pointer

    /**
     * the font for this segment.
     */
    public var font: Font?
        get() = gPointer.pointed.font?.run {
            Font(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.font = value?.pangoFontPointer
        }

    /**
     * the bidirectional level for this segment.
     */
    public var level: guint8
        get() = gPointer.pointed.level

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.level = value
        }

    /**
     * the glyph orientation for this segment (A `PangoGravity`).
     */
    public var gravity: guint8
        get() = gPointer.pointed.gravity

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.gravity = value
        }

    /**
     * boolean flags for this segment (Since: 1.16).
     */
    public var flags: guint8
        get() = gPointer.pointed.flags

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.flags = value
        }

    /**
     * the detected script for this segment (A `PangoScript`) (Since: 1.18).
     */
    public var script: guint8
        get() = gPointer.pointed.script

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.script = value
        }

    /**
     * the detected language for this segment.
     */
    public var language: Language?
        get() = gPointer.pointed.language?.run {
            Language(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.language = value?.gPointer
        }

    /**
     * extra attributes for this segment.
     */
    public var extraAttrs: SList?
        get() = gPointer.pointed.extra_attrs?.run {
            SList(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.extra_attrs = value?.gPointer
        }

    /**
     * Allocate a new Analysis.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<PangoAnalysis>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to Analysis and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<PangoAnalysis>, Cleaner>,
    ) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new Analysis using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<PangoAnalysis>().ptr)

    /**
     * Allocate a new Analysis.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param font the font for this segment.
     * @param level the bidirectional level for this segment.
     * @param gravity the glyph orientation for this segment (A `PangoGravity`).
     * @param flags boolean flags for this segment (Since: 1.16).
     * @param script the detected script for this segment (A `PangoScript`) (Since: 1.18).
     * @param language the detected language for this segment.
     * @param extraAttrs extra attributes for this segment.
     */
    public constructor(
        font: Font?,
        level: guint8,
        gravity: guint8,
        flags: guint8,
        script: guint8,
        language: Language?,
        extraAttrs: SList?,
    ) : this() {
        this.font = font
        this.level = level
        this.gravity = gravity
        this.flags = flags
        this.script = script
        this.language = language
        this.extraAttrs = extraAttrs
    }

    /**
     * Allocate a new Analysis using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param font the font for this segment.
     * @param level the bidirectional level for this segment.
     * @param gravity the glyph orientation for this segment (A `PangoGravity`).
     * @param flags boolean flags for this segment (Since: 1.16).
     * @param script the detected script for this segment (A `PangoScript`) (Since: 1.18).
     * @param language the detected language for this segment.
     * @param extraAttrs extra attributes for this segment.
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        font: Font?,
        level: guint8,
        gravity: guint8,
        flags: guint8,
        script: guint8,
        language: Language?,
        extraAttrs: SList?,
        scope: AutofreeScope,
    ) : this(scope) {
        this.font = font
        this.level = level
        this.gravity = gravity
        this.flags = flags
        this.script = script
        this.language = language
        this.extraAttrs = extraAttrs
    }

    override fun toString(): String =
        "Analysis(font=$font, level=$level, gravity=$gravity, flags=$flags, script=$script, language=$language, extraAttrs=$extraAttrs)"
}

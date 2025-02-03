// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.pango

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.SList
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.native.glib.guint8
import org.gtkkn.native.pango.PangoAnalysis
import kotlin.String

/**
 * The `PangoAnalysis` structure stores information about
 * the properties of a segment of text.
 */
public class Analysis(public val pangoAnalysisPointer: CPointer<PangoAnalysis>) : ProxyInstance(pangoAnalysisPointer) {
    /**
     * the font for this segment.
     */
    public var font: Font?
        get() = pangoAnalysisPointer.pointed.font?.run {
            InstanceCache.get(this, true) { Font.FontImpl(reinterpret()) }!!
        }

        @UnsafeFieldSetter
        set(`value`) {
            pangoAnalysisPointer.pointed.font = value?.pangoFontPointer
        }

    /**
     * the bidirectional level for this segment.
     */
    public var level: guint8
        get() = pangoAnalysisPointer.pointed.level

        @UnsafeFieldSetter
        set(`value`) {
            pangoAnalysisPointer.pointed.level = value
        }

    /**
     * the glyph orientation for this segment (A `PangoGravity`).
     */
    public var gravity: guint8
        get() = pangoAnalysisPointer.pointed.gravity

        @UnsafeFieldSetter
        set(`value`) {
            pangoAnalysisPointer.pointed.gravity = value
        }

    /**
     * boolean flags for this segment (Since: 1.16).
     */
    public var flags: guint8
        get() = pangoAnalysisPointer.pointed.flags

        @UnsafeFieldSetter
        set(`value`) {
            pangoAnalysisPointer.pointed.flags = value
        }

    /**
     * the detected script for this segment (A `PangoScript`) (Since: 1.18).
     */
    public var script: guint8
        get() = pangoAnalysisPointer.pointed.script

        @UnsafeFieldSetter
        set(`value`) {
            pangoAnalysisPointer.pointed.script = value
        }

    /**
     * the detected language for this segment.
     */
    public var language: Language?
        get() = pangoAnalysisPointer.pointed.language?.run {
            Language(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            pangoAnalysisPointer.pointed.language = value?.pangoLanguagePointer
        }

    /**
     * extra attributes for this segment.
     */
    public var extraAttrs: SList?
        get() = pangoAnalysisPointer.pointed.extra_attrs?.run {
            SList(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            pangoAnalysisPointer.pointed.extra_attrs = value?.glibSListPointer
        }

    /**
     * Allocate a new Analysis.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<PangoAnalysis>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

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

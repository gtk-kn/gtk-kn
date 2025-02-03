// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gdk.annotations.GdkPixbufVersion2_2
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gdk.GdkPixbufModulePattern
import org.gtkkn.native.glib.g_free
import org.gtkkn.native.glib.g_strdup
import org.gtkkn.native.glib.gint
import kotlin.String

/**
 * The signature prefix for a module.
 *
 * The signature of a module is a set of prefixes. Prefixes are encoded as
 * pairs of ordinary strings, where the second string, called the mask, if
 * not `NULL`, must be of the same length as the first one and may contain
 * ' ', '!', 'x', 'z', and 'n' to indicate bytes that must be matched,
 * not matched, "don't-care"-bytes, zeros and non-zeros, respectively.
 *
 * Each prefix has an associated integer that describes the relevance of
 * the prefix, with 0 meaning a mismatch and 100 a "perfect match".
 *
 * Starting with gdk-pixbuf 2.8, the first byte of the mask may be '*',
 * indicating an unanchored pattern that matches not only at the beginning,
 * but also in the middle. Versions prior to 2.8 will interpret the '*'
 * like an 'x'.
 *
 * The signature of a module is stored as an array of
 * `GdkPixbufModulePatterns`. The array is terminated by a pattern
 * where the `prefix` is `NULL`.
 *
 * ```c
 * GdkPixbufModulePattern *signature[] = {
 *   { "abcdx", " !x z", 100 },
 *   { "bla", NULL,  90 },
 *   { NULL, NULL, 0 }
 * };
 * ```
 *
 * In the example above, the signature matches e.g. "auud\0" with
 * relevance 100, and "blau" with relevance 90.
 * @since 2.2
 */
@GdkPixbufVersion2_2
public class PixbufModulePattern(public val gdkPixbufModulePatternPointer: CPointer<GdkPixbufModulePattern>) :
    ProxyInstance(gdkPixbufModulePatternPointer) {
    /**
     * the prefix for this pattern
     */
    public var prefix: String?
        get() = gdkPixbufModulePatternPointer.pointed.prefix?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gdkPixbufModulePatternPointer.pointed.prefix?.let { g_free(it) }
            gdkPixbufModulePatternPointer.pointed.prefix = value?.let { g_strdup(it) }
        }

    /**
     * mask containing bytes which modify how the prefix is matched against
     *  test data
     */
    public var mask: String?
        get() = gdkPixbufModulePatternPointer.pointed.mask?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gdkPixbufModulePatternPointer.pointed.mask?.let { g_free(it) }
            gdkPixbufModulePatternPointer.pointed.mask = value?.let { g_strdup(it) }
        }

    /**
     * relevance of this pattern
     */
    public var relevance: gint
        get() = gdkPixbufModulePatternPointer.pointed.relevance

        @UnsafeFieldSetter
        set(`value`) {
            gdkPixbufModulePatternPointer.pointed.relevance = value
        }

    /**
     * Allocate a new PixbufModulePattern.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GdkPixbufModulePattern>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new PixbufModulePattern using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GdkPixbufModulePattern>().ptr)

    /**
     * Allocate a new PixbufModulePattern.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param prefix the prefix for this pattern
     * @param mask mask containing bytes which modify how the prefix is matched against
     *  test data
     * @param relevance relevance of this pattern
     */
    public constructor(
        prefix: String?,
        mask: String?,
        relevance: gint,
    ) : this() {
        this.prefix = prefix
        this.mask = mask
        this.relevance = relevance
    }

    /**
     * Allocate a new PixbufModulePattern using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param prefix the prefix for this pattern
     * @param mask mask containing bytes which modify how the prefix is matched against
     *  test data
     * @param relevance relevance of this pattern
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        prefix: String?,
        mask: String?,
        relevance: gint,
        scope: AutofreeScope,
    ) : this(scope) {
        this.prefix = prefix
        this.mask = mask
        this.relevance = relevance
    }

    override fun toString(): String = "PixbufModulePattern(prefix=$prefix, mask=$mask, relevance=$relevance)"
}

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
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.gsize
import org.gtkkn.native.gtk.GtkCssLocation
import kotlin.String

/**
 * A description of a location inside a CSS stream.
 */
public class CssLocation(public val gtkCssLocationPointer: CPointer<GtkCssLocation>) :
    ProxyInstance(gtkCssLocationPointer) {
    public var bytes: gsize
        get() = gtkCssLocationPointer.pointed.bytes

        @UnsafeFieldSetter
        set(`value`) {
            gtkCssLocationPointer.pointed.bytes = value
        }

    public var chars: gsize
        get() = gtkCssLocationPointer.pointed.chars

        @UnsafeFieldSetter
        set(`value`) {
            gtkCssLocationPointer.pointed.chars = value
        }

    public var lines: gsize
        get() = gtkCssLocationPointer.pointed.lines

        @UnsafeFieldSetter
        set(`value`) {
            gtkCssLocationPointer.pointed.lines = value
        }

    public var lineBytes: gsize
        get() = gtkCssLocationPointer.pointed.line_bytes

        @UnsafeFieldSetter
        set(`value`) {
            gtkCssLocationPointer.pointed.line_bytes = value
        }

    public var lineChars: gsize
        get() = gtkCssLocationPointer.pointed.line_chars

        @UnsafeFieldSetter
        set(`value`) {
            gtkCssLocationPointer.pointed.line_chars = value
        }

    /**
     * Allocate a new CssLocation.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GtkCssLocation>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

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

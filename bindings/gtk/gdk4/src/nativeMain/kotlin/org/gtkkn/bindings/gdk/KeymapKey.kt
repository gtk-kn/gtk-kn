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
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gdk.GdkKeymapKey
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.guint
import kotlin.String

/**
 * A `GdkKeymapKey` is a hardware key that can be mapped to a keyval.
 */
public class KeymapKey(public val gdkKeymapKeyPointer: CPointer<GdkKeymapKey>) : ProxyInstance(gdkKeymapKeyPointer) {
    /**
     * the hardware keycode. This is an identifying number for a
     *   physical key.
     */
    public var keycode: guint
        get() = gdkKeymapKeyPointer.pointed.keycode

        @UnsafeFieldSetter
        set(`value`) {
            gdkKeymapKeyPointer.pointed.keycode = value
        }

    /**
     * indicates movement in a horizontal direction. Usually groups are used
     *   for two different languages. In group 0, a key might have two English
     *   characters, and in group 1 it might have two Hebrew characters. The Hebrew
     *   characters will be printed on the key next to the English characters.
     */
    public var group: gint
        get() = gdkKeymapKeyPointer.pointed.group

        @UnsafeFieldSetter
        set(`value`) {
            gdkKeymapKeyPointer.pointed.group = value
        }

    /**
     * indicates which symbol on the key will be used, in a vertical direction.
     *   So on a standard US keyboard, the key with the number “1” on it also has the
     *   exclamation point ("!") character on it. The level indicates whether to use
     *   the “1” or the “!” symbol. The letter keys are considered to have a lowercase
     *   letter at level 0, and an uppercase letter at level 1, though only the
     *   uppercase letter is printed.
     */
    public var level: gint
        get() = gdkKeymapKeyPointer.pointed.level

        @UnsafeFieldSetter
        set(`value`) {
            gdkKeymapKeyPointer.pointed.level = value
        }

    /**
     * Allocate a new KeymapKey.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GdkKeymapKey>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new KeymapKey using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GdkKeymapKey>().ptr)

    /**
     * Allocate a new KeymapKey.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param keycode the hardware keycode. This is an identifying number for a
     *   physical key.
     * @param group indicates movement in a horizontal direction. Usually groups are used
     *   for two different languages. In group 0, a key might have two English
     *   characters, and in group 1 it might have two Hebrew characters. The Hebrew
     *   characters will be printed on the key next to the English characters.
     * @param level indicates which symbol on the key will be used, in a vertical direction.
     *   So on a standard US keyboard, the key with the number “1” on it also has the
     *   exclamation point ("!") character on it. The level indicates whether to use
     *   the “1” or the “!” symbol. The letter keys are considered to have a lowercase
     *   letter at level 0, and an uppercase letter at level 1, though only the
     *   uppercase letter is printed.
     */
    public constructor(
        keycode: guint,
        group: gint,
        level: gint,
    ) : this() {
        this.keycode = keycode
        this.group = group
        this.level = level
    }

    /**
     * Allocate a new KeymapKey using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param keycode the hardware keycode. This is an identifying number for a
     *   physical key.
     * @param group indicates movement in a horizontal direction. Usually groups are used
     *   for two different languages. In group 0, a key might have two English
     *   characters, and in group 1 it might have two Hebrew characters. The Hebrew
     *   characters will be printed on the key next to the English characters.
     * @param level indicates which symbol on the key will be used, in a vertical direction.
     *   So on a standard US keyboard, the key with the number “1” on it also has the
     *   exclamation point ("!") character on it. The level indicates whether to use
     *   the “1” or the “!” symbol. The letter keys are considered to have a lowercase
     *   letter at level 0, and an uppercase letter at level 1, though only the
     *   uppercase letter is printed.
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        keycode: guint,
        group: gint,
        level: gint,
        scope: AutofreeScope,
    ) : this(scope) {
        this.keycode = keycode
        this.group = group
        this.level = level
    }

    override fun toString(): String = "KeymapKey(keycode=$keycode, group=$group, level=$level)"
}

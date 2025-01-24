// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import org.gtkkn.native.gdk.GdkKeyMatch
import org.gtkkn.native.gdk.gdk_key_match_get_type
import org.gtkkn.native.gobject.GType

/**
 * Describes how well an event matches a given keyval and modifiers.
 *
 * `GdkKeyMatch` values are returned by [method@Gdk.KeyEvent.matches].
 */
public enum class KeyMatch(public val nativeValue: GdkKeyMatch) {
    /**
     * The key event does not match
     */
    NONE(GdkKeyMatch.GDK_KEY_MATCH_NONE),

    /**
     * The key event matches if keyboard state
     *   (specifically, the currently active group) is ignored
     */
    PARTIAL(GdkKeyMatch.GDK_KEY_MATCH_PARTIAL),

    /**
     * The key event matches
     */
    EXACT(GdkKeyMatch.GDK_KEY_MATCH_EXACT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkKeyMatch): KeyMatch = when (nativeValue) {
            GdkKeyMatch.GDK_KEY_MATCH_NONE -> NONE
            GdkKeyMatch.GDK_KEY_MATCH_PARTIAL -> PARTIAL
            GdkKeyMatch.GDK_KEY_MATCH_EXACT -> EXACT
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of KeyMatch
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_key_match_get_type()
    }
}

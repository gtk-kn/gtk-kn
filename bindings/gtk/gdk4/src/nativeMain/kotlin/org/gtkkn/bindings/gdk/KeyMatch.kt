// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import org.gtkkn.native.gdk.GdkKeyMatch
import org.gtkkn.native.gdk.GdkKeyMatch.GDK_KEY_MATCH_EXACT
import org.gtkkn.native.gdk.GdkKeyMatch.GDK_KEY_MATCH_NONE
import org.gtkkn.native.gdk.GdkKeyMatch.GDK_KEY_MATCH_PARTIAL

/**
 * Describes how well an event matches a given keyval and modifiers.
 *
 * `GdkKeyMatch` values are returned by [method@Gdk.KeyEvent.matches].
 */
public enum class KeyMatch(
    public val nativeValue: GdkKeyMatch,
) {
    /**
     * The key event does not match
     */
    NONE(GDK_KEY_MATCH_NONE),

    /**
     * The key event matches if keyboard state
     *   (specifically, the currently active group) is ignored
     */
    PARTIAL(GDK_KEY_MATCH_PARTIAL),

    /**
     * The key event matches
     */
    EXACT(GDK_KEY_MATCH_EXACT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GdkKeyMatch): KeyMatch =
            when (nativeValue) {
                GDK_KEY_MATCH_NONE -> NONE
                GDK_KEY_MATCH_PARTIAL -> PARTIAL
                GDK_KEY_MATCH_EXACT -> EXACT
                else -> error("invalid nativeValue")
            }
    }
}

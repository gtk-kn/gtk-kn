// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import org.gtkkn.native.adw.AdwSqueezerTransitionType
import org.gtkkn.native.adw.AdwSqueezerTransitionType.ADW_SQUEEZER_TRANSITION_TYPE_CROSSFADE
import org.gtkkn.native.adw.AdwSqueezerTransitionType.ADW_SQUEEZER_TRANSITION_TYPE_NONE

/**
 * Describes the possible transitions in a [class@Squeezer] widget.
 */
public enum class SqueezerTransitionType(
    public val nativeValue: AdwSqueezerTransitionType,
) {
    /**
     * No transition
     */
    NONE(ADW_SQUEEZER_TRANSITION_TYPE_NONE),

    /**
     * A cross-fade
     */
    CROSSFADE(ADW_SQUEEZER_TRANSITION_TYPE_CROSSFADE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AdwSqueezerTransitionType): SqueezerTransitionType =
            when (nativeValue) {
                ADW_SQUEEZER_TRANSITION_TYPE_NONE -> NONE
                ADW_SQUEEZER_TRANSITION_TYPE_CROSSFADE -> CROSSFADE
                else -> error("invalid nativeValue")
            }
    }
}

// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import org.gtkkn.native.adw.AdwSqueezerTransitionType
import org.gtkkn.native.adw.adw_squeezer_transition_type_get_type
import org.gtkkn.native.gobject.GType

/**
 * Describes the possible transitions in a [class@Squeezer] widget.
 */
public enum class SqueezerTransitionType(public val nativeValue: AdwSqueezerTransitionType) {
    /**
     * No transition
     */
    NONE(AdwSqueezerTransitionType.ADW_SQUEEZER_TRANSITION_TYPE_NONE),

    /**
     * A cross-fade
     */
    CROSSFADE(AdwSqueezerTransitionType.ADW_SQUEEZER_TRANSITION_TYPE_CROSSFADE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AdwSqueezerTransitionType): SqueezerTransitionType =
            when (nativeValue) {
                AdwSqueezerTransitionType.ADW_SQUEEZER_TRANSITION_TYPE_NONE -> NONE
                AdwSqueezerTransitionType.ADW_SQUEEZER_TRANSITION_TYPE_CROSSFADE -> CROSSFADE
                else -> error("invalid nativeValue")
            }

        /**
         * Get the GType of SqueezerTransitionType
         *
         * @return the GType
         */
        public fun getType(): GType = adw_squeezer_transition_type_get_type()
    }
}

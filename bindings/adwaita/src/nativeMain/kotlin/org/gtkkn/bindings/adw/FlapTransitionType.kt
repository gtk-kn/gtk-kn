// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import org.gtkkn.native.adw.AdwFlapTransitionType
import org.gtkkn.native.adw.AdwFlapTransitionType.ADW_FLAP_TRANSITION_TYPE_OVER
import org.gtkkn.native.adw.AdwFlapTransitionType.ADW_FLAP_TRANSITION_TYPE_SLIDE
import org.gtkkn.native.adw.AdwFlapTransitionType.ADW_FLAP_TRANSITION_TYPE_UNDER

/**
 * Describes transitions types of a [class@Flap] widget.
 *
 * It determines the type of animation when transitioning between children in a
 * [class@Flap] widget, as well as which areas can be swiped via
 * [property@Flap:swipe-to-open] and [property@Flap:swipe-to-close].
 */
public enum class FlapTransitionType(
    public val nativeValue: AdwFlapTransitionType,
) {
    /**
     * The flap slides over the content, which is
     *   dimmed. When folded, only the flap can be swiped.
     */
    OVER(ADW_FLAP_TRANSITION_TYPE_OVER),

    /**
     * The content slides over the flap. Only the
     *   content can be swiped.
     */
    UNDER(ADW_FLAP_TRANSITION_TYPE_UNDER),

    /**
     * The flap slides offscreen when hidden,
     *   neither the flap nor content overlap each other. Both widgets can be
     *   swiped.
     */
    SLIDE(ADW_FLAP_TRANSITION_TYPE_SLIDE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AdwFlapTransitionType): FlapTransitionType =
            when (nativeValue) {
                ADW_FLAP_TRANSITION_TYPE_OVER -> OVER
                ADW_FLAP_TRANSITION_TYPE_UNDER -> UNDER
                ADW_FLAP_TRANSITION_TYPE_SLIDE -> SLIDE
                else -> error("invalid nativeValue")
            }
    }
}

// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import org.gtkkn.bindings.atk.annotations.AtkVersion2_50
import org.gtkkn.native.atk.AtkLive

/**
 * Enumeration used to indicate a type of live region and how assertive it
 * should be in terms of speaking notifications. Currently, this is only used
 * for "notification" events, but it may be used for additional purposes
 * in the future.
 * @since 2.50
 */
@AtkVersion2_50
public enum class Live(
    public val nativeValue: AtkLive,
) {
    /**
     * No live region.
     */
    NONE(AtkLive.ATK_LIVE_NONE),

    /**
     * This live region should be considered polite.
     */
    POLITE(AtkLive.ATK_LIVE_POLITE),

    /**
     * This live region should be considered assertive.
     */
    ASSERTIVE(AtkLive.ATK_LIVE_ASSERTIVE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AtkLive): Live =
            when (nativeValue) {
                AtkLive.ATK_LIVE_NONE -> NONE
                AtkLive.ATK_LIVE_POLITE -> POLITE
                AtkLive.ATK_LIVE_ASSERTIVE -> ASSERTIVE
                else -> error("invalid nativeValue")
            }
    }
}

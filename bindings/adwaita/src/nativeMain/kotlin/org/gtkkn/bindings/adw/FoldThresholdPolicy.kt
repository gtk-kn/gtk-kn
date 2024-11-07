// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import org.gtkkn.native.adw.AdwFoldThresholdPolicy

/**
 * Determines when [class@Flap] and [class@Leaflet] will fold.
 */
public enum class FoldThresholdPolicy(
    public val nativeValue: AdwFoldThresholdPolicy,
) {
    /**
     * Folding is based on the minimum size
     */
    MINIMUM(AdwFoldThresholdPolicy.ADW_FOLD_THRESHOLD_POLICY_MINIMUM),

    /**
     * Folding is based on the natural size
     */
    NATURAL(AdwFoldThresholdPolicy.ADW_FOLD_THRESHOLD_POLICY_NATURAL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AdwFoldThresholdPolicy): FoldThresholdPolicy =
            when (nativeValue) {
                AdwFoldThresholdPolicy.ADW_FOLD_THRESHOLD_POLICY_MINIMUM -> MINIMUM
                AdwFoldThresholdPolicy.ADW_FOLD_THRESHOLD_POLICY_NATURAL -> NATURAL
                else -> error("invalid nativeValue")
            }
    }
}

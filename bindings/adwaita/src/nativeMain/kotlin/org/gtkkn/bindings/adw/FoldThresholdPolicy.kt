// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import org.gtkkn.native.adw.AdwFoldThresholdPolicy
import org.gtkkn.native.adw.AdwFoldThresholdPolicy.ADW_FOLD_THRESHOLD_POLICY_MINIMUM
import org.gtkkn.native.adw.AdwFoldThresholdPolicy.ADW_FOLD_THRESHOLD_POLICY_NATURAL

/**
 * Determines when [class@Flap] and [class@Leaflet] will fold.
 * @since 1.0
 */
public enum class FoldThresholdPolicy(
    public val nativeValue: AdwFoldThresholdPolicy,
) {
    /**
     * Folding is based on the minimum size
     */
    MINIMUM(ADW_FOLD_THRESHOLD_POLICY_MINIMUM),

    /**
     * Folding is based on the natural size
     */
    NATURAL(ADW_FOLD_THRESHOLD_POLICY_NATURAL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AdwFoldThresholdPolicy): FoldThresholdPolicy =
            when (nativeValue) {
                ADW_FOLD_THRESHOLD_POLICY_MINIMUM -> MINIMUM
                ADW_FOLD_THRESHOLD_POLICY_NATURAL -> NATURAL
                else -> error("invalid nativeValue")
            }
    }
}

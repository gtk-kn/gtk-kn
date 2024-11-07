// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import org.gtkkn.native.adw.AdwCenteringPolicy

/**
 * Describes title centering behavior of a [class@HeaderBar] widget.
 */
public enum class CenteringPolicy(
    public val nativeValue: AdwCenteringPolicy,
) {
    /**
     * Keep the title centered when possible
     */
    LOOSE(AdwCenteringPolicy.ADW_CENTERING_POLICY_LOOSE),

    /**
     * Keep the title centered at all cost
     */
    STRICT(AdwCenteringPolicy.ADW_CENTERING_POLICY_STRICT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AdwCenteringPolicy): CenteringPolicy =
            when (nativeValue) {
                AdwCenteringPolicy.ADW_CENTERING_POLICY_LOOSE -> LOOSE
                AdwCenteringPolicy.ADW_CENTERING_POLICY_STRICT -> STRICT
                else -> error("invalid nativeValue")
            }
    }
}

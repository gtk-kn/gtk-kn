// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import org.gtkkn.native.adw.AdwCenteringPolicy
import org.gtkkn.native.adw.AdwCenteringPolicy.ADW_CENTERING_POLICY_LOOSE
import org.gtkkn.native.adw.AdwCenteringPolicy.ADW_CENTERING_POLICY_STRICT

/**
 * Describes title centering behavior of a [class@HeaderBar] widget.
 */
public enum class CenteringPolicy(
    public val nativeValue: AdwCenteringPolicy,
) {
    /**
     * Keep the title centered when possible
     */
    LOOSE(ADW_CENTERING_POLICY_LOOSE),

    /**
     * Keep the title centered at all cost
     */
    STRICT(ADW_CENTERING_POLICY_STRICT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AdwCenteringPolicy): CenteringPolicy =
            when (nativeValue) {
                ADW_CENTERING_POLICY_LOOSE -> LOOSE
                ADW_CENTERING_POLICY_STRICT -> STRICT
                else -> error("invalid nativeValue")
            }
    }
}

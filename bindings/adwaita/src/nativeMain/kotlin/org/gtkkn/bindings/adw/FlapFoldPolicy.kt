// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import org.gtkkn.native.adw.AdwFlapFoldPolicy
import org.gtkkn.native.adw.AdwFlapFoldPolicy.ADW_FLAP_FOLD_POLICY_ALWAYS
import org.gtkkn.native.adw.AdwFlapFoldPolicy.ADW_FLAP_FOLD_POLICY_AUTO
import org.gtkkn.native.adw.AdwFlapFoldPolicy.ADW_FLAP_FOLD_POLICY_NEVER

/**
 * Describes the possible folding behavior of a [class@Flap] widget.
 */
public enum class FlapFoldPolicy(
    public val nativeValue: AdwFlapFoldPolicy,
) {
    /**
     * Disable folding, the flap cannot reach narrow
     *   sizes.
     */
    NEVER(ADW_FLAP_FOLD_POLICY_NEVER),

    /**
     * Keep the flap always folded.
     */
    ALWAYS(ADW_FLAP_FOLD_POLICY_ALWAYS),

    /**
     * Fold and unfold the flap based on available
     *   space.
     */
    AUTO(ADW_FLAP_FOLD_POLICY_AUTO),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AdwFlapFoldPolicy): FlapFoldPolicy =
            when (nativeValue) {
                ADW_FLAP_FOLD_POLICY_NEVER -> NEVER
                ADW_FLAP_FOLD_POLICY_ALWAYS -> ALWAYS
                ADW_FLAP_FOLD_POLICY_AUTO -> AUTO
                else -> error("invalid nativeValue")
            }
    }
}

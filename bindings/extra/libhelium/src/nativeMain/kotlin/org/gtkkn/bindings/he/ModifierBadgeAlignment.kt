// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import org.gtkkn.native.he.HeModifierBadgeAlignment
import org.gtkkn.native.he.HeModifierBadgeAlignment.HE_MODIFIER_BADGE_ALIGNMENT_CENTER
import org.gtkkn.native.he.HeModifierBadgeAlignment.HE_MODIFIER_BADGE_ALIGNMENT_LEFT
import org.gtkkn.native.he.HeModifierBadgeAlignment.HE_MODIFIER_BADGE_ALIGNMENT_RIGHT

public enum class ModifierBadgeAlignment(
    public val nativeValue: HeModifierBadgeAlignment,
) {
    LEFT(HE_MODIFIER_BADGE_ALIGNMENT_LEFT),
    CENTER(HE_MODIFIER_BADGE_ALIGNMENT_CENTER),
    RIGHT(HE_MODIFIER_BADGE_ALIGNMENT_RIGHT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: HeModifierBadgeAlignment): ModifierBadgeAlignment =
            when (nativeValue) {
                HE_MODIFIER_BADGE_ALIGNMENT_LEFT -> LEFT
                HE_MODIFIER_BADGE_ALIGNMENT_CENTER -> CENTER
                HE_MODIFIER_BADGE_ALIGNMENT_RIGHT -> RIGHT
                else -> error("invalid nativeValue")
            }
    }
}

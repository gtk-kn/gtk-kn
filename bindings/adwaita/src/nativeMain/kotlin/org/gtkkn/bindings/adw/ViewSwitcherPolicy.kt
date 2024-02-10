// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import org.gtkkn.native.adw.AdwViewSwitcherPolicy
import org.gtkkn.native.adw.AdwViewSwitcherPolicy.ADW_VIEW_SWITCHER_POLICY_NARROW
import org.gtkkn.native.adw.AdwViewSwitcherPolicy.ADW_VIEW_SWITCHER_POLICY_WIDE

/**
 * Describes the adaptive modes of [class@ViewSwitcher].
 */
public enum class ViewSwitcherPolicy(
    public val nativeValue: AdwViewSwitcherPolicy,
) {
    /**
     * Force the narrow mode
     */
    NARROW(ADW_VIEW_SWITCHER_POLICY_NARROW),

    /**
     * Force the wide mode
     */
    WIDE(ADW_VIEW_SWITCHER_POLICY_WIDE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AdwViewSwitcherPolicy): ViewSwitcherPolicy =
            when (nativeValue) {
                ADW_VIEW_SWITCHER_POLICY_NARROW -> NARROW
                ADW_VIEW_SWITCHER_POLICY_WIDE -> WIDE
                else -> error("invalid nativeValue")
            }
    }
}

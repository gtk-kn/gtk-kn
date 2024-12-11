// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import org.gtkkn.native.adw.AdwViewSwitcherPolicy
import org.gtkkn.native.adw.adw_view_switcher_policy_get_type
import org.gtkkn.native.gobject.GType

/**
 * Describes the adaptive modes of [class@ViewSwitcher].
 */
public enum class ViewSwitcherPolicy(public val nativeValue: AdwViewSwitcherPolicy) {
    /**
     * Force the narrow mode
     */
    NARROW(AdwViewSwitcherPolicy.ADW_VIEW_SWITCHER_POLICY_NARROW),

    /**
     * Force the wide mode
     */
    WIDE(AdwViewSwitcherPolicy.ADW_VIEW_SWITCHER_POLICY_WIDE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AdwViewSwitcherPolicy): ViewSwitcherPolicy = when (nativeValue) {
            AdwViewSwitcherPolicy.ADW_VIEW_SWITCHER_POLICY_NARROW -> NARROW
            AdwViewSwitcherPolicy.ADW_VIEW_SWITCHER_POLICY_WIDE -> WIDE
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of ViewSwitcherPolicy
         *
         * @return the GType
         */
        public fun getType(): GType = adw_view_switcher_policy_get_type()
    }
}

// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import org.gtkkn.native.he.HeTabSwitcherTabBarBehavior
import org.gtkkn.native.he.HeTabSwitcherTabBarBehavior.HE_TAB_SWITCHER_TAB_BAR_BEHAVIOR_ALWAYS
import org.gtkkn.native.he.HeTabSwitcherTabBarBehavior.HE_TAB_SWITCHER_TAB_BAR_BEHAVIOR_NEVER
import org.gtkkn.native.he.HeTabSwitcherTabBarBehavior.HE_TAB_SWITCHER_TAB_BAR_BEHAVIOR_SINGLE

public enum class TabSwitcherTabBarBehavior(
    public val nativeValue: HeTabSwitcherTabBarBehavior,
) {
    ALWAYS(HE_TAB_SWITCHER_TAB_BAR_BEHAVIOR_ALWAYS),
    SINGLE(HE_TAB_SWITCHER_TAB_BAR_BEHAVIOR_SINGLE),
    NEVER(HE_TAB_SWITCHER_TAB_BAR_BEHAVIOR_NEVER),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: HeTabSwitcherTabBarBehavior): TabSwitcherTabBarBehavior =
            when (nativeValue) {
                HE_TAB_SWITCHER_TAB_BAR_BEHAVIOR_ALWAYS -> ALWAYS
                HE_TAB_SWITCHER_TAB_BAR_BEHAVIOR_SINGLE -> SINGLE
                HE_TAB_SWITCHER_TAB_BAR_BEHAVIOR_NEVER -> NEVER
                else -> error("invalid nativeValue")
            }
    }
}

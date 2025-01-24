// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import org.gtkkn.native.adw.AdwCenteringPolicy
import org.gtkkn.native.adw.adw_centering_policy_get_type
import org.gtkkn.native.gobject.GType

/**
 * Describes title centering behavior of a [class@HeaderBar] widget.
 */
public enum class CenteringPolicy(public val nativeValue: AdwCenteringPolicy) {
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
        public fun fromNativeValue(nativeValue: AdwCenteringPolicy): CenteringPolicy = when (nativeValue) {
            AdwCenteringPolicy.ADW_CENTERING_POLICY_LOOSE -> LOOSE
            AdwCenteringPolicy.ADW_CENTERING_POLICY_STRICT -> STRICT
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of CenteringPolicy
         *
         * @return the GType
         */
        public fun getType(): GType = adw_centering_policy_get_type()
    }
}

// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import org.gtkkn.native.adw.AdwFoldThresholdPolicy
import org.gtkkn.native.adw.adw_fold_threshold_policy_get_type
import org.gtkkn.native.gobject.GType

/**
 * # ⚠️ Deprecated ⚠️
 *
 * This is deprecated since version 1.4.
 *
 * Stop using `AdwLeaflet` and `AdwFlap`
 * ---
 *
 * Determines when [class@Flap] and [class@Leaflet] will fold.
 */
public enum class FoldThresholdPolicy(public val nativeValue: AdwFoldThresholdPolicy) {
    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.4.
     *
     * Stop using `AdwLeaflet` and `AdwFlap`
     * ---
     *
     * Folding is based on the minimum size
     */
    MINIMUM(AdwFoldThresholdPolicy.ADW_FOLD_THRESHOLD_POLICY_MINIMUM),

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.4.
     *
     * Stop using `AdwLeaflet` and `AdwFlap`
     * ---
     *
     * Folding is based on the natural size
     */
    NATURAL(AdwFoldThresholdPolicy.ADW_FOLD_THRESHOLD_POLICY_NATURAL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AdwFoldThresholdPolicy): FoldThresholdPolicy = when (nativeValue) {
            AdwFoldThresholdPolicy.ADW_FOLD_THRESHOLD_POLICY_MINIMUM -> MINIMUM
            AdwFoldThresholdPolicy.ADW_FOLD_THRESHOLD_POLICY_NATURAL -> NATURAL
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of FoldThresholdPolicy
         *
         * @return the GType
         */
        public fun getType(): GType = adw_fold_threshold_policy_get_type()
    }
}

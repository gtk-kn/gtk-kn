// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import org.gtkkn.native.adw.AdwFlapFoldPolicy
import org.gtkkn.native.adw.adw_flap_fold_policy_get_type
import org.gtkkn.native.gobject.GType

/**
 * # ⚠️ Deprecated ⚠️
 *
 * This is deprecated since version 1.4.
 *
 * See [the migration guide](migrating-to-breakpoints.html#replace-adwflap)
 * ---
 *
 * Describes the possible folding behavior of a [class@Flap] widget.
 */
public enum class FlapFoldPolicy(public val nativeValue: AdwFlapFoldPolicy) {
    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.4.
     *
     * See [the migration guide](migrating-to-breakpoints.html#replace-adwflap)
     * ---
     *
     * Disable folding, the flap cannot reach narrow
     *   sizes.
     */
    NEVER(AdwFlapFoldPolicy.ADW_FLAP_FOLD_POLICY_NEVER),

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.4.
     *
     * See [the migration guide](migrating-to-breakpoints.html#replace-adwflap)
     * ---
     *
     * Keep the flap always folded.
     */
    ALWAYS(AdwFlapFoldPolicy.ADW_FLAP_FOLD_POLICY_ALWAYS),

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 1.4.
     *
     * See [the migration guide](migrating-to-breakpoints.html#replace-adwflap)
     * ---
     *
     * Fold and unfold the flap based on available
     *   space.
     */
    AUTO(AdwFlapFoldPolicy.ADW_FLAP_FOLD_POLICY_AUTO),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AdwFlapFoldPolicy): FlapFoldPolicy = when (nativeValue) {
            AdwFlapFoldPolicy.ADW_FLAP_FOLD_POLICY_NEVER -> NEVER
            AdwFlapFoldPolicy.ADW_FLAP_FOLD_POLICY_ALWAYS -> ALWAYS
            AdwFlapFoldPolicy.ADW_FLAP_FOLD_POLICY_AUTO -> AUTO
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of FlapFoldPolicy
         *
         * @return the GType
         */
        public fun getType(): GType = adw_flap_fold_policy_get_type()
    }
}

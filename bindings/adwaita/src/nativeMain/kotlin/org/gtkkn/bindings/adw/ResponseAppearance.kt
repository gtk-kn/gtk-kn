// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import org.gtkkn.bindings.adw.annotations.AdwVersion1_2
import org.gtkkn.native.adw.AdwResponseAppearance
import org.gtkkn.native.adw.adw_response_appearance_get_type
import org.gtkkn.native.gobject.GType

/**
 * Describes the possible styles of [class@AlertDialog] response buttons.
 *
 * See [method@AlertDialog.set_response_appearance].
 * @since 1.2
 */
@AdwVersion1_2
public enum class ResponseAppearance(public val nativeValue: AdwResponseAppearance) {
    /**
     * the default appearance.
     */
    DEFAULT(AdwResponseAppearance.ADW_RESPONSE_DEFAULT),

    /**
     * used to denote important responses such as the
     *     affirmative action.
     */
    SUGGESTED(AdwResponseAppearance.ADW_RESPONSE_SUGGESTED),

    /**
     * used to draw attention to the potentially damaging
     *     consequences of using the response. This appearance acts as a warning to
     *     the user.
     */
    DESTRUCTIVE(AdwResponseAppearance.ADW_RESPONSE_DESTRUCTIVE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AdwResponseAppearance): ResponseAppearance = when (nativeValue) {
            AdwResponseAppearance.ADW_RESPONSE_DEFAULT -> DEFAULT
            AdwResponseAppearance.ADW_RESPONSE_SUGGESTED -> SUGGESTED
            AdwResponseAppearance.ADW_RESPONSE_DESTRUCTIVE -> DESTRUCTIVE
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of ResponseAppearance
         *
         * @return the GType
         */
        public fun getType(): GType = adw_response_appearance_get_type()
    }
}

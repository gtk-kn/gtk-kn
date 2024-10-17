// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import org.gtkkn.native.adw.AdwResponseAppearance
import org.gtkkn.native.adw.AdwResponseAppearance.ADW_RESPONSE_DEFAULT
import org.gtkkn.native.adw.AdwResponseAppearance.ADW_RESPONSE_DESTRUCTIVE
import org.gtkkn.native.adw.AdwResponseAppearance.ADW_RESPONSE_SUGGESTED

/**
 * Describes the possible styles of [class@AlertDialog] response buttons.
 *
 * See [method@AlertDialog.set_response_appearance].
 * @since 1.2
 */
public enum class ResponseAppearance(
    public val nativeValue: AdwResponseAppearance,
) {
    /**
     * the default appearance.
     */
    DEFAULT(ADW_RESPONSE_DEFAULT),

    /**
     * used to denote important responses such as the
     *     affirmative action.
     */
    SUGGESTED(ADW_RESPONSE_SUGGESTED),

    /**
     * used to draw attention to the potentially damaging
     *     consequences of using the response. This appearance acts as a warning to
     *     the user.
     */
    DESTRUCTIVE(ADW_RESPONSE_DESTRUCTIVE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AdwResponseAppearance): ResponseAppearance =
            when (nativeValue) {
                ADW_RESPONSE_DEFAULT -> DEFAULT
                ADW_RESPONSE_SUGGESTED -> SUGGESTED
                ADW_RESPONSE_DESTRUCTIVE -> DESTRUCTIVE
                else -> error("invalid nativeValue")
            }
    }
}

// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import org.gtkkn.bindings.adw.annotations.AdwVersion1_5
import org.gtkkn.native.adw.AdwDialogPresentationMode

/**
 * Describes the available presentation modes for [class@Dialog].
 *
 * New values may be added to this enumeration over time.
 *
 * See [property@Dialog:presentation-mode].
 * @since 1.5
 */
@AdwVersion1_5
public enum class DialogPresentationMode(
    public val nativeValue: AdwDialogPresentationMode,
) {
    /**
     * Switch between `ADW_DIALOG_FLOATING` and
     *   `ADW_DIALOG_BOTTOM_SHEET` depending on available size.
     */
    AUTO(AdwDialogPresentationMode.ADW_DIALOG_AUTO),

    /**
     * Present dialog as a centered floating window.
     */
    FLOATING(AdwDialogPresentationMode.ADW_DIALOG_FLOATING),

    /**
     * Present dialog as a bottom sheet.
     */
    BOTTOM_SHEET(AdwDialogPresentationMode.ADW_DIALOG_BOTTOM_SHEET),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AdwDialogPresentationMode): DialogPresentationMode =
            when (nativeValue) {
                AdwDialogPresentationMode.ADW_DIALOG_AUTO -> AUTO
                AdwDialogPresentationMode.ADW_DIALOG_FLOATING -> FLOATING
                AdwDialogPresentationMode.ADW_DIALOG_BOTTOM_SHEET -> BOTTOM_SHEET
                else -> error("invalid nativeValue")
            }
    }
}

// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import org.gtkkn.bindings.adw.annotations.AdwVersion1_5
import org.gtkkn.native.adw.AdwDialogPresentationMode
import org.gtkkn.native.adw.AdwDialogPresentationMode.ADW_DIALOG_AUTO
import org.gtkkn.native.adw.AdwDialogPresentationMode.ADW_DIALOG_BOTTOM_SHEET
import org.gtkkn.native.adw.AdwDialogPresentationMode.ADW_DIALOG_FLOATING

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
    AUTO(ADW_DIALOG_AUTO),

    /**
     * Present dialog as a centered floating window.
     */
    FLOATING(ADW_DIALOG_FLOATING),

    /**
     * Present dialog as a bottom sheet.
     */
    BOTTOM_SHEET(ADW_DIALOG_BOTTOM_SHEET),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AdwDialogPresentationMode): DialogPresentationMode =
            when (nativeValue) {
                ADW_DIALOG_AUTO -> AUTO
                ADW_DIALOG_FLOATING -> FLOATING
                ADW_DIALOG_BOTTOM_SHEET -> BOTTOM_SHEET
                else -> error("invalid nativeValue")
            }
    }
}

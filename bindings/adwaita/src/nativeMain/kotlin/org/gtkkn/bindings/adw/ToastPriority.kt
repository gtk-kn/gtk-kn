// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import org.gtkkn.native.adw.AdwToastPriority

/**
 * [class@Toast] behavior when another toast is already displayed.
 */
public enum class ToastPriority(
    public val nativeValue: AdwToastPriority,
) {
    /**
     * the toast will be queued if another toast is
     *   already displayed.
     */
    NORMAL(AdwToastPriority.ADW_TOAST_PRIORITY_NORMAL),

    /**
     * the toast will be displayed immediately, pushing
     *   the previous toast into the queue instead.
     */
    HIGH(AdwToastPriority.ADW_TOAST_PRIORITY_HIGH),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AdwToastPriority): ToastPriority =
            when (nativeValue) {
                AdwToastPriority.ADW_TOAST_PRIORITY_NORMAL -> NORMAL
                AdwToastPriority.ADW_TOAST_PRIORITY_HIGH -> HIGH
                else -> error("invalid nativeValue")
            }
    }
}

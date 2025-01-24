// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import org.gtkkn.native.adw.AdwToastPriority
import org.gtkkn.native.adw.adw_toast_priority_get_type
import org.gtkkn.native.gobject.GType

/**
 * [class@Toast] behavior when another toast is already displayed.
 */
public enum class ToastPriority(public val nativeValue: AdwToastPriority) {
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
        public fun fromNativeValue(nativeValue: AdwToastPriority): ToastPriority = when (nativeValue) {
            AdwToastPriority.ADW_TOAST_PRIORITY_NORMAL -> NORMAL
            AdwToastPriority.ADW_TOAST_PRIORITY_HIGH -> HIGH
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of ToastPriority
         *
         * @return the GType
         */
        public fun getType(): GType = adw_toast_priority_get_type()
    }
}

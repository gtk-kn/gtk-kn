// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_30
import org.gtkkn.native.gio.GTlsInteractionResult
import org.gtkkn.native.gio.g_tls_interaction_result_get_type
import org.gtkkn.native.gobject.GType

/**
 * #GTlsInteractionResult is returned by various functions in #GTlsInteraction
 * when finishing an interaction request.
 * @since 2.30
 */
@GioVersion2_30
public enum class TlsInteractionResult(public val nativeValue: GTlsInteractionResult) {
    /**
     * The interaction was unhandled (i.e. not
     *     implemented).
     */
    UNHANDLED(GTlsInteractionResult.G_TLS_INTERACTION_UNHANDLED),

    /**
     * The interaction completed, and resulting data
     *     is available.
     */
    HANDLED(GTlsInteractionResult.G_TLS_INTERACTION_HANDLED),

    /**
     * The interaction has failed, or was cancelled.
     *     and the operation should be aborted.
     */
    FAILED(GTlsInteractionResult.G_TLS_INTERACTION_FAILED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GTlsInteractionResult): TlsInteractionResult = when (nativeValue) {
            GTlsInteractionResult.G_TLS_INTERACTION_UNHANDLED -> UNHANDLED
            GTlsInteractionResult.G_TLS_INTERACTION_HANDLED -> HANDLED
            GTlsInteractionResult.G_TLS_INTERACTION_FAILED -> FAILED
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of TlsInteractionResult
         *
         * @return the GType
         */
        public fun getType(): GType = g_tls_interaction_result_get_type()
    }
}

// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_30
import org.gtkkn.native.gio.GTlsInteractionResult
import org.gtkkn.native.gio.GTlsInteractionResult.G_TLS_INTERACTION_FAILED
import org.gtkkn.native.gio.GTlsInteractionResult.G_TLS_INTERACTION_HANDLED
import org.gtkkn.native.gio.GTlsInteractionResult.G_TLS_INTERACTION_UNHANDLED

/**
 * #GTlsInteractionResult is returned by various functions in #GTlsInteraction
 * when finishing an interaction request.
 * @since 2.30
 */
@GioVersion2_30
public enum class TlsInteractionResult(
    public val nativeValue: GTlsInteractionResult,
) {
    /**
     * The interaction was unhandled (i.e. not
     *     implemented).
     */
    UNHANDLED(G_TLS_INTERACTION_UNHANDLED),

    /**
     * The interaction completed, and resulting data
     *     is available.
     */
    HANDLED(G_TLS_INTERACTION_HANDLED),

    /**
     * The interaction has failed, or was cancelled.
     *     and the operation should be aborted.
     */
    FAILED(G_TLS_INTERACTION_FAILED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GTlsInteractionResult): TlsInteractionResult =
            when (nativeValue) {
                G_TLS_INTERACTION_UNHANDLED -> UNHANDLED
                G_TLS_INTERACTION_HANDLED -> HANDLED
                G_TLS_INTERACTION_FAILED -> FAILED
                else -> error("invalid nativeValue")
            }
    }
}

// This is a generated file. Do not modify.
package org.gtkkn.bindings.xdp

import org.gtkkn.bindings.glib.Error
import org.gtkkn.extensions.glib.GlibException
import kotlin.Int

/**
 * ## Skipped during bindings generation
 *
 * - record `PortalClass`: glib type struct are ignored
 * - record `SessionClass`: glib type struct are ignored
 */
public object Xdp {
    public const val WALLPAPER_TARGET_BOTH: Int = 0

    public fun resolveException(error: Error): GlibException {
        val ex =
            when (error.domain) {
                else -> null
            }
        return ex ?: GlibException(error)
    }
}

// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.native.gio.GPasswordSave
import org.gtkkn.native.gio.GPasswordSave.G_PASSWORD_SAVE_FOR_SESSION
import org.gtkkn.native.gio.GPasswordSave.G_PASSWORD_SAVE_NEVER
import org.gtkkn.native.gio.GPasswordSave.G_PASSWORD_SAVE_PERMANENTLY

/**
 * #GPasswordSave is used to indicate the lifespan of a saved password.
 *
 * #Gvfs stores passwords in the Gnome keyring when this flag allows it
 * to, and later retrieves it again from there.
 */
public enum class PasswordSave(
    public val nativeValue: GPasswordSave,
) {
    /**
     * never save a password.
     */
    NEVER(G_PASSWORD_SAVE_NEVER),

    /**
     * save a password for the session.
     */
    FOR_SESSION(G_PASSWORD_SAVE_FOR_SESSION),

    /**
     * save a password permanently.
     */
    PERMANENTLY(G_PASSWORD_SAVE_PERMANENTLY),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GPasswordSave): PasswordSave =
            when (nativeValue) {
                G_PASSWORD_SAVE_NEVER -> NEVER
                G_PASSWORD_SAVE_FOR_SESSION -> FOR_SESSION
                G_PASSWORD_SAVE_PERMANENTLY -> PERMANENTLY
                else -> error("invalid nativeValue")
            }
    }
}

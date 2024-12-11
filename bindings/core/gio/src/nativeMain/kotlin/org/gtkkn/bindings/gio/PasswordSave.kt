// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.native.gio.GPasswordSave
import org.gtkkn.native.gio.g_password_save_get_type
import org.gtkkn.native.gobject.GType

/**
 * #GPasswordSave is used to indicate the lifespan of a saved password.
 *
 * #Gvfs stores passwords in the Gnome keyring when this flag allows it
 * to, and later retrieves it again from there.
 */
public enum class PasswordSave(public val nativeValue: GPasswordSave) {
    /**
     * never save a password.
     */
    NEVER(GPasswordSave.G_PASSWORD_SAVE_NEVER),

    /**
     * save a password for the session.
     */
    FOR_SESSION(GPasswordSave.G_PASSWORD_SAVE_FOR_SESSION),

    /**
     * save a password permanently.
     */
    PERMANENTLY(GPasswordSave.G_PASSWORD_SAVE_PERMANENTLY),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GPasswordSave): PasswordSave = when (nativeValue) {
            GPasswordSave.G_PASSWORD_SAVE_NEVER -> NEVER
            GPasswordSave.G_PASSWORD_SAVE_FOR_SESSION -> FOR_SESSION
            GPasswordSave.G_PASSWORD_SAVE_PERMANENTLY -> PERMANENTLY
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of PasswordSave
         *
         * @return the GType
         */
        public fun getType(): GType = g_password_save_get_type()
    }
}

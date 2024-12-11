// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GAskPasswordFlags
import org.gtkkn.native.gio.G_ASK_PASSWORD_ANONYMOUS_SUPPORTED
import org.gtkkn.native.gio.G_ASK_PASSWORD_NEED_DOMAIN
import org.gtkkn.native.gio.G_ASK_PASSWORD_NEED_PASSWORD
import org.gtkkn.native.gio.G_ASK_PASSWORD_NEED_USERNAME
import org.gtkkn.native.gio.G_ASK_PASSWORD_SAVING_SUPPORTED
import org.gtkkn.native.gio.G_ASK_PASSWORD_TCRYPT
import org.gtkkn.native.gio.g_ask_password_flags_get_type
import org.gtkkn.native.gobject.GType

/**
 * #GAskPasswordFlags are used to request specific information from the
 * user, or to notify the user of their choices in an authentication
 * situation.
 */
public class AskPasswordFlags(public val mask: GAskPasswordFlags) : Bitfield<AskPasswordFlags> {
    override infix fun or(other: AskPasswordFlags): AskPasswordFlags = AskPasswordFlags(mask or other.mask)

    public companion object {
        /**
         * operation requires a password.
         */
        public val NEED_PASSWORD: AskPasswordFlags = AskPasswordFlags(G_ASK_PASSWORD_NEED_PASSWORD)

        /**
         * operation requires a username.
         */
        public val NEED_USERNAME: AskPasswordFlags = AskPasswordFlags(G_ASK_PASSWORD_NEED_USERNAME)

        /**
         * operation requires a domain.
         */
        public val NEED_DOMAIN: AskPasswordFlags = AskPasswordFlags(G_ASK_PASSWORD_NEED_DOMAIN)

        /**
         * operation supports saving settings.
         */
        public val SAVING_SUPPORTED: AskPasswordFlags =
            AskPasswordFlags(G_ASK_PASSWORD_SAVING_SUPPORTED)

        /**
         * operation supports anonymous users.
         */
        public val ANONYMOUS_SUPPORTED: AskPasswordFlags =
            AskPasswordFlags(G_ASK_PASSWORD_ANONYMOUS_SUPPORTED)

        /**
         * operation takes TCRYPT parameters (Since: 2.58)
         */
        public val TCRYPT: AskPasswordFlags = AskPasswordFlags(G_ASK_PASSWORD_TCRYPT)

        /**
         * Get the GType of AskPasswordFlags
         *
         * @return the GType
         */
        public fun getType(): GType = g_ask_password_flags_get_type()
    }
}

// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_30
import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GTlsDatabaseVerifyFlags
import org.gtkkn.native.gio.G_TLS_DATABASE_VERIFY_NONE
import org.gtkkn.native.gio.g_tls_database_verify_flags_get_type
import org.gtkkn.native.gobject.GType

/**
 * Flags for g_tls_database_verify_chain().
 * @since 2.30
 */
public class TlsDatabaseVerifyFlags(public val mask: GTlsDatabaseVerifyFlags) : Bitfield<TlsDatabaseVerifyFlags> {
    override infix fun or(other: TlsDatabaseVerifyFlags): TlsDatabaseVerifyFlags = TlsDatabaseVerifyFlags(
        mask or other.mask
    )

    @GioVersion2_30
    public companion object {
        /**
         * No verification flags
         */
        public val NONE: TlsDatabaseVerifyFlags = TlsDatabaseVerifyFlags(G_TLS_DATABASE_VERIFY_NONE)

        /**
         * Get the GType of TlsDatabaseVerifyFlags
         *
         * @return the GType
         */
        public fun getType(): GType = g_tls_database_verify_flags_get_type()
    }
}

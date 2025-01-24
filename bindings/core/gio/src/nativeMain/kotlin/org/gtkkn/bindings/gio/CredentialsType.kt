// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.native.gio.GCredentialsType
import org.gtkkn.native.gio.g_credentials_type_get_type
import org.gtkkn.native.gobject.GType

/**
 * Enumeration describing different kinds of native credential types.
 * @since 2.26
 */
@GioVersion2_26
public enum class CredentialsType(public val nativeValue: GCredentialsType) {
    /**
     * Indicates an invalid native credential type.
     */
    INVALID(GCredentialsType.G_CREDENTIALS_TYPE_INVALID),

    /**
     * The native credentials type is a `struct ucred`.
     */
    LINUX_UCRED(GCredentialsType.G_CREDENTIALS_TYPE_LINUX_UCRED),

    /**
     * The native credentials type is a `struct cmsgcred`.
     */
    FREEBSD_CMSGCRED(GCredentialsType.G_CREDENTIALS_TYPE_FREEBSD_CMSGCRED),

    /**
     * The native credentials type is a `struct sockpeercred`. Added in 2.30.
     */
    OPENBSD_SOCKPEERCRED(GCredentialsType.G_CREDENTIALS_TYPE_OPENBSD_SOCKPEERCRED),

    /**
     * The native credentials type is a `ucred_t`. Added in 2.40.
     */
    SOLARIS_UCRED(GCredentialsType.G_CREDENTIALS_TYPE_SOLARIS_UCRED),

    /**
     * The native credentials type is a `struct unpcbid`. Added in 2.42.
     */
    NETBSD_UNPCBID(GCredentialsType.G_CREDENTIALS_TYPE_NETBSD_UNPCBID),

    /**
     * The native credentials type is a `struct xucred`. Added in 2.66.
     */
    APPLE_XUCRED(GCredentialsType.G_CREDENTIALS_TYPE_APPLE_XUCRED),

    /**
     * The native credentials type is a PID `DWORD`. Added in 2.72.
     */
    WIN32_PID(GCredentialsType.G_CREDENTIALS_TYPE_WIN32_PID),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GCredentialsType): CredentialsType = when (nativeValue) {
            GCredentialsType.G_CREDENTIALS_TYPE_INVALID -> INVALID
            GCredentialsType.G_CREDENTIALS_TYPE_LINUX_UCRED -> LINUX_UCRED
            GCredentialsType.G_CREDENTIALS_TYPE_FREEBSD_CMSGCRED -> FREEBSD_CMSGCRED
            GCredentialsType.G_CREDENTIALS_TYPE_OPENBSD_SOCKPEERCRED -> OPENBSD_SOCKPEERCRED
            GCredentialsType.G_CREDENTIALS_TYPE_SOLARIS_UCRED -> SOLARIS_UCRED
            GCredentialsType.G_CREDENTIALS_TYPE_NETBSD_UNPCBID -> NETBSD_UNPCBID
            GCredentialsType.G_CREDENTIALS_TYPE_APPLE_XUCRED -> APPLE_XUCRED
            GCredentialsType.G_CREDENTIALS_TYPE_WIN32_PID -> WIN32_PID
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of CredentialsType
         *
         * @return the GType
         */
        public fun getType(): GType = g_credentials_type_get_type()
    }
}

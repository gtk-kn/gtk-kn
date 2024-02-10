// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.native.gio.GCredentialsType
import org.gtkkn.native.gio.GCredentialsType.G_CREDENTIALS_TYPE_APPLE_XUCRED
import org.gtkkn.native.gio.GCredentialsType.G_CREDENTIALS_TYPE_FREEBSD_CMSGCRED
import org.gtkkn.native.gio.GCredentialsType.G_CREDENTIALS_TYPE_INVALID
import org.gtkkn.native.gio.GCredentialsType.G_CREDENTIALS_TYPE_LINUX_UCRED
import org.gtkkn.native.gio.GCredentialsType.G_CREDENTIALS_TYPE_NETBSD_UNPCBID
import org.gtkkn.native.gio.GCredentialsType.G_CREDENTIALS_TYPE_OPENBSD_SOCKPEERCRED
import org.gtkkn.native.gio.GCredentialsType.G_CREDENTIALS_TYPE_SOLARIS_UCRED
import org.gtkkn.native.gio.GCredentialsType.G_CREDENTIALS_TYPE_WIN32_PID

/**
 * Enumeration describing different kinds of native credential types.
 * @since 2.26
 */
public enum class CredentialsType(
    public val nativeValue: GCredentialsType,
) {
    /**
     * Indicates an invalid native credential type.
     */
    INVALID(G_CREDENTIALS_TYPE_INVALID),

    /**
     * The native credentials type is a `struct ucred`.
     */
    LINUX_UCRED(G_CREDENTIALS_TYPE_LINUX_UCRED),

    /**
     * The native credentials type is a `struct cmsgcred`.
     */
    FREEBSD_CMSGCRED(G_CREDENTIALS_TYPE_FREEBSD_CMSGCRED),

    /**
     * The native credentials type is a `struct sockpeercred`. Added in 2.30.
     */
    OPENBSD_SOCKPEERCRED(G_CREDENTIALS_TYPE_OPENBSD_SOCKPEERCRED),

    /**
     * The native credentials type is a `ucred_t`. Added in 2.40.
     */
    SOLARIS_UCRED(G_CREDENTIALS_TYPE_SOLARIS_UCRED),

    /**
     * The native credentials type is a `struct unpcbid`. Added in 2.42.
     */
    NETBSD_UNPCBID(G_CREDENTIALS_TYPE_NETBSD_UNPCBID),

    /**
     * The native credentials type is a `struct xucred`. Added in 2.66.
     */
    APPLE_XUCRED(G_CREDENTIALS_TYPE_APPLE_XUCRED),

    /**
     * The native credentials type is a PID `DWORD`. Added in 2.72.
     */
    WIN32_PID(G_CREDENTIALS_TYPE_WIN32_PID),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GCredentialsType): CredentialsType =
            when (nativeValue) {
                G_CREDENTIALS_TYPE_INVALID -> INVALID
                G_CREDENTIALS_TYPE_LINUX_UCRED -> LINUX_UCRED
                G_CREDENTIALS_TYPE_FREEBSD_CMSGCRED -> FREEBSD_CMSGCRED
                G_CREDENTIALS_TYPE_OPENBSD_SOCKPEERCRED -> OPENBSD_SOCKPEERCRED
                G_CREDENTIALS_TYPE_SOLARIS_UCRED -> SOLARIS_UCRED
                G_CREDENTIALS_TYPE_NETBSD_UNPCBID -> NETBSD_UNPCBID
                G_CREDENTIALS_TYPE_APPLE_XUCRED -> APPLE_XUCRED
                G_CREDENTIALS_TYPE_WIN32_PID -> WIN32_PID
                else -> error("invalid nativeValue")
            }
    }
}

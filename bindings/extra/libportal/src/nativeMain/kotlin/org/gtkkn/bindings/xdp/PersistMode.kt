// This is a generated file. Do not modify.
package org.gtkkn.bindings.xdp

import org.gtkkn.native.xdp.XdpPersistMode

/**
 * Options for how the screencast session should persist.
 */
public enum class PersistMode(
    public val nativeValue: XdpPersistMode,
) {
    /**
     * do not persist
     */
    NONE(XdpPersistMode.XDP_PERSIST_MODE_NONE),

    /**
     * persist as long as the application is alive
     */
    TRANSIENT(XdpPersistMode.XDP_PERSIST_MODE_TRANSIENT),

    /**
     * persist until the user revokes this permission
     */
    PERSISTENT(XdpPersistMode.XDP_PERSIST_MODE_PERSISTENT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: XdpPersistMode): PersistMode =
            when (nativeValue) {
                XdpPersistMode.XDP_PERSIST_MODE_NONE -> NONE
                XdpPersistMode.XDP_PERSIST_MODE_TRANSIENT -> TRANSIENT
                XdpPersistMode.XDP_PERSIST_MODE_PERSISTENT -> PERSISTENT
                else -> error("invalid nativeValue")
            }
    }
}

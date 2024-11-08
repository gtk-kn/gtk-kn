// This is a generated file. Do not modify.
package org.gtkkn.bindings.xdp

import org.gtkkn.native.xdp.XdpUpdateStatus

/**
 * The values of this enum are returned in the
 * [signal@Portal::update-progress] signal to indicate
 * the current progress of an installation.
 */
public enum class UpdateStatus(
    public val nativeValue: XdpUpdateStatus,
) {
    /**
     * Installation in progress
     */
    RUNNING(XdpUpdateStatus.XDP_UPDATE_STATUS_RUNNING),

    /**
     * Nothing to install
     */
    EMPTY(XdpUpdateStatus.XDP_UPDATE_STATUS_EMPTY),

    /**
     * Installation finished successfully
     */
    DONE(XdpUpdateStatus.XDP_UPDATE_STATUS_DONE),

    /**
     * Installation failed
     */
    FAILED(XdpUpdateStatus.XDP_UPDATE_STATUS_FAILED),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: XdpUpdateStatus): UpdateStatus =
            when (nativeValue) {
                XdpUpdateStatus.XDP_UPDATE_STATUS_RUNNING -> RUNNING
                XdpUpdateStatus.XDP_UPDATE_STATUS_EMPTY -> EMPTY
                XdpUpdateStatus.XDP_UPDATE_STATUS_DONE -> DONE
                XdpUpdateStatus.XDP_UPDATE_STATUS_FAILED -> FAILED
                else -> error("invalid nativeValue")
            }
    }
}

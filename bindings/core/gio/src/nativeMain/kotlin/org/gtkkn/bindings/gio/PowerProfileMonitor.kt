// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_70
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GInitable
import org.gtkkn.native.gio.GPowerProfileMonitor
import org.gtkkn.native.gio.g_power_profile_monitor_dup_default
import org.gtkkn.native.gio.g_power_profile_monitor_get_power_saver_enabled
import org.gtkkn.native.gio.g_power_profile_monitor_get_type
import org.gtkkn.native.gobject.GType
import kotlin.Boolean

/**
 * `GPowerProfileMonitor` makes it possible for applications as well as OS
 * components to monitor system power profiles and act upon them. It currently
 * only exports whether the system is in “Power Saver” mode (known as
 * “Low Power” mode on some systems).
 *
 * When in “Low Power” mode, it is recommended that applications:
 * - disable automatic downloads;
 * - reduce the rate of refresh from online sources such as calendar or
 *   email synchronisation;
 * - reduce the use of expensive visual effects.
 *
 * It is also likely that OS components providing services to applications will
 * lower their own background activity, for the sake of the system.
 *
 * There are a variety of tools that exist for power consumption analysis, but those
 * usually depend on the OS and hardware used. On Linux, one could use `upower` to
 * monitor the battery discharge rate, `powertop` to check on the background activity
 * or activity at all), `sysprof` to inspect CPU usage, and `intel_gpu_time` to
 * profile GPU usage.
 *
 * Don’t forget to disconnect the [signal@GObject.Object::notify] signal for
 * [property@Gio.PowerProfileMonitor:power-saver-enabled], and unref the
 * `GPowerProfileMonitor` itself when exiting.
 * @since 2.70
 */
@GioVersion2_70
public interface PowerProfileMonitor :
    Proxy,
    Initable,
    KGTyped {
    public val gioPowerProfileMonitorPointer: CPointer<GPowerProfileMonitor>

    override val gioInitablePointer: CPointer<GInitable>
        get() = gioPowerProfileMonitorPointer.reinterpret()

    /**
     * Whether “Power Saver” mode is enabled on the system.
     *
     * @since 2.70
     */
    @GioVersion2_70
    public val powerSaverEnabled: Boolean
        /**
         * Gets whether the system is in “Power Saver” mode.
         *
         * You are expected to listen to the
         * #GPowerProfileMonitor::notify::power-saver-enabled signal to know when the profile has
         * changed.
         *
         * @return Whether the system is in “Power Saver” mode.
         * @since 2.70
         */
        get() = g_power_profile_monitor_get_power_saver_enabled(gioPowerProfileMonitorPointer).asBoolean()

    /**
     * Gets whether the system is in “Power Saver” mode.
     *
     * You are expected to listen to the
     * #GPowerProfileMonitor::notify::power-saver-enabled signal to know when the profile has
     * changed.
     *
     * @return Whether the system is in “Power Saver” mode.
     * @since 2.70
     */
    @GioVersion2_70
    public fun getPowerSaverEnabled(): Boolean =
        g_power_profile_monitor_get_power_saver_enabled(gioPowerProfileMonitorPointer).asBoolean()

    /**
     * The PowerProfileMonitorImpl type represents a native instance of the PowerProfileMonitor interface.
     *
     * @constructor Creates a new instance of PowerProfileMonitor for the provided [CPointer].
     */
    public data class PowerProfileMonitorImpl(
        override val gioPowerProfileMonitorPointer: CPointer<GPowerProfileMonitor>,
    ) : Object(gioPowerProfileMonitorPointer.reinterpret()),
        PowerProfileMonitor

    public companion object : TypeCompanion<PowerProfileMonitor> {
        override val type: GeneratedInterfaceKGType<PowerProfileMonitor> =
            GeneratedInterfaceKGType(getTypeOrNull("g_power_profile_monitor_get_type")!!) {
                PowerProfileMonitorImpl(it.reinterpret())
            }

        init {
            GioTypeProvider.register()
        }

        /**
         * Gets a reference to the default #GPowerProfileMonitor for the system.
         *
         * @return a new reference to the default #GPowerProfileMonitor
         * @since 2.70
         */
        @GioVersion2_70
        public fun dupDefault(): PowerProfileMonitor = g_power_profile_monitor_dup_default()!!.run {
            PowerProfileMonitorImpl(reinterpret())
        }

        /**
         * Get the GType of PowerProfileMonitor
         *
         * @return the GType
         */
        public fun getType(): GType = g_power_profile_monitor_get_type()
    }
}

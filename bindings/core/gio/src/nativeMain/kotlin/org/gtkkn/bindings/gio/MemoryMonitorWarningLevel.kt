// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.native.gio.GMemoryMonitorWarningLevel
import org.gtkkn.native.gio.GMemoryMonitorWarningLevel.G_MEMORY_MONITOR_WARNING_LEVEL_CRITICAL
import org.gtkkn.native.gio.GMemoryMonitorWarningLevel.G_MEMORY_MONITOR_WARNING_LEVEL_LOW
import org.gtkkn.native.gio.GMemoryMonitorWarningLevel.G_MEMORY_MONITOR_WARNING_LEVEL_MEDIUM

/**
 * Memory availability warning levels.
 *
 * Note that because new values might be added, it is recommended that applications check
 * #GMemoryMonitorWarningLevel as ranges, for example:
 * |[<!-- language="C" -->
 * if (warning_level > G_MEMORY_MONITOR_WARNING_LEVEL_LOW)
 *   drop_caches ();
 * ]|
 * @since 2.64
 */
public enum class MemoryMonitorWarningLevel(
    public val nativeValue: GMemoryMonitorWarningLevel,
) {
    /**
     * Memory on the device is low, processes
     *   should free up unneeded resources (for example, in-memory caches) so they can
     *   be used elsewhere.
     */
    LOW(G_MEMORY_MONITOR_WARNING_LEVEL_LOW),

    /**
     * Same as @G_MEMORY_MONITOR_WARNING_LEVEL_LOW
     *   but the device has even less free memory, so processes should try harder to free
     *   up unneeded resources. If your process does not need to stay running, it is a
     *   good time for it to quit.
     */
    MEDIUM(G_MEMORY_MONITOR_WARNING_LEVEL_MEDIUM),

    /**
     * The system will soon start terminating
     *   processes to reclaim memory, including background processes.
     */
    CRITICAL(G_MEMORY_MONITOR_WARNING_LEVEL_CRITICAL),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GMemoryMonitorWarningLevel): MemoryMonitorWarningLevel =
            when (nativeValue) {
                G_MEMORY_MONITOR_WARNING_LEVEL_LOW -> LOW
                G_MEMORY_MONITOR_WARNING_LEVEL_MEDIUM -> MEDIUM
                G_MEMORY_MONITOR_WARNING_LEVEL_CRITICAL -> CRITICAL
                else -> error("invalid nativeValue")
            }
    }
}

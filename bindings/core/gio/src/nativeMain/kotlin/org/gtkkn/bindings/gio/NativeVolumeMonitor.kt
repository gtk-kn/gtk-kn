// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GNativeVolumeMonitor
import org.gtkkn.native.gio.g_native_volume_monitor_get_type
import org.gtkkn.native.gobject.GType

public abstract class NativeVolumeMonitor(public val gioNativeVolumeMonitorPointer: CPointer<GNativeVolumeMonitor>) :
    VolumeMonitor(gioNativeVolumeMonitorPointer.reinterpret()),
    KGTyped {
    /**
     * The NativeVolumeMonitorImpl type represents a native instance of the abstract NativeVolumeMonitor class.
     *
     * @constructor Creates a new instance of NativeVolumeMonitor for the provided [CPointer].
     */
    public class NativeVolumeMonitorImpl(pointer: CPointer<GNativeVolumeMonitor>) : NativeVolumeMonitor(pointer)

    public companion object : TypeCompanion<NativeVolumeMonitor> {
        override val type: GeneratedClassKGType<NativeVolumeMonitor> =
            GeneratedClassKGType(g_native_volume_monitor_get_type()) { NativeVolumeMonitorImpl(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of NativeVolumeMonitor
         *
         * @return the GType
         */
        public fun getType(): GType = g_native_volume_monitor_get_type()
    }
}

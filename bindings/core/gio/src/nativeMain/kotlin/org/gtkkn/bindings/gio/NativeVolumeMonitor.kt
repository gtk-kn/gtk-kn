// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GNativeVolumeMonitor
import org.gtkkn.native.gio.g_native_volume_monitor_get_type
import org.gtkkn.native.gobject.GType

public open class NativeVolumeMonitor(pointer: CPointer<GNativeVolumeMonitor>) :
    VolumeMonitor(pointer.reinterpret()),
    KGTyped {
    public val gioNativeVolumeMonitorPointer: CPointer<GNativeVolumeMonitor>
        get() = gPointer.reinterpret()

    public companion object : TypeCompanion<NativeVolumeMonitor> {
        override val type: GeneratedClassKGType<NativeVolumeMonitor> =
            GeneratedClassKGType(g_native_volume_monitor_get_type()) { NativeVolumeMonitor(it.reinterpret()) }

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

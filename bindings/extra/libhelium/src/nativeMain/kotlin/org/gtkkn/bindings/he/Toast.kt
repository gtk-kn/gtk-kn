// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.he.HeToast
import org.gtkkn.native.he.he_toast_get_default_action
import org.gtkkn.native.he.he_toast_get_label
import org.gtkkn.native.he.he_toast_get_type
import org.gtkkn.native.he.he_toast_new
import org.gtkkn.native.he.he_toast_send_notification
import org.gtkkn.native.he.he_toast_set_default_action
import org.gtkkn.native.he.he_toast_set_label
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `label`: Property has no getter nor setter
 * - method `default-action`: Property has no getter nor setter
 */
public open class Toast(
    pointer: CPointer<HeToast>,
) : Bin(pointer.reinterpret()), KGTyped {
    public val heToastPointer: CPointer<HeToast>
        get() = gPointer.reinterpret()

    /**
     *
     *
     * @param label
     */
    public constructor(label: String) : this(he_toast_new(label)!!.reinterpret())

    public open fun getLabel(): String =
        he_toast_get_label(heToastPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setLabel(`value`: String): Unit = he_toast_set_label(heToastPointer.reinterpret(), `value`)

    public open fun getDefaultAction(): String =
        he_toast_get_default_action(heToastPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setDefaultAction(`value`: String): Unit =
        he_toast_set_default_action(heToastPointer.reinterpret(), `value`)

    public open fun sendNotification(): Unit = he_toast_send_notification(heToastPointer.reinterpret())

    /**
     *
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectClosed(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "closed",
            connectClosedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     *
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectAction(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "action",
            connectActionFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<Toast> {
        override val type: GeneratedClassKGType<Toast> =
            GeneratedClassKGType(he_toast_get_type()) {
                Toast(it.reinterpret())
            }

        init {
            HeTypeProvider.register()
        }
    }
}

private val connectClosedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

private val connectActionFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

// This is a generated file. Do not modify.
package org.gtkkn.bindings.jsc

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.jsc.JSCWeakValue
import org.gtkkn.native.jsc.jsc_weak_value_get_type
import org.gtkkn.native.jsc.jsc_weak_value_get_value
import org.gtkkn.native.jsc.jsc_weak_value_new
import kotlin.ULong
import kotlin.Unit

/**
 * JSCWeakValue represents a weak reference to a value in a #JSCContext. It can be used
 * to keep a reference to a JavaScript value without protecting it from being garbage
 * collected and without referencing the #JSCContext either.
 *
 * ## Skipped during bindings generation
 *
 * - method `value`: Property has no getter nor setter
 */
public class WeakValue(public val jscWeakValuePointer: CPointer<JSCWeakValue>) :
    Object(jscWeakValuePointer.reinterpret()),
    KGTyped {
    /**
     * Create a new #JSCWeakValue for the JavaScript value referenced by @value.
     *
     * @param value a #JSCValue
     * @return a new #JSCWeakValue
     */
    public constructor(`value`: Value) : this(jsc_weak_value_new(`value`.jscValuePointer)!!.reinterpret())

    /**
     * Get a #JSCValue referencing the JavaScript value of @weak_value.
     *
     * @return a new #JSCValue or null if @weak_value was cleared.
     */
    public fun getValue(): Value = jsc_weak_value_get_value(jscWeakValuePointer)!!.run {
        Value(this)
    }

    /**
     * This signal is emitted when the JavaScript value is destroyed.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onCleared(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            jscWeakValuePointer,
            "cleared",
            onClearedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "cleared" signal. See [onCleared].
     */
    public fun emitCleared() {
        g_signal_emit_by_name(jscWeakValuePointer.reinterpret(), "cleared")
    }

    public companion object : TypeCompanion<WeakValue> {
        override val type: GeneratedClassKGType<WeakValue> =
            GeneratedClassKGType(jsc_weak_value_get_type()) { WeakValue(it.reinterpret()) }

        init {
            JavascriptcoreTypeProvider.register()
        }

        /**
         * Get the GType of WeakValue
         *
         * @return the GType
         */
        public fun getType(): GType = jsc_weak_value_get_type()
    }
}

private val onClearedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

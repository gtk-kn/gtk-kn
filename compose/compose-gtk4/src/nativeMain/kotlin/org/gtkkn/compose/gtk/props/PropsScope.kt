/*
 * Copyright (c) 2024 gtk-kn
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * gtk-kn is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with gtk-kn. If not, see https://www.gnu.org/licenses/.
 */

package org.gtkkn.compose.gtk.props

import androidx.compose.runtime.DisposableEffectResult
import androidx.compose.runtime.DisposableEffectScope
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.compose.gtk.internal.GtkComposeInternalApi
import org.gtkkn.compose.gtk.node.Builder
import org.gtkkn.compose.gtk.node.GtkNode
import kotlin.properties.PropertyDelegateProvider
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KMutableProperty1
import kotlin.reflect.KProperty


@DslMarker
public annotation class GtkComposePropsScope

/**
 * A composable lambda to define given [PropsScope]
 */
public typealias PropsBuilder<TWidget> = Builder<PropsScope<TWidget>>

/**
 * A scope to compile [TWidget] properties
 */
@GtkComposePropsScope
public class PropsScope<TWidget : Widget>(
    @PublishedApi
    @OptIn(GtkComposeInternalApi::class)
    internal val node: GtkNode<TWidget>
) {
    @OptIn(GtkComposeInternalApi::class)
    internal var refEffect: (DisposableEffectScope.(GtkNode<TWidget>) -> DisposableEffectResult)? = null

    @OptIn(GtkComposeInternalApi::class)
    public fun ref(effect: (DisposableEffectScope.(GtkNode<TWidget>) -> DisposableEffectResult)) {
        refEffect = effect
    }

    @PublishedApi
    internal val properties: MutableMap<String, Property<TWidget, Any?>> = mutableMapOf()


    @PublishedApi
    @OptIn(GtkComposeInternalApi::class)
    internal fun <TValue> setProperty(
        key: String,
        value: TValue,
        updater: GtkNode<TWidget>.(TValue) -> Unit
    ) {
        @Suppress("UNCHECKED_CAST")
        (properties as MutableMap<String, Property<*, *>>)[key] = Property(value, updater)
    }

    @PublishedApi
    internal val signals: MutableMap<String, Signal<TWidget, Any?>> = mutableMapOf()

    @PublishedApi
    @OptIn(GtkComposeInternalApi::class)
    internal fun <TValue> setSignal(
        key: String,
        handler: TValue,
        connector: GtkNode<TWidget>.(TValue) -> ULong
    ) {
        @Suppress("UNCHECKED_CAST")
        (signals as MutableMap<String, Signal<*, *>>)[key] = Signal(handler, connector)
    }

    @PublishedApi
    @OptIn(GtkComposeInternalApi::class)
    internal class Property<TWidget : Widget, TValue>(
        val value: TValue,
        val updater: GtkNode<TWidget>.(TValue) -> Unit
    )

    @PublishedApi
    @OptIn(GtkComposeInternalApi::class)
    internal class Signal<TWidget : Widget, TValue>(
        val handler: TValue,
        val connector: GtkNode<TWidget>.(TValue) -> ULong
    )
}

public class SyntheticProperty<TWidget : Widget, TValue>(
    public val get: TWidget.() -> TValue,
    public val set: TWidget.(TValue) -> Unit,
) : PropertyDelegateProvider<Any?, ReadWriteProperty<PropsScope<out TWidget>, TValue>> {
    @OptIn(GtkComposeInternalApi::class)
    override fun provideDelegate(
        thisRef: Any?,
        property: KProperty<*>
    ): ReadWriteProperty<PropsScope<out TWidget>, TValue> =
        object : ReadWriteProperty<PropsScope<out TWidget>, TValue> {
            override fun getValue(thisRef: PropsScope<out TWidget>, property: KProperty<*>): TValue {
                return get.invoke(thisRef.node.widget)
            }

            override fun setValue(thisRef: PropsScope<out TWidget>, property: KProperty<*>, value: TValue) {
                val key = property.name
                thisRef.setProperty(key, value) { set.invoke(widget, it) }
            }
        }
}

@OptIn(GtkComposeInternalApi::class)
public inline operator fun <TWidget : Widget, reified TValue : Any?> KMutableProperty1<TWidget, TValue>.getValue(
    thisRef: PropsScope<out TWidget>,
    property: KProperty<*>
): TValue {
    return get(thisRef.node.widget)
}

@OptIn(GtkComposeInternalApi::class)
public inline operator fun <TWidget : Widget, reified TValue : Any?> KMutableProperty1<TWidget, TValue>.setValue(
    thisRef: PropsScope<out TWidget>,
    property: KProperty<*>,
    value: TValue
) {
    val key = property.name
    thisRef.setProperty(key, value) { set(widget, it) }
}

@GtkComposeInternalApi
public inline fun <TWidget : Widget, reified TValue : Any?> signal(
    noinline connector: GtkNode<TWidget>.(TValue) -> ULong
): ReadWriteProperty<PropsScope<out TWidget>, TValue> = object : ReadWriteProperty<PropsScope<out TWidget>, TValue> {
    override fun getValue(thisRef: PropsScope<out TWidget>, property: KProperty<*>): TValue {
        val key = property.name
        val signal = thisRef.signals[key]
        requireNotNull(signal) { "Signal[$key] accessed before it was set" }
        val handler = signal.handler
        require(handler is TValue) { "Signal[$key] is not of expected type ${TValue::class.simpleName}" }
        return handler
    }

    override fun setValue(thisRef: PropsScope<out TWidget>, property: KProperty<*>, value: TValue) {
        val key = property.name
        thisRef.setSignal(key, value, connector)
    }
}

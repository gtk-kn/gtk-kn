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

package org.gtkkn.compose.gtk.node

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposeNode
import androidx.compose.runtime.DisallowComposableCalls
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.DisposableEffectResult
import androidx.compose.runtime.DisposableEffectScope
import androidx.compose.runtime.SkippableUpdater
import androidx.compose.runtime.Updater
import androidx.compose.runtime.remember
import org.gtkkn.bindings.gobject.Gobject
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.compose.gtk.internal.GtkComposeInternalApi
import org.gtkkn.compose.gtk.internal.GtkNodeApplier
import org.gtkkn.compose.gtk.platform.rememberLogger
import org.gtkkn.compose.gtk.props.PropsBuilder
import org.gtkkn.compose.gtk.props.PropsScope


@GtkComposeInternalApi
public typealias AnyGtkNode = GtkNode<Widget>

@OptIn(ExperimentalStdlibApi::class)
@GtkComposeInternalApi
public sealed class GtkNode<out TWidget : Widget> : AutoCloseable {
    internal var signals: List<ULong> = emptyList()
        set(value) {
            field.forEach {
                Gobject.signalHandlerDisconnect(widget, it)
            }
            field = value
        }

    public abstract val widget: TWidget

    override fun close() {
        signals = emptyList()
    }

    override fun toString(): String = widget.name
}

@Composable
@GtkComposeInternalApi
public inline fun <TWidget : Widget, TNode : GtkNode<TWidget>> GtkNode(
    update: @DisallowComposableCalls Updater<TNode>.() -> Unit,
    noinline factory: () -> TNode,
) {
    val scope = remember { LazyNodeScope<TWidget>() }

    val aFactory = { factory().also { scope.node = it } }

    ComposeNode<TNode, GtkNodeApplier>(
        factory = aFactory,
        update = update,
    )
}

@Composable
@GtkComposeInternalApi
public inline fun <TWidget : Widget, TNode : GtkNode<TWidget>> GtkNode(
    update: @DisallowComposableCalls Updater<TNode>.() -> Unit,
    crossinline content: ContentBuilder<TWidget> = {},
    noinline factory: () -> TNode,
) {
    val scope = remember { LazyNodeScope<TWidget>() }

    val aFactory = { factory().also { scope.node = it } }
    val aContent = @Composable { content.invoke(scope) }

    ComposeNode<TNode, GtkNodeApplier>(
        factory = aFactory,
        update = update,
        content = aContent,
    )
}

@Composable
@GtkComposeInternalApi
public inline fun <TWidget : Widget, TNode : GtkNode<TWidget>> GtkNode(
    update: @DisallowComposableCalls Updater<TNode>.() -> Unit,
    noinline skippableUpdate: ComposableBuilder<SkippableUpdater<TNode>>,
    crossinline content: ContentBuilder<TWidget> = {},
    noinline factory: () -> TNode,
) {
    val scope = remember { LazyNodeScope<TWidget>() }

    val aFactory = { factory().also { scope.node = it } }
    val aContent = @Composable { content.invoke(scope) }

    ComposeNode<TNode, GtkNodeApplier>(
        factory = aFactory,
        update = update,
        skippableUpdate = skippableUpdate,
        content = aContent,
    )
}

@Composable
@GtkComposeInternalApi
public fun <TWidget : Widget, TNode : GtkNode<TWidget>> GtkNode(
    props: PropsBuilder<TWidget>? = null,
    content: ContentBuilder<TWidget> = {},
    factory: () -> TNode,
) {
    val node = remember(factory)
    val scope = remember(node) { StaticNodeScope(node) }
    val logger = rememberLogger(node) { "GtkNode(${node})" }


    val aFactory = { node }
    var refEffect: (DisposableEffectScope.(GtkNode<TWidget>) -> DisposableEffectResult)? = null
    val aContent = @Composable {
        refEffect?.let { effect ->
            DisposableEffect(Unit) {
                effect.invoke(this, node)
            }
        }
        content.invoke(scope)
    }

    ComposeNode<TNode, GtkNodeApplier>(
        factory = aFactory,
        update = { },
        // Must be updated together with [Window]
        skippableUpdate = {
            val propsScope = PropsScope(node)
            props?.invoke(propsScope)

            refEffect = propsScope.refEffect

            update {
                set(propsScope.properties) { properties ->
                    logger.d { "Updating properties" }
                    properties.forEach { (key, property) ->
                        logger.v { "Updating property[$key]" }
                        property.updater(node, property.value)
                    }
                }
                set(propsScope.signals) { signals ->
                    logger.d { "Updating signals" }
                    val newSignals = signals.map { (key, signal) ->
                        logger.v { "Updating signal[$key]" }
                        signal.connector(node, signal.handler)
                    }
                    node.signals = newSignals
                }
            }
        },
        content = aContent,
    )
}

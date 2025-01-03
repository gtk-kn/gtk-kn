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

package org.gtkkn.compose.gtk4.window

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.DisposableEffectResult
import androidx.compose.runtime.DisposableEffectScope
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCompositionContext
import androidx.compose.runtime.rememberUpdatedState
import org.gtkkn.bindings.gdk.Display
import org.gtkkn.bindings.gtk.Application
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.bindings.gtk.Window
import org.gtkkn.compose.gtk4.internal.ComposeGtkKnInternalApi
import org.gtkkn.compose.gtk4.node.ContentBuilder
import org.gtkkn.compose.gtk4.node.GtkContainerNode
import org.gtkkn.compose.gtk4.node.GtkNode
import org.gtkkn.compose.gtk4.node.GtkParentNode
import org.gtkkn.compose.gtk4.node.setContent
import org.gtkkn.compose.gtk4.platform.LocalApplication
import org.gtkkn.compose.gtk4.platform.LocalWindow
import org.gtkkn.compose.gtk4.props.PropsScope
import org.gtkkn.compose.gtk4.props.SyntheticProperty
import org.gtkkn.compose.gtk4.props.getValue
import org.gtkkn.compose.gtk4.props.setValue
import org.gtkkn.compose.gtk4.props.signal
import org.gtkkn.compose.gtk4.util.ComponentUpdater
import org.gtkkn.extensions.glib.util.LogPriority.INFO
import org.gtkkn.extensions.glib.util.log

@ComposeGtkKnInternalApi
internal open class WindowNode<TWidget : Window>(override val widget: TWidget) : GtkParentNode<TWidget>() {
    private var isClosed: Boolean = false
    override fun add(child: Widget) {
        widget.child = child
    }

    override fun clear() {
        widget.child = null
    }

    override fun close() {
        if (!isClosed) {
            widget.close()
            isClosed = true
        }
    }
}

// region properties
/**
 * @see Window.application
 */
public var PropsScope<out Window>.application: Application? by Window::application

/**
 * @see Window.child
 */
public var PropsScope<out Window>.child: Widget? by Window::child

/**
 * @see Window.decorated
 */
public var PropsScope<out Window>.decorated: Boolean by Window::decorated

/**
 * @see Window.setDefaultSize
 */
@OptIn(ComposeGtkKnInternalApi::class)
public fun PropsScope<out Window>.defaultSize(width: Int, height: Int) {
    setProperty("defaultSize", width to height) {
        widget.setDefaultSize(it.first, it.second)
    }
}

/**
 * @see Window.defaultWidget
 */
public var PropsScope<out Window>.defaultWidget: Widget? by Window::defaultWidget

/**
 * @see Window.deletable
 */
public var PropsScope<out Window>.deletable: Boolean by Window::deletable

/**
 * @see Window.destroyWithParent
 */
public var PropsScope<out Window>.destroyWithParent: Boolean by Window::destroyWithParent

/**
 * @see Window.getDisplay
 * @see Window.setDisplay
 */
public var PropsScope<out Window>.display: Display by SyntheticProperty(
    get = Window::getDisplay,
    set = Window::setDisplay,
)

/**
 * @see Window.focusVisible
 */
public var PropsScope<out Window>.focusVisible: Boolean by Window::focusVisible

/**
 * @see Window.handleMenubarAccel
 */
public var PropsScope<out Window>.handleMenubarAccel: Boolean by Window::handleMenubarAccel

/**
 * @see Window.hideOnClose
 */
public var PropsScope<out Window>.hideOnClose: Boolean by Window::hideOnClose

/**
 * @see Window.iconName
 */
public var PropsScope<out Window>.iconName: String? by Window::iconName

/**
 * @see Window.mnemonicsVisible
 */
public var PropsScope<out Window>.mnemonicsVisible: Boolean by Window::mnemonicsVisible

/**
 * @see Window.modal
 */
public var PropsScope<out Window>.modal: Boolean by Window::modal

/**
 * @see Window.resizable
 */
public var PropsScope<out Window>.resizable: Boolean by Window::resizable

/**
 * @see Window.title
 */
public var PropsScope<out Window>.title: String? by Window::title

/**
 * @see Window.titlebar
 */
public var PropsScope<out Window>.titlebar: Widget? by Window::titlebar

/**
 * @see Window.transientFor
 */
public var PropsScope<out Window>.transientFor: Window? by Window::transientFor
// endregion

// region signals
/**
 * @see Window.onActivateDefault
 */
@OptIn(ComposeGtkKnInternalApi::class)
public var PropsScope<out Window>.onActivateDefault: () -> Unit by signal {
    widget.onActivateDefault(handler = it)
}

/**
 * @see Window.onActivateFocus
 */
@OptIn(ComposeGtkKnInternalApi::class)
public var PropsScope<out Window>.onActivateFocus: () -> Unit by signal { widget.onActivateFocus(handler = it) }

/**
 * @see Window.onCloseRequest
 */
@OptIn(ComposeGtkKnInternalApi::class)
public var PropsScope<out Window>.onCloseRequest: () -> Boolean by signal { widget.onCloseRequest(handler = it) }

/**
 * @see Window.onEnableDebugging
 */
@OptIn(ComposeGtkKnInternalApi::class)
public var PropsScope<out Window>.onEnableDebugging: (toggle: Boolean) -> Boolean by signal {
    widget.onEnableDebugging(handler = it)
}
// endregion

/**
 * @see Window
 */
@OptIn(ComposeGtkKnInternalApi::class)
@Composable
public fun Window(
    onCloseRequest: () -> Unit,
    visible: Boolean,
    props: PropsScope<Window>.() -> Unit,
    child: ContentBuilder<Window>,
) {
    Window(
        onCloseRequest = onCloseRequest,
        visible = visible,
        create = { application ->
            WindowNode(
                Window().apply {
                    this.application = application
                },
            )
        },
        dispose = {},
        props = props,
        child = child,
    )
}

@OptIn(ComposeGtkKnInternalApi::class)
@Composable
internal fun <TWidget : Window, TNode : GtkContainerNode<TWidget>> Window(
    onCloseRequest: () -> Unit,
    visible: Boolean,
    create: (application: Application) -> TNode,
    dispose: (node: TNode) -> Unit,
    props: PropsScope<TWidget>.() -> Unit,
    child: ContentBuilder<Window>,
) {
    val currentOnCloseRequest by rememberUpdatedState(onCloseRequest)

    val application = LocalApplication.current
    val parentComposition = rememberCompositionContext()
    val node = remember { create(application) }
    val updater = remember(::ComponentUpdater)

    var refEffect: (DisposableEffectScope.(GtkNode<TWidget>) -> DisposableEffectResult)? = null
    GtkWindow(
        visible = visible,
        create = {
            node.apply {
                setContent(parentComposition) {
                    CompositionLocalProvider(LocalWindow provides this@apply.widget) {
                        refEffect?.let { effect ->
                            DisposableEffect(Unit) {
                                effect.invoke(this@DisposableEffect, this@apply)
                            }
                        }
                        child.invoke(this@setContent)
                    }
                }
                widget.onCloseRequest {
                    currentOnCloseRequest()
                    false
                }
            }
        },
        dispose = { window ->
            dispose(window)
            window.close()
        },
        // Must be updated together with [GtkNode]
        update = {
            val propsScope = PropsScope(it)
            props.invoke(propsScope)

            refEffect = propsScope.refEffect

            updater.update {
                set(propsScope.properties) { properties ->
                    log("Window", INFO) { "Updating properties" }
                    properties.forEach { (key, property) ->
                        log("Window") { "Updating property[$key]" }
                        property.updater(node, property.value)
                    }
                }
                set(propsScope.signals) { signals ->
                    log("Window", INFO) { "Updating signals" }
                    val newSignals = signals.map { (key, signal) ->
                        log("Window") { "Updating signal[$key]" }
                        signal.connector(node, signal.handler)
                    }
                    node.signals = newSignals
                }
            }
        },
    )
}

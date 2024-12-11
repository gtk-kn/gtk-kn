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
import androidx.compose.runtime.DisposableEffectScope
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.compose.gtk.internal.GtkComposeInternalApi


@DslMarker
public annotation class GtkComposeNodeScope

public typealias Builder<TScope> = TScope.() -> Unit
public typealias ComposableBuilder<TScope> = @Composable Builder<TScope>
public typealias ContentBuilder<TWidget> = ComposableBuilder<ContainerScope<TWidget>>

@GtkComposeNodeScope
public sealed interface NodeScope<out TWidget : Widget> {
    /**
     * Reference to a native GTK [Widget] this node is managing
     */
    public val DisposableEffectScope.scopeElement: TWidget
}

public interface ElementScope<out TWidget : Widget> : NodeScope<TWidget>

public interface ContainerScope<out TWidget : Widget> : NodeScope<TWidget>

/**
 * A [NodeScope] that expects [node] property to be set after scope creation,
 * but always before the first potential call to [scopeElement]
 */
@GtkComposeInternalApi
public class LazyNodeScope<TWidget : Widget> : ElementScope<TWidget>, ContainerScope<TWidget> {
    @PublishedApi
    internal lateinit var node: GtkNode<TWidget>

    override val DisposableEffectScope.scopeElement: TWidget
        get() = node.widget
}

/**
 * A [NodeScope] that demands [node] property to be during scope creation
 */
@GtkComposeInternalApi
public class StaticNodeScope<TWidget : Widget>(
    @PublishedApi
    internal val node: GtkNode<TWidget>
) : ElementScope<TWidget>, ContainerScope<TWidget> {
    override val DisposableEffectScope.scopeElement: TWidget
        get() = node.widget
}

/**
 * Wraps a nullable [ContentBuilder] into potentially noop non-nullable [ContentBuilder]
 */
@GtkComposeInternalApi
public inline fun <TWidget : Widget> ContentBuilder<TWidget>?.wrap(): ContentBuilder<TWidget> =
    { this@wrap?.invoke(this) }

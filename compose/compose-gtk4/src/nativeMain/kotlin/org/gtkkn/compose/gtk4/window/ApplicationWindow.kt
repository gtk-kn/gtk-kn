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
import org.gtkkn.bindings.gtk.ApplicationWindow
import org.gtkkn.bindings.gtk.Window
import org.gtkkn.compose.gtk4.internal.ComposeGtkKnInternalApi
import org.gtkkn.compose.gtk4.node.ContentBuilder
import org.gtkkn.compose.gtk4.props.PropsScope

@ComposeGtkKnInternalApi
private class ApplicationWindowNode(
    override val widget: ApplicationWindow
) : WindowNode<ApplicationWindow>(widget)

// region properties
// public var PropsScope<out ApplicationWindow>.showMenubar: Boolean by ApplicationWindow::showMenubar
// endregion

@OptIn(ComposeGtkKnInternalApi::class)
@Composable
public fun ApplicationWindow(
    onCloseRequest: () -> Unit,
    visible: Boolean,
    props: PropsScope<ApplicationWindow>.() -> Unit,
    child: ContentBuilder<Window>
) {
    Window(
        onCloseRequest = onCloseRequest,
        visible = visible,
        create = { application ->
            ApplicationWindowNode(ApplicationWindow(application))
        },
        dispose = {},
        props = props,
        child = child,
    )
}

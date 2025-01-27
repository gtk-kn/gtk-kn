// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkActionable
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkLinkButton
import org.gtkkn.native.gtk.gtk_link_button_get_type
import org.gtkkn.native.gtk.gtk_link_button_get_uri
import org.gtkkn.native.gtk.gtk_link_button_get_visited
import org.gtkkn.native.gtk.gtk_link_button_new
import org.gtkkn.native.gtk.gtk_link_button_new_with_label
import org.gtkkn.native.gtk.gtk_link_button_set_uri
import org.gtkkn.native.gtk.gtk_link_button_set_visited
import kotlin.Boolean
import kotlin.String
import kotlin.ULong

/**
 * A `GtkLinkButton` is a button with a hyperlink.
 *
 * ![An example GtkLinkButton](link-button.png)
 *
 * It is useful to show quick links to resources.
 *
 * A link button is created by calling either [ctor@Gtk.LinkButton.new] or
 * [ctor@Gtk.LinkButton.new_with_label]. If using the former, the URI you
 * pass to the constructor is used as a label for the widget.
 *
 * The URI bound to a `GtkLinkButton` can be set specifically using
 * [method@Gtk.LinkButton.set_uri].
 *
 * By default, `GtkLinkButton` calls [method@Gtk.FileLauncher.launch] when the button
 * is clicked. This behaviour can be overridden by connecting to the
 * [signal@Gtk.LinkButton::activate-link] signal and returning true from
 * the signal handler.
 *
 * # CSS nodes
 *
 * `GtkLinkButton` has a single CSS node with name button. To differentiate
 * it from a plain `GtkButton`, it gets the .link style class.
 *
 * # Accessibility
 *
 * `GtkLinkButton` uses the %GTK_ACCESSIBLE_ROLE_LINK role.
 */
public open class LinkButton(public val gtkLinkButtonPointer: CPointer<GtkLinkButton>) :
    Button(gtkLinkButtonPointer.reinterpret()),
    KGTyped {
    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkActionablePointer: CPointer<GtkActionable>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * The URI bound to this button.
     */
    public open var uri: String
        /**
         * Retrieves the URI of the `GtkLinkButton`.
         *
         * @return a valid URI. The returned string is owned by the link button
         *   and should not be modified or freed.
         */
        get() = gtk_link_button_get_uri(gtkLinkButtonPointer)?.toKString() ?: error("Expected not null string")

        /**
         * Sets @uri as the URI where the `GtkLinkButton` points.
         *
         * As a side-effect this unsets the “visited” state of the button.
         *
         * @param uri a valid URI
         */
        set(uri) = gtk_link_button_set_uri(gtkLinkButtonPointer, uri)

    /**
     * The 'visited' state of this button.
     *
     * A visited link is drawn in a different color.
     */
    public open var visited: Boolean
        /**
         * Retrieves the “visited” state of the `GtkLinkButton`.
         *
         * The button becomes visited when it is clicked. If the URI
         * is changed on the button, the “visited” state is unset again.
         *
         * The state may also be changed using [method@Gtk.LinkButton.set_visited].
         *
         * @return true if the link has been visited, false otherwise
         */
        get() = gtk_link_button_get_visited(gtkLinkButtonPointer).asBoolean()

        /**
         * Sets the “visited” state of the `GtkLinkButton`.
         *
         * See [method@Gtk.LinkButton.get_visited] for more details.
         *
         * @param visited the new “visited” state
         */
        set(visited) = gtk_link_button_set_visited(gtkLinkButtonPointer, visited.asGBoolean())

    /**
     * Creates a new `GtkLinkButton` with the URI as its text.
     *
     * @param uri a valid URI
     * @return a new link button widget.
     */
    public constructor(uri: String) : this(gtk_link_button_new(uri)!!.reinterpret())

    /**
     * Creates a new `GtkLinkButton` containing a label.
     *
     * @param uri a valid URI
     * @param label the text of the button
     * @return a new link button widget.
     */
    public constructor(
        uri: String,
        label: String? = null,
    ) : this(gtk_link_button_new_with_label(uri, label)!!.reinterpret())

    /**
     * Emitted each time the `GtkLinkButton` is clicked.
     *
     * The default handler will call [method@Gtk.FileLauncher.launch] with the URI
     * stored inside the [property@Gtk.LinkButton:uri] property.
     *
     * To override the default behavior, you can connect to the
     * ::activate-link signal and stop the propagation of the signal
     * by returning true from your handler.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Returns true if the signal has been handled
     */
    public fun onActivateLink(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Boolean): ULong =
        g_signal_connect_data(
            gtkLinkButtonPointer,
            "activate-link",
            onActivateLinkFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<LinkButton> {
        override val type: GeneratedClassKGType<LinkButton> =
            GeneratedClassKGType(getTypeOrNull("gtk_link_button_get_type")!!) { LinkButton(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of LinkButton
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_link_button_get_type()
    }
}

private val onActivateLinkFunc: CPointer<CFunction<() -> gboolean>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Boolean>().get().invoke().asGBoolean()
}
    .reinterpret()

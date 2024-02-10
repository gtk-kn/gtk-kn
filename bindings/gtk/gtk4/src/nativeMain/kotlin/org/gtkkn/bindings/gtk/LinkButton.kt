// This is a generated file. Do not modify.
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
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
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
import kotlin.Int
import kotlin.String
import kotlin.ULong
import kotlin.Unit

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
 * By default, `GtkLinkButton` calls [func@Gtk.show_uri] when the button
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
public open class LinkButton(
    pointer: CPointer<GtkLinkButton>,
) : Button(pointer.reinterpret()), KGTyped {
    public val gtkLinkButtonPointer: CPointer<GtkLinkButton>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkActionablePointer: CPointer<GtkActionable>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

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
        get() =
            gtk_link_button_get_uri(gtkLinkButtonPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

        /**
         * Sets @uri as the URI where the `GtkLinkButton` points.
         *
         * As a side-effect this unsets the “visited” state of the button.
         *
         * @param uri a valid URI
         */
        set(uri) = gtk_link_button_set_uri(gtkLinkButtonPointer.reinterpret(), uri)

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
        get() = gtk_link_button_get_visited(gtkLinkButtonPointer.reinterpret()).asBoolean()

        /**
         * Sets the “visited” state of the `GtkLinkButton`.
         *
         * See [method@Gtk.LinkButton.get_visited] for more details.
         *
         * @param visited the new “visited” state
         */
        set(visited) =
            gtk_link_button_set_visited(
                gtkLinkButtonPointer.reinterpret(),
                visited.asGBoolean()
            )

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
    public constructor(uri: String, label: String? = null) :
        this(gtk_link_button_new_with_label(uri, label)!!.reinterpret())

    /**
     * Retrieves the URI of the `GtkLinkButton`.
     *
     * @return a valid URI. The returned string is owned by the link button
     *   and should not be modified or freed.
     */
    public open fun getUri(): String =
        gtk_link_button_get_uri(gtkLinkButtonPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

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
    public open fun getVisited(): Boolean = gtk_link_button_get_visited(gtkLinkButtonPointer.reinterpret()).asBoolean()

    /**
     * Sets @uri as the URI where the `GtkLinkButton` points.
     *
     * As a side-effect this unsets the “visited” state of the button.
     *
     * @param uri a valid URI
     */
    public open fun setUri(uri: String): Unit = gtk_link_button_set_uri(gtkLinkButtonPointer.reinterpret(), uri)

    /**
     * Sets the “visited” state of the `GtkLinkButton`.
     *
     * See [method@Gtk.LinkButton.get_visited] for more details.
     *
     * @param visited the new “visited” state
     */
    public open fun setVisited(visited: Boolean): Unit =
        gtk_link_button_set_visited(gtkLinkButtonPointer.reinterpret(), visited.asGBoolean())

    /**
     * Emitted each time the `GtkLinkButton` is clicked.
     *
     * The default handler will call [func@Gtk.show_uri] with the URI
     * stored inside the [property@Gtk.LinkButton:uri] property.
     *
     * To override the default behavior, you can connect to the
     * ::activate-link signal and stop the propagation of the signal
     * by returning true from your handler.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Returns true if the signal has been handled
     */
    public fun connectActivateLink(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Boolean,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "activate-link",
            connectActivateLinkFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<LinkButton> {
        override val type: GeneratedClassKGType<LinkButton> =
            GeneratedClassKGType(gtk_link_button_get_type()) { LinkButton(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}

private val connectActivateLinkFunc: CPointer<CFunction<() -> Int>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Boolean>().get().invoke().asGBoolean()
    }
        .reinterpret()

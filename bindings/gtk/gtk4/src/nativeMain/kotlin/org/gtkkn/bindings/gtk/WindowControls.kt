// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkWindowControls
import org.gtkkn.native.gtk.gtk_window_controls_get_decoration_layout
import org.gtkkn.native.gtk.gtk_window_controls_get_empty
import org.gtkkn.native.gtk.gtk_window_controls_get_side
import org.gtkkn.native.gtk.gtk_window_controls_get_type
import org.gtkkn.native.gtk.gtk_window_controls_new
import org.gtkkn.native.gtk.gtk_window_controls_set_decoration_layout
import org.gtkkn.native.gtk.gtk_window_controls_set_side
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * `GtkWindowControls` shows window frame controls.
 *
 * Typical window frame controls are minimize, maximize and close buttons,
 * and the window icon.
 *
 * ![An example GtkWindowControls](windowcontrols.png)
 *
 * `GtkWindowControls` only displays start or end side of the controls (see
 * [property@Gtk.WindowControls:side]), so it's intended to be always used
 * in pair with another `GtkWindowControls` for the opposite side, for example:
 *
 * ```xml
 * <object class="GtkBox">
 *   <child>
 *     <object class="GtkWindowControls">
 *       <property name="side">start</property>
 *     </object>
 *   </child>
 *
 *   ...
 *
 *   <child>
 *     <object class="GtkWindowControls">
 *       <property name="side">end</property>
 *     </object>
 *   </child>
 * </object>
 * ```
 *
 * # CSS nodes
 *
 * ```
 * windowcontrols
 * ├── [image.icon]
 * ├── [button.minimize]
 * ├── [button.maximize]
 * ╰── [button.close]
 * ```
 *
 * A `GtkWindowControls`' CSS node is called windowcontrols. It contains
 * subnodes corresponding to each title button. Which of the title buttons
 * exist and where they are placed exactly depends on the desktop environment
 * and [property@Gtk.WindowControls:decoration-layout] value.
 *
 * When [property@Gtk.WindowControls:empty] is true, it gets the .empty
 * style class.
 *
 * # Accessibility
 *
 * `GtkWindowControls` uses the %GTK_ACCESSIBLE_ROLE_GROUP role.
 */
public open class WindowControls(
    pointer: CPointer<GtkWindowControls>,
) : Widget(pointer.reinterpret()),
    KGTyped {
    public val gtkWindowControlsPointer: CPointer<GtkWindowControls>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * The decoration layout for window buttons.
     *
     * If this property is not set, the
     * [property@Gtk.Settings:gtk-decoration-layout] setting is used.
     */
    public open var decorationLayout: String?
        /**
         * Gets the decoration layout of this `GtkWindowControls`.
         *
         * @return the decoration layout or null if it is unset
         */
        get() = gtk_window_controls_get_decoration_layout(gtkWindowControlsPointer.reinterpret())?.toKString()

        /**
         * Sets the decoration layout for the title buttons.
         *
         * This overrides the [property@Gtk.Settings:gtk-decoration-layout]
         * setting.
         *
         * The format of the string is button names, separated by commas.
         * A colon separates the buttons that should appear on the left
         * from those on the right. Recognized button names are minimize,
         * maximize, close and icon (the window icon).
         *
         * For example, “icon:minimize,maximize,close” specifies a icon
         * on the left, and minimize, maximize and close buttons on the right.
         *
         * If [property@Gtk.WindowControls:side] value is @GTK_PACK_START, @self
         * will display the part before the colon, otherwise after that.
         *
         * @param layout a decoration layout, or null to unset the layout
         */
        set(layout) = gtk_window_controls_set_decoration_layout(gtkWindowControlsPointer.reinterpret(), layout)

    /**
     * Whether the widget has any window buttons.
     */
    public open val empty: Boolean
        /**
         * Gets whether the widget has any window buttons.
         *
         * @return true if the widget has window buttons, otherwise false
         */
        get() = gtk_window_controls_get_empty(gtkWindowControlsPointer.reinterpret()).asBoolean()

    /**
     * Whether the widget shows start or end side of the decoration layout.
     *
     * See [property@Gtk.WindowControls:decoration_layout].
     */
    public open var side: PackType
        /**
         * Gets the side to which this `GtkWindowControls` instance belongs.
         *
         * @return the side
         */
        get() =
            gtk_window_controls_get_side(gtkWindowControlsPointer.reinterpret()).run {
                PackType.fromNativeValue(this)
            }

        /**
         * Determines which part of decoration layout the `GtkWindowControls` uses.
         *
         * See [property@Gtk.WindowControls:decoration-layout].
         *
         * @param side a side
         */
        set(side) = gtk_window_controls_set_side(gtkWindowControlsPointer.reinterpret(), side.nativeValue)

    /**
     * Creates a new `GtkWindowControls`.
     *
     * @param side the side
     * @return a new `GtkWindowControls`.
     */
    public constructor(side: PackType) : this(gtk_window_controls_new(side.nativeValue)!!.reinterpret())

    /**
     * Gets the decoration layout of this `GtkWindowControls`.
     *
     * @return the decoration layout or null if it is unset
     */
    public open fun getDecorationLayout(): String? =
        gtk_window_controls_get_decoration_layout(gtkWindowControlsPointer.reinterpret())?.toKString()

    /**
     * Gets whether the widget has any window buttons.
     *
     * @return true if the widget has window buttons, otherwise false
     */
    public open fun getEmpty(): Boolean =
        gtk_window_controls_get_empty(gtkWindowControlsPointer.reinterpret()).asBoolean()

    /**
     * Gets the side to which this `GtkWindowControls` instance belongs.
     *
     * @return the side
     */
    public open fun getSide(): PackType =
        gtk_window_controls_get_side(gtkWindowControlsPointer.reinterpret()).run {
            PackType.fromNativeValue(this)
        }

    /**
     * Sets the decoration layout for the title buttons.
     *
     * This overrides the [property@Gtk.Settings:gtk-decoration-layout]
     * setting.
     *
     * The format of the string is button names, separated by commas.
     * A colon separates the buttons that should appear on the left
     * from those on the right. Recognized button names are minimize,
     * maximize, close and icon (the window icon).
     *
     * For example, “icon:minimize,maximize,close” specifies a icon
     * on the left, and minimize, maximize and close buttons on the right.
     *
     * If [property@Gtk.WindowControls:side] value is @GTK_PACK_START, @self
     * will display the part before the colon, otherwise after that.
     *
     * @param layout a decoration layout, or null to unset the layout
     */
    public open fun setDecorationLayout(layout: String? = null): Unit =
        gtk_window_controls_set_decoration_layout(gtkWindowControlsPointer.reinterpret(), layout)

    /**
     * Determines which part of decoration layout the `GtkWindowControls` uses.
     *
     * See [property@Gtk.WindowControls:decoration-layout].
     *
     * @param side a side
     */
    public open fun setSide(side: PackType): Unit =
        gtk_window_controls_set_side(gtkWindowControlsPointer.reinterpret(), side.nativeValue)

    public companion object : TypeCompanion<WindowControls> {
        override val type: GeneratedClassKGType<WindowControls> =
            GeneratedClassKGType(gtk_window_controls_get_type()) { WindowControls(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}

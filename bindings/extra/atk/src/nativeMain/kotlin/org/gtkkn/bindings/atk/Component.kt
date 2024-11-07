// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.atk.annotations.AtkVersion1_12
import org.gtkkn.bindings.atk.annotations.AtkVersion2_30
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.atk.AtkComponent
import org.gtkkn.native.atk.AtkRectangle
import org.gtkkn.native.atk.atk_component_contains
import org.gtkkn.native.atk.atk_component_get_alpha
import org.gtkkn.native.atk.atk_component_get_type
import org.gtkkn.native.atk.atk_component_grab_focus
import org.gtkkn.native.atk.atk_component_ref_accessible_at_point
import org.gtkkn.native.atk.atk_component_remove_focus_handler
import org.gtkkn.native.atk.atk_component_scroll_to
import org.gtkkn.native.atk.atk_component_scroll_to_point
import org.gtkkn.native.atk.atk_component_set_extents
import org.gtkkn.native.atk.atk_component_set_position
import org.gtkkn.native.atk.atk_component_set_size
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.UInt
import kotlin.ULong
import kotlin.Unit

/**
 * The ATK interface provided by UI components
 * which occupy a physical area on the screen.
 * which the user can activate/interact with.
 *
 * #AtkComponent should be implemented by most if not all UI elements
 * with an actual on-screen presence, i.e. components which can be
 * said to have a screen-coordinate bounding box.  Virtually all
 * widgets will need to have #AtkComponent implementations provided
 * for their corresponding #AtkObject class.  In short, only UI
 * elements which are *not* GUI elements will omit this ATK interface.
 *
 * A possible exception might be textual information with a
 * transparent background, in which case text glyph bounding box
 * information is provided by #AtkText.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `x`: x: Out parameter is not supported
 * - method `get_layer`: C function atk_component_get_layer is ignored
 * - method `get_mdi_zorder`: C function atk_component_get_mdi_zorder is ignored
 * - parameter `x`: x: Out parameter is not supported
 * - parameter `width`: width: Out parameter is not supported
 */
public interface Component :
    Interface,
    KGTyped {
    public val atkComponentPointer: CPointer<AtkComponent>

    /**
     * Checks whether the specified point is within the extent of the @component.
     *
     * Toolkit implementor note: ATK provides a default implementation for
     * this virtual method. In general there are little reason to
     * re-implement it.
     *
     * @param x x coordinate
     * @param y y coordinate
     * @param coordType specifies whether the coordinates are relative to the screen
     * or to the components top level window
     * @return true or false indicating whether the specified point is within
     * the extent of the @component or not
     */
    public fun contains(
        x: Int,
        y: Int,
        coordType: CoordType,
    ): Boolean = atk_component_contains(atkComponentPointer.reinterpret(), x, y, coordType.nativeValue).asBoolean()

    /**
     * Returns the alpha value (i.e. the opacity) for this
     * @component, on a scale from 0 (fully transparent) to 1.0
     * (fully opaque).
     *
     * @return An alpha value from 0 to 1.0, inclusive.
     * @since 1.12
     */
    @AtkVersion1_12
    public fun getAlpha(): Double = atk_component_get_alpha(atkComponentPointer.reinterpret())

    /**
     * Grabs focus for this @component.
     *
     * @return true if successful, false otherwise.
     */
    public fun grabFocus(): Boolean = atk_component_grab_focus(atkComponentPointer.reinterpret()).asBoolean()

    /**
     * Gets a reference to the accessible child, if one exists, at the
     * coordinate point specified by @x and @y.
     *
     * @param x x coordinate
     * @param y y coordinate
     * @param coordType specifies whether the coordinates are relative to the screen
     * or to the components top level window
     * @return a reference to the accessible
     * child, if one exists
     */
    public fun refAccessibleAtPoint(
        x: Int,
        y: Int,
        coordType: CoordType,
    ): Object? =
        atk_component_ref_accessible_at_point(atkComponentPointer.reinterpret(), x, y, coordType.nativeValue)?.run {
            Object(reinterpret())
        }

    /**
     * Remove the handler specified by @handler_id from the list of
     * functions to be executed when this object receives focus events
     * (in or out).
     *
     * @param handlerId the handler id of the focus handler to be removed
     * from @component
     */
    public fun removeFocusHandler(handlerId: UInt): Unit =
        atk_component_remove_focus_handler(atkComponentPointer.reinterpret(), handlerId)

    /**
     * Makes @component visible on the screen by scrolling all necessary parents.
     *
     * Contrary to atk_component_set_position, this does not actually move
     * @component in its parent, this only makes the parents scroll so that the
     * object shows up on the screen, given its current position within the parents.
     *
     * @param type specify where the object should be made visible.
     * @return whether scrolling was successful.
     * @since 2.30
     */
    @AtkVersion2_30
    public fun scrollTo(type: ScrollType): Boolean =
        atk_component_scroll_to(atkComponentPointer.reinterpret(), type.nativeValue).asBoolean()

    /**
     * Move the top-left of @component to a given position of the screen by
     * scrolling all necessary parents.
     *
     * @param coords specify whether coordinates are relative to the screen or to the
     * parent object.
     * @param x x-position where to scroll to
     * @param y y-position where to scroll to
     * @return whether scrolling was successful.
     * @since 2.30
     */
    @AtkVersion2_30
    public fun scrollToPoint(
        coords: CoordType,
        x: Int,
        y: Int,
    ): Boolean = atk_component_scroll_to_point(atkComponentPointer.reinterpret(), coords.nativeValue, x, y).asBoolean()

    /**
     * Sets the extents of @component.
     *
     * @param x x coordinate
     * @param y y coordinate
     * @param width width to set for @component
     * @param height height to set for @component
     * @param coordType specifies whether the coordinates are relative to the screen
     * or to the components top level window
     * @return true or false whether the extents were set or not
     */
    public fun setExtents(
        x: Int,
        y: Int,
        width: Int,
        height: Int,
        coordType: CoordType,
    ): Boolean =
        atk_component_set_extents(
            atkComponentPointer.reinterpret(),
            x,
            y,
            width,
            height,
            coordType.nativeValue
        ).asBoolean()

    /**
     * Sets the position of @component.
     *
     * Contrary to atk_component_scroll_to, this does not trigger any scrolling,
     * this just moves @component in its parent.
     *
     * @param x x coordinate
     * @param y y coordinate
     * @param coordType specifies whether the coordinates are relative to the screen
     * or to the component's top level window
     * @return true or false whether or not the position was set or not
     */
    public fun setPosition(
        x: Int,
        y: Int,
        coordType: CoordType,
    ): Boolean = atk_component_set_position(atkComponentPointer.reinterpret(), x, y, coordType.nativeValue).asBoolean()

    /**
     * Set the size of the @component in terms of width and height.
     *
     * @param width width to set for @component
     * @param height height to set for @component
     * @return true or false whether the size was set or not
     */
    public fun setSize(
        width: Int,
        height: Int,
    ): Boolean = atk_component_set_size(atkComponentPointer.reinterpret(), width, height).asBoolean()

    /**
     * The 'bounds-changed" signal is emitted when the position or
     * size of the component changes.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `arg1` The AtkRectangle giving the new position and size.
     */
    public fun connectBoundsChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (arg1: Rectangle) -> Unit,
    ): ULong =
        g_signal_connect_data(
            atkComponentPointer.reinterpret(),
            "bounds-changed",
            connectBoundsChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    private data class Wrapper(
        private val pointer: CPointer<AtkComponent>,
    ) : Component {
        override val atkComponentPointer: CPointer<AtkComponent> = pointer
    }

    public companion object : TypeCompanion<Component> {
        override val type: GeneratedInterfaceKGType<Component> =
            GeneratedInterfaceKGType(atk_component_get_type()) { Wrapper(it.reinterpret()) }

        init {
            AtkTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<AtkComponent>): Component = Wrapper(pointer)
    }
}

private val connectBoundsChangedFunc: CPointer<CFunction<(CPointer<AtkRectangle>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            arg1: CPointer<AtkRectangle>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(arg1: Rectangle) -> Unit>().get().invoke(
            arg1!!.run {
                Rectangle(reinterpret())
            }
        )
    }.reinterpret()

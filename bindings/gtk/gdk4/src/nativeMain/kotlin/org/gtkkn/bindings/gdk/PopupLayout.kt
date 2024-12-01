// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.annotations.GdkVersion4_2
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gdk.GdkPopupLayout
import org.gtkkn.native.gdk.gdk_popup_layout_copy
import org.gtkkn.native.gdk.gdk_popup_layout_equal
import org.gtkkn.native.gdk.gdk_popup_layout_get_anchor_hints
import org.gtkkn.native.gdk.gdk_popup_layout_get_anchor_rect
import org.gtkkn.native.gdk.gdk_popup_layout_get_rect_anchor
import org.gtkkn.native.gdk.gdk_popup_layout_get_surface_anchor
import org.gtkkn.native.gdk.gdk_popup_layout_new
import org.gtkkn.native.gdk.gdk_popup_layout_ref
import org.gtkkn.native.gdk.gdk_popup_layout_set_anchor_hints
import org.gtkkn.native.gdk.gdk_popup_layout_set_anchor_rect
import org.gtkkn.native.gdk.gdk_popup_layout_set_offset
import org.gtkkn.native.gdk.gdk_popup_layout_set_rect_anchor
import org.gtkkn.native.gdk.gdk_popup_layout_set_shadow_width
import org.gtkkn.native.gdk.gdk_popup_layout_set_surface_anchor
import org.gtkkn.native.gdk.gdk_popup_layout_unref
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit

/**
 * The `GdkPopupLayout` struct contains information that is
 * necessary position a [iface@Gdk.Popup] relative to its parent.
 *
 * The positioning requires a negotiation with the windowing system,
 * since it depends on external constraints, such as the position of
 * the parent surface, and the screen dimensions.
 *
 * The basic ingredients are a rectangle on the parent surface,
 * and the anchor on both that rectangle and the popup. The anchors
 * specify a side or corner to place next to each other.
 *
 * ![Popup anchors](popup-anchors.png)
 *
 * For cases where placing the anchors next to each other would make
 * the popup extend offscreen, the layout includes some hints for how
 * to resolve this problem. The hints may suggest to flip the anchor
 * position to the other side, or to 'slide' the popup along a side,
 * or to resize it.
 *
 * ![Flipping popups](popup-flip.png)
 *
 * ![Sliding popups](popup-slide.png)
 *
 * These hints may be combined.
 *
 * Ultimatively, it is up to the windowing system to determine the position
 * and size of the popup. You can learn about the result by calling
 * [method@Gdk.Popup.get_position_x], [method@Gdk.Popup.get_position_y],
 * [method@Gdk.Popup.get_rect_anchor] and [method@Gdk.Popup.get_surface_anchor]
 * after the popup has been presented. This can be used to adjust the rendering.
 * For example, [GtkPopover](../gtk4/class.Popover.html) changes its arrow position
 * accordingly. But you have to be careful avoid changing the size of the popover,
 * or it has to be presented again.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `dx`: dx: Out parameter is not supported
 * - parameter `left`: left: Out parameter is not supported
 */
public class PopupLayout(
    pointer: CPointer<GdkPopupLayout>,
) : Record {
    public val gdkPopupLayoutPointer: CPointer<GdkPopupLayout> = pointer

    /**
     * Makes a copy of @layout.
     *
     * @return a copy of @layout.
     */
    public fun copy(): PopupLayout =
        gdk_popup_layout_copy(gdkPopupLayoutPointer.reinterpret())!!.run {
            PopupLayout(reinterpret())
        }

    /**
     * Check whether @layout and @other has identical layout properties.
     *
     * @param other another `GdkPopupLayout`
     * @return true if @layout and @other have identical layout properties,
     *   otherwise false.
     */
    public fun equal(other: PopupLayout): Boolean =
        gdk_popup_layout_equal(
            gdkPopupLayoutPointer.reinterpret(),
            other.gdkPopupLayoutPointer.reinterpret()
        ).asBoolean()

    /**
     * Get the `GdkAnchorHints`.
     *
     * @return the `GdkAnchorHints`
     */
    public fun getAnchorHints(): AnchorHints =
        gdk_popup_layout_get_anchor_hints(gdkPopupLayoutPointer.reinterpret()).run {
            AnchorHints(this)
        }

    /**
     * Get the anchor rectangle.
     *
     * @return The anchor rectangle
     */
    public fun getAnchorRect(): Rectangle =
        gdk_popup_layout_get_anchor_rect(gdkPopupLayoutPointer.reinterpret())!!.run {
            Rectangle(reinterpret())
        }

    /**
     * Returns the anchor position on the anchor rectangle.
     *
     * @return the anchor on the anchor rectangle.
     */
    public fun getRectAnchor(): Gravity =
        gdk_popup_layout_get_rect_anchor(gdkPopupLayoutPointer.reinterpret()).run {
            Gravity.fromNativeValue(this)
        }

    /**
     * Returns the anchor position on the popup surface.
     *
     * @return the anchor on the popup surface.
     */
    public fun getSurfaceAnchor(): Gravity =
        gdk_popup_layout_get_surface_anchor(gdkPopupLayoutPointer.reinterpret()).run {
            Gravity.fromNativeValue(this)
        }

    /**
     * Increases the reference count of @value.
     *
     * @return the same @layout
     */
    public fun ref(): PopupLayout =
        gdk_popup_layout_ref(gdkPopupLayoutPointer.reinterpret())!!.run {
            PopupLayout(reinterpret())
        }

    /**
     * Set new anchor hints.
     *
     * The set @anchor_hints determines how @surface will be moved
     * if the anchor points cause it to move off-screen. For example,
     * %GDK_ANCHOR_FLIP_X will replace %GDK_GRAVITY_NORTH_WEST with
     * %GDK_GRAVITY_NORTH_EAST and vice versa if @surface extends
     * beyond the left or right edges of the monitor.
     *
     * @param anchorHints the new `GdkAnchorHints`
     */
    public fun setAnchorHints(anchorHints: AnchorHints): Unit =
        gdk_popup_layout_set_anchor_hints(gdkPopupLayoutPointer.reinterpret(), anchorHints.mask)

    /**
     * Set the anchor rectangle.
     *
     * @param anchorRect the new anchor rectangle
     */
    public fun setAnchorRect(anchorRect: Rectangle): Unit =
        gdk_popup_layout_set_anchor_rect(
            gdkPopupLayoutPointer.reinterpret(),
            anchorRect.gdkRectanglePointer.reinterpret()
        )

    /**
     * Offset the position of the anchor rectangle with the given delta.
     *
     * @param dx x delta to offset the anchor rectangle with
     * @param dy y delta to offset the anchor rectangle with
     */
    public fun setOffset(
        dx: Int,
        dy: Int,
    ): Unit = gdk_popup_layout_set_offset(gdkPopupLayoutPointer.reinterpret(), dx, dy)

    /**
     * Set the anchor on the anchor rectangle.
     *
     * @param anchor the new rect anchor
     */
    public fun setRectAnchor(anchor: Gravity): Unit =
        gdk_popup_layout_set_rect_anchor(gdkPopupLayoutPointer.reinterpret(), anchor.nativeValue)

    /**
     * Sets the shadow width of the popup.
     *
     * The shadow width corresponds to the part of the computed
     * surface size that would consist of the shadow margin
     * surrounding the window, would there be any.
     *
     * @param left width of the left part of the shadow
     * @param right width of the right part of the shadow
     * @param top height of the top part of the shadow
     * @param bottom height of the bottom part of the shadow
     * @since 4.2
     */
    @GdkVersion4_2
    public fun setShadowWidth(
        left: Int,
        right: Int,
        top: Int,
        bottom: Int,
    ): Unit = gdk_popup_layout_set_shadow_width(gdkPopupLayoutPointer.reinterpret(), left, right, top, bottom)

    /**
     * Set the anchor on the popup surface.
     *
     * @param anchor the new popup surface anchor
     */
    public fun setSurfaceAnchor(anchor: Gravity): Unit =
        gdk_popup_layout_set_surface_anchor(gdkPopupLayoutPointer.reinterpret(), anchor.nativeValue)

    /**
     * Decreases the reference count of @value.
     */
    public fun unref(): Unit = gdk_popup_layout_unref(gdkPopupLayoutPointer.reinterpret())

    public companion object : RecordCompanion<PopupLayout, GdkPopupLayout> {
        /**
         * Create a popup layout description.
         *
         * Used together with [method@Gdk.Popup.present] to describe how a popup
         * surface should be placed and behave on-screen.
         *
         * @anchor_rect is relative to the top-left corner of the surface's parent.
         * @rect_anchor and @surface_anchor determine anchor points on @anchor_rect
         * and surface to pin together.
         *
         * The position of @anchor_rect's anchor point can optionally be offset using
         * [method@Gdk.PopupLayout.set_offset], which is equivalent to offsetting the
         * position of surface.
         *
         * @param anchorRect the anchor `GdkRectangle` to align @surface with
         * @param rectAnchor the point on @anchor_rect to align with @surface's anchor point
         * @param surfaceAnchor the point on @surface to align with @rect's anchor point
         * @return newly created instance of `GdkPopupLayout`
         */
        public fun new(
            anchorRect: Rectangle,
            rectAnchor: Gravity,
            surfaceAnchor: Gravity,
        ): PopupLayout =
            PopupLayout(
                gdk_popup_layout_new(
                    anchorRect.gdkRectanglePointer.reinterpret(),
                    rectAnchor.nativeValue,
                    surfaceAnchor.nativeValue
                )!!.reinterpret()
            )

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): PopupLayout =
            PopupLayout(pointer.reinterpret())
    }
}

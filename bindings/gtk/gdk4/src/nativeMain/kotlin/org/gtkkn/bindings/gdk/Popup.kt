// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkPopup
import org.gtkkn.native.gdk.gdk_popup_get_autohide
import org.gtkkn.native.gdk.gdk_popup_get_parent
import org.gtkkn.native.gdk.gdk_popup_get_position_x
import org.gtkkn.native.gdk.gdk_popup_get_position_y
import org.gtkkn.native.gdk.gdk_popup_get_rect_anchor
import org.gtkkn.native.gdk.gdk_popup_get_surface_anchor
import org.gtkkn.native.gdk.gdk_popup_get_type
import org.gtkkn.native.gdk.gdk_popup_present
import kotlin.Boolean
import kotlin.Int

/**
 * A `GdkPopup` is a surface that is attached to another surface.
 *
 * The `GdkPopup` is positioned relative to its parent surface.
 *
 * `GdkPopup`s are typically used to implement menus and similar popups.
 * They can be modal, which is indicated by the [property@Gdk.Popup:autohide]
 * property.
 */
public interface Popup :
    Interface,
    KGTyped {
    public val gdkPopupPointer: CPointer<GdkPopup>

    /**
     * Whether to hide on outside clicks.
     */
    public val autohide: Boolean
        /**
         * Returns whether this popup is set to hide on outside clicks.
         *
         * @return true if @popup will autohide
         */
        get() = gdk_popup_get_autohide(gdkPopupPointer.reinterpret()).asBoolean()

    /**
     * The parent surface.
     */
    public val parent: Surface?
        /**
         * Returns the parent surface of a popup.
         *
         * @return the parent surface
         */
        get() =
            gdk_popup_get_parent(gdkPopupPointer.reinterpret())?.run {
                Surface(reinterpret())
            }

    /**
     * Returns whether this popup is set to hide on outside clicks.
     *
     * @return true if @popup will autohide
     */
    public fun getAutohide(): Boolean = gdk_popup_get_autohide(gdkPopupPointer.reinterpret()).asBoolean()

    /**
     * Returns the parent surface of a popup.
     *
     * @return the parent surface
     */
    public fun getParent(): Surface? =
        gdk_popup_get_parent(gdkPopupPointer.reinterpret())?.run {
            Surface(reinterpret())
        }

    /**
     * Obtains the position of the popup relative to its parent.
     *
     * @return the X coordinate of @popup position
     */
    public fun getPositionX(): Int = gdk_popup_get_position_x(gdkPopupPointer.reinterpret())

    /**
     * Obtains the position of the popup relative to its parent.
     *
     * @return the Y coordinate of @popup position
     */
    public fun getPositionY(): Int = gdk_popup_get_position_y(gdkPopupPointer.reinterpret())

    /**
     * Gets the current popup rectangle anchor.
     *
     * The value returned may change after calling [method@Gdk.Popup.present],
     * or after the [signal@Gdk.Surface::layout] signal is emitted.
     *
     * @return the current rectangle anchor value of @popup
     */
    public fun getRectAnchor(): Gravity =
        gdk_popup_get_rect_anchor(gdkPopupPointer.reinterpret()).run {
            Gravity.fromNativeValue(this)
        }

    /**
     * Gets the current popup surface anchor.
     *
     * The value returned may change after calling [method@Gdk.Popup.present],
     * or after the [signal@Gdk.Surface::layout] signal is emitted.
     *
     * @return the current surface anchor value of @popup
     */
    public fun getSurfaceAnchor(): Gravity =
        gdk_popup_get_surface_anchor(gdkPopupPointer.reinterpret()).run {
            Gravity.fromNativeValue(this)
        }

    /**
     * Present @popup after having processed the `GdkPopupLayout` rules.
     *
     * If the popup was previously now showing, it will be showed,
     * otherwise it will change position according to @layout.
     *
     * After calling this function, the result should be handled in response
     * to the [signal@Gdk.Surface::layout] signal being emitted. The resulting
     * popup position can be queried using [method@Gdk.Popup.get_position_x],
     * [method@Gdk.Popup.get_position_y], and the resulting size will be sent as
     * parameters in the layout signal. Use [method@Gdk.Popup.get_rect_anchor]
     * and [method@Gdk.Popup.get_surface_anchor] to get the resulting anchors.
     *
     * Presenting may fail, for example if the @popup is set to autohide
     * and is immediately hidden upon being presented. If presenting failed,
     * the [signal@Gdk.Surface::layout] signal will not me emitted.
     *
     * @param width the unconstrained popup width to layout
     * @param height the unconstrained popup height to layout
     * @param layout the `GdkPopupLayout` object used to layout
     * @return false if it failed to be presented, otherwise true.
     */
    public fun present(
        width: Int,
        height: Int,
        layout: PopupLayout,
    ): Boolean =
        gdk_popup_present(
            gdkPopupPointer.reinterpret(),
            width,
            height,
            layout.gdkPopupLayoutPointer.reinterpret()
        ).asBoolean()

    private data class Wrapper(
        private val pointer: CPointer<GdkPopup>,
    ) : Popup {
        override val gdkPopupPointer: CPointer<GdkPopup> = pointer
    }

    public companion object : TypeCompanion<Popup> {
        override val type: GeneratedInterfaceKGType<Popup> =
            GeneratedInterfaceKGType(gdk_popup_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GdkPopup>): Popup = Wrapper(pointer)
    }
}

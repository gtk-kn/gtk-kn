// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gdk.GdkPopup
import org.gtkkn.native.gdk.gdk_popup_get_autohide
import org.gtkkn.native.gdk.gdk_popup_get_parent
import org.gtkkn.native.gdk.gdk_popup_get_position_x
import org.gtkkn.native.gdk.gdk_popup_get_position_y
import org.gtkkn.native.gdk.gdk_popup_get_rect_anchor
import org.gtkkn.native.gdk.gdk_popup_get_surface_anchor
import org.gtkkn.native.gdk.gdk_popup_get_type
import org.gtkkn.native.gdk.gdk_popup_present
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import kotlin.Boolean

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
    Proxy,
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
        get() = gdk_popup_get_autohide(gdkPopupPointer).asBoolean()

    /**
     * The parent surface.
     */
    public val parent: Surface?
        /**
         * Returns the parent surface of a popup.
         *
         * @return the parent surface
         */
        get() = gdk_popup_get_parent(gdkPopupPointer)?.run {
            InstanceCache.get(this, true) { Surface.SurfaceImpl(reinterpret()) }!!
        }

    /**
     * Returns whether this popup is set to hide on outside clicks.
     *
     * @return true if @popup will autohide
     */
    public fun getAutohide(): Boolean = gdk_popup_get_autohide(gdkPopupPointer).asBoolean()

    /**
     * Returns the parent surface of a popup.
     *
     * @return the parent surface
     */
    public fun getParent(): Surface? = gdk_popup_get_parent(gdkPopupPointer)?.run {
        InstanceCache.get(this, true) { Surface.SurfaceImpl(reinterpret()) }!!
    }

    /**
     * Obtains the position of the popup relative to its parent.
     *
     * @return the X coordinate of @popup position
     */
    public fun getPositionX(): gint = gdk_popup_get_position_x(gdkPopupPointer)

    /**
     * Obtains the position of the popup relative to its parent.
     *
     * @return the Y coordinate of @popup position
     */
    public fun getPositionY(): gint = gdk_popup_get_position_y(gdkPopupPointer)

    /**
     * Gets the current popup rectangle anchor.
     *
     * The value returned may change after calling [method@Gdk.Popup.present],
     * or after the [signal@Gdk.Surface::layout] signal is emitted.
     *
     * @return the current rectangle anchor value of @popup
     */
    public fun getRectAnchor(): Gravity = gdk_popup_get_rect_anchor(gdkPopupPointer).run {
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
    public fun getSurfaceAnchor(): Gravity = gdk_popup_get_surface_anchor(gdkPopupPointer).run {
        Gravity.fromNativeValue(this)
    }

    /**
     * Present @popup after having processed the `GdkPopupLayout` rules.
     *
     * If the popup was previously not showing, it will be shown,
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
    public fun present(width: gint, height: gint, layout: PopupLayout): Boolean =
        gdk_popup_present(gdkPopupPointer, width, height, layout.gdkPopupLayoutPointer).asBoolean()

    /**
     * The PopupImpl type represents a native instance of the Popup interface.
     *
     * @constructor Creates a new instance of Popup for the provided [CPointer].
     */
    public class PopupImpl(gdkPopupPointer: CPointer<GdkPopup>) :
        Surface(gdkPopupPointer.reinterpret()),
        Popup {
        init {
            Gdk
        }

        override val gdkPopupPointer: CPointer<GdkPopup> = gdkPopupPointer
    }

    public companion object : TypeCompanion<Popup> {
        override val type: GeneratedInterfaceKGType<Popup> =
            GeneratedInterfaceKGType(getTypeOrNull()!!) { PopupImpl(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Get the GType of Popup
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_popup_get_type()

        /**
         * Gets the GType of from the symbol `gdk_popup_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? = org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gdk_popup_get_type")
    }
}

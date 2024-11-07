// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import org.gtkkn.native.atk.AtkLayer

/**
 * Describes the layer of a component
 *
 * These enumerated "layer values" are used when determining which UI
 * rendering layer a component is drawn into, which can help in making
 * determinations of when components occlude one another.
 */
public enum class Layer(
    public val nativeValue: AtkLayer,
) {
    /**
     * The object does not have a layer
     */
    INVALID(AtkLayer.ATK_LAYER_INVALID),

    /**
     * This layer is reserved for the desktop background
     */
    BACKGROUND(AtkLayer.ATK_LAYER_BACKGROUND),

    /**
     * This layer is used for Canvas components
     */
    CANVAS(AtkLayer.ATK_LAYER_CANVAS),

    /**
     * This layer is normally used for components
     */
    WIDGET(AtkLayer.ATK_LAYER_WIDGET),

    /**
     * This layer is used for layered components
     */
    MDI(AtkLayer.ATK_LAYER_MDI),

    /**
     * This layer is used for popup components, such as menus
     */
    POPUP(AtkLayer.ATK_LAYER_POPUP),

    /**
     * This layer is reserved for future use.
     */
    OVERLAY(AtkLayer.ATK_LAYER_OVERLAY),

    /**
     * This layer is used for toplevel windows.
     */
    WINDOW(AtkLayer.ATK_LAYER_WINDOW),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AtkLayer): Layer =
            when (nativeValue) {
                AtkLayer.ATK_LAYER_INVALID -> INVALID
                AtkLayer.ATK_LAYER_BACKGROUND -> BACKGROUND
                AtkLayer.ATK_LAYER_CANVAS -> CANVAS
                AtkLayer.ATK_LAYER_WIDGET -> WIDGET
                AtkLayer.ATK_LAYER_MDI -> MDI
                AtkLayer.ATK_LAYER_POPUP -> POPUP
                AtkLayer.ATK_LAYER_OVERLAY -> OVERLAY
                AtkLayer.ATK_LAYER_WINDOW -> WINDOW
                else -> error("invalid nativeValue")
            }
    }
}

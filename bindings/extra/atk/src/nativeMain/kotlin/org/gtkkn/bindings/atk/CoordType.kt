// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import org.gtkkn.native.atk.AtkCoordType

/**
 * Specifies how xy coordinates are to be interpreted. Used by functions such
 * as atk_component_get_position() and atk_text_get_character_extents()
 */
public enum class CoordType(
    public val nativeValue: AtkCoordType,
) {
    /**
     * specifies xy coordinates relative to the screen
     */
    SCREEN(AtkCoordType.ATK_XY_SCREEN),

    /**
     * specifies xy coordinates relative to the widget's
     * top-level window
     */
    WINDOW(AtkCoordType.ATK_XY_WINDOW),

    /**
     * specifies xy coordinates relative to the widget's
     * immediate parent. Since: 2.30
     */
    PARENT(AtkCoordType.ATK_XY_PARENT),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: AtkCoordType): CoordType =
            when (nativeValue) {
                AtkCoordType.ATK_XY_SCREEN -> SCREEN
                AtkCoordType.ATK_XY_WINDOW -> WINDOW
                AtkCoordType.ATK_XY_PARENT -> PARENT
                else -> error("invalid nativeValue")
            }
    }
}

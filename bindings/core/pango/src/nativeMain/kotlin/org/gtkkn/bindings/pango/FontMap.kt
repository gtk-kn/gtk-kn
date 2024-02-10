// This is a generated file. Do not modify.
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.pango.PangoFontMap
import org.gtkkn.native.pango.pango_font_map_changed
import org.gtkkn.native.pango.pango_font_map_get_family
import org.gtkkn.native.pango.pango_font_map_get_serial
import org.gtkkn.native.pango.pango_font_map_get_type
import kotlin.String
import kotlin.UInt
import kotlin.Unit

/**
 * A `PangoFontMap` represents the set of fonts available for a
 * particular rendering system.
 *
 * This is a virtual object with implementations being specific to
 * particular rendering systems.
 *
 * ## Skipped during bindings generation
 *
 * - method `create_context`: C function pango_font_map_create_context is ignored
 * - parameter `families`: families: Out parameter is not supported
 * - parameter `context`: C Type PangoContext is ignored
 * - parameter `context`: C Type PangoContext is ignored
 */
public open class FontMap(
    pointer: CPointer<PangoFontMap>,
) : Object(pointer.reinterpret()), KGTyped {
    public val pangoFontMapPointer: CPointer<PangoFontMap>
        get() = gPointer.reinterpret()

    /**
     * Forces a change in the context, which will cause any `PangoContext`
     * using this fontmap to change.
     *
     * This function is only useful when implementing a new backend
     * for Pango, something applications won't do. Backends should
     * call this function if they have attached extra data to the
     * context and such data is changed.
     *
     * @since 1.34
     */
    public open fun changed(): Unit = pango_font_map_changed(pangoFontMapPointer.reinterpret())

    /**
     * Gets a font family by name.
     *
     * @param name a family name
     * @return the `PangoFontFamily`
     * @since 1.46
     */
    public open fun getFamily(name: String): FontFamily =
        pango_font_map_get_family(pangoFontMapPointer.reinterpret(), name)!!.run {
            FontFamily(reinterpret())
        }

    /**
     * Returns the current serial number of @fontmap.
     *
     * The serial number is initialized to an small number larger than zero
     * when a new fontmap is created and is increased whenever the fontmap
     * is changed. It may wrap, but will never have the value 0. Since it can
     * wrap, never compare it with "less than", always use "not equals".
     *
     * The fontmap can only be changed using backend-specific API, like changing
     * fontmap resolution.
     *
     * This can be used to automatically detect changes to a `PangoFontMap`,
     * like in `PangoContext`.
     *
     * @return The current serial number of @fontmap.
     * @since 1.32.4
     */
    public open fun getSerial(): UInt = pango_font_map_get_serial(pangoFontMapPointer.reinterpret())

    public companion object : TypeCompanion<FontMap> {
        override val type: GeneratedClassKGType<FontMap> =
            GeneratedClassKGType(pango_font_map_get_type()) { FontMap(it.reinterpret()) }

        init {
            PangoTypeProvider.register()
        }
    }
}

// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwSqueezerPage
import org.gtkkn.native.adw.adw_squeezer_page_get_child
import org.gtkkn.native.adw.adw_squeezer_page_get_enabled
import org.gtkkn.native.adw.adw_squeezer_page_get_type
import org.gtkkn.native.adw.adw_squeezer_page_set_enabled
import org.gtkkn.native.gobject.GType
import kotlin.Boolean

/**
 * An auxiliary class used by [class@Squeezer].
 */
public class SqueezerPage(public val adwSqueezerPagePointer: CPointer<AdwSqueezerPage>) :
    Object(adwSqueezerPagePointer.reinterpret()),
    KGTyped {
    /**
     * The the squeezer child to which the page belongs.
     */
    public val child: Widget
        /**
         * Returns the squeezer child to which @self belongs.
         *
         * @return the child to which @self belongs
         */
        get() = adw_squeezer_page_get_child(adwSqueezerPagePointer)!!.run {
            Widget.WidgetImpl(this)
        }

    /**
     * Whether the child is enabled.
     *
     * If a child is disabled, it will be ignored when looking for the child
     * fitting the available size best.
     *
     * This allows to programmatically and prematurely hide a child even if it
     * fits in the available space.
     *
     * This can be used e.g. to ensure a certain child is hidden below a certain
     * window width, or any other constraint you find suitable.
     */
    public var enabled: Boolean
        /**
         * Gets whether @self is enabled.
         *
         * @return whether @self is enabled
         */
        get() = adw_squeezer_page_get_enabled(adwSqueezerPagePointer).asBoolean()

        /**
         * Sets whether @self is enabled.
         *
         * If a child is disabled, it will be ignored when looking for the child
         * fitting the available size best.
         *
         * This allows to programmatically and prematurely hide a child even if it fits
         * in the available space.
         *
         * This can be used e.g. to ensure a certain child is hidden below a certain
         * window width, or any other constraint you find suitable.
         *
         * @param enabled whether @self is enabled
         */
        set(enabled) = adw_squeezer_page_set_enabled(adwSqueezerPagePointer, enabled.asGBoolean())

    public companion object : TypeCompanion<SqueezerPage> {
        override val type: GeneratedClassKGType<SqueezerPage> =
            GeneratedClassKGType(adw_squeezer_page_get_type()) { SqueezerPage(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of SqueezerPage
         *
         * @return the GType
         */
        public fun getType(): GType = adw_squeezer_page_get_type()
    }
}

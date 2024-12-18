// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwLeafletPage
import org.gtkkn.native.adw.adw_leaflet_page_get_child
import org.gtkkn.native.adw.adw_leaflet_page_get_name
import org.gtkkn.native.adw.adw_leaflet_page_get_navigatable
import org.gtkkn.native.adw.adw_leaflet_page_get_type
import org.gtkkn.native.adw.adw_leaflet_page_set_name
import org.gtkkn.native.adw.adw_leaflet_page_set_navigatable
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.String

/**
 * An auxiliary class used by [class@Leaflet].
 */
public class LeafletPage(pointer: CPointer<AdwLeafletPage>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val adwLeafletPagePointer: CPointer<AdwLeafletPage>
        get() = gPointer.reinterpret()

    /**
     * The leaflet child to which the page belongs.
     */
    public val child: Widget
        /**
         * Gets the leaflet child to which @self belongs.
         *
         * @return the child to which @self belongs
         */
        get() = adw_leaflet_page_get_child(adwLeafletPagePointer.reinterpret())!!.run {
            Widget(reinterpret())
        }

    /**
     * The name of the child page.
     */
    public var name: String?
        /**
         * Gets the name of @self.
         *
         * @return the name of @self.
         */
        get() = adw_leaflet_page_get_name(adwLeafletPagePointer.reinterpret())?.toKString()

        /**
         * Sets the name of the @self.
         *
         * @param name the new value to set
         */
        set(name) = adw_leaflet_page_set_name(adwLeafletPagePointer.reinterpret(), name)

    /**
     * Whether the child can be navigated to when folded.
     *
     * If `FALSE`, the child will be ignored by
     * [method@Leaflet.get_adjacent_child], [method@Leaflet.navigate], and swipe
     * gestures.
     *
     * This can be used used to prevent switching to widgets like separators.
     */
    public var navigatable: Boolean
        /**
         * Gets whether the child can be navigated to when folded.
         *
         * @return whether @self can be navigated to when folded
         */
        get() = adw_leaflet_page_get_navigatable(adwLeafletPagePointer.reinterpret()).asBoolean()

        /**
         * Sets whether @self can be navigated to when folded.
         *
         * If `FALSE`, the child will be ignored by [method@Leaflet.get_adjacent_child],
         * [method@Leaflet.navigate], and swipe gestures.
         *
         * This can be used used to prevent switching to widgets like separators.
         *
         * @param navigatable whether @self can be navigated to when folded
         */
        set(
            navigatable
        ) = adw_leaflet_page_set_navigatable(adwLeafletPagePointer.reinterpret(), navigatable.asGBoolean())

    public companion object : TypeCompanion<LeafletPage> {
        override val type: GeneratedClassKGType<LeafletPage> =
            GeneratedClassKGType(adw_leaflet_page_get_type()) { LeafletPage(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of LeafletPage
         *
         * @return the GType
         */
        public fun getType(): GType = adw_leaflet_page_get_type()
    }
}

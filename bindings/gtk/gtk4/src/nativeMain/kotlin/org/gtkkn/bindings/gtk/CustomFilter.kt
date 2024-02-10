// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkCustomFilter
import org.gtkkn.native.gtk.gtk_custom_filter_get_type
import org.gtkkn.native.gtk.gtk_custom_filter_new
import org.gtkkn.native.gtk.gtk_custom_filter_set_filter_func
import kotlin.Unit

/**
 * `GtkCustomFilter` determines whether to include items with a callback.
 */
public open class CustomFilter(
    pointer: CPointer<GtkCustomFilter>,
) : Filter(pointer.reinterpret()), KGTyped {
    public val gtkCustomFilterPointer: CPointer<GtkCustomFilter>
        get() = gPointer.reinterpret()

    /**
     * Creates a new filter using the given @match_func to filter
     * items.
     *
     * If @match_func is null, the filter matches all items.
     *
     * If the filter func changes its filtering behavior,
     * gtk_filter_changed() needs to be called.
     *
     * @param matchFunc function to filter items
     * @return a new `GtkCustomFilter`
     */
    public constructor(matchFunc: CustomFilterFunc) :
        this(
            gtk_custom_filter_new(
                CustomFilterFuncFunc.reinterpret(),
                StableRef.create(matchFunc).asCPointer(),
                staticStableRefDestroy.reinterpret()
            )!!.reinterpret()
        )

    /**
     * Sets the function used for filtering items.
     *
     * If @match_func is null, the filter matches all items.
     *
     * If the filter func changes its filtering behavior,
     * gtk_filter_changed() needs to be called.
     *
     * If a previous function was set, its @user_destroy will be
     * called now.
     *
     * @param matchFunc function to filter items
     */
    public open fun setFilterFunc(matchFunc: CustomFilterFunc): Unit =
        gtk_custom_filter_set_filter_func(
            gtkCustomFilterPointer.reinterpret(),
            CustomFilterFuncFunc.reinterpret(),
            StableRef.create(matchFunc).asCPointer(),
            staticStableRefDestroy.reinterpret()
        )

    public companion object : TypeCompanion<CustomFilter> {
        override val type: GeneratedClassKGType<CustomFilter> =
            GeneratedClassKGType(gtk_custom_filter_get_type()) {
                CustomFilter(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }
    }
}

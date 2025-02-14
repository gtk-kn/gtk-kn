// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.adw.annotations.AdwVersion1_6
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.Buildable
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.adw.AdwLayout
import org.gtkkn.native.adw.adw_layout_get_content
import org.gtkkn.native.adw.adw_layout_get_name
import org.gtkkn.native.adw.adw_layout_get_type
import org.gtkkn.native.adw.adw_layout_new
import org.gtkkn.native.adw.adw_layout_set_name
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkBuildable
import kotlin.String

/**
 * An individual layout in [class@MultiLayoutView].
 * @since 1.6
 */
@AdwVersion1_6
public class Layout(public val adwLayoutPointer: CPointer<AdwLayout>) :
    Object(adwLayoutPointer.reinterpret()),
    Buildable,
    KGTyped {
    init {
        Adw
    }

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    /**
     * The content widget.
     *
     * @since 1.6
     */
    @AdwVersion1_6
    public val content: Widget
        /**
         * Gets the content widget.
         *
         * @return The content
         * @since 1.6
         */
        get() = adw_layout_get_content(adwLayoutPointer)!!.run {
            InstanceCache.get(this, true) { Widget.WidgetImpl(reinterpret()) }!!
        }

    /**
     * The name of the layout.
     *
     * @since 1.6
     */
    @AdwVersion1_6
    public var name: String?
        /**
         * Gets the name of the layout.
         *
         * @return the name of the layout
         * @since 1.6
         */
        get() = adw_layout_get_name(adwLayoutPointer)?.toKString()

        /**
         * Sets the name of the layout.
         *
         * @param name the layout name
         * @since 1.6
         */
        @AdwVersion1_6
        set(name) = adw_layout_set_name(adwLayoutPointer, name)

    /**
     * Creates a new `AdwLayout` that contains @content.
     *
     * @param content the content widget to use
     * @return a new `AdwLayout`
     * @since 1.6
     */
    public constructor(content: Widget) : this(adw_layout_new(content.gtkWidgetPointer)!!) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<Layout> {
        override val type: GeneratedClassKGType<Layout> =
            GeneratedClassKGType(getTypeOrNull()!!) { Layout(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of Layout
         *
         * @return the GType
         */
        public fun getType(): GType = adw_layout_get_type()

        /**
         * Gets the GType of from the symbol `adw_layout_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? = org.gtkkn.extensions.glib.cinterop.getTypeOrNull("adw_layout_get_type")
    }
}

// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.adw.annotations.AdwVersion1_6
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.adw.AdwLayoutSlot
import org.gtkkn.native.adw.adw_layout_slot_get_slot_id
import org.gtkkn.native.adw.adw_layout_slot_get_type
import org.gtkkn.native.adw.adw_layout_slot_new
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.String

/**
 * A child slot within [class@Layout].
 *
 * While it contains a layout child, the [property@Gtk.Widget:visible] property
 * of the slot is updated to match that of the layout child.
 *
 * See [class@MultiLayoutView].
 * @since 1.6
 */
@AdwVersion1_6
public class LayoutSlot(public val adwLayoutSlotPointer: CPointer<AdwLayoutSlot>) :
    Widget(adwLayoutSlotPointer.reinterpret()),
    KGTyped {
    init {
        Adw
    }

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * The slot ID.
     *
     * See [method@MultiLayoutView.set_child].
     *
     * @since 1.6
     */
    @AdwVersion1_6
    public val id: String
        /**
         * Gets the slot id of @self.
         *
         * @return the slot ID
         * @since 1.6
         */
        get() = adw_layout_slot_get_slot_id(adwLayoutSlotPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Creates a new `AdwLayoutSlot` with its ID set to @id.
     *
     * @param id the slot ID
     * @return a new `AdwLayoutSlot`
     * @since 1.6
     */
    public constructor(id: String) : this(adw_layout_slot_new(id)!!.reinterpret()) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<LayoutSlot> {
        override val type: GeneratedClassKGType<LayoutSlot> =
            GeneratedClassKGType(getTypeOrNull()!!) { LayoutSlot(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of LayoutSlot
         *
         * @return the GType
         */
        public fun getType(): GType = adw_layout_slot_get_type()

        /**
         * Gets the GType of from the symbol `adw_layout_slot_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("adw_layout_slot_get_type")
    }
}

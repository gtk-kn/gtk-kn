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
import org.gtkkn.native.adw.AdwMultiLayoutView
import org.gtkkn.native.adw.adw_multi_layout_view_add_layout
import org.gtkkn.native.adw.adw_multi_layout_view_get_child
import org.gtkkn.native.adw.adw_multi_layout_view_get_layout
import org.gtkkn.native.adw.adw_multi_layout_view_get_layout_by_name
import org.gtkkn.native.adw.adw_multi_layout_view_get_layout_name
import org.gtkkn.native.adw.adw_multi_layout_view_get_type
import org.gtkkn.native.adw.adw_multi_layout_view_new
import org.gtkkn.native.adw.adw_multi_layout_view_remove_layout
import org.gtkkn.native.adw.adw_multi_layout_view_set_child
import org.gtkkn.native.adw.adw_multi_layout_view_set_layout
import org.gtkkn.native.adw.adw_multi_layout_view_set_layout_name
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.String
import kotlin.Unit

/**
 * A widget for switching between different layouts.
 *
 * `AdwMultiLayoutView` contains layouts and children. Each child has
 * an ID, each layout has slots inside it, each slot also has an ID. When
 * switching layouts, children are inserted into slots with matching IDs. The
 * [property@Gtk.Widget:visible] property of each slot is updated to match
 * that of the inserted child.
 *
 * This can be useful for rearranging children when it's difficult to do so
 * otherwise, for example to move a child from a sidebar to a bottom bar.
 *
 * The currently used layout can be switched using the
 * [property@MultiLayoutView:layout] or [property@MultiLayoutView:layout-name]
 * properties. For example, it can be done via a [class@Adw.Breakpoint] setter
 * to change layouts depending on the window size.
 *
 * ## AdwMultiLayoutView as GtkBuildable
 *
 * The `AdwMultiLayoutView` implementation of the [iface@Gtk.Buildable]
 * interface supports adding layouts via `<child>` element with the `type`
 * attribute omitted.
 *
 * It also supports setting children via `<child type="ID">`.
 *
 * Example of an `AdwMultiLayoutView` UI definition that can display a secondary
 * child as either a sidebar or a bottom sheet.
 *
 * ```xml
 * <object class="AdwMultiLayoutView">
 *   <child>
 *     <object class="AdwLayout">
 *       <property name="name">sidebar</property>
 *       <property name="content">
 *         <object class="AdwOverlaySplitView">
 *           <property name="sidebar">
 *             <object class="AdwLayoutSlot">
 *               <property name="id">secondary</property>
 *             </object>
 *           </property>
 *           <property name="content">
 *             <object class="AdwLayoutSlot">
 *               <property name="id">primary</property>
 *             </object>
 *           </property>
 *         </object>
 *       </property>
 *     </object>
 *   </child>
 *   <child>
 *     <object class="AdwLayout">
 *       <property name="name">bottom-sheet</property>
 *       <property name="content">
 *         <object class="AdwBottomSheet">
 *           <property name="open">True</property>
 *           <property name="content">
 *             <object class="AdwLayoutSlot">
 *               <property name="id">primary</property>
 *             </object>
 *           </property>
 *           <property name="sheet">
 *             <object class="AdwLayoutSlot">
 *               <property name="id">secondary</property>
 *             </object>
 *           </property>
 *         </object>
 *       </property>
 *     </object>
 *   </child>
 *   <child type="primary">
 *     <!-- ... -->
 *   </child>
 *   <child type="secondary">
 *     <!-- ... -->
 *   </child>
 * </object>
 * ```
 *
 * ## CSS nodes
 *
 * `AdwMultiLayoutView` has a single CSS node with name `multi-layout-view`.
 *
 * ## Skipped during bindings generation
 *
 * - method `layout`: Property TypeInfo of getter and setter do not match
 * - method `layout-name`: Property TypeInfo of getter and setter do not match
 *
 * @since 1.6
 */
@AdwVersion1_6
public class MultiLayoutView(public val adwMultiLayoutViewPointer: CPointer<AdwMultiLayoutView>) :
    Widget(adwMultiLayoutViewPointer.reinterpret()),
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
     * Creates a new `AdwMultiLayoutView`.
     *
     * @return the newly created `AdwMultiLayoutView`
     * @since 1.6
     */
    public constructor() : this(adw_multi_layout_view_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Adds @layout to @self.
     *
     * @param layout the layout to add
     * @since 1.6
     */
    @AdwVersion1_6
    public fun addLayout(layout: Layout): Unit =
        adw_multi_layout_view_add_layout(adwMultiLayoutViewPointer, layout.adwLayoutPointer)

    /**
     * Gets the child for @id to @self.
     *
     * @param id the id of the child
     * @return the child for @id
     * @since 1.6
     */
    @AdwVersion1_6
    public fun getChild(id: String): Widget? = adw_multi_layout_view_get_child(adwMultiLayoutViewPointer, id)?.run {
        InstanceCache.get(this, true) { Widget.WidgetImpl(reinterpret()) }!!
    }

    /**
     * Gets the currently used layout of @self.
     *
     * @return the current layout
     * @since 1.6
     */
    @AdwVersion1_6
    public fun getLayout(): Layout? = adw_multi_layout_view_get_layout(adwMultiLayoutViewPointer)?.run {
        InstanceCache.get(this, true) { Layout(reinterpret()) }!!
    }

    /**
     * Gets layout with the name @name from @self, or `NULL` if it doesn't exist.
     *
     * See [property@Layout:name].
     *
     * @param name the name of the layout
     * @return the layout with @name
     * @since 1.6
     */
    @AdwVersion1_6
    public fun getLayoutByName(name: String): Layout? =
        adw_multi_layout_view_get_layout_by_name(adwMultiLayoutViewPointer, name)?.run {
            InstanceCache.get(this, true) { Layout(reinterpret()) }!!
        }

    /**
     * Returns the name of the currently used layout of @self.
     *
     * @return the name of the current layout
     * @since 1.6
     */
    @AdwVersion1_6
    public fun getLayoutName(): String? = adw_multi_layout_view_get_layout_name(adwMultiLayoutViewPointer)?.toKString()

    /**
     * Removes @layout from @self.
     *
     * @param layout the layout to add
     * @since 1.6
     */
    @AdwVersion1_6
    public fun removeLayout(layout: Layout): Unit =
        adw_multi_layout_view_remove_layout(adwMultiLayoutViewPointer, layout.adwLayoutPointer)

    /**
     * Sets @child as the child for @id in @self.
     *
     * When changing layouts, it will be inserted into the slot with @id.
     *
     * @param id the id of the child
     * @param child the child to set
     * @since 1.6
     */
    @AdwVersion1_6
    public fun setChild(id: String, child: Widget): Unit =
        adw_multi_layout_view_set_child(adwMultiLayoutViewPointer, id, child.gtkWidgetPointer)

    /**
     * Makes @layout the current layout of @self.
     *
     * @param layout a layout in @self
     * @since 1.6
     */
    @AdwVersion1_6
    public fun setLayout(layout: Layout): Unit =
        adw_multi_layout_view_set_layout(adwMultiLayoutViewPointer, layout.adwLayoutPointer)

    /**
     * Makes the layout with @name the current layout of @self.
     *
     * See [property@Layout:name].
     *
     * @param name the name of the layout
     * @since 1.6
     */
    @AdwVersion1_6
    public fun setLayoutName(name: String): Unit =
        adw_multi_layout_view_set_layout_name(adwMultiLayoutViewPointer, name)

    public companion object : TypeCompanion<MultiLayoutView> {
        override val type: GeneratedClassKGType<MultiLayoutView> =
            GeneratedClassKGType(getTypeOrNull()!!) { MultiLayoutView(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of MultiLayoutView
         *
         * @return the GType
         */
        public fun getType(): GType = adw_multi_layout_view_get_type()

        /**
         * Gets the GType of from the symbol `adw_multi_layout_view_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("adw_multi_layout_view_get_type")
    }
}

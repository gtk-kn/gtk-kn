// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkBuilderListItemFactory
import org.gtkkn.native.gtk.gtk_builder_list_item_factory_get_bytes
import org.gtkkn.native.gtk.gtk_builder_list_item_factory_get_resource
import org.gtkkn.native.gtk.gtk_builder_list_item_factory_get_scope
import org.gtkkn.native.gtk.gtk_builder_list_item_factory_get_type
import org.gtkkn.native.gtk.gtk_builder_list_item_factory_new_from_bytes
import org.gtkkn.native.gtk.gtk_builder_list_item_factory_new_from_resource
import kotlin.String

/**
 * `GtkBuilderListItemFactory` is a `GtkListItemFactory` that creates
 * widgets by instantiating `GtkBuilder` UI templates.
 *
 * The templates must be extending `GtkListItem`, and typically use
 * `GtkExpression`s to obtain data from the items in the model.
 *
 * Example:
 * ```xml
 *   <interface>
 *     <template class="GtkListItem">
 *       <property name="child">
 *         <object class="GtkLabel">
 *           <property name="xalign">0</property>
 *           <binding name="label">
 *             <lookup name="name" type="SettingsKey">
 *               <lookup name="item">GtkListItem</lookup>
 *             </lookup>
 *           </binding>
 *         </object>
 *       </property>
 *     </template>
 *   </interface>
 * ```
 */
public open class BuilderListItemFactory(
    public val gtkBuilderListItemFactoryPointer: CPointer<GtkBuilderListItemFactory>,
) : ListItemFactory(gtkBuilderListItemFactoryPointer.reinterpret()),
    KGTyped {
    /**
     * `GBytes` containing the UI definition.
     */
    public open val bytes: Bytes
        /**
         * Gets the data used as the `GtkBuilder` UI template for constructing
         * listitems.
         *
         * @return The `GtkBuilder` data
         */
        get() = gtk_builder_list_item_factory_get_bytes(gtkBuilderListItemFactoryPointer)!!.run {
            Bytes(this)
        }

    /**
     * Path of the resource containing the UI definition.
     */
    public open val resource: String?
        /**
         * If the data references a resource, gets the path of that resource.
         *
         * @return The path to the resource
         */
        get() = gtk_builder_list_item_factory_get_resource(gtkBuilderListItemFactoryPointer)?.toKString()

    /**
     * `GtkBuilderScope` to use when instantiating listitems
     */
    public open val scope: BuilderScope?
        /**
         * Gets the scope used when constructing listitems.
         *
         * @return The scope used when constructing listitems
         */
        get() = gtk_builder_list_item_factory_get_scope(gtkBuilderListItemFactoryPointer)?.run {
            BuilderScope.BuilderScopeImpl(reinterpret())
        }

    /**
     * Creates a new `GtkBuilderListItemFactory` that instantiates widgets
     * using @bytes as the data to pass to `GtkBuilder`.
     *
     * @param scope A scope to use when instantiating
     * @param bytes the `GBytes` containing the ui file to instantiate
     * @return a new `GtkBuilderListItemFactory`
     */
    public constructor(
        scope: BuilderScope? = null,
        bytes: Bytes,
    ) : this(
        gtk_builder_list_item_factory_new_from_bytes(
            scope?.gtkBuilderScopePointer,
            bytes.glibBytesPointer
        )!!.reinterpret()
    )

    /**
     * Creates a new `GtkBuilderListItemFactory` that instantiates widgets
     * using data read from the given @resource_path to pass to `GtkBuilder`.
     *
     * @param scope A scope to use when instantiating
     * @param resourcePath valid path to a resource that contains the data
     * @return a new `GtkBuilderListItemFactory`
     */
    public constructor(
        scope: BuilderScope? = null,
        resourcePath: String,
    ) : this(
        gtk_builder_list_item_factory_new_from_resource(scope?.gtkBuilderScopePointer, resourcePath)!!.reinterpret()
    )

    public companion object : TypeCompanion<BuilderListItemFactory> {
        override val type: GeneratedClassKGType<BuilderListItemFactory> =
            GeneratedClassKGType(gtk_builder_list_item_factory_get_type()) {
                BuilderListItemFactory(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of BuilderListItemFactory
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_builder_list_item_factory_get_type()
    }
}

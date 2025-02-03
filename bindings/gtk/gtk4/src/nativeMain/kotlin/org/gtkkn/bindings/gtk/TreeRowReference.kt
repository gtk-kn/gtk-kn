// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkTreeRowReference
import org.gtkkn.native.gtk.gtk_tree_row_reference_copy
import org.gtkkn.native.gtk.gtk_tree_row_reference_deleted
import org.gtkkn.native.gtk.gtk_tree_row_reference_free
import org.gtkkn.native.gtk.gtk_tree_row_reference_get_model
import org.gtkkn.native.gtk.gtk_tree_row_reference_get_path
import org.gtkkn.native.gtk.gtk_tree_row_reference_get_type
import org.gtkkn.native.gtk.gtk_tree_row_reference_inserted
import org.gtkkn.native.gtk.gtk_tree_row_reference_new
import org.gtkkn.native.gtk.gtk_tree_row_reference_new_proxy
import org.gtkkn.native.gtk.gtk_tree_row_reference_valid
import kotlin.Boolean
import kotlin.Unit

/**
 * # ⚠️ Deprecated ⚠️
 *
 * This is deprecated since version 4.10.
 *
 * Use [iface@Gio.ListModel] instead
 * ---
 *
 * A GtkTreeRowReference tracks model changes so that it always refers to the
 * same row (a `GtkTreePath` refers to a position, not a fixed row). Create a
 * new GtkTreeRowReference with gtk_tree_row_reference_new().
 *
 * ## Skipped during bindings generation
 *
 * - parameter `new_order`: Array parameter of type gint is not supported
 */
public class TreeRowReference(public val gtkTreeRowReferencePointer: CPointer<GtkTreeRowReference>) :
    ProxyInstance(gtkTreeRowReferencePointer) {
    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     * ---
     *
     * Creates a row reference based on @path.
     *
     * This reference will keep pointing to the node pointed to
     * by @path, so long as it exists. Any changes that occur on @model are
     * propagated, and the path is updated appropriately. If
     * @path isn’t a valid path in @model, then null is returned.
     *
     * @param model a `GtkTreeModel`
     * @param path a valid `GtkTreePath` to monitor
     * @return a newly allocated `GtkTreeRowReference`
     */
    public constructor(
        model: TreeModel,
        path: TreePath,
    ) : this(gtk_tree_row_reference_new(model.gtkTreeModelPointer, path.gtkTreePathPointer)!!.reinterpret()) {
        MemoryCleaner.setBoxedType(this, getType(), owned = true)
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     * ---
     *
     * You do not need to use this function.
     *
     * Creates a row reference based on @path.
     *
     * This reference will keep pointing to the node pointed to
     * by @path, so long as it exists. If @path isn’t a valid
     * path in @model, then null is returned. However, unlike
     * references created with gtk_tree_row_reference_new(), it
     * does not listen to the model for changes. The creator of
     * the row reference must do this explicitly using
     * gtk_tree_row_reference_inserted(), gtk_tree_row_reference_deleted(),
     * gtk_tree_row_reference_reordered().
     *
     * These functions must be called exactly once per proxy when the
     * corresponding signal on the model is emitted. This single call
     * updates all row references for that proxy. Since built-in GTK
     * objects like `GtkTreeView` already use this mechanism internally,
     * using them as the proxy object will produce unpredictable results.
     * Further more, passing the same object as @model and @proxy
     * doesn’t work for reasons of internal implementation.
     *
     * This type of row reference is primarily meant by structures that
     * need to carefully monitor exactly when a row reference updates
     * itself, and is not generally needed by most applications.
     *
     * @param proxy a proxy `GObject`
     * @param model a `GtkTreeModel`
     * @param path a valid `GtkTreePath` to monitor
     * @return a newly allocated `GtkTreeRowReference`
     */
    public constructor(
        proxy: Object,
        model: TreeModel,
        path: TreePath,
    ) : this(
        gtk_tree_row_reference_new_proxy(
            proxy.gobjectObjectPointer,
            model.gtkTreeModelPointer,
            path.gtkTreePathPointer
        )!!.reinterpret()
    ) {
        MemoryCleaner.setBoxedType(this, getType(), owned = true)
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     * ---
     *
     * Copies a `GtkTreeRowReference`.
     *
     * @return a copy of @reference
     */
    public fun copy(): TreeRowReference = gtk_tree_row_reference_copy(gtkTreeRowReferencePointer)!!.run {
        TreeRowReference(this)
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     * ---
     *
     * Free’s @reference. @reference may be null
     */
    public fun free(): Unit = gtk_tree_row_reference_free(gtkTreeRowReferencePointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     * ---
     *
     * Returns the model that the row reference is monitoring.
     *
     * @return the model
     */
    public fun getModel(): TreeModel = gtk_tree_row_reference_get_model(gtkTreeRowReferencePointer)!!.run {
        TreeModel.TreeModelImpl(reinterpret())
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     * ---
     *
     * Returns a path that the row reference currently points to,
     * or null if the path pointed to is no longer valid.
     *
     * @return a current path
     */
    public fun getPath(): TreePath? = gtk_tree_row_reference_get_path(gtkTreeRowReferencePointer)?.run {
        TreePath(this)
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     * ---
     *
     * Returns true if the @reference is non-null and refers to
     * a current valid path.
     *
     * @return true if @reference points to a valid path
     */
    public fun valid(): Boolean = gtk_tree_row_reference_valid(gtkTreeRowReferencePointer).asBoolean()

    public companion object {
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         * ---
         *
         * Lets a set of row reference created by
         * gtk_tree_row_reference_new_proxy() know that the
         * model emitted the ::row-deleted signal.
         *
         * @param proxy a `GObject`
         * @param path the path position that was deleted
         */
        public fun deleted(proxy: Object, path: TreePath): Unit =
            gtk_tree_row_reference_deleted(proxy.gobjectObjectPointer, path.gtkTreePathPointer)

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         * ---
         *
         * Lets a set of row reference created by
         * gtk_tree_row_reference_new_proxy() know that the
         * model emitted the ::row-inserted signal.
         *
         * @param proxy a `GObject`
         * @param path the row position that was inserted
         */
        public fun inserted(proxy: Object, path: TreePath): Unit =
            gtk_tree_row_reference_inserted(proxy.gobjectObjectPointer, path.gtkTreePathPointer)

        /**
         * Get the GType of TreeRowReference
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_tree_row_reference_get_type()
    }
}

// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkTreeIter
import org.gtkkn.native.gtk.gtk_tree_iter_copy
import org.gtkkn.native.gtk.gtk_tree_iter_free
import org.gtkkn.native.gtk.gtk_tree_iter_get_type
import kotlin.String
import kotlin.Unit

/**
 * # ⚠️ Deprecated ⚠️
 *
 * This is deprecated since version 4.10.
 * ---
 *
 * The `GtkTreeIter` is the primary structure
 * for accessing a `GtkTreeModel`. Models are expected to put a unique
 * integer in the @stamp member, and put
 * model-specific data in the three @user_data
 * members.
 */
public class TreeIter(public val gtkTreeIterPointer: CPointer<GtkTreeIter>) : ProxyInstance(gtkTreeIterPointer) {
    /**
     * a unique stamp to catch invalid iterators
     */
    public var stamp: gint
        get() = gtkTreeIterPointer.pointed.stamp

        @UnsafeFieldSetter
        set(`value`) {
            gtkTreeIterPointer.pointed.stamp = value
        }

    /**
     * model-specific data
     */
    public var userData: gpointer
        get() = gtkTreeIterPointer.pointed.user_data!!

        @UnsafeFieldSetter
        set(`value`) {
            gtkTreeIterPointer.pointed.user_data = value
        }

    /**
     * model-specific data
     */
    public var userData2: gpointer
        get() = gtkTreeIterPointer.pointed.user_data2!!

        @UnsafeFieldSetter
        set(`value`) {
            gtkTreeIterPointer.pointed.user_data2 = value
        }

    /**
     * model-specific data
     */
    public var userData3: gpointer
        get() = gtkTreeIterPointer.pointed.user_data3!!

        @UnsafeFieldSetter
        set(`value`) {
            gtkTreeIterPointer.pointed.user_data3 = value
        }

    /**
     * Allocate a new TreeIter.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GtkTreeIter>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new TreeIter using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GtkTreeIter>().ptr)

    /**
     * Allocate a new TreeIter.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param stamp a unique stamp to catch invalid iterators
     * @param userData model-specific data
     * @param userData2 model-specific data
     * @param userData3 model-specific data
     */
    public constructor(
        stamp: gint,
        userData: gpointer,
        userData2: gpointer,
        userData3: gpointer,
    ) : this() {
        this.stamp = stamp
        this.userData = userData
        this.userData2 = userData2
        this.userData3 = userData3
    }

    /**
     * Allocate a new TreeIter using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param stamp a unique stamp to catch invalid iterators
     * @param userData model-specific data
     * @param userData2 model-specific data
     * @param userData3 model-specific data
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        stamp: gint,
        userData: gpointer,
        userData2: gpointer,
        userData3: gpointer,
        scope: AutofreeScope,
    ) : this(scope) {
        this.stamp = stamp
        this.userData = userData
        this.userData2 = userData2
        this.userData3 = userData3
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     * ---
     *
     * Creates a dynamically allocated tree iterator as a copy of @iter.
     *
     * This function is not intended for use in applications,
     * because you can just copy the structs by value
     * (`GtkTreeIter new_iter = iter;`).
     * You must free this iter with gtk_tree_iter_free().
     *
     * @return a newly-allocated copy of @iter
     */
    public fun copy(): TreeIter = gtk_tree_iter_copy(gtkTreeIterPointer)!!.run {
        TreeIter(this)
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     * ---
     *
     * Frees an iterator that has been allocated by gtk_tree_iter_copy().
     *
     * This function is mainly used for language bindings.
     */
    public fun free(): Unit = gtk_tree_iter_free(gtkTreeIterPointer)

    override fun toString(): String =
        "TreeIter(stamp=$stamp, userData=$userData, userData2=$userData2, userData3=$userData3)"

    public companion object {
        /**
         * Get the GType of TreeIter
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_tree_iter_get_type()
    }
}

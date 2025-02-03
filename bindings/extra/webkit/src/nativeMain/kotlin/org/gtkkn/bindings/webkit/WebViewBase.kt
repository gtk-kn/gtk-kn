// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.webkit.WebKitWebViewBase
import org.gtkkn.native.webkit.webkit_web_view_base_get_type

public open class WebViewBase(public val webkitWebViewBasePointer: CPointer<WebKitWebViewBase>) :
    Widget(webkitWebViewBasePointer.reinterpret()),
    KGTyped {
    init {
        WebKit
    }

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    public companion object : TypeCompanion<WebViewBase> {
        override val type: GeneratedClassKGType<WebViewBase> =
            GeneratedClassKGType(getTypeOrNull()!!) { WebViewBase(it.reinterpret()) }

        init {
            WebKitTypeProvider.register()
        }

        /**
         * Get the GType of WebViewBase
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_web_view_base_get_type()

        /**
         * Gets the GType of from the symbol `webkit_web_view_base_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("webkit_web_view_base_get_type")
    }
}

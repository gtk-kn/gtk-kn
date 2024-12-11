// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.webkit.WebKitWebViewBase
import org.gtkkn.native.webkit.webkit_web_view_base_get_type

public open class WebViewBase(pointer: CPointer<WebKitWebViewBase>) :
    Widget(pointer.reinterpret()),
    KGTyped {
    public val webkitWebViewBasePointer: CPointer<WebKitWebViewBase>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    public companion object : TypeCompanion<WebViewBase> {
        override val type: GeneratedClassKGType<WebViewBase> =
            GeneratedClassKGType(webkit_web_view_base_get_type()) { WebViewBase(it.reinterpret()) }

        init {
            WebkitTypeProvider.register()
        }

        /**
         * Get the GType of WebViewBase
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_web_view_base_get_type()
    }
}

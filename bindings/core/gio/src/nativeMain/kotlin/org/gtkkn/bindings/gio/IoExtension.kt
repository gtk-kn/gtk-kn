// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.TypeClass
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gio.GIOExtension
import org.gtkkn.native.gio.g_io_extension_get_name
import org.gtkkn.native.gio.g_io_extension_get_priority
import org.gtkkn.native.gio.g_io_extension_get_type
import org.gtkkn.native.gio.g_io_extension_ref_class
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import kotlin.String

/**
 * #GIOExtension is an opaque data structure and can only be accessed
 * using the following functions.
 */
public class IoExtension(public val gioIoExtensionPointer: CPointer<GIOExtension>) :
    ProxyInstance(gioIoExtensionPointer) {
    /**
     * Gets the name under which @extension was registered.
     *
     * Note that the same type may be registered as extension
     * for multiple extension points, under different names.
     *
     * @return the name of @extension.
     */
    public fun getName(): String =
        g_io_extension_get_name(gioIoExtensionPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Gets the priority with which @extension was registered.
     *
     * @return the priority of @extension
     */
    public fun getPriority(): gint = g_io_extension_get_priority(gioIoExtensionPointer)

    /**
     * Gets the type associated with @extension.
     *
     * @return the type of @extension
     */
    public fun getType(): GType = g_io_extension_get_type(gioIoExtensionPointer)

    /**
     * Gets a reference to the class for the type that is
     * associated with @extension.
     *
     * @return the #GTypeClass for the type of @extension
     */
    public fun refClass(): TypeClass = g_io_extension_ref_class(gioIoExtensionPointer)!!.run {
        TypeClass(this)
    }
}

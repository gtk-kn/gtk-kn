// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import org.gtkkn.bindings.glib.List
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gio.GIOExtensionPoint
import org.gtkkn.native.gio.g_io_extension_point_get_extension_by_name
import org.gtkkn.native.gio.g_io_extension_point_get_extensions
import org.gtkkn.native.gio.g_io_extension_point_get_required_type
import org.gtkkn.native.gio.g_io_extension_point_implement
import org.gtkkn.native.gio.g_io_extension_point_lookup
import org.gtkkn.native.gio.g_io_extension_point_register
import org.gtkkn.native.gio.g_io_extension_point_set_required_type
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import kotlin.String
import kotlin.Unit

/**
 * `GIOExtensionPoint` provides a mechanism for modules to extend the
 * functionality of the library or application that loaded it in an
 * organized fashion.
 *
 * An extension point is identified by a name, and it may optionally
 * require that any implementation must be of a certain type (or derived
 * thereof). Use [func@Gio.IOExtensionPoint.register] to register an
 * extension point, and [method@Gio.IOExtensionPoint.set_required_type] to
 * set a required type.
 *
 * A module can implement an extension point by specifying the
 * [type@GObject.Type] that implements the functionality. Additionally, each
 * implementation of an extension point has a name, and a priority. Use
 * [func@Gio.IOExtensionPoint.implement] to implement an extension point.
 *
 * ```c
 * GIOExtensionPoint *ep;
 *
 * // Register an extension point
 * ep = g_io_extension_point_register ("my-extension-point");
 * g_io_extension_point_set_required_type (ep, MY_TYPE_EXAMPLE);
 * ```
 *
 * ```c
 * // Implement an extension point
 * G_DEFINE_TYPE (MyExampleImpl, my_example_impl, MY_TYPE_EXAMPLE)
 * g_io_extension_point_implement ("my-extension-point",
 *                                 my_example_impl_get_type (),
 *                                 "my-example",
 *                                 10);
 * ```
 *
 *  It is up to the code that registered the extension point how
 *  it uses the implementations that have been associated with it.
 *  Depending on the use case, it may use all implementations, or
 *  only the one with the highest priority, or pick a specific
 *  one by name.
 *
 *  To avoid opening all modules just to find out what extension
 *  points they implement, GIO makes use of a caching mechanism,
 *  see [gio-querymodules](gio-querymodules.html).
 *  You are expected to run this command after installing a
 *  GIO module.
 *
 *  The `GIO_EXTRA_MODULES` environment variable can be used to
 *  specify additional directories to automatically load modules
 *  from. This environment variable has the same syntax as the
 *  `PATH`. If two modules have the same base name in different
 *  directories, then the latter one will be ignored. If additional
 *  directories are specified GIO will load modules from the built-in
 *  directory last.
 */
public class IoExtensionPoint(public val gioIoExtensionPointPointer: CPointer<GIOExtensionPoint>) :
    ProxyInstance(gioIoExtensionPointPointer) {
    /**
     * Finds a #GIOExtension for an extension point by name.
     *
     * @param name the name of the extension to get
     * @return the #GIOExtension for @extension_point that has the
     *    given name, or null if there is no extension with that name
     */
    public fun getExtensionByName(name: String): IoExtension =
        g_io_extension_point_get_extension_by_name(gioIoExtensionPointPointer, name)!!.run {
            IoExtension(this)
        }

    /**
     * Gets a list of all extensions that implement this extension point.
     * The list is sorted by priority, beginning with the highest priority.
     *
     * @return a #GList of
     *     #GIOExtensions. The list is owned by GIO and should not be
     *     modified.
     */
    public fun getExtensions(): List = g_io_extension_point_get_extensions(gioIoExtensionPointPointer)!!.run {
        List(this)
    }

    /**
     * Gets the required type for @extension_point.
     *
     * @return the #GType that all implementations must have,
     *   or %G_TYPE_INVALID if the extension point has no required type
     */
    public fun getRequiredType(): GType = g_io_extension_point_get_required_type(gioIoExtensionPointPointer)

    /**
     * Sets the required type for @extension_point to @type.
     * All implementations must henceforth have this type.
     *
     * @param type the #GType to require
     */
    public fun setRequiredType(type: GType): Unit =
        g_io_extension_point_set_required_type(gioIoExtensionPointPointer, type)

    public companion object {
        /**
         * Registers @type as extension for the extension point with name
         * @extension_point_name.
         *
         * If @type has already been registered as an extension for this
         * extension point, the existing #GIOExtension object is returned.
         *
         * @param extensionPointName the name of the extension point
         * @param type the #GType to register as extension
         * @param extensionName the name for the extension
         * @param priority the priority for the extension
         * @return a #GIOExtension object for #GType
         */
        public fun implement(
            extensionPointName: String,
            type: GType,
            extensionName: String,
            priority: gint,
        ): IoExtension = g_io_extension_point_implement(extensionPointName, type, extensionName, priority)!!.run {
            IoExtension(this)
        }

        /**
         * Looks up an existing extension point.
         *
         * @param name the name of the extension point
         * @return the #GIOExtensionPoint, or null if there
         *    is no registered extension point with the given name.
         */
        public fun lookup(name: String): IoExtensionPoint = g_io_extension_point_lookup(name)!!.run {
            IoExtensionPoint(this)
        }

        /**
         * Registers an extension point.
         *
         * @param name The name of the extension point
         * @return the new #GIOExtensionPoint. This object is
         *    owned by GIO and should not be freed.
         */
        public fun register(name: String): IoExtensionPoint = g_io_extension_point_register(name)!!.run {
            IoExtensionPoint(this)
        }
    }
}

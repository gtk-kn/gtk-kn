// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_18
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.webkit.WebKitApplicationInfo
import org.gtkkn.native.webkit.webkit_application_info_get_name
import org.gtkkn.native.webkit.webkit_application_info_new
import org.gtkkn.native.webkit.webkit_application_info_ref
import org.gtkkn.native.webkit.webkit_application_info_set_name
import org.gtkkn.native.webkit.webkit_application_info_set_version
import org.gtkkn.native.webkit.webkit_application_info_unref
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * Information about an application running in automation mode.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `major`: major: Out parameter is not supported
 */
public class ApplicationInfo(
    pointer: CPointer<WebKitApplicationInfo>,
) : Record {
    public val webkitApplicationInfoPointer: CPointer<WebKitApplicationInfo> = pointer

    /**
     * Get the name of the application.
     *
     * If webkit_application_info_set_name() hasn't been
     * called with a valid name, this returns g_get_prgname().
     *
     * @return the application name
     * @since 2.18
     */
    @WebKitVersion2_18
    public fun getName(): String =
        webkit_application_info_get_name(webkitApplicationInfoPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Atomically increments the reference count of @info by one.
     *
     * This
     * function is MT-safe and may be called from any thread.
     *
     * @return The passed in #WebKitApplicationInfo
     * @since 2.18
     */
    @WebKitVersion2_18
    public fun ref(): ApplicationInfo =
        webkit_application_info_ref(webkitApplicationInfoPointer.reinterpret())!!.run {
            ApplicationInfo(reinterpret())
        }

    /**
     * Set the name of the application.
     *
     * If not provided, or null is passed,
     * g_get_prgname() will be used.
     *
     * @param name the application name
     * @since 2.18
     */
    @WebKitVersion2_18
    public fun setName(name: String): Unit =
        webkit_application_info_set_name(webkitApplicationInfoPointer.reinterpret(), name)

    /**
     * Set the application version.
     *
     * If the application doesn't use the format
     * major.minor.micro you can pass 0 as the micro to use major.minor, or pass
     * 0 as both micro and minor to use only major number. Any other format must
     * be converted to major.minor.micro so that it can be used in version comparisons.
     *
     * @param major the major version number
     * @param minor the minor version number
     * @param micro the micro version number
     * @since 2.18
     */
    @WebKitVersion2_18
    public fun setVersion(
        major: ULong,
        minor: ULong,
        micro: ULong,
    ): Unit = webkit_application_info_set_version(webkitApplicationInfoPointer.reinterpret(), major, minor, micro)

    /**
     * Atomically decrements the reference count of @info by one.
     *
     * If the
     * reference count drops to 0, all memory allocated by the #WebKitApplicationInfo is
     * released. This function is MT-safe and may be called from any
     * thread.
     *
     * @since 2.18
     */
    @WebKitVersion2_18
    public fun unref(): Unit = webkit_application_info_unref(webkitApplicationInfoPointer.reinterpret())

    public companion object : RecordCompanion<ApplicationInfo, WebKitApplicationInfo> {
        /**
         * Creates a new #WebKitApplicationInfo
         *
         * @return the newly created #WebKitApplicationInfo.
         * @since 2.18
         */
        public fun new(): ApplicationInfo = ApplicationInfo(webkit_application_info_new()!!.reinterpret())

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): ApplicationInfo =
            ApplicationInfo(pointer.reinterpret())
    }
}

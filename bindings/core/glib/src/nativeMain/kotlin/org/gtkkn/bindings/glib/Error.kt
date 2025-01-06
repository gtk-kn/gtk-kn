// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.g_error_copy
import org.gtkkn.native.glib.g_error_free
import org.gtkkn.native.glib.g_error_matches
import org.gtkkn.native.glib.g_error_new_literal
import org.gtkkn.native.glib.g_free
import org.gtkkn.native.glib.g_strdup
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_error_get_type
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * The `GError` structure contains information about
 * an error that has occurred.
 *
 * ## Skipped during bindings generation
 *
 * - constructor `new`: Varargs parameter is not supported
 * - parameter `args`: va_list type is not supported
 * - parameter `error_type_init`: ErrorInitFunc
 * - parameter `error_type_init`: ErrorInitFunc
 */
public class Error(pointer: CPointer<GError>) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GError> = pointer

    /**
     * error domain, e.g. %G_FILE_ERROR
     */
    public var domain: Quark
        get() = gPointer.pointed.domain

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.domain = value
        }

    /**
     * error code, e.g. %G_FILE_ERROR_NOENT
     */
    public var code: gint
        get() = gPointer.pointed.code

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.code = value
        }

    /**
     * human-readable informative error message
     */
    public var message: String?
        get() = gPointer.pointed.message?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.message?.let { g_free(it) }
            gPointer.pointed.message = value?.let { g_strdup(it) }
        }

    /**
     * Makes a copy of @error.
     *
     * @return a new #GError
     */
    public fun copy(): Error = g_error_copy(gPointer.reinterpret())!!.run {
        Error(reinterpret())
    }

    /**
     * Frees a #GError and associated resources.
     */
    public fun free(): Unit = g_error_free(gPointer.reinterpret())

    /**
     * Returns true if @error matches @domain and @code, false
     * otherwise. In particular, when @error is null, false will
     * be returned.
     *
     * If @domain contains a `FAILED` (or otherwise generic) error code,
     * you should generally not check for it explicitly, but should
     * instead treat any not-explicitly-recognized error code as being
     * equivalent to the `FAILED` code. This way, if the domain is
     * extended in the future to provide a more specific error code for
     * a certain case, your code will still work.
     *
     * @param domain an error domain
     * @param code an error code
     * @return whether @error has @domain and @code
     */
    public fun matches(domain: Quark, code: gint): Boolean =
        g_error_matches(gPointer.reinterpret(), domain, code).asBoolean()

    override fun toString(): String = "Error(domain=$domain, code=$code, message=$message)"

    public companion object {
        /**
         * Creates a new #GError; unlike g_error_new(), @message is
         * not a printf()-style format string. Use this function if
         * @message contains text you don't have control over,
         * that could include printf() escape sequences.
         *
         * @param domain error domain
         * @param code error code
         * @param message error message
         * @return a new #GError
         */
        public fun newLiteral(domain: Quark, code: gint, message: String): Error =
            Error(g_error_new_literal(domain, code, message)!!.reinterpret())

        /**
         * Get the GType of Error
         *
         * @return the GType
         */
        public fun getType(): GType = g_error_get_type()
    }
}

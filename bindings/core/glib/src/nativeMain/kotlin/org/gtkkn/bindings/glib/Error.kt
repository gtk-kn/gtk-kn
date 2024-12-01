// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.g_error_copy
import org.gtkkn.native.glib.g_error_free
import org.gtkkn.native.glib.g_error_matches
import org.gtkkn.native.glib.g_error_new_literal
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

/**
 * The `GError` structure contains information about
 * an error that has occurred.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `error_type_init`: ErrorInitFunc
 * - parameter `error_type_init`: ErrorInitFunc
 */
public class Error(
    pointer: CPointer<GError>,
) : Record {
    public val glibErrorPointer: CPointer<GError> = pointer

    /**
     * error domain, e.g. %G_FILE_ERROR
     */
    public var domain: Quark
        get() = glibErrorPointer.pointed.domain
        set(`value`) {
            glibErrorPointer.pointed.domain = value
        }

    /**
     * error code, e.g. %G_FILE_ERROR_NOENT
     */
    public var code: Int
        get() = glibErrorPointer.pointed.code
        set(`value`) {
            glibErrorPointer.pointed.code = value
        }

    /**
     * human-readable informative error message
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val message: String?
        get() = glibErrorPointer.pointed.message?.toKString()

    /**
     * Makes a copy of @error.
     *
     * @return a new #GError
     */
    public fun copy(): Error =
        g_error_copy(glibErrorPointer.reinterpret())!!.run {
            Error(reinterpret())
        }

    /**
     * Frees a #GError and associated resources.
     */
    public fun free(): Unit = g_error_free(glibErrorPointer.reinterpret())

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
    public fun matches(
        domain: Quark,
        code: Int,
    ): Boolean = g_error_matches(glibErrorPointer.reinterpret(), domain, code).asBoolean()

    public companion object : RecordCompanion<Error, GError> {
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
        public fun newLiteral(
            domain: Quark,
            code: Int,
            message: String,
        ): Error = Error(g_error_new_literal(domain, code, message)!!.reinterpret())

        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Error = Error(pointer.reinterpret())
    }
}

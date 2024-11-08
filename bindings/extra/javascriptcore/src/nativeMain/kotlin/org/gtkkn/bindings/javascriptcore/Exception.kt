// This is a generated file. Do not modify.
package org.gtkkn.bindings.javascriptcore

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.javascriptcore.JSCException
import org.gtkkn.native.javascriptcore.jsc_exception_get_backtrace_string
import org.gtkkn.native.javascriptcore.jsc_exception_get_column_number
import org.gtkkn.native.javascriptcore.jsc_exception_get_line_number
import org.gtkkn.native.javascriptcore.jsc_exception_get_message
import org.gtkkn.native.javascriptcore.jsc_exception_get_name
import org.gtkkn.native.javascriptcore.jsc_exception_get_source_uri
import org.gtkkn.native.javascriptcore.jsc_exception_get_type
import org.gtkkn.native.javascriptcore.jsc_exception_new
import org.gtkkn.native.javascriptcore.jsc_exception_new_with_name
import org.gtkkn.native.javascriptcore.jsc_exception_report
import kotlin.String
import kotlin.UInt

/**
 * JSCException represents a JavaScript exception.
 *
 * ## Skipped during bindings generation
 *
 * - method `to_string`: C function jsc_exception_to_string is ignored
 */
public class Exception(
    pointer: CPointer<JSCException>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val javascriptcoreExceptionPointer: CPointer<JSCException>
        get() = gPointer.reinterpret()

    /**
     * Create a new #JSCException in @context with @message.
     *
     * @param context a #JSCContext
     * @param message the error message
     * @return a new #JSCException.
     */
    public constructor(
        context: Context,
        message: String,
    ) : this(jsc_exception_new(context.javascriptcoreContextPointer.reinterpret(), message)!!.reinterpret())

    /**
     * Create a new #JSCException in @context with @name and @message.
     *
     * @param context a #JSCContext
     * @param name the error name
     * @param message the error message
     * @return a new #JSCException.
     */
    public constructor(
        context: Context,
        name: String,
        message: String,
    ) : this(
        jsc_exception_new_with_name(context.javascriptcoreContextPointer.reinterpret(), name, message)!!.reinterpret()
    )

    /**
     * Get a string with the exception backtrace.
     *
     * @return the exception backtrace string or null.
     */
    public fun getBacktraceString(): String? =
        jsc_exception_get_backtrace_string(javascriptcoreExceptionPointer.reinterpret())?.toKString()

    /**
     * Get the column number at which @exception happened.
     *
     * @return the column number of @exception.
     */
    public fun getColumnNumber(): UInt = jsc_exception_get_column_number(javascriptcoreExceptionPointer.reinterpret())

    /**
     * Get the line number at which @exception happened.
     *
     * @return the line number of @exception.
     */
    public fun getLineNumber(): UInt = jsc_exception_get_line_number(javascriptcoreExceptionPointer.reinterpret())

    /**
     * Get the error message of @exception.
     *
     * @return the @exception error message.
     */
    public fun getMessage(): String =
        jsc_exception_get_message(javascriptcoreExceptionPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Get the error name of @exception
     *
     * @return the @exception error name.
     */
    public fun getName(): String =
        jsc_exception_get_name(javascriptcoreExceptionPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Get the source URI of @exception.
     *
     * @return the the source URI of @exception, or null.
     */
    public fun getSourceUri(): String? =
        jsc_exception_get_source_uri(javascriptcoreExceptionPointer.reinterpret())?.toKString()

    /**
     * Return a report message of @exception, containing all the possible details such us
     * source URI, line, column and backtrace, and formatted to be printed.
     *
     * @return a new string with the exception report
     */
    public fun report(): String =
        jsc_exception_report(javascriptcoreExceptionPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    public companion object : TypeCompanion<Exception> {
        override val type: GeneratedClassKGType<Exception> =
            GeneratedClassKGType(jsc_exception_get_type()) { Exception(it.reinterpret()) }

        init {
            JavascriptcoreTypeProvider.register()
        }
    }
}
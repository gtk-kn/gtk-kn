// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.Glib.resolveException
import org.gtkkn.bindings.glib.annotations.GLibVersion2_16
import org.gtkkn.bindings.glib.annotations.GLibVersion2_2
import org.gtkkn.bindings.glib.annotations.GLibVersion2_36
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.GMarkupParseContext
import org.gtkkn.native.glib.g_markup_parse_context_end_parse
import org.gtkkn.native.glib.g_markup_parse_context_free
import org.gtkkn.native.glib.g_markup_parse_context_get_element
import org.gtkkn.native.glib.g_markup_parse_context_get_element_stack
import org.gtkkn.native.glib.g_markup_parse_context_parse
import org.gtkkn.native.glib.g_markup_parse_context_ref
import org.gtkkn.native.glib.g_markup_parse_context_unref
import kotlin.Boolean
import kotlin.Long
import kotlin.Result
import kotlin.String
import kotlin.Unit

/**
 * A parse context is used to parse a stream of bytes that
 * you expect to contain marked-up text.
 *
 * See g_markup_parse_context_new(), #GMarkupParser, and so
 * on for more details.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `line_number`: line_number: Out parameter is not supported
 * - method `get_user_data`: Return type gpointer is unsupported
 * - method `pop`: Return type gpointer is unsupported
 * - parameter `user_data`: gpointer
 * - parameter `user_data`: gpointer
 */
public class MarkupParseContext(
    pointer: CPointer<GMarkupParseContext>,
) : Record {
    public val glibMarkupParseContextPointer: CPointer<GMarkupParseContext> = pointer

    /**
     * Signals to the #GMarkupParseContext that all data has been
     * fed into the parse context with g_markup_parse_context_parse().
     *
     * This function reports an error if the document isn't complete,
     * for example if elements are still open.
     *
     * @return true on success, false if an error was set
     */
    public fun endParse(): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_markup_parse_context_end_parse(
                    glibMarkupParseContextPointer.reinterpret(),
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Frees a #GMarkupParseContext.
     *
     * This function can't be called from inside one of the
     * #GMarkupParser functions or while a subparser is pushed.
     */
    public fun free(): Unit = g_markup_parse_context_free(glibMarkupParseContextPointer.reinterpret())

    /**
     * Retrieves the name of the currently open element.
     *
     * If called from the start_element or end_element handlers this will
     * give the element_name as passed to those functions. For the parent
     * elements, see g_markup_parse_context_get_element_stack().
     *
     * @return the name of the currently open element, or null
     * @since 2.2
     */
    @GLibVersion2_2
    public fun getElement(): String =
        g_markup_parse_context_get_element(glibMarkupParseContextPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Retrieves the element stack from the internal state of the parser.
     *
     * The returned #GSList is a list of strings where the first item is
     * the currently open tag (as would be returned by
     * g_markup_parse_context_get_element()) and the next item is its
     * immediate parent.
     *
     * This function is intended to be used in the start_element and
     * end_element handlers where g_markup_parse_context_get_element()
     * would merely return the name of the element that is being
     * processed.
     *
     * @return the element stack, which must not be modified
     * @since 2.16
     */
    @GLibVersion2_16
    public fun getElementStack(): SList =
        g_markup_parse_context_get_element_stack(glibMarkupParseContextPointer.reinterpret())!!.run {
            SList(reinterpret())
        }

    /**
     * Feed some data to the #GMarkupParseContext.
     *
     * The data need not be valid UTF-8; an error will be signaled if
     * it's invalid. The data need not be an entire document; you can
     * feed a document into the parser incrementally, via multiple calls
     * to this function. Typically, as you receive data from a network
     * connection or file, you feed each received chunk of data into this
     * function, aborting the process if an error occurs. Once an error
     * is reported, no further data may be fed to the #GMarkupParseContext;
     * all errors are fatal.
     *
     * @param text chunk of text to parse
     * @param textLen length of @text in bytes
     * @return false if an error occurred, true on success
     */
    public fun parse(
        text: String,
        textLen: Long,
    ): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_markup_parse_context_parse(
                    glibMarkupParseContextPointer.reinterpret(),
                    text,
                    textLen,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Increases the reference count of @context.
     *
     * @return the same @context
     * @since 2.36
     */
    @GLibVersion2_36
    public fun ref(): MarkupParseContext =
        g_markup_parse_context_ref(glibMarkupParseContextPointer.reinterpret())!!.run {
            MarkupParseContext(reinterpret())
        }

    /**
     * Decreases the reference count of @context.  When its reference count
     * drops to 0, it is freed.
     *
     * @since 2.36
     */
    @GLibVersion2_36
    public fun unref(): Unit = g_markup_parse_context_unref(glibMarkupParseContextPointer.reinterpret())

    public companion object : RecordCompanion<MarkupParseContext, GMarkupParseContext> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): MarkupParseContext =
            MarkupParseContext(pointer.reinterpret())
    }
}

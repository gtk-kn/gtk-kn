// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.GLib.resolveException
import org.gtkkn.bindings.glib.annotations.GLibVersion2_16
import org.gtkkn.bindings.glib.annotations.GLibVersion2_18
import org.gtkkn.bindings.glib.annotations.GLibVersion2_2
import org.gtkkn.bindings.glib.annotations.GLibVersion2_36
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.GMarkupParseContext
import org.gtkkn.native.glib.g_markup_parse_context_end_parse
import org.gtkkn.native.glib.g_markup_parse_context_free
import org.gtkkn.native.glib.g_markup_parse_context_get_element
import org.gtkkn.native.glib.g_markup_parse_context_get_element_stack
import org.gtkkn.native.glib.g_markup_parse_context_get_user_data
import org.gtkkn.native.glib.g_markup_parse_context_parse
import org.gtkkn.native.glib.g_markup_parse_context_pop
import org.gtkkn.native.glib.g_markup_parse_context_push
import org.gtkkn.native.glib.g_markup_parse_context_ref
import org.gtkkn.native.glib.g_markup_parse_context_unref
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_markup_parse_context_get_type
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
 * - parameter `user_data_dnotify`: DestroyNotify
 */
public class MarkupParseContext(pointer: CPointer<GMarkupParseContext>) : ProxyInstance(pointer) {
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
    public fun endParse(): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_markup_parse_context_end_parse(
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
     * Returns the user_data associated with @context.
     *
     * This will either be the user_data that was provided to
     * g_markup_parse_context_new() or to the most recent call
     * of g_markup_parse_context_push().
     *
     * @return the provided user_data. The returned data belongs to
     *     the markup context and will be freed when
     *     g_markup_parse_context_free() is called.
     * @since 2.18
     */
    @GLibVersion2_18
    public fun getUserData(): gpointer? =
        g_markup_parse_context_get_user_data(glibMarkupParseContextPointer.reinterpret())

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
    public fun parse(text: String, textLen: Long): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_markup_parse_context_parse(
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
     * Completes the process of a temporary sub-parser redirection.
     *
     * This function exists to collect the user_data allocated by a
     * matching call to g_markup_parse_context_push(). It must be called
     * in the end_element handler corresponding to the start_element
     * handler during which g_markup_parse_context_push() was called.
     * You must not call this function from the error callback -- the
     * @user_data is provided directly to the callback in that case.
     *
     * This function is not intended to be directly called by users
     * interested in invoking subparsers. Instead, it is intended to
     * be used by the subparsers themselves to implement a higher-level
     * interface.
     *
     * @return the user data passed to g_markup_parse_context_push()
     * @since 2.18
     */
    @GLibVersion2_18
    public fun pop(): gpointer? = g_markup_parse_context_pop(glibMarkupParseContextPointer.reinterpret())

    /**
     * Temporarily redirects markup data to a sub-parser.
     *
     * This function may only be called from the start_element handler of
     * a #GMarkupParser. It must be matched with a corresponding call to
     * g_markup_parse_context_pop() in the matching end_element handler
     * (except in the case that the parser aborts due to an error).
     *
     * All tags, text and other data between the matching tags is
     * redirected to the subparser given by @parser. @user_data is used
     * as the user_data for that parser. @user_data is also passed to the
     * error callback in the event that an error occurs. This includes
     * errors that occur in subparsers of the subparser.
     *
     * The end tag matching the start tag for which this call was made is
     * handled by the previous parser (which is given its own user_data)
     * which is why g_markup_parse_context_pop() is provided to allow "one
     * last access" to the @user_data provided to this function. In the
     * case of error, the @user_data provided here is passed directly to
     * the error callback of the subparser and g_markup_parse_context_pop()
     * should not be called. In either case, if @user_data was allocated
     * then it ought to be freed from both of these locations.
     *
     * This function is not intended to be directly called by users
     * interested in invoking subparsers. Instead, it is intended to be
     * used by the subparsers themselves to implement a higher-level
     * interface.
     *
     * As an example, see the following implementation of a simple
     * parser that counts the number of tags encountered.
     *
     * |[<!-- language="C" -->
     * typedef struct
     * {
     *   gint tag_count;
     * } CounterData;
     *
     * static void
     * counter_start_element (GMarkupParseContext  *context,
     *                        const gchar          *element_name,
     *                        const gchar         **attribute_names,
     *                        const gchar         **attribute_values,
     *                        gpointer              user_data,
     *                        GError              **error)
     * {
     *   CounterData *data = user_data;
     *
     *   data->tag_count++;
     * }
     *
     * static void
     * counter_error (GMarkupParseContext *context,
     *                GError              *error,
     *                gpointer             user_data)
     * {
     *   CounterData *data = user_data;
     *
     *   g_slice_free (CounterData, data);
     * }
     *
     * static GMarkupParser counter_subparser =
     * {
     *   counter_start_element,
     *   NULL,
     *   NULL,
     *   NULL,
     *   counter_error
     * };
     * ]|
     *
     * In order to allow this parser to be easily used as a subparser, the
     * following interface is provided:
     *
     * |[<!-- language="C" -->
     * void
     * start_counting (GMarkupParseContext *context)
     * {
     *   CounterData *data = g_slice_new (CounterData);
     *
     *   data->tag_count = 0;
     *   g_markup_parse_context_push (context, &counter_subparser, data);
     * }
     *
     * gint
     * end_counting (GMarkupParseContext *context)
     * {
     *   CounterData *data = g_markup_parse_context_pop (context);
     *   int result;
     *
     *   result = data->tag_count;
     *   g_slice_free (CounterData, data);
     *
     *   return result;
     * }
     * ]|
     *
     * The subparser would then be used as follows:
     *
     * |[<!-- language="C" -->
     * static void start_element (context, element_name, ...)
     * {
     *   if (strcmp (element_name, "count-these") == 0)
     *     start_counting (context);
     *
     *   // else, handle other tags...
     * }
     *
     * static void end_element (context, element_name, ...)
     * {
     *   if (strcmp (element_name, "count-these") == 0)
     *     g_print ("Counted %d tags\n", end_counting (context));
     *
     *   // else, handle other tags...
     * }
     * ]|
     *
     * @param parser a #GMarkupParser
     * @param userData user data to pass to #GMarkupParser functions
     * @since 2.18
     */
    @GLibVersion2_18
    public fun push(parser: MarkupParser, userData: gpointer? = null): Unit = g_markup_parse_context_push(
        glibMarkupParseContextPointer.reinterpret(),
        parser.glibMarkupParserPointer.reinterpret(),
        userData
    )

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

    public companion object {
        /**
         * Get the GType of MarkupParseContext
         *
         * @return the GType
         */
        public fun getType(): GType = g_markup_parse_context_get_type()
    }
}

// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.gtk.GtkBuildableParseContext
import org.gtkkn.native.gtk.gtk_buildable_parse_context_get_element
import org.gtkkn.native.gtk.gtk_buildable_parse_context_pop
import org.gtkkn.native.gtk.gtk_buildable_parse_context_push
import kotlin.String
import kotlin.Unit

/**
 * An opaque context struct for `GtkBuildableParser`.
 *
 * ## Skipped during bindings generation
 *
 * - method `get_element_stack`: C function gtk_buildable_parse_context_get_element_stack is ignored
 * - parameter `line_number`: line_number: Out parameter is not supported
 */
public class BuildableParseContext(pointer: CPointer<GtkBuildableParseContext>) : ProxyInstance(pointer) {
    public val gtkBuildableParseContextPointer: CPointer<GtkBuildableParseContext> = pointer

    /**
     * Retrieves the name of the currently open element.
     *
     * If called from the start_element or end_element handlers this will
     * give the element_name as passed to those functions. For the parent
     * elements, see gtk_buildable_parse_context_get_element_stack().
     *
     * @return the name of the currently open element
     */
    public fun getElement(): String? =
        gtk_buildable_parse_context_get_element(gtkBuildableParseContextPointer.reinterpret())?.toKString()

    /**
     * Completes the process of a temporary sub-parser redirection.
     *
     * This function exists to collect the user_data allocated by a
     * matching call to gtk_buildable_parse_context_push(). It must be called
     * in the end_element handler corresponding to the start_element
     * handler during which gtk_buildable_parse_context_push() was called.
     * You must not call this function from the error callback -- the
     * @user_data is provided directly to the callback in that case.
     *
     * This function is not intended to be directly called by users
     * interested in invoking subparsers. Instead, it is intended to
     * be used by the subparsers themselves to implement a higher-level
     * interface.
     *
     * @return the user data passed to gtk_buildable_parse_context_push()
     */
    public fun pop(): gpointer? = gtk_buildable_parse_context_pop(gtkBuildableParseContextPointer.reinterpret())

    /**
     * Temporarily redirects markup data to a sub-parser.
     *
     * This function may only be called from the start_element handler of
     * a `GtkBuildableParser`. It must be matched with a corresponding call to
     * gtk_buildable_parse_context_pop() in the matching end_element handler
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
     * which is why gtk_buildable_parse_context_pop() is provided to allow "one
     * last access" to the @user_data provided to this function. In the
     * case of error, the @user_data provided here is passed directly to
     * the error callback of the subparser and gtk_buildable_parse_context_pop()
     * should not be called. In either case, if @user_data was allocated
     * then it ought to be freed from both of these locations.
     *
     * This function is not intended to be directly called by users
     * interested in invoking subparsers. Instead, it is intended to be
     * used by the subparsers themselves to implement a higher-level
     * interface.
     *
     * For an example of how to use this, see g_markup_parse_context_push() which
     * has the same kind of API.
     *
     * @param parser a `GtkBuildableParser`
     * @param userData user data to pass to `GtkBuildableParser` functions
     */
    public fun push(parser: BuildableParser, userData: gpointer? = null): Unit = gtk_buildable_parse_context_push(
        gtkBuildableParseContextPointer.reinterpret(),
        parser.gtkBuildableParserPointer.reinterpret(),
        userData
    )
}

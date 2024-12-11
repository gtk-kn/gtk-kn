// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gtk.GtkBuildableParseContext
import org.gtkkn.native.gtk.gtk_buildable_parse_context_get_element
import kotlin.String

/**
 * An opaque context struct for `GtkBuildableParser`.
 *
 * ## Skipped during bindings generation
 *
 * - method `get_element_stack`: C function gtk_buildable_parse_context_get_element_stack is ignored
 * - parameter `line_number`: line_number: Out parameter is not supported
 * - method `pop`: Return type gpointer is unsupported
 * - parameter `user_data`: gpointer
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
}

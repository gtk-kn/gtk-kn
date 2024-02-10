// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GOptionGroup
import org.gtkkn.native.glib.g_option_group_free
import org.gtkkn.native.glib.g_option_group_ref
import org.gtkkn.native.glib.g_option_group_set_translation_domain
import org.gtkkn.native.glib.g_option_group_unref
import kotlin.String
import kotlin.Unit

/**
 * A `GOptionGroup` struct defines the options in a single
 * group. The struct has only private fields and should not be directly accessed.
 *
 * All options in a group share the same translation function. Libraries which
 * need to parse commandline options are expected to provide a function for
 * getting a `GOptionGroup` holding their options, which
 * the application can then add to its #GOptionContext.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `entries`: OptionEntry
 * - method `set_translate_func`: C function g_option_group_set_translate_func is ignored
 * - parameter `user_data`: gpointer
 */
public class OptionGroup(
    pointer: CPointer<GOptionGroup>,
) : Record {
    public val glibOptionGroupPointer: CPointer<GOptionGroup> = pointer

    /**
     * Frees a #GOptionGroup. Note that you must not free groups
     * which have been added to a #GOptionContext.
     *
     * @since 2.6
     */
    public fun free(): Unit = g_option_group_free(glibOptionGroupPointer.reinterpret())

    /**
     * Increments the reference count of @group by one.
     *
     * @return a #GOptionGroup
     * @since 2.44
     */
    public fun ref(): OptionGroup =
        g_option_group_ref(glibOptionGroupPointer.reinterpret())!!.run {
            OptionGroup(reinterpret())
        }

    /**
     * A convenience function to use gettext() for translating
     * user-visible strings.
     *
     * @param domain the domain to use
     * @since 2.6
     */
    public fun setTranslationDomain(domain: String): Unit =
        g_option_group_set_translation_domain(glibOptionGroupPointer.reinterpret(), domain)

    /**
     * Decrements the reference count of @group by one.
     * If the reference count drops to 0, the @group will be freed.
     * and all memory allocated by the @group is released.
     *
     * @since 2.44
     */
    public fun unref(): Unit = g_option_group_unref(glibOptionGroupPointer.reinterpret())

    public companion object : RecordCompanion<OptionGroup, GOptionGroup> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): OptionGroup =
            OptionGroup(pointer.reinterpret())
    }
}

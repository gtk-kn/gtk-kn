// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GOptionEntry
import kotlin.Char
import kotlin.Int
import kotlin.String

/**
 * A GOptionEntry struct defines a single option. To have an effect, they
 * must be added to a #GOptionGroup with g_option_context_add_main_entries()
 * or g_option_group_add_entries().
 *
 * ## Skipped during bindings generation
 *
 * - field `arg_data`: gpointer
 */
public class OptionEntry(
    pointer: CPointer<GOptionEntry>,
) : Record {
    public val glibOptionEntryPointer: CPointer<GOptionEntry> = pointer

    /**
     * The long name of an option can be used to specify it
     *     in a commandline as `--long_name`. Every option must have a
     *     long name. To resolve conflicts if multiple option groups contain
     *     the same long name, it is also possible to specify the option as
     *     `--groupname-long_name`.
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val longName: String?
        get() = glibOptionEntryPointer.pointed.long_name?.toKString()

    /**
     * If an option has a short name, it can be specified
     *     `-short_name` in a commandline. @short_name must be  a printable
     *     ASCII character different from '-', or zero if the option has no
     *     short name.
     */
    public var shortName: Char
        get() = glibOptionEntryPointer.pointed.short_name.toInt().toChar()
        set(`value`) {
            glibOptionEntryPointer.pointed.short_name = value.code.toByte()
        }

    /**
     * Flags from #GOptionFlags
     */
    public var flags: Int
        get() = glibOptionEntryPointer.pointed.flags
        set(`value`) {
            glibOptionEntryPointer.pointed.flags = value
        }

    /**
     * The type of the option, as a #GOptionArg
     */
    public var arg: OptionArg
        get() =
            glibOptionEntryPointer.pointed.arg.run {
                OptionArg.fromNativeValue(this)
            }
        set(`value`) {
            glibOptionEntryPointer.pointed.arg = value.nativeValue
        }

    /**
     * the description for the option in `--help`
     *     output. The @description is translated using the @translate_func
     *     of the group, see g_option_group_set_translation_domain().
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val description: String?
        get() = glibOptionEntryPointer.pointed.description?.toKString()

    /**
     * The placeholder to use for the extra argument parsed
     *     by the option in `--help` output. The @arg_description is translated
     *     using the @translate_func of the group, see
     *     g_option_group_set_translation_domain().
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val argDescription: String?
        get() = glibOptionEntryPointer.pointed.arg_description?.toKString()

    public companion object : RecordCompanion<OptionEntry, GOptionEntry> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): OptionEntry =
            OptionEntry(pointer.reinterpret())
    }
}

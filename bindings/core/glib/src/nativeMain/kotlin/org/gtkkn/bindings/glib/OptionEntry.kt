// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GOptionEntry
import org.gtkkn.native.glib.g_free
import org.gtkkn.native.glib.g_strdup
import org.gtkkn.native.gobject.gint
import kotlin.Char
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * A GOptionEntry struct defines a single option. To have an effect, they
 * must be added to a #GOptionGroup with g_option_context_add_main_entries()
 * or g_option_group_add_entries().
 *
 * ## Skipped during bindings generation
 *
 * - field `arg_data`: gpointer
 */
public class OptionEntry(pointer: CPointer<GOptionEntry>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val glibOptionEntryPointer: CPointer<GOptionEntry> = pointer

    /**
     * The long name of an option can be used to specify it
     *     in a commandline as `--long_name`. Every option must have a
     *     long name. To resolve conflicts if multiple option groups contain
     *     the same long name, it is also possible to specify the option as
     *     `--groupname-long_name`.
     */
    public var longName: String?
        get() = glibOptionEntryPointer.pointed.long_name?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            glibOptionEntryPointer.pointed.long_name?.let { g_free(it) }
            glibOptionEntryPointer.pointed.long_name = value?.let { g_strdup(it) }
        }

    /**
     * If an option has a short name, it can be specified
     *     `-short_name` in a commandline. @short_name must be  a printable
     *     ASCII character different from '-', or zero if the option has no
     *     short name.
     */
    public var shortName: Char
        get() = glibOptionEntryPointer.pointed.short_name.toInt().toChar()

        @UnsafeFieldSetter
        set(`value`) {
            glibOptionEntryPointer.pointed.short_name = value.code.toByte()
        }

    /**
     * Flags from #GOptionFlags
     */
    public var flags: gint
        get() = glibOptionEntryPointer.pointed.flags

        @UnsafeFieldSetter
        set(`value`) {
            glibOptionEntryPointer.pointed.flags = value
        }

    /**
     * The type of the option, as a #GOptionArg
     */
    public var arg: OptionArg
        get() = glibOptionEntryPointer.pointed.arg.run {
            OptionArg.fromNativeValue(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            glibOptionEntryPointer.pointed.arg = value.nativeValue
        }

    /**
     * the description for the option in `--help`
     *     output. The @description is translated using the @translate_func
     *     of the group, see g_option_group_set_translation_domain().
     */
    public var description: String?
        get() = glibOptionEntryPointer.pointed.description?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            glibOptionEntryPointer.pointed.description?.let { g_free(it) }
            glibOptionEntryPointer.pointed.description = value?.let { g_strdup(it) }
        }

    /**
     * The placeholder to use for the extra argument parsed
     *     by the option in `--help` output. The @arg_description is translated
     *     using the @translate_func of the group, see
     *     g_option_group_set_translation_domain().
     */
    public var argDescription: String?
        get() = glibOptionEntryPointer.pointed.arg_description?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            glibOptionEntryPointer.pointed.arg_description?.let { g_free(it) }
            glibOptionEntryPointer.pointed.arg_description = value?.let { g_strdup(it) }
        }

    /**
     * Allocate a new OptionEntry.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GOptionEntry>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to OptionEntry and a [Cleaner] instance.
     */
    private constructor(pair: Pair<CPointer<GOptionEntry>, Cleaner>) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new OptionEntry using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GOptionEntry>().ptr)

    /**
     * Allocate a new OptionEntry.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param longName The long name of an option can be used to specify it
     *     in a commandline as `--long_name`. Every option must have a
     *     long name. To resolve conflicts if multiple option groups contain
     *     the same long name, it is also possible to specify the option as
     *     `--groupname-long_name`.
     * @param shortName If an option has a short name, it can be specified
     *     `-short_name` in a commandline. @short_name must be  a printable
     *     ASCII character different from '-', or zero if the option has no
     *     short name.
     * @param flags Flags from #GOptionFlags
     * @param arg The type of the option, as a #GOptionArg
     * @param description the description for the option in `--help`
     *     output. The @description is translated using the @translate_func
     *     of the group, see g_option_group_set_translation_domain().
     * @param argDescription The placeholder to use for the extra argument parsed
     *     by the option in `--help` output. The @arg_description is translated
     *     using the @translate_func of the group, see
     *     g_option_group_set_translation_domain().
     */
    public constructor(
        longName: String?,
        shortName: Char,
        flags: gint,
        arg: OptionArg,
        description: String?,
        argDescription: String?,
    ) : this() {
        this.longName = longName
        this.shortName = shortName
        this.flags = flags
        this.arg = arg
        this.description = description
        this.argDescription = argDescription
    }

    /**
     * Allocate a new OptionEntry using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param longName The long name of an option can be used to specify it
     *     in a commandline as `--long_name`. Every option must have a
     *     long name. To resolve conflicts if multiple option groups contain
     *     the same long name, it is also possible to specify the option as
     *     `--groupname-long_name`.
     * @param shortName If an option has a short name, it can be specified
     *     `-short_name` in a commandline. @short_name must be  a printable
     *     ASCII character different from '-', or zero if the option has no
     *     short name.
     * @param flags Flags from #GOptionFlags
     * @param arg The type of the option, as a #GOptionArg
     * @param description the description for the option in `--help`
     *     output. The @description is translated using the @translate_func
     *     of the group, see g_option_group_set_translation_domain().
     * @param argDescription The placeholder to use for the extra argument parsed
     *     by the option in `--help` output. The @arg_description is translated
     *     using the @translate_func of the group, see
     *     g_option_group_set_translation_domain().
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        longName: String?,
        shortName: Char,
        flags: gint,
        arg: OptionArg,
        description: String?,
        argDescription: String?,
        scope: AutofreeScope,
    ) : this(scope) {
        this.longName = longName
        this.shortName = shortName
        this.flags = flags
        this.arg = arg
        this.description = description
        this.argDescription = argDescription
    }

    override fun toString(): String =
        "OptionEntry(longName=$longName, shortName=$shortName, flags=$flags, arg=$arg, description=$description, argDescription=$argDescription)"
}

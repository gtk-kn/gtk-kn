// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.annotations.GLibVersion2_12
import org.gtkkn.bindings.glib.annotations.GLibVersion2_14
import org.gtkkn.bindings.glib.annotations.GLibVersion2_44
import org.gtkkn.bindings.glib.annotations.GLibVersion2_6
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.native.glib.GOptionContext
import org.gtkkn.native.glib.g_option_context_add_group
import org.gtkkn.native.glib.g_option_context_free
import org.gtkkn.native.glib.g_option_context_get_description
import org.gtkkn.native.glib.g_option_context_get_help
import org.gtkkn.native.glib.g_option_context_get_help_enabled
import org.gtkkn.native.glib.g_option_context_get_ignore_unknown_options
import org.gtkkn.native.glib.g_option_context_get_main_group
import org.gtkkn.native.glib.g_option_context_get_strict_posix
import org.gtkkn.native.glib.g_option_context_get_summary
import org.gtkkn.native.glib.g_option_context_set_description
import org.gtkkn.native.glib.g_option_context_set_help_enabled
import org.gtkkn.native.glib.g_option_context_set_ignore_unknown_options
import org.gtkkn.native.glib.g_option_context_set_main_group
import org.gtkkn.native.glib.g_option_context_set_strict_posix
import org.gtkkn.native.glib.g_option_context_set_summary
import org.gtkkn.native.glib.g_option_context_set_translate_func
import org.gtkkn.native.glib.g_option_context_set_translation_domain
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * A `GOptionContext` struct defines which options
 * are accepted by the commandline option parser. The struct has only private
 * fields and should not be directly accessed.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `entries`: OptionEntry
 * - method `parse`: In/Out parameter is not supported
 * - method `parse_strv`: In/Out parameter is not supported
 * - function `new`: Return type OptionContext is unsupported
 */
public class OptionContext(pointer: CPointer<GOptionContext>) : ProxyInstance(pointer) {
    public val glibOptionContextPointer: CPointer<GOptionContext> = pointer

    /**
     * Adds a #GOptionGroup to the @context, so that parsing with @context
     * will recognize the options in the group. Note that this will take
     * ownership of the @group and thus the @group should not be freed.
     *
     * @param group the group to add
     * @since 2.6
     */
    @GLibVersion2_6
    public fun addGroup(group: OptionGroup): Unit =
        g_option_context_add_group(glibOptionContextPointer.reinterpret(), group.glibOptionGroupPointer.reinterpret())

    /**
     * Frees context and all the groups which have been
     * added to it.
     *
     * Please note that parsed arguments need to be freed separately (see
     * #GOptionEntry).
     *
     * @since 2.6
     */
    @GLibVersion2_6
    public fun free(): Unit = g_option_context_free(glibOptionContextPointer.reinterpret())

    /**
     * Returns the description. See g_option_context_set_description().
     *
     * @return the description
     * @since 2.12
     */
    @GLibVersion2_12
    public fun getDescription(): String =
        g_option_context_get_description(glibOptionContextPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Returns a formatted, translated help text for the given context.
     * To obtain the text produced by `--help`, call
     * `g_option_context_get_help (context, TRUE, NULL)`.
     * To obtain the text produced by `--help-all`, call
     * `g_option_context_get_help (context, FALSE, NULL)`.
     * To obtain the help text for an option group, call
     * `g_option_context_get_help (context, FALSE, group)`.
     *
     * @param mainHelp if true, only include the main group
     * @param group the #GOptionGroup to create help for, or null
     * @return A newly allocated string containing the help text
     * @since 2.14
     */
    @GLibVersion2_14
    public fun getHelp(mainHelp: Boolean, group: OptionGroup? = null): String = g_option_context_get_help(
        glibOptionContextPointer.reinterpret(),
        mainHelp.asGBoolean(),
        group?.glibOptionGroupPointer?.reinterpret()
    )?.toKString()
        ?: error("Expected not null string")

    /**
     * Returns whether automatic `--help` generation
     * is turned on for @context. See g_option_context_set_help_enabled().
     *
     * @return true if automatic help generation is turned on.
     * @since 2.6
     */
    @GLibVersion2_6
    public fun getHelpEnabled(): Boolean =
        g_option_context_get_help_enabled(glibOptionContextPointer.reinterpret()).asBoolean()

    /**
     * Returns whether unknown options are ignored or not. See
     * g_option_context_set_ignore_unknown_options().
     *
     * @return true if unknown options are ignored.
     * @since 2.6
     */
    @GLibVersion2_6
    public fun getIgnoreUnknownOptions(): Boolean =
        g_option_context_get_ignore_unknown_options(glibOptionContextPointer.reinterpret()).asBoolean()

    /**
     * Returns a pointer to the main group of @context.
     *
     * @return the main group of @context, or null if
     *  @context doesn't have a main group. Note that group belongs to
     *  @context and should not be modified or freed.
     * @since 2.6
     */
    @GLibVersion2_6
    public fun getMainGroup(): OptionGroup =
        g_option_context_get_main_group(glibOptionContextPointer.reinterpret())!!.run {
            OptionGroup(reinterpret())
        }

    /**
     * Returns whether strict POSIX code is enabled.
     *
     * See g_option_context_set_strict_posix() for more information.
     *
     * @return true if strict POSIX is enabled, false otherwise.
     * @since 2.44
     */
    @GLibVersion2_44
    public fun getStrictPosix(): Boolean =
        g_option_context_get_strict_posix(glibOptionContextPointer.reinterpret()).asBoolean()

    /**
     * Returns the summary. See g_option_context_set_summary().
     *
     * @return the summary
     * @since 2.12
     */
    @GLibVersion2_12
    public fun getSummary(): String = g_option_context_get_summary(glibOptionContextPointer.reinterpret())?.toKString()
        ?: error("Expected not null string")

    /**
     * Adds a string to be displayed in `--help` output after the list
     * of options. This text often includes a bug reporting address.
     *
     * Note that the summary is translated (see
     * g_option_context_set_translate_func()).
     *
     * @param description a string to be shown in `--help` output
     *   after the list of options, or null
     * @since 2.12
     */
    @GLibVersion2_12
    public fun setDescription(description: String? = null): Unit =
        g_option_context_set_description(glibOptionContextPointer.reinterpret(), description)

    /**
     * Enables or disables automatic generation of `--help` output.
     * By default, g_option_context_parse() recognizes `--help`, `-h`,
     * `-?`, `--help-all` and `--help-groupname` and creates suitable
     * output to stdout.
     *
     * @param helpEnabled true to enable `--help`, false to disable it
     * @since 2.6
     */
    @GLibVersion2_6
    public fun setHelpEnabled(helpEnabled: Boolean): Unit =
        g_option_context_set_help_enabled(glibOptionContextPointer.reinterpret(), helpEnabled.asGBoolean())

    /**
     * Sets whether to ignore unknown options or not. If an argument is
     * ignored, it is left in the @argv array after parsing. By default,
     * g_option_context_parse() treats unknown options as error.
     *
     * This setting does not affect non-option arguments (i.e. arguments
     * which don't start with a dash). But note that GOption cannot reliably
     * determine whether a non-option belongs to a preceding unknown option.
     *
     * @param ignoreUnknown true to ignore unknown options, false to produce
     *    an error when unknown options are met
     * @since 2.6
     */
    @GLibVersion2_6
    public fun setIgnoreUnknownOptions(ignoreUnknown: Boolean): Unit =
        g_option_context_set_ignore_unknown_options(glibOptionContextPointer.reinterpret(), ignoreUnknown.asGBoolean())

    /**
     * Sets a #GOptionGroup as main group of the @context.
     * This has the same effect as calling g_option_context_add_group(),
     * the only difference is that the options in the main group are
     * treated differently when generating `--help` output.
     *
     * @param group the group to set as main group
     * @since 2.6
     */
    @GLibVersion2_6
    public fun setMainGroup(group: OptionGroup): Unit = g_option_context_set_main_group(
        glibOptionContextPointer.reinterpret(),
        group.glibOptionGroupPointer.reinterpret()
    )

    /**
     * Sets strict POSIX mode.
     *
     * By default, this mode is disabled.
     *
     * In strict POSIX mode, the first non-argument parameter encountered
     * (eg: filename) terminates argument processing.  Remaining arguments
     * are treated as non-options and are not attempted to be parsed.
     *
     * If strict POSIX mode is disabled then parsing is done in the GNU way
     * where option arguments can be freely mixed with non-options.
     *
     * As an example, consider "ls foo -l".  With GNU style parsing, this
     * will list "foo" in long mode.  In strict POSIX style, this will list
     * the files named "foo" and "-l".
     *
     * It may be useful to force strict POSIX mode when creating "verb
     * style" command line tools.  For example, the "gsettings" command line
     * tool supports the global option "--schemadir" as well as many
     * subcommands ("get", "set", etc.) which each have their own set of
     * arguments.  Using strict POSIX mode will allow parsing the global
     * options up to the verb name while leaving the remaining options to be
     * parsed by the relevant subcommand (which can be determined by
     * examining the verb name, which should be present in argv[1] after
     * parsing).
     *
     * @param strictPosix the new value
     * @since 2.44
     */
    @GLibVersion2_44
    public fun setStrictPosix(strictPosix: Boolean): Unit =
        g_option_context_set_strict_posix(glibOptionContextPointer.reinterpret(), strictPosix.asGBoolean())

    /**
     * Adds a string to be displayed in `--help` output before the list
     * of options. This is typically a summary of the program functionality.
     *
     * Note that the summary is translated (see
     * g_option_context_set_translate_func() and
     * g_option_context_set_translation_domain()).
     *
     * @param summary a string to be shown in `--help` output
     *  before the list of options, or null
     * @since 2.12
     */
    @GLibVersion2_12
    public fun setSummary(summary: String? = null): Unit =
        g_option_context_set_summary(glibOptionContextPointer.reinterpret(), summary)

    /**
     * Sets the function which is used to translate the contexts
     * user-visible strings, for `--help` output. If @func is null,
     * strings are not translated.
     *
     * Note that option groups have their own translation functions,
     * this function only affects the @parameter_string (see g_option_context_new()),
     * the summary (see g_option_context_set_summary()) and the description
     * (see g_option_context_set_description()).
     *
     * If you are using gettext(), you only need to set the translation
     * domain, see g_option_context_set_translation_domain().
     *
     * @param func the #GTranslateFunc, or null
     * @since 2.12
     */
    @GLibVersion2_12
    public fun setTranslateFunc(func: TranslateFunc?): Unit = g_option_context_set_translate_func(
        glibOptionContextPointer.reinterpret(),
        func?.let {
            TranslateFuncFunc.reinterpret()
        },
        func?.let { StableRef.create(func).asCPointer() },
        func?.let { staticStableRefDestroy.reinterpret() }
    )

    /**
     * A convenience function to use gettext() for translating
     * user-visible strings.
     *
     * @param domain the domain to use
     * @since 2.12
     */
    @GLibVersion2_12
    public fun setTranslationDomain(domain: String): Unit =
        g_option_context_set_translation_domain(glibOptionContextPointer.reinterpret(), domain)
}

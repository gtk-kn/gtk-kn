// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.annotations.GioVersion2_28
import org.gtkkn.bindings.gio.annotations.GioVersion2_34
import org.gtkkn.bindings.gio.annotations.GioVersion2_36
import org.gtkkn.bindings.gio.annotations.GioVersion2_40
import org.gtkkn.bindings.gio.annotations.GioVersion2_80
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.bindings.glib.VariantDict
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.toKStringList
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GApplicationCommandLine
import org.gtkkn.native.gio.g_application_command_line_create_file_for_arg
import org.gtkkn.native.gio.g_application_command_line_done
import org.gtkkn.native.gio.g_application_command_line_get_cwd
import org.gtkkn.native.gio.g_application_command_line_get_environ
import org.gtkkn.native.gio.g_application_command_line_get_exit_status
import org.gtkkn.native.gio.g_application_command_line_get_is_remote
import org.gtkkn.native.gio.g_application_command_line_get_options_dict
import org.gtkkn.native.gio.g_application_command_line_get_platform_data
import org.gtkkn.native.gio.g_application_command_line_get_stdin
import org.gtkkn.native.gio.g_application_command_line_get_type
import org.gtkkn.native.gio.g_application_command_line_getenv
import org.gtkkn.native.gio.g_application_command_line_print_literal
import org.gtkkn.native.gio.g_application_command_line_printerr_literal
import org.gtkkn.native.gio.g_application_command_line_set_exit_status
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * `GApplicationCommandLine` represents a command-line invocation of
 * an application.
 *
 * It is created by [class@Gio.Application] and emitted
 * in the [signal@Gio.Application::command-line] signal and virtual function.
 *
 * The class contains the list of arguments that the program was invoked
 * with. It is also possible to query if the commandline invocation was
 * local (ie: the current process is running in direct response to the
 * invocation) or remote (ie: some other process forwarded the
 * commandline to this process).
 *
 * The `GApplicationCommandLine` object can provide the @argc and @argv
 * parameters for use with the [struct@GLib.OptionContext] command-line parsing API,
 * with the [method@Gio.ApplicationCommandLine.get_arguments] function. See
 * [gapplication-example-cmdline3.c][gapplication-example-cmdline3]
 * for an example.
 *
 * The exit status of the originally-invoked process may be set and
 * messages can be printed to stdout or stderr of that process.
 *
 * For remote invocation, the originally-invoked process exits when
 * [method@Gio.ApplicationCommandLine.done] method is called. This method is
 * also automatically called when the object is disposed.
 *
 * The main use for `GApplicationCommandLine` (and the
 * [signal@Gio.Application::command-line] signal) is 'Emacs server' like use cases:
 * You can set the `EDITOR` environment variable to have e.g. git use
 * your favourite editor to edit commit messages, and if you already
 * have an instance of the editor running, the editing will happen
 * in the running instance, instead of opening a new one. An important
 * aspect of this use case is that the process that gets started by git
 * does not return until the editing is done.
 *
 * Normally, the commandline is completely handled in the
 * [signal@Gio.Application::command-line] handler. The launching instance exits
 * once the signal handler in the primary instance has returned, and
 * the return value of the signal handler becomes the exit status
 * of the launching instance.
 *
 * ```c
 * static int
 * command_line (GApplication            *application,
 *               GApplicationCommandLine *cmdline)
 * {
 *   gchar **argv;
 *   gint argc;
 *   gint i;
 *
 *   argv = g_application_command_line_get_arguments (cmdline, &argc);
 *
 *   g_application_command_line_print (cmdline,
 *                                     "This text is written back\n"
 *                                     "to stdout of the caller\n");
 *
 *   for (i = 0; i < argc; i++)
 *     g_print ("argument %d: %s\n", i, argv[i]);
 *
 *   g_strfreev (argv);
 *
 *   return 0;
 * }
 * ```
 *
 * The complete example can be found here:
 * [gapplication-example-cmdline.c](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gapplication-example-cmdline.c)
 *
 * In more complicated cases, the handling of the commandline can be
 * split between the launcher and the primary instance.
 *
 * ```c
 * static gboolean
 *  test_local_cmdline (GApplication   *application,
 *                      gchar        ***arguments,
 *                      gint           *exit_status)
 * {
 *   gint i, j;
 *   gchar **argv;
 *
 *   argv = *arguments;
 *
 *   if (argv[0] == NULL)
 *     {
 *       *exit_status = 0;
 *       return FALSE;
 *     }
 *
 *   i = 1;
 *   while (argv[i])
 *     {
 *       if (g_str_has_prefix (argv[i], "--local-"))
 *         {
 *           g_print ("handling argument %s locally\n", argv[i]);
 *           g_free (argv[i]);
 *           for (j = i; argv[j]; j++)
 *             argv[j] = argv[j + 1];
 *         }
 *       else
 *         {
 *           g_print ("not handling argument %s locally\n", argv[i]);
 *           i++;
 *         }
 *     }
 *
 *   *exit_status = 0;
 *
 *   return FALSE;
 * }
 *
 * static void
 * test_application_class_init (TestApplicationClass *class)
 * {
 *   G_APPLICATION_CLASS (class)->local_command_line = test_local_cmdline;
 *
 *   ...
 * }
 * ```
 *
 * In this example of split commandline handling, options that start
 * with `--local-` are handled locally, all other options are passed
 * to the [signal@Gio.Application::command-line] handler which runs in the primary
 * instance.
 *
 * The complete example can be found here:
 * [gapplication-example-cmdline2.c](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gapplication-example-cmdline2.c)
 *
 * If handling the commandline requires a lot of work, it may be better to defer it.
 *
 * ```c
 * static gboolean
 * my_cmdline_handler (gpointer data)
 * {
 *   GApplicationCommandLine *cmdline = data;
 *
 *   // do the heavy lifting in an idle
 *
 *   g_application_command_line_set_exit_status (cmdline, 0);
 *   g_object_unref (cmdline); // this releases the application
 *
 *   return G_SOURCE_REMOVE;
 * }
 *
 * static int
 * command_line (GApplication            *application,
 *               GApplicationCommandLine *cmdline)
 * {
 *   // keep the application running until we are done with this commandline
 *   g_application_hold (application);
 *
 *   g_object_set_data_full (G_OBJECT (cmdline),
 *                           "application", application,
 *                           (GDestroyNotify)g_application_release);
 *
 *   g_object_ref (cmdline);
 *   g_idle_add (my_cmdline_handler, cmdline);
 *
 *   return 0;
 * }
 * ```
 *
 * In this example the commandline is not completely handled before
 * the [signal@Gio.Application::command-line] handler returns. Instead, we keep
 * a reference to the `GApplicationCommandLine` object and handle it
 * later (in this example, in an idle). Note that it is necessary to
 * hold the application until you are done with the commandline.
 *
 * The complete example can be found here:
 * [gapplication-example-cmdline3.c](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gapplication-example-cmdline3.c)
 *
 * ## Skipped during bindings generation
 *
 * - parameter `argc`: argc: Out parameter is not supported
 * - method `print`: Varargs parameter is not supported
 * - method `printerr`: Varargs parameter is not supported
 * - method `arguments`: Property has no getter nor setter
 * - method `options`: Property has no getter nor setter
 * - method `platform-data`: Property has no getter nor setter
 */
public open class ApplicationCommandLine(
    public val gioApplicationCommandLinePointer: CPointer<GApplicationCommandLine>,
) : Object(gioApplicationCommandLinePointer.reinterpret()),
    KGTyped {
    /**
     * Whether this is a remote commandline.
     *
     * @since 2.28
     */
    @GioVersion2_28
    public open val isRemote: Boolean
        /**
         * Determines if @cmdline represents a remote invocation.
         *
         * @return true if the invocation was remote
         * @since 2.28
         */
        get() = g_application_command_line_get_is_remote(gioApplicationCommandLinePointer).asBoolean()

    /**
     * Creates a #GFile corresponding to a filename that was given as part
     * of the invocation of @cmdline.
     *
     * This differs from g_file_new_for_commandline_arg() in that it
     * resolves relative pathnames using the current working directory of
     * the invoking process rather than the local process.
     *
     * @param arg an argument from @cmdline
     * @return a new #GFile
     * @since 2.36
     */
    @GioVersion2_36
    public open fun createFileForArg(arg: String): File =
        g_application_command_line_create_file_for_arg(gioApplicationCommandLinePointer, arg)!!.run {
            File.FileImpl(reinterpret())
        }

    /**
     * Signals that command line processing is completed.
     *
     * For remote invocation, it causes the invoking process to terminate.
     *
     * For local invocation, it does nothing.
     *
     * This method should be called in the [signal@Gio.Application::command-line]
     * handler, after the exit status is set and all messages are printed.
     *
     * After this call, g_application_command_line_set_exit_status() has no effect.
     * Subsequent calls to this method are no-ops.
     *
     * This method is automatically called when the #GApplicationCommandLine
     * object is disposed — so you can omit the call in non-garbage collected
     * languages.
     *
     * @since 2.80
     */
    @GioVersion2_80
    public open fun done(): Unit = g_application_command_line_done(gioApplicationCommandLinePointer)

    /**
     * Gets the working directory of the command line invocation.
     * The string may contain non-utf8 data.
     *
     * It is possible that the remote application did not send a working
     * directory, so this may be null.
     *
     * The return value should not be modified or freed and is valid for as
     * long as @cmdline exists.
     *
     * @return the current directory, or null
     * @since 2.28
     */
    @GioVersion2_28
    public open fun getCwd(): String? =
        g_application_command_line_get_cwd(gioApplicationCommandLinePointer)?.toKString()

    /**
     * Gets the contents of the 'environ' variable of the command line
     * invocation, as would be returned by g_get_environ(), ie as a
     * null-terminated list of strings in the form 'NAME=VALUE'.
     * The strings may contain non-utf8 data.
     *
     * The remote application usually does not send an environment.  Use
     * %G_APPLICATION_SEND_ENVIRONMENT to affect that.  Even with this flag
     * set it is possible that the environment is still not available (due
     * to invocation messages from other applications).
     *
     * The return value should not be modified or freed and is valid for as
     * long as @cmdline exists.
     *
     * See g_application_command_line_getenv() if you are only interested
     * in the value of a single environment variable.
     *
     * @return the environment strings, or null if they were not sent
     * @since 2.28
     */
    @GioVersion2_28
    public open fun getEnviron(): List<String> =
        g_application_command_line_get_environ(gioApplicationCommandLinePointer)?.toKStringList()
            ?: error("Expected not null string array")

    /**
     * Gets the exit status of @cmdline.  See
     * g_application_command_line_set_exit_status() for more information.
     *
     * @return the exit status
     * @since 2.28
     */
    @GioVersion2_28
    public open fun getExitStatus(): gint = g_application_command_line_get_exit_status(gioApplicationCommandLinePointer)

    /**
     * Gets the options that were passed to g_application_command_line().
     *
     * If you did not override local_command_line() then these are the same
     * options that were parsed according to the #GOptionEntrys added to the
     * application with g_application_add_main_option_entries() and possibly
     * modified from your GApplication::handle-local-options handler.
     *
     * If no options were sent then an empty dictionary is returned so that
     * you don't need to check for null.
     *
     * The data has been passed via an untrusted external process, so the types of
     * all values must be checked before being used.
     *
     * @return a #GVariantDict with the options
     * @since 2.40
     */
    @GioVersion2_40
    public open fun getOptionsDict(): VariantDict =
        g_application_command_line_get_options_dict(gioApplicationCommandLinePointer)!!.run {
            VariantDict(this)
        }

    /**
     * Gets the platform data associated with the invocation of @cmdline.
     *
     * This is a #GVariant dictionary containing information about the
     * context in which the invocation occurred.  It typically contains
     * information like the current working directory and the startup
     * notification ID.
     *
     * It comes from an untrusted external process and hence the types of all
     * values must be validated before being used.
     *
     * For local invocation, it will be null.
     *
     * @return the platform data, or null
     * @since 2.28
     */
    @GioVersion2_28
    public open fun getPlatformData(): Variant? =
        g_application_command_line_get_platform_data(gioApplicationCommandLinePointer)?.run {
            Variant(this)
        }

    /**
     * Gets the stdin of the invoking process.
     *
     * The #GInputStream can be used to read data passed to the standard
     * input of the invoking process.
     * This doesn't work on all platforms.  Presently, it is only available
     * on UNIX when using a D-Bus daemon capable of passing file descriptors.
     * If stdin is not available then null will be returned.  In the
     * future, support may be expanded to other platforms.
     *
     * You must only call this function once per commandline invocation.
     *
     * @return a #GInputStream for stdin
     * @since 2.34
     */
    @GioVersion2_34
    public open fun getStdin(): InputStream? =
        g_application_command_line_get_stdin(gioApplicationCommandLinePointer)?.run {
            InputStream.InputStreamImpl(this)
        }

    /**
     * Gets the value of a particular environment variable of the command
     * line invocation, as would be returned by g_getenv().  The strings may
     * contain non-utf8 data.
     *
     * The remote application usually does not send an environment.  Use
     * %G_APPLICATION_SEND_ENVIRONMENT to affect that.  Even with this flag
     * set it is possible that the environment is still not available (due
     * to invocation messages from other applications).
     *
     * The return value should not be modified or freed and is valid for as
     * long as @cmdline exists.
     *
     * @param name the environment variable to get
     * @return the value of the variable, or null if unset or unsent
     * @since 2.28
     */
    @GioVersion2_28
    public open fun getenv(name: String): String? =
        g_application_command_line_getenv(gioApplicationCommandLinePointer, name)?.toKString()

    /**
     * Prints a message using the stdout print handler in the invoking process.
     *
     * Unlike g_application_command_line_print(), @message is not a `printf()`-style
     * format string. Use this function if @message contains text you don't have
     * control over, that could include `printf()` escape sequences.
     *
     * @param message the message
     * @since 2.80
     */
    @GioVersion2_80
    public open fun printLiteral(message: String): Unit =
        g_application_command_line_print_literal(gioApplicationCommandLinePointer, message)

    /**
     * Prints a message using the stderr print handler in the invoking process.
     *
     * Unlike g_application_command_line_printerr(), @message is not
     * a `printf()`-style format string. Use this function if @message contains text
     * you don't have control over, that could include `printf()` escape sequences.
     *
     * @param message the message
     * @since 2.80
     */
    @GioVersion2_80
    public open fun printerrLiteral(message: String): Unit =
        g_application_command_line_printerr_literal(gioApplicationCommandLinePointer, message)

    /**
     * Sets the exit status that will be used when the invoking process
     * exits.
     *
     * The return value of the #GApplication::command-line signal is
     * passed to this function when the handler returns.  This is the usual
     * way of setting the exit status.
     *
     * In the event that you want the remote invocation to continue running
     * and want to decide on the exit status in the future, you can use this
     * call.  For the case of a remote invocation, the remote process will
     * typically exit when the last reference is dropped on @cmdline.  The
     * exit status of the remote process will be equal to the last value
     * that was set with this function.
     *
     * In the case that the commandline invocation is local, the situation
     * is slightly more complicated.  If the commandline invocation results
     * in the mainloop running (ie: because the use-count of the application
     * increased to a non-zero value) then the application is considered to
     * have been 'successful' in a certain sense, and the exit status is
     * always zero.  If the application use count is zero, though, the exit
     * status of the local #GApplicationCommandLine is used.
     *
     * This method is a no-op if g_application_command_line_done() has
     * been called.
     *
     * @param exitStatus the exit status
     * @since 2.28
     */
    @GioVersion2_28
    public open fun setExitStatus(exitStatus: gint): Unit =
        g_application_command_line_set_exit_status(gioApplicationCommandLinePointer, exitStatus)

    public companion object : TypeCompanion<ApplicationCommandLine> {
        override val type: GeneratedClassKGType<ApplicationCommandLine> =
            GeneratedClassKGType(g_application_command_line_get_type()) { ApplicationCommandLine(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of ApplicationCommandLine
         *
         * @return the GType
         */
        public fun getType(): GType = g_application_command_line_get_type()
    }
}

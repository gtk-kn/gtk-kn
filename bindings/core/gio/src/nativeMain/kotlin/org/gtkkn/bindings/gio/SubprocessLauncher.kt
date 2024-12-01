// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.gio.annotations.GioVersion2_40
import org.gtkkn.bindings.gio.annotations.GioVersion2_68
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.common.toCStringList
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GSubprocessLauncher
import org.gtkkn.native.gio.g_subprocess_launcher_close
import org.gtkkn.native.gio.g_subprocess_launcher_get_type
import org.gtkkn.native.gio.g_subprocess_launcher_getenv
import org.gtkkn.native.gio.g_subprocess_launcher_new
import org.gtkkn.native.gio.g_subprocess_launcher_set_cwd
import org.gtkkn.native.gio.g_subprocess_launcher_set_environ
import org.gtkkn.native.gio.g_subprocess_launcher_set_flags
import org.gtkkn.native.gio.g_subprocess_launcher_set_stderr_file_path
import org.gtkkn.native.gio.g_subprocess_launcher_set_stdin_file_path
import org.gtkkn.native.gio.g_subprocess_launcher_set_stdout_file_path
import org.gtkkn.native.gio.g_subprocess_launcher_setenv
import org.gtkkn.native.gio.g_subprocess_launcher_spawnv
import org.gtkkn.native.gio.g_subprocess_launcher_take_fd
import org.gtkkn.native.gio.g_subprocess_launcher_take_stderr_fd
import org.gtkkn.native.gio.g_subprocess_launcher_take_stdin_fd
import org.gtkkn.native.gio.g_subprocess_launcher_take_stdout_fd
import org.gtkkn.native.gio.g_subprocess_launcher_unsetenv
import org.gtkkn.native.glib.GError
import kotlin.Boolean
import kotlin.Int
import kotlin.Result
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * This class contains a set of options for launching child processes,
 * such as where its standard input and output will be directed, the
 * argument list, the environment, and more.
 *
 * While the [class@Gio.Subprocess] class has high level functions covering
 * popular cases, use of this class allows access to more advanced
 * options.  It can also be used to launch multiple subprocesses with
 * a similar configuration.
 *
 * ## Skipped during bindings generation
 *
 * - method `flags`: Property has no getter nor setter
 *
 * @since 2.40
 */
@GioVersion2_40
public open class SubprocessLauncher(
    pointer: CPointer<GSubprocessLauncher>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val gioSubprocessLauncherPointer: CPointer<GSubprocessLauncher>
        get() = gPointer.reinterpret()

    /**
     * Creates a new #GSubprocessLauncher.
     *
     * The launcher is created with the default options.  A copy of the
     * environment of the calling process is made at the time of this call
     * and will be used as the environment that the process is launched in.
     *
     * @param flags #GSubprocessFlags
     * @since 2.40
     */
    public constructor(flags: SubprocessFlags) : this(g_subprocess_launcher_new(flags.mask)!!.reinterpret())

    /**
     * Closes all the file descriptors previously passed to the object with
     * g_subprocess_launcher_take_fd(), g_subprocess_launcher_take_stderr_fd(), etc.
     *
     * After calling this method, any subsequent calls to g_subprocess_launcher_spawn() or g_subprocess_launcher_spawnv() will
     * return %G_IO_ERROR_CLOSED. This method is idempotent if
     * called more than once.
     *
     * This function is called automatically when the #GSubprocessLauncher
     * is disposed, but is provided separately so that garbage collected
     * language bindings can call it earlier to guarantee when FDs are closed.
     *
     * @since 2.68
     */
    @GioVersion2_68
    public open fun close(): Unit = g_subprocess_launcher_close(gioSubprocessLauncherPointer.reinterpret())

    /**
     * Returns the value of the environment variable @variable in the
     * environment of processes launched from this launcher.
     *
     * On UNIX, the returned string can be an arbitrary byte string.
     * On Windows, it will be UTF-8.
     *
     * @param variable the environment variable to get
     * @return the value of the environment variable,
     *     null if unset
     * @since 2.40
     */
    @GioVersion2_40
    public open fun getenv(variable: String): String? =
        g_subprocess_launcher_getenv(gioSubprocessLauncherPointer.reinterpret(), variable)?.toKString()

    /**
     * Sets the current working directory that processes will be launched
     * with.
     *
     * By default processes are launched with the current working directory
     * of the launching process at the time of launch.
     *
     * @param cwd the cwd for launched processes
     * @since 2.40
     */
    @GioVersion2_40
    public open fun setCwd(cwd: String): Unit =
        g_subprocess_launcher_set_cwd(gioSubprocessLauncherPointer.reinterpret(), cwd)

    /**
     * Replace the entire environment of processes launched from this
     * launcher with the given 'environ' variable.
     *
     * Typically you will build this variable by using g_listenv() to copy
     * the process 'environ' and using the functions g_environ_setenv(),
     * g_environ_unsetenv(), etc.
     *
     * As an alternative, you can use g_subprocess_launcher_setenv(),
     * g_subprocess_launcher_unsetenv(), etc.
     *
     * Pass an empty array to set an empty environment. Pass null to inherit the
     * parent process’ environment. As of GLib 2.54, the parent process’ environment
     * will be copied when g_subprocess_launcher_set_environ() is called.
     * Previously, it was copied when the subprocess was executed. This means the
     * copied environment may now be modified (using g_subprocess_launcher_setenv(),
     * etc.) before launching the subprocess.
     *
     * On UNIX, all strings in this array can be arbitrary byte strings.
     * On Windows, they should be in UTF-8.
     *
     * @param env the replacement environment
     * @since 2.40
     */
    @GioVersion2_40
    public open fun setEnviron(env: List<String>): Unit =
        memScoped {
            return g_subprocess_launcher_set_environ(
                gioSubprocessLauncherPointer.reinterpret(),
                env.toCStringList(this)
            )
        }

    /**
     * Sets the flags on the launcher.
     *
     * The default flags are %G_SUBPROCESS_FLAGS_NONE.
     *
     * You may not set flags that specify conflicting options for how to
     * handle a particular stdio stream (eg: specifying both
     * %G_SUBPROCESS_FLAGS_STDIN_PIPE and
     * %G_SUBPROCESS_FLAGS_STDIN_INHERIT).
     *
     * You may also not set a flag that conflicts with a previous call to a
     * function like g_subprocess_launcher_set_stdin_file_path() or
     * g_subprocess_launcher_take_stdout_fd().
     *
     * @param flags #GSubprocessFlags
     * @since 2.40
     */
    @GioVersion2_40
    public open fun setFlags(flags: SubprocessFlags): Unit =
        g_subprocess_launcher_set_flags(gioSubprocessLauncherPointer.reinterpret(), flags.mask)

    /**
     * Sets the file path to use as the stderr for spawned processes.
     *
     * If @path is null then any previously given path is unset.
     *
     * The file will be created or truncated when the process is spawned, as
     * would be the case if using '2>' at the shell.
     *
     * If you want to send both stdout and stderr to the same file then use
     * %G_SUBPROCESS_FLAGS_STDERR_MERGE.
     *
     * You may not set a stderr file path if a stderr fd is already set or
     * if the launcher flags contain any flags directing stderr elsewhere.
     *
     * This feature is only available on UNIX.
     *
     * @param path a filename or null
     * @since 2.40
     */
    @GioVersion2_40
    public open fun setStderrFilePath(path: String? = null): Unit =
        g_subprocess_launcher_set_stderr_file_path(gioSubprocessLauncherPointer.reinterpret(), path)

    /**
     * Sets the file path to use as the stdin for spawned processes.
     *
     * If @path is null then any previously given path is unset.
     *
     * The file must exist or spawning the process will fail.
     *
     * You may not set a stdin file path if a stdin fd is already set or if
     * the launcher flags contain any flags directing stdin elsewhere.
     *
     * This feature is only available on UNIX.
     *
     * @param path a filename or null
     * @since 2.40
     */
    @GioVersion2_40
    public open fun setStdinFilePath(path: String? = null): Unit =
        g_subprocess_launcher_set_stdin_file_path(gioSubprocessLauncherPointer.reinterpret(), path)

    /**
     * Sets the file path to use as the stdout for spawned processes.
     *
     * If @path is null then any previously given path is unset.
     *
     * The file will be created or truncated when the process is spawned, as
     * would be the case if using '>' at the shell.
     *
     * You may not set a stdout file path if a stdout fd is already set or
     * if the launcher flags contain any flags directing stdout elsewhere.
     *
     * This feature is only available on UNIX.
     *
     * @param path a filename or null
     * @since 2.40
     */
    @GioVersion2_40
    public open fun setStdoutFilePath(path: String? = null): Unit =
        g_subprocess_launcher_set_stdout_file_path(gioSubprocessLauncherPointer.reinterpret(), path)

    /**
     * Sets the environment variable @variable in the environment of
     * processes launched from this launcher.
     *
     * On UNIX, both the variable's name and value can be arbitrary byte
     * strings, except that the variable's name cannot contain '='.
     * On Windows, they should be in UTF-8.
     *
     * @param variable the environment variable to set,
     *     must not contain '='
     * @param value the new value for the variable
     * @param overwrite whether to change the variable if it already exists
     * @since 2.40
     */
    @GioVersion2_40
    public open fun setenv(
        variable: String,
        `value`: String,
        overwrite: Boolean,
    ): Unit =
        g_subprocess_launcher_setenv(
            gioSubprocessLauncherPointer.reinterpret(),
            variable,
            `value`,
            overwrite.asGBoolean()
        )

    /**
     * Creates a #GSubprocess given a provided array of arguments.
     *
     * @param argv Command line arguments
     * @return A new #GSubprocess, or null on error (and @error will be set)
     * @since 2.40
     */
    @GioVersion2_40
    public open fun spawnv(argv: List<String>): Result<Subprocess> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_subprocess_launcher_spawnv(
                    gioSubprocessLauncherPointer.reinterpret(),
                    argv.toCStringList(this),
                    gError.ptr
                )?.run {
                    Subprocess(reinterpret())
                }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * Transfer an arbitrary file descriptor from parent process to the
     * child.  This function takes ownership of the @source_fd; it will be closed
     * in the parent when @self is freed.
     *
     * By default, all file descriptors from the parent will be closed.
     * This function allows you to create (for example) a custom `pipe()` or
     * `socketpair()` before launching the process, and choose the target
     * descriptor in the child.
     *
     * An example use case is GNUPG, which has a command line argument
     * `--passphrase-fd` providing a file descriptor number where it expects
     * the passphrase to be written.
     *
     * @param sourceFd File descriptor in parent process
     * @param targetFd Target descriptor for child process
     */
    public open fun takeFd(
        sourceFd: Int,
        targetFd: Int,
    ): Unit = g_subprocess_launcher_take_fd(gioSubprocessLauncherPointer.reinterpret(), sourceFd, targetFd)

    /**
     * Sets the file descriptor to use as the stderr for spawned processes.
     *
     * If @fd is -1 then any previously given fd is unset.
     *
     * Note that the default behaviour is to pass stderr through to the
     * stderr of the parent process.
     *
     * The passed @fd belongs to the #GSubprocessLauncher.  It will be
     * automatically closed when the launcher is finalized.  The file
     * descriptor will also be closed on the child side when executing the
     * spawned process.
     *
     * You may not set a stderr fd if a stderr file path is already set or
     * if the launcher flags contain any flags directing stderr elsewhere.
     *
     * This feature is only available on UNIX.
     *
     * @param fd a file descriptor, or -1
     * @since 2.40
     */
    @GioVersion2_40
    public open fun takeStderrFd(fd: Int): Unit =
        g_subprocess_launcher_take_stderr_fd(gioSubprocessLauncherPointer.reinterpret(), fd)

    /**
     * Sets the file descriptor to use as the stdin for spawned processes.
     *
     * If @fd is -1 then any previously given fd is unset.
     *
     * Note that if your intention is to have the stdin of the calling
     * process inherited by the child then %G_SUBPROCESS_FLAGS_STDIN_INHERIT
     * is a better way to go about doing that.
     *
     * The passed @fd is noted but will not be touched in the current
     * process.  It is therefore necessary that it be kept open by the
     * caller until the subprocess is spawned.  The file descriptor will
     * also not be explicitly closed on the child side, so it must be marked
     * O_CLOEXEC if that's what you want.
     *
     * You may not set a stdin fd if a stdin file path is already set or if
     * the launcher flags contain any flags directing stdin elsewhere.
     *
     * This feature is only available on UNIX.
     *
     * @param fd a file descriptor, or -1
     * @since 2.40
     */
    @GioVersion2_40
    public open fun takeStdinFd(fd: Int): Unit =
        g_subprocess_launcher_take_stdin_fd(gioSubprocessLauncherPointer.reinterpret(), fd)

    /**
     * Sets the file descriptor to use as the stdout for spawned processes.
     *
     * If @fd is -1 then any previously given fd is unset.
     *
     * Note that the default behaviour is to pass stdout through to the
     * stdout of the parent process.
     *
     * The passed @fd is noted but will not be touched in the current
     * process.  It is therefore necessary that it be kept open by the
     * caller until the subprocess is spawned.  The file descriptor will
     * also not be explicitly closed on the child side, so it must be marked
     * O_CLOEXEC if that's what you want.
     *
     * You may not set a stdout fd if a stdout file path is already set or
     * if the launcher flags contain any flags directing stdout elsewhere.
     *
     * This feature is only available on UNIX.
     *
     * @param fd a file descriptor, or -1
     * @since 2.40
     */
    @GioVersion2_40
    public open fun takeStdoutFd(fd: Int): Unit =
        g_subprocess_launcher_take_stdout_fd(gioSubprocessLauncherPointer.reinterpret(), fd)

    /**
     * Removes the environment variable @variable from the environment of
     * processes launched from this launcher.
     *
     * On UNIX, the variable's name can be an arbitrary byte string not
     * containing '='. On Windows, it should be in UTF-8.
     *
     * @param variable the environment variable to unset,
     *     must not contain '='
     * @since 2.40
     */
    @GioVersion2_40
    public open fun unsetenv(variable: String): Unit =
        g_subprocess_launcher_unsetenv(gioSubprocessLauncherPointer.reinterpret(), variable)

    public companion object : TypeCompanion<SubprocessLauncher> {
        override val type: GeneratedClassKGType<SubprocessLauncher> =
            GeneratedClassKGType(g_subprocess_launcher_get_type()) { SubprocessLauncher(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }
    }
}

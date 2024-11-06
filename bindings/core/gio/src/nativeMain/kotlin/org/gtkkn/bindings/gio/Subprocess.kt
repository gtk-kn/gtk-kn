// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.Gio.resolveException
import org.gtkkn.bindings.gio.annotations.GioVersion2_40
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.toCStringList
import org.gtkkn.extensions.glib.GlibException
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GInitable
import org.gtkkn.native.gio.GSubprocess
import org.gtkkn.native.gio.g_subprocess_communicate_async
import org.gtkkn.native.gio.g_subprocess_communicate_utf8_async
import org.gtkkn.native.gio.g_subprocess_force_exit
import org.gtkkn.native.gio.g_subprocess_get_exit_status
import org.gtkkn.native.gio.g_subprocess_get_identifier
import org.gtkkn.native.gio.g_subprocess_get_if_exited
import org.gtkkn.native.gio.g_subprocess_get_if_signaled
import org.gtkkn.native.gio.g_subprocess_get_status
import org.gtkkn.native.gio.g_subprocess_get_stderr_pipe
import org.gtkkn.native.gio.g_subprocess_get_stdin_pipe
import org.gtkkn.native.gio.g_subprocess_get_stdout_pipe
import org.gtkkn.native.gio.g_subprocess_get_successful
import org.gtkkn.native.gio.g_subprocess_get_term_sig
import org.gtkkn.native.gio.g_subprocess_get_type
import org.gtkkn.native.gio.g_subprocess_newv
import org.gtkkn.native.gio.g_subprocess_send_signal
import org.gtkkn.native.gio.g_subprocess_wait
import org.gtkkn.native.gio.g_subprocess_wait_async
import org.gtkkn.native.gio.g_subprocess_wait_check
import org.gtkkn.native.gio.g_subprocess_wait_check_async
import org.gtkkn.native.gio.g_subprocess_wait_check_finish
import org.gtkkn.native.gio.g_subprocess_wait_finish
import org.gtkkn.native.glib.GError
import kotlin.Boolean
import kotlin.Int
import kotlin.Result
import kotlin.String
import kotlin.Throws
import kotlin.Unit
import kotlin.collections.List

/**
 * `GSubprocess` allows the creation of and interaction with child
 * processes.
 *
 * Processes can be communicated with using standard GIO-style APIs (ie:
 * [class@Gio.InputStream], [class@Gio.OutputStream]). There are GIO-style APIs
 * to wait for process termination (ie: cancellable and with an asynchronous
 * variant).
 *
 * There is an API to force a process to terminate, as well as a
 * race-free API for sending UNIX signals to a subprocess.
 *
 * One major advantage that GIO brings over the core GLib library is
 * comprehensive API for asynchronous I/O, such
 * [method@Gio.OutputStream.splice_async].  This makes `GSubprocess`
 * significantly more powerful and flexible than equivalent APIs in
 * some other languages such as the `subprocess.py`
 * included with Python.  For example, using `GSubprocess` one could
 * create two child processes, reading standard output from the first,
 * processing it, and writing to the input stream of the second, all
 * without blocking the main loop.
 *
 * A powerful [method@Gio.Subprocess.communicate] API is provided similar to the
 * `communicate()` method of `subprocess.py`. This enables very easy
 * interaction with a subprocess that has been opened with pipes.
 *
 * `GSubprocess` defaults to tight control over the file descriptors open
 * in the child process, avoiding dangling-FD issues that are caused by
 * a simple `fork()`/`exec()`.  The only open file descriptors in the
 * spawned process are ones that were explicitly specified by the
 * `GSubprocess` API (unless `G_SUBPROCESS_FLAGS_INHERIT_FDS` was
 * specified).
 *
 * `GSubprocess` will quickly reap all child processes as they exit,
 * avoiding ‘zombie processes’ remaining around for long periods of
 * time.  [method@Gio.Subprocess.wait] can be used to wait for this to happen,
 * but it will happen even without the call being explicitly made.
 *
 * As a matter of principle, `GSubprocess` has no API that accepts
 * shell-style space-separated strings.  It will, however, match the
 * typical shell behaviour of searching the `PATH` for executables that do
 * not contain a directory separator in their name. By default, the `PATH`
 * of the current process is used.  You can specify
 * `G_SUBPROCESS_FLAGS_SEARCH_PATH_FROM_ENVP` to use the `PATH` of the
 * launcher environment instead.
 *
 * `GSubprocess` attempts to have a very simple API for most uses (ie:
 * spawning a subprocess with arguments and support for most typical
 * kinds of input and output redirection).  See [ctor@Gio.Subprocess.new]. The
 * [class@Gio.SubprocessLauncher] API is provided for more complicated cases
 * (advanced types of redirection, environment variable manipulation,
 * change of working directory, child setup functions, etc).
 *
 * A typical use of `GSubprocess` will involve calling
 * [ctor@Gio.Subprocess.new], followed by [method@Gio.Subprocess.wait_async] or
 * [method@Gio.Subprocess.wait].  After the process exits, the status can be
 * checked using functions such as [method@Gio.Subprocess.get_if_exited] (which
 * are similar to the familiar `WIFEXITED`-style POSIX macros).
 *
 * ## Skipped during bindings generation
 *
 * - parameter `stdout_buf`: stdout_buf: Out parameter is not supported
 * - parameter `stdout_buf`: stdout_buf: Out parameter is not supported
 * - parameter `stdout_buf`: stdout_buf: Out parameter is not supported
 * - parameter `stdout_buf`: stdout_buf: Out parameter is not supported
 * - method `argv`: Property has no getter nor setter
 * - method `flags`: Property has no getter nor setter
 *
 * @since 2.40
 */
@GioVersion2_40
public open class Subprocess(
    pointer: CPointer<GSubprocess>,
) : Object(pointer.reinterpret()),
    Initable,
    KGTyped {
    public val gioSubprocessPointer: CPointer<GSubprocess>
        get() = gPointer.reinterpret()

    override val gioInitablePointer: CPointer<GInitable>
        get() = gPointer.reinterpret()

    /**
     * Create a new process with the given flags and argument list.
     *
     * The argument list is expected to be null-terminated.
     *
     * @param argv commandline arguments for the subprocess
     * @param flags flags that define the behaviour of the subprocess
     * @return A newly created #GSubprocess, or null on error (and @error
     *   will be set)
     * @since 2.40
     */
    @Throws(GlibException::class)
    public constructor(argv: List<String>, flags: SubprocessFlags) : this(
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_subprocess_newv(argv.toCStringList(this), flags.mask, gError.ptr)
            if (gError.pointed != null) {
                throw resolveException(Error(gError.pointed!!.ptr))
            }
            gResult!!.reinterpret()
        }
    )

    /**
     * Asynchronous version of g_subprocess_communicate().  Complete
     * invocation with g_subprocess_communicate_finish().
     *
     * @param stdinBuf Input data, or null
     * @param cancellable Cancellable
     * @param callback Callback
     */
    public open fun communicateAsync(
        stdinBuf: Bytes? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        g_subprocess_communicate_async(
            gioSubprocessPointer.reinterpret(),
            stdinBuf?.glibBytesPointer,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Asynchronous version of g_subprocess_communicate_utf8().  Complete
     * invocation with g_subprocess_communicate_utf8_finish().
     *
     * @param stdinBuf Input data, or null
     * @param cancellable Cancellable
     * @param callback Callback
     */
    public open fun communicateUtf8Async(
        stdinBuf: String? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        g_subprocess_communicate_utf8_async(
            gioSubprocessPointer.reinterpret(),
            stdinBuf,
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Use an operating-system specific method to attempt an immediate,
     * forceful termination of the process.  There is no mechanism to
     * determine whether or not the request itself was successful;
     * however, you can use g_subprocess_wait() to monitor the status of
     * the process after calling this function.
     *
     * On Unix, this function sends %SIGKILL.
     *
     * @since 2.40
     */
    @GioVersion2_40
    public open fun forceExit(): Unit = g_subprocess_force_exit(gioSubprocessPointer.reinterpret())

    /**
     * Check the exit status of the subprocess, given that it exited
     * normally.  This is the value passed to the exit() system call or the
     * return value from main.
     *
     * This is equivalent to the system WEXITSTATUS macro.
     *
     * It is an error to call this function before g_subprocess_wait() and
     * unless g_subprocess_get_if_exited() returned true.
     *
     * @return the exit status
     * @since 2.40
     */
    @GioVersion2_40
    public open fun getExitStatus(): Int = g_subprocess_get_exit_status(gioSubprocessPointer.reinterpret())

    /**
     * On UNIX, returns the process ID as a decimal string.
     * On Windows, returns the result of GetProcessId() also as a string.
     * If the subprocess has terminated, this will return null.
     *
     * @return the subprocess identifier, or null if the subprocess
     *    has terminated
     * @since 2.40
     */
    @GioVersion2_40
    public open fun getIdentifier(): String? =
        g_subprocess_get_identifier(gioSubprocessPointer.reinterpret())?.toKString()

    /**
     * Check if the given subprocess exited normally (ie: by way of exit()
     * or return from main()).
     *
     * This is equivalent to the system WIFEXITED macro.
     *
     * It is an error to call this function before g_subprocess_wait() has
     * returned.
     *
     * @return true if the case of a normal exit
     * @since 2.40
     */
    @GioVersion2_40
    public open fun getIfExited(): Boolean = g_subprocess_get_if_exited(gioSubprocessPointer.reinterpret()).asBoolean()

    /**
     * Check if the given subprocess terminated in response to a signal.
     *
     * This is equivalent to the system WIFSIGNALED macro.
     *
     * It is an error to call this function before g_subprocess_wait() has
     * returned.
     *
     * @return true if the case of termination due to a signal
     * @since 2.40
     */
    @GioVersion2_40
    public open fun getIfSignaled(): Boolean =
        g_subprocess_get_if_signaled(gioSubprocessPointer.reinterpret()).asBoolean()

    /**
     * Gets the raw status code of the process, as from waitpid().
     *
     * This value has no particular meaning, but it can be used with the
     * macros defined by the system headers such as WIFEXITED.  It can also
     * be used with g_spawn_check_wait_status().
     *
     * It is more likely that you want to use g_subprocess_get_if_exited()
     * followed by g_subprocess_get_exit_status().
     *
     * It is an error to call this function before g_subprocess_wait() has
     * returned.
     *
     * @return the (meaningless) waitpid() exit status from the kernel
     * @since 2.40
     */
    @GioVersion2_40
    public open fun getStatus(): Int = g_subprocess_get_status(gioSubprocessPointer.reinterpret())

    /**
     * Gets the #GInputStream from which to read the stderr output of
     * @subprocess.
     *
     * The process must have been created with %G_SUBPROCESS_FLAGS_STDERR_PIPE,
     * otherwise null will be returned.
     *
     * @return the stderr pipe
     * @since 2.40
     */
    @GioVersion2_40
    public open fun getStderrPipe(): InputStream? =
        g_subprocess_get_stderr_pipe(gioSubprocessPointer.reinterpret())?.run {
            InputStream(reinterpret())
        }

    /**
     * Gets the #GOutputStream that you can write to in order to give data
     * to the stdin of @subprocess.
     *
     * The process must have been created with %G_SUBPROCESS_FLAGS_STDIN_PIPE and
     * not %G_SUBPROCESS_FLAGS_STDIN_INHERIT, otherwise null will be returned.
     *
     * @return the stdout pipe
     * @since 2.40
     */
    @GioVersion2_40
    public open fun getStdinPipe(): OutputStream? =
        g_subprocess_get_stdin_pipe(gioSubprocessPointer.reinterpret())?.run {
            OutputStream(reinterpret())
        }

    /**
     * Gets the #GInputStream from which to read the stdout output of
     * @subprocess.
     *
     * The process must have been created with %G_SUBPROCESS_FLAGS_STDOUT_PIPE,
     * otherwise null will be returned.
     *
     * @return the stdout pipe
     * @since 2.40
     */
    @GioVersion2_40
    public open fun getStdoutPipe(): InputStream? =
        g_subprocess_get_stdout_pipe(gioSubprocessPointer.reinterpret())?.run {
            InputStream(reinterpret())
        }

    /**
     * Checks if the process was "successful".  A process is considered
     * successful if it exited cleanly with an exit status of 0, either by
     * way of the exit() system call or return from main().
     *
     * It is an error to call this function before g_subprocess_wait() has
     * returned.
     *
     * @return true if the process exited cleanly with a exit status of 0
     * @since 2.40
     */
    @GioVersion2_40
    public open fun getSuccessful(): Boolean =
        g_subprocess_get_successful(gioSubprocessPointer.reinterpret()).asBoolean()

    /**
     * Get the signal number that caused the subprocess to terminate, given
     * that it terminated due to a signal.
     *
     * This is equivalent to the system WTERMSIG macro.
     *
     * It is an error to call this function before g_subprocess_wait() and
     * unless g_subprocess_get_if_signaled() returned true.
     *
     * @return the signal causing termination
     * @since 2.40
     */
    @GioVersion2_40
    public open fun getTermSig(): Int = g_subprocess_get_term_sig(gioSubprocessPointer.reinterpret())

    /**
     * Sends the UNIX signal @signal_num to the subprocess, if it is still
     * running.
     *
     * This API is race-free.  If the subprocess has terminated, it will not
     * be signalled.
     *
     * This API is not available on Windows.
     *
     * @param signalNum the signal number to send
     * @since 2.40
     */
    @GioVersion2_40
    public open fun sendSignal(signalNum: Int): Unit =
        g_subprocess_send_signal(gioSubprocessPointer.reinterpret(), signalNum)

    /**
     * Synchronously wait for the subprocess to terminate.
     *
     * After the process terminates you can query its exit status with
     * functions such as g_subprocess_get_if_exited() and
     * g_subprocess_get_exit_status().
     *
     * This function does not fail in the case of the subprocess having
     * abnormal termination.  See g_subprocess_wait_check() for that.
     *
     * Cancelling @cancellable doesn't kill the subprocess.  Call
     * g_subprocess_force_exit() if it is desirable.
     *
     * @param cancellable a #GCancellable
     * @return true on success, false if @cancellable was cancelled
     * @since 2.40
     */
    @GioVersion2_40
    public open fun wait(cancellable: Cancellable? = null): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_subprocess_wait(
                    gioSubprocessPointer.reinterpret(),
                    cancellable?.gioCancellablePointer?.reinterpret(),
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Wait for the subprocess to terminate.
     *
     * This is the asynchronous version of g_subprocess_wait().
     *
     * @param cancellable a #GCancellable, or null
     * @param callback a #GAsyncReadyCallback to call when the operation is complete
     * @since 2.40
     */
    @GioVersion2_40
    public open fun waitAsync(
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        g_subprocess_wait_async(
            gioSubprocessPointer.reinterpret(),
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Combines g_subprocess_wait() with g_spawn_check_wait_status().
     *
     * @param cancellable a #GCancellable
     * @return true on success, false if process exited abnormally, or
     * @cancellable was cancelled
     * @since 2.40
     */
    @GioVersion2_40
    public open fun waitCheck(cancellable: Cancellable? = null): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_subprocess_wait_check(
                    gioSubprocessPointer.reinterpret(),
                    cancellable?.gioCancellablePointer?.reinterpret(),
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Combines g_subprocess_wait_async() with g_spawn_check_wait_status().
     *
     * This is the asynchronous version of g_subprocess_wait_check().
     *
     * @param cancellable a #GCancellable, or null
     * @param callback a #GAsyncReadyCallback to call when the operation is complete
     * @since 2.40
     */
    @GioVersion2_40
    public open fun waitCheckAsync(
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        g_subprocess_wait_check_async(
            gioSubprocessPointer.reinterpret(),
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Collects the result of a previous call to
     * g_subprocess_wait_check_async().
     *
     * @param result the #GAsyncResult passed to your #GAsyncReadyCallback
     * @return true if successful, or false with @error set
     * @since 2.40
     */
    @GioVersion2_40
    public open fun waitCheckFinish(result: AsyncResult): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_subprocess_wait_check_finish(
                    gioSubprocessPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Collects the result of a previous call to
     * g_subprocess_wait_async().
     *
     * @param result the #GAsyncResult passed to your #GAsyncReadyCallback
     * @return true if successful, or false with @error set
     * @since 2.40
     */
    @GioVersion2_40
    public open fun waitFinish(result: AsyncResult): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_subprocess_wait_finish(
                    gioSubprocessPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    public companion object : TypeCompanion<Subprocess> {
        override val type: GeneratedClassKGType<Subprocess> =
            GeneratedClassKGType(g_subprocess_get_type()) { Subprocess(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }
    }
}

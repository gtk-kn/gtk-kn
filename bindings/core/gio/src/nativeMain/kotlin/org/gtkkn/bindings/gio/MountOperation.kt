// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CArrayPointer
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.CPointerVarOf
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.cstr
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.annotations.GioVersion2_20
import org.gtkkn.bindings.gio.annotations.GioVersion2_34
import org.gtkkn.bindings.gio.annotations.GioVersion2_58
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.ext.toCStringList
import org.gtkkn.extensions.glib.ext.toKStringList
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GAskPasswordFlags
import org.gtkkn.native.gio.GMountOperation
import org.gtkkn.native.gio.GMountOperationResult
import org.gtkkn.native.gio.g_mount_operation_get_anonymous
import org.gtkkn.native.gio.g_mount_operation_get_choice
import org.gtkkn.native.gio.g_mount_operation_get_domain
import org.gtkkn.native.gio.g_mount_operation_get_is_tcrypt_hidden_volume
import org.gtkkn.native.gio.g_mount_operation_get_is_tcrypt_system_volume
import org.gtkkn.native.gio.g_mount_operation_get_password
import org.gtkkn.native.gio.g_mount_operation_get_password_save
import org.gtkkn.native.gio.g_mount_operation_get_pim
import org.gtkkn.native.gio.g_mount_operation_get_type
import org.gtkkn.native.gio.g_mount_operation_get_username
import org.gtkkn.native.gio.g_mount_operation_new
import org.gtkkn.native.gio.g_mount_operation_reply
import org.gtkkn.native.gio.g_mount_operation_set_anonymous
import org.gtkkn.native.gio.g_mount_operation_set_choice
import org.gtkkn.native.gio.g_mount_operation_set_domain
import org.gtkkn.native.gio.g_mount_operation_set_is_tcrypt_hidden_volume
import org.gtkkn.native.gio.g_mount_operation_set_is_tcrypt_system_volume
import org.gtkkn.native.gio.g_mount_operation_set_password
import org.gtkkn.native.gio.g_mount_operation_set_password_save
import org.gtkkn.native.gio.g_mount_operation_set_pim
import org.gtkkn.native.gio.g_mount_operation_set_username
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gint64
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit
import kotlin.collections.List

/**
 * `GMountOperation` provides a mechanism for interacting with the user.
 * It can be used for authenticating mountable operations, such as loop
 * mounting files, hard drive partitions or server locations. It can
 * also be used to ask the user questions or show a list of applications
 * preventing unmount or eject operations from completing.
 *
 * Note that `GMountOperation` is used for more than just [iface@Gio.Mount]
 * objects – for example it is also used in [method@Gio.Drive.start] and
 * [method@Gio.Drive.stop].
 *
 * Users should instantiate a subclass of this that implements all the
 * various callbacks to show the required dialogs, such as
 * [`GtkMountOperation`](https://docs.gtk.org/gtk4/class.MountOperation.html).
 * If no user interaction is desired (for example when automounting
 * filesystems at login time), usually `NULL` can be passed, see each method
 * taking a `GMountOperation` for details.
 *
 * Throughout the API, the term ‘TCRYPT’ is used to mean ‘compatible with TrueCrypt and VeraCrypt’.
 * [TrueCrypt](https://en.wikipedia.org/wiki/TrueCrypt) is a discontinued system for
 * encrypting file containers, partitions or whole disks, typically used with Windows.
 * [VeraCrypt](https://www.veracrypt.fr/) is a maintained fork of TrueCrypt with various
 * improvements and auditing fixes.
 *
 * ## Skipped during bindings generation
 *
 * - signal `show-processes`: Unsupported parameter `processes` : GLib.Array parameter of type GLib.Pid is not supported
 */
public open class MountOperation(public val gioMountOperationPointer: CPointer<GMountOperation>) :
    Object(gioMountOperationPointer.reinterpret()),
    KGTyped {
    /**
     * Whether to use an anonymous user when authenticating.
     */
    public open var anonymous: Boolean
        /**
         * Check to see whether the mount operation is being used
         * for an anonymous user.
         *
         * @return true if mount operation is anonymous.
         */
        get() = g_mount_operation_get_anonymous(gioMountOperationPointer).asBoolean()

        /**
         * Sets the mount operation to use an anonymous user if @anonymous is true.
         *
         * @param anonymous boolean value.
         */
        set(anonymous) = g_mount_operation_set_anonymous(gioMountOperationPointer, anonymous.asGBoolean())

    /**
     * The index of the user's choice when a question is asked during the
     * mount operation. See the #GMountOperation::ask-question signal.
     */
    public open var choice: gint
        /**
         * Gets a choice from the mount operation.
         *
         * @return an integer containing an index of the user's choice from
         * the choice's list, or `0`.
         */
        get() = g_mount_operation_get_choice(gioMountOperationPointer)

        /**
         * Sets a default choice for the mount operation.
         *
         * @param choice an integer.
         */
        set(choice) = g_mount_operation_set_choice(gioMountOperationPointer, choice)

    /**
     * The domain to use for the mount operation.
     */
    public open var domain: String?
        /**
         * Gets the domain of the mount operation.
         *
         * @return a string set to the domain.
         */
        get() = g_mount_operation_get_domain(gioMountOperationPointer)?.toKString()

        /**
         * Sets the mount operation's domain.
         *
         * @param domain the domain to set.
         */
        set(domain) = g_mount_operation_set_domain(gioMountOperationPointer, domain)

    /**
     * Whether the device to be unlocked is a TCRYPT hidden volume.
     * See [the VeraCrypt documentation](https://www.veracrypt.fr/en/Hidden%20Volume.html).
     *
     * @since 2.58
     */
    @GioVersion2_58
    public open var isTcryptHiddenVolume: Boolean
        /**
         * Check to see whether the mount operation is being used
         * for a TCRYPT hidden volume.
         *
         * @return true if mount operation is for hidden volume.
         * @since 2.58
         */
        get() = g_mount_operation_get_is_tcrypt_hidden_volume(gioMountOperationPointer).asBoolean()

        /**
         * Sets the mount operation to use a hidden volume if @hidden_volume is true.
         *
         * @param hiddenVolume boolean value.
         * @since 2.58
         */
        @GioVersion2_58
        set(
            hiddenVolume
        ) = g_mount_operation_set_is_tcrypt_hidden_volume(gioMountOperationPointer, hiddenVolume.asGBoolean())

    /**
     * Whether the device to be unlocked is a TCRYPT system volume.
     * In this context, a system volume is a volume with a bootloader
     * and operating system installed. This is only supported for Windows
     * operating systems. For further documentation, see
     * [the VeraCrypt documentation](https://www.veracrypt.fr/en/System%20Encryption.html).
     *
     * @since 2.58
     */
    @GioVersion2_58
    public open var isTcryptSystemVolume: Boolean
        /**
         * Check to see whether the mount operation is being used
         * for a TCRYPT system volume.
         *
         * @return true if mount operation is for system volume.
         * @since 2.58
         */
        get() = g_mount_operation_get_is_tcrypt_system_volume(gioMountOperationPointer).asBoolean()

        /**
         * Sets the mount operation to use a system volume if @system_volume is true.
         *
         * @param systemVolume boolean value.
         * @since 2.58
         */
        @GioVersion2_58
        set(
            systemVolume
        ) = g_mount_operation_set_is_tcrypt_system_volume(gioMountOperationPointer, systemVolume.asGBoolean())

    /**
     * The password that is used for authentication when carrying out
     * the mount operation.
     */
    public open var password: String?
        /**
         * Gets a password from the mount operation.
         *
         * @return a string containing the password within @op.
         */
        get() = g_mount_operation_get_password(gioMountOperationPointer)?.toKString()

        /**
         * Sets the mount operation's password to @password.
         *
         * @param password password to set.
         */
        set(password) = g_mount_operation_set_password(gioMountOperationPointer, password)

    /**
     * Determines if and how the password information should be saved.
     */
    public open var passwordSave: PasswordSave
        /**
         * Gets the state of saving passwords for the mount operation.
         *
         * @return a #GPasswordSave flag.
         */
        get() = g_mount_operation_get_password_save(gioMountOperationPointer).run {
            PasswordSave.fromNativeValue(this)
        }

        /**
         * Sets the state of saving passwords for the mount operation.
         *
         * @param save a set of #GPasswordSave flags.
         */
        set(save) = g_mount_operation_set_password_save(gioMountOperationPointer, save.nativeValue)

    /**
     * The VeraCrypt PIM value, when unlocking a VeraCrypt volume. See
     * [the VeraCrypt documentation](https://www.veracrypt.fr/en/Personal%20Iterations%20Multiplier%20(PIM).html).
     *
     * @since 2.58
     */
    @GioVersion2_58
    public open var pim: guint
        /**
         * Gets a PIM from the mount operation.
         *
         * @return The VeraCrypt PIM within @op.
         * @since 2.58
         */
        get() = g_mount_operation_get_pim(gioMountOperationPointer)

        /**
         * Sets the mount operation's PIM to @pim.
         *
         * @param pim an unsigned integer.
         * @since 2.58
         */
        @GioVersion2_58
        set(pim) = g_mount_operation_set_pim(gioMountOperationPointer, pim)

    /**
     * The user name that is used for authentication when carrying out
     * the mount operation.
     */
    public open var username: String?
        /**
         * Get the user name from the mount operation.
         *
         * @return a string containing the user name.
         */
        get() = g_mount_operation_get_username(gioMountOperationPointer)?.toKString()

        /**
         * Sets the user name within @op to @username.
         *
         * @param username input username.
         */
        set(username) = g_mount_operation_set_username(gioMountOperationPointer, username)

    /**
     * Creates a new mount operation.
     *
     * @return a #GMountOperation.
     */
    public constructor() : this(g_mount_operation_new()!!.reinterpret())

    /**
     * Emits the #GMountOperation::reply signal.
     *
     * @param result a #GMountOperationResult
     */
    public open fun reply(result: MountOperationResult): Unit =
        g_mount_operation_reply(gioMountOperationPointer, result.nativeValue)

    /**
     * Emitted by the backend when e.g. a device becomes unavailable
     * while a mount operation is in progress.
     *
     * Implementations of GMountOperation should handle this signal
     * by dismissing open password dialogs.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 2.20
     */
    @GioVersion2_20
    public fun onAborted(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gioMountOperationPointer,
            "aborted",
            onAbortedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "aborted" signal. See [onAborted].
     *
     * @since 2.20
     */
    @GioVersion2_20
    public fun emitAborted() {
        g_signal_emit_by_name(gioMountOperationPointer.reinterpret(), "aborted")
    }

    /**
     * Emitted when a mount operation asks the user for a password.
     *
     * If the message contains a line break, the first line should be
     * presented as a heading. For example, it may be used as the
     * primary text in a #GtkMessageDialog.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `message` string containing a message to display to the user.; `defaultUser` string containing the default user name.; `defaultDomain` string containing the default domain.; `flags` a set of #GAskPasswordFlags.
     */
    public fun onAskPassword(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            message: String,
            defaultUser: String,
            defaultDomain: String,
            flags: AskPasswordFlags,
        ) -> Unit,
    ): ULong = g_signal_connect_data(
        gioMountOperationPointer,
        "ask-password",
        onAskPasswordFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "ask-password" signal. See [onAskPassword].
     *
     * @param message string containing a message to display to the user.
     * @param defaultUser string containing the default user name.
     * @param defaultDomain string containing the default domain.
     * @param flags a set of #GAskPasswordFlags.
     */
    public fun emitAskPassword(message: String, defaultUser: String, defaultDomain: String, flags: AskPasswordFlags) {
        g_signal_emit_by_name(
            gioMountOperationPointer.reinterpret(),
            "ask-password",
            message.cstr,
            defaultUser.cstr,
            defaultDomain.cstr,
            flags.mask
        )
    }

    /**
     * Emitted when asking the user a question and gives a list of
     * choices for the user to choose from.
     *
     * If the message contains a line break, the first line should be
     * presented as a heading. For example, it may be used as the
     * primary text in a #GtkMessageDialog.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `message` string containing a message to display to the user.; `choices` an array of strings for each possible choice.
     */
    public fun onAskQuestion(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (message: String, choices: List<String>) -> Unit,
    ): ULong = g_signal_connect_data(
        gioMountOperationPointer,
        "ask-question",
        onAskQuestionFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "ask-question" signal. See [onAskQuestion].
     *
     * @param message string containing a message to display to the user.
     * @param choices an array of strings for each possible choice.
     */
    public fun emitAskQuestion(message: String, choices: List<String>): Unit = memScoped {
        g_signal_emit_by_name(
            gioMountOperationPointer.reinterpret(),
            "ask-question",
            message.cstr,
            choices.toCStringList(this)
        )
    }

    /**
     * Emitted when the user has replied to the mount operation.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `result` a #GMountOperationResult indicating how the request was handled
     */
    public fun onReply(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (result: MountOperationResult) -> Unit,
    ): ULong = g_signal_connect_data(
        gioMountOperationPointer,
        "reply",
        onReplyFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "reply" signal. See [onReply].
     *
     * @param result a #GMountOperationResult indicating how the request was handled
     */
    public fun emitReply(result: MountOperationResult) {
        g_signal_emit_by_name(gioMountOperationPointer.reinterpret(), "reply", result.nativeValue)
    }

    /**
     * Emitted when an unmount operation has been busy for more than some time
     * (typically 1.5 seconds).
     *
     * When unmounting or ejecting a volume, the kernel might need to flush
     * pending data in its buffers to the volume stable storage, and this operation
     * can take a considerable amount of time. This signal may be emitted several
     * times as long as the unmount operation is outstanding, and then one
     * last time when the operation is completed, with @bytes_left set to zero.
     *
     * Implementations of GMountOperation should handle this signal by
     * showing an UI notification, and then dismiss it, or show another notification
     * of completion, when @bytes_left reaches zero.
     *
     * If the message contains a line break, the first line should be
     * presented as a heading. For example, it may be used as the
     * primary text in a #GtkMessageDialog.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `message` string containing a message to display to the user; `timeLeft` the estimated time left before the operation completes,
     *     in microseconds, or -1; `bytesLeft` the amount of bytes to be written before the operation
     *     completes (or -1 if such amount is not known), or zero if the operation
     *     is completed
     * @since 2.34
     */
    @GioVersion2_34
    public fun onShowUnmountProgress(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            message: String,
            timeLeft: gint64,
            bytesLeft: gint64,
        ) -> Unit,
    ): ULong = g_signal_connect_data(
        gioMountOperationPointer,
        "show-unmount-progress",
        onShowUnmountProgressFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "show-unmount-progress" signal. See [onShowUnmountProgress].
     *
     * @param message string containing a message to display to the user
     * @param timeLeft the estimated time left before the operation completes,
     *     in microseconds, or -1
     * @param bytesLeft the amount of bytes to be written before the operation
     *     completes (or -1 if such amount is not known), or zero if the operation
     *     is completed
     * @since 2.34
     */
    @GioVersion2_34
    public fun emitShowUnmountProgress(message: String, timeLeft: gint64, bytesLeft: gint64) {
        g_signal_emit_by_name(
            gioMountOperationPointer.reinterpret(),
            "show-unmount-progress",
            message.cstr,
            timeLeft,
            bytesLeft
        )
    }

    public companion object : TypeCompanion<MountOperation> {
        override val type: GeneratedClassKGType<MountOperation> =
            GeneratedClassKGType(getTypeOrNull("g_mount_operation_get_type")!!) { MountOperation(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of MountOperation
         *
         * @return the GType
         */
        public fun getType(): GType = g_mount_operation_get_type()
    }
}

private val onAbortedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onAskPasswordFunc: CPointer<
    CFunction<
        (
            CPointer<ByteVar>,
            CPointer<ByteVar>,
            CPointer<ByteVar>,
            GAskPasswordFlags,
        ) -> Unit
        >
    > = staticCFunction {
        _: COpaquePointer,
        message: CPointer<ByteVar>?,
        defaultUser: CPointer<ByteVar>?,
        defaultDomain: CPointer<ByteVar>?,
        flags: GAskPasswordFlags,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            message: String,
            defaultUser: String,
            defaultDomain: String,
            flags: AskPasswordFlags,
        ) -> Unit
        >().get().invoke(
        message?.toKString() ?: error("Expected not null string"),
        defaultUser?.toKString() ?: error("Expected not null string"),
        defaultDomain?.toKString() ?: error("Expected not null string"),
        flags.run {
            AskPasswordFlags(this)
        }
    )
}
    .reinterpret()

private val onAskQuestionFunc:
    CPointer<CFunction<(CPointer<ByteVar>, CArrayPointer<CPointerVarOf<CPointer<ByteVar>>>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            message: CPointer<ByteVar>?,
            choices: CArrayPointer<CPointerVarOf<CPointer<ByteVar>>>?,
            userData: COpaquePointer,
        ->
        memScoped {
            userData.asStableRef<(message: String, choices: List<String>) -> Unit>().get().invoke(
                message?.toKString() ?: error("Expected not null string"),
                choices?.toKStringList() ?: error("Expected not null string array")
            )
        }
    }
        .reinterpret()

private val onReplyFunc: CPointer<CFunction<(GMountOperationResult) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        result: GMountOperationResult,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(result: MountOperationResult) -> Unit>().get().invoke(
        result.run {
            MountOperationResult.fromNativeValue(this)
        }
    )
}
    .reinterpret()

private val onShowUnmountProgressFunc: CPointer<
    CFunction<
        (
            CPointer<ByteVar>,
            gint64,
            gint64,
        ) -> Unit
        >
    > = staticCFunction {
        _: COpaquePointer,
        message: CPointer<ByteVar>?,
        timeLeft: gint64,
        bytesLeft: gint64,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            message: String,
            timeLeft: gint64,
            bytesLeft: gint64,
        ) -> Unit
        >().get().invoke(message?.toKString() ?: error("Expected not null string"), timeLeft, bytesLeft)
}
    .reinterpret()

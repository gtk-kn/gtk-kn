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
import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.bindings.gio.annotations.GioVersion2_80
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GDBusMessage
import org.gtkkn.native.gio.g_dbus_message_copy
import org.gtkkn.native.gio.g_dbus_message_get_arg0
import org.gtkkn.native.gio.g_dbus_message_get_arg0_path
import org.gtkkn.native.gio.g_dbus_message_get_body
import org.gtkkn.native.gio.g_dbus_message_get_byte_order
import org.gtkkn.native.gio.g_dbus_message_get_destination
import org.gtkkn.native.gio.g_dbus_message_get_error_name
import org.gtkkn.native.gio.g_dbus_message_get_flags
import org.gtkkn.native.gio.g_dbus_message_get_header
import org.gtkkn.native.gio.g_dbus_message_get_interface
import org.gtkkn.native.gio.g_dbus_message_get_locked
import org.gtkkn.native.gio.g_dbus_message_get_member
import org.gtkkn.native.gio.g_dbus_message_get_message_type
import org.gtkkn.native.gio.g_dbus_message_get_num_unix_fds
import org.gtkkn.native.gio.g_dbus_message_get_path
import org.gtkkn.native.gio.g_dbus_message_get_reply_serial
import org.gtkkn.native.gio.g_dbus_message_get_sender
import org.gtkkn.native.gio.g_dbus_message_get_serial
import org.gtkkn.native.gio.g_dbus_message_get_signature
import org.gtkkn.native.gio.g_dbus_message_get_type
import org.gtkkn.native.gio.g_dbus_message_get_unix_fd_list
import org.gtkkn.native.gio.g_dbus_message_lock
import org.gtkkn.native.gio.g_dbus_message_new
import org.gtkkn.native.gio.g_dbus_message_new_method_call
import org.gtkkn.native.gio.g_dbus_message_new_method_error_literal
import org.gtkkn.native.gio.g_dbus_message_new_method_reply
import org.gtkkn.native.gio.g_dbus_message_new_signal
import org.gtkkn.native.gio.g_dbus_message_print
import org.gtkkn.native.gio.g_dbus_message_set_body
import org.gtkkn.native.gio.g_dbus_message_set_byte_order
import org.gtkkn.native.gio.g_dbus_message_set_destination
import org.gtkkn.native.gio.g_dbus_message_set_error_name
import org.gtkkn.native.gio.g_dbus_message_set_flags
import org.gtkkn.native.gio.g_dbus_message_set_header
import org.gtkkn.native.gio.g_dbus_message_set_interface
import org.gtkkn.native.gio.g_dbus_message_set_member
import org.gtkkn.native.gio.g_dbus_message_set_message_type
import org.gtkkn.native.gio.g_dbus_message_set_num_unix_fds
import org.gtkkn.native.gio.g_dbus_message_set_path
import org.gtkkn.native.gio.g_dbus_message_set_reply_serial
import org.gtkkn.native.gio.g_dbus_message_set_sender
import org.gtkkn.native.gio.g_dbus_message_set_serial
import org.gtkkn.native.gio.g_dbus_message_set_signature
import org.gtkkn.native.gio.g_dbus_message_set_unix_fd_list
import org.gtkkn.native.gio.g_dbus_message_to_gerror
import org.gtkkn.native.glib.GError
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.UInt
import kotlin.Unit

/**
 * A type for representing D-Bus messages that can be sent or received
 * on a [class@Gio.DBusConnection].
 *
 * ## Skipped during bindings generation
 *
 * - method `get_header_fields`: Array parameter of type guint8 is not supported
 * - parameter `out_size`: out_size: Out parameter is not supported
 * - parameter `blob`: Array parameter of type guint8 is not supported
 * - parameter `blob`: Array parameter of type guint8 is not supported
 *
 * @since 2.26
 */
@GioVersion2_26
public open class DBusMessage(
    pointer: CPointer<GDBusMessage>,
) : Object(pointer.reinterpret()),
    KGTyped {
    public val gioDBusMessagePointer: CPointer<GDBusMessage>
        get() = gPointer.reinterpret()

    public open val locked: Boolean
        /**
         * Checks whether @message is locked. To monitor changes to this
         * value, conncet to the #GObject::notify signal to listen for changes
         * on the #GDBusMessage:locked property.
         *
         * @return true if @message is locked, false otherwise.
         * @since 2.26
         */
        get() = g_dbus_message_get_locked(gioDBusMessagePointer.reinterpret()).asBoolean()

    /**
     * Creates a new empty #GDBusMessage.
     *
     * @return A #GDBusMessage. Free with g_object_unref().
     * @since 2.26
     */
    public constructor() : this(g_dbus_message_new()!!.reinterpret())

    /**
     * Creates a new #GDBusMessage for a method call.
     *
     * @param name A valid D-Bus name or null.
     * @param path A valid object path.
     * @param interface A valid D-Bus interface name or null.
     * @param method A valid method name.
     * @return A #GDBusMessage. Free with g_object_unref().
     * @since 2.26
     */
    public constructor(
        name: String? = null,
        path: String,
        `interface`: String? = null,
        method: String,
    ) : this(g_dbus_message_new_method_call(name, path, `interface`, method)!!.reinterpret())

    /**
     * Creates a new #GDBusMessage for a signal emission.
     *
     * @param path A valid object path.
     * @param interface A valid D-Bus interface name.
     * @param signal A valid signal name.
     * @return A #GDBusMessage. Free with g_object_unref().
     * @since 2.26
     */
    public constructor(
        path: String,
        `interface`: String,
        signal: String,
    ) : this(g_dbus_message_new_signal(path, `interface`, signal)!!.reinterpret())

    /**
     * Copies @message. The copy is a deep copy and the returned
     * #GDBusMessage is completely identical except that it is guaranteed
     * to not be locked.
     *
     * This operation can fail if e.g. @message contains file descriptors
     * and the per-process or system-wide open files limit is reached.
     *
     * @return A new #GDBusMessage or null if @error is set.
     *     Free with g_object_unref().
     * @since 2.26
     */
    @GioVersion2_26
    public open fun copy(): Result<DBusMessage> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_dbus_message_copy(gioDBusMessagePointer.reinterpret(), gError.ptr)?.run {
                    DBusMessage(reinterpret())
                }

            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * Convenience to get the first item in the body of @message.
     *
     * See [method@Gio.DBusMessage.get_arg0_path] for returning object-path-typed
     * arg0 values.
     *
     * @return The string item or null if the first item in the body of
     * @message is not a string.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getArg0(): String? = g_dbus_message_get_arg0(gioDBusMessagePointer.reinterpret())?.toKString()

    /**
     * Convenience to get the first item in the body of @message.
     *
     * See [method@Gio.DBusMessage.get_arg0] for returning string-typed arg0 values.
     *
     * @return The object path item or `NULL` if the first item in the
     *   body of @message is not an object path.
     * @since 2.80
     */
    @GioVersion2_80
    public open fun getArg0Path(): String? =
        g_dbus_message_get_arg0_path(gioDBusMessagePointer.reinterpret())?.toKString()

    /**
     * Gets the body of a message.
     *
     * @return A #GVariant or null if the body is
     * empty. Do not free, it is owned by @message.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getBody(): Variant? =
        g_dbus_message_get_body(gioDBusMessagePointer.reinterpret())?.run {
            Variant(reinterpret())
        }

    /**
     * Gets the byte order of @message.
     *
     * @return The byte order.
     */
    public open fun getByteOrder(): DBusMessageByteOrder =
        g_dbus_message_get_byte_order(gioDBusMessagePointer.reinterpret()).run {
            DBusMessageByteOrder.fromNativeValue(this)
        }

    /**
     * Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_DESTINATION header field.
     *
     * @return The value.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getDestination(): String? =
        g_dbus_message_get_destination(gioDBusMessagePointer.reinterpret())?.toKString()

    /**
     * Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_ERROR_NAME header field.
     *
     * @return The value.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getErrorName(): String? =
        g_dbus_message_get_error_name(gioDBusMessagePointer.reinterpret())?.toKString()

    /**
     * Gets the flags for @message.
     *
     * @return Flags that are set (typically values from the #GDBusMessageFlags enumeration bitwise ORed together).
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getFlags(): DBusMessageFlags =
        g_dbus_message_get_flags(gioDBusMessagePointer.reinterpret()).run {
            DBusMessageFlags(this)
        }

    /**
     * Gets a header field on @message.
     *
     * The caller is responsible for checking the type of the returned #GVariant
     * matches what is expected.
     *
     * @param headerField A 8-bit unsigned integer (typically a value from the #GDBusMessageHeaderField enumeration)
     * @return A #GVariant with the value if the header was found, null
     * otherwise. Do not free, it is owned by @message.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getHeader(headerField: DBusMessageHeaderField): Variant? =
        g_dbus_message_get_header(gioDBusMessagePointer.reinterpret(), headerField.nativeValue)?.run {
            Variant(reinterpret())
        }

    /**
     * Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_INTERFACE header field.
     *
     * @return The value.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getInterface(): String? =
        g_dbus_message_get_interface(gioDBusMessagePointer.reinterpret())?.toKString()

    /**
     * Checks whether @message is locked. To monitor changes to this
     * value, conncet to the #GObject::notify signal to listen for changes
     * on the #GDBusMessage:locked property.
     *
     * @return true if @message is locked, false otherwise.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getLocked(): Boolean = g_dbus_message_get_locked(gioDBusMessagePointer.reinterpret()).asBoolean()

    /**
     * Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_MEMBER header field.
     *
     * @return The value.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getMember(): String? = g_dbus_message_get_member(gioDBusMessagePointer.reinterpret())?.toKString()

    /**
     * Gets the type of @message.
     *
     * @return A 8-bit unsigned integer (typically a value from the #GDBusMessageType enumeration).
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getMessageType(): DBusMessageType =
        g_dbus_message_get_message_type(gioDBusMessagePointer.reinterpret()).run {
            DBusMessageType.fromNativeValue(this)
        }

    /**
     * Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_NUM_UNIX_FDS header field.
     *
     * @return The value.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getNumUnixFds(): UInt = g_dbus_message_get_num_unix_fds(gioDBusMessagePointer.reinterpret())

    /**
     * Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_PATH header field.
     *
     * @return The value.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getPath(): String? = g_dbus_message_get_path(gioDBusMessagePointer.reinterpret())?.toKString()

    /**
     * Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_REPLY_SERIAL header field.
     *
     * @return The value.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getReplySerial(): UInt = g_dbus_message_get_reply_serial(gioDBusMessagePointer.reinterpret())

    /**
     * Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_SENDER header field.
     *
     * @return The value.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getSender(): String? = g_dbus_message_get_sender(gioDBusMessagePointer.reinterpret())?.toKString()

    /**
     * Gets the serial for @message.
     *
     * @return A #guint32.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getSerial(): UInt = g_dbus_message_get_serial(gioDBusMessagePointer.reinterpret())

    /**
     * Convenience getter for the %G_DBUS_MESSAGE_HEADER_FIELD_SIGNATURE header field.
     *
     * This will always be non-null, but may be an empty string.
     *
     * @return The value.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getSignature(): String =
        g_dbus_message_get_signature(gioDBusMessagePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the UNIX file descriptors associated with @message, if any.
     *
     * This method is only available on UNIX.
     *
     * The file descriptors normally correspond to %G_VARIANT_TYPE_HANDLE
     * values in the body of the message. For example,
     * if g_variant_get_handle() returns 5, that is intended to be a reference
     * to the file descriptor that can be accessed by
     * `g_unix_fd_list_get (list, 5, ...)`.
     *
     * @return A #GUnixFDList or null if no file descriptors are
     * associated. Do not free, this object is owned by @message.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun getUnixFdList(): UnixFDList? =
        g_dbus_message_get_unix_fd_list(gioDBusMessagePointer.reinterpret())?.run {
            UnixFDList(reinterpret())
        }

    /**
     * If @message is locked, does nothing. Otherwise locks the message.
     *
     * @since 2.26
     */
    @GioVersion2_26
    public open fun lock(): Unit = g_dbus_message_lock(gioDBusMessagePointer.reinterpret())

    /**
     * Creates a new #GDBusMessage that is an error reply to @method_call_message.
     *
     * @param errorName A valid D-Bus error name.
     * @param errorMessage The D-Bus error message.
     * @return A #GDBusMessage. Free with g_object_unref().
     * @since 2.26
     */
    @GioVersion2_26
    public open fun newMethodErrorLiteral(
        errorName: String,
        errorMessage: String,
    ): DBusMessage =
        g_dbus_message_new_method_error_literal(gioDBusMessagePointer.reinterpret(), errorName, errorMessage)!!.run {
            DBusMessage(reinterpret())
        }

    /**
     * Creates a new #GDBusMessage that is a reply to @method_call_message.
     *
     * @return #GDBusMessage. Free with g_object_unref().
     * @since 2.26
     */
    @GioVersion2_26
    public open fun newMethodReply(): DBusMessage =
        g_dbus_message_new_method_reply(gioDBusMessagePointer.reinterpret())!!.run {
            DBusMessage(reinterpret())
        }

    /**
     * Produces a human-readable multi-line description of @message.
     *
     * The contents of the description has no ABI guarantees, the contents
     * and formatting is subject to change at any time. Typical output
     * looks something like this:
     * ```
     * Flags:   none
     * Version: 0
     * Serial:  4
     * Headers:
     *   path -> objectpath '/org/gtk/GDBus/TestObject'
     *   interface -> 'org.gtk.GDBus.TestInterface'
     *   member -> 'GimmeStdout'
     *   destination -> ':1.146'
     * Body: ()
     * UNIX File Descriptors:
     *   (none)
     * ```
     * or
     * ```
     * Flags:   no-reply-expected
     * Version: 0
     * Serial:  477
     * Headers:
     *   reply-serial -> uint32 4
     *   destination -> ':1.159'
     *   sender -> ':1.146'
     *   num-unix-fds -> uint32 1
     * Body: ()
     * UNIX File Descriptors:
     *   fd 12: dev=0:10,mode=020620,ino=5,uid=500,gid=5,rdev=136:2,size=0,atime=1273085037,mtime=1273085851,ctime=1272982635
     * ```
     *
     * @param indent Indentation level.
     * @return A string that should be freed with [func@GLib.free].
     * @since 2.26
     */
    @GioVersion2_26
    public open fun print(indent: UInt): String =
        g_dbus_message_print(gioDBusMessagePointer.reinterpret(), indent)?.toKString()
            ?: error("Expected not null string")

    /**
     * Sets the body @message. As a side-effect the
     * %G_DBUS_MESSAGE_HEADER_FIELD_SIGNATURE header field is set to the
     * type string of @body (or cleared if @body is null).
     *
     * If @body is floating, @message assumes ownership of @body.
     *
     * @param body Either null or a #GVariant that is a tuple.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun setBody(body: Variant): Unit =
        g_dbus_message_set_body(gioDBusMessagePointer.reinterpret(), body.glibVariantPointer)

    /**
     * Sets the byte order of @message.
     *
     * @param byteOrder The byte order.
     */
    public open fun setByteOrder(byteOrder: DBusMessageByteOrder): Unit =
        g_dbus_message_set_byte_order(gioDBusMessagePointer.reinterpret(), byteOrder.nativeValue)

    /**
     * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_DESTINATION header field.
     *
     * @param value The value to set.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun setDestination(`value`: String? = null): Unit =
        g_dbus_message_set_destination(gioDBusMessagePointer.reinterpret(), `value`)

    /**
     * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_ERROR_NAME header field.
     *
     * @param value The value to set.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun setErrorName(`value`: String): Unit =
        g_dbus_message_set_error_name(gioDBusMessagePointer.reinterpret(), `value`)

    /**
     * Sets the flags to set on @message.
     *
     * @param flags Flags for @message that are set (typically values from the #GDBusMessageFlags
     * enumeration bitwise ORed together).
     * @since 2.26
     */
    @GioVersion2_26
    public open fun setFlags(flags: DBusMessageFlags): Unit =
        g_dbus_message_set_flags(gioDBusMessagePointer.reinterpret(), flags.mask)

    /**
     * Sets a header field on @message.
     *
     * If @value is floating, @message assumes ownership of @value.
     *
     * @param headerField A 8-bit unsigned integer (typically a value from the #GDBusMessageHeaderField enumeration)
     * @param value A #GVariant to set the header field or null to clear the header field.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun setHeader(
        headerField: DBusMessageHeaderField,
        `value`: Variant? = null,
    ): Unit =
        g_dbus_message_set_header(
            gioDBusMessagePointer.reinterpret(),
            headerField.nativeValue,
            `value`?.glibVariantPointer
        )

    /**
     * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_INTERFACE header field.
     *
     * @param value The value to set.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun setInterface(`value`: String? = null): Unit =
        g_dbus_message_set_interface(gioDBusMessagePointer.reinterpret(), `value`)

    /**
     * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_MEMBER header field.
     *
     * @param value The value to set.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun setMember(`value`: String? = null): Unit =
        g_dbus_message_set_member(gioDBusMessagePointer.reinterpret(), `value`)

    /**
     * Sets @message to be of @type.
     *
     * @param type A 8-bit unsigned integer (typically a value from the #GDBusMessageType enumeration).
     * @since 2.26
     */
    @GioVersion2_26
    public open fun setMessageType(type: DBusMessageType): Unit =
        g_dbus_message_set_message_type(gioDBusMessagePointer.reinterpret(), type.nativeValue)

    /**
     * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_NUM_UNIX_FDS header field.
     *
     * @param value The value to set.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun setNumUnixFds(`value`: UInt): Unit =
        g_dbus_message_set_num_unix_fds(gioDBusMessagePointer.reinterpret(), `value`)

    /**
     * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_PATH header field.
     *
     * @param value The value to set.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun setPath(`value`: String? = null): Unit =
        g_dbus_message_set_path(gioDBusMessagePointer.reinterpret(), `value`)

    /**
     * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_REPLY_SERIAL header field.
     *
     * @param value The value to set.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun setReplySerial(`value`: UInt): Unit =
        g_dbus_message_set_reply_serial(gioDBusMessagePointer.reinterpret(), `value`)

    /**
     * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_SENDER header field.
     *
     * @param value The value to set.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun setSender(`value`: String? = null): Unit =
        g_dbus_message_set_sender(gioDBusMessagePointer.reinterpret(), `value`)

    /**
     * Sets the serial for @message.
     *
     * @param serial A #guint32.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun setSerial(serial: UInt): Unit =
        g_dbus_message_set_serial(gioDBusMessagePointer.reinterpret(), serial)

    /**
     * Convenience setter for the %G_DBUS_MESSAGE_HEADER_FIELD_SIGNATURE header field.
     *
     * @param value The value to set.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun setSignature(`value`: String? = null): Unit =
        g_dbus_message_set_signature(gioDBusMessagePointer.reinterpret(), `value`)

    /**
     * Sets the UNIX file descriptors associated with @message. As a
     * side-effect the %G_DBUS_MESSAGE_HEADER_FIELD_NUM_UNIX_FDS header
     * field is set to the number of fds in @fd_list (or cleared if
     * @fd_list is null).
     *
     * This method is only available on UNIX.
     *
     * When designing D-Bus APIs that are intended to be interoperable,
     * please note that non-GDBus implementations of D-Bus can usually only
     * access file descriptors if they are referenced by a value of type
     * %G_VARIANT_TYPE_HANDLE in the body of the message.
     *
     * @param fdList A #GUnixFDList or null.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun setUnixFdList(fdList: UnixFDList? = null): Unit =
        g_dbus_message_set_unix_fd_list(
            gioDBusMessagePointer.reinterpret(),
            fdList?.gioUnixFDListPointer?.reinterpret()
        )

    /**
     * If @message is not of type %G_DBUS_MESSAGE_TYPE_ERROR does
     * nothing and returns false.
     *
     * Otherwise this method encodes the error in @message as a #GError
     * using g_dbus_error_set_dbus_error() using the information in the
     * %G_DBUS_MESSAGE_HEADER_FIELD_ERROR_NAME header field of @message as
     * well as the first string item in @message's body.
     *
     * @return true if @error was set, false otherwise.
     * @since 2.26
     */
    @GioVersion2_26
    public open fun toGerror(): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_dbus_message_to_gerror(gioDBusMessagePointer.reinterpret(), gError.ptr).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    public companion object : TypeCompanion<DBusMessage> {
        override val type: GeneratedClassKGType<DBusMessage> =
            GeneratedClassKGType(g_dbus_message_get_type()) { DBusMessage(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }
    }
}

// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CArrayPointer
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.CPointerVarOf
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.annotations.GioVersion2_18
import org.gtkkn.bindings.gio.annotations.GioVersion2_24
import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.bindings.gio.annotations.GioVersion2_28
import org.gtkkn.bindings.gio.annotations.GioVersion2_30
import org.gtkkn.bindings.gio.annotations.GioVersion2_32
import org.gtkkn.bindings.gio.annotations.GioVersion2_34
import org.gtkkn.bindings.gio.annotations.GioVersion2_36
import org.gtkkn.bindings.gio.annotations.GioVersion2_52
import org.gtkkn.bindings.gio.annotations.GioVersion2_54
import org.gtkkn.bindings.gio.annotations.GioVersion2_56
import org.gtkkn.bindings.gio.annotations.GioVersion2_58
import org.gtkkn.bindings.gio.annotations.GioVersion2_60
import org.gtkkn.bindings.gio.annotations.GioVersion2_68
import org.gtkkn.bindings.gio.annotations.GioVersion2_70
import org.gtkkn.bindings.gio.annotations.GioVersion2_74
import org.gtkkn.bindings.glib.Bytes
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.FileError
import org.gtkkn.bindings.glib.IoCondition
import org.gtkkn.bindings.glib.Pid
import org.gtkkn.bindings.glib.Quark
import org.gtkkn.bindings.glib.Source
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.bindings.glib.VariantType
import org.gtkkn.bindings.gobject.Closure
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gobject.Value
import org.gtkkn.extensions.glib.GLibException
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.ext.toCStringList
import org.gtkkn.extensions.glib.ext.toKStringList
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.native.gio.GAsyncResult
import org.gtkkn.native.gio.GCancellable
import org.gtkkn.native.gio.GDBusConnection
import org.gtkkn.native.gio.GDBusInterfaceVTable
import org.gtkkn.native.gio.GDBusMessage
import org.gtkkn.native.gio.GDBusMethodInvocation
import org.gtkkn.native.gio.GDBusObjectManagerClient
import org.gtkkn.native.gio.GDatagramBased
import org.gtkkn.native.gio.GDesktopAppInfo
import org.gtkkn.native.gio.GFile
import org.gtkkn.native.gio.GIOSchedulerJob
import org.gtkkn.native.gio.GSimpleAsyncResult
import org.gtkkn.native.gio.GSocket
import org.gtkkn.native.gio.GTask
import org.gtkkn.native.gio.GVfs
import org.gtkkn.native.gio.g_bus_get
import org.gtkkn.native.gio.g_bus_get_finish
import org.gtkkn.native.gio.g_bus_get_sync
import org.gtkkn.native.gio.g_bus_own_name_on_connection_with_closures
import org.gtkkn.native.gio.g_bus_own_name_with_closures
import org.gtkkn.native.gio.g_bus_unown_name
import org.gtkkn.native.gio.g_bus_unwatch_name
import org.gtkkn.native.gio.g_bus_watch_name_on_connection_with_closures
import org.gtkkn.native.gio.g_bus_watch_name_with_closures
import org.gtkkn.native.gio.g_content_type_can_be_executable
import org.gtkkn.native.gio.g_content_type_equals
import org.gtkkn.native.gio.g_content_type_from_mime_type
import org.gtkkn.native.gio.g_content_type_get_description
import org.gtkkn.native.gio.g_content_type_get_generic_icon_name
import org.gtkkn.native.gio.g_content_type_get_icon
import org.gtkkn.native.gio.g_content_type_get_mime_dirs
import org.gtkkn.native.gio.g_content_type_get_mime_type
import org.gtkkn.native.gio.g_content_type_get_symbolic_icon
import org.gtkkn.native.gio.g_content_type_guess_for_tree
import org.gtkkn.native.gio.g_content_type_is_a
import org.gtkkn.native.gio.g_content_type_is_mime_type
import org.gtkkn.native.gio.g_content_type_is_unknown
import org.gtkkn.native.gio.g_content_type_set_mime_dirs
import org.gtkkn.native.gio.g_content_types_get_registered
import org.gtkkn.native.gio.g_dbus_address_escape_value
import org.gtkkn.native.gio.g_dbus_address_get_for_bus_sync
import org.gtkkn.native.gio.g_dbus_address_get_stream
import org.gtkkn.native.gio.g_dbus_escape_object_path
import org.gtkkn.native.gio.g_dbus_generate_guid
import org.gtkkn.native.gio.g_dbus_gvalue_to_gvariant
import org.gtkkn.native.gio.g_dbus_gvariant_to_gvalue
import org.gtkkn.native.gio.g_dbus_is_address
import org.gtkkn.native.gio.g_dbus_is_error_name
import org.gtkkn.native.gio.g_dbus_is_guid
import org.gtkkn.native.gio.g_dbus_is_interface_name
import org.gtkkn.native.gio.g_dbus_is_member_name
import org.gtkkn.native.gio.g_dbus_is_name
import org.gtkkn.native.gio.g_dbus_is_supported_address
import org.gtkkn.native.gio.g_dbus_is_unique_name
import org.gtkkn.native.gio.g_io_error_from_errno
import org.gtkkn.native.gio.g_io_error_from_file_error
import org.gtkkn.native.gio.g_io_error_quark
import org.gtkkn.native.gio.g_io_modules_load_all_in_directory
import org.gtkkn.native.gio.g_io_modules_load_all_in_directory_with_scope
import org.gtkkn.native.gio.g_io_modules_scan_all_in_directory
import org.gtkkn.native.gio.g_io_modules_scan_all_in_directory_with_scope
import org.gtkkn.native.gio.g_io_scheduler_cancel_all_jobs
import org.gtkkn.native.gio.g_io_scheduler_push_job
import org.gtkkn.native.gio.g_keyfile_settings_backend_new
import org.gtkkn.native.gio.g_memory_settings_backend_new
import org.gtkkn.native.gio.g_networking_init
import org.gtkkn.native.gio.g_null_settings_backend_new
import org.gtkkn.native.gio.g_pollable_source_new
import org.gtkkn.native.gio.g_pollable_source_new_full
import org.gtkkn.native.gio.g_resources_enumerate_children
import org.gtkkn.native.gio.g_resources_lookup_data
import org.gtkkn.native.gio.g_resources_open_stream
import org.gtkkn.native.gio.g_resources_register
import org.gtkkn.native.gio.g_resources_unregister
import org.gtkkn.native.gio.g_simple_async_report_gerror_in_idle
import org.gtkkn.native.gio.g_simple_async_report_take_gerror_in_idle
import org.gtkkn.native.gio.g_unix_is_mount_path_system_internal
import org.gtkkn.native.gio.g_unix_is_system_device_path
import org.gtkkn.native.gio.g_unix_is_system_fs_type
import org.gtkkn.native.gio.g_unix_mount_compare
import org.gtkkn.native.gio.g_unix_mount_copy
import org.gtkkn.native.gio.g_unix_mount_free
import org.gtkkn.native.gio.g_unix_mount_get_device_path
import org.gtkkn.native.gio.g_unix_mount_get_fs_type
import org.gtkkn.native.gio.g_unix_mount_get_mount_path
import org.gtkkn.native.gio.g_unix_mount_get_options
import org.gtkkn.native.gio.g_unix_mount_get_root_path
import org.gtkkn.native.gio.g_unix_mount_guess_can_eject
import org.gtkkn.native.gio.g_unix_mount_guess_icon
import org.gtkkn.native.gio.g_unix_mount_guess_name
import org.gtkkn.native.gio.g_unix_mount_guess_should_display
import org.gtkkn.native.gio.g_unix_mount_guess_symbolic_icon
import org.gtkkn.native.gio.g_unix_mount_is_readonly
import org.gtkkn.native.gio.g_unix_mount_is_system_internal
import org.gtkkn.native.gio.g_unix_mount_points_changed_since
import org.gtkkn.native.gio.g_unix_mounts_changed_since
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.GIOCondition
import org.gtkkn.native.glib.GVariant
import org.gtkkn.native.glib.GVariantType
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gint64
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.glib.gsize
import org.gtkkn.native.glib.guint
import org.gtkkn.native.glib.guint64
import org.gtkkn.native.gobject.GObject
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.GValue
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.Unit
import kotlin.collections.List as CollectionsList
import org.gtkkn.bindings.glib.List as GlibList

/**
 * ## Skipped during bindings generation
 *
 * - parameter `data`: Array parameter of type guint8 is not supported
 * - parameter `out_guid`: out_guid: Out parameter is not supported
 * - parameter `out_guid`: out_guid: Out parameter is not supported
 * - parameter `bytes`: Array parameter of type guint8 is not supported
 * - function `dbus_unescape_object_path`: Array parameter of type guint8 is not supported
 * - parameter `buffer`: Array parameter of type guint8 is not supported
 * - parameter `buffer`: Array parameter of type guint8 is not supported
 * - parameter `buffer`: Array parameter of type guint8 is not supported
 * - parameter `size`: size: Out parameter is not supported
 * - function `simple_async_report_error_in_idle`: Varargs parameter is not supported
 * - parameter `time_read`: time_read: Out parameter is not supported
 * - parameter `time_read`: time_read: Out parameter is not supported
 * - parameter `time_read`: time_read: Out parameter is not supported
 * - parameter `time_read`: time_read: Out parameter is not supported
 * - callback `DBusSubtreeIntrospectFunc`: Array parameter of type DBusInterfaceInfo is not supported
 * - record `ActionGroupInterface`: glib type struct are ignored
 * - record `ActionInterface`: glib type struct are ignored
 * - record `ActionMapInterface`: glib type struct are ignored
 * - record `AppInfoIface`: glib type struct are ignored
 * - record `AppLaunchContextClass`: glib type struct are ignored
 * - record `ApplicationClass`: glib type struct are ignored
 * - record `ApplicationCommandLineClass`: glib type struct are ignored
 * - record `AsyncInitableIface`: glib type struct are ignored
 * - record `AsyncResultIface`: glib type struct are ignored
 * - record `BufferedInputStreamClass`: glib type struct are ignored
 * - record `BufferedOutputStreamClass`: glib type struct are ignored
 * - record `CancellableClass`: glib type struct are ignored
 * - record `CharsetConverterClass`: glib type struct are ignored
 * - record `ConverterIface`: glib type struct are ignored
 * - record `ConverterInputStreamClass`: glib type struct are ignored
 * - record `ConverterOutputStreamClass`: glib type struct are ignored
 * - record `CredentialsClass`: glib type struct are ignored
 * - record `DBusInterfaceIface`: glib type struct are ignored
 * - record `DBusInterfaceSkeletonClass`: glib type struct are ignored
 * - record `DBusObjectIface`: glib type struct are ignored
 * - record `DBusObjectManagerClientClass`: glib type struct are ignored
 * - record `DBusObjectManagerIface`: glib type struct are ignored
 * - record `DBusObjectManagerServerClass`: glib type struct are ignored
 * - record `DBusObjectProxyClass`: glib type struct are ignored
 * - record `DBusObjectSkeletonClass`: glib type struct are ignored
 * - record `DBusProxyClass`: glib type struct are ignored
 * - record `DataInputStreamClass`: glib type struct are ignored
 * - record `DataOutputStreamClass`: glib type struct are ignored
 * - record `DatagramBasedInterface`: glib type struct are ignored
 * - record `DebugControllerDBusClass`: glib type struct are ignored
 * - record `DebugControllerInterface`: glib type struct are ignored
 * - record `DesktopAppInfoClass`: glib type struct are ignored
 * - record `DesktopAppInfoLookupIface`: glib type struct are ignored
 * - record `DriveIface`: glib type struct are ignored
 * - record `DtlsClientConnectionInterface`: glib type struct are ignored
 * - record `DtlsConnectionInterface`: glib type struct are ignored
 * - record `DtlsServerConnectionInterface`: glib type struct are ignored
 * - record `EmblemClass`: glib type struct are ignored
 * - record `EmblemedIconClass`: glib type struct are ignored
 * - record `FileDescriptorBasedIface`: glib type struct are ignored
 * - record `FileEnumeratorClass`: glib type struct are ignored
 * - record `FileIOStreamClass`: glib type struct are ignored
 * - record `FileIconClass`: glib type struct are ignored
 * - record `FileIface`: glib type struct are ignored
 * - record `FileInfoClass`: glib type struct are ignored
 * - record `FileInputStreamClass`: glib type struct are ignored
 * - record `FileMonitorClass`: glib type struct are ignored
 * - record `FileOutputStreamClass`: glib type struct are ignored
 * - record `FilenameCompleterClass`: glib type struct are ignored
 * - record `FilterInputStreamClass`: glib type struct are ignored
 * - record `FilterOutputStreamClass`: glib type struct are ignored
 * - record `IOModuleClass`: glib type struct are ignored
 * - record `IOStreamClass`: glib type struct are ignored
 * - record `IconIface`: glib type struct are ignored
 * - record `InetAddressClass`: glib type struct are ignored
 * - record `InetAddressMaskClass`: glib type struct are ignored
 * - record `InetSocketAddressClass`: glib type struct are ignored
 * - record `InitableIface`: glib type struct are ignored
 * - record `InputStreamClass`: glib type struct are ignored
 * - record `ListModelInterface`: glib type struct are ignored
 * - record `ListStoreClass`: glib type struct are ignored
 * - record `LoadableIconIface`: glib type struct are ignored
 * - record `MemoryInputStreamClass`: glib type struct are ignored
 * - record `MemoryMonitorInterface`: glib type struct are ignored
 * - record `MemoryOutputStreamClass`: glib type struct are ignored
 * - record `MenuAttributeIterClass`: glib type struct are ignored
 * - record `MenuLinkIterClass`: glib type struct are ignored
 * - record `MenuModelClass`: glib type struct are ignored
 * - record `MountIface`: glib type struct are ignored
 * - record `MountOperationClass`: glib type struct are ignored
 * - record `NativeSocketAddressClass`: glib type struct are ignored
 * - record `NativeVolumeMonitorClass`: glib type struct are ignored
 * - record `NetworkAddressClass`: glib type struct are ignored
 * - record `NetworkMonitorInterface`: glib type struct are ignored
 * - record `NetworkServiceClass`: glib type struct are ignored
 * - record `OutputStreamClass`: glib type struct are ignored
 * - record `PermissionClass`: glib type struct are ignored
 * - record `PollableInputStreamInterface`: glib type struct are ignored
 * - record `PollableOutputStreamInterface`: glib type struct are ignored
 * - record `PowerProfileMonitorInterface`: glib type struct are ignored
 * - record `ProxyAddressClass`: glib type struct are ignored
 * - record `ProxyAddressEnumeratorClass`: glib type struct are ignored
 * - record `ProxyInterface`: glib type struct are ignored
 * - record `ProxyResolverInterface`: glib type struct are ignored
 * - record `RemoteActionGroupInterface`: glib type struct are ignored
 * - record `ResolverClass`: glib type struct are ignored
 * - record `SeekableIface`: glib type struct are ignored
 * - record `SettingsBackendClass`: glib type struct are ignored
 * - record `SettingsClass`: glib type struct are ignored
 * - record `SimpleActionGroupClass`: glib type struct are ignored
 * - record `SimpleAsyncResultClass`: glib type struct are ignored
 * - record `SimpleProxyResolverClass`: glib type struct are ignored
 * - record `SocketAddressClass`: glib type struct are ignored
 * - record `SocketAddressEnumeratorClass`: glib type struct are ignored
 * - record `SocketClass`: glib type struct are ignored
 * - record `SocketClientClass`: glib type struct are ignored
 * - record `SocketConnectableIface`: glib type struct are ignored
 * - record `SocketConnectionClass`: glib type struct are ignored
 * - record `SocketControlMessageClass`: glib type struct are ignored
 * - record `SocketListenerClass`: glib type struct are ignored
 * - record `SocketServiceClass`: glib type struct are ignored
 * - record `TaskClass`: glib type struct are ignored
 * - record `TcpConnectionClass`: glib type struct are ignored
 * - record `TcpWrapperConnectionClass`: glib type struct are ignored
 * - record `ThemedIconClass`: glib type struct are ignored
 * - record `ThreadedResolverClass`: glib type struct are ignored
 * - record `ThreadedSocketServiceClass`: glib type struct are ignored
 * - record `TlsBackendInterface`: glib type struct are ignored
 * - record `TlsCertificateClass`: glib type struct are ignored
 * - record `TlsClientConnectionInterface`: glib type struct are ignored
 * - record `TlsConnectionClass`: glib type struct are ignored
 * - record `TlsDatabaseClass`: glib type struct are ignored
 * - record `TlsFileDatabaseInterface`: glib type struct are ignored
 * - record `TlsInteractionClass`: glib type struct are ignored
 * - record `TlsPasswordClass`: glib type struct are ignored
 * - record `TlsServerConnectionInterface`: glib type struct are ignored
 * - record `UnixConnectionClass`: glib type struct are ignored
 * - record `UnixCredentialsMessageClass`: glib type struct are ignored
 * - record `UnixFDListClass`: glib type struct are ignored
 * - record `UnixFDMessageClass`: glib type struct are ignored
 * - record `UnixInputStreamClass`: glib type struct are ignored
 * - record `UnixMountMonitorClass`: glib type struct are ignored
 * - record `UnixOutputStreamClass`: glib type struct are ignored
 * - record `UnixSocketAddressClass`: glib type struct are ignored
 * - record `VfsClass`: glib type struct are ignored
 * - record `VolumeIface`: glib type struct are ignored
 * - record `VolumeMonitorClass`: glib type struct are ignored
 * - record `ZlibCompressorClass`: glib type struct are ignored
 * - record `ZlibDecompressorClass`: glib type struct are ignored
 */
public object Gio {
    /**
     * The value returned by handlers of the signals generated by
     * the `gdbus-codegen` tool to indicate that a method call has been
     * handled by an implementation. It is equal to true, but using
     * this macro is sometimes more readable.
     *
     * In code that needs to be backwards-compatible with older GLib,
     * use true instead, often written like this:
     *
     * |[
     *   g_dbus_method_invocation_return_error (invocation, ...);
     *   return TRUE;    // handled
     * ]|
     *
     * @since 2.68
     */
    public const val DBUS_METHOD_INVOCATION_HANDLED: Boolean = true

    /**
     * The value returned by handlers of the signals generated by
     * the `gdbus-codegen` tool to indicate that a method call has not been
     * handled by an implementation. It is equal to false, but using
     * this macro is sometimes more readable.
     *
     * In code that needs to be backwards-compatible with older GLib,
     * use false instead.
     *
     * @since 2.68
     */
    public const val DBUS_METHOD_INVOCATION_UNHANDLED: Boolean = false

    /**
     * Extension point for debug control functionality.
     * See [Extending GIO][extending-gio].
     *
     * @since 2.72
     */
    public const val DEBUG_CONTROLLER_EXTENSION_POINT_NAME: String = "gio-debug-controller"

    /**
     * Extension point for default handler to URI association. See
     * [Extending GIO][extending-gio].
     */
    public const val DESKTOP_APP_INFO_LOOKUP_EXTENSION_POINT_NAME: String =
        "gio-desktop-app-info-lookup"

    /**
     * The string used to obtain a Unix device path with g_drive_get_identifier().
     *
     * @since 2.58
     */
    public const val DRIVE_IDENTIFIER_KIND_UNIX_DEVICE: String = "unix-device"

    /**
     * A key in the "access" namespace for checking deletion privileges.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BOOLEAN.
     *
     * This attribute will be true if the user is able to delete the file.
     */
    public const val FILE_ATTRIBUTE_ACCESS_CAN_DELETE: String = "access::can-delete"

    /**
     * A key in the "access" namespace for getting execution privileges.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BOOLEAN.
     *
     * This attribute will be true if the user is able to execute the file.
     */
    public const val FILE_ATTRIBUTE_ACCESS_CAN_EXECUTE: String = "access::can-execute"

    /**
     * A key in the "access" namespace for getting read privileges.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BOOLEAN.
     *
     * This attribute will be true if the user is able to read the file.
     */
    public const val FILE_ATTRIBUTE_ACCESS_CAN_READ: String = "access::can-read"

    /**
     * A key in the "access" namespace for checking renaming privileges.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BOOLEAN.
     *
     * This attribute will be true if the user is able to rename the file.
     */
    public const val FILE_ATTRIBUTE_ACCESS_CAN_RENAME: String = "access::can-rename"

    /**
     * A key in the "access" namespace for checking trashing privileges.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BOOLEAN.
     *
     * This attribute will be true if the user is able to move the file to
     * the trash.
     */
    public const val FILE_ATTRIBUTE_ACCESS_CAN_TRASH: String = "access::can-trash"

    /**
     * A key in the "access" namespace for getting write privileges.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BOOLEAN.
     *
     * This attribute will be true if the user is able to write to the file.
     */
    public const val FILE_ATTRIBUTE_ACCESS_CAN_WRITE: String = "access::can-write"

    /**
     * A key in the "dos" namespace for checking if the file's archive flag
     * is set.
     *
     * This attribute is true if the archive flag is set.
     *
     * This attribute is only available for DOS file systems.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BOOLEAN.
     */
    public const val FILE_ATTRIBUTE_DOS_IS_ARCHIVE: String = "dos::is-archive"

    /**
     * A key in the "dos" namespace for checking if the file is a NTFS mount point
     * (a volume mount or a junction point).
     *
     * This attribute is true if file is a reparse point of type
     * [IO_REPARSE_TAG_MOUNT_POINT](https://msdn.microsoft.com/en-us/library/dd541667.aspx).
     *
     * This attribute is only available for DOS file systems.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BOOLEAN.
     *
     * @since 2.60
     */
    public const val FILE_ATTRIBUTE_DOS_IS_MOUNTPOINT: String = "dos::is-mountpoint"

    /**
     * A key in the "dos" namespace for checking if the file's backup flag
     * is set.
     *
     * This attribute is true if the backup flag is set.
     *
     * This attribute is only available for DOS file systems.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BOOLEAN.
     */
    public const val FILE_ATTRIBUTE_DOS_IS_SYSTEM: String = "dos::is-system"

    /**
     * A key in the "dos" namespace for getting the file NTFS reparse tag.
     *
     * This value is 0 for files that are not reparse points.
     *
     * See the [Reparse Tags](https://msdn.microsoft.com/en-us/library/dd541667.aspx)
     * page for possible reparse tag values.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_UINT32.
     *
     * @since 2.60
     */
    public const val FILE_ATTRIBUTE_DOS_REPARSE_POINT_TAG: String = "dos::reparse-point-tag"

    /**
     * A key in the "etag" namespace for getting the value of the file's
     * entity tag.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_STRING.
     */
    public const val FILE_ATTRIBUTE_ETAG_VALUE: String = "etag::value"

    /**
     * A key in the "filesystem" namespace for getting the number of bytes
     * of free space left on the file system.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_UINT64.
     */
    public const val FILE_ATTRIBUTE_FILESYSTEM_FREE: String = "filesystem::free"

    /**
     * A key in the "filesystem" namespace for checking if the file system
     * is read only.
     *
     * Is set to true if the file system is read only.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BOOLEAN.
     */
    public const val FILE_ATTRIBUTE_FILESYSTEM_READONLY: String = "filesystem::readonly"

    /**
     * A key in the "filesystem" namespace for checking if the file system
     * is remote.
     *
     * Is set to true if the file system is remote.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BOOLEAN.
     */
    public const val FILE_ATTRIBUTE_FILESYSTEM_REMOTE: String = "filesystem::remote"

    /**
     * A key in the "filesystem" namespace for getting the total size (in
     * bytes) of the file system, used in g_file_query_filesystem_info().
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_UINT64.
     */
    public const val FILE_ATTRIBUTE_FILESYSTEM_SIZE: String = "filesystem::size"

    /**
     * A key in the "filesystem" namespace for getting the file system's type.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_STRING.
     */
    public const val FILE_ATTRIBUTE_FILESYSTEM_TYPE: String = "filesystem::type"

    /**
     * A key in the "filesystem" namespace for getting the number of bytes
     * used by data on the file system.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_UINT64.
     *
     * @since 2.32
     */
    public const val FILE_ATTRIBUTE_FILESYSTEM_USED: String = "filesystem::used"

    /**
     * A key in the "filesystem" namespace for hinting a file manager
     * application whether it should preview (e.g. thumbnail) files on the
     * file system.
     *
     * The value for this key contain a #GFilesystemPreviewType.
     */
    public const val FILE_ATTRIBUTE_FILESYSTEM_USE_PREVIEW: String = "filesystem::use-preview"

    /**
     * A key in the "gvfs" namespace that gets the name of the current
     * GVFS backend in use.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_STRING.
     */
    public const val FILE_ATTRIBUTE_GVFS_BACKEND: String = "gvfs::backend"

    /**
     * A key in the "id" namespace for getting a file identifier.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_STRING.
     *
     * An example use would be during listing files, to avoid recursive
     * directory scanning.
     */
    public const val FILE_ATTRIBUTE_ID_FILE: String = "id::file"

    /**
     * A key in the "id" namespace for getting the file system identifier.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_STRING.
     *
     * An example use would be during drag and drop to see if the source
     * and target are on the same filesystem (default to move) or not (default
     * to copy).
     */
    public const val FILE_ATTRIBUTE_ID_FILESYSTEM: String = "id::filesystem"

    /**
     * A key in the "mountable" namespace for checking if a file (of
     * type G_FILE_TYPE_MOUNTABLE) can be ejected.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BOOLEAN.
     */
    public const val FILE_ATTRIBUTE_MOUNTABLE_CAN_EJECT: String = "mountable::can-eject"

    /**
     * A key in the "mountable" namespace for checking if a file (of
     * type G_FILE_TYPE_MOUNTABLE) is mountable.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BOOLEAN.
     */
    public const val FILE_ATTRIBUTE_MOUNTABLE_CAN_MOUNT: String = "mountable::can-mount"

    /**
     * A key in the "mountable" namespace for checking if a file (of
     * type G_FILE_TYPE_MOUNTABLE) can be polled.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BOOLEAN.
     *
     * @since 2.22
     */
    public const val FILE_ATTRIBUTE_MOUNTABLE_CAN_POLL: String = "mountable::can-poll"

    /**
     * A key in the "mountable" namespace for checking if a file (of
     * type G_FILE_TYPE_MOUNTABLE) can be started.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BOOLEAN.
     *
     * @since 2.22
     */
    public const val FILE_ATTRIBUTE_MOUNTABLE_CAN_START: String = "mountable::can-start"

    /**
     * A key in the "mountable" namespace for checking if a file (of
     * type G_FILE_TYPE_MOUNTABLE) can be started degraded.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BOOLEAN.
     *
     * @since 2.22
     */
    public const val FILE_ATTRIBUTE_MOUNTABLE_CAN_START_DEGRADED: String =
        "mountable::can-start-degraded"

    /**
     * A key in the "mountable" namespace for checking if a file (of
     * type G_FILE_TYPE_MOUNTABLE) can be stopped.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BOOLEAN.
     *
     * @since 2.22
     */
    public const val FILE_ATTRIBUTE_MOUNTABLE_CAN_STOP: String = "mountable::can-stop"

    /**
     * A key in the "mountable" namespace for checking if a file (of
     * type G_FILE_TYPE_MOUNTABLE)  is unmountable.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BOOLEAN.
     */
    public const val FILE_ATTRIBUTE_MOUNTABLE_CAN_UNMOUNT: String = "mountable::can-unmount"

    /**
     * A key in the "mountable" namespace for getting the HAL UDI for the mountable
     * file.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_STRING.
     */
    public const val FILE_ATTRIBUTE_MOUNTABLE_HAL_UDI: String = "mountable::hal-udi"

    /**
     * A key in the "mountable" namespace for checking if a file (of
     * type G_FILE_TYPE_MOUNTABLE) is automatically polled for media.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BOOLEAN.
     *
     * @since 2.22
     */
    public const val FILE_ATTRIBUTE_MOUNTABLE_IS_MEDIA_CHECK_AUTOMATIC: String =
        "mountable::is-media-check-automatic"

    /**
     * A key in the "mountable" namespace for getting the #GDriveStartStopType.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_UINT32.
     *
     * @since 2.22
     */
    public const val FILE_ATTRIBUTE_MOUNTABLE_START_STOP_TYPE: String = "mountable::start-stop-type"

    /**
     * A key in the "mountable" namespace for getting the unix device.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_UINT32.
     */
    public const val FILE_ATTRIBUTE_MOUNTABLE_UNIX_DEVICE: String = "mountable::unix-device"

    /**
     * A key in the "mountable" namespace for getting the unix device file.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_STRING.
     *
     * @since 2.22
     */
    public const val FILE_ATTRIBUTE_MOUNTABLE_UNIX_DEVICE_FILE: String =
        "mountable::unix-device-file"

    /**
     * A key in the "owner" namespace for getting the file owner's group.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_STRING.
     */
    public const val FILE_ATTRIBUTE_OWNER_GROUP: String = "owner::group"

    /**
     * A key in the "owner" namespace for getting the user name of the
     * file's owner.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_STRING.
     */
    public const val FILE_ATTRIBUTE_OWNER_USER: String = "owner::user"

    /**
     * A key in the "owner" namespace for getting the real name of the
     * user that owns the file.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_STRING.
     */
    public const val FILE_ATTRIBUTE_OWNER_USER_REAL: String = "owner::user-real"

    /**
     * A key in the "preview" namespace for getting a #GIcon that can be
     * used to get preview of the file.
     *
     * For example, it may be a low resolution thumbnail without metadata.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_OBJECT.
     *
     * The value for this key should contain a #GIcon.
     *
     * @since 2.20
     */
    public const val FILE_ATTRIBUTE_PREVIEW_ICON: String = "preview::icon"

    /**
     * A key in the "recent" namespace for getting time, when the metadata for the
     * file in `recent:///` was last changed.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_INT64.
     *
     * @since 2.52
     */
    public const val FILE_ATTRIBUTE_RECENT_MODIFIED: String = "recent::modified"

    /**
     * A key in the "selinux" namespace for getting the file's SELinux
     * context.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_STRING.
     *
     * Note that this attribute is only available if GLib has been built
     * with SELinux support.
     */
    public const val FILE_ATTRIBUTE_SELINUX_CONTEXT: String = "selinux::context"

    /**
     * A key in the "standard" namespace for getting the amount of disk space
     * that is consumed by the file (in bytes).
     *
     * This will generally be larger than the file size (due to block size
     * overhead) but can occasionally be smaller (for example, for sparse files).
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_UINT64.
     *
     * @since 2.20
     */
    public const val FILE_ATTRIBUTE_STANDARD_ALLOCATED_SIZE: String = "standard::allocated-size"

    /**
     * A key in the "standard" namespace for getting the content type of the file.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_STRING.
     *
     * The value for this key should contain a valid content type.
     */
    public const val FILE_ATTRIBUTE_STANDARD_CONTENT_TYPE: String = "standard::content-type"

    /**
     * A key in the "standard" namespace for getting the copy name of the file.
     *
     * The copy name is an optional version of the name. If available it's always
     * in UTF8, and corresponds directly to the original filename (only transcoded to
     * UTF8). This is useful if you want to copy the file to another filesystem that
     * might have a different encoding. If the filename is not a valid string in the
     * encoding selected for the filesystem it is in then the copy name will not be set.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_STRING.
     */
    public const val FILE_ATTRIBUTE_STANDARD_COPY_NAME: String = "standard::copy-name"

    /**
     * A key in the "standard" namespace for getting the description of the file.
     *
     * The description is a utf8 string that describes the file, generally containing
     * the filename, but can also contain further information. Example descriptions
     * could be "filename (on hostname)" for a remote file or "filename (in trash)"
     * for a file in the trash. This is useful for instance as the window title
     * when displaying a directory or for a bookmarks menu.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_STRING.
     */
    public const val FILE_ATTRIBUTE_STANDARD_DESCRIPTION: String = "standard::description"

    /**
     * A key in the "standard" namespace for getting the display name of the file.
     *
     * A display name is guaranteed to be in UTF-8 and can thus be displayed in
     * the UI. It is guaranteed to be set on every file.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_STRING.
     */
    public const val FILE_ATTRIBUTE_STANDARD_DISPLAY_NAME: String = "standard::display-name"

    /**
     * A key in the "standard" namespace for edit name of the file.
     *
     * An edit name is similar to the display name, but it is meant to be
     * used when you want to rename the file in the UI. The display name
     * might contain information you don't want in the new filename (such as
     * "(invalid unicode)" if the filename was in an invalid encoding).
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_STRING.
     */
    public const val FILE_ATTRIBUTE_STANDARD_EDIT_NAME: String = "standard::edit-name"

    /**
     * A key in the "standard" namespace for getting the fast content type.
     *
     * The fast content type isn't as reliable as the regular one, as it
     * only uses the filename to guess it, but it is faster to calculate than the
     * regular content type.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_STRING.
     */
    public const val FILE_ATTRIBUTE_STANDARD_FAST_CONTENT_TYPE: String =
        "standard::fast-content-type"

    /**
     * A key in the "standard" namespace for getting the icon for the file.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_OBJECT.
     *
     * The value for this key should contain a #GIcon.
     */
    public const val FILE_ATTRIBUTE_STANDARD_ICON: String = "standard::icon"

    /**
     * A key in the "standard" namespace for checking if a file is a backup file.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BOOLEAN.
     */
    public const val FILE_ATTRIBUTE_STANDARD_IS_BACKUP: String = "standard::is-backup"

    /**
     * A key in the "standard" namespace for checking if a file is hidden.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BOOLEAN.
     */
    public const val FILE_ATTRIBUTE_STANDARD_IS_HIDDEN: String = "standard::is-hidden"

    /**
     * A key in the "standard" namespace for checking if the file is a symlink.
     * Typically the actual type is something else, if we followed the symlink
     * to get the type.
     *
     * On Windows NTFS mountpoints are considered to be symlinks as well.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BOOLEAN.
     */
    public const val FILE_ATTRIBUTE_STANDARD_IS_SYMLINK: String = "standard::is-symlink"

    /**
     * A key in the "standard" namespace for checking if a file is virtual.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BOOLEAN.
     */
    public const val FILE_ATTRIBUTE_STANDARD_IS_VIRTUAL: String = "standard::is-virtual"

    /**
     * A key in the "standard" namespace for checking if a file is
     * volatile. This is meant for opaque, non-POSIX-like backends to
     * indicate that the URI is not persistent. Applications should look
     * at %G_FILE_ATTRIBUTE_STANDARD_SYMLINK_TARGET for the persistent URI.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BOOLEAN.
     *
     * @since 2.46
     */
    public const val FILE_ATTRIBUTE_STANDARD_IS_VOLATILE: String = "standard::is-volatile"

    /**
     * A key in the "standard" namespace for getting the name of the file.
     *
     * The name is the on-disk filename which may not be in any known encoding,
     * and can thus not be generally displayed as is. It is guaranteed to be set on
     * every file.
     *
     * Use %G_FILE_ATTRIBUTE_STANDARD_DISPLAY_NAME if you need to display the
     * name in a user interface.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BYTE_STRING.
     */
    public const val FILE_ATTRIBUTE_STANDARD_NAME: String = "standard::name"

    /**
     * A key in the "standard" namespace for getting the file's size (in bytes).
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_UINT64.
     */
    public const val FILE_ATTRIBUTE_STANDARD_SIZE: String = "standard::size"

    /**
     * A key in the "standard" namespace for setting the sort order of a file.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_INT32.
     *
     * An example use would be in file managers, which would use this key
     * to set the order files are displayed. Files with smaller sort order
     * should be sorted first, and files without sort order as if sort order
     * was zero.
     */
    public const val FILE_ATTRIBUTE_STANDARD_SORT_ORDER: String = "standard::sort-order"

    /**
     * A key in the "standard" namespace for getting the symbolic icon for the file.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_OBJECT.
     *
     * The value for this key should contain a #GIcon.
     *
     * @since 2.34
     */
    public const val FILE_ATTRIBUTE_STANDARD_SYMBOLIC_ICON: String = "standard::symbolic-icon"

    /**
     * A key in the "standard" namespace for getting the symlink target, if the file
     * is a symlink.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BYTE_STRING.
     */
    public const val FILE_ATTRIBUTE_STANDARD_SYMLINK_TARGET: String = "standard::symlink-target"

    /**
     * A key in the "standard" namespace for getting the target URI for the file, in
     * the case of %G_FILE_TYPE_SHORTCUT or %G_FILE_TYPE_MOUNTABLE files.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_STRING.
     */
    public const val FILE_ATTRIBUTE_STANDARD_TARGET_URI: String = "standard::target-uri"

    /**
     * A key in the "standard" namespace for storing file types.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_UINT32.
     *
     * The value for this key should contain a #GFileType.
     */
    public const val FILE_ATTRIBUTE_STANDARD_TYPE: String = "standard::type"

    /**
     * A key in the "thumbnail" namespace for checking if thumbnailing failed.
     *
     * This attribute is true if thumbnailing failed.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BOOLEAN.
     */
    public const val FILE_ATTRIBUTE_THUMBNAILING_FAILED: String = "thumbnail::failed"

    /**
     * A key in the "thumbnail" namespace for checking if thumbnailing failed
     * for the large image.
     *
     * This attribute is true if thumbnailing failed.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BOOLEAN.
     *
     * @since 2.76
     */
    public const val FILE_ATTRIBUTE_THUMBNAILING_FAILED_LARGE: String = "thumbnail::failed-large"

    /**
     * A key in the "thumbnail" namespace for checking if thumbnailing failed
     * for the normal image.
     *
     * This attribute is true if thumbnailing failed.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BOOLEAN.
     *
     * @since 2.76
     */
    public const val FILE_ATTRIBUTE_THUMBNAILING_FAILED_NORMAL: String = "thumbnail::failed-normal"

    /**
     * A key in the "thumbnail" namespace for checking if thumbnailing failed
     * for the x-large image.
     *
     * This attribute is true if thumbnailing failed.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BOOLEAN.
     *
     * @since 2.76
     */
    public const val FILE_ATTRIBUTE_THUMBNAILING_FAILED_XLARGE: String = "thumbnail::failed-xlarge"

    /**
     * A key in the "thumbnail" namespace for checking if thumbnailing failed
     * for the xx-large image.
     *
     * This attribute is true if thumbnailing failed.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BOOLEAN.
     *
     * @since 2.76
     */
    public const val FILE_ATTRIBUTE_THUMBNAILING_FAILED_XXLARGE: String =
        "thumbnail::failed-xxlarge"

    /**
     * A key in the "thumbnail" namespace for checking whether the thumbnail is outdated.
     *
     * This attribute is true if the thumbnail is up-to-date with the file it represents,
     * and false if the file has been modified since the thumbnail was generated.
     *
     * If %G_FILE_ATTRIBUTE_THUMBNAILING_FAILED is true and this attribute is false,
     * it indicates that thumbnailing may be attempted again and may succeed.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BOOLEAN.
     *
     * @since 2.40
     */
    public const val FILE_ATTRIBUTE_THUMBNAIL_IS_VALID: String = "thumbnail::is-valid"

    /**
     * A key in the "thumbnail" namespace for checking whether the large
     * thumbnail is outdated.
     *
     * This attribute is true if the large thumbnail is up-to-date with the file
     * it represents, and false if the file has been modified since the thumbnail
     * was generated.
     *
     * If %G_FILE_ATTRIBUTE_THUMBNAILING_FAILED_LARGE is true and this attribute
     * is false, it indicates that thumbnailing may be attempted again and may
     * succeed.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BOOLEAN.
     *
     * @since 2.76
     */
    public const val FILE_ATTRIBUTE_THUMBNAIL_IS_VALID_LARGE: String = "thumbnail::is-valid-large"

    /**
     * A key in the "thumbnail" namespace for checking whether the normal
     * thumbnail is outdated.
     *
     * This attribute is true if the normal thumbnail is up-to-date with the file
     * it represents, and false if the file has been modified since the thumbnail
     * was generated.
     *
     * If %G_FILE_ATTRIBUTE_THUMBNAILING_FAILED_NORMAL is true and this attribute
     * is false, it indicates that thumbnailing may be attempted again and may
     * succeed.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BOOLEAN.
     *
     * @since 2.76
     */
    public const val FILE_ATTRIBUTE_THUMBNAIL_IS_VALID_NORMAL: String = "thumbnail::is-valid-normal"

    /**
     * A key in the "thumbnail" namespace for checking whether the x-large
     * thumbnail is outdated.
     *
     * This attribute is true if the x-large thumbnail is up-to-date with the file
     * it represents, and false if the file has been modified since the thumbnail
     * was generated.
     *
     * If %G_FILE_ATTRIBUTE_THUMBNAILING_FAILED_XLARGE is true and this attribute
     * is false, it indicates that thumbnailing may be attempted again and may
     * succeed.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BOOLEAN.
     *
     * @since 2.76
     */
    public const val FILE_ATTRIBUTE_THUMBNAIL_IS_VALID_XLARGE: String = "thumbnail::is-valid-xlarge"

    /**
     * A key in the "thumbnail" namespace for checking whether the xx-large
     * thumbnail is outdated.
     *
     * This attribute is true if the x-large thumbnail is up-to-date with the file
     * it represents, and false if the file has been modified since the thumbnail
     * was generated.
     *
     * If %G_FILE_ATTRIBUTE_THUMBNAILING_FAILED_XXLARGE is true and this attribute
     * is false, it indicates that thumbnailing may be attempted again and may
     * succeed.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BOOLEAN.
     *
     * @since 2.76
     */
    public const val FILE_ATTRIBUTE_THUMBNAIL_IS_VALID_XXLARGE: String =
        "thumbnail::is-valid-xxlarge"

    /**
     * A key in the "thumbnail" namespace for getting the path to the thumbnail
     * image with the biggest size available.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BYTE_STRING.
     */
    public const val FILE_ATTRIBUTE_THUMBNAIL_PATH: String = "thumbnail::path"

    /**
     * A key in the "thumbnail" namespace for getting the path to the large
     * thumbnail image.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BYTE_STRING.
     *
     * @since 2.76
     */
    public const val FILE_ATTRIBUTE_THUMBNAIL_PATH_LARGE: String = "thumbnail::path-large"

    /**
     * A key in the "thumbnail" namespace for getting the path to the normal
     * thumbnail image.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BYTE_STRING.
     *
     * @since 2.76
     */
    public const val FILE_ATTRIBUTE_THUMBNAIL_PATH_NORMAL: String = "thumbnail::path-normal"

    /**
     * A key in the "thumbnail" namespace for getting the path to the x-large
     * thumbnail image.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BYTE_STRING.
     *
     * @since 2.76
     */
    public const val FILE_ATTRIBUTE_THUMBNAIL_PATH_XLARGE: String = "thumbnail::path-xlarge"

    /**
     * A key in the "thumbnail" namespace for getting the path to the xx-large
     * thumbnail image.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BYTE_STRING.
     *
     * @since 2.76
     */
    public const val FILE_ATTRIBUTE_THUMBNAIL_PATH_XXLARGE: String = "thumbnail::path-xxlarge"

    /**
     * A key in the "time" namespace for getting the time the file was last
     * accessed.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_UINT64, and
     * contains the time since the file was last accessed, in seconds since the
     * UNIX epoch.
     */
    public const val FILE_ATTRIBUTE_TIME_ACCESS: String = "time::access"

    /**
     * A key in the "time" namespace for getting the nanoseconds of the time
     * the file was last accessed. This should be used in conjunction with
     * #G_FILE_ATTRIBUTE_TIME_ACCESS. Corresponding #GFileAttributeType is
     * %G_FILE_ATTRIBUTE_TYPE_UINT32.
     *
     * @since 2.74
     */
    public const val FILE_ATTRIBUTE_TIME_ACCESS_NSEC: String = "time::access-nsec"

    /**
     * A key in the "time" namespace for getting the microseconds of the time
     * the file was last accessed.
     *
     * This should be used in conjunction with %G_FILE_ATTRIBUTE_TIME_ACCESS.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_UINT32.
     */
    public const val FILE_ATTRIBUTE_TIME_ACCESS_USEC: String = "time::access-usec"

    /**
     * A key in the "time" namespace for getting the time the file was last
     * changed.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_UINT64,
     * and contains the time since the file was last changed, in seconds since
     * the UNIX epoch.
     *
     * This corresponds to the traditional UNIX ctime.
     */
    public const val FILE_ATTRIBUTE_TIME_CHANGED: String = "time::changed"

    /**
     * A key in the "time" namespace for getting the nanoseconds of the time
     * the file was last changed. This should be used in conjunction with
     * #G_FILE_ATTRIBUTE_TIME_CHANGED. Corresponding #GFileAttributeType is
     * %G_FILE_ATTRIBUTE_TYPE_UINT32.
     *
     * @since 2.74
     */
    public const val FILE_ATTRIBUTE_TIME_CHANGED_NSEC: String = "time::changed-nsec"

    /**
     * A key in the "time" namespace for getting the microseconds of the time
     * the file was last changed.
     *
     * This should be used in conjunction with %G_FILE_ATTRIBUTE_TIME_CHANGED.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_UINT32.
     */
    public const val FILE_ATTRIBUTE_TIME_CHANGED_USEC: String = "time::changed-usec"

    /**
     * A key in the "time" namespace for getting the time the file was created.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_UINT64,
     * and contains the time since the file was created, in seconds since the UNIX
     * epoch.
     *
     * This may correspond to Linux `stx_btime`, FreeBSD `st_birthtim`, NetBSD
     * `st_birthtime` or NTFS `ctime`.
     */
    public const val FILE_ATTRIBUTE_TIME_CREATED: String = "time::created"

    /**
     * A key in the "time" namespace for getting the nanoseconds of the time
     * the file was created. This should be used in conjunction with
     * #G_FILE_ATTRIBUTE_TIME_CREATED. Corresponding #GFileAttributeType is
     * %G_FILE_ATTRIBUTE_TYPE_UINT32.
     *
     * @since 2.74
     */
    public const val FILE_ATTRIBUTE_TIME_CREATED_NSEC: String = "time::created-nsec"

    /**
     * A key in the "time" namespace for getting the microseconds of the time
     * the file was created.
     *
     * This should be used in conjunction with %G_FILE_ATTRIBUTE_TIME_CREATED.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_UINT32.
     */
    public const val FILE_ATTRIBUTE_TIME_CREATED_USEC: String = "time::created-usec"

    /**
     * A key in the "time" namespace for getting the time the file was last
     * modified.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_UINT64, and
     * contains the time since the file was modified, in seconds since the UNIX
     * epoch.
     */
    public const val FILE_ATTRIBUTE_TIME_MODIFIED: String = "time::modified"

    /**
     * A key in the "time" namespace for getting the nanoseconds of the time
     * the file was last modified. This should be used in conjunction with
     * #G_FILE_ATTRIBUTE_TIME_MODIFIED. Corresponding #GFileAttributeType is
     * %G_FILE_ATTRIBUTE_TYPE_UINT32.
     *
     * @since 2.74
     */
    public const val FILE_ATTRIBUTE_TIME_MODIFIED_NSEC: String = "time::modified-nsec"

    /**
     * A key in the "time" namespace for getting the microseconds of the time
     * the file was last modified.
     *
     * This should be used in conjunction with %G_FILE_ATTRIBUTE_TIME_MODIFIED.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_UINT32.
     */
    public const val FILE_ATTRIBUTE_TIME_MODIFIED_USEC: String = "time::modified-usec"

    /**
     * A key in the "trash" namespace for getting the deletion date and time
     * of a file inside the `trash:///` folder.
     *
     * The format of the returned string is `YYYY-MM-DDThh:mm:ss`.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_STRING.
     *
     * @since 2.24
     */
    public const val FILE_ATTRIBUTE_TRASH_DELETION_DATE: String = "trash::deletion-date"

    /**
     * A key in the "trash" namespace for getting the number of (toplevel) items
     * that are present in the `trash:///` folder.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_UINT32.
     */
    public const val FILE_ATTRIBUTE_TRASH_ITEM_COUNT: String = "trash::item-count"

    /**
     * A key in the "trash" namespace for getting the original path of a file
     * inside the `trash:///` folder before it was trashed.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BYTE_STRING.
     *
     * @since 2.24
     */
    public const val FILE_ATTRIBUTE_TRASH_ORIG_PATH: String = "trash::orig-path"

    /**
     * A key in the "unix" namespace for getting the number of blocks allocated
     * for the file.
     *
     * This attribute is only available for UNIX file systems.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_UINT64.
     */
    public const val FILE_ATTRIBUTE_UNIX_BLOCKS: String = "unix::blocks"

    /**
     * A key in the "unix" namespace for getting the block size for the file
     * system.
     *
     * This attribute is only available for UNIX file systems.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_UINT32.
     */
    public const val FILE_ATTRIBUTE_UNIX_BLOCK_SIZE: String = "unix::block-size"

    /**
     * A key in the "unix" namespace for getting the device id of the device the
     * file is located on (see stat() documentation).
     *
     * This attribute is only available for UNIX file systems.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_UINT32.
     */
    public const val FILE_ATTRIBUTE_UNIX_DEVICE: String = "unix::device"

    /**
     * A key in the "unix" namespace for getting the group ID for the file.
     *
     * This attribute is only available for UNIX file systems.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_UINT32.
     */
    public const val FILE_ATTRIBUTE_UNIX_GID: String = "unix::gid"

    /**
     * A key in the "unix" namespace for getting the inode of the file.
     *
     * This attribute is only available for UNIX file systems.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_UINT64.
     */
    public const val FILE_ATTRIBUTE_UNIX_INODE: String = "unix::inode"

    /**
     * A key in the "unix" namespace for checking if the file represents a
     * UNIX mount point.
     *
     * This attribute is true if the file is a UNIX mount point.
     *
     * Since 2.58, `/` is considered to be a mount point.
     *
     * This attribute is only available for UNIX file systems.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_BOOLEAN.
     */
    public const val FILE_ATTRIBUTE_UNIX_IS_MOUNTPOINT: String = "unix::is-mountpoint"

    /**
     * A key in the "unix" namespace for getting the mode of the file
     * (e.g. whether the file is a regular file, symlink, etc).
     *
     * See the documentation for `lstat()`: this attribute is equivalent to
     * the `st_mode` member of `struct stat`, and includes both the file type
     * and permissions.
     *
     * This attribute is only available for UNIX file systems.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_UINT32.
     */
    public const val FILE_ATTRIBUTE_UNIX_MODE: String = "unix::mode"

    /**
     * A key in the "unix" namespace for getting the number of hard links
     * for a file.
     *
     * See the documentation for `lstat()`.
     *
     * This attribute is only available for UNIX file systems.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_UINT32.
     */
    public const val FILE_ATTRIBUTE_UNIX_NLINK: String = "unix::nlink"

    /**
     * A key in the "unix" namespace for getting the device ID for the file
     * (if it is a special file).
     *
     * See the documentation for `lstat()`.
     *
     * This attribute is only available for UNIX file systems.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_UINT32.
     */
    public const val FILE_ATTRIBUTE_UNIX_RDEV: String = "unix::rdev"

    /**
     * A key in the "unix" namespace for getting the user ID for the file.
     *
     * This attribute is only available for UNIX file systems.
     *
     * Corresponding #GFileAttributeType is %G_FILE_ATTRIBUTE_TYPE_UINT32.
     */
    public const val FILE_ATTRIBUTE_UNIX_UID: String = "unix::uid"

    /**
     * Extension point for memory usage monitoring functionality.
     * See [Extending GIO][extending-gio].
     *
     * @since 2.64
     */
    public const val MEMORY_MONITOR_EXTENSION_POINT_NAME: String = "gio-memory-monitor"

    /**
     * The menu item attribute which holds the action name of the item.  Action
     * names are namespaced with an identifier for the action group in which the
     * action resides. For example, "win." for window-specific actions and "app."
     * for application-wide actions.
     *
     * See also g_menu_model_get_item_attribute() and g_menu_item_set_attribute().
     *
     * @since 2.32
     */
    public const val MENU_ATTRIBUTE_ACTION: String = "action"

    /**
     * The menu item attribute that holds the namespace for all action names in
     * menus that are linked from this item.
     *
     * @since 2.36
     */
    public const val MENU_ATTRIBUTE_ACTION_NAMESPACE: String = "action-namespace"

    /**
     * The menu item attribute which holds the icon of the item.
     *
     * The icon is stored in the format returned by g_icon_serialize().
     *
     * This attribute is intended only to represent 'noun' icons such as
     * favicons for a webpage, or application icons.  It should not be used
     * for 'verbs' (ie: stock icons).
     *
     * @since 2.38
     */
    public const val MENU_ATTRIBUTE_ICON: String = "icon"

    /**
     * The menu item attribute which holds the label of the item.
     *
     * @since 2.32
     */
    public const val MENU_ATTRIBUTE_LABEL: String = "label"

    /**
     * The menu item attribute which holds the target with which the item's action
     * will be activated.
     *
     * See also g_menu_item_set_action_and_target()
     *
     * @since 2.32
     */
    public const val MENU_ATTRIBUTE_TARGET: String = "target"

    /**
     * The maximum number of entries in a menu section supported by
     * g_dbus_connection_export_menu_model().
     *
     * The exact value of the limit may change in future GLib versions.
     *
     * @since 2.76
     */
    public const val MENU_EXPORTER_MAX_SECTION_SIZE: gint = 1000

    /**
     * The name of the link that associates a menu item with a section.  The linked
     * menu will usually be shown in place of the menu item, using the item's label
     * as a header.
     *
     * See also g_menu_item_set_link().
     *
     * @since 2.32
     */
    public const val MENU_LINK_SECTION: String = "section"

    /**
     * The name of the link that associates a menu item with a submenu.
     *
     * See also g_menu_item_set_link().
     *
     * @since 2.32
     */
    public const val MENU_LINK_SUBMENU: String = "submenu"

    public const val NATIVE_VOLUME_MONITOR_EXTENSION_POINT_NAME: String =
        "gio-native-volume-monitor"

    /**
     * Extension point for network status monitoring functionality.
     * See [Extending GIO][extending-gio].
     *
     * @since 2.30
     */
    public const val NETWORK_MONITOR_EXTENSION_POINT_NAME: String = "gio-network-monitor"

    /**
     * Extension point for power profile usage monitoring functionality.
     * See [Extending GIO][extending-gio].
     *
     * @since 2.70
     */
    public const val POWER_PROFILE_MONITOR_EXTENSION_POINT_NAME: String =
        "gio-power-profile-monitor"

    /**
     * Extension point for proxy functionality.
     * See [Extending GIO][extending-gio].
     *
     * @since 2.26
     */
    public const val PROXY_EXTENSION_POINT_NAME: String = "gio-proxy"

    /**
     * Extension point for proxy resolving functionality.
     * See [Extending GIO][extending-gio].
     */
    public const val PROXY_RESOLVER_EXTENSION_POINT_NAME: String = "gio-proxy-resolver"

    /**
     * Extension point for #GSettingsBackend functionality.
     */
    public const val SETTINGS_BACKEND_EXTENSION_POINT_NAME: String = "gsettings-backend"

    /**
     * Extension point for TLS functionality via #GTlsBackend.
     * See [Extending GIO][extending-gio].
     */
    public const val TLS_BACKEND_EXTENSION_POINT_NAME: String = "gio-tls-backend"

    /**
     * The purpose used to verify the client certificate in a TLS connection.
     * Used by TLS servers.
     */
    public const val TLS_DATABASE_PURPOSE_AUTHENTICATE_CLIENT: String = "1.3.6.1.5.5.7.3.2"

    /**
     * The purpose used to verify the server certificate in a TLS connection. This
     * is the most common purpose in use. Used by TLS clients.
     */
    public const val TLS_DATABASE_PURPOSE_AUTHENTICATE_SERVER: String = "1.3.6.1.5.5.7.3.1"

    /**
     * Extension point for #GVfs functionality.
     * See [Extending GIO][extending-gio].
     */
    public const val VFS_EXTENSION_POINT_NAME: String = "gio-vfs"

    /**
     * The string used to obtain the volume class with g_volume_get_identifier().
     *
     * Known volume classes include `device`, `network`, and `loop`. Other
     * classes may be added in the future.
     *
     * This is intended to be used by applications to classify #GVolume
     * instances into different sections - for example a file manager or
     * file chooser can use this information to show `network` volumes under
     * a "Network" heading and `device` volumes under a "Devices" heading.
     */
    public const val VOLUME_IDENTIFIER_KIND_CLASS: String = "class"

    /**
     * The string used to obtain a Hal UDI with g_volume_get_identifier().
     */
    public const val VOLUME_IDENTIFIER_KIND_HAL_UDI: String = "hal-udi"

    /**
     * The string used to obtain a filesystem label with g_volume_get_identifier().
     */
    public const val VOLUME_IDENTIFIER_KIND_LABEL: String = "label"

    /**
     * The string used to obtain a NFS mount with g_volume_get_identifier().
     */
    public const val VOLUME_IDENTIFIER_KIND_NFS_MOUNT: String = "nfs-mount"

    /**
     * The string used to obtain a Unix device path with g_volume_get_identifier().
     */
    public const val VOLUME_IDENTIFIER_KIND_UNIX_DEVICE: String = "unix-device"

    /**
     * The string used to obtain a UUID with g_volume_get_identifier().
     */
    public const val VOLUME_IDENTIFIER_KIND_UUID: String = "uuid"

    /**
     * Extension point for volume monitor functionality.
     * See [Extending GIO][extending-gio].
     */
    public const val VOLUME_MONITOR_EXTENSION_POINT_NAME: String = "gio-volume-monitor"

    /**
     * Asynchronously connects to the message bus specified by @bus_type.
     *
     * When the operation is finished, @callback will be invoked. You can
     * then call g_bus_get_finish() to get the result of the operation.
     *
     * This is an asynchronous failable function. See g_bus_get_sync() for
     * the synchronous version.
     *
     * @param busType a #GBusType
     * @param cancellable a #GCancellable or null
     * @param callback a #GAsyncReadyCallback to call when the request is satisfied
     * @since 2.26
     */
    @GioVersion2_26
    public fun busGet(busType: BusType, cancellable: Cancellable? = null, callback: AsyncReadyCallback?): Unit =
        g_bus_get(
            busType.nativeValue,
            cancellable?.gioCancellablePointer?.reinterpret(),
            callback?.let {
                AsyncReadyCallbackFunc.reinterpret()
            },
            callback?.let { StableRef.create(callback).asCPointer() }
        )

    /**
     * Finishes an operation started with g_bus_get().
     *
     * The returned object is a singleton, that is, shared with other
     * callers of g_bus_get() and g_bus_get_sync() for @bus_type. In the
     * event that you need a private message bus connection, use
     * g_dbus_address_get_for_bus_sync() and
     * g_dbus_connection_new_for_address() with
     * G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_CLIENT and
     * G_DBUS_CONNECTION_FLAGS_MESSAGE_BUS_CONNECTION flags.
     *
     * Note that the returned #GDBusConnection object will (usually) have
     * the #GDBusConnection:exit-on-close property set to true.
     *
     * @param res a #GAsyncResult obtained from the #GAsyncReadyCallback passed
     *     to g_bus_get()
     * @return a #GDBusConnection or null if @error is set.
     *     Free with g_object_unref().
     * @since 2.26
     */
    @GioVersion2_26
    public fun busGetFinish(res: AsyncResult): Result<DBusConnection> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_bus_get_finish(res.gioAsyncResultPointer, gError.ptr)?.run {
            DBusConnection(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(org.gtkkn.bindings.gio.Gio.resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Synchronously connects to the message bus specified by @bus_type.
     * Note that the returned object may shared with other callers,
     * e.g. if two separate parts of a process calls this function with
     * the same @bus_type, they will share the same object.
     *
     * This is a synchronous failable function. See g_bus_get() and
     * g_bus_get_finish() for the asynchronous version.
     *
     * The returned object is a singleton, that is, shared with other
     * callers of g_bus_get() and g_bus_get_sync() for @bus_type. In the
     * event that you need a private message bus connection, use
     * g_dbus_address_get_for_bus_sync() and
     * g_dbus_connection_new_for_address() with
     * G_DBUS_CONNECTION_FLAGS_AUTHENTICATION_CLIENT and
     * G_DBUS_CONNECTION_FLAGS_MESSAGE_BUS_CONNECTION flags.
     *
     * Note that the returned #GDBusConnection object will (usually) have
     * the #GDBusConnection:exit-on-close property set to true.
     *
     * @param busType a #GBusType
     * @param cancellable a #GCancellable or null
     * @return a #GDBusConnection or null if @error is set.
     *     Free with g_object_unref().
     * @since 2.26
     */
    @GioVersion2_26
    public fun busGetSync(busType: BusType, cancellable: Cancellable? = null): Result<DBusConnection> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_bus_get_sync(
            busType.nativeValue,
            cancellable?.gioCancellablePointer?.reinterpret(),
            gError.ptr
        )?.run {
            DBusConnection(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(org.gtkkn.bindings.gio.Gio.resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Version of g_bus_own_name_on_connection() using closures instead of
     * callbacks for easier binding in other languages.
     *
     * @param connection a #GDBusConnection
     * @param name the well-known name to own
     * @param flags a set of flags from the #GBusNameOwnerFlags enumeration
     * @param nameAcquiredClosure #GClosure to invoke when @name is
     *     acquired or null
     * @param nameLostClosure #GClosure to invoke when @name is lost
     *     or null
     * @return an identifier (never 0) that can be used with
     *     g_bus_unown_name() to stop owning the name.
     * @since 2.26
     */
    @GioVersion2_26
    public fun busOwnNameOnConnection(
        connection: DBusConnection,
        name: String,
        flags: BusNameOwnerFlags,
        nameAcquiredClosure: Closure? = null,
        nameLostClosure: Closure? = null,
    ): guint = g_bus_own_name_on_connection_with_closures(
        connection.gioDBusConnectionPointer.reinterpret(),
        name,
        flags.mask,
        nameAcquiredClosure?.gPointer?.reinterpret(),
        nameLostClosure?.gPointer?.reinterpret()
    )

    /**
     * Version of g_bus_own_name() using closures instead of callbacks for
     * easier binding in other languages.
     *
     * @param busType the type of bus to own a name on
     * @param name the well-known name to own
     * @param flags a set of flags from the #GBusNameOwnerFlags enumeration
     * @param busAcquiredClosure #GClosure to invoke when connected to
     *     the bus of type @bus_type or null
     * @param nameAcquiredClosure #GClosure to invoke when @name is
     *     acquired or null
     * @param nameLostClosure #GClosure to invoke when @name is lost or
     *     null
     * @return an identifier (never 0) that can be used with
     *     g_bus_unown_name() to stop owning the name.
     * @since 2.26
     */
    @GioVersion2_26
    public fun busOwnName(
        busType: BusType,
        name: String,
        flags: BusNameOwnerFlags,
        busAcquiredClosure: Closure? = null,
        nameAcquiredClosure: Closure? = null,
        nameLostClosure: Closure? = null,
    ): guint = g_bus_own_name_with_closures(
        busType.nativeValue,
        name,
        flags.mask,
        busAcquiredClosure?.gPointer?.reinterpret(),
        nameAcquiredClosure?.gPointer?.reinterpret(),
        nameLostClosure?.gPointer?.reinterpret()
    )

    /**
     * Stops owning a name.
     *
     * Note that there may still be D-Bus traffic to process (relating to owning
     * and unowning the name) in the current thread-default #GMainContext after
     * this function has returned. You should continue to iterate the #GMainContext
     * until the #GDestroyNotify function passed to g_bus_own_name() is called, in
     * order to avoid memory leaks through callbacks queued on the #GMainContext
     * after it’s stopped being iterated.
     *
     * @param ownerId an identifier obtained from g_bus_own_name()
     * @since 2.26
     */
    @GioVersion2_26
    public fun busUnownName(ownerId: guint): Unit = g_bus_unown_name(ownerId)

    /**
     * Stops watching a name.
     *
     * Note that there may still be D-Bus traffic to process (relating to watching
     * and unwatching the name) in the current thread-default #GMainContext after
     * this function has returned. You should continue to iterate the #GMainContext
     * until the #GDestroyNotify function passed to g_bus_watch_name() is called, in
     * order to avoid memory leaks through callbacks queued on the #GMainContext
     * after it’s stopped being iterated.
     *
     * @param watcherId An identifier obtained from g_bus_watch_name()
     * @since 2.26
     */
    @GioVersion2_26
    public fun busUnwatchName(watcherId: guint): Unit = g_bus_unwatch_name(watcherId)

    /**
     * Version of g_bus_watch_name_on_connection() using closures instead of callbacks for
     * easier binding in other languages.
     *
     * @param connection A #GDBusConnection.
     * @param name The name (well-known or unique) to watch.
     * @param flags Flags from the #GBusNameWatcherFlags enumeration.
     * @param nameAppearedClosure #GClosure to invoke when @name is known
     * to exist or null.
     * @param nameVanishedClosure #GClosure to invoke when @name is known
     * to not exist or null.
     * @return An identifier (never 0) that can be used with
     * g_bus_unwatch_name() to stop watching the name.
     * @since 2.26
     */
    @GioVersion2_26
    public fun busWatchNameOnConnection(
        connection: DBusConnection,
        name: String,
        flags: BusNameWatcherFlags,
        nameAppearedClosure: Closure? = null,
        nameVanishedClosure: Closure? = null,
    ): guint = g_bus_watch_name_on_connection_with_closures(
        connection.gioDBusConnectionPointer.reinterpret(),
        name,
        flags.mask,
        nameAppearedClosure?.gPointer?.reinterpret(),
        nameVanishedClosure?.gPointer?.reinterpret()
    )

    /**
     * Version of g_bus_watch_name() using closures instead of callbacks for
     * easier binding in other languages.
     *
     * @param busType The type of bus to watch a name on.
     * @param name The name (well-known or unique) to watch.
     * @param flags Flags from the #GBusNameWatcherFlags enumeration.
     * @param nameAppearedClosure #GClosure to invoke when @name is known
     * to exist or null.
     * @param nameVanishedClosure #GClosure to invoke when @name is known
     * to not exist or null.
     * @return An identifier (never 0) that can be used with
     * g_bus_unwatch_name() to stop watching the name.
     * @since 2.26
     */
    @GioVersion2_26
    public fun busWatchName(
        busType: BusType,
        name: String,
        flags: BusNameWatcherFlags,
        nameAppearedClosure: Closure? = null,
        nameVanishedClosure: Closure? = null,
    ): guint = g_bus_watch_name_with_closures(
        busType.nativeValue,
        name,
        flags.mask,
        nameAppearedClosure?.gPointer?.reinterpret(),
        nameVanishedClosure?.gPointer?.reinterpret()
    )

    /**
     * Checks if a content type can be executable. Note that for instance
     * things like text files can be executables (i.e. scripts and batch files).
     *
     * @param type a content type string
     * @return true if the file type corresponds to a type that
     *     can be executable, false otherwise.
     */
    public fun contentTypeCanBeExecutable(type: String): Boolean = g_content_type_can_be_executable(type).asBoolean()

    /**
     * Compares two content types for equality.
     *
     * @param type1 a content type string
     * @param type2 a content type string
     * @return true if the two strings are identical or equivalent,
     *     false otherwise.
     */
    public fun contentTypeEquals(type1: String, type2: String): Boolean =
        g_content_type_equals(type1, type2).asBoolean()

    /**
     * Tries to find a content type based on the mime type name.
     *
     * @param mimeType a mime type string
     * @return Newly allocated string with content type or
     *     null. Free with g_free()
     * @since 2.18
     */
    @GioVersion2_18
    public fun contentTypeFromMimeType(mimeType: String): String? = g_content_type_from_mime_type(mimeType)?.toKString()

    /**
     * Gets the human readable description of the content type.
     *
     * @param type a content type string
     * @return a short description of the content type @type. Free the
     *     returned string with g_free()
     */
    public fun contentTypeGetDescription(type: String): String =
        g_content_type_get_description(type)?.toKString() ?: error("Expected not null string")

    /**
     * Gets the generic icon name for a content type.
     *
     * See the
     * [shared-mime-info](http://www.freedesktop.org/wiki/Specifications/shared-mime-info-spec)
     * specification for more on the generic icon name.
     *
     * @param type a content type string
     * @return the registered generic icon name for the given @type,
     *     or null if unknown. Free with g_free()
     * @since 2.34
     */
    @GioVersion2_34
    public fun contentTypeGetGenericIconName(type: String): String? =
        g_content_type_get_generic_icon_name(type)?.toKString()

    /**
     * Gets the icon for a content type.
     *
     * @param type a content type string
     * @return #GIcon corresponding to the content type. Free the returned
     *     object with g_object_unref()
     */
    public fun contentTypeGetIcon(type: String): Icon = g_content_type_get_icon(type)!!.run {
        Icon.wrap(reinterpret())
    }

    /**
     * Get the list of directories which MIME data is loaded from. See
     * g_content_type_set_mime_dirs() for details.
     *
     * @return null-terminated list of
     *    directories to load MIME data from, including any `mime/` subdirectory,
     *    and with the first directory to try listed first
     * @since 2.60
     */
    @GioVersion2_60
    public fun contentTypeGetMimeDirs(): CollectionsList<String> =
        g_content_type_get_mime_dirs()?.toKStringList() ?: error("Expected not null string array")

    /**
     * Gets the mime type for the content type, if one is registered.
     *
     * @param type a content type string
     * @return the registered mime type for the
     *     given @type, or null if unknown; free with g_free().
     */
    public fun contentTypeGetMimeType(type: String): String? = g_content_type_get_mime_type(type)?.toKString()

    /**
     * Gets the symbolic icon for a content type.
     *
     * @param type a content type string
     * @return symbolic #GIcon corresponding to the content type.
     *     Free the returned object with g_object_unref()
     * @since 2.34
     */
    @GioVersion2_34
    public fun contentTypeGetSymbolicIcon(type: String): Icon = g_content_type_get_symbolic_icon(type)!!.run {
        Icon.wrap(reinterpret())
    }

    /**
     * Tries to guess the type of the tree with root @root, by
     * looking at the files it contains. The result is an array
     * of content types, with the best guess coming first.
     *
     * The types returned all have the form x-content/foo, e.g.
     * x-content/audio-cdda (for audio CDs) or x-content/image-dcf
     * (for a camera memory card). See the
     * [shared-mime-info](http://www.freedesktop.org/wiki/Specifications/shared-mime-info-spec)
     * specification for more on x-content types.
     *
     * This function is useful in the implementation of
     * g_mount_guess_content_type().
     *
     * @param root the root of the tree to guess a type for
     * @return an null-terminated
     *     array of zero or more content types. Free with g_strfreev()
     * @since 2.18
     */
    @GioVersion2_18
    public fun contentTypeGuessForTree(root: File): CollectionsList<String> =
        g_content_type_guess_for_tree(root.gioFilePointer)?.toKStringList() ?: error("Expected not null string array")

    /**
     * Determines if @type is a subset of @supertype.
     *
     * @param type a content type string
     * @param supertype a content type string
     * @return true if @type is a kind of @supertype,
     *     false otherwise.
     */
    public fun contentTypeIsA(type: String, supertype: String): Boolean =
        g_content_type_is_a(type, supertype).asBoolean()

    /**
     * Determines if @type is a subset of @mime_type.
     * Convenience wrapper around g_content_type_is_a().
     *
     * @param type a content type string
     * @param mimeType a mime type string
     * @return true if @type is a kind of @mime_type,
     *     false otherwise.
     * @since 2.52
     */
    @GioVersion2_52
    public fun contentTypeIsMimeType(type: String, mimeType: String): Boolean =
        g_content_type_is_mime_type(type, mimeType).asBoolean()

    /**
     * Checks if the content type is the generic "unknown" type.
     * On UNIX this is the "application/octet-stream" mimetype,
     * while on win32 it is "*" and on OSX it is a dynamic type
     * or octet-stream.
     *
     * @param type a content type string
     * @return true if the type is the unknown type.
     */
    public fun contentTypeIsUnknown(type: String): Boolean = g_content_type_is_unknown(type).asBoolean()

    /**
     * Set the list of directories used by GIO to load the MIME database.
     * If @dirs is null, the directories used are the default:
     *
     *  - the `mime` subdirectory of the directory in `$XDG_DATA_HOME`
     *  - the `mime` subdirectory of every directory in `$XDG_DATA_DIRS`
     *
     * This function is intended to be used when writing tests that depend on
     * information stored in the MIME database, in order to control the data.
     *
     * Typically, in case your tests use %G_TEST_OPTION_ISOLATE_DIRS, but they
     * depend on the system’s MIME database, you should call this function
     * with @dirs set to null before calling g_test_init(), for instance:
     *
     * |[<!-- language="C" -->
     *   // Load MIME data from the system
     *   g_content_type_set_mime_dirs (NULL);
     *   // Isolate the environment
     *   g_test_init (&argc, &argv, G_TEST_OPTION_ISOLATE_DIRS, NULL);
     *
     *   …
     *
     *   return g_test_run ();
     * ]|
     *
     * @param dirs null-terminated list of
     *    directories to load MIME data from, including any `mime/` subdirectory,
     *    and with the first directory to try listed first
     * @since 2.60
     */
    @GioVersion2_60
    public fun contentTypeSetMimeDirs(dirs: CollectionsList<String>? = null): Unit = memScoped {
        return g_content_type_set_mime_dirs(dirs?.toCStringList(this))
    }

    /**
     * Gets a list of strings containing all the registered content types
     * known to the system. The list and its data should be freed using
     * `g_list_free_full (list, g_free)`.
     *
     * @return list of the registered
     *     content types
     */
    public fun contentTypesGetRegistered(): GlibList = g_content_types_get_registered()!!.run {
        GlibList(reinterpret())
    }

    /**
     * Escape @string so it can appear in a D-Bus address as the value
     * part of a key-value pair.
     *
     * For instance, if @string is `/run/bus-for-:0`,
     * this function would return `/run/bus-for-%3A0`,
     * which could be used in a D-Bus address like
     * `unix:nonce-tcp:host=127.0.0.1,port=42,noncefile=/run/bus-for-%3A0`.
     *
     * @param string an unescaped string to be included in a D-Bus address
     *     as the value in a key-value pair
     * @return a copy of @string with all
     *     non-optionally-escaped bytes escaped
     * @since 2.36
     */
    @GioVersion2_36
    public fun dbusAddressEscapeValue(string: String): String =
        g_dbus_address_escape_value(string)?.toKString() ?: error("Expected not null string")

    /**
     * Synchronously looks up the D-Bus address for the well-known message
     * bus instance specified by @bus_type. This may involve using various
     * platform specific mechanisms.
     *
     * The returned address will be in the
     * [D-Bus address format](https://dbus.freedesktop.org/doc/dbus-specification.html#addresses).
     *
     * @param busType a #GBusType
     * @param cancellable a #GCancellable or null
     * @return a valid D-Bus address string for @bus_type or
     *     null if @error is set
     * @since 2.26
     */
    @GioVersion2_26
    public fun dbusAddressGetForBusSync(busType: BusType, cancellable: Cancellable? = null): Result<String> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult = g_dbus_address_get_for_bus_sync(
                busType.nativeValue,
                cancellable?.gioCancellablePointer?.reinterpret(),
                gError.ptr
            )?.toKString()
            return if (gError.pointed != null) {
                Result.failure(org.gtkkn.bindings.gio.Gio.resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(checkNotNull(gResult))
            }
        }

    /**
     * Asynchronously connects to an endpoint specified by @address and
     * sets up the connection so it is in a state to run the client-side
     * of the D-Bus authentication conversation. @address must be in the
     * [D-Bus address format](https://dbus.freedesktop.org/doc/dbus-specification.html#addresses).
     *
     * When the operation is finished, @callback will be invoked. You can
     * then call g_dbus_address_get_stream_finish() to get the result of
     * the operation.
     *
     * This is an asynchronous failable function. See
     * g_dbus_address_get_stream_sync() for the synchronous version.
     *
     * @param address A valid D-Bus address.
     * @param cancellable A #GCancellable or null.
     * @param callback A #GAsyncReadyCallback to call when the request is satisfied.
     * @since 2.26
     */
    @GioVersion2_26
    public fun dbusAddressGetStream(
        address: String,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = g_dbus_address_get_stream(
        address,
        cancellable?.gioCancellablePointer?.reinterpret(),
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * This is a language binding friendly version of g_dbus_escape_object_path_bytestring().
     *
     * @param s the string to escape
     * @return an escaped version of @s. Free with g_free().
     * @since 2.68
     */
    @GioVersion2_68
    public fun dbusEscapeObjectPath(s: String): String =
        g_dbus_escape_object_path(s)?.toKString() ?: error("Expected not null string")

    /**
     * Generate a D-Bus GUID that can be used with
     * e.g. g_dbus_connection_new().
     *
     * See the
     * [D-Bus specification](https://dbus.freedesktop.org/doc/dbus-specification.html#uuids)
     * regarding what strings are valid D-Bus GUIDs. The specification refers to
     * these as ‘UUIDs’ whereas GLib (for historical reasons) refers to them as
     * ‘GUIDs’. The terms are interchangeable.
     *
     * Note that D-Bus GUIDs do not follow
     * [RFC 4122](https://datatracker.ietf.org/doc/html/rfc4122).
     *
     * @return A valid D-Bus GUID. Free with g_free().
     * @since 2.26
     */
    @GioVersion2_26
    public fun dbusGenerateGuid(): String = g_dbus_generate_guid()?.toKString() ?: error("Expected not null string")

    /**
     * Converts a #GValue to a #GVariant of the type indicated by the @type
     * parameter.
     *
     * The conversion is using the following rules:
     *
     * - `G_TYPE_STRING`: 's', 'o', 'g' or 'ay'
     * - `G_TYPE_STRV`: 'as', 'ao' or 'aay'
     * - `G_TYPE_BOOLEAN`: 'b'
     * - `G_TYPE_UCHAR`: 'y'
     * - `G_TYPE_INT`: 'i', 'n'
     * - `G_TYPE_UINT`: 'u', 'q'
     * - `G_TYPE_INT64`: 'x'
     * - `G_TYPE_UINT64`: 't'
     * - `G_TYPE_DOUBLE`: 'd'
     * - `G_TYPE_VARIANT`: Any #GVariantType
     *
     * This can fail if e.g. @gvalue is of type %G_TYPE_STRING and @type
     * is 'i', i.e. %G_VARIANT_TYPE_INT32. It will also fail for any #GType
     * (including e.g. %G_TYPE_OBJECT and %G_TYPE_BOXED derived-types) not
     * in the table above.
     *
     * Note that if @gvalue is of type %G_TYPE_VARIANT and its value is
     * null, the empty #GVariant instance (never null) for @type is
     * returned (e.g. 0 for scalar types, the empty string for string types,
     * '/' for object path types, the empty array for any array type and so on).
     *
     * See the g_dbus_gvariant_to_gvalue() function for how to convert a
     * #GVariant to a #GValue.
     *
     * @param gvalue A #GValue to convert to a #GVariant
     * @param type A #GVariantType
     * @return A #GVariant (never floating) of
     *     #GVariantType @type holding the data from @gvalue or an empty #GVariant
     *     in case of failure. Free with g_variant_unref().
     * @since 2.30
     */
    @GioVersion2_30
    public fun dbusGvalueToGvariant(gvalue: Value, type: VariantType): Variant =
        g_dbus_gvalue_to_gvariant(gvalue.gPointer.reinterpret(), type.gPointer.reinterpret())!!.run {
            Variant(reinterpret())
        }

    /**
     * Converts a #GVariant to a #GValue. If @value is floating, it is consumed.
     *
     * The rules specified in the g_dbus_gvalue_to_gvariant() function are
     * used - this function is essentially its reverse form. So, a #GVariant
     * containing any basic or string array type will be converted to a #GValue
     * containing a basic value or string array. Any other #GVariant (handle,
     * variant, tuple, dict entry) will be converted to a #GValue containing that
     * #GVariant.
     *
     * The conversion never fails - a valid #GValue is always returned in
     * @out_gvalue.
     *
     * @param value A #GVariant.
     * @param outGvalue Return location pointing to a zero-filled (uninitialized) #GValue.
     * @since 2.30
     */
    @GioVersion2_30
    public fun dbusGvariantToGvalue(`value`: Variant, outGvalue: Value): Unit =
        g_dbus_gvariant_to_gvalue(`value`.gPointer.reinterpret(), outGvalue.gPointer.reinterpret())

    /**
     * Checks if @string is a
     * [D-Bus address](https://dbus.freedesktop.org/doc/dbus-specification.html#addresses).
     *
     * This doesn't check if @string is actually supported by #GDBusServer
     * or #GDBusConnection - use g_dbus_is_supported_address() to do more
     * checks.
     *
     * @param string A string.
     * @return true if @string is a valid D-Bus address, false otherwise.
     * @since 2.26
     */
    @GioVersion2_26
    public fun dbusIsAddress(string: String): Boolean = g_dbus_is_address(string).asBoolean()

    /**
     * Check whether @string is a valid D-Bus error name.
     *
     * This function returns the same result as g_dbus_is_interface_name(),
     * because D-Bus error names are defined to have exactly the
     * same syntax as interface names.
     *
     * @param string The string to check.
     * @return true if valid, false otherwise.
     * @since 2.70
     */
    @GioVersion2_70
    public fun dbusIsErrorName(string: String): Boolean = g_dbus_is_error_name(string).asBoolean()

    /**
     * Checks if @string is a D-Bus GUID.
     *
     * See the documentation for g_dbus_generate_guid() for more information about
     * the format of a GUID.
     *
     * @param string The string to check.
     * @return true if @string is a GUID, false otherwise.
     * @since 2.26
     */
    @GioVersion2_26
    public fun dbusIsGuid(string: String): Boolean = g_dbus_is_guid(string).asBoolean()

    /**
     * Checks if @string is a valid D-Bus interface name.
     *
     * @param string The string to check.
     * @return true if valid, false otherwise.
     * @since 2.26
     */
    @GioVersion2_26
    public fun dbusIsInterfaceName(string: String): Boolean = g_dbus_is_interface_name(string).asBoolean()

    /**
     * Checks if @string is a valid D-Bus member (e.g. signal or method) name.
     *
     * @param string The string to check.
     * @return true if valid, false otherwise.
     * @since 2.26
     */
    @GioVersion2_26
    public fun dbusIsMemberName(string: String): Boolean = g_dbus_is_member_name(string).asBoolean()

    /**
     * Checks if @string is a valid D-Bus bus name (either unique or well-known).
     *
     * @param string The string to check.
     * @return true if valid, false otherwise.
     * @since 2.26
     */
    @GioVersion2_26
    public fun dbusIsName(string: String): Boolean = g_dbus_is_name(string).asBoolean()

    /**
     * Like g_dbus_is_address() but also checks if the library supports the
     * transports in @string and that key/value pairs for each transport
     * are valid. See the specification of the
     * [D-Bus address format](https://dbus.freedesktop.org/doc/dbus-specification.html#addresses).
     *
     * @param string A string.
     * @return true if @string is a valid D-Bus address that is
     * supported by this library, false if @error is set.
     * @since 2.26
     */
    @GioVersion2_26
    public fun dbusIsSupportedAddress(string: String): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_dbus_is_supported_address(string, gError.ptr).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(org.gtkkn.bindings.gio.Gio.resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Checks if @string is a valid D-Bus unique bus name.
     *
     * @param string The string to check.
     * @return true if valid, false otherwise.
     * @since 2.26
     */
    @GioVersion2_26
    public fun dbusIsUniqueName(string: String): Boolean = g_dbus_is_unique_name(string).asBoolean()

    /**
     * Converts `errno.h` error codes into GIO error codes.
     *
     * The fallback value %G_IO_ERROR_FAILED is returned for error codes not
     * currently handled (but note that future GLib releases may return a more
     * specific value instead).
     *
     * As `errno` is global and may be modified by intermediate function
     * calls, you should save its value immediately after the call returns,
     * and use the saved value instead of `errno`:
     *
     *
     * |[<!-- language="C" -->
     *   int saved_errno;
     *
     *   ret = read (blah);
     *   saved_errno = errno;
     *
     *   g_io_error_from_errno (saved_errno);
     * ]|
     *
     * @param errNo Error number as defined in errno.h.
     * @return #GIOErrorEnum value for the given `errno.h` error number
     */
    public fun ioErrorFromErrno(errNo: gint): IoErrorEnum = g_io_error_from_errno(errNo).run {
        IoErrorEnum.fromNativeValue(this)
    }

    /**
     * Converts #GFileError error codes into GIO error codes.
     *
     * @param fileError a #GFileError.
     * @return #GIOErrorEnum value for the given #GFileError error value.
     * @since 2.74
     */
    @GioVersion2_74
    public fun ioErrorFromFileError(fileError: FileError): IoErrorEnum =
        g_io_error_from_file_error(fileError.nativeValue).run {
            IoErrorEnum.fromNativeValue(this)
        }

    /**
     * Gets the GIO Error Quark.
     *
     * @return a #GQuark.
     */
    public fun ioErrorQuark(): Quark = g_io_error_quark()

    /**
     * Loads all the modules in the specified directory.
     *
     * If don't require all modules to be initialized (and thus registering
     * all gtypes) then you can use g_io_modules_scan_all_in_directory()
     * which allows delayed/lazy loading of modules.
     *
     * @param dirname pathname for a directory containing modules
     *     to load.
     * @return a list of #GIOModules loaded
     *      from the directory,
     *      All the modules are loaded into memory, if you want to
     *      unload them (enabling on-demand loading) you must call
     *      g_type_module_unuse() on all the modules. Free the list
     *      with g_list_free().
     */
    public fun ioModulesLoadAllInDirectory(dirname: String): GlibList =
        g_io_modules_load_all_in_directory(dirname)!!.run {
            GlibList(reinterpret())
        }

    /**
     * Loads all the modules in the specified directory.
     *
     * If don't require all modules to be initialized (and thus registering
     * all gtypes) then you can use g_io_modules_scan_all_in_directory()
     * which allows delayed/lazy loading of modules.
     *
     * @param dirname pathname for a directory containing modules
     *     to load.
     * @param scope a scope to use when scanning the modules.
     * @return a list of #GIOModules loaded
     *      from the directory,
     *      All the modules are loaded into memory, if you want to
     *      unload them (enabling on-demand loading) you must call
     *      g_type_module_unuse() on all the modules. Free the list
     *      with g_list_free().
     * @since 2.30
     */
    @GioVersion2_30
    public fun ioModulesLoadAllInDirectoryWithScope(dirname: String, scope: IoModuleScope): GlibList =
        g_io_modules_load_all_in_directory_with_scope(dirname, scope.gPointer.reinterpret())!!.run {
            GlibList(reinterpret())
        }

    /**
     * Scans all the modules in the specified directory, ensuring that
     * any extension point implemented by a module is registered.
     *
     * This may not actually load and initialize all the types in each
     * module, some modules may be lazily loaded and initialized when
     * an extension point it implements is used with e.g.
     * g_io_extension_point_get_extensions() or
     * g_io_extension_point_get_extension_by_name().
     *
     * If you need to guarantee that all types are loaded in all the modules,
     * use g_io_modules_load_all_in_directory().
     *
     * @param dirname pathname for a directory containing modules
     *     to scan.
     * @since 2.24
     */
    @GioVersion2_24
    public fun ioModulesScanAllInDirectory(dirname: String): Unit = g_io_modules_scan_all_in_directory(dirname)

    /**
     * Scans all the modules in the specified directory, ensuring that
     * any extension point implemented by a module is registered.
     *
     * This may not actually load and initialize all the types in each
     * module, some modules may be lazily loaded and initialized when
     * an extension point it implements is used with e.g.
     * g_io_extension_point_get_extensions() or
     * g_io_extension_point_get_extension_by_name().
     *
     * If you need to guarantee that all types are loaded in all the modules,
     * use g_io_modules_load_all_in_directory().
     *
     * @param dirname pathname for a directory containing modules
     *     to scan.
     * @param scope a scope to use when scanning the modules
     * @since 2.30
     */
    @GioVersion2_30
    public fun ioModulesScanAllInDirectoryWithScope(dirname: String, scope: IoModuleScope): Unit =
        g_io_modules_scan_all_in_directory_with_scope(dirname, scope.gPointer.reinterpret())

    /**
     * Cancels all cancellable I/O jobs.
     *
     * A job is cancellable if a #GCancellable was passed into
     * g_io_scheduler_push_job().
     */
    public fun ioSchedulerCancelAllJobs(): Unit = g_io_scheduler_cancel_all_jobs()

    /**
     * Schedules the I/O job to run in another thread.
     *
     * @notify will be called on @user_data after @job_func has returned,
     * regardless whether the job was cancelled or has run to completion.
     *
     * If @cancellable is not null, it can be used to cancel the I/O job
     * by calling g_cancellable_cancel() or by calling
     * g_io_scheduler_cancel_all_jobs().
     *
     * @param jobFunc a #GIOSchedulerJobFunc.
     * @param ioPriority the [I/O priority][io-priority]
     * of the request.
     * @param cancellable optional #GCancellable object, null to ignore.
     */
    public fun ioSchedulerPushJob(
        jobFunc: IoSchedulerJobFunc,
        ioPriority: gint,
        cancellable: Cancellable? = null,
    ): Unit = g_io_scheduler_push_job(
        IoSchedulerJobFuncFunc.reinterpret(),
        StableRef.create(jobFunc).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        ioPriority,
        cancellable?.gioCancellablePointer?.reinterpret()
    )

    /**
     * Creates a keyfile-backed #GSettingsBackend.
     *
     * The filename of the keyfile to use is given by @filename.
     *
     * All settings read to or written from the backend must fall under the
     * path given in @root_path (which must start and end with a slash and
     * not contain two consecutive slashes).  @root_path may be "/".
     *
     * If @root_group is non-null then it specifies the name of the keyfile
     * group used for keys that are written directly below @root_path.  For
     * example, if @root_path is "/apps/example/" and @root_group is
     * "toplevel", then settings the key "/apps/example/enabled" to a value
     * of true will cause the following to appear in the keyfile:
     *
     * |[
     *   [toplevel]
     *   enabled=true
     * ]|
     *
     * If @root_group is null then it is not permitted to store keys
     * directly below the @root_path.
     *
     * For keys not stored directly below @root_path (ie: in a sub-path),
     * the name of the subpath (with the final slash stripped) is used as
     * the name of the keyfile group.  To continue the example, if
     * "/apps/example/profiles/default/font-size" were set to
     * 12 then the following would appear in the keyfile:
     *
     * |[
     *   [profiles/default]
     *   font-size=12
     * ]|
     *
     * The backend will refuse writes (and return writability as being
     * false) for keys outside of @root_path and, in the event that
     * @root_group is null, also for keys directly under @root_path.
     * Writes will also be refused if the backend detects that it has the
     * inability to rewrite the keyfile (ie: the containing directory is not
     * writable).
     *
     * There is no checking done for your key namespace clashing with the
     * syntax of the key file format.  For example, if you have '[' or ']'
     * characters in your path names or '=' in your key names you may be in
     * trouble.
     *
     * The backend reads default values from a keyfile called `defaults` in
     * the directory specified by the #GKeyfileSettingsBackend:defaults-dir property,
     * and a list of locked keys from a text file with the name `locks` in
     * the same location.
     *
     * @param filename the filename of the keyfile
     * @param rootPath the path under which all settings keys appear
     * @param rootGroup the group name corresponding to
     *              @root_path, or null
     * @return a keyfile-backed #GSettingsBackend
     */
    public fun keyfileSettingsBackendNew(
        filename: String,
        rootPath: String,
        rootGroup: String? = null,
    ): SettingsBackend = g_keyfile_settings_backend_new(filename, rootPath, rootGroup)!!.run {
        SettingsBackend(reinterpret())
    }

    /**
     * Creates a memory-backed #GSettingsBackend.
     *
     * This backend allows changes to settings, but does not write them
     * to any backing storage, so the next time you run your application,
     * the memory backend will start out with the default values again.
     *
     * @return a newly created #GSettingsBackend
     * @since 2.28
     */
    @GioVersion2_28
    public fun memorySettingsBackendNew(): SettingsBackend = g_memory_settings_backend_new()!!.run {
        SettingsBackend(reinterpret())
    }

    /**
     * Initializes the platform networking libraries (eg, on Windows, this
     * calls WSAStartup()). GLib will call this itself if it is needed, so
     * you only need to call it if you directly call system networking
     * functions (without calling any GLib networking functions first).
     *
     * @since 2.36
     */
    @GioVersion2_36
    public fun networkingInit(): Unit = g_networking_init()

    /**
     * Creates a readonly #GSettingsBackend.
     *
     * This backend does not allow changes to settings, so all settings
     * will always have their default values.
     *
     * @return a newly created #GSettingsBackend
     * @since 2.28
     */
    @GioVersion2_28
    public fun nullSettingsBackendNew(): SettingsBackend = g_null_settings_backend_new()!!.run {
        SettingsBackend(reinterpret())
    }

    /**
     * Utility method for #GPollableInputStream and #GPollableOutputStream
     * implementations. Creates a new #GSource that expects a callback of
     * type #GPollableSourceFunc. The new source does not actually do
     * anything on its own; use g_source_add_child_source() to add other
     * sources to it to cause it to trigger.
     *
     * @param pollableStream the stream associated with the new source
     * @return the new #GSource.
     * @since 2.28
     */
    @GioVersion2_28
    public fun pollableSourceNew(pollableStream: Object): Source =
        g_pollable_source_new(pollableStream.gPointer.reinterpret())!!.run {
            Source(reinterpret())
        }

    /**
     * Utility method for #GPollableInputStream and #GPollableOutputStream
     * implementations. Creates a new #GSource, as with
     * g_pollable_source_new(), but also attaching @child_source (with a
     * dummy callback), and @cancellable, if they are non-null.
     *
     * @param pollableStream the stream associated with the
     *   new source
     * @param childSource optional child source to attach
     * @param cancellable optional #GCancellable to attach
     * @return the new #GSource.
     * @since 2.34
     */
    @GioVersion2_34
    public fun pollableSourceNewFull(
        pollableStream: Object,
        childSource: Source? = null,
        cancellable: Cancellable? = null,
    ): Source = g_pollable_source_new_full(
        pollableStream.gPointer.reinterpret(),
        childSource?.gPointer?.reinterpret(),
        cancellable?.gioCancellablePointer?.reinterpret()
    )!!.run {
        Source(reinterpret())
    }

    /**
     * Returns all the names of children at the specified @path in the set of
     * globally registered resources.
     * The return result is a null terminated list of strings which should
     * be released with g_strfreev().
     *
     * @lookup_flags controls the behaviour of the lookup.
     *
     * @param path A pathname inside the resource
     * @param lookupFlags A #GResourceLookupFlags
     * @return an array of constant strings
     * @since 2.32
     */
    @GioVersion2_32
    public fun resourcesEnumerateChildren(
        path: String,
        lookupFlags: ResourceLookupFlags,
    ): Result<CollectionsList<String>> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_resources_enumerate_children(path, lookupFlags.mask, gError.ptr)?.toKStringList()
        return if (gError.pointed != null) {
            Result.failure(org.gtkkn.bindings.gio.Gio.resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Looks for a file at the specified @path in the set of
     * globally registered resources and returns a #GBytes that
     * lets you directly access the data in memory.
     *
     * The data is always followed by a zero byte, so you
     * can safely use the data as a C string. However, that byte
     * is not included in the size of the GBytes.
     *
     * For uncompressed resource files this is a pointer directly into
     * the resource bundle, which is typically in some readonly data section
     * in the program binary. For compressed files we allocate memory on
     * the heap and automatically uncompress the data.
     *
     * @lookup_flags controls the behaviour of the lookup.
     *
     * @param path A pathname inside the resource
     * @param lookupFlags A #GResourceLookupFlags
     * @return #GBytes or null on error.
     *     Free the returned object with g_bytes_unref()
     * @since 2.32
     */
    @GioVersion2_32
    public fun resourcesLookupData(path: String, lookupFlags: ResourceLookupFlags): Result<Bytes> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_resources_lookup_data(path, lookupFlags.mask, gError.ptr)?.run {
            Bytes(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(org.gtkkn.bindings.gio.Gio.resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Looks for a file at the specified @path in the set of
     * globally registered resources and returns a #GInputStream
     * that lets you read the data.
     *
     * @lookup_flags controls the behaviour of the lookup.
     *
     * @param path A pathname inside the resource
     * @param lookupFlags A #GResourceLookupFlags
     * @return #GInputStream or null on error.
     *     Free the returned object with g_object_unref()
     * @since 2.32
     */
    @GioVersion2_32
    public fun resourcesOpenStream(path: String, lookupFlags: ResourceLookupFlags): Result<InputStream> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = g_resources_open_stream(path, lookupFlags.mask, gError.ptr)?.run {
            InputStream(reinterpret())
        }

        return if (gError.pointed != null) {
            Result.failure(org.gtkkn.bindings.gio.Gio.resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Registers the resource with the process-global set of resources.
     * Once a resource is registered the files in it can be accessed
     * with the global resource lookup functions like g_resources_lookup_data().
     *
     * @param resource A #GResource
     * @since 2.32
     */
    @GioVersion2_32
    public fun resourcesRegister(resource: Resource): Unit = g_resources_register(resource.gPointer.reinterpret())

    /**
     * Unregisters the resource from the process-global set of resources.
     *
     * @param resource A #GResource
     * @since 2.32
     */
    @GioVersion2_32
    public fun resourcesUnregister(resource: Resource): Unit = g_resources_unregister(resource.gPointer.reinterpret())

    /**
     * Reports an error in an idle function. Similar to
     * g_simple_async_report_error_in_idle(), but takes a #GError rather
     * than building a new one.
     *
     * @param object a #GObject, or null
     * @param callback a #GAsyncReadyCallback.
     * @param error the #GError to report
     */
    public fun simpleAsyncReportGerrorInIdle(
        `object`: Object? = null,
        callback: AsyncReadyCallback?,
        error: Error,
    ): Unit = g_simple_async_report_gerror_in_idle(
        `object`?.gPointer?.reinterpret(),
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() },
        error.gPointer.reinterpret()
    )

    /**
     * Reports an error in an idle function. Similar to
     * g_simple_async_report_gerror_in_idle(), but takes over the caller's
     * ownership of @error, so the caller does not have to free it any more.
     *
     * @param object a #GObject, or null
     * @param callback a #GAsyncReadyCallback.
     * @param error the #GError to report
     * @since 2.28
     */
    @GioVersion2_28
    public fun simpleAsyncReportTakeGerrorInIdle(
        `object`: Object? = null,
        callback: AsyncReadyCallback?,
        error: Error,
    ): Unit = g_simple_async_report_take_gerror_in_idle(
        `object`?.gPointer?.reinterpret(),
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() },
        error.gPointer.reinterpret()
    )

    /**
     * Determines if @mount_path is considered an implementation of the
     * OS. This is primarily used for hiding mountable and mounted volumes
     * that only are used in the OS and has little to no relevance to the
     * casual user.
     *
     * @param mountPath a mount path, e.g. `/media/disk` or `/usr`
     * @return true if @mount_path is considered an implementation detail
     *     of the OS.
     */
    public fun unixIsMountPathSystemInternal(mountPath: String): Boolean =
        g_unix_is_mount_path_system_internal(mountPath).asBoolean()

    /**
     * Determines if @device_path is considered a block device path which is only
     * used in implementation of the OS. This is primarily used for hiding
     * mounted volumes that are intended as APIs for programs to read, and system
     * administrators at a shell; rather than something that should, for example,
     * appear in a GUI. For example, the Linux `/proc` filesystem.
     *
     * The list of device paths considered ‘system’ ones may change over time.
     *
     * @param devicePath a device path, e.g. `/dev/loop0` or `nfsd`
     * @return true if @device_path is considered an implementation detail of
     *    the OS.
     * @since 2.56
     */
    @GioVersion2_56
    public fun unixIsSystemDevicePath(devicePath: String): Boolean =
        g_unix_is_system_device_path(devicePath).asBoolean()

    /**
     * Determines if @fs_type is considered a type of file system which is only
     * used in implementation of the OS. This is primarily used for hiding
     * mounted volumes that are intended as APIs for programs to read, and system
     * administrators at a shell; rather than something that should, for example,
     * appear in a GUI. For example, the Linux `/proc` filesystem.
     *
     * The list of file system types considered ‘system’ ones may change over time.
     *
     * @param fsType a file system type, e.g. `procfs` or `tmpfs`
     * @return true if @fs_type is considered an implementation detail of the OS.
     * @since 2.56
     */
    @GioVersion2_56
    public fun unixIsSystemFsType(fsType: String): Boolean = g_unix_is_system_fs_type(fsType).asBoolean()

    /**
     * Compares two unix mounts.
     *
     * @param mount1 first #GUnixMountEntry to compare.
     * @param mount2 second #GUnixMountEntry to compare.
     * @return 1, 0 or -1 if @mount1 is greater than, equal to,
     * or less than @mount2, respectively.
     */
    public fun unixMountCompare(mount1: UnixMountEntry, mount2: UnixMountEntry): gint =
        g_unix_mount_compare(mount1.gPointer.reinterpret(), mount2.gPointer.reinterpret())

    /**
     * Makes a copy of @mount_entry.
     *
     * @param mountEntry a #GUnixMountEntry.
     * @return a new #GUnixMountEntry
     * @since 2.54
     */
    @GioVersion2_54
    public fun unixMountCopy(mountEntry: UnixMountEntry): UnixMountEntry =
        g_unix_mount_copy(mountEntry.gPointer.reinterpret())!!.run {
            UnixMountEntry(reinterpret())
        }

    /**
     * Frees a unix mount.
     *
     * @param mountEntry a #GUnixMountEntry.
     */
    public fun unixMountFree(mountEntry: UnixMountEntry): Unit = g_unix_mount_free(mountEntry.gPointer.reinterpret())

    /**
     * Gets the device path for a unix mount.
     *
     * @param mountEntry a #GUnixMount.
     * @return a string containing the device path.
     */
    public fun unixMountGetDevicePath(mountEntry: UnixMountEntry): String =
        g_unix_mount_get_device_path(mountEntry.gPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the filesystem type for the unix mount.
     *
     * @param mountEntry a #GUnixMount.
     * @return a string containing the file system type.
     */
    public fun unixMountGetFsType(mountEntry: UnixMountEntry): String =
        g_unix_mount_get_fs_type(mountEntry.gPointer.reinterpret())?.toKString() ?: error("Expected not null string")

    /**
     * Gets the mount path for a unix mount.
     *
     * @param mountEntry input #GUnixMountEntry to get the mount path for.
     * @return the mount path for @mount_entry.
     */
    public fun unixMountGetMountPath(mountEntry: UnixMountEntry): String =
        g_unix_mount_get_mount_path(mountEntry.gPointer.reinterpret())?.toKString() ?: error("Expected not null string")

    /**
     * Gets a comma-separated list of mount options for the unix mount. For example,
     * `rw,relatime,seclabel,data=ordered`.
     *
     * This is similar to g_unix_mount_point_get_options(), but it takes
     * a #GUnixMountEntry as an argument.
     *
     * @param mountEntry a #GUnixMountEntry.
     * @return a string containing the options, or null if not
     * available.
     * @since 2.58
     */
    @GioVersion2_58
    public fun unixMountGetOptions(mountEntry: UnixMountEntry): String? =
        g_unix_mount_get_options(mountEntry.gPointer.reinterpret())?.toKString()

    /**
     * Gets the root of the mount within the filesystem. This is useful e.g. for
     * mounts created by bind operation, or btrfs subvolumes.
     *
     * For example, the root path is equal to "/" for mount created by
     * "mount /dev/sda1 /mnt/foo" and "/bar" for
     * "mount --bind /mnt/foo/bar /mnt/bar".
     *
     * @param mountEntry a #GUnixMountEntry.
     * @return a string containing the root, or null if not supported.
     * @since 2.60
     */
    @GioVersion2_60
    public fun unixMountGetRootPath(mountEntry: UnixMountEntry): String? =
        g_unix_mount_get_root_path(mountEntry.gPointer.reinterpret())?.toKString()

    /**
     * Guesses whether a Unix mount can be ejected.
     *
     * @param mountEntry a #GUnixMountEntry
     * @return true if @mount_entry is deemed to be ejectable.
     */
    public fun unixMountGuessCanEject(mountEntry: UnixMountEntry): Boolean =
        g_unix_mount_guess_can_eject(mountEntry.gPointer.reinterpret()).asBoolean()

    /**
     * Guesses the icon of a Unix mount.
     *
     * @param mountEntry a #GUnixMountEntry
     * @return a #GIcon
     */
    public fun unixMountGuessIcon(mountEntry: UnixMountEntry): Icon =
        g_unix_mount_guess_icon(mountEntry.gPointer.reinterpret())!!.run {
            Icon.wrap(reinterpret())
        }

    /**
     * Guesses the name of a Unix mount.
     * The result is a translated string.
     *
     * @param mountEntry a #GUnixMountEntry
     * @return A newly allocated string that must
     *     be freed with g_free()
     */
    public fun unixMountGuessName(mountEntry: UnixMountEntry): String =
        g_unix_mount_guess_name(mountEntry.gPointer.reinterpret())?.toKString() ?: error("Expected not null string")

    /**
     * Guesses whether a Unix mount should be displayed in the UI.
     *
     * @param mountEntry a #GUnixMountEntry
     * @return true if @mount_entry is deemed to be displayable.
     */
    public fun unixMountGuessShouldDisplay(mountEntry: UnixMountEntry): Boolean =
        g_unix_mount_guess_should_display(mountEntry.gPointer.reinterpret()).asBoolean()

    /**
     * Guesses the symbolic icon of a Unix mount.
     *
     * @param mountEntry a #GUnixMountEntry
     * @return a #GIcon
     * @since 2.34
     */
    @GioVersion2_34
    public fun unixMountGuessSymbolicIcon(mountEntry: UnixMountEntry): Icon =
        g_unix_mount_guess_symbolic_icon(mountEntry.gPointer.reinterpret())!!.run {
            Icon.wrap(reinterpret())
        }

    /**
     * Checks if a unix mount is mounted read only.
     *
     * @param mountEntry a #GUnixMount.
     * @return true if @mount_entry is read only.
     */
    public fun unixMountIsReadonly(mountEntry: UnixMountEntry): Boolean =
        g_unix_mount_is_readonly(mountEntry.gPointer.reinterpret()).asBoolean()

    /**
     * Checks if a Unix mount is a system mount. This is the Boolean OR of
     * g_unix_is_system_fs_type(), g_unix_is_system_device_path() and
     * g_unix_is_mount_path_system_internal() on @mount_entry’s properties.
     *
     * The definition of what a ‘system’ mount entry is may change over time as new
     * file system types and device paths are ignored.
     *
     * @param mountEntry a #GUnixMount.
     * @return true if the unix mount is for a system path.
     */
    public fun unixMountIsSystemInternal(mountEntry: UnixMountEntry): Boolean =
        g_unix_mount_is_system_internal(mountEntry.gPointer.reinterpret()).asBoolean()

    /**
     * Checks if the unix mount points have changed since a given unix time.
     *
     * @param time guint64 to contain a timestamp.
     * @return true if the mount points have changed since @time.
     */
    public fun unixMountPointsChangedSince(time: guint64): Boolean = g_unix_mount_points_changed_since(time).asBoolean()

    /**
     * Checks if the unix mounts have changed since a given unix time.
     *
     * @param time guint64 to contain a timestamp.
     * @return true if the mounts have changed since @time.
     */
    public fun unixMountsChangedSince(time: guint64): Boolean = g_unix_mounts_changed_since(time).asBoolean()

    public fun resolveException(error: Error): GLibException {
        val ex = when (error.domain) {
            DBusError.quark() -> DBusError.fromErrorOrNull(error)
                ?.let {
                    DBusErrorException(error, it)
                }
            IoErrorEnum.quark() -> IoErrorEnum.fromErrorOrNull(error)
                ?.let {
                    IoErrorEnumException(error, it)
                }
            ResolverError.quark() -> ResolverError.fromErrorOrNull(error)
                ?.let {
                    ResolverErrorException(error, it)
                }
            ResourceError.quark() -> ResourceError.fromErrorOrNull(error)
                ?.let {
                    ResourceErrorException(error, it)
                }
            TlsChannelBindingError.quark() -> TlsChannelBindingError.fromErrorOrNull(error)
                ?.let {
                    TlsChannelBindingErrorException(error, it)
                }
            TlsError.quark() -> TlsError.fromErrorOrNull(error)
                ?.let {
                    TlsErrorException(error, it)
                }
            else -> null
        }
        return ex ?: GLibException(error)
    }
}

public val AsyncReadyCallbackFunc: CPointer<
    CFunction<
        (
            CPointer<GObject>?,
            CPointer<GAsyncResult>,
            gpointer?,
        ) -> Unit
        >
    > = staticCFunction {
        sourceObject: CPointer<GObject>?,
        res: CPointer<GAsyncResult>?,
        `data`: gpointer?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            sourceObject: Object?,
            res: AsyncResult,
            `data`: gpointer?,
        ) -> Unit
        >().get().invoke(
        sourceObject?.run {
            Object(reinterpret())
        },
        res!!.run {
            AsyncResult.wrap(reinterpret())
        },
        `data`
    )
}
    .reinterpret()

public val BusAcquiredCallbackFunc:
    CPointer<CFunction<(CPointer<GDBusConnection>, CPointer<ByteVar>) -> Unit>> =
    staticCFunction {
            connection: CPointer<GDBusConnection>?,
            name: CPointer<ByteVar>?,
            userData: gpointer?,
        ->
        userData!!.asStableRef<(connection: DBusConnection, name: String) -> Unit>().get().invoke(
            connection!!.run {
                DBusConnection(reinterpret())
            },
            name?.toKString() ?: error("Expected not null string")
        )
    }
        .reinterpret()

public val BusNameAcquiredCallbackFunc:
    CPointer<CFunction<(CPointer<GDBusConnection>, CPointer<ByteVar>) -> Unit>> =
    staticCFunction {
            connection: CPointer<GDBusConnection>?,
            name: CPointer<ByteVar>?,
            userData: gpointer?,
        ->
        userData!!.asStableRef<(connection: DBusConnection, name: String) -> Unit>().get().invoke(
            connection!!.run {
                DBusConnection(reinterpret())
            },
            name?.toKString() ?: error("Expected not null string")
        )
    }
        .reinterpret()

public val BusNameAppearedCallbackFunc: CPointer<
    CFunction<
        (
            CPointer<GDBusConnection>,
            CPointer<ByteVar>,
            CPointer<ByteVar>,
        ) -> Unit
        >
    > = staticCFunction {
        connection: CPointer<GDBusConnection>?,
        name: CPointer<ByteVar>?,
        nameOwner: CPointer<ByteVar>?,
        userData: gpointer?,
    ->
    userData!!.asStableRef<
        (
            connection: DBusConnection,
            name: String,
            nameOwner: String,
        ) -> Unit
        >().get().invoke(
        connection!!.run {
            DBusConnection(reinterpret())
        },
        name?.toKString() ?: error("Expected not null string"),
        nameOwner?.toKString() ?: error("Expected not null string")
    )
}
    .reinterpret()

public val BusNameLostCallbackFunc:
    CPointer<CFunction<(CPointer<GDBusConnection>, CPointer<ByteVar>) -> Unit>> =
    staticCFunction {
            connection: CPointer<GDBusConnection>?,
            name: CPointer<ByteVar>?,
            userData: gpointer?,
        ->
        userData!!.asStableRef<(connection: DBusConnection, name: String) -> Unit>().get().invoke(
            connection!!.run {
                DBusConnection(reinterpret())
            },
            name?.toKString() ?: error("Expected not null string")
        )
    }
        .reinterpret()

public val BusNameVanishedCallbackFunc:
    CPointer<CFunction<(CPointer<GDBusConnection>, CPointer<ByteVar>) -> Unit>> =
    staticCFunction {
            connection: CPointer<GDBusConnection>?,
            name: CPointer<ByteVar>?,
            userData: gpointer?,
        ->
        userData!!.asStableRef<(connection: DBusConnection, name: String) -> Unit>().get().invoke(
            connection!!.run {
                DBusConnection(reinterpret())
            },
            name?.toKString() ?: error("Expected not null string")
        )
    }
        .reinterpret()

public val CancellableSourceFuncFunc:
    CPointer<CFunction<(CPointer<GCancellable>?, gpointer?) -> gboolean>> = staticCFunction {
            cancellable: CPointer<GCancellable>?,
            `data`: gpointer?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(cancellable: Cancellable?, `data`: gpointer?) -> Boolean>().get().invoke(
            cancellable?.run {
                Cancellable(reinterpret())
            },
            `data`
        ).asGBoolean()
    }
        .reinterpret()

public val DBusInterfaceGetPropertyFuncFunc: CPointer<
    CFunction<
        (
            CPointer<GDBusConnection>,
            CPointer<ByteVar>,
            CPointer<ByteVar>,
            CPointer<ByteVar>,
            CPointer<ByteVar>,
            CPointer<org.gtkkn.native.glib.GError>,
        ) -> CPointer<GVariant>
        >
    > = staticCFunction {
        connection: CPointer<GDBusConnection>?,
        sender: CPointer<ByteVar>?,
        objectPath: CPointer<ByteVar>?,
        interfaceName: CPointer<ByteVar>?,
        propertyName: CPointer<ByteVar>?,
        error: CPointer<org.gtkkn.native.glib.GError>?,
        userData: gpointer?,
    ->
    userData!!.asStableRef<
        (
            connection: DBusConnection,
            sender: String,
            objectPath: String,
            interfaceName: String,
            propertyName: String,
            error: Error,
        ) -> Variant
        >().get().invoke(
        connection!!.run {
            DBusConnection(reinterpret())
        },
        sender?.toKString() ?: error("Expected not null string"),
        objectPath?.toKString() ?: error("Expected not null string"),
        interfaceName?.toKString() ?: error("Expected not null string"),
        propertyName?.toKString() ?: error("Expected not null string"),
        error!!.run {
            Error(reinterpret())
        }
    ).gPointer
}
    .reinterpret()

public val DBusInterfaceMethodCallFuncFunc: CPointer<
    CFunction<
        (
            CPointer<GDBusConnection>,
            CPointer<ByteVar>,
            CPointer<ByteVar>,
            CPointer<ByteVar>,
            CPointer<ByteVar>,
            CPointer<GVariant>,
            CPointer<GDBusMethodInvocation>,
        ) -> Unit
        >
    > = staticCFunction {
        connection: CPointer<GDBusConnection>?,
        sender: CPointer<ByteVar>?,
        objectPath: CPointer<ByteVar>?,
        interfaceName: CPointer<ByteVar>?,
        methodName: CPointer<ByteVar>?,
        parameters: CPointer<GVariant>?,
        invocation: CPointer<GDBusMethodInvocation>?,
        userData: gpointer?,
    ->
    userData!!.asStableRef<
        (
            connection: DBusConnection,
            sender: String,
            objectPath: String,
            interfaceName: String,
            methodName: String,
            parameters: Variant,
            invocation: DBusMethodInvocation,
        ) -> Unit
        >().get().invoke(
        connection!!.run {
            DBusConnection(reinterpret())
        },
        sender?.toKString() ?: error("Expected not null string"),
        objectPath?.toKString() ?: error("Expected not null string"),
        interfaceName?.toKString() ?: error("Expected not null string"),
        methodName?.toKString() ?: error("Expected not null string"),
        parameters!!.run {
            Variant(reinterpret())
        },
        invocation!!.run {
            DBusMethodInvocation(reinterpret())
        }
    )
}
    .reinterpret()

public val DBusInterfaceSetPropertyFuncFunc: CPointer<
    CFunction<
        (
            CPointer<GDBusConnection>,
            CPointer<ByteVar>,
            CPointer<ByteVar>,
            CPointer<ByteVar>,
            CPointer<ByteVar>,
            CPointer<GVariant>,
            CPointer<org.gtkkn.native.glib.GError>,
        ) -> gboolean
        >
    > = staticCFunction {
        connection: CPointer<GDBusConnection>?,
        sender: CPointer<ByteVar>?,
        objectPath: CPointer<ByteVar>?,
        interfaceName: CPointer<ByteVar>?,
        propertyName: CPointer<ByteVar>?,
        `value`: CPointer<GVariant>?,
        error: CPointer<org.gtkkn.native.glib.GError>?,
        userData: gpointer?,
    ->
    userData!!.asStableRef<
        (
            connection: DBusConnection,
            sender: String,
            objectPath: String,
            interfaceName: String,
            propertyName: String,
            `value`: Variant,
            error: Error,
        ) -> Boolean
        >().get().invoke(
        connection!!.run {
            DBusConnection(reinterpret())
        },
        sender?.toKString() ?: error("Expected not null string"),
        objectPath?.toKString() ?: error("Expected not null string"),
        interfaceName?.toKString() ?: error("Expected not null string"),
        propertyName?.toKString() ?: error("Expected not null string"),
        `value`!!.run {
            Variant(reinterpret())
        },
        error!!.run {
            Error(reinterpret())
        }
    ).asGBoolean()
}
    .reinterpret()

public val DBusMessageFilterFunctionFunc: CPointer<
    CFunction<
        (
            CPointer<GDBusConnection>,
            CPointer<GDBusMessage>,
            gboolean,
        ) -> CPointer<GDBusMessage>?
        >
    > = staticCFunction {
        connection: CPointer<GDBusConnection>?,
        message: CPointer<GDBusMessage>?,
        incoming: gboolean,
        userData: gpointer?,
    ->
    userData!!.asStableRef<
        (
            connection: DBusConnection,
            message: DBusMessage,
            incoming: Boolean,
        ) -> DBusMessage?
        >().get().invoke(
        connection!!.run {
            DBusConnection(reinterpret())
        },
        message!!.run {
            DBusMessage(reinterpret())
        },
        incoming.asBoolean()
    )?.gioDBusMessagePointer
}
    .reinterpret()

public val DBusProxyTypeFuncFunc: CPointer<
    CFunction<
        (
            CPointer<GDBusObjectManagerClient>,
            CPointer<ByteVar>,
            CPointer<ByteVar>?,
            gpointer?,
        ) -> GType
        >
    > = staticCFunction {
        manager: CPointer<GDBusObjectManagerClient>?,
        objectPath: CPointer<ByteVar>?,
        interfaceName: CPointer<ByteVar>?,
        `data`: gpointer?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            manager: DBusObjectManagerClient,
            objectPath: String,
            interfaceName: String?,
            `data`: gpointer?,
        ) -> GType
        >().get().invoke(
        manager!!.run {
            DBusObjectManagerClient(reinterpret())
        },
        objectPath?.toKString() ?: error("Expected not null string"),
        interfaceName?.toKString(),
        `data`
    )
}
    .reinterpret()

public val DBusSignalCallbackFunc: CPointer<
    CFunction<
        (
            CPointer<GDBusConnection>,
            CPointer<ByteVar>?,
            CPointer<ByteVar>,
            CPointer<ByteVar>,
            CPointer<ByteVar>,
            CPointer<GVariant>,
        ) -> Unit
        >
    > = staticCFunction {
        connection: CPointer<GDBusConnection>?,
        senderName: CPointer<ByteVar>?,
        objectPath: CPointer<ByteVar>?,
        interfaceName: CPointer<ByteVar>?,
        signalName: CPointer<ByteVar>?,
        parameters: CPointer<GVariant>?,
        userData: gpointer?,
    ->
    userData!!.asStableRef<
        (
            connection: DBusConnection,
            senderName: String?,
            objectPath: String,
            interfaceName: String,
            signalName: String,
            parameters: Variant,
        ) -> Unit
        >().get().invoke(
        connection!!.run {
            DBusConnection(reinterpret())
        },
        senderName?.toKString(),
        objectPath?.toKString() ?: error("Expected not null string"),
        interfaceName?.toKString() ?: error("Expected not null string"),
        signalName?.toKString() ?: error("Expected not null string"),
        parameters!!.run {
            Variant(reinterpret())
        }
    )
}
    .reinterpret()

public val DBusSubtreeDispatchFuncFunc: CPointer<
    CFunction<
        (
            CPointer<GDBusConnection>,
            CPointer<ByteVar>,
            CPointer<ByteVar>,
            CPointer<ByteVar>,
            CPointer<ByteVar>,
        ) -> CPointer<GDBusInterfaceVTable>?
        >
    > = staticCFunction {
        connection: CPointer<GDBusConnection>?,
        sender: CPointer<ByteVar>?,
        objectPath: CPointer<ByteVar>?,
        interfaceName: CPointer<ByteVar>?,
        node: CPointer<ByteVar>?,
        userData: gpointer?,
    ->
    userData!!.asStableRef<
        (
            connection: DBusConnection,
            sender: String,
            objectPath: String,
            interfaceName: String,
            node: String,
        ) -> DBusInterfaceVTable?
        >().get().invoke(
        connection!!.run {
            DBusConnection(reinterpret())
        },
        sender?.toKString() ?: error("Expected not null string"),
        objectPath?.toKString() ?: error("Expected not null string"),
        interfaceName?.toKString() ?: error("Expected not null string"),
        node?.toKString() ?: error("Expected not null string")
    )?.gPointer
}
    .reinterpret()

public val DBusSubtreeEnumerateFuncFunc: CPointer<
    CFunction<
        (
            CPointer<GDBusConnection>,
            CPointer<ByteVar>,
            CPointer<ByteVar>,
        ) -> CArrayPointer<CPointerVarOf<CPointer<ByteVar>>>
        >
    > = staticCFunction {
        connection: CPointer<GDBusConnection>?,
        sender: CPointer<ByteVar>?,
        objectPath: CPointer<ByteVar>?,
        userData: gpointer?,
    ->
    memScoped {
        userData!!.asStableRef<
            (
                connection: DBusConnection,
                sender: String,
                objectPath: String,
            ) -> CollectionsList<String>
            >().get().invoke(
            connection!!.run {
                DBusConnection(reinterpret())
            },
            sender?.toKString() ?: error("Expected not null string"),
            objectPath?.toKString() ?: error("Expected not null string")
        ).toCStringList(this)
    }
}
    .reinterpret()

public val DatagramBasedSourceFuncFunc: CPointer<
    CFunction<
        (
            CPointer<GDatagramBased>,
            GIOCondition,
            gpointer?,
        ) -> gboolean
        >
    > = staticCFunction {
        datagramBased: CPointer<GDatagramBased>?,
        condition: GIOCondition,
        `data`: gpointer?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            datagramBased: DatagramBased,
            condition: IoCondition,
            `data`: gpointer?,
        ) -> Boolean
        >().get().invoke(
        datagramBased!!.run {
            DatagramBased.wrap(reinterpret())
        },
        condition.run {
            IoCondition(this)
        },
        `data`
    ).asGBoolean()
}
    .reinterpret()

public val DesktopAppLaunchCallbackFunc:
    CPointer<CFunction<(CPointer<GDesktopAppInfo>, Pid) -> Unit>> = staticCFunction {
            appinfo: CPointer<GDesktopAppInfo>?,
            pid: Pid,
            userData: gpointer?,
        ->
        userData!!.asStableRef<(appinfo: DesktopAppInfo, pid: Pid) -> Unit>().get().invoke(
            appinfo!!.run {
                DesktopAppInfo(reinterpret())
            },
            pid
        )
    }
        .reinterpret()

public val FileMeasureProgressCallbackFunc: CPointer<
    CFunction<
        (
            gboolean,
            guint64,
            guint64,
            guint64,
            gpointer?,
        ) -> Unit
        >
    > = staticCFunction {
        reporting: gboolean,
        currentSize: guint64,
        numDirs: guint64,
        numFiles: guint64,
        `data`: gpointer?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            reporting: Boolean,
            currentSize: guint64,
            numDirs: guint64,
            numFiles: guint64,
            `data`: gpointer?,
        ) -> Unit
        >().get().invoke(reporting.asBoolean(), currentSize, numDirs, numFiles, `data`)
}
    .reinterpret()

public val FileProgressCallbackFunc: CPointer<
    CFunction<
        (
            gint64,
            gint64,
            gpointer?,
        ) -> Unit
        >
    > = staticCFunction {
        currentNumBytes: gint64,
        totalNumBytes: gint64,
        `data`: gpointer?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            currentNumBytes: gint64,
            totalNumBytes: gint64,
            `data`: gpointer?,
        ) -> Unit
        >().get().invoke(currentNumBytes, totalNumBytes, `data`)
}
    .reinterpret()

public val FileReadMoreCallbackFunc: CPointer<
    CFunction<
        (
            CPointer<ByteVar>,
            gint64,
            gpointer?,
        ) -> gboolean
        >
    > = staticCFunction {
        fileContents: CPointer<ByteVar>?,
        fileSize: gint64,
        callbackData: gpointer?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            fileContents: String,
            fileSize: gint64,
            callbackData: gpointer?,
        ) -> Boolean
        >().get().invoke(
        fileContents?.toKString() ?: error("Expected not null string"),
        fileSize,
        callbackData
    ).asGBoolean()
}
    .reinterpret()

public val IoSchedulerJobFuncFunc: CPointer<
    CFunction<
        (
            CPointer<GIOSchedulerJob>,
            CPointer<GCancellable>?,
            gpointer?,
        ) -> gboolean
        >
    > = staticCFunction {
        job: CPointer<GIOSchedulerJob>?,
        cancellable: CPointer<GCancellable>?,
        `data`: gpointer?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            job: IoSchedulerJob,
            cancellable: Cancellable?,
            `data`: gpointer?,
        ) -> Boolean
        >().get().invoke(
        job!!.run {
            IoSchedulerJob(reinterpret())
        },
        cancellable?.run {
            Cancellable(reinterpret())
        },
        `data`
    ).asGBoolean()
}
    .reinterpret()

public val PollableSourceFuncFunc: CPointer<CFunction<(CPointer<GObject>, gpointer?) -> gboolean>> =
    staticCFunction {
            pollableStream: CPointer<GObject>?,
            `data`: gpointer?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(pollableStream: Object, `data`: gpointer?) -> Boolean>().get().invoke(
            pollableStream!!.run {
                Object(reinterpret())
            },
            `data`
        ).asGBoolean()
    }
        .reinterpret()

public val ReallocFuncFunc: CPointer<CFunction<(gpointer?, gsize) -> gpointer?>> = staticCFunction {
        `data`: gpointer?,
        size: gsize,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(`data`: gpointer?, size: gsize) -> gpointer?>().get().invoke(`data`, size)
}
    .reinterpret()

public val SettingsBindGetMappingFunc:
    CPointer<CFunction<(CPointer<GValue>, CPointer<GVariant>) -> gboolean>> = staticCFunction {
            `value`: CPointer<GValue>?,
            variant: CPointer<GVariant>?,
            userData: gpointer?,
        ->
        userData!!.asStableRef<(`value`: Value, variant: Variant) -> Boolean>().get().invoke(
            `value`!!.run {
                Value(reinterpret())
            },
            variant!!.run {
                Variant(reinterpret())
            }
        ).asGBoolean()
    }
        .reinterpret()

public val SettingsBindSetMappingFunc:
    CPointer<CFunction<(CPointer<GValue>, CPointer<GVariantType>) -> CPointer<GVariant>>> =
    staticCFunction {
            `value`: CPointer<GValue>?,
            expectedType: CPointer<GVariantType>?,
            userData: gpointer?,
        ->
        userData!!.asStableRef<(`value`: Value, expectedType: VariantType) -> Variant>().get().invoke(
            `value`!!.run {
                Value(reinterpret())
            },
            expectedType!!.run {
                VariantType(reinterpret())
            }
        ).gPointer
    }
        .reinterpret()

public val SettingsGetMappingFunc: CPointer<CFunction<(CPointer<GVariant>) -> gboolean>> =
    staticCFunction {
            `value`: CPointer<GVariant>?,
            userData: gpointer?,
        ->
        userData!!.asStableRef<(`value`: Variant) -> Boolean>().get().invoke(
            `value`!!.run {
                Variant(reinterpret())
            }
        ).asGBoolean()
    }
        .reinterpret()

public val SimpleAsyncThreadFuncFunc: CPointer<
    CFunction<
        (
            CPointer<GSimpleAsyncResult>,
            CPointer<GObject>,
            CPointer<GCancellable>?,
        ) -> Unit
        >
    > = staticCFunction {
        res: CPointer<GSimpleAsyncResult>?,
        `object`: CPointer<GObject>?,
        cancellable: CPointer<GCancellable>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            res: SimpleAsyncResult,
            `object`: Object,
            cancellable: Cancellable?,
        ) -> Unit
        >().get().invoke(
        res!!.run {
            SimpleAsyncResult(reinterpret())
        },
        `object`!!.run {
            Object(reinterpret())
        },
        cancellable?.run {
            Cancellable(reinterpret())
        }
    )
}
    .reinterpret()

public val SocketSourceFuncFunc: CPointer<
    CFunction<
        (
            CPointer<GSocket>,
            GIOCondition,
            gpointer?,
        ) -> gboolean
        >
    > = staticCFunction {
        socket: CPointer<GSocket>?,
        condition: GIOCondition,
        `data`: gpointer?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            socket: Socket,
            condition: IoCondition,
            `data`: gpointer?,
        ) -> Boolean
        >().get().invoke(
        socket!!.run {
            Socket(reinterpret())
        },
        condition.run {
            IoCondition(this)
        },
        `data`
    ).asGBoolean()
}
    .reinterpret()

public val TaskThreadFuncFunc: CPointer<
    CFunction<
        (
            CPointer<GTask>,
            CPointer<GObject>,
            gpointer?,
            CPointer<GCancellable>?,
        ) -> Unit
        >
    > = staticCFunction {
        task: CPointer<GTask>?,
        sourceObject: CPointer<GObject>?,
        taskData: gpointer?,
        cancellable: CPointer<GCancellable>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            task: Task,
            sourceObject: Object,
            taskData: gpointer?,
            cancellable: Cancellable?,
        ) -> Unit
        >().get().invoke(
        task!!.run {
            Task(reinterpret())
        },
        sourceObject!!.run {
            Object(reinterpret())
        },
        taskData,
        cancellable?.run {
            Cancellable(reinterpret())
        }
    )
}
    .reinterpret()

public val VfsFileLookupFuncFunc:
    CPointer<CFunction<(CPointer<GVfs>, CPointer<ByteVar>) -> CPointer<GFile>>> =
    staticCFunction {
            vfs: CPointer<GVfs>?,
            identifier: CPointer<ByteVar>?,
            userData: gpointer?,
        ->
        userData!!.asStableRef<(vfs: Vfs, identifier: String) -> File>().get().invoke(
            vfs!!.run {
                Vfs(reinterpret())
            },
            identifier?.toKString() ?: error("Expected not null string")
        ).gioFilePointer
    }
        .reinterpret()

/**
 * Type definition for a function that will be called back when an asynchronous
 * operation within GIO has been completed. #GAsyncReadyCallback
 * callbacks from #GTask are guaranteed to be invoked in a later
 * iteration of the
 * [thread-default main context][g-main-context-push-thread-default]
 * where the #GTask was created. All other users of
 * #GAsyncReadyCallback must likewise call it asynchronously in a
 * later iteration of the main context.
 *
 * The asynchronous operation is guaranteed to have held a reference to
 * @source_object from the time when the `*_async()` function was called, until
 * after this callback returns.
 *
 * - param `sourceObject` the object the asynchronous operation was started with.
 * - param `res` a #GAsyncResult.
 * - param `data` user data passed to the callback.
 */
public typealias AsyncReadyCallback = (
    sourceObject: Object?,
    res: AsyncResult,
    `data`: gpointer?,
) -> Unit

/**
 * Invoked when a connection to a message bus has been obtained.
 *
 * - param `connection` The #GDBusConnection to a message bus.
 * - param `name` The name that is requested to be owned.
 */
public typealias BusAcquiredCallback = (connection: DBusConnection, name: String) -> Unit

/**
 * Invoked when the name is acquired.
 *
 * - param `connection` The #GDBusConnection on which to acquired the name.
 * - param `name` The name being owned.
 */
public typealias BusNameAcquiredCallback = (connection: DBusConnection, name: String) -> Unit

/**
 * Invoked when the name being watched is known to have to have an owner.
 *
 * - param `connection` The #GDBusConnection the name is being watched on.
 * - param `name` The name being watched.
 * - param `nameOwner` Unique name of the owner of the name being watched.
 */
public typealias BusNameAppearedCallback = (
    connection: DBusConnection,
    name: String,
    nameOwner: String,
) -> Unit

/**
 * Invoked when the name is lost or @connection has been closed.
 *
 * - param `connection` The #GDBusConnection on which to acquire the name or null if
 * the connection was disconnected.
 * - param `name` The name being owned.
 */
public typealias BusNameLostCallback = (connection: DBusConnection, name: String) -> Unit

/**
 * Invoked when the name being watched is known not to have to have an owner.
 *
 * This is also invoked when the #GDBusConnection on which the watch was
 * established has been closed.  In that case, @connection will be
 * null.
 *
 * - param `connection` The #GDBusConnection the name is being watched on, or
 *     null.
 * - param `name` The name being watched.
 */
public typealias BusNameVanishedCallback = (connection: DBusConnection, name: String) -> Unit

/**
 * This is the function type of the callback used for the #GSource
 * returned by g_cancellable_source_new().
 *
 * - param `cancellable` the #GCancellable
 * - param `data` data passed in by the user.
 * - return it should return false if the source should be removed.
 */
public typealias CancellableSourceFunc = (cancellable: Cancellable?, `data`: gpointer?) -> Boolean

/**
 * The type of the @get_property function in #GDBusInterfaceVTable.
 *
 * - param `connection` A #GDBusConnection.
 * - param `sender` The unique bus name of the remote caller.
 * - param `objectPath` The object path that the method was invoked on.
 * - param `interfaceName` The D-Bus interface name for the property.
 * - param `propertyName` The name of the property to get the value of.
 * - param `error` Return location for error.
 * - return A #GVariant with the value for @property_name or null if
 *     @error is set. If the returned #GVariant is floating, it is
 *     consumed - otherwise its reference count is decreased by one.
 */
public typealias DBusInterfaceGetPropertyFunc = (
    connection: DBusConnection,
    sender: String,
    objectPath: String,
    interfaceName: String,
    propertyName: String,
    error: Error,
) -> Variant

/**
 * The type of the @method_call function in #GDBusInterfaceVTable.
 *
 * - param `connection` A #GDBusConnection.
 * - param `sender` The unique bus name of the remote caller.
 * - param `objectPath` The object path that the method was invoked on.
 * - param `interfaceName` The D-Bus interface name the method was invoked on.
 * - param `methodName` The name of the method that was invoked.
 * - param `parameters` A #GVariant tuple with parameters.
 * - param `invocation` A #GDBusMethodInvocation object that must be used to return a value or error.
 */
public typealias DBusInterfaceMethodCallFunc = (
    connection: DBusConnection,
    sender: String,
    objectPath: String,
    interfaceName: String,
    methodName: String,
    parameters: Variant,
    invocation: DBusMethodInvocation,
) -> Unit

/**
 * The type of the @set_property function in #GDBusInterfaceVTable.
 *
 * - param `connection` A #GDBusConnection.
 * - param `sender` The unique bus name of the remote caller.
 * - param `objectPath` The object path that the method was invoked on.
 * - param `interfaceName` The D-Bus interface name for the property.
 * - param `propertyName` The name of the property to get the value of.
 * - param `value` The value to set the property to.
 * - param `error` Return location for error.
 * - return true if the property was set to @value, false if @error is set.
 */
public typealias DBusInterfaceSetPropertyFunc = (
    connection: DBusConnection,
    sender: String,
    objectPath: String,
    interfaceName: String,
    propertyName: String,
    `value`: Variant,
    error: Error,
) -> Boolean

/**
 * Signature for function used in g_dbus_connection_add_filter().
 *
 * A filter function is passed a #GDBusMessage and expected to return
 * a #GDBusMessage too. Passive filter functions that don't modify the
 * message can simply return the @message object:
 * |[
 * static GDBusMessage *
 * passive_filter (GDBusConnection *connection
 *                 GDBusMessage    *message,
 *                 gboolean         incoming,
 *                 gpointer         user_data)
 * {
 *   // inspect @message
 *   return message;
 * }
 * ]|
 * Filter functions that wants to drop a message can simply return null:
 * |[
 * static GDBusMessage *
 * drop_filter (GDBusConnection *connection
 *              GDBusMessage    *message,
 *              gboolean         incoming,
 *              gpointer         user_data)
 * {
 *   if (should_drop_message)
 *     {
 *       g_object_unref (message);
 *       message = NULL;
 *     }
 *   return message;
 * }
 * ]|
 * Finally, a filter function may modify a message by copying it:
 * |[
 * static GDBusMessage *
 * modifying_filter (GDBusConnection *connection
 *                   GDBusMessage    *message,
 *                   gboolean         incoming,
 *                   gpointer         user_data)
 * {
 *   GDBusMessage *copy;
 *   GError *error;
 *
 *   error = NULL;
 *   copy = g_dbus_message_copy (message, &error);
 *   // handle @error being set
 *   g_object_unref (message);
 *
 *   // modify @copy
 *
 *   return copy;
 * }
 * ]|
 * If the returned #GDBusMessage is different from @message and cannot
 * be sent on @connection (it could use features, such as file
 * descriptors, not compatible with @connection), then a warning is
 * logged to standard error. Applications can
 * check this ahead of time using g_dbus_message_to_blob() passing a
 * #GDBusCapabilityFlags value obtained from @connection.
 *
 * - param `connection` A #GDBusConnection.
 * - param `message` A locked #GDBusMessage that the filter function takes ownership of.
 * - param `incoming` true if it is a message received from the other peer, false if it is
 * a message to be sent to the other peer.
 * - return A #GDBusMessage that will be freed with
 * g_object_unref() or null to drop the message. Passive filter
 * functions can simply return the passed @message object.
 */
public typealias DBusMessageFilterFunction = (
    connection: DBusConnection,
    message: DBusMessage,
    incoming: Boolean,
) -> DBusMessage?

/**
 * Function signature for a function used to determine the #GType to
 * use for an interface proxy (if @interface_name is not null) or
 * object proxy (if @interface_name is null).
 *
 * This function is called in the
 * [thread-default main loop][g-main-context-push-thread-default]
 * that @manager was constructed in.
 *
 * - param `manager` A #GDBusObjectManagerClient.
 * - param `objectPath` The object path of the remote object.
 * - param `interfaceName` The interface name of the remote object or null if a #GDBusObjectProxy #GType is requested.
 * - param `data` data passed in by the user.
 * - return A #GType to use for the remote object. The returned type
 *   must be a #GDBusProxy or #GDBusObjectProxy -derived
 *   type.
 */
public typealias DBusProxyTypeFunc = (
    manager: DBusObjectManagerClient,
    objectPath: String,
    interfaceName: String?,
    `data`: gpointer?,
) -> GType

/**
 * Signature for callback function used in g_dbus_connection_signal_subscribe().
 *
 * - param `connection` A #GDBusConnection.
 * - param `senderName` The unique bus name of the sender of the signal,
 *    or null on a peer-to-peer D-Bus connection.
 * - param `objectPath` The object path that the signal was emitted on.
 * - param `interfaceName` The name of the interface.
 * - param `signalName` The name of the signal.
 * - param `parameters` A #GVariant tuple with parameters for the signal.
 */
public typealias DBusSignalCallback = (
    connection: DBusConnection,
    senderName: String?,
    objectPath: String,
    interfaceName: String,
    signalName: String,
    parameters: Variant,
) -> Unit

/**
 * The type of the @dispatch function in #GDBusSubtreeVTable.
 *
 * Subtrees are flat.  @node, if non-null, is always exactly one
 * segment of the object path (ie: it never contains a slash).
 *
 * - param `connection` A #GDBusConnection.
 * - param `sender` The unique bus name of the remote caller.
 * - param `objectPath` The object path that was registered with g_dbus_connection_register_subtree().
 * - param `interfaceName` The D-Bus interface name that the method call or property access is for.
 * - param `node` A node that is a child of @object_path (relative to @object_path) or null for the root of the subtree.
 * - return A #GDBusInterfaceVTable or null if you don't want to handle the methods.
 */
public typealias DBusSubtreeDispatchFunc = (
    connection: DBusConnection,
    sender: String,
    objectPath: String,
    interfaceName: String,
    node: String,
) -> DBusInterfaceVTable?

/**
 * The type of the @enumerate function in #GDBusSubtreeVTable.
 *
 * This function is called when generating introspection data and also
 * when preparing to dispatch incoming messages in the event that the
 * %G_DBUS_SUBTREE_FLAGS_DISPATCH_TO_UNENUMERATED_NODES flag is not
 * specified (ie: to verify that the object path is valid).
 *
 * Hierarchies are not supported; the items that you return should not
 * contain the `/` character.
 *
 * The return value will be freed with g_strfreev().
 *
 * - param `connection` A #GDBusConnection.
 * - param `sender` The unique bus name of the remote caller.
 * - param `objectPath` The object path that was registered with g_dbus_connection_register_subtree().
 * - return A newly allocated array of strings for node names that are children of @object_path.
 */
public typealias DBusSubtreeEnumerateFunc = (
    connection: DBusConnection,
    sender: String,
    objectPath: String,
) -> CollectionsList<String>

/**
 * This is the function type of the callback used for the #GSource
 * returned by g_datagram_based_create_source().
 *
 * - param `datagramBased` the #GDatagramBased
 * - param `condition` the current condition at the source fired
 * - param `data` data passed in by the user
 * - return %G_SOURCE_REMOVE if the source should be removed,
 *   %G_SOURCE_CONTINUE otherwise
 */
public typealias DatagramBasedSourceFunc = (
    datagramBased: DatagramBased,
    condition: IoCondition,
    `data`: gpointer?,
) -> Boolean

/**
 * During invocation, g_desktop_app_info_launch_uris_as_manager() may
 * create one or more child processes.  This callback is invoked once
 * for each, providing the process ID.
 *
 * - param `appinfo` a #GDesktopAppInfo
 * - param `pid` Process identifier
 */
public typealias DesktopAppLaunchCallback = (appinfo: DesktopAppInfo, pid: Pid) -> Unit

/**
 * This callback type is used by g_file_measure_disk_usage() to make
 * periodic progress reports when measuring the amount of disk spaced
 * used by a directory.
 *
 * These calls are made on a best-effort basis and not all types of
 * #GFile will support them.  At the minimum, however, one call will
 * always be made immediately.
 *
 * In the case that there is no support, @reporting will be set to
 * false (and the other values undefined) and no further calls will be
 * made.  Otherwise, the @reporting will be true and the other values
 * all-zeros during the first (immediate) call.  In this way, you can
 * know which type of progress UI to show without a delay.
 *
 * For g_file_measure_disk_usage() the callback is made directly.  For
 * g_file_measure_disk_usage_async() the callback is made via the
 * default main context of the calling thread (ie: the same way that the
 * final async result would be reported).
 *
 * @current_size is in the same units as requested by the operation (see
 * %G_FILE_MEASURE_APPARENT_SIZE).
 *
 * The frequency of the updates is implementation defined, but is
 * ideally about once every 200ms.
 *
 * The last progress callback may or may not be equal to the final
 * result.  Always check the async result to get the final value.
 *
 * - param `reporting` true if more reports will come
 * - param `currentSize` the current cumulative size measurement
 * - param `numDirs` the number of directories visited so far
 * - param `numFiles` the number of non-directory files encountered
 * - param `data` the data passed to the original request for this callback
 */
public typealias FileMeasureProgressCallback = (
    reporting: Boolean,
    currentSize: guint64,
    numDirs: guint64,
    numFiles: guint64,
    `data`: gpointer?,
) -> Unit

/**
 * When doing file operations that may take a while, such as moving
 * a file or copying a file, a progress callback is used to pass how
 * far along that operation is to the application.
 *
 * - param `currentNumBytes` the current number of bytes in the operation.
 * - param `totalNumBytes` the total number of bytes in the operation.
 * - param `data` user data passed to the callback.
 */
public typealias FileProgressCallback = (
    currentNumBytes: gint64,
    totalNumBytes: gint64,
    `data`: gpointer?,
) -> Unit

/**
 * When loading the partial contents of a file with g_file_load_partial_contents_async(),
 * it may become necessary to determine if any more data from the file should be loaded.
 * A #GFileReadMoreCallback function facilitates this by returning true if more data
 * should be read, or false otherwise.
 *
 * - param `fileContents` the data as currently read.
 * - param `fileSize` the size of the data currently read.
 * - param `callbackData` data passed to the callback.
 * - return true if more data should be read back. false otherwise.
 */
public typealias FileReadMoreCallback = (
    fileContents: String,
    fileSize: gint64,
    callbackData: gpointer?,
) -> Boolean

/**
 * I/O Job function.
 *
 * Long-running jobs should periodically check the @cancellable
 * to see if they have been cancelled.
 *
 * - param `job` a #GIOSchedulerJob.
 * - param `cancellable` optional #GCancellable object, null to ignore.
 * - param `data` data passed to the callback function
 * - return true if this function should be called again to
 *    complete the job, false if the job is complete (or cancelled)
 */
public typealias IoSchedulerJobFunc = (
    job: IoSchedulerJob,
    cancellable: Cancellable?,
    `data`: gpointer?,
) -> Boolean

/**
 * This is the function type of the callback used for the #GSource
 * returned by g_pollable_input_stream_create_source() and
 * g_pollable_output_stream_create_source().
 *
 * - param `pollableStream` the #GPollableInputStream or #GPollableOutputStream
 * - param `data` data passed in by the user.
 * - return it should return false if the source should be removed.
 */
public typealias PollableSourceFunc = (pollableStream: Object, `data`: gpointer?) -> Boolean

/**
 * Changes the size of the memory block pointed to by @data to
 * @size bytes.
 *
 * The function should have the same semantics as realloc().
 *
 * - param `data` memory block to reallocate
 * - param `size` size to reallocate @data to
 * - return a pointer to the reallocated memory
 */
public typealias ReallocFunc = (`data`: gpointer?, size: gsize) -> gpointer?

/**
 * The type for the function that is used to convert from #GSettings to
 * an object property. The @value is already initialized to hold values
 * of the appropriate type.
 *
 * - param `value` return location for the property value
 * - param `variant` the #GVariant
 * - return true if the conversion succeeded, false in case of an error
 */
public typealias SettingsBindGetMapping = (`value`: Value, variant: Variant) -> Boolean

/**
 * The type for the function that is used to convert an object property
 * value to a #GVariant for storing it in #GSettings.
 *
 * - param `value` a #GValue containing the property value to map
 * - param `expectedType` the #GVariantType to create
 * - return a new #GVariant holding the data from @value,
 *     or null in case of an error
 */
public typealias SettingsBindSetMapping = (`value`: Value, expectedType: VariantType) -> Variant

/**
 * The type of the function that is used to convert from a value stored
 * in a #GSettings to a value that is useful to the application.
 *
 * If the value is successfully mapped, the result should be stored at
 * @result and true returned.  If mapping fails (for example, if @value
 * is not in the right format) then false should be returned.
 *
 * If @value is null then it means that the mapping function is being
 * given a "last chance" to successfully return a valid value.  true
 * must be returned in this case.
 *
 * - param `value` the #GVariant to map, or null
 * - return true if the conversion succeeded, false in case of an error
 */
public typealias SettingsGetMapping = (`value`: Variant) -> Boolean

/**
 * Simple thread function that runs an asynchronous operation and
 * checks for cancellation.
 *
 * - param `res` a #GSimpleAsyncResult.
 * - param `object` a #GObject.
 * - param `cancellable` optional #GCancellable object, null to ignore.
 */
public typealias SimpleAsyncThreadFunc = (
    res: SimpleAsyncResult,
    `object`: Object,
    cancellable: Cancellable?,
) -> Unit

/**
 * This is the function type of the callback used for the #GSource
 * returned by g_socket_create_source().
 *
 * - param `socket` the #GSocket
 * - param `condition` the current condition at the source fired.
 * - param `data` data passed in by the user.
 * - return it should return false if the source should be removed.
 */
public typealias SocketSourceFunc = (
    socket: Socket,
    condition: IoCondition,
    `data`: gpointer?,
) -> Boolean

/**
 * The prototype for a task function to be run in a thread via
 * g_task_run_in_thread() or g_task_run_in_thread_sync().
 *
 * If the return-on-cancel flag is set on @task, and @cancellable gets
 * cancelled, then the #GTask will be completed immediately (as though
 * g_task_return_error_if_cancelled() had been called), without
 * waiting for the task function to complete. However, the task
 * function will continue running in its thread in the background. The
 * function therefore needs to be careful about how it uses
 * externally-visible state in this case. See
 * g_task_set_return_on_cancel() for more details.
 *
 * Other than in that case, @task will be completed when the
 * #GTaskThreadFunc returns, not when it calls a
 * `g_task_return_` function.
 *
 * - param `task` the #GTask
 * - param `sourceObject` @task's source object
 * - param `taskData` @task's task data
 * - param `cancellable` @task's #GCancellable, or null
 */
public typealias TaskThreadFunc = (
    task: Task,
    sourceObject: Object,
    taskData: gpointer?,
    cancellable: Cancellable?,
) -> Unit

/**
 * This function type is used by g_vfs_register_uri_scheme() to make it
 * possible for a client to associate an URI scheme to a different #GFile
 * implementation.
 *
 * The client should return a reference to the new file that has been
 * created for @uri, or null to continue with the default implementation.
 *
 * - param `vfs` a #GVfs
 * - param `identifier` the identifier to look up a #GFile for. This can either
 *     be an URI or a parse name as returned by g_file_get_parse_name()
 * - return a #GFile for @identifier.
 */
public typealias VfsFileLookupFunc = (vfs: Vfs, identifier: String) -> File

// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.KGType
import org.gtkkn.extensions.gobject.TypeProvider
import kotlin.collections.Map
import kotlin.reflect.KClass

public object GioTypeProvider : TypeProvider {
    override val typeMap: Map<KClass<*>, KGType<*>> = buildMap {
        if (getTypeOrNull("g_app_info_monitor_get_type") != null) put(AppInfoMonitor::class, AppInfoMonitor.type)
        if (getTypeOrNull("g_app_launch_context_get_type") != null) put(AppLaunchContext::class, AppLaunchContext.type)
        if (getTypeOrNull("g_application_get_type") != null) put(Application::class, Application.type)
        if (getTypeOrNull("g_application_command_line_get_type") !=
            null
        ) {
            put(ApplicationCommandLine::class, ApplicationCommandLine.type)
        }
        if (getTypeOrNull("g_buffered_input_stream_get_type") !=
            null
        ) {
            put(BufferedInputStream::class, BufferedInputStream.type)
        }
        if (getTypeOrNull("g_buffered_output_stream_get_type") !=
            null
        ) {
            put(BufferedOutputStream::class, BufferedOutputStream.type)
        }
        if (getTypeOrNull("g_bytes_icon_get_type") != null) put(BytesIcon::class, BytesIcon.type)
        if (getTypeOrNull("g_cancellable_get_type") != null) put(Cancellable::class, Cancellable.type)
        if (getTypeOrNull("g_charset_converter_get_type") != null) put(CharsetConverter::class, CharsetConverter.type)
        if (getTypeOrNull("g_converter_input_stream_get_type") !=
            null
        ) {
            put(ConverterInputStream::class, ConverterInputStream.type)
        }
        if (getTypeOrNull("g_converter_output_stream_get_type") !=
            null
        ) {
            put(ConverterOutputStream::class, ConverterOutputStream.type)
        }
        if (getTypeOrNull("g_credentials_get_type") != null) put(Credentials::class, Credentials.type)
        if (getTypeOrNull("g_dbus_action_group_get_type") != null) put(DBusActionGroup::class, DBusActionGroup.type)
        if (getTypeOrNull("g_dbus_auth_observer_get_type") != null) put(DBusAuthObserver::class, DBusAuthObserver.type)
        if (getTypeOrNull("g_dbus_connection_get_type") != null) put(DBusConnection::class, DBusConnection.type)
        if (getTypeOrNull("g_dbus_interface_skeleton_get_type") !=
            null
        ) {
            put(DBusInterfaceSkeleton::class, DBusInterfaceSkeleton.type)
        }
        if (getTypeOrNull("g_dbus_menu_model_get_type") != null) put(DBusMenuModel::class, DBusMenuModel.type)
        if (getTypeOrNull("g_dbus_message_get_type") != null) put(DBusMessage::class, DBusMessage.type)
        if (getTypeOrNull("g_dbus_method_invocation_get_type") !=
            null
        ) {
            put(DBusMethodInvocation::class, DBusMethodInvocation.type)
        }
        if (getTypeOrNull("g_dbus_object_manager_client_get_type") !=
            null
        ) {
            put(DBusObjectManagerClient::class, DBusObjectManagerClient.type)
        }
        if (getTypeOrNull("g_dbus_object_manager_server_get_type") !=
            null
        ) {
            put(DBusObjectManagerServer::class, DBusObjectManagerServer.type)
        }
        if (getTypeOrNull("g_dbus_object_proxy_get_type") != null) put(DBusObjectProxy::class, DBusObjectProxy.type)
        if (getTypeOrNull("g_dbus_object_skeleton_get_type") !=
            null
        ) {
            put(DBusObjectSkeleton::class, DBusObjectSkeleton.type)
        }
        if (getTypeOrNull("g_dbus_proxy_get_type") != null) put(DBusProxy::class, DBusProxy.type)
        if (getTypeOrNull("g_dbus_server_get_type") != null) put(DBusServer::class, DBusServer.type)
        if (getTypeOrNull("g_data_input_stream_get_type") != null) put(DataInputStream::class, DataInputStream.type)
        if (getTypeOrNull("g_data_output_stream_get_type") != null) put(DataOutputStream::class, DataOutputStream.type)
        if (getTypeOrNull("g_debug_controller_dbus_get_type") !=
            null
        ) {
            put(DebugControllerDBus::class, DebugControllerDBus.type)
        }
        if (getTypeOrNull("g_desktop_app_info_get_type") != null) put(DesktopAppInfo::class, DesktopAppInfo.type)
        if (getTypeOrNull("g_emblem_get_type") != null) put(Emblem::class, Emblem.type)
        if (getTypeOrNull("g_emblemed_icon_get_type") != null) put(EmblemedIcon::class, EmblemedIcon.type)
        if (getTypeOrNull("g_file_enumerator_get_type") != null) put(FileEnumerator::class, FileEnumerator.type)
        if (getTypeOrNull("g_file_io_stream_get_type") != null) put(FileIoStream::class, FileIoStream.type)
        if (getTypeOrNull("g_file_icon_get_type") != null) put(FileIcon::class, FileIcon.type)
        if (getTypeOrNull("g_file_info_get_type") != null) put(FileInfo::class, FileInfo.type)
        if (getTypeOrNull("g_file_input_stream_get_type") != null) put(FileInputStream::class, FileInputStream.type)
        if (getTypeOrNull("g_file_monitor_get_type") != null) put(FileMonitor::class, FileMonitor.type)
        if (getTypeOrNull("g_file_output_stream_get_type") != null) put(FileOutputStream::class, FileOutputStream.type)
        if (getTypeOrNull("g_filename_completer_get_type") !=
            null
        ) {
            put(FilenameCompleter::class, FilenameCompleter.type)
        }
        if (getTypeOrNull("g_filter_input_stream_get_type") !=
            null
        ) {
            put(FilterInputStream::class, FilterInputStream.type)
        }
        if (getTypeOrNull("g_filter_output_stream_get_type") !=
            null
        ) {
            put(FilterOutputStream::class, FilterOutputStream.type)
        }
        if (getTypeOrNull("g_io_module_get_type") != null) put(IoModule::class, IoModule.type)
        if (getTypeOrNull("g_io_stream_get_type") != null) put(IoStream::class, IoStream.type)
        if (getTypeOrNull("g_inet_address_get_type") != null) put(InetAddress::class, InetAddress.type)
        if (getTypeOrNull("g_inet_address_mask_get_type") != null) put(InetAddressMask::class, InetAddressMask.type)
        if (getTypeOrNull("g_inet_socket_address_get_type") !=
            null
        ) {
            put(InetSocketAddress::class, InetSocketAddress.type)
        }
        if (getTypeOrNull("g_input_stream_get_type") != null) put(InputStream::class, InputStream.type)
        if (getTypeOrNull("g_list_store_get_type") != null) put(ListStore::class, ListStore.type)
        if (getTypeOrNull("g_memory_input_stream_get_type") !=
            null
        ) {
            put(MemoryInputStream::class, MemoryInputStream.type)
        }
        if (getTypeOrNull("g_memory_output_stream_get_type") !=
            null
        ) {
            put(MemoryOutputStream::class, MemoryOutputStream.type)
        }
        if (getTypeOrNull("g_menu_get_type") != null) put(Menu::class, Menu.type)
        if (getTypeOrNull("g_menu_attribute_iter_get_type") !=
            null
        ) {
            put(MenuAttributeIter::class, MenuAttributeIter.type)
        }
        if (getTypeOrNull("g_menu_item_get_type") != null) put(MenuItem::class, MenuItem.type)
        if (getTypeOrNull("g_menu_link_iter_get_type") != null) put(MenuLinkIter::class, MenuLinkIter.type)
        if (getTypeOrNull("g_menu_model_get_type") != null) put(MenuModel::class, MenuModel.type)
        if (getTypeOrNull("g_mount_operation_get_type") != null) put(MountOperation::class, MountOperation.type)
        if (getTypeOrNull("g_native_socket_address_get_type") !=
            null
        ) {
            put(NativeSocketAddress::class, NativeSocketAddress.type)
        }
        if (getTypeOrNull("g_native_volume_monitor_get_type") !=
            null
        ) {
            put(NativeVolumeMonitor::class, NativeVolumeMonitor.type)
        }
        if (getTypeOrNull("g_network_address_get_type") != null) put(NetworkAddress::class, NetworkAddress.type)
        if (getTypeOrNull("g_network_service_get_type") != null) put(NetworkService::class, NetworkService.type)
        if (getTypeOrNull("g_notification_get_type") != null) put(Notification::class, Notification.type)
        if (getTypeOrNull("g_output_stream_get_type") != null) put(OutputStream::class, OutputStream.type)
        if (getTypeOrNull("g_permission_get_type") != null) put(Permission::class, Permission.type)
        if (getTypeOrNull("g_property_action_get_type") != null) put(PropertyAction::class, PropertyAction.type)
        if (getTypeOrNull("g_proxy_address_get_type") != null) put(ProxyAddress::class, ProxyAddress.type)
        if (getTypeOrNull("g_proxy_address_enumerator_get_type") !=
            null
        ) {
            put(ProxyAddressEnumerator::class, ProxyAddressEnumerator.type)
        }
        if (getTypeOrNull("g_resolver_get_type") != null) put(Resolver::class, Resolver.type)
        if (getTypeOrNull("g_settings_get_type") != null) put(Settings::class, Settings.type)
        if (getTypeOrNull("g_settings_backend_get_type") != null) put(SettingsBackend::class, SettingsBackend.type)
        if (getTypeOrNull("g_simple_action_get_type") != null) put(SimpleAction::class, SimpleAction.type)
        if (getTypeOrNull("g_simple_action_group_get_type") !=
            null
        ) {
            put(SimpleActionGroup::class, SimpleActionGroup.type)
        }
        if (getTypeOrNull("g_simple_async_result_get_type") !=
            null
        ) {
            put(SimpleAsyncResult::class, SimpleAsyncResult.type)
        }
        if (getTypeOrNull("g_simple_io_stream_get_type") != null) put(SimpleIoStream::class, SimpleIoStream.type)
        if (getTypeOrNull("g_simple_permission_get_type") != null) put(SimplePermission::class, SimplePermission.type)
        if (getTypeOrNull("g_simple_proxy_resolver_get_type") !=
            null
        ) {
            put(SimpleProxyResolver::class, SimpleProxyResolver.type)
        }
        if (getTypeOrNull("g_socket_get_type") != null) put(Socket::class, Socket.type)
        if (getTypeOrNull("g_socket_address_get_type") != null) put(SocketAddress::class, SocketAddress.type)
        if (getTypeOrNull("g_socket_address_enumerator_get_type") !=
            null
        ) {
            put(SocketAddressEnumerator::class, SocketAddressEnumerator.type)
        }
        if (getTypeOrNull("g_socket_client_get_type") != null) put(SocketClient::class, SocketClient.type)
        if (getTypeOrNull("g_socket_connection_get_type") != null) put(SocketConnection::class, SocketConnection.type)
        if (getTypeOrNull("g_socket_control_message_get_type") !=
            null
        ) {
            put(SocketControlMessage::class, SocketControlMessage.type)
        }
        if (getTypeOrNull("g_socket_listener_get_type") != null) put(SocketListener::class, SocketListener.type)
        if (getTypeOrNull("g_socket_service_get_type") != null) put(SocketService::class, SocketService.type)
        if (getTypeOrNull("g_subprocess_get_type") != null) put(Subprocess::class, Subprocess.type)
        if (getTypeOrNull("g_subprocess_launcher_get_type") !=
            null
        ) {
            put(SubprocessLauncher::class, SubprocessLauncher.type)
        }
        if (getTypeOrNull("g_task_get_type") != null) put(Task::class, Task.type)
        if (getTypeOrNull("g_tcp_connection_get_type") != null) put(TcpConnection::class, TcpConnection.type)
        if (getTypeOrNull("g_tcp_wrapper_connection_get_type") !=
            null
        ) {
            put(TcpWrapperConnection::class, TcpWrapperConnection.type)
        }
        if (getTypeOrNull("g_test_dbus_get_type") != null) put(TestDBus::class, TestDBus.type)
        if (getTypeOrNull("g_themed_icon_get_type") != null) put(ThemedIcon::class, ThemedIcon.type)
        if (getTypeOrNull("g_threaded_socket_service_get_type") !=
            null
        ) {
            put(ThreadedSocketService::class, ThreadedSocketService.type)
        }
        if (getTypeOrNull("g_tls_certificate_get_type") != null) put(TlsCertificate::class, TlsCertificate.type)
        if (getTypeOrNull("g_tls_connection_get_type") != null) put(TlsConnection::class, TlsConnection.type)
        if (getTypeOrNull("g_tls_database_get_type") != null) put(TlsDatabase::class, TlsDatabase.type)
        if (getTypeOrNull("g_tls_interaction_get_type") != null) put(TlsInteraction::class, TlsInteraction.type)
        if (getTypeOrNull("g_tls_password_get_type") != null) put(TlsPassword::class, TlsPassword.type)
        if (getTypeOrNull("g_unix_connection_get_type") != null) put(UnixConnection::class, UnixConnection.type)
        if (getTypeOrNull("g_unix_credentials_message_get_type") !=
            null
        ) {
            put(UnixCredentialsMessage::class, UnixCredentialsMessage.type)
        }
        if (getTypeOrNull("g_unix_fd_list_get_type") != null) put(UnixFdList::class, UnixFdList.type)
        if (getTypeOrNull("g_unix_fd_message_get_type") != null) put(UnixFdMessage::class, UnixFdMessage.type)
        if (getTypeOrNull("g_unix_input_stream_get_type") != null) put(UnixInputStream::class, UnixInputStream.type)
        if (getTypeOrNull("g_unix_mount_monitor_get_type") != null) put(UnixMountMonitor::class, UnixMountMonitor.type)
        if (getTypeOrNull("g_unix_output_stream_get_type") != null) put(UnixOutputStream::class, UnixOutputStream.type)
        if (getTypeOrNull("g_unix_socket_address_get_type") !=
            null
        ) {
            put(UnixSocketAddress::class, UnixSocketAddress.type)
        }
        if (getTypeOrNull("g_vfs_get_type") != null) put(Vfs::class, Vfs.type)
        if (getTypeOrNull("g_volume_monitor_get_type") != null) put(VolumeMonitor::class, VolumeMonitor.type)
        if (getTypeOrNull("g_zlib_compressor_get_type") != null) put(ZlibCompressor::class, ZlibCompressor.type)
        if (getTypeOrNull("g_zlib_decompressor_get_type") != null) put(ZlibDecompressor::class, ZlibDecompressor.type)
        if (getTypeOrNull("g_action_get_type") != null) put(Action::class, Action.type)
        if (getTypeOrNull("g_action_group_get_type") != null) put(ActionGroup::class, ActionGroup.type)
        if (getTypeOrNull("g_action_map_get_type") != null) put(ActionMap::class, ActionMap.type)
        if (getTypeOrNull("g_app_info_get_type") != null) put(AppInfo::class, AppInfo.type)
        if (getTypeOrNull("g_async_initable_get_type") != null) put(AsyncInitable::class, AsyncInitable.type)
        if (getTypeOrNull("g_async_result_get_type") != null) put(AsyncResult::class, AsyncResult.type)
        if (getTypeOrNull("g_converter_get_type") != null) put(Converter::class, Converter.type)
        if (getTypeOrNull("g_dbus_interface_get_type") != null) put(DBusInterface::class, DBusInterface.type)
        if (getTypeOrNull("g_dbus_object_get_type") != null) put(DBusObject::class, DBusObject.type)
        if (getTypeOrNull("g_dbus_object_manager_get_type") !=
            null
        ) {
            put(DBusObjectManager::class, DBusObjectManager.type)
        }
        if (getTypeOrNull("g_datagram_based_get_type") != null) put(DatagramBased::class, DatagramBased.type)
        if (getTypeOrNull("g_debug_controller_get_type") != null) put(DebugController::class, DebugController.type)
        if (getTypeOrNull("g_desktop_app_info_lookup_get_type") !=
            null
        ) {
            put(DesktopAppInfoLookup::class, DesktopAppInfoLookup.type)
        }
        if (getTypeOrNull("g_drive_get_type") != null) put(Drive::class, Drive.type)
        if (getTypeOrNull("g_dtls_client_connection_get_type") !=
            null
        ) {
            put(DtlsClientConnection::class, DtlsClientConnection.type)
        }
        if (getTypeOrNull("g_dtls_connection_get_type") != null) put(DtlsConnection::class, DtlsConnection.type)
        if (getTypeOrNull("g_dtls_server_connection_get_type") !=
            null
        ) {
            put(DtlsServerConnection::class, DtlsServerConnection.type)
        }
        if (getTypeOrNull("g_file_get_type") != null) put(File::class, File.type)
        if (getTypeOrNull("g_file_descriptor_based_get_type") !=
            null
        ) {
            put(FileDescriptorBased::class, FileDescriptorBased.type)
        }
        if (getTypeOrNull("g_icon_get_type") != null) put(Icon::class, Icon.type)
        if (getTypeOrNull("g_initable_get_type") != null) put(Initable::class, Initable.type)
        if (getTypeOrNull("g_list_model_get_type") != null) put(ListModel::class, ListModel.type)
        if (getTypeOrNull("g_loadable_icon_get_type") != null) put(LoadableIcon::class, LoadableIcon.type)
        if (getTypeOrNull("g_memory_monitor_get_type") != null) put(MemoryMonitor::class, MemoryMonitor.type)
        if (getTypeOrNull("g_mount_get_type") != null) put(Mount::class, Mount.type)
        if (getTypeOrNull("g_network_monitor_get_type") != null) put(NetworkMonitor::class, NetworkMonitor.type)
        if (getTypeOrNull("g_pollable_input_stream_get_type") !=
            null
        ) {
            put(PollableInputStream::class, PollableInputStream.type)
        }
        if (getTypeOrNull("g_pollable_output_stream_get_type") !=
            null
        ) {
            put(PollableOutputStream::class, PollableOutputStream.type)
        }
        if (getTypeOrNull("g_power_profile_monitor_get_type") !=
            null
        ) {
            put(PowerProfileMonitor::class, PowerProfileMonitor.type)
        }
        if (getTypeOrNull("g_proxy_get_type") != null) put(Proxy::class, Proxy.type)
        if (getTypeOrNull("g_proxy_resolver_get_type") != null) put(ProxyResolver::class, ProxyResolver.type)
        if (getTypeOrNull("g_remote_action_group_get_type") !=
            null
        ) {
            put(RemoteActionGroup::class, RemoteActionGroup.type)
        }
        if (getTypeOrNull("g_seekable_get_type") != null) put(Seekable::class, Seekable.type)
        if (getTypeOrNull("g_socket_connectable_get_type") !=
            null
        ) {
            put(SocketConnectable::class, SocketConnectable.type)
        }
        if (getTypeOrNull("g_tls_backend_get_type") != null) put(TlsBackend::class, TlsBackend.type)
        if (getTypeOrNull("g_tls_client_connection_get_type") !=
            null
        ) {
            put(TlsClientConnection::class, TlsClientConnection.type)
        }
        if (getTypeOrNull("g_tls_file_database_get_type") != null) put(TlsFileDatabase::class, TlsFileDatabase.type)
        if (getTypeOrNull("g_tls_server_connection_get_type") !=
            null
        ) {
            put(TlsServerConnection::class, TlsServerConnection.type)
        }
        if (getTypeOrNull("g_volume_get_type") != null) put(Volume::class, Volume.type)
    }
}

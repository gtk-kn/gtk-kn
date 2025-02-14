// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import org.gtkkn.extensions.gobject.legacy.KGType
import org.gtkkn.extensions.gobject.legacy.TypeProvider
import kotlin.collections.Map
import kotlin.reflect.KClass

public object GioTypeProvider : TypeProvider {
    override val typeMap: Map<KClass<*>, KGType<*>> = buildMap {
        if (AppInfoMonitor.getTypeOrNull() != null) put(AppInfoMonitor::class, AppInfoMonitor.type)
        if (AppLaunchContext.getTypeOrNull() != null) put(AppLaunchContext::class, AppLaunchContext.type)
        if (Application.getTypeOrNull() != null) put(Application::class, Application.type)
        if (ApplicationCommandLine.getTypeOrNull() !=
            null
        ) {
            put(ApplicationCommandLine::class, ApplicationCommandLine.type)
        }
        if (BufferedInputStream.getTypeOrNull() != null) put(BufferedInputStream::class, BufferedInputStream.type)
        if (BufferedOutputStream.getTypeOrNull() != null) put(BufferedOutputStream::class, BufferedOutputStream.type)
        if (BytesIcon.getTypeOrNull() != null) put(BytesIcon::class, BytesIcon.type)
        if (Cancellable.getTypeOrNull() != null) put(Cancellable::class, Cancellable.type)
        if (CharsetConverter.getTypeOrNull() != null) put(CharsetConverter::class, CharsetConverter.type)
        if (ConverterInputStream.getTypeOrNull() != null) put(ConverterInputStream::class, ConverterInputStream.type)
        if (ConverterOutputStream.getTypeOrNull() != null) put(ConverterOutputStream::class, ConverterOutputStream.type)
        if (Credentials.getTypeOrNull() != null) put(Credentials::class, Credentials.type)
        if (DBusActionGroup.getTypeOrNull() != null) put(DBusActionGroup::class, DBusActionGroup.type)
        if (DBusAuthObserver.getTypeOrNull() != null) put(DBusAuthObserver::class, DBusAuthObserver.type)
        if (DBusConnection.getTypeOrNull() != null) put(DBusConnection::class, DBusConnection.type)
        if (DBusInterfaceSkeleton.getTypeOrNull() != null) put(DBusInterfaceSkeleton::class, DBusInterfaceSkeleton.type)
        if (DBusMenuModel.getTypeOrNull() != null) put(DBusMenuModel::class, DBusMenuModel.type)
        if (DBusMessage.getTypeOrNull() != null) put(DBusMessage::class, DBusMessage.type)
        if (DBusMethodInvocation.getTypeOrNull() != null) put(DBusMethodInvocation::class, DBusMethodInvocation.type)
        if (DBusObjectManagerClient.getTypeOrNull() !=
            null
        ) {
            put(DBusObjectManagerClient::class, DBusObjectManagerClient.type)
        }
        if (DBusObjectManagerServer.getTypeOrNull() !=
            null
        ) {
            put(DBusObjectManagerServer::class, DBusObjectManagerServer.type)
        }
        if (DBusObjectProxy.getTypeOrNull() != null) put(DBusObjectProxy::class, DBusObjectProxy.type)
        if (DBusObjectSkeleton.getTypeOrNull() != null) put(DBusObjectSkeleton::class, DBusObjectSkeleton.type)
        if (DBusProxy.getTypeOrNull() != null) put(DBusProxy::class, DBusProxy.type)
        if (DBusServer.getTypeOrNull() != null) put(DBusServer::class, DBusServer.type)
        if (DataInputStream.getTypeOrNull() != null) put(DataInputStream::class, DataInputStream.type)
        if (DataOutputStream.getTypeOrNull() != null) put(DataOutputStream::class, DataOutputStream.type)
        if (DebugControllerDBus.getTypeOrNull() != null) put(DebugControllerDBus::class, DebugControllerDBus.type)
        if (Emblem.getTypeOrNull() != null) put(Emblem::class, Emblem.type)
        if (EmblemedIcon.getTypeOrNull() != null) put(EmblemedIcon::class, EmblemedIcon.type)
        if (FileEnumerator.getTypeOrNull() != null) put(FileEnumerator::class, FileEnumerator.type)
        if (FileIoStream.getTypeOrNull() != null) put(FileIoStream::class, FileIoStream.type)
        if (FileIcon.getTypeOrNull() != null) put(FileIcon::class, FileIcon.type)
        if (FileInfo.getTypeOrNull() != null) put(FileInfo::class, FileInfo.type)
        if (FileInputStream.getTypeOrNull() != null) put(FileInputStream::class, FileInputStream.type)
        if (FileMonitor.getTypeOrNull() != null) put(FileMonitor::class, FileMonitor.type)
        if (FileOutputStream.getTypeOrNull() != null) put(FileOutputStream::class, FileOutputStream.type)
        if (FilenameCompleter.getTypeOrNull() != null) put(FilenameCompleter::class, FilenameCompleter.type)
        if (FilterInputStream.getTypeOrNull() != null) put(FilterInputStream::class, FilterInputStream.type)
        if (FilterOutputStream.getTypeOrNull() != null) put(FilterOutputStream::class, FilterOutputStream.type)
        if (IoModule.getTypeOrNull() != null) put(IoModule::class, IoModule.type)
        if (IoStream.getTypeOrNull() != null) put(IoStream::class, IoStream.type)
        if (InetAddress.getTypeOrNull() != null) put(InetAddress::class, InetAddress.type)
        if (InetAddressMask.getTypeOrNull() != null) put(InetAddressMask::class, InetAddressMask.type)
        if (InetSocketAddress.getTypeOrNull() != null) put(InetSocketAddress::class, InetSocketAddress.type)
        if (InputStream.getTypeOrNull() != null) put(InputStream::class, InputStream.type)
        if (ListStore.getTypeOrNull() != null) put(ListStore::class, ListStore.type)
        if (MemoryInputStream.getTypeOrNull() != null) put(MemoryInputStream::class, MemoryInputStream.type)
        if (MemoryOutputStream.getTypeOrNull() != null) put(MemoryOutputStream::class, MemoryOutputStream.type)
        if (Menu.getTypeOrNull() != null) put(Menu::class, Menu.type)
        if (MenuAttributeIter.getTypeOrNull() != null) put(MenuAttributeIter::class, MenuAttributeIter.type)
        if (MenuItem.getTypeOrNull() != null) put(MenuItem::class, MenuItem.type)
        if (MenuLinkIter.getTypeOrNull() != null) put(MenuLinkIter::class, MenuLinkIter.type)
        if (MenuModel.getTypeOrNull() != null) put(MenuModel::class, MenuModel.type)
        if (MountOperation.getTypeOrNull() != null) put(MountOperation::class, MountOperation.type)
        if (NativeSocketAddress.getTypeOrNull() != null) put(NativeSocketAddress::class, NativeSocketAddress.type)
        if (NativeVolumeMonitor.getTypeOrNull() != null) put(NativeVolumeMonitor::class, NativeVolumeMonitor.type)
        if (NetworkAddress.getTypeOrNull() != null) put(NetworkAddress::class, NetworkAddress.type)
        if (NetworkService.getTypeOrNull() != null) put(NetworkService::class, NetworkService.type)
        if (Notification.getTypeOrNull() != null) put(Notification::class, Notification.type)
        if (OsxAppInfo.getTypeOrNull() != null) put(OsxAppInfo::class, OsxAppInfo.type)
        if (OutputStream.getTypeOrNull() != null) put(OutputStream::class, OutputStream.type)
        if (Permission.getTypeOrNull() != null) put(Permission::class, Permission.type)
        if (PropertyAction.getTypeOrNull() != null) put(PropertyAction::class, PropertyAction.type)
        if (ProxyAddress.getTypeOrNull() != null) put(ProxyAddress::class, ProxyAddress.type)
        if (ProxyAddressEnumerator.getTypeOrNull() !=
            null
        ) {
            put(ProxyAddressEnumerator::class, ProxyAddressEnumerator.type)
        }
        if (Resolver.getTypeOrNull() != null) put(Resolver::class, Resolver.type)
        if (Settings.getTypeOrNull() != null) put(Settings::class, Settings.type)
        if (SettingsBackend.getTypeOrNull() != null) put(SettingsBackend::class, SettingsBackend.type)
        if (SimpleAction.getTypeOrNull() != null) put(SimpleAction::class, SimpleAction.type)
        if (SimpleActionGroup.getTypeOrNull() != null) put(SimpleActionGroup::class, SimpleActionGroup.type)
        if (SimpleAsyncResult.getTypeOrNull() != null) put(SimpleAsyncResult::class, SimpleAsyncResult.type)
        if (SimpleIoStream.getTypeOrNull() != null) put(SimpleIoStream::class, SimpleIoStream.type)
        if (SimplePermission.getTypeOrNull() != null) put(SimplePermission::class, SimplePermission.type)
        if (SimpleProxyResolver.getTypeOrNull() != null) put(SimpleProxyResolver::class, SimpleProxyResolver.type)
        if (Socket.getTypeOrNull() != null) put(Socket::class, Socket.type)
        if (SocketAddress.getTypeOrNull() != null) put(SocketAddress::class, SocketAddress.type)
        if (SocketAddressEnumerator.getTypeOrNull() !=
            null
        ) {
            put(SocketAddressEnumerator::class, SocketAddressEnumerator.type)
        }
        if (SocketClient.getTypeOrNull() != null) put(SocketClient::class, SocketClient.type)
        if (SocketConnection.getTypeOrNull() != null) put(SocketConnection::class, SocketConnection.type)
        if (SocketControlMessage.getTypeOrNull() != null) put(SocketControlMessage::class, SocketControlMessage.type)
        if (SocketListener.getTypeOrNull() != null) put(SocketListener::class, SocketListener.type)
        if (SocketService.getTypeOrNull() != null) put(SocketService::class, SocketService.type)
        if (Subprocess.getTypeOrNull() != null) put(Subprocess::class, Subprocess.type)
        if (SubprocessLauncher.getTypeOrNull() != null) put(SubprocessLauncher::class, SubprocessLauncher.type)
        if (Task.getTypeOrNull() != null) put(Task::class, Task.type)
        if (TcpConnection.getTypeOrNull() != null) put(TcpConnection::class, TcpConnection.type)
        if (TcpWrapperConnection.getTypeOrNull() != null) put(TcpWrapperConnection::class, TcpWrapperConnection.type)
        if (TestDBus.getTypeOrNull() != null) put(TestDBus::class, TestDBus.type)
        if (ThemedIcon.getTypeOrNull() != null) put(ThemedIcon::class, ThemedIcon.type)
        if (ThreadedSocketService.getTypeOrNull() != null) put(ThreadedSocketService::class, ThreadedSocketService.type)
        if (TlsCertificate.getTypeOrNull() != null) put(TlsCertificate::class, TlsCertificate.type)
        if (TlsConnection.getTypeOrNull() != null) put(TlsConnection::class, TlsConnection.type)
        if (TlsDatabase.getTypeOrNull() != null) put(TlsDatabase::class, TlsDatabase.type)
        if (TlsInteraction.getTypeOrNull() != null) put(TlsInteraction::class, TlsInteraction.type)
        if (TlsPassword.getTypeOrNull() != null) put(TlsPassword::class, TlsPassword.type)
        if (UnixConnection.getTypeOrNull() != null) put(UnixConnection::class, UnixConnection.type)
        if (UnixCredentialsMessage.getTypeOrNull() !=
            null
        ) {
            put(UnixCredentialsMessage::class, UnixCredentialsMessage.type)
        }
        if (UnixFdList.getTypeOrNull() != null) put(UnixFdList::class, UnixFdList.type)
        if (UnixFdMessage.getTypeOrNull() != null) put(UnixFdMessage::class, UnixFdMessage.type)
        if (UnixInputStream.getTypeOrNull() != null) put(UnixInputStream::class, UnixInputStream.type)
        if (UnixMountMonitor.getTypeOrNull() != null) put(UnixMountMonitor::class, UnixMountMonitor.type)
        if (UnixOutputStream.getTypeOrNull() != null) put(UnixOutputStream::class, UnixOutputStream.type)
        if (UnixSocketAddress.getTypeOrNull() != null) put(UnixSocketAddress::class, UnixSocketAddress.type)
        if (Vfs.getTypeOrNull() != null) put(Vfs::class, Vfs.type)
        if (VolumeMonitor.getTypeOrNull() != null) put(VolumeMonitor::class, VolumeMonitor.type)
        if (ZlibCompressor.getTypeOrNull() != null) put(ZlibCompressor::class, ZlibCompressor.type)
        if (ZlibDecompressor.getTypeOrNull() != null) put(ZlibDecompressor::class, ZlibDecompressor.type)
        if (Action.getTypeOrNull() != null) put(Action::class, Action.type)
        if (ActionGroup.getTypeOrNull() != null) put(ActionGroup::class, ActionGroup.type)
        if (ActionMap.getTypeOrNull() != null) put(ActionMap::class, ActionMap.type)
        if (AppInfo.getTypeOrNull() != null) put(AppInfo::class, AppInfo.type)
        if (AsyncInitable.getTypeOrNull() != null) put(AsyncInitable::class, AsyncInitable.type)
        if (AsyncResult.getTypeOrNull() != null) put(AsyncResult::class, AsyncResult.type)
        if (Converter.getTypeOrNull() != null) put(Converter::class, Converter.type)
        if (DBusInterface.getTypeOrNull() != null) put(DBusInterface::class, DBusInterface.type)
        if (DBusObject.getTypeOrNull() != null) put(DBusObject::class, DBusObject.type)
        if (DBusObjectManager.getTypeOrNull() != null) put(DBusObjectManager::class, DBusObjectManager.type)
        if (DatagramBased.getTypeOrNull() != null) put(DatagramBased::class, DatagramBased.type)
        if (DebugController.getTypeOrNull() != null) put(DebugController::class, DebugController.type)
        if (Drive.getTypeOrNull() != null) put(Drive::class, Drive.type)
        if (DtlsClientConnection.getTypeOrNull() != null) put(DtlsClientConnection::class, DtlsClientConnection.type)
        if (DtlsConnection.getTypeOrNull() != null) put(DtlsConnection::class, DtlsConnection.type)
        if (DtlsServerConnection.getTypeOrNull() != null) put(DtlsServerConnection::class, DtlsServerConnection.type)
        if (File.getTypeOrNull() != null) put(File::class, File.type)
        if (FileDescriptorBased.getTypeOrNull() != null) put(FileDescriptorBased::class, FileDescriptorBased.type)
        if (Icon.getTypeOrNull() != null) put(Icon::class, Icon.type)
        if (Initable.getTypeOrNull() != null) put(Initable::class, Initable.type)
        if (ListModel.getTypeOrNull() != null) put(ListModel::class, ListModel.type)
        if (LoadableIcon.getTypeOrNull() != null) put(LoadableIcon::class, LoadableIcon.type)
        if (MemoryMonitor.getTypeOrNull() != null) put(MemoryMonitor::class, MemoryMonitor.type)
        if (Mount.getTypeOrNull() != null) put(Mount::class, Mount.type)
        if (NetworkMonitor.getTypeOrNull() != null) put(NetworkMonitor::class, NetworkMonitor.type)
        if (PollableInputStream.getTypeOrNull() != null) put(PollableInputStream::class, PollableInputStream.type)
        if (PollableOutputStream.getTypeOrNull() != null) put(PollableOutputStream::class, PollableOutputStream.type)
        if (PowerProfileMonitor.getTypeOrNull() != null) put(PowerProfileMonitor::class, PowerProfileMonitor.type)
        if (Proxy.getTypeOrNull() != null) put(Proxy::class, Proxy.type)
        if (ProxyResolver.getTypeOrNull() != null) put(ProxyResolver::class, ProxyResolver.type)
        if (RemoteActionGroup.getTypeOrNull() != null) put(RemoteActionGroup::class, RemoteActionGroup.type)
        if (Seekable.getTypeOrNull() != null) put(Seekable::class, Seekable.type)
        if (SocketConnectable.getTypeOrNull() != null) put(SocketConnectable::class, SocketConnectable.type)
        if (TlsBackend.getTypeOrNull() != null) put(TlsBackend::class, TlsBackend.type)
        if (TlsClientConnection.getTypeOrNull() != null) put(TlsClientConnection::class, TlsClientConnection.type)
        if (TlsFileDatabase.getTypeOrNull() != null) put(TlsFileDatabase::class, TlsFileDatabase.type)
        if (TlsServerConnection.getTypeOrNull() != null) put(TlsServerConnection::class, TlsServerConnection.type)
        if (Volume.getTypeOrNull() != null) put(Volume::class, Volume.type)
    }
}

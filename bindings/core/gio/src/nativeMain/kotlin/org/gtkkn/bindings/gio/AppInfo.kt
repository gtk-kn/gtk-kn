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
import org.gtkkn.bindings.glib.Error
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.common.toKStringList
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GAppInfo
import org.gtkkn.native.gio.g_app_info_add_supports_type
import org.gtkkn.native.gio.g_app_info_can_delete
import org.gtkkn.native.gio.g_app_info_can_remove_supports_type
import org.gtkkn.native.gio.g_app_info_create_from_commandline
import org.gtkkn.native.gio.g_app_info_delete
import org.gtkkn.native.gio.g_app_info_dup
import org.gtkkn.native.gio.g_app_info_equal
import org.gtkkn.native.gio.g_app_info_get_all
import org.gtkkn.native.gio.g_app_info_get_all_for_type
import org.gtkkn.native.gio.g_app_info_get_commandline
import org.gtkkn.native.gio.g_app_info_get_default_for_type
import org.gtkkn.native.gio.g_app_info_get_default_for_type_async
import org.gtkkn.native.gio.g_app_info_get_default_for_type_finish
import org.gtkkn.native.gio.g_app_info_get_default_for_uri_scheme
import org.gtkkn.native.gio.g_app_info_get_default_for_uri_scheme_async
import org.gtkkn.native.gio.g_app_info_get_default_for_uri_scheme_finish
import org.gtkkn.native.gio.g_app_info_get_description
import org.gtkkn.native.gio.g_app_info_get_display_name
import org.gtkkn.native.gio.g_app_info_get_executable
import org.gtkkn.native.gio.g_app_info_get_fallback_for_type
import org.gtkkn.native.gio.g_app_info_get_icon
import org.gtkkn.native.gio.g_app_info_get_id
import org.gtkkn.native.gio.g_app_info_get_name
import org.gtkkn.native.gio.g_app_info_get_recommended_for_type
import org.gtkkn.native.gio.g_app_info_get_supported_types
import org.gtkkn.native.gio.g_app_info_get_type
import org.gtkkn.native.gio.g_app_info_launch
import org.gtkkn.native.gio.g_app_info_launch_default_for_uri
import org.gtkkn.native.gio.g_app_info_launch_default_for_uri_async
import org.gtkkn.native.gio.g_app_info_launch_default_for_uri_finish
import org.gtkkn.native.gio.g_app_info_launch_uris
import org.gtkkn.native.gio.g_app_info_launch_uris_async
import org.gtkkn.native.gio.g_app_info_launch_uris_finish
import org.gtkkn.native.gio.g_app_info_remove_supports_type
import org.gtkkn.native.gio.g_app_info_reset_type_associations
import org.gtkkn.native.gio.g_app_info_set_as_default_for_extension
import org.gtkkn.native.gio.g_app_info_set_as_default_for_type
import org.gtkkn.native.gio.g_app_info_set_as_last_used_for_type
import org.gtkkn.native.gio.g_app_info_should_show
import org.gtkkn.native.gio.g_app_info_supports_files
import org.gtkkn.native.gio.g_app_info_supports_uris
import org.gtkkn.native.glib.GError
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.Unit
import kotlin.collections.List as CollectionsList
import org.gtkkn.bindings.glib.List as GlibList

/**
 * Information about an installed application and methods to launch
 * it (with file arguments).
 *
 * `GAppInfo` and `GAppLaunchContext` are used for describing and launching
 * applications installed on the system.
 *
 * As of GLib 2.20, URIs will always be converted to POSIX paths
 * (using [method@Gio.File.get_path]) when using [method@Gio.AppInfo.launch]
 * even if the application requested an URI and not a POSIX path. For example
 * for a desktop-file based application with Exec key `totem
 * %U` and a single URI, `sftp://foo/file.avi`, then
 * `/home/user/.gvfs/sftp on foo/file.avi` will be passed. This will
 * only work if a set of suitable GIO extensions (such as GVfs 2.26
 * compiled with FUSE support), is available and operational; if this
 * is not the case, the URI will be passed unmodified to the application.
 * Some URIs, such as `mailto:`, of course cannot be mapped to a POSIX
 * path (in GVfs there's no FUSE mount for it); such URIs will be
 * passed unmodified to the application.
 *
 * Specifically for GVfs 2.26 and later, the POSIX URI will be mapped
 * back to the GIO URI in the [iface@Gio.File] constructors (since GVfs
 * implements the GVfs extension point). As such, if the application
 * needs to examine the URI, it needs to use [method@Gio.File.get_uri]
 * or similar on [iface@Gio.File]. In other words, an application cannot
 * assume that the URI passed to e.g. [func@Gio.File.new_for_commandline_arg]
 * is equal to the result of [method@Gio.File.get_uri]. The following snippet
 * illustrates this:
 *
 * ```c
 * GFile *f;
 * char *uri;
 *
 * file = g_file_new_for_commandline_arg (uri_from_commandline);
 *
 * uri = g_file_get_uri (file);
 * strcmp (uri, uri_from_commandline) == 0;
 * g_free (uri);
 *
 * if (g_file_has_uri_scheme (file, "cdda"))
 *   {
 *     // do something special with uri
 *   }
 * g_object_unref (file);
 * ```
 *
 * This code will work when both `cdda://sr0/Track 1.wav` and
 * `/home/user/.gvfs/cdda on sr0/Track 1.wav` is passed to the
 * application. It should be noted that it's generally not safe
 * for applications to rely on the format of a particular URIs.
 * Different launcher applications (e.g. file managers) may have
 * different ideas of what a given URI means.
 */
public interface AppInfo : Interface, KGTyped {
    public val gioAppInfoPointer: CPointer<GAppInfo>

    /**
     * Adds a content type to the application information to indicate the
     * application is capable of opening files with the given content type.
     *
     * @param contentType a string.
     * @return true on success, false on error.
     */
    public fun addSupportsType(contentType: String): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_app_info_add_supports_type(
                    gioAppInfoPointer.reinterpret(),
                    contentType,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Obtains the information whether the #GAppInfo can be deleted.
     * See g_app_info_delete().
     *
     * @return true if @appinfo can be deleted
     * @since 2.20
     */
    public fun canDelete(): Boolean = g_app_info_can_delete(gioAppInfoPointer.reinterpret()).asBoolean()

    /**
     * Checks if a supported content type can be removed from an application.
     *
     * @return true if it is possible to remove supported
     *     content types from a given @appinfo, false if not.
     */
    public fun canRemoveSupportsType(): Boolean =
        g_app_info_can_remove_supports_type(gioAppInfoPointer.reinterpret()).asBoolean()

    /**
     * Tries to delete a #GAppInfo.
     *
     * On some platforms, there may be a difference between user-defined
     * #GAppInfos which can be deleted, and system-wide ones which cannot.
     * See g_app_info_can_delete().
     *
     * @return true if @appinfo has been deleted
     * @since 2.20
     */
    public fun delete(): Boolean = g_app_info_delete(gioAppInfoPointer.reinterpret()).asBoolean()

    /**
     * Creates a duplicate of a #GAppInfo.
     *
     * @return a duplicate of @appinfo.
     */
    public fun dup(): AppInfo =
        g_app_info_dup(gioAppInfoPointer.reinterpret())!!.run {
            AppInfo.wrap(reinterpret())
        }

    /**
     * Checks if two #GAppInfos are equal.
     *
     * Note that the check *may not* compare each individual
     * field, and only does an identity check. In case detecting changes in the
     * contents is needed, program code must additionally compare relevant fields.
     *
     * @param appinfo2 the second #GAppInfo.
     * @return true if @appinfo1 is equal to @appinfo2. false otherwise.
     */
    public fun equal(appinfo2: AppInfo): Boolean =
        g_app_info_equal(
            gioAppInfoPointer.reinterpret(),
            appinfo2.gioAppInfoPointer
        ).asBoolean()

    /**
     * Gets the commandline with which the application will be
     * started.
     *
     * @return a string containing the @appinfo's commandline,
     *     or null if this information is not available
     * @since 2.20
     */
    public fun getCommandline(): String? = g_app_info_get_commandline(gioAppInfoPointer.reinterpret())?.toKString()

    /**
     * Gets a human-readable description of an installed application.
     *
     * @return a string containing a description of the
     * application @appinfo, or null if none.
     */
    public fun getDescription(): String? = g_app_info_get_description(gioAppInfoPointer.reinterpret())?.toKString()

    /**
     * Gets the display name of the application. The display name is often more
     * descriptive to the user than the name itself.
     *
     * @return the display name of the application for @appinfo, or the name if
     * no display name is available.
     * @since 2.24
     */
    public fun getDisplayName(): String =
        g_app_info_get_display_name(gioAppInfoPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the executable's name for the installed application.
     *
     * This is intended to be used for debugging or labelling what program is going
     * to be run. To launch the executable, use g_app_info_launch() and related
     * functions, rather than spawning the return value from this function.
     *
     * @return a string containing the @appinfo's application
     * binaries name
     */
    public fun getExecutable(): String =
        g_app_info_get_executable(gioAppInfoPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the icon for the application.
     *
     * @return the default #GIcon for @appinfo or null
     * if there is no default icon.
     */
    public fun getIcon(): Icon? =
        g_app_info_get_icon(gioAppInfoPointer.reinterpret())?.run {
            Icon.wrap(reinterpret())
        }

    /**
     * Gets the ID of an application. An id is a string that
     * identifies the application. The exact format of the id is
     * platform dependent. For instance, on Unix this is the
     * desktop file id from the xdg menu specification.
     *
     * Note that the returned ID may be null, depending on how
     * the @appinfo has been constructed.
     *
     * @return a string containing the application's ID.
     */
    public fun getId(): String? = g_app_info_get_id(gioAppInfoPointer.reinterpret())?.toKString()

    /**
     * Gets the installed name of the application.
     *
     * @return the name of the application for @appinfo.
     */
    public fun getName(): String =
        g_app_info_get_name(gioAppInfoPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Retrieves the list of content types that @app_info claims to support.
     * If this information is not provided by the environment, this function
     * will return null.
     * This function does not take in consideration associations added with
     * g_app_info_add_supports_type(), but only those exported directly by
     * the application.
     *
     * @return
     *    a list of content types.
     * @since 2.34
     */
    public fun getSupportedTypes(): CollectionsList<String> =
        g_app_info_get_supported_types(gioAppInfoPointer.reinterpret())?.toKStringList()
            ?: error("Expected not null string array")

    /**
     * Launches the application. Passes @files to the launched application
     * as arguments, using the optional @context to get information
     * about the details of the launcher (like what screen it is on).
     * On error, @error will be set accordingly.
     *
     * To launch the application without arguments pass a null @files list.
     *
     * Note that even if the launch is successful the application launched
     * can fail to start if it runs into problems during startup. There is
     * no way to detect this.
     *
     * Some URIs can be changed when passed through a GFile (for instance
     * unsupported URIs with strange formats like mailto:), so if you have
     * a textual URI you want to pass in as argument, consider using
     * g_app_info_launch_uris() instead.
     *
     * The launched application inherits the environment of the launching
     * process, but it can be modified with g_app_launch_context_setenv()
     * and g_app_launch_context_unsetenv().
     *
     * On UNIX, this function sets the `GIO_LAUNCHED_DESKTOP_FILE`
     * environment variable with the path of the launched desktop file and
     * `GIO_LAUNCHED_DESKTOP_FILE_PID` to the process id of the launched
     * process. This can be used to ignore `GIO_LAUNCHED_DESKTOP_FILE`,
     * should it be inherited by further processes. The `DISPLAY`,
     * `XDG_ACTIVATION_TOKEN` and `DESKTOP_STARTUP_ID` environment
     * variables are also set, based on information provided in @context.
     *
     * @param files a #GList of #GFile objects
     * @param context a #GAppLaunchContext or null
     * @return true on successful launch, false otherwise.
     */
    public fun launch(
        files: GlibList? = null,
        context: AppLaunchContext? = null,
    ): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_app_info_launch(
                    gioAppInfoPointer.reinterpret(),
                    files?.glibListPointer,
                    context?.gioAppLaunchContextPointer?.reinterpret(),
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Launches the application. This passes the @uris to the launched application
     * as arguments, using the optional @context to get information
     * about the details of the launcher (like what screen it is on).
     * On error, @error will be set accordingly. If the application only supports
     * one URI per invocation as part of their command-line, multiple instances
     * of the application will be spawned.
     *
     * To launch the application without arguments pass a null @uris list.
     *
     * Note that even if the launch is successful the application launched
     * can fail to start if it runs into problems during startup. There is
     * no way to detect this.
     *
     * @param uris a #GList containing URIs to launch.
     * @param context a #GAppLaunchContext or null
     * @return true on successful launch, false otherwise.
     */
    public fun launchUris(
        uris: GlibList? = null,
        context: AppLaunchContext? = null,
    ): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_app_info_launch_uris(
                    gioAppInfoPointer.reinterpret(),
                    uris?.glibListPointer,
                    context?.gioAppLaunchContextPointer?.reinterpret(),
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Async version of g_app_info_launch_uris().
     *
     * The @callback is invoked immediately after the application launch, but it
     * waits for activation in case of D-Bus–activated applications and also provides
     * extended error information for sandboxed applications, see notes for
     * g_app_info_launch_default_for_uri_async().
     *
     * @param uris a #GList containing URIs to launch.
     * @param context a #GAppLaunchContext or null
     * @param cancellable a #GCancellable
     * @param callback a #GAsyncReadyCallback to call when the request is done
     * @since 2.60
     */
    public fun launchUrisAsync(
        uris: GlibList? = null,
        context: AppLaunchContext? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        g_app_info_launch_uris_async(
            gioAppInfoPointer.reinterpret(),
            uris?.glibListPointer,
            context?.gioAppLaunchContextPointer?.reinterpret(),
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes a g_app_info_launch_uris_async() operation.
     *
     * @param result a #GAsyncResult
     * @return true on successful launch, false otherwise.
     * @since 2.60
     */
    public fun launchUrisFinish(result: AsyncResult): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_app_info_launch_uris_finish(
                    gioAppInfoPointer.reinterpret(),
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
     * Removes a supported type from an application, if possible.
     *
     * @param contentType a string.
     * @return true on success, false on error.
     */
    public fun removeSupportsType(contentType: String): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_app_info_remove_supports_type(
                    gioAppInfoPointer.reinterpret(),
                    contentType,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Sets the application as the default handler for the given file extension.
     *
     * @param extension a string containing the file extension
     *     (without the dot).
     * @return true on success, false on error.
     */
    public fun setAsDefaultForExtension(extension: String): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_app_info_set_as_default_for_extension(
                    gioAppInfoPointer.reinterpret(),
                    extension,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Sets the application as the default handler for a given type.
     *
     * @param contentType the content type.
     * @return true on success, false on error.
     */
    public fun setAsDefaultForType(contentType: String): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_app_info_set_as_default_for_type(
                    gioAppInfoPointer.reinterpret(),
                    contentType,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Sets the application as the last used application for a given type.
     * This will make the application appear as first in the list returned
     * by g_app_info_get_recommended_for_type(), regardless of the default
     * application for that content type.
     *
     * @param contentType the content type.
     * @return true on success, false on error.
     */
    public fun setAsLastUsedForType(contentType: String): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                g_app_info_set_as_last_used_for_type(
                    gioAppInfoPointer.reinterpret(),
                    contentType,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Checks if the application info should be shown in menus that
     * list available applications.
     *
     * @return true if the @appinfo should be shown, false otherwise.
     */
    public fun shouldShow(): Boolean = g_app_info_should_show(gioAppInfoPointer.reinterpret()).asBoolean()

    /**
     * Checks if the application accepts files as arguments.
     *
     * @return true if the @appinfo supports files.
     */
    public fun supportsFiles(): Boolean = g_app_info_supports_files(gioAppInfoPointer.reinterpret()).asBoolean()

    /**
     * Checks if the application supports reading files and directories from URIs.
     *
     * @return true if the @appinfo supports URIs.
     */
    public fun supportsUris(): Boolean = g_app_info_supports_uris(gioAppInfoPointer.reinterpret()).asBoolean()

    private data class Wrapper(
        private val pointer: CPointer<GAppInfo>,
    ) : AppInfo {
        override val gioAppInfoPointer: CPointer<GAppInfo> = pointer
    }

    public companion object : TypeCompanion<AppInfo> {
        override val type: GeneratedInterfaceKGType<AppInfo> =
            GeneratedInterfaceKGType(g_app_info_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GAppInfo>): AppInfo = Wrapper(pointer)

        /**
         * Creates a new #GAppInfo from the given information.
         *
         * Note that for @commandline, the quoting rules of the Exec key of the
         * [freedesktop.org Desktop Entry
         * Specification](http://freedesktop.org/Standards/desktop-entry-spec)
         * are applied. For example, if the @commandline contains
         * percent-encoded URIs, the percent-character must be doubled in order to prevent it from
         * being swallowed by Exec key unquoting. See the specification for exact quoting rules.
         *
         * @param commandline the commandline to use
         * @param applicationName the application name, or null to use @commandline
         * @param flags flags that can specify details of the created #GAppInfo
         * @return new #GAppInfo for given command.
         */
        public fun createFromCommandline(
            commandline: String,
            applicationName: String? = null,
            flags: AppInfoCreateFlags,
        ): Result<AppInfo> =
            memScoped {
                val gError = allocPointerTo<GError>()
                val gResult =
                    g_app_info_create_from_commandline(
                        commandline,
                        applicationName,
                        flags.mask,
                        gError.ptr
                    )?.run {
                        AppInfo.wrap(reinterpret())
                    }

                return if (gError.pointed != null) {
                    Result.failure(resolveException(Error(gError.pointed!!.ptr)))
                } else {
                    Result.success(checkNotNull(gResult))
                }
            }

        /**
         * Gets a list of all of the applications currently registered
         * on this system.
         *
         * For desktop files, this includes applications that have
         * `NoDisplay=true` set or are excluded from display by means
         * of `OnlyShowIn` or `NotShowIn`. See g_app_info_should_show().
         * The returned list does not include applications which have
         * the `Hidden` key set.
         *
         * @return a newly allocated #GList of references to #GAppInfos.
         */
        public fun getAll(): GlibList =
            g_app_info_get_all()!!.run {
                GlibList(reinterpret())
            }

        /**
         * Gets a list of all #GAppInfos for a given content type,
         * including the recommended and fallback #GAppInfos. See
         * g_app_info_get_recommended_for_type() and
         * g_app_info_get_fallback_for_type().
         *
         * @param contentType the content type to find a #GAppInfo for
         * @return #GList of #GAppInfos
         *     for given @content_type or null on error.
         */
        public fun getAllForType(contentType: String): GlibList =
            g_app_info_get_all_for_type(contentType)!!.run {
                GlibList(reinterpret())
            }

        /**
         * Gets the default #GAppInfo for a given content type.
         *
         * @param contentType the content type to find a #GAppInfo for
         * @param mustSupportUris if true, the #GAppInfo is expected to
         *     support URIs
         * @return #GAppInfo for given @content_type or
         *     null on error.
         */
        public fun getDefaultForType(
            contentType: String,
            mustSupportUris: Boolean,
        ): AppInfo? =
            g_app_info_get_default_for_type(contentType, mustSupportUris.asGBoolean())?.run {
                AppInfo.wrap(reinterpret())
            }

        /**
         * Asynchronously gets the default #GAppInfo for a given content type.
         *
         * @param contentType the content type to find a #GAppInfo for
         * @param mustSupportUris if true, the #GAppInfo is expected to
         *     support URIs
         * @param cancellable optional #GCancellable object, null to ignore
         * @param callback a #GAsyncReadyCallback to call when the request is done
         * @since 2.74
         */
        public fun getDefaultForTypeAsync(
            contentType: String,
            mustSupportUris: Boolean,
            cancellable: Cancellable? = null,
            callback: AsyncReadyCallback,
        ): Unit =
            g_app_info_get_default_for_type_async(
                contentType,
                mustSupportUris.asGBoolean(),
                cancellable?.gioCancellablePointer?.reinterpret(),
                AsyncReadyCallbackFunc.reinterpret(),
                StableRef.create(callback).asCPointer()
            )

        /**
         * Finishes a default #GAppInfo lookup started by
         * g_app_info_get_default_for_type_async().
         *
         * If no #GAppInfo is found, then @error will be set to %G_IO_ERROR_NOT_FOUND.
         *
         * @param result a #GAsyncResult
         * @return #GAppInfo for given @content_type or
         *     null on error.
         * @since 2.74
         */
        public fun getDefaultForTypeFinish(result: AsyncResult): Result<AppInfo> =
            memScoped {
                val gError = allocPointerTo<GError>()
                val gResult =
                    g_app_info_get_default_for_type_finish(
                        result.gioAsyncResultPointer,
                        gError.ptr
                    )?.run {
                        AppInfo.wrap(reinterpret())
                    }

                return if (gError.pointed != null) {
                    Result.failure(resolveException(Error(gError.pointed!!.ptr)))
                } else {
                    Result.success(checkNotNull(gResult))
                }
            }

        /**
         * Gets the default application for handling URIs with
         * the given URI scheme. A URI scheme is the initial part
         * of the URI, up to but not including the ':', e.g. "http",
         * "ftp" or "sip".
         *
         * @param uriScheme a string containing a URI scheme.
         * @return #GAppInfo for given @uri_scheme or
         *     null on error.
         */
        public fun getDefaultForUriScheme(uriScheme: String): AppInfo? =
            g_app_info_get_default_for_uri_scheme(uriScheme)?.run {
                AppInfo.wrap(reinterpret())
            }

        /**
         * Asynchronously gets the default application for handling URIs with
         * the given URI scheme. A URI scheme is the initial part
         * of the URI, up to but not including the ':', e.g. "http",
         * "ftp" or "sip".
         *
         * @param uriScheme a string containing a URI scheme.
         * @param cancellable optional #GCancellable object, null to ignore
         * @param callback a #GAsyncReadyCallback to call when the request is done
         * @since 2.74
         */
        public fun getDefaultForUriSchemeAsync(
            uriScheme: String,
            cancellable: Cancellable? = null,
            callback: AsyncReadyCallback,
        ): Unit =
            g_app_info_get_default_for_uri_scheme_async(
                uriScheme,
                cancellable?.gioCancellablePointer?.reinterpret(),
                AsyncReadyCallbackFunc.reinterpret(),
                StableRef.create(callback).asCPointer()
            )

        /**
         * Finishes a default #GAppInfo lookup started by
         * g_app_info_get_default_for_uri_scheme_async().
         *
         * If no #GAppInfo is found, then @error will be set to %G_IO_ERROR_NOT_FOUND.
         *
         * @param result a #GAsyncResult
         * @return #GAppInfo for given @uri_scheme or
         *     null on error.
         * @since 2.74
         */
        public fun getDefaultForUriSchemeFinish(result: AsyncResult): Result<AppInfo> =
            memScoped {
                val gError = allocPointerTo<GError>()
                val gResult =
                    g_app_info_get_default_for_uri_scheme_finish(
                        result.gioAsyncResultPointer,
                        gError.ptr
                    )?.run {
                        AppInfo.wrap(reinterpret())
                    }

                return if (gError.pointed != null) {
                    Result.failure(resolveException(Error(gError.pointed!!.ptr)))
                } else {
                    Result.success(checkNotNull(gResult))
                }
            }

        /**
         * Gets a list of fallback #GAppInfos for a given content type, i.e.
         * those applications which claim to support the given content type
         * by MIME type subclassing and not directly.
         *
         * @param contentType the content type to find a #GAppInfo for
         * @return #GList of #GAppInfos
         *     for given @content_type or null on error.
         * @since 2.28
         */
        public fun getFallbackForType(contentType: String): GlibList =
            g_app_info_get_fallback_for_type(contentType)!!.run {
                GlibList(reinterpret())
            }

        /**
         * Gets a list of recommended #GAppInfos for a given content type, i.e.
         * those applications which claim to support the given content type exactly,
         * and not by MIME type subclassing.
         * Note that the first application of the list is the last used one, i.e.
         * the last one for which g_app_info_set_as_last_used_for_type() has been
         * called.
         *
         * @param contentType the content type to find a #GAppInfo for
         * @return #GList of #GAppInfos
         *     for given @content_type or null on error.
         * @since 2.28
         */
        public fun getRecommendedForType(contentType: String): GlibList =
            g_app_info_get_recommended_for_type(contentType)!!.run {
                GlibList(reinterpret())
            }

        /**
         * Utility function that launches the default application
         * registered to handle the specified uri. Synchronous I/O
         * is done on the uri to detect the type of the file if
         * required.
         *
         * The D-Bus–activated applications don't have to be started if your application
         * terminates too soon after this function. To prevent this, use
         * g_app_info_launch_default_for_uri_async() instead.
         *
         * @param uri the uri to show
         * @param context an optional #GAppLaunchContext
         * @return true on success, false on error.
         */
        public fun launchDefaultForUri(
            uri: String,
            context: AppLaunchContext? = null,
        ): Result<Boolean> =
            memScoped {
                val gError = allocPointerTo<GError>()
                val gResult =
                    g_app_info_launch_default_for_uri(
                        uri,
                        context?.gioAppLaunchContextPointer?.reinterpret(),
                        gError.ptr
                    ).asBoolean()
                return if (gError.pointed != null) {
                    Result.failure(resolveException(Error(gError.pointed!!.ptr)))
                } else {
                    Result.success(gResult)
                }
            }

        /**
         * Async version of g_app_info_launch_default_for_uri().
         *
         * This version is useful if you are interested in receiving
         * error information in the case where the application is
         * sandboxed and the portal may present an application chooser
         * dialog to the user.
         *
         * This is also useful if you want to be sure that the D-Bus–activated
         * applications are really started before termination and if you are interested
         * in receiving error information from their activation.
         *
         * @param uri the uri to show
         * @param context an optional #GAppLaunchContext
         * @param cancellable a #GCancellable
         * @param callback a #GAsyncReadyCallback to call when the request is done
         * @since 2.50
         */
        public fun launchDefaultForUriAsync(
            uri: String,
            context: AppLaunchContext? = null,
            cancellable: Cancellable? = null,
            callback: AsyncReadyCallback,
        ): Unit =
            g_app_info_launch_default_for_uri_async(
                uri,
                context?.gioAppLaunchContextPointer?.reinterpret(),
                cancellable?.gioCancellablePointer?.reinterpret(),
                AsyncReadyCallbackFunc.reinterpret(),
                StableRef.create(callback).asCPointer()
            )

        /**
         * Finishes an asynchronous launch-default-for-uri operation.
         *
         * @param result a #GAsyncResult
         * @return true if the launch was successful, false if @error is set
         * @since 2.50
         */
        public fun launchDefaultForUriFinish(result: AsyncResult): Result<Boolean> =
            memScoped {
                val gError = allocPointerTo<GError>()
                val gResult =
                    g_app_info_launch_default_for_uri_finish(
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
         * Removes all changes to the type associations done by
         * g_app_info_set_as_default_for_type(),
         * g_app_info_set_as_default_for_extension(),
         * g_app_info_add_supports_type() or
         * g_app_info_remove_supports_type().
         *
         * @param contentType a content type
         * @since 2.20
         */
        public fun resetTypeAssociations(contentType: String): Unit = g_app_info_reset_type_associations(contentType)
    }
}

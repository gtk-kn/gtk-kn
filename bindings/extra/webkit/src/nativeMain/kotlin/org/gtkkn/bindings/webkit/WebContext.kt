// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_16
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_18
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_26
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_28
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_38
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_4
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_40
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.ext.toCStringList
import org.gtkkn.extensions.glib.ext.toKStringList
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.webkit.WebKitAutomationSession
import org.gtkkn.native.webkit.WebKitUserMessage
import org.gtkkn.native.webkit.WebKitWebContext
import org.gtkkn.native.webkit.webkit_web_context_add_path_to_sandbox
import org.gtkkn.native.webkit.webkit_web_context_get_cache_model
import org.gtkkn.native.webkit.webkit_web_context_get_default
import org.gtkkn.native.webkit.webkit_web_context_get_geolocation_manager
import org.gtkkn.native.webkit.webkit_web_context_get_network_session_for_automation
import org.gtkkn.native.webkit.webkit_web_context_get_security_manager
import org.gtkkn.native.webkit.webkit_web_context_get_spell_checking_enabled
import org.gtkkn.native.webkit.webkit_web_context_get_spell_checking_languages
import org.gtkkn.native.webkit.webkit_web_context_get_time_zone_override
import org.gtkkn.native.webkit.webkit_web_context_get_type
import org.gtkkn.native.webkit.webkit_web_context_initialize_notification_permissions
import org.gtkkn.native.webkit.webkit_web_context_is_automation_allowed
import org.gtkkn.native.webkit.webkit_web_context_new
import org.gtkkn.native.webkit.webkit_web_context_register_uri_scheme
import org.gtkkn.native.webkit.webkit_web_context_send_message_to_all_extensions
import org.gtkkn.native.webkit.webkit_web_context_set_automation_allowed
import org.gtkkn.native.webkit.webkit_web_context_set_cache_model
import org.gtkkn.native.webkit.webkit_web_context_set_preferred_languages
import org.gtkkn.native.webkit.webkit_web_context_set_spell_checking_enabled
import org.gtkkn.native.webkit.webkit_web_context_set_spell_checking_languages
import org.gtkkn.native.webkit.webkit_web_context_set_web_process_extensions_directory
import org.gtkkn.native.webkit.webkit_web_context_set_web_process_extensions_initialization_user_data
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit
import kotlin.collections.List as CollectionsList
import org.gtkkn.bindings.glib.List as GlibList

/**
 * Manages aspects common to all #WebKitWebView<!-- -->s
 *
 * The #WebKitWebContext manages all aspects common to all
 * #WebKitWebView<!-- -->s.
 *
 * You can define the #WebKitCacheModel with
 * webkit_web_context_set_cache_model(), depending on the needs of
 * your application. You can access the #WebKitSecurityManager to specify
 * the behaviour of your application regarding security using
 * webkit_web_context_get_security_manager().
 *
 * It is also possible to change your preferred language or enable
 * spell checking, using webkit_web_context_set_preferred_languages(),
 * webkit_web_context_set_spell_checking_languages() and
 * webkit_web_context_set_spell_checking_enabled().
 *
 * You can use webkit_web_context_register_uri_scheme() to register
 * custom URI schemes, and manage several other settings.
 *
 * TLS certificate validation failure is now treated as a transport
 * error by default. To handle TLS failures differently, you can
 * connect to #WebKitWebView::load-failed-with-tls-errors.
 * Alternatively, you can use webkit_web_context_set_tls_errors_policy()
 * to set the policy %WEBKIT_TLS_ERRORS_POLICY_IGNORE; however, this is
 * not appropriate for Internet applications.
 *
 * ## Skipped during bindings generation
 *
 * - method `memory-pressure-settings`: Property has no getter nor setter
 */
public class WebContext(pointer: CPointer<WebKitWebContext>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val webkitWebContextPointer: CPointer<WebKitWebContext>
        get() = gPointer.reinterpret()

    /**
     * The timezone override for this web context. Setting this property provides a better
     * alternative to configure the timezone information for all webviews managed by the WebContext.
     * The other, less optimal, approach is to globally set the TZ environment variable in the
     * process before creating the context. However this approach might not be very convenient and
     * can have side-effects in your application.
     *
     * The expected values for this property are defined in the IANA timezone database. See this
     * wikipedia page for instance, https://en.wikipedia.org/wiki/List_of_tz_database_time_zones.
     *
     * @since 2.38
     */
    @WebKitVersion2_38
    public val timeZoneOverride: String
        /**
         * Get the #WebKitWebContext:time-zone-override property.
         *
         * @since 2.38
         */
        get() = webkit_web_context_get_time_zone_override(webkitWebContextPointer)?.toKString()
            ?: error("Expected not null string")

    /**
     * Create a new #WebKitWebContext.
     *
     * @return a newly created #WebKitWebContext
     * @since 2.8
     */
    public constructor() : this(webkit_web_context_new()!!.reinterpret())

    /**
     * Adds a path to be mounted in the sandbox.
     *
     * @path must exist before any web process has been created; otherwise,
     * it will be silently ignored. It is a fatal error to add paths after
     * a web process has been spawned.
     *
     * Paths under `/sys`, `/proc`, and `/dev` are invalid. Attempting to
     * add all of `/` is not valid. Since 2.40, adding the user's entire
     * home directory or /home is also not valid.
     *
     * See also webkit_web_context_set_sandbox_enabled()
     *
     * @param path an absolute path to mount in the sandbox
     * @param readOnly if true the path will be read-only
     * @since 2.26
     */
    @WebKitVersion2_26
    public fun addPathToSandbox(path: String, readOnly: Boolean): Unit =
        webkit_web_context_add_path_to_sandbox(webkitWebContextPointer, path, readOnly.asGBoolean())

    /**
     * Returns the current cache model.
     *
     * For more information about this
     * value check the documentation of the function
     * webkit_web_context_set_cache_model().
     *
     * @return the current #WebKitCacheModel
     */
    public fun getCacheModel(): CacheModel = webkit_web_context_get_cache_model(webkitWebContextPointer).run {
        CacheModel.fromNativeValue(this)
    }

    /**
     * Get the #WebKitGeolocationManager of @context.
     *
     * @return the #WebKitGeolocationManager of @context.
     * @since 2.26
     */
    @WebKitVersion2_26
    public fun getGeolocationManager(): GeolocationManager =
        webkit_web_context_get_geolocation_manager(webkitWebContextPointer)!!.run {
            GeolocationManager(this)
        }

    /**
     * Get the #WebKitNetworkSession used for automation sessions started in @context.
     *
     * @return a #WebKitNetworkSession, or null if automation is not enabled
     * @since 2.40
     */
    @WebKitVersion2_40
    public fun getNetworkSessionForAutomation(): NetworkSession? =
        webkit_web_context_get_network_session_for_automation(webkitWebContextPointer)?.run {
            NetworkSession(this)
        }

    /**
     * Get the #WebKitSecurityManager of @context.
     *
     * @return the #WebKitSecurityManager of @context.
     */
    public fun getSecurityManager(): SecurityManager =
        webkit_web_context_get_security_manager(webkitWebContextPointer)!!.run {
            SecurityManager(this)
        }

    /**
     * Get whether spell checking feature is currently enabled.
     *
     * @return true If spell checking is enabled, or false otherwise.
     */
    public fun getSpellCheckingEnabled(): Boolean =
        webkit_web_context_get_spell_checking_enabled(webkitWebContextPointer).asBoolean()

    /**
     * Get the the list of spell checking languages.
     *
     * Get the the list of spell checking languages associated with
     * @context, or null if no languages have been previously set.
     *
     * See webkit_web_context_set_spell_checking_languages() for more
     * details on the format of the languages in the list.
     *
     * @return A null-terminated
     *    array of languages if available, or null otherwise.
     */
    public fun getSpellCheckingLanguages(): CollectionsList<String> =
        webkit_web_context_get_spell_checking_languages(webkitWebContextPointer)?.toKStringList()
            ?: error("Expected not null string array")

    /**
     * Sets initial desktop notification permissions for the @context.
     *
     * @allowed_origins and @disallowed_origins must each be #GList of
     * #WebKitSecurityOrigin objects representing origins that will,
     * respectively, either always or never have permission to show desktop
     * notifications. No #WebKitNotificationPermissionRequest will ever be
     * generated for any of the security origins represented in
     * @allowed_origins or @disallowed_origins. This function is necessary
     * because some webpages proactively check whether they have permission
     * to display notifications without ever creating a permission request.
     *
     * This function only affects web processes that have not already been
     * created. The best time to call it is when handling
     * #WebKitWebContext::initialize-notification-permissions so as to
     * ensure that new web processes receive the most recent set of
     * permissions.
     *
     * @param allowedOrigins a #GList of security origins
     * @param disallowedOrigins a #GList of security origins
     * @since 2.16
     */
    @WebKitVersion2_16
    public fun initializeNotificationPermissions(allowedOrigins: GlibList, disallowedOrigins: GlibList): Unit =
        webkit_web_context_initialize_notification_permissions(
            webkitWebContextPointer,
            allowedOrigins.gPointer,
            disallowedOrigins.gPointer
        )

    /**
     * Get whether automation is allowed in @context.
     *
     * See also webkit_web_context_set_automation_allowed().
     *
     * @return true if automation is allowed or false otherwise.
     * @since 2.18
     */
    @WebKitVersion2_18
    public fun isAutomationAllowed(): Boolean =
        webkit_web_context_is_automation_allowed(webkitWebContextPointer).asBoolean()

    /**
     * Register @scheme in @context.
     *
     * Register @scheme in @context, so that when an URI request with @scheme is made in the
     * #WebKitWebContext, the #WebKitURISchemeRequestCallback registered will be called with a
     * #WebKitURISchemeRequest.
     * It is possible to handle URI scheme requests asynchronously, by calling g_object_ref() on the
     * #WebKitURISchemeRequest and calling webkit_uri_scheme_request_finish() later
     * when the data of the request is available or
     * webkit_uri_scheme_request_finish_error() in case of error.
     *
     * ```c
     * static void
     * about_uri_scheme_request_cb (WebKitURISchemeRequest *request,
     *                              gpointer                user_data)
     * {
     *     GInputStream *stream;
     *     gsize         stream_length;
     *     const gchar  *path = webkit_uri_scheme_request_get_path (request);
     *
     *     if (!g_strcmp0 (path, "memory")) {
     *         // Create a GInputStream with the contents of memory about page, and set its length to stream_length
     *     } else if (!g_strcmp0 (path, "applications")) {
     *         // Create a GInputStream with the contents of applications about page, and set its length to stream_length
     *     } else if (!g_strcmp0 (path, "example")) {
     *         gchar *contents = g_strdup_printf ("<html><body><p>Example about page</p></body></html>");
     *         stream_length = strlen (contents);
     *         stream = g_memory_input_stream_new_from_data (contents, stream_length, g_free);
     *     } else {
     *         GError *error = g_error_new (ABOUT_HANDLER_ERROR, ABOUT_HANDLER_ERROR_INVALID, "Invalid about:%s page.", path);
     *         webkit_uri_scheme_request_finish_error (request, error);
     *         g_error_free (error);
     *         return;
     *     }
     *     webkit_uri_scheme_request_finish (request, stream, stream_length, "text/html");
     *     g_object_unref (stream);
     * }
     * ```
     *
     * @param scheme the network scheme to register
     * @param callback a #WebKitURISchemeRequestCallback
     */
    public fun registerUriScheme(scheme: String, callback: UriSchemeRequestCallback): Unit =
        webkit_web_context_register_uri_scheme(
            webkitWebContextPointer,
            scheme,
            UriSchemeRequestCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer(),
            staticStableRefDestroy.reinterpret()
        )

    /**
     * Send @message to all web process extensions associated to @context.
     *
     * If @message is floating, it's consumed.
     *
     * @param message a #WebKitUserMessage
     * @since 2.28
     */
    @WebKitVersion2_28
    public fun sendMessageToAllExtensions(message: UserMessage): Unit =
        webkit_web_context_send_message_to_all_extensions(webkitWebContextPointer, message.webkitUserMessagePointer)

    /**
     * Set whether automation is allowed in @context.
     *
     * When automation is enabled the browser could
     * be controlled by another process by requesting an automation session. When a new automation
     * session is requested the signal #WebKitWebContext::automation-started is emitted.
     * Automation is disabled by default, so you need to explicitly call this method passing true
     * to enable it.
     *
     * Note that only one #WebKitWebContext can have automation enabled, so this will do nothing
     * if there's another #WebKitWebContext with automation already enabled.
     *
     * @param allowed value to set
     * @since 2.18
     */
    @WebKitVersion2_18
    public fun setAutomationAllowed(allowed: Boolean): Unit =
        webkit_web_context_set_automation_allowed(webkitWebContextPointer, allowed.asGBoolean())

    /**
     * Specifies a usage model for WebViews.
     *
     * Specifies a usage model for WebViews, which WebKit will use to
     * determine its caching behavior. All web views follow the cache
     * model. This cache model determines the RAM and disk space to use
     * for caching previously viewed content .
     *
     * Research indicates that users tend to browse within clusters of
     * documents that hold resources in common, and to revisit previously
     * visited documents. WebKit and the frameworks below it include
     * built-in caches that take advantage of these patterns,
     * substantially improving document load speed in browsing
     * situations. The WebKit cache model controls the behaviors of all of
     * these caches, including various WebCore caches.
     *
     * Browsers can improve document load speed substantially by
     * specifying %WEBKIT_CACHE_MODEL_WEB_BROWSER. Applications without a
     * browsing interface can reduce memory usage substantially by
     * specifying %WEBKIT_CACHE_MODEL_DOCUMENT_VIEWER. The default value is
     * %WEBKIT_CACHE_MODEL_WEB_BROWSER.
     *
     * @param cacheModel a #WebKitCacheModel
     */
    public fun setCacheModel(cacheModel: CacheModel): Unit =
        webkit_web_context_set_cache_model(webkitWebContextPointer, cacheModel.nativeValue)

    /**
     * Set the list of preferred languages.
     *
     * Set the list of preferred languages, sorted from most desirable
     * to least desirable. The list will be used in the following ways:
     *
     * - Determining how to build the `Accept-Language` HTTP header that will be
     *   included in the network requests started by the #WebKitWebContext.
     * - Setting the values of `navigator.language` and `navigator.languages`.
     * - The first item in the list sets the default locale for JavaScript
     *   `Intl` functions.
     *
     * @param languages a null-terminated list of language identifiers
     */
    public fun setPreferredLanguages(languages: CollectionsList<String>? = null): Unit = memScoped {
        return webkit_web_context_set_preferred_languages(webkitWebContextPointer, languages?.toCStringList(this))
    }

    /**
     * Enable or disable the spell checking feature.
     *
     * @param enabled Value to be set
     */
    public fun setSpellCheckingEnabled(enabled: Boolean): Unit =
        webkit_web_context_set_spell_checking_enabled(webkitWebContextPointer, enabled.asGBoolean())

    /**
     * Set the list of spell checking languages to be used for spell
     * checking.
     *
     * The locale string typically is in the form lang_COUNTRY, where lang
     * is an ISO-639 language code, and COUNTRY is an ISO-3166 country code.
     * For instance, sv_FI for Swedish as written in Finland or pt_BR
     * for Portuguese as written in Brazil.
     *
     * You need to call this function with a valid list of languages at
     * least once in order to properly enable the spell checking feature
     * in WebKit.
     *
     * @param languages a null-terminated list of spell checking languages
     */
    public fun setSpellCheckingLanguages(languages: CollectionsList<String>): Unit = memScoped {
        return webkit_web_context_set_spell_checking_languages(webkitWebContextPointer, languages.toCStringList(this))
    }

    /**
     * Set the directory where WebKit will look for web process extensions.
     *
     * This method must be called before loading anything in this context,
     * otherwise it will not have any effect. You can connect to
     * #WebKitWebContext::initialize-web-process-extensions to call this method
     * before anything is loaded.
     *
     * @param directory the directory to add
     */
    public fun setWebProcessExtensionsDirectory(directory: String): Unit =
        webkit_web_context_set_web_process_extensions_directory(webkitWebContextPointer, directory)

    /**
     * Set user data to be passed to Web Extensions on initialization.
     *
     * The data will be passed to the
     * #WebKitWebProcessExtensionInitializeWithUserDataFunction.
     * This method must be called before loading anything in this context,
     * otherwise it will not have any effect. You can connect to
     * #WebKitWebContext::initialize-web-process-extensions to call this method
     * before anything is loaded.
     *
     * @param userData a #GVariant
     * @since 2.4
     */
    @WebKitVersion2_4
    public fun setWebProcessExtensionsInitializationUserData(userData: Variant): Unit =
        webkit_web_context_set_web_process_extensions_initialization_user_data(
            webkitWebContextPointer,
            userData.gPointer
        )

    /**
     * This signal is emitted when a new automation request is made.
     * Note that it will never be emitted if automation is not enabled in @context,
     * see webkit_web_context_set_automation_allowed() for more details.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `session` the #WebKitAutomationSession associated with this event
     * @since 2.18
     */
    @WebKitVersion2_18
    public fun onAutomationStarted(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (session: AutomationSession) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer,
        "automation-started",
        onAutomationStartedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "automation-started" signal. See [onAutomationStarted].
     *
     * @param session the #WebKitAutomationSession associated with this event
     * @since 2.18
     */
    @WebKitVersion2_18
    public fun emitAutomationStarted(session: AutomationSession) {
        g_signal_emit_by_name(gPointer.reinterpret(), "automation-started", session.webkitAutomationSessionPointer)
    }

    /**
     * This signal is emitted when a #WebKitWebContext needs to set
     * initial notification permissions for a web process. It is emitted
     * when a new web process is about to be launched, and signals the
     * most appropriate moment to use
     * webkit_web_context_initialize_notification_permissions(). If no
     * notification permissions have changed since the last time this
     * signal was emitted, then there is no need to call
     * webkit_web_context_initialize_notification_permissions() again.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 2.16
     */
    @WebKitVersion2_16
    public fun onInitializeNotificationPermissions(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer,
        "initialize-notification-permissions",
        onInitializeNotificationPermissionsFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "initialize-notification-permissions" signal. See [onInitializeNotificationPermissions].
     *
     * @since 2.16
     */
    @WebKitVersion2_16
    public fun emitInitializeNotificationPermissions() {
        g_signal_emit_by_name(gPointer.reinterpret(), "initialize-notification-permissions")
    }

    /**
     * This signal is emitted when a new web process is about to be
     * launched. It signals the most appropriate moment to use
     * webkit_web_context_set_web_process_extensions_initialization_user_data()
     * and webkit_web_context_set_web_process_extensions_directory().
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 2.4
     */
    @WebKitVersion2_4
    public fun onInitializeWebProcessExtensions(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer,
        "initialize-web-process-extensions",
        onInitializeWebProcessExtensionsFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "initialize-web-process-extensions" signal. See [onInitializeWebProcessExtensions].
     *
     * @since 2.4
     */
    @WebKitVersion2_4
    public fun emitInitializeWebProcessExtensions() {
        g_signal_emit_by_name(gPointer.reinterpret(), "initialize-web-process-extensions")
    }

    /**
     * This signal is emitted when a #WebKitUserMessage is received from a
     * web process extension. You can reply to the message using
     * webkit_user_message_send_reply().
     *
     * You can handle the user message asynchronously by calling g_object_ref() on
     * @message and returning true.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `message` the #WebKitUserMessage received. Returns true if the message was handled, or false otherwise.
     * @since 2.28
     */
    @WebKitVersion2_28
    public fun onUserMessageReceived(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (message: UserMessage) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer,
        "user-message-received",
        onUserMessageReceivedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    public companion object : TypeCompanion<WebContext> {
        override val type: GeneratedClassKGType<WebContext> =
            GeneratedClassKGType(webkit_web_context_get_type()) { WebContext(it.reinterpret()) }

        init {
            WebkitTypeProvider.register()
        }

        /**
         * Gets the default web context.
         *
         * @return a #WebKitWebContext
         */
        public fun getDefault(): WebContext = webkit_web_context_get_default()!!.run {
            WebContext(this)
        }

        /**
         * Get the GType of WebContext
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_web_context_get_type()
    }
}

private val onAutomationStartedFunc:
    CPointer<CFunction<(CPointer<WebKitAutomationSession>) -> Unit>> = staticCFunction {
            _: COpaquePointer,
            session: CPointer<WebKitAutomationSession>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(session: AutomationSession) -> Unit>().get().invoke(
            session!!.run {
                AutomationSession(this)
            }
        )
    }
        .reinterpret()

private val onInitializeNotificationPermissionsFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

private val onInitializeWebProcessExtensionsFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

private val onUserMessageReceivedFunc:
    CPointer<CFunction<(CPointer<WebKitUserMessage>) -> gboolean>> = staticCFunction {
            _: COpaquePointer,
            message: CPointer<WebKitUserMessage>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(message: UserMessage) -> Boolean>().get().invoke(
            message!!.run {
                UserMessage(this)
            }
        ).asGBoolean()
    }
        .reinterpret()

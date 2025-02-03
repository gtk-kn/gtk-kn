// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.KeyFile
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.webkit.WebKit.resolveException
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_10
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_14
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_16
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_2
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_20
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_22
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_24
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_26
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_28
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_30
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_38
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_4
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_40
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_42
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_46
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitSettings
import org.gtkkn.native.webkit.webkit_settings_apply_from_key_file
import org.gtkkn.native.webkit.webkit_settings_font_size_to_pixels
import org.gtkkn.native.webkit.webkit_settings_font_size_to_points
import org.gtkkn.native.webkit.webkit_settings_get_all_features
import org.gtkkn.native.webkit.webkit_settings_get_allow_file_access_from_file_urls
import org.gtkkn.native.webkit.webkit_settings_get_allow_modal_dialogs
import org.gtkkn.native.webkit.webkit_settings_get_allow_top_navigation_to_data_urls
import org.gtkkn.native.webkit.webkit_settings_get_allow_universal_access_from_file_urls
import org.gtkkn.native.webkit.webkit_settings_get_auto_load_images
import org.gtkkn.native.webkit.webkit_settings_get_cursive_font_family
import org.gtkkn.native.webkit.webkit_settings_get_default_charset
import org.gtkkn.native.webkit.webkit_settings_get_default_font_family
import org.gtkkn.native.webkit.webkit_settings_get_default_font_size
import org.gtkkn.native.webkit.webkit_settings_get_default_monospace_font_size
import org.gtkkn.native.webkit.webkit_settings_get_development_features
import org.gtkkn.native.webkit.webkit_settings_get_disable_web_security
import org.gtkkn.native.webkit.webkit_settings_get_draw_compositing_indicators
import org.gtkkn.native.webkit.webkit_settings_get_enable_2d_canvas_acceleration
import org.gtkkn.native.webkit.webkit_settings_get_enable_back_forward_navigation_gestures
import org.gtkkn.native.webkit.webkit_settings_get_enable_caret_browsing
import org.gtkkn.native.webkit.webkit_settings_get_enable_developer_extras
import org.gtkkn.native.webkit.webkit_settings_get_enable_dns_prefetching
import org.gtkkn.native.webkit.webkit_settings_get_enable_encrypted_media
import org.gtkkn.native.webkit.webkit_settings_get_enable_fullscreen
import org.gtkkn.native.webkit.webkit_settings_get_enable_html5_database
import org.gtkkn.native.webkit.webkit_settings_get_enable_html5_local_storage
import org.gtkkn.native.webkit.webkit_settings_get_enable_hyperlink_auditing
import org.gtkkn.native.webkit.webkit_settings_get_enable_javascript
import org.gtkkn.native.webkit.webkit_settings_get_enable_javascript_markup
import org.gtkkn.native.webkit.webkit_settings_get_enable_media
import org.gtkkn.native.webkit.webkit_settings_get_enable_media_capabilities
import org.gtkkn.native.webkit.webkit_settings_get_enable_media_stream
import org.gtkkn.native.webkit.webkit_settings_get_enable_mediasource
import org.gtkkn.native.webkit.webkit_settings_get_enable_mock_capture_devices
import org.gtkkn.native.webkit.webkit_settings_get_enable_offline_web_application_cache
import org.gtkkn.native.webkit.webkit_settings_get_enable_page_cache
import org.gtkkn.native.webkit.webkit_settings_get_enable_resizable_text_areas
import org.gtkkn.native.webkit.webkit_settings_get_enable_site_specific_quirks
import org.gtkkn.native.webkit.webkit_settings_get_enable_smooth_scrolling
import org.gtkkn.native.webkit.webkit_settings_get_enable_spatial_navigation
import org.gtkkn.native.webkit.webkit_settings_get_enable_tabs_to_links
import org.gtkkn.native.webkit.webkit_settings_get_enable_webaudio
import org.gtkkn.native.webkit.webkit_settings_get_enable_webgl
import org.gtkkn.native.webkit.webkit_settings_get_enable_webrtc
import org.gtkkn.native.webkit.webkit_settings_get_enable_write_console_messages_to_stdout
import org.gtkkn.native.webkit.webkit_settings_get_experimental_features
import org.gtkkn.native.webkit.webkit_settings_get_fantasy_font_family
import org.gtkkn.native.webkit.webkit_settings_get_feature_enabled
import org.gtkkn.native.webkit.webkit_settings_get_hardware_acceleration_policy
import org.gtkkn.native.webkit.webkit_settings_get_javascript_can_access_clipboard
import org.gtkkn.native.webkit.webkit_settings_get_javascript_can_open_windows_automatically
import org.gtkkn.native.webkit.webkit_settings_get_load_icons_ignoring_image_load_setting
import org.gtkkn.native.webkit.webkit_settings_get_media_content_types_requiring_hardware_support
import org.gtkkn.native.webkit.webkit_settings_get_media_playback_allows_inline
import org.gtkkn.native.webkit.webkit_settings_get_media_playback_requires_user_gesture
import org.gtkkn.native.webkit.webkit_settings_get_minimum_font_size
import org.gtkkn.native.webkit.webkit_settings_get_monospace_font_family
import org.gtkkn.native.webkit.webkit_settings_get_pictograph_font_family
import org.gtkkn.native.webkit.webkit_settings_get_print_backgrounds
import org.gtkkn.native.webkit.webkit_settings_get_sans_serif_font_family
import org.gtkkn.native.webkit.webkit_settings_get_serif_font_family
import org.gtkkn.native.webkit.webkit_settings_get_type
import org.gtkkn.native.webkit.webkit_settings_get_user_agent
import org.gtkkn.native.webkit.webkit_settings_get_zoom_text_only
import org.gtkkn.native.webkit.webkit_settings_new
import org.gtkkn.native.webkit.webkit_settings_set_allow_file_access_from_file_urls
import org.gtkkn.native.webkit.webkit_settings_set_allow_modal_dialogs
import org.gtkkn.native.webkit.webkit_settings_set_allow_top_navigation_to_data_urls
import org.gtkkn.native.webkit.webkit_settings_set_allow_universal_access_from_file_urls
import org.gtkkn.native.webkit.webkit_settings_set_auto_load_images
import org.gtkkn.native.webkit.webkit_settings_set_cursive_font_family
import org.gtkkn.native.webkit.webkit_settings_set_default_charset
import org.gtkkn.native.webkit.webkit_settings_set_default_font_family
import org.gtkkn.native.webkit.webkit_settings_set_default_font_size
import org.gtkkn.native.webkit.webkit_settings_set_default_monospace_font_size
import org.gtkkn.native.webkit.webkit_settings_set_disable_web_security
import org.gtkkn.native.webkit.webkit_settings_set_draw_compositing_indicators
import org.gtkkn.native.webkit.webkit_settings_set_enable_2d_canvas_acceleration
import org.gtkkn.native.webkit.webkit_settings_set_enable_back_forward_navigation_gestures
import org.gtkkn.native.webkit.webkit_settings_set_enable_caret_browsing
import org.gtkkn.native.webkit.webkit_settings_set_enable_developer_extras
import org.gtkkn.native.webkit.webkit_settings_set_enable_dns_prefetching
import org.gtkkn.native.webkit.webkit_settings_set_enable_encrypted_media
import org.gtkkn.native.webkit.webkit_settings_set_enable_fullscreen
import org.gtkkn.native.webkit.webkit_settings_set_enable_html5_database
import org.gtkkn.native.webkit.webkit_settings_set_enable_html5_local_storage
import org.gtkkn.native.webkit.webkit_settings_set_enable_hyperlink_auditing
import org.gtkkn.native.webkit.webkit_settings_set_enable_javascript
import org.gtkkn.native.webkit.webkit_settings_set_enable_javascript_markup
import org.gtkkn.native.webkit.webkit_settings_set_enable_media
import org.gtkkn.native.webkit.webkit_settings_set_enable_media_capabilities
import org.gtkkn.native.webkit.webkit_settings_set_enable_media_stream
import org.gtkkn.native.webkit.webkit_settings_set_enable_mediasource
import org.gtkkn.native.webkit.webkit_settings_set_enable_mock_capture_devices
import org.gtkkn.native.webkit.webkit_settings_set_enable_offline_web_application_cache
import org.gtkkn.native.webkit.webkit_settings_set_enable_page_cache
import org.gtkkn.native.webkit.webkit_settings_set_enable_resizable_text_areas
import org.gtkkn.native.webkit.webkit_settings_set_enable_site_specific_quirks
import org.gtkkn.native.webkit.webkit_settings_set_enable_smooth_scrolling
import org.gtkkn.native.webkit.webkit_settings_set_enable_spatial_navigation
import org.gtkkn.native.webkit.webkit_settings_set_enable_tabs_to_links
import org.gtkkn.native.webkit.webkit_settings_set_enable_webaudio
import org.gtkkn.native.webkit.webkit_settings_set_enable_webgl
import org.gtkkn.native.webkit.webkit_settings_set_enable_webrtc
import org.gtkkn.native.webkit.webkit_settings_set_enable_write_console_messages_to_stdout
import org.gtkkn.native.webkit.webkit_settings_set_fantasy_font_family
import org.gtkkn.native.webkit.webkit_settings_set_feature_enabled
import org.gtkkn.native.webkit.webkit_settings_set_hardware_acceleration_policy
import org.gtkkn.native.webkit.webkit_settings_set_javascript_can_access_clipboard
import org.gtkkn.native.webkit.webkit_settings_set_javascript_can_open_windows_automatically
import org.gtkkn.native.webkit.webkit_settings_set_load_icons_ignoring_image_load_setting
import org.gtkkn.native.webkit.webkit_settings_set_media_content_types_requiring_hardware_support
import org.gtkkn.native.webkit.webkit_settings_set_media_playback_allows_inline
import org.gtkkn.native.webkit.webkit_settings_set_media_playback_requires_user_gesture
import org.gtkkn.native.webkit.webkit_settings_set_minimum_font_size
import org.gtkkn.native.webkit.webkit_settings_set_monospace_font_family
import org.gtkkn.native.webkit.webkit_settings_set_pictograph_font_family
import org.gtkkn.native.webkit.webkit_settings_set_print_backgrounds
import org.gtkkn.native.webkit.webkit_settings_set_sans_serif_font_family
import org.gtkkn.native.webkit.webkit_settings_set_serif_font_family
import org.gtkkn.native.webkit.webkit_settings_set_user_agent
import org.gtkkn.native.webkit.webkit_settings_set_user_agent_with_application_details
import org.gtkkn.native.webkit.webkit_settings_set_zoom_text_only
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.Unit

/**
 * Control the behaviour of a #WebKitWebView.
 *
 * #WebKitSettings can be applied to a #WebKitWebView to control text charset,
 * color, font sizes, printing mode, script support, loading of images and various
 * other things on a #WebKitWebView. After creation, a #WebKitSettings object
 * contains default settings.
 *
 * ```c
 * // Disable JavaScript
 * WebKitSettings *settings = webkit_web_view_group_get_settings (my_view_group);
 * webkit_settings_set_enable_javascript (settings, FALSE);
 * ```
 *
 * ## Skipped during bindings generation
 *
 * - method `media-content-types-requiring-hardware-support`: Property TypeInfo of getter and setter do not match
 * - method `user-agent`: Property TypeInfo of getter and setter do not match
 * - constructor `new_with_settings`: Varargs parameter is not supported
 */
public class Settings(public val webkitSettingsPointer: CPointer<WebKitSettings>) :
    Object(webkitSettingsPointer.reinterpret()),
    KGTyped {
    init {
        WebKit
    }

    /**
     * Whether file access is allowed from file URLs. By default, when
     * something is loaded in a #WebKitWebView using a file URI, cross
     * origin requests to other file resources are not allowed. This
     * setting allows you to change that behaviour, so that it would be
     * possible to do a XMLHttpRequest of a local file, for example.
     *
     * @since 2.10
     */
    @WebKitVersion2_10
    public var allowFileAccessFromFileUrls: Boolean
        /**
         * Get the #WebKitSettings:allow-file-access-from-file-urls property.
         *
         * @return true If file access from file URLs is allowed or false otherwise.
         * @since 2.10
         */
        get() = webkit_settings_get_allow_file_access_from_file_urls(webkitSettingsPointer).asBoolean()

        /**
         * Set the #WebKitSettings:allow-file-access-from-file-urls property.
         *
         * @param allowed Value to be set
         * @since 2.10
         */
        @WebKitVersion2_10
        set(allowed) = webkit_settings_set_allow_file_access_from_file_urls(webkitSettingsPointer, allowed.asGBoolean())

    /**
     * Determine whether it's allowed to create and run modal dialogs
     * from a #WebKitWebView through JavaScript with
     * <function>window.showModalDialog</function>. If it's set to
     * false, the associated #WebKitWebView won't be able to create
     * new modal dialogs, so not even the #WebKitWebView::create
     * signal will be emitted.
     */
    public var allowModalDialogs: Boolean
        /**
         * Get the #WebKitSettings:allow-modal-dialogs property.
         *
         * @return true if it's allowed to create and run modal dialogs or false otherwise.
         */
        get() = webkit_settings_get_allow_modal_dialogs(webkitSettingsPointer).asBoolean()

        /**
         * Set the #WebKitSettings:allow-modal-dialogs property.
         *
         * @param allowed Value to be set
         */
        set(allowed) = webkit_settings_set_allow_modal_dialogs(webkitSettingsPointer, allowed.asGBoolean())

    /**
     * Whether or not the top frame is allowed to navigate to data URLs. It is disabled by default
     * due to the risk it poses when loading untrusted URLs, with data URLs being used in scamming
     * and phishing attacks. In contrast, a scenario where it could be enabled could be an app that
     * embeds a WebView and you have control of the pages being show instead of a generic browser.
     *
     * @since 2.28
     */
    @WebKitVersion2_28
    public var allowTopNavigationToDataUrls: Boolean
        /**
         * Get the #WebKitSettings:allow-top-navigation-to-data-urls property.
         *
         * @return true If navigation to data URLs from the top frame is allowed or false\
         * otherwise.
         * @since 2.28
         */
        get() = webkit_settings_get_allow_top_navigation_to_data_urls(webkitSettingsPointer).asBoolean()

        /**
         * Set the #WebKitSettings:allow-top-navigation-to-data-urls property.
         *
         * @param allowed Value to be set
         * @since 2.28
         */
        @WebKitVersion2_28
        set(
            allowed
        ) = webkit_settings_set_allow_top_navigation_to_data_urls(webkitSettingsPointer, allowed.asGBoolean())

    /**
     * Whether or not JavaScript running in the context of a file scheme URL
     * should be allowed to access content from any origin.  By default, when
     * something is loaded in a #WebKitWebView using a file scheme URL,
     * access to the local file system and arbitrary local storage is not
     * allowed. This setting allows you to change that behaviour, so that
     * it would be possible to use local storage, for example.
     *
     * @since 2.14
     */
    @WebKitVersion2_14
    public var allowUniversalAccessFromFileUrls: Boolean
        /**
         * Get the #WebKitSettings:allow-universal-access-from-file-urls property.
         *
         * @return true If universal access from file URLs is allowed or false otherwise.
         * @since 2.14
         */
        get() = webkit_settings_get_allow_universal_access_from_file_urls(webkitSettingsPointer).asBoolean()

        /**
         * Set the #WebKitSettings:allow-universal-access-from-file-urls property.
         *
         * @param allowed Value to be set
         * @since 2.14
         */
        @WebKitVersion2_14
        set(
            allowed
        ) = webkit_settings_set_allow_universal_access_from_file_urls(webkitSettingsPointer, allowed.asGBoolean())

    /**
     * Determines whether images should be automatically loaded or not.
     * On devices where network bandwidth is of concern, it might be
     * useful to turn this property off.
     */
    public var autoLoadImages: Boolean
        /**
         * Get the #WebKitSettings:auto-load-images property.
         *
         * @return true If auto loading of images is enabled or false otherwise.
         */
        get() = webkit_settings_get_auto_load_images(webkitSettingsPointer).asBoolean()

        /**
         * Set the #WebKitSettings:auto-load-images property.
         *
         * @param enabled Value to be set
         */
        set(enabled) = webkit_settings_set_auto_load_images(webkitSettingsPointer, enabled.asGBoolean())

    /**
     * The font family used as the default for content using a cursive font.
     */
    public var cursiveFontFamily: String
        /**
         * Gets the #WebKitSettings:cursive-font-family property.
         *
         * @return The default font family used to display content marked with cursive font.
         */
        get() = webkit_settings_get_cursive_font_family(webkitSettingsPointer)?.toKString()
            ?: error("Expected not null string")

        /**
         * Set the #WebKitSettings:cursive-font-family property.
         *
         * @param cursiveFontFamily the new default cursive font family
         */
        set(cursiveFontFamily) = webkit_settings_set_cursive_font_family(webkitSettingsPointer, cursiveFontFamily)

    /**
     * The default text charset used when interpreting content with an unspecified charset.
     */
    public var defaultCharset: String
        /**
         * Gets the #WebKitSettings:default-charset property.
         *
         * @return Default charset.
         */
        get() = webkit_settings_get_default_charset(webkitSettingsPointer)?.toKString()
            ?: error("Expected not null string")

        /**
         * Set the #WebKitSettings:default-charset property.
         *
         * @param defaultCharset default charset to be set
         */
        set(defaultCharset) = webkit_settings_set_default_charset(webkitSettingsPointer, defaultCharset)

    /**
     * The font family to use as the default for content that does not specify a font.
     */
    public var defaultFontFamily: String
        /**
         * Gets the #WebKitSettings:default-font-family property.
         *
         * @return The default font family used to display content that does not specify a font.
         */
        get() = webkit_settings_get_default_font_family(webkitSettingsPointer)?.toKString()
            ?: error("Expected not null string")

        /**
         * Set the #WebKitSettings:default-font-family property.
         *
         * @param defaultFontFamily the new default font family
         */
        set(defaultFontFamily) = webkit_settings_set_default_font_family(webkitSettingsPointer, defaultFontFamily)

    /**
     * The default font size in pixels to use for content displayed if
     * no font size is specified.
     */
    public var defaultFontSize: guint
        /**
         * Gets the #WebKitSettings:default-font-size property.
         *
         * @return The default font size, in pixels.
         */
        get() = webkit_settings_get_default_font_size(webkitSettingsPointer)

        /**
         * Set the #WebKitSettings:default-font-size property.
         *
         * @param fontSize default font size to be set in pixels
         */
        set(fontSize) = webkit_settings_set_default_font_size(webkitSettingsPointer, fontSize)

    /**
     * The default font size in pixels to use for content displayed in
     * monospace font if no font size is specified.
     */
    public var defaultMonospaceFontSize: guint
        /**
         * Gets the #WebKitSettings:default-monospace-font-size property.
         *
         * @return Default monospace font size, in pixels.
         */
        get() = webkit_settings_get_default_monospace_font_size(webkitSettingsPointer)

        /**
         * Set the #WebKitSettings:default-monospace-font-size property.
         *
         * @param fontSize default monospace font size to be set in pixels
         */
        set(fontSize) = webkit_settings_set_default_monospace_font_size(webkitSettingsPointer, fontSize)

    /**
     * Enable or disable support for Web Security on pages.
     *
     * This setting disables the same-origin policy, allowing every website full control over
     * all other websites. This is for use in special environments where you wish to disable
     * all security and allow websites to hack each other. It is impossible to use this setting
     * securely.
     *
     * @since 2.40
     */
    @WebKitVersion2_40
    public var disableWebSecurity: Boolean
        /**
         * Get the #WebKitSettings:disable-web-security property.
         *
         * @return true If web security support is disabled or false otherwise.
         * @since 2.40
         */
        get() = webkit_settings_get_disable_web_security(webkitSettingsPointer).asBoolean()

        /**
         * Set the #WebKitSettings:disable-web-security property.
         *
         * @param disabled Value to be set
         * @since 2.40
         */
        @WebKitVersion2_40
        set(disabled) = webkit_settings_set_disable_web_security(webkitSettingsPointer, disabled.asGBoolean())

    /**
     * Whether to draw compositing borders and repaint counters on layers drawn
     * with accelerated compositing. This is useful for debugging issues related
     * to web content that is composited with the GPU.
     */
    public var drawCompositingIndicators: Boolean
        /**
         * Get the #WebKitSettings:draw-compositing-indicators property.
         *
         * @return true If compositing borders are drawn or false otherwise.
         */
        get() = webkit_settings_get_draw_compositing_indicators(webkitSettingsPointer).asBoolean()

        /**
         * Set the #WebKitSettings:draw-compositing-indicators property.
         *
         * @param enabled Value to be set
         */
        set(enabled) = webkit_settings_set_draw_compositing_indicators(webkitSettingsPointer, enabled.asGBoolean())

    /**
     * Enable or disable 2D canvas acceleration.
     * If this setting is enabled, the 2D canvas will be accelerated even if Skia CPU
     * is used for rendering. However, the canvas can be unaccelerated even when this setting
     * is enabled, for other reasons like its size or when willReadFrequently property is used.
     *
     * @since 2.46
     */
    @WebKitVersion2_46
    public var enable2dCanvasAcceleration: Boolean
        /**
         * Get the #WebKitSettings:enable-2d-canvas-acceleration property.
         *
         * @return true if 2D canvas acceleration is enabled or false otherwise.
         * @since 2.46
         */
        get() = webkit_settings_get_enable_2d_canvas_acceleration(webkitSettingsPointer).asBoolean()

        /**
         * Set the #WebKitSettings:enable-2d-canvas-acceleration property.
         *
         * @param enabled Value to be set
         * @since 2.46
         */
        @WebKitVersion2_46
        set(enabled) = webkit_settings_set_enable_2d_canvas_acceleration(webkitSettingsPointer, enabled.asGBoolean())

    /**
     * Enable or disable horizontal swipe gesture for back-forward navigation.
     *
     * @since 2.24
     */
    @WebKitVersion2_24
    public var enableBackForwardNavigationGestures: Boolean
        /**
         * Get the #WebKitSettings:enable-back-forward-navigation-gestures property.
         *
         * @return true if horizontal swipe gesture will trigger back-forward navigaiton or false otherwise.
         * @since 2.24
         */
        get() = webkit_settings_get_enable_back_forward_navigation_gestures(webkitSettingsPointer).asBoolean()

        /**
         * Set the #WebKitSettings:enable-back-forward-navigation-gestures property.
         *
         * @param enabled value to be set
         * @since 2.24
         */
        @WebKitVersion2_24
        set(
            enabled
        ) = webkit_settings_set_enable_back_forward_navigation_gestures(webkitSettingsPointer, enabled.asGBoolean())

    /**
     * Whether to enable accessibility enhanced keyboard navigation.
     */
    public var enableCaretBrowsing: Boolean
        /**
         * Get the #WebKitSettings:enable-caret-browsing property.
         *
         * @return true If caret browsing is enabled or false otherwise.
         */
        get() = webkit_settings_get_enable_caret_browsing(webkitSettingsPointer).asBoolean()

        /**
         * Set the #WebKitSettings:enable-caret-browsing property.
         *
         * @param enabled Value to be set
         */
        set(enabled) = webkit_settings_set_enable_caret_browsing(webkitSettingsPointer, enabled.asGBoolean())

    /**
     * Determines whether or not developer tools, such as the Web Inspector, are enabled.
     */
    public var enableDeveloperExtras: Boolean
        /**
         * Get the #WebKitSettings:enable-developer-extras property.
         *
         * @return true If developer extras is enabled or false otherwise.
         */
        get() = webkit_settings_get_enable_developer_extras(webkitSettingsPointer).asBoolean()

        /**
         * Set the #WebKitSettings:enable-developer-extras property.
         *
         * @param enabled Value to be set
         */
        set(enabled) = webkit_settings_set_enable_developer_extras(webkitSettingsPointer, enabled.asGBoolean())

    /**
     * Determines whether or not to prefetch domain names. DNS prefetching attempts
     * to resolve domain names before a user tries to follow a link.
     */
    public var enableDnsPrefetching: Boolean
        /**
         * Get the #WebKitSettings:enable-dns-prefetching property.
         *
         * @return true If DNS prefetching is enabled or false otherwise.
         */
        get() = webkit_settings_get_enable_dns_prefetching(webkitSettingsPointer).asBoolean()

        /**
         * Set the #WebKitSettings:enable-dns-prefetching property.
         *
         * @param enabled Value to be set
         */
        set(enabled) = webkit_settings_set_enable_dns_prefetching(webkitSettingsPointer, enabled.asGBoolean())

    /**
     * Enable or disable support for Encrypted Media API on pages.
     * EncryptedMedia is an experimental JavaScript API for playing encrypted media in HTML.
     * This property will only work as intended if the EncryptedMedia feature is enabled at build time
     * with the ENABLE_ENCRYPTED_MEDIA flag.
     *
     * See https://www.w3.org/TR/encrypted-media/
     *
     * @since 2.20
     */
    @WebKitVersion2_20
    public var enableEncryptedMedia: Boolean
        /**
         * Get the #WebKitSettings:enable-encrypted-media property.
         *
         * @return true if EncryptedMedia support is enabled or false otherwise.
         * @since 2.20
         */
        get() = webkit_settings_get_enable_encrypted_media(webkitSettingsPointer).asBoolean()

        /**
         * Set the #WebKitSettings:enable-encrypted-media property.
         *
         * @param enabled Value to be set
         * @since 2.20
         */
        @WebKitVersion2_20
        set(enabled) = webkit_settings_set_enable_encrypted_media(webkitSettingsPointer, enabled.asGBoolean())

    /**
     * Whether to enable the Javascript Fullscreen API. The API
     * allows any HTML element to request fullscreen display. See also
     * the current draft of the spec:
     * http://www.w3.org/TR/fullscreen/
     */
    public var enableFullscreen: Boolean
        /**
         * Get the #WebKitSettings:enable-fullscreen property.
         *
         * @return true If fullscreen support is enabled or false otherwise.
         */
        get() = webkit_settings_get_enable_fullscreen(webkitSettingsPointer).asBoolean()

        /**
         * Set the #WebKitSettings:enable-fullscreen property.
         *
         * @param enabled Value to be set
         */
        set(enabled) = webkit_settings_set_enable_fullscreen(webkitSettingsPointer, enabled.asGBoolean())

    /**
     * Whether to enable HTML5 client-side SQL database support (IndexedDB).
     */
    public var enableHtml5Database: Boolean
        /**
         * Get the #WebKitSettings:enable-html5-database property.
         *
         * @return true if IndexedDB support is enabled or false otherwise.
         */
        get() = webkit_settings_get_enable_html5_database(webkitSettingsPointer).asBoolean()

        /**
         * Set the #WebKitSettings:enable-html5-database property.
         *
         * @param enabled Value to be set
         */
        set(enabled) = webkit_settings_set_enable_html5_database(webkitSettingsPointer, enabled.asGBoolean())

    /**
     * Whether to enable HTML5 local storage support. Local storage provides
     * simple synchronous storage access.
     *
     * HTML5 local storage specification is available at
     * http://dev.w3.org/html5/webstorage/.
     */
    public var enableHtml5LocalStorage: Boolean
        /**
         * Get the #WebKitSettings:enable-html5-local-storage property.
         *
         * @return true If HTML5 local storage support is enabled or false otherwise.
         */
        get() = webkit_settings_get_enable_html5_local_storage(webkitSettingsPointer).asBoolean()

        /**
         * Set the #WebKitSettings:enable-html5-local-storage property.
         *
         * @param enabled Value to be set
         */
        set(enabled) = webkit_settings_set_enable_html5_local_storage(webkitSettingsPointer, enabled.asGBoolean())

    /**
     * Determines whether or not hyperlink auditing is enabled.
     *
     * The hyperlink auditing specification is available at
     * http://www.whatwg.org/specs/web-apps/current-work/multipage/links.html#hyperlink-auditing.
     */
    public var enableHyperlinkAuditing: Boolean
        /**
         * Get the #WebKitSettings:enable-hyperlink-auditing property.
         *
         * @return true If hyper link auditing is enabled or false otherwise.
         */
        get() = webkit_settings_get_enable_hyperlink_auditing(webkitSettingsPointer).asBoolean()

        /**
         * Set the #WebKitSettings:enable-hyperlink-auditing property.
         *
         * @param enabled Value to be set
         */
        set(enabled) = webkit_settings_set_enable_hyperlink_auditing(webkitSettingsPointer, enabled.asGBoolean())

    /**
     * Determines whether or not JavaScript executes within a page.
     */
    public var enableJavascript: Boolean
        /**
         * Get the #WebKitSettings:enable-javascript property.
         *
         * @return true If JavaScript is enabled or false otherwise.
         */
        get() = webkit_settings_get_enable_javascript(webkitSettingsPointer).asBoolean()

        /**
         * Set the #WebKitSettings:enable-javascript property.
         *
         * @param enabled Value to be set
         */
        set(enabled) = webkit_settings_set_enable_javascript(webkitSettingsPointer, enabled.asGBoolean())

    /**
     * Determines whether or not JavaScript markup is allowed in document. When this setting is disabled,
     * all JavaScript-related elements and attributes are removed from the document during parsing. Note that
     * executing JavaScript is still allowed if #WebKitSettings:enable-javascript is true.
     *
     * @since 2.24
     */
    @WebKitVersion2_24
    public var enableJavascriptMarkup: Boolean
        /**
         * Get the #WebKitSettings:enable-javascript-markup property.
         *
         * @return true if JavaScript markup is enabled or false otherwise.
         * @since 2.24
         */
        get() = webkit_settings_get_enable_javascript_markup(webkitSettingsPointer).asBoolean()

        /**
         * Set the #WebKitSettings:enable-javascript-markup property.
         *
         * @param enabled Value to be set
         * @since 2.24
         */
        @WebKitVersion2_24
        set(enabled) = webkit_settings_set_enable_javascript_markup(webkitSettingsPointer, enabled.asGBoolean())

    /**
     * Enable or disable support for media playback on pages. This setting is enabled by
     * default. Disabling it means `<audio>`, `<track>` and `<video>` elements will have
     * playback support disabled.
     *
     * @since 2.26
     */
    @WebKitVersion2_26
    public var enableMedia: Boolean
        /**
         * Get the #WebKitSettings:enable-media property.
         *
         * @return true if media support is enabled or false otherwise.
         * @since 2.26
         */
        get() = webkit_settings_get_enable_media(webkitSettingsPointer).asBoolean()

        /**
         * Set the #WebKitSettings:enable-media property.
         *
         * @param enabled Value to be set
         * @since 2.26
         */
        @WebKitVersion2_26
        set(enabled) = webkit_settings_set_enable_media(webkitSettingsPointer, enabled.asGBoolean())

    /**
     * Enable or disable support for MediaCapabilities on pages. This
     * specification intends to provide APIs to allow websites to make an optimal
     * decision when picking media content for the user. The APIs will expose
     * information about the decoding and encoding capabilities for a given format
     * but also output capabilities to find the best match based on the device’s
     * display.
     *
     * See also https://wicg.github.io/media-capabilities/
     *
     * @since 2.22
     */
    @WebKitVersion2_22
    public var enableMediaCapabilities: Boolean
        /**
         * Get the #WebKitSettings:enable-media-capabilities property.
         *
         * @return true if MediaCapabilities support is enabled or false otherwise.
         * @since 2.22
         */
        get() = webkit_settings_get_enable_media_capabilities(webkitSettingsPointer).asBoolean()

        /**
         * Set the #WebKitSettings:enable-media-capabilities property.
         *
         * @param enabled Value to be set
         * @since 2.22
         */
        @WebKitVersion2_22
        set(enabled) = webkit_settings_set_enable_media_capabilities(webkitSettingsPointer, enabled.asGBoolean())

    /**
     * Enable or disable support for MediaStream on pages. MediaStream
     * is an experimental proposal for allowing web pages to access
     * audio and video devices for capture.
     *
     * See also http://dev.w3.org/2011/webrtc/editor/getusermedia.html
     *
     * @since 2.4
     */
    @WebKitVersion2_4
    public var enableMediaStream: Boolean
        /**
         * Get the #WebKitSettings:enable-media-stream property.
         *
         * @return true If mediastream support is enabled or false otherwise.
         * @since 2.4
         */
        get() = webkit_settings_get_enable_media_stream(webkitSettingsPointer).asBoolean()

        /**
         * Set the #WebKitSettings:enable-media-stream property.
         *
         * @param enabled Value to be set
         * @since 2.4
         */
        @WebKitVersion2_4
        set(enabled) = webkit_settings_set_enable_media_stream(webkitSettingsPointer, enabled.asGBoolean())

    /**
     * Enable or disable support for MediaSource on pages. MediaSource
     * extends HTMLMediaElement to allow JavaScript to generate media
     * streams for playback.
     *
     * See also http://www.w3.org/TR/media-source/
     *
     * @since 2.4
     */
    @WebKitVersion2_4
    public var enableMediasource: Boolean
        /**
         * Get the #WebKitSettings:enable-mediasource property.
         *
         * @return true If MediaSource support is enabled or false otherwise.
         * @since 2.4
         */
        get() = webkit_settings_get_enable_mediasource(webkitSettingsPointer).asBoolean()

        /**
         * Set the #WebKitSettings:enable-mediasource property.
         *
         * @param enabled Value to be set
         * @since 2.4
         */
        @WebKitVersion2_4
        set(enabled) = webkit_settings_set_enable_mediasource(webkitSettingsPointer, enabled.asGBoolean())

    /**
     * Enable or disable the Mock Capture Devices. Those are fake
     * Microphone and Camera devices to be used as MediaStream
     * sources.
     *
     * @since 2.24
     */
    @WebKitVersion2_24
    public var enableMockCaptureDevices: Boolean
        /**
         * Get the #WebKitSettings:enable-mock-capture-devices property.
         *
         * @return true If mock capture devices is enabled or false otherwise.
         * @since 2.24
         */
        get() = webkit_settings_get_enable_mock_capture_devices(webkitSettingsPointer).asBoolean()

        /**
         * Set the #WebKitSettings:enable-mock-capture-devices property.
         *
         * @param enabled Value to be set
         * @since 2.4
         */
        @WebKitVersion2_4
        set(enabled) = webkit_settings_set_enable_mock_capture_devices(webkitSettingsPointer, enabled.asGBoolean())

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 2.44.
     * ---
     *
     * Unsupported setting. This property does nothing.
     */
    public var enableOfflineWebApplicationCache: Boolean
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 2.44.
         * ---
         *
         * Get the #WebKitSettings:enable-offline-web-application-cache property.
         *
         * @return false.
         */
        get() = webkit_settings_get_enable_offline_web_application_cache(webkitSettingsPointer).asBoolean()

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 2.44.
         * ---
         *
         * Setting no longer supported. This function does nothing.
         *
         * @param enabled Value to be set
         */
        set(
            enabled
        ) = webkit_settings_set_enable_offline_web_application_cache(webkitSettingsPointer, enabled.asGBoolean())

    /**
     * Enable or disable the page cache. Disabling the page cache is
     * generally only useful for special circumstances like low-memory
     * scenarios or special purpose applications like static HTML
     * viewers. This setting only controls the Page Cache, this cache
     * is different than the disk-based or memory-based traditional
     * resource caches, its point is to make going back and forth
     * between pages much faster. For details about the different types
     * of caches and their purposes see:
     * http://webkit.org/blog/427/webkit-page-cache-i-the-basics/
     */
    public var enablePageCache: Boolean
        /**
         * Get the #WebKitSettings:enable-page-cache property.
         *
         * @return true if page cache enabled or false otherwise.
         */
        get() = webkit_settings_get_enable_page_cache(webkitSettingsPointer).asBoolean()

        /**
         * Set the #WebKitSettings:enable-page-cache property.
         *
         * @param enabled Value to be set
         */
        set(enabled) = webkit_settings_set_enable_page_cache(webkitSettingsPointer, enabled.asGBoolean())

    /**
     * Determines whether or not text areas can be resized.
     */
    public var enableResizableTextAreas: Boolean
        /**
         * Get the #WebKitSettings:enable-resizable-text-areas property.
         *
         * @return true If text areas can be resized or false otherwise.
         */
        get() = webkit_settings_get_enable_resizable_text_areas(webkitSettingsPointer).asBoolean()

        /**
         * Set the #WebKitSettings:enable-resizable-text-areas property.
         *
         * @param enabled Value to be set
         */
        set(enabled) = webkit_settings_set_enable_resizable_text_areas(webkitSettingsPointer, enabled.asGBoolean())

    /**
     * Whether to turn on site-specific quirks. Turning this on will
     * tell WebKit to use some site-specific workarounds for
     * better web compatibility. For example, older versions of
     * MediaWiki will incorrectly send to WebKit a CSS file with KHTML
     * workarounds. By turning on site-specific quirks, WebKit will
     * special-case this and other cases to make some specific sites work.
     */
    public var enableSiteSpecificQuirks: Boolean
        /**
         * Get the #WebKitSettings:enable-site-specific-quirks property.
         *
         * @return true if site specific quirks are enabled or false otherwise.
         */
        get() = webkit_settings_get_enable_site_specific_quirks(webkitSettingsPointer).asBoolean()

        /**
         * Set the #WebKitSettings:enable-site-specific-quirks property.
         *
         * @param enabled Value to be set
         */
        set(enabled) = webkit_settings_set_enable_site_specific_quirks(webkitSettingsPointer, enabled.asGBoolean())

    /**
     * Enable or disable smooth scrolling.
     */
    public var enableSmoothScrolling: Boolean
        /**
         * Get the #WebKitSettings:enable-smooth-scrolling property.
         *
         * @return true if smooth scrolling is enabled or false otherwise.
         */
        get() = webkit_settings_get_enable_smooth_scrolling(webkitSettingsPointer).asBoolean()

        /**
         * Set the #WebKitSettings:enable-smooth-scrolling property.
         *
         * @param enabled Value to be set
         */
        set(enabled) = webkit_settings_set_enable_smooth_scrolling(webkitSettingsPointer, enabled.asGBoolean())

    /**
     * Whether to enable Spatial Navigation. This feature consists in the ability
     * to navigate between focusable elements in a Web page, such as hyperlinks
     * and form controls, by using Left, Right, Up and Down arrow keys.
     * For example, if an user presses the Right key, heuristics determine whether
     * there is an element they might be trying to reach towards the right, and if
     * there are multiple elements, which element they probably wants.
     *
     * @since 2.4
     */
    @WebKitVersion2_4
    public var enableSpatialNavigation: Boolean
        /**
         * Get the #WebKitSettings:enable-spatial-navigation property.
         *
         * @return true If HTML5 spatial navigation support is enabled or false otherwise.
         * @since 2.2
         */
        get() = webkit_settings_get_enable_spatial_navigation(webkitSettingsPointer).asBoolean()

        /**
         * Set the #WebKitSettings:enable-spatial-navigation property.
         *
         * @param enabled Value to be set
         * @since 2.2
         */
        @WebKitVersion2_2
        set(enabled) = webkit_settings_set_enable_spatial_navigation(webkitSettingsPointer, enabled.asGBoolean())

    /**
     * Determines whether the tab key cycles through the elements on the page.
     * When this setting is enabled, users will be able to focus the next element
     * in the page by pressing the tab key. If the selected element is editable,
     * then pressing tab key will insert the tab character.
     */
    public var enableTabsToLinks: Boolean
        /**
         * Get the #WebKitSettings:enable-tabs-to-links property.
         *
         * @return true If tabs to link is enabled or false otherwise.
         */
        get() = webkit_settings_get_enable_tabs_to_links(webkitSettingsPointer).asBoolean()

        /**
         * Set the #WebKitSettings:enable-tabs-to-links property.
         *
         * @param enabled Value to be set
         */
        set(enabled) = webkit_settings_set_enable_tabs_to_links(webkitSettingsPointer, enabled.asGBoolean())

    /**
     * Enable or disable support for WebAudio on pages. WebAudio is an
     * API for processing and synthesizing audio in web applications
     *
     * See also https://webaudio.github.io/web-audio-api
     */
    public var enableWebaudio: Boolean
        /**
         * Get the #WebKitSettings:enable-webaudio property.
         *
         * @return true If webaudio support is enabled or false otherwise.
         */
        get() = webkit_settings_get_enable_webaudio(webkitSettingsPointer).asBoolean()

        /**
         * Set the #WebKitSettings:enable-webaudio property.
         *
         * @param enabled Value to be set
         */
        set(enabled) = webkit_settings_set_enable_webaudio(webkitSettingsPointer, enabled.asGBoolean())

    /**
     * Enable or disable support for WebGL on pages. WebGL enables web
     * content to use an API based on OpenGL ES 2.0.
     */
    public var enableWebgl: Boolean
        /**
         * Get the #WebKitSettings:enable-webgl property.
         *
         * @return true If WebGL support is enabled or false otherwise.
         */
        get() = webkit_settings_get_enable_webgl(webkitSettingsPointer).asBoolean()

        /**
         * Set the #WebKitSettings:enable-webgl property.
         *
         * @param enabled Value to be set
         */
        set(enabled) = webkit_settings_set_enable_webgl(webkitSettingsPointer, enabled.asGBoolean())

    /**
     * Enable WebRTC support for loaded pages.
     *
     * Enabling this setting implies that [property@Settings:enable-media-stream]
     * will be enabled as well.
     *
     * See also https://www.w3.org/TR/webrtc/
     *
     * @since 2.38
     */
    @WebKitVersion2_38
    public var enableWebrtc: Boolean
        /**
         * Get the [property@Settings:enable-webrtc] property.
         *
         * @return true If WebRTC support is enabled or false otherwise.
         * @since 2.38
         */
        get() = webkit_settings_get_enable_webrtc(webkitSettingsPointer).asBoolean()

        /**
         * Set the [property@Settings:enable-webrtc] property.
         *
         * Setting this property to true implies the media-stream web-setting will also be enabled.
         *
         * @param enabled Value to be set
         * @since 2.38
         */
        @WebKitVersion2_38
        set(enabled) = webkit_settings_set_enable_webrtc(webkitSettingsPointer, enabled.asGBoolean())

    /**
     * Enable or disable writing console messages to stdout. These are messages
     * sent to the console with console.log and related methods.
     *
     * @since 2.2
     */
    @WebKitVersion2_2
    public var enableWriteConsoleMessagesToStdout: Boolean
        /**
         * Get the #WebKitSettings:enable-write-console-messages-to-stdout property.
         *
         * @return true if writing console messages to stdout is enabled or false
         * otherwise.
         * @since 2.2
         */
        get() = webkit_settings_get_enable_write_console_messages_to_stdout(webkitSettingsPointer).asBoolean()

        /**
         * Set the #WebKitSettings:enable-write-console-messages-to-stdout property.
         *
         * @param enabled Value to be set
         * @since 2.2
         */
        @WebKitVersion2_2
        set(
            enabled
        ) = webkit_settings_set_enable_write_console_messages_to_stdout(webkitSettingsPointer, enabled.asGBoolean())

    /**
     * The font family used as the default for content using a fantasy font.
     */
    public var fantasyFontFamily: String
        /**
         * Gets the #WebKitSettings:fantasy-font-family property.
         *
         * @return The default font family used to display content marked with fantasy font.
         */
        get() = webkit_settings_get_fantasy_font_family(webkitSettingsPointer)?.toKString()
            ?: error("Expected not null string")

        /**
         * Set the #WebKitSettings:fantasy-font-family property.
         *
         * @param fantasyFontFamily the new default fantasy font family
         */
        set(fantasyFontFamily) = webkit_settings_set_fantasy_font_family(webkitSettingsPointer, fantasyFontFamily)

    /**
     * The #WebKitHardwareAccelerationPolicy to decide how to enable and disable
     * hardware acceleration. Disabling hardware acceleration might
     * cause some websites to not render correctly or consume more CPU.
     *
     * Note that changing this setting might not be possible if hardware acceleration is not
     * supported by the hardware or the system. In that case, you can get the value to know the
     * actual policy being used, but changing the setting will not have any effect.
     *
     * @since 2.16
     */
    @WebKitVersion2_16
    public var hardwareAccelerationPolicy: HardwareAccelerationPolicy
        /**
         * Get the #WebKitSettings:hardware-acceleration-policy property.
         *
         * @return a #WebKitHardwareAccelerationPolicy
         * @since 2.16
         */
        get() = webkit_settings_get_hardware_acceleration_policy(webkitSettingsPointer).run {
            HardwareAccelerationPolicy.fromNativeValue(this)
        }

        /**
         * Set the #WebKitSettings:hardware-acceleration-policy property.
         *
         * @param policy a #WebKitHardwareAccelerationPolicy
         * @since 2.16
         */
        @WebKitVersion2_16
        set(policy) = webkit_settings_set_hardware_acceleration_policy(webkitSettingsPointer, policy.nativeValue)

    /**
     * Whether JavaScript can access the clipboard. The default value is false. If
     * set to true, document.execCommand() allows cut, copy and paste commands.
     */
    public var javascriptCanAccessClipboard: Boolean
        /**
         * Get the #WebKitSettings:javascript-can-access-clipboard property.
         *
         * @return true If javascript-can-access-clipboard is enabled or false otherwise.
         */
        get() = webkit_settings_get_javascript_can_access_clipboard(webkitSettingsPointer).asBoolean()

        /**
         * Set the #WebKitSettings:javascript-can-access-clipboard property.
         *
         * @param enabled Value to be set
         */
        set(enabled) = webkit_settings_set_javascript_can_access_clipboard(webkitSettingsPointer, enabled.asGBoolean())

    /**
     * Whether JavaScript can open popup windows automatically without user
     * intervention.
     */
    public var javascriptCanOpenWindowsAutomatically: Boolean
        /**
         * Get the #WebKitSettings:javascript-can-open-windows-automatically property.
         *
         * @return true If JavaScript can open window automatically or false otherwise.
         */
        get() = webkit_settings_get_javascript_can_open_windows_automatically(webkitSettingsPointer).asBoolean()

        /**
         * Set the #WebKitSettings:javascript-can-open-windows-automatically property.
         *
         * @param enabled Value to be set
         */
        set(
            enabled
        ) = webkit_settings_set_javascript_can_open_windows_automatically(webkitSettingsPointer, enabled.asGBoolean())

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 2.42.
     * ---
     *
     * Unsupported setting. This property does nothing.
     */
    public var loadIconsIgnoringImageLoadSetting: Boolean
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 2.42.
         * ---
         *
         * Setting no longer supported. This function returns false.
         *
         * @return false
         */
        get() = webkit_settings_get_load_icons_ignoring_image_load_setting(webkitSettingsPointer).asBoolean()

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 2.42.
         * ---
         *
         * Setting no longer supported. This function does nothing.
         *
         * @param enabled Value to be set
         */
        set(
            enabled
        ) = webkit_settings_set_load_icons_ignoring_image_load_setting(webkitSettingsPointer, enabled.asGBoolean())

    /**
     * Whether media playback is full-screen only or inline playback is allowed.
     * This is true by default, so media playback can be inline. Setting it to
     * false allows specifying that media playback should be always fullscreen.
     */
    public var mediaPlaybackAllowsInline: Boolean
        /**
         * Get the #WebKitSettings:media-playback-allows-inline property.
         *
         * @return true If inline playback is allowed for media
         *    or false if only fullscreen playback is allowed.
         */
        get() = webkit_settings_get_media_playback_allows_inline(webkitSettingsPointer).asBoolean()

        /**
         * Set the #WebKitSettings:media-playback-allows-inline property.
         *
         * @param enabled Value to be set
         */
        set(enabled) = webkit_settings_set_media_playback_allows_inline(webkitSettingsPointer, enabled.asGBoolean())

    /**
     * Whether a user gesture (such as clicking the play button)
     * would be required to start media playback or load media. This is off
     * by default, so media playback could start automatically.
     * Setting it on requires a gesture by the user to start playback, or to
     * load the media.
     */
    public var mediaPlaybackRequiresUserGesture: Boolean
        /**
         * Get the #WebKitSettings:media-playback-requires-user-gesture property.
         *
         * @return true If an user gesture is needed to play or load media
         *    or false if no user gesture is needed.
         */
        get() = webkit_settings_get_media_playback_requires_user_gesture(webkitSettingsPointer).asBoolean()

        /**
         * Set the #WebKitSettings:media-playback-requires-user-gesture property.
         *
         * @param enabled Value to be set
         */
        set(
            enabled
        ) = webkit_settings_set_media_playback_requires_user_gesture(webkitSettingsPointer, enabled.asGBoolean())

    /**
     * The minimum font size in pixels used to display text. This setting
     * controls the absolute smallest size. Values other than 0 can
     * potentially break page layouts.
     */
    public var minimumFontSize: guint
        /**
         * Gets the #WebKitSettings:minimum-font-size property.
         *
         * @return Minimum font size, in pixels.
         */
        get() = webkit_settings_get_minimum_font_size(webkitSettingsPointer)

        /**
         * Set the #WebKitSettings:minimum-font-size property.
         *
         * @param fontSize minimum font size to be set in pixels
         */
        set(fontSize) = webkit_settings_set_minimum_font_size(webkitSettingsPointer, fontSize)

    /**
     * The font family used as the default for content using a monospace font.
     */
    public var monospaceFontFamily: String
        /**
         * Gets the #WebKitSettings:monospace-font-family property.
         *
         * @return Default font family used to display content marked with monospace font.
         */
        get() = webkit_settings_get_monospace_font_family(webkitSettingsPointer)?.toKString()
            ?: error("Expected not null string")

        /**
         * Set the #WebKitSettings:monospace-font-family property.
         *
         * @param monospaceFontFamily the new default monospace font family
         */
        set(monospaceFontFamily) = webkit_settings_set_monospace_font_family(webkitSettingsPointer, monospaceFontFamily)

    /**
     * The font family used as the default for content using a pictograph font.
     */
    public var pictographFontFamily: String
        /**
         * Gets the #WebKitSettings:pictograph-font-family property.
         *
         * @return The default font family used to display content marked with pictograph font.
         */
        get() = webkit_settings_get_pictograph_font_family(webkitSettingsPointer)?.toKString()
            ?: error("Expected not null string")

        /**
         * Set the #WebKitSettings:pictograph-font-family property.
         *
         * @param pictographFontFamily the new default pictograph font family
         */
        set(
            pictographFontFamily
        ) = webkit_settings_set_pictograph_font_family(webkitSettingsPointer, pictographFontFamily)

    /**
     * Whether background images should be drawn during printing.
     */
    public var printBackgrounds: Boolean
        /**
         * Get the #WebKitSettings:print-backgrounds property.
         *
         * @return true If background images should be printed or false otherwise.
         */
        get() = webkit_settings_get_print_backgrounds(webkitSettingsPointer).asBoolean()

        /**
         * Set the #WebKitSettings:print-backgrounds property.
         *
         * @param printBackgrounds Value to be set
         */
        set(
            printBackgrounds
        ) = webkit_settings_set_print_backgrounds(webkitSettingsPointer, printBackgrounds.asGBoolean())

    /**
     * The font family used as the default for content using a sans-serif font.
     */
    public var sansSerifFontFamily: String
        /**
         * Gets the #WebKitSettings:sans-serif-font-family property.
         *
         * @return The default font family used to display content marked with sans-serif font.
         */
        get() = webkit_settings_get_sans_serif_font_family(webkitSettingsPointer)?.toKString()
            ?: error("Expected not null string")

        /**
         * Set the #WebKitSettings:sans-serif-font-family property.
         *
         * @param sansSerifFontFamily the new default sans-serif font family
         */
        set(
            sansSerifFontFamily
        ) = webkit_settings_set_sans_serif_font_family(webkitSettingsPointer, sansSerifFontFamily)

    /**
     * The font family used as the default for content using a serif font.
     */
    public var serifFontFamily: String
        /**
         * Gets the #WebKitSettings:serif-font-family property.
         *
         * @return The default font family used to display content marked with serif font.
         */
        get() = webkit_settings_get_serif_font_family(webkitSettingsPointer)?.toKString()
            ?: error("Expected not null string")

        /**
         * Set the #WebKitSettings:serif-font-family property.
         *
         * @param serifFontFamily the new default serif font family
         */
        set(serifFontFamily) = webkit_settings_set_serif_font_family(webkitSettingsPointer, serifFontFamily)

    /**
     * Whether #WebKitWebView:zoom-level affects only the
     * text of the page or all the contents. Other contents containing text
     * like form controls will be also affected by zoom factor when
     * this property is enabled.
     */
    public var zoomTextOnly: Boolean
        /**
         * Get the #WebKitSettings:zoom-text-only property.
         *
         * @return true If zoom level of the view should only affect the text
         *    or false if all view contents should be scaled.
         */
        get() = webkit_settings_get_zoom_text_only(webkitSettingsPointer).asBoolean()

        /**
         * Set the #WebKitSettings:zoom-text-only property.
         *
         * @param zoomTextOnly Value to be set
         */
        set(zoomTextOnly) = webkit_settings_set_zoom_text_only(webkitSettingsPointer, zoomTextOnly.asGBoolean())

    /**
     * Creates a new #WebKitSettings instance with default values.
     *
     * It must be manually attached to a #WebKitWebView.
     * See also webkit_settings_new_with_settings().
     *
     * @return a new #WebKitSettings instance.
     */
    public constructor() : this(webkit_settings_new()!!) {
        InstanceCache.put(this)
    }

    /**
     * Reads the contents of the given @group_name from the given @key_file and apply the value of
     * each key/value to the corresponding property on the @settings.
     *
     * Value types have to match with the corresponding setting property type and the group keys have to
     * match existing setting property names. If those conditions are not met, the function will return
     * false.
     *
     * Supported value types are strings (unquoted), booleans (0, 1, true, false) and unsigned integers.
     *
     * @param keyFile a #GKeyFile
     * @param groupName Name of the group to read from @key_file
     * @return true if the settings were correctly applied or false on error.
     * @since 2.46
     */
    @WebKitVersion2_46
    public fun applyFromKeyFile(keyFile: KeyFile, groupName: String): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = webkit_settings_apply_from_key_file(
            webkitSettingsPointer,
            keyFile.glibKeyFilePointer,
            groupName,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    /**
     * Gets whether a feature is enabled.
     *
     * @param feature the feature to toggle.
     * @return Whether the feature is enabled.
     * @since 2.42
     */
    @WebKitVersion2_42
    public fun getFeatureEnabled(feature: Feature): Boolean =
        webkit_settings_get_feature_enabled(webkitSettingsPointer, feature.webkitFeaturePointer).asBoolean()

    /**
     * Gets the #WebKitSettings:media-content-types-requiring-hardware-support property.
     *
     * @return Media content types requiring hardware support, or null.
     * @since 2.30
     */
    @WebKitVersion2_30
    public fun getMediaContentTypesRequiringHardwareSupport(): String =
        webkit_settings_get_media_content_types_requiring_hardware_support(webkitSettingsPointer)?.toKString()
            ?: error("Expected not null string")

    /**
     * Get the #WebKitSettings:user-agent property.
     *
     * @return The current value of the user-agent property.
     */
    public fun getUserAgent(): String =
        webkit_settings_get_user_agent(webkitSettingsPointer)?.toKString() ?: error("Expected not null string")

    /**
     * Enables or disables a feature.
     *
     * The current status of the feature can be determined with
     * [id@webkit_settings_get_feature_enabled]. To reset a feature to its
     * initial status, pass the value returned by
     * [id@webkit_feature_get_default_value] as the @enabled parameter.
     *
     * @param feature the feature to toggle.
     * @param enabled whether the feature will be enabled.
     * @since 2.42
     */
    @WebKitVersion2_42
    public fun setFeatureEnabled(feature: Feature, enabled: Boolean): Unit =
        webkit_settings_set_feature_enabled(webkitSettingsPointer, feature.webkitFeaturePointer, enabled.asGBoolean())

    /**
     * Set the #WebKitSettings:media-content-types-requiring-hardware-support property.
     *
     * @param contentTypes list of media content types requiring hardware support split by semicolons (:) or null to use the default value.
     * @since 2.30
     */
    @WebKitVersion2_30
    public fun setMediaContentTypesRequiringHardwareSupport(contentTypes: String? = null): Unit =
        webkit_settings_set_media_content_types_requiring_hardware_support(webkitSettingsPointer, contentTypes)

    /**
     * Set the #WebKitSettings:user-agent property.
     *
     * @param userAgent The new custom user agent string or null to use the default user agent
     */
    public fun setUserAgent(userAgent: String? = null): Unit =
        webkit_settings_set_user_agent(webkitSettingsPointer, userAgent)

    /**
     * Set the #WebKitSettings:user-agent property by appending the application details.
     *
     * Set the #WebKitSettings:user-agent property by appending the application details to the default user
     * agent. If no application name or version is given, the default user agent used will be used. If only
     * the version is given, the default engine version is used with the given application name.
     *
     * @param applicationName The application name used for the user agent or null to use the default user agent.
     * @param applicationVersion The application version for the user agent or null to user the default version.
     */
    public fun setUserAgentWithApplicationDetails(
        applicationName: String? = null,
        applicationVersion: String? = null,
    ): Unit = webkit_settings_set_user_agent_with_application_details(
        webkitSettingsPointer,
        applicationName,
        applicationVersion
    )

    public companion object : TypeCompanion<Settings> {
        override val type: GeneratedClassKGType<Settings> =
            GeneratedClassKGType(getTypeOrNull()!!) { Settings(it.reinterpret()) }

        init {
            WebKitTypeProvider.register()
        }

        /**
         * Convert @points to the equivalent value in pixels.
         *
         * Convert @points to the equivalent value in pixels, based on the current
         * screen DPI. Applications can use this function to convert font size values
         * in points to font size values in pixels when setting the font size properties
         * of #WebKitSettings.
         *
         * @param points the font size in points to convert to pixels
         * @return the equivalent font size in pixels.
         * @since 2.20
         */
        @WebKitVersion2_20
        public fun fontSizeToPixels(points: guint): guint = webkit_settings_font_size_to_pixels(points)

        /**
         * Convert @pixels to the equivalent value in points.
         *
         * Convert @pixels to the equivalent value in points, based on the current
         * screen DPI. Applications can use this function to convert font size values
         * in pixels to font size values in points when getting the font size properties
         * of #WebKitSettings.
         *
         * @param pixels the font size in pixels to convert to points
         * @return the equivalent font size in points.
         * @since 2.20
         */
        @WebKitVersion2_20
        public fun fontSizeToPoints(pixels: guint): guint = webkit_settings_font_size_to_points(pixels)

        /**
         * Gets the list of all available WebKit features.
         *
         * Features can be toggled with [method@Settings.set_feature_enabled],
         * and their current state determined with
         * [method@Settings.get_feature_enabled].
         *
         * Note that most applications should use
         * [func@Settings.get_development_features] and
         * [func@Settings.get_experimental_features] instead.
         *
         * @return List of all features.
         * @since 2.42
         */
        @WebKitVersion2_42
        public fun getAllFeatures(): FeatureList = webkit_settings_get_all_features()!!.run {
            FeatureList(this)
        }

        /**
         * Gets the list of available development WebKit features.
         *
         * The returned features are a subset of those returned by
         * [func@Settings.get_all_features], and includes those which
         * web and WebKit developers might find useful, but in general should
         * *not* be exposed to end users; see [enum@FeatureStatus] for
         * more details.
         *
         * @return List of development features.
         * @since 2.42
         */
        @WebKitVersion2_42
        public fun getDevelopmentFeatures(): FeatureList = webkit_settings_get_development_features()!!.run {
            FeatureList(this)
        }

        /**
         * Gets the list of available experimental WebKit features.
         *
         * The returned features are a subset of those returned by
         * [func@Settings.get_all_features], and includes those which
         * certain applications may want to expose to end users; see
         * [enum@FeatureStatus] for more details.
         *
         * @return List of experimental features.
         * @since 2.42
         */
        @WebKitVersion2_42
        public fun getExperimentalFeatures(): FeatureList = webkit_settings_get_experimental_features()!!.run {
            FeatureList(this)
        }

        /**
         * Get the GType of Settings
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_settings_get_type()

        /**
         * Gets the GType of from the symbol `webkit_settings_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("webkit_settings_get_type")
    }
}

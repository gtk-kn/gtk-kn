// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_8
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitHitTestResult
import org.gtkkn.native.webkit.webkit_hit_test_result_context_is_editable
import org.gtkkn.native.webkit.webkit_hit_test_result_context_is_image
import org.gtkkn.native.webkit.webkit_hit_test_result_context_is_link
import org.gtkkn.native.webkit.webkit_hit_test_result_context_is_media
import org.gtkkn.native.webkit.webkit_hit_test_result_context_is_scrollbar
import org.gtkkn.native.webkit.webkit_hit_test_result_context_is_selection
import org.gtkkn.native.webkit.webkit_hit_test_result_get_context
import org.gtkkn.native.webkit.webkit_hit_test_result_get_image_uri
import org.gtkkn.native.webkit.webkit_hit_test_result_get_link_label
import org.gtkkn.native.webkit.webkit_hit_test_result_get_link_title
import org.gtkkn.native.webkit.webkit_hit_test_result_get_link_uri
import org.gtkkn.native.webkit.webkit_hit_test_result_get_media_uri
import org.gtkkn.native.webkit.webkit_hit_test_result_get_type
import kotlin.Boolean
import kotlin.String

/**
 * Result of a Hit Test.
 *
 * A Hit Test is an operation to get context information about a given
 * point in a #WebKitWebView. #WebKitHitTestResult represents the
 * result of a Hit Test. It provides context information about what is
 * at the coordinates of the Hit Test, such as if there's a link,
 * an image or a media.
 *
 * You can get the context of the HitTestResult with
 * webkit_hit_test_result_get_context() that returns a bitmask of
 * #WebKitHitTestResultContext flags. You can also use
 * webkit_hit_test_result_context_is_link(), webkit_hit_test_result_context_is_image() and
 * webkit_hit_test_result_context_is_media() to determine whether there's
 * a link, image or a media element at the coordinates of the Hit Test.
 * Note that it's possible that several #WebKitHitTestResultContext flags
 * are active at the same time, for example if there's a link containing an image.
 *
 * When the mouse is moved over a #WebKitWebView a Hit Test is performed
 * for the mouse coordinates and #WebKitWebView::mouse-target-changed
 * signal is emitted with a #WebKitHitTestResult.
 */
public class HitTestResult(public val webkitHitTestResultPointer: CPointer<WebKitHitTestResult>) :
    Object(webkitHitTestResultPointer.reinterpret()),
    KGTyped {
    init {
        WebKit
    }

    /**
     * Bitmask of #WebKitHitTestResultContext flags representing
     * the context of the #WebKitHitTestResult.
     */
    public val context: guint
        /**
         * Gets the value of the #WebKitHitTestResult:context property.
         *
         * @return a bitmask of #WebKitHitTestResultContext flags
         */
        get() = webkit_hit_test_result_get_context(webkitHitTestResultPointer)

    /**
     * The URI of the image if flag %WEBKIT_HIT_TEST_RESULT_CONTEXT_IMAGE
     * is present in #WebKitHitTestResult:context
     */
    public val imageUri: String
        /**
         * Gets the value of the #WebKitHitTestResult:image-uri property.
         *
         * @return the URI of the image element in the coordinates of the Hit Test,
         *    or null if there isn't an image element in @hit_test_result context
         */
        get() = webkit_hit_test_result_get_image_uri(webkitHitTestResultPointer)?.toKString()
            ?: error("Expected not null string")

    /**
     * The label of the link if flag %WEBKIT_HIT_TEST_RESULT_CONTEXT_LINK
     * is present in #WebKitHitTestResult:context
     */
    public val linkLabel: String
        /**
         * Gets the value of the #WebKitHitTestResult:link-label property.
         *
         * @return the label of the link element in the coordinates of the Hit Test,
         *    or null if there isn't a link element in @hit_test_result context or the
         *    link element doesn't have a label
         */
        get() = webkit_hit_test_result_get_link_label(webkitHitTestResultPointer)?.toKString()
            ?: error("Expected not null string")

    /**
     * The title of the link if flag %WEBKIT_HIT_TEST_RESULT_CONTEXT_LINK
     * is present in #WebKitHitTestResult:context
     */
    public val linkTitle: String
        /**
         * Gets the value of the #WebKitHitTestResult:link-title property.
         *
         * @return the title of the link element in the coordinates of the Hit Test,
         *    or null if there isn't a link element in @hit_test_result context or the
         *    link element doesn't have a title
         */
        get() = webkit_hit_test_result_get_link_title(webkitHitTestResultPointer)?.toKString()
            ?: error("Expected not null string")

    /**
     * The URI of the link if flag %WEBKIT_HIT_TEST_RESULT_CONTEXT_LINK
     * is present in #WebKitHitTestResult:context
     */
    public val linkUri: String
        /**
         * Gets the value of the #WebKitHitTestResult:link-uri property.
         *
         * @return the URI of the link element in the coordinates of the Hit Test,
         *    or null if there isn't a link element in @hit_test_result context
         */
        get() = webkit_hit_test_result_get_link_uri(webkitHitTestResultPointer)?.toKString()
            ?: error("Expected not null string")

    /**
     * The URI of the media if flag %WEBKIT_HIT_TEST_RESULT_CONTEXT_MEDIA
     * is present in #WebKitHitTestResult:context
     */
    public val mediaUri: String
        /**
         * Gets the value of the #WebKitHitTestResult:media-uri property.
         *
         * @return the URI of the media element in the coordinates of the Hit Test,
         *    or null if there isn't a media element in @hit_test_result context
         */
        get() = webkit_hit_test_result_get_media_uri(webkitHitTestResultPointer)?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets whether %WEBKIT_HIT_TEST_RESULT_CONTEXT_EDITABLE flag is present in
     * #WebKitHitTestResult:context.
     *
     * @return true if there's an editable element at the coordinates of the @hit_test_result,
     *    or false otherwise
     */
    public fun contextIsEditable(): Boolean =
        webkit_hit_test_result_context_is_editable(webkitHitTestResultPointer).asBoolean()

    /**
     * Gets whether %WEBKIT_HIT_TEST_RESULT_CONTEXT_IMAGE flag is present in
     * #WebKitHitTestResult:context.
     *
     * @return true if there's an image element in the coordinates of the Hit Test,
     *    or false otherwise
     */
    public fun contextIsImage(): Boolean =
        webkit_hit_test_result_context_is_image(webkitHitTestResultPointer).asBoolean()

    /**
     * Gets whether %WEBKIT_HIT_TEST_RESULT_CONTEXT_LINK flag is present in
     * #WebKitHitTestResult:context.
     *
     * @return true if there's a link element in the coordinates of the Hit Test,
     *    or false otherwise
     */
    public fun contextIsLink(): Boolean = webkit_hit_test_result_context_is_link(webkitHitTestResultPointer).asBoolean()

    /**
     * Gets whether %WEBKIT_HIT_TEST_RESULT_CONTEXT_MEDIA flag is present in
     * #WebKitHitTestResult:context.
     *
     * @return true if there's a media element in the coordinates of the Hit Test,
     *    or false otherwise
     */
    public fun contextIsMedia(): Boolean =
        webkit_hit_test_result_context_is_media(webkitHitTestResultPointer).asBoolean()

    /**
     * Gets whether %WEBKIT_HIT_TEST_RESULT_CONTEXT_SCROLLBAR flag is present in
     * #WebKitHitTestResult:context.
     *
     * @return true if there's a scrollbar element at the coordinates of the @hit_test_result,
     *    or false otherwise
     */
    public fun contextIsScrollbar(): Boolean =
        webkit_hit_test_result_context_is_scrollbar(webkitHitTestResultPointer).asBoolean()

    /**
     * Gets whether %WEBKIT_HIT_TEST_RESULT_CONTEXT_SELECTION flag is present in
     * #WebKitHitTestResult:context.
     *
     * @return true if there's a selected element at the coordinates of the @hit_test_result,
     *    or false otherwise
     * @since 2.8
     */
    @WebKitVersion2_8
    public fun contextIsSelection(): Boolean =
        webkit_hit_test_result_context_is_selection(webkitHitTestResultPointer).asBoolean()

    public companion object : TypeCompanion<HitTestResult> {
        override val type: GeneratedClassKGType<HitTestResult> =
            GeneratedClassKGType(getTypeOrNull()!!) { HitTestResult(it.reinterpret()) }

        init {
            WebKitTypeProvider.register()
        }

        /**
         * Get the GType of HitTestResult
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_hit_test_result_get_type()

        /**
         * Gets the GType of from the symbol `webkit_hit_test_result_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("webkit_hit_test_result_get_type")
    }
}

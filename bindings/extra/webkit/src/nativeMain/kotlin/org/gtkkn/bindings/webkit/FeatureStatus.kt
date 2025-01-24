// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_42
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitFeatureStatus
import org.gtkkn.native.webkit.webkit_feature_status_get_type

/**
 * Describes the status of a [struct@WebKitFeature].
 *
 * The status for a given feature can be obtained with
 * [id@webkit_feature_get_status].
 * @since 2.42
 */
@WebKitVersion2_42
public enum class FeatureStatus(public val nativeValue: WebKitFeatureStatus) {
    /**
     * Feature that adjust behaviour for
     *   specific application needs. The feature is not part of a Web platform
     *   feature, not a mature feature intended to be always on.
     */
    EMBEDDER(WebKitFeatureStatus.WEBKIT_FEATURE_STATUS_EMBEDDER),

    /**
     * Feature in development. The feature
     *   may be unfinished, and there are no guarantees about its safety and
     *   stability.
     */
    UNSTABLE(WebKitFeatureStatus.WEBKIT_FEATURE_STATUS_UNSTABLE),

    /**
     * Feature for debugging the WebKit engine.
     *   The feature is not generally useful for user or web developers, and
     *   always disabled by default.
     */
    INTERNAL(WebKitFeatureStatus.WEBKIT_FEATURE_STATUS_INTERNAL),

    /**
     * Feature for web developers. The feature
     *   is not generally useful for end users, and always disabled by default.
     */
    DEVELOPER(WebKitFeatureStatus.WEBKIT_FEATURE_STATUS_DEVELOPER),

    /**
     * Feature in active development and
     *   complete enough for testing. The feature may not be yet ready to
     *   ship and is disabled by default.
     */
    TESTABLE(WebKitFeatureStatus.WEBKIT_FEATURE_STATUS_TESTABLE),

    /**
     * Feature ready to be tested by users.
     *   The feature is disabled by default, but may be enabled by applications
     *   automatically e.g. in their “technology preview” or “beta” versions.
     */
    PREVIEW(WebKitFeatureStatus.WEBKIT_FEATURE_STATUS_PREVIEW),

    /**
     * Feature ready for general use. The
     *   feature is enabled by default, but it may still be toggled to support
     *   debugging and testing.
     */
    STABLE(WebKitFeatureStatus.WEBKIT_FEATURE_STATUS_STABLE),

    /**
     * Feature in general use. The feature is
     *   always enabled and in general there should be no user-facing interface
     *   to toggle it.
     */
    MATURE(WebKitFeatureStatus.WEBKIT_FEATURE_STATUS_MATURE),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: WebKitFeatureStatus): FeatureStatus = when (nativeValue) {
            WebKitFeatureStatus.WEBKIT_FEATURE_STATUS_EMBEDDER -> EMBEDDER
            WebKitFeatureStatus.WEBKIT_FEATURE_STATUS_UNSTABLE -> UNSTABLE
            WebKitFeatureStatus.WEBKIT_FEATURE_STATUS_INTERNAL -> INTERNAL
            WebKitFeatureStatus.WEBKIT_FEATURE_STATUS_DEVELOPER -> DEVELOPER
            WebKitFeatureStatus.WEBKIT_FEATURE_STATUS_TESTABLE -> TESTABLE
            WebKitFeatureStatus.WEBKIT_FEATURE_STATUS_PREVIEW -> PREVIEW
            WebKitFeatureStatus.WEBKIT_FEATURE_STATUS_STABLE -> STABLE
            WebKitFeatureStatus.WEBKIT_FEATURE_STATUS_MATURE -> MATURE
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of FeatureStatus
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_feature_status_get_type()
    }
}

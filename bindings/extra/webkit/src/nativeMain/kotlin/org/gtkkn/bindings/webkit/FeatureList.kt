// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointer
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_42
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.gsize
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.webkit.WebKitFeatureList
import org.gtkkn.native.webkit.webkit_feature_list_get
import org.gtkkn.native.webkit.webkit_feature_list_get_length
import org.gtkkn.native.webkit.webkit_feature_list_get_type
import org.gtkkn.native.webkit.webkit_feature_list_ref
import org.gtkkn.native.webkit.webkit_feature_list_unref
import kotlin.Unit

/**
 * Contains a set of toggle-able web engine features.
 *
 * The list supports passing around a set of [struct@Feature] objects and
 * iterating over them:
 *
 * ```c
 * g_autoptr(WebKitFeatureList) list = webkit_settings_get_experimental_features();
 * for (gsize i = 0; i < webkit_feature_list_get_length(list): i++) {
 *     WebKitFeature *feature = webkit_feature_list_get(list, i);
 *     // Do something with "feature".
 * }
 * ```
 *
 * Lists of features can be obtained with
 * [func@Settings.get_experimental_features],
 * [func@Settings.get_development_features], and
 * [func@Settings.get_all_features].
 * @since 2.42
 */
@WebKitVersion2_42
public class FeatureList(public val webkitFeatureListPointer: CPointer<WebKitFeatureList>) :
    ProxyInstance(webkitFeatureListPointer) {
    /**
     * Gets a feature given its index.
     *
     * @param index index of the feature
     * @return The feature at @index.
     * @since 2.42
     */
    @WebKitVersion2_42
    public fun `get`(index: gsize): Feature = webkit_feature_list_get(webkitFeatureListPointer, index)!!.run {
        Feature(this)
    }

    /**
     * Gets the number of elements in the feature list.
     *
     * @return number of elements.
     *
     * Since 2.42
     */
    public fun getLength(): gsize = webkit_feature_list_get_length(webkitFeatureListPointer)

    /**
     * Atomically acquires a reference on the given @feature_list.
     *
     * This function is MT-safe and may be called from any thread.
     *
     * @return The same @feature_list with an additional reference.
     * @since 2.42
     */
    @WebKitVersion2_42
    public fun ref(): FeatureList = webkit_feature_list_ref(webkitFeatureListPointer)!!.run {
        FeatureList(this)
    }

    /**
     * Atomically releases a reference on the given @feature_list.
     *
     * If the reference was the last, the resources associated to the
     * @feature_list are freed. This function is MT-safe and may be called
     * from any thread.
     *
     * @since 2.42
     */
    @WebKitVersion2_42
    public fun unref(): Unit = webkit_feature_list_unref(webkitFeatureListPointer)

    public companion object {
        /**
         * Get the GType of FeatureList
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_feature_list_get_type()
    }
}

// This is a generated file. Do not modify.
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_42
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.webkit.WebKitFeature
import org.gtkkn.native.webkit.webkit_feature_get_category
import org.gtkkn.native.webkit.webkit_feature_get_default_value
import org.gtkkn.native.webkit.webkit_feature_get_details
import org.gtkkn.native.webkit.webkit_feature_get_identifier
import org.gtkkn.native.webkit.webkit_feature_get_name
import org.gtkkn.native.webkit.webkit_feature_get_status
import org.gtkkn.native.webkit.webkit_feature_ref
import org.gtkkn.native.webkit.webkit_feature_unref
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Describes a web engine feature that may be toggled at runtime.
 *
 * The WebKit web engine includes a set of features which may be toggled
 * programmatically, each one represented by a #WebKitFeature that provides
 * information about it:
 *
 * - A unique “identifier”: [method@Feature.get_identifier].
 * - A “default value”, which indicates whether the option is enabled
 *   automatically: [method@Feature.get_default_value].
 * - Its “status”, which determines whether it should be considered
 *   user-settable and its development stage (see [enum@FeatureStatus]
 *   for details): [method@Feature.get_status].
 * - A category, which may be used to group features together:
 *   [method@Feature.get_category].
 * - An optional short “name” which can be presented to an user:
 *   [method@Feature.get_name].
 * - An optional longer “detailed” description:
 *   [method@Feature.get_details].
 *
 * The lists of available features can be obtained with
 * [func@Settings.get_all_features], [func@Settings.get_experimental_features],
 * and [func@Settings.get_development_features]). As a rule of thumb,
 * applications which may want to allow users (i.e. web developers) to test
 * WebKit features should use the list of experimental features. Additionally,
 * applications might want to expose development features *when targeting
 * technically inclined users* for early testing of in-development features
 * (i.e. in “technology preview” or “canary” builds).
 *
 * Applications **must not** expose the list of all features to end users
 * because they often lack descriptions and control parts of the web engine
 * which are either intended to be used during development of WebKit itself,
 * or in specific scenarios to tweak how WebKit integrates with the
 * application.
 * @since 2.42
 */
@WebKitVersion2_42
public class Feature(
    pointer: CPointer<WebKitFeature>,
) : Record {
    public val webkitFeaturePointer: CPointer<WebKitFeature> = pointer

    /**
     * Gets the category of the feature.
     *
     * Applications which include user interface to toggle features may want
     * to use the category to group related features together.
     *
     * @return Feature category.
     * @since 2.42
     */
    @WebKitVersion2_42
    public fun getCategory(): String =
        webkit_feature_get_category(webkitFeaturePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets whether the feature is enabled by default.
     *
     * The default value may be used by applications which include user interface
     * to toggle features to restore its settings to their defaults. Note that
     * whether a feature is actually enabled must be checked with
     * [method@Settings.get_feature_enabled].
     *
     * @return Whether the feature is enabled by default.
     * @since 2.42
     */
    @WebKitVersion2_42
    public fun getDefaultValue(): Boolean =
        webkit_feature_get_default_value(webkitFeaturePointer.reinterpret()).asBoolean()

    /**
     * Gets a description for the @feature.
     *
     * The detailed description should be considered an additional clarification
     * on the purpose of the feature, to be used as complementary aid to be
     * displayed along the feature name returned by [method@Feature.get_name].
     * The returned string is suitable to be displayed to end users, but it
     * should not be relied upon being localized.
     *
     * Note that some *features may not* have a detailed description, and @NULL
     * is returned in this case.
     *
     * @return Feature description.
     * @since 2.42
     */
    @WebKitVersion2_42
    public fun getDetails(): String? = webkit_feature_get_details(webkitFeaturePointer.reinterpret())?.toKString()

    /**
     * Gets a string that uniquely identifies the @feature.
     *
     * @return The identifier string for the feature.
     * @since 2.42
     */
    @WebKitVersion2_42
    public fun getIdentifier(): String =
        webkit_feature_get_identifier(webkitFeaturePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets a short name for the @feature.
     *
     * The returned string is suitable to be displayed to end users, but it
     * should not be relied upon being localized.
     *
     * Note that some *features may not* have a short name, and @NULL
     * is returned in this case.
     *
     * @return Short feature name.
     * @since 2.42
     */
    @WebKitVersion2_42
    public fun getName(): String? = webkit_feature_get_name(webkitFeaturePointer.reinterpret())?.toKString()

    /**
     * Gets the status of the feature.
     *
     * @return Feature status.
     * @since 2.42
     */
    @WebKitVersion2_42
    public fun getStatus(): FeatureStatus =
        webkit_feature_get_status(webkitFeaturePointer.reinterpret()).run {
            FeatureStatus.fromNativeValue(this)
        }

    /**
     * Atomically acquires a reference on the given @feature.
     *
     * This function is MT-safe and may be called from any thread.
     *
     * @return The same @feature with an additional reference.
     * @since 2.42
     */
    @WebKitVersion2_42
    public fun ref(): Feature =
        webkit_feature_ref(webkitFeaturePointer.reinterpret())!!.run {
            Feature(reinterpret())
        }

    /**
     * Atomically releases a reference on the given @feature.
     *
     * If the reference was the last, the resources associated to the
     * @feature are freed. This function is MT-safe and may be called from
     * any thread.
     *
     * @since 2.42
     */
    @WebKitVersion2_42
    public fun unref(): Unit = webkit_feature_unref(webkitFeaturePointer.reinterpret())

    public companion object : RecordCompanion<Feature, WebKitFeature> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): Feature = Feature(pointer.reinterpret())
    }
}

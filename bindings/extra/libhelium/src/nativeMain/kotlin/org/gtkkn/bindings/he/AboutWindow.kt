// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.common.toCStringList
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeAboutWindow
import org.gtkkn.native.he.he_about_window_get_app_id
import org.gtkkn.native.he.he_about_window_get_app_name
import org.gtkkn.native.he.he_about_window_get_color
import org.gtkkn.native.he.he_about_window_get_copyright_year
import org.gtkkn.native.he.he_about_window_get_icon
import org.gtkkn.native.he.he_about_window_get_issue_url
import org.gtkkn.native.he.he_about_window_get_license
import org.gtkkn.native.he.he_about_window_get_more_info_url
import org.gtkkn.native.he.he_about_window_get_translate_url
import org.gtkkn.native.he.he_about_window_get_type
import org.gtkkn.native.he.he_about_window_get_version
import org.gtkkn.native.he.he_about_window_new
import org.gtkkn.native.he.he_about_window_set_app_id
import org.gtkkn.native.he.he_about_window_set_app_name
import org.gtkkn.native.he.he_about_window_set_color
import org.gtkkn.native.he.he_about_window_set_copyright_year
import org.gtkkn.native.he.he_about_window_set_developer_names
import org.gtkkn.native.he.he_about_window_set_icon
import org.gtkkn.native.he.he_about_window_set_issue_url
import org.gtkkn.native.he.he_about_window_set_license
import org.gtkkn.native.he.he_about_window_set_more_info_url
import org.gtkkn.native.he.he_about_window_set_translate_url
import org.gtkkn.native.he.he_about_window_set_translator_names
import org.gtkkn.native.he.he_about_window_set_version
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * ## Skipped during bindings generation
 *
 * - parameter `result_length1`: result_length1: Out parameter is not supported
 * - parameter `result_length1`: result_length1: Out parameter is not supported
 * - method `color`: Property has no getter nor setter
 * - method `license`: Property has no getter nor setter
 * - method `version`: Property has no getter nor setter
 * - method `app-name`: Property has no getter nor setter
 * - method `icon`: Property has no getter nor setter
 * - method `translator-names`: Property has no getter nor setter
 * - method `developer-names`: Property has no getter nor setter
 * - method `copyright-year`: Property has no getter nor setter
 * - method `app-id`: Property has no getter nor setter
 * - method `translate-url`: Property has no getter nor setter
 * - method `issue-url`: Property has no getter nor setter
 * - method `more-info-url`: Property has no getter nor setter
 */
public open class AboutWindow(
    pointer: CPointer<HeAboutWindow>,
) : Window(pointer.reinterpret()), KGTyped {
    public val heAboutWindowPointer: CPointer<HeAboutWindow>
        get() = gPointer.reinterpret()

    /**
     *
     *
     * @param parent
     * @param appName
     * @param appId
     * @param version
     * @param icon
     * @param translateUrl
     * @param issueUrl
     * @param moreInfoUrl
     * @param translators
     * @param translatorsLength1
     * @param developers
     * @param developersLength1
     * @param copyrightYear
     * @param license
     * @param color
     */
    public constructor(
        parent: org.gtkkn.bindings.gtk.Window,
        appName: String,
        appId: String,
        version: String,
        icon: String,
        translateUrl: String?,
        issueUrl: String?,
        moreInfoUrl: String?,
        translators: List<String>,
        translatorsLength1: Int,
        developers: List<String>,
        developersLength1: Int,
        copyrightYear: Int,
        license: AboutWindowLicenses,
        color: Colors,
    ) : this(
        memScoped {
            he_about_window_new(
                parent.gtkWindowPointer.reinterpret(), appName, appId, version, icon,
                translateUrl, issueUrl, moreInfoUrl, translators.toCStringList(this),
                translatorsLength1, developers.toCStringList(this), developersLength1,
                copyrightYear, license.nativeValue, color.nativeValue
            )!!.reinterpret()
        }
    )

    public open fun getColor_(): Colors =
        he_about_window_get_color(heAboutWindowPointer.reinterpret()).run {
            Colors.fromNativeValue(this)
        }

    /**
     *
     *
     * @param value
     */
    public open fun setColor(`value`: Colors): Unit =
        he_about_window_set_color(heAboutWindowPointer.reinterpret(), `value`.nativeValue)

    public open fun getLicense(): AboutWindowLicenses =
        he_about_window_get_license(heAboutWindowPointer.reinterpret()).run {
            AboutWindowLicenses.fromNativeValue(this)
        }

    /**
     *
     *
     * @param value
     */
    public open fun setLicense(`value`: AboutWindowLicenses): Unit =
        he_about_window_set_license(heAboutWindowPointer.reinterpret(), `value`.nativeValue)

    public open fun getVersion(): String =
        he_about_window_get_version(heAboutWindowPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setVersion(`value`: String): Unit =
        he_about_window_set_version(heAboutWindowPointer.reinterpret(), `value`)

    public open fun getAppName(): String =
        he_about_window_get_app_name(heAboutWindowPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setAppName(`value`: String): Unit =
        he_about_window_set_app_name(heAboutWindowPointer.reinterpret(), `value`)

    public open fun getIcon(): String =
        he_about_window_get_icon(heAboutWindowPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setIcon(`value`: String): Unit =
        he_about_window_set_icon(heAboutWindowPointer.reinterpret(), `value`)

    /**
     *
     *
     * @param value
     * @param valueLength1
     */
    public open fun setTranslatorNames(
        `value`: List<String>,
        valueLength1: Int,
    ): Unit =
        memScoped {
            return he_about_window_set_translator_names(
                heAboutWindowPointer.reinterpret(),
                `value`.toCStringList(this),
                valueLength1
            )
        }

    /**
     *
     *
     * @param value
     * @param valueLength1
     */
    public open fun setDeveloperNames(
        `value`: List<String>,
        valueLength1: Int,
    ): Unit =
        memScoped {
            return he_about_window_set_developer_names(
                heAboutWindowPointer.reinterpret(),
                `value`.toCStringList(this),
                valueLength1
            )
        }

    public open fun getCopyrightYear(): Int = he_about_window_get_copyright_year(heAboutWindowPointer.reinterpret())

    /**
     *
     *
     * @param value
     */
    public open fun setCopyrightYear(`value`: Int): Unit =
        he_about_window_set_copyright_year(heAboutWindowPointer.reinterpret(), `value`)

    public open fun getAppId(): String =
        he_about_window_get_app_id(heAboutWindowPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setAppId(`value`: String): Unit =
        he_about_window_set_app_id(heAboutWindowPointer.reinterpret(), `value`)

    public open fun getTranslateUrl(): String? =
        he_about_window_get_translate_url(heAboutWindowPointer.reinterpret())?.toKString()

    /**
     *
     *
     * @param value
     */
    public open fun setTranslateUrl(`value`: String?): Unit =
        he_about_window_set_translate_url(heAboutWindowPointer.reinterpret(), `value`)

    public open fun getIssueUrl(): String? =
        he_about_window_get_issue_url(heAboutWindowPointer.reinterpret())?.toKString()

    /**
     *
     *
     * @param value
     */
    public open fun setIssueUrl(`value`: String?): Unit =
        he_about_window_set_issue_url(heAboutWindowPointer.reinterpret(), `value`)

    public open fun getMoreInfoUrl(): String? =
        he_about_window_get_more_info_url(heAboutWindowPointer.reinterpret())?.toKString()

    /**
     *
     *
     * @param value
     */
    public open fun setMoreInfoUrl(`value`: String?): Unit =
        he_about_window_set_more_info_url(heAboutWindowPointer.reinterpret(), `value`)

    public companion object : TypeCompanion<AboutWindow> {
        override val type: GeneratedClassKGType<AboutWindow> =
            GeneratedClassKGType(he_about_window_get_type()) { AboutWindow(it.reinterpret()) }

        init {
            HeTypeProvider.register()
        }
    }
}

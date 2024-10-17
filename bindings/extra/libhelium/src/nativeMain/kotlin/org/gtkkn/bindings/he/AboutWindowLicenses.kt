// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import org.gtkkn.native.he.HeAboutWindowLicenses
import org.gtkkn.native.he.HeAboutWindowLicenses.HE_ABOUT_WINDOW_LICENSES_APACHEV2
import org.gtkkn.native.he.HeAboutWindowLicenses.HE_ABOUT_WINDOW_LICENSES_GPLV3
import org.gtkkn.native.he.HeAboutWindowLicenses.HE_ABOUT_WINDOW_LICENSES_MIT
import org.gtkkn.native.he.HeAboutWindowLicenses.HE_ABOUT_WINDOW_LICENSES_MPLV2
import org.gtkkn.native.he.HeAboutWindowLicenses.HE_ABOUT_WINDOW_LICENSES_PROPRIETARY
import org.gtkkn.native.he.HeAboutWindowLicenses.HE_ABOUT_WINDOW_LICENSES_UNLICENSE
import org.gtkkn.native.he.HeAboutWindowLicenses.HE_ABOUT_WINDOW_LICENSES_WTFPL

public enum class AboutWindowLicenses(
    public val nativeValue: HeAboutWindowLicenses,
) {
    GPLV3(HE_ABOUT_WINDOW_LICENSES_GPLV3),
    MIT(HE_ABOUT_WINDOW_LICENSES_MIT),
    MPLV2(HE_ABOUT_WINDOW_LICENSES_MPLV2),
    UNLICENSE(HE_ABOUT_WINDOW_LICENSES_UNLICENSE),
    APACHEV2(HE_ABOUT_WINDOW_LICENSES_APACHEV2),
    WTFPL(HE_ABOUT_WINDOW_LICENSES_WTFPL),
    PROPRIETARY(HE_ABOUT_WINDOW_LICENSES_PROPRIETARY),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: HeAboutWindowLicenses): AboutWindowLicenses =
            when (nativeValue) {
                HE_ABOUT_WINDOW_LICENSES_GPLV3 -> GPLV3
                HE_ABOUT_WINDOW_LICENSES_MIT -> MIT
                HE_ABOUT_WINDOW_LICENSES_MPLV2 -> MPLV2
                HE_ABOUT_WINDOW_LICENSES_UNLICENSE -> UNLICENSE
                HE_ABOUT_WINDOW_LICENSES_APACHEV2 -> APACHEV2
                HE_ABOUT_WINDOW_LICENSES_WTFPL -> WTFPL
                HE_ABOUT_WINDOW_LICENSES_PROPRIETARY -> PROPRIETARY
                else -> error("invalid nativeValue")
            }
    }
}

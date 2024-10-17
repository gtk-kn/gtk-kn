// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import org.gtkkn.native.he.HeBannerStyle
import org.gtkkn.native.he.HeBannerStyle.HE_BANNER_STYLE_ERROR
import org.gtkkn.native.he.HeBannerStyle.HE_BANNER_STYLE_INFO
import org.gtkkn.native.he.HeBannerStyle.HE_BANNER_STYLE_WARNING

public enum class BannerStyle(
    public val nativeValue: HeBannerStyle,
) {
    INFO(HE_BANNER_STYLE_INFO),
    WARNING(HE_BANNER_STYLE_WARNING),
    ERROR(HE_BANNER_STYLE_ERROR),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: HeBannerStyle): BannerStyle =
            when (nativeValue) {
                HE_BANNER_STYLE_INFO -> INFO
                HE_BANNER_STYLE_WARNING -> WARNING
                HE_BANNER_STYLE_ERROR -> ERROR
                else -> error("invalid nativeValue")
            }
    }
}

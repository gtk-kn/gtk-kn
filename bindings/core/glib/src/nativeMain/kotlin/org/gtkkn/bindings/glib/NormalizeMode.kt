// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GNormalizeMode
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_normalize_mode_get_type

/**
 * Defines how a Unicode string is transformed in a canonical
 * form, standardizing such issues as whether a character with
 * an accent is represented as a base character and combining
 * accent or as a single precomposed character. Unicode strings
 * should generally be normalized before comparing them.
 */
public enum class NormalizeMode(public val nativeValue: GNormalizeMode) {
    /**
     * standardize differences that do not affect the
     *     text content, such as the above-mentioned accent representation
     */
    DEFAULT(GNormalizeMode.G_NORMALIZE_DEFAULT),

    /**
     * another name for %G_NORMALIZE_DEFAULT
     */
    NFD(GNormalizeMode.G_NORMALIZE_NFD),

    /**
     * like %G_NORMALIZE_DEFAULT, but with
     *     composed forms rather than a maximally decomposed form
     */
    DEFAULT_COMPOSE(GNormalizeMode.G_NORMALIZE_DEFAULT_COMPOSE),

    /**
     * another name for %G_NORMALIZE_DEFAULT_COMPOSE
     */
    NFC(GNormalizeMode.G_NORMALIZE_NFC),

    /**
     * beyond %G_NORMALIZE_DEFAULT also standardize the
     *     "compatibility" characters in Unicode, such as SUPERSCRIPT THREE
     *     to the standard forms (in this case DIGIT THREE). Formatting
     *     information may be lost but for most text operations such
     *     characters should be considered the same
     */
    ALL(GNormalizeMode.G_NORMALIZE_ALL),

    /**
     * another name for %G_NORMALIZE_ALL
     */
    NFKD(GNormalizeMode.G_NORMALIZE_NFKD),

    /**
     * like %G_NORMALIZE_ALL, but with composed
     *     forms rather than a maximally decomposed form
     */
    ALL_COMPOSE(GNormalizeMode.G_NORMALIZE_ALL_COMPOSE),

    /**
     * another name for %G_NORMALIZE_ALL_COMPOSE
     */
    NFKC(GNormalizeMode.G_NORMALIZE_NFKC),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GNormalizeMode): NormalizeMode = when (nativeValue) {
            GNormalizeMode.G_NORMALIZE_DEFAULT -> DEFAULT
            GNormalizeMode.G_NORMALIZE_NFD -> NFD
            GNormalizeMode.G_NORMALIZE_DEFAULT_COMPOSE -> DEFAULT_COMPOSE
            GNormalizeMode.G_NORMALIZE_NFC -> NFC
            GNormalizeMode.G_NORMALIZE_ALL -> ALL
            GNormalizeMode.G_NORMALIZE_NFKD -> NFKD
            GNormalizeMode.G_NORMALIZE_ALL_COMPOSE -> ALL_COMPOSE
            GNormalizeMode.G_NORMALIZE_NFKC -> NFKC
            else -> error("invalid nativeValue")
        }

        /**
         * Get the GType of NormalizeMode
         *
         * @return the GType
         */
        public fun getType(): GType = g_normalize_mode_get_type()
    }
}

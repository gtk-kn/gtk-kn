// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.native.glib.GNormalizeMode
import org.gtkkn.native.glib.GNormalizeMode.Companion.G_NORMALIZE_NFC
import org.gtkkn.native.glib.GNormalizeMode.Companion.G_NORMALIZE_NFD
import org.gtkkn.native.glib.GNormalizeMode.Companion.G_NORMALIZE_NFKC
import org.gtkkn.native.glib.GNormalizeMode.Companion.G_NORMALIZE_NFKD
import org.gtkkn.native.glib.GNormalizeMode.G_NORMALIZE_ALL
import org.gtkkn.native.glib.GNormalizeMode.G_NORMALIZE_ALL_COMPOSE
import org.gtkkn.native.glib.GNormalizeMode.G_NORMALIZE_DEFAULT
import org.gtkkn.native.glib.GNormalizeMode.G_NORMALIZE_DEFAULT_COMPOSE

/**
 * Defines how a Unicode string is transformed in a canonical
 * form, standardizing such issues as whether a character with
 * an accent is represented as a base character and combining
 * accent or as a single precomposed character. Unicode strings
 * should generally be normalized before comparing them.
 */
public enum class NormalizeMode(
    public val nativeValue: GNormalizeMode,
) {
    /**
     * standardize differences that do not affect the
     *     text content, such as the above-mentioned accent representation
     */
    DEFAULT(G_NORMALIZE_DEFAULT),

    /**
     * another name for %G_NORMALIZE_DEFAULT
     */
    NFD(G_NORMALIZE_NFD),

    /**
     * like %G_NORMALIZE_DEFAULT, but with
     *     composed forms rather than a maximally decomposed form
     */
    DEFAULT_COMPOSE(G_NORMALIZE_DEFAULT_COMPOSE),

    /**
     * another name for %G_NORMALIZE_DEFAULT_COMPOSE
     */
    NFC(G_NORMALIZE_NFC),

    /**
     * beyond %G_NORMALIZE_DEFAULT also standardize the
     *     "compatibility" characters in Unicode, such as SUPERSCRIPT THREE
     *     to the standard forms (in this case DIGIT THREE). Formatting
     *     information may be lost but for most text operations such
     *     characters should be considered the same
     */
    ALL(G_NORMALIZE_ALL),

    /**
     * another name for %G_NORMALIZE_ALL
     */
    NFKD(G_NORMALIZE_NFKD),

    /**
     * like %G_NORMALIZE_ALL, but with composed
     *     forms rather than a maximally decomposed form
     */
    ALL_COMPOSE(G_NORMALIZE_ALL_COMPOSE),

    /**
     * another name for %G_NORMALIZE_ALL_COMPOSE
     */
    NFKC(G_NORMALIZE_NFKC),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GNormalizeMode): NormalizeMode =
            when (nativeValue) {
                G_NORMALIZE_DEFAULT -> DEFAULT
                G_NORMALIZE_NFD -> NFD
                G_NORMALIZE_DEFAULT_COMPOSE -> DEFAULT_COMPOSE
                G_NORMALIZE_NFC -> NFC
                G_NORMALIZE_ALL -> ALL
                G_NORMALIZE_NFKD -> NFKD
                G_NORMALIZE_ALL_COMPOSE -> ALL_COMPOSE
                G_NORMALIZE_NFKC -> NFKC
                else -> error("invalid nativeValue")
            }
    }
}

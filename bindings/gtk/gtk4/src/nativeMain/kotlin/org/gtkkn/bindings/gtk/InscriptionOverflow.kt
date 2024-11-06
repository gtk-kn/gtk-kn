// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.bindings.gtk.annotations.GtkVersion4_8
import org.gtkkn.native.gtk.GtkInscriptionOverflow
import org.gtkkn.native.gtk.GtkInscriptionOverflow.GTK_INSCRIPTION_OVERFLOW_CLIP
import org.gtkkn.native.gtk.GtkInscriptionOverflow.GTK_INSCRIPTION_OVERFLOW_ELLIPSIZE_END
import org.gtkkn.native.gtk.GtkInscriptionOverflow.GTK_INSCRIPTION_OVERFLOW_ELLIPSIZE_MIDDLE
import org.gtkkn.native.gtk.GtkInscriptionOverflow.GTK_INSCRIPTION_OVERFLOW_ELLIPSIZE_START

/**
 * The different methods to handle text in #GtkInscription when it doesn't
 * fit the available space.
 * @since 4.8
 */
@GtkVersion4_8
public enum class InscriptionOverflow(
    public val nativeValue: GtkInscriptionOverflow,
) {
    /**
     * Clip the remaining text
     */
    CLIP(GTK_INSCRIPTION_OVERFLOW_CLIP),

    /**
     * Omit characters at the start of the text
     */
    ELLIPSIZE_START(GTK_INSCRIPTION_OVERFLOW_ELLIPSIZE_START),

    /**
     * Omit characters at the middle of the text
     */
    ELLIPSIZE_MIDDLE(GTK_INSCRIPTION_OVERFLOW_ELLIPSIZE_MIDDLE),

    /**
     * Omit characters at the end of the text
     */
    ELLIPSIZE_END(GTK_INSCRIPTION_OVERFLOW_ELLIPSIZE_END),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkInscriptionOverflow): InscriptionOverflow =
            when (nativeValue) {
                GTK_INSCRIPTION_OVERFLOW_CLIP -> CLIP
                GTK_INSCRIPTION_OVERFLOW_ELLIPSIZE_START -> ELLIPSIZE_START
                GTK_INSCRIPTION_OVERFLOW_ELLIPSIZE_MIDDLE -> ELLIPSIZE_MIDDLE
                GTK_INSCRIPTION_OVERFLOW_ELLIPSIZE_END -> ELLIPSIZE_END
                else -> error("invalid nativeValue")
            }
    }
}

// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.bindings.glib.Error
import org.gtkkn.native.gtk.GtkConstraintVflParserError
import org.gtkkn.native.gtk.GtkConstraintVflParserError.GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_ATTRIBUTE
import org.gtkkn.native.gtk.GtkConstraintVflParserError.GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_METRIC
import org.gtkkn.native.gtk.GtkConstraintVflParserError.GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_PRIORITY
import org.gtkkn.native.gtk.GtkConstraintVflParserError.GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_RELATION
import org.gtkkn.native.gtk.GtkConstraintVflParserError.GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_SYMBOL
import org.gtkkn.native.gtk.GtkConstraintVflParserError.GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_VIEW
import org.gtkkn.native.gtk.gtk_constraint_vfl_parser_error_quark
import kotlin.UInt

/**
 * Domain for VFL parsing errors.
 */
public enum class ConstraintVflParserError(
    public val nativeValue: GtkConstraintVflParserError,
) {
    /**
     * Invalid or unknown symbol
     */
    SYMBOL(GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_SYMBOL),

    /**
     * Invalid or unknown attribute
     */
    ATTRIBUTE(GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_ATTRIBUTE),

    /**
     * Invalid or unknown view
     */
    VIEW(GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_VIEW),

    /**
     * Invalid or unknown metric
     */
    METRIC(GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_METRIC),

    /**
     * Invalid or unknown priority
     */
    PRIORITY(GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_PRIORITY),

    /**
     * Invalid or unknown relation
     */
    RELATION(GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_RELATION),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkConstraintVflParserError): ConstraintVflParserError =
            when (nativeValue) {
                GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_SYMBOL -> SYMBOL
                GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_ATTRIBUTE -> ATTRIBUTE
                GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_VIEW -> VIEW
                GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_METRIC -> METRIC
                GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_PRIORITY -> PRIORITY
                GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_RELATION -> RELATION
                else -> error("invalid nativeValue")
            }

        public fun quark(): UInt = gtk_constraint_vfl_parser_error_quark()

        public fun fromErrorOrNull(error: Error): ConstraintVflParserError? =
            if (error.domain !=
                quark()
            ) {
                null
            } else {
                ConstraintVflParserError.values().find { it.nativeValue.value.toInt() == error.code }
            }
    }
}

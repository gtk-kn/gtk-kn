// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.Quark
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkConstraintVflParserError
import org.gtkkn.native.gtk.gtk_constraint_vfl_parser_error_get_type
import org.gtkkn.native.gtk.gtk_constraint_vfl_parser_error_quark

/**
 * Domain for VFL parsing errors.
 */
public enum class ConstraintVflParserError(public val nativeValue: GtkConstraintVflParserError) {
    /**
     * Invalid or unknown symbol
     */
    SYMBOL(GtkConstraintVflParserError.GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_SYMBOL),

    /**
     * Invalid or unknown attribute
     */
    ATTRIBUTE(GtkConstraintVflParserError.GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_ATTRIBUTE),

    /**
     * Invalid or unknown view
     */
    VIEW(GtkConstraintVflParserError.GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_VIEW),

    /**
     * Invalid or unknown metric
     */
    METRIC(GtkConstraintVflParserError.GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_METRIC),

    /**
     * Invalid or unknown priority
     */
    PRIORITY(GtkConstraintVflParserError.GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_PRIORITY),

    /**
     * Invalid or unknown relation
     */
    RELATION(GtkConstraintVflParserError.GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_RELATION),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkConstraintVflParserError): ConstraintVflParserError =
            when (nativeValue) {
                GtkConstraintVflParserError.GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_SYMBOL -> SYMBOL
                GtkConstraintVflParserError.GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_ATTRIBUTE -> ATTRIBUTE
                GtkConstraintVflParserError.GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_VIEW -> VIEW
                GtkConstraintVflParserError.GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_METRIC -> METRIC
                GtkConstraintVflParserError.GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_PRIORITY -> PRIORITY
                GtkConstraintVflParserError.GTK_CONSTRAINT_VFL_PARSER_ERROR_INVALID_RELATION -> RELATION
                else -> error("invalid nativeValue")
            }

        public fun quark(): Quark = gtk_constraint_vfl_parser_error_quark()

        /**
         * Get the GType of ConstraintVflParserError
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_constraint_vfl_parser_error_get_type()

        public fun fromErrorOrNull(error: Error): ConstraintVflParserError? = if (error.domain != quark()) {
            null
        } else {
            ConstraintVflParserError.values().find { it.nativeValue.value.toInt() == error.code }
        }
    }
}

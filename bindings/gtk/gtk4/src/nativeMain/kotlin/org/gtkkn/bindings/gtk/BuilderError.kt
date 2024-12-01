// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.Quark
import org.gtkkn.native.gtk.GtkBuilderError
import org.gtkkn.native.gtk.gtk_builder_error_quark

/**
 * Error codes that identify various errors that can occur while using
 * `GtkBuilder`.
 */
public enum class BuilderError(
    public val nativeValue: GtkBuilderError,
) {
    /**
     * A type-func attribute didn’t name
     *  a function that returns a `GType`.
     */
    INVALID_TYPE_FUNCTION(GtkBuilderError.GTK_BUILDER_ERROR_INVALID_TYPE_FUNCTION),

    /**
     * The input contained a tag that `GtkBuilder`
     *  can’t handle.
     */
    UNHANDLED_TAG(GtkBuilderError.GTK_BUILDER_ERROR_UNHANDLED_TAG),

    /**
     * An attribute that is required by
     *  `GtkBuilder` was missing.
     */
    MISSING_ATTRIBUTE(GtkBuilderError.GTK_BUILDER_ERROR_MISSING_ATTRIBUTE),

    /**
     * `GtkBuilder` found an attribute that
     *  it doesn’t understand.
     */
    INVALID_ATTRIBUTE(GtkBuilderError.GTK_BUILDER_ERROR_INVALID_ATTRIBUTE),

    /**
     * `GtkBuilder` found a tag that
     *  it doesn’t understand.
     */
    INVALID_TAG(GtkBuilderError.GTK_BUILDER_ERROR_INVALID_TAG),

    /**
     * A required property value was
     *  missing.
     */
    MISSING_PROPERTY_VALUE(GtkBuilderError.GTK_BUILDER_ERROR_MISSING_PROPERTY_VALUE),

    /**
     * `GtkBuilder` couldn’t parse
     *  some attribute value.
     */
    INVALID_VALUE(GtkBuilderError.GTK_BUILDER_ERROR_INVALID_VALUE),

    /**
     * The input file requires a newer version
     *  of GTK.
     */
    VERSION_MISMATCH(GtkBuilderError.GTK_BUILDER_ERROR_VERSION_MISMATCH),

    /**
     * An object id occurred twice.
     */
    DUPLICATE_ID(GtkBuilderError.GTK_BUILDER_ERROR_DUPLICATE_ID),

    /**
     * A specified object type is of the same type or
     *  derived from the type of the composite class being extended with builder XML.
     */
    OBJECT_TYPE_REFUSED(GtkBuilderError.GTK_BUILDER_ERROR_OBJECT_TYPE_REFUSED),

    /**
     * The wrong type was specified in a composite class’s template XML
     */
    TEMPLATE_MISMATCH(GtkBuilderError.GTK_BUILDER_ERROR_TEMPLATE_MISMATCH),

    /**
     * The specified property is unknown for the object class.
     */
    INVALID_PROPERTY(GtkBuilderError.GTK_BUILDER_ERROR_INVALID_PROPERTY),

    /**
     * The specified signal is unknown for the object class.
     */
    INVALID_SIGNAL(GtkBuilderError.GTK_BUILDER_ERROR_INVALID_SIGNAL),

    /**
     * An object id is unknown.
     */
    INVALID_ID(GtkBuilderError.GTK_BUILDER_ERROR_INVALID_ID),

    /**
     * A function could not be found. This often happens
     *   when symbols are set to be kept private. Compiling code with -rdynamic or using the
     *   `gmodule-export-2.0` pkgconfig module can fix this problem.
     */
    INVALID_FUNCTION(GtkBuilderError.GTK_BUILDER_ERROR_INVALID_FUNCTION),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkBuilderError): BuilderError =
            when (nativeValue) {
                GtkBuilderError.GTK_BUILDER_ERROR_INVALID_TYPE_FUNCTION -> INVALID_TYPE_FUNCTION
                GtkBuilderError.GTK_BUILDER_ERROR_UNHANDLED_TAG -> UNHANDLED_TAG
                GtkBuilderError.GTK_BUILDER_ERROR_MISSING_ATTRIBUTE -> MISSING_ATTRIBUTE
                GtkBuilderError.GTK_BUILDER_ERROR_INVALID_ATTRIBUTE -> INVALID_ATTRIBUTE
                GtkBuilderError.GTK_BUILDER_ERROR_INVALID_TAG -> INVALID_TAG
                GtkBuilderError.GTK_BUILDER_ERROR_MISSING_PROPERTY_VALUE -> MISSING_PROPERTY_VALUE
                GtkBuilderError.GTK_BUILDER_ERROR_INVALID_VALUE -> INVALID_VALUE
                GtkBuilderError.GTK_BUILDER_ERROR_VERSION_MISMATCH -> VERSION_MISMATCH
                GtkBuilderError.GTK_BUILDER_ERROR_DUPLICATE_ID -> DUPLICATE_ID
                GtkBuilderError.GTK_BUILDER_ERROR_OBJECT_TYPE_REFUSED -> OBJECT_TYPE_REFUSED
                GtkBuilderError.GTK_BUILDER_ERROR_TEMPLATE_MISMATCH -> TEMPLATE_MISMATCH
                GtkBuilderError.GTK_BUILDER_ERROR_INVALID_PROPERTY -> INVALID_PROPERTY
                GtkBuilderError.GTK_BUILDER_ERROR_INVALID_SIGNAL -> INVALID_SIGNAL
                GtkBuilderError.GTK_BUILDER_ERROR_INVALID_ID -> INVALID_ID
                GtkBuilderError.GTK_BUILDER_ERROR_INVALID_FUNCTION -> INVALID_FUNCTION
                else -> error("invalid nativeValue")
            }

        public fun quark(): Quark = gtk_builder_error_quark()

        public fun fromErrorOrNull(error: Error): BuilderError? =
            if (error.domain != quark()) {
                null
            } else {
                BuilderError.values().find { it.nativeValue.value.toInt() == error.code }
            }
    }
}

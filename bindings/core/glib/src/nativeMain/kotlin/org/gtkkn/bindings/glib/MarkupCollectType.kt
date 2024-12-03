// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.glib.GMarkupCollectType
import org.gtkkn.native.glib.G_MARKUP_COLLECT_BOOLEAN
import org.gtkkn.native.glib.G_MARKUP_COLLECT_INVALID
import org.gtkkn.native.glib.G_MARKUP_COLLECT_OPTIONAL
import org.gtkkn.native.glib.G_MARKUP_COLLECT_STRDUP
import org.gtkkn.native.glib.G_MARKUP_COLLECT_STRING
import org.gtkkn.native.glib.G_MARKUP_COLLECT_TRISTATE

/**
 * A mixed enumerated type and flags field. You must specify one type
 * (string, strdup, boolean, tristate).  Additionally, you may  optionally
 * bitwise OR the type with the flag %G_MARKUP_COLLECT_OPTIONAL.
 *
 * It is likely that this enum will be extended in the future to
 * support other types.
 */
public class MarkupCollectType(public val mask: GMarkupCollectType) : Bitfield<MarkupCollectType> {
    override infix fun or(other: MarkupCollectType): MarkupCollectType = MarkupCollectType(mask or other.mask)

    public companion object {
        /**
         * used to terminate the list of attributes
         *     to collect
         */
        public val INVALID: MarkupCollectType = MarkupCollectType(G_MARKUP_COLLECT_INVALID)

        /**
         * collect the string pointer directly from
         *     the attribute_values[] array. Expects a parameter of type (const
         *     char **). If %G_MARKUP_COLLECT_OPTIONAL is specified and the
         *     attribute isn't present then the pointer will be set to null
         */
        public val STRING: MarkupCollectType = MarkupCollectType(G_MARKUP_COLLECT_STRING)

        /**
         * as with %G_MARKUP_COLLECT_STRING, but
         *     expects a parameter of type (char **) and g_strdup()s the
         *     returned pointer. The pointer must be freed with g_free()
         */
        public val STRDUP: MarkupCollectType = MarkupCollectType(G_MARKUP_COLLECT_STRDUP)

        /**
         * expects a parameter of type (gboolean *)
         *     and parses the attribute value as a boolean. Sets false if the
         *     attribute isn't present. Valid boolean values consist of
         *     (case-insensitive) "false", "f", "no", "n", "0" and "true", "t",
         *     "yes", "y", "1"
         */
        public val BOOLEAN: MarkupCollectType = MarkupCollectType(G_MARKUP_COLLECT_BOOLEAN)

        /**
         * as with %G_MARKUP_COLLECT_BOOLEAN, but
         *     in the case of a missing attribute a value is set that compares
         *     equal to neither false nor true G_MARKUP_COLLECT_OPTIONAL is
         *     implied
         */
        public val TRISTATE: MarkupCollectType = MarkupCollectType(G_MARKUP_COLLECT_TRISTATE)

        /**
         * can be bitwise ORed with the other fields.
         *     If present, allows the attribute not to appear. A default value
         *     is set depending on what value type is used
         */
        public val OPTIONAL: MarkupCollectType = MarkupCollectType(G_MARKUP_COLLECT_OPTIONAL)
    }
}

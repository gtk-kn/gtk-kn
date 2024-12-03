// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gobject.GParamFlags
import org.gtkkn.native.gobject.G_PARAM_CONSTRUCT
import org.gtkkn.native.gobject.G_PARAM_CONSTRUCT_ONLY
import org.gtkkn.native.gobject.G_PARAM_DEPRECATED
import org.gtkkn.native.gobject.G_PARAM_EXPLICIT_NOTIFY
import org.gtkkn.native.gobject.G_PARAM_LAX_VALIDATION
import org.gtkkn.native.gobject.G_PARAM_PRIVATE
import org.gtkkn.native.gobject.G_PARAM_READABLE
import org.gtkkn.native.gobject.G_PARAM_READWRITE
import org.gtkkn.native.gobject.G_PARAM_STATIC_BLURB
import org.gtkkn.native.gobject.G_PARAM_STATIC_NAME
import org.gtkkn.native.gobject.G_PARAM_STATIC_NICK
import org.gtkkn.native.gobject.G_PARAM_WRITABLE

/**
 * Through the #GParamFlags flag values, certain aspects of parameters
 * can be configured.
 *
 * See also: %G_PARAM_STATIC_STRINGS
 */
public class ParamFlags(public val mask: GParamFlags) : Bitfield<ParamFlags> {
    override infix fun or(other: ParamFlags): ParamFlags = ParamFlags(mask or other.mask)

    public companion object {
        /**
         * the parameter is readable
         */
        public val READABLE: ParamFlags = ParamFlags(G_PARAM_READABLE)

        /**
         * the parameter is writable
         */
        public val WRITABLE: ParamFlags = ParamFlags(G_PARAM_WRITABLE)

        /**
         * alias for %G_PARAM_READABLE | %G_PARAM_WRITABLE
         */
        public val READWRITE: ParamFlags = ParamFlags(G_PARAM_READWRITE)

        /**
         * the parameter will be set upon object construction
         */
        public val CONSTRUCT: ParamFlags = ParamFlags(G_PARAM_CONSTRUCT)

        /**
         * the parameter can only be set upon object construction
         */
        public val CONSTRUCT_ONLY: ParamFlags = ParamFlags(G_PARAM_CONSTRUCT_ONLY)

        /**
         * upon parameter conversion (see g_param_value_convert())
         *  strict validation is not required
         */
        public val LAX_VALIDATION: ParamFlags = ParamFlags(G_PARAM_LAX_VALIDATION)

        /**
         * the string used as name when constructing the
         *  parameter is guaranteed to remain valid and
         *  unmodified for the lifetime of the parameter.
         *  Since 2.8
         */
        public val STATIC_NAME: ParamFlags = ParamFlags(G_PARAM_STATIC_NAME)

        /**
         * internal
         */
        public val PRIVATE: ParamFlags = ParamFlags(G_PARAM_PRIVATE)

        /**
         * the string used as nick when constructing the
         *  parameter is guaranteed to remain valid and
         *  unmmodified for the lifetime of the parameter.
         *  Since 2.8
         */
        public val STATIC_NICK: ParamFlags = ParamFlags(G_PARAM_STATIC_NICK)

        /**
         * the string used as blurb when constructing the
         *  parameter is guaranteed to remain valid and
         *  unmodified for the lifetime of the parameter.
         *  Since 2.8
         */
        public val STATIC_BLURB: ParamFlags = ParamFlags(G_PARAM_STATIC_BLURB)

        /**
         * calls to g_object_set_property() for this
         *   property will not automatically result in a "notify" signal being
         *   emitted: the implementation must call g_object_notify() themselves
         *   in case the property actually changes.  Since: 2.42.
         */
        public val EXPLICIT_NOTIFY: ParamFlags = ParamFlags(G_PARAM_EXPLICIT_NOTIFY)

        /**
         * the parameter is deprecated and will be removed
         *  in a future version. A warning will be generated if it is used
         *  while running with G_ENABLE_DIAGNOSTIC=1.
         *  Since 2.26
         */
        public val DEPRECATED: ParamFlags = ParamFlags(G_PARAM_DEPRECATED)
    }
}

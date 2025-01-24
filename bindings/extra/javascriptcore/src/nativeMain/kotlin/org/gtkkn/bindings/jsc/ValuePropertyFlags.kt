// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.jsc

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.jsc.JSCValuePropertyFlags
import org.gtkkn.native.jsc.JSC_VALUE_PROPERTY_CONFIGURABLE
import org.gtkkn.native.jsc.JSC_VALUE_PROPERTY_ENUMERABLE
import org.gtkkn.native.jsc.JSC_VALUE_PROPERTY_WRITABLE

/**
 * Flags used when defining properties with jsc_value_object_define_property_data() and
 * jsc_value_object_define_property_accessor().
 */
public class ValuePropertyFlags(public val mask: JSCValuePropertyFlags) : Bitfield<ValuePropertyFlags> {
    override infix fun or(other: ValuePropertyFlags): ValuePropertyFlags = ValuePropertyFlags(mask or other.mask)

    public companion object {
        /**
         * the type of the property descriptor may be changed and the
         *  property may be deleted from the corresponding object.
         */
        public val CONFIGURABLE: ValuePropertyFlags =
            ValuePropertyFlags(JSC_VALUE_PROPERTY_CONFIGURABLE)

        /**
         * the property shows up during enumeration of the properties on
         *  the corresponding object.
         */
        public val ENUMERABLE: ValuePropertyFlags =
            ValuePropertyFlags(JSC_VALUE_PROPERTY_ENUMERABLE)

        /**
         * the value associated with the property may be changed with an
         *  assignment operator. This doesn't have any effect when passed to jsc_value_object_define_property_accessor().
         */
        public val WRITABLE: ValuePropertyFlags = ValuePropertyFlags(JSC_VALUE_PROPERTY_WRITABLE)
    }
}

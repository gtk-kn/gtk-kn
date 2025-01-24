// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.soup

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.soup.SOUP_EXPECTATION_CONTINUE
import org.gtkkn.native.soup.SOUP_EXPECTATION_UNRECOGNIZED
import org.gtkkn.native.soup.SoupExpectation
import org.gtkkn.native.soup.soup_expectation_get_type

/**
 * Represents the parsed value of the "Expect" header.
 */
public class Expectation(public val mask: SoupExpectation) : Bitfield<Expectation> {
    override infix fun or(other: Expectation): Expectation = Expectation(mask or other.mask)

    public companion object {
        /**
         * any unrecognized expectation
         */
        public val UNRECOGNIZED: Expectation = Expectation(SOUP_EXPECTATION_UNRECOGNIZED)

        /**
         * "100-continue"
         */
        public val CONTINUE: Expectation = Expectation(SOUP_EXPECTATION_CONTINUE)

        /**
         * Get the GType of Expectation
         *
         * @return the GType
         */
        public fun getType(): GType = soup_expectation_get_type()
    }
}

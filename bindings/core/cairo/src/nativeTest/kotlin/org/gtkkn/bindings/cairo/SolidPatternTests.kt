/*
 * Copyright (c) 2025 gtk-kn
 *
 * SPDX-License-Identifier: LGPL-2.1-or-later
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, see <http://www.gnu.org/licenses/>.
 */

package org.gtkkn.bindings.cairo

import kotlin.test.Test
import kotlin.test.assertEquals

class SolidPatternTests {
    @Test
    fun `should create SolidPattern with RGB successfully`() {
        // Create a SolidPattern with RGB
        val pattern = SolidPattern(1.0, 0.0, 0.0) // Red color
        assertEquals(
            Status.SUCCESS,
            pattern.status(),
            "Expected newly created solid pattern (RGB) to have SUCCESS status",
        )

        // Check that the pattern type is SOLID
        val patternType = pattern.getPatternType()
        assertEquals(
            PatternType.SOLID,
            patternType,
            "Expected pattern type to be SOLID for SolidPattern with RGB",
        )
    }

    @Test
    fun `should create SolidPattern with RGBA successfully`() {
        // Create a SolidPattern with RGBA
        val pattern = SolidPattern(0.0, 1.0, 0.0, 0.5) // Green color with 50% transparency
        assertEquals(
            Status.SUCCESS,
            pattern.status(),
            "Expected newly created solid pattern (RGBA) to have SUCCESS status",
        )

        // Check that the pattern type is SOLID
        val patternType = pattern.getPatternType()
        assertEquals(
            PatternType.SOLID,
            patternType,
            "Expected pattern type to be SOLID for SolidPattern with RGBA",
        )
    }

    @Test
    fun `should set and retrieve extend mode successfully`() {
        val pattern = SolidPattern(1.0, 1.0, 0.0) // Yellow color
        assertEquals(Status.SUCCESS, pattern.status())

        // Change extend mode to REPEAT
        pattern.setExtend(Extend.REPEAT)
        val currentExtend = pattern.getExtend()
        assertEquals(Extend.REPEAT, currentExtend, "Extend mode should be set to REPEAT for SolidPattern")
    }

    @Test
    fun `should change filter successfully`() {
        val pattern = SolidPattern(0.0, 0.0, 1.0) // Blue color
        assertEquals(Status.SUCCESS, pattern.status())

        // Change filter to FAST
        pattern.setFilter(Filter.FAST)
        val currentFilter = pattern.getFilter()
        assertEquals(Filter.FAST, currentFilter, "Filter should be set to FAST for SolidPattern")
    }
}

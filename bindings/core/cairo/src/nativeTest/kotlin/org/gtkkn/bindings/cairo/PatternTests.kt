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

import kotlinx.cinterop.memScoped
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class PatternTests {
    @Test
    fun `test status`() {
        // Using LinearGradient as a concrete Pattern
        val pattern: Pattern = LinearGradient(0.0, 0.0, 10.0, 10.0)
        assertEquals(Status.SUCCESS, pattern.status(), "The pattern should have a SUCCESS status after creation.")
    }

    @Test
    fun `test set and get extend`() {
        val pattern: Pattern = LinearGradient(0.0, 0.0, 10.0, 10.0)
        // Set extend mode to PAD
        pattern.setExtend(Extend.PAD)
        val extend = pattern.getExtend()
        assertEquals(Extend.PAD, extend, "Extend mode should be PAD.")
        assertEquals(Status.SUCCESS, pattern.status(), "Pattern should have SUCCESS status.")
    }

    @Test
    fun `test set and get filter`() {
        val pattern: Pattern = LinearGradient(0.0, 0.0, 10.0, 10.0)
        // Set filter to NEAREST
        pattern.setFilter(Filter.NEAREST)
        val filter = pattern.getFilter()
        assertEquals(Filter.NEAREST, filter, "Filter should be NEAREST.")
        assertEquals(Status.SUCCESS, pattern.status(), "Pattern should have SUCCESS status.")
    }

    @Test
    fun `test set and retrieve matrix`() {
        val pattern: Pattern = LinearGradient(0.0, 0.0, 10.0, 10.0)
        assertEquals(Status.SUCCESS, pattern.status(), "Pattern should have SUCCESS status upon creation.")

        memScoped {
            // Create and set a simple matrix (e.g., identity scaled by 2.0)
            val scaleMatrix = Matrix(
                xx = 2.0,
                yx = 0.0,
                xy = 0.0,
                yy = 2.0,
                x0 = 0.0,
                y0 = 0.0,
                scope = this,
            )

            pattern.setMatrix(scaleMatrix)

            // Retrieve the matrix into another object
            val retrievedMatrix = Matrix(
                xx = 0.0,
                yx = 0.0,
                xy = 0.0,
                yy = 0.0,
                x0 = 0.0,
                y0 = 0.0,
                scope = this,
            )
            pattern.getMatrix(retrievedMatrix)

            // Assert that retrieval worked
            assertNotNull(retrievedMatrix, "Retrieved matrix should not be null.")
            assertEquals(2.0, retrievedMatrix.xx, "Matrix xx component should match the set value.")
            assertEquals(2.0, retrievedMatrix.yy, "Matrix yy component should match the set value.")

            // Confirm pattern is still in SUCCESS state
            assertEquals(
                Status.SUCCESS,
                pattern.status(),
                "Pattern should remain in SUCCESS status after matrix operations.",
            )
        }
    }

    @Test
    fun `test get pattern type`() {
        val pattern: Pattern = LinearGradient(0.0, 0.0, 10.0, 10.0)
        // Expect LINEAR since we used LinearGradient
        assertEquals(PatternType.LINEAR, pattern.getPatternType(), "Expected pattern type to be LINEAR.")
        assertEquals(Status.SUCCESS, pattern.status(), "Pattern should have SUCCESS status.")
    }

//    @Ignore("Does not work with cairo 1.17.8 (Fedora 38, Gnome 45 Flatpak SDK)")
    @Test
    fun `test dither`() {
        val pattern: Pattern = LinearGradient(0.0, 0.0, 10.0, 10.0)
        pattern.setDither(Dither.FAST)
        assertEquals(Dither.FAST, pattern.getDither(), "Expected dither mode to be FAST.")
        assertEquals(Status.SUCCESS, pattern.status(), "Pattern should have SUCCESS status.")
    }
}

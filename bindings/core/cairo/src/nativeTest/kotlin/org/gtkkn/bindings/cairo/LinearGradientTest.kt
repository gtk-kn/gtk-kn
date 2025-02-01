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

class LinearGradientTest {
    @Test
    fun `should create LinearGradient with success status`() {
        val gradient = LinearGradient(0.0, 0.0, 10.0, 10.0)
        assertEquals(
            Status.SUCCESS,
            gradient.status(),
            "Expected newly created linear gradient to have SUCCESS status",
        )
    }

    @Test
    fun `should add RGB color stop without error`() {
        val gradient = LinearGradient(0.0, 0.0, 10.0, 10.0)

        // Add a color stop at offset 0.5 (midpoint)
        gradient.addColorStopRgb(
            offset = 0.5,
            red = 1.0,
            green = 0.0,
            blue = 0.0,
        )

        // Confirm no error occurred
        assertEquals(Status.SUCCESS, gradient.status(), "Expected SUCCESS after adding an RGB color stop")
    }

    @Test
    fun `should add RGBA color stop without error`() {
        val gradient = LinearGradient(0.0, 0.0, 10.0, 10.0)

        // Add a color stop at offset 0.0 (start), with alpha
        gradient.addColorStopRgba(
            offset = 0.0,
            red = 0.0,
            green = 1.0,
            blue = 0.0,
            alpha = 0.5,
        )

        // Confirm no error occurred
        assertEquals(Status.SUCCESS, gradient.status(), "Expected SUCCESS after adding an RGBA color stop")
    }

    @Test
    fun `should have linear pattern type`() {
        val gradient = LinearGradient(0.0, 0.0, 10.0, 10.0)

        // For a linear gradient, the pattern type should be LINEAR
        val patternType = gradient.getPatternType()
        assertEquals(PatternType.LINEAR, patternType, "Expected pattern type to be LINEAR for LinearGradient")
    }

    @Test
    fun `should change extend mode successfully`() {
        val gradient = LinearGradient(0.0, 0.0, 10.0, 10.0)
        assertEquals(Status.SUCCESS, gradient.status())

        // Change extend mode to REPEAT
        gradient.setExtend(Extend.REPEAT)
        val currentExtend = gradient.getExtend()
        assertEquals(Extend.REPEAT, currentExtend, "Extend mode should be set to REPEAT")
    }

    @Test
    fun `should change filter successfully`() {
        val gradient = LinearGradient(0.0, 0.0, 10.0, 10.0)
        assertEquals(Status.SUCCESS, gradient.status())

        // Change filter to FAST
        gradient.setFilter(Filter.FAST)
        val currentFilter = gradient.getFilter()
        assertEquals(Filter.FAST, currentFilter, "Filter should be set to FAST")
    }

    @Test
    fun `should set and retrieve matrix successfully`() {
        val gradient = LinearGradient(0.0, 0.0, 10.0, 10.0)
        assertEquals(Status.SUCCESS, gradient.status(), "Expected SUCCESS status for newly created LinearGradient")

        memScoped {
            // Create and set a matrix using the constructor with explicit values
            val matrixToSet = Matrix(
                xx = 1.0,
                yx = 0.0,
                xy = 0.0,
                yy = 1.0,
                x0 = 5.0,
                y0 = 5.0,
                scope = this
            )

            // Set the matrix to the gradient
            gradient.setMatrix(matrixToSet)

            // Retrieve the matrix into a new object
            val retrievedMatrix = Matrix(
                xx = 0.0,  // Initialize with dummy values
                yx = 0.0,
                xy = 0.0,
                yy = 0.0,
                x0 = 0.0,
                y0 = 0.0,
                scope = this
            )
            gradient.getMatrix(retrievedMatrix)

            // Assert that the retrieved matrix matches the set matrix
            assertNotNull(retrievedMatrix, "Retrieved matrix should not be null")
            assertEquals(1.0, retrievedMatrix.xx, "Matrix `xx` should match the set value")
            assertEquals(0.0, retrievedMatrix.yx, "Matrix `yx` should match the set value")
            assertEquals(0.0, retrievedMatrix.xy, "Matrix `xy` should match the set value")
            assertEquals(1.0, retrievedMatrix.yy, "Matrix `yy` should match the set value")
            assertEquals(5.0, retrievedMatrix.x0, "Matrix `x0` should match the set value")
            assertEquals(5.0, retrievedMatrix.y0, "Matrix `y0` should match the set value")
        }
    }
}

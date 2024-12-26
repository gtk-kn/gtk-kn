/*
 * Copyright (c) 2024 gtk-kn
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * gtk-kn is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with gtk-kn. If not, see https://www.gnu.org/licenses/.
 */

package org.gtkkn.bindings.cairo

import kotlinx.cinterop.memScoped
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class SurfacePatternTests {
    @Test
    fun `should create SurfacePattern with success status`() {
        val surface = ImageSurface.create(Format.ARGB32, 120, 120)
        val pattern = SurfacePattern(surface)

        assertEquals(
            Status.SUCCESS,
            pattern.status(),
            "Expected newly created surface pattern to have SUCCESS status",
        )
    }

    @Test
    fun `should have surface pattern type`() {
        val surface = ImageSurface.create(Format.ARGB32, 120, 120)
        val pattern = SurfacePattern(surface)

        // For a surface pattern, the pattern type should be SURFACE
        val patternType = pattern.getPatternType()
        assertEquals(PatternType.SURFACE, patternType, "Expected pattern type to be SURFACE for SurfacePattern")
    }

    @Test
    fun `should change extend mode successfully`() {
        val surface = ImageSurface.create(Format.ARGB32, 120, 120)
        val pattern = SurfacePattern(surface)
        assertEquals(Status.SUCCESS, pattern.status())

        // Change extend mode to REPEAT
        pattern.setExtend(Extend.REPEAT)
        val currentExtend = pattern.getExtend()
        assertEquals(Extend.REPEAT, currentExtend, "Extend mode should be set to REPEAT")
    }

    @Test
    fun `should change filter successfully`() {
        val surface = ImageSurface.create(Format.ARGB32, 120, 120)
        val pattern = SurfacePattern(surface)
        assertEquals(Status.SUCCESS, pattern.status())

        // Change filter to FAST
        pattern.setFilter(Filter.FAST)
        val currentFilter = pattern.getFilter()
        assertEquals(Filter.FAST, currentFilter, "Filter should be set to FAST")
    }

    @Test
    fun `should set and retrieve matrix successfully`() {
        val surface = ImageSurface.create(Format.ARGB32, 120, 120)
        val pattern = SurfacePattern(surface)
        assertEquals(Status.SUCCESS, pattern.status(), "Expected SUCCESS status for newly created SurfacePattern")

        memScoped {
            // Create and set a matrix using the constructor with explicit values
            val matrixToSet = Matrix(
                xx = 1.0,
                yx = 0.0,
                xy = 0.0,
                yy = 1.0,
                x0 = 5.0,
                y0 = 5.0,
                scope = this,
            )

            // Set the matrix to the pattern
            pattern.setMatrix(matrixToSet)

            // Retrieve the matrix into a new object
            val retrievedMatrix = Matrix(
                xx = 0.0,  // Initialize with dummy values
                yx = 0.0,
                xy = 0.0,
                yy = 0.0,
                x0 = 0.0,
                y0 = 0.0,
                scope = this,
            )
            pattern.getMatrix(retrievedMatrix)

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

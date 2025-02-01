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
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin
import kotlin.test.Test
import kotlin.test.assertEquals

/**
 * Unit tests for the Matrix class.
 */
class MatrixTest {
    @Test
    fun `should init matrix with given values`(): Unit = memScoped {
        val matrix = Matrix(xx = 1.0, yx = 0.0, xy = 0.0, yy = 1.0, x0 = 0.0, y0 = 0.0, scope = this)
        matrix.`init`(2.0, 0.0, 0.0, 2.0, 0.0, 0.0)
        assertEquals(2.0, matrix.xx, "Matrix `xx` should be 2.0 after init")
        assertEquals(2.0, matrix.yy, "Matrix `yy` should be 2.0 after init")
        assertEquals(0.0, matrix.x0, "Matrix `x0` should remain 0.0 after init")
        assertEquals(0.0, matrix.y0, "Matrix `y0` should remain 0.0 after init")
    }

    @Test
    fun `should create identity matrix`(): Unit = memScoped {
        val matrix = Matrix(xx = 0.0, yx = 0.0, xy = 0.0, yy = 0.0, x0 = 0.0, y0 = 0.0, scope = this)
        matrix.initIdentity()
        assertEquals(1.0, matrix.xx, "Matrix `xx` should be 1.0 in identity")
        assertEquals(1.0, matrix.yy, "Matrix `yy` should be 1.0 in identity")
        assertEquals(0.0, matrix.xy, "Matrix `xy` should remain 0.0 in identity")
        assertEquals(0.0, matrix.yx, "Matrix `yx` should remain 0.0 in identity")
    }

    @Test
    fun `should create translate matrix`(): Unit = memScoped {
        val matrix = Matrix(xx = 0.0, yx = 0.0, xy = 0.0, yy = 0.0, x0 = 0.0, y0 = 0.0, scope = this)
        matrix.initTranslate(20.0, 30.0)
        // Translation components
        assertEquals(20.0, matrix.x0, "Translate X should be 20.0")
        assertEquals(30.0, matrix.y0, "Translate Y should be 30.0")
        // Identity components for translation matrix
        assertEquals(1.0, matrix.xx, "Matrix `xx` should be 1.0 in a valid translation matrix")
        assertEquals(1.0, matrix.yy, "Matrix `yy` should be 1.0 in a valid translation matrix")
        assertEquals(0.0, matrix.xy, "Matrix `xy` should remain 0.0 in a valid translation matrix")
        assertEquals(0.0, matrix.yx, "Matrix `yx` should remain 0.0 in a valid translation matrix")
    }

    @Test
    fun `should apply rotation to identity matrix`(): Unit = memScoped {
        val matrix = Matrix(xx = 1.0, yx = 0.0, xy = 0.0, yy = 1.0, x0 = 0.0, y0 = 0.0, scope = this)
        matrix.rotate(PI / 2) // Rotate 90 degrees
        val tolerance = 1e-9
        assertEquals(0.0, matrix.xx, tolerance, "Matrix `xx` should be ~0 after 90-degree rotation")
        assertEquals(-1.0, matrix.xy, tolerance, "Matrix `xy` should be ~-1 after 90-degree rotation")
        assertEquals(1.0, matrix.yx, tolerance, "Matrix `yx` should be ~1 after 90-degree rotation")
        assertEquals(0.0, matrix.yy, tolerance, "Matrix `yy` should be ~0 after 90-degree rotation")
    }

    @Test
    fun `should multiply two matrices into a result matrix`(): Unit = memScoped {
        val matrix1 = Matrix(
            xx = cos(PI / 4),
            yx = sin(PI / 4),
            xy = -sin(PI / 4),
            yy = cos(PI / 4),
            x0 = 0.0,
            y0 = 0.0,
            scope = this,
        )
        val matrix2 = Matrix(xx = 1.0, yx = 0.0, xy = 0.0, yy = 1.0, x0 = 20.0, y0 = 20.0, scope = this)
        val resultMatrix = Matrix(xx = 0.0, yx = 0.0, xy = 0.0, yy = 0.0, x0 = 0.0, y0 = 0.0, scope = this)
        resultMatrix.multiply(matrix1, matrix2)
        assertEquals(20.0, resultMatrix.x0, "Resultant `x0` should reflect translation")
        assertEquals(20.0, resultMatrix.y0, "Resultant `y0` should reflect translation")
    }

    @Test
    fun `should correctly transform a distance vector`() = memScoped {
        val matrix = Matrix(xx = 2.0, yx = 0.0, xy = 0.0, yy = 3.0, x0 = 0.0, y0 = 0.0, scope = this)
        val point = Point(5.0, 4.0)
        val transformed = matrix.transformDistance(point)
        assertEquals(10.0, transformed.x, "Distance X should be scaled by `xx` (2.0)")
        assertEquals(12.0, transformed.y, "Distance Y should be scaled by `yy` (3.0)")
    }

    @Test
    fun `should correctly transform a point with translation`() = memScoped {
        val matrix = Matrix(xx = 1.0, yx = 0.0, xy = 0.0, yy = 1.0, x0 = 15.0, y0 = 25.0, scope = this)
        val point = Point(5.0, 5.0)
        val transformed = matrix.transformPoint(point)
        assertEquals(20.0, transformed.x, "Point X should include translation `x0` (15.0)")
        assertEquals(30.0, transformed.y, "Point Y should include translation `y0` (25.0)")
    }

    /**
     * A simple Point class to demonstrate transform tests.
     */
    data class Point(val x: Double, val y: Double)

    /**
     * Utility to simulate transforming a distance (ignores x0, y0).
     */
    private fun Matrix.transformDistance(point: Point): Point {
        val xNew = xx * point.x + xy * point.y
        val yNew = yx * point.x + yy * point.y
        return Point(xNew, yNew)
    }

    /**
     * Utility to simulate transforming a point (includes x0, y0).
     */
    private fun Matrix.transformPoint(point: Point): Point {
        val xNew = xx * point.x + xy * point.y + x0
        val yNew = yx * point.x + yy * point.y + y0
        return Point(xNew, yNew)
    }
}

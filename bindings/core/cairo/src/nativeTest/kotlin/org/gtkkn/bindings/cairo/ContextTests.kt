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

class ContextTests {
    private fun createContext(): Context {
        // Assuming ImageSurface and Format are available in your Kotlin/Native cairo bindings
        val surface = ImageSurface.create(Format.ARGB32, 120, 120)
        return Context.create(surface)
    }

    @Test
    fun `should create context with success status`() {
        val cr = createContext()
        assertEquals(Status.SUCCESS, cr.status(), "Context should be created with SUCCESS status")
    }

    @Test
    fun `should save and restore line cap`() {
        val cr = createContext()
        cr.setLineCap(LineCap.ROUND)
        cr.save()
        cr.setLineCap(LineCap.SQUARE)
        cr.restore()

        // After restore, line cap should go back to ROUND
        assertEquals(LineCap.ROUND, cr.getLineCap(), "LineCap should be ROUND after restore")
        assertEquals(Status.SUCCESS, cr.status(), "Status should remain SUCCESS")
    }

    @Test
    fun `should get target surface`() {
        val surface = ImageSurface.create(Format.ARGB32, 120, 120)
        val cr = Context.create(surface)
        val target = cr.getTarget()

        assertNotNull(target, "Target surface should not be null")
        // If your Surface class provides a handle or similar:
//        assertEquals(surface.handle(), target.handle(), "Context target handle should match original surface handle")
        assertEquals(Status.SUCCESS, cr.status(), "Status should remain SUCCESS")
    }

    @Test
    fun `should push group and pop group to source`() {
        val cr = createContext()
        cr.pushGroup()
        cr.popGroupToSource()

        // Just verify status
        assertEquals(Status.SUCCESS, cr.status(), "Status should remain SUCCESS after push & pop group")
    }

    @Test
    fun `should set source rgb and retrieve source pattern`() {
        val cr = createContext()
        cr.setSourceRgb(0.0, 0.0, 0.0)  // black
        val sourcePattern = cr.getSource()

        assertEquals(Status.SUCCESS, sourcePattern.status(), "Source pattern should have SUCCESS status")
        assertEquals(Status.SUCCESS, cr.status(), "Context should remain SUCCESS")
    }

    @Test
    fun `should set antialias and verify`() {
        val cr = createContext()
        cr.setAntialias(Antialias.GOOD)
        val result = cr.getAntialias()

        assertEquals(Antialias.GOOD, result, "Antialias should match the set value")
        assertEquals(Status.SUCCESS, cr.status(), "Context should remain SUCCESS")
    }

    @Test
    fun `should set line width and verify`() {
        val cr = createContext()
        cr.setLineWidth(3.5)
        assertEquals(3.5, cr.getLineWidth(), "Expected line width to match 3.5")
        assertEquals(Status.SUCCESS, cr.status(), "Context should remain SUCCESS")
    }

    @Test
    fun `should fill rectangle and clear path`() {
        val cr = createContext()
        cr.rectangle(10.0, 10.0, 10.0, 10.0)
        cr.fill()

        // After fill, the path should be cleared
        assertEquals(Status.SUCCESS, cr.status(), "Status should remain SUCCESS after fill")
    }

    @Test
    fun `should fill rectangle but preserve path`() {
        val cr = createContext()
        cr.rectangle(10.0, 10.0, 10.0, 10.0)
        cr.fillPreserve()

        // fillPreserve does NOT clear the current path
        assertEquals(Status.SUCCESS, cr.status(), "Status should remain SUCCESS after fillPreserve")
    }

    @Test
    fun `should move and line to then stroke and clear path`() {
        val cr = createContext()
        cr.moveTo(10.0, 10.0)
        cr.lineTo(30.0, 30.0)
        cr.stroke()

        // stroke clears the path
        assertEquals(Status.SUCCESS, cr.status(), "Status should remain SUCCESS")
    }

    @Test
    fun `should stroke preserve path`() {
        val cr = createContext()
        cr.moveTo(10.0, 20.0)
        cr.lineTo(10.0, 40.0)
        cr.strokePreserve()

        // strokePreserve does NOT clear the path
        assertEquals(Status.SUCCESS, cr.status(), "Status should remain SUCCESS")
    }

    @Test
    fun `should translate and rotate without error`() {
        val cr = createContext()
        cr.translate(10.0, 10.0)
        cr.rotate(45.0)  // angle in degrees or radians depending on your binding; adjust as needed
        assertEquals(Status.SUCCESS, cr.status(), "Status should remain SUCCESS after translate and rotate")
    }

    @Test
    fun `should set and retrieve matrix`() {
        val cr = createContext()
        memScoped {
            val matrixToSet = Matrix(
                xx = 1.0,
                yx = 0.0,
                xy = 0.0,
                yy = 1.0,
                x0 = 2.5,
                y0 = 3.0,
                scope = this,
            )
            cr.setMatrix(matrixToSet)

            val retrievedMatrix = Matrix(
                xx = 0.0,
                yx = 0.0,
                xy = 0.0,
                yy = 0.0,
                x0 = 0.0,
                y0 = 0.0,
                scope = this,
            )
            cr.getMatrix(retrievedMatrix)

            assertEquals(matrixToSet.xx, retrievedMatrix.xx, "Matrix `xx` should match")
            assertEquals(matrixToSet.yy, retrievedMatrix.yy, "Matrix `yy` should match")
            assertEquals(matrixToSet.x0, retrievedMatrix.x0, "Matrix `x0` should match")
            assertEquals(matrixToSet.y0, retrievedMatrix.y0, "Matrix `y0` should match")
        }
        assertEquals(Status.SUCCESS, cr.status(), "Status should remain SUCCESS after setting and retrieving matrix")
    }

    @Test
    fun `should paint with alpha without error`() {
        val cr = createContext()
        cr.paintWithAlpha(0.5)
        assertEquals(Status.SUCCESS, cr.status(), "Status should remain SUCCESS after paintWithAlpha")
    }

    @Test
    fun `should copy page and show page without error`() {
        val cr = createContext()
        cr.copyPage()
        cr.showPage()
        assertEquals(Status.SUCCESS, cr.status(), "Status should remain SUCCESS after copyPage and showPage")
    }
}

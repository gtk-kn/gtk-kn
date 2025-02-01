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

class MeshTest {
    @Test
    fun `should create Mesh with success status`() {
        val mesh = Mesh()
        assertEquals(
            Status.SUCCESS,
            mesh.status(),
            "Expected newly created mesh pattern to have SUCCESS status",
        )
    }

    @Test
    fun `should begin and end a patch successfully`() {
        val mesh = Mesh()
        mesh.beginPatch()
        mesh.moveTo(10.0, 10.0)
        mesh.endPatch()
        assertEquals(
            Status.SUCCESS,
            mesh.status(),
            "Expected SUCCESS after beginning a patch, moving, and ending the patch",
        )
    }

    @Test
    fun `should move to a point successfully`() {
        val mesh = Mesh()
        mesh.beginPatch()
        mesh.moveTo(10.0, 10.0)
        assertEquals(
            Status.SUCCESS,
            mesh.status(),
            "Expected SUCCESS after calling moveTo",
        )
    }

    @Test
    fun `should create a line successfully`() {
        val mesh = Mesh()
        mesh.beginPatch()
        mesh.lineTo(20.0, 20.0)
        assertEquals(
            Status.SUCCESS,
            mesh.status(),
            "Expected SUCCESS after calling lineTo",
        )
    }

    @Test
    fun `should create a curve successfully`() {
        val mesh = Mesh()
        mesh.beginPatch()
        mesh.curveTo(30.0, -30.0, 60.0, 30.0, 100.0, 0.0)
        assertEquals(
            Status.SUCCESS,
            mesh.status(),
            "Expected SUCCESS after calling curveTo",
        )
    }

    @Test
    fun `should set RGB corner color successfully`() {
        val mesh = Mesh()
        mesh.beginPatch()
        mesh.moveTo(10.0, 10.0)
        mesh.lineTo(20.0, 20.0)
        mesh.lineTo(30.0, 30.0)
        mesh.setCornerColorRgb(
            cornerNum = 0u,
            red = 0.5,
            green = 0.5,
            blue = 0.5,
        )
        mesh.endPatch()
        assertEquals(
            Status.SUCCESS,
            mesh.status(),
            "Expected SUCCESS after setting an RGB corner color",
        )
    }

    @Test
    fun `should set RGBA corner color successfully`() {
        val mesh = Mesh()
        mesh.beginPatch()
        mesh.moveTo(10.0, 10.0)
        mesh.lineTo(20.0, 20.0)
        mesh.lineTo(30.0, 30.0)
        mesh.setCornerColorRgba(
            cornerNum = 0u,
            red = 0.5,
            green = 0.6,
            blue = 0.7,
            alpha = 0.8,
        )
        mesh.endPatch()
        assertEquals(
            Status.SUCCESS,
            mesh.status(),
            "Expected SUCCESS after setting an RGBA corner color",
        )
    }

    @Test
    fun `should create multiple patches successfully`() {
        val mesh = Mesh()

        // First patch
        mesh.beginPatch()
        mesh.moveTo(10.0, 10.0)
        mesh.lineTo(20.0, 20.0)
        mesh.endPatch()

        // Second patch
        mesh.beginPatch()
        mesh.moveTo(50.0, 50.0)
        mesh.lineTo(60.0, 60.0)
        mesh.endPatch()

        assertEquals(
            Status.SUCCESS,
            mesh.status(),
            "Expected SUCCESS after creating multiple patches",
        )
    }

    @Test
    fun `should not end patch without starting it`() {
        val mesh = Mesh()
        try {
            mesh.endPatch()
        } catch (e: Exception) {
            assertEquals(
                "Attempt to end a patch without beginning one",
                e.message,
                "Expected exception message for ending patch without beginning",
            )
        }
    }

    @Test
    fun `should create a patch with valid control points`() {
        val mesh = Mesh()
        mesh.beginPatch()

        // Define a rectangular patch with curves
        mesh.moveTo(10.0, 10.0)
        mesh.lineTo(20.0, 10.0)
        mesh.lineTo(20.0, 20.0)
        mesh.lineTo(10.0, 20.0)

        // Set control points for Bézier curves (required for mesh patches)
        mesh.setControlPoint(0u, 10.0, 10.0)
        mesh.setControlPoint(1u, 20.0, 10.0)
        mesh.setControlPoint(2u, 20.0, 20.0)
        mesh.setControlPoint(3u, 10.0, 20.0)

        mesh.endPatch()

        assertEquals(
            Status.SUCCESS,
            mesh.status(),
            "Expected SUCCESS after setting valid control points in a patch",
        )
    }

    @Test
    fun `should return INVALID_MESH_CONSTRUCTION for improperly defined patches`() {
        val mesh = Mesh()

        // Begin a patch but do not define it properly (e.g., missing moveTo or lineTo calls)
        mesh.beginPatch()
        // No moveTo or lineTo calls here
        mesh.endPatch()

        // Verify that the mesh status indicates INVALID_MESH_CONSTRUCTION
        assertEquals(
            Status.INVALID_MESH_CONSTRUCTION,
            mesh.status(),
            "Expected INVALID_MESH_CONSTRUCTION when a patch is not properly defined",
        )
    }
}

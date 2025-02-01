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
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class PsSurfaceTest {
    @Test
    fun `should create surface with success status using null filename`() {
        // Create a surface using `null` or an empty string, depending on your native support
        val surface = PsSurface(filename = null, widthInPoints = 120.0, heightInPoints = 120.0)
        assertNotNull(surface, "PsSurface(...) returned null, but a surface was expected")
        assertEquals(Status.SUCCESS, surface.status(), "Expected newly created surface to have SUCCESS status")
        surface.finish()
    }

    @Test
    fun `should restrict to PS level 3 successfully`() {
        val surface = PsSurface(filename = null, widthInPoints = 120.0, heightInPoints = 120.0)
        surface.restrictToLevel(PsLevel.LEVEL_3)

        assertEquals(Status.SUCCESS, surface.status(), "Expected SUCCESS after restricting to PS level 3")
        surface.finish()
    }

    @Test
    fun `should set and get EPS successfully`() {
        val surface = PsSurface(filename = null, widthInPoints = 120.0, heightInPoints = 120.0)
        surface.setEps(true)

        // Validate that EPS was indeed set
        assertTrue(surface.getEps(), "Expected EPS to be set to true")

        // Check final status
        assertEquals(Status.SUCCESS, surface.status(), "Expected SUCCESS after setting EPS on the surface")
        surface.finish()
    }

    @Test
    fun `should set size successfully`() {
        val surface = PsSurface(filename = null, widthInPoints = 120.0, heightInPoints = 120.0)

        surface.setSize(widthInPoints = 140.0, heightInPoints = 140.0)
        assertEquals(Status.SUCCESS, surface.status(), "Expected SUCCESS after setting size of the PS surface")
        surface.finish()
    }

    @Test
    fun `should begin DSC setup without error`() {
        val surface = PsSurface(filename = null, widthInPoints = 120.0, heightInPoints = 120.0)

        // The DSC setup should not produce errors
        surface.dscBeginSetup()
        assertEquals(Status.SUCCESS, surface.status(), "Expected SUCCESS after beginning DSC setup")
        surface.finish()
    }

    @Test
    fun `should begin DSC page setup without error`() {
        val surface = PsSurface(filename = null, widthInPoints = 120.0, heightInPoints = 120.0)

        // The DSC page setup should not produce errors
        surface.dscBeginPageSetup()
        assertEquals(Status.SUCCESS, surface.status(), "Expected SUCCESS after beginning DSC page setup")
        surface.finish()
    }

    @Test
    fun `should add DSC comment successfully`() {
        val surface = PsSurface(filename = null, widthInPoints = 120.0, heightInPoints = 120.0)

        // Add a simple DSC comment
        surface.dscComment("%%Title: Test")
        assertEquals(Status.SUCCESS, surface.status(), "Expected SUCCESS after adding a DSC comment")
        surface.finish()
    }
}

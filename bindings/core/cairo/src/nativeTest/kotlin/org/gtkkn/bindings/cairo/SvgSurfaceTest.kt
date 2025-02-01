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

import org.gtkkn.native.cairo.CAIRO_SVG_UNIT_CM
import org.gtkkn.native.cairo.CAIRO_SVG_UNIT_USER
import kotlin.test.Test
import kotlin.test.assertEquals

class SvgSurfaceTest {
    @Test
    fun `should create SVG surface with empty filename`() {
        val surface = SvgSurface(null, 120.0, 120.0)

        // Assert that the surface was created successfully
        assertEquals(
            expected = Status.SUCCESS,
            actual = surface.status(),
            message = "Expected SVG surface creation to have SUCCESS status",
        )
    }

    @Test
    fun `should get document unit with default value`() {
        val surface = SvgSurface(null, 120.0, 120.0)

        // Attempt to retrieve the document unit (if the underlying library supports it).
        val documentUnit = surface.getDocumentUnit()

        // No specific assumption about the default unit here, so we just ensure no error:
        assertEquals(
            expected = Status.SUCCESS,
            actual = surface.status(),
            message = "Expected SUCCESS when getting document unit",
        )
        // Optionally assert on the actual default value if known, e.g.:
        assertEquals(CAIRO_SVG_UNIT_USER, documentUnit, "Expected default unit to be 'user' units")
    }

    @Test
    fun `should set document unit without error`() {
        val surface = SvgSurface(null, 120.0, 120.0)

        surface.setDocumentUnit(CAIRO_SVG_UNIT_CM)

        // Ensure the surface still has no error
        assertEquals(
            expected = Status.SUCCESS,
            actual = surface.status(),
            message = "Expected SUCCESS after setting document unit",
        )
    }

    @Test
    fun `should restrict to SVG 1_2 version without error`() {
        val surface = SvgSurface(null, 120.0, 120.0)

        surface.restrictToVersion(SvgVersion.VERSION_1_2)

        // Confirm no error occurred
        assertEquals(
            expected = Status.SUCCESS,
            actual = surface.status(),
            message = "Expected SUCCESS after restricting SVG surface to version 1.2",
        )
    }
}

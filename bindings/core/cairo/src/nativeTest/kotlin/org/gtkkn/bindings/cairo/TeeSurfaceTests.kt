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

import kotlin.test.Test
import kotlin.test.assertEquals

class TeeSurfaceTests {
    @Test
    fun `should create TeeSurface with success status`() {
        // Create a primary ImageSurface to back the TeeSurface
        val primary = ImageSurface.create(Format.ARGB32, 120, 120)
        assertEquals(Status.SUCCESS, primary.status(), "Primary surface should have SUCCESS status")

        // Create the TeeSurface from the primary
        val tee = TeeSurface.create(primary)
        assertEquals(Status.SUCCESS, tee.status(), "TeeSurface should have SUCCESS status upon creation")
    }

    @Test
    fun `should add and remove surfaces without error`() {
        val primary = ImageSurface.create(Format.ARGB32, 120, 120)
        val target = ImageSurface.create(Format.ARGB32, 120, 120)

        // Create the TeeSurface from the primary
        val tee = TeeSurface.create(primary)
        assertEquals(Status.SUCCESS, tee.status(), "TeeSurface should have SUCCESS status upon creation")

        // Add a secondary target to the TeeSurface
        tee.add(target)
        // Now remove it
        tee.remove(target)

        // Confirm TeeSurface is still healthy
        assertEquals(Status.SUCCESS, tee.status(), "TeeSurface should have SUCCESS status after add/remove")
    }
}

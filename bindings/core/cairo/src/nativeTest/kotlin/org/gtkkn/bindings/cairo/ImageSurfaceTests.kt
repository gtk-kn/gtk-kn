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
import kotlin.test.assertNotEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class ImageSurfaceTests {
    @Test
    fun `should calculate valid stride for given format and width`() {
        val stride = ImageSurface.formatStrideForWidth(Format.ARGB32, 120)
        assertNotEquals(-1, stride, "Stride should not be -1 for ARGB32 format")
    }

    @Test
    fun `should create ImageSurface with specified format and dimensions`() {
        val surface = ImageSurface.create(Format.ARGB32, 120, 120)
        assertEquals(Status.SUCCESS, surface.status(), "Expected SUCCESS after creating an ImageSurface")
    }

    @Test
    fun `should retrieve non-null data from ImageSurface`() {
        val surface = ImageSurface.create(Format.ARGB32, 120, 120)
        val data = surface.getData()
        assertNotNull(data, "Surface data should not be null")
        assertEquals(Status.SUCCESS, surface.status(), "Expected SUCCESS after retrieving data from ImageSurface")
    }

    @Test
    fun `should return correct format for created ImageSurface`() {
        val surface = ImageSurface.create(Format.ARGB32, 120, 120)
        val format = surface.getFormat()
        assertEquals(Format.ARGB32, format, "Expected format ARGB32 for created ImageSurface")
        assertEquals(Status.SUCCESS, surface.status(), "Expected SUCCESS after retrieving format")
    }

    @Test
    fun `should return correct width for created ImageSurface`() {
        val surface = ImageSurface.create(Format.ARGB32, 120, 100)
        assertEquals(120, surface.getWidth(), "Expected width to be 120")
        assertEquals(Status.SUCCESS, surface.status(), "Expected SUCCESS after retrieving width")
    }

    @Test
    fun `should return correct height for created ImageSurface`() {
        val surface = ImageSurface.create(Format.ARGB32, 100, 120)
        assertEquals(120, surface.getHeight(), "Expected height to be 120")
        assertEquals(Status.SUCCESS, surface.status(), "Expected SUCCESS after retrieving height")
    }

    @Test
    fun `should calculate valid stride for created ImageSurface`() {
        val surface = ImageSurface.create(Format.ARGB32, 120, 120)
        val stride = surface.getStride()

        // Typically, for ARGB32, stride = 4 * width, possibly rounded up to alignment.
        assertTrue(stride >= 480, "Expected stride >= 480 for ARGB32 with width=120")
        assertEquals(Status.SUCCESS, surface.status(), "Expected SUCCESS after retrieving stride")
    }
}

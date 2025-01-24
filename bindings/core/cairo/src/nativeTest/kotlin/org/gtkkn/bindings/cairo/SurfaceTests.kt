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
import kotlin.test.assertFalse

class SurfaceTests {
    @Test
    fun `should create a similar surface with SUCCESS status`() {
        val s1 = ImageSurface.create(Format.ARGB32, 120, 120)
        val s2 = Surface.createSimilar(s1, Content.COLOR_ALPHA, 120, 120)

        assertEquals(Status.SUCCESS, s2.status(), "Expected SUCCESS status for similar Surface")

        s2.destroy()
        s1.destroy()
    }

    @Test
    fun `should create a similar image surface with SUCCESS status`() {
        val s1 = ImageSurface.create(Format.ARGB32, 120, 120)
        val s2 = Surface.createSimilarImage(s1, Format.ARGB32, 120, 120)

        assertEquals(Status.SUCCESS, s2.status(), "Expected SUCCESS status for similar image Surface")

        s2.destroy()
        s1.destroy()
    }

    @Test
    fun `should create a surface for a rectangle with SUCCESS status`() {
        val s1 = ImageSurface.create(Format.ARGB32, 120, 120)
        val s2 = Surface.createForRectangle(s1, 50.0, 50.0, 20.0, 20.0)

        assertEquals(Status.SUCCESS, s2.status(), "Expected SUCCESS status for sub-rectangle Surface")

        s2.destroy()
        s1.destroy()
    }

    @Test
    fun `should return SUCCESS status after surface creation`() {
        val s = ImageSurface.create(Format.ARGB32, 120, 120)
        assertEquals(Status.SUCCESS, s.status(), "Expected SUCCESS status after surface creation")

        s.destroy()
    }

    @Test
    fun `should return SUCCESS status after calling finish`() {
        val s = ImageSurface.create(Format.ARGB32, 120, 120)
        s.finish()
        assertEquals(Status.SUCCESS, s.status(), "Expected SUCCESS status after finish()")

        s.destroy()
    }

    @Test
    fun `should return SUCCESS status after calling flush`() {
        val s = ImageSurface.create(Format.ARGB32, 120, 120)
        s.flush()
        assertEquals(Status.SUCCESS, s.status(), "Expected SUCCESS status after flush()")

        s.destroy()
    }

//    @Test
//    fun `should retrieve a valid device without errors`() {
//        val s = ImageSurface.create(Format.ARGB32, 120, 120)
//        val device = s.getDevice()
//
//        assertEquals(Status.SUCCESS, s.status(), "Expected SUCCESS status after getDevice()")
//        assertNotNull(device, "Expected a non-null device for the given Surface")
//
//        s.destroy()
//    }

    @Test
    fun `should retrieve font options without errors`() {
        val s = ImageSurface.create(Format.ARGB32, 120, 120)
        val options = FontOptions.create()

        s.getFontOptions(options)

        assertEquals(Status.SUCCESS, s.status(), "Expected SUCCESS status after getFontOptions()")
        assertEquals(Status.SUCCESS, options.status(), "Expected SUCCESS status for retrieved FontOptions")

        s.destroy()
    }

    @Test
    fun `should retrieve content type as COLOR_ALPHA for ARGB32 format`() {
        val s = ImageSurface.create(Format.ARGB32, 120, 120)
        assertEquals(Content.COLOR_ALPHA, s.getContent(), "Expected COLOR_ALPHA content for ARGB32 format")
        assertEquals(Status.SUCCESS, s.status(), "Expected SUCCESS status after getContent()")

        s.destroy()
    }

    @Test
    fun `should mark the entire surface as dirty without errors`() {
        val s = ImageSurface.create(Format.ARGB32, 120, 120)
        s.markDirty()

        assertEquals(Status.SUCCESS, s.status(), "Expected SUCCESS status after markDirty()")

        s.destroy()
    }

    @Test
    fun `should mark a rectangle as dirty without errors`() {
        val s = ImageSurface.create(Format.ARGB32, 120, 120)
        s.markDirtyRectangle(0, 0, 10, 10)

        assertEquals(Status.SUCCESS, s.status(), "Expected SUCCESS status after markDirtyRectangle()")

        s.destroy()
    }

    @Test
    fun `should set device offset without errors`() {
        val s = ImageSurface.create(Format.ARGB32, 120, 120)
        s.setDeviceOffset(3.0, 5.0)

        assertEquals(Status.SUCCESS, s.status(), "Expected SUCCESS status after setDeviceOffset()")

        s.destroy()
    }

    @Test
    fun `should set device scale without errors`() {
        val s = ImageSurface.create(Format.ARGB32, 120, 120)
        s.setDeviceScale(2.5, 3.5)

        assertEquals(Status.SUCCESS, s.status(), "Expected SUCCESS status after setDeviceScale()")

        s.destroy()
    }

    @Test
    fun `should set fallback resolution without errors`() {
        val s = ImageSurface.create(Format.ARGB32, 120, 120)
        s.setFallbackResolution(2.5, 3.5)

        assertEquals(Status.SUCCESS, s.status(), "Expected SUCCESS status after setFallbackResolution()")

        s.destroy()
    }

    @Test
    fun `should return IMAGE surface type for an ImageSurface`() {
        val s = ImageSurface.create(Format.ARGB32, 120, 120)
        assertEquals(SurfaceType.IMAGE, s.getSurfaceType(), "Expected IMAGE surface type for an ImageSurface")
        assertEquals(Status.SUCCESS, s.status())

        s.destroy()
    }

    @Test
    fun `should copy page without errors`() {
        val s = ImageSurface.create(Format.ARGB32, 120, 120)
        s.copyPage()

        assertEquals(Status.SUCCESS, s.status(), "Expected SUCCESS status after copyPage()")

        s.destroy()
    }

    @Test
    fun `should show page without errors`() {
        val s = ImageSurface.create(Format.ARGB32, 120, 120)
        s.showPage()

        assertEquals(Status.SUCCESS, s.status(), "Expected SUCCESS status after showPage()")

        s.destroy()
    }

    @Test
    fun `should return false for hasShowTextGlyphs by default`() {
        val s = ImageSurface.create(Format.ARGB32, 120, 120)
        val result = s.hasShowTextGlyphs()

        assertFalse(result, "Expected hasShowTextGlyphs to be false by default on an ImageSurface")
        assertEquals(Status.SUCCESS, s.status())

        s.destroy()
    }

    @Test
    fun `should verify if mime type is supported`() {
        val s = ImageSurface.create(Format.ARGB32, 120, 120)

        assertFalse(s.supportsMimeType("image/png"), "Expected false if mime type is not supported")
        assertEquals(Status.SUCCESS, s.status())

        s.destroy()
    }

//    @Test
//    fun `should map and unmap image without errors`() {
//        val s1 = ImageSurface.create(Format.ARGB32, 120, 120)
//        val extents = RectangleInt(0, 0, 120, 120)
//        val s2 = s1.mapToImage(extents)
//
//        s1.unmapImage(s2)
//
//        assertEquals(Status.SUCCESS, s1.status(), "Surface s1 should have SUCCESS status")
//        assertEquals(Status.SUCCESS, s2.status(), "Image surface s2 should have SUCCESS status")
//
//        s2.destroy()
//        s1.destroy()
//    }
}

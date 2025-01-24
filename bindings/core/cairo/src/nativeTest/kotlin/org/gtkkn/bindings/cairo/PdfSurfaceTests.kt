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

class PdfSurfaceTests {
    @Test
    fun `should create PdfSurface with success status`() {
        val surface = PdfSurface.create(null, 120.0, 120.0)
        assertEquals(
            Status.SUCCESS,
            surface.status(),
            "Expected newly created PDF surface to have SUCCESS status",
        )
    }

    @Test
    fun `should restrict PDF surface to specific version`() {
        val surface = PdfSurface.create(null, 120.0, 120.0)
        // Adjust the version enum/value as needed
        surface.restrictToVersion(PdfVersion.VERSION_1_4)
        assertEquals(
            Status.SUCCESS,
            surface.status(),
            "Expected SUCCESS status after restricting PDF surface to version 1.4",
        )
    }

    @Test
    fun `should set PDF surface size`() {
        val surface = PdfSurface.create(null, 120.0, 120.0)
        surface.setSize(100.0, 100.0)
        assertEquals(
            Status.SUCCESS,
            surface.status(),
            "Expected SUCCESS status after resizing PDF surface",
        )
    }

    @Test
    fun `should set PDF metadata successfully`() {
        val surface = PdfSurface.create(null, 120.0, 120.0)
        // Adjust PdfMetadata.TITLE if your enum/key is named differently
        surface.setMetadata(PdfMetadata.TITLE, "Test Document")
        assertEquals(
            Status.SUCCESS,
            surface.status(),
            "Expected SUCCESS status after setting PDF metadata",
        )
    }

    @Test
    fun `should set custom metadata successfully`() {
        val surface = PdfSurface.create(null, 120.0, 120.0)
        surface.setCustomMetadata("ISBN", "978-0123456789")
        assertEquals(
            Status.SUCCESS,
            surface.status(),
            "Expected SUCCESS status after setting custom PDF metadata",
        )
    }

    @Test
    fun `should set page label successfully`() {
        val surface = PdfSurface.create(null, 120.0, 120.0)
        surface.setPageLabel("MyPageLabel")
        assertEquals(
            Status.SUCCESS,
            surface.status(),
            "Expected SUCCESS status after setting a page label",
        )
    }

    @Test
    fun `should set thumbnail size successfully`() {
        val surface = PdfSurface.create(null, 120.0, 120.0)
        surface.setThumbnailSize(30, 30)
        assertEquals(
            Status.SUCCESS,
            surface.status(),
            "Expected SUCCESS status after setting the thumbnail size",
        )
    }
}

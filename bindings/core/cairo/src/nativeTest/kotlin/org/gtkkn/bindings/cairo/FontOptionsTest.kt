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

class FontOptionsTest {
    @Test
    fun `should set and get antialias`() {
        val fo = FontOptions()
        fo.setAntialias(Antialias.FAST)
        assertEquals(Antialias.FAST, fo.getAntialias(), "Antialias should be set to FAST")
        assertEquals(Status.SUCCESS, fo.status(), "Status should be SUCCESS after setting antialias")
    }

    @Test
    fun `should set and get subpixel order`() {
        val fo = FontOptions()
        fo.setSubpixelOrder(SubpixelOrder.BGR)
        assertEquals(SubpixelOrder.BGR, fo.getSubpixelOrder(), "Subpixel order should be set to BGR")
        assertEquals(Status.SUCCESS, fo.status(), "Status should be SUCCESS after setting subpixel order")
    }

    @Test
    fun `should set and get hint style`() {
        val fo = FontOptions()
        fo.setHintStyle(HintStyle.SLIGHT)
        assertEquals(HintStyle.SLIGHT, fo.getHintStyle(), "Hint style should be set to SLIGHT")
        assertEquals(Status.SUCCESS, fo.status(), "Status should be SUCCESS after setting hint style")
    }

    @Test
    fun `should set and get hint metrics`() {
        val fo = FontOptions()
        fo.setHintMetrics(HintMetrics.OFF)
        assertEquals(HintMetrics.OFF, fo.getHintMetrics(), "Hint metrics should be set to OFF")
        assertEquals(Status.SUCCESS, fo.status(), "Status should be SUCCESS after setting hint metrics")
    }

    @Test
    fun `should set and get variations`() {
        val fo = FontOptions()
        fo.setVariations("wght=200,wdth=140.5")
        assertEquals(
            "wght=200,wdth=140.5",
            fo.getVariations(),
            "Variations string should match what was set"
        )
        assertEquals(Status.SUCCESS, fo.status(), "Status should be SUCCESS after setting variations")
    }

    @Test
    fun `should set and get color mode`() {
        val fo = FontOptions()
        fo.setColorMode(ColorMode.NO_COLOR)
        assertEquals(ColorMode.NO_COLOR, fo.getColorMode(), "Color mode should be set to NO_COLOR")
        assertEquals(Status.SUCCESS, fo.status(), "Status should be SUCCESS after setting color mode")
    }

    @Test
    fun `should set and get color palette`() {
        val fo = FontOptions()
        // If you have a constant for the default palette, use that, e.g., FontOptions.COLOR_PALETTE_DEFAULT
        val defaultPaletteIndex = 0u  // Adjust as needed for your defaults
        fo.setColorPalette(defaultPaletteIndex)
        assertEquals(defaultPaletteIndex, fo.getColorPalette(), "Color palette index should match what was set")
        assertEquals(Status.SUCCESS, fo.status(), "Status should be SUCCESS after setting color palette")
    }

    @Test
    fun `should set custom palette color`() {
        val fo = FontOptions()
        // Set a custom color for palette index 0
        fo.setCustomPaletteColor(
            index = 0u,
            red = 10.0,
            green = 20.0,
            blue = 30.0,
            alpha = 40.5
        )

        assertEquals(Status.SUCCESS, fo.status(), "Status should be SUCCESS after setting custom palette color")
    }
}

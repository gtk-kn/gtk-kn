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

class ToyFontFaceTests {
    @Test
    fun `should create toy font face with default arguments`() {
        // Using a commonly available font family like 'Sans' or 'Serif'.
        val face = ToyFontFace("Sans", FontSlant.NORMAL, FontWeight.NORMAL)
        assertEquals(
            expected = Status.SUCCESS,
            actual = face.status(),
            message = "Expected toy font face with default arguments to have SUCCESS status",
        )
    }

    @Test
    fun `should create toy font face with specified family slant weight`() {
        val face = ToyFontFace("Serif", FontSlant.NORMAL, FontWeight.NORMAL)
        assertEquals(
            expected = Status.SUCCESS,
            actual = face.status(),
            message = "Expected toy font face (Serif, NORMAL, NORMAL) to have SUCCESS status",
        )
    }

    @Test
    fun `should retrieve font family correctly`() {
        val face = ToyFontFace("Serif", FontSlant.NORMAL, FontWeight.NORMAL)
        assertEquals(
            expected = "Serif",
            actual = face.getFamily(),
            message = "Expected family to be 'Serif'",
        )
        assertEquals(
            expected = Status.SUCCESS,
            actual = face.status(),
            message = "Expected toy font face to have SUCCESS status",
        )
    }

    @Test
    fun `should retrieve font slant correctly`() {
        val face = ToyFontFace("Serif", FontSlant.ITALIC, FontWeight.BOLD)
        assertEquals(
            expected = FontSlant.ITALIC,
            actual = face.getSlant(),
            message = "Expected slant to be ITALIC",
        )
        assertEquals(
            expected = Status.SUCCESS,
            actual = face.status(),
            message = "Expected toy font face to have SUCCESS status",
        )
    }

    @Test
    fun `should retrieve font weight correctly`() {
        val face = ToyFontFace("Serif", FontSlant.ITALIC, FontWeight.BOLD)
        assertEquals(
            expected = FontWeight.BOLD,
            actual = face.getWeight(),
            message = "Expected weight to be BOLD",
        )
        assertEquals(
            expected = Status.SUCCESS,
            actual = face.status(),
            message = "Expected toy font face to have SUCCESS status",
        )
    }
}

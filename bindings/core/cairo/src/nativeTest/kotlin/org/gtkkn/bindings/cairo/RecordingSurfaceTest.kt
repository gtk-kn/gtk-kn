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
import kotlin.test.assertTrue

class RecordingSurfaceTest {
    @Test
    fun `should create recording surface with success status`() {
        memScoped {
            // Create a rectangle for the recording surface’s extents
            val extents = Rectangle(this).apply {
                x = 20.0
                y = 20.0
                width = 50.0
                height = 50.0
            }

            // Create a new RecordingSurface with the specified content and extents
            val recordingSurface = RecordingSurface(Content.COLOR_ALPHA, extents)

            // Check that the surface was created successfully
            assertEquals(
                Status.SUCCESS,
                recordingSurface.status(),
                "Expected newly created recording surface to have SUCCESS status",
            )
        }
    }

    @Test
    fun `should get extents from recording surface`() {
        memScoped {
            // Set up a rectangle for initial extents
            val extentsToSet = Rectangle(this).apply {
                x = 20.0
                y = 30.0
                width = 50.0
                height = 60.0
            }

            // Create the RecordingSurface
            val recordingSurface = RecordingSurface(Content.COLOR_ALPHA, extentsToSet)
            assertEquals(
                Status.SUCCESS,
                recordingSurface.status(),
                "Expected SUCCESS status after creating recording surface",
            )

            // Retrieve extents into a fresh Rectangle instance
            val retrievedExtents = Rectangle(this)
            val success = recordingSurface.getExtents(retrievedExtents)

            // Verify the call indicates valid extents
            assertTrue(success, "Expected getExtents to return true for a valid extent")

            // Compare each field to ensure they're the same as initially set
            assertEquals(20.0, retrievedExtents.x, "Mismatched x extents")
            assertEquals(30.0, retrievedExtents.y, "Mismatched y extents")
            assertEquals(50.0, retrievedExtents.width, "Mismatched width extents")
            assertEquals(60.0, retrievedExtents.height, "Mismatched height extents")
        }
    }

    /**
     * Example test illustrating how you might integrate a surface like ImageSurface
     * in a real scenario if you have the same pattern as in the Java tests.
     *
     * Adjust or remove if you don’t have an ImageSurface or similar API.
     */
    @Test
    fun `should create recording surface alongside image surface`() {
        memScoped {
            // Hypothetical creation of an ImageSurface
            val imageSurface = ImageSurface(Format.ARGB32, 120, 120)
            assertEquals(
                Status.SUCCESS,
                imageSurface.status(),
                "Expected SUCCESS for newly created ImageSurface",
            )

            // Create a small extents rectangle
            val smallRect = Rectangle(this).apply {
                x = 10.0
                y = 10.0
                width = 20.0
                height = 20.0
            }
            val recordingSurface = RecordingSurface(Content.COLOR_ALPHA, smallRect)
            assertEquals(
                Status.SUCCESS,
                recordingSurface.status(),
                "Expected SUCCESS for newly created RecordingSurface",
            )
        }
    }
}

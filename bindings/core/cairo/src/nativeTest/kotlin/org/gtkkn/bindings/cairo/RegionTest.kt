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
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class RegionTest {
    @Test
    fun `should create an empty Region with success status`() {
        val region = Region()
        assertEquals(Status.SUCCESS, region.status(), "Expected a newly created empty region to have SUCCESS status")
        assertTrue(region.isEmpty(), "Expected a newly created region to be empty")
    }

    @Test
    fun `should create Region from rectangle with success status`() = memScoped {
        // Adapt this line if you create a RectangleInt differently
        val rect = RectangleInt(10, 20, 100, 200, this)
        val region = Region(rect)
        assertEquals(Status.SUCCESS, region.status(), "Expected region creation from rectangle to have SUCCESS status")
        assertFalse(region.isEmpty(), "Expected a region created from a rectangle to be non-empty")
    }

    @Test
    fun `should copy Region and remain equal`() = memScoped {
        val rect = RectangleInt(10, 20, 100, 200, this)
        val region1 = Region(rect)
        val region2 = region1.copy()

        assertTrue(region1.equal(region2), "Copied region should be equal to the original")
        assertEquals(Status.SUCCESS, region1.status(), "Expected SUCCESS status after copying")
        assertEquals(Status.SUCCESS, region2.status(), "Expected SUCCESS status for the copied region")
    }

    @Test
    fun `should get extents of Region`() = memScoped {
        val rect = RectangleInt(10, 20, 100, 200, this)
        val region = Region(rect)

        val outRect = RectangleInt(0, 0, 0, 0, this)
        region.getExtents(outRect)

        assertEquals(Status.SUCCESS, region.status(), "Expected SUCCESS status when getting extents")

        assertEquals(10, outRect.x, "Incorrect x value in extents")
        assertEquals(20, outRect.y, "Incorrect y value in extents")
        assertEquals(100, outRect.width, "Incorrect width in extents")
        assertEquals(200, outRect.height, "Incorrect height in extents")

        // If using toString comparison (similar to Java tests):
        val extentsString = outRect.toString()
        assertTrue(
            extentsString.contains("x=10") && extentsString.contains("y=20") &&
                extentsString.contains("width=100") && extentsString.contains("height=200"),
            "Expected extents to match 'x=10 y=20 width=100 height=200' but got $extentsString",
        )
    }

    @Test
    fun `should report correct number of rectangles`() = memScoped {
        val region = Region(RectangleInt(10, 20, 100, 200, this))
        assertEquals(1, region.numRectangles(), "Expected region to have exactly one rectangle")
        assertEquals(Status.SUCCESS, region.status(), "Expected SUCCESS status")
    }

    @Test
    fun `should retrieve correct rectangle by index`() = memScoped {
        val region = Region(RectangleInt(10, 20, 100, 200, this))
        val rectOut = RectangleInt(0, 0, 0, 0, this)
        region.getRectangle(0, rectOut)

        val rectStr = rectOut.toString()
        assertTrue(
            rectStr.contains("x=10") && rectStr.contains("y=20") &&
                rectStr.contains("width=100") && rectStr.contains("height=200"),
            "Retrieved rectangle does not match expected values: $rectStr",
        )
        assertEquals(Status.SUCCESS, region.status(), "Expected SUCCESS status")
    }

    @Test
    fun `should report empty region correctly`() = memScoped {
        val regionEmpty = Region()
        val regionRect = Region(RectangleInt(10, 20, 100, 200, this))

        assertTrue(regionEmpty.isEmpty(), "Expected empty region to be empty")
        assertFalse(regionRect.isEmpty(), "Expected region with a rectangle to be non-empty")
        assertEquals(Status.SUCCESS, regionEmpty.status(), "Expected SUCCESS status for empty region")
        assertEquals(Status.SUCCESS, regionRect.status(), "Expected SUCCESS status for region with rectangle")
    }

    @Test
    fun `should verify containment of points`() = memScoped {
        val region = Region(RectangleInt(10, 20, 100, 200, this))
        assertTrue(region.containsPoint(10, 20), "Point (10, 20) should be inside the region")
        assertFalse(region.containsPoint(9, 20), "Point (9, 20) should be outside the region")
        assertEquals(Status.SUCCESS, region.status(), "Expected SUCCESS status after contain check")
    }

    @Test
    fun `should verify rectangle containment`() = memScoped {
        val region = Region(RectangleInt(10, 20, 100, 200, this))

        val inRect = RectangleInt(10, 20, 100, 200, this)
        val partRect = RectangleInt(11, 21, 100, 200, this)
        val outRect = RectangleInt(111, 221, 100, 200, this)

        assertEquals(RegionOverlap.IN, region.containsRectangle(inRect), "Expected region to fully contain inRect")
        assertEquals(RegionOverlap.PART, region.containsRectangle(partRect), "Expected partial overlap for partRect")
        assertEquals(RegionOverlap.OUT, region.containsRectangle(outRect), "Expected outRect to be outside the region")
        assertEquals(Status.SUCCESS, region.status(), "Expected SUCCESS status after rectangle containment checks")
    }

    @Test
    fun `should compare regions for equality`() = memScoped {
        val region1 = Region(RectangleInt(10, 20, 100, 200, this))
        val region2 = Region(RectangleInt(10, 20, 100, 200, this))
        val region3 = Region(RectangleInt(11, 20, 100, 200, this))

        assertTrue(region1.equal(region2), "Regions with same rectangle should be equal")
        assertFalse(region1.equal(region3), "Regions with different rectangles should not be equal")
        assertEquals(Status.SUCCESS, region1.status(), "Expected SUCCESS status")
    }

    @Test
    fun `should translate a region successfully`() = memScoped {
        val region = Region(RectangleInt(10, 20, 100, 200, this))
        region.translate(2, -2)

        val extents = RectangleInt(0, 0, 0, 0, this)
        region.getExtents(extents)

        assertEquals(12, extents.x)
        assertEquals(18, extents.y)

        assertEquals(Status.SUCCESS, region.status(), "Expected SUCCESS status after translation")
    }

    @Test
    fun `should intersect two regions correctly`() = memScoped {
        val region1 = Region(RectangleInt(10, 20, 100, 200, this))
        val region2 = Region(RectangleInt(50, 80, 100, 200, this))
        region1.intersect(region2)

        val extents1 = RectangleInt(0, 0, 0, 0, this)
        val extents2 = RectangleInt(0, 0, 0, 0, this)
        region1.getExtents(extents1)
        region2.getExtents(extents2)

        assertEquals(Status.SUCCESS, region1.status(), "Expected SUCCESS status after intersection")
        assertEquals(Status.SUCCESS, region2.status(), "Expected SUCCESS status on second region")

        val e1 = extents1.toString()
        val e2 = extents2.toString()
        assertTrue(
            e1.contains("x=50") && e1.contains("y=80") &&
                e1.contains("width=60") && e1.contains("height=140"),
            "After intersect, region1 extents should be 'x=50 y=80 width=60 height=140' but got $e1",
        )
        assertTrue(
            e2.contains("x=50") && e2.contains("y=80") &&
                e2.contains("width=100") && e2.contains("height=200"),
            "Region2 extents were expected to remain 'x=50 y=80 width=100 height=200' but got $e2",
        )
    }

    @Test
    fun `should intersect region with rectangle`() = memScoped {
        val region = Region(RectangleInt(10, 20, 100, 200, this))
        val rect = RectangleInt(50, 80, 100, 200, this)
        region.intersectRectangle(rect)

        val extents = RectangleInt(0, 0, 0, 0, this)
        region.getExtents(extents)
        assertEquals(Status.SUCCESS, region.status(), "Expected SUCCESS status after intersecting with rectangle")

        val e = extents.toString()
        assertTrue(
            e.contains("x=50") && e.contains("y=80") &&
                e.contains("width=60") && e.contains("height=140"),
            "Intersect extents should be 'x=50 y=80 width=60 height=140', got $e",
        )
    }

    @Test
    fun `should subtract one region from another`() = memScoped {
        val region1 = Region(RectangleInt(10, 20, 100, 200, this))
        val region2 = Region(RectangleInt(20, 20, 100, 200, this))
        region1.subtract(region2)

        val extents1 = RectangleInt(0, 0, 0, 0, this)
        val extents2 = RectangleInt(0, 0, 0, 0, this)
        region1.getExtents(extents1)
        region2.getExtents(extents2)

        assertEquals(Status.SUCCESS, region1.status(), "Expected SUCCESS status after subtracting region2")
        assertEquals(Status.SUCCESS, region2.status(), "Expected SUCCESS status for region2")

        val e1 = extents1.toString()
        val e2 = extents2.toString()

        // region1 now becomes the rectangle [10, 20, 10, 200] (width=10)
        assertTrue(
            e1.contains("x=10") && e1.contains("y=20") &&
                e1.contains("width=10") && e1.contains("height=200"),
            "Subtraction extents for region1 should be 'x=10 y=20 width=10 height=200', got $e1",
        )
        // region2 remains the rectangle [20, 20, 100, 200]
        assertTrue(
            e2.contains("x=20") && e2.contains("y=20") &&
                e2.contains("width=100") && e2.contains("height=200"),
            "region2 extents should be 'x=20 y=20 width=100 height=200', got $e2",
        )
    }

    @Test
    fun `should subtract rectangle from region`() = memScoped {
        val region = Region(RectangleInt(10, 20, 100, 200, this))
        val rect = RectangleInt(20, 20, 100, 200, this)
        region.subtractRectangle(rect)

        val extents = RectangleInt(0, 0, 0, 0, this)
        region.getExtents(extents)
        assertEquals(Status.SUCCESS, region.status(), "Expected SUCCESS status after subtracting rectangle")

        val e = extents.toString()
        // region now is [10, 20, 10, 200]
        assertTrue(
            e.contains("x=10") && e.contains("y=20") &&
                e.contains("width=10") && e.contains("height=200"),
            "Subtraction extents should be 'x=10 y=20 width=10 height=200', got $e",
        )
    }

    @Test
    fun `should union two regions successfully`() = memScoped {
        val region1 = Region(RectangleInt(10, 20, 100, 200, this))
        val region2 = Region(RectangleInt(20, 20, 100, 200, this))
        region1.union(region2)

        val extents1 = RectangleInt(0, 0, 0, 0, this)
        val extents2 = RectangleInt(0, 0, 0, 0, this)
        region1.getExtents(extents1)
        region2.getExtents(extents2)

        assertEquals(Status.SUCCESS, region1.status(), "Expected SUCCESS status for region1 after union")
        assertEquals(Status.SUCCESS, region2.status(), "Expected SUCCESS status for region2")

        val e1 = extents1.toString()
        val e2 = extents2.toString()

        // region1 becomes [10, 20, 110, 200] which merges the two horizontally
        assertTrue(
            e1.contains("x=10") && e1.contains("y=20") &&
                e1.contains("width=110") && e1.contains("height=200"),
            "Union extents for region1 should be 'x=10 y=20 width=110 height=200', got $e1",
        )
        // region2 remains [20, 20, 100, 200]
        assertTrue(
            e2.contains("x=20") && e2.contains("y=20") &&
                e2.contains("width=100") && e2.contains("height=200"),
            "Region2 extents should remain 'x=20 y=20 width=100 height=200', got $e2",
        )
    }

    @Test
    fun `should union region with a rectangle`() = memScoped {
        val region = Region(RectangleInt(10, 20, 100, 200, this))
        val rect = RectangleInt(20, 20, 100, 200, this)
        region.unionRectangle(rect)

        val extents = RectangleInt(0, 0, 0, 0, this)
        region.getExtents(extents)
        assertEquals(Status.SUCCESS, region.status(), "Expected SUCCESS status after union with a rectangle")

        val e = extents.toString()
        // The union is [10, 20, 110, 200]
        assertTrue(
            e.contains("x=10") && e.contains("y=20") &&
                e.contains("width=110") && e.contains("height=200"),
            "Union extents should be 'x=10 y=20 width=110 height=200', got $e",
        )
    }

    @Test
    fun `should XOR two regions correctly`() = memScoped {
        val region1 = Region(RectangleInt(0, 0, 50, 50, this))
        val region2 = Region(RectangleInt(0, 0, 50, 20, this))
        region1.xor(region2)

        val extents1 = RectangleInt(0, 0, 0, 0, this)
        val extents2 = RectangleInt(0, 0, 0, 0, this)
        region1.getExtents(extents1)
        region2.getExtents(extents2)

        assertEquals(Status.SUCCESS, region1.status(), "Expected SUCCESS status after XORing regions")
        assertEquals(Status.SUCCESS, region2.status(), "Expected SUCCESS status for region2")

        val e1 = extents1.toString()
        val e2 = extents2.toString()
        // region1 becomes everything in region1 or region2 but not the intersection (0,0,50,20)
        // effectively top part of region1 that isn't covered by region2
        // So extents after XOR is (x=0 y=20 width=50 height=30)
        assertTrue(
            e1.contains("x=0") && e1.contains("y=20") &&
                e1.contains("width=50") && e1.contains("height=30"),
            "Expected region1 extents after XOR to be 'x=0 y=20 width=50 height=30', got $e1",
        )
        // region2 remains unchanged
        assertTrue(
            e2.contains("x=0") && e2.contains("y=0") &&
                e2.contains("width=50") && e2.contains("height=20"),
            "Expected region2 extents to remain 'x=0 y=0 width=50 height=20', got $e2",
        )
    }

    @Test
    fun `should XOR region with rectangle correctly`() = memScoped {
        val region = Region(RectangleInt(0, 0, 50, 50, this))
        val rect = RectangleInt(0, 0, 50, 20, this)
        region.xorRectangle(rect)

        val extents = RectangleInt(0, 0, 0, 0, this)
        region.getExtents(extents)
        assertEquals(Status.SUCCESS, region.status(), "Expected SUCCESS status after XOR with rectangle")

        val e = extents.toString()
        // Now the region is the leftover portion: x=0 y=20 width=50 height=30
        assertTrue(
            e.contains("x=0") && e.contains("y=20") &&
                e.contains("width=50") && e.contains("height=30"),
            "Expected XOR extents to be 'x=0 y=20 width=50 height=30', got $e",
        )
    }
}

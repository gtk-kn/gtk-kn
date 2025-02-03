/*
 * Copyright (c) 2025 gtk-kn
 *
 * SPDX-License-Identifier: MIT
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.gtkkn.samples.cairo.shapes

import org.gtkkn.bindings.cairo.Context
import org.gtkkn.bindings.cairo.LineJoin
import org.gtkkn.bindings.gio.ApplicationFlags
import org.gtkkn.bindings.gtk.Application
import org.gtkkn.bindings.gtk.ApplicationWindow
import org.gtkkn.bindings.gtk.DrawingArea
import org.gtkkn.extensions.GtkKn
import org.gtkkn.extensions.cairo.setDash
import org.gtkkn.extensions.gio.runApplication
import org.gtkkn.extensions.glib.util.log.Log
import org.gtkkn.extensions.glib.util.log.writer.installConsoleLogWriter

/**
 * This is a porting of the PyGObject sample from:
 * https://pygobject.gnome.org/guide/cairo_integration.html
 *
 * It demonstrates drawing different shapes and line joins with Cairo.
 */
fun main() {
    Log.installConsoleLogWriter()
    GtkKn.debugLogs = true
    val app = Application("org.gtkkn.samples.cairo.shapes", ApplicationFlags.FLAGS_NONE)
    app.onActivate {
        val window = buildWindow(app)
        window.present()
    }
    app.runApplication()
}

private fun buildWindow(app: Application) = ApplicationWindow(app).apply {
    title = "gtk-kn cairo shapes"
    setSizeRequest(450, 600)

    val drawingArea = DrawingArea().apply {
        setDrawFunc { _, cr: Context, _, _ ->
            // Set basic drawing parameters
            cr.setSourceRgb(0.0, 0.0, 0.0)
            cr.setLineWidth(SIZE / 4.0)
            cr.setTolerance(0.1)

            //
            // Row 1: ROUND line joins, dashed lines
            //
            cr.setLineJoin(LineJoin.ROUND)
            // Once you implement setDash(...), uncomment below for dashed lines:
            cr.setDash(doubleArrayOf(SIZE / 4.0, SIZE / 4.0), 0.0)
            strokeShapes(cr, 0.0, 0.0)

            //
            // Row 2: ROUND line joins, no dash
            //
            // If you re-enable dash above, reset it here:
            cr.setDash(doubleArrayOf(), 0.0)
            strokeShapes(cr, 0.0, 3.0 * SIZE)

            //
            // Row 3: BEVEL line joins
            //
            cr.setLineJoin(LineJoin.BEVEL)
            strokeShapes(cr, 0.0, 6.0 * SIZE)

            //
            // Row 4: MITER line joins
            //
            cr.setLineJoin(LineJoin.MITER)
            strokeShapes(cr, 0.0, 9.0 * SIZE)

            //
            // Row 5: Filled shapes (black fill)
            //
            fillShapes(cr, 0.0, 12.0 * SIZE)

            //
            // Row 6: Filled shapes, then drawn in red
            //
            cr.setLineJoin(LineJoin.BEVEL)
            fillShapes(cr, 0.0, 15.0 * SIZE)

            cr.setSourceRgb(1.0, 0.0, 0.0) // red
            strokeShapes(cr, 0.0, 15.0 * SIZE)
        }
    }

    child = drawingArea
}

private const val SIZE = 30.0

/**
 * Draws four shapes (bowtie, square, triangle, ∞-shape) in a row,
 * either filled or stroked.
 */
private fun drawShapes(cr: Context, x: Double, y: Double, fill: Boolean) {
    cr.save()

    // 1) Bowtie
    cr.newPath()
    cr.translate(x + SIZE, y + SIZE)
    drawBowtie(cr)
    if (fill) cr.fill() else cr.stroke()

    // 2) Square
    cr.newPath()
    cr.translate(3.0 * SIZE, 0.0)
    drawSquare(cr)
    if (fill) cr.fill() else cr.stroke()

    // 3) Triangle
    cr.newPath()
    cr.translate(3.0 * SIZE, 0.0)
    drawTriangle(cr)
    if (fill) cr.fill() else cr.stroke()

    // 4) “∞” shape
    cr.newPath()
    cr.translate(3.0 * SIZE, 0.0)
    drawInf(cr)
    if (fill) cr.fill() else cr.stroke()

    cr.restore()
}

/** Strokes (outlines) the four shapes in a row. */
private fun strokeShapes(cr: Context, x: Double, y: Double) {
    drawShapes(cr, x, y, fill = false)
}

/** Fills the four shapes in a row. */
private fun fillShapes(cr: Context, x: Double, y: Double) {
    drawShapes(cr, x, y, fill = true)
}

// --- Individual shape methods ---
private fun drawTriangle(cr: Context) {
    cr.moveTo(SIZE, 0.0)
    cr.relLineTo(SIZE, 2.0 * SIZE)
    cr.relLineTo(-2.0 * SIZE, 0.0)
    cr.closePath()
}

private fun drawSquare(cr: Context) {
    cr.moveTo(0.0, 0.0)
    cr.relLineTo(2.0 * SIZE, 0.0)
    cr.relLineTo(0.0, 2.0 * SIZE)
    cr.relLineTo(-2.0 * SIZE, 0.0)
    cr.closePath()
}

private fun drawBowtie(cr: Context) {
    cr.moveTo(0.0, 0.0)
    cr.relLineTo(2.0 * SIZE, 2.0 * SIZE)
    cr.relLineTo(-2.0 * SIZE, 0.0)
    cr.relLineTo(2.0 * SIZE, -2.0 * SIZE)
    cr.closePath()
}

private fun drawInf(cr: Context) {
    cr.moveTo(0.0, SIZE)
    cr.relCurveTo(0.0, SIZE, SIZE, SIZE, 2.0 * SIZE, 0.0)
    cr.relCurveTo(SIZE, -SIZE, 2.0 * SIZE, -SIZE, 2.0 * SIZE, 0.0)
    cr.relCurveTo(0.0, SIZE, -SIZE, SIZE, -2.0 * SIZE, 0.0)
    cr.relCurveTo(-SIZE, -SIZE, -2.0 * SIZE, -SIZE, -2.0 * SIZE, 0.0)
    cr.closePath()
}

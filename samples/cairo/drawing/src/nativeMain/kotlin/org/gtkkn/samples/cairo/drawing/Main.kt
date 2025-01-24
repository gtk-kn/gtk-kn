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

package org.gtkkn.samples.cairo.drawing

import org.gtkkn.bindings.cairo.Content
import org.gtkkn.bindings.cairo.Context
import org.gtkkn.bindings.cairo.Surface
import org.gtkkn.bindings.gio.ApplicationFlags
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gtk.Application
import org.gtkkn.bindings.gtk.ApplicationWindow
import org.gtkkn.bindings.gtk.DrawingArea
import org.gtkkn.bindings.gtk.Frame
import org.gtkkn.bindings.gtk.GestureClick
import org.gtkkn.bindings.gtk.GestureDrag
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.gio.runApplication
import org.gtkkn.native.gdk.GDK_BUTTON_PRIMARY
import org.gtkkn.native.gdk.GDK_BUTTON_SECONDARY

private var surface: Surface? = null
private var startX: Double = 0.0
private var startY: Double = 0.0

/**
 * This is a porting of the official "Getting Started with GTK 4 Custom Drawing" example:
 * https://docs.gtk.org/gtk4/getting_started.html#custom-drawing
 */
fun main() {
    val app = Application("org.gtkkn.samples.cairo.drawing", ApplicationFlags.FLAGS_NONE)
    app.onActivate {
        val window = buildWindow(app)
        window.present()
    }
    app.runApplication()
}

/**
 * Builds the main application window.
 */
private fun buildWindow(app: Application) = ApplicationWindow(app).apply {
    title = "gtk-kn cairo drawing"
    setSizeRequest(400, 400)

    val drawingArea = setupDrawingArea()
    val frame = Frame()
    frame.child = drawingArea
    child = frame

    // Clean up when the window is destroyed.
    onDestroy { closeWindow() }
}

/**
 * Sets up the DrawingArea, including:
 * - The resize callback (to recreate our `surface`).
 * - The draw function (to paint the `surface`).
 * - Gestures for drag (left-click) and press (right-click).
 */
private fun setupDrawingArea(): DrawingArea {
    val drawingArea = DrawingArea().apply {
        // Minimum size like in C example
        setSizeRequest(100, 100)

        // Draw callback: paint from the global `surface` onto the widget
        setDrawFunc { _, cr: Context, _, _ -> drawCb(cr) }

        // Resize callback: after resizing, recreate the surface
        onResize(ConnectFlags.AFTER) { _, _ -> resizeCb(this) }
    }

    // Add a drag gesture for left-click
    val drag = GestureDrag()
    drag.button = GDK_BUTTON_PRIMARY.toUInt()
    drag.onDragBegin { startX, startY -> dragBegin(startX, startY, drawingArea) }
    drag.onDragUpdate { offsetX, offsetY -> dragUpdate(offsetX, offsetY, drawingArea) }
    drag.onDragEnd { offsetX, offsetY -> dragEnd(offsetX, offsetY, drawingArea) }
    drawingArea.addController(drag)

    // Add a click gesture for right-click to clear
    val press = GestureClick()
    press.button = GDK_BUTTON_SECONDARY.toUInt()
    press.onPressed { _, _, _ -> pressed(drawingArea) }
    drawingArea.addController(press)

    return drawingArea
}

/**
 * Resizes (or recreates) our global `surface` to match the widget size.
 * Then clears it to white.
 */
private fun resizeCb(widget: Widget) {
    // Destroy old surface if it exists.
    surface?.destroy()
    surface = null

    // Create a new surface if widget has a native GdkSurface
    val gdkSurface = widget.getNative()?.getSurface()
    if (gdkSurface != null) {
        surface = gdkSurface.createSimilarSurface(
            Content.COLOR,
            widget.getWidth(),
            widget.getHeight(),
        )
        // Initialize the surface to white
        clearSurface()
    }
}

/**
 * Draw callback: copy the contents of our global `surface` onto the widget's cairo context.
 */
private fun drawCb(cr: Context) {
    // If we have a valid surface, paint it at (0,0).
    surface?.let {
        cr.setSourceSurface(it, 0.0, 0.0)
        cr.paint()
    }
}

/**
 * Clear the global `surface` by painting it white.
 */
private fun clearSurface() {
    val cr = Context.create(requireNotNull(surface))
    cr.setSourceRgb(1.0, 1.0, 1.0)
    cr.paint()
    cr.destroy()
}

/**
 * Draws a small rectangle at (x,y) on the global surface and queues a redraw.
 */
private fun drawBrush(widget: Widget, x: Double, y: Double) {
    val cr = Context.create(requireNotNull(surface))
    cr.rectangle(x - 3, y - 3, 6.0, 6.0)
    cr.fill()
    cr.destroy()

    widget.queueDraw()
}

/**
 * Drag gesture: when it begins, record the start and draw a brush.
 */
private fun dragBegin(x: Double, y: Double, area: Widget) {
    startX = x
    startY = y
    drawBrush(area, x, y)
}

/**
 * Drag gesture: as user drags, draw a brush from the offset.
 */
private fun dragUpdate(offsetX: Double, offsetY: Double, area: Widget) {
    drawBrush(area, startX + offsetX, startY + offsetY)
}

/**
 * Drag gesture: when it ends, do a final brush.
 */
private fun dragEnd(offsetX: Double, offsetY: Double, area: Widget) {
    drawBrush(area, startX + offsetX, startY + offsetY)
}

/**
 * Right-click press: clears the surface and redraws.
 */
private fun pressed(area: Widget) {
    clearSurface()
    area.queueDraw()
}

/**
 * Called on window destroy to free the surface.
 */
private fun closeWindow() {
    surface?.destroy()
    surface = null
}

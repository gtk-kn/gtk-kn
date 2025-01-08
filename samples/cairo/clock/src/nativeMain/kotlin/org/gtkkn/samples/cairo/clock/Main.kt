/*
 * Copyright (c) 2025 gtk-kn
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

package org.gtkkn.samples.cairo.clock

import org.gtkkn.bindings.cairo.Context
import org.gtkkn.bindings.cairo.LineCap
import org.gtkkn.bindings.gio.ApplicationFlags
import org.gtkkn.bindings.glib.DateTime
import org.gtkkn.bindings.glib.GLib
import org.gtkkn.bindings.gtk.Application
import org.gtkkn.bindings.gtk.ApplicationWindow
import org.gtkkn.bindings.gtk.DrawingArea
import org.gtkkn.extensions.gio.runApplication
import org.gtkkn.native.glib.G_PRIORITY_DEFAULT
import org.gtkkn.native.glib.gint
import kotlin.math.PI
import kotlin.math.cos
import kotlin.math.sin
import kotlin.time.Duration.Companion.milliseconds

/**
 * This is a porting of the "Example Application: Creating a Clock with Cairo"
 * from https://gnome.pages.gitlab.gnome.org/gtkmm-documentation/sec-drawing-clock-example.html
 */
fun main() {
    val app = Application("org.gtkkn.samples.cairo.clock", ApplicationFlags.FLAGS_NONE)
    app.onActivate {
        val window = buildWindow(app)
        window.present()
    }
    app.runApplication()
}

private fun buildWindow(app: Application) = ApplicationWindow(app).apply {
    title = "gtk-kn cairo clock"
    setSizeRequest(400, 400)

    val drawingArea = setupClockDrawingArea()

    GLib.timeoutAdd(
        priority = G_PRIORITY_DEFAULT,
        interval = 1000.milliseconds.inWholeMilliseconds.toUInt(),
    ) {
        drawingArea.queueDraw() // Force a redraw
        true
    }

    child = drawingArea
}

private fun setupClockDrawingArea(): DrawingArea {
    val mRadius = 0.42
    val mLineWidth = 0.05

    return DrawingArea().apply {
        setDrawFunc { _, cr: Context, width: gint, height: gint ->
            drawBackground(cr, width, height, mLineWidth)
            drawClockOutline(cr, mRadius)
            drawClockTicks(cr, mRadius)
            drawClockHands(cr, mRadius, mLineWidth)
        }
    }
}

private fun drawBackground(cr: Context, width: gint, height: gint, mLineWidth: Double) {
    cr.scale(width.toDouble(), height.toDouble())
    cr.translate(0.5, 0.5)
    cr.setLineWidth(mLineWidth)

    cr.save()
    cr.setSourceRgba(0.337, 0.612, 0.117, 0.9) // green
    cr.paint()
    cr.restore()
}

private fun drawClockOutline(cr: Context, mRadius: Double) {
    cr.arc(0.0, 0.0, mRadius, 0.0, 2.0 * PI)
    cr.save()
    cr.setSourceRgba(1.0, 1.0, 1.0, 0.8) // white
    cr.fillPreserve()
    cr.restore()
    cr.strokePreserve()
    cr.clip()
}

private fun drawClockTicks(cr: Context, mRadius: Double) {
    for (i in 0..11) {
        var inset = 0.05
        cr.save()
        cr.setLineCap(LineCap.ROUND)

        if (i % 3 != 0) {
            inset *= 0.8
            cr.setLineWidth(0.03)
        }

        val angle = i * (PI / 6.0)
        cr.moveTo((mRadius - inset) * cos(angle), (mRadius - inset) * sin(angle))
        cr.lineTo(mRadius * cos(angle), mRadius * sin(angle))
        cr.stroke()
        cr.restore()
    }
}

private fun drawClockHands(cr: Context, mRadius: Double, mLineWidth: Double) {
    val localDateTime = checkNotNull(DateTime.newNowLocal())
    val seconds = localDateTime.getSecond().toDouble() * (PI / 30.0)
    val minutes = localDateTime.getMinute().toDouble() * (PI / 30.0)
    val hours = localDateTime.getHour().toDouble() * (PI / 6.0)

    cr.save()
    cr.setLineCap(LineCap.ROUND)

    // Draw seconds hand
    cr.save()
    cr.setLineWidth(mLineWidth / 3.0)
    cr.setSourceRgba(0.7, 0.7, 0.7, 0.8) // gray
    cr.moveTo(0.0, 0.0)
    cr.lineTo(sin(seconds) * (mRadius * 0.9), -cos(seconds) * (mRadius * 0.9))
    cr.stroke()
    cr.restore()

    // Draw minutes hand
    cr.setSourceRgba(0.117, 0.337, 0.612, 0.9) // blue
    cr.moveTo(0.0, 0.0)
    cr.lineTo(
        sin(minutes + seconds / 60.0) * (mRadius * 0.8),
        -cos(minutes + seconds / 60.0) * (mRadius * 0.8),
    )
    cr.stroke()

    // Draw hours hand
    cr.setSourceRgba(0.337, 0.612, 0.117, 0.9) // green
    cr.moveTo(0.0, 0.0)
    cr.lineTo(
        sin(hours + minutes / 12.0) * (mRadius * 0.5),
        -cos(hours + minutes / 12.0) * (mRadius * 0.5),
    )
    cr.stroke()

    // Draw central dot
    cr.arc(0.0, 0.0, mLineWidth / 3.0, 0.0, 2.0 * PI)
    cr.fill()

    cr.restore()
}

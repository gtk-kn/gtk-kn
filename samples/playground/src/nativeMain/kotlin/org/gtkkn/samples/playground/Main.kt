/*
 * Copyright (c) 2024 gtk-kn
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

package org.gtkkn.samples.playground

import org.gtkkn.bindings.adw.HeaderBar
import org.gtkkn.bindings.glib.VariantType
import org.gtkkn.bindings.gtk.Align
import org.gtkkn.bindings.gtk.Box
import org.gtkkn.bindings.gtk.Label
import org.gtkkn.bindings.gtk.Orientation
import org.gtkkn.bindings.xdp.Portal
import org.gtkkn.bindings.xdp.UserInformationFlags
import org.gtkkn.extensions.glib.getString

fun main() = Application {
    // setup a HeaderBar since adw windows don't have any by default
    val headerBar = HeaderBar().apply {
        title = "gtk-kn playground"
    }

    // setup window layout
    val layout = Box(Orientation.VERTICAL, 0).apply {
        append(headerBar)
    }
    setContent(layout)

    // this is where any playground code can run to set up widgets
    val label = Label().apply {
        label = "Playground"
        halign = Align.CENTER
        valign = Align.CENTER
        hexpand = true
        vexpand = true
    }

    val portal = Portal()
    portal.getUserInformation(null, "Demo", UserInformationFlags.NONE, null) { obj, res ->
        val resultDictionary = portal.getUserInformationFinish(res).getOrThrow()
        val id = resultDictionary.lookupValue("id", VariantType.new("s")).getString()
        val name = resultDictionary.lookupValue("name", VariantType.new("s")).getString()
        val image = resultDictionary.lookupValue("image", VariantType.new("s")).getString()

        val text = """
            |id: $id
            |name: $name
            |image: $image
        """.trimMargin()

        label.setLabel(text)
    }

    // and add your widget to the layout to display it
    layout.append(label)
}

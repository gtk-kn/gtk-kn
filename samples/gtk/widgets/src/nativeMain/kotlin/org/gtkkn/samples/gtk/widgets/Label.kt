package org.gtkkn.samples.gtk.widgets

import bindings.gio.ApplicationFlags
import bindings.gtk.Application
import bindings.gtk.ApplicationWindow
import bindings.gtk.Box
import bindings.gtk.Button
import bindings.gtk.Justification
import bindings.gtk.Label
import bindings.gtk.Orientation
import bindings.gtk.Widget

fun label() {
    val app = Application("org.gtkkn.samples.gtk.widgets.label", ApplicationFlags.FLAGS_NONE)
    app.connectActivate {
        val window = ApplicationWindow(app).apply {
            title = "Label Example"
        }

        val hbox = Box(orientation = Orientation.HORIZONTAL, spacing = 10).apply {
            homogeneous = false
            marginStart = 16
            marginTop = 16
            marginEnd = 16
            marginBottom = 16
        }
        val vboxLeft = Box(orientation = Orientation.VERTICAL, spacing = 10).apply {
            homogeneous = false
            vexpand = true
            hexpand = true
        }
        val vboxRight = Box(orientation = Orientation.VERTICAL, spacing = 10).apply {
            homogeneous = false
            vexpand = true
            hexpand = true
        }

        hbox.append(vboxLeft)
        hbox.append(vboxRight)

        vboxLeft.append(getNormalLabel())
        vboxLeft.append(getLeftJustifiedLabel())
        vboxLeft.append(getRightJustifiedLabel())
        vboxRight.append(getLineWrappedLabel())
        vboxRight.append(getLineWrappedFilledLabel())
        vboxLeft.append(getMarkupLabel())

        val button = getButton()
        vboxLeft.append(getLabelWithMnemonic(button))
        vboxRight.append(button)

        window.setChild(hbox)
        window.show()
    }
    app.run(0, emptyList())
}

private fun getNormalLabel() =
    Label(str = "This is a normal label").apply {
        vexpand = true
        hexpand = true
    }

private fun getLeftJustifiedLabel() = Label("").apply {
    setText("This is a left-justified label.\nWith multiple lines.")
    vexpand = true
    hexpand = true
    justify = Justification.LEFT
}

private fun getRightJustifiedLabel() = Label("This is a right-justified label.\nWith multiple lines.").apply {
    vexpand = true
    hexpand = true
    justify = Justification.RIGHT
}

private fun getLineWrappedLabel() = Label(
    str = "This is an example of a line-wrapped label.  It should not be taking up the entire             width " +
        "allocated to it, but automatically wraps the words to fit.\n     It supports multiple paragraphs correctly, " +
        "and  correctly   adds many          extra  spaces. ",
).apply {
    vexpand = true
    hexpand = true
    wrap = true
    maxWidthChars = 32
}

private fun getLineWrappedFilledLabel() = Label(
    str = "This is an example of a line-wrapped, filled label. It should be taking up the entire              width " +
        "allocated to it.  Here is a sentence to prove my point.  Here is another sentence. Here comes the sun, do de" +
        " do de do.\n    This is a new paragraph.\n    This is another newer, longer, better paragraph.  It is " +
        "coming to an end, unfortunately.",
).apply {
    vexpand = true
    hexpand = true
    wrap = true
    justify = Justification.FILL
    maxWidthChars = 32
}

private fun getMarkupLabel() = Label("").apply {
    setMarkup(
        "Text can be <small>small</small>, <big>big</big>, <b>bold</b>, <i>italic</i> and even point to " +
            "somewhere in the <a href=\"https://www.gtk.org\" title=\"Click to find out more\">internets</a>.",
    )
    vexpand = true
    hexpand = true
    wrap = true
    maxWidthChars = 48
}

private fun getLabelWithMnemonic(button: Widget) =
    Label.newWithMnemonic("_Press Alt + P to select button to the right").apply {
        vexpand = true
        hexpand = true
        selectable = true
        mnemonicWidget = button
    }

private fun getButton() =
    Button(label = "It does nothing").apply {
        vexpand = true
        hexpand = true
    }

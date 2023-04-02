package org.gtkkn.samples.gtk.playground

import org.gtkkn.bindings.adw.ActionRow
import org.gtkkn.bindings.adw.Avatar
import org.gtkkn.bindings.adw.Clamp
import org.gtkkn.bindings.adw.PreferencesGroup
import org.gtkkn.bindings.adw.StatusPage
import org.gtkkn.bindings.adw.Toast
import org.gtkkn.bindings.adw.ToastOverlay
import org.gtkkn.bindings.gtk.Align
import org.gtkkn.bindings.gtk.Button
import org.gtkkn.bindings.gtk.Widget


lateinit var overlay: ToastOverlay

fun buildToastPage(): Widget {
    overlay = ToastOverlay()
    overlay.vexpand = true

    val page = StatusPage().apply {
        vexpand = true
        title = "Toasts"
        child = buildToastList()
        valign = Align.START
    }

    overlay.child = page

    return overlay
}

fun buildToastList(): Widget {

    val prefGroup = PreferencesGroup()

    prefGroup.add(demoToastRow("Simple Toast", ::showSimpleToast))
    prefGroup.add(demoToastRow("Toast with button", ::showButtonToast))
    prefGroup.add(demoToastRow("Custom Title", ::showCustomTitleToast))

    return Clamp().apply {
        maximumSize = 400
        tighteningThreshold = 300
        child = prefGroup
    }
}

private fun demoToastRow(label: String, handler: () -> Unit) = ActionRow().apply {
    this.title = label
    this.addSuffix(
        Button("Show").apply {
            valign = Align.CENTER
            connectClicked { handler() }
        },
    )
}

fun showSimpleToast() = overlay.addToast(Toast("A simple toast"))
fun showButtonToast() = overlay.addToast(
    Toast("A button toast").apply {
        buttonLabel = "Click me"
    },
)

fun showCustomTitleToast() = overlay.addToast(
    Toast("Custom Title").apply {
        customTitle = Avatar(30, null, false)
    },
)

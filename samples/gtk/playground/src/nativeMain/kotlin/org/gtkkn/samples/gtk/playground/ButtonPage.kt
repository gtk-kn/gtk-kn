package org.gtkkn.samples.gtk.playground

import org.gtkkn.bindings.adw.ActionRow
import org.gtkkn.bindings.adw.ButtonContent
import org.gtkkn.bindings.adw.Clamp
import org.gtkkn.bindings.adw.PreferencesGroup
import org.gtkkn.bindings.adw.SplitButton
import org.gtkkn.bindings.adw.StatusPage
import org.gtkkn.bindings.gio.Menu
import org.gtkkn.bindings.gio.MenuItem
import org.gtkkn.bindings.gio.SimplePermission
import org.gtkkn.bindings.gtk.Align
import org.gtkkn.bindings.gtk.Button
import org.gtkkn.bindings.gtk.CheckButton
import org.gtkkn.bindings.gtk.LinkButton
import org.gtkkn.bindings.gtk.LockButton
import org.gtkkn.bindings.gtk.Widget

fun buildButtonPage() = StatusPage().apply {
    title = "Buttons"
    child = Clamp().apply {
        maximumSize = 800
        child = PreferencesGroup().apply {
            addButton("Simple button") {
                Button(it)
            }
            addButton("Pill button") {
                Button(it).apply { addCssClass("pill") }
            }
            addButton("Raised") {
                Button(it).apply { addCssClass("raised") }
            }
            addButton("Flat") {
                Button(it).apply { addCssClass("flat") }
            }
            addButton("Suggested Action") {
                Button(it).apply { addCssClass("suggested-action") }
            }
            addButton("Destructive Action") {
                Button(it).apply { addCssClass("destructive-action") }
            }
            addButton("Icon") {
                Button.newFromIconName("open-menu")
            }
            addButton("Circular Icon") {
                Button.newFromIconName("open-menu").apply { addCssClass("circular") }
            }
            addButton("OSD") {
                Button(it).apply { addCssClass("osd") }
            }
            addButton("ButtonContent") {
                Button(it).apply {
                    child = ButtonContent().apply {
                        label = "ButtonContent"
                        iconName = "open-menu"
                    }
                }
            }
            addButton("Split button") {
                SplitButton().apply {
                    setLabel("Open")
                    menuModel = Menu().apply {
                        this.appendItem(MenuItem("Close", null))
                        this.appendItem(MenuItem("Another", null))
                    }
                    dropdownTooltip = "Dropdown tooltip text"
                }
            }
            addButton("Split button Icon") {
                SplitButton().apply {
                    iconName = "menu-open"
                    menuModel = Menu().apply {
                        this.appendItem(MenuItem("Close", null))
                        this.appendItem(MenuItem("Another", null))
                    }
                }
            }
            addButton("Split button Content") {
                SplitButton().apply {
                    child = ButtonContent().apply {
                        label = "Open"
                        iconName = "open-menu"
                    }
                    menuModel = Menu().apply {
                        this.appendItem(MenuItem("Close", null))
                        this.appendItem(MenuItem("Another", null))
                    }
                }
            }
            addButton("Check Button") {
                CheckButton()
            }
            addButton("Check Button Label") {
                CheckButton("Label")
            }
            addButton("Check Button Selection mode") {
                CheckButton().apply { addCssClass("selection-mode") }
            }
            addButton("Lock button") {
                LockButton(SimplePermission(false))
            }
            addButton("Link Button") {
                LinkButton("https://gitlab.com/gtk-kn/gtk-kn")
            }
            addButton("Link Button Label") {
                LinkButton("https://gitlab.com/gtk-kn/gtk-kn", "Gitlab")
            }
        }
    }
}

private fun PreferencesGroup.addButton(label: String, func: (String) -> Widget) {
    add(
        ActionRow().apply {
            title = label
            addSuffix(func(label).apply { valign = Align.CENTER })
        },
    )
}

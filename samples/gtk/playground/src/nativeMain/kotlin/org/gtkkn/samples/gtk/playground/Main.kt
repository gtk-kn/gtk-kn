package org.gtkkn.samples.gtk.playground

import io.github.oshai.KotlinLogging
import io.github.oshai.KotlinLoggingConfiguration
import io.github.oshai.Level
import org.gtkkn.bindings.adw.Application
import org.gtkkn.bindings.adw.ApplicationWindow
import org.gtkkn.bindings.adw.Flap
import org.gtkkn.bindings.adw.HeaderBar
import org.gtkkn.bindings.gio.ApplicationFlags
import org.gtkkn.bindings.gio.Menu
import org.gtkkn.bindings.gio.MenuItem
import org.gtkkn.bindings.gio.SimpleAction
import org.gtkkn.bindings.gtk.AboutDialog
import org.gtkkn.bindings.gtk.Box
import org.gtkkn.bindings.gtk.Label
import org.gtkkn.bindings.gtk.MenuButton
import org.gtkkn.bindings.gtk.Orientation
import org.gtkkn.bindings.gtk.Stack
import org.gtkkn.bindings.gtk.StackSidebar
import org.gtkkn.bindings.gtk.Widget

private val logger = KotlinLogging.logger("main")

fun main() {
    KotlinLoggingConfiguration.logLevel = Level.TRACE

    val app = Application("org.gtkkn.samples.gtk.playground", ApplicationFlags.FLAGS_NONE)
    app.connectActivate {
        val window = ApplicationWindow(app)
        window.setSizeRequest(1024, 768)

        val box = Box(Orientation.VERTICAL, 0).apply {
            append(buildHeaderBar())
            append(buildContent())
        }

        // create actions
        val aboutAction = SimpleAction("show-about", null)
        aboutAction.connectActivate { showAbout(app) }

        app.addAction(aboutAction)

        window.setContent(box)
        window.show()
    }

    app.run(0, emptyList())
}

fun buildContent(): Widget {
    val stack = Stack()

    stack.addTitled(buildButtonPage(), "buttons", "Buttons")
    stack.addTitled(buildToastPage(), "toasts", "Toasts")

    val stackSidebar = StackSidebar().apply {
        setSizeRequest(200, -1)
        setStack(stack)
        vexpand = true
    }

    val flap = Flap().apply {
        flap = stackSidebar
        revealFlap = true
        content = stack
    }

    return flap
}

fun buildHeaderBar() = HeaderBar().apply {
    titleWidget = Label("gtk-kn Playground")

    val menuButton = MenuButton().apply {
        menuModel = buildMenu()
        setIconName("open-menu")
    }

    packEnd(menuButton)
}

fun buildMenu() = Menu().apply {
    appendItem(MenuItem("About Playground", "app.show-about"))
}

fun showAbout(app: Application) {
    val dialog = AboutDialog().apply {
        application = app
    }
    dialog.show()
}

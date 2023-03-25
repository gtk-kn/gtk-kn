import bindings.gio.ApplicationFlags
import bindings.gtk.Application
import bindings.gtk.ApplicationWindow
import bindings.gtk.Button

private const val APP_ID = "org.gtkkn.samples.gtk.helloworld"

fun main() {
    // Create a new application
    val app = Application(APP_ID, ApplicationFlags.FLAGS_NONE)

    // Connect to "activate" signal of `app`
    app.connectActivate {
        // Create a button with label and margins
        val button = Button()
        button.setLabel("Press me!")
        button.setMarginStart(12)
        button.setMarginTop(12)
        button.setMarginEnd(12)
        button.setMarginBottom(12)

        // Connect to "clicked" signal of `button`
        button.connectClicked {
            // Set the label to "Hello World!" after the button has been clicked on
            button.setLabel("Hello World!");
        }

        // Create a window and set the title
        val window = ApplicationWindow(app)
        window.setTitle("My GTK App")
        window.setChild(button)

        // Present window
        window.present()
    }

    // Run the application
    app.run(0, emptyList())
}

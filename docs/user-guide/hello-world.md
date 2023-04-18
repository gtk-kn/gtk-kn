Now that we have a working installation of Kotlin/Native, let's start building our first `gtk-kn` app.

Firstly, we need to create a GTK `Application` instance with an application ID. To do this, we must add the `gtk-kn`
library dependencies to our `build.gradle.kts` file. Open the file and replace the comment `// Dependencies goes here`
with the `gtk-kt` dependency `implementation("org.gtkkn:gtk4:0.0.1-SNAPSHOT")`.

Next, we need to edit the `hello.kt` file and replace its contents with the following:

```kotlin
// hello.kt
import org.gtkkn.bindings.gio.ApplicationFlags
import org.gtkkn.bindings.gtk.Application

private const val APP_ID = "org.gtkkn.samples.gtk.playground"

fun main() {
    Application(APP_ID, ApplicationFlags.FLAGS_NONE)
        .run(0, emptyList())
}
```

From the root project directory, run the build command:

```bash
./gradlew runDebugExecutableLinuxX64
```

It builds fine, but nothing but a warning in our terminal appears:

!!! warning

    GLib-GIO-WARNING **: 20:36:01.273: Your application does not implement g_application_activate() and has no handlers
    connected to the 'activate' signal. It should do one of these.

GTK tells us that something should be called in its activate step. So let's create a GTK `ApplicationWindow` there:

```kotlin
// hello.kt
import org.gtkkn.bindings.gio.ApplicationFlags
import org.gtkkn.bindings.gtk.Application
import org.gtkkn.bindings.gtk.ApplicationWindow

private const val APP_ID = "org.gtkkn.samples.gtk.playground"

fun main() {
    // Create a new application
    val app = Application(APP_ID, ApplicationFlags.FLAGS_NONE)

    // Connect to "activate" signal of `app`
    app.connectActivate {

        // Create a window and set the title
        val window = ApplicationWindow(app)
        window.setTitle("My GTK App")

        // Present window
        window.present()
    }

    // Run the application
    app.run(0, emptyList())
}
```

That is better!

That's much better! Now we have a working window. But, of course, we want to do more than just display an empty window.
Let's add a button to our app:

``` kotlin title="samples/gtk/hello-world/src/nativeMain/kotlin/hello.kt"
--8<-- "samples/gtk/hello-world/src/nativeMain/kotlin/hello.kt"
```

Great! Now we have a button in our app that displays `"Press me!"`. When the button is clicked, it changes its label
to `"Hello World!"`.

And that's it! You've just created your first `gtk-kn` app.

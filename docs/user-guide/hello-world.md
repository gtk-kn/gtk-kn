Now that Kotlin/Native is set up, let’s build our first `gtk-kn` app.

First, create a GTK `Application` instance with an application ID. To do this, add the `gtk-kn` dependency to your
`build.gradle.kts` file. Open the file and replace `// Specify dependencies here` with:

```kotlin
implementation("org.gtkkn:gtk4-linuxx64:0.0.3-SNAPSHOT")
```

Next, update `hello.kt` with the following content:

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

To build the project, run this command from the root directory:

```bash
./gradlew runDebugExecutableLinuxX64
```

The build completes, but you’ll see a warning in the terminal:

!!! warning

    GLib-GIO-WARNING **: 20:36:01.273: Your application does not implement g_application_activate() and has no handlers
    connected to the 'activate' signal. It should do one of these.

GTK indicates that something should be executed in the activate step. Let’s add a GTK `ApplicationWindow`:

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
    app.onActivate {

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

That’s better! Now we have a working window. Next, let’s add a button:

``` kotlin title="samples/gtk/hello-world/src/nativeMain/kotlin/hello.kt"
--8<-- "samples/gtk/hello-world/src/nativeMain/kotlin/hello.kt:doc"
```

Now, you’ll see a button labeled `"Press me!"` in the window. When clicked, it changes to `"Hello World!"`.

Congratulations! You’ve just created your first `gtk-kn` app.

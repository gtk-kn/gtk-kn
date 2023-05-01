# gtk-kn samples

The samples folder contains example modules to show off various use cases for the bindings.

## GTK

### hello-world

[hello-world](gtk/hello-world) is the most basic example showing the setup required to put a window on
the screen and interact with widgets.

### widgets

[widgets](gtk/widgets) is a showcase of various GTK widgets and patterns:

- Label
- ListView
- MessageDialog
- ProgressBar
- Spinner
- TreeView

### widget-templates

[widget-templates](gtk/widget-templates) is an example that has a custom `ExampleWidget` widget class that uses
[examplewidget.ui](gtk/widget-templates/src/nativeMain/resources/examplewidget.ui) as a resource file to define
the widget template and binds the child objects from the template as instance properties.

### restore-window-state

[restore-window-state](gtk/restore-window-state) is an example that uses a Gio Settings schema
to store the window state on close and restore the previous state when the window is opened.

### embedded-resources

[embedded-resources](gtk/embedded-resources) is an example that uses the gradle plugin to
embed the `kotlin.png` file in the executable binary and display it at runtime in an `Image` widget.

### external-resources

[external-resources](gtk/external-resources) is similar to [embedded-resources](#embedded-resources)
but instead uses the gradle plugin to compile the image into an external resource bundle which
is loaded at runtime.

## Playground

The [playground](playground) is a module which opens a blank window that is mostly used
for development and testing purposes.

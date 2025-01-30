# GtkSourceView

[GtkSourceView](https://wiki.gnome.org/Projects/GtkSourceView) is an open-source library that provides a text widget for
syntax-highlighted code editing and related features like auto-indentation, code folding, and line numbering, making it
ideal for text editors and IDEs. This project offers Kotlin/Native bindings for easy integration into GTK applications.

## Enabling GtkSourceView

GtkSourceView bindings are not enabled by default and need to be manually added. To do so, move the GtkSourceView entry
from `ignoredLibraries` to `libraries` in the `gtkkn.json` file.

## Requirements

To generate bindings, install GtkSourceView on your system:

```bash
sudo apt install libgtksourceview-5-dev
```

## Example

The following example demonstrates how to create a simple application using GtkSourceView with syntax highlighting for
Kotlin code. The app includes options to show or hide line numbers and toggle between using spaces or tabs for
indentation.

``` kotlin title="samples/gtksource/sample/src/nativeMain/kotlin/org/gtkkn/samples/gtksource/sample/Main.kt"
--8<-- "samples/gtksource/sample/src/nativeMain/kotlin/org/gtkkn/samples/gtksource/sample/Main.kt:doc"
```

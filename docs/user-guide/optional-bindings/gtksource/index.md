# GtkSourceView

[GtkSourceView](https://wiki.gnome.org/Projects/GtkSourceView) is an open-source library offering syntax highlighting
and text-editing features for programming languages in the GTK+ toolkit. Part of the GNOME project, GtkSourceView was
first released in 2001.

GtkSourceView provides a text widget for displaying syntax-highlighted text and supports over 60 programming languages,
including C, C++, Java, Python, Ruby, and PHP. It also offers features like auto-indentation, code folding, bracket
matching, line numbers, and current-line highlighting.

This library is commonly used in applications requiring text editing, such as text editors, IDEs, and even web browsers,
and is integrated into popular GNOME applications like Gedit, Anjuta, and GNOME Builder.

Written in C and utilizing the GObject system, GtkSourceView is easily integrated into GTK+ applications, with bindings
available for languages like Python, Ruby, and Vala. This project offers bindings for Kotlin/Native.

GtkSourceView is licensed under the GNU LGPL, allowing free use, modification, and distribution, including in commercial
applications. It is actively maintained with regular updates.

## Enabling GtkSourceView

GtkSourceView bindings are not enabled by default and need to be manually added. To do so, move the GtkSourceView entry
from `ignoredLibraries` to `libraries` in the `gtkkn.json` file.

??? example "Click to expand/collapse"

    ```diff
    Index: gtkkn.json
    IDEA additional info:
    Subsystem: com.intellij.openapi.diff.impl.patch.CharsetEP
    <+>UTF-8
    ===================================================================
    diff --git a/gtkkn.json b/gtkkn.json
    --- a/gtkkn.json	(revision 9750816d132985ec8333f7b473ce3b566129a3e3)
    +++ b/gtkkn.json	(date 1730312445899)
    @@ -69,9 +69,7 @@
           "name": "adw",
           "module": "adwaita",
           "girPrefix": "Adw-1"
    -    }
    -  ],
    -  "ignoredLibraries": [
    +    },
         {
           "name": "gtksource",
           "module": "extra:gtksource",
    ```

## Requirements

To generate bindings, install GtkSourceView on your system:

```bash
sudo apt install libgtksourceview-5-dev
```

Labels are primarily used for displaying non-editable text in windows, such as placing a title next to an `Entry`
widget. You can set label text in the constructor or later with `Label.setText` or `Label.setMarkup`.

Label width adjusts automatically, and multi-line labels can be created by including line breaks (`\n`) in the text
string.

### Selectable Labels

Labels can be made selectable using `Label.selectable`, allowing users to copy the text to the clipboard. Only make
labels with valuable information (like error messages) selectable.

### Text Justification and Wrapping

The label text can be justified using `Label.justify`. Word-wrapping, activated with `Label.wrap`, ensures labels fit
neatly within limited space.

### Formatting Options

`Label` supports simple text formatting, allowing text to appear bold, colored, or larger by using the `Label.setMarkup`
method with [Pango Markup syntax](https://docs.gtk.org/Pango/pango_markup.html). For example, ``<b>bold text</b>`` or
``<s>strikethrough text</s>``.

Labels can also display clickable hyperlinks, styled similarly to web browsers with colored, underlined text. Links are
created with HTML-like `<a>` tags and can include a `title` attribute, which shows as a tooltip.

```kotlin

label.setMarkup(
    "Go to <a href=\"https://www.org\" title=\"Our website\">GTK4 website</a> for more"
)
```

### Mnemonics

Labels may contain *mnemonics*, which are underlined characters used for keyboard navigation. Create mnemonics by adding
an underscore before the mnemonic character (e.g., `"_File"`) and using `Label.newWithMnemonic` or
`Label.setTextWithMnemonic`. Mnemonics activate any activatable widget within the label’s container, like a `Button`. If
the target widget isn’t within the same container, use `Label.mnemonicWidget` to specify the target.

**Example**

``` kotlin title="samples/gtk/widgets/src/nativeMain/kotlin/org/gtkkn/samples/gtk/widgets/Label.kt"
--8<-- "samples/gtk/widgets/src/nativeMain/kotlin/org/gtkkn/samples/gtk/widgets/Label.kt:doc"
```

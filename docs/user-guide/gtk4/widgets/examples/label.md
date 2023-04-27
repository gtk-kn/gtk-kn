Labels are the main method of placing non-editable text in windows, for instance to place a title next to an `Entry`
widget. You can specify the text in the constructor, or later with the `Label.setText` or `Label.setMarkup` methods.

The width of the label will be adjusted automatically. You can produce multi-line labels by putting line breaks ("`\n`")
in the label string.

Labels can be made selectable with `Label.selectable`. Selectable labels allow the user to copy the label contents to
the clipboard. Only labels that contain useful-to-copy information — such as error messages — should be made selectable.

The label text can be justified using the `Label.justify` property. The widget is also capable of word-wrapping, which
can be activated with `Label.wrap`.

`Label` support some simple formatting, for instance allowing you to make some text bold, colored, or larger. You can do
this by providing a string to `Label._markup`, using
the [Pango Markup syntax](https://docs.gtk.org/Pango/pango_markup.html). For
instance, ``<b>bold text</b> and <s>strikethrough text</s>``.
In addition, `Label` supports clickable hyperlinks. The markup for links is borrowed from HTML, using the a with href
and title attributes. GTK4 renders links similar to the way they appear in web browsers, with colored, underlined text.
The title attribute is displayed as a tooltip on the link.

```kotlin

label.setMarkup(
    "Go to <a href=\"https://www.org\" title=\"Our website\">GTK4 website</a> for more"
)
```

Labels may contain *mnemonics*. Mnemonics are underlined characters in the label, used for keyboard navigation.
Mnemonics are created by providing a string with an underscore before the mnemonic character, such as `"_File"`, to the
functions `Label.newWithMnemonic` or `Label.setTextWithMnemonic`.
Mnemonics automatically activate any activatable widget the label is inside, such as a `Button`; if the label is not
inside the mnemonic's target widget, you have to tell the label about the target using `Label.mnemonicWidget`.

**Example**

``` kotlin title="samples/gtk/widgets/src/nativeMain/kotlin/org/gtkkn/samples/gtk/widgets/Label.kt"
--8<-- "samples/gtk/widgets/src/nativeMain/kotlin/org/gtkkn/samples/gtk/widgets/Label.kt:doc"
```

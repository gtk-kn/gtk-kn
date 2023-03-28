## Label

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
--8<-- "samples/gtk/widgets/src/nativeMain/kotlin/org/gtkkn/samples/gtk/widgets/Label.kt"
```

## ProgressBar

The `ProgressBar` is typically used to display the progress of a long running operation. It provides a visual clue that
processing is underway. The `ProgressBar` can be used in two different modes: *percentage mode* and *activity mode*.

When an application can determine how much work needs to take place (e.g. read a fixed number of bytes from a file) and
can monitor its progress, it can use the `ProgressBar` in *percentage mode* and the user sees a growing bar indicating
the percentage of the work that has been completed. In this mode, the application is required to
call `ProgressBar.fraction` periodically to update the progress bar, passing a float between 0 and 1 to provide the new
percentage value.

When an application has no accurate way of knowing the amount of work to do, it can use *activity mode*, which shows
activity by a block moving back and forth within the progress area. In this mode, the application is required to
call `ProgressBar.pulse` periodically to update the progress bar. You can also choose the step size, with
the `ProgressBar.pulseStep` property.

By default, `ProgressBar` is horizontal and left-to-right, but you can change it to a vertical progress bar by using
the `ProgressBar.orientation` property. Changing the direction the progress bar grows can be done
using `ProgressBar.inverted`. `ProgressBar` can also contain text which can be set by calling `ProgressBar.setText`
and `ProgressBar.showText`.

**Example**

``` kotlin title="samples/gtk/widgets/src/nativeMain/kotlin/org/gtkkn/samples/gtk/widgets/ProgressBar.kt"
--8<-- "samples/gtk/widgets/src/nativeMain/kotlin/org/gtkkn/samples/gtk/widgets/ProgressBar.kt"
```

## Spinner

The `Spinner` displays an icon-size spinning animation. It is often used as an alternative to a `ProgressBar` for
displaying indefinite activity, instead of actual progress.

To start the animation, use `Spinner.start`, to stop it use `Spinner.stop`.

**Example**

``` kotlin title="samples/gtk/widgets/src/nativeMain/kotlin/org/gtkkn/samples/gtk/widgets/Spinner.kt"
--8<-- "samples/gtk/widgets/src/nativeMain/kotlin/org/gtkkn/samples/gtk/widgets/Spinner.kt"
```

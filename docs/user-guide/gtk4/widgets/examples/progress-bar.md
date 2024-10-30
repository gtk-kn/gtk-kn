The `ProgressBar` widget displays the progress of long-running operations, providing a visual cue to the user. It
supports two modes: *percentage mode* and *activity mode*.

### Percentage Mode

Use *percentage mode* when the total work can be measured (e.g., reading a set number of bytes from a file). This mode
shows a growing bar indicating progress. To update the bar, call `ProgressBar.fraction` periodically, passing a float
value between 0 and 1 to represent the percentage completed.

### Activity Mode

For operations where the total work is unknown, use *activity mode*. This mode shows a block moving back and forth to
indicate activity. To update, call `ProgressBar.pulse` periodically. You can also set the step size using
`ProgressBar.pulseStep`.

### Customizing the ProgressBar

By default, the `ProgressBar` is horizontal and moves left to right, but you can customize it:

- **Orientation**: Set `ProgressBar.orientation` to switch between horizontal and vertical orientations.
- **Direction**: Use `ProgressBar.inverted` to change the direction the bar fills.
- **Text**: Display text inside the progress bar with `ProgressBar.setText` and control its visibility with
  `ProgressBar.showText`.

**Example**

``` kotlin title="samples/gtk/widgets/src/nativeMain/kotlin/org/gtkkn/samples/gtk/widgets/ProgressBar.kt"
--8<-- "samples/gtk/widgets/src/nativeMain/kotlin/org/gtkkn/samples/gtk/widgets/ProgressBar.kt:doc"
```

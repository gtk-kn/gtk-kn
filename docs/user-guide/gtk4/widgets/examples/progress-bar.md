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
--8<-- "samples/gtk/widgets/src/nativeMain/kotlin/org/gtkkn/samples/gtk/widgets/ProgressBar.kt:doc"
```

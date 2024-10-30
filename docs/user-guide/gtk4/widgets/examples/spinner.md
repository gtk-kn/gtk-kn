The `Spinner` widget displays a small spinning animation, commonly used to indicate ongoing activity when the exact
progress is unknown—an alternative to `ProgressBar` for indefinite loading states.

To control the animation, call:

- `Spinner.start` to begin spinning
- `Spinner.stop` to halt the animation

**Example**

``` kotlin title="samples/gtk/widgets/src/nativeMain/kotlin/org/gtkkn/samples/gtk/widgets/Spinner.kt"
--8<-- "samples/gtk/widgets/src/nativeMain/kotlin/org/gtkkn/samples/gtk/widgets/Spinner.kt:doc"
```

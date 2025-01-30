Here's the revised documentation page for WebKitGTK:

# WebKitGTK

[WebKitGTK](https://webkitgtk.org/) is an open-source web content engine that allows developers to embed web browsing
capabilities within GTK-based applications. It supports modern web technologies like HTML5, CSS, and JavaScript, making
it a popular choice for creating GTK-based web browsers and tools. This project provides Kotlin/Native bindings for
integrating WebKitGTK in Kotlin applications.

## Enabling WebKitGTK

WebKitGTK bindings are not enabled by default and need to be manually added. To enable WebKitGTK bindings, move the
WebKitGTK entry from `ignoredLibraries` to `libraries` in the `gtkkn.json` file.

## Requirements

To generate bindings and run applications using WebKitGTK, install the necessary development package on your system:

```bash
sudo apt install libwebkitgtk-6.0-dev
```

## Example Usage

The following example demonstrates how to create a simple web browser using WebKitGTK. This example is adapted from a
similar one provided by the [Java GI project](https://github.com/jwharm/java-gi-examples?tab=readme-ov-file), which
offers JVM bindings. We extend our thanks to the Java GI project for the inspiration and sample code.

``` kotlin title="samples/webkit/browser/src/nativeMain/kotlin/org/gtkkn/samples/webkit/browser/Main.kt"
--8<-- "samples/webkit/browser/src/nativeMain/kotlin/org/gtkkn/samples/webkit/browser/Main.kt:doc"
```

This sample code creates a basic web browser using WebKitGTK, featuring a `WebView` widget integrated into a GTK
application window and basic URL navigation controls. It demonstrates how to use the Kotlin/Native WebKitGTK bindings to
create applications that display and interact with web content.

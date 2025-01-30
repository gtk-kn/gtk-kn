---
title: Bindings Overview
description: Learn how gtk-kn provides Kotlin/Native bindings for GTK, GIO, Adwaita, and more, enabling seamless native GTK development in Kotlin.
---

GTK is a **C-based framework**, but thanks to **GObject-Introspection**, it can be used in many programming languages,
including Kotlin/Native.

The **`gtk-kn` project** provides **Kotlin/Native bindings** for GTK-related libraries, allowing developers to write
native GTK applications in **pure Kotlin** while leveraging the full power of GTK.

## What Are Language Bindings?

Language bindings act as a **bridge** between different programming languages and native libraries. They **expose** the
API of a library (written in one language, like C) in a way that another language (Kotlin/Native) can use seamlessly.

With `gtk-kn`, you can **interact with GTK, GIO, Adwaita, and other libraries** using a familiar **Kotlin API** without
writing low-level C code.

## What You’ll Find in This Section

This section contains documentation and examples for the **GTK-related bindings provided by `gtk-kn`**, including:

- **GTK4** → Core UI elements and widgets
- **GIO** → System integration features (e.g., file operations, notifications)
- **Adwaita** → Modern GNOME application components

With these bindings, you can build fully functional **Kotlin/Native GTK applications** without needing to write C code
manually.

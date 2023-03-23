package org.gtkkn.gir.config

import io.github.oshai.Level
import java.io.File

data class Config(
    val girBaseDir: File,
    val outputDir: File,
    val logLevel: Level,
    val skipFormat: Boolean,
    val bindingLicense: License,
    val girPrefixWhitelist: Set<String> = setOf(
        "Adw-1",
        "cairo-",
        "Gdk-4",
        "GdkPixbuf-",
        "Gio-",
        "GLib-",
        "GModule-",
        "GObject-",
        "Graphene-",
        "Gsk-",
        "Gtk-4",
        "HarfBuzz-",
        "Pango-",
        "PangoCairo-",
    ),
    val groupedRepoMap: Map<String, Array<String>> = mapOf(
        "core" to arrayOf(
            "cairo",
            "gdkpixbuf",
            "gio",
            "glib",
            "gmodule",
            "gobject",
            "graphene",
            "harfbuzz",
            "pango",
            "pangocairo",
        ),
        "gtk4" to arrayOf(
            "gdk",
            "gsk",
            "gtk",
        ),
    )
) {
    enum class License {
        LGPL,
        MIT
    }
}

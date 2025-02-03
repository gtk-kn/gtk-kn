// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkIMContextSimple
import org.gtkkn.native.gtk.gtk_im_context_simple_add_compose_file
import org.gtkkn.native.gtk.gtk_im_context_simple_get_type
import org.gtkkn.native.gtk.gtk_im_context_simple_new
import kotlin.String
import kotlin.Unit

/**
 * `GtkIMContextSimple` is an input method supporting table-based input methods.
 *
 * ## Compose sequences
 *
 * `GtkIMContextSimple` reads compose sequences from the first of the
 * following files that is found: ~/.config/gtk-4.0/Compose, ~/.XCompose,
 * /usr/share/X11/locale/$locale/Compose (for locales that have a nontrivial
 * Compose file). A subset of the file syntax described in the Compose(5)
 * manual page is supported. Additionally, `include "%L"` loads GTK’s built-in
 * table of compose sequences rather than the locale-specific one from X11.
 *
 * If none of these files is found, `GtkIMContextSimple` uses a built-in table
 * of compose sequences that is derived from the X11 Compose files.
 *
 * Note that compose sequences typically start with the Compose_key, which is
 * often not available as a dedicated key on keyboards. Keyboard layouts may
 * map this keysym to other keys, such as the right Control key.
 *
 * ## Unicode characters
 *
 * `GtkIMContextSimple` also supports numeric entry of Unicode characters
 * by typing <kbd>Ctrl</kbd>-<kbd>Shift</kbd>-<kbd>u</kbd>, followed by a
 * hexadecimal Unicode codepoint.
 *
 * For example,
 *
 *     Ctrl-Shift-u 1 2 3 Enter
 *
 * yields U+0123 LATIN SMALL LETTER G WITH CEDILLA, i.e. ģ.
 *
 * ## Dead keys
 *
 * `GtkIMContextSimple` supports dead keys. For example, typing
 *
 *     dead_acute a
 *
 *  yields U+00E! LATIN SMALL LETTER_A WITH ACUTE, i.e. á. Note that this
 *  depends on the keyboard layout including dead keys.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `data`: Array parameter of type guint16 is not supported
 */
public open class ImContextSimple(public val gtkImContextSimplePointer: CPointer<GtkIMContextSimple>) :
    ImContext(gtkImContextSimplePointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    /**
     * Creates a new `GtkIMContextSimple`.
     *
     * @return a new `GtkIMContextSimple`
     */
    public constructor() : this(gtk_im_context_simple_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Adds an additional table from the X11 compose file.
     *
     * @param composeFile The path of compose file
     */
    public open fun addComposeFile(composeFile: String): Unit =
        gtk_im_context_simple_add_compose_file(gtkImContextSimplePointer, composeFile)

    public companion object : TypeCompanion<ImContextSimple> {
        override val type: GeneratedClassKGType<ImContextSimple> =
            GeneratedClassKGType(getTypeOrNull()!!) { ImContextSimple(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of IMContextSimple
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_im_context_simple_get_type()

        /**
         * Gets the GType of from the symbol `gtk_im_context_simple_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_im_context_simple_get_type")
    }
}

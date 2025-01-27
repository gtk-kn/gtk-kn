// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.ext.toKStringList
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GFilenameCompleter
import org.gtkkn.native.gio.g_filename_completer_get_completion_suffix
import org.gtkkn.native.gio.g_filename_completer_get_completions
import org.gtkkn.native.gio.g_filename_completer_get_type
import org.gtkkn.native.gio.g_filename_completer_new
import org.gtkkn.native.gio.g_filename_completer_set_dirs_only
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit
import kotlin.collections.List

/**
 * Completes partial file and directory names given a partial string by
 * looking in the file system for clues. Can return a list of possible
 * completion strings for widget implementations.
 */
public open class FilenameCompleter(public val gioFilenameCompleterPointer: CPointer<GFilenameCompleter>) :
    Object(gioFilenameCompleterPointer.reinterpret()),
    KGTyped {
    /**
     * Creates a new filename completer.
     *
     * @return a #GFilenameCompleter.
     */
    public constructor() : this(g_filename_completer_new()!!.reinterpret())

    /**
     * Obtains a completion for @initial_text from @completer.
     *
     * @param initialText text to be completed.
     * @return a completed string, or null if no
     *     completion exists. This string is not owned by GIO, so remember to g_free()
     *     it when finished.
     */
    public open fun getCompletionSuffix(initialText: String): String? =
        g_filename_completer_get_completion_suffix(gioFilenameCompleterPointer, initialText)?.toKString()

    /**
     * Gets an array of completion strings for a given initial text.
     *
     * @param initialText text to be completed.
     * @return array of strings with possible completions for @initial_text.
     * This array must be freed by g_strfreev() when finished.
     */
    public open fun getCompletions(initialText: String): List<String> =
        g_filename_completer_get_completions(gioFilenameCompleterPointer, initialText)?.toKStringList()
            ?: error("Expected not null string array")

    /**
     * If @dirs_only is true, @completer will only
     * complete directory names, and not file names.
     *
     * @param dirsOnly a #gboolean.
     */
    public open fun setDirsOnly(dirsOnly: Boolean): Unit =
        g_filename_completer_set_dirs_only(gioFilenameCompleterPointer, dirsOnly.asGBoolean())

    /**
     * Emitted when the file name completion information comes available.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onGotCompletionData(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gioFilenameCompleterPointer,
            "got-completion-data",
            onGotCompletionDataFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "got-completion-data" signal. See [onGotCompletionData].
     */
    public fun emitGotCompletionData() {
        g_signal_emit_by_name(gioFilenameCompleterPointer.reinterpret(), "got-completion-data")
    }

    public companion object : TypeCompanion<FilenameCompleter> {
        override val type: GeneratedClassKGType<FilenameCompleter> =
            GeneratedClassKGType(getTypeOrNull("g_filename_completer_get_type")!!) {
                FilenameCompleter(it.reinterpret())
            }

        init {
            GioTypeProvider.register()
        }

        /**
         * Get the GType of FilenameCompleter
         *
         * @return the GType
         */
        public fun getType(): GType = g_filename_completer_get_type()
    }
}

private val onGotCompletionDataFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

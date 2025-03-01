// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtksource

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
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtksource.GtkSourceSnippetContext
import org.gtkkn.native.gtksource.gtk_source_snippet_context_clear_variables
import org.gtkkn.native.gtksource.gtk_source_snippet_context_expand
import org.gtkkn.native.gtksource.gtk_source_snippet_context_get_type
import org.gtkkn.native.gtksource.gtk_source_snippet_context_get_variable
import org.gtkkn.native.gtksource.gtk_source_snippet_context_new
import org.gtkkn.native.gtksource.gtk_source_snippet_context_set_constant
import org.gtkkn.native.gtksource.gtk_source_snippet_context_set_line_prefix
import org.gtkkn.native.gtksource.gtk_source_snippet_context_set_tab_width
import org.gtkkn.native.gtksource.gtk_source_snippet_context_set_use_spaces
import org.gtkkn.native.gtksource.gtk_source_snippet_context_set_variable
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * Context for expanding [class@SnippetChunk].
 *
 * This class is currently used primary as a hashtable. However, the longer
 * term goal is to have it hold onto a `GjsContext` as well as other languages
 * so that [class@SnippetChunk] can expand themselves by executing
 * script within the context.
 *
 * The [class@Snippet] will build the context and then expand each of the
 * chunks during the insertion/edit phase.
 */
public open class SnippetContext(public val gtksourceSnippetContextPointer: CPointer<GtkSourceSnippetContext>) :
    Object(gtksourceSnippetContextPointer.reinterpret()),
    KGTyped {
    init {
        GtkSource
    }

    /**
     * Creates a new #GtkSourceSnippetContext.
     *
     * Generally, this isn't needed unless you are controlling the
     * expansion of snippets manually.
     *
     * @return a #GtkSourceSnippetContext
     */
    public constructor() : this(gtk_source_snippet_context_new()!!) {
        InstanceCache.put(this)
    }

    /**
     * Removes all variables from the context.
     */
    public open fun clearVariables(): Unit = gtk_source_snippet_context_clear_variables(gtksourceSnippetContextPointer)

    public open fun expand(input: String): String =
        gtk_source_snippet_context_expand(gtksourceSnippetContextPointer, input)?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the current value for a variable named @key.
     *
     * @param key the name of the variable
     * @return the value for the variable, or null
     */
    public open fun getVariable(key: String): String? =
        gtk_source_snippet_context_get_variable(gtksourceSnippetContextPointer, key)?.toKString()

    /**
     * Sets a constatnt within the context.
     *
     * This is similar to a variable set with [method@SnippetContext.set_variable]
     * but is expected to not change during use of the snippet.
     *
     * Examples would be the date or users name.
     *
     * @param key the constant name
     * @param value the value of the constant
     */
    public open fun setConstant(key: String, `value`: String): Unit =
        gtk_source_snippet_context_set_constant(gtksourceSnippetContextPointer, key, `value`)

    public open fun setLinePrefix(linePrefix: String): Unit =
        gtk_source_snippet_context_set_line_prefix(gtksourceSnippetContextPointer, linePrefix)

    public open fun setTabWidth(tabWidth: gint): Unit =
        gtk_source_snippet_context_set_tab_width(gtksourceSnippetContextPointer, tabWidth)

    public open fun setUseSpaces(useSpaces: Boolean): Unit =
        gtk_source_snippet_context_set_use_spaces(gtksourceSnippetContextPointer, useSpaces.asGBoolean())

    /**
     * Sets a variable within the context.
     *
     * This variable may be overridden by future updates to the
     * context.
     *
     * @param key the variable name
     * @param value the value for the variable
     */
    public open fun setVariable(key: String, `value`: String): Unit =
        gtk_source_snippet_context_set_variable(gtksourceSnippetContextPointer, key, `value`)

    /**
     * The signal is emitted when a change has been
     * discovered in one of the chunks of the snippet which has
     * caused a variable or other dynamic data within the context
     * to have changed.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onChanged(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtksourceSnippetContextPointer,
            "changed",
            onChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "changed" signal. See [onChanged].
     */
    public fun emitChanged() {
        g_signal_emit_by_name(gtksourceSnippetContextPointer.reinterpret(), "changed")
    }

    public companion object : TypeCompanion<SnippetContext> {
        override val type: GeneratedClassKGType<SnippetContext> =
            GeneratedClassKGType(getTypeOrNull()!!) { SnippetContext(it.reinterpret()) }

        init {
            GtkSourceTypeProvider.register()
        }

        /**
         * Get the GType of SnippetContext
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_source_snippet_context_get_type()

        /**
         * Gets the GType of from the symbol `gtk_source_snippet_context_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_source_snippet_context_get_type")
    }
}

private val onChangedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.webkit

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_10
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_20
import org.gtkkn.bindings.webkit.annotations.WebKitVersion2_44
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.webkit.WebKitEditorState
import org.gtkkn.native.webkit.webkit_editor_state_get_type
import org.gtkkn.native.webkit.webkit_editor_state_get_typing_attributes
import org.gtkkn.native.webkit.webkit_editor_state_is_copy_available
import org.gtkkn.native.webkit.webkit_editor_state_is_cut_available
import org.gtkkn.native.webkit.webkit_editor_state_is_paste_available
import org.gtkkn.native.webkit.webkit_editor_state_is_redo_available
import org.gtkkn.native.webkit.webkit_editor_state_is_undo_available
import kotlin.Boolean
import kotlin.ULong
import kotlin.Unit

/**
 * Web editor state.
 *
 * WebKitEditorState represents the state of a #WebKitWebView editor.
 * Use webkit_web_view_get_editor_state() to get the WebKitEditorState
 * of a #WebKitWebView.
 * @since 2.10
 */
@WebKitVersion2_10
public class EditorState(public val webkitEditorStatePointer: CPointer<WebKitEditorState>) :
    Object(webkitEditorStatePointer.reinterpret()),
    KGTyped {
    /**
     * Bitmask of #WebKitEditorTypingAttributes flags.
     * See webkit_editor_state_get_typing_attributes() for more information.
     *
     * @since 2.10
     */
    @WebKitVersion2_10
    public val typingAttributes: guint
        /**
         * Gets the typing attributes at the current cursor position.
         *
         * If there is a selection, this returns the typing attributes
         * of the selected text. Note that in case of a selection,
         * typing attributes are considered active only when they are
         * present throughout the selection.
         *
         * @return a bitmask of #WebKitEditorTypingAttributes flags
         * @since 2.10
         */
        get() = webkit_editor_state_get_typing_attributes(webkitEditorStatePointer)

    /**
     * Gets whether a copy command can be issued.
     *
     * @return true if copy is currently available
     * @since 2.20
     */
    @WebKitVersion2_20
    public fun isCopyAvailable(): Boolean = webkit_editor_state_is_copy_available(webkitEditorStatePointer).asBoolean()

    /**
     * Gets whether a cut command can be issued.
     *
     * @return true if cut is currently available
     * @since 2.20
     */
    @WebKitVersion2_20
    public fun isCutAvailable(): Boolean = webkit_editor_state_is_cut_available(webkitEditorStatePointer).asBoolean()

    /**
     * Gets whether a paste command can be issued.
     *
     * @return true if paste is currently available
     * @since 2.20
     */
    @WebKitVersion2_20
    public fun isPasteAvailable(): Boolean =
        webkit_editor_state_is_paste_available(webkitEditorStatePointer).asBoolean()

    /**
     * Gets whether a redo command can be issued.
     *
     * @return true if redo is currently available
     * @since 2.20
     */
    @WebKitVersion2_20
    public fun isRedoAvailable(): Boolean = webkit_editor_state_is_redo_available(webkitEditorStatePointer).asBoolean()

    /**
     * Gets whether an undo command can be issued.
     *
     * @return true if undo is currently available
     * @since 2.20
     */
    @WebKitVersion2_20
    public fun isUndoAvailable(): Boolean = webkit_editor_state_is_undo_available(webkitEditorStatePointer).asBoolean()

    /**
     * Emitted when the #WebKitEdtorState is changed.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 2.44
     */
    @WebKitVersion2_44
    public fun onChanged(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            webkitEditorStatePointer,
            "changed",
            onChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "changed" signal. See [onChanged].
     *
     * @since 2.44
     */
    @WebKitVersion2_44
    public fun emitChanged() {
        g_signal_emit_by_name(webkitEditorStatePointer.reinterpret(), "changed")
    }

    public companion object : TypeCompanion<EditorState> {
        override val type: GeneratedClassKGType<EditorState> =
            GeneratedClassKGType(webkit_editor_state_get_type()) { EditorState(it.reinterpret()) }

        init {
            WebkitTypeProvider.register()
        }

        /**
         * Get the GType of EditorState
         *
         * @return the GType
         */
        public fun getType(): GType = webkit_editor_state_get_type()
    }
}

private val onChangedFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

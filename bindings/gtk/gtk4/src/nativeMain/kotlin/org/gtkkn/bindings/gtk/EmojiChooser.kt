// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.cstr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkEmojiChooser
import org.gtkkn.native.gtk.GtkNative
import org.gtkkn.native.gtk.GtkShortcutManager
import org.gtkkn.native.gtk.gtk_emoji_chooser_get_type
import org.gtkkn.native.gtk.gtk_emoji_chooser_new
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * The `GtkEmojiChooser` is used by text widgets such as `GtkEntry` or
 * `GtkTextView` to let users insert Emoji characters.
 *
 * ![An example GtkEmojiChooser](emojichooser.png)
 *
 * `GtkEmojiChooser` emits the [signal@Gtk.EmojiChooser::emoji-picked]
 * signal when an Emoji is selected.
 *
 * # CSS nodes
 *
 * ```
 * popover
 * ├── box.emoji-searchbar
 * │   ╰── entry.search
 * ╰── box.emoji-toolbar
 *     ├── button.image-button.emoji-section
 *     ├── ...
 *     ╰── button.image-button.emoji-section
 * ```
 *
 * Every `GtkEmojiChooser` consists of a main node called popover.
 * The contents of the popover are largely implementation defined
 * and supposed to inherit general styles.
 * The top searchbar used to search emoji and gets the .emoji-searchbar
 * style class itself.
 * The bottom toolbar used to switch between different emoji categories
 * consists of buttons with the .emoji-section style class and gets the
 * .emoji-toolbar style class itself.
 */
public open class EmojiChooser(public val gtkEmojiChooserPointer: CPointer<GtkEmojiChooser>) :
    Popover(gtkEmojiChooserPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    override val gtkNativePointer: CPointer<GtkNative>
        get() = handle.reinterpret()

    override val gtkShortcutManagerPointer: CPointer<GtkShortcutManager>
        get() = handle.reinterpret()

    /**
     * Creates a new `GtkEmojiChooser`.
     *
     * @return a new `GtkEmojiChooser`
     */
    public constructor() : this(gtk_emoji_chooser_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Emitted when the user selects an Emoji.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `text` the Unicode sequence for the picked Emoji, in UTF-8
     */
    public fun onEmojiPicked(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (text: String) -> Unit): ULong =
        g_signal_connect_data(
            gtkEmojiChooserPointer,
            "emoji-picked",
            onEmojiPickedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "emoji-picked" signal. See [onEmojiPicked].
     *
     * @param text the Unicode sequence for the picked Emoji, in UTF-8
     */
    public fun emitEmojiPicked(text: String) {
        g_signal_emit_by_name(gtkEmojiChooserPointer.reinterpret(), "emoji-picked", text.cstr)
    }

    public companion object : TypeCompanion<EmojiChooser> {
        override val type: GeneratedClassKGType<EmojiChooser> =
            GeneratedClassKGType(getTypeOrNull()!!) { EmojiChooser(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of EmojiChooser
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_emoji_chooser_get_type()

        /**
         * Gets the GType of from the symbol `gtk_emoji_chooser_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_emoji_chooser_get_type")
    }
}

private val onEmojiPickedFunc: CPointer<CFunction<(CPointer<ByteVar>) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        text: CPointer<ByteVar>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            text: String,
        ) -> Unit
        >().get().invoke(text?.toKString() ?: error("Expected not null string"))
}
    .reinterpret()

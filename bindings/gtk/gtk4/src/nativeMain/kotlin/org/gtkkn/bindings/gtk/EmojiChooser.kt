// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.g_signal_connect_data
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
public open class EmojiChooser(
    pointer: CPointer<GtkEmojiChooser>,
) : Popover(pointer.reinterpret()), KGTyped {
    public val gtkEmojiChooserPointer: CPointer<GtkEmojiChooser>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    override val gtkNativePointer: CPointer<GtkNative>
        get() = gPointer.reinterpret()

    override val gtkShortcutManagerPointer: CPointer<GtkShortcutManager>
        get() = gPointer.reinterpret()

    /**
     * Creates a new `GtkEmojiChooser`.
     *
     * @return a new `GtkEmojiChooser`
     */
    public constructor() : this(gtk_emoji_chooser_new()!!.reinterpret())

    /**
     * Emitted when the user selects an Emoji.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `text` the Unicode sequence for the picked
     * Emoji, in UTF-8
     */
    public fun connectEmojiPicked(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (text: String) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "emoji-picked",
            connectEmojiPickedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<EmojiChooser> {
        override val type: GeneratedClassKGType<EmojiChooser> =
            GeneratedClassKGType(gtk_emoji_chooser_get_type()) {
                EmojiChooser(it.reinterpret())
            }

        init {
            GtkTypeProvider.register()
        }
    }
}

private val connectEmojiPickedFunc: CPointer<CFunction<(CPointer<ByteVar>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            text: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(text: String) -> Unit>().get().invoke(
            text?.toKString()
                ?: error("Expected not null string")
        )
    }
        .reinterpret()

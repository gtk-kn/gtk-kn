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
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gsize
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkEntryBuffer
import org.gtkkn.native.gtk.gtk_entry_buffer_delete_text
import org.gtkkn.native.gtk.gtk_entry_buffer_emit_deleted_text
import org.gtkkn.native.gtk.gtk_entry_buffer_emit_inserted_text
import org.gtkkn.native.gtk.gtk_entry_buffer_get_bytes
import org.gtkkn.native.gtk.gtk_entry_buffer_get_length
import org.gtkkn.native.gtk.gtk_entry_buffer_get_max_length
import org.gtkkn.native.gtk.gtk_entry_buffer_get_text
import org.gtkkn.native.gtk.gtk_entry_buffer_get_type
import org.gtkkn.native.gtk.gtk_entry_buffer_insert_text
import org.gtkkn.native.gtk.gtk_entry_buffer_new
import org.gtkkn.native.gtk.gtk_entry_buffer_set_max_length
import org.gtkkn.native.gtk.gtk_entry_buffer_set_text
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * A `GtkEntryBuffer` hold the text displayed in a `GtkText` widget.
 *
 * A single `GtkEntryBuffer` object can be shared by multiple widgets
 * which will then share the same text content, but not the cursor
 * position, visibility attributes, icon etc.
 *
 * `GtkEntryBuffer` may be derived from. Such a derived class might allow
 * text to be stored in an alternate location, such as non-pageable memory,
 * useful in the case of important passwords. Or a derived class could
 * integrate with an application’s concept of undo/redo.
 */
public open class EntryBuffer(pointer: CPointer<GtkEntryBuffer>) :
    Object(pointer.reinterpret()),
    KGTyped {
    public val gtkEntryBufferPointer: CPointer<GtkEntryBuffer>
        get() = gPointer.reinterpret()

    /**
     * The length (in characters) of the text in buffer.
     */
    public open val length: guint
        /**
         * Retrieves the length in characters of the buffer.
         *
         * @return The number of characters in the buffer.
         */
        get() = gtk_entry_buffer_get_length(gtkEntryBufferPointer.reinterpret())

    /**
     * The maximum length (in characters) of the text in the buffer.
     */
    public open var maxLength: gint
        /**
         * Retrieves the maximum allowed length of the text in @buffer.
         *
         * @return the maximum allowed number of characters
         *   in `GtkEntryBuffer`, or 0 if there is no maximum.
         */
        get() = gtk_entry_buffer_get_max_length(gtkEntryBufferPointer.reinterpret())

        /**
         * Sets the maximum allowed length of the contents of the buffer.
         *
         * If the current contents are longer than the given length, then
         * they will be truncated to fit.
         *
         * @param maxLength the maximum length of the entry buffer, or 0 for no maximum.
         *   (other than the maximum length of entries.) The value passed in will
         *   be clamped to the range 0-65536.
         */
        set(maxLength) = gtk_entry_buffer_set_max_length(gtkEntryBufferPointer.reinterpret(), maxLength)

    /**
     * The contents of the buffer.
     */
    public open val text: String
        /**
         * Retrieves the contents of the buffer.
         *
         * The memory pointer returned by this call will not change
         * unless this object emits a signal, or is finalized.
         *
         * @return a pointer to the contents of the widget as a
         *   string. This string points to internally allocated storage
         *   in the buffer and must not be freed, modified or stored.
         */
        get() = gtk_entry_buffer_get_text(gtkEntryBufferPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Create a new `GtkEntryBuffer` object.
     *
     * Optionally, specify initial text to set in the buffer.
     *
     * @param initialChars initial buffer text
     * @param nInitialChars number of characters in @initial_chars, or -1
     * @return A new `GtkEntryBuffer` object.
     */
    public constructor(
        initialChars: String? = null,
        nInitialChars: gint,
    ) : this(gtk_entry_buffer_new(initialChars, nInitialChars)!!.reinterpret())

    /**
     * Deletes a sequence of characters from the buffer.
     *
     * @n_chars characters are deleted starting at @position.
     * If @n_chars is negative, then all characters until the
     * end of the text are deleted.
     *
     * If @position or @n_chars are out of bounds, then they
     * are coerced to sane values.
     *
     * Note that the positions are specified in characters,
     * not bytes.
     *
     * @param position position at which to delete text
     * @param nChars number of characters to delete
     * @return The number of characters deleted.
     */
    public open fun deleteText(position: guint, nChars: gint): guint =
        gtk_entry_buffer_delete_text(gtkEntryBufferPointer.reinterpret(), position, nChars)

    /**
     * Used when subclassing `GtkEntryBuffer`.
     *
     * @param position position at which text was deleted
     * @param nChars number of characters deleted
     */
    public open fun emitDeletedText(position: guint, nChars: guint): Unit =
        gtk_entry_buffer_emit_deleted_text(gtkEntryBufferPointer.reinterpret(), position, nChars)

    /**
     * Used when subclassing `GtkEntryBuffer`.
     *
     * @param position position at which text was inserted
     * @param chars text that was inserted
     * @param nChars number of characters inserted
     */
    public open fun emitInsertedText(position: guint, chars: String, nChars: guint): Unit =
        gtk_entry_buffer_emit_inserted_text(gtkEntryBufferPointer.reinterpret(), position, chars, nChars)

    /**
     * Retrieves the length in bytes of the buffer.
     *
     * See [method@Gtk.EntryBuffer.get_length].
     *
     * @return The byte length of the buffer.
     */
    public open fun getBytes(): gsize = gtk_entry_buffer_get_bytes(gtkEntryBufferPointer.reinterpret())

    /**
     * Inserts @n_chars characters of @chars into the contents of the
     * buffer, at position @position.
     *
     * If @n_chars is negative, then characters from chars will be inserted
     * until a null-terminator is found. If @position or @n_chars are out of
     * bounds, or the maximum buffer text length is exceeded, then they are
     * coerced to sane values.
     *
     * Note that the position and length are in characters, not in bytes.
     *
     * @param position the position at which to insert text.
     * @param chars the text to insert into the buffer.
     * @param nChars the length of the text in characters, or -1
     * @return The number of characters actually inserted.
     */
    public open fun insertText(position: guint, chars: String, nChars: gint): guint =
        gtk_entry_buffer_insert_text(gtkEntryBufferPointer.reinterpret(), position, chars, nChars)

    /**
     * Sets the text in the buffer.
     *
     * This is roughly equivalent to calling
     * [method@Gtk.EntryBuffer.delete_text] and
     * [method@Gtk.EntryBuffer.insert_text].
     *
     * Note that @n_chars is in characters, not in bytes.
     *
     * @param chars the new text
     * @param nChars the number of characters in @text, or -1
     */
    public open fun setText(chars: String, nChars: gint): Unit =
        gtk_entry_buffer_set_text(gtkEntryBufferPointer.reinterpret(), chars, nChars)

    /**
     * The text is altered in the default handler for this signal.
     *
     * If you want access to the text after the text has been modified,
     * use %G_CONNECT_AFTER.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `position` the position the text was deleted at.; `nChars` The number of characters that were deleted.
     */
    public fun connectDeletedText(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (position: guint, nChars: guint) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "deleted-text",
        connectDeletedTextFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * This signal is emitted after text is inserted into the buffer.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `position` the position the text was inserted at.; `chars` The text that was inserted.; `nChars` The number of characters that were inserted.
     */
    public fun connectInsertedText(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            position: guint,
            chars: String,
            nChars: guint,
        ) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "inserted-text",
        connectInsertedTextFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    public companion object : TypeCompanion<EntryBuffer> {
        override val type: GeneratedClassKGType<EntryBuffer> =
            GeneratedClassKGType(gtk_entry_buffer_get_type()) { EntryBuffer(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of EntryBuffer
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_entry_buffer_get_type()
    }
}

private val connectDeletedTextFunc: CPointer<CFunction<(guint, guint) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        position: guint,
        nChars: guint,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(position: guint, nChars: guint) -> Unit>().get().invoke(position, nChars)
}
    .reinterpret()

private val connectInsertedTextFunc: CPointer<
    CFunction<
        (
            guint,
            CPointer<ByteVar>,
            guint,
        ) -> Unit
        >
    > = staticCFunction {
        _: COpaquePointer,
        position: guint,
        chars: CPointer<ByteVar>?,
        nChars: guint,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            position: guint,
            chars: String,
            nChars: guint,
        ) -> Unit
        >().get().invoke(position, chars?.toKString() ?: error("Expected not null string"), nChars)
}
    .reinterpret()

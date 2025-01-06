// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkTextTag
import org.gtkkn.native.gtk.GtkTextTagTable
import org.gtkkn.native.gtk.gtk_text_tag_table_add
import org.gtkkn.native.gtk.gtk_text_tag_table_foreach
import org.gtkkn.native.gtk.gtk_text_tag_table_get_size
import org.gtkkn.native.gtk.gtk_text_tag_table_get_type
import org.gtkkn.native.gtk.gtk_text_tag_table_lookup
import org.gtkkn.native.gtk.gtk_text_tag_table_new
import org.gtkkn.native.gtk.gtk_text_tag_table_remove
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * The collection of tags in a `GtkTextBuffer`
 *
 * You may wish to begin by reading the
 * [text widget conceptual overview](section-text-widget.html),
 * which gives an overview of all the objects and data types
 * related to the text widget and how they work together.
 *
 * # GtkTextTagTables as GtkBuildable
 *
 * The `GtkTextTagTable` implementation of the `GtkBuildable` interface
 * supports adding tags by specifying “tag” as the “type” attribute
 * of a `<child>` element.
 *
 * An example of a UI definition fragment specifying tags:
 * ```xml
 * <object class="GtkTextTagTable">
 *  <child type="tag">
 *    <object class="GtkTextTag"/>
 *  </child>
 * </object>
 * ```
 */
public open class TextTagTable(pointer: CPointer<GtkTextTagTable>) :
    Object(pointer.reinterpret()),
    Buildable,
    KGTyped {
    public val gtkTextTagTablePointer: CPointer<GtkTextTagTable>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    /**
     * Creates a new `GtkTextTagTable`.
     *
     * The table contains no tags by default.
     *
     * @return a new `GtkTextTagTable`
     */
    public constructor() : this(gtk_text_tag_table_new()!!.reinterpret())

    /**
     * Add a tag to the table.
     *
     * The tag is assigned the highest priority in the table.
     *
     * @tag must not be in a tag table already, and may not have
     * the same name as an already-added tag.
     *
     * @param tag a `GtkTextTag`
     * @return true on success.
     */
    public open fun add(tag: TextTag): Boolean =
        gtk_text_tag_table_add(gtkTextTagTablePointer.reinterpret(), tag.gtkTextTagPointer.reinterpret()).asBoolean()

    /**
     * Calls @func on each tag in @table, with user data @data.
     *
     * Note that the table may not be modified while iterating
     * over it (you can’t add/remove tags).
     *
     * @param func a function to call on each tag
     */
    public open fun foreach(func: TextTagTableForeach): Unit = gtk_text_tag_table_foreach(
        gtkTextTagTablePointer.reinterpret(),
        TextTagTableForeachFunc.reinterpret(),
        StableRef.create(func).asCPointer()
    )

    /**
     * Returns the size of the table (number of tags)
     *
     * @return number of tags in @table
     */
    public open fun getSize(): gint = gtk_text_tag_table_get_size(gtkTextTagTablePointer.reinterpret())

    /**
     * Look up a named tag.
     *
     * @param name name of a tag
     * @return The tag
     */
    public open fun lookup(name: String): TextTag? =
        gtk_text_tag_table_lookup(gtkTextTagTablePointer.reinterpret(), name)?.run {
            TextTag(reinterpret())
        }

    /**
     * Remove a tag from the table.
     *
     * If a `GtkTextBuffer` has @table as its tag table, the tag is
     * removed from the buffer. The table’s reference to the tag is
     * removed, so the tag will end up destroyed if you don’t have
     * a reference to it.
     *
     * @param tag a `GtkTextTag`
     */
    public open fun remove(tag: TextTag): Unit =
        gtk_text_tag_table_remove(gtkTextTagTablePointer.reinterpret(), tag.gtkTextTagPointer.reinterpret())

    /**
     * Emitted every time a new tag is added in the `GtkTextTagTable`.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `tag` the added tag.
     */
    public fun connectTagAdded(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (tag: TextTag) -> Unit): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "tag-added",
            connectTagAddedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted every time a tag in the `GtkTextTagTable` changes.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `tag` the changed tag.; `sizeChanged` whether the change affects the `GtkTextView` layout.
     */
    public fun connectTagChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (tag: TextTag, sizeChanged: Boolean) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "tag-changed",
        connectTagChangedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted every time a tag is removed from the `GtkTextTagTable`.
     *
     * The @tag is still valid by the time the signal is emitted, but
     * it is not associated with a tag table any more.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `tag` the removed tag.
     */
    public fun connectTagRemoved(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (tag: TextTag) -> Unit,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "tag-removed",
        connectTagRemovedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    public companion object : TypeCompanion<TextTagTable> {
        override val type: GeneratedClassKGType<TextTagTable> =
            GeneratedClassKGType(gtk_text_tag_table_get_type()) { TextTagTable(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of TextTagTable
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_text_tag_table_get_type()
    }
}

private val connectTagAddedFunc: CPointer<CFunction<(CPointer<GtkTextTag>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            tag: CPointer<GtkTextTag>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(tag: TextTag) -> Unit>().get().invoke(
            tag!!.run {
                TextTag(reinterpret())
            }
        )
    }
        .reinterpret()

private val connectTagChangedFunc: CPointer<CFunction<(CPointer<GtkTextTag>, gboolean) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            tag: CPointer<GtkTextTag>?,
            sizeChanged: gboolean,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(tag: TextTag, sizeChanged: Boolean) -> Unit>().get().invoke(
            tag!!.run {
                TextTag(reinterpret())
            },
            sizeChanged.asBoolean()
        )
    }
        .reinterpret()

private val connectTagRemovedFunc: CPointer<CFunction<(CPointer<GtkTextTag>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            tag: CPointer<GtkTextTag>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(tag: TextTag) -> Unit>().get().invoke(
            tag!!.run {
                TextTag(reinterpret())
            }
        )
    }
        .reinterpret()

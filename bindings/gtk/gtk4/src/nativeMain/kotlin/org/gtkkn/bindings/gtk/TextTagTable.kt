// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
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
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
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
public open class TextTagTable(public val gtkTextTagTablePointer: CPointer<GtkTextTagTable>) :
    Object(gtkTextTagTablePointer.reinterpret()),
    Buildable,
    KGTyped {
    init {
        Gtk
    }

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    /**
     * Creates a new `GtkTextTagTable`.
     *
     * The table contains no tags by default.
     *
     * @return a new `GtkTextTagTable`
     */
    public constructor() : this(gtk_text_tag_table_new()!!) {
        InstanceCache.put(this)
    }

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
        gtk_text_tag_table_add(gtkTextTagTablePointer, tag.gtkTextTagPointer).asBoolean()

    /**
     * Calls @func on each tag in @table, with user data @data.
     *
     * Note that the table may not be modified while iterating
     * over it (you can’t add/remove tags).
     *
     * @param func a function to call on each tag
     */
    public open fun foreach(func: TextTagTableForeach): Unit = gtk_text_tag_table_foreach(
        gtkTextTagTablePointer,
        TextTagTableForeachFunc.reinterpret(),
        StableRef.create(func).asCPointer()
    )

    /**
     * Returns the size of the table (number of tags)
     *
     * @return number of tags in @table
     */
    public open fun getSize(): gint = gtk_text_tag_table_get_size(gtkTextTagTablePointer)

    /**
     * Look up a named tag.
     *
     * @param name name of a tag
     * @return The tag
     */
    public open fun lookup(name: String): TextTag? = gtk_text_tag_table_lookup(gtkTextTagTablePointer, name)?.run {
        InstanceCache.get(this, true) { TextTag(reinterpret()) }!!
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
        gtk_text_tag_table_remove(gtkTextTagTablePointer, tag.gtkTextTagPointer)

    /**
     * Emitted every time a new tag is added in the `GtkTextTagTable`.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `tag` the added tag.
     */
    public fun onTagAdded(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (tag: TextTag) -> Unit): ULong =
        g_signal_connect_data(
            gtkTextTagTablePointer,
            "tag-added",
            onTagAddedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "tag-added" signal. See [onTagAdded].
     *
     * @param tag the added tag.
     */
    public fun emitTagAdded(tag: TextTag) {
        g_signal_emit_by_name(gtkTextTagTablePointer.reinterpret(), "tag-added", tag.gtkTextTagPointer)
    }

    /**
     * Emitted every time a tag in the `GtkTextTagTable` changes.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `tag` the changed tag.; `sizeChanged` whether the change affects the `GtkTextView` layout.
     */
    public fun onTagChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (tag: TextTag, sizeChanged: Boolean) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkTextTagTablePointer,
        "tag-changed",
        onTagChangedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "tag-changed" signal. See [onTagChanged].
     *
     * @param tag the changed tag.
     * @param sizeChanged whether the change affects the `GtkTextView` layout.
     */
    public fun emitTagChanged(tag: TextTag, sizeChanged: Boolean) {
        g_signal_emit_by_name(
            gtkTextTagTablePointer.reinterpret(),
            "tag-changed",
            tag.gtkTextTagPointer,
            sizeChanged.asGBoolean()
        )
    }

    /**
     * Emitted every time a tag is removed from the `GtkTextTagTable`.
     *
     * The @tag is still valid by the time the signal is emitted, but
     * it is not associated with a tag table any more.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `tag` the removed tag.
     */
    public fun onTagRemoved(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (tag: TextTag) -> Unit): ULong =
        g_signal_connect_data(
            gtkTextTagTablePointer,
            "tag-removed",
            onTagRemovedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "tag-removed" signal. See [onTagRemoved].
     *
     * @param tag the removed tag.
     */
    public fun emitTagRemoved(tag: TextTag) {
        g_signal_emit_by_name(gtkTextTagTablePointer.reinterpret(), "tag-removed", tag.gtkTextTagPointer)
    }

    public companion object : TypeCompanion<TextTagTable> {
        override val type: GeneratedClassKGType<TextTagTable> =
            GeneratedClassKGType(getTypeOrNull()!!) { TextTagTable(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of TextTagTable
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_text_tag_table_get_type()

        /**
         * Gets the GType of from the symbol `gtk_text_tag_table_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_text_tag_table_get_type")
    }
}

private val onTagAddedFunc: CPointer<CFunction<(CPointer<GtkTextTag>) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        tag: CPointer<GtkTextTag>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(tag: TextTag) -> Unit>().get().invoke(
        tag!!.run {
            InstanceCache.get(this, false) { TextTag(reinterpret()) }!!
        }
    )
}
    .reinterpret()

private val onTagChangedFunc: CPointer<CFunction<(CPointer<GtkTextTag>, gboolean) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            tag: CPointer<GtkTextTag>?,
            sizeChanged: gboolean,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(tag: TextTag, sizeChanged: Boolean) -> Unit>().get().invoke(
            tag!!.run {
                InstanceCache.get(this, false) { TextTag(reinterpret()) }!!
            },
            sizeChanged.asBoolean()
        )
    }
        .reinterpret()

private val onTagRemovedFunc: CPointer<CFunction<(CPointer<GtkTextTag>) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            tag: CPointer<GtkTextTag>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(tag: TextTag) -> Unit>().get().invoke(
            tag!!.run {
                InstanceCache.get(this, false) { TextTag(reinterpret()) }!!
            }
        )
    }
        .reinterpret()

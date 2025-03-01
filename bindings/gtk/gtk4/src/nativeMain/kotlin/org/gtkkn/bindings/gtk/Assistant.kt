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
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.ListModel
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.ext.asBoolean
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
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkAssistant
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkNative
import org.gtkkn.native.gtk.GtkRoot
import org.gtkkn.native.gtk.GtkShortcutManager
import org.gtkkn.native.gtk.GtkWidget
import org.gtkkn.native.gtk.gtk_assistant_add_action_widget
import org.gtkkn.native.gtk.gtk_assistant_append_page
import org.gtkkn.native.gtk.gtk_assistant_commit
import org.gtkkn.native.gtk.gtk_assistant_get_current_page
import org.gtkkn.native.gtk.gtk_assistant_get_n_pages
import org.gtkkn.native.gtk.gtk_assistant_get_nth_page
import org.gtkkn.native.gtk.gtk_assistant_get_page
import org.gtkkn.native.gtk.gtk_assistant_get_page_complete
import org.gtkkn.native.gtk.gtk_assistant_get_page_title
import org.gtkkn.native.gtk.gtk_assistant_get_page_type
import org.gtkkn.native.gtk.gtk_assistant_get_pages
import org.gtkkn.native.gtk.gtk_assistant_get_type
import org.gtkkn.native.gtk.gtk_assistant_insert_page
import org.gtkkn.native.gtk.gtk_assistant_new
import org.gtkkn.native.gtk.gtk_assistant_next_page
import org.gtkkn.native.gtk.gtk_assistant_prepend_page
import org.gtkkn.native.gtk.gtk_assistant_previous_page
import org.gtkkn.native.gtk.gtk_assistant_remove_action_widget
import org.gtkkn.native.gtk.gtk_assistant_remove_page
import org.gtkkn.native.gtk.gtk_assistant_set_current_page
import org.gtkkn.native.gtk.gtk_assistant_set_forward_page_func
import org.gtkkn.native.gtk.gtk_assistant_set_page_complete
import org.gtkkn.native.gtk.gtk_assistant_set_page_title
import org.gtkkn.native.gtk.gtk_assistant_set_page_type
import org.gtkkn.native.gtk.gtk_assistant_update_buttons_state
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * # ⚠️ Deprecated ⚠️
 *
 * This is deprecated since version 4.10.
 *
 * This widget will be removed in GTK 5
 * ---
 *
 * `GtkAssistant` is used to represent a complex as a series of steps.
 *
 * ![An example GtkAssistant](assistant.png)
 *
 * Each step consists of one or more pages. `GtkAssistant` guides the user
 * through the pages, and controls the page flow to collect the data needed
 * for the operation.
 *
 * `GtkAssistant` handles which buttons to show and to make sensitive based
 * on page sequence knowledge and the [enum@Gtk.AssistantPageType] of each
 * page in addition to state information like the *completed* and *committed*
 * page statuses.
 *
 * If you have a case that doesn’t quite fit in `GtkAssistant`s way of
 * handling buttons, you can use the %GTK_ASSISTANT_PAGE_CUSTOM page
 * type and handle buttons yourself.
 *
 * `GtkAssistant` maintains a `GtkAssistantPage` object for each added
 * child, which holds additional per-child properties. You
 * obtain the `GtkAssistantPage` for a child with [method@Gtk.Assistant.get_page].
 *
 * # GtkAssistant as GtkBuildable
 *
 * The `GtkAssistant` implementation of the `GtkBuildable` interface
 * exposes the @action_area as internal children with the name
 * “action_area”.
 *
 * To add pages to an assistant in `GtkBuilder`, simply add it as a
 * child to the `GtkAssistant` object. If you need to set per-object
 * properties, create a `GtkAssistantPage` object explicitly, and
 * set the child widget as a property on it.
 *
 * # CSS nodes
 *
 * `GtkAssistant` has a single CSS node with the name window and style
 * class .assistant.
 *
 * ## Skipped during bindings generation
 *
 * - method `use-header-bar`: Property has no getter nor setter
 */
public open class Assistant(public val gtkAssistantPointer: CPointer<GtkAssistant>) :
    Window(gtkAssistantPointer.reinterpret()),
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

    override val gtkRootPointer: CPointer<GtkRoot>
        get() = handle.reinterpret()

    override val gtkShortcutManagerPointer: CPointer<GtkShortcutManager>
        get() = handle.reinterpret()

    /**
     * `GListModel` containing the pages.
     */
    public open val pages: ListModel
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         *
         * This widget will be removed in GTK 5
         * ---
         *
         * Gets a list model of the assistant pages.
         *
         * @return A list model of the pages.
         */
        get() = gtk_assistant_get_pages(gtkAssistantPointer)!!.run {
            ListModel.ListModelImpl(reinterpret())
        }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Creates a new `GtkAssistant`.
     *
     * @return a newly created `GtkAssistant`
     */
    public constructor() : this(gtk_assistant_new()!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Adds a widget to the action area of a `GtkAssistant`.
     *
     * @param child a `GtkWidget`
     */
    public open fun addActionWidget(child: Widget): Unit =
        gtk_assistant_add_action_widget(gtkAssistantPointer, child.gtkWidgetPointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Appends a page to the @assistant.
     *
     * @param page a `GtkWidget`
     * @return the index (starting at 0) of the inserted page
     */
    public open fun appendPage(page: Widget): gint =
        gtk_assistant_append_page(gtkAssistantPointer, page.gtkWidgetPointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Erases the visited page history.
     *
     * GTK will then hide the back button on the current page,
     * and removes the cancel button from subsequent pages.
     *
     * Use this when the information provided up to the current
     * page is hereafter deemed permanent and cannot be modified
     * or undone. For example, showing a progress page to track
     * a long-running, unreversible operation after the user has
     * clicked apply on a confirmation page.
     */
    public open fun commit(): Unit = gtk_assistant_commit(gtkAssistantPointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Returns the page number of the current page.
     *
     * @return The index (starting from 0) of the current
     *   page in the @assistant, or -1 if the @assistant has no pages,
     *   or no current page
     */
    public open fun getCurrentPage(): gint = gtk_assistant_get_current_page(gtkAssistantPointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Returns the number of pages in the @assistant
     *
     * @return the number of pages in the @assistant
     */
    public open fun getNPages(): gint = gtk_assistant_get_n_pages(gtkAssistantPointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Returns the child widget contained in page number @page_num.
     *
     * @param pageNum the index of a page in the @assistant,
     *   or -1 to get the last page
     * @return the child widget, or null
     *   if @page_num is out of bounds
     */
    public open fun getNthPage(pageNum: gint): Widget? = gtk_assistant_get_nth_page(gtkAssistantPointer, pageNum)?.run {
        InstanceCache.get(this, true) { Widget.WidgetImpl(reinterpret()) }!!
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Returns the `GtkAssistantPage` object for @child.
     *
     * @param child a child of @assistant
     * @return the `GtkAssistantPage` for @child
     */
    public open fun getPage(child: Widget): AssistantPage =
        gtk_assistant_get_page(gtkAssistantPointer, child.gtkWidgetPointer)!!.run {
            InstanceCache.get(this, true) { AssistantPage(reinterpret()) }!!
        }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Gets whether @page is complete.
     *
     * @param page a page of @assistant
     * @return true if @page is complete.
     */
    public open fun getPageComplete(page: Widget): Boolean =
        gtk_assistant_get_page_complete(gtkAssistantPointer, page.gtkWidgetPointer).asBoolean()

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Gets the title for @page.
     *
     * @param page a page of @assistant
     * @return the title for @page
     */
    public open fun getPageTitle(page: Widget): String =
        gtk_assistant_get_page_title(gtkAssistantPointer, page.gtkWidgetPointer)?.toKString()
            ?: error("Expected not null string")

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Gets the page type of @page.
     *
     * @param page a page of @assistant
     * @return the page type of @page
     */
    public open fun getPageType(page: Widget): AssistantPageType =
        gtk_assistant_get_page_type(gtkAssistantPointer, page.gtkWidgetPointer).run {
            AssistantPageType.fromNativeValue(this)
        }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Inserts a page in the @assistant at a given position.
     *
     * @param page a `GtkWidget`
     * @param position the index (starting at 0) at which to insert the page,
     *   or -1 to append the page to the @assistant
     * @return the index (starting from 0) of the inserted page
     */
    public open fun insertPage(page: Widget, position: gint): gint =
        gtk_assistant_insert_page(gtkAssistantPointer, page.gtkWidgetPointer, position)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Navigate to the next page.
     *
     * It is a programming error to call this function when
     * there is no next page.
     *
     * This function is for use when creating pages of the
     * %GTK_ASSISTANT_PAGE_CUSTOM type.
     */
    public open fun nextPage(): Unit = gtk_assistant_next_page(gtkAssistantPointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Prepends a page to the @assistant.
     *
     * @param page a `GtkWidget`
     * @return the index (starting at 0) of the inserted page
     */
    public open fun prependPage(page: Widget): gint =
        gtk_assistant_prepend_page(gtkAssistantPointer, page.gtkWidgetPointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Navigate to the previous visited page.
     *
     * It is a programming error to call this function when
     * no previous page is available.
     *
     * This function is for use when creating pages of the
     * %GTK_ASSISTANT_PAGE_CUSTOM type.
     */
    public open fun previousPage(): Unit = gtk_assistant_previous_page(gtkAssistantPointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Removes a widget from the action area of a `GtkAssistant`.
     *
     * @param child a `GtkWidget`
     */
    public open fun removeActionWidget(child: Widget): Unit =
        gtk_assistant_remove_action_widget(gtkAssistantPointer, child.gtkWidgetPointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Removes the @page_num’s page from @assistant.
     *
     * @param pageNum the index of a page in the @assistant,
     *   or -1 to remove the last page
     */
    public open fun removePage(pageNum: gint): Unit = gtk_assistant_remove_page(gtkAssistantPointer, pageNum)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Switches the page to @page_num.
     *
     * Note that this will only be necessary in custom buttons,
     * as the @assistant flow can be set with
     * gtk_assistant_set_forward_page_func().
     *
     * @param pageNum index of the page to switch to, starting from 0.
     *   If negative, the last page will be used. If greater
     *   than the number of pages in the @assistant, nothing
     *   will be done.
     */
    public open fun setCurrentPage(pageNum: gint): Unit = gtk_assistant_set_current_page(gtkAssistantPointer, pageNum)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Sets the page forwarding function to be @page_func.
     *
     * This function will be used to determine what will be
     * the next page when the user presses the forward button.
     * Setting @page_func to null will make the assistant to
     * use the default forward function, which just goes to the
     * next visible page.
     *
     * @param pageFunc the `GtkAssistantPageFunc`, or null
     *   to use the default one
     */
    public open fun setForwardPageFunc(pageFunc: AssistantPageFunc?): Unit = gtk_assistant_set_forward_page_func(
        gtkAssistantPointer,
        pageFunc?.let {
            AssistantPageFuncFunc.reinterpret()
        },
        pageFunc?.let {
            StableRef.create(pageFunc).asCPointer()
        },
        pageFunc?.let { staticStableRefDestroy.reinterpret() }
    )

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Sets whether @page contents are complete.
     *
     * This will make @assistant update the buttons state
     * to be able to continue the task.
     *
     * @param page a page of @assistant
     * @param complete the completeness status of the page
     */
    public open fun setPageComplete(page: Widget, complete: Boolean): Unit =
        gtk_assistant_set_page_complete(gtkAssistantPointer, page.gtkWidgetPointer, complete.asGBoolean())

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Sets a title for @page.
     *
     * The title is displayed in the header area of the assistant
     * when @page is the current page.
     *
     * @param page a page of @assistant
     * @param title the new title for @page
     */
    public open fun setPageTitle(page: Widget, title: String): Unit =
        gtk_assistant_set_page_title(gtkAssistantPointer, page.gtkWidgetPointer, title)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Sets the page type for @page.
     *
     * The page type determines the page behavior in the @assistant.
     *
     * @param page a page of @assistant
     * @param type the new type for @page
     */
    public open fun setPageType(page: Widget, type: AssistantPageType): Unit =
        gtk_assistant_set_page_type(gtkAssistantPointer, page.gtkWidgetPointer, type.nativeValue)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Forces @assistant to recompute the buttons state.
     *
     * GTK automatically takes care of this in most situations,
     * e.g. when the user goes to a different page, or when the
     * visibility or completeness of a page changes.
     *
     * One situation where it can be necessary to call this
     * function is when changing a value on the current page
     * affects the future page flow of the assistant.
     */
    public open fun updateButtonsState(): Unit = gtk_assistant_update_buttons_state(gtkAssistantPointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Emitted when the apply button is clicked.
     *
     * The default behavior of the `GtkAssistant` is to switch to the page
     * after the current page, unless the current page is the last one.
     *
     * A handler for the ::apply signal should carry out the actions for
     * which the wizard has collected data. If the action takes a long time
     * to complete, you might consider putting a page of type
     * %GTK_ASSISTANT_PAGE_PROGRESS after the confirmation page and handle
     * this operation within the [signal@Gtk.Assistant::prepare] signal of
     * the progress page.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onApply(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkAssistantPointer,
            "apply",
            onApplyFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Emits the "apply" signal. See [onApply].
     */
    public fun emitApply() {
        g_signal_emit_by_name(gtkAssistantPointer.reinterpret(), "apply")
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Emitted when then the cancel button is clicked.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onCancel(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkAssistantPointer,
            "cancel",
            onCancelFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Emits the "cancel" signal. See [onCancel].
     */
    public fun emitCancel() {
        g_signal_emit_by_name(gtkAssistantPointer.reinterpret(), "cancel")
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Emitted either when the close button of a summary page is clicked,
     * or when the apply button in the last page in the flow (of type
     * %GTK_ASSISTANT_PAGE_CONFIRM) is clicked.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onClose(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkAssistantPointer,
            "close",
            onCloseFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Emits the "close" signal. See [onClose].
     */
    public fun emitClose() {
        g_signal_emit_by_name(gtkAssistantPointer.reinterpret(), "close")
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * The action signal for the Escape binding.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onEscape(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkAssistantPointer,
            "escape",
            onEscapeFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Emits the "escape" signal. See [onEscape].
     */
    public fun emitEscape() {
        g_signal_emit_by_name(gtkAssistantPointer.reinterpret(), "escape")
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Emitted when a new page is set as the assistant's current page,
     * before making the new page visible.
     *
     * A handler for this signal can do any preparations which are
     * necessary before showing @page.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `page` the current page
     */
    public fun onPrepare(connectFlags: ConnectFlags = ConnectFlags(0u), handler: (page: Widget) -> Unit): ULong =
        g_signal_connect_data(
            gtkAssistantPointer,
            "prepare",
            onPrepareFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Emits the "prepare" signal. See [onPrepare].
     *
     * @param page the current page
     */
    public fun emitPrepare(page: Widget) {
        g_signal_emit_by_name(gtkAssistantPointer.reinterpret(), "prepare", page.gtkWidgetPointer)
    }

    public companion object : TypeCompanion<Assistant> {
        override val type: GeneratedClassKGType<Assistant> =
            GeneratedClassKGType(getTypeOrNull()!!) { Assistant(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of Assistant
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_assistant_get_type()

        /**
         * Gets the GType of from the symbol `gtk_assistant_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_assistant_get_type")
    }
}

private val onApplyFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onCancelFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onCloseFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onEscapeFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onPrepareFunc: CPointer<CFunction<(CPointer<GtkWidget>) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        page: CPointer<GtkWidget>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(page: Widget) -> Unit>().get().invoke(
        page!!.run {
            InstanceCache.get(this, false) { Widget.WidgetImpl(reinterpret()) }!!
        }
    )
}
    .reinterpret()

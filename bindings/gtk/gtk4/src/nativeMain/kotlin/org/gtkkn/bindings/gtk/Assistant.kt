// This is a generated file. Do not modify.
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
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
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
public open class Assistant(pointer: CPointer<GtkAssistant>) :
    Window(pointer.reinterpret()),
    KGTyped {
    public val gtkAssistantPointer: CPointer<GtkAssistant>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    override val gtkNativePointer: CPointer<GtkNative>
        get() = gPointer.reinterpret()

    override val gtkRootPointer: CPointer<GtkRoot>
        get() = gPointer.reinterpret()

    override val gtkShortcutManagerPointer: CPointer<GtkShortcutManager>
        get() = gPointer.reinterpret()

    /**
     * `GListModel` containing the pages.
     */
    public open val pages: ListModel
        /**
         * Gets a list model of the assistant pages.
         *
         * @return A list model of the pages.
         */
        get() = gtk_assistant_get_pages(gtkAssistantPointer)!!.run {
            ListModel.wrap(reinterpret())
        }

    /**
     * Creates a new `GtkAssistant`.
     *
     * @return a newly created `GtkAssistant`
     */
    public constructor() : this(gtk_assistant_new()!!.reinterpret())

    /**
     * Adds a widget to the action area of a `GtkAssistant`.
     *
     * @param child a `GtkWidget`
     */
    public open fun addActionWidget(child: Widget): Unit =
        gtk_assistant_add_action_widget(gtkAssistantPointer, child.gtkWidgetPointer)

    /**
     * Appends a page to the @assistant.
     *
     * @param page a `GtkWidget`
     * @return the index (starting at 0) of the inserted page
     */
    public open fun appendPage(page: Widget): gint =
        gtk_assistant_append_page(gtkAssistantPointer, page.gtkWidgetPointer)

    /**
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
     * Returns the page number of the current page.
     *
     * @return The index (starting from 0) of the current
     *   page in the @assistant, or -1 if the @assistant has no pages,
     *   or no current page
     */
    public open fun getCurrentPage(): gint = gtk_assistant_get_current_page(gtkAssistantPointer)

    /**
     * Returns the number of pages in the @assistant
     *
     * @return the number of pages in the @assistant
     */
    public open fun getNPages(): gint = gtk_assistant_get_n_pages(gtkAssistantPointer)

    /**
     * Returns the child widget contained in page number @page_num.
     *
     * @param pageNum the index of a page in the @assistant,
     *   or -1 to get the last page
     * @return the child widget, or null
     *   if @page_num is out of bounds
     */
    public open fun getNthPage(pageNum: gint): Widget? = gtk_assistant_get_nth_page(gtkAssistantPointer, pageNum)?.run {
        Widget(this)
    }

    /**
     * Returns the `GtkAssistantPage` object for @child.
     *
     * @param child a child of @assistant
     * @return the `GtkAssistantPage` for @child
     */
    public open fun getPage(child: Widget): AssistantPage =
        gtk_assistant_get_page(gtkAssistantPointer, child.gtkWidgetPointer)!!.run {
            AssistantPage(this)
        }

    /**
     * Gets whether @page is complete.
     *
     * @param page a page of @assistant
     * @return true if @page is complete.
     */
    public open fun getPageComplete(page: Widget): Boolean =
        gtk_assistant_get_page_complete(gtkAssistantPointer, page.gtkWidgetPointer).asBoolean()

    /**
     * Gets the title for @page.
     *
     * @param page a page of @assistant
     * @return the title for @page
     */
    public open fun getPageTitle(page: Widget): String =
        gtk_assistant_get_page_title(gtkAssistantPointer, page.gtkWidgetPointer)?.toKString()
            ?: error("Expected not null string")

    /**
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
     * Prepends a page to the @assistant.
     *
     * @param page a `GtkWidget`
     * @return the index (starting at 0) of the inserted page
     */
    public open fun prependPage(page: Widget): gint =
        gtk_assistant_prepend_page(gtkAssistantPointer, page.gtkWidgetPointer)

    /**
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
     * Removes a widget from the action area of a `GtkAssistant`.
     *
     * @param child a `GtkWidget`
     */
    public open fun removeActionWidget(child: Widget): Unit =
        gtk_assistant_remove_action_widget(gtkAssistantPointer, child.gtkWidgetPointer)

    /**
     * Removes the @page_num’s page from @assistant.
     *
     * @param pageNum the index of a page in the @assistant,
     *   or -1 to remove the last page
     */
    public open fun removePage(pageNum: gint): Unit = gtk_assistant_remove_page(gtkAssistantPointer, pageNum)

    /**
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
            gPointer,
            "apply",
            onApplyFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "apply" signal. See [onApply].
     */
    public fun emitApply() {
        g_signal_emit_by_name(gPointer.reinterpret(), "apply")
    }

    /**
     * Emitted when then the cancel button is clicked.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onCancel(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer,
            "cancel",
            onCancelFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "cancel" signal. See [onCancel].
     */
    public fun emitCancel() {
        g_signal_emit_by_name(gPointer.reinterpret(), "cancel")
    }

    /**
     * Emitted either when the close button of a summary page is clicked,
     * or when the apply button in the last page in the flow (of type
     * %GTK_ASSISTANT_PAGE_CONFIRM) is clicked.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onClose(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer,
            "close",
            onCloseFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "close" signal. See [onClose].
     */
    public fun emitClose() {
        g_signal_emit_by_name(gPointer.reinterpret(), "close")
    }

    /**
     * The action signal for the Escape binding.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onEscape(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gPointer,
            "escape",
            onEscapeFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "escape" signal. See [onEscape].
     */
    public fun emitEscape() {
        g_signal_emit_by_name(gPointer.reinterpret(), "escape")
    }

    /**
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
            gPointer,
            "prepare",
            onPrepareFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "prepare" signal. See [onPrepare].
     *
     * @param page the current page
     */
    public fun emitPrepare(page: Widget) {
        g_signal_emit_by_name(gPointer.reinterpret(), "prepare", page.gtkWidgetPointer)
    }

    public companion object : TypeCompanion<Assistant> {
        override val type: GeneratedClassKGType<Assistant> =
            GeneratedClassKGType(gtk_assistant_get_type()) { Assistant(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of Assistant
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_assistant_get_type()
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
            Widget(this)
        }
    )
}
    .reinterpret()

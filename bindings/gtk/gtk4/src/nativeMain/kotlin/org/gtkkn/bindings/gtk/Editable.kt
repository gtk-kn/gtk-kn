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
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gobject.ParamSpec
import org.gtkkn.bindings.gobject.Value
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_10
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkEditable
import org.gtkkn.native.gtk.gtk_editable_delegate_get_accessible_platform_state
import org.gtkkn.native.gtk.gtk_editable_delegate_get_property
import org.gtkkn.native.gtk.gtk_editable_delegate_set_property
import org.gtkkn.native.gtk.gtk_editable_delete_selection
import org.gtkkn.native.gtk.gtk_editable_delete_text
import org.gtkkn.native.gtk.gtk_editable_finish_delegate
import org.gtkkn.native.gtk.gtk_editable_get_alignment
import org.gtkkn.native.gtk.gtk_editable_get_chars
import org.gtkkn.native.gtk.gtk_editable_get_delegate
import org.gtkkn.native.gtk.gtk_editable_get_editable
import org.gtkkn.native.gtk.gtk_editable_get_enable_undo
import org.gtkkn.native.gtk.gtk_editable_get_max_width_chars
import org.gtkkn.native.gtk.gtk_editable_get_position
import org.gtkkn.native.gtk.gtk_editable_get_text
import org.gtkkn.native.gtk.gtk_editable_get_type
import org.gtkkn.native.gtk.gtk_editable_get_width_chars
import org.gtkkn.native.gtk.gtk_editable_init_delegate
import org.gtkkn.native.gtk.gtk_editable_select_region
import org.gtkkn.native.gtk.gtk_editable_set_alignment
import org.gtkkn.native.gtk.gtk_editable_set_editable
import org.gtkkn.native.gtk.gtk_editable_set_enable_undo
import org.gtkkn.native.gtk.gtk_editable_set_max_width_chars
import org.gtkkn.native.gtk.gtk_editable_set_position
import org.gtkkn.native.gtk.gtk_editable_set_text
import org.gtkkn.native.gtk.gtk_editable_set_width_chars
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.UInt
import kotlin.ULong
import kotlin.Unit

/**
 * `GtkEditable` is an interface for text editing widgets.
 *
 * Typical examples of editable widgets are [class@Gtk.Entry] and
 * [class@Gtk.SpinButton]. It contains functions for generically manipulating
 * an editable widget, a large number of action signals used for key bindings,
 * and several signals that an application can connect to modify the behavior
 * of a widget.
 *
 * As an example of the latter usage, by connecting the following handler to
 * [signal@Gtk.Editable::insert-text], an application can convert all entry
 * into a widget into uppercase.
 *
 * ## Forcing entry to uppercase.
 *
 * ```c
 * #include <ctype.h>
 *
 * void
 * insert_text_handler (GtkEditable *editable,
 *                      const char  *text,
 *                      int          length,
 *                      int         *position,
 *                      gpointer     data)
 * {
 *   char *result = g_utf8_strup (text, length);
 *
 *   g_signal_handlers_block_by_func (editable,
 *                                (gpointer) insert_text_handler, data);
 *   gtk_editable_insert_text (editable, result, length, position);
 *   g_signal_handlers_unblock_by_func (editable,
 *                                      (gpointer) insert_text_handler, data);
 *
 *   g_signal_stop_emission_by_name (editable, "insert_text");
 *
 *   g_free (result);
 * }
 * ```
 *
 * ## Implementing GtkEditable
 *
 * The most likely scenario for implementing `GtkEditable` on your own widget
 * is that you will embed a `GtkText` inside a complex widget, and want to
 * delegate the editable functionality to that text widget. `GtkEditable`
 * provides some utility functions to make this easy.
 *
 * In your class_init function, call [func@Gtk.Editable.install_properties],
 * passing the first available property ID:
 *
 * ```c
 * static void
 * my_class_init (MyClass *class)
 * {
 *   ...
 *   g_object_class_install_properties (object_class, NUM_PROPERTIES, props);
 *   gtk_editable_install_properties (object_clas, NUM_PROPERTIES);
 *   ...
 * }
 * ```
 *
 * In your interface_init function for the `GtkEditable` interface, provide
 * an implementation for the get_delegate vfunc that returns your text widget:
 *
 * ```c
 * GtkEditable *
 * get_editable_delegate (GtkEditable *editable)
 * {
 *   return GTK_EDITABLE (MY_WIDGET (editable)->text_widget);
 * }
 *
 * static void
 * my_editable_init (GtkEditableInterface *iface)
 * {
 *   iface->get_delegate = get_editable_delegate;
 * }
 * ```
 *
 * You don't need to provide any other vfuncs. The default implementations
 * work by forwarding to the delegate that the GtkEditableInterface.get_delegate()
 * vfunc returns.
 *
 * In your instance_init function, create your text widget, and then call
 * [method@Gtk.Editable.init_delegate]:
 *
 * ```c
 * static void
 * my_widget_init (MyWidget *self)
 * {
 *   ...
 *   self->text_widget = gtk_text_new ();
 *   gtk_editable_init_delegate (GTK_EDITABLE (self));
 *   ...
 * }
 * ```
 *
 * In your dispose function, call [method@Gtk.Editable.finish_delegate] before
 * destroying your text widget:
 *
 * ```c
 * static void
 * my_widget_dispose (GObject *object)
 * {
 *   ...
 *   gtk_editable_finish_delegate (GTK_EDITABLE (self));
 *   g_clear_pointer (&self->text_widget, gtk_widget_unparent);
 *   ...
 * }
 * ```
 *
 * Finally, use [func@Gtk.Editable.delegate_set_property] in your `set_property`
 * function (and similar for `get_property`), to set the editable properties:
 *
 * ```c
 *   ...
 *   if (gtk_editable_delegate_set_property (object, prop_id, value, pspec))
 *     return;
 *
 *   switch (prop_id)
 *   ...
 * ```
 *
 * It is important to note that if you create a `GtkEditable` that uses
 * a delegate, the low level [signal@Gtk.Editable::insert-text] and
 * [signal@Gtk.Editable::delete-text] signals will be propagated from the
 * "wrapper" editable to the delegate, but they will not be propagated from
 * the delegate to the "wrapper" editable, as they would cause an infinite
 * recursion. If you wish to connect to the [signal@Gtk.Editable::insert-text]
 * and [signal@Gtk.Editable::delete-text] signals, you will need to connect
 * to them on the delegate obtained via [method@Gtk.Editable.get_delegate].
 *
 * ## Skipped during bindings generation
 *
 * - parameter `start_pos`: start_pos: Out parameter is not supported
 * - method `insert_text`: In/Out parameter is not supported
 * - method `cursor-position`: Property has no getter nor setter
 * - method `selection-bound`: Property has no getter nor setter
 * - method `xalign`: Property has no getter nor setter
 * - signal `insert-text`: Unsupported parameter `position` : position: In/Out parameter is not supported
 * - function `install_properties`: C function gtk_editable_install_properties is ignored
 */
public interface Editable :
    Interface,
    KGTyped {
    public val gtkEditablePointer: CPointer<GtkEditable>

    /**
     * Whether the entry contents can be edited.
     */
    public var editable: Boolean
        /**
         * Retrieves whether @editable is editable.
         *
         * @return true if @editable is editable.
         */
        get() = gtk_editable_get_editable(gtkEditablePointer.reinterpret()).asBoolean()

        /**
         * Determines if the user can edit the text in the editable widget.
         *
         * @param isEditable true if the user is allowed to edit the text
         *   in the widget
         */
        set(isEditable) = gtk_editable_set_editable(gtkEditablePointer.reinterpret(), isEditable.asGBoolean())

    /**
     * If undo/redo should be enabled for the editable.
     */
    public var enableUndo: Boolean
        /**
         * Gets if undo/redo actions are enabled for @editable
         *
         * @return true if undo is enabled
         */
        get() = gtk_editable_get_enable_undo(gtkEditablePointer.reinterpret()).asBoolean()

        /**
         * If enabled, changes to @editable will be saved for undo/redo
         * actions.
         *
         * This results in an additional copy of text changes and are not
         * stored in secure memory. As such, undo is forcefully disabled
         * when [property@Gtk.Text:visibility] is set to false.
         *
         * @param enableUndo if undo/redo should be enabled
         */
        set(enableUndo) = gtk_editable_set_enable_undo(gtkEditablePointer.reinterpret(), enableUndo.asGBoolean())

    /**
     * The desired maximum width of the entry, in characters.
     */
    public var maxWidthChars: Int
        /**
         * Retrieves the desired maximum width of @editable, in characters.
         *
         * @return the maximum width of the entry, in characters
         */
        get() = gtk_editable_get_max_width_chars(gtkEditablePointer.reinterpret())

        /**
         * Sets the desired maximum width in characters of @editable.
         *
         * @param nChars the new desired maximum width, in characters
         */
        set(nChars) = gtk_editable_set_max_width_chars(gtkEditablePointer.reinterpret(), nChars)

    /**
     * The contents of the entry.
     */
    public var text: String
        /**
         * Retrieves the contents of @editable.
         *
         * The returned string is owned by GTK and must not be modified or freed.
         *
         * @return a pointer to the contents of the editable
         */
        get() =
            gtk_editable_get_text(gtkEditablePointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

        /**
         * Sets the text in the editable to the given value.
         *
         * This is replacing the current contents.
         *
         * @param text the text to set
         */
        set(text) = gtk_editable_set_text(gtkEditablePointer.reinterpret(), text)

    /**
     * Number of characters to leave space for in the entry.
     */
    public var widthChars: Int
        /**
         * Gets the number of characters of space reserved
         * for the contents of the editable.
         *
         * @return number of chars to request space for, or negative if unset
         */
        get() = gtk_editable_get_width_chars(gtkEditablePointer.reinterpret())

        /**
         * Changes the size request of the editable to be about the
         * right size for @n_chars characters.
         *
         * Note that it changes the size request, the size can still
         * be affected by how you pack the widget into containers.
         * If @n_chars is -1, the size reverts to the default size.
         *
         * @param nChars width in chars
         */
        set(nChars) = gtk_editable_set_width_chars(gtkEditablePointer.reinterpret(), nChars)

    /**
     * Retrieves the accessible platform state from the editable delegate.
     *
     * This is an helper function to retrieve the accessible state for
     * `GtkEditable` interface implementations using a delegate pattern.
     *
     * You should call this function in your editable widget implementation
     * of the [vfunc@Gtk.Accessible.get_platform_state] virtual function, for
     * instance:
     *
     * ```c
     * static void
     * accessible_interface_init (GtkAccessibleInterface *iface)
     * {
     *   iface->get_platform_state = your_editable_get_accessible_platform_state;
     * }
     *
     * static gboolean
     * your_editable_get_accessible_platform_state (GtkAccessible *accessible,
     *                                              GtkAccessiblePlatformState state)
     * {
     *   return gtk_editable_delegate_get_accessible_platform_state (GTK_EDITABLE (accessible), state);
     * }
     * ```
     *
     * @param state what kind of accessible state to retrieve
     * @since 4.10
     */
    @GtkVersion4_10
    public fun delegateGetAccessiblePlatformState(state: AccessiblePlatformState): Boolean =
        gtk_editable_delegate_get_accessible_platform_state(
            gtkEditablePointer.reinterpret(),
            state.nativeValue
        ).asBoolean()

    /**
     * Deletes the currently selected text of the editable.
     *
     * This call doesn’t do anything if there is no selected text.
     */
    public fun deleteSelection(): Unit = gtk_editable_delete_selection(gtkEditablePointer.reinterpret())

    /**
     * Deletes a sequence of characters.
     *
     * The characters that are deleted are those characters at positions
     * from @start_pos up to, but not including @end_pos. If @end_pos is
     * negative, then the characters deleted are those from @start_pos to
     * the end of the text.
     *
     * Note that the positions are specified in characters, not bytes.
     *
     * @param startPos start position
     * @param endPos end position
     */
    public fun deleteText(
        startPos: Int,
        endPos: Int,
    ): Unit = gtk_editable_delete_text(gtkEditablePointer.reinterpret(), startPos, endPos)

    /**
     * Undoes the setup done by [method@Gtk.Editable.init_delegate].
     *
     * This is a helper function that should be called from dispose,
     * before removing the delegate object.
     */
    public fun finishDelegate(): Unit = gtk_editable_finish_delegate(gtkEditablePointer.reinterpret())

    /**
     * Gets the alignment of the editable.
     *
     * @return the alignment
     */
    public fun getAlignment(): Float = gtk_editable_get_alignment(gtkEditablePointer.reinterpret())

    /**
     * Retrieves a sequence of characters.
     *
     * The characters that are retrieved are those characters at positions
     * from @start_pos up to, but not including @end_pos. If @end_pos is negative,
     * then the characters retrieved are those characters from @start_pos to
     * the end of the text.
     *
     * Note that positions are specified in characters, not bytes.
     *
     * @param startPos start of text
     * @param endPos end of text
     * @return a pointer to the contents of the widget as a
     *   string. This string is allocated by the `GtkEditable` implementation
     *   and should be freed by the caller.
     */
    public fun getChars(
        startPos: Int,
        endPos: Int,
    ): String =
        gtk_editable_get_chars(gtkEditablePointer.reinterpret(), startPos, endPos)?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the `GtkEditable` that @editable is delegating its
     * implementation to.
     *
     * Typically, the delegate is a [class@Gtk.Text] widget.
     *
     * @return the delegate `GtkEditable`
     */
    public fun getDelegate(): Editable? =
        gtk_editable_get_delegate(gtkEditablePointer.reinterpret())?.run {
            Editable.wrap(reinterpret())
        }

    /**
     * Retrieves whether @editable is editable.
     *
     * @return true if @editable is editable.
     */
    public fun getEditable(): Boolean = gtk_editable_get_editable(gtkEditablePointer.reinterpret()).asBoolean()

    /**
     * Gets if undo/redo actions are enabled for @editable
     *
     * @return true if undo is enabled
     */
    public fun getEnableUndo(): Boolean = gtk_editable_get_enable_undo(gtkEditablePointer.reinterpret()).asBoolean()

    /**
     * Retrieves the desired maximum width of @editable, in characters.
     *
     * @return the maximum width of the entry, in characters
     */
    public fun getMaxWidthChars(): Int = gtk_editable_get_max_width_chars(gtkEditablePointer.reinterpret())

    /**
     * Retrieves the current position of the cursor relative
     * to the start of the content of the editable.
     *
     * Note that this position is in characters, not in bytes.
     *
     * @return the cursor position
     */
    public fun getPosition(): Int = gtk_editable_get_position(gtkEditablePointer.reinterpret())

    /**
     * Retrieves the contents of @editable.
     *
     * The returned string is owned by GTK and must not be modified or freed.
     *
     * @return a pointer to the contents of the editable
     */
    public fun getText(): String =
        gtk_editable_get_text(gtkEditablePointer.reinterpret())?.toKString() ?: error("Expected not null string")

    /**
     * Gets the number of characters of space reserved
     * for the contents of the editable.
     *
     * @return number of chars to request space for, or negative if unset
     */
    public fun getWidthChars(): Int = gtk_editable_get_width_chars(gtkEditablePointer.reinterpret())

    /**
     * Sets up a delegate for `GtkEditable`.
     *
     * This is assuming that the get_delegate vfunc in the `GtkEditable`
     * interface has been set up for the @editable's type.
     *
     * This is a helper function that should be called in instance init,
     * after creating the delegate object.
     */
    public fun initDelegate(): Unit = gtk_editable_init_delegate(gtkEditablePointer.reinterpret())

    /**
     * Selects a region of text.
     *
     * The characters that are selected are those characters at positions
     * from @start_pos up to, but not including @end_pos. If @end_pos is
     * negative, then the characters selected are those characters from
     * @start_pos to  the end of the text.
     *
     * Note that positions are specified in characters, not bytes.
     *
     * @param startPos start of region
     * @param endPos end of region
     */
    public fun selectRegion(
        startPos: Int,
        endPos: Int,
    ): Unit = gtk_editable_select_region(gtkEditablePointer.reinterpret(), startPos, endPos)

    /**
     * Sets the alignment for the contents of the editable.
     *
     * This controls the horizontal positioning of the contents when
     * the displayed text is shorter than the width of the editable.
     *
     * @param xalign The horizontal alignment, from 0 (left) to 1 (right).
     *   Reversed for RTL layouts
     */
    public fun setAlignment(xalign: Float): Unit = gtk_editable_set_alignment(gtkEditablePointer.reinterpret(), xalign)

    /**
     * Determines if the user can edit the text in the editable widget.
     *
     * @param isEditable true if the user is allowed to edit the text
     *   in the widget
     */
    public fun setEditable(isEditable: Boolean): Unit =
        gtk_editable_set_editable(gtkEditablePointer.reinterpret(), isEditable.asGBoolean())

    /**
     * If enabled, changes to @editable will be saved for undo/redo
     * actions.
     *
     * This results in an additional copy of text changes and are not
     * stored in secure memory. As such, undo is forcefully disabled
     * when [property@Gtk.Text:visibility] is set to false.
     *
     * @param enableUndo if undo/redo should be enabled
     */
    public fun setEnableUndo(enableUndo: Boolean): Unit =
        gtk_editable_set_enable_undo(gtkEditablePointer.reinterpret(), enableUndo.asGBoolean())

    /**
     * Sets the desired maximum width in characters of @editable.
     *
     * @param nChars the new desired maximum width, in characters
     */
    public fun setMaxWidthChars(nChars: Int): Unit =
        gtk_editable_set_max_width_chars(gtkEditablePointer.reinterpret(), nChars)

    /**
     * Sets the cursor position in the editable to the given value.
     *
     * The cursor is displayed before the character with the given (base 0)
     * index in the contents of the editable. The value must be less than
     * or equal to the number of characters in the editable. A value of -1
     * indicates that the position should be set after the last character
     * of the editable. Note that @position is in characters, not in bytes.
     *
     * @param position the position of the cursor
     */
    public fun setPosition(position: Int): Unit = gtk_editable_set_position(gtkEditablePointer.reinterpret(), position)

    /**
     * Sets the text in the editable to the given value.
     *
     * This is replacing the current contents.
     *
     * @param text the text to set
     */
    public fun setText(text: String): Unit = gtk_editable_set_text(gtkEditablePointer.reinterpret(), text)

    /**
     * Changes the size request of the editable to be about the
     * right size for @n_chars characters.
     *
     * Note that it changes the size request, the size can still
     * be affected by how you pack the widget into containers.
     * If @n_chars is -1, the size reverts to the default size.
     *
     * @param nChars width in chars
     */
    public fun setWidthChars(nChars: Int): Unit = gtk_editable_set_width_chars(gtkEditablePointer.reinterpret(), nChars)

    /**
     * Emitted at the end of a single user-visible operation on the
     * contents.
     *
     * E.g., a paste operation that replaces the contents of the
     * selection will cause only one signal emission (even though it
     * is implemented by first deleting the selection, then inserting
     * the new content, and may cause multiple ::notify::text signals
     * to be emitted).
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gtkEditablePointer.reinterpret(),
            "changed",
            connectChangedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emitted when text is deleted from the widget by the user.
     *
     * The default handler for this signal will normally be responsible for
     * deleting the text, so by connecting to this signal and then stopping
     * the signal with g_signal_stop_emission(), it is possible to modify the
     * range of deleted text, or prevent it from being deleted entirely.
     *
     * The @start_pos and @end_pos parameters are interpreted as for
     * [method@Gtk.Editable.delete_text].
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `startPos` the starting position; `endPos` the end position
     */
    public fun connectDeleteText(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (startPos: Int, endPos: Int) -> Unit,
    ): ULong =
        g_signal_connect_data(
            gtkEditablePointer.reinterpret(),
            "delete-text",
            connectDeleteTextFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    private data class Wrapper(
        private val pointer: CPointer<GtkEditable>,
    ) : Editable {
        override val gtkEditablePointer: CPointer<GtkEditable> = pointer
    }

    public companion object : TypeCompanion<Editable> {
        override val type: GeneratedInterfaceKGType<Editable> =
            GeneratedInterfaceKGType(gtk_editable_get_type()) { Wrapper(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<GtkEditable>): Editable = Wrapper(pointer)

        /**
         * Gets a property of the `GtkEditable` delegate for @object.
         *
         * This is helper function that should be called in the `get_property`
         * function of your `GtkEditable` implementation, before handling your
         * own properties.
         *
         * @param object a `GObject`
         * @param propId a property ID
         * @param value value to set
         * @param pspec the `GParamSpec` for the property
         * @return true if the property was found
         */
        public fun delegateGetProperty(
            `object`: Object,
            propId: UInt,
            `value`: Value,
            pspec: ParamSpec,
        ): Boolean =
            gtk_editable_delegate_get_property(
                `object`.gPointer.reinterpret(),
                propId,
                `value`.gobjectValuePointer.reinterpret(),
                pspec.gPointer.reinterpret()
            ).asBoolean()

        /**
         * Sets a property on the `GtkEditable` delegate for @object.
         *
         * This is a helper function that should be called in the `set_property`
         * function of your `GtkEditable` implementation, before handling your
         * own properties.
         *
         * @param object a `GObject`
         * @param propId a property ID
         * @param value value to set
         * @param pspec the `GParamSpec` for the property
         * @return true if the property was found
         */
        public fun delegateSetProperty(
            `object`: Object,
            propId: UInt,
            `value`: Value,
            pspec: ParamSpec,
        ): Boolean =
            gtk_editable_delegate_set_property(
                `object`.gPointer.reinterpret(),
                propId,
                `value`.gobjectValuePointer.reinterpret(),
                pspec.gPointer.reinterpret()
            ).asBoolean()
    }
}

private val connectChangedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

private val connectDeleteTextFunc: CPointer<CFunction<(Int, Int) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            startPos: Int,
            endPos: Int,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(startPos: Int, endPos: Int) -> Unit>().get().invoke(startPos, endPos)
    }.reinterpret()

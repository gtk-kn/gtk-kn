// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.cairo.Context
import org.gtkkn.bindings.gdk.ContentProvider
import org.gtkkn.bindings.gdk.Display
import org.gtkkn.bindings.gdk.FrameClock
import org.gtkkn.bindings.gdk.ModifierType
import org.gtkkn.bindings.gdk.Rectangle
import org.gtkkn.bindings.gdk.Texture
import org.gtkkn.bindings.gio.AsyncReadyCallback
import org.gtkkn.bindings.gio.AsyncReadyCallbackFunc
import org.gtkkn.bindings.gio.AsyncResult
import org.gtkkn.bindings.gio.Cancellable
import org.gtkkn.bindings.gio.ListModel
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.glib.Quark
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gobject.ParamFlags
import org.gtkkn.bindings.gobject.ParamSpec
import org.gtkkn.bindings.gobject.Value
import org.gtkkn.bindings.pango.FontFace
import org.gtkkn.bindings.pango.FontFamily
import org.gtkkn.bindings.pango.Language
import org.gtkkn.bindings.pango.Layout
import org.gtkkn.extensions.glib.GLibException
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.native.cairo.cairo_t
import org.gtkkn.native.gdk.GdkFrameClock
import org.gtkkn.native.gdk.GdkRectangle
import org.gtkkn.native.gio.GListModel
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.GVariant
import org.gtkkn.native.glib.g_strdup
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.glib.guint
import org.gtkkn.native.glib.guint32
import org.gtkkn.native.glib.gunichar
import org.gtkkn.native.gobject.GObject
import org.gtkkn.native.gobject.GValue
import org.gtkkn.native.gtk.GtkCellLayout
import org.gtkkn.native.gtk.GtkCellRenderer
import org.gtkkn.native.gtk.GtkDrawingArea
import org.gtkkn.native.gtk.GtkEntryCompletion
import org.gtkkn.native.gtk.GtkFlowBox
import org.gtkkn.native.gtk.GtkFlowBoxChild
import org.gtkkn.native.gtk.GtkIconView
import org.gtkkn.native.gtk.GtkListBox
import org.gtkkn.native.gtk.GtkListBoxRow
import org.gtkkn.native.gtk.GtkMenuButton
import org.gtkkn.native.gtk.GtkPageSetup
import org.gtkkn.native.gtk.GtkPrintJob
import org.gtkkn.native.gtk.GtkPrinter
import org.gtkkn.native.gtk.GtkScale
import org.gtkkn.native.gtk.GtkTextTag
import org.gtkkn.native.gtk.GtkTreeIter
import org.gtkkn.native.gtk.GtkTreeModel
import org.gtkkn.native.gtk.GtkTreePath
import org.gtkkn.native.gtk.GtkTreeSelection
import org.gtkkn.native.gtk.GtkTreeView
import org.gtkkn.native.gtk.GtkTreeViewColumn
import org.gtkkn.native.gtk.GtkWidget
import org.gtkkn.native.gtk.gtk_accelerator_get_default_mod_mask
import org.gtkkn.native.gtk.gtk_accelerator_get_label
import org.gtkkn.native.gtk.gtk_accelerator_get_label_with_keycode
import org.gtkkn.native.gtk.gtk_accelerator_name
import org.gtkkn.native.gtk.gtk_accelerator_name_with_keycode
import org.gtkkn.native.gtk.gtk_accelerator_valid
import org.gtkkn.native.gtk.gtk_check_version
import org.gtkkn.native.gtk.gtk_css_parser_error_quark
import org.gtkkn.native.gtk.gtk_css_parser_warning_quark
import org.gtkkn.native.gtk.gtk_disable_setlocale
import org.gtkkn.native.gtk.gtk_enumerate_printers
import org.gtkkn.native.gtk.gtk_get_binary_age
import org.gtkkn.native.gtk.gtk_get_debug_flags
import org.gtkkn.native.gtk.gtk_get_default_language
import org.gtkkn.native.gtk.gtk_get_interface_age
import org.gtkkn.native.gtk.gtk_get_locale_direction
import org.gtkkn.native.gtk.gtk_get_major_version
import org.gtkkn.native.gtk.gtk_get_micro_version
import org.gtkkn.native.gtk.gtk_get_minor_version
import org.gtkkn.native.gtk.gtk_init
import org.gtkkn.native.gtk.gtk_init_check
import org.gtkkn.native.gtk.gtk_is_initialized
import org.gtkkn.native.gtk.gtk_param_spec_expression
import org.gtkkn.native.gtk.gtk_print_run_page_setup_dialog
import org.gtkkn.native.gtk.gtk_print_run_page_setup_dialog_async
import org.gtkkn.native.gtk.gtk_render_activity
import org.gtkkn.native.gtk.gtk_render_arrow
import org.gtkkn.native.gtk.gtk_render_background
import org.gtkkn.native.gtk.gtk_render_check
import org.gtkkn.native.gtk.gtk_render_expander
import org.gtkkn.native.gtk.gtk_render_focus
import org.gtkkn.native.gtk.gtk_render_frame
import org.gtkkn.native.gtk.gtk_render_handle
import org.gtkkn.native.gtk.gtk_render_icon
import org.gtkkn.native.gtk.gtk_render_layout
import org.gtkkn.native.gtk.gtk_render_line
import org.gtkkn.native.gtk.gtk_render_option
import org.gtkkn.native.gtk.gtk_set_debug_flags
import org.gtkkn.native.gtk.gtk_show_uri
import org.gtkkn.native.gtk.gtk_show_uri_full
import org.gtkkn.native.gtk.gtk_show_uri_full_finish
import org.gtkkn.native.gtk.gtk_test_accessible_assertion_message_role
import org.gtkkn.native.gtk.gtk_test_accessible_has_property
import org.gtkkn.native.gtk.gtk_test_accessible_has_relation
import org.gtkkn.native.gtk.gtk_test_accessible_has_role
import org.gtkkn.native.gtk.gtk_test_accessible_has_state
import org.gtkkn.native.gtk.gtk_test_register_all_types
import org.gtkkn.native.gtk.gtk_test_widget_wait_for_draw
import org.gtkkn.native.gtk.gtk_tree_create_row_drag_content
import org.gtkkn.native.gtk.gtk_value_dup_expression
import org.gtkkn.native.gtk.gtk_value_get_expression
import org.gtkkn.native.gtk.gtk_value_set_expression
import org.gtkkn.native.gtk.gtk_value_take_expression
import org.gtkkn.native.pango.PangoFontFace
import org.gtkkn.native.pango.PangoFontFamily
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - parameter `accelerator_key`: accelerator_key: Out parameter is not supported
 * - parameter `accelerator_key`: accelerator_key: Out parameter is not supported
 * - parameter `sizes`: Array parameter of type RequestedSize is not supported
 * - parameter `r`: r: Out parameter is not supported
 * - parameter `h`: h: Out parameter is not supported
 * - function `show_about_dialog`: Varargs parameter is not supported
 * - function `test_accessible_check_property`: Varargs parameter is not supported
 * - function `test_accessible_check_relation`: Varargs parameter is not supported
 * - function `test_accessible_check_state`: Varargs parameter is not supported
 * - function `test_init`: In/Out parameter is not supported
 * - parameter `n_types`: n_types: Out parameter is not supported
 * - parameter `tree_model`: tree_model: Out parameter is not supported
 * - record `ATContextClass`: glib type struct are ignored
 * - record `AccessibleInterface`: glib type struct are ignored
 * - record `AccessibleRangeInterface`: glib type struct are ignored
 * - record `AccessibleTextInterface`: glib type struct are ignored
 * - record `ActionableInterface`: glib type struct are ignored
 * - record `ActivateActionClass`: glib type struct are ignored
 * - record `AdjustmentClass`: glib type struct are ignored
 * - record `AlertDialogClass`: glib type struct are ignored
 * - record `AlternativeTriggerClass`: glib type struct are ignored
 * - record `AnyFilterClass`: glib type struct are ignored
 * - record `ApplicationClass`: glib type struct are ignored
 * - record `ApplicationWindowClass`: glib type struct are ignored
 * - record `BinLayoutClass`: glib type struct are ignored
 * - record `BookmarkListClass`: glib type struct are ignored
 * - record `BoolFilterClass`: glib type struct are ignored
 * - record `BoxClass`: glib type struct are ignored
 * - record `BoxLayoutClass`: glib type struct are ignored
 * - record `BuildableIface`: glib type struct are ignored
 * - record `BuilderCScopeClass`: glib type struct are ignored
 * - record `BuilderClass`: glib type struct are ignored
 * - record `BuilderListItemFactoryClass`: glib type struct are ignored
 * - record `BuilderScopeInterface`: glib type struct are ignored
 * - record `ButtonClass`: glib type struct are ignored
 * - record `CallbackActionClass`: glib type struct are ignored
 * - record `CellAreaClass`: glib type struct are ignored
 * - record `CellAreaContextClass`: glib type struct are ignored
 * - record `CellEditableIface`: glib type struct are ignored
 * - record `CellLayoutIface`: glib type struct are ignored
 * - record `CellRendererClass`: glib type struct are ignored
 * - record `CellRendererTextClass`: glib type struct are ignored
 * - record `CenterBoxClass`: glib type struct are ignored
 * - record `CenterLayoutClass`: glib type struct are ignored
 * - record `CheckButtonClass`: glib type struct are ignored
 * - record `ColorChooserInterface`: glib type struct are ignored
 * - record `ColorDialogButtonClass`: glib type struct are ignored
 * - record `ColorDialogClass`: glib type struct are ignored
 * - record `ColumnViewCellClass`: glib type struct are ignored
 * - record `ColumnViewClass`: glib type struct are ignored
 * - record `ColumnViewColumnClass`: glib type struct are ignored
 * - record `ColumnViewRowClass`: glib type struct are ignored
 * - record `ColumnViewSorterClass`: glib type struct are ignored
 * - record `ComboBoxClass`: glib type struct are ignored
 * - record `ConstraintClass`: glib type struct are ignored
 * - record `ConstraintGuideClass`: glib type struct are ignored
 * - record `ConstraintLayoutChildClass`: glib type struct are ignored
 * - record `ConstraintLayoutClass`: glib type struct are ignored
 * - record `ConstraintTargetInterface`: glib type struct are ignored
 * - record `CssProviderClass`: glib type struct are ignored
 * - record `CustomFilterClass`: glib type struct are ignored
 * - record `CustomSorterClass`: glib type struct are ignored
 * - record `DialogClass`: glib type struct are ignored
 * - record `DirectoryListClass`: glib type struct are ignored
 * - record `DragIconClass`: glib type struct are ignored
 * - record `DragSourceClass`: glib type struct are ignored
 * - record `DrawingAreaClass`: glib type struct are ignored
 * - record `DropControllerMotionClass`: glib type struct are ignored
 * - record `DropDownClass`: glib type struct are ignored
 * - record `DropTargetAsyncClass`: glib type struct are ignored
 * - record `DropTargetClass`: glib type struct are ignored
 * - record `EditableInterface`: glib type struct are ignored
 * - record `EditableLabelClass`: glib type struct are ignored
 * - record `EmojiChooserClass`: glib type struct are ignored
 * - record `EntryBufferClass`: glib type struct are ignored
 * - record `EntryClass`: glib type struct are ignored
 * - record `EventControllerClass`: glib type struct are ignored
 * - record `EventControllerFocusClass`: glib type struct are ignored
 * - record `EventControllerKeyClass`: glib type struct are ignored
 * - record `EventControllerLegacyClass`: glib type struct are ignored
 * - record `EventControllerMotionClass`: glib type struct are ignored
 * - record `EventControllerScrollClass`: glib type struct are ignored
 * - record `EveryFilterClass`: glib type struct are ignored
 * - record `FileChooserNativeClass`: glib type struct are ignored
 * - record `FileDialogClass`: glib type struct are ignored
 * - record `FileLauncherClass`: glib type struct are ignored
 * - record `FilterClass`: glib type struct are ignored
 * - record `FilterListModelClass`: glib type struct are ignored
 * - record `FixedClass`: glib type struct are ignored
 * - record `FixedLayoutChildClass`: glib type struct are ignored
 * - record `FixedLayoutClass`: glib type struct are ignored
 * - record `FlattenListModelClass`: glib type struct are ignored
 * - record `FlowBoxChildClass`: glib type struct are ignored
 * - record `FontChooserIface`: glib type struct are ignored
 * - record `FontDialogButtonClass`: glib type struct are ignored
 * - record `FontDialogClass`: glib type struct are ignored
 * - record `FrameClass`: glib type struct are ignored
 * - record `GLAreaClass`: glib type struct are ignored
 * - record `GestureClass`: glib type struct are ignored
 * - record `GestureClickClass`: glib type struct are ignored
 * - record `GestureDragClass`: glib type struct are ignored
 * - record `GestureLongPressClass`: glib type struct are ignored
 * - record `GesturePanClass`: glib type struct are ignored
 * - record `GestureRotateClass`: glib type struct are ignored
 * - record `GestureSingleClass`: glib type struct are ignored
 * - record `GestureStylusClass`: glib type struct are ignored
 * - record `GestureSwipeClass`: glib type struct are ignored
 * - record `GestureZoomClass`: glib type struct are ignored
 * - record `GraphicsOffloadClass`: glib type struct are ignored
 * - record `GridClass`: glib type struct are ignored
 * - record `GridLayoutChildClass`: glib type struct are ignored
 * - record `GridLayoutClass`: glib type struct are ignored
 * - record `GridViewClass`: glib type struct are ignored
 * - record `IMContextClass`: glib type struct are ignored
 * - record `IMContextSimpleClass`: glib type struct are ignored
 * - record `IMMulticontextClass`: glib type struct are ignored
 * - record `InscriptionClass`: glib type struct are ignored
 * - record `KeyvalTriggerClass`: glib type struct are ignored
 * - record `LayoutChildClass`: glib type struct are ignored
 * - record `LayoutManagerClass`: glib type struct are ignored
 * - record `ListBaseClass`: glib type struct are ignored
 * - record `ListBoxRowClass`: glib type struct are ignored
 * - record `ListHeaderClass`: glib type struct are ignored
 * - record `ListItemClass`: glib type struct are ignored
 * - record `ListItemFactoryClass`: glib type struct are ignored
 * - record `ListStoreClass`: glib type struct are ignored
 * - record `ListViewClass`: glib type struct are ignored
 * - record `MapListModelClass`: glib type struct are ignored
 * - record `MediaControlsClass`: glib type struct are ignored
 * - record `MediaFileClass`: glib type struct are ignored
 * - record `MediaStreamClass`: glib type struct are ignored
 * - record `MessageDialogClass`: glib type struct are ignored
 * - record `MnemonicActionClass`: glib type struct are ignored
 * - record `MnemonicTriggerClass`: glib type struct are ignored
 * - record `MountOperationClass`: glib type struct are ignored
 * - record `MultiFilterClass`: glib type struct are ignored
 * - record `MultiSelectionClass`: glib type struct are ignored
 * - record `MultiSorterClass`: glib type struct are ignored
 * - record `NamedActionClass`: glib type struct are ignored
 * - record `NativeDialogClass`: glib type struct are ignored
 * - record `NativeInterface`: glib type struct are ignored
 * - record `NeverTriggerClass`: glib type struct are ignored
 * - record `NoSelectionClass`: glib type struct are ignored
 * - record `NothingActionClass`: glib type struct are ignored
 * - record `NumericSorterClass`: glib type struct are ignored
 * - record `OrientableIface`: glib type struct are ignored
 * - record `OverlayLayoutChildClass`: glib type struct are ignored
 * - record `OverlayLayoutClass`: glib type struct are ignored
 * - record `PadControllerClass`: glib type struct are ignored
 * - record `PasswordEntryBufferClass`: glib type struct are ignored
 * - record `PasswordEntryClass`: glib type struct are ignored
 * - record `PictureClass`: glib type struct are ignored
 * - record `PopoverClass`: glib type struct are ignored
 * - record `PrintDialogClass`: glib type struct are ignored
 * - record `PrintOperationClass`: glib type struct are ignored
 * - record `PrintOperationPreviewIface`: glib type struct are ignored
 * - record `RangeClass`: glib type struct are ignored
 * - record `RecentManagerClass`: glib type struct are ignored
 * - record `RootInterface`: glib type struct are ignored
 * - record `ScaleButtonClass`: glib type struct are ignored
 * - record `ScaleClass`: glib type struct are ignored
 * - record `ScrollableInterface`: glib type struct are ignored
 * - record `SectionModelInterface`: glib type struct are ignored
 * - record `SelectionFilterModelClass`: glib type struct are ignored
 * - record `SelectionModelInterface`: glib type struct are ignored
 * - record `ShortcutActionClass`: glib type struct are ignored
 * - record `ShortcutClass`: glib type struct are ignored
 * - record `ShortcutControllerClass`: glib type struct are ignored
 * - record `ShortcutLabelClass`: glib type struct are ignored
 * - record `ShortcutManagerInterface`: glib type struct are ignored
 * - record `ShortcutTriggerClass`: glib type struct are ignored
 * - record `ShortcutsGroupClass`: glib type struct are ignored
 * - record `ShortcutsSectionClass`: glib type struct are ignored
 * - record `ShortcutsShortcutClass`: glib type struct are ignored
 * - record `SignalActionClass`: glib type struct are ignored
 * - record `SignalListItemFactoryClass`: glib type struct are ignored
 * - record `SingleSelectionClass`: glib type struct are ignored
 * - record `SliceListModelClass`: glib type struct are ignored
 * - record `SnapshotClass`: glib type struct are ignored
 * - record `SortListModelClass`: glib type struct are ignored
 * - record `SorterClass`: glib type struct are ignored
 * - record `StringFilterClass`: glib type struct are ignored
 * - record `StringListClass`: glib type struct are ignored
 * - record `StringObjectClass`: glib type struct are ignored
 * - record `StringSorterClass`: glib type struct are ignored
 * - record `StyleContextClass`: glib type struct are ignored
 * - record `SymbolicPaintableInterface`: glib type struct are ignored
 * - record `TextBufferClass`: glib type struct are ignored
 * - record `TextChildAnchorClass`: glib type struct are ignored
 * - record `TextMarkClass`: glib type struct are ignored
 * - record `TextTagClass`: glib type struct are ignored
 * - record `TextViewClass`: glib type struct are ignored
 * - record `ToggleButtonClass`: glib type struct are ignored
 * - record `TreeDragDestIface`: glib type struct are ignored
 * - record `TreeDragSourceIface`: glib type struct are ignored
 * - record `TreeExpanderClass`: glib type struct are ignored
 * - record `TreeListModelClass`: glib type struct are ignored
 * - record `TreeListRowClass`: glib type struct are ignored
 * - record `TreeListRowSorterClass`: glib type struct are ignored
 * - record `TreeModelFilterClass`: glib type struct are ignored
 * - record `TreeModelIface`: glib type struct are ignored
 * - record `TreeModelSortClass`: glib type struct are ignored
 * - record `TreeSortableIface`: glib type struct are ignored
 * - record `TreeStoreClass`: glib type struct are ignored
 * - record `TreeViewClass`: glib type struct are ignored
 * - record `UriLauncherClass`: glib type struct are ignored
 * - record `VideoClass`: glib type struct are ignored
 * - record `WidgetClass`: glib type struct are ignored
 * - record `WidgetPaintableClass`: glib type struct are ignored
 * - record `WindowClass`: glib type struct are ignored
 * - record `WindowControlsClass`: glib type struct are ignored
 * - record `WindowGroupClass`: glib type struct are ignored
 * - record `WindowHandleClass`: glib type struct are ignored
 */
public object Gtk {
    /**
     * An attribute for the background color, expressed as an RGB value
     * encoded in a string using the format: `{r8},{g8},{b8}`.
     *
     * @since 4.14
     */
    public const val ACCESSIBLE_ATTRIBUTE_BACKGROUND: String = "bg-color"

    /**
     * An attribute for the font family name.
     *
     * @since 4.14
     */
    public const val ACCESSIBLE_ATTRIBUTE_FAMILY: String = "family-name"

    /**
     * An attribute for the foreground color, expressed as an RGB value
     * encoded in a string using the format: `{r8},{g8},{b8}`.
     *
     * @since 4.14
     */
    public const val ACCESSIBLE_ATTRIBUTE_FOREGROUND: String = "fg-color"

    /**
     * An attribute for the overline style.
     *
     * Possible values are:
     *
     * - [const@Gtk.ACCESSIBLE_ATTRIBUTE_OVERLINE_NONE]
     * - [const@Gtk.ACCESSIBLE_ATTRIBUTE_OVERLINE_SINGLE]
     *
     * @since 4.14
     */
    public const val ACCESSIBLE_ATTRIBUTE_OVERLINE: String = "overline"

    /**
     * The "none" overline value for [const@Gtk.ACCESSIBLE_ATTRIBUTE_OVERLINE].
     *
     * @since 4.14
     */
    public const val ACCESSIBLE_ATTRIBUTE_OVERLINE_NONE: String = "none"

    /**
     * The "single" overline value for [const@Gtk.ACCESSIBLE_ATTRIBUTE_OVERLINE].
     *
     * @since 4.14
     */
    public const val ACCESSIBLE_ATTRIBUTE_OVERLINE_SINGLE: String = "single"

    /**
     * An attribute for the font size, expressed in points.
     *
     * @since 4.14
     */
    public const val ACCESSIBLE_ATTRIBUTE_SIZE: String = "size"

    /**
     * An attribute for the font stretch type.
     *
     * Possible values are:
     *
     * - [const@Gtk.ACCESSIBLE_ATTRIBUTE_STRETCH_ULTRA_CONDENSED]
     * - [const@Gtk.ACCESSIBLE_ATTRIBUTE_STRETCH_EXTRA_CONDENSED]
     * - [const@Gtk.ACCESSIBLE_ATTRIBUTE_STRETCH_CONDENSED]
     * - [const@Gtk.ACCESSIBLE_ATTRIBUTE_STRETCH_SEMI_CONDENSED]
     *
     * @since 4.14
     */
    public const val ACCESSIBLE_ATTRIBUTE_STRETCH: String = "stretch"

    /**
     * The "condensed" stretch value for [const@Gtk.ACCESSIBLE_ATTRIBUTE_STRETCH].
     *
     * @since 4.14
     */
    public const val ACCESSIBLE_ATTRIBUTE_STRETCH_CONDENSED: String = "condensed"

    /**
     * The "expanded" stretch value for [const@Gtk.ACCESSIBLE_ATTRIBUTE_STRETCH].
     *
     * @since 4.14
     */
    public const val ACCESSIBLE_ATTRIBUTE_STRETCH_EXPANDED: String = "expanded"

    /**
     * The "extra condensed" stretch value for [const@Gtk.ACCESSIBLE_ATTRIBUTE_STRETCH].
     *
     * @since 4.14
     */
    public const val ACCESSIBLE_ATTRIBUTE_STRETCH_EXTRA_CONDENSED: String = "extra_condensed"

    /**
     * The "extra expanded" stretch value for [const@Gtk.ACCESSIBLE_ATTRIBUTE_STRETCH].
     *
     * @since 4.14
     */
    public const val ACCESSIBLE_ATTRIBUTE_STRETCH_EXTRA_EXPANDED: String = "extra_expanded"

    /**
     * The "normal" stretch value for [const@Gtk.ACCESSIBLE_ATTRIBUTE_STRETCH].
     *
     * @since 4.14
     */
    public const val ACCESSIBLE_ATTRIBUTE_STRETCH_NORMAL: String = "normal"

    /**
     * The "semi condensed" stretch value for [const@Gtk.ACCESSIBLE_ATTRIBUTE_STRETCH].
     *
     * @since 4.14
     */
    public const val ACCESSIBLE_ATTRIBUTE_STRETCH_SEMI_CONDENSED: String = "semi_condensed"

    /**
     * The "semi expanded" stretch value for [const@Gtk.ACCESSIBLE_ATTRIBUTE_STRETCH].
     *
     * @since 4.14
     */
    public const val ACCESSIBLE_ATTRIBUTE_STRETCH_SEMI_EXPANDED: String = "semi_expanded"

    /**
     * The "ultra condensed" stretch value for [const@Gtk.ACCESSIBLE_ATTRIBUTE_STRETCH].
     *
     * @since 4.14
     */
    public const val ACCESSIBLE_ATTRIBUTE_STRETCH_ULTRA_CONDENSED: String = "ultra_condensed"

    /**
     * The "ultra expanded" stretch value for [const@Gtk.ACCESSIBLE_ATTRIBUTE_STRETCH].
     *
     * @since 4.14
     */
    public const val ACCESSIBLE_ATTRIBUTE_STRETCH_ULTRA_EXPANDED: String = "ultra_expanded"

    /**
     * An attribute for strikethrough text.
     *
     * Possible values are `true` or `false`.
     *
     * @since 4.14
     */
    public const val ACCESSIBLE_ATTRIBUTE_STRIKETHROUGH: String = "strikethrough"

    /**
     * An attribute for the font style.
     *
     * Possible values are:
     *
     * - [const@Gtk.ACCESSIBLE_ATTRIBUTE_STYLE_NORMAL]
     * - [const@Gtk.ACCESSIBLE_ATTRIBUTE_STYLE_OBLIQUE]
     * - [const@Gtk.ACCESSIBLE_ATTRIBUTE_STYLE_ITALIC]
     *
     * @since 4.14
     */
    public const val ACCESSIBLE_ATTRIBUTE_STYLE: String = "style"

    /**
     * The "italic" style value for [const@Gtk.ACCESSIBLE_ATTRIBUTE_STYLE].
     *
     * @since 4.14
     */
    public const val ACCESSIBLE_ATTRIBUTE_STYLE_ITALIC: String = "italic"

    /**
     * The "normal" style value for [const@Gtk.ACCESSIBLE_ATTRIBUTE_STYLE].
     *
     * @since 4.14
     */
    public const val ACCESSIBLE_ATTRIBUTE_STYLE_NORMAL: String = "normal"

    /**
     * The "oblique" style value for [const@Gtk.ACCESSIBLE_ATTRIBUTE_STYLE].
     *
     * @since 4.14
     */
    public const val ACCESSIBLE_ATTRIBUTE_STYLE_OBLIQUE: String = "oblique"

    /**
     * An attribute for the underline style.
     *
     * Possible values are:
     *
     * - [const@Gtk.ACCESSIBLE_ATTRIBUTE_UNDERLINE_NONE]
     * - [const@Gtk.ACCESSIBLE_ATTRIBUTE_UNDERLINE_SINGLE]
     * - [const@Gtk.ACCESSIBLE_ATTRIBUTE_UNDERLINE_DOUBLE]
     * - [const@Gtk.ACCESSIBLE_ATTRIBUTE_UNDERLINE_ERROR]
     *
     * @since 4.14
     */
    public const val ACCESSIBLE_ATTRIBUTE_UNDERLINE: String = "underline"

    /**
     * The "double" underline value for [const@Gtk.ACCESSIBLE_ATTRIBUTE_UNDERLINE].
     *
     * @since 4.14
     */
    public const val ACCESSIBLE_ATTRIBUTE_UNDERLINE_DOUBLE: String = "double"

    /**
     * The "error" underline value for [const@Gtk.ACCESSIBLE_ATTRIBUTE_UNDERLINE].
     *
     * @since 4.14
     */
    public const val ACCESSIBLE_ATTRIBUTE_UNDERLINE_ERROR: String = "error"

    /**
     * The "none" underline value for [const@Gtk.ACCESSIBLE_ATTRIBUTE_UNDERLINE].
     *
     * @since 4.14
     */
    public const val ACCESSIBLE_ATTRIBUTE_UNDERLINE_NONE: String = "none"

    /**
     * The "single" underline value for [const@Gtk.ACCESSIBLE_ATTRIBUTE_UNDERLINE].
     *
     * @since 4.14
     */
    public const val ACCESSIBLE_ATTRIBUTE_UNDERLINE_SINGLE: String = "single"

    /**
     * An attribute for the font variant.
     *
     * Possible values are:
     *
     * - [const@Gtk.ACCESSIBLE_ATTRIBUTE_VARIANT_SMALL_CAPS]
     * - [const@Gtk.ACCESSIBLE_ATTRIBUTE_VARIANT_ALL_SMALL_CAPS]
     * - [const@Gtk.ACCESSIBLE_ATTRIBUTE_VARIANT_PETITE_CAPS]
     * - [const@Gtk.ACCESSIBLE_ATTRIBUTE_VARIANT_ALL_PETITE_CAPS]
     * - [const@Gtk.ACCESSIBLE_ATTRIBUTE_VARIANT_UNICASE]
     * - [const@Gtk.ACCESSIBLE_ATTRIBUTE_VARIANT_TITLE_CAPS]
     *
     * @since 4.14
     */
    public const val ACCESSIBLE_ATTRIBUTE_VARIANT: String = "variant"

    /**
     * The "all petite caps" variant value for [const@Gtk.ACCESSIBLE_ATTRIBUTE_VARIANT].
     *
     * @since 4.14
     */
    public const val ACCESSIBLE_ATTRIBUTE_VARIANT_ALL_PETITE_CAPS: String = "all-petite-caps"

    /**
     * The "all small caps" variant value for [const@Gtk.ACCESSIBLE_ATTRIBUTE_VARIANT].
     *
     * @since 4.14
     */
    public const val ACCESSIBLE_ATTRIBUTE_VARIANT_ALL_SMALL_CAPS: String = "all-small-caps"

    /**
     * The "petite caps" variant value for [const@Gtk.ACCESSIBLE_ATTRIBUTE_VARIANT].
     *
     * @since 4.14
     */
    public const val ACCESSIBLE_ATTRIBUTE_VARIANT_PETITE_CAPS: String = "petite-caps"

    /**
     * The "small caps" variant value for [const@Gtk.ACCESSIBLE_ATTRIBUTE_VARIANT].
     *
     * @since 4.14
     */
    public const val ACCESSIBLE_ATTRIBUTE_VARIANT_SMALL_CAPS: String = "small-caps"

    /**
     * The "title caps" variant value for [const@Gtk.ACCESSIBLE_ATTRIBUTE_VARIANT].
     *
     * @since 4.14
     */
    public const val ACCESSIBLE_ATTRIBUTE_VARIANT_TITLE_CAPS: String = "title-caps"

    /**
     * The "unicase" variant value for [const@Gtk.ACCESSIBLE_ATTRIBUTE_VARIANT].
     *
     * @since 4.14
     */
    public const val ACCESSIBLE_ATTRIBUTE_VARIANT_UNICASE: String = "unicase"

    /**
     * An attribute for the font weight.
     *
     * @since 4.14
     */
    public const val ACCESSIBLE_ATTRIBUTE_WEIGHT: String = "weight"

    /**
     * An undefined value. The accessible attribute is either unset, or its
     * value is undefined.
     */
    public const val ACCESSIBLE_VALUE_UNDEFINED: gint = -1

    /**
     * Like [func@get_binary_age], but from the headers used at
     * application compile time, rather than from the library linked
     * against at application run time.
     */
    public const val BINARY_AGE: gint = 1402

    public const val IM_MODULE_EXTENSION_POINT_NAME: String = "gtk-im-module"

    /**
     * Constant to return from a signal handler for the ::input
     * signal in case of conversion failure.
     *
     * See [signal@Gtk.SpinButton::input].
     */
    public const val INPUT_ERROR: gint = -1

    /**
     * Like [func@get_interface_age], but from the headers used at
     * application compile time, rather than from the library linked
     * against at application run time.
     */
    public const val INTERFACE_AGE: gint = 2

    /**
     * The value used to refer to a guaranteed invalid position
     * in a `GListModel`.
     *
     * This value may be returned from some functions, others may
     * accept it as input. Its interpretation may differ for different
     * functions.
     *
     * Refer to each function's documentation for if this value is
     * allowed and what it does.
     */
    public const val INVALID_LIST_POSITION: guint32 = UInt.MAX_VALUE

    /**
     * The name used for the stock full offset included by `GtkLevelBar`.
     */
    public const val LEVEL_BAR_OFFSET_FULL: String = "full"

    /**
     * The name used for the stock high offset included by `GtkLevelBar`.
     */
    public const val LEVEL_BAR_OFFSET_HIGH: String = "high"

    /**
     * The name used for the stock low offset included by `GtkLevelBar`.
     */
    public const val LEVEL_BAR_OFFSET_LOW: String = "low"

    /**
     * Like [func@get_major_version], but from the headers used at
     * application compile time, rather than from the library linked
     * against at application run time.
     */
    public const val MAJOR_VERSION: gint = 4

    public const val MAX_COMPOSE_LEN: gint = 7

    public const val MEDIA_FILE_EXTENSION_POINT_NAME: String = "gtk-media-file"

    /**
     * Like [func@get_micro_version], but from the headers used at
     * application compile time, rather than from the library linked
     * against at application run time.
     */
    public const val MICRO_VERSION: gint = 2

    /**
     * Like [func@get_minor_version], but from the headers used at
     * application compile time, rather than from the library linked
     * against at application run time.
     */
    public const val MINOR_VERSION: gint = 14

    /**
     * Name for the A3 paper size.
     */
    public const val PAPER_NAME_A3: String = "iso_a3"

    /**
     * Name for the A4 paper size.
     */
    public const val PAPER_NAME_A4: String = "iso_a4"

    /**
     * Name for the A5 paper size.
     */
    public const val PAPER_NAME_A5: String = "iso_a5"

    /**
     * Name for the B5 paper size.
     */
    public const val PAPER_NAME_B5: String = "iso_b5"

    /**
     * Name for the Executive paper size.
     */
    public const val PAPER_NAME_EXECUTIVE: String = "na_executive"

    /**
     * Name for the Legal paper size.
     */
    public const val PAPER_NAME_LEGAL: String = "na_legal"

    /**
     * Name for the Letter paper size.
     */
    public const val PAPER_NAME_LETTER: String = "na_letter"

    public const val PRINT_SETTINGS_COLLATE: String = "collate"

    public const val PRINT_SETTINGS_DEFAULT_SOURCE: String = "default-source"

    public const val PRINT_SETTINGS_DITHER: String = "dither"

    public const val PRINT_SETTINGS_DUPLEX: String = "duplex"

    public const val PRINT_SETTINGS_FINISHINGS: String = "finishings"

    public const val PRINT_SETTINGS_MEDIA_TYPE: String = "media-type"

    public const val PRINT_SETTINGS_NUMBER_UP: String = "number-up"

    public const val PRINT_SETTINGS_NUMBER_UP_LAYOUT: String = "number-up-layout"

    public const val PRINT_SETTINGS_N_COPIES: String = "n-copies"

    public const val PRINT_SETTINGS_ORIENTATION: String = "orientation"

    /**
     * The key used by the “Print to file” printer to store the file
     * name of the output without the path to the directory and the
     * file extension.
     */
    public const val PRINT_SETTINGS_OUTPUT_BASENAME: String = "output-basename"

    public const val PRINT_SETTINGS_OUTPUT_BIN: String = "output-bin"

    /**
     * The key used by the “Print to file” printer to store the
     * directory to which the output should be written.
     */
    public const val PRINT_SETTINGS_OUTPUT_DIR: String = "output-dir"

    /**
     * The key used by the “Print to file” printer to store the format
     * of the output. The supported values are “PS” and “PDF”.
     */
    public const val PRINT_SETTINGS_OUTPUT_FILE_FORMAT: String = "output-file-format"

    /**
     * The key used by the “Print to file” printer to store the URI
     * to which the output should be written. GTK itself supports
     * only “file://” URIs.
     */
    public const val PRINT_SETTINGS_OUTPUT_URI: String = "output-uri"

    public const val PRINT_SETTINGS_PAGE_RANGES: String = "page-ranges"

    public const val PRINT_SETTINGS_PAGE_SET: String = "page-set"

    public const val PRINT_SETTINGS_PAPER_FORMAT: String = "paper-format"

    public const val PRINT_SETTINGS_PAPER_HEIGHT: String = "paper-height"

    public const val PRINT_SETTINGS_PAPER_WIDTH: String = "paper-width"

    public const val PRINT_SETTINGS_PRINTER: String = "printer"

    public const val PRINT_SETTINGS_PRINTER_LPI: String = "printer-lpi"

    public const val PRINT_SETTINGS_PRINT_PAGES: String = "print-pages"

    public const val PRINT_SETTINGS_QUALITY: String = "quality"

    public const val PRINT_SETTINGS_RESOLUTION: String = "resolution"

    public const val PRINT_SETTINGS_RESOLUTION_X: String = "resolution-x"

    public const val PRINT_SETTINGS_RESOLUTION_Y: String = "resolution-y"

    public const val PRINT_SETTINGS_REVERSE: String = "reverse"

    public const val PRINT_SETTINGS_SCALE: String = "scale"

    public const val PRINT_SETTINGS_USE_COLOR: String = "use-color"

    public const val PRINT_SETTINGS_WIN32_DRIVER_EXTRA: String = "win32-driver-extra"

    public const val PRINT_SETTINGS_WIN32_DRIVER_VERSION: String = "win32-driver-version"

    /**
     * Use this priority for functionality related to size allocation.
     *
     * It is used internally by GTK+ to compute the sizes of widgets.
     * This priority is higher than %GDK_PRIORITY_REDRAW to avoid
     * resizing a widget which was just redrawn.
     */
    public const val PRIORITY_RESIZE: gint = 110

    /**
     * A priority that can be used when adding a `GtkStyleProvider`
     * for application-specific style information.
     */
    public const val STYLE_PROVIDER_PRIORITY_APPLICATION: gint = 600

    /**
     * The priority used for default style information
     * that is used in the absence of themes.
     *
     * Note that this is not very useful for providing default
     * styling for custom style classes - themes are likely to
     * override styling provided at this priority with
     * catch-all `* {...}` rules.
     */
    public const val STYLE_PROVIDER_PRIORITY_FALLBACK: gint = 1

    /**
     * The priority used for style information provided
     * via `GtkSettings`.
     *
     * This priority is higher than %GTK_STYLE_PROVIDER_PRIORITY_THEME
     * to let settings override themes.
     */
    public const val STYLE_PROVIDER_PRIORITY_SETTINGS: gint = 400

    /**
     * The priority used for style information provided
     * by themes.
     */
    public const val STYLE_PROVIDER_PRIORITY_THEME: gint = 200

    /**
     * The priority used for the style information from
     * `$XDG_CONFIG_HOME/gtk-4.0/gtk.css`.
     *
     * You should not use priorities higher than this, to
     * give the user the last word.
     */
    public const val STYLE_PROVIDER_PRIORITY_USER: gint = 800

    /**
     * The priority at which the text view validates onscreen lines
     * in an idle job in the background.
     */
    public const val TEXT_VIEW_PRIORITY_VALIDATE: gint = 125

    /**
     * Uses the default sort function in a [iface@Gtk.TreeSortable].
     *
     * See also: [method@Gtk.TreeSortable.set_sort_column_id]
     */
    public const val TREE_SORTABLE_DEFAULT_SORT_COLUMN_ID: gint = -1

    /**
     * Disables sorting in a [iface@Gtk.TreeSortable].
     *
     * See also: [method@Gtk.TreeSortable.set_sort_column_id]
     */
    public const val TREE_SORTABLE_UNSORTED_SORT_COLUMN_ID: gint = -2

    /**
     * Gets the modifier mask.
     *
     * The modifier mask determines which modifiers are considered significant
     * for keyboard accelerators. This includes all keyboard modifiers except
     * for %GDK_LOCK_MASK.
     *
     * @return the modifier mask for accelerators
     */
    public fun acceleratorGetDefaultModMask(): ModifierType = gtk_accelerator_get_default_mod_mask().run {
        ModifierType(this)
    }

    /**
     * Converts an accelerator keyval and modifier mask into a string
     * which can be used to represent the accelerator to the user.
     *
     * @param acceleratorKey accelerator keyval
     * @param acceleratorMods accelerator modifier mask
     * @return a newly-allocated string representing the accelerator
     */
    public fun acceleratorGetLabel(acceleratorKey: guint, acceleratorMods: ModifierType): String =
        gtk_accelerator_get_label(acceleratorKey, acceleratorMods.mask)?.toKString()
            ?: error("Expected not null string")

    /**
     * Converts an accelerator keyval and modifier mask
     * into a string that can be displayed to the user.
     *
     * The string may be translated.
     *
     * This function is similar to [func@Gtk.accelerator_get_label],
     * but handling keycodes. This is only useful for system-level
     * components, applications should use [func@Gtk.accelerator_get_label]
     * instead.
     *
     * @param display a `GdkDisplay` or null to use the default display
     * @param acceleratorKey accelerator keyval
     * @param keycode accelerator keycode
     * @param acceleratorMods accelerator modifier mask
     * @return a newly-allocated string representing the accelerator
     */
    public fun acceleratorGetLabelWithKeycode(
        display: Display? = null,
        acceleratorKey: guint,
        keycode: guint,
        acceleratorMods: ModifierType,
    ): String = gtk_accelerator_get_label_with_keycode(
        display?.gdkDisplayPointer,
        acceleratorKey,
        keycode,
        acceleratorMods.mask
    )?.toKString()
        ?: error("Expected not null string")

    /**
     * Converts an accelerator keyval and modifier mask into a string
     * parseable by gtk_accelerator_parse().
     *
     * For example, if you pass in %GDK_KEY_q and %GDK_CONTROL_MASK,
     * this function returns `<Control>q`.
     *
     * If you need to display accelerators in the user interface,
     * see [func@Gtk.accelerator_get_label].
     *
     * @param acceleratorKey accelerator keyval
     * @param acceleratorMods accelerator modifier mask
     * @return a newly-allocated accelerator name
     */
    public fun acceleratorName(acceleratorKey: guint, acceleratorMods: ModifierType): String =
        gtk_accelerator_name(acceleratorKey, acceleratorMods.mask)?.toKString() ?: error("Expected not null string")

    /**
     * Converts an accelerator keyval and modifier mask
     * into a string parseable by gtk_accelerator_parse_with_keycode().
     *
     * This is similar to [func@Gtk.accelerator_name] but handling keycodes.
     * This is only useful for system-level components, applications
     * should use [func@Gtk.accelerator_name] instead.
     *
     * @param display a `GdkDisplay` or null to use the default display
     * @param acceleratorKey accelerator keyval
     * @param keycode accelerator keycode
     * @param acceleratorMods accelerator modifier mask
     * @return a newly allocated accelerator name.
     */
    public fun acceleratorNameWithKeycode(
        display: Display? = null,
        acceleratorKey: guint,
        keycode: guint,
        acceleratorMods: ModifierType,
    ): String = gtk_accelerator_name_with_keycode(
        display?.gdkDisplayPointer,
        acceleratorKey,
        keycode,
        acceleratorMods.mask
    )?.toKString()
        ?: error("Expected not null string")

    /**
     * Determines whether a given keyval and modifier mask constitute
     * a valid keyboard accelerator.
     *
     * For example, the %GDK_KEY_a keyval plus %GDK_CONTROL_MASK mark is valid,
     * and matches the “Ctrl+a” accelerator. But, you can't, for instance, use
     * the %GDK_KEY_Control_L keyval as an accelerator.
     *
     * @param keyval a GDK keyval
     * @param modifiers modifier mask
     * @return true if the accelerator is valid
     */
    public fun acceleratorValid(keyval: guint, modifiers: ModifierType): Boolean =
        gtk_accelerator_valid(keyval, modifiers.mask).asBoolean()

    /**
     * Checks that the GTK library in use is compatible with the
     * given version.
     *
     * Generally you would pass in the constants %GTK_MAJOR_VERSION,
     * %GTK_MINOR_VERSION, %GTK_MICRO_VERSION as the three arguments
     * to this function; that produces a check that the library in
     * use is compatible with the version of GTK the application or
     * module was compiled against.
     *
     * Compatibility is defined by two things: first the version
     * of the running library is newer than the version
     * @required_major.required_minor.@required_micro. Second
     * the running library must be binary compatible with the
     * version @required_major.required_minor.@required_micro
     * (same major version.)
     *
     * This function is primarily for GTK modules; the module
     * can call this function to check that it wasn’t loaded
     * into an incompatible version of GTK. However, such a
     * check isn’t completely reliable, since the module may be
     * linked against an old version of GTK and calling the
     * old version of gtk_check_version(), but still get loaded
     * into an application using a newer version of GTK.
     *
     * @param requiredMajor the required major version
     * @param requiredMinor the required minor version
     * @param requiredMicro the required micro version
     * @return null if the GTK library is compatible with the
     *   given version, or a string describing the version mismatch.
     *   The returned string is owned by GTK and should not be modified
     *   or freed.
     */
    public fun checkVersion(requiredMajor: guint, requiredMinor: guint, requiredMicro: guint): String? =
        gtk_check_version(requiredMajor, requiredMinor, requiredMicro)?.toKString()

    public fun cssParserErrorQuark(): Quark = gtk_css_parser_error_quark()

    public fun cssParserWarningQuark(): Quark = gtk_css_parser_warning_quark()

    /**
     * Prevents [func@Gtk.init] and [func@Gtk.init_check] from automatically calling
     * `setlocale (LC_ALL, "")`.
     *
     * You would want to use this function if you wanted to set the locale for
     * your program to something other than the user’s locale, or if
     * you wanted to set different values for different locale categories.
     *
     * Most programs should not need to call this function.
     */
    public fun disableSetlocale(): Unit = gtk_disable_setlocale()

    /**
     * Calls a function for all `GtkPrinter`s.
     *
     * If @func returns true, the enumeration is stopped.
     *
     * @param func a function to call for each printer
     * @param wait if true, wait in a recursive mainloop until
     *    all printers are enumerated; otherwise return early
     */
    public fun enumeratePrinters(func: PrinterFunc, wait: Boolean): Unit = gtk_enumerate_printers(
        PrinterFuncFunc.reinterpret(),
        StableRef.create(func).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        wait.asGBoolean()
    )

    /**
     * Returns the binary age as passed to `libtool`.
     *
     * If `libtool` means nothing to you, don't worry about it.
     *
     * @return the binary age of the GTK library
     */
    public fun getBinaryAge(): guint = gtk_get_binary_age()

    /**
     * Returns the GTK debug flags that are currently active.
     *
     * This function is intended for GTK modules that want
     * to adjust their debug output based on GTK debug flags.
     *
     * @return the GTK debug flags.
     */
    public fun getDebugFlags(): DebugFlags = gtk_get_debug_flags().run {
        DebugFlags(this)
    }

    /**
     * Returns the `PangoLanguage` for the default language
     * currently in effect.
     *
     * Note that this can change over the life of an
     * application.
     *
     * The default language is derived from the current
     * locale. It determines, for example, whether GTK uses
     * the right-to-left or left-to-right text direction.
     *
     * This function is equivalent to [func@Pango.Language.get_default].
     * See that function for details.
     *
     * @return the default language
     */
    public fun getDefaultLanguage(): Language = gtk_get_default_language()!!.run {
        Language(this)
    }

    /**
     * Returns the interface age as passed to `libtool`.
     *
     * If `libtool` means nothing to you, don't worry about it.
     *
     * @return the interface age of the GTK library
     */
    public fun getInterfaceAge(): guint = gtk_get_interface_age()

    /**
     * Get the direction of the current locale. This is the expected
     * reading direction for text and UI.
     *
     * This function depends on the current locale being set with
     * setlocale() and will default to setting the %GTK_TEXT_DIR_LTR
     * direction otherwise. %GTK_TEXT_DIR_NONE will never be returned.
     *
     * GTK sets the default text direction according to the locale
     * during gtk_init(), and you should normally use
     * gtk_widget_get_direction() or gtk_widget_get_default_direction()
     * to obtain the current direction.
     *
     * This function is only needed rare cases when the locale is
     * changed after GTK has already been initialized. In this case,
     * you can use it to update the default text direction as follows:
     *
     * |[<!-- language="C" -->
     * #include <locale.h>
     *
     * static void
     * update_locale (const char *new_locale)
     * {
     *   setlocale (LC_ALL, new_locale);
     *   gtk_widget_set_default_direction (gtk_get_locale_direction ());
     * }
     * ]|
     *
     * @return the direction of the current locale
     */
    public fun getLocaleDirection(): TextDirection = gtk_get_locale_direction().run {
        TextDirection.fromNativeValue(this)
    }

    /**
     * Returns the major version number of the GTK library.
     *
     * For example, in GTK version 3.1.5 this is 3.
     *
     * This function is in the library, so it represents the GTK library
     * your code is running against. Contrast with the %GTK_MAJOR_VERSION
     * macro, which represents the major version of the GTK headers you
     * have included when compiling your code.
     *
     * @return the major version number of the GTK library
     */
    public fun getMajorVersion(): guint = gtk_get_major_version()

    /**
     * Returns the micro version number of the GTK library.
     *
     * For example, in GTK version 3.1.5 this is 5.
     *
     * This function is in the library, so it represents the GTK library
     * your code is are running against. Contrast with the
     * %GTK_MICRO_VERSION macro, which represents the micro version of the
     * GTK headers you have included when compiling your code.
     *
     * @return the micro version number of the GTK library
     */
    public fun getMicroVersion(): guint = gtk_get_micro_version()

    /**
     * Returns the minor version number of the GTK library.
     *
     * For example, in GTK version 3.1.5 this is 1.
     *
     * This function is in the library, so it represents the GTK library
     * your code is are running against. Contrast with the
     * %GTK_MINOR_VERSION macro, which represents the minor version of the
     * GTK headers you have included when compiling your code.
     *
     * @return the minor version number of the GTK library
     */
    public fun getMinorVersion(): guint = gtk_get_minor_version()

    /**
     * Call this function before using any other GTK functions in your GUI
     * applications. It will initialize everything needed to operate the
     * toolkit.
     *
     * If you are using `GtkApplication`, you usually don't have to call this
     * function; the `GApplication::startup` handler does it for you. Though,
     * if you are using GApplication methods that will be invoked before `startup`,
     * such as `local_command_line`, you may need to initialize stuff explicitly.
     *
     * This function will terminate your program if it was unable to
     * initialize the windowing system for some reason. If you want
     * your program to fall back to a textual interface, call
     * [func@Gtk.init_check] instead.
     *
     * GTK calls `signal (SIGPIPE, SIG_IGN)` during initialization, to ignore
     * SIGPIPE signals, since these are almost never wanted in graphical
     * applications. If you do need to handle SIGPIPE for some reason, reset
     * the handler after gtk_init(), but notice that other libraries (e.g.
     * libdbus or gvfs) might do similar things.
     */
    public fun `init`(): Unit = gtk_init()

    /**
     * This function does the same work as gtk_init() with only a single
     * change: It does not terminate the program if the windowing system
     * can’t be initialized. Instead it returns false on failure.
     *
     * This way the application can fall back to some other means of
     * communication with the user - for example a curses or command line
     * interface.
     *
     * @return true if the windowing system has been successfully
     *   initialized, false otherwise
     */
    public fun initCheck(): Boolean = gtk_init_check().asBoolean()

    /**
     * Use this function to check if GTK has been initialized.
     *
     * See [func@Gtk.init].
     *
     * @return the initialization status
     */
    public fun isInitialized(): Boolean = gtk_is_initialized().asBoolean()

    /**
     * Creates a new `GParamSpec` instance for a property holding a `GtkExpression`.
     *
     * See `g_param_spec_internal()` for details on the property strings.
     *
     * @param name canonical name of the property
     * @param nick a user-readable name for the property
     * @param blurb a user-readable description of the property
     * @param flags flags for the property
     * @return a newly created property specification
     */
    public fun paramSpecExpression(name: String, nick: String, blurb: String, flags: ParamFlags): ParamSpec =
        gtk_param_spec_expression(name, nick, blurb, flags.mask)!!.run {
            ParamSpec.ParamSpecImpl(this)
        }

    /**
     * Runs a page setup dialog, letting the user modify the values from
     * @page_setup. If the user cancels the dialog, the returned `GtkPageSetup`
     * is identical to the passed in @page_setup, otherwise it contains the
     * modifications done in the dialog.
     *
     * Note that this function may use a recursive mainloop to show the page
     * setup dialog. See gtk_print_run_page_setup_dialog_async() if this is
     * a problem.
     *
     * @param parent transient parent
     * @param pageSetup an existing `GtkPageSetup`
     * @param settings a `GtkPrintSettings`
     * @return a new `GtkPageSetup`
     */
    public fun printRunPageSetupDialog(
        parent: Window? = null,
        pageSetup: PageSetup? = null,
        settings: PrintSettings,
    ): PageSetup = gtk_print_run_page_setup_dialog(
        parent?.gtkWindowPointer,
        pageSetup?.gtkPageSetupPointer,
        settings.gtkPrintSettingsPointer
    )!!.run {
        PageSetup(this)
    }

    /**
     * Runs a page setup dialog, letting the user modify the values from @page_setup.
     *
     * In contrast to gtk_print_run_page_setup_dialog(), this function  returns after
     * showing the page setup dialog on platforms that support this, and calls @done_cb
     * from a signal handler for the ::response signal of the dialog.
     *
     * @param parent transient parent
     * @param pageSetup an existing `GtkPageSetup`
     * @param settings a `GtkPrintSettings`
     * @param doneCb a function to call when the user saves
     *    the modified page setup
     */
    public fun printRunPageSetupDialogAsync(
        parent: Window? = null,
        pageSetup: PageSetup? = null,
        settings: PrintSettings,
        doneCb: PageSetupDoneFunc,
    ): Unit = gtk_print_run_page_setup_dialog_async(
        parent?.gtkWindowPointer,
        pageSetup?.gtkPageSetupPointer,
        settings.gtkPrintSettingsPointer,
        PageSetupDoneFuncFunc.reinterpret(),
        StableRef.create(doneCb).asCPointer()
    )

    /**
     * Renders an activity indicator (such as in `GtkSpinner`).
     * The state %GTK_STATE_FLAG_CHECKED determines whether there is
     * activity going on.
     *
     * @param context a `GtkStyleContext`
     * @param cr a `cairo_t`
     * @param x X origin of the rectangle
     * @param y Y origin of the rectangle
     * @param width rectangle width
     * @param height rectangle height
     */
    public fun renderActivity(
        context: StyleContext,
        cr: Context,
        x: gdouble,
        y: gdouble,
        width: gdouble,
        height: gdouble,
    ): Unit = gtk_render_activity(context.gtkStyleContextPointer, cr.cairoContextPointer, x, y, width, height)

    /**
     * Renders an arrow pointing to @angle.
     *
     * Typical arrow rendering at 0, 1⁄2 π;, π; and 3⁄2 π:
     *
     * ![](arrows.png)
     *
     * @param context a `GtkStyleContext`
     * @param cr a `cairo_t`
     * @param angle arrow angle from 0 to 2 * %G_PI, being 0 the arrow pointing to the north
     * @param x X origin of the render area
     * @param y Y origin of the render area
     * @param size square side for render area
     */
    public fun renderArrow(
        context: StyleContext,
        cr: Context,
        angle: gdouble,
        x: gdouble,
        y: gdouble,
        size: gdouble,
    ): Unit = gtk_render_arrow(context.gtkStyleContextPointer, cr.cairoContextPointer, angle, x, y, size)

    /**
     * Renders the background of an element.
     *
     * Typical background rendering, showing the effect of
     * `background-image`, `border-width` and `border-radius`:
     *
     * ![](background.png)
     *
     * @param context a `GtkStyleContext`
     * @param cr a `cairo_t`
     * @param x X origin of the rectangle
     * @param y Y origin of the rectangle
     * @param width rectangle width
     * @param height rectangle height
     */
    public fun renderBackground(
        context: StyleContext,
        cr: Context,
        x: gdouble,
        y: gdouble,
        width: gdouble,
        height: gdouble,
    ): Unit = gtk_render_background(context.gtkStyleContextPointer, cr.cairoContextPointer, x, y, width, height)

    /**
     * Renders a checkmark (as in a `GtkCheckButton`).
     *
     * The %GTK_STATE_FLAG_CHECKED state determines whether the check is
     * on or off, and %GTK_STATE_FLAG_INCONSISTENT determines whether it
     * should be marked as undefined.
     *
     * Typical checkmark rendering:
     *
     * ![](checks.png)
     *
     * @param context a `GtkStyleContext`
     * @param cr a `cairo_t`
     * @param x X origin of the rectangle
     * @param y Y origin of the rectangle
     * @param width rectangle width
     * @param height rectangle height
     */
    public fun renderCheck(
        context: StyleContext,
        cr: Context,
        x: gdouble,
        y: gdouble,
        width: gdouble,
        height: gdouble,
    ): Unit = gtk_render_check(context.gtkStyleContextPointer, cr.cairoContextPointer, x, y, width, height)

    /**
     * Renders an expander (as used in `GtkTreeView` and `GtkExpander`) in the area
     * defined by @x, @y, @width, @height. The state %GTK_STATE_FLAG_CHECKED
     * determines whether the expander is collapsed or expanded.
     *
     * Typical expander rendering:
     *
     * ![](expanders.png)
     *
     * @param context a `GtkStyleContext`
     * @param cr a `cairo_t`
     * @param x X origin of the rectangle
     * @param y Y origin of the rectangle
     * @param width rectangle width
     * @param height rectangle height
     */
    public fun renderExpander(
        context: StyleContext,
        cr: Context,
        x: gdouble,
        y: gdouble,
        width: gdouble,
        height: gdouble,
    ): Unit = gtk_render_expander(context.gtkStyleContextPointer, cr.cairoContextPointer, x, y, width, height)

    /**
     * Renders a focus indicator on the rectangle determined by @x, @y, @width, @height.
     *
     * Typical focus rendering:
     *
     * ![](focus.png)
     *
     * @param context a `GtkStyleContext`
     * @param cr a `cairo_t`
     * @param x X origin of the rectangle
     * @param y Y origin of the rectangle
     * @param width rectangle width
     * @param height rectangle height
     */
    public fun renderFocus(
        context: StyleContext,
        cr: Context,
        x: gdouble,
        y: gdouble,
        width: gdouble,
        height: gdouble,
    ): Unit = gtk_render_focus(context.gtkStyleContextPointer, cr.cairoContextPointer, x, y, width, height)

    /**
     * Renders a frame around the rectangle defined by @x, @y, @width, @height.
     *
     * Examples of frame rendering, showing the effect of `border-image`,
     * `border-color`, `border-width`, `border-radius` and junctions:
     *
     * ![](frames.png)
     *
     * @param context a `GtkStyleContext`
     * @param cr a `cairo_t`
     * @param x X origin of the rectangle
     * @param y Y origin of the rectangle
     * @param width rectangle width
     * @param height rectangle height
     */
    public fun renderFrame(
        context: StyleContext,
        cr: Context,
        x: gdouble,
        y: gdouble,
        width: gdouble,
        height: gdouble,
    ): Unit = gtk_render_frame(context.gtkStyleContextPointer, cr.cairoContextPointer, x, y, width, height)

    /**
     * Renders a handle (as in `GtkPaned` and `GtkWindow`’s resize grip),
     * in the rectangle determined by @x, @y, @width, @height.
     *
     * Handles rendered for the paned and grip classes:
     *
     * ![](handles.png)
     *
     * @param context a `GtkStyleContext`
     * @param cr a `cairo_t`
     * @param x X origin of the rectangle
     * @param y Y origin of the rectangle
     * @param width rectangle width
     * @param height rectangle height
     */
    public fun renderHandle(
        context: StyleContext,
        cr: Context,
        x: gdouble,
        y: gdouble,
        width: gdouble,
        height: gdouble,
    ): Unit = gtk_render_handle(context.gtkStyleContextPointer, cr.cairoContextPointer, x, y, width, height)

    /**
     * Renders the icon in @texture at the specified @x and @y coordinates.
     *
     * This function will render the icon in @texture at exactly its size,
     * regardless of scaling factors, which may not be appropriate when
     * drawing on displays with high pixel densities.
     *
     * @param context a `GtkStyleContext`
     * @param cr a `cairo_t`
     * @param texture a `GdkTexture` containing the icon to draw
     * @param x X position for the @texture
     * @param y Y position for the @texture
     */
    public fun renderIcon(context: StyleContext, cr: Context, texture: Texture, x: gdouble, y: gdouble): Unit =
        gtk_render_icon(context.gtkStyleContextPointer, cr.cairoContextPointer, texture.gdkTexturePointer, x, y)

    /**
     * Renders @layout on the coordinates @x, @y
     *
     * @param context a `GtkStyleContext`
     * @param cr a `cairo_t`
     * @param x X origin
     * @param y Y origin
     * @param layout the `PangoLayout` to render
     */
    public fun renderLayout(context: StyleContext, cr: Context, x: gdouble, y: gdouble, layout: Layout): Unit =
        gtk_render_layout(context.gtkStyleContextPointer, cr.cairoContextPointer, x, y, layout.pangoLayoutPointer)

    /**
     * Renders a line from (x0, y0) to (x1, y1).
     *
     * @param context a `GtkStyleContext`
     * @param cr a `cairo_t`
     * @param x0 X coordinate for the origin of the line
     * @param y0 Y coordinate for the origin of the line
     * @param x1 X coordinate for the end of the line
     * @param y1 Y coordinate for the end of the line
     */
    public fun renderLine(
        context: StyleContext,
        cr: Context,
        x0: gdouble,
        y0: gdouble,
        x1: gdouble,
        y1: gdouble,
    ): Unit = gtk_render_line(context.gtkStyleContextPointer, cr.cairoContextPointer, x0, y0, x1, y1)

    /**
     * Renders an option mark (as in a radio button), the %GTK_STATE_FLAG_CHECKED
     * state will determine whether the option is on or off, and
     * %GTK_STATE_FLAG_INCONSISTENT whether it should be marked as undefined.
     *
     * Typical option mark rendering:
     *
     * ![](options.png)
     *
     * @param context a `GtkStyleContext`
     * @param cr a `cairo_t`
     * @param x X origin of the rectangle
     * @param y Y origin of the rectangle
     * @param width rectangle width
     * @param height rectangle height
     */
    public fun renderOption(
        context: StyleContext,
        cr: Context,
        x: gdouble,
        y: gdouble,
        width: gdouble,
        height: gdouble,
    ): Unit = gtk_render_option(context.gtkStyleContextPointer, cr.cairoContextPointer, x, y, width, height)

    /**
     * Sets the GTK debug flags.
     *
     * @param flags the debug flags to set
     */
    public fun setDebugFlags(flags: DebugFlags): Unit = gtk_set_debug_flags(flags.mask)

    /**
     * This function launches the default application for showing
     * a given uri, or shows an error dialog if that fails.
     *
     * @param parent parent window
     * @param uri the uri to show
     * @param timestamp timestamp from the event that triggered this call, or %GDK_CURRENT_TIME
     */
    public fun showUri(parent: Window? = null, uri: String, timestamp: guint): Unit =
        gtk_show_uri(parent?.gtkWindowPointer, uri, timestamp)

    /**
     * This function launches the default application for showing
     * a given uri.
     *
     * The @callback will be called when the launch is completed.
     * It should call gtk_show_uri_full_finish() to obtain the result.
     *
     * This is the recommended call to be used as it passes information
     * necessary for sandbox helpers to parent their dialogs properly.
     *
     * @param parent parent window
     * @param uri the uri to show
     * @param timestamp timestamp from the event that triggered this call, or %GDK_CURRENT_TIME
     * @param cancellable a `GCancellable` to cancel the launch
     * @param callback a callback to call when the action is complete
     */
    public fun showUriFull(
        parent: Window? = null,
        uri: String,
        timestamp: guint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = gtk_show_uri_full(
        parent?.gtkWindowPointer,
        uri,
        timestamp,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finishes the gtk_show_uri() call and returns the result
     * of the operation.
     *
     * @param parent the `GtkWindow` passed to gtk_show_uri()
     * @param result `GAsyncResult` that was passed to @callback
     * @return true if the URI was shown successfully.
     *   Otherwise, false is returned and @error is set
     */
    public fun showUriFullFinish(parent: Window, result: AsyncResult): Result<Boolean> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gtk_show_uri_full_finish(
            parent.gtkWindowPointer,
            result.gioAsyncResultPointer,
            gError.ptr
        ).asBoolean()
        return if (gError.pointed != null) {
            Result.failure(org.gtkkn.bindings.gtk.Gtk.resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(gResult)
        }
    }

    public fun testAccessibleAssertionMessageRole(
        domain: String,
        `file`: String,
        line: gint,
        func: String,
        expr: String,
        accessible: Accessible,
        expectedRole: AccessibleRole,
        actualRole: AccessibleRole,
    ): Unit = gtk_test_accessible_assertion_message_role(
        domain,
        `file`,
        line,
        func,
        expr,
        accessible.gtkAccessiblePointer,
        expectedRole.nativeValue,
        actualRole.nativeValue
    )

    /**
     * Checks whether the `GtkAccessible` has @property set.
     *
     * @param accessible a `GtkAccessible`
     * @param property a `GtkAccessibleProperty`
     * @return true if the @property is set in the @accessible
     */
    public fun testAccessibleHasProperty(accessible: Accessible, `property`: AccessibleProperty): Boolean =
        gtk_test_accessible_has_property(accessible.gtkAccessiblePointer, `property`.nativeValue).asBoolean()

    /**
     * Checks whether the `GtkAccessible` has @relation set.
     *
     * @param accessible a `GtkAccessible`
     * @param relation a `GtkAccessibleRelation`
     * @return true if the @relation is set in the @accessible
     */
    public fun testAccessibleHasRelation(accessible: Accessible, relation: AccessibleRelation): Boolean =
        gtk_test_accessible_has_relation(accessible.gtkAccessiblePointer, relation.nativeValue).asBoolean()

    /**
     * Checks whether the `GtkAccessible:accessible-role` of the accessible
     * is @role.
     *
     * @param accessible a `GtkAccessible`
     * @param role a `GtkAccessibleRole`
     * @return true if the role matches
     */
    public fun testAccessibleHasRole(accessible: Accessible, role: AccessibleRole): Boolean =
        gtk_test_accessible_has_role(accessible.gtkAccessiblePointer, role.nativeValue).asBoolean()

    /**
     * Checks whether the `GtkAccessible` has @state set.
     *
     * @param accessible a `GtkAccessible`
     * @param state a `GtkAccessibleState`
     * @return true if the @state is set in the @accessible
     */
    public fun testAccessibleHasState(accessible: Accessible, state: AccessibleState): Boolean =
        gtk_test_accessible_has_state(accessible.gtkAccessiblePointer, state.nativeValue).asBoolean()

    /**
     * Force registration of all core GTK object types.
     *
     * This allows to refer to any of those object types via
     * g_type_from_name() after calling this function.
     */
    public fun testRegisterAllTypes(): Unit = gtk_test_register_all_types()

    /**
     * Enters the main loop and waits for @widget to be “drawn”.
     *
     * In this context that means it waits for the frame clock of
     * @widget to have run a full styling, layout and drawing cycle.
     *
     * This function is intended to be used for syncing with actions that
     * depend on @widget relayouting or on interaction with the display
     * server.
     *
     * @param widget the widget to wait for
     */
    public fun testWidgetWaitForDraw(widget: Widget): Unit = gtk_test_widget_wait_for_draw(widget.gtkWidgetPointer)

    /**
     * Creates a content provider for dragging @path from @tree_model.
     *
     * @param treeModel a `GtkTreeModel`
     * @param path a row in @tree_model
     * @return a new `GdkContentProvider`
     */
    public fun treeCreateRowDragContent(treeModel: TreeModel, path: TreePath): ContentProvider =
        gtk_tree_create_row_drag_content(treeModel.gtkTreeModelPointer, path.gtkTreePathPointer)!!.run {
            ContentProvider(this)
        }

    /**
     * Retrieves the `GtkExpression` stored inside the given `value`, and acquires
     * a reference to it.
     *
     * @param value a `GValue` initialized with type `GTK_TYPE_EXPRESSION`
     * @return a `GtkExpression`
     */
    public fun valueDupExpression(`value`: Value): Expression? =
        gtk_value_dup_expression(`value`.gobjectValuePointer)?.run {
            Expression.ExpressionImpl(this)
        }

    /**
     * Retrieves the `GtkExpression` stored inside the given `value`.
     *
     * @param value a `GValue` initialized with type `GTK_TYPE_EXPRESSION`
     * @return a `GtkExpression`
     */
    public fun valueGetExpression(`value`: Value): Expression? =
        gtk_value_get_expression(`value`.gobjectValuePointer)?.run {
            Expression.ExpressionImpl(this)
        }

    /**
     * Stores the given `GtkExpression` inside `value`.
     *
     * The `GValue` will acquire a reference to the `expression`.
     *
     * @param value a `GValue` initialized with type `GTK_TYPE_EXPRESSION`
     * @param expression a `GtkExpression`
     */
    public fun valueSetExpression(`value`: Value, expression: Expression): Unit =
        gtk_value_set_expression(`value`.gobjectValuePointer, expression.gtkExpressionPointer)

    /**
     * Stores the given `GtkExpression` inside `value`.
     *
     * This function transfers the ownership of the `expression` to the `GValue`.
     *
     * @param value a `GValue` initialized with type `GTK_TYPE_EXPRESSION`
     * @param expression a `GtkExpression`
     */
    public fun valueTakeExpression(`value`: Value, expression: Expression? = null): Unit =
        gtk_value_take_expression(`value`.gobjectValuePointer, expression?.gtkExpressionPointer)

    public fun resolveException(error: Error): GLibException {
        val ex = when (error.domain) {
            BuilderError.quark() -> BuilderError.fromErrorOrNull(error)
                ?.let {
                    BuilderErrorException(error, it)
                }
            ConstraintVflParserError.quark() -> ConstraintVflParserError.fromErrorOrNull(error)
                ?.let {
                    ConstraintVflParserErrorException(error, it)
                }
            CssParserError.quark() -> CssParserError.fromErrorOrNull(error)
                ?.let {
                    CssParserErrorException(error, it)
                }
            DialogError.quark() -> DialogError.fromErrorOrNull(error)
                ?.let {
                    DialogErrorException(error, it)
                }
            FileChooserError.quark() -> FileChooserError.fromErrorOrNull(error)
                ?.let {
                    FileChooserErrorException(error, it)
                }
            IconThemeError.quark() -> IconThemeError.fromErrorOrNull(error)
                ?.let {
                    IconThemeErrorException(error, it)
                }
            PrintError.quark() -> PrintError.fromErrorOrNull(error)
                ?.let {
                    PrintErrorException(error, it)
                }
            RecentManagerError.quark() -> RecentManagerError.fromErrorOrNull(error)
                ?.let {
                    RecentManagerErrorException(error, it)
                }
            else -> null
        }
        return ex ?: GLibException(error)
    }
}

public val AssistantPageFuncFunc: CPointer<CFunction<(gint) -> gint>> = staticCFunction {
        currentPage: gint,
        `data`: gpointer?,
    ->
    data!!.asStableRef<(currentPage: gint) -> gint>().get().invoke(currentPage)
}
    .reinterpret()

public val CellAllocCallbackFunc: CPointer<
    CFunction<
        (
            CPointer<GtkCellRenderer>,
            CPointer<GdkRectangle>,
            CPointer<GdkRectangle>,
        ) -> gboolean
        >
    > = staticCFunction {
        renderer: CPointer<GtkCellRenderer>?,
        cellArea: CPointer<GdkRectangle>?,
        cellBackground: CPointer<GdkRectangle>?,
        `data`: gpointer?,
    ->
    data!!.asStableRef<
        (
            renderer: CellRenderer,
            cellArea: Rectangle,
            cellBackground: Rectangle,
        ) -> Boolean
        >().get().invoke(
        renderer!!.run {
            CellRenderer.CellRendererImpl(this)
        },
        cellArea!!.run {
            Rectangle(this)
        },
        cellBackground!!.run {
            Rectangle(this)
        }
    ).asGBoolean()
}
    .reinterpret()

public val CellCallbackFunc: CPointer<CFunction<(CPointer<GtkCellRenderer>) -> gboolean>> =
    staticCFunction {
            renderer: CPointer<GtkCellRenderer>?,
            `data`: gpointer?,
        ->
        data!!.asStableRef<(renderer: CellRenderer) -> Boolean>().get().invoke(
            renderer!!.run {
                CellRenderer.CellRendererImpl(this)
            }
        ).asGBoolean()
    }
        .reinterpret()

public val CellLayoutDataFuncFunc: CPointer<
    CFunction<
        (
            CPointer<GtkCellLayout>,
            CPointer<GtkCellRenderer>,
            CPointer<GtkTreeModel>,
            CPointer<GtkTreeIter>,
        ) -> Unit
        >
    > = staticCFunction {
        cellLayout: CPointer<GtkCellLayout>?,
        cell: CPointer<GtkCellRenderer>?,
        treeModel: CPointer<GtkTreeModel>?,
        iter: CPointer<GtkTreeIter>?,
        `data`: gpointer?,
    ->
    data!!.asStableRef<
        (
            cellLayout: CellLayout,
            cell: CellRenderer,
            treeModel: TreeModel,
            iter: TreeIter,
        ) -> Unit
        >().get().invoke(
        cellLayout!!.run {
            CellLayout.CellLayoutImpl(reinterpret())
        },
        cell!!.run {
            CellRenderer.CellRendererImpl(this)
        },
        treeModel!!.run {
            TreeModel.TreeModelImpl(reinterpret())
        },
        iter!!.run {
            TreeIter(this)
        }
    )
}
    .reinterpret()

public val CustomFilterFuncFunc: CPointer<CFunction<(CPointer<GObject>) -> gboolean>> =
    staticCFunction {
            item: CPointer<GObject>?,
            userData: gpointer?,
        ->
        userData!!.asStableRef<(item: Object) -> Boolean>().get().invoke(
            item!!.run {
                Object(reinterpret())
            }
        ).asGBoolean()
    }
        .reinterpret()

public val DrawingAreaDrawFuncFunc: CPointer<
    CFunction<
        (
            CPointer<GtkDrawingArea>,
            CPointer<cairo_t>,
            gint,
            gint,
        ) -> Unit
        >
    > = staticCFunction {
        drawingArea: CPointer<GtkDrawingArea>?,
        cr: CPointer<cairo_t>?,
        width: gint,
        height: gint,
        userData: gpointer?,
    ->
    userData!!.asStableRef<
        (
            drawingArea: DrawingArea,
            cr: Context,
            width: gint,
            height: gint,
        ) -> Unit
        >().get().invoke(
        drawingArea!!.run {
            DrawingArea(this)
        },
        cr!!.run {
            Context(this)
        },
        width,
        height
    )
}
    .reinterpret()

public val EntryCompletionMatchFuncFunc: CPointer<
    CFunction<
        (
            CPointer<GtkEntryCompletion>,
            CPointer<ByteVar>,
            CPointer<GtkTreeIter>,
        ) -> gboolean
        >
    > = staticCFunction {
        completion: CPointer<GtkEntryCompletion>?,
        key: CPointer<ByteVar>?,
        iter: CPointer<GtkTreeIter>?,
        userData: gpointer?,
    ->
    userData!!.asStableRef<
        (
            completion: EntryCompletion,
            key: String,
            iter: TreeIter,
        ) -> Boolean
        >().get().invoke(
        completion!!.run {
            EntryCompletion(this)
        },
        key?.toKString() ?: error("Expected not null string"),
        iter!!.run {
            TreeIter(this)
        }
    ).asGBoolean()
}
    .reinterpret()

public val ExpressionNotifyFunc: CPointer<CFunction<() -> Unit>> = staticCFunction { userData: gpointer? ->
    userData!!.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

public val FlowBoxCreateWidgetFuncFunc:
    CPointer<CFunction<(CPointer<GObject>) -> CPointer<GtkWidget>>> = staticCFunction {
            item: CPointer<GObject>?,
            userData: gpointer?,
        ->
        userData!!.asStableRef<(item: Object) -> Widget>().get().invoke(
            item!!.run {
                Object(reinterpret())
            }
        ).gtkWidgetPointer
    }
        .reinterpret()

public val FlowBoxFilterFuncFunc: CPointer<CFunction<(CPointer<GtkFlowBoxChild>) -> gboolean>> =
    staticCFunction {
            child: CPointer<GtkFlowBoxChild>?,
            userData: gpointer?,
        ->
        userData!!.asStableRef<(child: FlowBoxChild) -> Boolean>().get().invoke(
            child!!.run {
                FlowBoxChild(this)
            }
        ).asGBoolean()
    }
        .reinterpret()

public val FlowBoxForeachFuncFunc:
    CPointer<CFunction<(CPointer<GtkFlowBox>, CPointer<GtkFlowBoxChild>) -> Unit>> =
    staticCFunction {
            box: CPointer<GtkFlowBox>?,
            child: CPointer<GtkFlowBoxChild>?,
            userData: gpointer?,
        ->
        userData!!.asStableRef<(box: FlowBox, child: FlowBoxChild) -> Unit>().get().invoke(
            box!!.run {
                FlowBox(this)
            },
            child!!.run {
                FlowBoxChild(this)
            }
        )
    }
        .reinterpret()

public val FlowBoxSortFuncFunc:
    CPointer<CFunction<(CPointer<GtkFlowBoxChild>, CPointer<GtkFlowBoxChild>) -> gint>> =
    staticCFunction {
            child1: CPointer<GtkFlowBoxChild>?,
            child2: CPointer<GtkFlowBoxChild>?,
            userData: gpointer?,
        ->
        userData!!.asStableRef<(child1: FlowBoxChild, child2: FlowBoxChild) -> gint>().get().invoke(
            child1!!.run {
                FlowBoxChild(this)
            },
            child2!!.run {
                FlowBoxChild(this)
            }
        )
    }
        .reinterpret()

public val FontFilterFuncFunc:
    CPointer<CFunction<(CPointer<PangoFontFamily>, CPointer<PangoFontFace>) -> gboolean>> =
    staticCFunction {
            family: CPointer<PangoFontFamily>?,
            face: CPointer<PangoFontFace>?,
            `data`: gpointer?,
        ->
        data!!.asStableRef<(family: FontFamily, face: FontFace) -> Boolean>().get().invoke(
            family!!.run {
                FontFamily.FontFamilyImpl(this)
            },
            face!!.run {
                FontFace.FontFaceImpl(this)
            }
        ).asGBoolean()
    }
        .reinterpret()

public val IconViewForeachFuncFunc:
    CPointer<CFunction<(CPointer<GtkIconView>, CPointer<GtkTreePath>) -> Unit>> =
    staticCFunction {
            iconView: CPointer<GtkIconView>?,
            path: CPointer<GtkTreePath>?,
            `data`: gpointer?,
        ->
        data!!.asStableRef<(iconView: IconView, path: TreePath) -> Unit>().get().invoke(
            iconView!!.run {
                IconView(this)
            },
            path!!.run {
                TreePath(this)
            }
        )
    }
        .reinterpret()

public val ListBoxCreateWidgetFuncFunc:
    CPointer<CFunction<(CPointer<GObject>) -> CPointer<GtkWidget>>> = staticCFunction {
            item: CPointer<GObject>?,
            userData: gpointer?,
        ->
        userData!!.asStableRef<(item: Object) -> Widget>().get().invoke(
            item!!.run {
                Object(reinterpret())
            }
        ).gtkWidgetPointer
    }
        .reinterpret()

public val ListBoxFilterFuncFunc: CPointer<CFunction<(CPointer<GtkListBoxRow>) -> gboolean>> =
    staticCFunction {
            row: CPointer<GtkListBoxRow>?,
            userData: gpointer?,
        ->
        userData!!.asStableRef<(row: ListBoxRow) -> Boolean>().get().invoke(
            row!!.run {
                ListBoxRow(this)
            }
        ).asGBoolean()
    }
        .reinterpret()

public val ListBoxForeachFuncFunc:
    CPointer<CFunction<(CPointer<GtkListBox>, CPointer<GtkListBoxRow>) -> Unit>> =
    staticCFunction {
            box: CPointer<GtkListBox>?,
            row: CPointer<GtkListBoxRow>?,
            userData: gpointer?,
        ->
        userData!!.asStableRef<(box: ListBox, row: ListBoxRow) -> Unit>().get().invoke(
            box!!.run {
                ListBox(this)
            },
            row!!.run {
                ListBoxRow(this)
            }
        )
    }
        .reinterpret()

public val ListBoxSortFuncFunc:
    CPointer<CFunction<(CPointer<GtkListBoxRow>, CPointer<GtkListBoxRow>) -> gint>> =
    staticCFunction {
            row1: CPointer<GtkListBoxRow>?,
            row2: CPointer<GtkListBoxRow>?,
            userData: gpointer?,
        ->
        userData!!.asStableRef<(row1: ListBoxRow, row2: ListBoxRow) -> gint>().get().invoke(
            row1!!.run {
                ListBoxRow(this)
            },
            row2!!.run {
                ListBoxRow(this)
            }
        )
    }
        .reinterpret()

public val ListBoxUpdateHeaderFuncFunc:
    CPointer<CFunction<(CPointer<GtkListBoxRow>, CPointer<GtkListBoxRow>?) -> Unit>> =
    staticCFunction {
            row: CPointer<GtkListBoxRow>?,
            before: CPointer<GtkListBoxRow>?,
            userData: gpointer?,
        ->
        userData!!.asStableRef<(row: ListBoxRow, before: ListBoxRow?) -> Unit>().get().invoke(
            row!!.run {
                ListBoxRow(this)
            },
            before?.run {
                ListBoxRow(this)
            }
        )
    }
        .reinterpret()

public val MapListModelMapFuncFunc: CPointer<CFunction<(CPointer<GObject>) -> CPointer<GObject>>> =
    staticCFunction {
            item: CPointer<GObject>?,
            userData: gpointer?,
        ->
        userData!!.asStableRef<(item: Object) -> Object>().get().invoke(
            item!!.run {
                Object(reinterpret())
            }
        ).gobjectObjectPointer
    }
        .reinterpret()

public val MenuButtonCreatePopupFuncFunc: CPointer<CFunction<(CPointer<GtkMenuButton>) -> Unit>> =
    staticCFunction {
            menuButton: CPointer<GtkMenuButton>?,
            userData: gpointer?,
        ->
        userData!!.asStableRef<(menuButton: MenuButton) -> Unit>().get().invoke(
            menuButton!!.run {
                MenuButton(this)
            }
        )
    }
        .reinterpret()

public val PageSetupDoneFuncFunc: CPointer<CFunction<(CPointer<GtkPageSetup>) -> Unit>> =
    staticCFunction {
            pageSetup: CPointer<GtkPageSetup>?,
            `data`: gpointer?,
        ->
        data!!.asStableRef<(pageSetup: PageSetup) -> Unit>().get().invoke(
            pageSetup!!.run {
                PageSetup(this)
            }
        )
    }
        .reinterpret()

public val PrintJobCompleteFuncFunc:
    CPointer<CFunction<(CPointer<GtkPrintJob>, CPointer<org.gtkkn.native.glib.GError>) -> Unit>> =
    staticCFunction {
            printJob: CPointer<GtkPrintJob>?,
            userData: gpointer?,
            error: CPointer<org.gtkkn.native.glib.GError>?,
        ->
        userData!!.asStableRef<(printJob: PrintJob, error: Error) -> Unit>().get().invoke(
            printJob!!.run {
                PrintJob(this)
            },
            error!!.run {
                Error(this)
            }
        )
    }
        .reinterpret()

public val PrintSettingsFuncFunc:
    CPointer<CFunction<(CPointer<ByteVar>, CPointer<ByteVar>) -> Unit>> = staticCFunction {
            key: CPointer<ByteVar>?,
            `value`: CPointer<ByteVar>?,
            userData: gpointer?,
        ->
        userData!!.asStableRef<(key: String, `value`: String) -> Unit>().get().invoke(
            key?.toKString() ?: error("Expected not null string"),
            `value`?.toKString() ?: error("Expected not null string")
        )
    }
        .reinterpret()

public val PrinterFuncFunc: CPointer<CFunction<(CPointer<GtkPrinter>) -> gboolean>> =
    staticCFunction {
            printer: CPointer<GtkPrinter>?,
            `data`: gpointer?,
        ->
        data!!.asStableRef<(printer: Printer) -> Boolean>().get().invoke(
            printer!!.run {
                Printer(this)
            }
        ).asGBoolean()
    }
        .reinterpret()

public val ScaleFormatValueFuncFunc:
    CPointer<CFunction<(CPointer<GtkScale>, gdouble) -> CPointer<ByteVar>>> = staticCFunction {
            scale: CPointer<GtkScale>?,
            `value`: gdouble,
            userData: gpointer?,
        ->
        userData!!.asStableRef<(scale: Scale, `value`: gdouble) -> String>().get().invoke(
            scale!!.run {
                Scale(this)
            },
            `value`
        ).let { g_strdup(it) }
    }
        .reinterpret()

public val ShortcutFuncFunc:
    CPointer<CFunction<(CPointer<GtkWidget>, CPointer<GVariant>?) -> gboolean>> =
    staticCFunction {
            widget: CPointer<GtkWidget>?,
            args: CPointer<GVariant>?,
            userData: gpointer?,
        ->
        userData!!.asStableRef<(widget: Widget, args: Variant?) -> Boolean>().get().invoke(
            widget!!.run {
                Widget.WidgetImpl(this)
            },
            args?.run {
                Variant(this)
            }
        ).asGBoolean()
    }
        .reinterpret()

public val TextCharPredicateFunc: CPointer<CFunction<(gunichar) -> gboolean>> = staticCFunction {
        ch: gunichar,
        userData: gpointer?,
    ->
    userData!!.asStableRef<(ch: gunichar) -> Boolean>().get().invoke(ch).asGBoolean()
}
    .reinterpret()

public val TextTagTableForeachFunc: CPointer<CFunction<(CPointer<GtkTextTag>) -> Unit>> =
    staticCFunction {
            tag: CPointer<GtkTextTag>?,
            `data`: gpointer?,
        ->
        data!!.asStableRef<(tag: TextTag) -> Unit>().get().invoke(
            tag!!.run {
                TextTag(this)
            }
        )
    }
        .reinterpret()

public val TickCallbackFunc:
    CPointer<CFunction<(CPointer<GtkWidget>, CPointer<GdkFrameClock>) -> gboolean>> =
    staticCFunction {
            widget: CPointer<GtkWidget>?,
            frameClock: CPointer<GdkFrameClock>?,
            userData: gpointer?,
        ->
        userData!!.asStableRef<(widget: Widget, frameClock: FrameClock) -> Boolean>().get().invoke(
            widget!!.run {
                Widget.WidgetImpl(this)
            },
            frameClock!!.run {
                FrameClock.FrameClockImpl(this)
            }
        ).asGBoolean()
    }
        .reinterpret()

public val TreeCellDataFuncFunc: CPointer<
    CFunction<
        (
            CPointer<GtkTreeViewColumn>,
            CPointer<GtkCellRenderer>,
            CPointer<GtkTreeModel>,
            CPointer<GtkTreeIter>,
        ) -> Unit
        >
    > = staticCFunction {
        treeColumn: CPointer<GtkTreeViewColumn>?,
        cell: CPointer<GtkCellRenderer>?,
        treeModel: CPointer<GtkTreeModel>?,
        iter: CPointer<GtkTreeIter>?,
        `data`: gpointer?,
    ->
    data!!.asStableRef<
        (
            treeColumn: TreeViewColumn,
            cell: CellRenderer,
            treeModel: TreeModel,
            iter: TreeIter,
        ) -> Unit
        >().get().invoke(
        treeColumn!!.run {
            TreeViewColumn(this)
        },
        cell!!.run {
            CellRenderer.CellRendererImpl(this)
        },
        treeModel!!.run {
            TreeModel.TreeModelImpl(reinterpret())
        },
        iter!!.run {
            TreeIter(this)
        }
    )
}
    .reinterpret()

public val TreeIterCompareFuncFunc: CPointer<
    CFunction<
        (
            CPointer<GtkTreeModel>,
            CPointer<GtkTreeIter>,
            CPointer<GtkTreeIter>,
        ) -> gint
        >
    > = staticCFunction {
        model: CPointer<GtkTreeModel>?,
        a: CPointer<GtkTreeIter>?,
        b: CPointer<GtkTreeIter>?,
        userData: gpointer?,
    ->
    userData!!.asStableRef<
        (
            model: TreeModel,
            a: TreeIter,
            b: TreeIter,
        ) -> gint
        >().get().invoke(
        model!!.run {
            TreeModel.TreeModelImpl(reinterpret())
        },
        a!!.run {
            TreeIter(this)
        },
        b!!.run {
            TreeIter(this)
        }
    )
}
    .reinterpret()

public val TreeListModelCreateModelFuncFunc:
    CPointer<CFunction<(CPointer<GObject>) -> CPointer<GListModel>?>> = staticCFunction {
            item: CPointer<GObject>?,
            userData: gpointer?,
        ->
        userData!!.asStableRef<(item: Object) -> ListModel?>().get().invoke(
            item!!.run {
                Object(reinterpret())
            }
        )?.gioListModelPointer
    }
        .reinterpret()

public val TreeModelFilterModifyFuncFunc: CPointer<
    CFunction<
        (
            CPointer<GtkTreeModel>,
            CPointer<GtkTreeIter>,
            CPointer<GValue>,
            gint,
        ) -> Unit
        >
    > = staticCFunction {
        model: CPointer<GtkTreeModel>?,
        iter: CPointer<GtkTreeIter>?,
        `value`: CPointer<GValue>?,
        column: gint,
        `data`: gpointer?,
    ->
    data!!.asStableRef<
        (
            model: TreeModel,
            iter: TreeIter,
            `value`: Value,
            column: gint,
        ) -> Unit
        >().get().invoke(
        model!!.run {
            TreeModel.TreeModelImpl(reinterpret())
        },
        iter!!.run {
            TreeIter(this)
        },
        `value`!!.run {
            Value(this)
        },
        column
    )
}
    .reinterpret()

public val TreeModelFilterVisibleFuncFunc:
    CPointer<CFunction<(CPointer<GtkTreeModel>, CPointer<GtkTreeIter>) -> gboolean>> =
    staticCFunction {
            model: CPointer<GtkTreeModel>?,
            iter: CPointer<GtkTreeIter>?,
            `data`: gpointer?,
        ->
        data!!.asStableRef<(model: TreeModel, iter: TreeIter) -> Boolean>().get().invoke(
            model!!.run {
                TreeModel.TreeModelImpl(reinterpret())
            },
            iter!!.run {
                TreeIter(this)
            }
        ).asGBoolean()
    }
        .reinterpret()

public val TreeModelForeachFuncFunc: CPointer<
    CFunction<
        (
            CPointer<GtkTreeModel>,
            CPointer<GtkTreePath>,
            CPointer<GtkTreeIter>,
        ) -> gboolean
        >
    > = staticCFunction {
        model: CPointer<GtkTreeModel>?,
        path: CPointer<GtkTreePath>?,
        iter: CPointer<GtkTreeIter>?,
        `data`: gpointer?,
    ->
    data!!.asStableRef<
        (
            model: TreeModel,
            path: TreePath,
            iter: TreeIter,
        ) -> Boolean
        >().get().invoke(
        model!!.run {
            TreeModel.TreeModelImpl(reinterpret())
        },
        path!!.run {
            TreePath(this)
        },
        iter!!.run {
            TreeIter(this)
        }
    ).asGBoolean()
}
    .reinterpret()

public val TreeSelectionForeachFuncFunc: CPointer<
    CFunction<
        (
            CPointer<GtkTreeModel>,
            CPointer<GtkTreePath>,
            CPointer<GtkTreeIter>,
        ) -> Unit
        >
    > = staticCFunction {
        model: CPointer<GtkTreeModel>?,
        path: CPointer<GtkTreePath>?,
        iter: CPointer<GtkTreeIter>?,
        `data`: gpointer?,
    ->
    data!!.asStableRef<
        (
            model: TreeModel,
            path: TreePath,
            iter: TreeIter,
        ) -> Unit
        >().get().invoke(
        model!!.run {
            TreeModel.TreeModelImpl(reinterpret())
        },
        path!!.run {
            TreePath(this)
        },
        iter!!.run {
            TreeIter(this)
        }
    )
}
    .reinterpret()

public val TreeSelectionFuncFunc: CPointer<
    CFunction<
        (
            CPointer<GtkTreeSelection>,
            CPointer<GtkTreeModel>,
            CPointer<GtkTreePath>,
            gboolean,
        ) -> gboolean
        >
    > = staticCFunction {
        selection: CPointer<GtkTreeSelection>?,
        model: CPointer<GtkTreeModel>?,
        path: CPointer<GtkTreePath>?,
        pathCurrentlySelected: gboolean,
        `data`: gpointer?,
    ->
    data!!.asStableRef<
        (
            selection: TreeSelection,
            model: TreeModel,
            path: TreePath,
            pathCurrentlySelected: Boolean,
        ) -> Boolean
        >().get().invoke(
        selection!!.run {
            TreeSelection(this)
        },
        model!!.run {
            TreeModel.TreeModelImpl(reinterpret())
        },
        path!!.run {
            TreePath(this)
        },
        pathCurrentlySelected.asBoolean()
    ).asGBoolean()
}
    .reinterpret()

public val TreeViewColumnDropFuncFunc: CPointer<
    CFunction<
        (
            CPointer<GtkTreeView>,
            CPointer<GtkTreeViewColumn>,
            CPointer<GtkTreeViewColumn>,
            CPointer<GtkTreeViewColumn>,
        ) -> gboolean
        >
    > = staticCFunction {
        treeView: CPointer<GtkTreeView>?,
        column: CPointer<GtkTreeViewColumn>?,
        prevColumn: CPointer<GtkTreeViewColumn>?,
        nextColumn: CPointer<GtkTreeViewColumn>?,
        `data`: gpointer?,
    ->
    data!!.asStableRef<
        (
            treeView: TreeView,
            column: TreeViewColumn,
            prevColumn: TreeViewColumn,
            nextColumn: TreeViewColumn,
        ) -> Boolean
        >().get().invoke(
        treeView!!.run {
            TreeView(this)
        },
        column!!.run {
            TreeViewColumn(this)
        },
        prevColumn!!.run {
            TreeViewColumn(this)
        },
        nextColumn!!.run {
            TreeViewColumn(this)
        }
    ).asGBoolean()
}
    .reinterpret()

public val TreeViewMappingFuncFunc:
    CPointer<CFunction<(CPointer<GtkTreeView>, CPointer<GtkTreePath>) -> Unit>> =
    staticCFunction {
            treeView: CPointer<GtkTreeView>?,
            path: CPointer<GtkTreePath>?,
            userData: gpointer?,
        ->
        userData!!.asStableRef<(treeView: TreeView, path: TreePath) -> Unit>().get().invoke(
            treeView!!.run {
                TreeView(this)
            },
            path!!.run {
                TreePath(this)
            }
        )
    }
        .reinterpret()

public val TreeViewRowSeparatorFuncFunc:
    CPointer<CFunction<(CPointer<GtkTreeModel>, CPointer<GtkTreeIter>) -> gboolean>> =
    staticCFunction {
            model: CPointer<GtkTreeModel>?,
            iter: CPointer<GtkTreeIter>?,
            `data`: gpointer?,
        ->
        data!!.asStableRef<(model: TreeModel, iter: TreeIter) -> Boolean>().get().invoke(
            model!!.run {
                TreeModel.TreeModelImpl(reinterpret())
            },
            iter!!.run {
                TreeIter(this)
            }
        ).asGBoolean()
    }
        .reinterpret()

public val TreeViewSearchEqualFuncFunc: CPointer<
    CFunction<
        (
            CPointer<GtkTreeModel>,
            gint,
            CPointer<ByteVar>,
            CPointer<GtkTreeIter>,
        ) -> gboolean
        >
    > = staticCFunction {
        model: CPointer<GtkTreeModel>?,
        column: gint,
        key: CPointer<ByteVar>?,
        iter: CPointer<GtkTreeIter>?,
        searchData: gpointer?,
    ->
    searchData!!.asStableRef<
        (
            model: TreeModel,
            column: gint,
            key: String,
            iter: TreeIter,
        ) -> Boolean
        >().get().invoke(
        model!!.run {
            TreeModel.TreeModelImpl(reinterpret())
        },
        column,
        key?.toKString() ?: error("Expected not null string"),
        iter!!.run {
            TreeIter(this)
        }
    ).asGBoolean()
}
    .reinterpret()

public val WidgetActionActivateFuncFunc: CPointer<
    CFunction<
        (
            CPointer<GtkWidget>,
            CPointer<ByteVar>,
            CPointer<GVariant>?,
        ) -> Unit
        >
    > = staticCFunction {
        widget: CPointer<GtkWidget>?,
        actionName: CPointer<ByteVar>?,
        parameter: CPointer<GVariant>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            widget: Widget,
            actionName: String,
            parameter: Variant?,
        ) -> Unit
        >().get().invoke(
        widget!!.run {
            Widget.WidgetImpl(this)
        },
        actionName?.toKString() ?: error("Expected not null string"),
        parameter?.run {
            Variant(this)
        }
    )
}
    .reinterpret()

/**
 * Type of callback used to calculate the next page in a `GtkAssistant`.
 *
 * It’s called both for computing the next page when the user presses the
 * “forward” button and for handling the behavior of the “last” button.
 *
 * See [method@Gtk.Assistant.set_forward_page_func].
 *
 * - param `currentPage` The page number used to calculate the next page.
 * - return The next page number
 */
public typealias AssistantPageFunc = (currentPage: gint) -> gint

/**
 * The type of the callback functions used for iterating over the
 * cell renderers and their allocated areas inside a `GtkCellArea`,
 * see gtk_cell_area_foreach_alloc().
 *
 * - param `renderer` the cell renderer to operate on
 * - param `cellArea` the area allocated to @renderer inside the rectangle
 *   provided to gtk_cell_area_foreach_alloc().
 * - param `cellBackground` the background area for @renderer inside the
 *   background area provided to gtk_cell_area_foreach_alloc().
 * - return true to stop iterating over cells.
 */
public typealias CellAllocCallback = (
    renderer: CellRenderer,
    cellArea: Rectangle,
    cellBackground: Rectangle,
) -> Boolean

/**
 * The type of the callback functions used for iterating over
 * the cell renderers of a `GtkCellArea`, see gtk_cell_area_foreach().
 *
 * - param `renderer` the cell renderer to operate on
 * - return true to stop iterating over cells.
 */
public typealias CellCallback = (renderer: CellRenderer) -> Boolean

/**
 * A function which should set the value of @cell_layout’s cell renderer(s)
 * as appropriate.
 *
 * - param `cellLayout` a `GtkCellLayout`
 * - param `cell` the cell renderer whose value is to be set
 * - param `treeModel` the model
 * - param `iter` a `GtkTreeIter` indicating the row to set the value for
 */
public typealias CellLayoutDataFunc = (
    cellLayout: CellLayout,
    cell: CellRenderer,
    treeModel: TreeModel,
    iter: TreeIter,
) -> Unit

/**
 * User function that is called to determine if the @item should be matched.
 *
 * If the filter matches the item, this function must return true. If the
 * item should be filtered out, false must be returned.
 *
 * - param `item` The item to be matched
 * - return true to keep the item around
 */
public typealias CustomFilterFunc = (item: Object) -> Boolean

/**
 * Whenever @drawing_area needs to redraw, this function will be called.
 *
 * This function should exclusively redraw the contents of the drawing area
 * and must not call any widget functions that cause changes.
 *
 * - param `drawingArea` the `GtkDrawingArea` to redraw
 * - param `cr` the context to draw to
 * - param `width` the actual width of the contents. This value will be at least
 *   as wide as GtkDrawingArea:width.
 * - param `height` the actual height of the contents. This value will be at least
 *   as wide as GtkDrawingArea:height.
 */
public typealias DrawingAreaDrawFunc = (
    drawingArea: DrawingArea,
    cr: Context,
    width: gint,
    height: gint,
) -> Unit

/**
 * A function which decides whether the row indicated by @iter matches
 * a given @key, and should be displayed as a possible completion for @key.
 *
 * Note that @key is normalized and case-folded (see g_utf8_normalize()
 * and g_utf8_casefold()). If this is not appropriate, match functions
 * have access to the unmodified key via
 * `gtk_editable_get_text (GTK_EDITABLE (gtk_entry_completion_get_entry ()))`.
 *
 * - param `completion` the `GtkEntryCompletion`
 * - param `key` the string to match, normalized and case-folded
 * - param `iter` a `GtkTreeIter` indicating the row to match
 * - return true if @iter should be displayed as a possible completion
 *   for @key
 */
public typealias EntryCompletionMatchFunc = (
    completion: EntryCompletion,
    key: String,
    iter: TreeIter,
) -> Boolean

/**
 * Callback called by gtk_expression_watch() when the
 * expression value changes.
 */
public typealias ExpressionNotify = () -> Unit

/**
 * Called for flow boxes that are bound to a `GListModel`.
 *
 * This function is called for each item that gets added to the model.
 *
 * - param `item` the item from the model for which to create a widget for
 * - return a `GtkWidget` that represents @item
 */
public typealias FlowBoxCreateWidgetFunc = (item: Object) -> Widget

/**
 * A function that will be called whenever a child changes
 * or is added.
 *
 * It lets you control if the child should be visible or not.
 *
 * - param `child` a `GtkFlowBoxChild` that may be filtered
 * - return true if the row should be visible, false otherwise
 */
public typealias FlowBoxFilterFunc = (child: FlowBoxChild) -> Boolean

/**
 * A function used by gtk_flow_box_selected_foreach().
 *
 * It will be called on every selected child of the @box.
 *
 * - param `box` a `GtkFlowBox`
 * - param `child` a `GtkFlowBoxChild`
 */
public typealias FlowBoxForeachFunc = (box: FlowBox, child: FlowBoxChild) -> Unit

/**
 * A function to compare two children to determine which
 * should come first.
 *
 * - param `child1` the first child
 * - param `child2` the second child
 * - return < 0 if @child1 should be before @child2, 0 if
 *   they are equal, and > 0 otherwise
 */
public typealias FlowBoxSortFunc = (child1: FlowBoxChild, child2: FlowBoxChild) -> gint

/**
 * The type of function that is used for deciding what fonts get
 * shown in a `GtkFontChooser`.
 *
 * See [method@Gtk.FontChooser.set_filter_func].
 *
 * - param `family` a `PangoFontFamily`
 * - param `face` a `PangoFontFace` belonging to @family
 * - return true if the font should be displayed
 */
public typealias FontFilterFunc = (family: FontFamily, face: FontFace) -> Boolean

/**
 * A function used by gtk_icon_view_selected_foreach() to map all
 * selected rows.
 *
 * It will be called on every selected row in the view.
 *
 * - param `iconView` a `GtkIconView`
 * - param `path` The `GtkTreePath` of a selected row
 */
public typealias IconViewForeachFunc = (iconView: IconView, path: TreePath) -> Unit

/**
 * Called for list boxes that are bound to a `GListModel` with
 * gtk_list_box_bind_model() for each item that gets added to the model.
 *
 * If the widget returned is not a #GtkListBoxRow widget, then the widget
 * will be inserted as the child of an intermediate #GtkListBoxRow.
 *
 * - param `item` the item from the model for which to create a widget for
 * - return a `GtkWidget` that represents @item
 */
public typealias ListBoxCreateWidgetFunc = (item: Object) -> Widget

/**
 * Will be called whenever the row changes or is added and lets you control
 * if the row should be visible or not.
 *
 * - param `row` the row that may be filtered
 * - return true if the row should be visible, false otherwise
 */
public typealias ListBoxFilterFunc = (row: ListBoxRow) -> Boolean

/**
 * A function used by gtk_list_box_selected_foreach().
 *
 * It will be called on every selected child of the @box.
 *
 * - param `box` a `GtkListBox`
 * - param `row` a `GtkListBoxRow`
 */
public typealias ListBoxForeachFunc = (box: ListBox, row: ListBoxRow) -> Unit

/**
 * Compare two rows to determine which should be first.
 *
 * - param `row1` the first row
 * - param `row2` the second row
 * - return < 0 if @row1 should be before @row2, 0 if they are
 *   equal and > 0 otherwise
 */
public typealias ListBoxSortFunc = (row1: ListBoxRow, row2: ListBoxRow) -> gint

/**
 * Whenever @row changes or which row is before @row changes this
 * is called, which lets you update the header on @row.
 *
 * You may remove or set a new one via [method@Gtk.ListBoxRow.set_header]
 * or just change the state of the current header widget.
 *
 * - param `row` the row to update
 * - param `before` the row before @row, or null if it is first
 */
public typealias ListBoxUpdateHeaderFunc = (row: ListBoxRow, before: ListBoxRow?) -> Unit

/**
 * User function that is called to map an @item of the original model to
 * an item expected by the map model.
 *
 * The returned items must conform to the item type of the model they are
 * used with.
 *
 * - param `item` The item to map
 * - return The item to map to
 */
public typealias MapListModelMapFunc = (item: Object) -> Object

/**
 * User-provided callback function to create a popup for a
 * `GtkMenuButton` on demand.
 *
 * This function is called when the popup of @menu_button is shown,
 * but none has been provided via [method@Gtk.MenuButton.set_popover]
 * or [method@Gtk.MenuButton.set_menu_model].
 *
 * - param `menuButton` the `GtkMenuButton`
 */
public typealias MenuButtonCreatePopupFunc = (menuButton: MenuButton) -> Unit

/**
 * The type of function that is passed to
 * gtk_print_run_page_setup_dialog_async().
 *
 * This function will be called when the page setup dialog
 * is dismissed, and also serves as destroy notify for @data.
 *
 * - param `pageSetup` the `GtkPageSetup` that has been passed to
 *   gtk_print_run_page_setup_dialog_async()
 */
public typealias PageSetupDoneFunc = (pageSetup: PageSetup) -> Unit

/**
 * The type of callback that is passed to gtk_print_job_send().
 *
 * It is called when the print job has been completely sent.
 *
 * - param `printJob` the `GtkPrintJob`
 * - param `error` a `GError` that contains error information if the sending
 *   of the print job failed, otherwise null
 */
public typealias PrintJobCompleteFunc = (printJob: PrintJob, error: Error) -> Unit

/**
 *
 *
 * - param `key`
 * - param `value`
 */
public typealias PrintSettingsFunc = (key: String, `value`: String) -> Unit

/**
 * The type of function passed to gtk_enumerate_printers().
 *
 * Note that you need to ref @printer, if you want to keep
 * a reference to it after the function has returned.
 *
 * - param `printer` a `GtkPrinter`
 * - return true to stop the enumeration, false to continue
 */
public typealias PrinterFunc = (printer: Printer) -> Boolean

/**
 *
 *
 * - param `scale` The `GtkScale`
 * - param `value` The numeric value to format
 * - return A newly allocated string describing a textual representation
 *   of the given numerical value.
 */
public typealias ScaleFormatValueFunc = (scale: Scale, `value`: gdouble) -> String

/**
 * Prototype for shortcuts based on user callbacks.
 *
 * - param `widget` The widget passed to the activation
 * - param `args` The arguments passed to the activation
 * - return true if the action was successful.
 */
public typealias ShortcutFunc = (widget: Widget, args: Variant?) -> Boolean

/**
 * The predicate function used by gtk_text_iter_forward_find_char() and
 * gtk_text_iter_backward_find_char().
 *
 * - param `ch` a Unicode code point
 * - return true if the predicate is satisfied, and the iteration should
 *   stop, and false otherwise
 */
public typealias TextCharPredicate = (ch: gunichar) -> Boolean

/**
 * A function used with gtk_text_tag_table_foreach(),
 * to iterate over every `GtkTextTag` inside a `GtkTextTagTable`.
 *
 * - param `tag` the `GtkTextTag`
 */
public typealias TextTagTableForeach = (tag: TextTag) -> Unit

/**
 * Callback type for adding a function to update animations. See gtk_widget_add_tick_callback().
 *
 * - param `widget` the widget
 * - param `frameClock` the frame clock for the widget (same as calling gtk_widget_get_frame_clock())
 * - return %G_SOURCE_CONTINUE if the tick callback should continue to be called,
 *  %G_SOURCE_REMOVE if the tick callback should be removed.
 */
public typealias TickCallback = (widget: Widget, frameClock: FrameClock) -> Boolean

/**
 * A function to set the properties of a cell instead of just using the
 * straight mapping between the cell and the model.
 *
 * This function is useful for customizing the cell renderer. For example,
 * a function might get an* integer from the @tree_model, and render it to
 * the “text” attribute of “cell” by converting it to its written equivalent.
 *
 * See also: gtk_tree_view_column_set_cell_data_func()
 *
 * - param `treeColumn` A `GtkTreeViewColumn`
 * - param `cell` The `GtkCellRenderer` that is being rendered by @tree_column
 * - param `treeModel` The `GtkTreeModel` being rendered
 * - param `iter` A `GtkTreeIter` of the current row rendered
 */
public typealias TreeCellDataFunc = (
    treeColumn: TreeViewColumn,
    cell: CellRenderer,
    treeModel: TreeModel,
    iter: TreeIter,
) -> Unit

/**
 * A GtkTreeIterCompareFunc should return a negative integer, zero, or a positive
 * integer if @a sorts before @b, @a sorts with @b, or @a sorts after @b
 * respectively.
 *
 * If two iters compare as equal, their order in the sorted model
 * is undefined. In order to ensure that the `GtkTreeSortable` behaves as
 * expected, the GtkTreeIterCompareFunc must define a partial order on
 * the model, i.e. it must be reflexive, antisymmetric and transitive.
 *
 * For example, if @model is a product catalogue, then a compare function
 * for the “price” column could be one which returns
 * `price_of(@a) - price_of(@b)`.
 *
 * - param `model` The `GtkTreeModel` the comparison is within
 * - param `a` A `GtkTreeIter` in @model
 * - param `b` Another `GtkTreeIter` in @model
 * - return a negative integer, zero or a positive integer depending on whether
 *   @a sorts before, with or after @b
 */
public typealias TreeIterCompareFunc = (
    model: TreeModel,
    a: TreeIter,
    b: TreeIter,
) -> gint

/**
 * Prototype of the function called to create new child models when
 * gtk_tree_list_row_set_expanded() is called.
 *
 * This function can return null to indicate that @item is guaranteed to be
 * a leaf node and will never have children. If it does not have children but
 * may get children later, it should return an empty model that is filled once
 * children arrive.
 *
 * - param `item` The item that is being expanded
 * - return The model tracking the children of
 *   @item or null if @item can never have children
 */
public typealias TreeListModelCreateModelFunc = (item: Object) -> ListModel?

/**
 * A function which calculates display values from raw values in the model.
 * It must fill @value with the display value for the column @column in the
 * row indicated by @iter.
 *
 * Since this function is called for each data access, it’s not a
 * particularly efficient operation.
 *
 * - param `model` the `GtkTreeModelFilter`
 * - param `iter` a `GtkTreeIter` pointing to the row whose display values are determined
 * - param `value` A `GValue` which is already initialized for
 *  with the correct type for the column @column.
 * - param `column` the column whose display value is determined
 */
public typealias TreeModelFilterModifyFunc = (
    model: TreeModel,
    iter: TreeIter,
    `value`: Value,
    column: gint,
) -> Unit

/**
 * A function which decides whether the row indicated by @iter is visible.
 *
 * - param `model` the child model of the `GtkTreeModelFilter`
 * - param `iter` a `GtkTreeIter` pointing to the row in @model whose visibility
 *   is determined
 * - return Whether the row indicated by @iter is visible.
 */
public typealias TreeModelFilterVisibleFunc = (model: TreeModel, iter: TreeIter) -> Boolean

/**
 * Type of the callback passed to gtk_tree_model_foreach() to
 * iterate over the rows in a tree model.
 *
 * - param `model` the `GtkTreeModel` being iterated
 * - param `path` the current `GtkTreePath`
 * - param `iter` the current `GtkTreeIter`
 * - return true to stop iterating, false to continue
 */
public typealias TreeModelForeachFunc = (
    model: TreeModel,
    path: TreePath,
    iter: TreeIter,
) -> Boolean

/**
 * A function used by gtk_tree_selection_selected_foreach() to map all
 * selected rows.  It will be called on every selected row in the view.
 *
 * - param `model` The `GtkTreeModel` being viewed
 * - param `path` The `GtkTreePath` of a selected row
 * - param `iter` A `GtkTreeIter` pointing to a selected row
 */
public typealias TreeSelectionForeachFunc = (
    model: TreeModel,
    path: TreePath,
    iter: TreeIter,
) -> Unit

/**
 * A function used by gtk_tree_selection_set_select_function() to filter
 * whether or not a row may be selected. It is called whenever a row's
 * state might change.
 *
 * A return value of true indicates to @selection that it is okay to
 * change the selection.
 *
 * - param `selection` A `GtkTreeSelection`
 * - param `model` A `GtkTreeModel` being viewed
 * - param `path` The `GtkTreePath` of the row in question
 * - param `pathCurrentlySelected` true, if the path is currently selected
 * - return true, if the selection state of the row can be toggled
 */
public typealias TreeSelectionFunc = (
    selection: TreeSelection,
    model: TreeModel,
    path: TreePath,
    pathCurrentlySelected: Boolean,
) -> Boolean

/**
 * Function type for determining whether @column can be dropped in a
 * particular spot (as determined by @prev_column and @next_column).  In
 * left to right locales, @prev_column is on the left of the potential drop
 * spot, and @next_column is on the right.  In right to left mode, this is
 * reversed.  This function should return true if the spot is a valid drop
 * spot.  Please note that returning true does not actually indicate that
 * the column drop was made, but is meant only to indicate a possible drop
 * spot to the user.
 *
 * - param `treeView` A `GtkTreeView`
 * - param `column` The `GtkTreeViewColumn` being dragged
 * - param `prevColumn` A `GtkTreeViewColumn` on one side of @column
 * - param `nextColumn` A `GtkTreeViewColumn` on the other side of @column
 * - return true, if @column can be dropped in this spot
 */
public typealias TreeViewColumnDropFunc = (
    treeView: TreeView,
    column: TreeViewColumn,
    prevColumn: TreeViewColumn,
    nextColumn: TreeViewColumn,
) -> Boolean

/**
 * Function used for gtk_tree_view_map_expanded_rows().
 *
 * - param `treeView` A `GtkTreeView`
 * - param `path` The path that’s expanded
 */
public typealias TreeViewMappingFunc = (treeView: TreeView, path: TreePath) -> Unit

/**
 * Function type for determining whether the row pointed to by @iter should
 * be rendered as a separator. A common way to implement this is to have a
 * boolean column in the model, whose values the `GtkTreeViewRowSeparatorFunc`
 * returns.
 *
 * - param `model` the `GtkTreeModel`
 * - param `iter` a `GtkTreeIter` pointing at a row in @model
 * - return true if the row is a separator
 */
public typealias TreeViewRowSeparatorFunc = (model: TreeModel, iter: TreeIter) -> Boolean

/**
 * A function used for checking whether a row in @model matches
 * a search key string entered by the user. Note the return value
 * is reversed from what you would normally expect, though it
 * has some similarity to strcmp() returning 0 for equal strings.
 *
 * - param `model` the `GtkTreeModel` being searched
 * - param `column` the search column set by gtk_tree_view_set_search_column()
 * - param `key` the key string to compare with
 * - param `iter` a `GtkTreeIter` pointing the row of @model that should be compared
 *  with @key.
 * - return false if the row matches, true otherwise.
 */
public typealias TreeViewSearchEqualFunc = (
    model: TreeModel,
    column: gint,
    key: String,
    iter: TreeIter,
) -> Boolean

/**
 * The type of the callback functions used for activating
 * actions installed with gtk_widget_class_install_action().
 *
 * The @parameter must match the @parameter_type of the action.
 *
 * - param `widget` the widget to which the action belongs
 * - param `actionName` the action name
 * - param `parameter` parameter for activation
 */
public typealias WidgetActionActivateFunc = (
    widget: Widget,
    actionName: String,
    parameter: Variant?,
) -> Unit

/**
 * The rectangle representing the area allocated for a widget by its parent.
 */
public typealias Allocation = Rectangle

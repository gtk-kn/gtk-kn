// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.cairo.FontOptions
import org.gtkkn.bindings.gdk.Clipboard
import org.gtkkn.bindings.gdk.Cursor
import org.gtkkn.bindings.gdk.Display
import org.gtkkn.bindings.gdk.FrameClock
import org.gtkkn.bindings.gdk.Rgba
import org.gtkkn.bindings.gio.ActionGroup
import org.gtkkn.bindings.gio.ListModel
import org.gtkkn.bindings.glib.Variant
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gobject.InitiallyUnowned
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.graphene.Matrix
import org.gtkkn.bindings.graphene.Point
import org.gtkkn.bindings.graphene.Rect
import org.gtkkn.bindings.gsk.Transform
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_10
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_12
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_8
import org.gtkkn.bindings.pango.Context
import org.gtkkn.bindings.pango.FontMap
import org.gtkkn.bindings.pango.Layout
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.ext.toCStringList
import org.gtkkn.extensions.glib.ext.toKStringList
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gobject.g_signal_emit_by_name
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkDirectionType
import org.gtkkn.native.gtk.GtkStateFlags
import org.gtkkn.native.gtk.GtkTextDirection
import org.gtkkn.native.gtk.GtkTooltip
import org.gtkkn.native.gtk.GtkWidget
import org.gtkkn.native.gtk.gtk_drag_check_threshold
import org.gtkkn.native.gtk.gtk_widget_action_set_enabled
import org.gtkkn.native.gtk.gtk_widget_activate
import org.gtkkn.native.gtk.gtk_widget_activate_action_variant
import org.gtkkn.native.gtk.gtk_widget_activate_default
import org.gtkkn.native.gtk.gtk_widget_add_controller
import org.gtkkn.native.gtk.gtk_widget_add_css_class
import org.gtkkn.native.gtk.gtk_widget_add_mnemonic_label
import org.gtkkn.native.gtk.gtk_widget_add_tick_callback
import org.gtkkn.native.gtk.gtk_widget_allocate
import org.gtkkn.native.gtk.gtk_widget_child_focus
import org.gtkkn.native.gtk.gtk_widget_compute_bounds
import org.gtkkn.native.gtk.gtk_widget_compute_expand
import org.gtkkn.native.gtk.gtk_widget_compute_point
import org.gtkkn.native.gtk.gtk_widget_compute_transform
import org.gtkkn.native.gtk.gtk_widget_contains
import org.gtkkn.native.gtk.gtk_widget_create_pango_context
import org.gtkkn.native.gtk.gtk_widget_create_pango_layout
import org.gtkkn.native.gtk.gtk_widget_dispose_template
import org.gtkkn.native.gtk.gtk_widget_error_bell
import org.gtkkn.native.gtk.gtk_widget_get_allocated_baseline
import org.gtkkn.native.gtk.gtk_widget_get_allocated_height
import org.gtkkn.native.gtk.gtk_widget_get_allocated_width
import org.gtkkn.native.gtk.gtk_widget_get_allocation
import org.gtkkn.native.gtk.gtk_widget_get_ancestor
import org.gtkkn.native.gtk.gtk_widget_get_baseline
import org.gtkkn.native.gtk.gtk_widget_get_can_focus
import org.gtkkn.native.gtk.gtk_widget_get_can_target
import org.gtkkn.native.gtk.gtk_widget_get_child_visible
import org.gtkkn.native.gtk.gtk_widget_get_clipboard
import org.gtkkn.native.gtk.gtk_widget_get_color
import org.gtkkn.native.gtk.gtk_widget_get_css_classes
import org.gtkkn.native.gtk.gtk_widget_get_css_name
import org.gtkkn.native.gtk.gtk_widget_get_cursor
import org.gtkkn.native.gtk.gtk_widget_get_default_direction
import org.gtkkn.native.gtk.gtk_widget_get_direction
import org.gtkkn.native.gtk.gtk_widget_get_display
import org.gtkkn.native.gtk.gtk_widget_get_first_child
import org.gtkkn.native.gtk.gtk_widget_get_focus_child
import org.gtkkn.native.gtk.gtk_widget_get_focus_on_click
import org.gtkkn.native.gtk.gtk_widget_get_focusable
import org.gtkkn.native.gtk.gtk_widget_get_font_map
import org.gtkkn.native.gtk.gtk_widget_get_font_options
import org.gtkkn.native.gtk.gtk_widget_get_frame_clock
import org.gtkkn.native.gtk.gtk_widget_get_halign
import org.gtkkn.native.gtk.gtk_widget_get_has_tooltip
import org.gtkkn.native.gtk.gtk_widget_get_height
import org.gtkkn.native.gtk.gtk_widget_get_hexpand
import org.gtkkn.native.gtk.gtk_widget_get_hexpand_set
import org.gtkkn.native.gtk.gtk_widget_get_last_child
import org.gtkkn.native.gtk.gtk_widget_get_layout_manager
import org.gtkkn.native.gtk.gtk_widget_get_mapped
import org.gtkkn.native.gtk.gtk_widget_get_margin_bottom
import org.gtkkn.native.gtk.gtk_widget_get_margin_end
import org.gtkkn.native.gtk.gtk_widget_get_margin_start
import org.gtkkn.native.gtk.gtk_widget_get_margin_top
import org.gtkkn.native.gtk.gtk_widget_get_name
import org.gtkkn.native.gtk.gtk_widget_get_native
import org.gtkkn.native.gtk.gtk_widget_get_next_sibling
import org.gtkkn.native.gtk.gtk_widget_get_opacity
import org.gtkkn.native.gtk.gtk_widget_get_overflow
import org.gtkkn.native.gtk.gtk_widget_get_pango_context
import org.gtkkn.native.gtk.gtk_widget_get_parent
import org.gtkkn.native.gtk.gtk_widget_get_preferred_size
import org.gtkkn.native.gtk.gtk_widget_get_prev_sibling
import org.gtkkn.native.gtk.gtk_widget_get_primary_clipboard
import org.gtkkn.native.gtk.gtk_widget_get_realized
import org.gtkkn.native.gtk.gtk_widget_get_receives_default
import org.gtkkn.native.gtk.gtk_widget_get_request_mode
import org.gtkkn.native.gtk.gtk_widget_get_root
import org.gtkkn.native.gtk.gtk_widget_get_scale_factor
import org.gtkkn.native.gtk.gtk_widget_get_sensitive
import org.gtkkn.native.gtk.gtk_widget_get_settings
import org.gtkkn.native.gtk.gtk_widget_get_size
import org.gtkkn.native.gtk.gtk_widget_get_state_flags
import org.gtkkn.native.gtk.gtk_widget_get_style_context
import org.gtkkn.native.gtk.gtk_widget_get_template_child
import org.gtkkn.native.gtk.gtk_widget_get_tooltip_markup
import org.gtkkn.native.gtk.gtk_widget_get_tooltip_text
import org.gtkkn.native.gtk.gtk_widget_get_type
import org.gtkkn.native.gtk.gtk_widget_get_valign
import org.gtkkn.native.gtk.gtk_widget_get_vexpand
import org.gtkkn.native.gtk.gtk_widget_get_vexpand_set
import org.gtkkn.native.gtk.gtk_widget_get_visible
import org.gtkkn.native.gtk.gtk_widget_get_width
import org.gtkkn.native.gtk.gtk_widget_grab_focus
import org.gtkkn.native.gtk.gtk_widget_has_css_class
import org.gtkkn.native.gtk.gtk_widget_has_default
import org.gtkkn.native.gtk.gtk_widget_has_focus
import org.gtkkn.native.gtk.gtk_widget_has_visible_focus
import org.gtkkn.native.gtk.gtk_widget_hide
import org.gtkkn.native.gtk.gtk_widget_in_destruction
import org.gtkkn.native.gtk.gtk_widget_init_template
import org.gtkkn.native.gtk.gtk_widget_insert_action_group
import org.gtkkn.native.gtk.gtk_widget_insert_after
import org.gtkkn.native.gtk.gtk_widget_insert_before
import org.gtkkn.native.gtk.gtk_widget_is_ancestor
import org.gtkkn.native.gtk.gtk_widget_is_drawable
import org.gtkkn.native.gtk.gtk_widget_is_focus
import org.gtkkn.native.gtk.gtk_widget_is_sensitive
import org.gtkkn.native.gtk.gtk_widget_is_visible
import org.gtkkn.native.gtk.gtk_widget_keynav_failed
import org.gtkkn.native.gtk.gtk_widget_list_mnemonic_labels
import org.gtkkn.native.gtk.gtk_widget_map
import org.gtkkn.native.gtk.gtk_widget_mnemonic_activate
import org.gtkkn.native.gtk.gtk_widget_observe_children
import org.gtkkn.native.gtk.gtk_widget_observe_controllers
import org.gtkkn.native.gtk.gtk_widget_pick
import org.gtkkn.native.gtk.gtk_widget_queue_allocate
import org.gtkkn.native.gtk.gtk_widget_queue_draw
import org.gtkkn.native.gtk.gtk_widget_queue_resize
import org.gtkkn.native.gtk.gtk_widget_realize
import org.gtkkn.native.gtk.gtk_widget_remove_controller
import org.gtkkn.native.gtk.gtk_widget_remove_css_class
import org.gtkkn.native.gtk.gtk_widget_remove_mnemonic_label
import org.gtkkn.native.gtk.gtk_widget_remove_tick_callback
import org.gtkkn.native.gtk.gtk_widget_set_can_focus
import org.gtkkn.native.gtk.gtk_widget_set_can_target
import org.gtkkn.native.gtk.gtk_widget_set_child_visible
import org.gtkkn.native.gtk.gtk_widget_set_css_classes
import org.gtkkn.native.gtk.gtk_widget_set_cursor
import org.gtkkn.native.gtk.gtk_widget_set_cursor_from_name
import org.gtkkn.native.gtk.gtk_widget_set_default_direction
import org.gtkkn.native.gtk.gtk_widget_set_direction
import org.gtkkn.native.gtk.gtk_widget_set_focus_child
import org.gtkkn.native.gtk.gtk_widget_set_focus_on_click
import org.gtkkn.native.gtk.gtk_widget_set_focusable
import org.gtkkn.native.gtk.gtk_widget_set_font_map
import org.gtkkn.native.gtk.gtk_widget_set_font_options
import org.gtkkn.native.gtk.gtk_widget_set_halign
import org.gtkkn.native.gtk.gtk_widget_set_has_tooltip
import org.gtkkn.native.gtk.gtk_widget_set_hexpand
import org.gtkkn.native.gtk.gtk_widget_set_hexpand_set
import org.gtkkn.native.gtk.gtk_widget_set_layout_manager
import org.gtkkn.native.gtk.gtk_widget_set_margin_bottom
import org.gtkkn.native.gtk.gtk_widget_set_margin_end
import org.gtkkn.native.gtk.gtk_widget_set_margin_start
import org.gtkkn.native.gtk.gtk_widget_set_margin_top
import org.gtkkn.native.gtk.gtk_widget_set_name
import org.gtkkn.native.gtk.gtk_widget_set_opacity
import org.gtkkn.native.gtk.gtk_widget_set_overflow
import org.gtkkn.native.gtk.gtk_widget_set_parent
import org.gtkkn.native.gtk.gtk_widget_set_receives_default
import org.gtkkn.native.gtk.gtk_widget_set_sensitive
import org.gtkkn.native.gtk.gtk_widget_set_size_request
import org.gtkkn.native.gtk.gtk_widget_set_state_flags
import org.gtkkn.native.gtk.gtk_widget_set_tooltip_markup
import org.gtkkn.native.gtk.gtk_widget_set_tooltip_text
import org.gtkkn.native.gtk.gtk_widget_set_valign
import org.gtkkn.native.gtk.gtk_widget_set_vexpand
import org.gtkkn.native.gtk.gtk_widget_set_vexpand_set
import org.gtkkn.native.gtk.gtk_widget_set_visible
import org.gtkkn.native.gtk.gtk_widget_should_layout
import org.gtkkn.native.gtk.gtk_widget_show
import org.gtkkn.native.gtk.gtk_widget_size_allocate
import org.gtkkn.native.gtk.gtk_widget_snapshot_child
import org.gtkkn.native.gtk.gtk_widget_trigger_tooltip_query
import org.gtkkn.native.gtk.gtk_widget_unmap
import org.gtkkn.native.gtk.gtk_widget_unparent
import org.gtkkn.native.gtk.gtk_widget_unrealize
import org.gtkkn.native.gtk.gtk_widget_unset_state_flags
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit
import kotlin.collections.List as CollectionsList
import org.gtkkn.bindings.glib.List as GlibList

/**
 * The base class for all widgets.
 *
 * `GtkWidget` is the base class all widgets in GTK derive from. It manages the
 * widget lifecycle, layout, states and style.
 *
 * ### Height-for-width Geometry Management
 *
 * GTK uses a height-for-width (and width-for-height) geometry management
 * system. Height-for-width means that a widget can change how much
 * vertical space it needs, depending on the amount of horizontal space
 * that it is given (and similar for width-for-height). The most common
 * example is a label that reflows to fill up the available width, wraps
 * to fewer lines, and therefore needs less height.
 *
 * Height-for-width geometry management is implemented in GTK by way
 * of two virtual methods:
 *
 * - [vfunc@Gtk.Widget.get_request_mode]
 * - [vfunc@Gtk.Widget.measure]
 *
 * There are some important things to keep in mind when implementing
 * height-for-width and when using it in widget implementations.
 *
 * If you implement a direct `GtkWidget` subclass that supports
 * height-for-width or width-for-height geometry management for itself
 * or its child widgets, the [vfunc@Gtk.Widget.get_request_mode] virtual
 * function must be implemented as well and return the widget's preferred
 * request mode. The default implementation of this virtual function
 * returns %GTK_SIZE_REQUEST_CONSTANT_SIZE, which means that the widget will
 * only ever get -1 passed as the for_size value to its
 * [vfunc@Gtk.Widget.measure] implementation.
 *
 * The geometry management system will query a widget hierarchy in
 * only one orientation at a time. When widgets are initially queried
 * for their minimum sizes it is generally done in two initial passes
 * in the [enum@Gtk.SizeRequestMode] chosen by the toplevel.
 *
 * For example, when queried in the normal %GTK_SIZE_REQUEST_HEIGHT_FOR_WIDTH mode:
 *
 * First, the default minimum and natural width for each widget
 * in the interface will be computed using [method@Gtk.Widget.measure] with an
 * orientation of %GTK_ORIENTATION_HORIZONTAL and a for_size of -1.
 * Because the preferred widths for each widget depend on the preferred
 * widths of their children, this information propagates up the hierarchy,
 * and finally a minimum and natural width is determined for the entire
 * toplevel. Next, the toplevel will use the minimum width to query for the
 * minimum height contextual to that width using [method@Gtk.Widget.measure] with an
 * orientation of %GTK_ORIENTATION_VERTICAL and a for_size of the just computed
 * width. This will also be a highly recursive operation. The minimum height
 * for the minimum width is normally used to set the minimum size constraint
 * on the toplevel.
 *
 * After the toplevel window has initially requested its size in both
 * dimensions it can go on to allocate itself a reasonable size (or a size
 * previously specified with [method@Gtk.Window.set_default_size]). During the
 * recursive allocation process it’s important to note that request cycles
 * will be recursively executed while widgets allocate their children.
 * Each widget, once allocated a size, will go on to first share the
 * space in one orientation among its children and then request each child's
 * height for its target allocated width or its width for allocated height,
 * depending. In this way a `GtkWidget` will typically be requested its size
 * a number of times before actually being allocated a size. The size a
 * widget is finally allocated can of course differ from the size it has
 * requested. For this reason, `GtkWidget` caches a  small number of results
 * to avoid re-querying for the same sizes in one allocation cycle.
 *
 * If a widget does move content around to intelligently use up the
 * allocated size then it must support the request in both
 * `GtkSizeRequestMode`s even if the widget in question only
 * trades sizes in a single orientation.
 *
 * For instance, a [class@Gtk.Label] that does height-for-width word wrapping
 * will not expect to have [vfunc@Gtk.Widget.measure] with an orientation of
 * %GTK_ORIENTATION_VERTICAL called because that call is specific to a
 * width-for-height request. In this case the label must return the height
 * required for its own minimum possible width. By following this rule any
 * widget that handles height-for-width or width-for-height requests will
 * always be allocated at least enough space to fit its own content.
 *
 * Here are some examples of how a %GTK_SIZE_REQUEST_HEIGHT_FOR_WIDTH widget
 * generally deals with width-for-height requests:
 *
 * ```c
 * static void
 * foo_widget_measure (GtkWidget      *widget,
 *                     GtkOrientation  orientation,
 *                     int             for_size,
 *                     int            *minimum_size,
 *                     int            *natural_size,
 *                     int            *minimum_baseline,
 *                     int            *natural_baseline)
 * {
 *   if (orientation == GTK_ORIENTATION_HORIZONTAL)
 *     {
 *       // Calculate minimum and natural width
 *     }
 *   else // VERTICAL
 *     {
 *       if (i_am_in_height_for_width_mode)
 *         {
 *           int min_width, dummy;
 *
 *           // First, get the minimum width of our widget
 *           GTK_WIDGET_GET_CLASS (widget)->measure (widget, GTK_ORIENTATION_HORIZONTAL, -1,
 *                                                   &min_width, &dummy, &dummy, &dummy);
 *
 *           // Now use the minimum width to retrieve the minimum and natural height to display
 *           // that width.
 *           GTK_WIDGET_GET_CLASS (widget)->measure (widget, GTK_ORIENTATION_VERTICAL, min_width,
 *                                                   minimum_size, natural_size, &dummy, &dummy);
 *         }
 *       else
 *         {
 *           // ... some widgets do both.
 *         }
 *     }
 * }
 * ```
 *
 * Often a widget needs to get its own request during size request or
 * allocation. For example, when computing height it may need to also
 * compute width. Or when deciding how to use an allocation, the widget
 * may need to know its natural size. In these cases, the widget should
 * be careful to call its virtual methods directly, like in the code
 * example above.
 *
 * It will not work to use the wrapper function [method@Gtk.Widget.measure]
 * inside your own [vfunc@Gtk.Widget.size_allocate] implementation.
 * These return a request adjusted by [class@Gtk.SizeGroup], the widget's
 * align and expand flags, as well as its CSS style.
 *
 * If a widget used the wrappers inside its virtual method implementations,
 * then the adjustments (such as widget margins) would be applied
 * twice. GTK therefore does not allow this and will warn if you try
 * to do it.
 *
 * Of course if you are getting the size request for another widget, such
 * as a child widget, you must use [method@Gtk.Widget.measure]; otherwise, you
 * would not properly consider widget margins, [class@Gtk.SizeGroup], and
 * so forth.
 *
 * GTK also supports baseline vertical alignment of widgets. This
 * means that widgets are positioned such that the typographical baseline of
 * widgets in the same row are aligned. This happens if a widget supports
 * baselines, has a vertical alignment using baselines, and is inside
 * a widget that supports baselines and has a natural “row” that it aligns to
 * the baseline, or a baseline assigned to it by the grandparent.
 *
 * Baseline alignment support for a widget is also done by the
 * [vfunc@Gtk.Widget.measure] virtual function. It allows you to report
 * both a minimum and natural size.
 *
 * If a widget ends up baseline aligned it will be allocated all the space in
 * the parent as if it was %GTK_ALIGN_FILL, but the selected baseline can be
 * found via [method@Gtk.Widget.get_baseline]. If the baseline has a
 * value other than -1 you need to align the widget such that the baseline
 * appears at the position.
 *
 * ### GtkWidget as GtkBuildable
 *
 * The `GtkWidget` implementation of the `GtkBuildable` interface
 * supports various custom elements to specify additional aspects of widgets
 * that are not directly expressed as properties.
 *
 * If the widget uses a [class@Gtk.LayoutManager], `GtkWidget` supports
 * a custom `<layout>` element, used to define layout properties:
 *
 * ```xml
 * <object class="GtkGrid" id="my_grid">
 *   <child>
 *     <object class="GtkLabel" id="label1">
 *       <property name="label">Description</property>
 *       <layout>
 *         <property name="column">0</property>
 *         <property name="row">0</property>
 *         <property name="row-span">1</property>
 *         <property name="column-span">1</property>
 *       </layout>
 *     </object>
 *   </child>
 *   <child>
 *     <object class="GtkEntry" id="description_entry">
 *       <layout>
 *         <property name="column">1</property>
 *         <property name="row">0</property>
 *         <property name="row-span">1</property>
 *         <property name="column-span">1</property>
 *       </layout>
 *     </object>
 *   </child>
 * </object>
 * ```
 *
 * `GtkWidget` allows style information such as style classes to
 * be associated with widgets, using the custom `<style>` element:
 *
 * ```xml
 * <object class="GtkButton" id="button1">
 *   <style>
 *     <class name="my-special-button-class"/>
 *     <class name="dark-button"/>
 *   </style>
 * </object>
 * ```
 *
 * `GtkWidget` allows defining accessibility information, such as properties,
 * relations, and states, using the custom `<accessibility>` element:
 *
 * ```xml
 * <object class="GtkButton" id="button1">
 *   <accessibility>
 *     <property name="label">Download</property>
 *     <relation name="labelled-by">label1</relation>
 *   </accessibility>
 * </object>
 * ```
 *
 * ### Building composite widgets from template XML
 *
 * `GtkWidget `exposes some facilities to automate the procedure
 * of creating composite widgets using "templates".
 *
 * To create composite widgets with `GtkBuilder` XML, one must associate
 * the interface description with the widget class at class initialization
 * time using [method@Gtk.WidgetClass.set_template].
 *
 * The interface description semantics expected in composite template descriptions
 * is slightly different from regular [class@Gtk.Builder] XML.
 *
 * Unlike regular interface descriptions, [method@Gtk.WidgetClass.set_template]
 * will expect a `<template>` tag as a direct child of the toplevel
 * `<interface>` tag. The `<template>` tag must specify the “class” attribute
 * which must be the type name of the widget. Optionally, the “parent”
 * attribute may be specified to specify the direct parent type of the widget
 * type; this is ignored by `GtkBuilder` but can be used by UI design tools to
 * introspect what kind of properties and internal children exist for a given
 * type when the actual type does not exist.
 *
 * The XML which is contained inside the `<template>` tag behaves as if it were
 * added to the `<object>` tag defining the widget itself. You may set properties
 * on a widget by inserting `<property>` tags into the `<template>` tag, and also
 * add `<child>` tags to add children and extend a widget in the normal way you
 * would with `<object>` tags.
 *
 * Additionally, `<object>` tags can also be added before and after the initial
 * `<template>` tag in the normal way, allowing one to define auxiliary objects
 * which might be referenced by other widgets declared as children of the
 * `<template>` tag.
 *
 * Since, unlike the `<object>` tag, the `<template>` tag does not contain an
 * “id” attribute, if you need to refer to the instance of the object itself that
 * the template will create, simply refer to the template class name in an
 * applicable element content.
 *
 * Here is an example of a template definition, which includes an example of
 * this in the `<signal>` tag:
 *
 * ```xml
 * <interface>
 *   <template class="FooWidget" parent="GtkBox">
 *     <property name="orientation">horizontal</property>
 *     <property name="spacing">4</property>
 *     <child>
 *       <object class="GtkButton" id="hello_button">
 *         <property name="label">Hello World</property>
 *         <signal name="clicked" handler="hello_button_clicked" object="FooWidget" swapped="yes"/>
 *       </object>
 *     </child>
 *     <child>
 *       <object class="GtkButton" id="goodbye_button">
 *         <property name="label">Goodbye World</property>
 *       </object>
 *     </child>
 *   </template>
 * </interface>
 * ```
 *
 * Typically, you'll place the template fragment into a file that is
 * bundled with your project, using `GResource`. In order to load the
 * template, you need to call [method@Gtk.WidgetClass.set_template_from_resource]
 * from the class initialization of your `GtkWidget` type:
 *
 * ```c
 * static void
 * foo_widget_class_init (FooWidgetClass *klass)
 * {
 *   // ...
 *
 *   gtk_widget_class_set_template_from_resource (GTK_WIDGET_CLASS (klass),
 *                                                "/com/example/ui/foowidget.ui");
 * }
 * ```
 *
 * You will also need to call [method@Gtk.Widget.init_template] from the
 * instance initialization function:
 *
 * ```c
 * static void
 * foo_widget_init (FooWidget *self)
 * {
 *   gtk_widget_init_template (GTK_WIDGET (self));
 *
 *   // Initialize the rest of the widget...
 * }
 * ```
 *
 * as well as calling [method@Gtk.Widget.dispose_template] from the dispose
 * function:
 *
 * ```c
 * static void
 * foo_widget_dispose (GObject *gobject)
 * {
 *   FooWidget *self = FOO_WIDGET (gobject);
 *
 *   // Dispose objects for which you have a reference...
 *
 *   // Clear the template children for this widget type
 *   gtk_widget_dispose_template (GTK_WIDGET (self), FOO_TYPE_WIDGET);
 *
 *   G_OBJECT_CLASS (foo_widget_parent_class)->dispose (gobject);
 * }
 * ```
 *
 * You can access widgets defined in the template using the
 * [method@Gtk.Widget.get_template_child] function, but you will typically declare
 * a pointer in the instance private data structure of your type using the same
 * name as the widget in the template definition, and call
 * [method@Gtk.WidgetClass.bind_template_child_full] (or one of its wrapper macros
 * [func@Gtk.widget_class_bind_template_child] and [func@Gtk.widget_class_bind_template_child_private])
 * with that name, e.g.
 *
 * ```c
 * typedef struct {
 *   GtkWidget *hello_button;
 *   GtkWidget *goodbye_button;
 * } FooWidgetPrivate;
 *
 * G_DEFINE_TYPE_WITH_PRIVATE (FooWidget, foo_widget, GTK_TYPE_BOX)
 *
 * static void
 * foo_widget_dispose (GObject *gobject)
 * {
 *   gtk_widget_dispose_template (GTK_WIDGET (gobject), FOO_TYPE_WIDGET);
 *
 *   G_OBJECT_CLASS (foo_widget_parent_class)->dispose (gobject);
 * }
 *
 * static void
 * foo_widget_class_init (FooWidgetClass *klass)
 * {
 *   // ...
 *   G_OBJECT_CLASS (klass)->dispose = foo_widget_dispose;
 *
 *   gtk_widget_class_set_template_from_resource (GTK_WIDGET_CLASS (klass),
 *                                                "/com/example/ui/foowidget.ui");
 *   gtk_widget_class_bind_template_child_private (GTK_WIDGET_CLASS (klass),
 *                                                 FooWidget, hello_button);
 *   gtk_widget_class_bind_template_child_private (GTK_WIDGET_CLASS (klass),
 *                                                 FooWidget, goodbye_button);
 * }
 *
 * static void
 * foo_widget_init (FooWidget *widget)
 * {
 *   gtk_widget_init_template (GTK_WIDGET (widget));
 * }
 * ```
 *
 * You can also use [method@Gtk.WidgetClass.bind_template_callback_full] (or
 * is wrapper macro [func@Gtk.widget_class_bind_template_callback]) to connect
 * a signal callback defined in the template with a function visible in the
 * scope of the class, e.g.
 *
 * ```c
 * // the signal handler has the instance and user data swapped
 * // because of the swapped="yes" attribute in the template XML
 * static void
 * hello_button_clicked (FooWidget *self,
 *                       GtkButton *button)
 * {
 *   g_print ("Hello, world!\n");
 * }
 *
 * static void
 * foo_widget_class_init (FooWidgetClass *klass)
 * {
 *   // ...
 *   gtk_widget_class_set_template_from_resource (GTK_WIDGET_CLASS (klass),
 *                                                "/com/example/ui/foowidget.ui");
 *   gtk_widget_class_bind_template_callback (GTK_WIDGET_CLASS (klass), hello_button_clicked);
 * }
 * ```
 *
 * ## Skipped during bindings generation
 *
 * - parameter `width`: width: Out parameter is not supported
 * - parameter `minimum`: minimum: Out parameter is not supported
 * - parameter `dest_x`: dest_x: Out parameter is not supported
 * - method `has-default`: Property has no getter nor setter
 * - method `has-focus`: Property has no getter nor setter
 * - method `height-request`: Property has no getter nor setter
 * - method `width-request`: Property has no getter nor setter
 */
public abstract class Widget(public val gtkWidgetPointer: CPointer<GtkWidget>) :
    InitiallyUnowned(gtkWidgetPointer.reinterpret()),
    Accessible,
    Buildable,
    ConstraintTarget,
    KGTyped {
    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * Whether the widget or any of its descendents can accept
     * the input focus.
     *
     * This property is meant to be set by widget implementations,
     * typically in their instance init function.
     */
    public open var canFocus: Boolean
        /**
         * Determines whether the input focus can enter @widget or any
         * of its children.
         *
         * See [method@Gtk.Widget.set_focusable].
         *
         * @return true if the input focus can enter @widget, false otherwise
         */
        get() = gtk_widget_get_can_focus(gtkWidgetPointer).asBoolean()

        /**
         * Specifies whether the input focus can enter the widget
         * or any of its children.
         *
         * Applications should set @can_focus to false to mark a
         * widget as for pointer/touch use only.
         *
         * Note that having @can_focus be true is only one of the
         * necessary conditions for being focusable. A widget must
         * also be sensitive and focusable and not have an ancestor
         * that is marked as not can-focus in order to receive input
         * focus.
         *
         * See [method@Gtk.Widget.grab_focus] for actually setting
         * the input focus on a widget.
         *
         * @param canFocus whether or not the input focus can enter
         *   the widget or any of its children
         */
        set(canFocus) = gtk_widget_set_can_focus(gtkWidgetPointer, canFocus.asGBoolean())

    /**
     * Whether the widget can receive pointer events.
     */
    public open var canTarget: Boolean
        /**
         * Queries whether @widget can be the target of pointer events.
         *
         * @return true if @widget can receive pointer events
         */
        get() = gtk_widget_get_can_target(gtkWidgetPointer).asBoolean()

        /**
         * Sets whether @widget can be the target of pointer events.
         *
         * @param canTarget whether this widget should be able to
         *   receive pointer events
         */
        set(canTarget) = gtk_widget_set_can_target(gtkWidgetPointer, canTarget.asGBoolean())

    /**
     * A list of css classes applied to this widget.
     */
    public open var cssClasses: CollectionsList<String>
        /**
         * Returns the list of style classes applied to @widget.
         *
         * @return a null-terminated list of
         *   css classes currently applied to @widget. The returned
         *   list must freed using g_strfreev().
         */
        get() = gtk_widget_get_css_classes(gtkWidgetPointer)?.toKStringList() ?: error("Expected not null string array")

        /**
         * Clear all style classes applied to @widget
         * and replace them with @classes.
         *
         * @param classes null-terminated list of style classes to apply to @widget.
         */
        set(classes) = memScoped {
            return gtk_widget_set_css_classes(gtkWidgetPointer, classes.toCStringList(this))
        }

    /**
     * The name of this widget in the CSS tree.
     *
     * This property is meant to be set by widget implementations,
     * typically in their instance init function.
     */
    public open val cssName: String
        /**
         * Returns the CSS name that is used for @self.
         *
         * @return the CSS name
         */
        get() = gtk_widget_get_css_name(gtkWidgetPointer)?.toKString() ?: error("Expected not null string")

    /**
     * The cursor used by @widget.
     */
    public open var cursor: Cursor?
        /**
         * Queries the cursor set on @widget.
         *
         * See [method@Gtk.Widget.set_cursor] for details.
         *
         * @return the cursor
         *   currently in use or null if the cursor is inherited
         */
        get() = gtk_widget_get_cursor(gtkWidgetPointer)?.run {
            Cursor(this)
        }

        /**
         * Sets the cursor to be shown when pointer devices point
         * towards @widget.
         *
         * If the @cursor is NULL, @widget will use the cursor
         * inherited from the parent widget.
         *
         * @param cursor the new cursor
         */
        set(cursor) = gtk_widget_set_cursor(gtkWidgetPointer, cursor?.gdkCursorPointer)

    /**
     * Whether the widget should grab focus when it is clicked with the mouse.
     *
     * This property is only relevant for widgets that can take focus.
     */
    public open var focusOnClick: Boolean
        /**
         * Returns whether the widget should grab focus when it is clicked
         * with the mouse.
         *
         * See [method@Gtk.Widget.set_focus_on_click].
         *
         * @return true if the widget should grab focus when it is
         *   clicked with the mouse
         */
        get() = gtk_widget_get_focus_on_click(gtkWidgetPointer).asBoolean()

        /**
         * Sets whether the widget should grab focus when it is clicked
         * with the mouse.
         *
         * Making mouse clicks not grab focus is useful in places like
         * toolbars where you don’t want the keyboard focus removed from
         * the main area of the application.
         *
         * @param focusOnClick whether the widget should grab focus when clicked
         *   with the mouse
         */
        set(focusOnClick) = gtk_widget_set_focus_on_click(gtkWidgetPointer, focusOnClick.asGBoolean())

    /**
     * Whether this widget itself will accept the input focus.
     */
    public open var focusable: Boolean
        /**
         * Determines whether @widget can own the input focus.
         *
         * See [method@Gtk.Widget.set_focusable].
         *
         * @return true if @widget can own the input focus, false otherwise
         */
        get() = gtk_widget_get_focusable(gtkWidgetPointer).asBoolean()

        /**
         * Specifies whether @widget can own the input focus.
         *
         * Widget implementations should set @focusable to true in
         * their init() function if they want to receive keyboard input.
         *
         * Note that having @focusable be true is only one of the
         * necessary conditions for being focusable. A widget must
         * also be sensitive and can-focus and not have an ancestor
         * that is marked as not can-focus in order to receive input
         * focus.
         *
         * See [method@Gtk.Widget.grab_focus] for actually setting
         * the input focus on a widget.
         *
         * @param focusable whether or not @widget can own the input focus
         */
        set(focusable) = gtk_widget_set_focusable(gtkWidgetPointer, focusable.asGBoolean())

    /**
     * How to distribute horizontal space if widget gets extra space.
     */
    public open var halign: Align
        /**
         * Gets the horizontal alignment of @widget.
         *
         * For backwards compatibility reasons this method will never return
         * one of the baseline alignments, but instead it will convert it to
         * `GTK_ALIGN_FILL` or `GTK_ALIGN_CENTER`.
         *
         * Baselines are not supported for horizontal alignment.
         *
         * @return the horizontal alignment of @widget
         */
        get() = gtk_widget_get_halign(gtkWidgetPointer).run {
            Align.fromNativeValue(this)
        }

        /**
         * Sets the horizontal alignment of @widget.
         *
         * @param align the horizontal alignment
         */
        set(align) = gtk_widget_set_halign(gtkWidgetPointer, align.nativeValue)

    /**
     * Enables or disables the emission of the ::query-tooltip signal on @widget.
     *
     * A value of true indicates that @widget can have a tooltip, in this case
     * the widget will be queried using [signal@Gtk.Widget::query-tooltip] to
     * determine whether it will provide a tooltip or not.
     */
    public open var hasTooltip: Boolean
        /**
         * Returns the current value of the `has-tooltip` property.
         *
         * @return current value of `has-tooltip` on @widget.
         */
        get() = gtk_widget_get_has_tooltip(gtkWidgetPointer).asBoolean()

        /**
         * Sets the `has-tooltip` property on @widget to @has_tooltip.
         *
         * @param hasTooltip whether or not @widget has a tooltip.
         */
        set(hasTooltip) = gtk_widget_set_has_tooltip(gtkWidgetPointer, hasTooltip.asGBoolean())

    /**
     * Whether to expand horizontally.
     */
    public open var hexpand: Boolean
        /**
         * Gets whether the widget would like any available extra horizontal
         * space.
         *
         * When a user resizes a `GtkWindow`, widgets with expand=TRUE
         * generally receive the extra space. For example, a list or
         * scrollable area or document in your window would often be set to
         * expand.
         *
         * Containers should use [method@Gtk.Widget.compute_expand] rather
         * than this function, to see whether a widget, or any of its children,
         * has the expand flag set. If any child of a widget wants to
         * expand, the parent may ask to expand also.
         *
         * This function only looks at the widget’s own hexpand flag, rather
         * than computing whether the entire widget tree rooted at this widget
         * wants to expand.
         *
         * @return whether hexpand flag is set
         */
        get() = gtk_widget_get_hexpand(gtkWidgetPointer).asBoolean()

        /**
         * Sets whether the widget would like any available extra horizontal
         * space.
         *
         * When a user resizes a `GtkWindow`, widgets with expand=TRUE
         * generally receive the extra space. For example, a list or
         * scrollable area or document in your window would often be set to
         * expand.
         *
         * Call this function to set the expand flag if you would like your
         * widget to become larger horizontally when the window has extra
         * room.
         *
         * By default, widgets automatically expand if any of their children
         * want to expand. (To see if a widget will automatically expand given
         * its current children and state, call [method@Gtk.Widget.compute_expand].
         * A container can decide how the expandability of children affects the
         * expansion of the container by overriding the compute_expand virtual
         * method on `GtkWidget`.).
         *
         * Setting hexpand explicitly with this function will override the
         * automatic expand behavior.
         *
         * This function forces the widget to expand or not to expand,
         * regardless of children.  The override occurs because
         * [method@Gtk.Widget.set_hexpand] sets the hexpand-set property (see
         * [method@Gtk.Widget.set_hexpand_set]) which causes the widget’s hexpand
         * value to be used, rather than looking at children and widget state.
         *
         * @param expand whether to expand
         */
        set(expand) = gtk_widget_set_hexpand(gtkWidgetPointer, expand.asGBoolean())

    /**
     * Whether to use the `hexpand` property.
     */
    public open var hexpandSet: Boolean
        /**
         * Gets whether gtk_widget_set_hexpand() has been used
         * to explicitly set the expand flag on this widget.
         *
         * If [property@Gtk.Widget:hexpand] property is set, then it
         * overrides any computed expand value based on child widgets.
         * If `hexpand` is not set, then the expand value depends on
         * whether any children of the widget would like to expand.
         *
         * There are few reasons to use this function, but it’s here
         * for completeness and consistency.
         *
         * @return whether hexpand has been explicitly set
         */
        get() = gtk_widget_get_hexpand_set(gtkWidgetPointer).asBoolean()

        /**
         * Sets whether the hexpand flag will be used.
         *
         * The [property@Gtk.Widget:hexpand-set] property will be set
         * automatically when you call [method@Gtk.Widget.set_hexpand]
         * to set hexpand, so the most likely reason to use this function
         * would be to unset an explicit expand flag.
         *
         * If hexpand is set, then it overrides any computed
         * expand value based on child widgets. If hexpand is not
         * set, then the expand value depends on whether any
         * children of the widget would like to expand.
         *
         * There are few reasons to use this function, but it’s here
         * for completeness and consistency.
         *
         * @param set value for hexpand-set property
         */
        set(`set`) = gtk_widget_set_hexpand_set(gtkWidgetPointer, `set`.asGBoolean())

    /**
     * The `GtkLayoutManager` instance to use to compute the preferred size
     * of the widget, and allocate its children.
     *
     * This property is meant to be set by widget implementations,
     * typically in their instance init function.
     */
    public open var layoutManager: LayoutManager?
        /**
         * Retrieves the layout manager used by @widget.
         *
         * See [method@Gtk.Widget.set_layout_manager].
         *
         * @return a `GtkLayoutManager`
         */
        get() = gtk_widget_get_layout_manager(gtkWidgetPointer)?.run {
            LayoutManager.LayoutManagerImpl(this)
        }

        /**
         * Sets the layout manager delegate instance that provides an
         * implementation for measuring and allocating the children of @widget.
         *
         * @param layoutManager a `GtkLayoutManager`
         */
        set(layoutManager) = gtk_widget_set_layout_manager(gtkWidgetPointer, layoutManager?.gtkLayoutManagerPointer)

    /**
     * Margin on bottom side of widget.
     *
     * This property adds margin outside of the widget's normal size
     * request, the margin will be added in addition to the size from
     * [method@Gtk.Widget.set_size_request] for example.
     */
    public open var marginBottom: gint
        /**
         * Gets the bottom margin of @widget.
         *
         * @return The bottom margin of @widget
         */
        get() = gtk_widget_get_margin_bottom(gtkWidgetPointer)

        /**
         * Sets the bottom margin of @widget.
         *
         * @param margin the bottom margin
         */
        set(margin) = gtk_widget_set_margin_bottom(gtkWidgetPointer, margin)

    /**
     * Margin on end of widget, horizontally.
     *
     * This property supports left-to-right and right-to-left text
     * directions.
     *
     * This property adds margin outside of the widget's normal size
     * request, the margin will be added in addition to the size from
     * [method@Gtk.Widget.set_size_request] for example.
     */
    public open var marginEnd: gint
        /**
         * Gets the end margin of @widget.
         *
         * @return The end margin of @widget
         */
        get() = gtk_widget_get_margin_end(gtkWidgetPointer)

        /**
         * Sets the end margin of @widget.
         *
         * @param margin the end margin
         */
        set(margin) = gtk_widget_set_margin_end(gtkWidgetPointer, margin)

    /**
     * Margin on start of widget, horizontally.
     *
     * This property supports left-to-right and right-to-left text
     * directions.
     *
     * This property adds margin outside of the widget's normal size
     * request, the margin will be added in addition to the size from
     * [method@Gtk.Widget.set_size_request] for example.
     */
    public open var marginStart: gint
        /**
         * Gets the start margin of @widget.
         *
         * @return The start margin of @widget
         */
        get() = gtk_widget_get_margin_start(gtkWidgetPointer)

        /**
         * Sets the start margin of @widget.
         *
         * @param margin the start margin
         */
        set(margin) = gtk_widget_set_margin_start(gtkWidgetPointer, margin)

    /**
     * Margin on top side of widget.
     *
     * This property adds margin outside of the widget's normal size
     * request, the margin will be added in addition to the size from
     * [method@Gtk.Widget.set_size_request] for example.
     */
    public open var marginTop: gint
        /**
         * Gets the top margin of @widget.
         *
         * @return The top margin of @widget
         */
        get() = gtk_widget_get_margin_top(gtkWidgetPointer)

        /**
         * Sets the top margin of @widget.
         *
         * @param margin the top margin
         */
        set(margin) = gtk_widget_set_margin_top(gtkWidgetPointer, margin)

    /**
     * The name of the widget.
     */
    public open var name: String
        /**
         * Retrieves the name of a widget.
         *
         * See [method@Gtk.Widget.set_name] for the significance of widget names.
         *
         * @return name of the widget. This string is owned by GTK and
         *   should not be modified or freed
         */
        get() = gtk_widget_get_name(gtkWidgetPointer)?.toKString() ?: error("Expected not null string")

        /**
         * Sets a widgets name.
         *
         * Setting a name allows you to refer to the widget from a
         * CSS file. You can apply a style to widgets with a particular name
         * in the CSS file. See the documentation for the CSS syntax (on the
         * same page as the docs for [class@Gtk.StyleContext].
         *
         * Note that the CSS syntax has certain special characters to delimit
         * and represent elements in a selector (period, #, >, *...), so using
         * these will make your widget impossible to match by name. Any combination
         * of alphanumeric symbols, dashes and underscores will suffice.
         *
         * @param name name for the widget
         */
        set(name) = gtk_widget_set_name(gtkWidgetPointer, name)

    /**
     * The requested opacity of the widget.
     */
    public open var opacity: gdouble
        /**
         * #Fetches the requested opacity for this widget.
         *
         * See [method@Gtk.Widget.set_opacity].
         *
         * @return the requested opacity for this widget.
         */
        get() = gtk_widget_get_opacity(gtkWidgetPointer)

        /**
         * Request the @widget to be rendered partially transparent.
         *
         * An opacity of 0 is fully transparent and an opacity of 1
         * is fully opaque.
         *
         * Opacity works on both toplevel widgets and child widgets, although
         * there are some limitations: For toplevel widgets, applying opacity
         * depends on the capabilities of the windowing system. On X11, this
         * has any effect only on X displays with a compositing manager,
         * see gdk_display_is_composited(). On Windows and Wayland it should
         * always work, although setting a window’s opacity after the window
         * has been shown may cause some flicker.
         *
         * Note that the opacity is inherited through inclusion — if you set
         * a toplevel to be partially translucent, all of its content will
         * appear translucent, since it is ultimatively rendered on that
         * toplevel. The opacity value itself is not inherited by child
         * widgets (since that would make widgets deeper in the hierarchy
         * progressively more translucent). As a consequence, [class@Gtk.Popover]s
         * and other [iface@Gtk.Native] widgets with their own surface will use their
         * own opacity value, and thus by default appear non-translucent,
         * even if they are attached to a toplevel that is translucent.
         *
         * @param opacity desired opacity, between 0 and 1
         */
        set(opacity) = gtk_widget_set_opacity(gtkWidgetPointer, opacity)

    /**
     * How content outside the widget's content area is treated.
     *
     * This property is meant to be set by widget implementations,
     * typically in their instance init function.
     */
    public open var overflow: Overflow
        /**
         * Returns the widget’s overflow value.
         *
         * @return The widget's overflow.
         */
        get() = gtk_widget_get_overflow(gtkWidgetPointer).run {
            Overflow.fromNativeValue(this)
        }

        /**
         * Sets how @widget treats content that is drawn outside the
         * widget's content area.
         *
         * See the definition of [enum@Gtk.Overflow] for details.
         *
         * This setting is provided for widget implementations and
         * should not be used by application code.
         *
         * The default value is %GTK_OVERFLOW_VISIBLE.
         *
         * @param overflow desired overflow
         */
        set(overflow) = gtk_widget_set_overflow(gtkWidgetPointer, overflow.nativeValue)

    /**
     * The parent widget of this widget.
     */
    public open val parent: Widget?
        /**
         * Returns the parent widget of @widget.
         *
         * @return the parent widget of @widget
         */
        get() = gtk_widget_get_parent(gtkWidgetPointer)?.run {
            WidgetImpl(this)
        }

    /**
     * Whether the widget will receive the default action when it is focused.
     */
    public open var receivesDefault: Boolean
        /**
         * Determines whether @widget is always treated as the default widget
         * within its toplevel when it has the focus, even if another widget
         * is the default.
         *
         * See [method@Gtk.Widget.set_receives_default].
         *
         * @return true if @widget acts as the default widget when focused,
         *   false otherwise
         */
        get() = gtk_widget_get_receives_default(gtkWidgetPointer).asBoolean()

        /**
         * Specifies whether @widget will be treated as the default
         * widget within its toplevel when it has the focus, even if
         * another widget is the default.
         *
         * @param receivesDefault whether or not @widget can be a default widget.
         */
        set(receivesDefault) = gtk_widget_set_receives_default(gtkWidgetPointer, receivesDefault.asGBoolean())

    /**
     * The `GtkRoot` widget of the widget tree containing this widget.
     *
     * This will be null if the widget is not contained in a root widget.
     */
    public open val root: Root?
        /**
         * Returns the `GtkRoot` widget of @widget.
         *
         * This function will return null if the widget is not contained
         * inside a widget tree with a root widget.
         *
         * `GtkRoot` widgets will return themselves here.
         *
         * @return the root widget of @widget
         */
        get() = gtk_widget_get_root(gtkWidgetPointer)?.run {
            Root.RootImpl(reinterpret())
        }

    /**
     * The scale factor of the widget.
     */
    public open val scaleFactor: gint
        /**
         * Retrieves the internal scale factor that maps from window
         * coordinates to the actual device pixels.
         *
         * On traditional systems this is 1, on high density outputs,
         * it can be a higher value (typically 2).
         *
         * See [method@Gdk.Surface.get_scale_factor].
         *
         * @return the scale factor for @widget
         */
        get() = gtk_widget_get_scale_factor(gtkWidgetPointer)

    /**
     * Whether the widget responds to input.
     */
    public open var sensitive: Boolean
        /**
         * Returns the widget’s sensitivity.
         *
         * This function returns the value that has been set using
         * [method@Gtk.Widget.set_sensitive]).
         *
         * The effective sensitivity of a widget is however determined
         * by both its own and its parent widget’s sensitivity.
         * See [method@Gtk.Widget.is_sensitive].
         *
         * @return true if the widget is sensitive
         */
        get() = gtk_widget_get_sensitive(gtkWidgetPointer).asBoolean()

        /**
         * Sets the sensitivity of a widget.
         *
         * A widget is sensitive if the user can interact with it.
         * Insensitive widgets are “grayed out” and the user can’t
         * interact with them. Insensitive widgets are known as
         * “inactive”, “disabled”, or “ghosted” in some other toolkits.
         *
         * @param sensitive true to make the widget sensitive
         */
        set(sensitive) = gtk_widget_set_sensitive(gtkWidgetPointer, sensitive.asGBoolean())

    /**
     * Sets the text of tooltip to be the given string, which is marked up
     * with Pango markup.
     *
     * Also see [method@Gtk.Tooltip.set_markup].
     *
     * This is a convenience property which will take care of getting the
     * tooltip shown if the given string is not null:
     * [property@Gtk.Widget:has-tooltip] will automatically be set to true
     * and there will be taken care of [signal@Gtk.Widget::query-tooltip] in
     * the default signal handler.
     *
     * Note that if both [property@Gtk.Widget:tooltip-text] and
     * [property@Gtk.Widget:tooltip-markup] are set, the last one wins.
     */
    public open var tooltipMarkup: String?
        /**
         * Gets the contents of the tooltip for @widget.
         *
         * If the tooltip has not been set using
         * [method@Gtk.Widget.set_tooltip_markup], this
         * function returns null.
         *
         * @return the tooltip text
         */
        get() = gtk_widget_get_tooltip_markup(gtkWidgetPointer)?.toKString()

        /**
         * Sets @markup as the contents of the tooltip, which is marked
         * up with Pango markup.
         *
         * This function will take care of setting the
         * [property@Gtk.Widget:has-tooltip] as a side effect, and of the
         * default handler for the [signal@Gtk.Widget::query-tooltip] signal.
         *
         * See also [method@Gtk.Tooltip.set_markup].
         *
         * @param markup the contents of the tooltip for @widget
         */
        set(markup) = gtk_widget_set_tooltip_markup(gtkWidgetPointer, markup)

    /**
     * Sets the text of tooltip to be the given string.
     *
     * Also see [method@Gtk.Tooltip.set_text].
     *
     * This is a convenience property which will take care of getting the
     * tooltip shown if the given string is not null:
     * [property@Gtk.Widget:has-tooltip] will automatically be set to true
     * and there will be taken care of [signal@Gtk.Widget::query-tooltip] in
     * the default signal handler.
     *
     * Note that if both [property@Gtk.Widget:tooltip-text] and
     * [property@Gtk.Widget:tooltip-markup] are set, the last one wins.
     */
    public open var tooltipText: String?
        /**
         * Gets the contents of the tooltip for @widget.
         *
         * If the @widget's tooltip was set using
         * [method@Gtk.Widget.set_tooltip_markup],
         * this function will return the escaped text.
         *
         * @return the tooltip text
         */
        get() = gtk_widget_get_tooltip_text(gtkWidgetPointer)?.toKString()

        /**
         * Sets @text as the contents of the tooltip.
         *
         * If @text contains any markup, it will be escaped.
         *
         * This function will take care of setting
         * [property@Gtk.Widget:has-tooltip] as a side effect,
         * and of the default handler for the
         * [signal@Gtk.Widget::query-tooltip] signal.
         *
         * See also [method@Gtk.Tooltip.set_text].
         *
         * @param text the contents of the tooltip for @widget
         */
        set(text) = gtk_widget_set_tooltip_text(gtkWidgetPointer, text)

    /**
     * How to distribute vertical space if widget gets extra space.
     */
    public open var valign: Align
        /**
         * Gets the vertical alignment of @widget.
         *
         * @return the vertical alignment of @widget
         */
        get() = gtk_widget_get_valign(gtkWidgetPointer).run {
            Align.fromNativeValue(this)
        }

        /**
         * Sets the vertical alignment of @widget.
         *
         * @param align the vertical alignment
         */
        set(align) = gtk_widget_set_valign(gtkWidgetPointer, align.nativeValue)

    /**
     * Whether to expand vertically.
     */
    public open var vexpand: Boolean
        /**
         * Gets whether the widget would like any available extra vertical
         * space.
         *
         * See [method@Gtk.Widget.get_hexpand] for more detail.
         *
         * @return whether vexpand flag is set
         */
        get() = gtk_widget_get_vexpand(gtkWidgetPointer).asBoolean()

        /**
         * Sets whether the widget would like any available extra vertical
         * space.
         *
         * See [method@Gtk.Widget.set_hexpand] for more detail.
         *
         * @param expand whether to expand
         */
        set(expand) = gtk_widget_set_vexpand(gtkWidgetPointer, expand.asGBoolean())

    /**
     * Whether to use the `vexpand` property.
     */
    public open var vexpandSet: Boolean
        /**
         * Gets whether gtk_widget_set_vexpand() has been used to
         * explicitly set the expand flag on this widget.
         *
         * See [method@Gtk.Widget.get_hexpand_set] for more detail.
         *
         * @return whether vexpand has been explicitly set
         */
        get() = gtk_widget_get_vexpand_set(gtkWidgetPointer).asBoolean()

        /**
         * Sets whether the vexpand flag will be used.
         *
         * See [method@Gtk.Widget.set_hexpand_set] for more detail.
         *
         * @param set value for vexpand-set property
         */
        set(`set`) = gtk_widget_set_vexpand_set(gtkWidgetPointer, `set`.asGBoolean())

    /**
     * Whether the widget is visible.
     */
    public open var visible: Boolean
        /**
         * Determines whether the widget is visible.
         *
         * If you want to take into account whether the widget’s
         * parent is also marked as visible, use
         * [method@Gtk.Widget.is_visible] instead.
         *
         * This function does not check if the widget is
         * obscured in any way.
         *
         * See [method@Gtk.Widget.set_visible].
         *
         * @return true if the widget is visible
         */
        get() = gtk_widget_get_visible(gtkWidgetPointer).asBoolean()

        /**
         * Sets the visibility state of @widget.
         *
         * Note that setting this to true doesn’t mean the widget is
         * actually viewable, see [method@Gtk.Widget.get_visible].
         *
         * @param visible whether the widget should be shown or not
         */
        set(visible) = gtk_widget_set_visible(gtkWidgetPointer, visible.asGBoolean())

    /**
     * Enable or disable an action installed with
     * gtk_widget_class_install_action().
     *
     * @param actionName action name, such as "clipboard.paste"
     * @param enabled whether the action is now enabled
     */
    public open fun actionSetEnabled(actionName: String, enabled: Boolean): Unit =
        gtk_widget_action_set_enabled(gtkWidgetPointer, actionName, enabled.asGBoolean())

    /**
     * For widgets that can be “activated” (buttons, menu items, etc.),
     * this function activates them.
     *
     * The activation will emit the signal set using
     * [method@Gtk.WidgetClass.set_activate_signal] during class initialization.
     *
     * Activation is what happens when you press <kbd>Enter</kbd>
     * on a widget during key navigation.
     *
     * If you wish to handle the activation keybinding yourself, it is
     * recommended to use [method@Gtk.WidgetClass.add_shortcut] with an action
     * created with [ctor@Gtk.SignalAction.new].
     *
     * If @widget isn't activatable, the function returns false.
     *
     * @return true if the widget was activatable
     */
    public open fun activateWidget(): Boolean = gtk_widget_activate(gtkWidgetPointer).asBoolean()

    /**
     * Looks up the action in the action groups associated with
     * @widget and its ancestors, and activates it.
     *
     * If the action is in an action group added with
     * [method@Gtk.Widget.insert_action_group], the @name is expected
     * to be prefixed with the prefix that was used when the group was
     * inserted.
     *
     * The arguments must match the actions expected parameter type,
     * as returned by `g_action_get_parameter_type()`.
     *
     * @param name the name of the action to activate
     * @param args parameters to use
     * @return true if the action was activated, false if the
     *   action does not exist.
     */
    public open fun activateActionIfExists(name: String, args: Variant? = null): Boolean =
        gtk_widget_activate_action_variant(gtkWidgetPointer, name, args?.glibVariantPointer).asBoolean()

    /**
     * Activates the `default.activate` action from @widget.
     */
    public open fun activateDefault(): Unit = gtk_widget_activate_default(gtkWidgetPointer)

    /**
     * Adds @controller to @widget so that it will receive events.
     *
     * You will usually want to call this function right after
     * creating any kind of [class@Gtk.EventController].
     *
     * @param controller a `GtkEventController` that hasn't been
     *   added to a widget yet
     */
    public open fun addController(controller: EventController): Unit =
        gtk_widget_add_controller(gtkWidgetPointer, controller.gtkEventControllerPointer)

    /**
     * Adds a style class to @widget.
     *
     * After calling this function, the widget’s style will match
     * for @css_class, according to CSS matching rules.
     *
     * Use [method@Gtk.Widget.remove_css_class] to remove the
     * style again.
     *
     * @param cssClass The style class to add to @widget, without
     *   the leading '.' used for notation of style classes
     */
    public open fun addCssClass(cssClass: String): Unit = gtk_widget_add_css_class(gtkWidgetPointer, cssClass)

    /**
     * Adds a widget to the list of mnemonic labels for this widget.
     *
     * See [method@Gtk.Widget.list_mnemonic_labels]. Note the
     * list of mnemonic labels for the widget is cleared when the
     * widget is destroyed, so the caller must make sure to update
     * its internal state at this point as well.
     *
     * @param label a `GtkWidget` that acts as a mnemonic label for @widget
     */
    public open fun addMnemonicLabel(label: Widget): Unit =
        gtk_widget_add_mnemonic_label(gtkWidgetPointer, label.gtkWidgetPointer)

    /**
     * Queues an animation frame update and adds a callback to be called
     * before each frame.
     *
     * Until the tick callback is removed, it will be called frequently
     * (usually at the frame rate of the output device or as quickly as
     * the application can be repainted, whichever is slower). For this
     * reason, is most suitable for handling graphics that change every
     * frame or every few frames. The tick callback does not automatically
     * imply a relayout or repaint. If you want a repaint or relayout, and
     * aren’t changing widget properties that would trigger that (for example,
     * changing the text of a `GtkLabel`), then you will have to call
     * [method@Gtk.Widget.queue_resize] or [method@Gtk.Widget.queue_draw]
     * yourself.
     *
     * [method@Gdk.FrameClock.get_frame_time] should generally be used
     * for timing continuous animations and
     * [method@Gdk.FrameTimings.get_predicted_presentation_time] if you are
     * trying to display isolated frames at particular times.
     *
     * This is a more convenient alternative to connecting directly to the
     * [signal@Gdk.FrameClock::update] signal of `GdkFrameClock`, since you
     * don't have to worry about when a `GdkFrameClock` is assigned to a widget.
     *
     * @param callback function to call for updating animations
     * @return an id for the connection of this callback. Remove the callback
     *   by passing the id returned from this function to
     *   [method@Gtk.Widget.remove_tick_callback]
     */
    public open fun addTickCallback(callback: TickCallback): guint = gtk_widget_add_tick_callback(
        gtkWidgetPointer,
        TickCallbackFunc.reinterpret(),
        StableRef.create(callback).asCPointer(),
        staticStableRefDestroy.reinterpret()
    )

    /**
     * This function is only used by `GtkWidget` subclasses, to
     * assign a size, position and (optionally) baseline to their
     * child widgets.
     *
     * In this function, the allocation and baseline may be adjusted.
     * The given allocation will be forced to be bigger than the
     * widget's minimum size, as well as at least 0×0 in size.
     *
     * For a version that does not take a transform, see
     * [method@Gtk.Widget.size_allocate].
     *
     * @param width New width of @widget
     * @param height New height of @widget
     * @param baseline New baseline of @widget, or -1
     * @param transform Transformation to be applied to @widget
     */
    public open fun allocate(width: gint, height: gint, baseline: gint, transform: Transform? = null): Unit =
        gtk_widget_allocate(gtkWidgetPointer, width, height, baseline, transform?.gskTransformPointer)

    /**
     * Called by widgets as the user moves around the window using
     * keyboard shortcuts.
     *
     * The @direction argument indicates what kind of motion is taking place (up,
     * down, left, right, tab forward, tab backward).
     *
     * This function calls the [vfunc@Gtk.Widget.focus] virtual function; widgets
     * can override the virtual function in order to implement appropriate focus
     * behavior.
     *
     * The default `focus()` virtual function for a widget should return `TRUE` if
     * moving in @direction left the focus on a focusable location inside that
     * widget, and `FALSE` if moving in @direction moved the focus outside the
     * widget. When returning `TRUE`, widgets normally call [method@Gtk.Widget.grab_focus]
     * to place the focus accordingly; when returning `FALSE`, they don’t modify
     * the current focus location.
     *
     * This function is used by custom widget implementations; if you're
     * writing an app, you’d use [method@Gtk.Widget.grab_focus] to move
     * the focus to a particular widget.
     *
     * @param direction direction of focus movement
     * @return true if focus ended up inside @widget
     */
    public open fun childFocus(direction: DirectionType): Boolean =
        gtk_widget_child_focus(gtkWidgetPointer, direction.nativeValue).asBoolean()

    /**
     * Computes the bounds for @widget in the coordinate space of @target.
     *
     * The bounds of widget are (the bounding box of) the region that it is
     * expected to draw in. See the [coordinate system](coordinates.html)
     * overview to learn more.
     *
     * If the operation is successful, true is returned. If @widget has no
     * bounds or the bounds cannot be expressed in @target's coordinate space
     * (for example if both widgets are in different windows), false is
     * returned and @bounds is set to the zero rectangle.
     *
     * It is valid for @widget and @target to be the same widget.
     *
     * @param target the `GtkWidget`
     * @param outBounds the rectangle taking the bounds
     * @return true if the bounds could be computed
     */
    public open fun computeBounds(target: Widget, outBounds: Rect): Boolean =
        gtk_widget_compute_bounds(gtkWidgetPointer, target.gtkWidgetPointer, outBounds.grapheneRectPointer).asBoolean()

    /**
     * Computes whether a container should give this widget
     * extra space when possible.
     *
     * Containers should check this, rather than looking at
     * [method@Gtk.Widget.get_hexpand] or [method@Gtk.Widget.get_vexpand].
     *
     * This function already checks whether the widget is visible, so
     * visibility does not need to be checked separately. Non-visible
     * widgets are not expanded.
     *
     * The computed expand value uses either the expand setting explicitly
     * set on the widget itself, or, if none has been explicitly set,
     * the widget may expand if some of its children do.
     *
     * @param orientation expand direction
     * @return whether widget tree rooted here should be expanded
     */
    public open fun computeExpand(orientation: Orientation): Boolean =
        gtk_widget_compute_expand(gtkWidgetPointer, orientation.nativeValue).asBoolean()

    /**
     * Translates the given @point in @widget's coordinates to coordinates
     * relative to @target’s coordinate system.
     *
     * In order to perform this operation, both widgets must share a
     * common ancestor.
     *
     * @param target the `GtkWidget` to transform into
     * @param point a point in @widget's coordinate system
     * @param outPoint Set to the corresponding coordinates in
     *   @target's coordinate system
     * @return true if the point could be determined, false on failure.
     *   In this case, 0 is stored in @out_point.
     */
    public open fun computePoint(target: Widget, point: Point, outPoint: Point): Boolean = gtk_widget_compute_point(
        gtkWidgetPointer,
        target.gtkWidgetPointer,
        point.graphenePointPointer,
        outPoint.graphenePointPointer
    ).asBoolean()

    /**
     * Computes a matrix suitable to describe a transformation from
     * @widget's coordinate system into @target's coordinate system.
     *
     * The transform can not be computed in certain cases, for example
     * when @widget and @target do not share a common ancestor. In that
     * case @out_transform gets set to the identity matrix.
     *
     * To learn more about widget coordinate systems, see the coordinate
     * system [overview](coordinates.html).
     *
     * @param target the target widget that the matrix will transform to
     * @param outTransform location to
     *   store the final transformation
     * @return true if the transform could be computed, false otherwise
     */
    public open fun computeTransform(target: Widget, outTransform: Matrix): Boolean = gtk_widget_compute_transform(
        gtkWidgetPointer,
        target.gtkWidgetPointer,
        outTransform.grapheneMatrixPointer
    ).asBoolean()

    /**
     * Tests if the point at (@x, @y) is contained in @widget.
     *
     * The coordinates for (@x, @y) must be in widget coordinates, so
     * (0, 0) is assumed to be the top left of @widget's content area.
     *
     * @param x X coordinate to test, relative to @widget's origin
     * @param y Y coordinate to test, relative to @widget's origin
     * @return true if @widget contains (@x, @y).
     */
    public open fun contains(x: gdouble, y: gdouble): Boolean = gtk_widget_contains(gtkWidgetPointer, x, y).asBoolean()

    /**
     * Creates a new `PangoContext` with the appropriate font map,
     * font options, font description, and base direction for drawing
     * text for this widget.
     *
     * See also [method@Gtk.Widget.get_pango_context].
     *
     * @return the new `PangoContext`
     */
    public open fun createPangoContext(): Context = gtk_widget_create_pango_context(gtkWidgetPointer)!!.run {
        Context(this)
    }

    /**
     * Creates a new `PangoLayout` with the appropriate font map,
     * font description, and base direction for drawing text for
     * this widget.
     *
     * If you keep a `PangoLayout` created in this way around,
     * you need to re-create it when the widget `PangoContext`
     * is replaced. This can be tracked by listening to changes
     * of the [property@Gtk.Widget:root] property on the widget.
     *
     * @param text text to set on the layout
     * @return the new `PangoLayout`
     */
    public open fun createPangoLayout(text: String? = null): Layout =
        gtk_widget_create_pango_layout(gtkWidgetPointer, text)!!.run {
            Layout(this)
        }

    /**
     * Clears the template children for the given widget.
     *
     * This function is the opposite of [method@Gtk.Widget.init_template], and
     * it is used to clear all the template children from a widget instance.
     * If you bound a template child to a field in the instance structure, or
     * in the instance private data structure, the field will be set to `NULL`
     * after this function returns.
     *
     * You should call this function inside the `GObjectClass.dispose()`
     * implementation of any widget that called `gtk_widget_init_template()`.
     * Typically, you will want to call this function last, right before
     * chaining up to the parent type's dispose implementation, e.g.
     *
     * ```c
     * static void
     * some_widget_dispose (GObject *gobject)
     * {
     *   SomeWidget *self = SOME_WIDGET (gobject);
     *
     *   // Clear the template data for SomeWidget
     *   gtk_widget_dispose_template (GTK_WIDGET (self), SOME_TYPE_WIDGET);
     *
     *   G_OBJECT_CLASS (some_widget_parent_class)->dispose (gobject);
     * }
     * ```
     *
     * @param widgetType the type of the widget to finalize the template for
     * @since 4.8
     */
    @GtkVersion4_8
    public open fun disposeTemplate(widgetType: GType): Unit = gtk_widget_dispose_template(gtkWidgetPointer, widgetType)

    /**
     * Checks to see if a drag movement has passed the GTK drag threshold.
     *
     * @param startX X coordinate of start of drag
     * @param startY Y coordinate of start of drag
     * @param currentX current X coordinate
     * @param currentY current Y coordinate
     * @return true if the drag threshold has been passed.
     */
    public open fun dragCheckThreshold(startX: gint, startY: gint, currentX: gint, currentY: gint): Boolean =
        gtk_drag_check_threshold(gtkWidgetPointer, startX, startY, currentX, currentY).asBoolean()

    /**
     * Notifies the user about an input-related error on this widget.
     *
     * If the [property@Gtk.Settings:gtk-error-bell] setting is true,
     * it calls [method@Gdk.Surface.beep], otherwise it does nothing.
     *
     * Note that the effect of [method@Gdk.Surface.beep] can be configured
     * in many ways, depending on the windowing backend and the desktop
     * environment or window manager that is used.
     */
    public open fun errorBell(): Unit = gtk_widget_error_bell(gtkWidgetPointer)

    /**
     * Returns the baseline that has currently been allocated to @widget.
     *
     * This function is intended to be used when implementing handlers
     * for the `GtkWidget`Class.snapshot() function, and when allocating
     * child widgets in `GtkWidget`Class.size_allocate().
     *
     * @return the baseline of the @widget, or -1 if none
     */
    public open fun getAllocatedBaseline(): gint = gtk_widget_get_allocated_baseline(gtkWidgetPointer)

    /**
     * Returns the height that has currently been allocated to @widget.
     *
     * To learn more about widget sizes, see the coordinate
     * system [overview](coordinates.html).
     *
     * @return the height of the @widget
     */
    public open fun getAllocatedHeight(): gint = gtk_widget_get_allocated_height(gtkWidgetPointer)

    /**
     * Returns the width that has currently been allocated to @widget.
     *
     * To learn more about widget sizes, see the coordinate
     * system [overview](coordinates.html).
     *
     * @return the width of the @widget
     */
    public open fun getAllocatedWidth(): gint = gtk_widget_get_allocated_width(gtkWidgetPointer)

    /**
     * Retrieves the widget’s allocation.
     *
     * Note, when implementing a layout container: a widget’s allocation
     * will be its “adjusted” allocation, that is, the widget’s parent
     * typically calls [method@Gtk.Widget.size_allocate] with an allocation,
     * and that allocation is then adjusted (to handle margin
     * and alignment for example) before assignment to the widget.
     * [method@Gtk.Widget.get_allocation] returns the adjusted allocation that
     * was actually assigned to the widget. The adjusted allocation is
     * guaranteed to be completely contained within the
     * [method@Gtk.Widget.size_allocate] allocation, however.
     *
     * So a layout container is guaranteed that its children stay inside
     * the assigned bounds, but not that they have exactly the bounds the
     * container assigned.
     *
     * @param allocation a pointer to a `GtkAllocation` to copy to
     */
    public open fun getAllocation(allocation: Allocation): Unit =
        gtk_widget_get_allocation(gtkWidgetPointer, allocation.gdkRectanglePointer)

    /**
     * Gets the first ancestor of @widget with type @widget_type.
     *
     * For example, `gtk_widget_get_ancestor (widget, GTK_TYPE_BOX)`
     * gets the first `GtkBox` that’s an ancestor of @widget. No
     * reference will be added to the returned widget; it should
     * not be unreferenced.
     *
     * Note that unlike [method@Gtk.Widget.is_ancestor], this function
     * considers @widget to be an ancestor of itself.
     *
     * @param widgetType ancestor type
     * @return the ancestor widget
     */
    public open fun getAncestor(widgetType: GType): Widget? =
        gtk_widget_get_ancestor(gtkWidgetPointer, widgetType)?.run {
            WidgetImpl(this)
        }

    /**
     * Returns the baseline that has currently been allocated to @widget.
     *
     * This function is intended to be used when implementing handlers
     * for the `GtkWidget`Class.snapshot() function, and when allocating
     * child widgets in `GtkWidget`Class.size_allocate().
     *
     * @return the baseline of the @widget, or -1 if none
     * @since 4.12
     */
    @GtkVersion4_12
    public open fun getBaseline(): gint = gtk_widget_get_baseline(gtkWidgetPointer)

    /**
     * Gets the value set with gtk_widget_set_child_visible().
     *
     * If you feel a need to use this function, your code probably
     * needs reorganization.
     *
     * This function is only useful for container implementations
     * and should never be called by an application.
     *
     * @return true if the widget is mapped with the parent.
     */
    public open fun getChildVisible(): Boolean = gtk_widget_get_child_visible(gtkWidgetPointer).asBoolean()

    /**
     * Gets the clipboard object for @widget.
     *
     * This is a utility function to get the clipboard object for the
     * `GdkDisplay` that @widget is using.
     *
     * Note that this function always works, even when @widget is not
     * realized yet.
     *
     * @return the appropriate clipboard object
     */
    public open fun getClipboard(): Clipboard = gtk_widget_get_clipboard(gtkWidgetPointer)!!.run {
        Clipboard(this)
    }

    /**
     * Gets the current foreground color for the widget’s
     * CSS style.
     *
     * This function should only be used in snapshot
     * implementations that need to do custom
     * drawing with the foreground color.
     *
     * @param color return location for the color
     * @since 4.10
     */
    @GtkVersion4_10
    public open fun getColor(color: Rgba): Unit = gtk_widget_get_color(gtkWidgetPointer, color.gdkRgbaPointer)

    /**
     * Gets the reading direction for a particular widget.
     *
     * See [method@Gtk.Widget.set_direction].
     *
     * @return the reading direction for the widget.
     */
    public open fun getDirection(): TextDirection = gtk_widget_get_direction(gtkWidgetPointer).run {
        TextDirection.fromNativeValue(this)
    }

    /**
     * Get the `GdkDisplay` for the toplevel window associated with
     * this widget.
     *
     * This function can only be called after the widget has been
     * added to a widget hierarchy with a `GtkWindow` at the top.
     *
     * In general, you should only create display specific
     * resources when a widget has been realized, and you should
     * free those resources when the widget is unrealized.
     *
     * @return the `GdkDisplay` for the toplevel
     *   for this widget.
     */
    public open fun getDisplay(): Display = gtk_widget_get_display(gtkWidgetPointer)!!.run {
        Display(this)
    }

    /**
     * Returns the widget’s first child.
     *
     * This API is primarily meant for widget implementations.
     *
     * @return The widget's first child
     */
    public open fun getFirstChild(): Widget? = gtk_widget_get_first_child(gtkWidgetPointer)?.run {
        WidgetImpl(this)
    }

    /**
     * Returns the current focus child of @widget.
     *
     * @return The current focus
     *   child of @widget
     */
    public open fun getFocusChild(): Widget? = gtk_widget_get_focus_child(gtkWidgetPointer)?.run {
        WidgetImpl(this)
    }

    /**
     * Gets the font map of @widget.
     *
     * See [method@Gtk.Widget.set_font_map].
     *
     * @return A `PangoFontMap`
     */
    public open fun getFontMap(): FontMap? = gtk_widget_get_font_map(gtkWidgetPointer)?.run {
        FontMap.FontMapImpl(this)
    }

    /**
     * Returns the `cairo_font_options_t` of widget.
     *
     * Seee [method@Gtk.Widget.set_font_options].
     *
     * @return the `cairo_font_options_t`
     *   of widget
     */
    public open fun getFontOptions(): FontOptions? = gtk_widget_get_font_options(gtkWidgetPointer)?.run {
        FontOptions(this)
    }

    /**
     * Obtains the frame clock for a widget.
     *
     * The frame clock is a global “ticker” that can be used to drive
     * animations and repaints. The most common reason to get the frame
     * clock is to call [method@Gdk.FrameClock.get_frame_time], in order
     * to get a time to use for animating. For example you might record
     * the start of the animation with an initial value from
     * [method@Gdk.FrameClock.get_frame_time], and then update the animation
     * by calling [method@Gdk.FrameClock.get_frame_time] again during each repaint.
     *
     * [method@Gdk.FrameClock.request_phase] will result in a new frame on the
     * clock, but won’t necessarily repaint any widgets. To repaint a
     * widget, you have to use [method@Gtk.Widget.queue_draw] which invalidates
     * the widget (thus scheduling it to receive a draw on the next
     * frame). gtk_widget_queue_draw() will also end up requesting a frame
     * on the appropriate frame clock.
     *
     * A widget’s frame clock will not change while the widget is
     * mapped. Reparenting a widget (which implies a temporary unmap) can
     * change the widget’s frame clock.
     *
     * Unrealized widgets do not have a frame clock.
     *
     * @return a `GdkFrameClock`
     */
    public open fun getFrameClock(): FrameClock? = gtk_widget_get_frame_clock(gtkWidgetPointer)?.run {
        FrameClock.FrameClockImpl(this)
    }

    /**
     * Returns the content height of the widget.
     *
     * This function returns the height passed to its
     * size-allocate implementation, which is the height you
     * should be using in [vfunc@Gtk.Widget.snapshot].
     *
     * For pointer events, see [method@Gtk.Widget.contains].
     *
     * To learn more about widget sizes, see the coordinate
     * system [overview](coordinates.html).
     *
     * @return The height of @widget
     */
    public open fun getHeight(): gint = gtk_widget_get_height(gtkWidgetPointer)

    /**
     * Returns the widget’s last child.
     *
     * This API is primarily meant for widget implementations.
     *
     * @return The widget's last child
     */
    public open fun getLastChild(): Widget? = gtk_widget_get_last_child(gtkWidgetPointer)?.run {
        WidgetImpl(this)
    }

    /**
     * Whether the widget is mapped.
     *
     * @return true if the widget is mapped, false otherwise.
     */
    public open fun getMapped(): Boolean = gtk_widget_get_mapped(gtkWidgetPointer).asBoolean()

    /**
     * Returns the nearest `GtkNative` ancestor of @widget.
     *
     * This function will return null if the widget is not
     * contained inside a widget tree with a native ancestor.
     *
     * `GtkNative` widgets will return themselves here.
     *
     * @return the `GtkNative` ancestor of @widget
     */
    public open fun getNative(): Native? = gtk_widget_get_native(gtkWidgetPointer)?.run {
        Native.NativeImpl(reinterpret())
    }

    /**
     * Returns the widget’s next sibling.
     *
     * This API is primarily meant for widget implementations.
     *
     * @return The widget's next sibling
     */
    public open fun getNextSibling(): Widget? = gtk_widget_get_next_sibling(gtkWidgetPointer)?.run {
        WidgetImpl(this)
    }

    /**
     * Gets a `PangoContext` with the appropriate font map, font description,
     * and base direction for this widget.
     *
     * Unlike the context returned by [method@Gtk.Widget.create_pango_context],
     * this context is owned by the widget (it can be used until the screen
     * for the widget changes or the widget is removed from its toplevel),
     * and will be updated to match any changes to the widget’s attributes.
     * This can be tracked by listening to changes of the
     * [property@Gtk.Widget:root] property on the widget.
     *
     * @return the `PangoContext` for the widget.
     */
    public open fun getPangoContext(): Context = gtk_widget_get_pango_context(gtkWidgetPointer)!!.run {
        Context(this)
    }

    /**
     * Retrieves the minimum and natural size of a widget, taking
     * into account the widget’s preference for height-for-width management.
     *
     * This is used to retrieve a suitable size by container widgets which do
     * not impose any restrictions on the child placement. It can be used
     * to deduce toplevel window and menu sizes as well as child widgets in
     * free-form containers such as `GtkFixed`.
     *
     * Handle with care. Note that the natural height of a height-for-width
     * widget will generally be a smaller size than the minimum height, since
     * the required height for the natural width is generally smaller than the
     * required height for the minimum width.
     *
     * Use [method@Gtk.Widget.measure] if you want to support baseline alignment.
     *
     * @param minimumSize location for storing the minimum size
     * @param naturalSize location for storing the natural size
     */
    public open fun getPreferredSize(minimumSize: Requisition?, naturalSize: Requisition?): Unit =
        gtk_widget_get_preferred_size(
            gtkWidgetPointer,
            minimumSize?.gtkRequisitionPointer,
            naturalSize?.gtkRequisitionPointer
        )

    /**
     * Returns the widget’s previous sibling.
     *
     * This API is primarily meant for widget implementations.
     *
     * @return The widget's previous sibling
     */
    public open fun getPrevSibling(): Widget? = gtk_widget_get_prev_sibling(gtkWidgetPointer)?.run {
        WidgetImpl(this)
    }

    /**
     * Gets the primary clipboard of @widget.
     *
     * This is a utility function to get the primary clipboard object
     * for the `GdkDisplay` that @widget is using.
     *
     * Note that this function always works, even when @widget is not
     * realized yet.
     *
     * @return the appropriate clipboard object
     */
    public open fun getPrimaryClipboard(): Clipboard = gtk_widget_get_primary_clipboard(gtkWidgetPointer)!!.run {
        Clipboard(this)
    }

    /**
     * Determines whether @widget is realized.
     *
     * @return true if @widget is realized, false otherwise
     */
    public open fun getRealized(): Boolean = gtk_widget_get_realized(gtkWidgetPointer).asBoolean()

    /**
     * Gets whether the widget prefers a height-for-width layout
     * or a width-for-height layout.
     *
     * Single-child widgets generally propagate the preference of
     * their child, more complex widgets need to request something
     * either in context of their children or in context of their
     * allocation capabilities.
     *
     * @return The `GtkSizeRequestMode` preferred by @widget.
     */
    public open fun getRequestMode(): SizeRequestMode = gtk_widget_get_request_mode(gtkWidgetPointer).run {
        SizeRequestMode.fromNativeValue(this)
    }

    /**
     * Gets the settings object holding the settings used for this widget.
     *
     * Note that this function can only be called when the `GtkWidget`
     * is attached to a toplevel, since the settings object is specific
     * to a particular `GdkDisplay`. If you want to monitor the widget for
     * changes in its settings, connect to the `notify::display` signal.
     *
     * @return the relevant `GtkSettings` object
     */
    public open fun getSettings(): Settings = gtk_widget_get_settings(gtkWidgetPointer)!!.run {
        Settings(this)
    }

    /**
     * Returns the content width or height of the widget.
     *
     * Which dimension is returned depends on @orientation.
     *
     * This is equivalent to calling [method@Gtk.Widget.get_width]
     * for %GTK_ORIENTATION_HORIZONTAL or [method@Gtk.Widget.get_height]
     * for %GTK_ORIENTATION_VERTICAL, but can be used when
     * writing orientation-independent code, such as when
     * implementing [iface@Gtk.Orientable] widgets.
     *
     * To learn more about widget sizes, see the coordinate
     * system [overview](coordinates.html).
     *
     * @param orientation the orientation to query
     * @return The size of @widget in @orientation.
     */
    public open fun getSize(orientation: Orientation): gint =
        gtk_widget_get_size(gtkWidgetPointer, orientation.nativeValue)

    /**
     * Returns the widget state as a flag set.
     *
     * It is worth mentioning that the effective %GTK_STATE_FLAG_INSENSITIVE
     * state will be returned, that is, also based on parent insensitivity,
     * even if @widget itself is sensitive.
     *
     * Also note that if you are looking for a way to obtain the
     * [flags@Gtk.StateFlags] to pass to a [class@Gtk.StyleContext]
     * method, you should look at [method@Gtk.StyleContext.get_state].
     *
     * @return The state flags for widget
     */
    public open fun getStateFlags(): StateFlags = gtk_widget_get_state_flags(gtkWidgetPointer).run {
        StateFlags(this)
    }

    /**
     * Returns the style context associated to @widget.
     *
     * The returned object is guaranteed to be the same
     * for the lifetime of @widget.
     *
     * @return the widget’s `GtkStyleContext`
     */
    public open fun getStyleContext(): StyleContext = gtk_widget_get_style_context(gtkWidgetPointer)!!.run {
        StyleContext(this)
    }

    /**
     * Fetch an object build from the template XML for @widget_type in
     * this @widget instance.
     *
     * This will only report children which were previously declared
     * with [method@Gtk.WidgetClass.bind_template_child_full] or one of its
     * variants.
     *
     * This function is only meant to be called for code which is private
     * to the @widget_type which declared the child and is meant for language
     * bindings which cannot easily make use of the GObject structure offsets.
     *
     * @param widgetType The `GType` to get a template child for
     * @param name The “id” of the child defined in the template XML
     * @return The object built in the template XML with
     *   the id @name
     */
    public open fun getTemplateChild(widgetType: GType, name: String): Object =
        gtk_widget_get_template_child(gtkWidgetPointer, widgetType, name)!!.run {
            Object(this)
        }

    /**
     * Returns the content width of the widget.
     *
     * This function returns the width passed to its
     * size-allocate implementation, which is the width you
     * should be using in [vfunc@Gtk.Widget.snapshot].
     *
     * For pointer events, see [method@Gtk.Widget.contains].
     *
     * To learn more about widget sizes, see the coordinate
     * system [overview](coordinates.html).
     *
     * @return The width of @widget
     */
    public open fun getWidth(): gint = gtk_widget_get_width(gtkWidgetPointer)

    /**
     * Causes @widget to have the keyboard focus for the `GtkWindow` it's inside.
     *
     * If @widget is not focusable, or its [vfunc@Gtk.Widget.grab_focus]
     * implementation cannot transfer the focus to a descendant of @widget
     * that is focusable, it will not take focus and false will be returned.
     *
     * Calling [method@Gtk.Widget.grab_focus] on an already focused widget
     * is allowed, should not have an effect, and return true.
     *
     * @return true if focus is now inside @widget.
     */
    public open fun grabFocus(): Boolean = gtk_widget_grab_focus(gtkWidgetPointer).asBoolean()

    /**
     * Returns whether @css_class is currently applied to @widget.
     *
     * @param cssClass A style class, without the leading '.'
     *   used for notation of style classes
     * @return true if @css_class is currently applied to @widget,
     *   false otherwise.
     */
    public open fun hasCssClass(cssClass: String): Boolean =
        gtk_widget_has_css_class(gtkWidgetPointer, cssClass).asBoolean()

    /**
     * Determines whether @widget is the current default widget
     * within its toplevel.
     *
     * @return true if @widget is the current default widget
     *   within its toplevel, false otherwise
     */
    public open fun hasDefault(): Boolean = gtk_widget_has_default(gtkWidgetPointer).asBoolean()

    /**
     * Determines if the widget has the global input focus.
     *
     * See [method@Gtk.Widget.is_focus] for the difference between
     * having the global input focus, and only having the focus
     * within a toplevel.
     *
     * @return true if the widget has the global input focus.
     */
    public open fun hasFocus(): Boolean = gtk_widget_has_focus(gtkWidgetPointer).asBoolean()

    /**
     * Determines if the widget should show a visible indication that
     * it has the global input focus.
     *
     * This is a convenience function that takes into account whether
     * focus indication should currently be shown in the toplevel window
     * of @widget. See [method@Gtk.Window.get_focus_visible] for more
     * information about focus indication.
     *
     * To find out if the widget has the global input focus, use
     * [method@Gtk.Widget.has_focus].
     *
     * @return true if the widget should display a “focus rectangle”
     */
    public open fun hasVisibleFocus(): Boolean = gtk_widget_has_visible_focus(gtkWidgetPointer).asBoolean()

    /**
     * Reverses the effects of gtk_widget_show().
     *
     * This is causing the widget to be hidden (invisible to the user).
     */
    public open fun hide(): Unit = gtk_widget_hide(gtkWidgetPointer)

    /**
     * Returns whether the widget is currently being destroyed.
     *
     * This information can sometimes be used to avoid doing
     * unnecessary work.
     *
     * @return true if @widget is being destroyed
     */
    public open fun inDestruction(): Boolean = gtk_widget_in_destruction(gtkWidgetPointer).asBoolean()

    /**
     * Creates and initializes child widgets defined in templates.
     *
     * This function must be called in the instance initializer
     * for any class which assigned itself a template using
     * [method@Gtk.WidgetClass.set_template].
     *
     * It is important to call this function in the instance initializer
     * of a `GtkWidget` subclass and not in `GObject.constructed()` or
     * `GObject.constructor()` for two reasons:
     *
     *  - derived widgets will assume that the composite widgets
     *    defined by its parent classes have been created in their
     *    relative instance initializers
     *  - when calling `g_object_new()` on a widget with composite templates,
     *    it’s important to build the composite widgets before the construct
     *    properties are set. Properties passed to `g_object_new()` should
     *    take precedence over properties set in the private template XML
     *
     * A good rule of thumb is to call this function as the first thing in
     * an instance initialization function.
     */
    public open fun initTemplate(): Unit = gtk_widget_init_template(gtkWidgetPointer)

    /**
     * Inserts @group into @widget.
     *
     * Children of @widget that implement [iface@Gtk.Actionable] can
     * then be associated with actions in @group by setting their
     * “action-name” to @prefix.`action-name`.
     *
     * Note that inheritance is defined for individual actions. I.e.
     * even if you insert a group with prefix @prefix, actions with
     * the same prefix will still be inherited from the parent, unless
     * the group contains an action with the same name.
     *
     * If @group is null, a previously inserted group for @name is
     * removed from @widget.
     *
     * @param name the prefix for actions in @group
     * @param group a `GActionGroup`, or null to remove
     *   the previously inserted group for @name
     */
    public open fun insertActionGroup(name: String, group: ActionGroup? = null): Unit =
        gtk_widget_insert_action_group(gtkWidgetPointer, name, group?.gioActionGroupPointer)

    /**
     * Inserts @widget into the child widget list of @parent.
     *
     * It will be placed after @previous_sibling, or at the beginning if
     * @previous_sibling is null.
     *
     * After calling this function, `gtk_widget_get_prev_sibling(widget)`
     * will return @previous_sibling.
     *
     * If @parent is already set as the parent widget of @widget, this
     * function can also be used to reorder @widget in the child widget
     * list of @parent.
     *
     * This API is primarily meant for widget implementations; if you are
     * just using a widget, you *must* use its own API for adding children.
     *
     * @param parent the parent `GtkWidget` to insert @widget into
     * @param previousSibling the new previous sibling of @widget
     */
    public open fun insertAfter(parent: Widget, previousSibling: Widget? = null): Unit =
        gtk_widget_insert_after(gtkWidgetPointer, parent.gtkWidgetPointer, previousSibling?.gtkWidgetPointer)

    /**
     * Inserts @widget into the child widget list of @parent.
     *
     * It will be placed before @next_sibling, or at the end if
     * @next_sibling is null.
     *
     * After calling this function, `gtk_widget_get_next_sibling(widget)`
     * will return @next_sibling.
     *
     * If @parent is already set as the parent widget of @widget, this function
     * can also be used to reorder @widget in the child widget list of @parent.
     *
     * This API is primarily meant for widget implementations; if you are
     * just using a widget, you *must* use its own API for adding children.
     *
     * @param parent the parent `GtkWidget` to insert @widget into
     * @param nextSibling the new next sibling of @widget
     */
    public open fun insertBefore(parent: Widget, nextSibling: Widget? = null): Unit =
        gtk_widget_insert_before(gtkWidgetPointer, parent.gtkWidgetPointer, nextSibling?.gtkWidgetPointer)

    /**
     * Determines whether @widget is somewhere inside @ancestor,
     * possibly with intermediate containers.
     *
     * @param ancestor another `GtkWidget`
     * @return true if @ancestor contains @widget as a child,
     *   grandchild, great grandchild, etc.
     */
    public open fun isAncestor(ancestor: Widget): Boolean =
        gtk_widget_is_ancestor(gtkWidgetPointer, ancestor.gtkWidgetPointer).asBoolean()

    /**
     * Determines whether @widget can be drawn to.
     *
     * A widget can be drawn if it is mapped and visible.
     *
     * @return true if @widget is drawable, false otherwise
     */
    public open fun isDrawable(): Boolean = gtk_widget_is_drawable(gtkWidgetPointer).asBoolean()

    /**
     * Determines if the widget is the focus widget within its
     * toplevel.
     *
     * This does not mean that the [property@Gtk.Widget:has-focus]
     * property is necessarily set; [property@Gtk.Widget:has-focus]
     * will only be set if the toplevel widget additionally has the
     * global input focus.
     *
     * @return true if the widget is the focus widget.
     */
    public open fun isFocus(): Boolean = gtk_widget_is_focus(gtkWidgetPointer).asBoolean()

    /**
     * Returns the widget’s effective sensitivity.
     *
     * This means it is sensitive itself and also its
     * parent widget is sensitive.
     *
     * @return true if the widget is effectively sensitive
     */
    public open fun isSensitive(): Boolean = gtk_widget_is_sensitive(gtkWidgetPointer).asBoolean()

    /**
     * Determines whether the widget and all its parents are marked as
     * visible.
     *
     * This function does not check if the widget is obscured in any way.
     *
     * See also [method@Gtk.Widget.get_visible] and
     * [method@Gtk.Widget.set_visible].
     *
     * @return true if the widget and all its parents are visible
     */
    public open fun isVisible(): Boolean = gtk_widget_is_visible(gtkWidgetPointer).asBoolean()

    /**
     * Emits the `::keynav-failed` signal on the widget.
     *
     * This function should be called whenever keyboard navigation
     * within a single widget hits a boundary.
     *
     * The return value of this function should be interpreted
     * in a way similar to the return value of
     * [method@Gtk.Widget.child_focus]. When true is returned,
     * stay in the widget, the failed keyboard  navigation is OK
     * and/or there is nowhere we can/should move the focus to.
     * When false is returned, the caller should continue with
     * keyboard navigation outside the widget, e.g. by calling
     * [method@Gtk.Widget.child_focus] on the widget’s toplevel.
     *
     * The default [signal@Gtk.Widget::keynav-failed] handler returns
     * false for %GTK_DIR_TAB_FORWARD and %GTK_DIR_TAB_BACKWARD.
     * For the other values of `GtkDirectionType` it returns true.
     *
     * Whenever the default handler returns true, it also calls
     * [method@Gtk.Widget.error_bell] to notify the user of the
     * failed keyboard navigation.
     *
     * A use case for providing an own implementation of ::keynav-failed
     * (either by connecting to it or by overriding it) would be a row of
     * [class@Gtk.Entry] widgets where the user should be able to navigate
     * the entire row with the cursor keys, as e.g. known from user
     * interfaces that require entering license keys.
     *
     * @param direction direction of focus movement
     * @return true if stopping keyboard navigation is fine, false
     *   if the emitting widget should try to handle the keyboard
     *   navigation attempt in its parent container(s).
     */
    public open fun keynavFailed(direction: DirectionType): Boolean =
        gtk_widget_keynav_failed(gtkWidgetPointer, direction.nativeValue).asBoolean()

    /**
     * Returns the widgets for which this widget is the target of a
     * mnemonic.
     *
     * Typically, these widgets will be labels. See, for example,
     * [method@Gtk.Label.set_mnemonic_widget].
     *
     * The widgets in the list are not individually referenced.
     * If you want to iterate through the list and perform actions
     * involving callbacks that might destroy the widgets, you
     * must call `g_list_foreach (result, (GFunc)g_object_ref, NULL)`
     * first, and then unref all the widgets afterwards.
     *
     * @return the list
     *   of mnemonic labels; free this list with g_list_free() when you
     *   are done with it.
     */
    public open fun listMnemonicLabels(): GlibList = gtk_widget_list_mnemonic_labels(gtkWidgetPointer)!!.run {
        GlibList(this)
    }

    /**
     * Causes a widget to be mapped if it isn’t already.
     *
     * This function is only for use in widget implementations.
     */
    public open fun map(): Unit = gtk_widget_map(gtkWidgetPointer)

    /**
     * Emits the ::mnemonic-activate signal.
     *
     * See [signal@Gtk.Widget::mnemonic-activate].
     *
     * @param groupCycling true if there are other widgets with the same mnemonic
     * @return true if the signal has been handled
     */
    public open fun mnemonicActivate(groupCycling: Boolean): Boolean =
        gtk_widget_mnemonic_activate(gtkWidgetPointer, groupCycling.asGBoolean()).asBoolean()

    /**
     * Returns a `GListModel` to track the children of @widget.
     *
     * Calling this function will enable extra internal bookkeeping
     * to track children and emit signals on the returned listmodel.
     * It may slow down operations a lot.
     *
     * Applications should try hard to avoid calling this function
     * because of the slowdowns.
     *
     * @return a `GListModel` tracking @widget's children
     */
    public open fun observeChildren(): ListModel = gtk_widget_observe_children(gtkWidgetPointer)!!.run {
        ListModel.ListModelImpl(reinterpret())
    }

    /**
     * Returns a `GListModel` to track the [class@Gtk.EventController]s
     * of @widget.
     *
     * Calling this function will enable extra internal bookkeeping
     * to track controllers and emit signals on the returned listmodel.
     * It may slow down operations a lot.
     *
     * Applications should try hard to avoid calling this function
     * because of the slowdowns.
     *
     * @return a `GListModel` tracking @widget's controllers
     */
    public open fun observeControllers(): ListModel = gtk_widget_observe_controllers(gtkWidgetPointer)!!.run {
        ListModel.ListModelImpl(reinterpret())
    }

    /**
     * Finds the descendant of @widget closest to the point (@x, @y).
     *
     * The point must be given in widget coordinates, so (0, 0) is assumed
     * to be the top left of @widget's content area.
     *
     * Usually widgets will return null if the given coordinate is not
     * contained in @widget checked via [method@Gtk.Widget.contains].
     * Otherwise they will recursively try to find a child that does
     * not return null. Widgets are however free to customize their
     * picking algorithm.
     *
     * This function is used on the toplevel to determine the widget
     * below the mouse cursor for purposes of hover highlighting and
     * delivering events.
     *
     * @param x X coordinate to test, relative to @widget's origin
     * @param y Y coordinate to test, relative to @widget's origin
     * @param flags Flags to influence what is picked
     * @return The widget descendant at
     *   the given point
     */
    public open fun pick(x: gdouble, y: gdouble, flags: PickFlags): Widget? =
        gtk_widget_pick(gtkWidgetPointer, x, y, flags.mask)?.run {
            WidgetImpl(this)
        }

    /**
     * Flags the widget for a rerun of the [vfunc@Gtk.Widget.size_allocate]
     * function.
     *
     * Use this function instead of [method@Gtk.Widget.queue_resize]
     * when the @widget's size request didn't change but it wants to
     * reposition its contents.
     *
     * An example user of this function is [method@Gtk.Widget.set_halign].
     *
     * This function is only for use in widget implementations.
     */
    public open fun queueAllocate(): Unit = gtk_widget_queue_allocate(gtkWidgetPointer)

    /**
     * Schedules this widget to be redrawn in the paint phase
     * of the current or the next frame.
     *
     * This means @widget's [vfunc@Gtk.Widget.snapshot]
     * implementation will be called.
     */
    public open fun queueDraw(): Unit = gtk_widget_queue_draw(gtkWidgetPointer)

    /**
     * Flags a widget to have its size renegotiated.
     *
     * This should be called when a widget for some reason has a new
     * size request. For example, when you change the text in a
     * [class@Gtk.Label], the label queues a resize to ensure there’s
     * enough space for the new text.
     *
     * Note that you cannot call gtk_widget_queue_resize() on a widget
     * from inside its implementation of the [vfunc@Gtk.Widget.size_allocate]
     * virtual method. Calls to gtk_widget_queue_resize() from inside
     * [vfunc@Gtk.Widget.size_allocate] will be silently ignored.
     *
     * This function is only for use in widget implementations.
     */
    public open fun queueResize(): Unit = gtk_widget_queue_resize(gtkWidgetPointer)

    /**
     * Creates the GDK resources associated with a widget.
     *
     * Normally realization happens implicitly; if you show a widget
     * and all its parent containers, then the widget will be realized
     * and mapped automatically.
     *
     * Realizing a widget requires all the widget’s parent widgets to be
     * realized; calling this function realizes the widget’s parents
     * in addition to @widget itself. If a widget is not yet inside a
     * toplevel window when you realize it, bad things will happen.
     *
     * This function is primarily used in widget implementations, and
     * isn’t very useful otherwise. Many times when you think you might
     * need it, a better approach is to connect to a signal that will be
     * called after the widget is realized automatically, such as
     * [signal@Gtk.Widget::realize].
     */
    public open fun realize(): Unit = gtk_widget_realize(gtkWidgetPointer)

    /**
     * Removes @controller from @widget, so that it doesn't process
     * events anymore.
     *
     * It should not be used again.
     *
     * Widgets will remove all event controllers automatically when they
     * are destroyed, there is normally no need to call this function.
     *
     * @param controller a `GtkEventController`
     */
    public open fun removeController(controller: EventController): Unit =
        gtk_widget_remove_controller(gtkWidgetPointer, controller.gtkEventControllerPointer)

    /**
     * Removes a style from @widget.
     *
     * After this, the style of @widget will stop matching for @css_class.
     *
     * @param cssClass The style class to remove from @widget, without
     *   the leading '.' used for notation of style classes
     */
    public open fun removeCssClass(cssClass: String): Unit = gtk_widget_remove_css_class(gtkWidgetPointer, cssClass)

    /**
     * Removes a widget from the list of mnemonic labels for this widget.
     *
     * See [method@Gtk.Widget.list_mnemonic_labels]. The widget must
     * have previously been added to the list with
     * [method@Gtk.Widget.add_mnemonic_label].
     *
     * @param label a `GtkWidget` that was previously set as a mnemonic
     *   label for @widget with [method@Gtk.Widget.add_mnemonic_label]
     */
    public open fun removeMnemonicLabel(label: Widget): Unit =
        gtk_widget_remove_mnemonic_label(gtkWidgetPointer, label.gtkWidgetPointer)

    /**
     * Removes a tick callback previously registered with
     * gtk_widget_add_tick_callback().
     *
     * @param id an id returned by [method@Gtk.Widget.add_tick_callback]
     */
    public open fun removeTickCallback(id: guint): Unit = gtk_widget_remove_tick_callback(gtkWidgetPointer, id)

    /**
     * Sets whether @widget should be mapped along with its parent.
     *
     * The child visibility can be set for widget before it is added
     * to a container with [method@Gtk.Widget.set_parent], to avoid
     * mapping children unnecessary before immediately unmapping them.
     * However it will be reset to its default state of true when the
     * widget is removed from a container.
     *
     * Note that changing the child visibility of a widget does not
     * queue a resize on the widget. Most of the time, the size of
     * a widget is computed from all visible children, whether or
     * not they are mapped. If this is not the case, the container
     * can queue a resize itself.
     *
     * This function is only useful for container implementations
     * and should never be called by an application.
     *
     * @param childVisible if true, @widget should be mapped along
     *   with its parent.
     */
    public open fun setChildVisible(childVisible: Boolean): Unit =
        gtk_widget_set_child_visible(gtkWidgetPointer, childVisible.asGBoolean())

    /**
     * Sets a named cursor to be shown when pointer devices point
     * towards @widget.
     *
     * This is a utility function that creates a cursor via
     * [ctor@Gdk.Cursor.new_from_name] and then sets it on @widget
     * with [method@Gtk.Widget.set_cursor]. See those functions for
     * details.
     *
     * On top of that, this function allows @name to be null, which
     * will do the same as calling [method@Gtk.Widget.set_cursor]
     * with a null cursor.
     *
     * @param name The name of the cursor
     */
    public open fun setCursorFromName(name: String? = null): Unit =
        gtk_widget_set_cursor_from_name(gtkWidgetPointer, name)

    /**
     * Sets the reading direction on a particular widget.
     *
     * This direction controls the primary direction for widgets
     * containing text, and also the direction in which the children
     * of a container are packed. The ability to set the direction is
     * present in order so that correct localization into languages with
     * right-to-left reading directions can be done. Generally, applications
     * will let the default reading direction present, except for containers
     * where the containers are arranged in an order that is explicitly
     * visual rather than logical (such as buttons for text justification).
     *
     * If the direction is set to %GTK_TEXT_DIR_NONE, then the value
     * set by [func@Gtk.Widget.set_default_direction] will be used.
     *
     * @param dir the new direction
     */
    public open fun setDirection(dir: TextDirection): Unit = gtk_widget_set_direction(gtkWidgetPointer, dir.nativeValue)

    /**
     * Set @child as the current focus child of @widget.
     *
     * This function is only suitable for widget implementations.
     * If you want a certain widget to get the input focus, call
     * [method@Gtk.Widget.grab_focus] on it.
     *
     * @param child a direct child widget of @widget or null
     *   to unset the focus child of @widget
     */
    public open fun setFocusChild(child: Widget? = null): Unit =
        gtk_widget_set_focus_child(gtkWidgetPointer, child?.gtkWidgetPointer)

    /**
     * Sets the font map to use for Pango rendering.
     *
     * The font map is the object that is used to look up fonts.
     * Setting a custom font map can be useful in special situations,
     * e.g. when you need to add application-specific fonts to the set
     * of available fonts.
     *
     * When not set, the widget will inherit the font map from its parent.
     *
     * @param fontMap a `PangoFontMap`, or null to unset any
     *   previously set font map
     */
    public open fun setFontMap(fontMap: FontMap? = null): Unit =
        gtk_widget_set_font_map(gtkWidgetPointer, fontMap?.pangoFontMapPointer)

    /**
     * Sets the `cairo_font_options_t` used for Pango rendering
     * in this widget.
     *
     * When not set, the default font options for the `GdkDisplay`
     * will be used.
     *
     * @param options a `cairo_font_options_t`
     *   to unset any previously set default font options
     */
    public open fun setFontOptions(options: FontOptions? = null): Unit =
        gtk_widget_set_font_options(gtkWidgetPointer, options?.cairoFontOptionsPointer)

    /**
     * Sets @parent as the parent widget of @widget.
     *
     * This takes care of details such as updating the state and style
     * of the child to reflect its new location and resizing the parent.
     * The opposite function is [method@Gtk.Widget.unparent].
     *
     * This function is useful only when implementing subclasses of
     * `GtkWidget`.
     *
     * @param parent parent widget
     */
    public open fun setParent(parent: Widget): Unit = gtk_widget_set_parent(gtkWidgetPointer, parent.gtkWidgetPointer)

    /**
     * Sets the minimum size of a widget.
     *
     * That is, the widget’s size request will be at least @width
     * by @height. You can use this function to force a widget to
     * be larger than it normally would be.
     *
     * In most cases, [method@Gtk.Window.set_default_size] is a better
     * choice for toplevel windows than this function; setting the default
     * size will still allow users to shrink the window. Setting the size
     * request will force them to leave the window at least as large as
     * the size request.
     *
     * Note the inherent danger of setting any fixed size - themes,
     * translations into other languages, different fonts, and user action
     * can all change the appropriate size for a given widget. So, it's
     * basically impossible to hardcode a size that will always be
     * correct.
     *
     * The size request of a widget is the smallest size a widget can
     * accept while still functioning well and drawing itself correctly.
     * However in some strange cases a widget may be allocated less than
     * its requested size, and in many cases a widget may be allocated more
     * space than it requested.
     *
     * If the size request in a given direction is -1 (unset), then
     * the “natural” size request of the widget will be used instead.
     *
     * The size request set here does not include any margin from the
     * properties
     * [property@Gtk.Widget:margin-start],
     * [property@Gtk.Widget:margin-end],
     * [property@Gtk.Widget:margin-top], and
     * [property@Gtk.Widget:margin-bottom], but it does include pretty
     * much all other padding or border properties set by any subclass
     * of `GtkWidget`.
     *
     * @param width width @widget should request, or -1 to unset
     * @param height height @widget should request, or -1 to unset
     */
    public open fun setSizeRequest(width: gint, height: gint): Unit =
        gtk_widget_set_size_request(gtkWidgetPointer, width, height)

    /**
     * Turns on flag values in the current widget state.
     *
     * Typical widget states are insensitive, prelighted, etc.
     *
     * This function accepts the values %GTK_STATE_FLAG_DIR_LTR and
     * %GTK_STATE_FLAG_DIR_RTL but ignores them. If you want to set
     * the widget's direction, use [method@Gtk.Widget.set_direction].
     *
     * This function is for use in widget implementations.
     *
     * @param flags State flags to turn on
     * @param clear Whether to clear state before turning on @flags
     */
    public open fun setStateFlags(flags: StateFlags, clear: Boolean): Unit =
        gtk_widget_set_state_flags(gtkWidgetPointer, flags.mask, clear.asGBoolean())

    /**
     * Returns whether @widget should contribute to
     * the measuring and allocation of its parent.
     *
     * This is false for invisible children, but also
     * for children that have their own surface.
     *
     * @return true if child should be included in
     *   measuring and allocating
     */
    public open fun shouldLayout(): Boolean = gtk_widget_should_layout(gtkWidgetPointer).asBoolean()

    /**
     * Flags a widget to be displayed.
     *
     * Any widget that isn’t shown will not appear on the screen.
     *
     * Remember that you have to show the containers containing a widget,
     * in addition to the widget itself, before it will appear onscreen.
     *
     * When a toplevel container is shown, it is immediately realized and
     * mapped; other shown widgets are realized and mapped when their
     * toplevel container is realized and mapped.
     */
    public open fun show(): Unit = gtk_widget_show(gtkWidgetPointer)

    /**
     * Allocates widget with a transformation that translates
     * the origin to the position in @allocation.
     *
     * This is a simple form of [method@Gtk.Widget.allocate].
     *
     * @param allocation position and size to be allocated to @widget
     * @param baseline The baseline of the child, or -1
     */
    public open fun sizeAllocate(allocation: Allocation, baseline: gint): Unit =
        gtk_widget_size_allocate(gtkWidgetPointer, allocation.gdkRectanglePointer, baseline)

    /**
     * Snapshot the a child of @widget.
     *
     * When a widget receives a call to the snapshot function,
     * it must send synthetic [vfunc@Gtk.Widget.snapshot] calls
     * to all children. This function provides a convenient way
     * of doing this. A widget, when it receives a call to its
     * [vfunc@Gtk.Widget.snapshot] function, calls
     * gtk_widget_snapshot_child() once for each child, passing in
     * the @snapshot the widget received.
     *
     * gtk_widget_snapshot_child() takes care of translating the origin of
     * @snapshot, and deciding whether the child needs to be snapshot.
     *
     * This function does nothing for children that implement `GtkNative`.
     *
     * @param child a child of @widget
     * @param snapshot `GtkSnapshot` as passed to the widget. In particular, no
     *   calls to gtk_snapshot_translate() or other transform calls should
     *   have been made.
     */
    public open fun snapshotChild(child: Widget, snapshot: Snapshot): Unit =
        gtk_widget_snapshot_child(gtkWidgetPointer, child.gtkWidgetPointer, snapshot.gtkSnapshotPointer)

    /**
     * Triggers a tooltip query on the display where the toplevel
     * of @widget is located.
     */
    public open fun triggerTooltipQuery(): Unit = gtk_widget_trigger_tooltip_query(gtkWidgetPointer)

    /**
     * Causes a widget to be unmapped if it’s currently mapped.
     *
     * This function is only for use in widget implementations.
     */
    public open fun unmap(): Unit = gtk_widget_unmap(gtkWidgetPointer)

    /**
     * Dissociate @widget from its parent.
     *
     * This function is only for use in widget implementations,
     * typically in dispose.
     */
    public open fun unparent(): Unit = gtk_widget_unparent(gtkWidgetPointer)

    /**
     * Causes a widget to be unrealized (frees all GDK resources
     * associated with the widget).
     *
     * This function is only useful in widget implementations.
     */
    public open fun unrealize(): Unit = gtk_widget_unrealize(gtkWidgetPointer)

    /**
     * Turns off flag values for the current widget state.
     *
     * See [method@Gtk.Widget.set_state_flags].
     *
     * This function is for use in widget implementations.
     *
     * @param flags State flags to turn off
     */
    public open fun unsetStateFlags(flags: StateFlags): Unit =
        gtk_widget_unset_state_flags(gtkWidgetPointer, flags.mask)

    /**
     * Signals that all holders of a reference to the widget should release
     * the reference that they hold.
     *
     * May result in finalization of the widget if all references are released.
     *
     * This signal is not suitable for saving widget state.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onDestroy(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkWidgetPointer,
            "destroy",
            onDestroyFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "destroy" signal. See [onDestroy].
     */
    public fun emitDestroy() {
        g_signal_emit_by_name(gtkWidgetPointer.reinterpret(), "destroy")
    }

    /**
     * Emitted when the text direction of a widget changes.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `previousDirection` the previous text direction of @widget
     */
    public fun onDirectionChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (previousDirection: TextDirection) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkWidgetPointer,
        "direction-changed",
        onDirectionChangedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "direction-changed" signal. See [onDirectionChanged].
     *
     * @param previousDirection the previous text direction of @widget
     */
    public fun emitDirectionChanged(previousDirection: TextDirection) {
        g_signal_emit_by_name(gtkWidgetPointer.reinterpret(), "direction-changed", previousDirection.nativeValue)
    }

    /**
     * Emitted when @widget is hidden.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onHide(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkWidgetPointer,
            "hide",
            onHideFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "hide" signal. See [onHide].
     */
    public fun emitHide() {
        g_signal_emit_by_name(gtkWidgetPointer.reinterpret(), "hide")
    }

    /**
     * Emitted if keyboard navigation fails.
     *
     * See [method@Gtk.Widget.keynav_failed] for details.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `direction` the direction of movement. Returns true if stopping keyboard navigation is fine, false
     *   if the emitting widget should try to handle the keyboard
     *   navigation attempt in its parent widget(s).
     */
    public fun onKeynavFailed(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (direction: DirectionType) -> Boolean,
    ): ULong = g_signal_connect_data(
        gtkWidgetPointer,
        "keynav-failed",
        onKeynavFailedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted when @widget is going to be mapped.
     *
     * A widget is mapped when the widget is visible (which is controlled with
     * [property@Gtk.Widget:visible]) and all its parents up to the toplevel widget
     * are also visible.
     *
     * The ::map signal can be used to determine whether a widget will be drawn,
     * for instance it can resume an animation that was stopped during the
     * emission of [signal@Gtk.Widget::unmap].
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onMap(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong = g_signal_connect_data(
        gtkWidgetPointer,
        "map",
        onMapFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "map" signal. See [onMap].
     */
    public fun emitMap() {
        g_signal_emit_by_name(gtkWidgetPointer.reinterpret(), "map")
    }

    /**
     * Emitted when a widget is activated via a mnemonic.
     *
     * The default handler for this signal activates @widget if @group_cycling
     * is false, or just makes @widget grab focus if @group_cycling is true.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `groupCycling` true if there are other widgets with the same mnemonic. Returns true to stop other handlers from being invoked for the event.
     * false to propagate the event further.
     */
    public fun onMnemonicActivate(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (groupCycling: Boolean) -> Boolean,
    ): ULong = g_signal_connect_data(
        gtkWidgetPointer,
        "mnemonic-activate",
        onMnemonicActivateFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted when the focus is moved.
     *
     * The ::move-focus signal is a [keybinding signal](class.SignalAction.html).
     *
     * The default bindings for this signal are <kbd>Tab</kbd> to move forward,
     * and <kbd>Shift</kbd>+<kbd>Tab</kbd> to move backward.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `direction` the direction of the focus move
     */
    public fun onMoveFocus(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (direction: DirectionType) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkWidgetPointer,
        "move-focus",
        onMoveFocusFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "move-focus" signal. See [onMoveFocus].
     *
     * @param direction the direction of the focus move
     */
    public fun emitMoveFocus(direction: DirectionType) {
        g_signal_emit_by_name(gtkWidgetPointer.reinterpret(), "move-focus", direction.nativeValue)
    }

    /**
     * Emitted when the widget’s tooltip is about to be shown.
     *
     * This happens when the [property@Gtk.Widget:has-tooltip] property
     * is true and the hover timeout has expired with the cursor hovering
     * "above" @widget; or emitted when @widget got focus in keyboard mode.
     *
     * Using the given coordinates, the signal handler should determine
     * whether a tooltip should be shown for @widget. If this is the case
     * true should be returned, false otherwise.  Note that if
     * @keyboard_mode is true, the values of @x and @y are undefined and
     * should not be used.
     *
     * The signal handler is free to manipulate @tooltip with the therefore
     * destined function calls.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `x` the x coordinate of the cursor position where the request has
     *   been emitted, relative to @widget's left side; `y` the y coordinate of the cursor position where the request has
     *   been emitted, relative to @widget's top; `keyboardMode` true if the tooltip was triggered using the keyboard; `tooltip` a `GtkTooltip`. Returns true if @tooltip should be shown right now, false otherwise.
     */
    public fun onQueryTooltip(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (
            x: gint,
            y: gint,
            keyboardMode: Boolean,
            tooltip: Tooltip,
        ) -> Boolean,
    ): ULong = g_signal_connect_data(
        gtkWidgetPointer,
        "query-tooltip",
        onQueryTooltipFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emitted when @widget is associated with a `GdkSurface`.
     *
     * This means that [method@Gtk.Widget.realize] has been called
     * or the widget has been mapped (that is, it is going to be drawn).
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onRealize(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkWidgetPointer,
            "realize",
            onRealizeFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "realize" signal. See [onRealize].
     */
    public fun emitRealize() {
        g_signal_emit_by_name(gtkWidgetPointer.reinterpret(), "realize")
    }

    /**
     * Emitted when @widget is shown.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onShow(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkWidgetPointer,
            "show",
            onShowFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "show" signal. See [onShow].
     */
    public fun emitShow() {
        g_signal_emit_by_name(gtkWidgetPointer.reinterpret(), "show")
    }

    /**
     * Emitted when the widget state changes.
     *
     * See [method@Gtk.Widget.get_state_flags].
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `flags` The previous state flags.
     */
    public fun onStateFlagsChanged(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (flags: StateFlags) -> Unit,
    ): ULong = g_signal_connect_data(
        gtkWidgetPointer,
        "state-flags-changed",
        onStateFlagsChangedFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    /**
     * Emits the "state-flags-changed" signal. See [onStateFlagsChanged].
     *
     * @param flags The previous state flags.
     */
    public fun emitStateFlagsChanged(flags: StateFlags) {
        g_signal_emit_by_name(gtkWidgetPointer.reinterpret(), "state-flags-changed", flags.mask)
    }

    /**
     * Emitted when @widget is going to be unmapped.
     *
     * A widget is unmapped when either it or any of its parents up to the
     * toplevel widget have been set as hidden.
     *
     * As ::unmap indicates that a widget will not be shown any longer,
     * it can be used to, for example, stop an animation on the widget.
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onUnmap(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkWidgetPointer,
            "unmap",
            onUnmapFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "unmap" signal. See [onUnmap].
     */
    public fun emitUnmap() {
        g_signal_emit_by_name(gtkWidgetPointer.reinterpret(), "unmap")
    }

    /**
     * Emitted when the `GdkSurface` associated with @widget is destroyed.
     *
     * This means that [method@Gtk.Widget.unrealize] has been called
     * or the widget has been unmapped (that is, it is going to be hidden).
     *
     * @param connectFlags a combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun onUnrealize(connectFlags: ConnectFlags = ConnectFlags(0u), handler: () -> Unit): ULong =
        g_signal_connect_data(
            gtkWidgetPointer,
            "unrealize",
            onUnrealizeFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    /**
     * Emits the "unrealize" signal. See [onUnrealize].
     */
    public fun emitUnrealize() {
        g_signal_emit_by_name(gtkWidgetPointer.reinterpret(), "unrealize")
    }

    /**
     * The WidgetImpl type represents a native instance of the abstract Widget class.
     *
     * @constructor Creates a new instance of Widget for the provided [CPointer].
     */
    public class WidgetImpl(pointer: CPointer<GtkWidget>) : Widget(pointer)

    public companion object : TypeCompanion<Widget> {
        override val type: GeneratedClassKGType<Widget> =
            GeneratedClassKGType(gtk_widget_get_type()) { WidgetImpl(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Obtains the current default reading direction.
         *
         * See [func@Gtk.Widget.set_default_direction].
         *
         * @return the current default direction.
         */
        public fun getDefaultDirection(): TextDirection = gtk_widget_get_default_direction().run {
            TextDirection.fromNativeValue(this)
        }

        /**
         * Sets the default reading direction for widgets.
         *
         * See [method@Gtk.Widget.set_direction].
         *
         * @param dir the new default direction. This cannot be %GTK_TEXT_DIR_NONE.
         */
        public fun setDefaultDirection(dir: TextDirection): Unit = gtk_widget_set_default_direction(dir.nativeValue)

        /**
         * Get the GType of Widget
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_widget_get_type()
    }
}

private val onDestroyFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onDirectionChangedFunc: CPointer<CFunction<(GtkTextDirection) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            previousDirection: GtkTextDirection,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(previousDirection: TextDirection) -> Unit>().get().invoke(
            previousDirection.run {
                TextDirection.fromNativeValue(this)
            }
        )
    }
        .reinterpret()

private val onHideFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onKeynavFailedFunc: CPointer<CFunction<(GtkDirectionType) -> gboolean>> =
    staticCFunction {
            _: COpaquePointer,
            direction: GtkDirectionType,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(direction: DirectionType) -> Boolean>().get().invoke(
            direction.run {
                DirectionType.fromNativeValue(this)
            }
        ).asGBoolean()
    }
        .reinterpret()

private val onMapFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onMnemonicActivateFunc: CPointer<CFunction<(gboolean) -> gboolean>> = staticCFunction {
        _: COpaquePointer,
        groupCycling: gboolean,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(groupCycling: Boolean) -> Boolean>().get().invoke(groupCycling.asBoolean()).asGBoolean()
}
    .reinterpret()

private val onMoveFocusFunc: CPointer<CFunction<(GtkDirectionType) -> Unit>> = staticCFunction {
        _: COpaquePointer,
        direction: GtkDirectionType,
        userData: COpaquePointer,
    ->
    userData.asStableRef<(direction: DirectionType) -> Unit>().get().invoke(
        direction.run {
            DirectionType.fromNativeValue(this)
        }
    )
}
    .reinterpret()

private val onQueryTooltipFunc: CPointer<
    CFunction<
        (
            gint,
            gint,
            gboolean,
            CPointer<GtkTooltip>,
        ) -> gboolean
        >
    > = staticCFunction {
        _: COpaquePointer,
        x: gint,
        y: gint,
        keyboardMode: gboolean,
        tooltip: CPointer<GtkTooltip>?,
        userData: COpaquePointer,
    ->
    userData.asStableRef<
        (
            x: gint,
            y: gint,
            keyboardMode: Boolean,
            tooltip: Tooltip,
        ) -> Boolean
        >().get().invoke(
        x,
        y,
        keyboardMode.asBoolean(),
        tooltip!!.run {
            Tooltip(this)
        }
    ).asGBoolean()
}
    .reinterpret()

private val onRealizeFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onShowFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onStateFlagsChangedFunc: CPointer<CFunction<(GtkStateFlags) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            flags: GtkStateFlags,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(flags: StateFlags) -> Unit>().get().invoke(
            flags.run {
                StateFlags(this)
            }
        )
    }
        .reinterpret()

private val onUnmapFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

private val onUnrealizeFunc: CPointer<CFunction<() -> Unit>> = staticCFunction {
        _: COpaquePointer,
        userData: COpaquePointer,
    ->
    userData.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

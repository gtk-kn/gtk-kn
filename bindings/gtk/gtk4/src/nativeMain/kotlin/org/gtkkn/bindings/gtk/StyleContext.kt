// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gdk.Display
import org.gtkkn.bindings.gdk.Rgba
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkStyleContext
import org.gtkkn.native.gtk.gtk_style_context_add_class
import org.gtkkn.native.gtk.gtk_style_context_add_provider
import org.gtkkn.native.gtk.gtk_style_context_add_provider_for_display
import org.gtkkn.native.gtk.gtk_style_context_get_border
import org.gtkkn.native.gtk.gtk_style_context_get_color
import org.gtkkn.native.gtk.gtk_style_context_get_display
import org.gtkkn.native.gtk.gtk_style_context_get_margin
import org.gtkkn.native.gtk.gtk_style_context_get_padding
import org.gtkkn.native.gtk.gtk_style_context_get_scale
import org.gtkkn.native.gtk.gtk_style_context_get_state
import org.gtkkn.native.gtk.gtk_style_context_get_type
import org.gtkkn.native.gtk.gtk_style_context_has_class
import org.gtkkn.native.gtk.gtk_style_context_lookup_color
import org.gtkkn.native.gtk.gtk_style_context_remove_class
import org.gtkkn.native.gtk.gtk_style_context_remove_provider
import org.gtkkn.native.gtk.gtk_style_context_remove_provider_for_display
import org.gtkkn.native.gtk.gtk_style_context_restore
import org.gtkkn.native.gtk.gtk_style_context_save
import org.gtkkn.native.gtk.gtk_style_context_set_display
import org.gtkkn.native.gtk.gtk_style_context_set_scale
import org.gtkkn.native.gtk.gtk_style_context_set_state
import org.gtkkn.native.gtk.gtk_style_context_to_string
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * # ⚠️ Deprecated ⚠️
 *
 * This is deprecated since version 4.10.
 *
 * The relevant API has been moved to [class@Gtk.Widget]
 *   where applicable; otherwise, there is no replacement for querying the
 *   style machinery. Stylable UI elements should use widgets.
 * ---
 *
 * `GtkStyleContext` stores styling information affecting a widget.
 *
 * In order to construct the final style information, `GtkStyleContext`
 * queries information from all attached `GtkStyleProviders`. Style
 * providers can be either attached explicitly to the context through
 * [method@Gtk.StyleContext.add_provider], or to the display through
 * [func@Gtk.StyleContext.add_provider_for_display]. The resulting
 * style is a combination of all providers’ information in priority order.
 *
 * For GTK widgets, any `GtkStyleContext` returned by
 * [method@Gtk.Widget.get_style_context] will already have a `GdkDisplay`
 * and RTL/LTR information set. The style context will also be updated
 * automatically if any of these settings change on the widget.
 *
 * ## Style Classes
 *
 * Widgets can add style classes to their context, which can be used to associate
 * different styles by class. The documentation for individual widgets lists
 * which style classes it uses itself, and which style classes may be added by
 * applications to affect their appearance.
 *
 * # Custom styling in UI libraries and applications
 *
 * If you are developing a library with custom widgets that render differently
 * than standard components, you may need to add a `GtkStyleProvider` yourself
 * with the %GTK_STYLE_PROVIDER_PRIORITY_FALLBACK priority, either a
 * `GtkCssProvider` or a custom object implementing the `GtkStyleProvider`
 * interface. This way themes may still attempt to style your UI elements in
 * a different way if needed so.
 *
 * If you are using custom styling on an applications, you probably want then
 * to make your style information prevail to the theme’s, so you must use
 * a `GtkStyleProvider` with the %GTK_STYLE_PROVIDER_PRIORITY_APPLICATION
 * priority, keep in mind that the user settings in
 * `XDG_CONFIG_HOME/gtk-4.0/gtk.css` will
 * still take precedence over your changes, as it uses the
 * %GTK_STYLE_PROVIDER_PRIORITY_USER priority.
 */
public open class StyleContext(public val gtkStyleContextPointer: CPointer<GtkStyleContext>) :
    Object(gtkStyleContextPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    public open var display: Display
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         *
         * Use [method@Gtk.Widget.get_display] instead
         * ---
         *
         * Returns the `GdkDisplay` to which @context is attached.
         *
         * @return a `GdkDisplay`.
         */
        get() = gtk_style_context_get_display(gtkStyleContextPointer)!!.run {
            InstanceCache.get(this, true) { Display(reinterpret()) }!!
        }

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         *
         * You should not use this api
         * ---
         *
         * Attaches @context to the given display.
         *
         * The display is used to add style information from “global”
         * style providers, such as the display's `GtkSettings` instance.
         *
         * If you are using a `GtkStyleContext` returned from
         * [method@Gtk.Widget.get_style_context], you do not need to
         * call this yourself.
         *
         * @param display a `GdkDisplay`
         */
        set(display) = gtk_style_context_set_display(gtkStyleContextPointer, display.gdkDisplayPointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [method@Gtk.Widget.add_css_class] instead
     * ---
     *
     * Adds a style class to @context, so later uses of the
     * style context will make use of this new class for styling.
     *
     * In the CSS file format, a `GtkEntry` defining a “search”
     * class, would be matched by:
     *
     * ```css
     * entry.search { ... }
     * ```
     *
     * While any widget defining a “search” class would be
     * matched by:
     * ```css
     * .search { ... }
     * ```
     *
     * @param className class name to use in styling
     */
    public open fun addClass(className: String): Unit = gtk_style_context_add_class(gtkStyleContextPointer, className)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use style classes instead
     * ---
     *
     * Adds a style provider to @context, to be used in style construction.
     *
     * Note that a style provider added by this function only affects
     * the style of the widget to which @context belongs. If you want
     * to affect the style of all widgets, use
     * [func@Gtk.StyleContext.add_provider_for_display].
     *
     * Note: If both priorities are the same, a `GtkStyleProvider`
     * added through this function takes precedence over another added
     * through [func@Gtk.StyleContext.add_provider_for_display].
     *
     * @param provider a `GtkStyleProvider`
     * @param priority the priority of the style provider. The lower
     *   it is, the earlier it will be used in the style construction.
     *   Typically this will be in the range between
     *   %GTK_STYLE_PROVIDER_PRIORITY_FALLBACK and
     *   %GTK_STYLE_PROVIDER_PRIORITY_USER
     */
    public open fun addProvider(provider: StyleProvider, priority: guint): Unit =
        gtk_style_context_add_provider(gtkStyleContextPointer, provider.gtkStyleProviderPointer, priority)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This api will be removed in GTK 5
     * ---
     *
     * Gets the border for a given state as a `GtkBorder`.
     *
     * @param border return value for the border settings
     */
    public open fun getBorder(border: Border): Unit =
        gtk_style_context_get_border(gtkStyleContextPointer, border.gtkBorderPointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [method@Gtk.Widget.get_color] instead
     * ---
     *
     * Gets the foreground color for a given state.
     *
     * @param color return value for the foreground color
     */
    public open fun getColor(color: Rgba): Unit =
        gtk_style_context_get_color(gtkStyleContextPointer, color.gdkRgbaPointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This api will be removed in GTK 5
     * ---
     *
     * Gets the margin for a given state as a `GtkBorder`.
     *
     * @param margin return value for the margin settings
     */
    public open fun getMargin(margin: Border): Unit =
        gtk_style_context_get_margin(gtkStyleContextPointer, margin.gtkBorderPointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This api will be removed in GTK 5
     * ---
     *
     * Gets the padding for a given state as a `GtkBorder`.
     *
     * @param padding return value for the padding settings
     */
    public open fun getPadding(padding: Border): Unit =
        gtk_style_context_get_padding(gtkStyleContextPointer, padding.gtkBorderPointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [method@Gtk.Widget.get_scale_factor] instead
     * ---
     *
     * Returns the scale used for assets.
     *
     * @return the scale
     */
    public open fun getScale(): gint = gtk_style_context_get_scale(gtkStyleContextPointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [method@Gtk.Widget.get_state_flags] instead
     * ---
     *
     * Returns the state used for style matching.
     *
     * This method should only be used to retrieve the `GtkStateFlags`
     * to pass to `GtkStyleContext` methods, like
     * [method@Gtk.StyleContext.get_padding].
     * If you need to retrieve the current state of a `GtkWidget`, use
     * [method@Gtk.Widget.get_state_flags].
     *
     * @return the state flags
     */
    public open fun getState(): StateFlags = gtk_style_context_get_state(gtkStyleContextPointer).run {
        StateFlags(this)
    }

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [method@Gtk.Widget.has_css_class] instead
     * ---
     *
     * Returns true if @context currently has defined the
     * given class name.
     *
     * @param className a class name
     * @return true if @context has @class_name defined
     */
    public open fun hasClass(className: String): Boolean =
        gtk_style_context_has_class(gtkStyleContextPointer, className).asBoolean()

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This api will be removed in GTK 5
     * ---
     *
     * Looks up and resolves a color name in the @context color map.
     *
     * @param colorName color name to lookup
     * @param color Return location for the looked up color
     * @return true if @color_name was found and resolved, false otherwise
     */
    public open fun lookupColor(colorName: String, color: Rgba): Boolean =
        gtk_style_context_lookup_color(gtkStyleContextPointer, colorName, color.gdkRgbaPointer).asBoolean()

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * Use [method@Gtk.Widget.remove_css_class] instead
     * ---
     *
     * Removes @class_name from @context.
     *
     * @param className class name to remove
     */
    public open fun removeClass(className: String): Unit =
        gtk_style_context_remove_class(gtkStyleContextPointer, className)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     * ---
     *
     * Removes @provider from the style providers list in @context.
     *
     * @param provider a `GtkStyleProvider`
     */
    public open fun removeProvider(provider: StyleProvider): Unit =
        gtk_style_context_remove_provider(gtkStyleContextPointer, provider.gtkStyleProviderPointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This API will be removed in GTK 5
     * ---
     *
     * Restores @context state to a previous stage.
     *
     * See [method@Gtk.StyleContext.save].
     */
    public open fun restore(): Unit = gtk_style_context_restore(gtkStyleContextPointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This API will be removed in GTK 5
     * ---
     *
     * Saves the @context state.
     *
     * This allows temporary modifications done through
     * [method@Gtk.StyleContext.add_class],
     * [method@Gtk.StyleContext.remove_class],
     * [method@Gtk.StyleContext.set_state] to be quickly
     * reverted in one go through [method@Gtk.StyleContext.restore].
     *
     * The matching call to [method@Gtk.StyleContext.restore]
     * must be done before GTK returns to the main loop.
     */
    public open fun save(): Unit = gtk_style_context_save(gtkStyleContextPointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * You should not use this api
     * ---
     *
     * Sets the scale to use when getting image assets for the style.
     *
     * @param scale scale
     */
    public open fun setScale(scale: gint): Unit = gtk_style_context_set_scale(gtkStyleContextPointer, scale)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * You should not use this api
     * ---
     *
     * Sets the state to be used for style matching.
     *
     * @param flags state to represent
     */
    public open fun setState(flags: StateFlags): Unit = gtk_style_context_set_state(gtkStyleContextPointer, flags.mask)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This api will be removed in GTK 5
     * ---
     *
     * Converts the style context into a string representation.
     *
     * The string representation always includes information about
     * the name, state, id, visibility and style classes of the CSS
     * node that is backing @context. Depending on the flags, more
     * information may be included.
     *
     * This function is intended for testing and debugging of the
     * CSS implementation in GTK. There are no guarantees about
     * the format of the returned string, it may change.
     *
     * @param flags Flags that determine what to print
     * @return a newly allocated string representing @context
     */
    public open fun toString(flags: StyleContextPrintFlags): String =
        gtk_style_context_to_string(gtkStyleContextPointer, flags.mask)?.toKString()
            ?: error("Expected not null string")

    public companion object : TypeCompanion<StyleContext> {
        override val type: GeneratedClassKGType<StyleContext> =
            GeneratedClassKGType(getTypeOrNull()!!) { StyleContext(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Adds a global style provider to @display, which will be used
         * in style construction for all `GtkStyleContexts` under @display.
         *
         * GTK uses this to make styling information from `GtkSettings`
         * available.
         *
         * Note: If both priorities are the same, A `GtkStyleProvider`
         * added through [method@Gtk.StyleContext.add_provider] takes
         * precedence over another added through this function.
         *
         * @param display a `GdkDisplay`
         * @param provider a `GtkStyleProvider`
         * @param priority the priority of the style provider. The lower
         *   it is, the earlier it will be used in the style construction.
         *   Typically this will be in the range between
         *   %GTK_STYLE_PROVIDER_PRIORITY_FALLBACK and
         *   %GTK_STYLE_PROVIDER_PRIORITY_USER
         */
        public fun addProviderForDisplay(display: Display, provider: StyleProvider, priority: guint): Unit =
            gtk_style_context_add_provider_for_display(
                display.gdkDisplayPointer,
                provider.gtkStyleProviderPointer,
                priority
            )

        /**
         * Removes @provider from the global style providers list in @display.
         *
         * @param display a `GdkDisplay`
         * @param provider a `GtkStyleProvider`
         */
        public fun removeProviderForDisplay(display: Display, provider: StyleProvider): Unit =
            gtk_style_context_remove_provider_for_display(display.gdkDisplayPointer, provider.gtkStyleProviderPointer)

        /**
         * Get the GType of StyleContext
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_style_context_get_type()

        /**
         * Gets the GType of from the symbol `gtk_style_context_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_style_context_get_type")
    }
}

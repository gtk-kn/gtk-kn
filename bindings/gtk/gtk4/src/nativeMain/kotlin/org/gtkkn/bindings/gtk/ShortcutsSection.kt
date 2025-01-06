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
import org.gtkkn.bindings.gtk.annotations.GtkVersion4_14
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkOrientable
import org.gtkkn.native.gtk.GtkShortcutsSection
import org.gtkkn.native.gtk.gtk_shortcuts_section_add_group
import org.gtkkn.native.gtk.gtk_shortcuts_section_get_type
import kotlin.Boolean
import kotlin.ULong
import kotlin.Unit

/**
 * A `GtkShortcutsSection` collects all the keyboard shortcuts and gestures
 * for a major application mode.
 *
 * If your application needs multiple sections, you should give each
 * section a unique [property@Gtk.ShortcutsSection:section-name] and
 * a [property@Gtk.ShortcutsSection:title] that can be shown in the
 * section selector of the [class@Gtk.ShortcutsWindow].
 *
 * The [property@Gtk.ShortcutsSection:max-height] property can be used
 * to influence how the groups in the section are distributed over pages
 * and columns.
 *
 * This widget is only meant to be used with [class@Gtk.ShortcutsWindow].
 *
 * The recommended way to construct a `GtkShortcutsSection` is with
 * [class@Gtk.Builder], by using the `<child>` tag to populate a
 * `GtkShortcutsSection` with one or more [class@Gtk.ShortcutsGroup]
 * instances, which in turn contain one or more [class@Gtk.ShortcutsShortcut]
 * objects.
 *
 * If you need to add a group programmatically, use
 * [method@Gtk.ShortcutsSection.add_group].
 *
 * ## Skipped during bindings generation
 *
 * - method `max-height`: Property has no getter nor setter
 * - method `section-name`: Property has no getter nor setter
 * - method `title`: Property has no getter nor setter
 * - method `view-name`: Property has no getter nor setter
 */
public open class ShortcutsSection(pointer: CPointer<GtkShortcutsSection>) :
    Box(pointer.reinterpret()),
    KGTyped {
    public val gtkShortcutsSectionPointer: CPointer<GtkShortcutsSection>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    override val gtkOrientablePointer: CPointer<GtkOrientable>
        get() = gPointer.reinterpret()

    /**
     * Adds a group to the shortcuts section.
     *
     * This is the programmatic equivalent to using [class@Gtk.Builder] and a
     * `<child>` tag to add the child.
     *
     * Adding children with the `GtkBox` API is not appropriate, as
     * `GtkShortcutsSection` manages its children internally.
     *
     * @param group the `GtkShortcutsGroup` to add
     * @since 4.14
     */
    @GtkVersion4_14
    public open fun addGroup(group: ShortcutsGroup): Unit = gtk_shortcuts_section_add_group(
        gtkShortcutsSectionPointer.reinterpret(),
        group.gtkShortcutsGroupPointer.reinterpret()
    )

    /**
     *
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `object`
     */
    public fun connectChangeCurrentPage(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (`object`: gint) -> Boolean,
    ): ULong = g_signal_connect_data(
        gPointer.reinterpret(),
        "change-current-page",
        connectChangeCurrentPageFunc.reinterpret(),
        StableRef.create(handler).asCPointer(),
        staticStableRefDestroy.reinterpret(),
        connectFlags.mask
    )

    public companion object : TypeCompanion<ShortcutsSection> {
        override val type: GeneratedClassKGType<ShortcutsSection> =
            GeneratedClassKGType(gtk_shortcuts_section_get_type()) { ShortcutsSection(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of ShortcutsSection
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_shortcuts_section_get_type()
    }
}

private val connectChangeCurrentPageFunc: CPointer<CFunction<(gint) -> gboolean>> =
    staticCFunction {
            _: COpaquePointer,
            `object`: gint,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(`object`: gint) -> Boolean>().get().invoke(`object`).asGBoolean()
    }
        .reinterpret()

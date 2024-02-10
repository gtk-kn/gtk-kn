// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwWindow
import org.gtkkn.native.adw.adw_window_get_content
import org.gtkkn.native.adw.adw_window_get_type
import org.gtkkn.native.adw.adw_window_new
import org.gtkkn.native.adw.adw_window_set_content
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkNative
import org.gtkkn.native.gtk.GtkRoot
import org.gtkkn.native.gtk.GtkShortcutManager
import kotlin.Unit

/**
 * A freeform window.
 *
 * <picture>
 *   <source srcset="window-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="window.png" alt="window">
 * </picture>
 *
 * The `AdwWindow` widget is a subclass of [class@Gtk.Window] which has no
 * titlebar area. It means [class@Gtk.HeaderBar] can be used as follows:
 *
 * ```xml
 * <object class="AdwWindow">
 *   <property name="content">
 *     <object class="GtkBox">
 *       <property name="orientation">vertical</property>
 *       <child>
 *         <object class="GtkHeaderBar"/>
 *       </child>
 *       <child>
 *         <!-- ... -->
 *       </child>
 *     </object>
 *   </property>
 * </object>
 * ```
 *
 * Using [method@Gtk.Window.get_titlebar] and [method@Gtk.Window.set_titlebar]
 * is not supported and will result in a crash.
 * @since 1.0
 */
public open class Window(
    pointer: CPointer<AdwWindow>,
) : org.gtkkn.bindings.gtk.Window(pointer.reinterpret()), KGTyped {
    public val adwWindowPointer: CPointer<AdwWindow>
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
     * The content widget.
     *
     * @since 1.0
     */
    public open var content: Widget?
        /**
         * Gets the content widget of @self.
         *
         * This method should always be used instead of [method@Gtk.Window.get_child].
         *
         * @return the content widget of @self
         * @since 1.0
         */
        get() =
            adw_window_get_content(adwWindowPointer.reinterpret())?.run {
                Widget(reinterpret())
            }

        /**
         * Sets the content widget of @self.
         *
         * This method should always be used instead of [method@Gtk.Window.set_child].
         *
         * @param content the content widget
         * @since 1.0
         */
        set(content) =
            adw_window_set_content(
                adwWindowPointer.reinterpret(),
                content?.gtkWidgetPointer?.reinterpret()
            )

    /**
     * Creates a new `AdwWindow`.
     *
     * @return the newly created `AdwWindow`
     * @since 1.0
     */
    public constructor() : this(adw_window_new()!!.reinterpret())

    /**
     * Gets the content widget of @self.
     *
     * This method should always be used instead of [method@Gtk.Window.get_child].
     *
     * @return the content widget of @self
     * @since 1.0
     */
    public open fun getContent(): Widget? =
        adw_window_get_content(adwWindowPointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Sets the content widget of @self.
     *
     * This method should always be used instead of [method@Gtk.Window.set_child].
     *
     * @param content the content widget
     * @since 1.0
     */
    public open fun setContent(content: Widget? = null): Unit =
        adw_window_set_content(
            adwWindowPointer.reinterpret(),
            content?.gtkWidgetPointer?.reinterpret()
        )

    public companion object : TypeCompanion<Window> {
        override val type: GeneratedClassKGType<Window> =
            GeneratedClassKGType(adw_window_get_type()) { Window(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }
    }
}

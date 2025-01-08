// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gdk.Paintable
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwStatusPage
import org.gtkkn.native.adw.adw_status_page_get_child
import org.gtkkn.native.adw.adw_status_page_get_description
import org.gtkkn.native.adw.adw_status_page_get_icon_name
import org.gtkkn.native.adw.adw_status_page_get_paintable
import org.gtkkn.native.adw.adw_status_page_get_title
import org.gtkkn.native.adw.adw_status_page_get_type
import org.gtkkn.native.adw.adw_status_page_new
import org.gtkkn.native.adw.adw_status_page_set_child
import org.gtkkn.native.adw.adw_status_page_set_description
import org.gtkkn.native.adw.adw_status_page_set_icon_name
import org.gtkkn.native.adw.adw_status_page_set_paintable
import org.gtkkn.native.adw.adw_status_page_set_title
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.String

/**
 * A page used for empty/error states and similar use-cases.
 *
 * <picture>
 *   <source srcset="status-page-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="status-page.png" alt="status-page">
 * </picture>
 *
 * The `AdwStatusPage` widget can have an icon, a title, a description and a
 * custom widget which is displayed below them.
 *
 * ## CSS nodes
 *
 * `AdwStatusPage` has a main CSS node with name `statuspage`.
 *
 * `AdwStatusPage` can use the
 * [`.compact`](style-classes.html#compact-status-page) style class for when it
 * needs to fit into a small space such a sidebar or a popover.
 */
public class StatusPage(pointer: CPointer<AdwStatusPage>) :
    Widget(pointer.reinterpret()),
    KGTyped {
    public val adwStatusPagePointer: CPointer<AdwStatusPage>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * The child widget.
     */
    public var child: Widget?
        /**
         * Gets the child widget of @self.
         *
         * @return the child widget of @self
         */
        get() = adw_status_page_get_child(adwStatusPagePointer)?.run {
            Widget(this)
        }

        /**
         * Sets the child widget of @self.
         *
         * @param child the child widget
         */
        set(child) = adw_status_page_set_child(adwStatusPagePointer, child?.gtkWidgetPointer)

    /**
     * The description markup to be displayed below the title.
     */
    public var description: String?
        /**
         * Gets the description markup for @self.
         *
         * @return the description
         */
        get() = adw_status_page_get_description(adwStatusPagePointer)?.toKString()

        /**
         * Sets the description markup for @self.
         *
         * The description is displayed below the title. It is parsed as Pango markup.
         *
         * @param description the description
         */
        set(description) = adw_status_page_set_description(adwStatusPagePointer, description)

    /**
     * The name of the icon to be used.
     *
     * Changing this will set [property@StatusPage:paintable] to `NULL`.
     */
    public var iconName: String?
        /**
         * Gets the icon name for @self.
         *
         * @return the icon name
         */
        get() = adw_status_page_get_icon_name(adwStatusPagePointer)?.toKString()

        /**
         * Sets the icon name for @self.
         *
         * Changing this will set [property@StatusPage:paintable] to `NULL`.
         *
         * @param iconName the icon name
         */
        set(iconName) = adw_status_page_set_icon_name(adwStatusPagePointer, iconName)

    /**
     * The paintable to be used.
     *
     * Changing this will set [property@StatusPage:icon-name] to `NULL`.
     */
    public var paintable: Paintable?
        /**
         * Gets the paintable for @self.
         *
         * @return the paintable
         */
        get() = adw_status_page_get_paintable(adwStatusPagePointer)?.run {
            Paintable.wrap(reinterpret())
        }

        /**
         * Sets the paintable for @self.
         *
         * Changing this will set [property@StatusPage:icon-name] to `NULL`.
         *
         * @param paintable the paintable
         */
        set(paintable) = adw_status_page_set_paintable(adwStatusPagePointer, paintable?.gdkPaintablePointer)

    /**
     * The title to be displayed below the icon.
     *
     * It is not parsed as Pango markup.
     */
    public var title: String
        /**
         * Gets the title for @self.
         *
         * @return the title
         */
        get() = adw_status_page_get_title(adwStatusPagePointer)?.toKString() ?: error("Expected not null string")

        /**
         * Sets the title for @self.
         *
         * The title is displayed below the icon. It is not parsed as Pango markup.
         *
         * @param title the title
         */
        set(title) = adw_status_page_set_title(adwStatusPagePointer, title)

    /**
     * Creates a new `AdwStatusPage`.
     *
     * @return the newly created `AdwStatusPage`
     */
    public constructor() : this(adw_status_page_new()!!.reinterpret())

    public companion object : TypeCompanion<StatusPage> {
        override val type: GeneratedClassKGType<StatusPage> =
            GeneratedClassKGType(adw_status_page_get_type()) { StatusPage(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of StatusPage
         *
         * @return the GType
         */
        public fun getType(): GType = adw_status_page_get_type()
    }
}

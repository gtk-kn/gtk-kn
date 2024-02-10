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
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.String
import kotlin.Unit

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
 * @since 1.0
 */
public class StatusPage(
    pointer: CPointer<AdwStatusPage>,
) : Widget(pointer.reinterpret()), KGTyped {
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
     *
     * @since 1.0
     */
    public var child: Widget?
        /**
         * Gets the child widget of @self.
         *
         * @return the child widget of @self
         * @since 1.0
         */
        get() =
            adw_status_page_get_child(adwStatusPagePointer.reinterpret())?.run {
                Widget(reinterpret())
            }

        /**
         * Sets the child widget of @self.
         *
         * @param child the child widget
         * @since 1.0
         */
        set(child) =
            adw_status_page_set_child(
                adwStatusPagePointer.reinterpret(),
                child?.gtkWidgetPointer?.reinterpret()
            )

    /**
     * The description to be displayed below the title.
     *
     * @since 1.0
     */
    public var description: String?
        /**
         * Gets the description for @self.
         *
         * @return the description
         * @since 1.0
         */
        get() = adw_status_page_get_description(adwStatusPagePointer.reinterpret())?.toKString()

        /**
         * Sets the description for @self.
         *
         * @param description the description
         * @since 1.0
         */
        set(description) =
            adw_status_page_set_description(
                adwStatusPagePointer.reinterpret(),
                description
            )

    /**
     * The name of the icon to be used.
     *
     * Changing this will clear [property@StatusPage:paintable] out.
     *
     * @since 1.0
     */
    public var iconName: String?
        /**
         * Gets the icon name for @self.
         *
         * @return the icon name
         * @since 1.0
         */
        get() = adw_status_page_get_icon_name(adwStatusPagePointer.reinterpret())?.toKString()

        /**
         * Sets the icon name for @self.
         *
         * @param iconName the icon name
         * @since 1.0
         */
        set(iconName) = adw_status_page_set_icon_name(adwStatusPagePointer.reinterpret(), iconName)

    /**
     * The @GdkPaintable to be used.
     *
     * Changing this will clear [property@StatusPage:icon-name] out.
     *
     * @since 1.0
     */
    public var paintable: Paintable?
        /**
         * Gets the paintable for @self.
         *
         * @return the paintable
         * @since 1.0
         */
        get() =
            adw_status_page_get_paintable(adwStatusPagePointer.reinterpret())?.run {
                Paintable.wrap(reinterpret())
            }

        /**
         * Sets the paintable for @self.
         *
         * @param paintable the paintable
         * @since 1.0
         */
        set(paintable) =
            adw_status_page_set_paintable(
                adwStatusPagePointer.reinterpret(),
                paintable?.gdkPaintablePointer
            )

    /**
     * The title to be displayed below the icon.
     *
     * @since 1.0
     */
    public var title: String
        /**
         * Gets the title for @self.
         *
         * @return the title
         * @since 1.0
         */
        get() =
            adw_status_page_get_title(adwStatusPagePointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

        /**
         * Sets the title for @self.
         *
         * @param title the title
         * @since 1.0
         */
        set(title) = adw_status_page_set_title(adwStatusPagePointer.reinterpret(), title)

    /**
     * Creates a new `AdwStatusPage`.
     *
     * @return the newly created `AdwStatusPage`
     * @since 1.0
     */
    public constructor() : this(adw_status_page_new()!!.reinterpret())

    /**
     * Gets the child widget of @self.
     *
     * @return the child widget of @self
     * @since 1.0
     */
    public fun getChild(): Widget? =
        adw_status_page_get_child(adwStatusPagePointer.reinterpret())?.run {
            Widget(reinterpret())
        }

    /**
     * Gets the description for @self.
     *
     * @return the description
     * @since 1.0
     */
    public fun getDescription(): String? =
        adw_status_page_get_description(adwStatusPagePointer.reinterpret())?.toKString()

    /**
     * Gets the icon name for @self.
     *
     * @return the icon name
     * @since 1.0
     */
    public fun getIconName(): String? = adw_status_page_get_icon_name(adwStatusPagePointer.reinterpret())?.toKString()

    /**
     * Gets the paintable for @self.
     *
     * @return the paintable
     * @since 1.0
     */
    public fun getPaintable(): Paintable? =
        adw_status_page_get_paintable(adwStatusPagePointer.reinterpret())?.run {
            Paintable.wrap(reinterpret())
        }

    /**
     * Gets the title for @self.
     *
     * @return the title
     * @since 1.0
     */
    public fun getTitle(): String =
        adw_status_page_get_title(adwStatusPagePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Sets the child widget of @self.
     *
     * @param child the child widget
     * @since 1.0
     */
    public fun setChild(child: Widget? = null): Unit =
        adw_status_page_set_child(
            adwStatusPagePointer.reinterpret(),
            child?.gtkWidgetPointer?.reinterpret()
        )

    /**
     * Sets the description for @self.
     *
     * @param description the description
     * @since 1.0
     */
    public fun setDescription(description: String? = null): Unit =
        adw_status_page_set_description(adwStatusPagePointer.reinterpret(), description)

    /**
     * Sets the icon name for @self.
     *
     * @param iconName the icon name
     * @since 1.0
     */
    public fun setIconName(iconName: String? = null): Unit =
        adw_status_page_set_icon_name(adwStatusPagePointer.reinterpret(), iconName)

    /**
     * Sets the paintable for @self.
     *
     * @param paintable the paintable
     * @since 1.0
     */
    public fun setPaintable(paintable: Paintable? = null): Unit =
        adw_status_page_set_paintable(
            adwStatusPagePointer.reinterpret(),
            paintable?.gdkPaintablePointer
        )

    /**
     * Sets the title for @self.
     *
     * @param title the title
     * @since 1.0
     */
    public fun setTitle(title: String): Unit = adw_status_page_set_title(adwStatusPagePointer.reinterpret(), title)

    public companion object : TypeCompanion<StatusPage> {
        override val type: GeneratedClassKGType<StatusPage> =
            GeneratedClassKGType(adw_status_page_get_type()) { StatusPage(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }
    }
}

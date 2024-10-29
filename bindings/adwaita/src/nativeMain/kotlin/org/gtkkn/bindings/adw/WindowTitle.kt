// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwWindowTitle
import org.gtkkn.native.adw.adw_window_title_get_subtitle
import org.gtkkn.native.adw.adw_window_title_get_title
import org.gtkkn.native.adw.adw_window_title_get_type
import org.gtkkn.native.adw.adw_window_title_new
import org.gtkkn.native.adw.adw_window_title_set_subtitle
import org.gtkkn.native.adw.adw_window_title_set_title
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.String
import kotlin.Unit

/**
 * A helper widget for setting a window's title and subtitle.
 *
 * <picture>
 *   <source srcset="window-title-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="window-title.png" alt="window-title">
 * </picture>
 *
 * `AdwWindowTitle` shows a title and subtitle. It's intended to be used as the
 * title child of [class@Gtk.HeaderBar] or [class@HeaderBar].
 *
 * ## CSS nodes
 *
 * `AdwWindowTitle` has a single CSS node with name `windowtitle`.
 */
public class WindowTitle(
    pointer: CPointer<AdwWindowTitle>,
) : Widget(pointer.reinterpret()), KGTyped {
    public val adwWindowTitlePointer: CPointer<AdwWindowTitle>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * The subtitle to display.
     *
     * The subtitle should give the user additional details.
     */
    public var subtitle: String
        /**
         * Gets the subtitle of @self.
         *
         * @return the subtitle
         */
        get() =
            adw_window_title_get_subtitle(adwWindowTitlePointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

        /**
         * Sets the subtitle of @self.
         *
         * The subtitle should give the user additional details.
         *
         * @param subtitle a subtitle
         */
        set(subtitle) = adw_window_title_set_subtitle(adwWindowTitlePointer.reinterpret(), subtitle)

    /**
     * The title to display.
     *
     * The title typically identifies the current view or content item, and
     * generally does not use the application name.
     */
    public var title: String
        /**
         * Gets the title of @self.
         *
         * @return the title
         */
        get() =
            adw_window_title_get_title(adwWindowTitlePointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

        /**
         * Sets the title of @self.
         *
         * The title typically identifies the current view or content item, and
         * generally does not use the application name.
         *
         * @param title a title
         */
        set(title) = adw_window_title_set_title(adwWindowTitlePointer.reinterpret(), title)

    /**
     * Creates a new `AdwWindowTitle`.
     *
     * @param title a title
     * @param subtitle a subtitle
     * @return the newly created `AdwWindowTitle`
     */
    public constructor(title: String, subtitle: String) : this(
        adw_window_title_new(
            title,
            subtitle
        )!!.reinterpret()
    )

    /**
     * Gets the subtitle of @self.
     *
     * @return the subtitle
     */
    public fun getSubtitle(): String =
        adw_window_title_get_subtitle(adwWindowTitlePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets the title of @self.
     *
     * @return the title
     */
    public fun getTitle(): String =
        adw_window_title_get_title(adwWindowTitlePointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Sets the subtitle of @self.
     *
     * The subtitle should give the user additional details.
     *
     * @param subtitle a subtitle
     */
    public fun setSubtitle(subtitle: String): Unit =
        adw_window_title_set_subtitle(adwWindowTitlePointer.reinterpret(), subtitle)

    /**
     * Sets the title of @self.
     *
     * The title typically identifies the current view or content item, and
     * generally does not use the application name.
     *
     * @param title a title
     */
    public fun setTitle(title: String): Unit = adw_window_title_set_title(adwWindowTitlePointer.reinterpret(), title)

    public companion object : TypeCompanion<WindowTitle> {
        override val type: GeneratedClassKGType<WindowTitle> =
            GeneratedClassKGType(adw_window_title_get_type()) { WindowTitle(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }
    }
}

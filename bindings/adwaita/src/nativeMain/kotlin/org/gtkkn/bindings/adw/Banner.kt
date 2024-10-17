// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.bindings.gtk.Actionable
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwBanner
import org.gtkkn.native.adw.adw_banner_get_button_label
import org.gtkkn.native.adw.adw_banner_get_revealed
import org.gtkkn.native.adw.adw_banner_get_title
import org.gtkkn.native.adw.adw_banner_get_type
import org.gtkkn.native.adw.adw_banner_get_use_markup
import org.gtkkn.native.adw.adw_banner_new
import org.gtkkn.native.adw.adw_banner_set_button_label
import org.gtkkn.native.adw.adw_banner_set_revealed
import org.gtkkn.native.adw.adw_banner_set_title
import org.gtkkn.native.adw.adw_banner_set_use_markup
import org.gtkkn.native.gobject.g_signal_connect_data
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkActionable
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.Boolean
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * A bar with contextual information.
 *
 * <picture>
 *   <source srcset="banner-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="banner.png" alt="banner">
 * </picture>
 *
 * Banners are hidden by default, use [property@Banner:revealed] to show them.
 *
 * Banners have a title, set with [property@Banner:title]. Titles can be marked
 * up with Pango markup, use [property@Banner:use-markup] to enable it.
 *
 * The title will be shown centered or left-aligned depending on available
 * space.
 *
 * Banners can optionally have a button with text on it, set through
 * [property@Banner:button-label]. The button can be used with a `GAction`,
 * or with the [signal@Banner::button-clicked] signal.
 *
 * ## CSS nodes
 *
 * `AdwBanner` has a main CSS node with the name `banner`.
 * @since 1.3
 */
public class Banner(
    pointer: CPointer<AdwBanner>,
) : Widget(pointer.reinterpret()), Actionable, KGTyped {
    public val adwBannerPointer: CPointer<AdwBanner>
        get() = gPointer.reinterpret()

    override val gtkActionablePointer: CPointer<GtkActionable>
        get() = gPointer.reinterpret()

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = gPointer.reinterpret()

    /**
     * The label to show on the button.
     *
     * If set to `""` or `NULL`, the button won't be shown.
     *
     * The button can be used with a `GAction`, or with the
     * [signal@Banner::button-clicked] signal.
     *
     * @since 1.3
     */
    public var buttonLabel: String?
        /**
         * Gets the button label for @self.
         *
         * @return the button label for @self
         * @since 1.3
         */
        get() = adw_banner_get_button_label(adwBannerPointer.reinterpret())?.toKString()

        /**
         * Sets the button label for @self.
         *
         * If set to `""` or `NULL`, the button won't be shown.
         *
         * The button can be used with a `GAction`, or with the
         * [signal@Banner::button-clicked] signal.
         *
         * @param label the label
         * @since 1.3
         */
        set(label) = adw_banner_set_button_label(adwBannerPointer.reinterpret(), label)

    /**
     * Whether the banner is currently revealed.
     *
     * @since 1.3
     */
    public var revealed: Boolean
        /**
         * Gets if a banner is revealed
         *
         * @return Whether a banner is revealed
         * @since 1.3
         */
        get() = adw_banner_get_revealed(adwBannerPointer.reinterpret()).asBoolean()

        /**
         * Sets whether a banner should be revealed
         *
         * @param revealed whether a banner should be revealed
         * @since 1.3
         */
        set(revealed) =
            adw_banner_set_revealed(
                adwBannerPointer.reinterpret(),
                revealed.asGBoolean()
            )

    /**
     * The title for this banner.
     *
     * See also: [property@Banner:use-markup].
     *
     * @since 1.3
     */
    public var title: String
        /**
         * Gets the title for @self.
         *
         * @return the title for @self
         * @since 1.3
         */
        get() =
            adw_banner_get_title(adwBannerPointer.reinterpret())?.toKString()
                ?: error("Expected not null string")

        /**
         * Sets the title for this banner.
         *
         * See also: [property@Banner:use-markup].
         *
         * @param title the title
         * @since 1.3
         */
        set(title) = adw_banner_set_title(adwBannerPointer.reinterpret(), title)

    /**
     * Whether to use Pango markup for the banner title.
     *
     * See also [func@Pango.parse_markup].
     *
     * @since 1.3
     */
    public var useMarkup: Boolean
        /**
         * Gets whether to use Pango markup for the banner title.
         *
         * @return whether to use markup
         * @since 1.3
         */
        get() = adw_banner_get_use_markup(adwBannerPointer.reinterpret()).asBoolean()

        /**
         * Sets whether to use Pango markup for the banner title.
         *
         * See also [func@Pango.parse_markup].
         *
         * @param useMarkup whether to use markup
         * @since 1.3
         */
        set(useMarkup) =
            adw_banner_set_use_markup(
                adwBannerPointer.reinterpret(),
                useMarkup.asGBoolean()
            )

    /**
     * Creates a new `AdwBanner`.
     *
     * @param title the banner title
     * @return the newly created `AdwBanner`
     * @since 1.3
     */
    public constructor(title: String) : this(adw_banner_new(title)!!.reinterpret())

    /**
     * Gets the button label for @self.
     *
     * @return the button label for @self
     * @since 1.3
     */
    public fun getButtonLabel(): String? = adw_banner_get_button_label(adwBannerPointer.reinterpret())?.toKString()

    /**
     * Gets if a banner is revealed
     *
     * @return Whether a banner is revealed
     * @since 1.3
     */
    public fun getRevealed(): Boolean = adw_banner_get_revealed(adwBannerPointer.reinterpret()).asBoolean()

    /**
     * Gets the title for @self.
     *
     * @return the title for @self
     * @since 1.3
     */
    public fun getTitle(): String =
        adw_banner_get_title(adwBannerPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     * Gets whether to use Pango markup for the banner title.
     *
     * @return whether to use markup
     * @since 1.3
     */
    public fun getUseMarkup(): Boolean = adw_banner_get_use_markup(adwBannerPointer.reinterpret()).asBoolean()

    /**
     * Sets the button label for @self.
     *
     * If set to `""` or `NULL`, the button won't be shown.
     *
     * The button can be used with a `GAction`, or with the
     * [signal@Banner::button-clicked] signal.
     *
     * @param label the label
     * @since 1.3
     */
    public fun setButtonLabel(label: String? = null): Unit =
        adw_banner_set_button_label(adwBannerPointer.reinterpret(), label)

    /**
     * Sets whether a banner should be revealed
     *
     * @param revealed whether a banner should be revealed
     * @since 1.3
     */
    public fun setRevealed(revealed: Boolean): Unit =
        adw_banner_set_revealed(adwBannerPointer.reinterpret(), revealed.asGBoolean())

    /**
     * Sets the title for this banner.
     *
     * See also: [property@Banner:use-markup].
     *
     * @param title the title
     * @since 1.3
     */
    public fun setTitle(title: String): Unit =
        adw_banner_set_title(
            adwBannerPointer.reinterpret(),
            title
        )

    /**
     * Sets whether to use Pango markup for the banner title.
     *
     * See also [func@Pango.parse_markup].
     *
     * @param useMarkup whether to use markup
     * @since 1.3
     */
    public fun setUseMarkup(useMarkup: Boolean): Unit =
        adw_banner_set_use_markup(adwBannerPointer.reinterpret(), useMarkup.asGBoolean())

    /**
     * This signal is emitted after the action button has been clicked.
     *
     * It can be used as an alternative to setting an action.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     * @since 1.3
     */
    public fun connectButtonClicked(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "button-clicked",
            connectButtonClickedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<Banner> {
        override val type: GeneratedClassKGType<Banner> =
            GeneratedClassKGType(adw_banner_get_type()) { Banner(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }
    }
}

private val connectButtonClickedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }
        .reinterpret()

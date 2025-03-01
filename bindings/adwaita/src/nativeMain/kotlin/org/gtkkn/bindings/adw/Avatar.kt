// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gdk.Paintable
import org.gtkkn.bindings.gdk.Texture
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.adw.AdwAvatar
import org.gtkkn.native.adw.adw_avatar_draw_to_texture
import org.gtkkn.native.adw.adw_avatar_get_custom_image
import org.gtkkn.native.adw.adw_avatar_get_icon_name
import org.gtkkn.native.adw.adw_avatar_get_show_initials
import org.gtkkn.native.adw.adw_avatar_get_size
import org.gtkkn.native.adw.adw_avatar_get_text
import org.gtkkn.native.adw.adw_avatar_get_type
import org.gtkkn.native.adw.adw_avatar_new
import org.gtkkn.native.adw.adw_avatar_set_custom_image
import org.gtkkn.native.adw.adw_avatar_set_icon_name
import org.gtkkn.native.adw.adw_avatar_set_show_initials
import org.gtkkn.native.adw.adw_avatar_set_size
import org.gtkkn.native.adw.adw_avatar_set_text
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import kotlin.Boolean
import kotlin.String

/**
 * A widget displaying an image, with a generated fallback.
 *
 * <picture>
 *   <source srcset="avatar-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="avatar.png" alt="avatar">
 * </picture>
 *
 * `AdwAvatar` is a widget that shows a round avatar.
 *
 * `AdwAvatar` generates an avatar with the initials of  the
 * [property@Avatar:text] on top of a colored background.
 *
 * The color is picked based on the hash of the [property@Avatar:text].
 *
 * If [property@Avatar:show-initials] is set to `FALSE`,
 * [property@Avatar:icon-name] or `avatar-default-symbolic` is shown instead of
 * the initials.
 *
 * Use [property@Avatar:custom-image] to set a custom image.
 *
 * ## CSS nodes
 *
 * `AdwAvatar` has a single CSS node with name `avatar`.
 */
public class Avatar(public val adwAvatarPointer: CPointer<AdwAvatar>) :
    Widget(adwAvatarPointer.reinterpret()),
    KGTyped {
    init {
        Adw
    }

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * A custom image paintable.
     *
     * Custom image is displayed instead of initials or icon.
     */
    public var customImage: Paintable?
        /**
         * Gets the custom image paintable.
         *
         * @return the custom image
         */
        get() = adw_avatar_get_custom_image(adwAvatarPointer)?.run {
            Paintable.PaintableImpl(reinterpret())
        }

        /**
         * Sets the custom image paintable.
         *
         * Custom image is displayed instead of initials or icon.
         *
         * @param customImage a custom image
         */
        set(customImage) = adw_avatar_set_custom_image(adwAvatarPointer, customImage?.gdkPaintablePointer)

    /**
     * The name of an icon to use as a fallback.
     *
     * If no name is set, `avatar-default-symbolic` will be used.
     */
    public var iconName: String?
        /**
         * Gets the name of an icon to use as a fallback.
         *
         * @return the icon name
         */
        get() = adw_avatar_get_icon_name(adwAvatarPointer)?.toKString()

        /**
         * Sets the name of an icon to use as a fallback.
         *
         * If no name is set, `avatar-default-symbolic` will be used.
         *
         * @param iconName the icon name
         */
        set(iconName) = adw_avatar_set_icon_name(adwAvatarPointer, iconName)

    /**
     * Whether initials are used instead of an icon on the fallback avatar.
     *
     * See [property@Avatar:icon-name] for how to change the fallback icon.
     */
    public var showInitials: Boolean
        /**
         * Gets whether initials are used instead of an icon on the fallback avatar.
         *
         * @return whether initials are used instead of an icon as fallback
         */
        get() = adw_avatar_get_show_initials(adwAvatarPointer).asBoolean()

        /**
         * Sets whether to use initials instead of an icon on the fallback avatar.
         *
         * See [property@Avatar:icon-name] for how to change the fallback icon.
         *
         * @param showInitials whether to use initials instead of an icon as fallback
         */
        set(showInitials) = adw_avatar_set_show_initials(adwAvatarPointer, showInitials.asGBoolean())

    /**
     * The size of the avatar.
     */
    public var size: gint
        /**
         * Gets the size of the avatar.
         *
         * @return the size of the avatar
         */
        get() = adw_avatar_get_size(adwAvatarPointer)

        /**
         * Sets the size of the avatar.
         *
         * @param size The size of the avatar
         */
        set(size) = adw_avatar_set_size(adwAvatarPointer, size)

    /**
     * Sets the text used to generate the fallback initials and color.
     *
     * It's only used to generate the color if [property@Avatar:show-initials] is
     * `FALSE`.
     */
    public var text: String?
        /**
         * Gets the text used to generate the fallback initials and color.
         *
         * @return the text used to generate the fallback initials and
         *   color
         */
        get() = adw_avatar_get_text(adwAvatarPointer)?.toKString()

        /**
         * Sets the text used to generate the fallback initials and color.
         *
         * It's only used to generate the color if [property@Avatar:show-initials] is
         * `FALSE`.
         *
         * @param text the text used to get the initials and color
         */
        set(text) = adw_avatar_set_text(adwAvatarPointer, text)

    /**
     * Creates a new `AdwAvatar`.
     *
     * @param size The size of the avatar
     * @param text the text used to get the initials and color
     * @param showInitials whether to use initials instead of an icon as fallback
     * @return the newly created `AdwAvatar`
     */
    public constructor(
        size: gint,
        text: String? = null,
        showInitials: Boolean,
    ) : this(adw_avatar_new(size, text, showInitials.asGBoolean())!!.reinterpret()) {
        InstanceCache.put(this)
    }

    /**
     * Renders @self into a [class@Gdk.Texture] at @scale_factor.
     *
     * This can be used to export the fallback avatar.
     *
     * @param scaleFactor The scale factor
     * @return the texture
     */
    public fun drawToTexture(scaleFactor: gint): Texture =
        adw_avatar_draw_to_texture(adwAvatarPointer, scaleFactor)!!.run {
            InstanceCache.get(this, true) { Texture.TextureImpl(reinterpret()) }!!
        }

    public companion object : TypeCompanion<Avatar> {
        override val type: GeneratedClassKGType<Avatar> =
            GeneratedClassKGType(getTypeOrNull()!!) { Avatar(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of Avatar
         *
         * @return the GType
         */
        public fun getType(): GType = adw_avatar_get_type()

        /**
         * Gets the GType of from the symbol `adw_avatar_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? = org.gtkkn.extensions.glib.cinterop.getTypeOrNull("adw_avatar_get_type")
    }
}

// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.ApplicationFlags
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwApplication
import org.gtkkn.native.adw.adw_application_get_style_manager
import org.gtkkn.native.adw.adw_application_get_type
import org.gtkkn.native.adw.adw_application_new
import org.gtkkn.native.gio.GActionGroup
import org.gtkkn.native.gio.GActionMap
import org.gtkkn.native.gobject.GType
import kotlin.String

/**
 * A base class for Adwaita applications.
 *
 * `AdwApplication` handles library initialization by calling [func@init] in the
 * default [signal@Gio.Application::startup] signal handler, in turn chaining up
 * as required by [class@Gtk.Application]. Therefore, any subclass of
 * `AdwApplication` should always chain up its `startup` handler before using
 * any Adwaita or GTK API.
 *
 * ## Automatic Resources
 *
 * `AdwApplication` will automatically load stylesheets located in the
 * application's resource base path (see
 * [method@Gio.Application.set_resource_base_path], if they're present.
 *
 * They can be used to add custom styles to the application, as follows:
 *
 * - `style.css` contains styles that are always present.
 *
 * - `style-dark.css` contains styles only used when
 * [property@StyleManager:dark] is `TRUE`.
 *
 * - `style-hc.css` contains styles used when the system high contrast
 *   preference is enabled.
 *
 * - `style-hc-dark.css` contains styles used when the system high contrast
 *   preference is enabled and [property@StyleManager:dark] is `TRUE`.
 */
public open class Application(public val adwApplicationPointer: CPointer<AdwApplication>) :
    org.gtkkn.bindings.gtk.Application(adwApplicationPointer.reinterpret()),
    KGTyped {
    override val gioActionGroupPointer: CPointer<GActionGroup>
        get() = handle.reinterpret()

    override val gioActionMapPointer: CPointer<GActionMap>
        get() = handle.reinterpret()

    /**
     * The style manager for this application.
     *
     * This is a convenience property allowing to access `AdwStyleManager` through
     * property bindings or expressions.
     */
    public open val styleManager: StyleManager
        /**
         * Gets the style manager for @self.
         *
         * This is a convenience property allowing to access `AdwStyleManager` through
         * property bindings or expressions.
         *
         * @return the style manager
         */
        get() = adw_application_get_style_manager(adwApplicationPointer)!!.run {
            StyleManager(this)
        }

    /**
     * Creates a new `AdwApplication`.
     *
     * If `application_id` is not `NULL`, then it must be valid. See
     * [func@Gio.Application.id_is_valid].
     *
     * If no application ID is given then some features (most notably application
     * uniqueness) will be disabled.
     *
     * @param applicationId The application ID
     * @param flags The application flags
     * @return the newly created `AdwApplication`
     */
    public constructor(
        applicationId: String? = null,
        flags: ApplicationFlags,
    ) : this(adw_application_new(applicationId, flags.mask)!!.reinterpret())

    public companion object : TypeCompanion<Application> {
        override val type: GeneratedClassKGType<Application> =
            GeneratedClassKGType(adw_application_get_type()) { Application(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of Application
         *
         * @return the GType
         */
        public fun getType(): GType = adw_application_get_type()
    }
}

// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.Permission
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkActionable
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkLockButton
import org.gtkkn.native.gtk.gtk_lock_button_get_permission
import org.gtkkn.native.gtk.gtk_lock_button_get_type
import org.gtkkn.native.gtk.gtk_lock_button_new
import org.gtkkn.native.gtk.gtk_lock_button_set_permission

/**
 * # ⚠️ Deprecated ⚠️
 *
 * This is deprecated since version 4.10.
 *
 * This widget will be removed in GTK 5
 * ---
 *
 * `GtkLockButton` is a widget to obtain and revoke authorizations
 * needed to operate the controls.
 *
 * ![An example GtkLockButton](lock-button.png)
 *
 * It is typically used in preference dialogs or control panels.
 *
 * The required authorization is represented by a `GPermission` object.
 * Concrete implementations of `GPermission` may use PolicyKit or some
 * other authorization framework. To obtain a PolicyKit-based
 * `GPermission`, use `polkit_permission_new()`.
 *
 * If the user is not currently allowed to perform the action, but can
 * obtain the permission, the widget looks like this:
 *
 * ![](lockbutton-locked.png)
 *
 * and the user can click the button to request the permission. Depending
 * on the platform, this may pop up an authentication dialog or ask the user
 * to authenticate in some other way. Once the user has obtained the permission,
 * the widget changes to this:
 *
 * ![](lockbutton-unlocked.png)
 *
 * and the permission can be dropped again by clicking the button. If the user
 * is not able to obtain the permission at all, the widget looks like this:
 *
 * ![](lockbutton-sorry.png)
 *
 * If the user has the permission and cannot drop it, the button is hidden.
 *
 * The text (and tooltips) that are shown in the various cases can be adjusted
 * with the [property@Gtk.LockButton:text-lock],
 * [property@Gtk.LockButton:text-unlock],
 * [property@Gtk.LockButton:tooltip-lock],
 * [property@Gtk.LockButton:tooltip-unlock] and
 * [property@Gtk.LockButton:tooltip-not-authorized] properties.
 *
 * ## Skipped during bindings generation
 *
 * - method `text-lock`: Property has no getter nor setter
 * - method `text-unlock`: Property has no getter nor setter
 * - method `tooltip-lock`: Property has no getter nor setter
 * - method `tooltip-not-authorized`: Property has no getter nor setter
 * - method `tooltip-unlock`: Property has no getter nor setter
 */
public open class LockButton(public val gtkLockButtonPointer: CPointer<GtkLockButton>) :
    Button(gtkLockButtonPointer.reinterpret()),
    KGTyped {
    init {
        Gtk
    }

    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkActionablePointer: CPointer<GtkActionable>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * The `GPermission object controlling this button.
     */
    public open var permission: Permission?
        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         *
         * This widget will be removed in GTK 5
         * ---
         *
         * Obtains the `GPermission` object that controls @button.
         *
         * @return the `GPermission` of @button
         */
        get() = gtk_lock_button_get_permission(gtkLockButtonPointer)?.run {
            InstanceCache.get(this, true) { Permission.PermissionImpl(reinterpret()) }!!
        }

        /**
         * # ⚠️ Deprecated ⚠️
         *
         * This is deprecated since version 4.10.
         *
         * This widget will be removed in GTK 5
         * ---
         *
         * Sets the `GPermission` object that controls @button.
         *
         * @param permission a `GPermission` object
         */
        set(permission) = gtk_lock_button_set_permission(gtkLockButtonPointer, permission?.gioPermissionPointer)

    /**
     * # ⚠️ Deprecated ⚠️
     *
     * This is deprecated since version 4.10.
     *
     * This widget will be removed in GTK 5
     * ---
     *
     * Creates a new lock button which reflects the @permission.
     *
     * @param permission a `GPermission`
     * @return a new `GtkLockButton`
     */
    public constructor(
        permission: Permission? = null,
    ) : this(gtk_lock_button_new(permission?.gioPermissionPointer)!!.reinterpret()) {
        InstanceCache.put(this)
    }

    public companion object : TypeCompanion<LockButton> {
        override val type: GeneratedClassKGType<LockButton> =
            GeneratedClassKGType(getTypeOrNull()!!) { LockButton(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of LockButton
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_lock_button_get_type()

        /**
         * Gets the GType of from the symbol `gtk_lock_button_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? =
            org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gtk_lock_button_get_type")
    }
}

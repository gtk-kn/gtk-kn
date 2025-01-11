// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.Permission
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
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
    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkActionablePointer: CPointer<GtkActionable>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * The `GPermission object controlling this button.
     */
    public open var permission: Permission?
        /**
         * Obtains the `GPermission` object that controls @button.
         *
         * @return the `GPermission` of @button
         */
        get() = gtk_lock_button_get_permission(gtkLockButtonPointer)?.run {
            Permission.PermissionImpl(this)
        }

        /**
         * Sets the `GPermission` object that controls @button.
         *
         * @param permission a `GPermission` object
         */
        set(permission) = gtk_lock_button_set_permission(gtkLockButtonPointer, permission?.gioPermissionPointer)

    /**
     * Creates a new lock button which reflects the @permission.
     *
     * @param permission a `GPermission`
     * @return a new `GtkLockButton`
     */
    public constructor(
        permission: Permission? = null,
    ) : this(gtk_lock_button_new(permission?.gioPermissionPointer)!!.reinterpret())

    public companion object : TypeCompanion<LockButton> {
        override val type: GeneratedClassKGType<LockButton> =
            GeneratedClassKGType(gtk_lock_button_get_type()) { LockButton(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of LockButton
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_lock_button_get_type()
    }
}

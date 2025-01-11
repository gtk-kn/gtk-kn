// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.ModifierType
import org.gtkkn.bindings.gio.ListModel
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GListModel
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkShortcutController
import org.gtkkn.native.gtk.gtk_shortcut_controller_add_shortcut
import org.gtkkn.native.gtk.gtk_shortcut_controller_get_mnemonics_modifiers
import org.gtkkn.native.gtk.gtk_shortcut_controller_get_scope
import org.gtkkn.native.gtk.gtk_shortcut_controller_get_type
import org.gtkkn.native.gtk.gtk_shortcut_controller_new
import org.gtkkn.native.gtk.gtk_shortcut_controller_new_for_model
import org.gtkkn.native.gtk.gtk_shortcut_controller_remove_shortcut
import org.gtkkn.native.gtk.gtk_shortcut_controller_set_mnemonics_modifiers
import org.gtkkn.native.gtk.gtk_shortcut_controller_set_scope
import kotlin.Unit

/**
 * `GtkShortcutController` is an event controller that manages shortcuts.
 *
 * Most common shortcuts are using this controller implicitly, e.g. by
 * adding a mnemonic underline to a [class@Gtk.Label], or by installing a key
 * binding using [method@Gtk.WidgetClass.add_binding], or by adding accelerators
 * to global actions using [method@Gtk.Application.set_accels_for_action].
 *
 * But it is possible to create your own shortcut controller, and add
 * shortcuts to it.
 *
 * `GtkShortcutController` implements [iface@Gio.ListModel] for querying the
 * shortcuts that have been added to it.
 *
 * # GtkShortcutController as GtkBuildable
 *
 * `GtkShortcutController`s can be created in [class@Gtk.Builder] ui files, to set up
 * shortcuts in the same place as the widgets.
 *
 * An example of a UI definition fragment with `GtkShortcutController`:
 * ```xml
 *   <object class='GtkButton'>
 *     <child>
 *       <object class='GtkShortcutController'>
 *         <property name='scope'>managed</property>
 *         <child>
 *           <object class='GtkShortcut'>
 *             <property name='trigger'>`&lt;`Control`&gt;`k</property>
 *             <property name='action'>activate</property>
 *           </object>
 *         </child>
 *       </object>
 *     </child>
 *   </object>
 * ```
 *
 * This example creates a [class@Gtk.ActivateAction] for triggering the
 * `activate` signal of the [class@Gtk.Button]. See [ctor@Gtk.ShortcutAction.parse_string]
 * for the syntax for other kinds of [class@Gtk.ShortcutAction]. See
 * [ctor@Gtk.ShortcutTrigger.parse_string] to learn more about the syntax
 * for triggers.
 *
 * ## Skipped during bindings generation
 *
 * - method `item-type`: Property has no getter nor setter
 * - method `mnemonic-modifiers`: Property has no getter nor setter
 * - method `model`: Property has no getter nor setter
 * - method `n-items`: Property has no getter nor setter
 */
public open class ShortcutController(public val gtkShortcutControllerPointer: CPointer<GtkShortcutController>) :
    EventController(gtkShortcutControllerPointer.reinterpret()),
    ListModel,
    Buildable,
    KGTyped {
    override val gioListModelPointer: CPointer<GListModel>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    /**
     * What scope the shortcuts will be handled in.
     */
    public open var scope: ShortcutScope
        /**
         * Gets the scope for when this controller activates its shortcuts.
         *
         * See [method@Gtk.ShortcutController.set_scope] for details.
         *
         * @return the controller's scope
         */
        get() = gtk_shortcut_controller_get_scope(gtkShortcutControllerPointer).run {
            ShortcutScope.fromNativeValue(this)
        }

        /**
         * Sets the controller to have the given @scope.
         *
         * The scope allows shortcuts to be activated outside of the normal
         * event propagation. In particular, it allows installing global
         * keyboard shortcuts that can be activated even when a widget does
         * not have focus.
         *
         * With %GTK_SHORTCUT_SCOPE_LOCAL, shortcuts will only be activated
         * when the widget has focus.
         *
         * @param scope the new scope to use
         */
        set(scope) = gtk_shortcut_controller_set_scope(gtkShortcutControllerPointer, scope.nativeValue)

    /**
     * Creates a new shortcut controller.
     *
     * @return a newly created shortcut controller
     */
    public constructor() : this(gtk_shortcut_controller_new()!!.reinterpret())

    /**
     * Creates a new shortcut controller that takes its shortcuts from
     * the given list model.
     *
     * A controller created by this function does not let you add or
     * remove individual shortcuts using the shortcut controller api,
     * but you can change the contents of the model.
     *
     * @param model a `GListModel` containing shortcuts
     * @return a newly created shortcut controller
     */
    public constructor(
        model: ListModel,
    ) : this(gtk_shortcut_controller_new_for_model(model.gioListModelPointer)!!.reinterpret())

    /**
     * Adds @shortcut to the list of shortcuts handled by @self.
     *
     * If this controller uses an external shortcut list, this
     * function does nothing.
     *
     * @param shortcut a `GtkShortcut`
     */
    public open fun addShortcut(shortcut: Shortcut): Unit =
        gtk_shortcut_controller_add_shortcut(gtkShortcutControllerPointer, shortcut.gtkShortcutPointer)

    /**
     * Gets the mnemonics modifiers for when this controller activates its shortcuts.
     *
     * @return the controller's mnemonics modifiers
     */
    public open fun getMnemonicsModifiers(): ModifierType =
        gtk_shortcut_controller_get_mnemonics_modifiers(gtkShortcutControllerPointer).run {
            ModifierType(this)
        }

    /**
     * Removes @shortcut from the list of shortcuts handled by @self.
     *
     * If @shortcut had not been added to @controller or this controller
     * uses an external shortcut list, this function does nothing.
     *
     * @param shortcut a `GtkShortcut`
     */
    public open fun removeShortcut(shortcut: Shortcut): Unit =
        gtk_shortcut_controller_remove_shortcut(gtkShortcutControllerPointer, shortcut.gtkShortcutPointer)

    /**
     * Sets the controller to use the given modifier for mnemonics.
     *
     * The mnemonics modifiers determines which modifiers need to be pressed to allow
     * activation of shortcuts with mnemonics triggers.
     *
     * GTK normally uses the Alt modifier for mnemonics, except in `GtkPopoverMenu`s,
     * where mnemonics can be triggered without any modifiers. It should be very
     * rarely necessary to change this, and doing so is likely to interfere with
     * other shortcuts.
     *
     * This value is only relevant for local shortcut controllers. Global and managed
     * shortcut controllers will have their shortcuts activated from other places which
     * have their own modifiers for activating mnemonics.
     *
     * @param modifiers the new mnemonics_modifiers to use
     */
    public open fun setMnemonicsModifiers(modifiers: ModifierType): Unit =
        gtk_shortcut_controller_set_mnemonics_modifiers(gtkShortcutControllerPointer, modifiers.mask)

    public companion object : TypeCompanion<ShortcutController> {
        override val type: GeneratedClassKGType<ShortcutController> =
            GeneratedClassKGType(gtk_shortcut_controller_get_type()) { ShortcutController(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of ShortcutController
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_shortcut_controller_get_type()
    }
}

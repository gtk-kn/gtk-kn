// This is a generated file. Do not modify.
package org.gtkkn.bindings.adw

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.adw.annotations.AdwVersion1_2
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.adw.AdwPasswordEntryRow
import org.gtkkn.native.adw.adw_password_entry_row_get_type
import org.gtkkn.native.adw.adw_password_entry_row_new
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkActionable
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkEditable

/**
 * A [class@EntryRow] tailored for entering secrets.
 *
 * <picture>
 *   <source srcset="password-entry-row-dark.png" media="(prefers-color-scheme: dark)">
 *   <img src="password-entry-row.png" alt="password-entry-row">
 * </picture>
 *
 * It does not show its contents in clear text, does not allow to copy it to the
 * clipboard, and shows a warning when Caps Lock is engaged. If the underlying
 * platform allows it, `AdwPasswordEntryRow` will also place the text in a
 * non-pageable memory area, to avoid it being written out to disk by the
 * operating system.
 *
 * It offer a way to reveal the contents in clear text.
 *
 * ## CSS Nodes
 *
 * `AdwPasswordEntryRow` has a single CSS node with name `row` that carries
 * `.entry` and `.password` style classes.
 * @since 1.2
 */
@AdwVersion1_2
public class PasswordEntryRow(public val adwPasswordEntryRowPointer: CPointer<AdwPasswordEntryRow>) :
    EntryRow(adwPasswordEntryRowPointer.reinterpret()),
    KGTyped {
    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkActionablePointer: CPointer<GtkActionable>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    override val gtkEditablePointer: CPointer<GtkEditable>
        get() = handle.reinterpret()

    /**
     * Creates a new `AdwPasswordEntryRow`.
     *
     * @return the newly created `AdwPasswordEntryRow`
     * @since 1.2
     */
    public constructor() : this(adw_password_entry_row_new()!!.reinterpret())

    public companion object : TypeCompanion<PasswordEntryRow> {
        override val type: GeneratedClassKGType<PasswordEntryRow> =
            GeneratedClassKGType(adw_password_entry_row_get_type()) { PasswordEntryRow(it.reinterpret()) }

        init {
            AdwTypeProvider.register()
        }

        /**
         * Get the GType of PasswordEntryRow
         *
         * @return the GType
         */
        public fun getType(): GType = adw_password_entry_row_get_type()
    }
}

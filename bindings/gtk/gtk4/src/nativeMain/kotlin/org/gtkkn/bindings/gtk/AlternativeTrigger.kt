// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAlternativeTrigger
import org.gtkkn.native.gtk.gtk_alternative_trigger_get_first
import org.gtkkn.native.gtk.gtk_alternative_trigger_get_second
import org.gtkkn.native.gtk.gtk_alternative_trigger_get_type
import org.gtkkn.native.gtk.gtk_alternative_trigger_new

/**
 * A `GtkShortcutTrigger` that combines two triggers.
 *
 * The `GtkAlternativeTrigger` triggers when either of two trigger.
 *
 * This can be cascaded to combine more than two triggers.
 */
public open class AlternativeTrigger(public val gtkAlternativeTriggerPointer: CPointer<GtkAlternativeTrigger>) :
    ShortcutTrigger(gtkAlternativeTriggerPointer.reinterpret()),
    KGTyped {
    /**
     * The first `GtkShortcutTrigger` to check.
     */
    public open val first: ShortcutTrigger
        /**
         * Gets the first of the two alternative triggers that may
         * trigger @self.
         *
         * [method@Gtk.AlternativeTrigger.get_second] will return
         * the other one.
         *
         * @return the first alternative trigger
         */
        get() = gtk_alternative_trigger_get_first(gtkAlternativeTriggerPointer)!!.run {
            ShortcutTrigger.ShortcutTriggerImpl(this)
        }

    /**
     * The second `GtkShortcutTrigger` to check.
     */
    public open val second: ShortcutTrigger
        /**
         * Gets the second of the two alternative triggers that may
         * trigger @self.
         *
         * [method@Gtk.AlternativeTrigger.get_first] will return
         * the other one.
         *
         * @return the second alternative trigger
         */
        get() = gtk_alternative_trigger_get_second(gtkAlternativeTriggerPointer)!!.run {
            ShortcutTrigger.ShortcutTriggerImpl(this)
        }

    /**
     * Creates a `GtkShortcutTrigger` that will trigger whenever
     * either of the two given triggers gets triggered.
     *
     * Note that nesting is allowed, so if you want more than two
     * alternative, create a new alternative trigger for each option.
     *
     * @param first The first trigger that may trigger
     * @param second The second trigger that may trigger
     * @return a new `GtkShortcutTrigger`
     */
    public constructor(
        first: ShortcutTrigger,
        second: ShortcutTrigger,
    ) : this(
        gtk_alternative_trigger_new(first.gtkShortcutTriggerPointer, second.gtkShortcutTriggerPointer)!!.reinterpret()
    )

    public companion object : TypeCompanion<AlternativeTrigger> {
        override val type: GeneratedClassKGType<AlternativeTrigger> =
            GeneratedClassKGType(gtk_alternative_trigger_get_type()) { AlternativeTrigger(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of AlternativeTrigger
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_alternative_trigger_get_type()
    }
}

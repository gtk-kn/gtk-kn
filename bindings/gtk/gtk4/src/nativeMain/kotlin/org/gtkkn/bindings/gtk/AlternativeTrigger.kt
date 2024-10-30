// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
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
public open class AlternativeTrigger(
    pointer: CPointer<GtkAlternativeTrigger>,
) : ShortcutTrigger(pointer.reinterpret()),
    KGTyped {
    public val gtkAlternativeTriggerPointer: CPointer<GtkAlternativeTrigger>
        get() = gPointer.reinterpret()

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
        get() =
            gtk_alternative_trigger_get_first(gtkAlternativeTriggerPointer.reinterpret())!!.run {
                ShortcutTrigger(reinterpret())
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
        get() =
            gtk_alternative_trigger_get_second(gtkAlternativeTriggerPointer.reinterpret())!!.run {
                ShortcutTrigger(reinterpret())
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
        gtk_alternative_trigger_new(
            first.gtkShortcutTriggerPointer.reinterpret(),
            second.gtkShortcutTriggerPointer.reinterpret()
        )!!.reinterpret()
    )

    /**
     * Gets the first of the two alternative triggers that may
     * trigger @self.
     *
     * [method@Gtk.AlternativeTrigger.get_second] will return
     * the other one.
     *
     * @return the first alternative trigger
     */
    public open fun getFirst(): ShortcutTrigger =
        gtk_alternative_trigger_get_first(gtkAlternativeTriggerPointer.reinterpret())!!.run {
            ShortcutTrigger(reinterpret())
        }

    /**
     * Gets the second of the two alternative triggers that may
     * trigger @self.
     *
     * [method@Gtk.AlternativeTrigger.get_first] will return
     * the other one.
     *
     * @return the second alternative trigger
     */
    public open fun getSecond(): ShortcutTrigger =
        gtk_alternative_trigger_get_second(gtkAlternativeTriggerPointer.reinterpret())!!.run {
            ShortcutTrigger(reinterpret())
        }

    public companion object : TypeCompanion<AlternativeTrigger> {
        override val type: GeneratedClassKGType<AlternativeTrigger> =
            GeneratedClassKGType(gtk_alternative_trigger_get_type()) { AlternativeTrigger(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}

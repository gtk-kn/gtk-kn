// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.EventSequence
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkGestureSingle
import org.gtkkn.native.gtk.gtk_gesture_single_get_button
import org.gtkkn.native.gtk.gtk_gesture_single_get_current_button
import org.gtkkn.native.gtk.gtk_gesture_single_get_current_sequence
import org.gtkkn.native.gtk.gtk_gesture_single_get_exclusive
import org.gtkkn.native.gtk.gtk_gesture_single_get_touch_only
import org.gtkkn.native.gtk.gtk_gesture_single_get_type
import org.gtkkn.native.gtk.gtk_gesture_single_set_button
import org.gtkkn.native.gtk.gtk_gesture_single_set_exclusive
import org.gtkkn.native.gtk.gtk_gesture_single_set_touch_only
import kotlin.Boolean

/**
 * `GtkGestureSingle` is a `GtkGestures` subclass optimized for singe-touch
 * and mouse gestures.
 *
 * Under interaction, these gestures stick to the first interacting sequence,
 * which is accessible through [method@Gtk.GestureSingle.get_current_sequence]
 * while the gesture is being interacted with.
 *
 * By default gestures react to both %GDK_BUTTON_PRIMARY and touch events.
 * [method@Gtk.GestureSingle.set_touch_only] can be used to change the
 * touch behavior. Callers may also specify a different mouse button number
 * to interact with through [method@Gtk.GestureSingle.set_button], or react
 * to any mouse button by setting it to 0. While the gesture is active, the
 * button being currently pressed can be known through
 * [method@Gtk.GestureSingle.get_current_button].
 */
public open class GestureSingle(pointer: CPointer<GtkGestureSingle>) :
    Gesture(pointer.reinterpret()),
    KGTyped {
    public val gtkGestureSinglePointer: CPointer<GtkGestureSingle>
        get() = gPointer.reinterpret()

    /**
     * Mouse button number to listen to, or 0 to listen for any button.
     */
    public open var button: guint
        /**
         * Returns the button number @gesture listens for.
         *
         * If this is 0, the gesture reacts to any button press.
         *
         * @return The button number, or 0 for any button
         */
        get() = gtk_gesture_single_get_button(gtkGestureSinglePointer)

        /**
         * Sets the button number @gesture listens to.
         *
         * If non-0, every button press from a different button
         * number will be ignored. Touch events implicitly match
         * with button 1.
         *
         * @param button button number to listen to, or 0 for any button
         */
        set(button) = gtk_gesture_single_set_button(gtkGestureSinglePointer, button)

    /**
     * Whether the gesture is exclusive.
     *
     * Exclusive gestures only listen to pointer and pointer emulated events.
     */
    public open var exclusive: Boolean
        /**
         * Gets whether a gesture is exclusive.
         *
         * For more information, see [method@Gtk.GestureSingle.set_exclusive].
         *
         * @return Whether the gesture is exclusive
         */
        get() = gtk_gesture_single_get_exclusive(gtkGestureSinglePointer).asBoolean()

        /**
         * Sets whether @gesture is exclusive.
         *
         * An exclusive gesture will only handle pointer and "pointer emulated"
         * touch events, so at any given time, there is only one sequence able
         * to interact with those.
         *
         * @param exclusive true to make @gesture exclusive
         */
        set(exclusive) = gtk_gesture_single_set_exclusive(gtkGestureSinglePointer, exclusive.asGBoolean())

    /**
     * Whether the gesture handles only touch events.
     */
    public open var touchOnly: Boolean
        /**
         * Returns true if the gesture is only triggered by touch events.
         *
         * @return true if the gesture only handles touch events
         */
        get() = gtk_gesture_single_get_touch_only(gtkGestureSinglePointer).asBoolean()

        /**
         * Sets whether to handle only touch events.
         *
         * If @touch_only is true, @gesture will only handle events of type
         * %GDK_TOUCH_BEGIN, %GDK_TOUCH_UPDATE or %GDK_TOUCH_END. If false,
         * mouse events will be handled too.
         *
         * @param touchOnly whether @gesture handles only touch events
         */
        set(touchOnly) = gtk_gesture_single_set_touch_only(gtkGestureSinglePointer, touchOnly.asGBoolean())

    /**
     * Returns the button number currently interacting
     * with @gesture, or 0 if there is none.
     *
     * @return The current button number
     */
    public open fun getCurrentButton(): guint = gtk_gesture_single_get_current_button(gtkGestureSinglePointer)

    /**
     * Returns the event sequence currently interacting with @gesture.
     *
     * This is only meaningful if [method@Gtk.Gesture.is_active]
     * returns true.
     *
     * @return the current sequence
     */
    public open fun getCurrentSequence(): EventSequence? =
        gtk_gesture_single_get_current_sequence(gtkGestureSinglePointer)?.run {
            EventSequence(this)
        }

    public companion object : TypeCompanion<GestureSingle> {
        override val type: GeneratedClassKGType<GestureSingle> =
            GeneratedClassKGType(gtk_gesture_single_get_type()) { GestureSingle(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of GestureSingle
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_gesture_single_get_type()
    }
}

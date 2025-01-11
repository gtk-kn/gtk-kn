// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gtk.GtkAccessible
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.gtk.GtkConstraintTarget
import org.gtkkn.native.gtk.GtkRevealer
import org.gtkkn.native.gtk.gtk_revealer_get_child
import org.gtkkn.native.gtk.gtk_revealer_get_child_revealed
import org.gtkkn.native.gtk.gtk_revealer_get_reveal_child
import org.gtkkn.native.gtk.gtk_revealer_get_transition_duration
import org.gtkkn.native.gtk.gtk_revealer_get_transition_type
import org.gtkkn.native.gtk.gtk_revealer_get_type
import org.gtkkn.native.gtk.gtk_revealer_new
import org.gtkkn.native.gtk.gtk_revealer_set_child
import org.gtkkn.native.gtk.gtk_revealer_set_reveal_child
import org.gtkkn.native.gtk.gtk_revealer_set_transition_duration
import org.gtkkn.native.gtk.gtk_revealer_set_transition_type
import kotlin.Boolean

/**
 * A `GtkRevealer` animates the transition of its child from invisible to visible.
 *
 * The style of transition can be controlled with
 * [method@Gtk.Revealer.set_transition_type].
 *
 * These animations respect the [property@Gtk.Settings:gtk-enable-animations]
 * setting.
 *
 * # CSS nodes
 *
 * `GtkRevealer` has a single CSS node with name revealer.
 * When styling `GtkRevealer` using CSS, remember that it only hides its contents,
 * not itself. That means applied margin, padding and borders will be visible even
 * when the [property@Gtk.Revealer:reveal-child] property is set to false.
 *
 * # Accessibility
 *
 * `GtkRevealer` uses the %GTK_ACCESSIBLE_ROLE_GROUP role.
 *
 * The child of `GtkRevealer`, if set, is always available in the accessibility
 * tree, regardless of the state of the revealer widget.
 */
public open class Revealer(public val gtkRevealerPointer: CPointer<GtkRevealer>) :
    Widget(gtkRevealerPointer.reinterpret()),
    KGTyped {
    override val gtkAccessiblePointer: CPointer<GtkAccessible>
        get() = handle.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = handle.reinterpret()

    override val gtkConstraintTargetPointer: CPointer<GtkConstraintTarget>
        get() = handle.reinterpret()

    /**
     * The child widget.
     */
    public open var child: Widget?
        /**
         * Gets the child widget of @revealer.
         *
         * @return the child widget of @revealer
         */
        get() = gtk_revealer_get_child(gtkRevealerPointer)?.run {
            Widget.WidgetImpl(this)
        }

        /**
         * Sets the child widget of @revealer.
         *
         * @param child the child widget
         */
        set(child) = gtk_revealer_set_child(gtkRevealerPointer, child?.gtkWidgetPointer)

    /**
     * Whether the child is revealed and the animation target reached.
     */
    public open val childRevealed: Boolean
        /**
         * Returns whether the child is fully revealed.
         *
         * In other words, this returns whether the transition
         * to the revealed state is completed.
         *
         * @return true if the child is fully revealed
         */
        get() = gtk_revealer_get_child_revealed(gtkRevealerPointer).asBoolean()

    /**
     * Whether the revealer should reveal the child.
     */
    public open var revealChild: Boolean
        /**
         * Returns whether the child is currently revealed.
         *
         * This function returns true as soon as the transition
         * is to the revealed state is started. To learn whether
         * the child is fully revealed (ie the transition is completed),
         * use [method@Gtk.Revealer.get_child_revealed].
         *
         * @return true if the child is revealed.
         */
        get() = gtk_revealer_get_reveal_child(gtkRevealerPointer).asBoolean()

        /**
         * Tells the `GtkRevealer` to reveal or conceal its child.
         *
         * The transition will be animated with the current
         * transition type of @revealer.
         *
         * @param revealChild true to reveal the child
         */
        set(revealChild) = gtk_revealer_set_reveal_child(gtkRevealerPointer, revealChild.asGBoolean())

    /**
     * The animation duration, in milliseconds.
     */
    public open var transitionDuration: guint
        /**
         * Returns the amount of time (in milliseconds) that
         * transitions will take.
         *
         * @return the transition duration
         */
        get() = gtk_revealer_get_transition_duration(gtkRevealerPointer)

        /**
         * Sets the duration that transitions will take.
         *
         * @param duration the new duration, in milliseconds
         */
        set(duration) = gtk_revealer_set_transition_duration(gtkRevealerPointer, duration)

    /**
     * The type of animation used to transition.
     */
    public open var transitionType: RevealerTransitionType
        /**
         * Gets the type of animation that will be used
         * for transitions in @revealer.
         *
         * @return the current transition type of @revealer
         */
        get() = gtk_revealer_get_transition_type(gtkRevealerPointer).run {
            RevealerTransitionType.fromNativeValue(this)
        }

        /**
         * Sets the type of animation that will be used for
         * transitions in @revealer.
         *
         * Available types include various kinds of fades and slides.
         *
         * @param transition the new transition type
         */
        set(transition) = gtk_revealer_set_transition_type(gtkRevealerPointer, transition.nativeValue)

    /**
     * Creates a new `GtkRevealer`.
     *
     * @return a newly created `GtkRevealer`
     */
    public constructor() : this(gtk_revealer_new()!!.reinterpret())

    public companion object : TypeCompanion<Revealer> {
        override val type: GeneratedClassKGType<Revealer> =
            GeneratedClassKGType(gtk_revealer_get_type()) { Revealer(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }

        /**
         * Get the GType of Revealer
         *
         * @return the GType
         */
        public fun getType(): GType = gtk_revealer_get_type()
    }
}

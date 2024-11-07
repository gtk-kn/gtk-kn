// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import org.gtkkn.native.gtk.GtkPropagationPhase

/**
 * Describes the stage at which events are fed into a [class@EventController].
 */
public enum class PropagationPhase(
    public val nativeValue: GtkPropagationPhase,
) {
    /**
     * Events are not delivered.
     */
    NONE(GtkPropagationPhase.GTK_PHASE_NONE),

    /**
     * Events are delivered in the capture phase. The
     *   capture phase happens before the bubble phase, runs from the toplevel down
     *   to the event widget. This option should only be used on containers that
     *   might possibly handle events before their children do.
     */
    CAPTURE(GtkPropagationPhase.GTK_PHASE_CAPTURE),

    /**
     * Events are delivered in the bubble phase. The bubble
     *   phase happens after the capture phase, and before the default handlers
     *   are run. This phase runs from the event widget, up to the toplevel.
     */
    BUBBLE(GtkPropagationPhase.GTK_PHASE_BUBBLE),

    /**
     * Events are delivered in the default widget event handlers,
     *   note that widget implementations must chain up on button, motion, touch and
     *   grab broken handlers for controllers in this phase to be run.
     */
    TARGET(GtkPropagationPhase.GTK_PHASE_TARGET),
    ;

    public companion object {
        public fun fromNativeValue(nativeValue: GtkPropagationPhase): PropagationPhase =
            when (nativeValue) {
                GtkPropagationPhase.GTK_PHASE_NONE -> NONE
                GtkPropagationPhase.GTK_PHASE_CAPTURE -> CAPTURE
                GtkPropagationPhase.GTK_PHASE_BUBBLE -> BUBBLE
                GtkPropagationPhase.GTK_PHASE_TARGET -> TARGET
                else -> error("invalid nativeValue")
            }
    }
}

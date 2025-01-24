// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gobject

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gobject.GSignalFlags
import org.gtkkn.native.gobject.G_SIGNAL_ACCUMULATOR_FIRST_RUN
import org.gtkkn.native.gobject.G_SIGNAL_ACTION
import org.gtkkn.native.gobject.G_SIGNAL_DEPRECATED
import org.gtkkn.native.gobject.G_SIGNAL_DETAILED
import org.gtkkn.native.gobject.G_SIGNAL_MUST_COLLECT
import org.gtkkn.native.gobject.G_SIGNAL_NO_HOOKS
import org.gtkkn.native.gobject.G_SIGNAL_NO_RECURSE
import org.gtkkn.native.gobject.G_SIGNAL_RUN_CLEANUP
import org.gtkkn.native.gobject.G_SIGNAL_RUN_FIRST
import org.gtkkn.native.gobject.G_SIGNAL_RUN_LAST

/**
 * The signal flags are used to specify a signal's behaviour.
 */
public class SignalFlags(public val mask: GSignalFlags) : Bitfield<SignalFlags> {
    override infix fun or(other: SignalFlags): SignalFlags = SignalFlags(mask or other.mask)

    public companion object {
        /**
         * Invoke the object method handler in the first emission stage.
         */
        public val RUN_FIRST: SignalFlags = SignalFlags(G_SIGNAL_RUN_FIRST)

        /**
         * Invoke the object method handler in the third emission stage.
         */
        public val RUN_LAST: SignalFlags = SignalFlags(G_SIGNAL_RUN_LAST)

        /**
         * Invoke the object method handler in the last emission stage.
         */
        public val RUN_CLEANUP: SignalFlags = SignalFlags(G_SIGNAL_RUN_CLEANUP)

        /**
         * Signals being emitted for an object while currently being in
         *  emission for this very object will not be emitted recursively,
         *  but instead cause the first emission to be restarted.
         */
        public val NO_RECURSE: SignalFlags = SignalFlags(G_SIGNAL_NO_RECURSE)

        /**
         * This signal supports "::detail" appendices to the signal name
         *  upon handler connections and emissions.
         */
        public val DETAILED: SignalFlags = SignalFlags(G_SIGNAL_DETAILED)

        /**
         * Action signals are signals that may freely be emitted on alive
         *  objects from user code via g_signal_emit() and friends, without
         *  the need of being embedded into extra code that performs pre or
         *  post emission adjustments on the object. They can also be thought
         *  of as object methods which can be called generically by
         *  third-party code.
         */
        public val ACTION: SignalFlags = SignalFlags(G_SIGNAL_ACTION)

        /**
         * No emissions hooks are supported for this signal.
         */
        public val NO_HOOKS: SignalFlags = SignalFlags(G_SIGNAL_NO_HOOKS)

        /**
         * Varargs signal emission will always collect the
         *   arguments, even if there are no signal handlers connected.  Since 2.30.
         */
        public val MUST_COLLECT: SignalFlags = SignalFlags(G_SIGNAL_MUST_COLLECT)

        /**
         * The signal is deprecated and will be removed
         *   in a future version. A warning will be generated if it is connected while
         *   running with G_ENABLE_DIAGNOSTIC=1.  Since 2.32.
         */
        public val DEPRECATED: SignalFlags = SignalFlags(G_SIGNAL_DEPRECATED)

        /**
         * Only used in #GSignalAccumulator accumulator
         *   functions for the #GSignalInvocationHint::run_type field to mark the first
         *   call to the accumulator function for a signal emission.  Since 2.68.
         */
        public val ACCUMULATOR_FIRST_RUN: SignalFlags = SignalFlags(G_SIGNAL_ACCUMULATOR_FIRST_RUN)
    }
}

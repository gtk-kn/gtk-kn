// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.bindings.glib.annotations.GLibVersion2_72
import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.glib.GMainContextFlags
import org.gtkkn.native.glib.G_MAIN_CONTEXT_FLAGS_NONE
import org.gtkkn.native.glib.G_MAIN_CONTEXT_FLAGS_OWNERLESS_POLLING

/**
 * Flags to pass to g_main_context_new_with_flags() which affect the behaviour
 * of a #GMainContext.
 * @since 2.72
 */
public class MainContextFlags(public val mask: GMainContextFlags) : Bitfield<MainContextFlags> {
    override infix fun or(other: MainContextFlags): MainContextFlags = MainContextFlags(mask or other.mask)

    @GLibVersion2_72
    public companion object {
        /**
         * Default behaviour.
         */
        public val NONE: MainContextFlags = MainContextFlags(G_MAIN_CONTEXT_FLAGS_NONE)

        /**
         * Assume that polling for events will
         * free the thread to process other jobs. That's useful if you're using
         * `g_main_context_{prepare,query,check,dispatch}` to integrate GMainContext in
         * other event loops.
         */
        public val OWNERLESS_POLLING: MainContextFlags =
            MainContextFlags(G_MAIN_CONTEXT_FLAGS_OWNERLESS_POLLING)
    }
}

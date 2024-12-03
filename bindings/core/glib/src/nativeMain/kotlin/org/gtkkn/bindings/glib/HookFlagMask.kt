// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.glib.GHookFlagMask
import org.gtkkn.native.glib.G_HOOK_FLAG_ACTIVE
import org.gtkkn.native.glib.G_HOOK_FLAG_IN_CALL
import org.gtkkn.native.glib.G_HOOK_FLAG_MASK

/**
 * Flags used internally in the #GHook implementation.
 */
public class HookFlagMask(public val mask: GHookFlagMask) : Bitfield<HookFlagMask> {
    override infix fun or(other: HookFlagMask): HookFlagMask = HookFlagMask(mask or other.mask)

    public companion object {
        /**
         * set if the hook has not been destroyed
         */
        public val ACTIVE: HookFlagMask = HookFlagMask(G_HOOK_FLAG_ACTIVE)

        /**
         * set if the hook is currently being run
         */
        public val IN_CALL: HookFlagMask = HookFlagMask(G_HOOK_FLAG_IN_CALL)

        /**
         * A mask covering all bits reserved for
         *   hook flags; see %G_HOOK_FLAG_USER_SHIFT
         */
        public val MASK: HookFlagMask = HookFlagMask(G_HOOK_FLAG_MASK)
    }
}

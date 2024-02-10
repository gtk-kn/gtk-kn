// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GTestDBusFlags
import org.gtkkn.native.gio.G_TEST_DBUS_NONE

/**
 * Flags to define future #GTestDBus behaviour.
 * @since 2.34
 */
public class TestDBusFlags(
    public val mask: GTestDBusFlags,
) : Bitfield<TestDBusFlags> {
    override infix fun or(other: TestDBusFlags): TestDBusFlags = TestDBusFlags(mask or other.mask)

    public companion object {
        /**
         * No flags.
         */
        public val NONE: TestDBusFlags = TestDBusFlags(G_TEST_DBUS_NONE)
    }
}

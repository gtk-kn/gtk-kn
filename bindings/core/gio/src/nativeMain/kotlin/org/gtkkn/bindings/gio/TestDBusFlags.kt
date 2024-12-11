// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_34
import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GTestDBusFlags
import org.gtkkn.native.gio.G_TEST_DBUS_NONE
import org.gtkkn.native.gio.g_test_dbus_flags_get_type
import org.gtkkn.native.gobject.GType

/**
 * Flags to define future #GTestDBus behaviour.
 * @since 2.34
 */
public class TestDBusFlags(public val mask: GTestDBusFlags) : Bitfield<TestDBusFlags> {
    override infix fun or(other: TestDBusFlags): TestDBusFlags = TestDBusFlags(mask or other.mask)

    @GioVersion2_34
    public companion object {
        /**
         * No flags.
         */
        public val NONE: TestDBusFlags = TestDBusFlags(G_TEST_DBUS_NONE)

        /**
         * Get the GType of TestDBusFlags
         *
         * @return the GType
         */
        public fun getType(): GType = g_test_dbus_flags_get_type()
    }
}

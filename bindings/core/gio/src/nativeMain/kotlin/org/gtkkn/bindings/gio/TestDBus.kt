// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.annotations.GioVersion2_34
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GTestDBus
import org.gtkkn.native.gio.g_test_dbus_add_service_dir
import org.gtkkn.native.gio.g_test_dbus_down
import org.gtkkn.native.gio.g_test_dbus_get_bus_address
import org.gtkkn.native.gio.g_test_dbus_get_flags
import org.gtkkn.native.gio.g_test_dbus_get_type
import org.gtkkn.native.gio.g_test_dbus_new
import org.gtkkn.native.gio.g_test_dbus_stop
import org.gtkkn.native.gio.g_test_dbus_unset
import org.gtkkn.native.gio.g_test_dbus_up
import org.gtkkn.native.gobject.GType
import kotlin.String
import kotlin.Unit

/**
 * A helper class for testing code which uses D-Bus without touching the user’s
 * session bus.
 *
 * Note that `GTestDBus` modifies the user’s environment, calling
 * [`setenv()`](man:setenv(3)). This is not thread-safe, so all `GTestDBus`
 * calls should be completed before threads are spawned, or should have
 * appropriate locking to ensure no access conflicts to environment variables
 * shared between `GTestDBus` and other threads.
 *
 * ## Creating unit tests using `GTestDBus`
 *
 * Testing of D-Bus services can be tricky because normally we only ever run
 * D-Bus services over an existing instance of the D-Bus daemon thus we
 * usually don’t activate D-Bus services that are not yet installed into the
 * target system. The `GTestDBus` object makes this easier for us by taking care
 * of the lower level tasks such as running a private D-Bus daemon and looking
 * up uninstalled services in customizable locations, typically in your source
 * code tree.
 *
 * The first thing you will need is a separate service description file for the
 * D-Bus daemon. Typically a `services` subdirectory of your `tests` directory
 * is a good place to put this file.
 *
 * The service file should list your service along with an absolute path to the
 * uninstalled service executable in your source tree. Using autotools we would
 * achieve this by adding a file such as `my-server.service.in` in the services
 * directory and have it processed by configure.
 *
 * ```
 * [D-BUS Service]
 * Name=org.gtk.GDBus.Examples.ObjectManager
 * Exec=@abs_top_builddir@/gio/tests/gdbus-example-objectmanager-server
 * ```
 *
 * You will also need to indicate this service directory in your test
 * fixtures, so you will need to pass the path while compiling your
 * test cases. Typically this is done with autotools with an added
 * preprocessor flag specified to compile your tests such as:
 *
 * ```
 * -DTEST_SERVICES=\""$(abs_top_builddir)/tests/services"\"
 * ```
 *
 * Once you have a service definition file which is local to your source tree,
 * you can proceed to set up a GTest fixture using the `GTestDBus` scaffolding.
 *
 * An example of a test fixture for D-Bus services can be found
 * here:
 * [gdbus-test-fixture.c](https://gitlab.gnome.org/GNOME/glib/-/blob/HEAD/gio/tests/gdbus-test-fixture.c)
 *
 * Note that these examples only deal with isolating the D-Bus aspect of your
 * service. To successfully run isolated unit tests on your service you may need
 * some additional modifications to your test case fixture. For example; if your
 * service uses [class@Gio.Settings] and installs a schema then it is important
 * that your test service not load the schema in the ordinary installed location
 * (chances are that your service and schema files are not yet installed, or
 * worse; there is an older version of the schema file sitting in the install
 * location).
 *
 * Most of the time we can work around these obstacles using the
 * environment. Since the environment is inherited by the D-Bus daemon
 * created by `GTestDBus` and then in turn inherited by any services the
 * D-Bus daemon activates, using the setup routine for your fixture is
 * a practical place to help sandbox your runtime environment. For the
 * rather typical GSettings case we can work around this by setting
 * `GSETTINGS_SCHEMA_DIR` to the in tree directory holding your schemas
 * in the above `fixture_setup()` routine.
 *
 * The GSettings schemas need to be locally pre-compiled for this to work. This
 * can be achieved by compiling the schemas locally as a step before running
 * test cases, an autotools setup might do the following in the directory
 * holding schemas:
 *
 * ```
 *     all-am:
 *             $(GLIB_COMPILE_SCHEMAS) .
 *
 *     CLEANFILES += gschemas.compiled
 * ```
 * @since 2.34
 */
@GioVersion2_34
public open class TestDBus(public val gioTestDBusPointer: CPointer<GTestDBus>) :
    Object(gioTestDBusPointer.reinterpret()),
    KGTyped {
    /**
     * #GTestDBusFlags specifying the behaviour of the D-Bus session.
     *
     * @since 2.34
     */
    @GioVersion2_34
    public open val flags: TestDBusFlags
        /**
         * Get the flags of the #GTestDBus object.
         *
         * @return the value of #GTestDBus:flags property
         */
        get() = g_test_dbus_get_flags(gioTestDBusPointer).run {
            TestDBusFlags(this)
        }

    /**
     * Create a new #GTestDBus object.
     *
     * @param flags a #GTestDBusFlags
     * @return a new #GTestDBus.
     */
    public constructor(flags: TestDBusFlags) : this(g_test_dbus_new(flags.mask)!!.reinterpret())

    /**
     * Add a path where dbus-daemon will look up .service files. This can't be
     * called after g_test_dbus_up().
     *
     * @param path path to a directory containing .service files
     */
    public open fun addServiceDir(path: String): Unit = g_test_dbus_add_service_dir(gioTestDBusPointer, path)

    /**
     * Stop the session bus started by g_test_dbus_up().
     *
     * This will wait for the singleton returned by g_bus_get() or g_bus_get_sync()
     * to be destroyed. This is done to ensure that the next unit test won't get a
     * leaked singleton from this test.
     */
    public open fun down(): Unit = g_test_dbus_down(gioTestDBusPointer)

    /**
     * Get the address on which dbus-daemon is running. If g_test_dbus_up() has not
     * been called yet, null is returned. This can be used with
     * g_dbus_connection_new_for_address().
     *
     * @return the address of the bus, or null.
     */
    public open fun getBusAddress(): String? = g_test_dbus_get_bus_address(gioTestDBusPointer)?.toKString()

    /**
     * Stop the session bus started by g_test_dbus_up().
     *
     * Unlike g_test_dbus_down(), this won't verify the #GDBusConnection
     * singleton returned by g_bus_get() or g_bus_get_sync() is destroyed. Unit
     * tests wanting to verify behaviour after the session bus has been stopped
     * can use this function but should still call g_test_dbus_down() when done.
     */
    public open fun stop(): Unit = g_test_dbus_stop(gioTestDBusPointer)

    /**
     * Start a dbus-daemon instance and set DBUS_SESSION_BUS_ADDRESS. After this
     * call, it is safe for unit tests to start sending messages on the session bus.
     *
     * If this function is called from setup callback of g_test_add(),
     * g_test_dbus_down() must be called in its teardown callback.
     *
     * If this function is called from unit test's main(), then g_test_dbus_down()
     * must be called after g_test_run().
     */
    public open fun up(): Unit = g_test_dbus_up(gioTestDBusPointer)

    public companion object : TypeCompanion<TestDBus> {
        override val type: GeneratedClassKGType<TestDBus> =
            GeneratedClassKGType(g_test_dbus_get_type()) { TestDBus(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Unset DISPLAY and DBUS_SESSION_BUS_ADDRESS env variables to ensure the test
         * won't use user's session bus.
         *
         * This is useful for unit tests that want to verify behaviour when no session
         * bus is running. It is not necessary to call this if unit test already calls
         * g_test_dbus_up() before acquiring the session bus.
         */
        public fun unset(): Unit = g_test_dbus_unset()

        /**
         * Get the GType of TestDBus
         *
         * @return the GType
         */
        public fun getType(): GType = g_test_dbus_get_type()
    }
}

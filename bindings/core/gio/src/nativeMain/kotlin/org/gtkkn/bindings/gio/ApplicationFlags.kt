// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import org.gtkkn.bindings.gio.annotations.GioVersion2_28
import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gio.GApplicationFlags
import org.gtkkn.native.gio.G_APPLICATION_ALLOW_REPLACEMENT
import org.gtkkn.native.gio.G_APPLICATION_CAN_OVERRIDE_APP_ID
import org.gtkkn.native.gio.G_APPLICATION_DEFAULT_FLAGS
import org.gtkkn.native.gio.G_APPLICATION_FLAGS_NONE
import org.gtkkn.native.gio.G_APPLICATION_HANDLES_COMMAND_LINE
import org.gtkkn.native.gio.G_APPLICATION_HANDLES_OPEN
import org.gtkkn.native.gio.G_APPLICATION_IS_LAUNCHER
import org.gtkkn.native.gio.G_APPLICATION_IS_SERVICE
import org.gtkkn.native.gio.G_APPLICATION_NON_UNIQUE
import org.gtkkn.native.gio.G_APPLICATION_REPLACE
import org.gtkkn.native.gio.G_APPLICATION_SEND_ENVIRONMENT

/**
 * Flags used to define the behaviour of a #GApplication.
 * @since 2.28
 */
public class ApplicationFlags(
    public val mask: GApplicationFlags,
) : Bitfield<ApplicationFlags> {
    override infix fun or(other: ApplicationFlags): ApplicationFlags = ApplicationFlags(mask or other.mask)

    @GioVersion2_28
    public companion object {
        /**
         * Default. Deprecated in 2.74, use
         *   %G_APPLICATION_DEFAULT_FLAGS instead
         */
        public val FLAGS_NONE: ApplicationFlags = ApplicationFlags(G_APPLICATION_FLAGS_NONE)

        /**
         * Default flags. Since: 2.74
         */
        public val DEFAULT_FLAGS: ApplicationFlags = ApplicationFlags(G_APPLICATION_DEFAULT_FLAGS)

        /**
         * Run as a service. In this mode, registration
         *      fails if the service is already running, and the application
         *      will initially wait up to 10 seconds for an initial activation
         *      message to arrive.
         */
        public val IS_SERVICE: ApplicationFlags = ApplicationFlags(G_APPLICATION_IS_SERVICE)

        /**
         * Don't try to become the primary instance.
         */
        public val IS_LAUNCHER: ApplicationFlags = ApplicationFlags(G_APPLICATION_IS_LAUNCHER)

        /**
         * This application handles opening files (in
         *     the primary instance). Note that this flag only affects the default
         *     implementation of local_command_line(), and has no effect if
         *     %G_APPLICATION_HANDLES_COMMAND_LINE is given.
         *     See g_application_run() for details.
         */
        public val HANDLES_OPEN: ApplicationFlags = ApplicationFlags(G_APPLICATION_HANDLES_OPEN)

        /**
         * This application handles command line
         *     arguments (in the primary instance). Note that this flag only affect
         *     the default implementation of local_command_line().
         *     See g_application_run() for details.
         */
        public val HANDLES_COMMAND_LINE: ApplicationFlags =
            ApplicationFlags(G_APPLICATION_HANDLES_COMMAND_LINE)

        /**
         * Send the environment of the
         *     launching process to the primary instance. Set this flag if your
         *     application is expected to behave differently depending on certain
         *     environment variables. For instance, an editor might be expected
         *     to use the `GIT_COMMITTER_NAME` environment variable
         *     when editing a git commit message. The environment is available
         *     to the #GApplication::command-line signal handler, via
         *     g_application_command_line_getenv().
         */
        public val SEND_ENVIRONMENT: ApplicationFlags =
            ApplicationFlags(G_APPLICATION_SEND_ENVIRONMENT)

        /**
         * Make no attempts to do any of the typical
         *     single-instance application negotiation, even if the application
         *     ID is given.  The application neither attempts to become the
         *     owner of the application ID nor does it check if an existing
         *     owner already exists.  Everything occurs in the local process.
         *     Since: 2.30.
         */
        public val NON_UNIQUE: ApplicationFlags = ApplicationFlags(G_APPLICATION_NON_UNIQUE)

        /**
         * Allow users to override the
         *     application ID from the command line with `--gapplication-app-id`.
         *     Since: 2.48
         */
        public val CAN_OVERRIDE_APP_ID: ApplicationFlags =
            ApplicationFlags(G_APPLICATION_CAN_OVERRIDE_APP_ID)

        /**
         * Allow another instance to take over
         *     the bus name. Since: 2.60
         */
        public val ALLOW_REPLACEMENT: ApplicationFlags =
            ApplicationFlags(G_APPLICATION_ALLOW_REPLACEMENT)

        /**
         * Take over from another instance. This flag is
         *     usually set by passing `--gapplication-replace` on the commandline.
         *     Since: 2.60
         */
        public val REPLACE: ApplicationFlags = ApplicationFlags(G_APPLICATION_REPLACE)
    }
}

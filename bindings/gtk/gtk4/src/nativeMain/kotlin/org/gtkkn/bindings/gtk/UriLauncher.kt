// This is a generated file. Do not modify.
package org.gtkkn.bindings.gtk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gio.AsyncReadyCallback
import org.gtkkn.bindings.gio.AsyncReadyCallbackFunc
import org.gtkkn.bindings.gio.AsyncResult
import org.gtkkn.bindings.gio.Cancellable
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.Gtk.resolveException
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.glib.GError
import org.gtkkn.native.gtk.GtkUriLauncher
import org.gtkkn.native.gtk.gtk_uri_launcher_get_type
import org.gtkkn.native.gtk.gtk_uri_launcher_get_uri
import org.gtkkn.native.gtk.gtk_uri_launcher_launch
import org.gtkkn.native.gtk.gtk_uri_launcher_launch_finish
import org.gtkkn.native.gtk.gtk_uri_launcher_new
import org.gtkkn.native.gtk.gtk_uri_launcher_set_uri
import kotlin.Boolean
import kotlin.Result
import kotlin.String
import kotlin.Unit

/**
 * A `GtkUriLauncher` object collects the arguments that are needed to open a uri
 * with an application.
 *
 * Depending on system configuration, user preferences and available APIs, this
 * may or may not show an app chooser dialog or launch the default application
 * right away.
 *
 * The operation is started with the [method@Gtk.UriLauncher.launch] function.
 * This API follows the GIO async pattern, and the result can be obtained by
 * calling [method@Gtk.UriLauncher.launch_finish].
 *
 * To launch a file, use [class@Gtk.FileLauncher].
 * @since 4.10
 */
public open class UriLauncher(
    pointer: CPointer<GtkUriLauncher>,
) : Object(pointer.reinterpret()), KGTyped {
    public val gtkUriLauncherPointer: CPointer<GtkUriLauncher>
        get() = gPointer.reinterpret()

    /**
     * The uri to launch.
     *
     * @since 4.10
     */
    public open var uri: String?
        /**
         * Gets the uri that will be opened.
         *
         * @return the uri
         * @since 4.10
         */
        get() = gtk_uri_launcher_get_uri(gtkUriLauncherPointer.reinterpret())?.toKString()

        /**
         * Sets the uri that will be opened.
         *
         * @param uri the uri
         * @since 4.10
         */
        set(uri) = gtk_uri_launcher_set_uri(gtkUriLauncherPointer.reinterpret(), uri)

    /**
     * Creates a new `GtkUriLauncher` object.
     *
     * @param uri the uri to open
     * @return the new `GtkUriLauncher`
     * @since 4.10
     */
    public constructor(uri: String? = null) : this(gtk_uri_launcher_new(uri)!!.reinterpret())

    /**
     * Gets the uri that will be opened.
     *
     * @return the uri
     * @since 4.10
     */
    public open fun getUri(): String? = gtk_uri_launcher_get_uri(gtkUriLauncherPointer.reinterpret())?.toKString()

    /**
     * Launch an application to open the uri.
     *
     * This may present an app chooser dialog to the user.
     *
     * The @callback will be called when the operation is completed.
     * It should call [method@Gtk.UriLauncher.launch_finish] to obtain
     * the result.
     *
     * @param parent the parent `GtkWindow`
     * @param cancellable a `GCancellable` to cancel the operation
     * @param callback a callback to call when the operation is complete
     * @since 4.10
     */
    public open fun launch(
        parent: Window? = null,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback,
    ): Unit =
        gtk_uri_launcher_launch(
            gtkUriLauncherPointer.reinterpret(),
            parent?.gtkWindowPointer?.reinterpret(),
            cancellable?.gioCancellablePointer?.reinterpret(),
            AsyncReadyCallbackFunc.reinterpret(),
            StableRef.create(callback).asCPointer()
        )

    /**
     * Finishes the [method@Gtk.UriLauncher.launch] call and
     * returns the result.
     *
     * @param result a `GAsyncResult`
     * @return `TRUE` if an application was launched,
     *     or `FALSE` and @error is set
     * @since 4.10
     */
    public open fun launchFinish(result: AsyncResult): Result<Boolean> =
        memScoped {
            val gError = allocPointerTo<GError>()
            val gResult =
                gtk_uri_launcher_launch_finish(
                    gtkUriLauncherPointer.reinterpret(),
                    result.gioAsyncResultPointer,
                    gError.ptr
                ).asBoolean()
            return if (gError.pointed != null) {
                Result.failure(resolveException(Error(gError.pointed!!.ptr)))
            } else {
                Result.success(gResult)
            }
        }

    /**
     * Sets the uri that will be opened.
     *
     * @param uri the uri
     * @since 4.10
     */
    public open fun setUri(uri: String? = null): Unit =
        gtk_uri_launcher_set_uri(gtkUriLauncherPointer.reinterpret(), uri)

    public companion object : TypeCompanion<UriLauncher> {
        override val type: GeneratedClassKGType<UriLauncher> =
            GeneratedClassKGType(gtk_uri_launcher_get_type()) { UriLauncher(it.reinterpret()) }

        init {
            GtkTypeProvider.register()
        }
    }
}

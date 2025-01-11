// This is a generated file. Do not modify.
package org.gtkkn.bindings.gio

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.annotations.GioVersion2_26
import org.gtkkn.bindings.gio.annotations.GioVersion2_28
import org.gtkkn.bindings.glib.Tree
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.ext.toCStringList
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gio.GSettingsBackend
import org.gtkkn.native.gio.g_settings_backend_changed
import org.gtkkn.native.gio.g_settings_backend_changed_tree
import org.gtkkn.native.gio.g_settings_backend_get_default
import org.gtkkn.native.gio.g_settings_backend_get_type
import org.gtkkn.native.gio.g_settings_backend_keys_changed
import org.gtkkn.native.gio.g_settings_backend_path_changed
import org.gtkkn.native.gio.g_settings_backend_path_writable_changed
import org.gtkkn.native.gio.g_settings_backend_writable_changed
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.gobject.GType
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * The `GSettingsBackend` interface defines a generic interface for
 * non-strictly-typed data that is stored in a hierarchy. To implement
 * an alternative storage backend for [class@Gio.Settings], you need to
 * implement the `GSettingsBackend` interface and then make it implement the
 * extension point `G_SETTINGS_BACKEND_EXTENSION_POINT_NAME`.
 *
 * The interface defines methods for reading and writing values, a
 * method for determining if writing of certain values will fail
 * (lockdown) and a change notification mechanism.
 *
 * The semantics of the interface are very precisely defined and
 * implementations must carefully adhere to the expectations of
 * callers that are documented on each of the interface methods.
 *
 * Some of the `GSettingsBackend` functions accept or return a
 * [struct@GLib.Tree]. These trees always have strings as keys and
 * [struct@GLib.Variant] as values.
 *
 * The `GSettingsBackend` API is exported to allow third-party
 * implementations, but does not carry the same stability guarantees
 * as the public GIO API. For this reason, you have to define the
 * C preprocessor symbol `G_SETTINGS_ENABLE_BACKEND` before including
 * `gio/gsettingsbackend.h`.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `path`: path: Out parameter is not supported
 */
public abstract class SettingsBackend(public val gioSettingsBackendPointer: CPointer<GSettingsBackend>) :
    Object(gioSettingsBackendPointer.reinterpret()),
    KGTyped {
    /**
     * Signals that a single key has possibly changed.  Backend
     * implementations should call this if a key has possibly changed its
     * value.
     *
     * @key must be a valid key (ie starting with a slash, not containing
     * '//', and not ending with a slash).
     *
     * The implementation must call this function during any call to
     * g_settings_backend_write(), before the call returns (except in the
     * case that no keys are actually changed and it cares to detect this
     * fact).  It may not rely on the existence of a mainloop for
     * dispatching the signal later.
     *
     * The implementation may call this function at any other time it likes
     * in response to other events (such as changes occurring outside of the
     * program).  These calls may originate from a mainloop or may originate
     * in response to any other action (including from calls to
     * g_settings_backend_write()).
     *
     * In the case that this call is in response to a call to
     * g_settings_backend_write() then @origin_tag must be set to the same
     * value that was passed to that call.
     *
     * @param key the name of the key
     * @param originTag the origin tag
     * @since 2.26
     */
    @GioVersion2_26
    public open fun changed(key: String, originTag: gpointer? = null): Unit =
        g_settings_backend_changed(gioSettingsBackendPointer, key, originTag)

    /**
     * This call is a convenience wrapper.  It gets the list of changes from
     * @tree, computes the longest common prefix and calls
     * g_settings_backend_changed().
     *
     * @param tree a #GTree containing the changes
     * @param originTag the origin tag
     * @since 2.26
     */
    @GioVersion2_26
    public open fun changedTree(tree: Tree, originTag: gpointer? = null): Unit =
        g_settings_backend_changed_tree(gioSettingsBackendPointer, tree.glibTreePointer, originTag)

    /**
     * Signals that a list of keys have possibly changed.  Backend
     * implementations should call this if keys have possibly changed their
     * values.
     *
     * @path must be a valid path (ie starting and ending with a slash and
     * not containing '//').  Each string in @items must form a valid key
     * name when @path is prefixed to it (ie: each item must not start or
     * end with '/' and must not contain '//').
     *
     * The meaning of this signal is that any of the key names resulting
     * from the contatenation of @path with each item in @items may have
     * changed.
     *
     * The same rules for when notifications must occur apply as per
     * g_settings_backend_changed().  These two calls can be used
     * interchangeably if exactly one item has changed (although in that
     * case g_settings_backend_changed() is definitely preferred).
     *
     * For efficiency reasons, the implementation should strive for @path to
     * be as long as possible (ie: the longest common prefix of all of the
     * keys that were changed) but this is not strictly required.
     *
     * @param path the path containing the changes
     * @param items the null-terminated list of changed keys
     * @param originTag the origin tag
     * @since 2.26
     */
    @GioVersion2_26
    public open fun keysChanged(path: String, items: List<String>, originTag: gpointer? = null): Unit = memScoped {
        return g_settings_backend_keys_changed(gioSettingsBackendPointer, path, items.toCStringList(this), originTag)
    }

    /**
     * Signals that all keys below a given path may have possibly changed.
     * Backend implementations should call this if an entire path of keys
     * have possibly changed their values.
     *
     * @path must be a valid path (ie starting and ending with a slash and
     * not containing '//').
     *
     * The meaning of this signal is that any of the key which has a name
     * starting with @path may have changed.
     *
     * The same rules for when notifications must occur apply as per
     * g_settings_backend_changed().  This call might be an appropriate
     * reasponse to a 'reset' call but implementations are also free to
     * explicitly list the keys that were affected by that call if they can
     * easily do so.
     *
     * For efficiency reasons, the implementation should strive for @path to
     * be as long as possible (ie: the longest common prefix of all of the
     * keys that were changed) but this is not strictly required.  As an
     * example, if this function is called with the path of "/" then every
     * single key in the application will be notified of a possible change.
     *
     * @param path the path containing the changes
     * @param originTag the origin tag
     * @since 2.26
     */
    @GioVersion2_26
    public open fun pathChanged(path: String, originTag: gpointer? = null): Unit =
        g_settings_backend_path_changed(gioSettingsBackendPointer, path, originTag)

    /**
     * Signals that the writability of all keys below a given path may have
     * changed.
     *
     * Since GSettings performs no locking operations for itself, this call
     * will always be made in response to external events.
     *
     * @param path the name of the path
     * @since 2.26
     */
    @GioVersion2_26
    public open fun pathWritableChanged(path: String): Unit =
        g_settings_backend_path_writable_changed(gioSettingsBackendPointer, path)

    /**
     * Signals that the writability of a single key has possibly changed.
     *
     * Since GSettings performs no locking operations for itself, this call
     * will always be made in response to external events.
     *
     * @param key the name of the key
     * @since 2.26
     */
    @GioVersion2_26
    public open fun writableChanged(key: String): Unit =
        g_settings_backend_writable_changed(gioSettingsBackendPointer, key)

    /**
     * The SettingsBackendImpl type represents a native instance of the abstract SettingsBackend class.
     *
     * @constructor Creates a new instance of SettingsBackend for the provided [CPointer].
     */
    public class SettingsBackendImpl(pointer: CPointer<GSettingsBackend>) : SettingsBackend(pointer)

    public companion object : TypeCompanion<SettingsBackend> {
        override val type: GeneratedClassKGType<SettingsBackend> =
            GeneratedClassKGType(g_settings_backend_get_type()) { SettingsBackendImpl(it.reinterpret()) }

        init {
            GioTypeProvider.register()
        }

        /**
         * Returns the default #GSettingsBackend. It is possible to override
         * the default by setting the `GSETTINGS_BACKEND` environment variable
         * to the name of a settings backend.
         *
         * The user gets a reference to the backend.
         *
         * @return the default #GSettingsBackend,
         *     which will be a dummy (memory) settings backend if no other settings
         *     backend is available.
         * @since 2.28
         */
        @GioVersion2_28
        public fun getDefault(): SettingsBackend = g_settings_backend_get_default()!!.run {
            SettingsBackendImpl(this)
        }

        /**
         * Get the GType of SettingsBackend
         *
         * @return the GType
         */
        public fun getType(): GType = g_settings_backend_get_type()
    }
}

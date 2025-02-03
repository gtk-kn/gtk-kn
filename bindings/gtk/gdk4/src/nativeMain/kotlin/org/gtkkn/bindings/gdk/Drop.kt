// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.allocPointerTo
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gdk.Gdk.resolveException
import org.gtkkn.bindings.gio.AsyncReadyCallback
import org.gtkkn.bindings.gio.AsyncReadyCallbackFunc
import org.gtkkn.bindings.gio.AsyncResult
import org.gtkkn.bindings.gio.Cancellable
import org.gtkkn.bindings.glib.Error
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gobject.Value
import org.gtkkn.extensions.glib.ext.toCStringList
import org.gtkkn.extensions.gobject.InstanceCache
import org.gtkkn.extensions.gobject.legacy.GeneratedClassKGType
import org.gtkkn.extensions.gobject.legacy.KGTyped
import org.gtkkn.extensions.gobject.legacy.TypeCompanion
import org.gtkkn.native.gdk.GdkDrop
import org.gtkkn.native.gdk.gdk_drop_finish
import org.gtkkn.native.gdk.gdk_drop_get_actions
import org.gtkkn.native.gdk.gdk_drop_get_device
import org.gtkkn.native.gdk.gdk_drop_get_display
import org.gtkkn.native.gdk.gdk_drop_get_drag
import org.gtkkn.native.gdk.gdk_drop_get_formats
import org.gtkkn.native.gdk.gdk_drop_get_surface
import org.gtkkn.native.gdk.gdk_drop_get_type
import org.gtkkn.native.gdk.gdk_drop_read_async
import org.gtkkn.native.gdk.gdk_drop_read_value_async
import org.gtkkn.native.gdk.gdk_drop_read_value_finish
import org.gtkkn.native.gdk.gdk_drop_status
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import kotlin.Result
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * The `GdkDrop` object represents the target of an ongoing DND operation.
 *
 * Possible drop sites get informed about the status of the ongoing drag
 * operation with events of type %GDK_DRAG_ENTER, %GDK_DRAG_LEAVE,
 * %GDK_DRAG_MOTION and %GDK_DROP_START. The `GdkDrop` object can be obtained
 * from these [class@Gdk.Event] types using [method@Gdk.DNDEvent.get_drop].
 *
 * The actual data transfer is initiated from the target side via an async
 * read, using one of the `GdkDrop` methods for this purpose:
 * [method@Gdk.Drop.read_async] or [method@Gdk.Drop.read_value_async].
 *
 * GTK provides a higher level abstraction based on top of these functions,
 * and so they are not normally needed in GTK applications. See the
 * "Drag and Drop" section of the GTK documentation for more information.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `out_mime_type`: out_mime_type: Out parameter is not supported
 */
public abstract class Drop(public val gdkDropPointer: CPointer<GdkDrop>) :
    Object(gdkDropPointer.reinterpret()),
    KGTyped {
    init {
        Gdk
    }

    /**
     * The possible actions for this drop
     */
    public open val actions: DragAction
        /**
         * Returns the possible actions for this `GdkDrop`.
         *
         * If this value contains multiple actions - i.e.
         * [func@Gdk.DragAction.is_unique] returns false for the result -
         * [method@Gdk.Drop.finish] must choose the action to use when
         * accepting the drop. This will only happen if you passed
         * %GDK_ACTION_ASK as one of the possible actions in
         * [method@Gdk.Drop.status]. %GDK_ACTION_ASK itself will not
         * be included in the actions returned by this function.
         *
         * This value may change over the lifetime of the [class@Gdk.Drop]
         * both as a response to source side actions as well as to calls to
         * [method@Gdk.Drop.status] or [method@Gdk.Drop.finish]. The source
         * side will not change this value anymore once a drop has started.
         *
         * @return The possible `GdkDragActions`
         */
        get() = gdk_drop_get_actions(gdkDropPointer).run {
            DragAction(this)
        }

    /**
     * The `GdkDevice` performing the drop
     */
    public open val device: Device
        /**
         * Returns the `GdkDevice` performing the drop.
         *
         * @return The `GdkDevice` performing the drop.
         */
        get() = gdk_drop_get_device(gdkDropPointer)!!.run {
            InstanceCache.get(this, true) { Device.DeviceImpl(reinterpret()) }!!
        }

    /**
     * The `GdkDisplay` that the drop belongs to.
     */
    public open val display: Display
        /**
         * Gets the `GdkDisplay` that @self was created for.
         *
         * @return a `GdkDisplay`
         */
        get() = gdk_drop_get_display(gdkDropPointer)!!.run {
            InstanceCache.get(this, true) { Display(reinterpret()) }!!
        }

    /**
     * The `GdkDrag` that initiated this drop
     */
    public open val drag: Drag?
        /**
         * If this is an in-app drag-and-drop operation, returns the `GdkDrag`
         * that corresponds to this drop.
         *
         * If it is not, null is returned.
         *
         * @return the corresponding `GdkDrag`
         */
        get() = gdk_drop_get_drag(gdkDropPointer)?.run {
            InstanceCache.get(this, true) { Drag.DragImpl(reinterpret()) }!!
        }

    /**
     * The possible formats that the drop can provide its data in.
     */
    public open val formats: ContentFormats
        /**
         * Returns the `GdkContentFormats` that the drop offers the data
         * to be read in.
         *
         * @return The possible `GdkContentFormats`
         */
        get() = gdk_drop_get_formats(gdkDropPointer)!!.run {
            ContentFormats(this)
        }

    /**
     * The `GdkSurface` the drop happens on
     */
    public open val surface: Surface
        /**
         * Returns the `GdkSurface` performing the drop.
         *
         * @return The `GdkSurface` performing the drop.
         */
        get() = gdk_drop_get_surface(gdkDropPointer)!!.run {
            InstanceCache.get(this, true) { Surface.SurfaceImpl(reinterpret()) }!!
        }

    /**
     * Ends the drag operation after a drop.
     *
     * The @action must be a single action selected from the actions
     * available via [method@Gdk.Drop.get_actions].
     *
     * @param action the action performed by the destination or 0 if the drop failed
     */
    public open fun finish(action: DragAction): Unit = gdk_drop_finish(gdkDropPointer, action.mask)

    /**
     * Asynchronously read the dropped data from a `GdkDrop`
     * in a format that complies with one of the mime types.
     *
     * @param mimeTypes pointer to an array of mime types
     * @param ioPriority the I/O priority for the read operation
     * @param cancellable optional `GCancellable` object
     * @param callback a `GAsyncReadyCallback` to call when
     *   the request is satisfied
     */
    public open fun readAsync(
        mimeTypes: List<String>,
        ioPriority: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = memScoped {
        return gdk_drop_read_async(
            gdkDropPointer,
            mimeTypes.toCStringList(this),
            ioPriority,
            cancellable?.gioCancellablePointer,
            callback?.let {
                AsyncReadyCallbackFunc.reinterpret()
            },
            callback?.let { StableRef.create(callback).asCPointer() }
        )
    }

    /**
     * Asynchronously request the drag operation's contents converted
     * to the given @type.
     *
     * When the operation is finished @callback will be called. You must
     * then call [method@Gdk.Drop.read_value_finish] to get the resulting
     * `GValue`.
     *
     * For local drag-and-drop operations that are available in the given
     * `GType`, the value will be copied directly. Otherwise, GDK will
     * try to use [func@Gdk.content_deserialize_async] to convert the data.
     *
     * @param type a `GType` to read
     * @param ioPriority the I/O priority of the request.
     * @param cancellable optional `GCancellable` object, null to ignore.
     * @param callback callback to call when the request is satisfied
     */
    public open fun readValueAsync(
        type: GType,
        ioPriority: gint,
        cancellable: Cancellable? = null,
        callback: AsyncReadyCallback?,
    ): Unit = gdk_drop_read_value_async(
        gdkDropPointer,
        type,
        ioPriority,
        cancellable?.gioCancellablePointer,
        callback?.let {
            AsyncReadyCallbackFunc.reinterpret()
        },
        callback?.let { StableRef.create(callback).asCPointer() }
    )

    /**
     * Finishes an async drop read.
     *
     * See [method@Gdk.Drop.read_value_async].
     *
     * @param result a `GAsyncResult`
     * @return a `GValue` containing the result.
     */
    public open fun readValueFinish(result: AsyncResult): Result<Value> = memScoped {
        val gError = allocPointerTo<GError>()
        val gResult = gdk_drop_read_value_finish(gdkDropPointer, result.gioAsyncResultPointer, gError.ptr)?.run {
            Value(this)
        }

        return if (gError.pointed != null) {
            Result.failure(resolveException(Error(gError.pointed!!.ptr)))
        } else {
            Result.success(checkNotNull(gResult))
        }
    }

    /**
     * Selects all actions that are potentially supported by the destination.
     *
     * When calling this function, do not restrict the passed in actions to
     * the ones provided by [method@Gdk.Drop.get_actions]. Those actions may
     * change in the future, even depending on the actions you provide here.
     *
     * The @preferred action is a hint to the drag-and-drop mechanism about which
     * action to use when multiple actions are possible.
     *
     * This function should be called by drag destinations in response to
     * %GDK_DRAG_ENTER or %GDK_DRAG_MOTION events. If the destination does
     * not yet know the exact actions it supports, it should set any possible
     * actions first and then later call this function again.
     *
     * @param actions Supported actions of the destination, or 0 to indicate
     *    that a drop will not be accepted
     * @param preferred A unique action that's a member of @actions indicating the
     *    preferred action
     */
    public open fun status(actions: DragAction, preferred: DragAction): Unit =
        gdk_drop_status(gdkDropPointer, actions.mask, preferred.mask)

    /**
     * The DropImpl type represents a native instance of the abstract Drop class.
     *
     * @constructor Creates a new instance of Drop for the provided [CPointer].
     */
    public class DropImpl(pointer: CPointer<GdkDrop>) : Drop(pointer)

    public companion object : TypeCompanion<Drop> {
        override val type: GeneratedClassKGType<Drop> =
            GeneratedClassKGType(getTypeOrNull()!!) { DropImpl(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }

        /**
         * Get the GType of Drop
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_drop_get_type()

        /**
         * Gets the GType of from the symbol `gdk_drop_get_type` if it exists.
         *
         * This function dynamically resolves the specified symbol as a C function pointer and invokes it
         * to retrieve the `GType`.
         *
         * @return the GType, or `null` if the symbol cannot be resolved.
         */
        internal fun getTypeOrNull(): GType? = org.gtkkn.extensions.glib.cinterop.getTypeOrNull("gdk_drop_get_type")
    }
}

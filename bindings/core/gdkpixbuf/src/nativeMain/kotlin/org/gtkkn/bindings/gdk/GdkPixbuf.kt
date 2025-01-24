// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.CArrayPointer
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.CPointerVarOf
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.glib.Error
import org.gtkkn.extensions.glib.GLibException
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.glib.ext.toKStringList
import org.gtkkn.native.gdk.GdkPixbuf
import org.gtkkn.native.gdk.GdkPixbufAnimation
import org.gtkkn.native.gdk.GdkPixbufFormat
import org.gtkkn.native.gdk.GdkPixbufModule
import org.gtkkn.native.glib.gboolean
import org.gtkkn.native.glib.gint
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.glib.gsize
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * ## Skipped during bindings generation
 *
 * - callback `PixbufModuleBeginLoadFunc`: Callbacks that throw are not supported
 * - callback `PixbufModuleIncrementLoadFunc`: Callbacks that throw are not supported
 * - callback `PixbufModuleLoadAnimationFunc`: Callbacks that throw are not supported
 * - callback `PixbufModuleLoadFunc`: Callbacks that throw are not supported
 * - callback `PixbufModuleSaveCallbackFunc`: Callbacks that throw are not supported
 * - callback `PixbufModuleSaveFunc`: Callbacks that throw are not supported
 * - callback `PixbufModuleStopLoadFunc`: Callbacks that throw are not supported
 * - record `PixbufAnimationClass`: glib type struct are ignored
 * - record `PixbufAnimationIterClass`: glib type struct are ignored
 * - record `PixbufLoaderClass`: glib type struct are ignored
 * - record `PixbufSimpleAnimClass`: glib type struct are ignored
 */
public object GdkPixbuf {
    /**
     * Major version of gdk-pixbuf library, that is the "0" in
     * "0.8.2" for example.
     */
    public const val PIXBUF_MAJOR: gint = 2

    /**
     * Micro version of gdk-pixbuf library, that is the "2" in
     * "0.8.2" for example.
     */
    public const val PIXBUF_MICRO: gint = 10

    /**
     * Minor version of gdk-pixbuf library, that is the "8" in
     * "0.8.2" for example.
     */
    public const val PIXBUF_MINOR: gint = 42

    /**
     * Contains the full version of GdkPixbuf as a string.
     *
     * This is the version being compiled against; contrast with
     * `gdk_pixbuf_version`.
     */
    public const val PIXBUF_VERSION: String = "2.42.10"

    public fun resolveException(error: Error): GLibException {
        val ex = when (error.domain) {
            PixbufError.quark() -> PixbufError.fromErrorOrNull(error)
                ?.let {
                    PixbufErrorException(error, it)
                }
            else -> null
        }
        return ex ?: GLibException(error)
    }
}

public val PixbufDestroyNotifyFunc: CPointer<CFunction<() -> Unit>> = staticCFunction { `data`: gpointer? ->
    data!!.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

public val PixbufModuleFillInfoFuncFunc: CPointer<CFunction<(CPointer<GdkPixbufFormat>) -> Unit>> =
    staticCFunction {
            info: CPointer<GdkPixbufFormat>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(info: PixbufFormat) -> Unit>().get().invoke(
            info!!.run {
                PixbufFormat(this)
            }
        )
    }
        .reinterpret()

public val PixbufModuleFillVtableFuncFunc: CPointer<CFunction<(CPointer<GdkPixbufModule>) -> Unit>> =
    staticCFunction {
            module: CPointer<GdkPixbufModule>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(module: PixbufModule) -> Unit>().get().invoke(
            module!!.run {
                PixbufModule(this)
            }
        )
    }
        .reinterpret()

public val PixbufModuleLoadXpmDataFuncFunc:
    CPointer<CFunction<(CArrayPointer<CPointerVarOf<CPointer<ByteVar>>>) -> CPointer<GdkPixbuf>>> =
    staticCFunction {
            `data`: CArrayPointer<CPointerVarOf<CPointer<ByteVar>>>?,
            userData: COpaquePointer,
        ->
        memScoped {
            userData.asStableRef<(`data`: List<String>) -> Pixbuf>().get().invoke(
                `data`?.toKStringList() ?: error("Expected not null string array")
            ).gdkPixbufPointer
        }
    }
        .reinterpret()

public val PixbufModulePreparedFuncFunc:
    CPointer<CFunction<(CPointer<GdkPixbuf>, CPointer<GdkPixbufAnimation>) -> Unit>> =
    staticCFunction {
            pixbuf: CPointer<GdkPixbuf>?,
            anim: CPointer<GdkPixbufAnimation>?,
            userData: gpointer?,
        ->
        userData!!.asStableRef<(pixbuf: Pixbuf, anim: PixbufAnimation) -> Unit>().get().invoke(
            pixbuf!!.run {
                Pixbuf(this)
            },
            anim!!.run {
                PixbufAnimation(this)
            }
        )
    }
        .reinterpret()

public val PixbufModuleSaveOptionSupportedFuncFunc:
    CPointer<CFunction<(CPointer<ByteVar>) -> gboolean>> = staticCFunction {
            optionKey: CPointer<ByteVar>?,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(optionKey: String) -> Boolean>().get().invoke(
            optionKey?.toKString() ?: error("Expected not null string")
        ).asGBoolean()
    }
        .reinterpret()

public val PixbufModuleSizeFuncFunc: CPointer<CFunction<() -> Unit>> = staticCFunction { userData: gpointer? ->
    userData!!.asStableRef<() -> Unit>().get().invoke()
}
    .reinterpret()

public val PixbufModuleUpdatedFuncFunc: CPointer<
    CFunction<
        (
            CPointer<GdkPixbuf>,
            gint,
            gint,
            gint,
            gint,
        ) -> Unit
        >
    > = staticCFunction {
        pixbuf: CPointer<GdkPixbuf>?,
        x: gint,
        y: gint,
        width: gint,
        height: gint,
        userData: gpointer?,
    ->
    userData!!.asStableRef<
        (
            pixbuf: Pixbuf,
            x: gint,
            y: gint,
            width: gint,
            height: gint,
        ) -> Unit
        >().get().invoke(
        pixbuf!!.run {
            Pixbuf(this)
        },
        x,
        y,
        width,
        height
    )
}
    .reinterpret()

public val PixbufSaveFuncFunc: CPointer<CFunction<(gsize) -> gboolean>> = staticCFunction {
        count: gsize,
        `data`: gpointer?,
    ->
    data!!.asStableRef<(count: gsize) -> Boolean>().get().invoke(count).asGBoolean()
}
    .reinterpret()

/**
 * A function of this type is responsible for freeing the pixel array
 * of a pixbuf.
 *
 * The gdk_pixbuf_new_from_data() function lets you pass in a pre-allocated
 * pixel array so that a pixbuf can be created from it; in this case you
 * will need to pass in a function of type `GdkPixbufDestroyNotify` so that
 * the pixel data can be freed when the pixbuf is finalized.
 */
public typealias PixbufDestroyNotify = () -> Unit

/**
 * Defines the type of the function used to fill a
 * #GdkPixbufFormat structure with information about a module.
 *
 * - param `info` a #GdkPixbufFormat.
 */
public typealias PixbufModuleFillInfoFunc = (info: PixbufFormat) -> Unit

/**
 * Defines the type of the function used to set the vtable of a
 * #GdkPixbufModule when it is loaded.
 *
 * - param `module` a #GdkPixbufModule.
 */
public typealias PixbufModuleFillVtableFunc = (module: PixbufModule) -> Unit

/**
 * Loads XPM data into a new `GdkPixbuf`.
 *
 * - param `data` the XPM data
 * - return a newly created `GdkPixbuf` for the XPM data
 */
public typealias PixbufModuleLoadXpmDataFunc = (`data`: List<String>) -> Pixbuf

/**
 * Defines the type of the function that gets called once the initial
 * setup of @pixbuf is done.
 *
 * #GdkPixbufLoader uses a function of this type to emit the
 * "<link linkend="GdkPixbufLoader-area-prepared">area_prepared</link>"
 * signal.
 *
 * - param `pixbuf` the #GdkPixbuf that is currently being loaded.
 * - param `anim` if an animation is being loaded, the #GdkPixbufAnimation, else null.
 */
public typealias PixbufModulePreparedFunc = (pixbuf: Pixbuf, anim: PixbufAnimation) -> Unit

/**
 * Checks whether the given `option_key` is supported when saving.
 *
 * - param `optionKey` the option key to check
 * - return `TRUE` if the option is supported
 */
public typealias PixbufModuleSaveOptionSupportedFunc = (optionKey: String) -> Boolean

/**
 * Defines the type of the function that gets called once the size
 * of the loaded image is known.
 *
 * The function is expected to set @width and @height to the desired
 * size to which the image should be scaled. If a module has no efficient
 * way to achieve the desired scaling during the loading of the image, it may
 * either ignore the size request, or only approximate it - gdk-pixbuf will
 * then perform the required scaling on the completely loaded image.
 *
 * If the function sets @width or @height to zero, the module should interpret
 * this as a hint that it will be closed soon and shouldn't allocate further
 * resources. This convention is used to implement gdk_pixbuf_get_file_info()
 * efficiently.
 */
public typealias PixbufModuleSizeFunc = () -> Unit

/**
 * Defines the type of the function that gets called every time a region
 * of @pixbuf is updated.
 *
 * #GdkPixbufLoader uses a function of this type to emit the
 * "<link linkend="GdkPixbufLoader-area-updated">area_updated</link>"
 * signal.
 *
 * - param `pixbuf` the #GdkPixbuf that is currently being loaded.
 * - param `x` the X origin of the updated area.
 * - param `y` the Y origin of the updated area.
 * - param `width` the width of the updated area.
 * - param `height` the height of the updated area.
 */
public typealias PixbufModuleUpdatedFunc = (
    pixbuf: Pixbuf,
    x: gint,
    y: gint,
    width: gint,
    height: gint,
) -> Unit

/**
 * Save functions used by [method@GdkPixbuf.Pixbuf.save_to_callback].
 *
 * This function is called once for each block of bytes that is "written"
 * by `gdk_pixbuf_save_to_callback()`.
 *
 * If successful it should return `TRUE`; if an error occurs it should set
 * `error` and return `FALSE`, in which case `gdk_pixbuf_save_to_callback()`
 * will fail with the same error.
 *
 * - param `count` number of bytes in @buf.
 * - return `TRUE` if successful, `FALSE` otherwise
 */
public typealias PixbufSaveFunc = (count: gsize) -> Boolean

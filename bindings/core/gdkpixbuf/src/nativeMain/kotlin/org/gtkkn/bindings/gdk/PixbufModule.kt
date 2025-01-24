// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gmodule.Module
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.gdk.GdkPixbufModule
import org.gtkkn.native.glib.g_free
import org.gtkkn.native.glib.g_strdup
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * A `GdkPixbufModule` contains the necessary functions to load and save
 * images in a certain file format.
 *
 * If `GdkPixbuf` has been compiled with `GModule` support, it can be extended
 * by modules which can load (and perhaps also save) new image and animation
 * formats.
 *
 * ## Implementing modules
 *
 * The `GdkPixbuf` interfaces needed for implementing modules are contained in
 * `gdk-pixbuf-io.h` (and `gdk-pixbuf-animation.h` if the module supports
 * animations). They are not covered by the same stability guarantees as the
 * regular GdkPixbuf API. To underline this fact, they are protected by the
 * `GDK_PIXBUF_ENABLE_BACKEND` pre-processor symbol.
 *
 * Each loadable module must contain a `GdkPixbufModuleFillVtableFunc` function
 * named `fill_vtable`, which will get called when the module
 * is loaded and must set the function pointers of the `GdkPixbufModule`.
 *
 * In order to make format-checking work before actually loading the modules
 * (which may require calling `dlopen` to load image libraries), modules export
 * their signatures (and other information) via the `fill_info` function. An
 * external utility, `gdk-pixbuf-query-loaders`, uses this to create a text
 * file containing a list of all available loaders and  their signatures.
 * This file is then read at runtime by `GdkPixbuf` to obtain the list of
 * available loaders and their signatures.
 *
 * Modules may only implement a subset of the functionality available via
 * `GdkPixbufModule`. If a particular functionality is not implemented, the
 * `fill_vtable` function will simply not set the corresponding
 * function pointers of the `GdkPixbufModule` structure. If a module supports
 * incremental loading (i.e. provides `begin_load`, `stop_load` and
 * `load_increment`), it doesn't have to implement `load`, since `GdkPixbuf`
 * can supply a generic `load` implementation wrapping the incremental loading.
 *
 * ## Installing modules
 *
 * Installing a module is a two-step process:
 *
 *  - copy the module file(s) to the loader directory (normally
 *    `$libdir/gdk-pixbuf-2.0/$version/loaders`, unless overridden by the
 *    environment variable `GDK_PIXBUF_MODULEDIR`)
 *  - call `gdk-pixbuf-query-loaders` to update the module file (normally
 *    `$libdir/gdk-pixbuf-2.0/$version/loaders.cache`, unless overridden
 *    by the environment variable `GDK_PIXBUF_MODULE_FILE`)
 *
 * ## Skipped during bindings generation
 *
 * - field `load`: PixbufModuleLoadFunc
 * - field `load_xpm_data`: PixbufModuleLoadXpmDataFunc
 * - field `begin_load`: PixbufModuleBeginLoadFunc
 * - field `stop_load`: PixbufModuleStopLoadFunc
 * - field `load_increment`: PixbufModuleIncrementLoadFunc
 * - field `load_animation`: PixbufModuleLoadAnimationFunc
 * - field `save`: PixbufModuleSaveFunc
 * - field `save_to_callback`: PixbufModuleSaveCallbackFunc
 * - field `is_save_option_supported`: PixbufModuleSaveOptionSupportedFunc
 * - field `_reserved1`: Fields with callbacks are not supported
 * - field `_reserved2`: Fields with callbacks are not supported
 * - field `_reserved3`: Fields with callbacks are not supported
 * - field `_reserved4`: Fields with callbacks are not supported
 */
public class PixbufModule(public val gdkPixbufModulePointer: CPointer<GdkPixbufModule>, cleaner: Cleaner? = null) :
    ProxyInstance(gdkPixbufModulePointer) {
    /**
     * the name of the module, usually the same as the
     *  usual file extension for images of this type, eg. "xpm", "jpeg" or "png".
     */
    public var moduleName: String?
        get() = gdkPixbufModulePointer.pointed.module_name?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gdkPixbufModulePointer.pointed.module_name?.let { g_free(it) }
            gdkPixbufModulePointer.pointed.module_name = value?.let { g_strdup(it) }
        }

    /**
     * the path from which the module is loaded.
     */
    public var modulePath: String?
        get() = gdkPixbufModulePointer.pointed.module_path?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gdkPixbufModulePointer.pointed.module_path?.let { g_free(it) }
            gdkPixbufModulePointer.pointed.module_path = value?.let { g_strdup(it) }
        }

    /**
     * the loaded `GModule`.
     */
    public var module: Module?
        get() = gdkPixbufModulePointer.pointed.module?.run {
            Module(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            gdkPixbufModulePointer.pointed.module = value?.gmoduleModulePointer
        }

    /**
     * a `GdkPixbufFormat` holding information about the module.
     */
    public var info: PixbufFormat?
        get() = gdkPixbufModulePointer.pointed.info?.run {
            PixbufFormat(this)
        }

        @UnsafeFieldSetter
        set(`value`) {
            gdkPixbufModulePointer.pointed.info = value?.gdkPixbufFormatPointer
        }

    /**
     * Allocate a new PixbufModule.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GdkPixbufModule>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to PixbufModule and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GdkPixbufModule>, Cleaner>,
    ) : this(gdkPixbufModulePointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new PixbufModule using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GdkPixbufModule>().ptr)

    /**
     * Allocate a new PixbufModule.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param moduleName the name of the module, usually the same as the
     *  usual file extension for images of this type, eg. "xpm", "jpeg" or "png".
     * @param modulePath the path from which the module is loaded.
     * @param module the loaded `GModule`.
     * @param info a `GdkPixbufFormat` holding information about the module.
     */
    public constructor(
        moduleName: String?,
        modulePath: String?,
        module: Module?,
        info: PixbufFormat?,
    ) : this() {
        this.moduleName = moduleName
        this.modulePath = modulePath
        this.module = module
        this.info = info
    }

    /**
     * Allocate a new PixbufModule using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param moduleName the name of the module, usually the same as the
     *  usual file extension for images of this type, eg. "xpm", "jpeg" or "png".
     * @param modulePath the path from which the module is loaded.
     * @param module the loaded `GModule`.
     * @param info a `GdkPixbufFormat` holding information about the module.
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        moduleName: String?,
        modulePath: String?,
        module: Module?,
        info: PixbufFormat?,
        scope: AutofreeScope,
    ) : this(scope) {
        this.moduleName = moduleName
        this.modulePath = modulePath
        this.module = module
        this.info = info
    }

    override fun toString(): String =
        "PixbufModule(moduleName=$moduleName, modulePath=$modulePath, module=$module, info=$info)"
}

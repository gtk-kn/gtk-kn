// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdkpixbuf

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gdkpixbuf.GdkPixbufModule

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
 * - field `module_name`: Unsupported string type with cType: char*
 * - field `module_path`: Unsupported string type with cType: char*
 * - field `module`: GModule.Module
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
public class PixbufModule(
    pointer: CPointer<GdkPixbufModule>,
) : Record {
    public val gdkpixbufPixbufModulePointer: CPointer<GdkPixbufModule> = pointer

    /**
     * a `GdkPixbufFormat` holding information about the module.
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val info: PixbufFormat?
        get() =
            gdkpixbufPixbufModulePointer.pointed.info?.run {
                PixbufFormat(reinterpret())
            }

    public companion object : RecordCompanion<PixbufModule, GdkPixbufModule> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): PixbufModule =
            PixbufModule(pointer.reinterpret())
    }
}

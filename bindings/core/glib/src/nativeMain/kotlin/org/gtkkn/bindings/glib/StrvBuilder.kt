// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.glib.annotations.GLibVersion2_68
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.glib.GStrvBuilder

/**
 * `GStrvBuilder` is a helper object to build a null-terminated string arrays.
 *
 * The following example shows how to build a two element array:
 *
 * ```c
 *   g_autoptr(GStrvBuilder) builder = g_strv_builder_new ();
 *   g_strv_builder_add (builder, "hello");
 *   g_strv_builder_add (builder, "world");
 *   g_auto(GStrv) array = g_strv_builder_end (builder);
 * ```
 *
 * ## Skipped during bindings generation
 *
 * - method `add`: C function g_strv_builder_add is ignored
 * - method `addv`: C function g_strv_builder_addv is ignored
 * - method `end`: C function g_strv_builder_end is ignored
 * - method `ref`: C function g_strv_builder_ref is ignored
 * - method `take`: C function g_strv_builder_take is ignored
 * - method `unref`: C function g_strv_builder_unref is ignored
 * - constructor `new`: C function g_strv_builder_new is ignored
 *
 * @since 2.68
 */
@GLibVersion2_68
public class StrvBuilder(
    pointer: CPointer<GStrvBuilder>,
) : Record {
    public val glibStrvBuilderPointer: CPointer<GStrvBuilder> = pointer

    public companion object : RecordCompanion<StrvBuilder, GStrvBuilder> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): StrvBuilder =
            StrvBuilder(pointer.reinterpret())
    }
}

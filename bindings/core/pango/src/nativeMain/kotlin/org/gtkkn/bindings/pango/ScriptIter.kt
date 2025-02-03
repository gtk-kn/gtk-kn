// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.pango

import kotlinx.cinterop.CPointer
import org.gtkkn.bindings.pango.annotations.PangoVersion1_4
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.pango.PangoScriptIter
import org.gtkkn.native.pango.pango_script_iter_free
import org.gtkkn.native.pango.pango_script_iter_get_type
import org.gtkkn.native.pango.pango_script_iter_new
import org.gtkkn.native.pango.pango_script_iter_next
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * A `PangoScriptIter` is used to iterate through a string
 * and identify ranges in different scripts.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `start`: start: Out parameter is not supported
 */
public class ScriptIter(public val pangoScriptIterPointer: CPointer<PangoScriptIter>) :
    ProxyInstance(pangoScriptIterPointer) {
    /**
     * Create a new `PangoScriptIter`, used to break a string of
     * Unicode text into runs by Unicode script.
     *
     * No copy is made of @text, so the caller needs to make
     * sure it remains valid until the iterator is freed with
     * [method@Pango.ScriptIter.free].
     *
     * @param text a UTF-8 string
     * @param length length of @text, or -1 if @text is nul-terminated
     * @return the new script iterator, initialized
     *  to point at the first range in the text, which should be
     *  freed with [method@Pango.ScriptIter.free]. If the string is
     *  empty, it will point at an empty range.
     * @since 1.4
     */
    public constructor(text: String, length: gint) : this(pango_script_iter_new(text, length)!!) {
        MemoryCleaner.setBoxedType(this, getType(), owned = true)
    }

    /**
     * Frees a `PangoScriptIter`.
     *
     * @since 1.4
     */
    @PangoVersion1_4
    public fun free(): Unit = pango_script_iter_free(pangoScriptIterPointer)

    /**
     * Advances a `PangoScriptIter` to the next range.
     *
     * If @iter is already at the end, it is left unchanged
     * and false is returned.
     *
     * @return true if @iter was successfully advanced
     * @since 1.4
     */
    @PangoVersion1_4
    public fun next(): Boolean = pango_script_iter_next(pangoScriptIterPointer).asBoolean()

    public companion object {
        /**
         * Get the GType of ScriptIter
         *
         * @return the GType
         */
        public fun getType(): GType = pango_script_iter_get_type()
    }
}

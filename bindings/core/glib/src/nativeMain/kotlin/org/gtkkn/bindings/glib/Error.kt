// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.MemoryCleaner
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.extensions.glib.ext.asBoolean
import org.gtkkn.native.glib.GError
import org.gtkkn.native.glib.g_error_copy
import org.gtkkn.native.glib.g_error_free
import org.gtkkn.native.glib.g_error_matches
import org.gtkkn.native.glib.g_error_new_literal
import org.gtkkn.native.glib.g_free
import org.gtkkn.native.glib.g_strdup
import org.gtkkn.native.glib.gint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.g_error_get_type
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * The `GError` structure contains information about
 * an error that has occurred.
 *
 * ## Skipped during bindings generation
 *
 * - constructor `new`: Varargs parameter is not supported
 * - parameter `args`: va_list type is not supported
 * - parameter `error_type_init`: ErrorInitFunc
 * - parameter `error_type_init`: ErrorInitFunc
 */
public class Error(public val glibErrorPointer: CPointer<GError>) : ProxyInstance(glibErrorPointer) {
    /**
     * error domain, e.g. %G_FILE_ERROR
     */
    public var domain: Quark
        get() = glibErrorPointer.pointed.domain

        @UnsafeFieldSetter
        set(`value`) {
            glibErrorPointer.pointed.domain = value
        }

    /**
     * error code, e.g. %G_FILE_ERROR_NOENT
     */
    public var code: gint
        get() = glibErrorPointer.pointed.code

        @UnsafeFieldSetter
        set(`value`) {
            glibErrorPointer.pointed.code = value
        }

    /**
     * human-readable informative error message
     */
    public var message: String?
        get() = glibErrorPointer.pointed.message?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            glibErrorPointer.pointed.message?.let { g_free(it) }
            glibErrorPointer.pointed.message = value?.let { g_strdup(it) }
        }

    /**
     * Creates a new #GError; unlike g_error_new(), @message is
     * not a printf()-style format string. Use this function if
     * @message contains text you don't have control over,
     * that could include printf() escape sequences.
     *
     * @param domain error domain
     * @param code error code
     * @param message error message
     * @return a new #GError
     */
    public constructor(
        domain: Quark,
        code: gint,
        message: String,
    ) : this(g_error_new_literal(domain, code, message)!!) {
        MemoryCleaner.setBoxedType(this, getType(), owned = true)
    }

    /**
     * Allocate a new Error.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(nativeHeap.alloc<GError>().ptr) {
        MemoryCleaner.setNativeHeap(this, owned = true)
    }

    /**
     * Allocate a new Error using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GError>().ptr)

    /**
     * Allocate a new Error.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param domain error domain, e.g. %G_FILE_ERROR
     * @param code error code, e.g. %G_FILE_ERROR_NOENT
     * @param message human-readable informative error message
     */
    public constructor(
        domain: Quark,
        code: gint,
        message: String?,
    ) : this() {
        this.domain = domain
        this.code = code
        this.message = message
    }

    /**
     * Allocate a new Error using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param domain error domain, e.g. %G_FILE_ERROR
     * @param code error code, e.g. %G_FILE_ERROR_NOENT
     * @param message human-readable informative error message
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        domain: Quark,
        code: gint,
        message: String?,
        scope: AutofreeScope,
    ) : this(scope) {
        this.domain = domain
        this.code = code
        this.message = message
    }

    /**
     * Makes a copy of @error.
     *
     * @return a new #GError
     */
    public fun copy(): Error = g_error_copy(glibErrorPointer)!!.run {
        Error(this)
    }

    /**
     * Frees a #GError and associated resources.
     */
    public fun free(): Unit = g_error_free(glibErrorPointer)

    /**
     * Returns true if @error matches @domain and @code, false
     * otherwise. In particular, when @error is null, false will
     * be returned.
     *
     * If @domain contains a `FAILED` (or otherwise generic) error code,
     * you should generally not check for it explicitly, but should
     * instead treat any not-explicitly-recognized error code as being
     * equivalent to the `FAILED` code. This way, if the domain is
     * extended in the future to provide a more specific error code for
     * a certain case, your code will still work.
     *
     * @param domain an error domain
     * @param code an error code
     * @return whether @error has @domain and @code
     */
    public fun matches(domain: Quark, code: gint): Boolean = g_error_matches(glibErrorPointer, domain, code).asBoolean()

    override fun toString(): String = "Error(domain=$domain, code=$code, message=$message)"

    public companion object {
        /**
         * Get the GType of Error
         *
         * @return the GType
         */
        public fun getType(): GType = g_error_get_type()
    }
}

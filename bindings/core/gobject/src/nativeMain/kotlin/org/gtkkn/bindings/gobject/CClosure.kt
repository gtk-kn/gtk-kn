// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.annotations.GObjectVersion2_30
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GCClosure
import org.gtkkn.native.gobject.g_cclosure_marshal_BOOLEAN__BOXED_BOXED
import org.gtkkn.native.gobject.g_cclosure_marshal_BOOLEAN__FLAGS
import org.gtkkn.native.gobject.g_cclosure_marshal_STRING__OBJECT_POINTER
import org.gtkkn.native.gobject.g_cclosure_marshal_VOID__BOOLEAN
import org.gtkkn.native.gobject.g_cclosure_marshal_VOID__BOXED
import org.gtkkn.native.gobject.g_cclosure_marshal_VOID__CHAR
import org.gtkkn.native.gobject.g_cclosure_marshal_VOID__DOUBLE
import org.gtkkn.native.gobject.g_cclosure_marshal_VOID__ENUM
import org.gtkkn.native.gobject.g_cclosure_marshal_VOID__FLAGS
import org.gtkkn.native.gobject.g_cclosure_marshal_VOID__FLOAT
import org.gtkkn.native.gobject.g_cclosure_marshal_VOID__INT
import org.gtkkn.native.gobject.g_cclosure_marshal_VOID__LONG
import org.gtkkn.native.gobject.g_cclosure_marshal_VOID__OBJECT
import org.gtkkn.native.gobject.g_cclosure_marshal_VOID__PARAM
import org.gtkkn.native.gobject.g_cclosure_marshal_VOID__POINTER
import org.gtkkn.native.gobject.g_cclosure_marshal_VOID__STRING
import org.gtkkn.native.gobject.g_cclosure_marshal_VOID__UCHAR
import org.gtkkn.native.gobject.g_cclosure_marshal_VOID__UINT
import org.gtkkn.native.gobject.g_cclosure_marshal_VOID__UINT_POINTER
import org.gtkkn.native.gobject.g_cclosure_marshal_VOID__ULONG
import org.gtkkn.native.gobject.g_cclosure_marshal_VOID__VARIANT
import org.gtkkn.native.gobject.g_cclosure_marshal_VOID__VOID
import org.gtkkn.native.gobject.g_cclosure_marshal_generic
import kotlin.Pair
import kotlin.String
import kotlin.Unit
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * A #GCClosure is a specialization of #GClosure for C function callbacks.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `args`: va_list type is not supported
 * - parameter `args`: va_list type is not supported
 * - parameter `args`: va_list type is not supported
 * - parameter `args`: va_list type is not supported
 * - parameter `args`: va_list type is not supported
 * - parameter `args`: va_list type is not supported
 * - parameter `args`: va_list type is not supported
 * - parameter `args`: va_list type is not supported
 * - parameter `args`: va_list type is not supported
 * - parameter `args`: va_list type is not supported
 * - parameter `args`: va_list type is not supported
 * - parameter `args`: va_list type is not supported
 * - parameter `args`: va_list type is not supported
 * - parameter `args`: va_list type is not supported
 * - parameter `args`: va_list type is not supported
 * - parameter `args`: va_list type is not supported
 * - parameter `args`: va_list type is not supported
 * - parameter `args`: va_list type is not supported
 * - parameter `args`: va_list type is not supported
 * - parameter `args`: va_list type is not supported
 * - parameter `args`: va_list type is not supported
 * - parameter `args`: va_list type is not supported
 * - parameter `args_list`: va_list type is not supported
 * - parameter `destroy_data`: ClosureNotify
 * - parameter `callback_func`: Callback
 * - parameter `callback_func`: Callback
 * - parameter `destroy_data`: ClosureNotify
 * - field `closure`: Field with not-pointer record/union GClosure is not supported
 */
public class CClosure(pointer: CPointer<GCClosure>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GCClosure> = pointer

    /**
     * the callback function
     */
    public var callback: gpointer
        get() = gPointer.pointed.callback!!

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.callback = value
        }

    /**
     * Allocate a new CClosure.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GCClosure>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to CClosure and a [Cleaner] instance.
     */
    private constructor(pair: Pair<CPointer<GCClosure>, Cleaner>) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new CClosure using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GCClosure>().ptr)

    /**
     * Allocate a new CClosure.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param callback the callback function
     */
    public constructor(callback: gpointer) : this() {
        this.callback = callback
    }

    /**
     * Allocate a new CClosure using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param callback the callback function
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(callback: gpointer, scope: AutofreeScope) : this(scope) {
        this.callback = callback
    }

    override fun toString(): String = "CClosure(callback=$callback)"

    public companion object {
        /**
         * A #GClosureMarshal function for use with signals with handlers that
         * take two boxed pointers as arguments and return a boolean.  If you
         * have such a signal, you will probably also need to use an
         * accumulator, such as g_signal_accumulator_true_handled().
         *
         * @param closure A #GClosure.
         * @param returnValue A #GValue to store the return value. May be null
         *   if the callback of closure doesn't return a value.
         * @param nParamValues The length of the @param_values array.
         * @param paramValues An array of #GValues holding the arguments
         *   on which to invoke the callback of closure.
         * @param invocationHint The invocation hint given as the last argument to
         *   g_closure_invoke().
         * @param marshalData Additional data specified when registering the
         *   marshaller, see g_closure_set_marshal() and
         *   g_closure_set_meta_marshal()
         */
        public fun marshalBooleanBoxedBoxed(
            closure: Closure,
            returnValue: Value,
            nParamValues: guint,
            paramValues: Value,
            invocationHint: gpointer? = null,
            marshalData: gpointer? = null,
        ): Unit = g_cclosure_marshal_BOOLEAN__BOXED_BOXED(
            closure.gPointer.reinterpret(),
            returnValue.gPointer.reinterpret(),
            nParamValues,
            paramValues.gPointer.reinterpret(),
            invocationHint,
            marshalData
        )

        /**
         * A #GClosureMarshal function for use with signals with handlers that
         * take a flags type as an argument and return a boolean.  If you have
         * such a signal, you will probably also need to use an accumulator,
         * such as g_signal_accumulator_true_handled().
         *
         * @param closure A #GClosure.
         * @param returnValue A #GValue to store the return value. May be null
         *   if the callback of closure doesn't return a value.
         * @param nParamValues The length of the @param_values array.
         * @param paramValues An array of #GValues holding the arguments
         *   on which to invoke the callback of closure.
         * @param invocationHint The invocation hint given as the last argument to
         *   g_closure_invoke().
         * @param marshalData Additional data specified when registering the
         *   marshaller, see g_closure_set_marshal() and
         *   g_closure_set_meta_marshal()
         */
        public fun marshalBooleanFlags(
            closure: Closure,
            returnValue: Value,
            nParamValues: guint,
            paramValues: Value,
            invocationHint: gpointer? = null,
            marshalData: gpointer? = null,
        ): Unit = g_cclosure_marshal_BOOLEAN__FLAGS(
            closure.gPointer.reinterpret(),
            returnValue.gPointer.reinterpret(),
            nParamValues,
            paramValues.gPointer.reinterpret(),
            invocationHint,
            marshalData
        )

        /**
         * A #GClosureMarshal function for use with signals with handlers that
         * take a #GObject and a pointer and produce a string.  It is highly
         * unlikely that your signal handler fits this description.
         *
         * @param closure A #GClosure.
         * @param returnValue A #GValue to store the return value. May be null
         *   if the callback of closure doesn't return a value.
         * @param nParamValues The length of the @param_values array.
         * @param paramValues An array of #GValues holding the arguments
         *   on which to invoke the callback of closure.
         * @param invocationHint The invocation hint given as the last argument to
         *   g_closure_invoke().
         * @param marshalData Additional data specified when registering the
         *   marshaller, see g_closure_set_marshal() and
         *   g_closure_set_meta_marshal()
         */
        public fun marshalStringObjectPointer(
            closure: Closure,
            returnValue: Value,
            nParamValues: guint,
            paramValues: Value,
            invocationHint: gpointer? = null,
            marshalData: gpointer? = null,
        ): Unit = g_cclosure_marshal_STRING__OBJECT_POINTER(
            closure.gPointer.reinterpret(),
            returnValue.gPointer.reinterpret(),
            nParamValues,
            paramValues.gPointer.reinterpret(),
            invocationHint,
            marshalData
        )

        /**
         * A #GClosureMarshal function for use with signals with a single
         * boolean argument.
         *
         * @param closure A #GClosure.
         * @param returnValue A #GValue to store the return value. May be null
         *   if the callback of closure doesn't return a value.
         * @param nParamValues The length of the @param_values array.
         * @param paramValues An array of #GValues holding the arguments
         *   on which to invoke the callback of closure.
         * @param invocationHint The invocation hint given as the last argument to
         *   g_closure_invoke().
         * @param marshalData Additional data specified when registering the
         *   marshaller, see g_closure_set_marshal() and
         *   g_closure_set_meta_marshal()
         */
        public fun marshalVoidBoolean(
            closure: Closure,
            returnValue: Value,
            nParamValues: guint,
            paramValues: Value,
            invocationHint: gpointer? = null,
            marshalData: gpointer? = null,
        ): Unit = g_cclosure_marshal_VOID__BOOLEAN(
            closure.gPointer.reinterpret(),
            returnValue.gPointer.reinterpret(),
            nParamValues,
            paramValues.gPointer.reinterpret(),
            invocationHint,
            marshalData
        )

        /**
         * A #GClosureMarshal function for use with signals with a single
         * argument which is any boxed pointer type.
         *
         * @param closure A #GClosure.
         * @param returnValue A #GValue to store the return value. May be null
         *   if the callback of closure doesn't return a value.
         * @param nParamValues The length of the @param_values array.
         * @param paramValues An array of #GValues holding the arguments
         *   on which to invoke the callback of closure.
         * @param invocationHint The invocation hint given as the last argument to
         *   g_closure_invoke().
         * @param marshalData Additional data specified when registering the
         *   marshaller, see g_closure_set_marshal() and
         *   g_closure_set_meta_marshal()
         */
        public fun marshalVoidBoxed(
            closure: Closure,
            returnValue: Value,
            nParamValues: guint,
            paramValues: Value,
            invocationHint: gpointer? = null,
            marshalData: gpointer? = null,
        ): Unit = g_cclosure_marshal_VOID__BOXED(
            closure.gPointer.reinterpret(),
            returnValue.gPointer.reinterpret(),
            nParamValues,
            paramValues.gPointer.reinterpret(),
            invocationHint,
            marshalData
        )

        /**
         * A #GClosureMarshal function for use with signals with a single
         * character argument.
         *
         * @param closure A #GClosure.
         * @param returnValue A #GValue to store the return value. May be null
         *   if the callback of closure doesn't return a value.
         * @param nParamValues The length of the @param_values array.
         * @param paramValues An array of #GValues holding the arguments
         *   on which to invoke the callback of closure.
         * @param invocationHint The invocation hint given as the last argument to
         *   g_closure_invoke().
         * @param marshalData Additional data specified when registering the
         *   marshaller, see g_closure_set_marshal() and
         *   g_closure_set_meta_marshal()
         */
        public fun marshalVoidChar(
            closure: Closure,
            returnValue: Value,
            nParamValues: guint,
            paramValues: Value,
            invocationHint: gpointer? = null,
            marshalData: gpointer? = null,
        ): Unit = g_cclosure_marshal_VOID__CHAR(
            closure.gPointer.reinterpret(),
            returnValue.gPointer.reinterpret(),
            nParamValues,
            paramValues.gPointer.reinterpret(),
            invocationHint,
            marshalData
        )

        /**
         * A #GClosureMarshal function for use with signals with one
         * double-precision floating point argument.
         *
         * @param closure A #GClosure.
         * @param returnValue A #GValue to store the return value. May be null
         *   if the callback of closure doesn't return a value.
         * @param nParamValues The length of the @param_values array.
         * @param paramValues An array of #GValues holding the arguments
         *   on which to invoke the callback of closure.
         * @param invocationHint The invocation hint given as the last argument to
         *   g_closure_invoke().
         * @param marshalData Additional data specified when registering the
         *   marshaller, see g_closure_set_marshal() and
         *   g_closure_set_meta_marshal()
         */
        public fun marshalVoidDouble(
            closure: Closure,
            returnValue: Value,
            nParamValues: guint,
            paramValues: Value,
            invocationHint: gpointer? = null,
            marshalData: gpointer? = null,
        ): Unit = g_cclosure_marshal_VOID__DOUBLE(
            closure.gPointer.reinterpret(),
            returnValue.gPointer.reinterpret(),
            nParamValues,
            paramValues.gPointer.reinterpret(),
            invocationHint,
            marshalData
        )

        /**
         * A #GClosureMarshal function for use with signals with a single
         * argument with an enumerated type.
         *
         * @param closure A #GClosure.
         * @param returnValue A #GValue to store the return value. May be null
         *   if the callback of closure doesn't return a value.
         * @param nParamValues The length of the @param_values array.
         * @param paramValues An array of #GValues holding the arguments
         *   on which to invoke the callback of closure.
         * @param invocationHint The invocation hint given as the last argument to
         *   g_closure_invoke().
         * @param marshalData Additional data specified when registering the
         *   marshaller, see g_closure_set_marshal() and
         *   g_closure_set_meta_marshal()
         */
        public fun marshalVoidEnum(
            closure: Closure,
            returnValue: Value,
            nParamValues: guint,
            paramValues: Value,
            invocationHint: gpointer? = null,
            marshalData: gpointer? = null,
        ): Unit = g_cclosure_marshal_VOID__ENUM(
            closure.gPointer.reinterpret(),
            returnValue.gPointer.reinterpret(),
            nParamValues,
            paramValues.gPointer.reinterpret(),
            invocationHint,
            marshalData
        )

        /**
         * A #GClosureMarshal function for use with signals with a single
         * argument with a flags types.
         *
         * @param closure A #GClosure.
         * @param returnValue A #GValue to store the return value. May be null
         *   if the callback of closure doesn't return a value.
         * @param nParamValues The length of the @param_values array.
         * @param paramValues An array of #GValues holding the arguments
         *   on which to invoke the callback of closure.
         * @param invocationHint The invocation hint given as the last argument to
         *   g_closure_invoke().
         * @param marshalData Additional data specified when registering the
         *   marshaller, see g_closure_set_marshal() and
         *   g_closure_set_meta_marshal()
         */
        public fun marshalVoidFlags(
            closure: Closure,
            returnValue: Value,
            nParamValues: guint,
            paramValues: Value,
            invocationHint: gpointer? = null,
            marshalData: gpointer? = null,
        ): Unit = g_cclosure_marshal_VOID__FLAGS(
            closure.gPointer.reinterpret(),
            returnValue.gPointer.reinterpret(),
            nParamValues,
            paramValues.gPointer.reinterpret(),
            invocationHint,
            marshalData
        )

        /**
         * A #GClosureMarshal function for use with signals with one
         * single-precision floating point argument.
         *
         * @param closure A #GClosure.
         * @param returnValue A #GValue to store the return value. May be null
         *   if the callback of closure doesn't return a value.
         * @param nParamValues The length of the @param_values array.
         * @param paramValues An array of #GValues holding the arguments
         *   on which to invoke the callback of closure.
         * @param invocationHint The invocation hint given as the last argument to
         *   g_closure_invoke().
         * @param marshalData Additional data specified when registering the
         *   marshaller, see g_closure_set_marshal() and
         *   g_closure_set_meta_marshal()
         */
        public fun marshalVoidFloat(
            closure: Closure,
            returnValue: Value,
            nParamValues: guint,
            paramValues: Value,
            invocationHint: gpointer? = null,
            marshalData: gpointer? = null,
        ): Unit = g_cclosure_marshal_VOID__FLOAT(
            closure.gPointer.reinterpret(),
            returnValue.gPointer.reinterpret(),
            nParamValues,
            paramValues.gPointer.reinterpret(),
            invocationHint,
            marshalData
        )

        /**
         * A #GClosureMarshal function for use with signals with a single
         * integer argument.
         *
         * @param closure A #GClosure.
         * @param returnValue A #GValue to store the return value. May be null
         *   if the callback of closure doesn't return a value.
         * @param nParamValues The length of the @param_values array.
         * @param paramValues An array of #GValues holding the arguments
         *   on which to invoke the callback of closure.
         * @param invocationHint The invocation hint given as the last argument to
         *   g_closure_invoke().
         * @param marshalData Additional data specified when registering the
         *   marshaller, see g_closure_set_marshal() and
         *   g_closure_set_meta_marshal()
         */
        public fun marshalVoidInt(
            closure: Closure,
            returnValue: Value,
            nParamValues: guint,
            paramValues: Value,
            invocationHint: gpointer? = null,
            marshalData: gpointer? = null,
        ): Unit = g_cclosure_marshal_VOID__INT(
            closure.gPointer.reinterpret(),
            returnValue.gPointer.reinterpret(),
            nParamValues,
            paramValues.gPointer.reinterpret(),
            invocationHint,
            marshalData
        )

        /**
         * A #GClosureMarshal function for use with signals with with a single
         * long integer argument.
         *
         * @param closure A #GClosure.
         * @param returnValue A #GValue to store the return value. May be null
         *   if the callback of closure doesn't return a value.
         * @param nParamValues The length of the @param_values array.
         * @param paramValues An array of #GValues holding the arguments
         *   on which to invoke the callback of closure.
         * @param invocationHint The invocation hint given as the last argument to
         *   g_closure_invoke().
         * @param marshalData Additional data specified when registering the
         *   marshaller, see g_closure_set_marshal() and
         *   g_closure_set_meta_marshal()
         */
        public fun marshalVoidLong(
            closure: Closure,
            returnValue: Value,
            nParamValues: guint,
            paramValues: Value,
            invocationHint: gpointer? = null,
            marshalData: gpointer? = null,
        ): Unit = g_cclosure_marshal_VOID__LONG(
            closure.gPointer.reinterpret(),
            returnValue.gPointer.reinterpret(),
            nParamValues,
            paramValues.gPointer.reinterpret(),
            invocationHint,
            marshalData
        )

        /**
         * A #GClosureMarshal function for use with signals with a single
         * #GObject argument.
         *
         * @param closure A #GClosure.
         * @param returnValue A #GValue to store the return value. May be null
         *   if the callback of closure doesn't return a value.
         * @param nParamValues The length of the @param_values array.
         * @param paramValues An array of #GValues holding the arguments
         *   on which to invoke the callback of closure.
         * @param invocationHint The invocation hint given as the last argument to
         *   g_closure_invoke().
         * @param marshalData Additional data specified when registering the
         *   marshaller, see g_closure_set_marshal() and
         *   g_closure_set_meta_marshal()
         */
        public fun marshalVoidObject(
            closure: Closure,
            returnValue: Value,
            nParamValues: guint,
            paramValues: Value,
            invocationHint: gpointer? = null,
            marshalData: gpointer? = null,
        ): Unit = g_cclosure_marshal_VOID__OBJECT(
            closure.gPointer.reinterpret(),
            returnValue.gPointer.reinterpret(),
            nParamValues,
            paramValues.gPointer.reinterpret(),
            invocationHint,
            marshalData
        )

        /**
         * A #GClosureMarshal function for use with signals with a single
         * argument of type #GParamSpec.
         *
         * @param closure A #GClosure.
         * @param returnValue A #GValue to store the return value. May be null
         *   if the callback of closure doesn't return a value.
         * @param nParamValues The length of the @param_values array.
         * @param paramValues An array of #GValues holding the arguments
         *   on which to invoke the callback of closure.
         * @param invocationHint The invocation hint given as the last argument to
         *   g_closure_invoke().
         * @param marshalData Additional data specified when registering the
         *   marshaller, see g_closure_set_marshal() and
         *   g_closure_set_meta_marshal()
         */
        public fun marshalVoidParam(
            closure: Closure,
            returnValue: Value,
            nParamValues: guint,
            paramValues: Value,
            invocationHint: gpointer? = null,
            marshalData: gpointer? = null,
        ): Unit = g_cclosure_marshal_VOID__PARAM(
            closure.gPointer.reinterpret(),
            returnValue.gPointer.reinterpret(),
            nParamValues,
            paramValues.gPointer.reinterpret(),
            invocationHint,
            marshalData
        )

        /**
         * A #GClosureMarshal function for use with signals with a single raw
         * pointer argument type.
         *
         * If it is possible, it is better to use one of the more specific
         * functions such as g_cclosure_marshal_VOID__OBJECT() or
         * g_cclosure_marshal_VOID__OBJECT().
         *
         * @param closure A #GClosure.
         * @param returnValue A #GValue to store the return value. May be null
         *   if the callback of closure doesn't return a value.
         * @param nParamValues The length of the @param_values array.
         * @param paramValues An array of #GValues holding the arguments
         *   on which to invoke the callback of closure.
         * @param invocationHint The invocation hint given as the last argument to
         *   g_closure_invoke().
         * @param marshalData Additional data specified when registering the
         *   marshaller, see g_closure_set_marshal() and
         *   g_closure_set_meta_marshal()
         */
        public fun marshalVoidPointer(
            closure: Closure,
            returnValue: Value,
            nParamValues: guint,
            paramValues: Value,
            invocationHint: gpointer? = null,
            marshalData: gpointer? = null,
        ): Unit = g_cclosure_marshal_VOID__POINTER(
            closure.gPointer.reinterpret(),
            returnValue.gPointer.reinterpret(),
            nParamValues,
            paramValues.gPointer.reinterpret(),
            invocationHint,
            marshalData
        )

        /**
         * A #GClosureMarshal function for use with signals with a single string
         * argument.
         *
         * @param closure A #GClosure.
         * @param returnValue A #GValue to store the return value. May be null
         *   if the callback of closure doesn't return a value.
         * @param nParamValues The length of the @param_values array.
         * @param paramValues An array of #GValues holding the arguments
         *   on which to invoke the callback of closure.
         * @param invocationHint The invocation hint given as the last argument to
         *   g_closure_invoke().
         * @param marshalData Additional data specified when registering the
         *   marshaller, see g_closure_set_marshal() and
         *   g_closure_set_meta_marshal()
         */
        public fun marshalVoidString(
            closure: Closure,
            returnValue: Value,
            nParamValues: guint,
            paramValues: Value,
            invocationHint: gpointer? = null,
            marshalData: gpointer? = null,
        ): Unit = g_cclosure_marshal_VOID__STRING(
            closure.gPointer.reinterpret(),
            returnValue.gPointer.reinterpret(),
            nParamValues,
            paramValues.gPointer.reinterpret(),
            invocationHint,
            marshalData
        )

        /**
         * A #GClosureMarshal function for use with signals with a single
         * unsigned character argument.
         *
         * @param closure A #GClosure.
         * @param returnValue A #GValue to store the return value. May be null
         *   if the callback of closure doesn't return a value.
         * @param nParamValues The length of the @param_values array.
         * @param paramValues An array of #GValues holding the arguments
         *   on which to invoke the callback of closure.
         * @param invocationHint The invocation hint given as the last argument to
         *   g_closure_invoke().
         * @param marshalData Additional data specified when registering the
         *   marshaller, see g_closure_set_marshal() and
         *   g_closure_set_meta_marshal()
         */
        public fun marshalVoidUchar(
            closure: Closure,
            returnValue: Value,
            nParamValues: guint,
            paramValues: Value,
            invocationHint: gpointer? = null,
            marshalData: gpointer? = null,
        ): Unit = g_cclosure_marshal_VOID__UCHAR(
            closure.gPointer.reinterpret(),
            returnValue.gPointer.reinterpret(),
            nParamValues,
            paramValues.gPointer.reinterpret(),
            invocationHint,
            marshalData
        )

        /**
         * A #GClosureMarshal function for use with signals with with a single
         * unsigned integer argument.
         *
         * @param closure A #GClosure.
         * @param returnValue A #GValue to store the return value. May be null
         *   if the callback of closure doesn't return a value.
         * @param nParamValues The length of the @param_values array.
         * @param paramValues An array of #GValues holding the arguments
         *   on which to invoke the callback of closure.
         * @param invocationHint The invocation hint given as the last argument to
         *   g_closure_invoke().
         * @param marshalData Additional data specified when registering the
         *   marshaller, see g_closure_set_marshal() and
         *   g_closure_set_meta_marshal()
         */
        public fun marshalVoidUint(
            closure: Closure,
            returnValue: Value,
            nParamValues: guint,
            paramValues: Value,
            invocationHint: gpointer? = null,
            marshalData: gpointer? = null,
        ): Unit = g_cclosure_marshal_VOID__UINT(
            closure.gPointer.reinterpret(),
            returnValue.gPointer.reinterpret(),
            nParamValues,
            paramValues.gPointer.reinterpret(),
            invocationHint,
            marshalData
        )

        /**
         * A #GClosureMarshal function for use with signals with an unsigned int
         * and a pointer as arguments.
         *
         * @param closure A #GClosure.
         * @param returnValue A #GValue to store the return value. May be null
         *   if the callback of closure doesn't return a value.
         * @param nParamValues The length of the @param_values array.
         * @param paramValues An array of #GValues holding the arguments
         *   on which to invoke the callback of closure.
         * @param invocationHint The invocation hint given as the last argument to
         *   g_closure_invoke().
         * @param marshalData Additional data specified when registering the
         *   marshaller, see g_closure_set_marshal() and
         *   g_closure_set_meta_marshal()
         */
        public fun marshalVoidUintPointer(
            closure: Closure,
            returnValue: Value,
            nParamValues: guint,
            paramValues: Value,
            invocationHint: gpointer? = null,
            marshalData: gpointer? = null,
        ): Unit = g_cclosure_marshal_VOID__UINT_POINTER(
            closure.gPointer.reinterpret(),
            returnValue.gPointer.reinterpret(),
            nParamValues,
            paramValues.gPointer.reinterpret(),
            invocationHint,
            marshalData
        )

        /**
         * A #GClosureMarshal function for use with signals with a single
         * unsigned long integer argument.
         *
         * @param closure A #GClosure.
         * @param returnValue A #GValue to store the return value. May be null
         *   if the callback of closure doesn't return a value.
         * @param nParamValues The length of the @param_values array.
         * @param paramValues An array of #GValues holding the arguments
         *   on which to invoke the callback of closure.
         * @param invocationHint The invocation hint given as the last argument to
         *   g_closure_invoke().
         * @param marshalData Additional data specified when registering the
         *   marshaller, see g_closure_set_marshal() and
         *   g_closure_set_meta_marshal()
         */
        public fun marshalVoidUlong(
            closure: Closure,
            returnValue: Value,
            nParamValues: guint,
            paramValues: Value,
            invocationHint: gpointer? = null,
            marshalData: gpointer? = null,
        ): Unit = g_cclosure_marshal_VOID__ULONG(
            closure.gPointer.reinterpret(),
            returnValue.gPointer.reinterpret(),
            nParamValues,
            paramValues.gPointer.reinterpret(),
            invocationHint,
            marshalData
        )

        /**
         * A #GClosureMarshal function for use with signals with a single
         * #GVariant argument.
         *
         * @param closure A #GClosure.
         * @param returnValue A #GValue to store the return value. May be null
         *   if the callback of closure doesn't return a value.
         * @param nParamValues The length of the @param_values array.
         * @param paramValues An array of #GValues holding the arguments
         *   on which to invoke the callback of closure.
         * @param invocationHint The invocation hint given as the last argument to
         *   g_closure_invoke().
         * @param marshalData Additional data specified when registering the
         *   marshaller, see g_closure_set_marshal() and
         *   g_closure_set_meta_marshal()
         */
        public fun marshalVoidVariant(
            closure: Closure,
            returnValue: Value,
            nParamValues: guint,
            paramValues: Value,
            invocationHint: gpointer? = null,
            marshalData: gpointer? = null,
        ): Unit = g_cclosure_marshal_VOID__VARIANT(
            closure.gPointer.reinterpret(),
            returnValue.gPointer.reinterpret(),
            nParamValues,
            paramValues.gPointer.reinterpret(),
            invocationHint,
            marshalData
        )

        /**
         * A #GClosureMarshal function for use with signals with no arguments.
         *
         * @param closure A #GClosure.
         * @param returnValue A #GValue to store the return value. May be null
         *   if the callback of closure doesn't return a value.
         * @param nParamValues The length of the @param_values array.
         * @param paramValues An array of #GValues holding the arguments
         *   on which to invoke the callback of closure.
         * @param invocationHint The invocation hint given as the last argument to
         *   g_closure_invoke().
         * @param marshalData Additional data specified when registering the
         *   marshaller, see g_closure_set_marshal() and
         *   g_closure_set_meta_marshal()
         */
        public fun marshalVoidVoid(
            closure: Closure,
            returnValue: Value,
            nParamValues: guint,
            paramValues: Value,
            invocationHint: gpointer? = null,
            marshalData: gpointer? = null,
        ): Unit = g_cclosure_marshal_VOID__VOID(
            closure.gPointer.reinterpret(),
            returnValue.gPointer.reinterpret(),
            nParamValues,
            paramValues.gPointer.reinterpret(),
            invocationHint,
            marshalData
        )

        /**
         * A generic marshaller function implemented via
         * [libffi](http://sourceware.org/libffi/).
         *
         * Normally this function is not passed explicitly to g_signal_new(),
         * but used automatically by GLib when specifying a null marshaller.
         *
         * @param closure A #GClosure.
         * @param returnGvalue A #GValue to store the return value. May be null
         *   if the callback of closure doesn't return a value.
         * @param nParamValues The length of the @param_values array.
         * @param paramValues An array of #GValues holding the arguments
         *   on which to invoke the callback of closure.
         * @param invocationHint The invocation hint given as the last argument to
         *   g_closure_invoke().
         * @param marshalData Additional data specified when registering the
         *   marshaller, see g_closure_set_marshal() and
         *   g_closure_set_meta_marshal()
         * @since 2.30
         */
        @GObjectVersion2_30
        public fun marshalGeneric(
            closure: Closure,
            returnGvalue: Value,
            nParamValues: guint,
            paramValues: Value,
            invocationHint: gpointer? = null,
            marshalData: gpointer? = null,
        ): Unit = g_cclosure_marshal_generic(
            closure.gPointer.reinterpret(),
            returnGvalue.gPointer.reinterpret(),
            nParamValues,
            paramValues.gPointer.reinterpret(),
            invocationHint,
            marshalData
        )
    }
}

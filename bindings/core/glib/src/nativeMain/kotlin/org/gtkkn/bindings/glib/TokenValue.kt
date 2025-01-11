// This is a generated file. Do not modify.
package org.gtkkn.bindings.glib

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.GTokenValue
import org.gtkkn.native.glib.g_free
import org.gtkkn.native.glib.g_strdup
import org.gtkkn.native.glib.gdouble
import org.gtkkn.native.glib.gpointer
import org.gtkkn.native.glib.guint
import org.gtkkn.native.glib.guint64
import org.gtkkn.native.glib.guint8
import org.gtkkn.native.glib.gulong
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * A union holding the value of the token.
 */
public class TokenValue(public val glibTokenValuePointer: CPointer<GTokenValue>, cleaner: Cleaner? = null) :
    ProxyInstance(glibTokenValuePointer) {
    /**
     * token symbol value
     */
    public var vSymbol: gpointer
        get() = glibTokenValuePointer.pointed.v_symbol!!

        @UnsafeFieldSetter
        set(`value`) {
            glibTokenValuePointer.pointed.v_symbol = value
        }

    /**
     * token identifier value
     */
    public var vIdentifier: String?
        get() = glibTokenValuePointer.pointed.v_identifier?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            glibTokenValuePointer.pointed.v_identifier?.let { g_free(it) }
            glibTokenValuePointer.pointed.v_identifier = value?.let { g_strdup(it) }
        }

    /**
     * token binary integer value
     */
    public var vBinary: gulong
        get() = glibTokenValuePointer.pointed.v_binary

        @UnsafeFieldSetter
        set(`value`) {
            glibTokenValuePointer.pointed.v_binary = value
        }

    /**
     * octal integer value
     */
    public var vOctal: gulong
        get() = glibTokenValuePointer.pointed.v_octal

        @UnsafeFieldSetter
        set(`value`) {
            glibTokenValuePointer.pointed.v_octal = value
        }

    /**
     * integer value
     */
    public var vInt: gulong
        get() = glibTokenValuePointer.pointed.v_int

        @UnsafeFieldSetter
        set(`value`) {
            glibTokenValuePointer.pointed.v_int = value
        }

    /**
     * 64-bit integer value
     */
    public var vInt64: guint64
        get() = glibTokenValuePointer.pointed.v_int64

        @UnsafeFieldSetter
        set(`value`) {
            glibTokenValuePointer.pointed.v_int64 = value
        }

    /**
     * floating point value
     */
    public var vFloat: gdouble
        get() = glibTokenValuePointer.pointed.v_float

        @UnsafeFieldSetter
        set(`value`) {
            glibTokenValuePointer.pointed.v_float = value
        }

    /**
     * hex integer value
     */
    public var vHex: gulong
        get() = glibTokenValuePointer.pointed.v_hex

        @UnsafeFieldSetter
        set(`value`) {
            glibTokenValuePointer.pointed.v_hex = value
        }

    /**
     * string value
     */
    public var vString: String?
        get() = glibTokenValuePointer.pointed.v_string?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            glibTokenValuePointer.pointed.v_string?.let { g_free(it) }
            glibTokenValuePointer.pointed.v_string = value?.let { g_strdup(it) }
        }

    /**
     * comment value
     */
    public var vComment: String?
        get() = glibTokenValuePointer.pointed.v_comment?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            glibTokenValuePointer.pointed.v_comment?.let { g_free(it) }
            glibTokenValuePointer.pointed.v_comment = value?.let { g_strdup(it) }
        }

    /**
     * character value
     */
    public var vChar: guint8
        get() = glibTokenValuePointer.pointed.v_char

        @UnsafeFieldSetter
        set(`value`) {
            glibTokenValuePointer.pointed.v_char = value
        }

    /**
     * error value
     */
    public var vError: guint
        get() = glibTokenValuePointer.pointed.v_error

        @UnsafeFieldSetter
        set(`value`) {
            glibTokenValuePointer.pointed.v_error = value
        }

    /**
     * Allocate a new TokenValue.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GTokenValue>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to TokenValue and a [Cleaner] instance.
     */
    private constructor(
        pair: Pair<CPointer<GTokenValue>, Cleaner>,
    ) : this(glibTokenValuePointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new TokenValue using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GTokenValue>().ptr)

    /**
     * Allocate a new TokenValue.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param vSymbol token symbol value
     * @param vIdentifier token identifier value
     * @param vBinary token binary integer value
     * @param vOctal octal integer value
     * @param vInt integer value
     * @param vInt64 64-bit integer value
     * @param vFloat floating point value
     * @param vHex hex integer value
     * @param vString string value
     * @param vComment comment value
     * @param vChar character value
     * @param vError error value
     */
    public constructor(
        vSymbol: gpointer,
        vIdentifier: String?,
        vBinary: gulong,
        vOctal: gulong,
        vInt: gulong,
        vInt64: guint64,
        vFloat: gdouble,
        vHex: gulong,
        vString: String?,
        vComment: String?,
        vChar: guint8,
        vError: guint,
    ) : this() {
        this.vSymbol = vSymbol
        this.vIdentifier = vIdentifier
        this.vBinary = vBinary
        this.vOctal = vOctal
        this.vInt = vInt
        this.vInt64 = vInt64
        this.vFloat = vFloat
        this.vHex = vHex
        this.vString = vString
        this.vComment = vComment
        this.vChar = vChar
        this.vError = vError
    }

    /**
     * Allocate a new TokenValue using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param vSymbol token symbol value
     * @param vIdentifier token identifier value
     * @param vBinary token binary integer value
     * @param vOctal octal integer value
     * @param vInt integer value
     * @param vInt64 64-bit integer value
     * @param vFloat floating point value
     * @param vHex hex integer value
     * @param vString string value
     * @param vComment comment value
     * @param vChar character value
     * @param vError error value
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        vSymbol: gpointer,
        vIdentifier: String?,
        vBinary: gulong,
        vOctal: gulong,
        vInt: gulong,
        vInt64: guint64,
        vFloat: gdouble,
        vHex: gulong,
        vString: String?,
        vComment: String?,
        vChar: guint8,
        vError: guint,
        scope: AutofreeScope,
    ) : this(scope) {
        this.vSymbol = vSymbol
        this.vIdentifier = vIdentifier
        this.vBinary = vBinary
        this.vOctal = vOctal
        this.vInt = vInt
        this.vInt64 = vInt64
        this.vFloat = vFloat
        this.vHex = vHex
        this.vString = vString
        this.vComment = vComment
        this.vChar = vChar
        this.vError = vError
    }

    override fun toString(): String =
        "TokenValue(vSymbol=$vSymbol, vIdentifier=$vIdentifier, vBinary=$vBinary, vOctal=$vOctal, vInt=$vInt, vInt64=$vInt64, vFloat=$vFloat, vHex=$vHex, vString=$vString, vComment=$vComment, vChar=$vChar, vError=$vError)"
}

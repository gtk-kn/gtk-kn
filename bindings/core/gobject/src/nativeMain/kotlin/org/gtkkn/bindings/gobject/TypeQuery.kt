// This is a generated file. Do not modify.
package org.gtkkn.bindings.gobject

import kotlinx.cinterop.AutofreeScope
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.alloc
import kotlinx.cinterop.nativeHeap
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.annotations.UnsafeFieldSetter
import org.gtkkn.extensions.glib.cinterop.ProxyInstance
import org.gtkkn.native.glib.g_free
import org.gtkkn.native.glib.g_strdup
import org.gtkkn.native.glib.guint
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.GTypeQuery
import kotlin.Pair
import kotlin.String
import kotlin.native.ref.Cleaner
import kotlin.native.ref.createCleaner

/**
 * A structure holding information for a specific type.
 *
 * See also: g_type_query()
 */
public class TypeQuery(pointer: CPointer<GTypeQuery>, cleaner: Cleaner? = null) : ProxyInstance(pointer) {
    public val gPointer: CPointer<GTypeQuery> = pointer

    /**
     * the #GType value of the type
     */
    public var type: GType
        get() = gPointer.pointed.type

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.type = value
        }

    /**
     * the name of the type
     */
    public var typeName: String?
        get() = gPointer.pointed.type_name?.toKString()

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.type_name?.let { g_free(it) }
            gPointer.pointed.type_name = value?.let { g_strdup(it) }
        }

    /**
     * the size of the class structure
     */
    public var classSize: guint
        get() = gPointer.pointed.class_size

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.class_size = value
        }

    /**
     * the size of the instance structure
     */
    public var instanceSize: guint
        get() = gPointer.pointed.instance_size

        @UnsafeFieldSetter
        set(`value`) {
            gPointer.pointed.instance_size = value
        }

    /**
     * Allocate a new TypeQuery.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     */
    public constructor() : this(
        nativeHeap.alloc<GTypeQuery>().run {
            val cleaner = createCleaner(rawPtr) { nativeHeap.free(it) }
            ptr to cleaner
        }
    )

    /**
     * Private constructor that unpacks the pair into pointer and cleaner.
     *
     * @param pair A pair containing the pointer to TypeQuery and a [Cleaner] instance.
     */
    private constructor(pair: Pair<CPointer<GTypeQuery>, Cleaner>) : this(pointer = pair.first, cleaner = pair.second)

    /**
     * Allocate a new TypeQuery using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(scope: AutofreeScope) : this(scope.alloc<GTypeQuery>().ptr)

    /**
     * Allocate a new TypeQuery.
     *
     * This instance will be allocated on the native heap and automatically freed when
     * this class instance is garbage collected.
     *
     * @param type the #GType value of the type
     * @param typeName the name of the type
     * @param classSize the size of the class structure
     * @param instanceSize the size of the instance structure
     */
    public constructor(
        type: GType,
        typeName: String?,
        classSize: guint,
        instanceSize: guint,
    ) : this() {
        this.type = type
        this.typeName = typeName
        this.classSize = classSize
        this.instanceSize = instanceSize
    }

    /**
     * Allocate a new TypeQuery using the provided [AutofreeScope].
     *
     * The [AutofreeScope] manages the allocation lifetime. The most common usage is with `memScoped`.
     *
     * @param type the #GType value of the type
     * @param typeName the name of the type
     * @param classSize the size of the class structure
     * @param instanceSize the size of the instance structure
     * @param scope The [AutofreeScope] to allocate this structure in.
     */
    public constructor(
        type: GType,
        typeName: String?,
        classSize: guint,
        instanceSize: guint,
        scope: AutofreeScope,
    ) : this(scope) {
        this.type = type
        this.typeName = typeName
        this.classSize = classSize
        this.instanceSize = instanceSize
    }

    override fun toString(): String =
        "TypeQuery(type=$type, typeName=$typeName, classSize=$classSize, instanceSize=$instanceSize)"
}

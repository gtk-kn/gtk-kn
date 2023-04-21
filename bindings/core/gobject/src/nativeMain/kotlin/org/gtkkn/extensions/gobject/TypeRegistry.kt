/*
 * Copyright (c) 2023 gtk-kn
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.gtkkn.extensions.gobject

import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.alloc
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.interpretCPointer
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.sizeOf
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.native.gobject.GClassInitFunc
import org.gtkkn.native.gobject.GInstanceInitFunc
import org.gtkkn.native.gobject.GObject
import org.gtkkn.native.gobject.GObjectClass
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.GTypeClass
import org.gtkkn.native.gobject.GTypeInfo
import org.gtkkn.native.gobject.GTypeInstance
import org.gtkkn.native.gobject.g_type_class_peek_parent
import org.gtkkn.native.gobject.g_type_from_name
import org.gtkkn.native.gobject.g_type_name_from_instance
import org.gtkkn.native.gobject.g_type_register_static
import org.gtkkn.native.gobject.gtkknObjectProperties

internal data class CustomTypeInfo(
    val name: String,
    val parentClassSize: Long,
    val parentInstanceSize: Long,
)

internal data class InstanceDataHolder(val data: Any)

internal object TypeRegistry {
    internal val TYPE_MAP = mutableMapOf<GType, CustomTypeInfo>()

    fun registerType(
        typeName: String,
        superType: GType,
        parentClassSize: Long,
        parentInstanceSize: Long,
    ): GType = memScoped {

        val customTypeInfo = CustomTypeInfo(typeName, parentClassSize, parentInstanceSize)

        val totalInstanceSize = parentInstanceSize + sizeOf<gtkknObjectProperties>()

        val typeInfoStruct = alloc<GTypeInfo>() {
            class_size = parentClassSize.toUShort()
            instance_size = totalInstanceSize.toUShort()
            class_init = staticObjectClassInit
            instance_init = staticObjectInstanceInit
            class_data = StableRef.create(customTypeInfo).asCPointer()
        }

        val gType = g_type_register_static(superType, typeName, typeInfoStruct.ptr, 0)

        if (gType == 0uL) {
            error("Failed to register type for $typeName")
        }

        TYPE_MAP[gType] = customTypeInfo
        return gType
    }

    fun associate(obj: Object) {
        val typeName = g_type_name_from_instance(obj.gPointer.reinterpret())?.toKString()
        val gType = g_type_from_name(typeName)
        TYPE_MAP[gType]?.let { typeInfo ->
            val instanceProperties = obj.gPointer.getCustomPropertiesPointer(typeInfo)
            if (instanceProperties.pointed.internal_obj == null) {
                val dataHolder = InstanceDataHolder(obj)
                instanceProperties.pointed.internal_obj = StableRef.create(dataHolder).asCPointer()
            } // else already associated
        }
    }

    fun getInstanceData(pointer: COpaquePointer): InstanceDataHolder {
        val typeName = g_type_name_from_instance(pointer.reinterpret())?.toKString()
        val gType = g_type_from_name(typeName)
        TYPE_MAP[gType]?.let { typeInfo ->
            val instanceProperties = pointer.getCustomPropertiesPointer(typeInfo)
            val internalObject = instanceProperties.pointed.internal_obj
            if (internalObject != null) {
                return internalObject.asStableRef<InstanceDataHolder>().get()
            } else {
                error("Not an associated instance")
            }
        }
        error("Not an associated type instance")
    }
}

private fun COpaquePointer.getCustomPropertiesPointer(
    typeInfo: CustomTypeInfo
): CPointer<gtkknObjectProperties> {
    val rawPropertiesPointer = this.rawValue.plus(typeInfo.parentInstanceSize)
    return interpretCPointer<gtkknObjectProperties>(rawPropertiesPointer) as CPointer<gtkknObjectProperties>
}

/**
 * Class initializer that configures a type class.
 */
private val staticObjectClassInit: GClassInitFunc =
    staticCFunction { gClass: CPointer<GObjectClass>,
        _: COpaquePointer /* stableRef of CustomTypeInfo */ ->
        gClass.pointed.dispose = staticObjectDispose.reinterpret()
    }.reinterpret()


/**
 * Instance initializer.
 */
private val staticObjectInstanceInit: GInstanceInitFunc =
    staticCFunction { _: CPointer<GTypeInstance>,
        _: CPointer<GTypeClass> ->
    }.reinterpret()

private val staticObjectDispose = staticCFunction { instance: CPointer<GObject> ->
    val gType = instance.gType()
    val typeInfo = checkNotNull(TypeRegistry.TYPE_MAP[gType])
    val instanceProperties = instance.getCustomPropertiesPointer(typeInfo)
    if (instanceProperties.pointed.dispose_has_run > 0) {
        // already disposed
        return@staticCFunction null
    }
    instanceProperties.pointed.dispose_has_run = 1

    // cleanup instanceData StableRef if associated
    instanceProperties.pointed.internal_obj
        ?.asStableRef<InstanceDataHolder>()
        ?.dispose()

    // chain up to parent class dispose
    @Suppress("UNCHECKED_CAST")
    val parentClassPointer =
        g_type_class_peek_parent(instance.pointed.g_type_instance.g_class) as CPointer<GObjectClass>?
    parentClassPointer?.pointed?.dispose?.invoke(instance)

    @Suppress("USELESS_CAST")
    null as COpaquePointer?
}

private fun CPointer<GTypeInstance>.gType(): GType = checkNotNull(pointed.g_class).pointed.g_type
private fun CPointer<GObject>.gType(): GType = checkNotNull(pointed.g_type_instance.g_class).pointed.g_type

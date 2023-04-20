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
import org.gtkkn.bindings.gobject.Value
import org.gtkkn.extensions.gobject.properties.InstanceProperties
import org.gtkkn.native.gobject.GClassInitFunc
import org.gtkkn.native.gobject.GInstanceInitFunc
import org.gtkkn.native.gobject.GObject
import org.gtkkn.native.gobject.GObjectClass
import org.gtkkn.native.gobject.GParamSpec
import org.gtkkn.native.gobject.GType
import org.gtkkn.native.gobject.GTypeClass
import org.gtkkn.native.gobject.GTypeInfo
import org.gtkkn.native.gobject.GTypeInstance
import org.gtkkn.native.gobject.GValue
import org.gtkkn.native.gobject.g_type_class_peek_parent
import org.gtkkn.native.gobject.g_type_from_name
import org.gtkkn.native.gobject.g_type_name_from_instance
import org.gtkkn.native.gobject.g_type_register_static
import org.gtkkn.native.gobject.gtkknClassStruct
import org.gtkkn.native.gobject.gtkknObjectProperties

internal data class CustomTypeInfo<T : Object>(
    val name: String,
    val parentClassSize: Long,
    val parentInstanceSize: Long,
    val objectCompanion: ObjectType<T>,
) {
    val classProperties: ClassProperties get() = objectCompanion.classProperties
}

internal data class InstanceDataHolder(val data: Any)

internal object TypeRegistry {
    internal val TYPE_MAP = mutableMapOf<GType, CustomTypeInfo<out Object>>()

    fun <T : Object> registerType(
        typeName: String,
        superType: GType,
        parentClassSize: Long,
        parentInstanceSize: Long,
        objectCompanion: ObjectType<T>,
    ): GType = memScoped {

        val customTypeInfo = CustomTypeInfo<T>(typeName, parentClassSize, parentInstanceSize, objectCompanion)

        val totalClassSize = parentClassSize + sizeOf<gtkknClassStruct>()
        val totalInstanceSize = parentInstanceSize + sizeOf<gtkknObjectProperties>()

        val typeInfoStruct = alloc<GTypeInfo>() {
            class_size = totalClassSize.toUShort()
            instance_size = totalInstanceSize.toUShort()
            class_init = staticObjectClassInit
            instance_init = staticObjectInstanceInit
            class_data = StableRef.create(customTypeInfo).asCPointer()
        }

        val gType = g_type_register_static(superType, typeName, typeInfoStruct.ptr, 0)

        if (gType == 0uL) {
            error("Failed to register type for $typeName")
        }

        println("========== registered type for $typeName :: $gType ==========")

        TYPE_MAP[gType] = customTypeInfo
        return gType
    }

    fun associate(obj: Object) {
        val typeName = g_type_name_from_instance(obj.gPointer.reinterpret())?.toKString()
        val gType = g_type_from_name(typeName)
        TYPE_MAP[gType]?.let { typeInfo ->
            val instanceProperties = obj.gPointer.getCustomInstanceStructPointer(typeInfo)
            if (instanceProperties.pointed.internal_obj == null) {
                // associate the instance
                val dataHolder = InstanceDataHolder(obj)
                instanceProperties.pointed.internal_obj = StableRef.create(dataHolder).asCPointer()
            } // else already associated
        }
    }

    /**
     * Get the instance data from a pointer to a g_object instance.
     */
    fun getInstanceData(pointer: COpaquePointer): InstanceDataHolder {
        val typeName = g_type_name_from_instance(pointer.reinterpret())?.toKString()
        val gType = g_type_from_name(typeName)
        TYPE_MAP[gType]?.let { typeInfo ->
            val instanceProperties = pointer.getCustomInstanceStructPointer(typeInfo)
            val internalObject = instanceProperties.pointed.internal_obj
            if (internalObject != null) {
                return internalObject.asStableRef<InstanceDataHolder>().get()
            } else {
                error("Not an associated instance")
            }
        }
        error("Not an associated type instance")
    }

    fun getInstanceProperties(pointer: COpaquePointer): InstanceProperties {
        val typeInfo = typeInfo(pointer.reinterpret<GTypeInstance>().gType())
        val instanceStruct = pointer.getCustomInstanceStructPointer(typeInfo)

        val ptr = checkNotNull(instanceStruct.pointed.instance_properties) {
            "InstanceProperties does not exist on instance"
        }

        return ptr.asStableRef<InstanceProperties>().get()
    }

    fun typeInfo(gType: GType): CustomTypeInfo<out Object> =
        checkNotNull(TYPE_MAP[gType]) { "gType $gType is not registered" }
}

// TODO rename
private fun COpaquePointer.getCustomInstanceStructPointer(
    typeInfo: CustomTypeInfo<out Object>
): CPointer<gtkknObjectProperties> {
    val rawPointer = this.rawValue.plus(typeInfo.parentInstanceSize)
    return interpretCPointer<gtkknObjectProperties>(rawPointer) as CPointer<gtkknObjectProperties>
}

/**
 * Offset into the full class struct to get the gttknClassStruct.
 */
private fun COpaquePointer.getCustomClassStructPointer(
    typeInfo: CustomTypeInfo<out Object>
): CPointer<gtkknClassStruct> {
    val rawPointer = this.rawValue.plus(typeInfo.parentClassSize)
    return interpretCPointer<gtkknClassStruct>(rawPointer) as CPointer<gtkknClassStruct>
}

/**
 * Class initializer that configures a type class.
 */
private val staticObjectClassInit: GClassInitFunc =
    staticCFunction { gClass: CPointer<GObjectClass>,
        data: COpaquePointer /* stableRef of CustomTypeInfo */ ->

        val typeInfo = data.asStableRef<CustomTypeInfo<out Object>>().get()

        gClass.pointed.dispose = staticObjectDispose.reinterpret()
        gClass.pointed.set_property = staticObjectClassSetProperty.reinterpret()
        gClass.pointed.get_property = staticObjectClassGetProperty.reinterpret()

        val classProperties = typeInfo.classProperties

        // install the properties
        classProperties.installIntoClass(gClass)

        // store the classProperties in the struct
        val customClassStruct = gClass.getCustomClassStructPointer(typeInfo)

        // run user-defined class init
        typeInfo.objectCompanion.classInit(gClass)

        // TODO dispose in class destroy
        customClassStruct.pointed.class_property_store =
            StableRef.create(classProperties).asCPointer()

    }.reinterpret()

private val staticObjectClassSetProperty =
    staticCFunction { instance: CPointer<GObject>,
        propId: UInt,
        value: CPointer<GValue>,
        _: CPointer<GParamSpec> ->
        TypeRegistry.getInstanceProperties(instance).setPropertyValue(propId, Value(value))
    }

private val staticObjectClassGetProperty =
    staticCFunction { instance: CPointer<GObject>,
        propId: UInt,
        value: CPointer<GValue>,
        _: CPointer<GParamSpec> ->
        TypeRegistry.getInstanceProperties(instance).getPropertyValue(propId, Value(value))
    }

/**
 * Instance initializer.
 */
private val staticObjectInstanceInit: GInstanceInitFunc =
    staticCFunction { instance: CPointer<GTypeInstance>,
        _: CPointer<GTypeClass> ->

        val typeInfo = TypeRegistry.typeInfo(instance.gType())
        val instanceProperties = typeInfo.classProperties.newInstanceProperties()

        // store the instance properties into the instance struct
        val instanceStruct = instance.getCustomInstanceStructPointer(typeInfo)
        instanceStruct.pointed.instance_properties =
            StableRef.create(instanceProperties).asCPointer() // TODO dispose in instance dispose

    }.reinterpret()

/**
 * Instance dispose
 */
private val staticObjectDispose = staticCFunction { instance: CPointer<GObject> ->
    val gType = instance.gType()
    val typeInfo = checkNotNull(TypeRegistry.TYPE_MAP[gType])
    val instanceProperties = instance.getCustomInstanceStructPointer(typeInfo)
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

// TODO move these
internal fun CPointer<GTypeInstance>.gType(): GType = checkNotNull(pointed.g_class).pointed.g_type
internal fun CPointer<GObject>.gType(): GType = checkNotNull(pointed.g_type_instance.g_class).pointed.g_type

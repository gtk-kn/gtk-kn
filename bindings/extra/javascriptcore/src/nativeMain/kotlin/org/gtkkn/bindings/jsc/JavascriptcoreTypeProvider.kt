// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.jsc

import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.KGType
import org.gtkkn.extensions.gobject.TypeProvider
import kotlin.collections.Map
import kotlin.reflect.KClass

public object JavascriptcoreTypeProvider : TypeProvider {
    override val typeMap: Map<KClass<*>, KGType<*>> = buildMap {
        if (getTypeOrNull("jsc_class_get_type") != null) put(Class::class, Class.type)
        if (getTypeOrNull("jsc_context_get_type") != null) put(Context::class, Context.type)
        if (getTypeOrNull("jsc_exception_get_type") != null) put(Exception::class, Exception.type)
        if (getTypeOrNull("jsc_value_get_type") != null) put(Value::class, Value.type)
        if (getTypeOrNull("jsc_virtual_machine_get_type") != null) put(VirtualMachine::class, VirtualMachine.type)
        if (getTypeOrNull("jsc_weak_value_get_type") != null) put(WeakValue::class, WeakValue.type)
    }
}

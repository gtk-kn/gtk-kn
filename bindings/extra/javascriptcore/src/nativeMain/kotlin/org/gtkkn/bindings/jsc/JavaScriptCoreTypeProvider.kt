// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.jsc

import org.gtkkn.extensions.gobject.legacy.KGType
import org.gtkkn.extensions.gobject.legacy.TypeProvider
import kotlin.collections.Map
import kotlin.reflect.KClass

public object JavaScriptCoreTypeProvider : TypeProvider {
    override val typeMap: Map<KClass<*>, KGType<*>> = buildMap {
        if (Class.getTypeOrNull() != null) put(Class::class, Class.type)
        if (Context.getTypeOrNull() != null) put(Context::class, Context.type)
        if (Exception.getTypeOrNull() != null) put(Exception::class, Exception.type)
        if (Value.getTypeOrNull() != null) put(Value::class, Value.type)
        if (VirtualMachine.getTypeOrNull() != null) put(VirtualMachine::class, VirtualMachine.type)
        if (WeakValue.getTypeOrNull() != null) put(WeakValue::class, WeakValue.type)
    }
}

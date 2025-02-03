// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gobject

import org.gtkkn.extensions.gobject.legacy.KGType
import org.gtkkn.extensions.gobject.legacy.TypeProvider
import kotlin.collections.Map
import kotlin.reflect.KClass

public object GObjectTypeProvider : TypeProvider {
    override val typeMap: Map<KClass<*>, KGType<*>> = buildMap {
        if (Binding.getTypeOrNull() != null) put(Binding::class, Binding.type)
        if (BindingGroup.getTypeOrNull() != null) put(BindingGroup::class, BindingGroup.type)
        if (InitiallyUnowned.getTypeOrNull() != null) put(InitiallyUnowned::class, InitiallyUnowned.type)
        if (Object.getTypeOrNull() != null) put(Object::class, Object.type)
        if (SignalGroup.getTypeOrNull() != null) put(SignalGroup::class, SignalGroup.type)
        if (TypeModule.getTypeOrNull() != null) put(TypeModule::class, TypeModule.type)
        if (TypePlugin.getTypeOrNull() != null) put(TypePlugin::class, TypePlugin.type)
    }
}

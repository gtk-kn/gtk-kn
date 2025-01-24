// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gobject

import org.gtkkn.extensions.gobject.KGType
import org.gtkkn.extensions.gobject.TypeProvider
import kotlin.collections.Map
import kotlin.reflect.KClass

public object GobjectTypeProvider : TypeProvider {
    override val typeMap: Map<KClass<*>, KGType<*>> = mapOf(
        Binding::class to Binding.type,
        BindingGroup::class to BindingGroup.type,
        InitiallyUnowned::class to InitiallyUnowned.type,
        Object::class to Object.type,
        SignalGroup::class to SignalGroup.type,
        TypeModule::class to TypeModule.type,
        TypePlugin::class to TypePlugin.type,
    )
}

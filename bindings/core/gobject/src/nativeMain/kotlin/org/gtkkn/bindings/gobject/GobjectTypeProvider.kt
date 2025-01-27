// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gobject

import org.gtkkn.extensions.glib.cinterop.getTypeOrNull
import org.gtkkn.extensions.gobject.KGType
import org.gtkkn.extensions.gobject.TypeProvider
import kotlin.collections.Map
import kotlin.reflect.KClass

public object GobjectTypeProvider : TypeProvider {
    override val typeMap: Map<KClass<*>, KGType<*>> = buildMap {
        if (getTypeOrNull("g_binding_get_type") != null) put(Binding::class, Binding.type)
        if (getTypeOrNull("g_binding_group_get_type") != null) put(BindingGroup::class, BindingGroup.type)
        if (getTypeOrNull("g_initially_unowned_get_type") != null) put(InitiallyUnowned::class, InitiallyUnowned.type)
        if (getTypeOrNull("g_object_get_type") != null) put(Object::class, Object.type)
        if (getTypeOrNull("g_signal_group_get_type") != null) put(SignalGroup::class, SignalGroup.type)
        if (getTypeOrNull("g_type_module_get_type") != null) put(TypeModule::class, TypeModule.type)
        if (getTypeOrNull("g_type_plugin_get_type") != null) put(TypePlugin::class, TypePlugin.type)
    }
}

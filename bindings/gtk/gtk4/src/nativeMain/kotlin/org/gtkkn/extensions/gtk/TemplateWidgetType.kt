/*
 * Copyright (c) 2025 gtk-kn
 *
 * SPDX-License-Identifier: LGPL-2.1-or-later
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, see <http://www.gnu.org/licenses/>.
 */

package org.gtkkn.extensions.gtk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.glib.ext.asGBoolean
import org.gtkkn.extensions.gobject.legacy.KGType
import org.gtkkn.extensions.gobject.legacy.ObjectType
import org.gtkkn.native.gobject.GObjectClass
import org.gtkkn.native.gtk.gtk_widget_class_bind_template_child_full
import org.gtkkn.native.gtk.gtk_widget_class_set_template_from_resource
import org.gtkkn.native.gtk.gtk_widget_init_template
import kotlin.reflect.KClass

/**
 * Companion object base class used for deriving [Widget] subclasses that make use of
 * widget templates.
 *
 * This is a specialization of [ObjectType] that takes care of:
 * - registering the widget template during class init
 * - binding the template children during class init
 * - initializing the template on new instance creation
 *
 * ## Example usage
 *
 * This example shows the definition of an `ExampleWidget` class that extends the `Box` widget.
 * The companion object constructor takes the template id as a constructor argument.
 *
 * The body of the companion object uses [templateChild] to register all template children that can be accessed
 * by instances of this class.
 *
 * The body of `ExampleWidget` uses delegates from its `Type` companion to access the child widgets.
 *
 * ```
 * class ExampleWidget : Box(newInstancePointer()) {
 *     val entry by Type.entry
 *     val button by Type.button
 *
 *     companion object Type : TemplateWidgetType<ExampleWidget>(
 *         ExampleWidget::class, Box.type, "/ui/examplewidget.ui"
 *     ) {
 *         val entry by templateChild<Entry>()
 *         val button by templateChild<Button>()
 *     }
 * }
 * ```
 *
 * ```
 * /* /ui/examplewidget.ui */
 * <interface>
 *     <template class="ExampleWidget" parent="GtkBox">
 *         <child>
 *             <object class="GtkEntry" id="entry">
 *             </object>
 *         </child>
 *         <child>
 *             <object class="GtkButton" id="button">
 *                 <property name="label">Hello</property>
 *             </object>
 *         </child>
 *     </template>
 * </interface>
 * ```
 *
 * See [Widget Templates](https://developer.gnome.org/documentation/tutorials/widget-templates.html) for more info.
 */
public open class TemplateWidgetType<T : Widget>(
    typeClass: KClass<T>,
    parentType: KGType<Widget>,
    private val templateId: String,
) : ObjectType<T>(
    typeClass,
    parentType,
) {
    private var sealed: Boolean = false

    internal val templateChildNames = mutableListOf<String>()

    @PublishedApi
    internal fun isSealed(): Boolean = sealed

    override fun classInit(objectClass: CPointer<GObjectClass>) {
        super.classInit(objectClass)

        // set the template to use for this widget
        gtk_widget_class_set_template_from_resource(objectClass.reinterpret(), templateId)

        // bind all the known child names so we can use them in the instance
        for (childName in templateChildNames) {
            gtk_widget_class_bind_template_child_full(objectClass.reinterpret(), childName, false.asGBoolean(), 0)
        }

        sealed = true
    }

    public override fun <T : CPointed> newInstancePointer(): CPointer<T> =
        super.newInstancePointer<T>().also {
            // init widget template on each new instance
            gtk_widget_init_template(it.reinterpret())
        }

    public inline fun <reified CHILD_TYPE : Object> templateChild(name: String? = null):
        TemplateChildDelegateProvider<T, CHILD_TYPE> {
        require(!isSealed()) { "templateChild cannot be used after class registration" }
        return TemplateChildDelegateProvider(name, CHILD_TYPE::class)
    }
}

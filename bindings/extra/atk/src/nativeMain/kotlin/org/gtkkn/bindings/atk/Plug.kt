// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.atk.annotations.AtkVersion1_30
import org.gtkkn.bindings.atk.annotations.AtkVersion2_35_0
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.atk.AtkComponent
import org.gtkkn.native.atk.AtkPlug
import org.gtkkn.native.atk.atk_plug_get_id
import org.gtkkn.native.atk.atk_plug_get_type
import org.gtkkn.native.atk.atk_plug_new
import org.gtkkn.native.atk.atk_plug_set_child
import kotlin.String
import kotlin.Unit

/**
 * Toplevel for embedding into other processes
 *
 * See [class@AtkSocket]
 */
public open class Plug(
    pointer: CPointer<AtkPlug>,
) : Object(pointer.reinterpret()),
    Component,
    KGTyped {
    public val atkPlugPointer: CPointer<AtkPlug>
        get() = gPointer.reinterpret()

    override val atkComponentPointer: CPointer<AtkComponent>
        get() = gPointer.reinterpret()

    /**
     * Creates a new #AtkPlug instance.
     *
     * @return the newly created #AtkPlug
     * @since 1.30
     */
    public constructor() : this(atk_plug_new()!!.reinterpret())

    /**
     * Gets the unique ID of an #AtkPlug object, which can be used to
     * embed inside of an #AtkSocket using atk_socket_embed().
     *
     * Internally, this calls a class function that should be registered
     * by the IPC layer (usually at-spi2-atk). The implementor of an
     * #AtkPlug object should call this function (after atk-bridge is
     * loaded) and pass the value to the process implementing the
     * #AtkSocket, so it could embed the plug.
     *
     * @return the unique ID for the plug
     * @since 1.30
     */
    @AtkVersion1_30
    public open fun getId(): String =
        atk_plug_get_id(atkPlugPointer.reinterpret())?.toKString() ?: error("Expected not null string")

    /**
     * Sets @child as accessible child of @plug and @plug as accessible parent of
     * @child. @child can be NULL.
     *
     * In some cases, one can not use the AtkPlug type directly as accessible
     * object for the toplevel widget of the application. For instance in the gtk
     * case, GtkPlugAccessible can not inherit both from GtkWindowAccessible and
     * from AtkPlug. In such a case, one can create, in addition to the standard
     * accessible object for the toplevel widget, an AtkPlug object, and make the
     * former the child of the latter by calling atk_plug_set_child().
     *
     * @param child an #AtkObject to be set as accessible child of @plug.
     * @since 2.35.0
     */
    @AtkVersion2_35_0
    public open fun setChild(child: Object): Unit =
        atk_plug_set_child(atkPlugPointer.reinterpret(), child.atkObjectPointer.reinterpret())

    public companion object : TypeCompanion<Plug> {
        override val type: GeneratedClassKGType<Plug> =
            GeneratedClassKGType(atk_plug_get_type()) { Plug(it.reinterpret()) }

        init {
            AtkTypeProvider.register()
        }
    }
}

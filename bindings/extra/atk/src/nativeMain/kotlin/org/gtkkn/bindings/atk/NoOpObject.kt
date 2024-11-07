// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.atk.AtkAction
import org.gtkkn.native.atk.AtkComponent
import org.gtkkn.native.atk.AtkDocument
import org.gtkkn.native.atk.AtkEditableText
import org.gtkkn.native.atk.AtkHypertext
import org.gtkkn.native.atk.AtkImage
import org.gtkkn.native.atk.AtkNoOpObject
import org.gtkkn.native.atk.AtkSelection
import org.gtkkn.native.atk.AtkTable
import org.gtkkn.native.atk.AtkTableCell
import org.gtkkn.native.atk.AtkText
import org.gtkkn.native.atk.AtkValue
import org.gtkkn.native.atk.AtkWindow
import org.gtkkn.native.atk.atk_no_op_object_get_type
import org.gtkkn.native.atk.atk_no_op_object_new

/**
 * An AtkObject which purports to implement all ATK interfaces.
 *
 * An AtkNoOpObject is an AtkObject which purports to implement all
 * ATK interfaces. It is the type of AtkObject which is created if an
 * accessible object is requested for an object type for which no
 * factory type is specified.
 */
public open class NoOpObject(
    pointer: CPointer<AtkNoOpObject>,
) : Object(pointer.reinterpret()),
    Action,
    Component,
    Document,
    EditableText,
    Hypertext,
    Image,
    Selection,
    Table,
    TableCell,
    Text,
    Value,
    Window,
    KGTyped {
    public val atkNoOpObjectPointer: CPointer<AtkNoOpObject>
        get() = gPointer.reinterpret()

    override val atkActionPointer: CPointer<AtkAction>
        get() = gPointer.reinterpret()

    override val atkComponentPointer: CPointer<AtkComponent>
        get() = gPointer.reinterpret()

    override val atkDocumentPointer: CPointer<AtkDocument>
        get() = gPointer.reinterpret()

    override val atkEditableTextPointer: CPointer<AtkEditableText>
        get() = gPointer.reinterpret()

    override val atkHypertextPointer: CPointer<AtkHypertext>
        get() = gPointer.reinterpret()

    override val atkImagePointer: CPointer<AtkImage>
        get() = gPointer.reinterpret()

    override val atkSelectionPointer: CPointer<AtkSelection>
        get() = gPointer.reinterpret()

    override val atkTablePointer: CPointer<AtkTable>
        get() = gPointer.reinterpret()

    override val atkTableCellPointer: CPointer<AtkTableCell>
        get() = gPointer.reinterpret()

    override val atkTextPointer: CPointer<AtkText>
        get() = gPointer.reinterpret()

    override val atkValuePointer: CPointer<AtkValue>
        get() = gPointer.reinterpret()

    override val atkWindowPointer: CPointer<AtkWindow>
        get() = gPointer.reinterpret()

    /**
     * Provides a default (non-functioning stub) #AtkObject.
     * Application maintainers should not use this method.
     *
     * @param obj a #GObject
     * @return a default (non-functioning stub) #AtkObject
     */
    public constructor(
        obj: org.gtkkn.bindings.gobject.Object,
    ) : this(atk_no_op_object_new(obj.gPointer.reinterpret())!!.reinterpret())

    public companion object : TypeCompanion<NoOpObject> {
        override val type: GeneratedClassKGType<NoOpObject> =
            GeneratedClassKGType(atk_no_op_object_get_type()) { NoOpObject(it.reinterpret()) }

        init {
            AtkTypeProvider.register()
        }
    }
}

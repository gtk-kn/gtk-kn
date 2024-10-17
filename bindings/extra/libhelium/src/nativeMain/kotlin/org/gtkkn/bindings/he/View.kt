// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.bindings.gtk.Builder
import org.gtkkn.bindings.gtk.Stack
import org.gtkkn.bindings.gtk.Widget
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.common.asGBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gtk.GtkBuildable
import org.gtkkn.native.he.HeView
import org.gtkkn.native.he.he_view_add
import org.gtkkn.native.he.he_view_add_child
import org.gtkkn.native.he.he_view_get_has_margins
import org.gtkkn.native.he.he_view_get_stack
import org.gtkkn.native.he.he_view_get_subtitle
import org.gtkkn.native.he.he_view_get_title
import org.gtkkn.native.he.he_view_get_type
import org.gtkkn.native.he.he_view_set_has_margins
import org.gtkkn.native.he.he_view_set_stack
import org.gtkkn.native.he.he_view_set_subtitle
import org.gtkkn.native.he.he_view_set_title
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `title`: Property has no getter nor setter
 * - method `stack`: Property has no getter nor setter
 * - method `subtitle`: Property has no getter nor setter
 * - method `has-margins`: Property has no getter nor setter
 */
public open class View(
    pointer: CPointer<HeView>,
) : Widget(pointer.reinterpret()), KGTyped {
    public val heViewPointer: CPointer<HeView>
        get() = gPointer.reinterpret()

    override val gtkBuildablePointer: CPointer<GtkBuildable>
        get() = gPointer.reinterpret()

    public open fun getTitle(): String =
        he_view_get_title(heViewPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setTitle(`value`: String): Unit =
        he_view_set_title(
            heViewPointer.reinterpret(),
            `value`
        )

    public open fun getStack(): Stack =
        he_view_get_stack(heViewPointer.reinterpret())!!.run {
            Stack(reinterpret())
        }

    /**
     *
     *
     * @param value
     */
    public open fun setStack(`value`: Stack): Unit =
        he_view_set_stack(
            heViewPointer.reinterpret(),
            `value`.gtkStackPointer.reinterpret()
        )

    public open fun getSubtitle(): String =
        he_view_get_subtitle(heViewPointer.reinterpret())?.toKString()
            ?: error("Expected not null string")

    /**
     *
     *
     * @param value
     */
    public open fun setSubtitle(`value`: String): Unit = he_view_set_subtitle(heViewPointer.reinterpret(), `value`)

    public open fun getHasMargins(): Boolean = he_view_get_has_margins(heViewPointer.reinterpret()).asBoolean()

    /**
     *
     *
     * @param value
     */
    public open fun setHasMargins(`value`: Boolean): Unit =
        he_view_set_has_margins(heViewPointer.reinterpret(), `value`.asGBoolean())

    /**
     *
     *
     * @param builder
     * @param child
     * @param type
     */
    public open fun addChild(
        builder: Builder,
        child: Object,
        type: String?,
    ): Unit =
        he_view_add_child(
            heViewPointer.reinterpret(),
            builder.gtkBuilderPointer.reinterpret(),
            child.gPointer.reinterpret(),
            type
        )

    /**
     *
     *
     * @param widget
     */
    public open fun add(widget: Widget): Unit =
        he_view_add(
            heViewPointer.reinterpret(),
            widget.gtkWidgetPointer.reinterpret()
        )

    public companion object : TypeCompanion<View> {
        override val type: GeneratedClassKGType<View> =
            GeneratedClassKGType(he_view_get_type()) {
                View(it.reinterpret())
            }

        init {
            HeTypeProvider.register()
        }
    }
}

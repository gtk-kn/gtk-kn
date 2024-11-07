// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.atk.annotations.AtkVersion1_12
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.atk.AtkHyperlinkImpl
import org.gtkkn.native.atk.atk_hyperlink_impl_get_hyperlink
import org.gtkkn.native.atk.atk_hyperlink_impl_get_type

/**
 * A queryable interface which allows AtkHyperlink instances
 * associated with an AtkObject to be obtained.  AtkHyperlinkImpl
 * corresponds to AT-SPI's Hyperlink interface, and differs from
 * AtkHyperlink in that AtkHyperlink is an object type, rather than an
 * interface, and thus cannot be directly queried. FTW
 */
public interface HyperlinkImpl :
    Interface,
    KGTyped {
    public val atkHyperlinkImplPointer: CPointer<AtkHyperlinkImpl>

    /**
     * Gets the hyperlink associated with this object.
     *
     * @return an AtkHyperlink object which points to this
     * implementing AtkObject.
     * @since 1.12
     */
    @AtkVersion1_12
    public fun getHyperlink(): Hyperlink =
        atk_hyperlink_impl_get_hyperlink(atkHyperlinkImplPointer.reinterpret())!!.run {
            Hyperlink(reinterpret())
        }

    private data class Wrapper(
        private val pointer: CPointer<AtkHyperlinkImpl>,
    ) : HyperlinkImpl {
        override val atkHyperlinkImplPointer: CPointer<AtkHyperlinkImpl> = pointer
    }

    public companion object : TypeCompanion<HyperlinkImpl> {
        override val type: GeneratedInterfaceKGType<HyperlinkImpl> =
            GeneratedInterfaceKGType(atk_hyperlink_impl_get_type()) { Wrapper(it.reinterpret()) }

        init {
            AtkTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<AtkHyperlinkImpl>): HyperlinkImpl = Wrapper(pointer)
    }
}

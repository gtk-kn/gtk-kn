// This is a generated file. Do not modify.
package org.gtkkn.bindings.he

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.he.HeTabPage
import org.gtkkn.native.he.he_tab_page_get_tab
import org.gtkkn.native.he.he_tab_page_get_type
import org.gtkkn.native.he.he_tab_page_new
import org.gtkkn.native.he.he_tab_page_set_tab
import kotlin.Unit

/**
 * ## Skipped during bindings generation
 *
 * - method `tab`: Property has no getter nor setter
 */
public open class TabPage(
    pointer: CPointer<HeTabPage>,
) : Bin(pointer.reinterpret()), KGTyped {
    public val heTabPagePointer: CPointer<HeTabPage>
        get() = gPointer.reinterpret()

    /**
     *
     *
     * @param tab
     */
    public constructor(tab: Tab) :
        this(he_tab_page_new(tab.heTabPointer.reinterpret())!!.reinterpret())

    public open fun getTab(): Tab =
        he_tab_page_get_tab(heTabPagePointer.reinterpret())!!.run {
            Tab(reinterpret())
        }

    /**
     *
     *
     * @param value
     */
    public open fun setTab(`value`: Tab): Unit =
        he_tab_page_set_tab(
            heTabPagePointer.reinterpret(),
            `value`.heTabPointer.reinterpret()
        )

    public companion object : TypeCompanion<TabPage> {
        override val type: GeneratedClassKGType<TabPage> =
            GeneratedClassKGType(he_tab_page_get_type()) { TabPage(it.reinterpret()) }

        init {
            HeTypeProvider.register()
        }
    }
}

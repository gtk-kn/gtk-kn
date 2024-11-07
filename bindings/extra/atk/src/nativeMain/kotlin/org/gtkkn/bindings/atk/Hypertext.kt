// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.glib.Interface
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedInterfaceKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.atk.AtkHypertext
import org.gtkkn.native.atk.atk_hypertext_get_link
import org.gtkkn.native.atk.atk_hypertext_get_link_index
import org.gtkkn.native.atk.atk_hypertext_get_n_links
import org.gtkkn.native.atk.atk_hypertext_get_type
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.Int
import kotlin.ULong
import kotlin.Unit

/**
 * The ATK interface which provides standard mechanism for manipulating hyperlinks.
 *
 * An interface used for objects which implement linking between
 * multiple resource or content locations, or multiple 'markers'
 * within a single document.  A Hypertext instance is associated with
 * one or more Hyperlinks, which are associated with particular
 * offsets within the Hypertext's included content.  While this
 * interface is derived from Text, there is no requirement that
 * Hypertext instances have textual content; they may implement Image
 * as well, and Hyperlinks need not have non-zero text offsets.
 */
public interface Hypertext :
    Interface,
    KGTyped {
    public val atkHypertextPointer: CPointer<AtkHypertext>

    /**
     * Gets the link in this hypertext document at index
     * @link_index
     *
     * @param linkIndex an integer specifying the desired link
     * @return the link in this hypertext document at
     * index @link_index
     */
    public fun getLink(linkIndex: Int): Hyperlink =
        atk_hypertext_get_link(atkHypertextPointer.reinterpret(), linkIndex)!!.run {
            Hyperlink(reinterpret())
        }

    /**
     * Gets the index into the array of hyperlinks that is associated with
     * the character specified by @char_index.
     *
     * @param charIndex a character index
     * @return an index into the array of hyperlinks in @hypertext,
     * or -1 if there is no hyperlink associated with this character.
     */
    public fun getLinkIndex(charIndex: Int): Int =
        atk_hypertext_get_link_index(atkHypertextPointer.reinterpret(), charIndex)

    /**
     * Gets the number of links within this hypertext document.
     *
     * @return the number of links within this hypertext document
     */
    public fun getNLinks(): Int = atk_hypertext_get_n_links(atkHypertextPointer.reinterpret())

    /**
     * The "link-selected" signal is emitted by an AtkHyperText
     * object when one of the hyperlinks associated with the object
     * is selected.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect. Params: `arg1` the index of the hyperlink which is selected
     */
    public fun connectLinkSelected(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: (arg1: Int) -> Unit,
    ): ULong =
        g_signal_connect_data(
            atkHypertextPointer.reinterpret(),
            "link-selected",
            connectLinkSelectedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    private data class Wrapper(
        private val pointer: CPointer<AtkHypertext>,
    ) : Hypertext {
        override val atkHypertextPointer: CPointer<AtkHypertext> = pointer
    }

    public companion object : TypeCompanion<Hypertext> {
        override val type: GeneratedInterfaceKGType<Hypertext> =
            GeneratedInterfaceKGType(atk_hypertext_get_type()) { Wrapper(it.reinterpret()) }

        init {
            AtkTypeProvider.register()
        }

        public fun wrap(pointer: CPointer<AtkHypertext>): Hypertext = Wrapper(pointer)
    }
}

private val connectLinkSelectedFunc: CPointer<CFunction<(Int) -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            arg1: Int,
            userData: COpaquePointer,
        ->
        userData.asStableRef<(arg1: Int) -> Unit>().get().invoke(arg1)
    }.reinterpret()

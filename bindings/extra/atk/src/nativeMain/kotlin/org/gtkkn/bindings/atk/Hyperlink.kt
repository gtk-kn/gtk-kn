// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.StableRef
import kotlinx.cinterop.asStableRef
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.staticCFunction
import kotlinx.cinterop.toKString
import org.gtkkn.bindings.atk.annotations.AtkVersion1_4
import org.gtkkn.bindings.gobject.ConnectFlags
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.glib.staticStableRefDestroy
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.atk.AtkAction
import org.gtkkn.native.atk.AtkHyperlink
import org.gtkkn.native.atk.atk_hyperlink_get_end_index
import org.gtkkn.native.atk.atk_hyperlink_get_n_anchors
import org.gtkkn.native.atk.atk_hyperlink_get_object
import org.gtkkn.native.atk.atk_hyperlink_get_start_index
import org.gtkkn.native.atk.atk_hyperlink_get_type
import org.gtkkn.native.atk.atk_hyperlink_get_uri
import org.gtkkn.native.atk.atk_hyperlink_is_inline
import org.gtkkn.native.atk.atk_hyperlink_is_selected_link
import org.gtkkn.native.atk.atk_hyperlink_is_valid
import org.gtkkn.native.gobject.g_signal_connect_data
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.ULong
import kotlin.Unit

/**
 * An ATK object which encapsulates a link or set of links in a hypertext document.
 *
 * An ATK object which encapsulates a link or set of links (for
 * instance in the case of client-side image maps) in a hypertext
 * document.  It may implement the AtkAction interface.  AtkHyperlink
 * may also be used to refer to inline embedded content, since it
 * allows specification of a start and end offset within the host
 * AtkHypertext object.
 *
 * ## Skipped during bindings generation
 *
 * - method `number-of-anchors`: Property has no getter nor setter
 * - method `selected-link`: Property has no getter nor setter
 */
public open class Hyperlink(
    pointer: CPointer<AtkHyperlink>,
) : org.gtkkn.bindings.gobject.Object(pointer.reinterpret()),
    Action,
    KGTyped {
    public val atkHyperlinkPointer: CPointer<AtkHyperlink>
        get() = gPointer.reinterpret()

    override val atkActionPointer: CPointer<AtkAction>
        get() = gPointer.reinterpret()

    public open val endIndex: Int
        /**
         * Gets the index with the hypertext document at which this link ends.
         *
         * @return the index with the hypertext document at which this link ends
         */
        get() = atk_hyperlink_get_end_index(atkHyperlinkPointer.reinterpret())

    public open val startIndex: Int
        /**
         * Gets the index with the hypertext document at which this link begins.
         *
         * @return the index with the hypertext document at which this link begins
         */
        get() = atk_hyperlink_get_start_index(atkHyperlinkPointer.reinterpret())

    /**
     * Gets the index with the hypertext document at which this link ends.
     *
     * @return the index with the hypertext document at which this link ends
     */
    public open fun getEndIndex(): Int = atk_hyperlink_get_end_index(atkHyperlinkPointer.reinterpret())

    /**
     * Gets the number of anchors associated with this hyperlink.
     *
     * @return the number of anchors associated with this hyperlink
     */
    public open fun getNAnchors(): Int = atk_hyperlink_get_n_anchors(atkHyperlinkPointer.reinterpret())

    /**
     * Returns the item associated with this hyperlinks nth anchor.
     * For instance, the returned #AtkObject will implement #AtkText
     * if @link_ is a text hyperlink, #AtkImage if @link_ is an image
     * hyperlink etc.
     *
     * Multiple anchors are primarily used by client-side image maps.
     *
     * @param i a (zero-index) integer specifying the desired anchor
     * @return an #AtkObject associated with this hyperlinks
     * i-th anchor
     */
    public open fun getObject(i: Int): Object =
        atk_hyperlink_get_object(atkHyperlinkPointer.reinterpret(), i)!!.run {
            Object(reinterpret())
        }

    /**
     * Gets the index with the hypertext document at which this link begins.
     *
     * @return the index with the hypertext document at which this link begins
     */
    public open fun getStartIndex(): Int = atk_hyperlink_get_start_index(atkHyperlinkPointer.reinterpret())

    /**
     * Get a the URI associated with the anchor specified
     * by @i of @link_.
     *
     * Multiple anchors are primarily used by client-side image maps.
     *
     * @param i a (zero-index) integer specifying the desired anchor
     * @return a string specifying the URI
     */
    public open fun getUri(i: Int): String =
        atk_hyperlink_get_uri(atkHyperlinkPointer.reinterpret(), i)?.toKString() ?: error("Expected not null string")

    /**
     * Indicates whether the link currently displays some or all of its
     *           content inline.  Ordinary HTML links will usually return
     *           false, but an inline `&lt;`src`&gt;` HTML element will return
     *           true.
     *
     * @return whether or not this link displays its content inline.
     */
    public open fun isInline(): Boolean = atk_hyperlink_is_inline(atkHyperlinkPointer.reinterpret()).asBoolean()

    /**
     * Determines whether this AtkHyperlink is selected
     *
     * @return True if the AtkHyperlink is selected, False otherwise
     * @since 1.4
     */
    @AtkVersion1_4
    public open fun isSelectedLink(): Boolean =
        atk_hyperlink_is_selected_link(atkHyperlinkPointer.reinterpret()).asBoolean()

    /**
     * Since the document that a link is associated with may have changed
     * this method returns true if the link is still valid (with
     * respect to the document it references) and false otherwise.
     *
     * @return whether or not this link is still valid
     */
    public open fun isValid(): Boolean = atk_hyperlink_is_valid(atkHyperlinkPointer.reinterpret()).asBoolean()

    /**
     * The signal link-activated is emitted when a link is activated.
     *
     * @param connectFlags A combination of [ConnectFlags]
     * @param handler the Callback to connect
     */
    public fun connectLinkActivated(
        connectFlags: ConnectFlags = ConnectFlags(0u),
        handler: () -> Unit,
    ): ULong =
        g_signal_connect_data(
            gPointer.reinterpret(),
            "link-activated",
            connectLinkActivatedFunc.reinterpret(),
            StableRef.create(handler).asCPointer(),
            staticStableRefDestroy.reinterpret(),
            connectFlags.mask
        )

    public companion object : TypeCompanion<Hyperlink> {
        override val type: GeneratedClassKGType<Hyperlink> =
            GeneratedClassKGType(atk_hyperlink_get_type()) { Hyperlink(it.reinterpret()) }

        init {
            AtkTypeProvider.register()
        }
    }
}

private val connectLinkActivatedFunc: CPointer<CFunction<() -> Unit>> =
    staticCFunction {
            _: COpaquePointer,
            userData: COpaquePointer,
        ->
        userData.asStableRef<() -> Unit>().get().invoke()
    }.reinterpret()

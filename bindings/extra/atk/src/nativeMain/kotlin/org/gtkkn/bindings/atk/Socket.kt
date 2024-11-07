// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.atk.annotations.AtkVersion1_30
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.atk.AtkComponent
import org.gtkkn.native.atk.AtkSocket
import org.gtkkn.native.atk.atk_socket_embed
import org.gtkkn.native.atk.atk_socket_get_type
import org.gtkkn.native.atk.atk_socket_is_occupied
import org.gtkkn.native.atk.atk_socket_new
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Container for AtkPlug objects from other processes
 *
 * Together with #AtkPlug, #AtkSocket provides the ability to embed
 * accessibles from one process into another in a fashion that is
 * transparent to assistive technologies. #AtkSocket works as the
 * container of #AtkPlug, embedding it using the method
 * atk_socket_embed(). Any accessible contained in the #AtkPlug will
 * appear to the assistive technologies as being inside the
 * application that created the #AtkSocket.
 *
 * The communication between a #AtkSocket and a #AtkPlug is done by
 * the IPC layer of the accessibility framework, normally implemented
 * by the D-Bus based implementation of AT-SPI (at-spi2). If that is
 * the case, at-spi-atk2 is the responsible to implement the abstract
 * methods atk_plug_get_id() and atk_socket_embed(), so an ATK
 * implementor shouldn't reimplement them. The process that contains
 * the #AtkPlug is responsible to send the ID returned by
 * atk_plug_id() to the process that contains the #AtkSocket, so it
 * could call the method atk_socket_embed() in order to embed it.
 *
 * For the same reasons, an implementor doesn't need to implement
 * atk_object_get_n_accessible_children() and
 * atk_object_ref_accessible_child(). All the logic related to those
 * functions will be implemented by the IPC layer.
 *
 * See [class@AtkPlug]
 */
public open class Socket(
    pointer: CPointer<AtkSocket>,
) : Object(pointer.reinterpret()),
    Component,
    KGTyped {
    public val atkSocketPointer: CPointer<AtkSocket>
        get() = gPointer.reinterpret()

    override val atkComponentPointer: CPointer<AtkComponent>
        get() = gPointer.reinterpret()

    /**
     * Creates a new #AtkSocket.
     *
     * @return the newly created #AtkSocket instance
     */
    public constructor() : this(atk_socket_new()!!.reinterpret())

    /**
     * Embeds the children of an #AtkPlug as the children of the
     * #AtkSocket. The plug may be in the same process or in a different
     * process.
     *
     * The class item used by this function should be filled in by the IPC
     * layer (usually at-spi2-atk). The implementor of the AtkSocket
     * should call this function and pass the id for the plug as returned
     * by atk_plug_get_id().  It is the responsibility of the application
     * to pass the plug id on to the process implementing the #AtkSocket
     * as needed.
     *
     * @param plugId the ID of an #AtkPlug
     * @since 1.30
     */
    @AtkVersion1_30
    public open fun embed(plugId: String): Unit = atk_socket_embed(atkSocketPointer.reinterpret(), plugId)

    /**
     * Determines whether or not the socket has an embedded plug.
     *
     * @return TRUE if a plug is embedded in the socket
     * @since 1.30
     */
    @AtkVersion1_30
    public open fun isOccupied(): Boolean = atk_socket_is_occupied(atkSocketPointer.reinterpret()).asBoolean()

    public companion object : TypeCompanion<Socket> {
        override val type: GeneratedClassKGType<Socket> =
            GeneratedClassKGType(atk_socket_get_type()) { Socket(it.reinterpret()) }

        init {
            AtkTypeProvider.register()
        }
    }
}

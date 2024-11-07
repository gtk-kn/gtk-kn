// This is a generated file. Do not modify.
package org.gtkkn.bindings.atk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.toKString
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.atk.AtkKeyEventStruct
import kotlin.Int
import kotlin.String
import kotlin.UInt
import kotlin.UShort

/**
 * Encapsulates information about a key event.
 */
public class KeyEventStruct(
    pointer: CPointer<AtkKeyEventStruct>,
) : Record {
    public val atkKeyEventStructPointer: CPointer<AtkKeyEventStruct> = pointer

    /**
     * An AtkKeyEventType, generally one of ATK_KEY_EVENT_PRESS or ATK_KEY_EVENT_RELEASE
     */
    public var type: Int
        get() = atkKeyEventStructPointer.pointed.type
        set(`value`) {
            atkKeyEventStructPointer.pointed.type = value
        }

    /**
     * A bitmask representing the state of the modifier keys immediately after the event takes place.
     * The meaning of the bits is currently defined to match the bitmask used by GDK in
     * GdkEventType.state, see
     * http://developer.gnome.org/doc/API/2.0/gdk/gdk-Event-Structures.html#GdkEventKey
     */
    public var state: UInt
        get() = atkKeyEventStructPointer.pointed.state
        set(`value`) {
            atkKeyEventStructPointer.pointed.state = value
        }

    /**
     * A guint representing a keysym value corresponding to those used by GDK and X11: see
     * /usr/X11/include/keysymdef.h.
     */
    public var keyval: UInt
        get() = atkKeyEventStructPointer.pointed.keyval
        set(`value`) {
            atkKeyEventStructPointer.pointed.keyval = value
        }

    /**
     * The length of member #string.
     */
    public var length: Int
        get() = atkKeyEventStructPointer.pointed.length
        set(`value`) {
            atkKeyEventStructPointer.pointed.length = value
        }

    /**
     * A string containing one of the following: either a string approximating the text that would
     * result from this keypress, if the key is a control or graphic character, or a symbolic name for this keypress.
     * Alphanumeric and printable keys will have the symbolic key name in this string member, for instance "A". "0",
     * "semicolon", "aacute".  Keypad keys have the prefix "KP".
     *
     * Note: this property is writeable but the setter binding is not supported yet.
     */
    public val string: String?
        get() = atkKeyEventStructPointer.pointed.string?.toKString()

    /**
     * The raw hardware code that generated the key event.  This field is raraly useful.
     */
    public var keycode: UShort
        get() = atkKeyEventStructPointer.pointed.keycode
        set(`value`) {
            atkKeyEventStructPointer.pointed.keycode = value
        }

    /**
     * A timestamp in milliseconds indicating when the event occurred.
     * These timestamps are relative to a starting point which should be considered arbitrary,
     * and only used to compare the dispatch times of events to one another.
     */
    public var timestamp: UInt
        get() = atkKeyEventStructPointer.pointed.timestamp
        set(`value`) {
            atkKeyEventStructPointer.pointed.timestamp = value
        }

    public companion object : RecordCompanion<KeyEventStruct, AtkKeyEventStruct> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): KeyEventStruct =
            KeyEventStruct(pointer.reinterpret())
    }
}

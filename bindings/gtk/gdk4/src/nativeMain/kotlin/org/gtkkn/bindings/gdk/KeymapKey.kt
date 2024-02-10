// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointed
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.pointed
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.glib.Record
import org.gtkkn.extensions.glib.RecordCompanion
import org.gtkkn.native.gdk.GdkKeymapKey
import kotlin.Int
import kotlin.UInt

/**
 * A `GdkKeymapKey` is a hardware key that can be mapped to a keyval.
 */
public class KeymapKey(
    pointer: CPointer<GdkKeymapKey>,
) : Record {
    public val gdkKeymapKeyPointer: CPointer<GdkKeymapKey> = pointer

    /**
     * the hardware keycode. This is an identifying number for a
     *   physical key.
     */
    public var keycode: UInt
        get() = gdkKeymapKeyPointer.pointed.keycode
        set(`value`) {
            gdkKeymapKeyPointer.pointed.keycode = value
        }

    /**
     * indicates movement in a horizontal direction. Usually groups are used
     *   for two different languages. In group 0, a key might have two English
     *   characters, and in group 1 it might have two Hebrew characters. The Hebrew
     *   characters will be printed on the key next to the English characters.
     */
    public var group: Int
        get() = gdkKeymapKeyPointer.pointed.group
        set(`value`) {
            gdkKeymapKeyPointer.pointed.group = value
        }

    /**
     * indicates which symbol on the key will be used, in a vertical direction.
     *   So on a standard US keyboard, the key with the number “1” on it also has the
     *   exclamation point ("!") character on it. The level indicates whether to use
     *   the “1” or the “!” symbol. The letter keys are considered to have a lowercase
     *   letter at level 0, and an uppercase letter at level 1, though only the
     *   uppercase letter is printed.
     */
    public var level: Int
        get() = gdkKeymapKeyPointer.pointed.level
        set(`value`) {
            gdkKeymapKeyPointer.pointed.level = value
        }

    public companion object : RecordCompanion<KeymapKey, GdkKeymapKey> {
        override fun wrapRecordPointer(pointer: CPointer<out CPointed>): KeymapKey = KeymapKey(pointer.reinterpret())
    }
}

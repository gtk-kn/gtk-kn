// This is a generated file. Do not modify.
package org.gtkkn.bindings.gdk

import kotlinx.cinterop.CPointer
import kotlinx.cinterop.reinterpret
import org.gtkkn.extensions.common.asBoolean
import org.gtkkn.extensions.gobject.GeneratedClassKGType
import org.gtkkn.extensions.gobject.KGTyped
import org.gtkkn.extensions.gobject.TypeCompanion
import org.gtkkn.native.gdk.GdkKeyEvent
import org.gtkkn.native.gdk.gdk_key_event_get_consumed_modifiers
import org.gtkkn.native.gdk.gdk_key_event_get_keycode
import org.gtkkn.native.gdk.gdk_key_event_get_keyval
import org.gtkkn.native.gdk.gdk_key_event_get_layout
import org.gtkkn.native.gdk.gdk_key_event_get_level
import org.gtkkn.native.gdk.gdk_key_event_get_type
import org.gtkkn.native.gdk.gdk_key_event_is_modifier
import org.gtkkn.native.gdk.gdk_key_event_matches
import kotlin.Boolean
import kotlin.UInt

/**
 * An event related to a key-based device.
 *
 * ## Skipped during bindings generation
 *
 * - parameter `keyval`: keyval: Out parameter is not supported
 */
public open class KeyEvent(
    pointer: CPointer<GdkKeyEvent>,
) : Event(pointer.reinterpret()),
    KGTyped {
    public val gdkKeyEventPointer: CPointer<GdkKeyEvent>
        get() = gPointer.reinterpret()

    /**
     * Extracts the consumed modifiers from a key event.
     *
     * @return the consumed modifiers or @event
     */
    public open fun getConsumedModifiers(): ModifierType =
        gdk_key_event_get_consumed_modifiers(gdkKeyEventPointer.reinterpret()).run {
            ModifierType(this)
        }

    /**
     * Extracts the keycode from a key event.
     *
     * @return the keycode of @event
     */
    public open fun getKeycode(): UInt = gdk_key_event_get_keycode(gdkKeyEventPointer.reinterpret())

    /**
     * Extracts the keyval from a key event.
     *
     * @return the keyval of @event
     */
    public open fun getKeyval(): UInt = gdk_key_event_get_keyval(gdkKeyEventPointer.reinterpret())

    /**
     * Extracts the layout from a key event.
     *
     * @return the layout of @event
     */
    public open fun getLayout(): UInt = gdk_key_event_get_layout(gdkKeyEventPointer.reinterpret())

    /**
     * Extracts the shift level from a key event.
     *
     * @return the shift level of @event
     */
    public open fun getLevel(): UInt = gdk_key_event_get_level(gdkKeyEventPointer.reinterpret())

    /**
     * Extracts whether the key event is for a modifier key.
     *
     * @return true if the @event is for a modifier key
     */
    public open fun isModifier(): Boolean = gdk_key_event_is_modifier(gdkKeyEventPointer.reinterpret()).asBoolean()

    /**
     * Matches a key event against a keyval and modifiers.
     *
     * This is typically used to trigger keyboard shortcuts such as Ctrl-C.
     *
     * Partial matches are possible where the combination matches
     * if the currently active group is ignored.
     *
     * Note that we ignore Caps Lock for matching.
     *
     * @param keyval the keyval to match
     * @param modifiers the modifiers to match
     * @return a `GdkKeyMatch` value describing whether @event matches
     */
    public open fun matches(
        keyval: UInt,
        modifiers: ModifierType,
    ): KeyMatch =
        gdk_key_event_matches(gdkKeyEventPointer.reinterpret(), keyval, modifiers.mask).run {
            KeyMatch.fromNativeValue(this)
        }

    public companion object : TypeCompanion<KeyEvent> {
        override val type: GeneratedClassKGType<KeyEvent> =
            GeneratedClassKGType(gdk_key_event_get_type()) { KeyEvent(it.reinterpret()) }

        init {
            GdkTypeProvider.register()
        }
    }
}

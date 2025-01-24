// This is a generated file. Do not modify.
// Copyright (c) 2025 gtk-kn
// SPDX-License-Identifier: LGPL-2.1-or-later
package org.gtkkn.bindings.gdk

import org.gtkkn.extensions.glib.Bitfield
import org.gtkkn.native.gdk.GDK_ALT_MASK
import org.gtkkn.native.gdk.GDK_BUTTON1_MASK
import org.gtkkn.native.gdk.GDK_BUTTON2_MASK
import org.gtkkn.native.gdk.GDK_BUTTON3_MASK
import org.gtkkn.native.gdk.GDK_BUTTON4_MASK
import org.gtkkn.native.gdk.GDK_BUTTON5_MASK
import org.gtkkn.native.gdk.GDK_CONTROL_MASK
import org.gtkkn.native.gdk.GDK_HYPER_MASK
import org.gtkkn.native.gdk.GDK_LOCK_MASK
import org.gtkkn.native.gdk.GDK_META_MASK
import org.gtkkn.native.gdk.GDK_NO_MODIFIER_MASK
import org.gtkkn.native.gdk.GDK_SHIFT_MASK
import org.gtkkn.native.gdk.GDK_SUPER_MASK
import org.gtkkn.native.gdk.GdkModifierType
import org.gtkkn.native.gdk.gdk_modifier_type_get_type
import org.gtkkn.native.gobject.GType

/**
 * Flags to indicate the state of modifier keys and mouse buttons
 * in events.
 *
 * Typical modifier keys are Shift, Control, Meta, Super, Hyper, Alt, Compose,
 * Apple, CapsLock or ShiftLock.
 *
 * Note that GDK may add internal values to events which include values outside
 * of this enumeration. Your code should preserve and ignore them.  You can use
 * %GDK_MODIFIER_MASK to remove all private values.
 */
public class ModifierType(public val mask: GdkModifierType) : Bitfield<ModifierType> {
    override infix fun or(other: ModifierType): ModifierType = ModifierType(mask or other.mask)

    public companion object {
        /**
         * No modifier.
         * @since 4.14
         */
        public val NO_MODIFIER_MASK: ModifierType = ModifierType(GDK_NO_MODIFIER_MASK)

        /**
         * the Shift key.
         */
        public val SHIFT_MASK: ModifierType = ModifierType(GDK_SHIFT_MASK)

        /**
         * a Lock key (depending on the modifier mapping of the
         *  X server this may either be CapsLock or ShiftLock).
         */
        public val LOCK_MASK: ModifierType = ModifierType(GDK_LOCK_MASK)

        /**
         * the Control key.
         */
        public val CONTROL_MASK: ModifierType = ModifierType(GDK_CONTROL_MASK)

        /**
         * the fourth modifier key (it depends on the modifier
         *  mapping of the X server which key is interpreted as this modifier, but
         *  normally it is the Alt key).
         */
        public val ALT_MASK: ModifierType = ModifierType(GDK_ALT_MASK)

        /**
         * the first mouse button.
         */
        public val BUTTON1_MASK: ModifierType = ModifierType(GDK_BUTTON1_MASK)

        /**
         * the second mouse button.
         */
        public val BUTTON2_MASK: ModifierType = ModifierType(GDK_BUTTON2_MASK)

        /**
         * the third mouse button.
         */
        public val BUTTON3_MASK: ModifierType = ModifierType(GDK_BUTTON3_MASK)

        /**
         * the fourth mouse button.
         */
        public val BUTTON4_MASK: ModifierType = ModifierType(GDK_BUTTON4_MASK)

        /**
         * the fifth mouse button.
         */
        public val BUTTON5_MASK: ModifierType = ModifierType(GDK_BUTTON5_MASK)

        /**
         * the Super modifier
         */
        public val SUPER_MASK: ModifierType = ModifierType(GDK_SUPER_MASK)

        /**
         * the Hyper modifier
         */
        public val HYPER_MASK: ModifierType = ModifierType(GDK_HYPER_MASK)

        /**
         * the Meta modifier
         */
        public val META_MASK: ModifierType = ModifierType(GDK_META_MASK)

        /**
         * Get the GType of ModifierType
         *
         * @return the GType
         */
        public fun getType(): GType = gdk_modifier_type_get_type()
    }
}

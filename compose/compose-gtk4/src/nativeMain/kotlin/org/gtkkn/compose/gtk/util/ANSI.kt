/*
 * Copyright (c) 2024 gtk-kn
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * gtk-kn is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Lesser General Public License for more details.
 * You should have received a copy of the GNU General Public License
 * along with gtk-kn. If not, see https://www.gnu.org/licenses/.
 */

package org.gtkkn.compose.gtk.util

import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.toKStringFromUtf8
import platform.posix.getenv


/**
 * https://en.wikipedia.org/wiki/ANSI_escape_code
 * https://stackoverflow.com/a/45444716
 */
public object ANSI {
    @OptIn(ExperimentalForeignApi::class)
    public val isSupported: Boolean by lazy {
        getenv("TERM")?.toKStringFromUtf8()?.startsWith("xterm") == true
    }

    public sealed interface Code {
        public val code: Int
        public val modifier: Modifier?
        public operator fun plus(text: String): String = "$this$text"
        public operator fun plus(code: Code): String = "$this$code"
    }

    internal fun Code.print(): String {
        val start = "\u001B["
        val mod = modifier?.let { "$it;" } ?: ""
        val end = "${code}m"
        return start + mod + end
    }

    public fun Code.println(text: String): Unit = kotlin.io.println(this + text + Reset)

    public object Reset : Code {
        override val code: Int = Modifier.Reset.code
        override val modifier: Modifier? = null
        override fun toString(): String = print()
    }

    public sealed interface SomeColour : Code, Modifiable<SomeColour> {
        public val isBright: Boolean
    }

    public fun SomeColour.asBackground(): SomeBackground {
        val code = if (isBright) code - 60 else code
        val ordinal = code - 30
        val base = Background.entries[ordinal].modify(modifier)
        return if (isBright) return base.bright else base
    }

    public val SomeColour.bright: SomeColour
        get() = if (isBright) this else CustomColour(
            code + 60,
            modifier,
            true,
        )

    public enum class Colour : SomeColour {
        Black,
        Red,
        Green,
        Yellow,
        Blue,
        Purple,
        Cyan,
        White;

        override val code: Int = 30 + ordinal
        override val modifier: Modifier? = null
        override val isBright: Boolean = false
        override fun toString(): String = print()
        override fun modify(modifier: Modifier?): SomeColour = CustomColour(code, modifier, isBright)

        public companion object : SomeColour {
            override val isBright: Boolean = false
            override val code: Int = 39
            override val modifier: Modifier? = null
            override fun toString(): String = print()
            override fun modify(modifier: Modifier?): SomeColour = CustomColour(code, modifier, isBright)
        }
    }

    internal class CustomColour(
        override val code: Int,
        override val modifier: Modifier?,
        override val isBright: Boolean
    ) : SomeColour {
        override fun toString(): String = print()
        override fun modify(modifier: Modifier?): SomeColour = CustomColour(code, modifier, isBright)
    }

    public sealed interface SomeBackground : Code, Modifiable<SomeBackground> {
        public val isBright: Boolean
    }

    public fun SomeBackground.asColour(): SomeColour {
        val code = if (isBright) code - 60 else code
        val ordinal = code - 40
        val base = Colour.entries[ordinal].modify(modifier)
        return if (isBright) return base.bright else base
    }

    public val SomeBackground.bright: SomeBackground
        get() = if (isBright) this else CustomBackground(
            code + 60,
            modifier,
            true,
        )

    public enum class Background : SomeBackground {
        Black,
        Red,
        Green,
        Yellow,
        Blue,
        Purple,
        Cyan,
        White;

        override val code: Int = 40 + ordinal
        override val modifier: Modifier? = null
        override val isBright: Boolean = false
        override fun toString(): String = print()
        override fun modify(modifier: Modifier?): SomeBackground = CustomBackground(code, modifier, isBright)

        public companion object : SomeBackground {
            override val isBright: Boolean = false
            override val code: Int = 49
            override val modifier: Modifier? = null
            override fun toString(): String = print()
            override fun modify(modifier: Modifier?): SomeBackground = CustomBackground(code, modifier, isBright)
        }
    }

    internal class CustomBackground(
        override val code: Int,
        override val modifier: Modifier?,
        override val isBright: Boolean
    ) : SomeBackground {
        override fun toString(): String = print()
        override fun modify(modifier: Modifier?): SomeBackground = CustomBackground(code, modifier, isBright)
    }

    public enum class Modifier {
        Reset,
        Bold,
        Faint,
        Italic,
        Underline,
        SlowBlink,
        RapidBlink,
        Invert,
        Hide,
        Strike,
        ;

        public val code: Int = ordinal
        override fun toString(): String = "$code"
    }

    public sealed interface Modifiable<T> : Code {
        public fun modify(modifier: Modifier?): T
    }

    public val <T> Modifiable<T>.bold: T get() = modify(Modifier.Bold)
    public val <T> Modifiable<T>.faint: T get() = modify(Modifier.Faint)
    public val <T> Modifiable<T>.italic: T get() = modify(Modifier.Italic)
    public val <T> Modifiable<T>.underline: T get() = modify(Modifier.Underline)
    public val <T> Modifiable<T>.slowBlink: T get() = modify(Modifier.SlowBlink)
    public val <T> Modifiable<T>.rapidBlink: T get() = modify(Modifier.RapidBlink)
    public val <T> Modifiable<T>.invert: T get() = modify(Modifier.Invert)
    public val <T> Modifiable<T>.hide: T get() = modify(Modifier.Hide)
    public val <T> Modifiable<T>.strike: T get() = modify(Modifier.Strike)
}

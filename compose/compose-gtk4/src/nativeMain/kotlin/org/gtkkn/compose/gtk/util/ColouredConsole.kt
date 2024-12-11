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

import org.gtkkn.compose.gtk.util.ColouredConsole.Companion.BLACK
import org.gtkkn.compose.gtk.util.ColouredConsole.Companion.BRIGHT_BLACK
import org.gtkkn.compose.gtk.util.ColouredConsole.Companion.BRIGHT_WHITE
import org.gtkkn.compose.gtk.util.ColouredConsole.Companion.RESET
import org.gtkkn.compose.gtk.util.ColouredConsole.Companion.WHITE
import org.gtkkn.compose.gtk.util.ColouredConsole.Style
import org.gtkkn.compose.gtk.util.ColouredConsole.Style.NotApplied
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract


internal interface ColouredConsole {

    sealed class Style {

        val bg: Style
            get() = when (this) {
                is Simple -> if (code.isColour) copy(code = code + BACKGROUND_SHIFT) else this
                is Composite -> if (parent is Simple && parent.code.isColour)
                    copy(parent = parent.copy(code = parent.code + BACKGROUND_SHIFT))
                else this

                is NotApplied -> this
            }

        val bright: Style
            get() = when (this) {
                is Simple -> if (code.isNormalColour) copy(code = code + BRIGHT_SHIFT) else this
                is Composite -> if (parent is Simple && parent.code.isNormalColour)
                    copy(parent = parent.copy(code = parent.code + BRIGHT_SHIFT))
                else this

                is NotApplied -> this
            }

        abstract fun wrap(text: String): String

        data object NotApplied : Style() {
            override fun wrap(text: String) = text
        }

        data class Simple(val code: Int) : Style() {
            override fun wrap(text: String) = text.applyCodes(code)
        }

        data class Composite(val parent: Style, private val child: Style) : Style() {
            override fun wrap(text: String) = parent.wrap(child.wrap(text))
        }

        operator fun plus(style: Style) = when (this) {
            is NotApplied -> this
            is Simple -> Composite(style, this)
            is Composite -> Composite(style, this)
        }
    }

    fun <N> N.style(style: Style, predicate: (N) -> Boolean = { true }) =
        takeIf { predicate(this) }?.let { style.wrap(toString()) } ?: toString()

    operator fun <N> N.invoke(style: Style, predicate: (N) -> Boolean = { true }) = style(style, predicate)

    fun <N> N.wrap(vararg ansiCodes: Int) = toString().let { text ->
        if (this@ColouredConsole is ColouredConsoleDisabled)
            text
        else {
            val codes = ansiCodes.filter { it != RESET }
            text.applyCodes(*codes.toIntArray())
        }
    }

    private val String.firstAnsi
        get() = pattern.matchEntire(this)?.let { matcher ->
            matcher.range.first
            if (matcher.groups.isEmpty() || matcher.range.first != 0) null else matcher.groups[1]?.value?.toIntOrNull()
        }

    val String.bright
        get() = firstAnsi.let { code ->
            if (code?.isNormalColour == true) substring(0, 2) + (code + BRIGHT_SHIFT) + substring(4) else this
        }

    val String.bg
        get() = firstAnsi.let { code ->
            if (code?.isColour == true) substring(0, 2) + (code + BACKGROUND_SHIFT) + substring(4) else this
        }

    // region styles
    val bold: Style get() = Style.Simple(HIGH_INTENSITY)
    val <N : Style> N.bold: Style get() = this + this@ColouredConsole.bold
    val <N> N.bold get() = wrap(HIGH_INTENSITY)
    fun <N> N.bold(predicate: (N) -> Boolean = { true }) =
        takeIf { predicate(this) }?.toString()?.bold ?: this.toString()

    fun bold(text: Any) = text.wrap(HIGH_INTENSITY)

    val faint: Style get() = Style.Simple(LOW_INTENSITY)
    val <N : Style> N.faint: Style get() = this + this@ColouredConsole.faint
    val <N> N.faint get() = wrap(LOW_INTENSITY)
    fun <N> N.faint(predicate: (N) -> Boolean = { true }) =
        takeIf { predicate(this) }?.toString()?.faint ?: this.toString()

    fun faint(text: Any) = text.wrap(LOW_INTENSITY)

    val italic: Style get() = Style.Simple(ITALIC)
    val <N : Style> N.italic: Style get() = this + this@ColouredConsole.italic
    val <N> N.italic get() = wrap(ITALIC)
    fun <N> N.italic(predicate: (N) -> Boolean = { true }) =
        takeIf { predicate(this) }?.toString()?.italic ?: this.toString()

    fun italic(text: String) = text.wrap(ITALIC)

    val underline: Style get() = Style.Simple(UNDERLINE)
    val <N : Style> N.underline: Style get() = this + this@ColouredConsole.underline
    val <N> N.underline get() = wrap(UNDERLINE)
    fun <N> N.underline(predicate: (N) -> Boolean = { true }) =
        takeIf { predicate(this) }?.toString()?.underline ?: this.toString()

    fun underline(text: String) = text.wrap(UNDERLINE)

    val blink: Style get() = Style.Simple(BLINK)
    val <N : Style> N.blink: Style get() = this + this@ColouredConsole.blink
    val <N> N.blink get() = wrap(BLINK)
    fun <N> N.blink(predicate: (N) -> Boolean = { true }) =
        takeIf { predicate(this) }?.toString()?.blink ?: this.toString()

    fun blink(text: String) = text.wrap(BLINK)

    val reverse: Style get() = Style.Simple(REVERSE)
    val <N : Style> N.reverse: Style get() = this + this@ColouredConsole.reverse
    val <N> N.reverse get() = wrap(REVERSE)
    fun <N> N.reverse(predicate: (N) -> Boolean = { true }) =
        takeIf { predicate(this) }?.toString()?.reverse ?: this.toString()

    fun reverse(text: String) = text.wrap(REVERSE)

    val hidden: Style get() = Style.Simple(HIDDEN)
    val <N : Style> N.hidden: Style get() = this + this@ColouredConsole.hidden
    val <N> N.hidden get() = wrap(HIDDEN)
    fun <N> N.hidden(predicate: (N) -> Boolean = { true }) =
        takeIf { predicate(this) }?.toString()?.hidden ?: this.toString()

    fun hidden(text: String) = text.wrap(HIDDEN)

    val strike: Style get() = Style.Simple(STRIKE)
    val <N : Style> N.strike: Style get() = this + this@ColouredConsole.strike
    val <N> N.strike get() = wrap(STRIKE)
    fun <N> N.strike(predicate: (N) -> Boolean = { true }) =
        takeIf { predicate(this) }?.toString()?.strike ?: this.toString()

    fun strike(text: String) = text.wrap(STRIKE)
    // endregion

    // region colours
    val black: Style get() = Style.Simple(BLACK)
    val <N : Style> N.black: Style get() = this + this@ColouredConsole.black
    val <N> N.black get() = wrap(BLACK)
    fun <N> N.black(predicate: (N) -> Boolean = { true }) = takeIf { predicate(this) }?.toString()?.black ?: toString()
    fun black(text: String) = text.wrap(BLACK)

    val red: Style get() = Style.Simple(RED)
    val <N : Style> N.red: Style get() = this + this@ColouredConsole.red
    val <N> N.red get() = wrap(RED)
    fun <N> N.red(predicate: (N) -> Boolean = { true }) = takeIf { predicate(this) }?.toString()?.red ?: toString()
    fun red(text: String) = text.wrap(RED)

    val green: Style get() = Style.Simple(GREEN)
    val <N : Style> N.green: Style get() = this + this@ColouredConsole.green
    val <N> N.green get() = wrap(GREEN)
    fun <N> N.green(predicate: (N) -> Boolean = { true }) = takeIf { predicate(this) }?.toString()?.green ?: toString()
    fun green(text: String) = text.wrap(GREEN)

    val yellow: Style get() = Style.Simple(YELLOW)
    val <N : Style> N.yellow: Style get() = this + this@ColouredConsole.yellow
    val <N> N.yellow get() = wrap(YELLOW)
    fun <N> N.yellow(predicate: (N) -> Boolean = { true }) =
        takeIf { predicate(this) }?.toString()?.yellow ?: toString()

    fun yellow(text: String) = text.wrap(YELLOW)

    val blue: Style get() = Style.Simple(BLUE)
    val <N : Style> N.blue: Style get() = this + this@ColouredConsole.blue
    val <N> N.blue get() = wrap(BLUE)
    fun <N> N.blue(predicate: (N) -> Boolean = { true }) = takeIf { predicate(this) }?.toString()?.blue ?: toString()
    fun blue(text: String) = text.wrap(BLUE)

    val purple: Style get() = Style.Simple(PURPLE)
    val <N : Style> N.purple: Style get() = this + this@ColouredConsole.purple
    val <N> N.purple get() = wrap(PURPLE)
    fun <N> N.purple(predicate: (N) -> Boolean = { true }) =
        takeIf { predicate(this) }?.toString()?.purple ?: toString()

    fun purple(text: String) = text.wrap(PURPLE)

    val cyan: Style get() = Style.Simple(CYAN)
    val <N : Style> N.cyan: Style get() = this + this@ColouredConsole.cyan
    val <N> N.cyan get() = wrap(CYAN)
    fun <N> N.cyan(predicate: (N) -> Boolean = { true }) = takeIf { predicate(this) }?.toString()?.cyan ?: toString()
    fun cyan(text: String) = text.wrap(CYAN)

    val white: Style get() = Style.Simple(WHITE)
    val <N : Style> N.white: Style get() = this + this@ColouredConsole.white
    val <N> N.white get() = wrap(WHITE)
    fun <N> N.white(predicate: (N) -> Boolean = { true }) = takeIf { predicate(this) }?.toString()?.white ?: toString()
    fun white(text: String) = text.wrap(WHITE)
    // endregion

    companion object {
        const val RESET = 0

        const val HIGH_INTENSITY = 1
        const val LOW_INTENSITY = 2

        const val BACKGROUND_SHIFT = 10
        const val BRIGHT_SHIFT = 60

        const val ITALIC = 3
        const val UNDERLINE = 4
        const val BLINK = 5
        const val REVERSE = 7
        const val HIDDEN = 8
        const val STRIKE = 9

        const val BLACK = 30
        const val RED = 31
        const val GREEN = 32
        const val YELLOW = 33
        const val BLUE = 34
        const val PURPLE = 35
        const val CYAN = 36
        const val WHITE = 37

        const val BRIGHT_BLACK = BLACK + BRIGHT_SHIFT
        const val BRIGHT_RED = RED + BRIGHT_SHIFT
        const val BRIGHT_GREEN = GREEN + BRIGHT_SHIFT
        const val BRIGHT_YELLOW = YELLOW + BRIGHT_SHIFT
        const val BRIGHT_BLUE = BLUE + BRIGHT_SHIFT
        const val BRIGHT_PURPLE = PURPLE + BRIGHT_SHIFT
        const val BRIGHT_CYAN = CYAN + BRIGHT_SHIFT
        const val BRIGHT_WHITE = WHITE + BRIGHT_SHIFT

        val pattern: Regex = Regex("\\u001B\\[([0-9]{1,2})m")
    }
}

private object ColouredConsoleEnabled : ColouredConsole

private object ColouredConsoleDisabled : ColouredConsole {
    override val bold get() = NotApplied
    override val <N : Style> N.bold: Style get() = NotApplied
    override val italic get() = NotApplied
    override val <N : Style> N.italic: Style get() = NotApplied
    override val underline get() = NotApplied
    override val <N : Style> N.underline: Style get() = NotApplied
    override val blink get() = NotApplied
    override val <N : Style> N.blink: Style get() = NotApplied
    override val reverse get() = NotApplied
    override val <N : Style> N.reverse: Style get() = NotApplied
    override val hidden get() = NotApplied
    override val <N : Style> N.hidden: Style get() = NotApplied

    override val red get() = NotApplied
    override val <N : Style> N.red: Style get() = NotApplied
    override val black get() = NotApplied
    override val <N : Style> N.black: Style get() = NotApplied
    override val green get() = NotApplied
    override val <N : Style> N.green: Style get() = NotApplied
    override val yellow get() = NotApplied
    override val <N : Style> N.yellow: Style get() = NotApplied
    override val blue get() = NotApplied
    override val <N : Style> N.blue: Style get() = NotApplied
    override val purple get() = NotApplied
    override val <N : Style> N.purple: Style get() = NotApplied
    override val cyan get() = NotApplied
    override val <N : Style> N.cyan: Style get() = NotApplied
    override val white get() = NotApplied
    override val <N : Style> N.white: Style get() = NotApplied
}

private val Int.isNormalColour get() = this in BLACK..WHITE
private val Int.isBrightColour get() = this in BRIGHT_BLACK..BRIGHT_WHITE
private val Int.isColour get() = isNormalColour || isBrightColour

private fun String.applyCodes(vararg codes: Int) = "\u001B[${RESET}m".let { reset ->
    val tags = codes.joinToString { "\u001B[${it}m" }
    split(reset).filter { it.isNotEmpty() }.joinToString(separator = "") { tags + it + reset }
}

@OptIn(ExperimentalContracts::class)
internal inline fun <R> coloured(enabled: Boolean = true, block: ColouredConsole.() -> R): R {
    contract {
        callsInPlace(block, InvocationKind.EXACTLY_ONCE)
    }
    return if (enabled) ColouredConsoleEnabled.block() else ColouredConsoleDisabled.block()
}

internal inline fun <R : Style> style(block: ColouredConsole.() -> R): R = ColouredConsoleEnabled.block()

internal inline fun print(coloured: Boolean = true, block: ColouredConsole.() -> String) =
    coloured(coloured) { print(block()) }

internal inline fun println(coloured: Boolean = true, block: ColouredConsole.() -> String) =
    coloured(coloured) { println(block()) }

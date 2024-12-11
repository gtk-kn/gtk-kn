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

import co.touchlab.kermit.Message
import co.touchlab.kermit.MessageStringFormatter
import co.touchlab.kermit.Severity
import co.touchlab.kermit.Tag
import org.gtkkn.compose.gtk.util.ANSI.asBackground
import org.gtkkn.compose.gtk.util.ANSI.bold
import org.gtkkn.compose.gtk.util.ANSI.bright


internal object AnsiLogFormatter : MessageStringFormatter {
    private val Severity?.colour: ANSI.SomeColour?
        get() = if (ANSI.isSupported && this != null) {
            when (this) {
                Severity.Verbose -> ANSI.Colour.White.bright
                Severity.Debug -> ANSI.Colour.Blue.bright
                Severity.Info -> ANSI.Colour.Green.bright
                Severity.Warn -> ANSI.Colour.Yellow.bright
                Severity.Error -> ANSI.Colour.Red.bright
                Severity.Assert -> ANSI.Colour.Purple.bright
            }
        } else {
            null
        }

    override fun formatSeverity(severity: Severity): String {
        return severity.name.padEnd(8, ' ')
    }

    override fun formatTag(tag: Tag): String {
        return tag.tag.padEnd(20, ' ')
    }

    override fun formatMessage(severity: Severity?, tag: Tag?, message: Message): String {
        val (s, t, m) = if (ANSI.isSupported) {
            val fgColour = severity.colour
            val fgCode = fgColour ?: ANSI.Reset
            val bgColour = fgColour?.asBackground()?.bright
            val bgCode = bgColour ?: ANSI.Background.White
            val cSeverity = severity?.let(::formatSeverity)?.let {
                bgCode + ANSI.Colour.Black.bold + " $it" + ANSI.Reset
            }
            val cTag = tag?.let(::formatTag)?.let {
                (fgColour?.bold ?: ANSI.Reset) + it + ANSI.Reset
            }
            val cMessage = message.message.let {
                fgCode + it + ANSI.Reset
            }

            Triple(cSeverity, cTag, cMessage)
        } else {
            Triple(severity?.let(::formatSeverity), tag?.let(::formatTag), message.message)
        }

        // Optimize for Android
        if (severity == null && tag == null)
            return message.message

        val sb = StringBuilder()
        if (s != null) sb.append(s).append(" ")
        if (!t.isNullOrEmpty()) sb.append(t).append(" ")
        sb.append(m)

        return sb.toString()
    }
}

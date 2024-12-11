/*
 * Copyright (c) 2024 gtk-kn
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.gtkkn.samples.compose.gtk

import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import io.github.oshai.kotlinlogging.KotlinLogging
import io.github.oshai.kotlinlogging.KotlinLoggingConfiguration
import io.github.oshai.kotlinlogging.Level
import org.gtkkn.bindings.gio.ApplicationFlags
import org.gtkkn.compose.gtk.application
import org.gtkkn.compose.gtk.foundation.Button
import org.gtkkn.compose.gtk.foundation.HBox
import org.gtkkn.compose.gtk.foundation.Label
import org.gtkkn.compose.gtk.foundation.VBox
import org.gtkkn.compose.gtk.foundation.onClick
import org.gtkkn.compose.gtk.foundation.spacing
import org.gtkkn.compose.gtk.platform.LocalApplication
import org.gtkkn.compose.gtk.window.ApplicationWindow
import org.gtkkn.compose.gtk.window.title

val logger = KotlinLogging.logger("main")

fun main() {
    KotlinLoggingConfiguration.logLevel = Level.TRACE
    logger.debug { "Compose GTK" }
    application("org.gtkkn.samples.compose.gtk", ApplicationFlags.FLAGS_NONE) {
        val application = LocalApplication.current

        SideEffect {
            application.setAccelsForAction("win.close", listOf("<Ctrl>W"))
        }

        ApplicationWindow(
            visible = true,
            onCloseRequest = ::exitApplication,
            props = {
                title = "GTK Compose"
            },
        ) {
            HBox(
                props = {
                    spacing = 3
                },
            ) {
                var extraWindow by remember { mutableStateOf(false) }
                Button(
                    props = {
                        onClick = {
                            println("Toggling extra $extraWindow")
                            extraWindow = !extraWindow
                        }
                    },
                ) {
                    Label(text = if (extraWindow) "Close Window" else "Open Window")
                }
                if (extraWindow) {
                    ApplicationWindow(
                        visible = true,
                        onCloseRequest = { extraWindow = false },
                        props = {
                            title = "Extra"
//                            showMenubar = true
                        },
                    ) {
                        TodoWindow()
                    }
                }
                TodoWindow()
            }
        }
    }
}

@Composable
private fun TodoWindow() {
    VBox(
        props = {
            spacing = 2
        },
    ) {
        val labels = remember { mutableStateListOf("GTK", "Compose", "Super", "Awesome!") }

        labels.forEach {
            Button(
                props = {
                    onClick = {
                        println("Clicked $it")
                        labels.remove(it)
                    }
                },
            ) { Label(it) }
        }
        Button(
            props = {
                onClick = {
                    println("Clicked More!")
                    labels.add("Another one")
                }
            },
        ) { Label("More!") }
    }
}

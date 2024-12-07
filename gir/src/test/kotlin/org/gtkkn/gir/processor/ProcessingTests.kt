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

package org.gtkkn.gir.processor

import com.squareup.kotlinpoet.ClassName
import io.github.oshai.kotlinlogging.Level
import org.gtkkn.gir.blueprints.TypeInfo
import org.gtkkn.gir.config.Config
import org.gtkkn.gir.generator.BindingsGenerator
import org.gtkkn.gir.parser.gir.GirParser
import org.gtkkn.gir.parser.metadata.MetadataParser
import org.gtkkn.gir.util.loadResourceAsFile
import java.io.File
import kotlin.io.path.createTempDirectory
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ProcessingTests {
    @Test
    fun `should process repository and generate correct module and name`() {
        assertEquals("Gtk", gtkBlueprint.name)
        assertEquals("gtk", gtkBlueprint.kotlinModuleName)
    }

    @Test
    fun `should identify and count missing includes correctly`() {
        val skippedIncludes = gtkBlueprint.skippedObjects.filter { it.objectType == "include" }
        assertEquals(2, skippedIncludes.count())
    }

    @Test
    fun `should process AboutDialog class and verify its properties and types`() {
        val clazz = gtkBlueprint.classBlueprints.first { it.kotlinName == "AboutDialog" }
        val notNullableReturnTypeInfo = clazz.properties
            .first { it.setter?.nativeName == "gtk_about_dialog_set_comments" }
            .setter
            ?.returnTypeInfo as TypeInfo.Primitive
        val nullableReturnTypeInfo = clazz.properties
            .first { it.getter.nativeName == "gtk_about_dialog_get_comments" }
            .getter
            .returnTypeInfo as TypeInfo.KString
        assertEquals("AboutDialog", clazz.kotlinName)
        assertEquals("AboutDialog", clazz.nativeName)
        assertEquals(ClassName("org.gtkkn.bindings.gtk", "AboutDialog"), clazz.typeName)
        assertEquals(ClassName("org.gtkkn.bindings.gtk", "Window"), clazz.parentTypeName)
        assertEquals("gtkAboutDialogPointer", clazz.objectPointerName)
        assertEquals(
            BindingsGenerator.cpointerOf(
                ClassName("org.gtkkn.native.gtk", "GtkAboutDialog"),
            ),
            clazz.objectPointerTypeName,
        )
        assertFalse(notNullableReturnTypeInfo.typeName.isNullable)
        assertTrue(nullableReturnTypeInfo.kotlinTypeName.isNullable)
    }

    @Test
    fun `should not filter interfaces for Widget class`() {
        val clazz = gtkBlueprint.classBlueprints.first { it.kotlinName == "Widget" }
        // should not have any interfaces filtered
        assertEquals(3, clazz.implementsInterfaces.size)
    }

    @Test
    fun `should filter DragIcon interfaces to retain only Root and Native`() {
        val clazz = gtkBlueprint.classBlueprints.first { it.kotlinName == "DragIcon" }
        // should not contain any of the Widget interfaces
        // only keep Gtk.Root and Gtk.Native
        assertEquals(2, clazz.implementsInterfaces.size)
        assertEquals(
            ClassName("org.gtkkn.bindings.gtk", "Native"),
            clazz.implementsInterfaces.first().interfaceTypeName,
        )
        assertEquals(
            ClassName("org.gtkkn.bindings.gtk", "Root"),
            clazz.implementsInterfaces.last().interfaceTypeName,
        )
    }

    @Test
    fun `should not add interfaces for WindowHandle class`() {
        val clazz = gtkBlueprint.classBlueprints.first { it.kotlinName == "WindowHandle" }
        assertEquals(0, clazz.implementsInterfaces.size)
    }

    @Test
    fun `should add ListModel interface for FilterListModel class`() {
        val clazz = gtkBlueprint.classBlueprints.first { it.kotlinName == "FilterListModel" }
        assertEquals(
            ClassName("org.gtkkn.bindings.gio", "ListModel"),
            clazz.implementsInterfaces.first().interfaceTypeName,
        )
        assertEquals("gioListModelPointer", clazz.implementsInterfaces.first().interfacePointerName)
    }

    @Test
    fun `should not add any interfaces for AnyFilter class`() {
        val clazz = gtkBlueprint.classBlueprints.first { it.kotlinName == "AnyFilter" }
        // should not have any interfaces, as it extends from FilterListModel
        assertEquals(0, clazz.implementsInterfaces.size)
    }

    companion object {
        private const val GTK_GIR_RESOURCE_NAME = "/gir-files/linux/Gtk-4.0.gir"
        private const val GIO_GIR_RESOURCE_NAME = "/gir-files/linux/Gio-2.0.gir"
        private const val GOBJECT_GIR_RESOURCE_NAME = "/gir-files/linux/GObject-2.0.gir"

        private val gtkBlueprint by lazy {
            val girParser = GirParser(MetadataParser())
            val gtkFile = checkNotNull(loadResourceAsFile(GTK_GIR_RESOURCE_NAME))
            val gioFile = checkNotNull(loadResourceAsFile(GIO_GIR_RESOURCE_NAME))
            val gobjectFile = checkNotNull(loadResourceAsFile(GOBJECT_GIR_RESOURCE_NAME))
            val tempDir: File = createTempDirectory(prefix = "output").toFile()
            val gtkRepository = girParser.parse(gtkFile)
            val gioRepository = girParser.parse(gioFile)
            val gobjectRepository = girParser.parse(gobjectFile)
            val config = Config(
                girBaseDir = tempDir,
                outputDir = tempDir,
                gradlePluginDir = tempDir,
                logLevel = Level.WARN,
                skipFormat = true,
                bindingLicense = Config.License.MIT,
                libraries = emptyList(),
            )

            val processor = Phase2Processor(config)
            processor.process(listOf(gtkRepository, gioRepository, gobjectRepository)).first()
        }
    }
}

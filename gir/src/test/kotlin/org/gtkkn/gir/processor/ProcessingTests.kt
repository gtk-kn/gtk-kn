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
import org.gtkkn.gir.parser.gir.GirParser
import org.gtkkn.gir.parser.metadata.MetadataParser
import org.gtkkn.gir.util.loadResourceAsFile
import java.io.File
import kotlin.io.path.createTempDirectory
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

private const val GTK_GIR_RESOURCE_NAME = "/gir-files/linux/Gtk-4.0.gir"
private const val GIO_GIR_RESOURCE_NAME = "/gir-files/linux/Gio-2.0.gir"
private const val GOBJECT_GIR_RESOURCE_NAME = "/gir-files/linux/GObject-2.0.gir"

class ProcessingTests {
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

    @Test
    fun processRepository() {
        assertEquals("Gtk", gtkBlueprint.name)
        assertEquals("gtk", gtkBlueprint.kotlinModuleName)
    }

    @Test
    fun processMissingIncludes() {
        val skippedIncludes = gtkBlueprint.skippedObjects.filter { it.objectType == "include" }
        assertEquals(2, skippedIncludes.count())
    }

    @Test
    fun processAboutDialogClass() {
        val clazz = gtkBlueprint.classBlueprints.first { it.kotlinName == "AboutDialog" }
        val notNullableReturnTypeInfo = clazz.methods
            .first { it.nativeName == "gtk_about_dialog_set_comments" }
            .returnTypeInfo as TypeInfo.Primitive
        val nullableReturnTypeInfo = clazz.methods
            .first { it.nativeName == "gtk_about_dialog_get_comments" }
            .returnTypeInfo as TypeInfo.KString
        assertEquals("AboutDialog", clazz.kotlinName)
        assertEquals("AboutDialog", clazz.nativeName)
        assertEquals(ClassName("org.gtkkn.bindings.gtk", "AboutDialog"), clazz.typeName)
        assertEquals(ClassName("org.gtkkn.bindings.gtk", "Window"), clazz.parentTypeName)
        assertEquals("gtkAboutDialogPointer", clazz.objectPointerName)
        assertEquals(
            NativeTypes.cpointerOf(
                ClassName("org.gtkkn.native.gtk", "GtkAboutDialog"),
            ),
            clazz.objectPointerTypeName,
        )
        assertFalse(notNullableReturnTypeInfo.typeName.isNullable)
        assertTrue(nullableReturnTypeInfo.kotlinTypeName.isNullable)
    }

    @Test
    fun testInterfaceFilteringWidget() {
        val clazz = gtkBlueprint.classBlueprints.first { it.kotlinName == "Widget" }
        // should not have any interfaces filtered
        assertEquals(3, clazz.implementsInterfaces.size)
    }

    @Test
    fun testInterfaceFilteringDragIcon() {
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
    fun testInterfaceFilteringWindowHandle() {
        val clazz = gtkBlueprint.classBlueprints.first { it.kotlinName == "WindowHandle" }
        assertEquals(0, clazz.implementsInterfaces.size)
    }

    @Test
    fun testInterfaceFilteringFilterListModel() {
        val clazz = gtkBlueprint.classBlueprints.first { it.kotlinName == "FilterListModel" }
        assertEquals(
            ClassName("org.gtkkn.bindings.gio", "ListModel"),
            clazz.implementsInterfaces.first().interfaceTypeName,
        )
        assertEquals("gioListModelPointer", clazz.implementsInterfaces.first().interfacePointerName)
    }

    @Test
    fun testInterfaceFilteringAnyFilter() {
        val clazz = gtkBlueprint.classBlueprints.first { it.kotlinName == "AnyFilter" }
        // should not have any interfaces, as it extends from FilterListModel
        assertEquals(0, clazz.implementsInterfaces.size)
    }
}

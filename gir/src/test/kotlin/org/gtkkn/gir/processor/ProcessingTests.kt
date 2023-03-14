package org.gtkkn.gir.processor

import com.squareup.kotlinpoet.ClassName
import org.gtkkn.gir.blueprints.TypeInfo
import org.gtkkn.gir.parser.GirParser
import java.io.File
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

private const val GTK_GIR_RESOURCE_NAME = "/girfiles/Gtk-4.0.gir"
private const val GIO_GIR_RESOURCE_NAME = "/girfiles/Gio-2.0.gir"
private const val GOBJECT_GIR_RESOURCE_NAME = "/girfiles/GObject-2.0.gir"

class ProcessingTests {
    private val gtkBlueprint by lazy {
        val girParser = GirParser()
        val gtkFile = File(checkNotNull(javaClass.getResource(GTK_GIR_RESOURCE_NAME)).toURI())
        val gioFile = File(checkNotNull(javaClass.getResource(GIO_GIR_RESOURCE_NAME)).toURI())
        val gobjectFile = File(checkNotNull(javaClass.getResource(GOBJECT_GIR_RESOURCE_NAME)).toURI())
        val gtkRepository = girParser.parse(gtkFile)
        val gioRepository = girParser.parse(gioFile)
        val gobjectRepository = girParser.parse(gobjectFile)

        val processor = Phase2Processor()
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
            .returnTypeInfo as TypeInfo.Unknown
        assertEquals("AboutDialog", clazz.kotlinName)
        assertEquals("AboutDialog", clazz.nativeName)
        assertEquals(ClassName("bindings.gtk", "AboutDialog"), clazz.typeName)
        assertEquals(ClassName("bindings.gtk", "Window"), clazz.parentTypeName)
        assertEquals("gtkAboutDialogPointer", clazz.objectPointerName)
        assertEquals(
            NativeTypes.cpointerOf(
                ClassName("native.gtk", "GtkAboutDialog"),
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
        // only keep Gtk.Root, filter Gtk.Native
        assertEquals(1, clazz.implementsInterfaces.size)
        assertEquals(ClassName("bindings.gtk", "Root"), clazz.implementsInterfaces.first())
    }

    @Test
    fun testInterfaceFilteringWindowHandle() {
        val clazz = gtkBlueprint.classBlueprints.first { it.kotlinName == "WindowHandle" }
        assertEquals(0, clazz.implementsInterfaces.size)
    }

    @Test
    fun testInterfaceFilteringFilterListModel() {
        val clazz = gtkBlueprint.classBlueprints.first { it.kotlinName == "FilterListModel" }
        // should only contain 1 interface from another package (gio)
        assertEquals(1, clazz.implementsInterfaces.size)
        assertEquals(ClassName("bindings.gio", "ListModel"), clazz.implementsInterfaces.first())
    }

    @Test
    fun testInterfaceFilteringAnyFilter() {
        val clazz = gtkBlueprint.classBlueprints.first { it.kotlinName == "AnyFilter" }
        // should not have any interfaces, as it extends from FilterListModel
        assertEquals(0, clazz.implementsInterfaces.size)
    }
}

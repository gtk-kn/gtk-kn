package org.gtkkn.gir.processor

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import org.gtkkn.gir.parser.GirParser
import java.io.File
import kotlin.test.Test
import kotlin.test.assertEquals

private const val GTK_GIR_RESOURCE_NAME = "/girfiles/Gtk-4.0.gir"

class ProcessingTests {

    private val gtkBlueprint by lazy {
        val girParser = GirParser()
        val file = File(checkNotNull(javaClass.getResource(GTK_GIR_RESOURCE_NAME)).toURI())
        val gtkRepository = girParser.parse(file)

        val processor = Phase2Processor()
        processor.process(listOf(gtkRepository)).first()
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
        assertEquals("AboutDialog", clazz.kotlinName)
        assertEquals("AboutDialog", clazz.nativeName)
        assertEquals(ClassName("bindings.gtk", "AboutDialog"), clazz.typeName)
        assertEquals(ClassName("bindings.gtk", "Window"), clazz.parentTypeName)
        assertEquals("gtkAboutDialogPointer", clazz.objectPointerName)
        assertEquals(
            ClassName("kotlinx.cinterop", "CPointer").parameterizedBy(
                ClassName("native.gtk", "GtkAboutDialog"),
            ),
            clazz.objectPointerTypeName,
        )
    }
}

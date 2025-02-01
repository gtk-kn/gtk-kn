/*
 * Copyright (c) 2025 gtk-kn
 *
 * SPDX-License-Identifier: LGPL-2.1-or-later
 *
 * This file is part of gtk-kn.
 * gtk-kn is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, see <http://www.gnu.org/licenses/>.
 */

package org.gtkkn.gir.parser.gir

import org.gtkkn.gir.model.GirTransferOwnership
import org.gtkkn.gir.parser.metadata.MetadataParser
import org.gtkkn.gir.util.loadResourceAsFile
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

private const val GTK_GIR_RESOURCE_NAME = "/gir-files/linux/Gtk-4.0.gir"

class GirParserTest {
    private val gtkRepository by lazy {
        val girParser = GirParser(MetadataParser())
        val file = checkNotNull(loadResourceAsFile(GTK_GIR_RESOURCE_NAME))
        girParser.parse(file)
    }

    @Test
    fun parseRepository() {
        assertEquals("1.2", gtkRepository.version)
    }

    @Test
    fun parseCIncludes() {
        assertEquals(1, gtkRepository.cIncludes.count())
        assertEquals("gtk/gtk.h", gtkRepository.cIncludes.first().name)
    }

    @Test
    fun parseIncludes() {
        assertEquals(2, gtkRepository.includes.count())

        val gdkInclude = gtkRepository.includes.firstOrNull { it.name == "Gdk" }
        assertNotNull(gdkInclude)
        assertEquals("4.0", gdkInclude.version)

        val gskInclude = gtkRepository.includes.firstOrNull { it.name == "Gsk" }
        assertNotNull(gskInclude)
        assertEquals("4.0", gskInclude.version)
    }

    @Test
    fun parsePackage() {
        assertEquals(1, gtkRepository.packages.count())
        assertEquals("gtk4", gtkRepository.packages.first().name)
    }

    @Test
    fun parseNamespace() {
        assertEquals("Gtk", gtkRepository.namespaces.first().name)
        assertEquals("4.0", gtkRepository.namespaces.first().version)
    }

    @Test
    fun parseClass() {
        val clazz = gtkRepository.namespaces.first().classes.first { it.name == "ATContext" }

        assertEquals("ATContext", clazz.name)
        assertEquals("at_context", clazz.cSymbolPrefix)
        assertEquals("GObject.Object", clazz.parent)
        assertEquals(true, clazz.abstract)
        assertEquals("GtkATContext", clazz.glibTypeName)
        assertEquals("gtk_at_context_get_type", clazz.glibGetType)
        assertEquals("ATContextClass", clazz.glibTypeStruct)
    }

    @Test
    fun parseDocs() {
        val clazz = gtkRepository.namespaces.first().classes.first { it.name == "ATContext" }
        val doc = clazz.doc?.doc

        assertEquals("gtk/gtkatcontext.c", doc?.filename)
        assertEquals(true, doc?.preserveSpace)
        assertEquals("21", doc?.line)
        assertEquals(true, doc?.text?.contains("is an abstract class provided by GTK to communicate"))
    }

    @Test
    fun parseConstructor() {
        val clazz = gtkRepository.namespaces.first().classes.first { it.name == "ATContext" }
        assertEquals(1, clazz.constructors.count())
        val constructor = clazz.constructors.first()

        assertEquals("create", constructor.callable.getName())
        assertEquals("gtk_at_context_create", constructor.callable.cIdentifier)
        assertNotNull(constructor.returnValue)
        assertNotNull(constructor.parameters)
        assertEquals(3, constructor.parameters?.parameters?.count())
    }

    @Test
    fun parseReturnValue() {
        val clazz = gtkRepository.namespaces.first().classes.first { it.name == "ATContext" }
        val returnValue = clazz.constructors.first().returnValue

        assertEquals(GirTransferOwnership.FULL, returnValue?.transferOwnership)
        assertEquals(true, returnValue?.isNullable())
    }

    @Test
    fun parseMethod() {
        val clazz = gtkRepository.namespaces.first().classes.first { it.name == "ATContext" }
        val method = clazz.methods.first { it.callable.getName() == "get_accessible" }

        assertEquals("gtk_at_context_get_accessible", method.callable.cIdentifier)
        assertEquals("accessible", method.glibGetProperty)
        assertEquals("Retrieves the `GtkAccessible` using this context.", method.doc?.doc?.text)
        assertNotNull(method.parameters?.instanceParameter)
    }

    @Test
    fun parseInstanceParameter() {
        val clazz = gtkRepository.namespaces.first().classes.first { it.name == "ATContext" }
        val method = clazz.methods.first { it.callable.getName() == "get_accessible" }
        val instanceParameter = method.parameters?.instanceParameter
        assertNotNull(instanceParameter)
        assertEquals("a `GtkATContext`", instanceParameter.doc?.doc?.text)
        assertEquals("ATContext", instanceParameter.type.name)
        assertEquals("GtkATContext*", instanceParameter.type.cType)
        assertEquals(GirTransferOwnership.NONE, instanceParameter.transferOwnership)
    }
}

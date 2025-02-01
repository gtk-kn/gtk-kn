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

package org.gtkkn.extensions.gobject

import kotlinx.cinterop.reinterpret
import org.gtkkn.bindings.gio.Application
import org.gtkkn.bindings.gio.ApplicationFlags
import org.gtkkn.bindings.gio.File
import org.gtkkn.bindings.gio.Menu
import org.gtkkn.bindings.gio.MenuModel
import org.gtkkn.bindings.gobject.Object
import org.gtkkn.extensions.glib.cinterop.Proxy
import org.gtkkn.native.gio.g_application_new
import org.gtkkn.native.gio.g_file_parse_name
import org.gtkkn.native.gio.g_menu_new
import org.gtkkn.native.gobject.g_object_unref
import org.gtkkn.native.gobject.gpointer
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertIs
import kotlin.test.assertIsNot
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

/**
 * Unit tests for the `TypeCache` class, ensuring correct behavior in various
 * scenarios such as direct registration, fallback handling, and parent type resolution.
 *
 * ## Key Behaviors Tested:
 * - Direct registration and retrieval of constructors.
 * - Fallback logic for unregistered types.
 * - Resolution of parent types if the child type is unregistered and parent is non-fundamental.
 * - Handling of fundamental types when no fallback is provided.
 * - Correct mapping of `KClass` to `GType`.
 */
class TypeCacheTest {
    @BeforeTest
    fun setUp() {
        // Clear the TypeCache before each test to ensure isolation.
        TypeCache.clearForTest()

        // Register the fundamental `Object` type, used in fallback scenarios.
        TypeCache.register(
            clazz = Object::class,
            type = Object.getType(),
        ) { ptr -> Object(ptr.reinterpret()) }
    }

    @Test
    fun `direct registration resolves constructor`() {
        // Arrange
        TypeCache.register(
            clazz = Application::class,
            type = Application.getType(),
            constructor = { ptr -> Application(ptr.reinterpret()) },
        )
        val appPointer: gpointer = getAppPointer()

        // Act
        val constructor = TypeCache.getConstructor<Proxy>(
            address = appPointer,
            fallback = null,
        )

        // Assert
        assertNotNull(constructor, "TypeCache should find a direct constructor for the GType.")
        val appProxy = constructor(appPointer)
        assertIs<Application>(appProxy, "Expected an Application instance.")
        g_object_unref(appPointer.reinterpret())
    }

    /**
     * Verifies that a fallback constructor is used when the type is unregistered.
     */
    @Test
    fun `fallback constructor is used for unregistered type`() {
        // Arrange
        val fallbackConstructor: (gpointer) -> Proxy = { ptr -> Application(ptr.reinterpret()) }
        val appPointer: gpointer = getAppPointer()

        // Act
        val constructor = TypeCache.getConstructor(
            address = appPointer,
            fallback = TypeCache.Fallback(Application.getType(), fallbackConstructor),
        )

        // Assert
        assertNotNull(constructor, "Fallback constructor should be used for unregistered type.")
        val instance = constructor(appPointer)
        assertTrue(instance is Application, "Fallback should produce an Application instance.")
        g_object_unref(appPointer.reinterpret())
    }

    /**
     * Verifies that the parent type's constructor is used if the child type is unregistered
     * and the parent type is not fundamental.
     */
    @Test
    fun `parent type constructor is used if parent is non-fundamental`() {
        // Arrange
        TypeCache.register(
            clazz = MenuModel::class,
            type = MenuModel.getType(),
        ) { ptr -> MenuModel.MenuModelImpl(ptr.reinterpret()) }
        val menuPointer: gpointer = checkNotNull(g_menu_new())

        // Act
        val menuConstructor = TypeCache.getConstructor<Proxy>(
            type = Menu.getType(),
            fallback = null,
        )

        // Assert
        assertNotNull(menuConstructor, "Parent's constructor should be returned for unregistered child type.")
        val instance = menuConstructor(menuPointer)
        assertIs<MenuModel>(instance, "Expected an instance of MenuModel, the parent class.")
        assertIsNot<Menu>(instance, "Expected the instance not to be of type Menu.")
        g_object_unref(menuPointer.reinterpret())
    }

    /**
     * Verifies that a fundamental parent's constructor is used when no fallback is provided.
     */
    @Test
    fun `fundamental parent's constructor is used when fallback is null`() {
        // Arrange
        val appPointer: gpointer = getAppPointer()

        // Act
        val constructor = TypeCache.getConstructor<Proxy>(
            type = Application.getType(),
            fallback = null,
        )

        // Assert
        assertNotNull(constructor, "Parent's fundamental constructor should be returned when fallback is null.")
        val instance = constructor(appPointer)
        assertIs<Object>(instance, "Expected an instance of Object when parent is fundamental.")
        g_object_unref(appPointer.reinterpret())
    }

    /**
     * Verifies that the correct GType is returned after registration.
     */
    @Test
    fun `getType returns correct GType after registration`() {
        // Arrange
        TypeCache.register(
            clazz = Application::class,
            type = Application.getType(),
        ) { ptr -> Application(ptr.reinterpret()) }

        // Act
        val returnedGType = TypeCache.getType(Application::class)

        // Assert
        assertEquals(Application.getType(), returnedGType, "Application::class should map back to its GType.")
    }

    /**
     * Verifies that requesting the GType for an unregistered class throws an exception.
     */
    @Test
    fun `getType throws exception for unregistered type`() {
        // Act & Assert
        assertFailsWith<IllegalStateException> { TypeCache.getType(Application::class) }
    }

    /**
     * Verifies that an interface's constructor is used if the child type is unregistered.
     */
    @Test
    fun `interface type constructor is used when child type is unregistered`() {
        // Arrange
        TypeCache.register(
            clazz = File::class,
            type = File.getType(),
        ) { ptr -> File.FileImpl(ptr.reinterpret()) }
        val filePointer: gpointer = checkNotNull(g_file_parse_name("test.txt"))

        // Act
        val fileConstructor = TypeCache.getConstructor<Proxy>(
            address = filePointer,
            fallback = null,
        )

        // Assert
        assertNotNull(fileConstructor, "Interface's constructor should be returned when child GType is not found.")
        val instance = fileConstructor(filePointer)
        assertIs<File>(instance, "Expected an instance of File, the parent interface class.")
        g_object_unref(filePointer.reinterpret())
    }

    /**
     * Helper function to create a test pointer for an Application instance.
     */
    private fun getAppPointer(): gpointer =
        checkNotNull(g_application_new("my.test.id", ApplicationFlags.FLAGS_NONE.mask))
}

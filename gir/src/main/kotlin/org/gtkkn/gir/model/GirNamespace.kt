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

package org.gtkkn.gir.model

/**
 * Namespace which maps metadata entries to C functionality. This is a similar concept to namespace in C++,
 * but for GObject-based C libraries.
 *
 * @property name Name of the namespace. For example, 'Gtk'.
 * @property version Version number of the namespace.
 * @property cIdentifierPrefixes Prefixes to filter out from C identifiers for data structures and types.
 *                               For example, GtkWindow will be Window.
 * @property cSymbolPrefixes Prefixes to filter out from C functions. For example, gtk_window_new will lose gtk_.
 * @property cPrefix Deprecated: the same as c:identifier-prefixes. Only used for backward compatibility.
 * @property sharedLibrary Path to the shared library implementing the namespace. It can be a comma-separated list,
 *                         with relative path only.
 * @property aliases Aliases (type's name substitutions, representing typedefs in C).
 * @property classes Classes (GObject inherited class definitions).
 * @property interfaces Interfaces (abstract interfaces to other classes).
 * @property records Records (equivalent to C structs, simple structures not classes).
 * @property enumerations Enumerations (defining enumeration types similar to enum in C/C++).
 * @property functions Functions (standalone functions).
 * @property functionInlines Inline functions.
 * @property functionMacros Function macros (pre-processor macros that behave like functions).
 * @property unions Unions (types of data being a union of types, similar to union in C).
 * @property bitfields Bitfields (defining bit fields as in C).
 * @property callbacks Callbacks (callback closures).
 * @property constants Constants (similar to const variables in C).
 * @property annotations Annotations (defining annotations from the source code).
 * @property boxeds Boxed types (wrappers to opaque C structures registered by the type system).
 * @property docSections Documentation sections.
 */
@Suppress("DataClassShouldBeImmutable", "LateinitUsage", "LongMethod")
data class GirNamespace(
    val name: String? = null,
    val version: String? = null,
    val cIdentifierPrefixes: String? = null,
    val cSymbolPrefixes: String? = null,
    val cPrefix: String? = null,
    val sharedLibrary: String? = null,
    val aliases: List<GirAlias> = emptyList(),
    val classes: List<GirClass> = emptyList(),
    val interfaces: List<GirInterface> = emptyList(),
    val records: List<GirRecord> = emptyList(),
    val enumerations: List<GirEnumeration> = emptyList(),
    val functions: List<GirFunction> = emptyList(),
    val functionInlines: List<GirFunctionInline> = emptyList(),
    val functionMacros: List<GirFunctionMacro> = emptyList(),
    val unions: List<GirUnion> = emptyList(),
    val bitfields: List<GirBitfield> = emptyList(),
    val callbacks: List<GirCallback> = emptyList(),
    val constants: List<GirConstant> = emptyList(),
    val annotations: List<GirAnnotation> = emptyList(),
    val boxeds: List<GirBoxed> = emptyList(),
    val docSections: List<GirDocSection> = emptyList(),
) : GirNode {
    override lateinit var parentNode: GirNode
    override var namespace: GirNamespace = this

    val mainSymbolPrefix: String? = cSymbolPrefixes?.substringBefore(",")

    override fun initializeChildren(namespace: GirNamespace) {
        aliases.forEach { it.initialize(this, this) }
        classes.forEach { it.initialize(this, this) }
        interfaces.forEach { it.initialize(this, this) }
        records.forEach { it.initialize(this, this) }
        enumerations.forEach { it.initialize(this, this) }
        functions.forEach { it.initialize(this, this) }
        functionInlines.forEach { it.initialize(this, this) }
        functionMacros.forEach { it.initialize(this, this) }
        unions.forEach { it.initialize(this, this) }
        bitfields.forEach { it.initialize(this, this) }
        callbacks.forEach { it.initialize(this, this) }
        constants.forEach { it.initialize(this, this) }
        annotations.forEach { it.initialize(this, this) }
        boxeds.forEach { it.initialize(this, this) }
        docSections.forEach { it.initialize(this, this) }
    }
}

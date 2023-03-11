package org.gtkkn.gir.processor

import org.gtkkn.gir.model.GirRepository

/**
 * A context object that has all the Gir information available so any phase 2 processing
 * can resolve types or objects for dependencies
 */
class ProcessorContext(
    private val repositories: List<GirRepository>
) {
    fun findRepositoryByName(name: String): GirRepository? = repositories.find { it.namespace.name == name }
}

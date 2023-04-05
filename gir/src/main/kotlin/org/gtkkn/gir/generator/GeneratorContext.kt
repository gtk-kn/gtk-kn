package org.gtkkn.gir.generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.TypeName
import org.gtkkn.gir.blueprints.RepositoryBlueprint
import org.gtkkn.gir.blueprints.VersionBlueprint

/**
 * A Context object for the [BindingsGenerator] that contains information like repositories and versions.
 */
class GeneratorContext(
    private val repositories: List<RepositoryBlueprint>,
) {

    var currentRepository: RepositoryBlueprint? = null

    fun findVersion(className: ClassName, versionName: String): VersionBlueprint? =
        findVersion(className.packageName, versionName)

    fun findVersion(typeName: TypeName, versionName: String): VersionBlueprint? =
        findVersion(typeName.toString(), versionName)

    fun findVersion(packageName: String, versionName: String): VersionBlueprint? {
        val moduleName = packageName.split(".")[3]
        val repository = repositories.firstOrNull { it.kotlinModuleName == moduleName }

        return repository?.versions?.firstOrNull { it.name == versionName }
    }

    /**
     * Find the version for the current
     */
    fun findVersion(versionName: String): VersionBlueprint? {
        if (currentRepository == null) {
            error("No current repository configured")
        }
        return currentRepository?.versions?.firstOrNull() { it.name == versionName }
    }

}

package org.gtkkn.gir.generator

import org.gtkkn.gir.blueprints.RepositoryBlueprint
import java.io.File

class BindingsGenerator(
    private val outputDir: File // currently assumed to be bindings
) {

    /**
     * bindings build dir
     */
    fun repositoryBuildDir(repository: RepositoryBlueprint): File =
        File(outputDir, "${repository.kotlinModuleName}/build")

    /**
     * bindings src output dir
     */
    fun repositorySrcDir(repository: RepositoryBlueprint): File =
        File(outputDir, "${repository.kotlinModuleName}/src/nativeMain")

    fun generate(repositoryBlueprints: List<RepositoryBlueprint>) {
        repositoryBlueprints.forEach { writeRepository(it) }
    }

    private fun writeRepository(repository: RepositoryBlueprint) {
        val repositoryOutputDir = repositoryBuildDir(repository)
        if (!repositoryOutputDir.exists()) {
            println("Creating output dir ${repositoryOutputDir.path}")
            val created = repositoryOutputDir.mkdirs()
            if (!created) {
                println("Cannot create output path ${repositoryOutputDir.path}")
                return
            }
        }

        println("Writing repository ${repository.name}")
        writeRepositorySkipFile(repository)
    }

    private fun writeRepositorySkipFile(repository: RepositoryBlueprint) {
        val skipFile = File(repositoryBuildDir(repository), "${repository.name}-skips.txt")
        skipFile.createNewFile()

        val skipWriter = skipFile.printWriter()
        val longestObjectName = repository.skippedObjects.maxOfOrNull { it.objectName.length } ?: 0
        val longestTypeName = repository.skippedObjects.maxOfOrNull { it.objectType.length } ?: 0
        repository.skippedObjects.forEach {
            skipWriter.println(it.fullMessage(longestObjectName, longestTypeName))
        }
        skipWriter.close()
    }
}

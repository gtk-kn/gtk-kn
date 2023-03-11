package org.gtkkn.gir.generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import org.gtkkn.gir.blueprints.ClassBlueprint
import org.gtkkn.gir.blueprints.MethodBlueprint
import org.gtkkn.gir.blueprints.RepositoryBlueprint
import java.io.File

/**
 * Temporary generator for prototyping purposes.
 */
class BindingsGenerator(
    private val outputDir: File
) {
    fun generate(repositoryBlueprints: List<RepositoryBlueprint>) {
        repositoryBlueprints.forEach { writeRepository(it) }
    }

    private fun writeRepository(repository: RepositoryBlueprint) {
        println("Writing repository ${repository.name}")
        writeRepositorySkipFile(repository)
        repository.classBlueprints.forEach { writeClass(repository, it) }
    }

    private fun writeRepositorySkipFile(repository: RepositoryBlueprint) {
        val skipFile = File(outputDir, "${repository.name}-skips.txt")
        skipFile.createNewFile()

        val skipWriter = skipFile.printWriter()
        val longestObjectName = repository.skippedObjects.maxOfOrNull { it.objectName.length } ?: 0
        val longestTypeName = repository.skippedObjects.maxOfOrNull { it.objectType.length } ?: 0
        repository.skippedObjects.forEach {
            skipWriter.println(it.fullMessage(longestObjectName, longestTypeName))
        }
        skipWriter.close()
    }

    private fun writeClass(repository: RepositoryBlueprint, clazz: ClassBlueprint) {
        println("Writing class ${clazz.typeName}")

        val classTypeSpec = TypeSpec.classBuilder(clazz.typeName).apply {
            // parent class
            if (clazz.parentTypeName != null) {
                superclass(clazz.parentTypeName)
            }

            // interfaces
            addSuperinterfaces(clazz.implementsInterfaces)

            // object pointer
            val objectPointerGetter = FunSpec.getterBuilder().addStatement("return gPointer.reinterpret()").build()
            val objectPointerProperty = PropertySpec.builder(clazz.objectPointerName, clazz.objectPointerTypeName)
                .getter(objectPointerGetter)
                .build()
            addProperty(objectPointerProperty)

            // methods
            addFunctions(clazz.methods.map { buildMethodSpec(clazz, it) })

            // kdoc
            addKdoc(buildClassKDoc(clazz))
        }.build()

        val fileSpec = FileSpec
            .builder(clazz.typeName.packageName, clazz.typeName.simpleName)
            .addType(classTypeSpec)
            .build()

        fileSpec.writeTo(outputDir)
    }

    private fun buildClassKDoc(clazz: ClassBlueprint): CodeBlock {
        // nicely format skipped objects
        val longestObjectName = clazz.skippedObjects.maxOfOrNull { it.objectName.length } ?: 0
        val longestTypeName = clazz.skippedObjects.maxOfOrNull { it.objectType.length } ?: 0

        return CodeBlock.builder().apply {
            for (skip in clazz.skippedObjects) {
                addStatement(skip.fullMessage(longestObjectName, longestTypeName))
            }
        }.build()
    }

    /**
     * Build a [FunSpec] from a [MethodBlueprint].
     */
    private fun buildMethodSpec(clazz: ClassBlueprint, method: MethodBlueprint): FunSpec =
        FunSpec.builder(method.kotlinName).apply {
            // return type
            returns(method.returnTypeInfo.kotlinTypeName)

            // arguments

            // implementation
            addStatement("return ${method.nativeName}()")

        }.build()
}

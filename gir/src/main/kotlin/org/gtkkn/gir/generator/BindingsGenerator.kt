package org.gtkkn.gir.generator

import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import org.gtkkn.gir.blueprints.ClassBlueprint
import org.gtkkn.gir.blueprints.MethodBlueprint
import org.gtkkn.gir.blueprints.RepositoryBlueprint
import java.io.File


// some member utils
private val REINTERPRET_FUNC = MemberName("kotlinx.cinterop", "reinterpret")

/**
 * Temporary generator for prototyping purposes.
 */
class BindingsGenerator(
    private val outputDir: File // currently assumed to be bindings
) {

    fun repositoryBuildDir(repository: RepositoryBlueprint): File =
        File(outputDir, "${repository.kotlinModuleName}/build")

    fun repositoryBuildSrcDir(repository: RepositoryBlueprint): File =
        File(repositoryBuildDir(repository), "gir-generated")

    fun generate(repositoryBlueprints: List<RepositoryBlueprint>) {
        repositoryBlueprints.forEach { writeRepository(it) }
    }

    private fun writeRepository(repository: RepositoryBlueprint) {

        val repositoryOutputDir = repositoryBuildDir(repository)
        if (!repositoryOutputDir.exists()) {
            println("Creating output dir ${repositoryOutputDir.path}")
            val created = repositoryOutputDir.mkdirs()
            if (!created) {
                println("Skipping repository ${repository.name} because output dir ${repositoryOutputDir.path} does not exist")
                return
            }
        }

        println("Writing repository ${repository.name}")
        writeRepositorySkipFile(repository)
        repository.classBlueprints.forEach { writeClass(repository, it) }
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

    private fun writeClass(repository: RepositoryBlueprint, clazz: ClassBlueprint) {
        println("Writing class ${clazz.typeName}")

        val classTypeSpec = TypeSpec.classBuilder(clazz.typeName).apply {
            // parent class
            if (clazz.parentTypeName != null) {
                superclass(clazz.parentTypeName)
            }

            // interfaces
            addSuperinterfaces(clazz.implementsInterfaces)

            // pointer constructor
            addFunction(buildPointerConstructor(clazz))

            // object pointer
            addProperty(buildObjectPointerProperty(clazz))

            // methods
            addFunctions(clazz.methods.map { buildMethodSpec(clazz, it) })

            // kdoc
            addKdoc(buildClassKDoc(clazz))

            // modifiers
            // TODO check if class is final before opening
            addModifiers(KModifier.OPEN)
        }.build()

        val fileSpec = FileSpec
            .builder(clazz.typeName.packageName, clazz.typeName.simpleName)
            .addType(classTypeSpec)
            .build()

        fileSpec.writeTo(repositoryBuildSrcDir(repository))
    }

    /**
     * Build the constructor for pointer wrapping.
     */
    private fun buildPointerConstructor(clazz: ClassBlueprint): FunSpec {
        val constructorSpecBuilder = FunSpec.constructorBuilder()

        val pointerParamSpec = ParameterSpec.builder("pointer", clazz.objectPointerTypeName).build()
        constructorSpecBuilder.addParameter(pointerParamSpec)

        if (clazz.hasParent) {
            // call through to super
            constructorSpecBuilder.callSuperConstructor(CodeBlock.of("pointer.%M()", REINTERPRET_FUNC))
        } else {
            // init pointer property
            constructorSpecBuilder.addStatement("gPointer = pointer.%M()", REINTERPRET_FUNC)
        }

        return constructorSpecBuilder.build()
    }

    private fun buildObjectPointerProperty(clazz: ClassBlueprint): PropertySpec {
        val propertyBuilder = PropertySpec.builder(clazz.objectPointerName, clazz.objectPointerTypeName)

        if (clazz.hasParent) {
            // if class has a parent, we can downcast the gPointer from parent, using a getter
            propertyBuilder.getter(
                FunSpec.getterBuilder()
                    .addStatement("return gPointer.%M()", REINTERPRET_FUNC)
                    .build(),
            )
        } else {
            // if class has no parent, it is likely Object and we need to initialize the pointer
        }

        return propertyBuilder.build()
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
            addStatement("return %M()", method.nativeMemberName)

        }.build()
}

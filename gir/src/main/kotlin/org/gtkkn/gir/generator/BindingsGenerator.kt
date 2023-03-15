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
import org.gtkkn.gir.blueprints.ImplementsInterfaceBlueprint
import org.gtkkn.gir.blueprints.InterfaceBlueprint
import org.gtkkn.gir.blueprints.RepositoryBlueprint
import java.io.File

// some member utils
private val REINTERPRET_FUNC = MemberName("kotlinx.cinterop", "reinterpret")

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
        File(outputDir, "${repository.kotlinModuleName}/src/nativeMain/kotlin")

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

        // write skip file
        writeRepositorySkipFile(repository)

        // write classes
        repository.classBlueprints.forEach { writeClass(repository, it) }

        // write interfaces
        repository.interfaceBlueprints.forEach { writeInterface(repository, it) }
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
            addSuperinterfaces(clazz.implementsInterfaces.map { it.interfaceTypeName })

            // pointer constructor
            addFunction(buildPointerConstructor(clazz))

            // object pointer
            addProperty(buildClassObjectPointerProperty(clazz))

            // interface pointers
            clazz.implementsInterfaces.forEach {
                addProperty(buildClassInterfacePointerProperty(it))
            }

            // kdoc
            addKdoc(buildClassKDoc(clazz))

            // modifiers
            // currently marking all classes as open to make it compile
            addModifiers(KModifier.OPEN)
        }.build()

        val fileSpec = FileSpec
            .builder(clazz.typeName.packageName, clazz.typeName.simpleName)
            .addType(classTypeSpec)
            .build()

        fileSpec.writeTo(repositorySrcDir(repository))
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

    /**
     * Build the pointer property for a class.
     */
    private fun buildClassObjectPointerProperty(clazz: ClassBlueprint): PropertySpec {
        val propertyBuilder = PropertySpec.builder(clazz.objectPointerName, clazz.objectPointerTypeName)

        if (clazz.hasParent) {
            // if class has a parent, we can downcast the gPointer from parent, using a getter
            propertyBuilder.getter(
                FunSpec.getterBuilder()
                    .addStatement("return gPointer.%M()", REINTERPRET_FUNC)
                    .build(),
            )
        }

        return propertyBuilder.build()
    }

    /**
     * Build the interface pointer property for classes implementing an interface.
     *
     * This is the pointer that needs to be overridden to conform to the interface.
     */
    private fun buildClassInterfacePointerProperty(iface: ImplementsInterfaceBlueprint): PropertySpec {
        val propertyBuilder = PropertySpec.builder(iface.interfacePointerName, iface.interfacePointerTypeName)
            .addModifiers(KModifier.OVERRIDE)

        propertyBuilder.getter(
            FunSpec.getterBuilder()
                .addStatement("return gPointer.%M()", REINTERPRET_FUNC)
                .build(),
        )

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

    private fun writeInterface(repository: RepositoryBlueprint, iface: InterfaceBlueprint) {
        println("Writing interface: ${iface.typeName}")

        val ifaceTypeSpec = TypeSpec.interfaceBuilder(iface.typeName).apply {
            addProperty(buildInterfacePointerProperty(iface))
        }.build()

        val fileSpec = FileSpec
            .builder(iface.typeName.packageName, iface.typeName.simpleName)
            .addType(ifaceTypeSpec)
            .build()

        fileSpec.writeTo(repositorySrcDir(repository))
    }

    private fun buildInterfacePointerProperty(iface: InterfaceBlueprint): PropertySpec =
        PropertySpec.builder(iface.objectPointerName, iface.objectPointerTypeName)
            .build()
}

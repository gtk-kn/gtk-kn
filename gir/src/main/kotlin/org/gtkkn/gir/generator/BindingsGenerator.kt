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
import org.gtkkn.gir.blueprints.ConversionType.ENUMERATION
import org.gtkkn.gir.blueprints.ConversionType.NO_CONVERSION
import org.gtkkn.gir.blueprints.ConversionType.OBJECT_POINTER
import org.gtkkn.gir.blueprints.ConversionType.UNKNOWN
import org.gtkkn.gir.blueprints.EnumBlueprint
import org.gtkkn.gir.blueprints.InterfaceBlueprint
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
                println(
                    "Skipping repository ${repository.name} because output dir ${repositoryOutputDir.path} does not exist",
                )
                return
            }
        }

        println("Writing repository ${repository.name}")
        writeRepositorySkipFile(repository)

        // write classes
        repository.classBlueprints.forEach { writeClass(repository, it) }

        // write interfaces
        repository.interfaceBlueprints.forEach { writeInterface(repository, it) }

        // write enums
        repository.enumBlueprints.forEach { writeEnum(repository, it) }
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
//            addSuperinterfaces(clazz.implementsInterfaces)

            // pointer constructor
            addFunction(buildPointerConstructor(clazz))

            // object pointer
            addProperty(buildObjectPointerProperty(clazz))

            // methods
            addFunctions(clazz.methods.map { buildMethodSpec(it, clazz.objectPointerName) })

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

    private fun writeInterface(repository: RepositoryBlueprint, iface: InterfaceBlueprint) {
        println("Writing interface: ${iface.typeName}")

        val ifaceTypeSpec = TypeSpec.interfaceBuilder(iface.typeName).apply {
            addProperty(buildInterfacePointerProperty(iface))
            addFunctions(iface.methods.map { buildMethodSpec(it, iface.objectPointerName) })
        }.build()

        val fileSpec = FileSpec
            .builder(iface.typeName.packageName, iface.typeName.simpleName)
            .addType(ifaceTypeSpec)
            .build()

        fileSpec.writeTo(repositoryBuildSrcDir(repository))
    }

    private fun buildInterfacePointerProperty(iface: InterfaceBlueprint): PropertySpec =
        PropertySpec.builder(iface.objectPointerName, iface.objectPointerTypeName)
            .build()

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
    private fun buildMethodSpec(method: MethodBlueprint, instancePointerName: String): FunSpec =
        FunSpec.builder(method.kotlinName).apply {
            // return type
            returns(method.returnTypeInfo.kotlinTypeName)

            method.parameterBlueprints.forEach { param ->
                addParameter(ParameterSpec.builder(param.kotlinName, param.typeInfo.kotlinTypeName).build())
            }

            // arguments
            if (method.parameterBlueprints.isNotEmpty()) {
                addStatement("""TODO("methods with parameters not supported")""")
                return@apply
            }

            // implementation
            when (method.returnTypeInfo.conversionType) {
                NO_CONVERSION -> addStatement(
                    "return %M($instancePointerName.%M())",
                    method.nativeMemberName,
                    REINTERPRET_FUNC,
                )

                ENUMERATION ->
                    addStatement(
//                        "return %T.fromNativeValue(%M($instancePointerName.%M()))",
                        "return %M($instancePointerName.%M()).let({ %T.fromNativeValue(it)})",
                        // instanceparam
                        method.nativeMemberName,
                        REINTERPRET_FUNC,
                        // return conversion
                        method.returnTypeInfo.kotlinTypeName,
                    )

                OBJECT_POINTER ->
                    addStatement("""TODO("object type conversion is not implemented")""")

                UNKNOWN ->
                    addStatement("""TODO("unknown type conversion is not implemented")""")
            }
        }.build()

    private fun writeEnum(repository: RepositoryBlueprint, enum: EnumBlueprint) {
        println("Writing enum: ${enum.kotlinName}")

        val enumTypeSpec = TypeSpec.enumBuilder(enum.kotlinTypeName).apply {

            addProperty(PropertySpec.builder("nativeValue", enum.nativeTypeName, KModifier.PRIVATE)
                .initializer("nativeValue")
                .build())

            primaryConstructor(
                FunSpec.constructorBuilder()
                    .addParameter("nativeValue", enum.nativeTypeName)
                    .build(),
            )

            enum.memberBlueprints.forEach { member ->
                addEnumConstant(
                    member.kotlinName,
                    TypeSpec.anonymousClassBuilder()
                        .addSuperclassConstructorParameter("%T.byValue(%L)", enum.nativeTypeName, member.nativeValue)
                        .build(),
                )
            }

            val fromNativeValueFuncSpec = FunSpec.builder("fromNativeValue")
                .addParameter("nativeValue", enum.nativeTypeName)
                .returns(enum.kotlinTypeName)
                .addStatement(
                    "return %T.values().asList().first({ it.nativeValue == nativeValue })",
                    enum.kotlinTypeName,
                )
                .build()
            val companionSpec = TypeSpec.companionObjectBuilder()
                .addFunction(fromNativeValueFuncSpec)
                .build()

            addType(companionSpec)

        }.build()

        val fileSpec = FileSpec
            .builder(enum.kotlinTypeName.packageName, enum.kotlinTypeName.simpleName)
            .addType(enumTypeSpec)
            .build()

        fileSpec.writeTo(repositoryBuildSrcDir(repository))
    }
}

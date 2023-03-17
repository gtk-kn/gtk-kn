package org.gtkkn.gir.generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import org.gtkkn.gir.blueprints.BitfieldBlueprint
import org.gtkkn.gir.blueprints.ClassBlueprint
import org.gtkkn.gir.blueprints.ConstructorBlueprint
import org.gtkkn.gir.blueprints.EnumBlueprint
import org.gtkkn.gir.blueprints.ImplementsInterfaceBlueprint
import org.gtkkn.gir.blueprints.InterfaceBlueprint
import org.gtkkn.gir.blueprints.RepositoryBlueprint
import org.gtkkn.gir.blueprints.TypeInfo
import org.gtkkn.gir.log.logger
import java.io.File

class BindingsGenerator {
    /**
     * bindings build dir
     */
    private fun repositoryBuildDir(repository: RepositoryBlueprint, outputDir: File): File =
        File(outputDir, "${repository.kotlinModuleName}/build")

    /**
     * bindings src output dir
     */
    private fun repositorySrcDir(repository: RepositoryBlueprint, outputDir: File): File =
        File(outputDir, "${repository.kotlinModuleName}/src/nativeMain/kotlin")

    fun generate(repository: RepositoryBlueprint, outputDir: File) {
        val repositoryOutputDir = repositoryBuildDir(repository, outputDir)
        if (!repositoryOutputDir.exists()) {
            logger.info("Creating output dir ${repositoryOutputDir.path}")
            if (!repositoryOutputDir.mkdirs()) {
                logger.error("Cannot create output path ${repositoryOutputDir.path}")
                return
            }
        }

        logger.info("Writing repository ${repository.name}")

        // write skip file
        writeRepositorySkipFile(repository, outputDir)

        // write strict enum file
        writeStrictEnumFile(repository, outputDir)

        // write classes
        repository.classBlueprints.forEach { clazz ->
            writeType(
                clazz.typeName,
                buildClass(clazz),
                repositorySrcDir(repository, outputDir),
            )
        }

        // write interfaces
        repository.interfaceBlueprints.forEach { iface ->
            writeType(
                iface.typeName,
                buildInterface(iface),
                repositorySrcDir(repository, outputDir),
            )
        }

        // write bitfields
        repository.bitfieldBlueprints.forEach { bf ->
            writeType(
                bf.kotlinTypeName,
                buildBitfield(bf),
                repositorySrcDir(repository, outputDir),
            )
        }

        // write enums
        repository.enumBlueprints.forEach { enum ->
            writeType(
                enum.kotlinTypeName,
                buildEnum(enum),
                repositorySrcDir(repository, outputDir),
            )
        }
    }

    private fun writeType(
        className: ClassName,
        typeSpec: TypeSpec,
        outputDirectory: File,
    ) {
        logger.debug("Writing ${className.canonicalName}")
        FileSpec
            .builder(className.packageName, className.simpleName)
            .indent("    ")
            .addFileComment("This is a generated file. Do not modify.")
            .addType(typeSpec)
            .build()
            .writeTo(outputDirectory)
    }

    private fun writeRepositorySkipFile(repository: RepositoryBlueprint, outputDir: File) {
        val skipFile = File(repositoryBuildDir(repository, outputDir), "${repository.name}-skips.txt")
        skipFile.createNewFile()

        val skipWriter = skipFile.printWriter()
        val longestObjectName = repository.skippedObjects.maxOfOrNull { it.objectName.length } ?: 0
        val longestTypeName = repository.skippedObjects.maxOfOrNull { it.objectType.length } ?: 0
        repository.skippedObjects.forEach {
            skipWriter.println(it.fullMessage(longestObjectName, longestTypeName))
        }
        skipWriter.close()
    }

    private fun writeStrictEnumFile(repository: RepositoryBlueprint, outputDir: File) {
        val enumsFile = File(repositoryBuildDir(repository, outputDir), "${repository.name}-enums.txt")
        enumsFile.createNewFile()

        enumsFile.printWriter().use { writer ->
            writer.write("strictEnums = \\")
            repository.enumBlueprints.forEach { enum ->
                writer.println("${(enum.nativeValueTypeName as ClassName).simpleName} \\")
            }
        }
    }

    private fun buildClass(clazz: ClassBlueprint): TypeSpec =
        TypeSpec.classBuilder(clazz.typeName).apply {
            // companion object
            val companionSpecBuilder = TypeSpec.companionObjectBuilder()

            // kdoc
            addKdoc(buildClassKDoc(clazz))

            // modifiers
            addModifiers(KModifier.OPEN)  // currently marking all classes as open to make it compile

            // parent class
            if (clazz.parentTypeName != null) {
                superclass(clazz.parentTypeName)
            }

            // interfaces
            addSuperinterfaces(clazz.implementsInterfaces.map { it.interfaceTypeName })

            // pointer constructor
            buildPointerConstructor(this, clazz)

            // constructors

            // some classes have multiple no-arg constructors which would have conflicting overloads if we generate all
            // of them as Kotlin constructors, so we only generate constructors for the non-conflicting ones, and we add
            // the others to the companion object as static functions
            val (noArgConstructors, argumentConstructors) = clazz.constructors.partition { it.parameters.isEmpty() }

            // in case of multiple no-arg constructors, we pick the shorted method name to be the constructor
            noArgConstructors
                .sortedBy { it.nativeName.length }
                .forEachIndexed { index, constructor ->
                    if (index == 0) {
                        addFunction(buildClassConstructor(constructor))
                    } else {
                        companionSpecBuilder.addFunction(buildClassConstructorFactoryMethod(clazz, constructor))
                    }
                }

            // argument constructors
            argumentConstructors.forEach { constructor ->
                addFunction(buildClassConstructor(constructor))
            }

            // object pointer
            addProperty(buildClassObjectPointerProperty(clazz))

            // interface pointers
            clazz.implementsInterfaces.forEach {
                addProperty(buildClassInterfacePointerProperty(it))
            }

            addType(companionSpecBuilder.build())
        }.build()

    /**
     * Build the constructor for pointer wrapping.
     */
    private fun buildPointerConstructor(builder: TypeSpec.Builder, clazz: ClassBlueprint) {
        val constructorSpecBuilder = FunSpec.constructorBuilder()

        val pointerParamSpec = ParameterSpec.builder("pointer", clazz.objectPointerTypeName).build()
        constructorSpecBuilder.addParameter(pointerParamSpec)

        if (clazz.hasParent) {
            // call superclass constructor
            builder.addSuperclassConstructorParameter(CodeBlock.of("pointer.%M()", REINTERPRET_FUNC))
        } else {
            // init pointer property
            constructorSpecBuilder.addStatement("gPointer = pointer.%M()", REINTERPRET_FUNC)
        }

        builder.primaryConstructor(constructorSpecBuilder.build())
    }

    /**
     * Build a class constructor based on a [ConstructorBlueprint].
     */
    private fun buildClassConstructor(constructor: ConstructorBlueprint): FunSpec {
        val constructorSpecBuilder = FunSpec.constructorBuilder()

        if (constructor.returnTypeInfo !is TypeInfo.ObjectPointer) {
            error("Invalid constructor return type")
        }

        constructorSpecBuilder.callThisConstructor(CodeBlock.of("%M()!!.reinterpret()", constructor.nativeMemberName))

        return constructorSpecBuilder.build()
    }

    /**
     * Build a constructor factory method based on a [ConstructorBlueprint].
     */
    private fun buildClassConstructorFactoryMethod(clazz: ClassBlueprint, constructor: ConstructorBlueprint): FunSpec {
        val funSpecBuilder = FunSpec.builder(constructor.kotlinName)
            .returns(clazz.typeName)

        if (constructor.returnTypeInfo !is TypeInfo.ObjectPointer) {
            error("Invalid constructor return type for ${constructor.nativeName}")
        }

        funSpecBuilder.addStatement("return %T(%M()!!.reinterpret())", clazz.typeName, constructor.nativeMemberName)

        return funSpecBuilder.build()
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

    private fun buildInterface(iface: InterfaceBlueprint): TypeSpec =
        TypeSpec.interfaceBuilder(iface.typeName)
            .addProperty(buildInterfacePointerProperty(iface))
            .build()

    private fun buildInterfacePointerProperty(iface: InterfaceBlueprint): PropertySpec =
        PropertySpec.builder(iface.objectPointerName, iface.objectPointerTypeName)
            .build()

    private fun buildBitfield(bitfield: BitfieldBlueprint): TypeSpec {
        val companionSpecBuilder = TypeSpec.companionObjectBuilder()

        bitfield.members.forEach { member ->
            companionSpecBuilder.addProperty(
                PropertySpec.builder(member.kotlinName, bitfield.kotlinTypeName)
                    .initializer("%T(%M)", bitfield.kotlinTypeName, member.nativeMemberName)
                    .build(),
            )
        }

        val constructorSpec = FunSpec.constructorBuilder()
            .addParameter("mask", bitfield.nativeValueTypeName)
            .build()

        val orFuncSpec = FunSpec.builder("or")
            .addModifiers(KModifier.INFIX)
            .addParameter("other", bitfield.kotlinTypeName)
            .returns(bitfield.kotlinTypeName)
            .addStatement("return %T(mask or other.mask)", bitfield.kotlinTypeName)
            .build()

        val bitfieldSpec = TypeSpec.classBuilder(bitfield.kotlinName)
            .primaryConstructor(constructorSpec)
            .addProperty(
                PropertySpec.builder("mask", bitfield.nativeValueTypeName)
                    .initializer("mask")
                    .build(),
            )
            .addFunction(orFuncSpec)
            .addType(companionSpecBuilder.build())

        return bitfieldSpec.build()
    }

    private fun buildEnum(enum: EnumBlueprint): TypeSpec {
        // primary constructor
        val constructorSpec = FunSpec.constructorBuilder()
            .addParameter("nativeValue", enum.nativeValueTypeName)
            .build()

        // enum spec
        val enumSpec = TypeSpec.enumBuilder(enum.kotlinTypeName)
            .primaryConstructor(constructorSpec)
            .addProperty(
                PropertySpec.builder("nativeValue", enum.nativeValueTypeName)
                    .initializer("nativeValue")
                    .build(),
            )

        // add enum members
        enum.memberBlueprints.forEach { member ->
            enumSpec.addEnumConstant(
                member.kotlinName,
                TypeSpec.anonymousClassBuilder()
                    .addSuperclassConstructorParameter("%M", member.nativeMemberName)
                    .build(),
            )
        }

        // companion
        enumSpec.addType(buildEnumCompanion(enum))

        return enumSpec.build()
    }

    private fun buildEnumCompanion(enum: EnumBlueprint): TypeSpec {
        val fromNativeFunc = FunSpec.builder("fromNativeValue")
            .addParameter("nativeValue", enum.nativeValueTypeName)
            .returns(enum.kotlinTypeName)

        fromNativeFunc.beginControlFlow("return when (nativeValue)") // begin when

        // add a case for each member
        for (member in enum.memberBlueprints) {
            fromNativeFunc.addStatement("%M -> %N", member.nativeMemberName, member.kotlinName)
        }

        // most enums can be exhaustive but some exceptions still need an else case due to cinterop member handling
        fromNativeFunc.addStatement("""else -> error("invalid nativeValue")""")

        fromNativeFunc.endControlFlow() // end when

        return TypeSpec.companionObjectBuilder()
            .addFunction(fromNativeFunc.build())
            .build()
    }

    companion object {
        // some member utils
        private val REINTERPRET_FUNC = MemberName("kotlinx.cinterop", "reinterpret")
    }
}

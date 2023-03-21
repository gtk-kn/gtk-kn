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
import org.gtkkn.gir.blueprints.MethodBlueprint
import org.gtkkn.gir.blueprints.MethodParameterBlueprint
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
        repository.bitfieldBlueprints.forEach { bitfield ->
            writeType(
                bitfield.kotlinTypeName,
                buildBitfield(bitfield),
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
        val skippedObjects = repository.skippedObjects.filter { it.documented }

        val skipWriter = skipFile.printWriter()
        val longestObjectName = skippedObjects.maxOfOrNull { it.objectName.length } ?: 0
        val longestTypeName = skippedObjects.maxOfOrNull { it.objectType.length } ?: 0
        skippedObjects.forEach {
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
            addModifiers(KModifier.OPEN) // currently marking all classes as open to make it compile

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
            // argument constructors can also be conflicting
            val groupBySignature = argumentConstructors.groupBy { constructor ->
                constructor.parameters.joinToString(",") { it.typeInfo.kotlinTypeName.toString() }
            }
            groupBySignature.values.forEach { group ->
                when (group.size) {
                    0 -> error("Should not happen")
                    1 -> {
                        // non conflicting constructor
                        addFunction(buildClassConstructor(group.first()))
                    }

                    else -> {
                        // conflicting constructors with same signature
                        group.sortedBy { it.nativeName.length }.forEachIndexed { index, constructor ->
                            if (index == 0) {
                                // add the shortest conflicting method name as an actual constructor
                                // this isn't the best heuristic but it works for most use cases
                                addFunction(buildClassConstructor(constructor))
                            }
                            // add all conflicting as constructors as factory functions
                            // this helps with developer discoverability (for example Gtk4 Button)
                            companionSpecBuilder.addFunction(buildClassConstructorFactoryMethod(clazz, constructor))
                        }
                    }
                }
            }

            // object pointer
            addProperty(buildClassObjectPointerProperty(clazz))

            // interface pointers
            clazz.implementsInterfaces.forEach {
                addProperty(buildClassInterfacePointerProperty(it))
            }

            // methods
            clazz.methods.forEach { method ->
                addFunction(buildMethod(method, clazz.objectPointerName))
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

        if (constructor.parameters.isEmpty()) {
            // no arg constructor
            constructorSpecBuilder
                .callThisConstructor(CodeBlock.of("%M()!!.reinterpret()", constructor.nativeMemberName))
        } else {
            // constructor with arguments
            constructorSpecBuilder.appendSignatureParameters(constructor.parameters)
            val codeBlockBuilder = CodeBlock.builder()

            codeBlockBuilder.add("%M(", constructor.nativeMemberName) // open native func paren

            constructor.parameters.forEachIndexed { index, param ->
                if (index > 0) {
                    codeBlockBuilder.add(", ")
                }
                codeBlockBuilder.add(buildParameterConversionBlock(param))
            }

            codeBlockBuilder.add(")") // close native func paren
            codeBlockBuilder.add("!!.reinterpret()")

            constructorSpecBuilder.callThisConstructor(codeBlockBuilder.build())
        }

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

        if (constructor.parameters.isEmpty()) {
            // no-arg factory method
            funSpecBuilder.addStatement("return %T(%M()!!.reinterpret())", clazz.typeName, constructor.nativeMemberName)
        } else {
            funSpecBuilder.appendSignatureParameters(constructor.parameters)

            // open native function paren
            funSpecBuilder.addCode("return %T(%M(", clazz.typeName, constructor.nativeMemberName)

            constructor.parameters.forEachIndexed { index, param ->
                if (index > 0) {
                    funSpecBuilder.addCode(", ")
                }
                funSpecBuilder.addCode(buildParameterConversionBlock(param))
            }

            funSpecBuilder.addCode(")!!.%M())", REINTERPRET_FUNC) // close native function paren
        }

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
        val skippedObjects = clazz.skippedObjects.filter { it.documented }
        // nicely format skipped objects
        val longestObjectName = skippedObjects.maxOfOrNull { it.objectName.length } ?: 0
        val longestTypeName = skippedObjects.maxOfOrNull { it.objectType.length } ?: 0

        return CodeBlock.builder().apply {
            for (skip in skippedObjects) {
                addStatement(skip.fullMessage(longestObjectName, longestTypeName))
            }
        }.build()
    }

    private fun buildInterface(iface: InterfaceBlueprint): TypeSpec {
        val ifaceBuilder = TypeSpec.interfaceBuilder(iface.typeName)
            .addProperty(buildInterfacePointerProperty(iface))

        iface.methods.forEach { method ->
            ifaceBuilder.addFunction(buildMethod(method, iface.objectPointerName))
        }

        val wrapperClass = TypeSpec.classBuilder("Wrapper")
            .addModifiers(KModifier.PRIVATE, KModifier.DATA)
            .addSuperinterface(iface.typeName)
            .primaryConstructor(
                FunSpec.constructorBuilder()
                    .addParameter("pointer", iface.objectPointerTypeName)
                    .build(),
            )
            .addProperty(
                PropertySpec.builder("pointer", iface.objectPointerTypeName, KModifier.PRIVATE)
                    .initializer("pointer")
                    .build(),
            )
            .addProperty(
                PropertySpec.builder(iface.objectPointerName, iface.objectPointerTypeName, KModifier.OVERRIDE)
                    .initializer("pointer")
                    .build(),
            )
            .build()

        ifaceBuilder.addType(wrapperClass)

        // Add companion with factory wrapper function
        val companionBuilder = TypeSpec.companionObjectBuilder()
        val factoryFunc = FunSpec.builder("wrap")
            .addParameter("pointer", iface.objectPointerTypeName)
            .returns(iface.typeName)
            .addStatement("return Wrapper(pointer)")

        companionBuilder.addFunction(factoryFunc.build())

        ifaceBuilder.addType(companionBuilder.build())

        return ifaceBuilder.build()
    }

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

    private fun buildMethod(method: MethodBlueprint, instancePointer: String?): FunSpec {
        val returnTypeName = method.returnTypeInfo.kotlinTypeName

        val funBuilder = FunSpec.builder(method.kotlinName)
            .returns(returnTypeName)

        if (method.isOverride) {
            funBuilder.addModifiers(KModifier.OVERRIDE)
        }

        funBuilder.appendSignatureParameters(method.parameterBlueprints)

        var needsComma = false
        funBuilder.addCode("return %M(", method.nativeMemberName) // open native function paren
        if (instancePointer != null) {
            // adding reinterpret() here because sometimes the instancePointer has a different type
            funBuilder.addCode("%N.%M()", instancePointer, REINTERPRET_FUNC)
            needsComma = true
        }

        method.parameterBlueprints.forEach { param ->
            if (needsComma) {
                funBuilder.addCode(", ")
            }

            funBuilder.addCode(buildParameterConversionBlock(param))
        }

        funBuilder.addCode(")") // close native function paren

        // return value conversion
        funBuilder.addCode(buildReturnValueConversionBlock(method.returnTypeInfo))

        return funBuilder.build()
    }

    companion object {
        // some member utils
        internal val REINTERPRET_FUNC = MemberName("kotlinx.cinterop", "reinterpret")
        internal val AS_BOOLEAN_FUNC = MemberName("org.gtkkn.common", "asBoolean")
        internal val AS_GBOOLEAN_FUNC = MemberName("org.gtkkn.common", "asGBoolean")
        internal val TO_KSTRING_FUNC = MemberName("kotlinx.cinterop", "toKString")
    }
}

fun FunSpec.Builder.appendSignatureParameters(parameters: List<MethodParameterBlueprint>) {
    // add arguments to signature
    parameters.forEach { param ->
        val kotlinParamType = param.typeInfo.kotlinTypeName
        addParameter(param.kotlinName, kotlinParamType)
    }
}

fun buildReturnValueConversionBlock(returnTypeInfo: TypeInfo): CodeBlock {
    val codeBlockBuilder = CodeBlock.builder()
    val isNullable = returnTypeInfo.kotlinTypeName.isNullable
    val nullableString = if (isNullable) "?" else ""

    when (returnTypeInfo) {
        is TypeInfo.Enumeration -> ReturnValueConversions.buildEnumeration(codeBlockBuilder, returnTypeInfo)
        is TypeInfo.ObjectPointer -> ReturnValueConversions.buildObjectPointer(returnTypeInfo, codeBlockBuilder)
        is TypeInfo.InterfacePointer -> ReturnValueConversions.buildInterfacePointer(
            isNullable,
            codeBlockBuilder,
            returnTypeInfo,
        )

        is TypeInfo.Primitive -> Unit
        is TypeInfo.GBoolean -> ReturnValueConversions.buildGBoolean(codeBlockBuilder)
        is TypeInfo.KString -> ReturnValueConversions.buildKString(isNullable, codeBlockBuilder)
        is TypeInfo.Bitfield -> ReturnValueConversions.buildBitfield(codeBlockBuilder, nullableString, returnTypeInfo)
    }
    return codeBlockBuilder.build()
}

/**
 * Build a [CodeBlock] that converts a Kotlin parameter into a native parameter.
 *
 * The resulting codeblock can be passed as an argument in a call to a native function.
 *
 * For example, given a `button: Button` Kotlin param with a `CPointer<GtkButton>` native type,
 * this method will output something like `button.gtkButtonPointer`.
 *
 * Nullability is handled.
 */
fun buildParameterConversionBlock(param: MethodParameterBlueprint): CodeBlock {
    val codeBlockBuilder = CodeBlock.builder()
    val isParamNullable = param.typeInfo.kotlinTypeName.isNullable
    val nullableString = if (isParamNullable) "?" else ""

    when (param.typeInfo) {
        is TypeInfo.Enumeration -> codeBlockBuilder.add("%N$nullableString.nativeValue", param.kotlinName)
        is TypeInfo.ObjectPointer -> {
            codeBlockBuilder.add(
                "%N$nullableString.%N$nullableString.%M()",
                param.kotlinName,
                param.typeInfo.objectPointerName,
                BindingsGenerator.REINTERPRET_FUNC,
            )
        }

        is TypeInfo.InterfacePointer -> {
            codeBlockBuilder.add(
                "%N$nullableString.%N$nullableString.%M()",
                param.kotlinName,
                param.typeInfo.objectPointerName,
                BindingsGenerator.REINTERPRET_FUNC,
            )
        }

        is TypeInfo.Primitive -> codeBlockBuilder.add("%N", param.kotlinName)
        is TypeInfo.GBoolean -> codeBlockBuilder.add(
            "%N$nullableString.%M()",
            param.kotlinName,
            BindingsGenerator.AS_GBOOLEAN_FUNC,
        )

        is TypeInfo.KString -> codeBlockBuilder.add("%N", param.kotlinName)
        is TypeInfo.Bitfield -> {
            codeBlockBuilder.add("%N$nullableString.mask", param.kotlinName)
        }
    }
    return codeBlockBuilder.build()
}

private object ReturnValueConversions {
    fun buildEnumeration(
        codeBlockBuilder: CodeBlock.Builder,
        returnTypeInfo: TypeInfo,
    ) {
        codeBlockBuilder
            .beginControlFlow(".let")
            .add("%T.fromNativeValue(it)", returnTypeInfo.kotlinTypeName)
            .endControlFlow()
    }

    fun buildObjectPointer(
        returnTypeInfo: TypeInfo.ObjectPointer,
        codeBlockBuilder: CodeBlock.Builder,
    ) {
        if (returnTypeInfo.kotlinTypeName.isNullable) {
            codeBlockBuilder
                .beginControlFlow("?.let")
                .add(
                    "%T(it.%M())",
                    returnTypeInfo.withNullable(false).kotlinTypeName,
                    BindingsGenerator.REINTERPRET_FUNC,
                )
                .endControlFlow()
        } else {
            // some C functions that according to gir are not nullable, will be mapped by cinterop to return a
            // nullable type, so we use force !! here
            codeBlockBuilder
                .beginControlFlow("!!.let")
                .add(
                    "%T(it.%M())",
                    returnTypeInfo.withNullable(false).kotlinTypeName,
                    BindingsGenerator.REINTERPRET_FUNC,
                )
                .endControlFlow()
        }
    }

    fun buildInterfacePointer(
        isNullable: Boolean,
        codeBlockBuilder: CodeBlock.Builder,
        returnTypeInfo: TypeInfo.InterfacePointer,
    ) {
        if (isNullable) {
            codeBlockBuilder
                .beginControlFlow("?.let")
                .add(
                    "%T.wrap(it.%M())",
                    returnTypeInfo.withNullable(false).kotlinTypeName,
                    BindingsGenerator.REINTERPRET_FUNC,
                )
                .endControlFlow()
        } else {
            // some C functions that according to gir are not nullable, will be mapped by cinterop to return a
            // nullable type, so we use force !! here
            codeBlockBuilder
                .beginControlFlow("!!.let")
                .add(
                    "%T.wrap(it.%M())",
                    returnTypeInfo.withNullable(false).kotlinTypeName,
                    BindingsGenerator.REINTERPRET_FUNC,
                )
                .endControlFlow()
        }
    }

    fun buildGBoolean(codeBlockBuilder: CodeBlock.Builder) {
        codeBlockBuilder.add(".%M()", BindingsGenerator.AS_BOOLEAN_FUNC)
    }

    fun buildKString(isNullable: Boolean, codeBlockBuilder: CodeBlock.Builder) {
        // cinterop seems to map all string returning functions as nullable  so here we return a nullable string
        // if the gir says nullable or error() when we encounter an unexpected null when the gir says non-null
        if (isNullable) {
            codeBlockBuilder.add("?.%M()", BindingsGenerator.TO_KSTRING_FUNC)
        } else {
            codeBlockBuilder.add(
                "?.%M() ?: error(%S)",
                BindingsGenerator.TO_KSTRING_FUNC,
                "Expected not null string",
            )
        }
    }

    fun buildBitfield(
        codeBlockBuilder: CodeBlock.Builder,
        nullableString: String,
        returnTypeInfo: TypeInfo,
    ) {
        // use mask constructor for conversion
        codeBlockBuilder
            .add(nullableString)
            .beginControlFlow(".let")
            .add("%T(it)", returnTypeInfo.kotlinTypeName)
            .endControlFlow()
    }
}

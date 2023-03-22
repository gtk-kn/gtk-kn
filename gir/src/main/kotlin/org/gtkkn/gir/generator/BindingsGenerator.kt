package org.gtkkn.gir.generator

import com.squareup.kotlinpoet.ClassName
import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.FunSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.LambdaTypeName
import com.squareup.kotlinpoet.MemberName
import com.squareup.kotlinpoet.ParameterSpec
import com.squareup.kotlinpoet.ParameterizedTypeName.Companion.parameterizedBy
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeName
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.U_LONG
import org.gtkkn.gir.blueprints.BitfieldBlueprint
import org.gtkkn.gir.blueprints.ClassBlueprint
import org.gtkkn.gir.blueprints.ConstructorBlueprint
import org.gtkkn.gir.blueprints.EnumBlueprint
import org.gtkkn.gir.blueprints.ImplementsInterfaceBlueprint
import org.gtkkn.gir.blueprints.InterfaceBlueprint
import org.gtkkn.gir.blueprints.MethodBlueprint
import org.gtkkn.gir.blueprints.ParameterBlueprint
import org.gtkkn.gir.blueprints.RepositoryBlueprint
import org.gtkkn.gir.blueprints.SignalBlueprint
import org.gtkkn.gir.blueprints.SkippedObject
import org.gtkkn.gir.blueprints.TypeInfo
import org.gtkkn.gir.config.Config
import org.gtkkn.gir.log.logger
import org.gtkkn.gir.processor.NativeTypes
import java.io.File

class BindingsGenerator(
    private val config: Config,
    private val ktLintFormatter: KtLintFormatter
) {
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
                clazz.signals.map { buildStaticSignalCallback(it) },
            )
        }

        // write interfaces
        repository.interfaceBlueprints.forEach { iface ->
            writeType(
                iface.typeName,
                buildInterface(iface),
                repositorySrcDir(repository, outputDir),
                iface.signals.map { buildStaticSignalCallback(it) },
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
        additionalProperties: List<PropertySpec> = emptyList(),
    ) {
        logger.debug("Writing ${className.canonicalName}")

        FileSpec
            .builder(className.packageName, className.simpleName)
            .addFileComment("This is a generated file. Do not modify.")
            .addType(typeSpec)
            .apply { additionalProperties.forEach { addProperty(it) } }
            .build()
            .apply {
                if (config.skipFormat) {
                    writeTo(outputDirectory)
                } else {
                    val stringBuilder = StringBuilder()
                    writeTo(stringBuilder)

                    ktLintFormatter.formatAndWriteKotlinFile(
                        outputDirectory,
                        className.packageName,
                        className.simpleName,
                        stringBuilder.toString(),
                    )
                }
            }
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
            writer.println("strictEnums = \\")
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
            addKdoc(buildTypeKDoc(clazz.kdoc, clazz.skippedObjects))

            // modifiers
            if (!clazz.isFinal) {
                addModifiers(KModifier.OPEN)
            }

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

            // signal connect methods
            clazz.signals.forEach { signal ->
                addFunction(buildSignalConnectFunction(signal, "gPointer"))
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
    private fun buildClassConstructor(constructor: ConstructorBlueprint): FunSpec =
        FunSpec.constructorBuilder().apply {
            if (constructor.returnTypeInfo !is TypeInfo.ObjectPointer) {
                error("Invalid constructor return type")
            }

            addKdoc(buildMethodKDoc(constructor.kdoc, constructor.parameters, constructor.returnTypeKDoc))

            if (constructor.parameters.isEmpty()) {
                // no arg constructor
                callThisConstructor(CodeBlock.of("%M()!!.reinterpret()", constructor.nativeMemberName))
            } else {
                // constructor with arguments
                appendSignatureParameters(constructor.parameters)
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

                callThisConstructor(codeBlockBuilder.build())
            }
        }.build()

    /**
     * Build a constructor factory method based on a [ConstructorBlueprint].
     */
    private fun buildClassConstructorFactoryMethod(clazz: ClassBlueprint, constructor: ConstructorBlueprint): FunSpec =
        FunSpec.builder(constructor.kotlinName).apply {
            returns(clazz.typeName)

            if (constructor.returnTypeInfo !is TypeInfo.ObjectPointer) {
                error("Invalid constructor return type for ${constructor.nativeName}")
            }

            addKdoc(buildMethodKDoc(constructor.kdoc, constructor.parameters, constructor.returnTypeKDoc))

            if (constructor.parameters.isEmpty()) {
                // no-arg factory method
                addStatement("return %T(%M()!!.reinterpret())", clazz.typeName, constructor.nativeMemberName)
            } else {
                appendSignatureParameters(constructor.parameters)

                // open native function paren
                addCode("return %T(%M(", clazz.typeName, constructor.nativeMemberName)

                constructor.parameters.forEachIndexed { index, param ->
                    if (index > 0) {
                        addCode(", ")
                    }
                    addCode(buildParameterConversionBlock(param))
                }

                addCode(")!!.%M())", REINTERPRET_FUNC) // close native function paren
            }
        }.build()

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

    private fun buildTypeKDoc(kdoc: String?, skippedObjects: List<SkippedObject> = emptyList()): CodeBlock {
        val documentedSkippedObjects = skippedObjects.filter { it.documented }
        // nicely format skipped objects
        val longestObjectName = documentedSkippedObjects.maxOfOrNull { it.objectName.length } ?: 0
        val longestTypeName = documentedSkippedObjects.maxOfOrNull { it.objectType.length } ?: 0

        return CodeBlock.builder().apply {
            kdoc?.let { add("%L", it) }
            if (documentedSkippedObjects.isNotEmpty()) {
                if (kdoc != null) {
                    add("\n\n")
                }
                add("## Skipped during bindings generation\n\n")
            }
            for (skip in documentedSkippedObjects) {
                addStatement(skip.fullMessage(longestObjectName, longestTypeName))
            }
        }.build()
    }

    private fun buildMethodKDoc(
        kdoc: String?,
        parameters: List<ParameterBlueprint>,
        returnTypeKDoc: String?,
    ): CodeBlock = CodeBlock.builder().apply {
        kdoc?.let { add("%L", it) }
        if (parameters.isNotEmpty()) {
            add("\n")
            parameters.forEach { param ->
                add("\n@param %L %L", param.kotlinName, param.kdoc.orEmpty())
            }
        }
        returnTypeKDoc?.let { add("\n@return %L", it) }
    }.build()

    private fun buildInterface(iface: InterfaceBlueprint): TypeSpec {
        val ifaceBuilder = TypeSpec.interfaceBuilder(iface.typeName)
            .addProperty(buildInterfacePointerProperty(iface))

        // kdoc
        ifaceBuilder.addKdoc(buildTypeKDoc(iface.kdoc, iface.skippedObjects))

        // methods
        iface.methods.forEach { method ->
            ifaceBuilder.addFunction(buildMethod(method, iface.objectPointerName))
        }

        // signal connect methods
        iface.signals.forEach { signal ->
            ifaceBuilder.addFunction(buildSignalConnectFunction(signal, iface.objectPointerName))
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
                    .addKdoc(buildTypeKDoc(member.kdoc))
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
            .addKdoc(buildTypeKDoc(bitfield.kdoc))
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
            .addKdoc(buildTypeKDoc(enum.kdoc))
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
                    .addKdoc(buildTypeKDoc(member.kdoc))
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

    private fun buildMethod(method: MethodBlueprint, instancePointer: String?): FunSpec =
        FunSpec.builder(method.kotlinName).apply {
            addKdoc(buildMethodKDoc(method.kdoc, method.parameterBlueprints, method.returnTypeKDoc))
            val returnTypeName = method.returnTypeInfo.kotlinTypeName

            returns(returnTypeName)

            if (method.isOverride) {
                addModifiers(KModifier.OVERRIDE)
            }

            if (method.isOpen) {
                addModifiers(KModifier.OPEN)
            }

            appendSignatureParameters(method.parameterBlueprints)

            var needsComma = false
            addCode("return %M(", method.nativeMemberName) // open native function paren
            if (instancePointer != null) {
                // adding reinterpret() here because sometimes the instancePointer has a different type
                addCode("%N.%M()", instancePointer, REINTERPRET_FUNC)
                needsComma = true
            }

            method.parameterBlueprints.forEach { param ->
                if (needsComma) {
                    addCode(", ")
                }

                addCode(buildParameterConversionBlock(param))
            }

            addCode(")") // close native function paren

            // return value conversion
            addCode(buildReturnValueConversionBlock(method.returnTypeInfo))
        }.build()

    private fun buildSignalConnectFunction(signal: SignalBlueprint, objectPointerName: String): FunSpec {
        val connectFlagsTypeName = ClassName("bindings.gobject", "ConnectFlags")
        val connectFlagsDefaultMemberName = MemberName("bindings.gobject.ConnectFlags.Companion", "DEFAULT")
        val funSpec = FunSpec.builder(signal.kotlinConnectName).apply {
            // connect flags
            addParameter(
                ParameterSpec.builder("connectFlags", connectFlagsTypeName)
                    .defaultValue("%M", connectFlagsDefaultMemberName)
                    .build(),
            )
            // trailing lambda for handler
            addParameter(
                "handler",
                signal.handlerLambdaTypeName,
            )
            returns(U_LONG)

            // add implementation
            addCode("return %M(", G_SIGNAL_CONNECT_DATA)
            addCode("%N.%M()", objectPointerName, REINTERPRET_FUNC)
            addCode(", %S", signal.signalName)
            addCode(", %NFunc.%M()", signal.kotlinConnectName, REINTERPRET_FUNC)
            addCode(", %T.create(handler).asCPointer()", STABLEREF)
            addCode(", %M", STATIC_STABLEREF_DESTROY)
            addCode(", connectFlags.mask")

            addCode(")")
        }

        // callback type
        return funSpec.build()
    }

    /**
     * Build the private property that holds the static C callback functions that we use for implementing
     * the connect<signal-name>() methods.
     */
    private fun buildStaticSignalCallback(signal: SignalBlueprint): PropertySpec {
        val staticCallbackVal = PropertySpec.builder(
            "${signal.kotlinConnectName}Func",
            nativeCallbackCFunctionTypeName(
                signal.returnTypeInfo.nativeTypeName,
                signal.parameters.map { param ->
                    ParameterSpec.builder("", param.typeInfo.nativeTypeName).build()
                },
            ),
            KModifier.PRIVATE,
        ).initializer(buildStaticSignalCallbackImplementation(signal))
        return staticCallbackVal.build()
    }

    /**
     * Build the [staticCFunction] implementation for signal connect handlers.
     */
    private fun buildStaticSignalCallbackImplementation(signal: SignalBlueprint) = CodeBlock.builder().apply {
        beginControlFlow("%M", STATIC_C_FUNC)

        // lambda signature
        addStatement("_: %T", NativeTypes.KP_OPAQUE_POINTER)
        signal.parameters.forEach { param ->
            // cinterop maps methods return values with pointer types as nullable
            // so we do the same thing here for the staticCFunction pointer arguments
            // we have to check for gir-based nullability first because otherwise we get double `??`
            val forceNullable = if (!param.typeInfo.kotlinTypeName.isNullable && param.typeInfo.isCinteropNullable) {
                "?"
            } else {
                ""
            }
            addStatement(", %N: %T$forceNullable", param.kotlinName, param.typeInfo.nativeTypeName)
        }
        addStatement(", data: %T ->", NativeTypes.KP_OPAQUE_POINTER)

        // implementation
        add(
            "data.%M<%T>().get().invoke(",
            AS_STABLE_REF_FUNC,
            signal.handlerLambdaTypeName,
        ) // open invoke
        signal.parameters.forEachIndexed { index, param ->
            if (index > 0) {
                add(", ")
            }
            add("%N", param.kotlinName)
            add(buildReturnValueConversionBlock(param.typeInfo))
        }
        add(")") // close invoke

        // convert the return type and return from the lambda
        add(buildKotlinToNativeTypeConversionBlock(signal.returnTypeInfo))

        endControlFlow()
        add(".%M()", REINTERPRET_FUNC)
    }.build()

    companion object {
        // gtk-kn common function members
        internal val AS_BOOLEAN_FUNC = MemberName("org.gtkkn.common", "asBoolean")
        internal val AS_GBOOLEAN_FUNC = MemberName("org.gtkkn.common", "asGBoolean")
        internal val STATIC_STABLEREF_DESTROY = MemberName("org.gtkkn.common", "staticStableRefDestroy")

        // cinterop helper function members
        internal val REINTERPRET_FUNC = MemberName("kotlinx.cinterop", "reinterpret")
        internal val TO_KSTRING_FUNC = MemberName("kotlinx.cinterop", "toKString")
        internal val STATIC_C_FUNC = MemberName("kotlinx.cinterop", "staticCFunction")
        internal val AS_STABLE_REF_FUNC = MemberName("kotlinx.cinterop", "asStableRef")
        internal val STABLEREF = ClassName("kotlinx.cinterop", "StableRef")

        // gobject members
        internal val G_SIGNAL_CONNECT_DATA = MemberName("native.gobject", "g_signal_connect_data")
    }
}

/**
 * Build a signature for the staticCFunction implementation for connect signal callbacks.
 *
 * This the equivalent of a native.gobject.GCallback typealias, that should point
 *      to a CPointer<CFunction<(T) -> R>> where T = arguments and R = result
 */
private fun nativeCallbackCFunctionTypeName(
    resultTypeName: TypeName,
    parameters: List<ParameterSpec> = emptyList()
) =
    NativeTypes.KP_CPOINTER.parameterizedBy(
        NativeTypes.KP_CFUNCTION.parameterizedBy(
            LambdaTypeName.get(
                returnType = resultTypeName,
                parameters = parameters,
            ),
        ),
    )

fun FunSpec.Builder.appendSignatureParameters(parameters: List<ParameterBlueprint>) {
    // add arguments to signature
    parameters.forEach { param ->
        val kotlinParamType = param.typeInfo.kotlinTypeName
        addParameter(param.kotlinName, kotlinParamType)
    }
}

fun buildReturnValueConversionBlock(returnTypeInfo: TypeInfo): CodeBlock {
    val codeBlockBuilder = CodeBlock.builder()
    val isNullable = returnTypeInfo.kotlinTypeName.isNullable
    val safeCall = if (isNullable) "?" else ""

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
        is TypeInfo.Bitfield -> ReturnValueConversions.buildBitfield(codeBlockBuilder, safeCall, returnTypeInfo)
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
fun buildParameterConversionBlock(param: ParameterBlueprint): CodeBlock {
    val codeBlockBuilder = CodeBlock.builder()
    val isParamNullable = param.typeInfo.kotlinTypeName.isNullable
    val safeCall = if (isParamNullable) "?" else ""

    when (param.typeInfo) {
        is TypeInfo.Enumeration -> codeBlockBuilder.add("%N$safeCall.nativeValue", param.kotlinName)
        is TypeInfo.ObjectPointer -> {
            codeBlockBuilder.add(
                "%N$safeCall.%N$safeCall.%M()",
                param.kotlinName,
                param.typeInfo.objectPointerName,
                BindingsGenerator.REINTERPRET_FUNC,
            )
        }

        is TypeInfo.InterfacePointer -> {
            codeBlockBuilder.add(
                "%N$safeCall.%N$safeCall.%M()",
                param.kotlinName,
                param.typeInfo.objectPointerName,
                BindingsGenerator.REINTERPRET_FUNC,
            )
        }

        is TypeInfo.Primitive -> codeBlockBuilder.add("%N", param.kotlinName)
        is TypeInfo.GBoolean -> codeBlockBuilder.add(
            "%N$safeCall.%M()",
            param.kotlinName,
            BindingsGenerator.AS_GBOOLEAN_FUNC,
        )

        is TypeInfo.KString -> codeBlockBuilder.add("%N", param.kotlinName)
        is TypeInfo.Bitfield -> {
            codeBlockBuilder.add("%N$safeCall.mask", param.kotlinName)
        }
    }
    return codeBlockBuilder.build()
}

/**
 * Build a [CodeBlock] that converts a Kotlin value into its native counterpart.
 *
 * The resulting codeblock should be placed right after the value to be converted.
 *
 * Nullability is handled.
 */
fun buildKotlinToNativeTypeConversionBlock(typeInfo: TypeInfo): CodeBlock {
    val codeBlockBuilder = CodeBlock.builder()
    val isParamNullable = typeInfo.kotlinTypeName.isNullable
    val safeCall = if (isParamNullable) "?" else ""

    when (typeInfo) {
        is TypeInfo.Primitive -> Unit
        is TypeInfo.KString -> Unit
        is TypeInfo.Enumeration -> codeBlockBuilder.add("$safeCall.nativeValue")
        is TypeInfo.ObjectPointer -> {
            codeBlockBuilder.add(
                "$safeCall.%N",
                typeInfo.objectPointerName,
            )
        }

        is TypeInfo.InterfacePointer -> {
            codeBlockBuilder.add(
                "$safeCall.%N$safeCall.%M()",
                typeInfo.objectPointerName,
                BindingsGenerator.REINTERPRET_FUNC,
            )
        }

        is TypeInfo.GBoolean -> codeBlockBuilder.add(
            "$safeCall.%M()",
            BindingsGenerator.AS_GBOOLEAN_FUNC,
        )

        is TypeInfo.Bitfield -> {
            codeBlockBuilder.add("$safeCall.mask")
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
            .beginControlFlow(".run")
            .add("%T.fromNativeValue(this)", returnTypeInfo.kotlinTypeName)
            .endControlFlow()
    }

    fun buildObjectPointer(
        returnTypeInfo: TypeInfo.ObjectPointer,
        codeBlockBuilder: CodeBlock.Builder,
    ) {
        if (returnTypeInfo.kotlinTypeName.isNullable) {
            codeBlockBuilder
                .beginControlFlow("?.run")
                .add(
                    "%T(%M())",
                    returnTypeInfo.withNullable(false).kotlinTypeName,
                    BindingsGenerator.REINTERPRET_FUNC,
                )
                .endControlFlow()
        } else {
            // some C functions that according to gir are not nullable, will be mapped by cinterop to return a
            // nullable type, so we use force !! here
            codeBlockBuilder
                .beginControlFlow("!!.run")
                .add(
                    "%T(%M())",
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
                .beginControlFlow("?.run")
                .add(
                    "%T.wrap(%M())",
                    returnTypeInfo.withNullable(false).kotlinTypeName,
                    BindingsGenerator.REINTERPRET_FUNC,
                )
                .endControlFlow()
        } else {
            // some C functions that according to gir are not nullable, will be mapped by cinterop to return a
            // nullable type, so we use force !! here
            codeBlockBuilder
                .beginControlFlow("!!.run")
                .add(
                    "%T.wrap(%M())",
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
            .beginControlFlow(".run")
            .add("%T(this)", returnTypeInfo.kotlinTypeName)
            .endControlFlow()
    }
}

package org.gtkkn.gir.blueprints

import org.gtkkn.gir.log.logger

fun RepositoryBlueprint.prettyPrint() {
    logger.debug("Repository: \n\tname: $name\n\tclasses:")
    classBlueprints.forEach { it.prettyPrint("\t") }
    logger.debug("\tskipped objects:")
    val typeLength = skippedObjects.maxOfOrNull { it.objectType.length } ?: 0
    val nameLength = skippedObjects.maxOfOrNull { it.objectName.length } ?: 0
    skippedObjects.forEach { logger.debug(it.fullMessage(nameLength, typeLength)) }
}

fun ClassBlueprint.prettyPrint(prefix: String = "\t") {
    logger.debug("${prefix}class:")
    logger.debug("${prefix}\ttypeName: $typeName")
    logger.debug("${prefix}\tkotlinName: $kotlinName")
    logger.debug("${prefix}\tnativeName: $nativeName")
    logger.debug("${prefix}\tparent: $parentTypeName")
    logger.debug("${prefix}\timplements:")
    implementsInterfaces.forEach { logger.debug("$prefix\t\t$it") }
    logger.debug("${prefix}\tmethods:")
    methods.forEach { it.prettyPrint("$prefix\t\t") }
    val typeLength = skippedObjects.maxOfOrNull { it.objectType.length } ?: 0
    val nameLength = skippedObjects.maxOfOrNull { it.objectName.length } ?: 0
    skippedObjects.forEach { logger.debug("${prefix}\t${it.fullMessage(nameLength, typeLength)}") }
}

fun MethodBlueprint.prettyPrint(prefix: String = "\t\t") {
    logger.debug("${prefix}method:")
    logger.debug("${prefix}\tkotlinName: $kotlinName")
    logger.debug("${prefix}\tnativeName: $nativeName")
    logger.debug("${prefix}\treturns: $returnTypeInfo")
    logger.debug("${prefix}\tparameters:")
    parameterBlueprints.forEach { param ->
        logger.debug(
            "${prefix}\t\t${param.nativeName}: ${param.typeInfo} -> ${param.kotlinName}: ${param.typeInfo}",
        )
    }
}

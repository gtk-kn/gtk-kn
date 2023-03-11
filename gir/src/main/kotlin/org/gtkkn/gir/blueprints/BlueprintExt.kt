package org.gtkkn.gir.blueprints

fun RepositoryBlueprint.prettyPrint() {
    println("Repository: ")
    println("\tname: $name")
    println("\tclasses:")
    classBlueprints.forEach { it.prettyPrint("\t") }
}

fun ClassBlueprint.prettyPrint(prefix: String = "\t") {
    println("${prefix}class:")
    println("${prefix}\ttypeName: $typeName")
    println("${prefix}\tkotlinName: $kotlinName")
    println("${prefix}\tnativeName: $nativeName")
    println("${prefix}\tmethods:")
    methods.forEach { it.prettyPrint("$prefix\t\t") }
}

fun MethodBlueprint.prettyPrint(prefix: String = "\t\t") {
    println("${prefix}method:")
    println("${prefix}\tkotlinName: $kotlinName")
    println("${prefix}\tnativeName: $nativeName")
}

package org.gtkkn.gir.model

data class GirNamespace(
    val name: String,
    val version: String,
    val cIdentifierPrefixes: String?,
    val cSymbolPrefixes: String?,
    val cPrefix: String?,
    val sharedLibrary: String?,
    val aliases: List<GirAlias>,
    val interfaces: List<GirInterface>,
    val classes: List<GirClass>,
    val unions: List<GirUnion>,
    val records: List<GirRecord>,
    val functions: List<GirFunction>,
    val callbacks: List<GirCallback>,
    val constants: List<GirConstant>,
    val enums: List<GirEnum>,
    val bitfields: List<GirBitField>,
    val boxes: List<GirBoxed>,
)

plugins {
    kotlin("multiplatform")
    id("config-conventions")
    id("org.jetbrains.dokka")
}

val libraryGroup: String by extra
group = libraryGroup

kotlin.explicitApi()

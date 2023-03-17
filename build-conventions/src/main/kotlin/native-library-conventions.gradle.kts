plugins {
    kotlin("multiplatform")
    id("config-conventions")
}

val libraryGroup: String by extra
group = libraryGroup

kotlin.explicitApi()

plugins {
    id("native-library-conventions")
    id("publishing-conventions")
}

tasks.register("cleanBindings") {
    group = BasePlugin.BUILD_GROUP
    doLast {
        delete("${projectDir}/src/nativeMain/kotlin/org/gtkkn/bindings")
    }
}

plugins {
    id("native-library-convention")
    id("publishing-conventions")
}

tasks.register("cleanBindings") {
    group = BasePlugin.BUILD_GROUP
    doLast {
        delete("${projectDir}/src/nativeMain/kotlin/bindings")
    }
}

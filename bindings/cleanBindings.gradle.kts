// Find a way to do this with build-conventions
tasks.register("cleanBindings") {
    group = BasePlugin.BUILD_GROUP
    doLast {
        delete("${projectDir}/src/nativeMain/kotlin/bindings")
    }
}

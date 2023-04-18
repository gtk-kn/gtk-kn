package ext

import org.gradle.api.Project
import org.gradle.api.plugins.ExtensionAware
import org.gradle.api.provider.Property
import org.gradle.kotlin.dsl.getByType

interface ConfigExt : ExtensionAware {
    val version: Property<String>
    val versionBindings: Property<String>
    val versionBindingsCore: Property<String>
    val versionBindingsGtk4: Property<String>
}

internal val Project.config: ConfigExt get() = extensions.getByType()

package ext

import org.gradle.api.plugins.ExtensionAware
import org.gradle.api.provider.Property
import org.gradle.kotlin.dsl.getByType

interface PublishConfigExt : ExtensionAware {
    val ossrhUsername: Property<String>
    val ossrhPassword: Property<String>
    val signingKeyId: Property<String>
    val signingPassword: Property<String>
    val signingSecretKeyRingFile: Property<String>
}

internal val ConfigExt.publish: PublishConfigExt get() = extensions.getByType()

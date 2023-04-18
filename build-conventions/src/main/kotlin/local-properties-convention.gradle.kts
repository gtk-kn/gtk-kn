import org.gradle.kotlin.dsl.extra
import java.util.*

project.rootProject.file("local.properties")
    .takeIf { it.exists() }
    ?.reader()
    ?.use { reader -> Properties().apply { load(reader) } }
    ?.forEach { k, v ->
        extra["$k"] = v
    }

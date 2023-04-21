package org.gtkkn.gradle.plugin.task

import org.gradle.api.Project
import org.gradle.kotlin.dsl.*
import org.gtkkn.gradle.plugin.GtkPlugin

internal fun Project.gtkDoctorTask() = rootProject.tasks.register("gtkDoctor") {
    group = GtkTask.GROUP
    description = "Checks native GTK tooling on the host"
//    checkTooling("glib-compile-schemas", false)
//    checkTooling("glib-compile-resources", false)
}

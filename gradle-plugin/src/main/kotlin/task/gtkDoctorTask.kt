package org.gtkkn.gradle.plugin.task

import org.gradle.api.Project
import org.gtkkn.gradle.plugin.GtkPlugin

internal fun Project.gtkDoctorTask() = tasks.register("gtkDoctor") {
    group = GtkPlugin.TASK_GROUP
    description = "Checks native GTK tooling on the host"
    checkTooling("glib-compile-schemas", false)
    checkTooling("glib-compile-resources", false)
}

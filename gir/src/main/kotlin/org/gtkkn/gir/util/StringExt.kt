package org.gtkkn.gir.util

import java.util.Locale

fun String.snakeToCamelCase(): String {
    val words = this.split("_").mapIndexed { index, str ->
        if (index > 0) {
            str.replaceFirstChar { char ->
                if (char.isLowerCase()) {
                    char.titlecase(Locale.getDefault())
                } else {
                    char.toString()
                }
            }
        } else {
            str
        }
    }
    return words.joinToString("")
}

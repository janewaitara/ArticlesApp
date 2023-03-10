// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "7.4.1" apply false
    id("com.android.library") version "7.4.1" apply false
    id("org.jetbrains.kotlin.android") version "1.7.0" apply false
    id("org.jlleitschuh.gradle.ktlint") version "10.2.1"
}
allprojects {

    apply(plugin = "org.jlleitschuh.gradle.ktlint")
    ktlint {
        android.set(false)
        verbose.set(false)
        filter {
            exclude { element -> element.file.path.contains("generated/") }
        }
        disabledRules.set(setOf("no-wildcard-imports"))
    }
}

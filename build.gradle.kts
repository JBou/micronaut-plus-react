plugins {
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
}

/*buildscript {
    configurations.all {
        resolutionStrategy.force("org.apache.commons:commons-compress:1.26.2")
    }
}*/

group = "no.javatec"

buildscript {
    dependencies {
        classpath(libs.kotlin.gradle.plugin)
        classpath(libs.agp)
    }
    repositories {
        mavenCentral()
        google()
    }
}
group = "no.javatec"

subprojects {
    repositories { mavenCentral() }
}
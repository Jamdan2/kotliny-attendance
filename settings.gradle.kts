rootProject.name = "kotliny-attendance"
include("web")
include("common")

pluginManagement {
    repositories {
        mavenCentral()

        // Remove when kotlin 1.4 is stable
        maven("https://dl.bintray.com/kotlin/kotlin-eap/")
    }
}

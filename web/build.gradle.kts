import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackConfig.DevServer

plugins {
    kotlin("js") version "1.4-M1"
}

repositories {
    mavenCentral()

    // Remove when kotlin 1.4 is stable
    maven("https://dl.bintray.com/kotlin/kotlin-eap/")
}

dependencies {
    implementation(kotlin("stdlib-js"))
}

kotlin.target{
    produceExecutable()
    useCommonJs()
    browser {
        runTask {
            devServer = DevServer(
                    inline = true,
                    lazy = false,
                    noInfo = true,
                    open = true,
                    overlay = false,
                    port = 3333,
                    proxy = null,
                    contentBase = listOf("$projectDir/src/main/resources")
            )
        }
    }
}

import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackConfig.DevServer

plugins {
    kotlin("js")
}

dependencies {
    implementation(kotlin("stdlib-js"))
    compile(project(":common"))
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

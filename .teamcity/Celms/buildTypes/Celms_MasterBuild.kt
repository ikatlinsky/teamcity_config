package Celms.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.GradleBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.GradleBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.gradle
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object Celms_MasterBuild : BuildType({
    uuid = "869c451c-b51d-49bc-aca2-8d9e978f94af"
    extId = "Celms_MasterBuild"
    name = "Develop"

    vcs {
        root(Celms.vcsRoots.develop_celms_vcs)

    }

    steps {
        gradle {
            tasks = "clean build -x test"
            useGradleWrapper = true
        }
    }

    triggers {
        vcs {
        }
    }
})

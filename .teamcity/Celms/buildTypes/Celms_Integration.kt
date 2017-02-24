package Celms.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.GradleBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.GradleBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.gradle
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object Celms_Integration : BuildType({
    uuid = "46d24537-0215-4e72-84f8-cdb0dee3db19"
    extId = "Celms_Integration"
    name = "Integration"

    vcs {
        root(Celms.vcsRoots.Celms_CelmsGithub21)

    }

    steps {
        gradle {
            tasks = "clean build"
            useGradleWrapper = true
            gradleWrapperPath = ""
        }
    }

    triggers {
        vcs {
        }
    }
})

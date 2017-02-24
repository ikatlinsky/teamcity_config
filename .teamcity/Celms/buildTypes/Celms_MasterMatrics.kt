package Celms.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.GradleBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.GradleBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.gradle
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object Celms_MasterMatrics : BuildType({
    uuid = "ec48f6a5-0299-469d-a6ac-041907db9f23"
    extId = "Celms_MasterMatrics"
    name = "Metrics"

    vcs {
        root(Celms.vcsRoots.Celms_CelmsGithub1)

    }

    steps {
        gradle {
            name = "Sonar"
            tasks = "sonarqube"
            useGradleWrapper = true
        }
    }

    triggers {
        vcs {
        }
    }
})

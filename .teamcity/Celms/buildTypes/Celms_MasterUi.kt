package Celms.buildTypes

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.BuildStep
import jetbrains.buildServer.configs.kotlin.v10.BuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.ScriptBuildStep.*
import jetbrains.buildServer.configs.kotlin.v10.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger
import jetbrains.buildServer.configs.kotlin.v10.triggers.VcsTrigger.*
import jetbrains.buildServer.configs.kotlin.v10.triggers.vcs

object Celms_MasterUi : BuildType({
    uuid = "2e3acc00-1663-4311-8c7e-08312ae2453b"
    extId = "Celms_MasterUi"
    name = "Develop UI"

    vcs {
        root(Celms.vcsRoots.develop_ui_celms_vcs)

    }

    steps {
        step {
            name = "install deps"
            type = "jonnyzzz.npm"
            param("npm_commands", "install")
            param("npm_toolPath", "/root/.nvm/versions/node/v7.4.0/bin/npm")
            param("teamcity.build.workingDir", "ce-lms-ui")
        }
        script {
            name = "check linting"
            workingDir = "ce-lms-ui"
            scriptContent = "npm run lint"
        }
    }

    triggers {
        vcs {
        }
    }
})

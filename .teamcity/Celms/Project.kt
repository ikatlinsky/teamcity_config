package Celms

import Celms.buildTypes.*
import Celms.vcsRoots.*
import Celms.vcsRoots.Celms_TeamcityJavaTemplates
import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.Project
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.VersionedSettings.*
import jetbrains.buildServer.configs.kotlin.v10.projectFeatures.versionedSettings

object Project : Project({
    uuid = "aa74f9e7-fa61-4b25-a50d-f58c345da4da"
    extId = "Celms"
    parentId = "_Root"
    name = "CELMS"

    vcsRoot(develop_celms_vcs)
    vcsRoot(Celms_TeamcityJavaTemplates)
    vcsRoot(develop_ui_celms_vcs)
    vcsRoot(Celms_CelmsGithub1)
    vcsRoot(Celms_CelmsGithub21)

    buildType(Celms_MasterBuild)
    buildType(Celms_Integration)
    buildType(Celms_MasterUi)
    buildType(Celms_MasterMatrics)

    features {
        versionedSettings {
            id = "PROJECT_EXT_2"
            mode = VersionedSettings.Mode.ENABLED
            buildSettingsMode = VersionedSettings.BuildSettingsMode.USE_CURRENT_SETTINGS
            rootExtId = Celms_TeamcityJavaTemplates.extId
            showChanges = false
            settingsFormat = VersionedSettings.Format.KOTLIN
        }
    }
})

package Celms.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object Celms_TeamcityJavaTemplates : GitVcsRoot({
    uuid = "c8b37caf-f30e-4e57-b3be-432eaa1a75b2"
    extId = "Celms_TeamcityJavaTemplates"
    name = "teamcity_java_templates"
    url = "https://github.com/ikatlinsky/teamcity_config.git"
    authMethod = password {
        userName = "ilya.katlinsky@gmail.com"
        password = "zxxde3daa9606238cafe7131133a8eb1692"
    }
})

package Celms.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object Celms_CelmsGithub21 : GitVcsRoot({
    uuid = "cd306e3e-7256-4c7b-9b53-57058a555faf"
    extId = "Celms_CelmsGithub21"
    name = "integration_celms_vcs"
    url = "git@github.com:CELMS/CELMS.git"
    authMethod = uploadedKey {
        uploadedKey = "ppk"
    }
    param("secure:passphrase", "zxx75e635d5911fb73f")
})

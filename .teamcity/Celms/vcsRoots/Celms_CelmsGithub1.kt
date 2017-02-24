package Celms.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object Celms_CelmsGithub1 : GitVcsRoot({
    uuid = "a5fbeb18-201d-4850-810c-0f81df36e32d"
    extId = "Celms_CelmsGithub1"
    name = "metrics_celms_vcs"
    url = "git@github.com:CELMS/CELMS.git"
    authMethod = uploadedKey {
        uploadedKey = "ppk"
    }
    param("secure:passphrase", "zxx75e635d5911fb73f")
})

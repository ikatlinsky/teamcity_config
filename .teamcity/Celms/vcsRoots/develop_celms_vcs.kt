package Celms.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object develop_celms_vcs : GitVcsRoot({
    uuid = "b5dc8380-9ac9-4b8e-ae8b-327e0597efcb"
    extId = "develop_celms_vcs"
    name = "develop_celms_vcs"
    url = "git@github.com:CELMS/CELMS.git"
    branchSpec = "+:refs/heads/*"
    authMethod = uploadedKey {
        uploadedKey = "ppk"
    }
    param("secure:passphrase", "zxx75e635d5911fb73f")
})

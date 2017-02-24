package Celms.vcsRoots

import jetbrains.buildServer.configs.kotlin.v10.*
import jetbrains.buildServer.configs.kotlin.v10.vcs.GitVcsRoot

object develop_ui_celms_vcs : GitVcsRoot({
    uuid = "1b76d49b-6916-409e-a56e-67d9f2353cfa"
    extId = "develop_ui_celms_vcs"
    name = "develop_ui_celms_vcs"
    url = "git@github.com:CELMS/CELMS.git"
    branchSpec = "+:refs/heads/*"
    authMethod = uploadedKey {
        uploadedKey = "ppk"
    }
    param("secure:passphrase", "zxx75e635d5911fb73f")
})

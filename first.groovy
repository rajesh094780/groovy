def test1(){
    def targetBranch = (params.upstreamBranch ?: env.BRANCH_NAME).toLowerCase()
    def clusterMeta = [:]
    println "On branch $env.BRANCH_NAME ; targetBranch is |$targetBranch|"
    switch (targetBranch) {
        case ~/master/:
            println targetBranch
            break
    }
    
}

return this


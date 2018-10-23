def test1(){
    def targetBranch = (params.upstreamBranch ?: env.BRANCH_NAME).toLowerCase()
    def clusterMeta = [:]

    println "On branch $env.BRANCH_NAME ; targetBranch is |$targetBranch|"
    
}

return this


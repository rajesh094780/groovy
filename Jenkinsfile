def modules = [:]
pipeline {
    agent any
    stages {
        stage('test') {
            steps {
                script{
                    modules.first = load "first.groovy"                    
                    modules.second.init(modules.first)
                    modules.first.test1()
                    modules.second.test2()
                }
            }
        }
    }
}

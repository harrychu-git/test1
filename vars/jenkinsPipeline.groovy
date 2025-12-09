def call() {
    pipeline {

        agent {
            label 'built-in'
        }
        stages {
            stage('Test1') {
                steps {
                    sh("sleep 5")
                }
            }
        }
        post {
            success {
                cleanWs()
            }
        }
    }
}



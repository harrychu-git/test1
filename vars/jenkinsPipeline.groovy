def call() {
    pipeline {

        agent {
            label 'main'
        }
        stages {
            stage('Test1') {
                steps {
                    sh("sleep 300")
                }
            }
        }
    }
}



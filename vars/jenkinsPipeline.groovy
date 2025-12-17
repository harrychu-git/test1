def call() {
    pipeline {

        agent {
            label 'testNode'
        }
        stages {
            stage('Test1') {
                steps {
                    sh("sleep 5")
                }
            }
        }
    }
}



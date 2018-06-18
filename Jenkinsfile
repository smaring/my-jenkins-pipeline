pipeline {
    agent none
    stages {
        stage('Builds') {
            parallel {
                stage('Build 1') {
                    echo "build 1"
                }
                stage('Build 2') {
                    echo "build 2"
                }
            }
        }
    }
}
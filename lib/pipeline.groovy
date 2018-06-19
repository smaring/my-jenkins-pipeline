
def call(int buildNumber) {
  pipeline {
    agent none
    stages {
        stage('Builds') {
            parallel {
                stage('Build 1') {
                  steps {
                      echo "build 1"
                  }
                }
                stage('Build 2') {
                  steps {
                      echo "build 2"
                  }
                }
            }
        }
    }
  }
}

@Library('my-shared-library') _  

pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo "Building the application..."
            }
        }
    }

    post {
        success {
            notify("SUCCESS")
        }
        failure {
            notify("FAILED")
        }
    }
}

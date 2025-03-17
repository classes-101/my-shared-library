@Library('my-shared-library') _  // Import the shared library

pipeline {
    agent any

    stages {
        stage('Call Shared Function') {
            steps {
                myFunction('Jenkins User')  // Using the shared function
            }
        }
    }
}

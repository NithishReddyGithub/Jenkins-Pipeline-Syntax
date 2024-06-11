pipeline {
    agent any // Defines where the pipeline will run
    options {
        // Pipeline-level options such as timeouts, retry, etc.
    }
    environment {
        // Environment variables to be set for the pipeline
    }
    stages {
        stage('Build') {
            steps {
                // Steps for building the application
            }
        }
        stage('Test') {
            steps {
                // Steps for testing the application
            }
        }
        stage('Deploy') {
            steps {
                // Steps for deploying the application
            }
        }
    }
    post {
        // Post-build actions such as notifications, cleanup, etc.
    }
}

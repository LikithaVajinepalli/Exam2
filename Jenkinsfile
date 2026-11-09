pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out source from GitHub'
                checkout scm
            }
        }
        stage('Compile') {
            steps {
                echo 'Compiling both Java files'
                bat 'javac -d out Factorial.java TestFactorial.java'
            }
        }
        stage('Test') {
            steps {
                echo 'Running TestFactorial'
                bat 'java -cp out TestFactorial'
            }
        }
        stage('Run') {
            steps {
                echo 'Running the application'
                bat 'java -cp out Factorial'
            }
        }
        stage('Artifact') {
            steps {
                echo 'Packaging the application into a jar'
                bat 'jar cfm factorial.jar manifest.txt -C out Factorial.class'
                archiveArtifacts artifacts: 'factorial.jar', fingerprint: true
            }
        }
    }

    post {
        success { 
            echo 'Build succeeded' 
        }
        failure { 
            echo 'Build failed' 
        }
    }
}

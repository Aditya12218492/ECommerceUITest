pipeline {
    agent any

    tools {
        maven 'Maven 3.8.5'   // Jenkins me configured hona chahiye
        jdk 'Java 17'         // Jenkins me configured hona chahiye
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/Aditya12218492/ECommerceUITest.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Report') {
            steps {
                publishHTML([ 
                    reportDir: 'target/surefire-reports', 
                    reportFiles: 'index.html', 
                    reportName: 'Test Report' 
                ])
            }
        }
    }
}

pipeline {
    agent any

    tools {
        maven 'Maven 3.8.1'
        jdk 'jdk11'
    }

    environment {
        SONAR_TOKEN = credentials('SONAR_TOKEN') // reemplaza con el ID real
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/jeraldine1102/libreria-nacional-automation.git'
            }
        }

        stage('Run Tests') {
            steps {
                sh 'mvn clean test'
            }
        }

        stage('Sonar Analysis') {
            steps {
withSonarQubeEnv('SonarQube') {
    sh "mvn sonar:sonar -Dsonar.login=$SONAR_TOKEN"
                }
            }
        }

        stage('Quality Gate') {
            steps {
                timeout(time: 1, unit: 'MINUTES') {
                    waitForQualityGate abortPipeline: true
                }
            }
        }
    }

post {
    always {
        node {
            junit '**/target/surefire-reports/*.xml'
        }
    }
}

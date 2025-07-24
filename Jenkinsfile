pipeline {
    agent any

    tools {
        jdk 'jdk17'               // Vérifie que ce nom correspond aussi au JDK configuré dans Jenkins
        maven 'Maven-3.9.6'       // Attention au tiret, nom exact dans Global Tool Configuration
    }

    environment {
        GITHUB_TOKEN = credentials('pipeline')  // Ton token GitHub stocké sous l’ID "pipeline"
    }

    stages {
        stage('Premier Stage') {
            steps {
                echo 'Un premier Bonjour !'
                sh 'java -version'
                sh 'mvn -version'
                sh '''
                echo "Test API GitHub avec token"
                curl -H "Authorization: token $GITHUB_TOKEN" https://api.github.com/user
                '''
            }
        }

        stage('Deuxième Stage') {
            steps {
                echo 'Un deuxième Bonjour !'
                echo 'Au revoir!'
            }
        }
    }
}

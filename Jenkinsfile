pipeline {
    agent any

    tools {
        jdk 'jdk17'               // Nom exact du JDK
        maven 'Maven-3.9.6'       // Nom exact du Maven (attention tiret)
    }

    environment {
        GITHUB_TOKEN = credentials('pipeline')
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

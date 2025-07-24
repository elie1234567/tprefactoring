pipeline {
    agent any

    tools {
        jdk 'jdk17'             // 🔁 Remplacer par le nom exact de ton JDK dans Jenkins
        maven 'Maven-3.9.6'     // 🔁 Remplacer par le nom exact de ton Maven
    }

    stages {
        stage('Premier Stage') {
            steps {
                echo 'Un premier Bonjour !'
                bat 'java -version'  // ✅ ou 'sh' si agent Linux
                bat 'mvn -version'
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

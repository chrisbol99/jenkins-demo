pipeline {
    agent {
        label 'windows'
    }
    stages {
        stage('Build') {
            steps {
                bat 'ant compile'
            }
        }
        stage('Test') {
            steps {
                bat 'ant test'
            }
        }
        stage('Deploy') {
            when { tag "MHA-2018-Red-Team-release-*" }
            steps {
                echo 'Deploying because this commit is tagged...'
                bat 'ant deploy'
            }
        }
    }
    post {
        always {
            junit '**/*.xml'
        }
    }
}

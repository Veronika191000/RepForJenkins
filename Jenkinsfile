pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        jdk "1.8"
        maven "3.6.1"
    }

    stages {
        stage('Test calculation') {
            steps {
                sh "mvn clean test"
            }
        }
    }
    post {
        always {
            allure([
                reportBuildPolicy: 'ALWAYS',
                results:[[path: 'allure-results']]
            ])
        }
    }
}

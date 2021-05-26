pipeline {

    agent any
    
    stages {
        stage("build") {
            steps {
            echo 'building code' 
            }
           }
       
        stage("test") {
            steps {
            echo 'testing code' 
            }
           }
       
        stage("deploy") {
            steps {
            echo 'deploying code' 
            }
           }
        }
    post {
        always {
        echo 'post build action'       
        }
    }

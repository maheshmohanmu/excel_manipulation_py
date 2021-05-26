pipeline {

    agent any
    
    stages {
        stage("build") {
            steps {
            echo 'building python excel manipulation tool' 
            sh 'python manipulate_excel.py > output_file.txt'
            }
           }
       
        stage("test") {
            steps {
            sh 'cat output_file.txt'
            }
           }
       
        stage("deploy") {
            steps {
            echo 'deploying code' 
            }
           }
        }
    }

pipeline {

    agent any
    
    stages {
        stage("build") {
            steps {
            echo 'building python excel manipulation tool' 
            python manipulate_excel.py > output_file.txt
            }
           }
       
        stage("test") {
            steps {
            cat output_file.txt
            }
           }
       
        stage("deploy") {
            steps {
            echo 'deploying code' 
            }
           }
        }
    }

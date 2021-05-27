pipeline {

    agent any
    
    parameters {
        choice(name: 'VERSION', choices:['0.1', '1.0', '1,1'], description:'')
        booleanParam(name: 'ExecuteTest', defaultValue: true, description:'')
    }
    
    stages {
        stage("build") {
            steps {
            echo 'building python excel manipulation tool' 
            echo 'Auto trigger build test' 
            sh 'python manipulate_excel.py > output_file.txt'
            }
           }
       
        stage("test") {
         
            when {
                expression {
                params.ExecuteTest == true
                }
            }
            steps {
            sh 'cat output_file.txt'
            }
           }
       
        stage("deploy") {
            steps {
            echo "deploying code of version ${VERSION}"
            }
           }
        }
    }

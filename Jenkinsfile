pipeline {

    agent any
    
    parameters {
        choice(name: 'VERSION', choices:['0.1', '1.0', '1,1'], description:'')
        booleanParam(name: 'ExecuteTest', defaultValue: true, description:'')
    }
    
    environment {
            
            COUNT_TMP = sh(script: "ls -la /tmp | wc -l", returnStdout: true)
    }
    
   tools {
	maven 'maven-3.8.1'
   }

    stages {
        stage("build") {
            steps {
            echo 'building python excel manipulation tool' 
            echo 'Auto trigger build test' 
            sh 'mvn -v'
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
            echo "tmp directory has ${env.COUNT_TMP} files"
            }
           }
       
        stage("deploy") {
            steps {
            echo "deploying code of version ${VERSION} from ${env.BRANCH_NAME} branch written by ${env.CHANGE_AUTHOR}"
            }
           }
        }
        
    /* post {
        always {
            mail to: 'maheshmohan.mu@gmail.com',
            subject: "Pipeline succeded: ${currentBuild.fullDisplayName}",
            body: "${env.BUILD_URL} build has succeeded"
            }
        } */
    }

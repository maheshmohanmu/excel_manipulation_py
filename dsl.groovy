job('New-sample-excelpy-job-from-DSL'){
    description("Sample excelpy fro DSL on ${new Date()}")
    scm {
        git {
            remote {
                url('https://github.com/maheshmohanmu/excel_manipulation_py')
                credentials('maheshgithub')
                }
            }      
    }
    triggers {
        scm('* * * * *')
    }
}

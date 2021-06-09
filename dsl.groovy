job('New-sample-excelpy-job-from-DSL'){
    description("Sample excelpy fro DSL on ${new Date()}")
    scm {
        git("https://github.com/maheshmohanmu/excel_manipulation_py", master)
        credentials('maheshgithub')
    }
    triggers {
        scm('* * * * *')
    }
}

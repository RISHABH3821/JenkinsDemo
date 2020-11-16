pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}

pipelineJob('nse-api-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://gitlab.blr.teksystems.com/interns2020/campus-training.git'
                    }
                    branch 'develop'
                    sslVerify 'false'
                }
            }
        }
    }
}
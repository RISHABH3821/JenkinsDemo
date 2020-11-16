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
                        url 'http://gitlab.blr.teksystems.com/interns2020/campus-training.git'
                    }
                    branch 'develop'
                    [http]
                    sslVerify = false
                }
            }
        }
    }
}
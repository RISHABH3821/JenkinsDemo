pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}

pipelineJob('nse-api-job-aws') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials('gitlab-rishabh')
                        url 'http://gitlab.blr.teksystems.com/interns2020/campus-training.git'
                    }
                    branch '**/dockerimplementation'
                }
            }
        }
    }
}
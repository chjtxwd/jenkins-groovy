pipelineJob('seed-jobs/ami_seed_job') {
    triggers {
      cron('H * * * *')
    }
    definition {
      cps {
        script("""
          pipeline {
            options {
                timestamps ()
            }
            agent any
            stages {
                stage ("echo") {
                    steps {
                        shell('echo Hello World!')
                        }
                    }
                }
          }
        """)
        sandbox()
      }
    }
}
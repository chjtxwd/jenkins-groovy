pipelineJob('DSL') {
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
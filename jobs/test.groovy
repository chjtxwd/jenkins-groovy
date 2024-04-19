pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // 此处放置构建步骤，例如使用Maven构建项目
                // 示例：sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                // 此处放置测试步骤，例如运行单元测试
                // 示例：sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                // 此处放置部署步骤，例如将构建好的文件部署到服务器
                // 示例：sh 'scp target/myapp.war user@server:/path/to/deploy'
            }
        }
    }

    post {
        always {
            // 此处放置任何总是需要执行的步骤
            // 示例：echo 'Always do this'
        }
        success {
            // 此处放置当构建成功时需要执行的步骤
            // 示例：echo 'Build successful!'
        }
        failure {
            // 此处放置当构建失败时需要执行的步骤
            // 示例：echo 'Build failed!'
        }
        unstable {
            // 此处放置当构建状态不稳定时需要执行的步骤
            // 示例：echo 'Build unstable!'
        }
    }
}

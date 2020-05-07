/* Only keep the 10 most recent builds. */
def projectProperties = [
    [$class: 'BuildDiscarderProperty',strategy: [$class: 'LogRotator', numToKeepStr: '5']],
]
podTemplate(label: "maven",
  cloud: "openshift",
  inheritFrom: "maven") {
    node("maven") {

        def namespace = "email-service"

        stage('Clone repository') {
            checkout scm
        }

        if (env.BRANCH_NAME == "develop") {

            stage('Build') {
                sh "mvn clean install -Dmaven.wagon.http.ssl.insecure=true"
            }

            deployFabric8(
                ambiente : 'dev',
                namespace : "${namespace}"
            )

        }

        if (env.BRANCH_NAME.contains("release/")) {

            stage('Build') {
              sh "mvn -DskipTests clean package -Dmaven.wagon.http.ssl.insecure=true"
            }

            def tag = tagRelease()

            deployFabric8(
                ambiente : 'uat',
                namespace : "${namespace}",
                tag : "${tag}"
            )

        }
    }
}
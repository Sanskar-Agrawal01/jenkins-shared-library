def call(String manifest) {

    stage('Deploy') {
        sh "kubectl apply -f ${manifest}"
    }

}

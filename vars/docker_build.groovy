def call(String projectName, String tag, String dockerHubUser){
    echo "Code Build Stage"
    sh "docker build -t ${dockerHubUser}/${projectName}:${tag} ."
}

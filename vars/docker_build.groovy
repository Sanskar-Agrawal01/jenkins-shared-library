def call(String projectName, String tag, String DockerHubUser){
    echo "Code Build Stage"
    sh "docker build -t ${dockerHubUser}/${projectName}:${tag} ."
}

def call(String url, String branch){
   echo "Code Clone Stage"
   git url: "${url}", branch: "${branch}"
   echo "Cloning Successful"
}
  

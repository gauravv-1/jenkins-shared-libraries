def call(String credId, String imageName){
  withCredentials([usernamePassword(
                    credentialsId:"${dockerHubCred}",
                    passwordVariable: "dockerHubPass",
                    usernameVariable: "dockerHubUsername"
                )]){
                
                sh "docker login -u ${env.dockerHubUsername} -p ${env.dockerHubPass}"
                sh "docker image tag ${imageName} ${env.dockerHubUsername}/${imageName}"
                sh "docker push ${env.dockerHubUsername}/${imageName}:latest"
            
                }  
}

def docker_build(String ProjectName, String ImageTag, String DockerHubUsername) {
    sh "docker build -t ${DockerHubUsername}/${ProjectName}:${ImageTag} ."
}

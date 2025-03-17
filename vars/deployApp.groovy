def call(String env) {
    echo "Deploying to ${env} environment..."
    //sh "deploy-script.sh ${env}"  // Replace with actual deployment command
     sh "echo deploy inoto: ${env}"
}

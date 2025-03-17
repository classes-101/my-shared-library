def call(String command) {
    def validCommands = ['install', 'verify', 'compile', 'package']
    
    if (!validCommands.contains(command)) {
        error "Invalid Maven command! Use one of: ${validCommands.join(', ')}"
    }

    echo "Running mvn ${command}..."
    sh "mvn ${command}"
}

def call(Map config = [:]) {
    bat "echo Hello ${config.name}. Had dinner?? y/n ${config.ans}."
}

package AdamMentaguiLab_Ad_concepts


//creating enum class
enum class PlayerStatus(val message: String) {
    PLAYING("playing"),
    PAUSED("paused"),
    STOPPED("stopped"),
    FAILED("An error occurred during download.");
    //function that checks incase the gameplay got stopped or failed
    fun isFinished(): Boolean {
        return this == STOPPED || this == FAILED
    }
}

//Function that runs our enum class
fun UpdateGameplay(currentStatus: PlayerStatus) {
    println("Status Update: ${currentStatus.message}")
    // Using the function
    if (currentStatus.isFinished()) {
        println("The download process is complete.")
    }
    // Enums are great in 'when' expressions
    when (currentStatus) {
        PlayerStatus.PLAYING -> { /* Show 'Start Download' button */ }
        PlayerStatus.PAUSED -> { /* Show a progress bar */ }
        PlayerStatus.STOPPED -> { /* Show 'Open File' button */ }
        PlayerStatus.FAILED -> { /* Show 'Retry' button */ }
    }
}

//calling the function on main
fun main(){
    UpdateGameplay(PlayerStatus.PLAYING)
}
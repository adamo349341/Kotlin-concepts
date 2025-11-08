package AdamMentaguiLab_Ad_concepts

//using the logger data class from exercise 1

fun main(){
    //declaring our object systemLogger
    val systemLogger = Logger("SYSTEM")
    //instead of repeating the object, we used the scoped function "with" to do it so while printing messages at the same time
    with(systemLogger) {
        log("System boot...")
        log("Loading modules...")
        log("Ready.")
    }
}
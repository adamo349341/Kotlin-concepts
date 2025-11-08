package AdamMentaguiLab_Ad_concepts

//creating our data class and defining our function log(method) inside of it
data class Logger(var prefix  :String){
    fun log(msg:String){
        println("$prefix : $msg")
    }
}

fun main() {
    //declaring infologger as object and use the "apply" scoped function
    val infoLogger: Logger = Logger("New").apply {
        prefix = "INFO"
    }
    //calling the method "log"
    infoLogger.log("Application starting...")
}
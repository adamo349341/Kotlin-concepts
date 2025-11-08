package AdamMentaguiLab_Ad_concepts

//defining extension function
fun String.whisper(): String {
    //returning the chosen string val with a form of lowercase with the "..." at the end
    return this.lowercase() + "..."
}
fun main() {
    //defining a variable and printing it with the extension method function
    val message = "hello"
    val shoutedMessage = message.whisper()
    println(message)
    println(shoutedMessage)
    //printing "go away"  with the extension method function
    println("Go away".whisper())
}
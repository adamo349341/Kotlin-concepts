package AdamMentaguiLab_Ad_concepts
import java.security.MessageDigest

//function which converts a string into Hexadecimal string using the SHA256 signature
fun String.ToSH256(): String {
    val digest = MessageDigest.getInstance("SHA-256")
    val hashBytes = digest.digest(this.toByteArray(Charsets.UTF_8))
    return hashBytes.toHexString()
}

fun main(){
    //declaring the variable
    val secretMessage = "Kotlin is great for security"
    //apply the extension function to the variable and printing the result
    val hash = secretMessage.ToSH256()
    println(hash)
    //printing the space variable using the extension function
    println("".ToSH256())
}
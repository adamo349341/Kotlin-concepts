package AdamMentaguiLab_Ad_concepts

//creating our interface
interface ByteConvertible {
    fun toBytes(): ByteArray
}
//defining our data classes user and file and creating our polymorphismic function ToBytes
data class User(val username: String) : ByteConvertible {
    override fun toBytes(): ByteArray = username.toByteArray()
}

data class File(val content: String) : ByteConvertible {
    override fun toBytes(): ByteArray = content.toByteArray()
}
//creating our generic function
fun <T : ByteConvertible> computeHash(data: T) {
    val bytes = data.toBytes()
    println("Hashing ${bytes.size} bytes...")
}

fun main() {
    // declaring our objects based on each perspective data classes
    val user = User("admin_user")
    val file = File("This is the file content.")

    //Printing the objects using our generic function, they work
    computeHash(user)
    computeHash(file)
    //cannot print this one because the  String does not implement ByteConvertible
    // computeHash("test")
}
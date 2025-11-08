package AdamMentaguiLab_Ad_concepts

//creating function extensions

fun ByteArray.toHexString(): String {
    //for the first one returns a string word which word
    return this.joinToString("") { "%02x".format(it) }
}
fun String.hexToByteArray(): ByteArray {
    //checks if the length's modulo is 0
    require(length % 2 == 0) { "Hex string must have an even length" }
    //returns the byteArray
    return ByteArray(length / 2) { i ->
        val index = i * 2
        this.substring(index, index + 2).toInt(16).toByte()
    }
}


fun main(){
    //declaring variable
    val data: ByteArray = byteArrayOf(0xDE.toByte(), 0xAD.toByte(),
        0xBE.toByte(), 0xEF.toByte())
    val hexString = data.toHexString()
    //printing the first result
    println(hexString)
    //declaring variable
    val originalData = hexString.hexToByteArray()
    //declaring second result
    println(data.contentEquals(originalData))
}
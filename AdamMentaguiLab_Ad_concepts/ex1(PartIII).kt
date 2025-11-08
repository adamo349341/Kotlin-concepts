package AdamMentaguiLab_Ad_concepts

//creating the enum class with protocol (its values)
enum class CommonProtocol(val port:Int,val isSecure:Boolean) {
    HTTP( 80,  false),
    HTTPS(443,  true),
    FTP(21,  false),
    SSH(22,  true),
    DNS( 53,  false);
}
//function which bases on our enum class that checks among values for the inserted port
fun getProtocolFromPort(port: Int): CommonProtocol? {
    return CommonProtocol.values().find { it.port == port }
}

fun main(){
    //defining our port and checks which protocol owns the inserted port
    val portToScan = 21
    val protocol = getProtocolFromPort(portToScan)
    //condition that verifies wether the ort is secured or not
    if (protocol != null) {
        println("Port $portToScan is default for ${protocol.name}.")
        if (protocol.isSecure) {
            println("This is a secure protocol.")
        } else {
            println("Warning: This is an insecure protocol.")
        }
    } else {
        println("Port $portToScan has no common protocol assigned.")
    }

}

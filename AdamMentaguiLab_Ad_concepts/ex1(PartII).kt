package AdamMentaguiLab_Ad_concepts

//creating the data class alongside its attributes
data class AclRule(
    val protocol: String,
    val port: Int,
    val action: String
)

fun main(){
    val rules = mutableSetOf<AclRule>()
    rules.add(AclRule("TCP", 443, "ALLOW"))
    rules.add(AclRule("TCP", 80, "ALLOW"))
    rules.add(AclRule("ICMP", 0, "DENY"))
    println("Rule count after initial load: ${rules.size}") // Output: 3
// 1. Create a new object, but with identical data
    val duplicateRule = AclRule("TCP", 443, "ALLOW")
// 2. Try to add the duplicate
    rules.add(duplicateRule)
    println("Rule count after adding duplicate: ${rules.size}") // Output: 3 (No
// change!)
// 3. Check for a specific rule
    val sshRule = AclRule("TCP", 22, "ALLOW")
    val isSshAllowed = sshRule in rules // Uses .equals() implicitly
    println("\nIs SSH (TCP/22) explicitly allowed? $isSshAllowed") // Output: false
}
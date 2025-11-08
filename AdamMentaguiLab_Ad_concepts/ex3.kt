package AdamMentaguiLab_Ad_concepts

//creating the first extension function which return either true/false depending on  if the string contains only ASCII letters (a-z, A-Z) and numbers
//(0-9)
fun String.isAlphanumeric():Boolean {
    return this.all {it.isLetterOrDigit()}
}
//creating the second one which return a boolean depending on the string containing on the allowed set
fun String.containsSafeCharsOnly(allowed: Set<Char>):Boolean{
    return all { it in allowed }
}

fun main(){
    println("user123".isAlphanumeric()) // Output: true
    println("user_123".isAlphanumeric()) // Output: false
    println("".isAlphanumeric()) // Output: true
    val safeFilenameChars = setOf('a', 'b', 'c', '.', '_', '1', '2', '3')
    println("abc_123.txt".containsSafeCharsOnly(safeFilenameChars))
// Output: false (due to 't', 'x')
    println("abc_123.abc".containsSafeCharsOnly(safeFilenameChars))
// Output: true
}
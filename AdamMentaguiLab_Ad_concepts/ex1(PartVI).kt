package AdamMentaguiLab_Ad_concepts

//defining our generic function logvalue that prints value T
fun <T> logValue(value: T){
    println("Retrieved data: $value")
}

fun main(){
    //printing different type of values on the same generic function logvalue
    logValue("admin_user")
    logValue(401)
    logValue(false)
}
package AdamMentaguiLab_Ad_concepts

// Generic class GoodVault
class GoodVault<T>(private val data: T) {
    fun getData(): T = data
}

fun main() {
    //declaring the two object for our generic class , one is assigned for int and other one for string
    val password = GoodVault("MyPassword")
    val pin = GoodVault(123456)
    //printing values for each object's data using our method "getData()"
    println("String value: ${password.getData()}")
    println("Int value: ${pin.getData()}")
    //we tried to input password to Int know that it is a string and vice versa for pin, we get errors from it
    //val password: Int= stringVault.getData()
    //val pin: String = intVault.getData()

}
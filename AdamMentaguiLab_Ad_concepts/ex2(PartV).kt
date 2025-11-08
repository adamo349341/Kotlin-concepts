package AdamMentaguiLab_Ad_concepts

//defining the data class person
data class Person(val name: String,val age:Int,val city:String?)

fun main(){
    //declaring two objects for our data class person
    val per1 =Person("Alice", 30, "New York")
    val per2 = Person("Bob", 40, null)
    //using the "let" function, this will count the length of each person's city,if it null then it will return 0
    val p1CityLength: Int =per1.city?.let { it.length } ?: 0
    val p2CityLength: Int =per2.city?.let { it.length } ?: 0
    //prints each person's city length result
    println("P1 City Length: $p1CityLength")
    println("P2 City Length: $p2CityLength")
}
package AdamMentaguiLab_Ad_concepts

//using the Person class from exercise2 Part V

fun getPeople(): List<Person> {
    println("Fetching people...")
    return listOf(
        Person("Eve", 22, "Paris"),
        Person("Frank", 33, "Tokyo")
    )
}

fun main(){
    val peopleList: List<Person> = getPeople().also(){
        println("checked ${it.size} people")
    }
    println("Sum list of people: ${peopleList.size}")
}
package AdamMentaguiLab_Ad_concepts

//we will use the person's previous exercice (exo 2)

fun main(){
    //declaring new objects for the data class person
    val person = Person("Charlie", 25, "London")
    val personWithNoCity = Person("David", 50, null)

    //using the run function we will print "welcoming.." statement alongside the name and "this"(city), of this "this" is null then the output will only be "Guest"
    val p1Summary: String = person.city?.run {
        println("Welcoming...")
        "${person.name} to $this"
    }?:"Guest"
    val p2Summary: String = personWithNoCity.city?.run {
        println("Welcoming...")
        "${person.name} to $this"
    }?:"Guest"
    //printing each summary
    println(p1Summary)
    println(p2Summary)
}

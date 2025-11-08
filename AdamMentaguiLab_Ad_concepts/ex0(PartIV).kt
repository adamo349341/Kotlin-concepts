package src


//creating data class Player
data class Player(
    val username : String,
    var score: Int = 0

)

fun main(){
    //declaring following players
    val p1= Player("Amin")
    val p2= Player("Ama")
    val p3= Player("Ama")
    //comparing players
    println("p1 == p2: ${p1 == p2}")
    println("p2 == p3: ${p2 == p3}")
    //adding score to player3
    p3.score = 100
    println("updated P3 : $p3")
    //copying p3s score for p1
    p1.copy(score = p3.score)
    //printing each player hashcode
    println("p1.hashCode(): ${p1.hashCode()}")
    println("p2.hashCode(): ${p2.hashCode()}")
    println("p3.hashCode(): ${p3.hashCode()}")
    //comparing p1 and p2 hashcodes
    println("p1.hashcode() == p2.hashcode(): ${p1.hashCode() == p2.hashCode()}")
}
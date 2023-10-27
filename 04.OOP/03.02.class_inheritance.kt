open class Person(name: String, age: Int) {
  init {
    println("Person $name, $age.")
  }
}

class FootballPalyer(name: String, age: Int, club: String) : Person(name, age) {
  init {
    println("Footballplayer name: $name, age: $age and club: $club ")
  }

  fun playFootball() {
    println("Play Football")
  }
}

fun main(args: Array<String>) {
  val person01 = FootballPalyer("Min", 25, "Seoul")

}
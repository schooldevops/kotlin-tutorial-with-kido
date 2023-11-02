open class Person {

  var name: String = ""
  var age: Int = 0

  constructor(_name: String) {
    this.name = name

    println("Person $name $age")
  }

  constructor(_name: String, _age: Int) {
    this.name = _name
    this.age = _age

    println("Person $name $age")
  }
}

class FootballPlayer : Person {

  constructor(_name: String) : this(_name, 10) {

  }

  constructor(_name: String, _age: Int) : super(_name, _age) {

  }

  fun playFootball() {
    println("Play Football")
  }
}

fun main(args: Array<String>) {
  val person01 = FootballPlayer("Cane")
  val perosn02 = FootballPlayer("Son", 30)
}
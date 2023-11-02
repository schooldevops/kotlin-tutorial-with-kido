open class Person() {
  open fun speakAge(age: Int) {
      println("I'm $age years old.")
  }
}

class SuperStar: Person() {

  override fun speakAge(age: Int) {
      println("I'm ${age - 5} years old officially. ")
  }
}

fun main(args: Array<String>) {
  val superstar = SuperStar()
  superstar.speakAge(31)
}
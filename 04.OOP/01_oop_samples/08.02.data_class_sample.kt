data class Person(val name: String, var age: Int)

fun main(args: Array<String>) {
  val person01 = Person("UncleBae", 40)
  println(person01)

  val person02 = person01.copy(name = "Ruby")
  println(person02)
}
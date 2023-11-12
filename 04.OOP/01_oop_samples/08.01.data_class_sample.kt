data class Person(val name: String, var age: Int)

fun main(args: Array<String>) {
  val person01 = Person("UncleBae", 40)
  println(person01)
  println("Name: " + person01.name)
  println("Age: " + person01.age)
}
data class Person(val name: String, var age: Int, val gender: String)

fun main(args: Array<String>) {
  val person01 = Person("UncleBae", 40, "Male")
  println("Component1: " + person01.component1())
  println("Component2: " + person01.component2())
  println("Component3: " + person01.component3())
}

class Person1(val firstName: String, val age: Int) 

fun main(args: Array<String>) {
  val person1 = Person1("UncleBae", 30)

  println("Person1's name : ${person1.firstName}, age : ${person1.age}")
}
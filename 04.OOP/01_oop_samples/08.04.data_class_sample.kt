data class Person(val name: String, var age: Int, val gender: String)

fun main(args: Array<String>) {
  val person01 = Person("UncleBae", 40, "Male")
  val (name, age, gender) = person01 
  println("Name: " + name)
  println("Age: " + age)
  println("Gender: " + gender)
}

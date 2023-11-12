data class Person(val name: String, var age: Int)

fun main(args: Array<String>) {
  val person01 = Person("UncleBae", 40)
  val person02 = person01.copy()
  val person03 = person01.copy(name = "Ruby")


  println("person01: " + person01.hashCode())
  println("person02: " + person02.hashCode())
  println("person03: " + person03.hashCode())

  println("-----------------------------------------")

  if (person01.equals(person02) == true) {
    println("U1 is equals to U2")
  } else {
    println("U1 is not equals to u2")
  }

  if (person01.equals(person03) == true) {
    println("U1 is equals to u3")
  } else {
    print("U1 is not equals to u3")

  }
}
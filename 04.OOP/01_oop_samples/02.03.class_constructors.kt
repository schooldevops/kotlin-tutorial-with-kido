class Person3(var _firstName: String = "UNKNOWN", val _age: Int = 0) {
  val firstName: String
  var age: Int

  init {
    firstName = _firstName.replaceFirstChar{it.uppercase()}
    age = _age

    println("Initial Person3, firstName to ${firstName}, age to ${age}")
  }
}

fun main(args: Array<String>) {
  val person1 = Person3("uncleBae", 30)
  println("Person1 firstName: ${person1.firstName}, age: ${person1.age}")

  val person2 = Person3("uncleBae")
  println("Person2 firstName: ${person2.firstName}, age: ${person2.age}")

  val person3 = Person3(_age = 40)
  println("Person3 firstName: ${person3.firstName}, age: ${person3.age}")
}
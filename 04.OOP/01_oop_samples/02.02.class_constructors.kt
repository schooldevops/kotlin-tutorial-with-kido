class Person2(var name: String, var userAge: Int) {
  val firstName: String
  var age: Int

  // 초기화 블록
  init {
    firstName = name.replaceFirstChar{it.uppercase()}
    age = userAge

    println("Initial Person2, firstName to ${firstName} and age to ${age}")
  }

}

fun main(args: Array<String>) {
  val person2 = Person2("uncleBae", 30)
  println("Person2 firstName: ${person2.firstName}, age: ${person2.age}")
}
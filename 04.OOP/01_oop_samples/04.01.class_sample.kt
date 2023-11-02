abstract class Person(name: String)  {
  var age: Int = 0

  init {
    println("My name is $name")
  }

  fun displayAge() {
    println("My name is ${age} years old")
  } 

  abstract fun introduceOneSelf(intro: String)
}

class EnglishMan(name: String): Person(name) {
  override fun introduceOneSelf(intro: String) {
    println("Hello. and I'm from England. ${intro}")
  } 
}

fun main(args: Array<String>) {
  val jane = EnglishMan("Jane")  
  jane.displayAge()
  jane.introduceOneSelf("I like a football.")
}
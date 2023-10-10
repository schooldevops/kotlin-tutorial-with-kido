data class Person(var name: String, var age: Int = 0, var city: String = "")

fun main() {
    val adam = Person("Adam").apply {
        age = 32
        city = "London"        
    }
    println(adam)

    val james = Person("James").apply {
      age = 40
      city = "Paris"
    }.apply {
      println(this)
    }
}
open class Person_OBJ(val name: String, val age: Int, val lan: String) {

  init {
    println("Person name: ${name}, age: ${age}, language: ${lan}") 
  }

  fun walk() = println("Work every where.")
  open fun talk() = println("Speak ~~~. ${this.lan}")
}

fun main(args: Array<String>) {
  val english_man = object: Person_OBJ("Mike", 20, "Eng")
   {
    override fun talk() = println("Hello I can speak ${this.lan}")
  }

  println("${english_man.name}")
  english_man.walk()
  english_man.talk()

}
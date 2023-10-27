open class Person() {
  open var age: Int = 0
      get() = field

      set(value) {
          field = value
      }
}

class SuperStar: Person() {

  override var age: Int = 0
      get() = field

      set(value) {
          field = value - 5
      }
}

fun main(args: Array<String>) {

  val superstar = SuperStar()
  superstar.age = 31
  println("I'm ${age - 5} years old officially. ")
}
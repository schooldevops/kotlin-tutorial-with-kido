fun main(args: Array<String>) {
  checkWithWhen(15)
  checkWithWhen('B')
  checkWithWhen("Hello")

}

fun checkWithWhen(someValue: Any) {
  when(someValue) {
    in 10..20 -> println("You are young.")
    in 'A'..'B' -> println("You got very good score.")
    else -> println("I don't know.")
  }
}
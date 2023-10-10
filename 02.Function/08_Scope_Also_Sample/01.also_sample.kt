fun main() {
  val numbers = mutableListOf("one", "two", "three")
  numbers
      .also { println("The list elements before adding new one: $it") }
      .add("four")
  println(numbers)
}
fun main(args: Array<String>) {
  val fruits = listOf("Apple", "Banana", null, "Cherry", "PineApple", "Mango")

  println("Original: " + fruits)

  val tuple_fruits = fruits.mapIndexed {
    idx, fruit -> Pair(idx, fruit)
  }
  println(tuple_fruits)
}
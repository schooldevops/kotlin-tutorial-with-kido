fun main(args: Array<String>) {
  val fruits = listOf("Apple", "Banana", "Cherry", "PineApple", "Mango")

  println("Original: " + fruits)

  val reverseFruits = fruits.map {
    it.reversed()
  }

  println(reverseFruits)
}
fun main(args: Array<String>) {
  val fruits = listOf("Apple", "Banana", null, "Cherry", "PineApple", "Mango")

  println("Original: " + fruits)

  val notNullFruits = fruits.mapNotNull {
    it
  }

  println(notNullFruits)
}
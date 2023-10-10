fun main(args: Array<String>) {
  val numbers = mutableListOf("one", "two", "three")
  with(numbers) {
    val firstItem = first()
    val lastItem = last()
    println("First Item is : $firstItem, Last Item is : $lastItem")
  }
}
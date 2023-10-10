fun main(args: Array<String>) {
  val numbers = listOf("one", "two", "three", "four", "five")
  val modifiedFirstItem = numbers.first().let {
    firstItem ->
      println("The first item of the list is '$firstItem'")
      if (firstItem.length >= 5) firstItem else "!" + firstItem + "!"
    }.uppercase()

    println("First item after modifications: '$modifiedFirstItem'")
}
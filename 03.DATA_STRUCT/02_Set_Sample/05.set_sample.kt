fun main(args: Array<String>) {
  val words = setOf("pen", "cup", "dog", "person", "comment", "coal", "specatacles", "cup", "bread")
  println(words)

  val firstItem = words.first()
  println("First Item: " + firstItem)

  val lastItem = words.last()
  println("Last Item: " + lastItem)

  val startDItem = words.first( { it.startsWith("d")} )
  println("Start d item: " + startDItem)

  val lastDItem = words.last( { it.endsWith("d") } )
  println("Last d item: " + lastDItem)
}
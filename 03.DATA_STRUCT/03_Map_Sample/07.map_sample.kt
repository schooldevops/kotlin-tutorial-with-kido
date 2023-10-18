fun main(args: Array<String>) {
  val createdMap = mapOf("one" to 1, "two" to 2, "three" to 3)

  println("Size: " + createdMap.size)
  println("Count(): " + createdMap.count())

  println("isEmpty: " + createdMap.isEmpty())
  println("isNotEmpty: " + createdMap.isNotEmpty())
  println("isNullOrEmpty: " + createdMap.isNullOrEmpty())
}
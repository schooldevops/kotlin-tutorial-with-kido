fun main(args: Array<String>) {
  val createdMap = mapOf("one" to 1, "two" to 2, "three" to 3)

  println("Contains key: " + createdMap.containsKey("one"))
  println("Containes Value: " + createdMap.containsValue(1))
  println("Containes Value: " + createdMap.containsValue(4))
}
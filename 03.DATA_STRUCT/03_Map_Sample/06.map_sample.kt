fun main(args: Array<String>) {
  val createdMap = mapOf("one" to 1, "two" to 2, "three" to 3)

  val iter = createdMap.keys.iterator()
  while (iter.hasNext()) {
    val key = iter.next()
    val value = createdMap.get(key)

    println("$key ---> $value")
  }
}
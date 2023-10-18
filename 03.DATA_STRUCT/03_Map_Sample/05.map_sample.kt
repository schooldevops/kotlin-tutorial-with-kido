fun main(args: Array<String>) {
  val createdMap = mapOf("one" to 1, "two" to 2, "three" to 3)

  for ((key, value) in createdMap) {
    println("$key ---> $value")
  }

  println("------------------------")

  createdMap.forEach {
    (key, value) -> println("$key ---> $value")
  }
}
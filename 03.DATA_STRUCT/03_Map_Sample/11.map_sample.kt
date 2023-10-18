fun main(args: Array<String>) {
  val theMap = mapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
  var resultMap = theMap.filterValues { it > 2 }
  println("Filter > 2 : " + resultMap)

  resultMap = theMap.filterKeys { it == "two" }
  println("Filter key value two: " + resultMap)

  resultMap = theMap.filter { it.key == "two" || it.value == 4 }
  println("Filter two or value 4 : " + resultMap)
}
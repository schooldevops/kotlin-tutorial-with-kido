fun main(args: Array<String>) {

  val firstMap = mapOf("one" to 1, "two" to 2, "three" to 3)
  val secondMap = mapOf("one" to 10, "four" to 4)
  val resultMap = firstMap + secondMap
  
  println("------- sum of ----------:" + resultMap)

  val subResultMap = resultMap - listOf("one", "three")
  println("-------- sub of ----------:" + subResultMap)

  val mutableMap = mutableMapOf("one" to 1, "two" to 2, "three" to 3, "four" to 4)
  mutableMap.remove("two")
  println("--------- remove of ------:" + mutableMap) 
}
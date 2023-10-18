fun main(args: Array<String>) {
  val theMap = mapOf("one" to 1, "two" to 2, "three" to 3)
  val resultMap = theMap.map{ (k, v) -> Pair(v, k) }
   
   println(resultMap)
}
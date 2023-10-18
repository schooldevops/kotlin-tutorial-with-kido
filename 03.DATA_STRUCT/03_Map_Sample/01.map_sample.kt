fun main(args: Array<String>) {

  // 불변의 맵을 생성한다. 
  val immutableMap = mapOf("one" to 1, "two" to 2, "three" to 3)
  println(immutableMap)

  // 가변 맵을 생성한다. 
  val mutableMap = mutableMapOf("one" to 1, "two" to 2, "three" to 3)
  println(mutableMap)
}
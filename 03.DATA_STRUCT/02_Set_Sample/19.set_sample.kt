fun main(args: Array<String>) {
  println("--------- Any Sample ")
  val nums = setOf(4, 5, 3, 2, -1, 7, 6, 8, 9)

  println("짝수가 하나라도 존재하는가? : " + nums.any { it % 2 == 0 })
  println("10이상인 수가 하나라도 있는가? " + nums.any { it > 10 })  

  println("--------- All Sample")
  val nums2 = setOf(-3, -4, -2, -5, -7, -8)

  println("모든 수가 음수인가? " + nums2.all { it < 0 })
}
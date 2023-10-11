fun main(args: Array<String>) {
  val nums = setOf(5, 4, 3, 2, 1, 6, 7, 8, 9, 10)
  
  // 5 이하의 값을 파티셔닝한다.
  val (nums01, nums02) = nums.partition { it <= 5 }

  println("Before 5: " + nums01)
  println("After 5: " + nums02)

}
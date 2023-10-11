fun main(args: Array<String>) {
  val nums = setOf(4, 5, 3, 2, 1, -1, 7, 6, -8, 9, -12)
  println("원본: " + nums)
  println("5개를 drop: " + nums.drop(5))
  println("양수 조건일때까지 제거후 결과반환: " + nums.dropWhile { it > 0 })
  println("2개를 take: " + nums.take(2))
  println("양수 조건일때까지만 take: " + nums.takeWhile { it > 0 } )
  println("특정 조건이 만족하면 모든원소 가져옴: " + nums.takeIf { e -> e.contains(6) })
}
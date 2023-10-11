fun main(args: Array<String>) {
  val nums = setOf(5, 4, 3, 2, 1, 6, 7, 8, 9, 10)

  val sum = nums.chunked(2).fold(0) { total, next -> total + next[0] + next[1] }
  println("Total Sum with chunk 2: " + sum)
}
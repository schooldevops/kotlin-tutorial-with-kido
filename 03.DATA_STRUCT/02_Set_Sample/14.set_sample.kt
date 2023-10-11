fun main(args: Array<String>) {
  val nums = setOf(5, 4, 3, 2, 1, 6, 7, 8, 9, 10)
  println("Reduce Sum: " + nums.reduce { total, next -> total + next })

}
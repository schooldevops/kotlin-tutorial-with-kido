fun main(args: Array<String>) {
  val nums = setOf(4, 5, -6, 2, -4, 1, 9, -1, 10, -3)

  val totalCount = nums.count()
  println("Total Count: " + totalCount)

  val size = nums.size
  println("Total Size: " + size)

  val negative = nums.count( { it < 0} )
  println("Negatives Count: " + negative)

  val positive = nums.count ( { e -> e > 0 } )
  println("Positives Count: " + positive)
}
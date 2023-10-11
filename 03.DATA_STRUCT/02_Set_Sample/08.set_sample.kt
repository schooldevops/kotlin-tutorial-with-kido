fun main(args: Array<String>) {
  val nums = setOf(4, 5, 3, 2, 1, -1, 7, 6, -9, 11)

  val contain = nums.contains(2)
  println("4 is contained nums: " + contain)

  val containsAll = nums.containsAll(setOf(-1, 11))
  println("-1, 11 are contained nums: " + containsAll)
}
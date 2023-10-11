fun main(args: Array<String>) {
  val num01 = setOf(1, 2, 3)
  val num02 = setOf(3, 4, 5)

  val union = num01.union(num02)
  println("num01: " + num01)
  println("num02: " + num02)
  println("union: " + union)
}
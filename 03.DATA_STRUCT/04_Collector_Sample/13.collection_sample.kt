fun main(args: Array<String>) {
  val scores = listOf(100, 80, 60, 77, 55, 90, 95)

  println("origin: " + scores)
  println(scores.zipWithNext())
}